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


    // $ANTLR start entryRuleInheritanceStatus
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:519:1: entryRuleInheritanceStatus : ruleInheritanceStatus EOF ;
    public final void entryRuleInheritanceStatus() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:519:28: ( ruleInheritanceStatus EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:520:1: ruleInheritanceStatus EOF
            {
             before(grammarAccess.getInheritanceStatusRule()); 
            pushFollow(FOLLOW_ruleInheritanceStatus_in_entryRuleInheritanceStatus1080);
            ruleInheritanceStatus();
            _fsp--;

             after(grammarAccess.getInheritanceStatusRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInheritanceStatus1087); 

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
    // $ANTLR end entryRuleInheritanceStatus


    // $ANTLR start ruleInheritanceStatus
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:527:1: ruleInheritanceStatus : ( ( rule__InheritanceStatus__Group__0 ) ) ;
    public final void ruleInheritanceStatus() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:531:2: ( ( ( rule__InheritanceStatus__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:532:1: ( ( rule__InheritanceStatus__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:532:1: ( ( rule__InheritanceStatus__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:533:1: ( rule__InheritanceStatus__Group__0 )
            {
             before(grammarAccess.getInheritanceStatusAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:534:1: ( rule__InheritanceStatus__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:534:2: rule__InheritanceStatus__Group__0
            {
            pushFollow(FOLLOW_rule__InheritanceStatus__Group__0_in_ruleInheritanceStatus1114);
            rule__InheritanceStatus__Group__0();
            _fsp--;


            }

             after(grammarAccess.getInheritanceStatusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleInheritanceStatus


    // $ANTLR start entryRuleCommand
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:546:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:546:18: ( ruleCommand EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:547:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand1140);
            ruleCommand();
            _fsp--;

             after(grammarAccess.getCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand1147); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:554:1: ruleCommand : ( ( rule__Command__Group__0 ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:558:2: ( ( ( rule__Command__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:559:1: ( ( rule__Command__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:559:1: ( ( rule__Command__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:560:1: ( rule__Command__Group__0 )
            {
             before(grammarAccess.getCommandAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:561:1: ( rule__Command__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:561:2: rule__Command__Group__0
            {
            pushFollow(FOLLOW_rule__Command__Group__0_in_ruleCommand1174);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:573:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:573:19: ( ruleArgument EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:574:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument1200);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getArgumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument1207); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:581:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:585:2: ( ( ( rule__Argument__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:586:1: ( ( rule__Argument__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:586:1: ( ( rule__Argument__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:587:1: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:588:1: ( rule__Argument__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:588:2: rule__Argument__Group__0
            {
            pushFollow(FOLLOW_rule__Argument__Group__0_in_ruleArgument1234);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:600:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:600:20: ( ruleAttribute EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:601:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1260);
            ruleAttribute();
            _fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1267); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:608:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:612:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:613:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:613:1: ( ( rule__Attribute__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:614:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:615:1: ( rule__Attribute__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:615:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute1294);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:627:1: entryRuleFireEvents : ruleFireEvents EOF ;
    public final void entryRuleFireEvents() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:627:21: ( ruleFireEvents EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:628:1: ruleFireEvents EOF
            {
             before(grammarAccess.getFireEventsRule()); 
            pushFollow(FOLLOW_ruleFireEvents_in_entryRuleFireEvents1320);
            ruleFireEvents();
            _fsp--;

             after(grammarAccess.getFireEventsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFireEvents1327); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:635:1: ruleFireEvents : ( ( rule__FireEvents__Group__0 ) ) ;
    public final void ruleFireEvents() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:639:2: ( ( ( rule__FireEvents__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:640:1: ( ( rule__FireEvents__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:640:1: ( ( rule__FireEvents__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:641:1: ( rule__FireEvents__Group__0 )
            {
             before(grammarAccess.getFireEventsAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:642:1: ( rule__FireEvents__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:642:2: rule__FireEvents__Group__0
            {
            pushFollow(FOLLOW_rule__FireEvents__Group__0_in_ruleFireEvents1354);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:654:1: entryRuleAttrProperties : ruleAttrProperties EOF ;
    public final void entryRuleAttrProperties() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:654:25: ( ruleAttrProperties EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:655:1: ruleAttrProperties EOF
            {
             before(grammarAccess.getAttrPropertiesRule()); 
            pushFollow(FOLLOW_ruleAttrProperties_in_entryRuleAttrProperties1380);
            ruleAttrProperties();
            _fsp--;

             after(grammarAccess.getAttrPropertiesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrProperties1387); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:662:1: ruleAttrProperties : ( ( rule__AttrProperties__Group__0 ) ) ;
    public final void ruleAttrProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:666:2: ( ( ( rule__AttrProperties__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:667:1: ( ( rule__AttrProperties__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:667:1: ( ( rule__AttrProperties__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:668:1: ( rule__AttrProperties__Group__0 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:669:1: ( rule__AttrProperties__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:669:2: rule__AttrProperties__Group__0
            {
            pushFollow(FOLLOW_rule__AttrProperties__Group__0_in_ruleAttrProperties1414);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:681:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:681:15: ( ruleType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:682:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1440);
            ruleType();
            _fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1447); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:689:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:693:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:694:1: ( ( rule__Type__Alternatives ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:694:1: ( ( rule__Type__Alternatives ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:695:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:696:1: ( rule__Type__Alternatives )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:696:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType1474);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:708:1: entryRuleVoidType : ruleVoidType EOF ;
    public final void entryRuleVoidType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:708:19: ( ruleVoidType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:709:1: ruleVoidType EOF
            {
             before(grammarAccess.getVoidTypeRule()); 
            pushFollow(FOLLOW_ruleVoidType_in_entryRuleVoidType1500);
            ruleVoidType();
            _fsp--;

             after(grammarAccess.getVoidTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVoidType1507); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:716:1: ruleVoidType : ( ( rule__VoidType__Group__0 ) ) ;
    public final void ruleVoidType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:720:2: ( ( ( rule__VoidType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:721:1: ( ( rule__VoidType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:721:1: ( ( rule__VoidType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:722:1: ( rule__VoidType__Group__0 )
            {
             before(grammarAccess.getVoidTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:723:1: ( rule__VoidType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:723:2: rule__VoidType__Group__0
            {
            pushFollow(FOLLOW_rule__VoidType__Group__0_in_ruleVoidType1534);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:735:1: entryRuleBooleanType : ruleBooleanType EOF ;
    public final void entryRuleBooleanType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:735:22: ( ruleBooleanType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:736:1: ruleBooleanType EOF
            {
             before(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanType_in_entryRuleBooleanType1560);
            ruleBooleanType();
            _fsp--;

             after(grammarAccess.getBooleanTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanType1567); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:743:1: ruleBooleanType : ( ( rule__BooleanType__Group__0 ) ) ;
    public final void ruleBooleanType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:747:2: ( ( ( rule__BooleanType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:748:1: ( ( rule__BooleanType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:748:1: ( ( rule__BooleanType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:749:1: ( rule__BooleanType__Group__0 )
            {
             before(grammarAccess.getBooleanTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:750:1: ( rule__BooleanType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:750:2: rule__BooleanType__Group__0
            {
            pushFollow(FOLLOW_rule__BooleanType__Group__0_in_ruleBooleanType1594);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:762:1: entryRuleShortType : ruleShortType EOF ;
    public final void entryRuleShortType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:762:20: ( ruleShortType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:763:1: ruleShortType EOF
            {
             before(grammarAccess.getShortTypeRule()); 
            pushFollow(FOLLOW_ruleShortType_in_entryRuleShortType1620);
            ruleShortType();
            _fsp--;

             after(grammarAccess.getShortTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortType1627); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:770:1: ruleShortType : ( ( rule__ShortType__Group__0 ) ) ;
    public final void ruleShortType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:774:2: ( ( ( rule__ShortType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:775:1: ( ( rule__ShortType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:775:1: ( ( rule__ShortType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:776:1: ( rule__ShortType__Group__0 )
            {
             before(grammarAccess.getShortTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:777:1: ( rule__ShortType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:777:2: rule__ShortType__Group__0
            {
            pushFollow(FOLLOW_rule__ShortType__Group__0_in_ruleShortType1654);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:789:1: entryRuleUShortType : ruleUShortType EOF ;
    public final void entryRuleUShortType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:789:21: ( ruleUShortType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:790:1: ruleUShortType EOF
            {
             before(grammarAccess.getUShortTypeRule()); 
            pushFollow(FOLLOW_ruleUShortType_in_entryRuleUShortType1680);
            ruleUShortType();
            _fsp--;

             after(grammarAccess.getUShortTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUShortType1687); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:797:1: ruleUShortType : ( ( rule__UShortType__Group__0 ) ) ;
    public final void ruleUShortType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:801:2: ( ( ( rule__UShortType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:802:1: ( ( rule__UShortType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:802:1: ( ( rule__UShortType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:803:1: ( rule__UShortType__Group__0 )
            {
             before(grammarAccess.getUShortTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:804:1: ( rule__UShortType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:804:2: rule__UShortType__Group__0
            {
            pushFollow(FOLLOW_rule__UShortType__Group__0_in_ruleUShortType1714);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:816:1: entryRuleIntType : ruleIntType EOF ;
    public final void entryRuleIntType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:816:18: ( ruleIntType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:817:1: ruleIntType EOF
            {
             before(grammarAccess.getIntTypeRule()); 
            pushFollow(FOLLOW_ruleIntType_in_entryRuleIntType1740);
            ruleIntType();
            _fsp--;

             after(grammarAccess.getIntTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntType1747); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:824:1: ruleIntType : ( ( rule__IntType__Group__0 ) ) ;
    public final void ruleIntType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:828:2: ( ( ( rule__IntType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:829:1: ( ( rule__IntType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:829:1: ( ( rule__IntType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:830:1: ( rule__IntType__Group__0 )
            {
             before(grammarAccess.getIntTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:831:1: ( rule__IntType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:831:2: rule__IntType__Group__0
            {
            pushFollow(FOLLOW_rule__IntType__Group__0_in_ruleIntType1774);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:843:1: entryRuleUIntType : ruleUIntType EOF ;
    public final void entryRuleUIntType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:843:19: ( ruleUIntType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:844:1: ruleUIntType EOF
            {
             before(grammarAccess.getUIntTypeRule()); 
            pushFollow(FOLLOW_ruleUIntType_in_entryRuleUIntType1800);
            ruleUIntType();
            _fsp--;

             after(grammarAccess.getUIntTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIntType1807); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:851:1: ruleUIntType : ( ( rule__UIntType__Group__0 ) ) ;
    public final void ruleUIntType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:855:2: ( ( ( rule__UIntType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:856:1: ( ( rule__UIntType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:856:1: ( ( rule__UIntType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:857:1: ( rule__UIntType__Group__0 )
            {
             before(grammarAccess.getUIntTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:858:1: ( rule__UIntType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:858:2: rule__UIntType__Group__0
            {
            pushFollow(FOLLOW_rule__UIntType__Group__0_in_ruleUIntType1834);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:870:1: entryRuleFloatType : ruleFloatType EOF ;
    public final void entryRuleFloatType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:870:20: ( ruleFloatType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:871:1: ruleFloatType EOF
            {
             before(grammarAccess.getFloatTypeRule()); 
            pushFollow(FOLLOW_ruleFloatType_in_entryRuleFloatType1860);
            ruleFloatType();
            _fsp--;

             after(grammarAccess.getFloatTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatType1867); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:878:1: ruleFloatType : ( ( rule__FloatType__Group__0 ) ) ;
    public final void ruleFloatType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:882:2: ( ( ( rule__FloatType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:883:1: ( ( rule__FloatType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:883:1: ( ( rule__FloatType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:884:1: ( rule__FloatType__Group__0 )
            {
             before(grammarAccess.getFloatTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:885:1: ( rule__FloatType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:885:2: rule__FloatType__Group__0
            {
            pushFollow(FOLLOW_rule__FloatType__Group__0_in_ruleFloatType1894);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:897:1: entryRuleDoubleType : ruleDoubleType EOF ;
    public final void entryRuleDoubleType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:897:21: ( ruleDoubleType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:898:1: ruleDoubleType EOF
            {
             before(grammarAccess.getDoubleTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleType_in_entryRuleDoubleType1920);
            ruleDoubleType();
            _fsp--;

             after(grammarAccess.getDoubleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleType1927); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:905:1: ruleDoubleType : ( ( rule__DoubleType__Group__0 ) ) ;
    public final void ruleDoubleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:909:2: ( ( ( rule__DoubleType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:910:1: ( ( rule__DoubleType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:910:1: ( ( rule__DoubleType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:911:1: ( rule__DoubleType__Group__0 )
            {
             before(grammarAccess.getDoubleTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:912:1: ( rule__DoubleType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:912:2: rule__DoubleType__Group__0
            {
            pushFollow(FOLLOW_rule__DoubleType__Group__0_in_ruleDoubleType1954);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:924:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:924:21: ( ruleStringType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:925:1: ruleStringType EOF
            {
             before(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType1980);
            ruleStringType();
            _fsp--;

             after(grammarAccess.getStringTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType1987); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:932:1: ruleStringType : ( ( rule__StringType__Group__0 ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:936:2: ( ( ( rule__StringType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:937:1: ( ( rule__StringType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:937:1: ( ( rule__StringType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:938:1: ( rule__StringType__Group__0 )
            {
             before(grammarAccess.getStringTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:939:1: ( rule__StringType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:939:2: rule__StringType__Group__0
            {
            pushFollow(FOLLOW_rule__StringType__Group__0_in_ruleStringType2014);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:951:1: entryRuleCharArrayType : ruleCharArrayType EOF ;
    public final void entryRuleCharArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:951:24: ( ruleCharArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:952:1: ruleCharArrayType EOF
            {
             before(grammarAccess.getCharArrayTypeRule()); 
            pushFollow(FOLLOW_ruleCharArrayType_in_entryRuleCharArrayType2040);
            ruleCharArrayType();
            _fsp--;

             after(grammarAccess.getCharArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharArrayType2047); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:959:1: ruleCharArrayType : ( ( rule__CharArrayType__Group__0 ) ) ;
    public final void ruleCharArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:963:2: ( ( ( rule__CharArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:964:1: ( ( rule__CharArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:964:1: ( ( rule__CharArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:965:1: ( rule__CharArrayType__Group__0 )
            {
             before(grammarAccess.getCharArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:966:1: ( rule__CharArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:966:2: rule__CharArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__CharArrayType__Group__0_in_ruleCharArrayType2074);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:978:1: entryRuleShortArrayType : ruleShortArrayType EOF ;
    public final void entryRuleShortArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:978:25: ( ruleShortArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:979:1: ruleShortArrayType EOF
            {
             before(grammarAccess.getShortArrayTypeRule()); 
            pushFollow(FOLLOW_ruleShortArrayType_in_entryRuleShortArrayType2100);
            ruleShortArrayType();
            _fsp--;

             after(grammarAccess.getShortArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortArrayType2107); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:986:1: ruleShortArrayType : ( ( rule__ShortArrayType__Group__0 ) ) ;
    public final void ruleShortArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:990:2: ( ( ( rule__ShortArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:991:1: ( ( rule__ShortArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:991:1: ( ( rule__ShortArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:992:1: ( rule__ShortArrayType__Group__0 )
            {
             before(grammarAccess.getShortArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:993:1: ( rule__ShortArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:993:2: rule__ShortArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__ShortArrayType__Group__0_in_ruleShortArrayType2134);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1005:1: entryRuleUShortArrayType : ruleUShortArrayType EOF ;
    public final void entryRuleUShortArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1005:26: ( ruleUShortArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1006:1: ruleUShortArrayType EOF
            {
             before(grammarAccess.getUShortArrayTypeRule()); 
            pushFollow(FOLLOW_ruleUShortArrayType_in_entryRuleUShortArrayType2160);
            ruleUShortArrayType();
            _fsp--;

             after(grammarAccess.getUShortArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUShortArrayType2167); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1013:1: ruleUShortArrayType : ( ( rule__UShortArrayType__Group__0 ) ) ;
    public final void ruleUShortArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1017:2: ( ( ( rule__UShortArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1018:1: ( ( rule__UShortArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1018:1: ( ( rule__UShortArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1019:1: ( rule__UShortArrayType__Group__0 )
            {
             before(grammarAccess.getUShortArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1020:1: ( rule__UShortArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1020:2: rule__UShortArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__UShortArrayType__Group__0_in_ruleUShortArrayType2194);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1032:1: entryRuleIntArrayType : ruleIntArrayType EOF ;
    public final void entryRuleIntArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1032:23: ( ruleIntArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1033:1: ruleIntArrayType EOF
            {
             before(grammarAccess.getIntArrayTypeRule()); 
            pushFollow(FOLLOW_ruleIntArrayType_in_entryRuleIntArrayType2220);
            ruleIntArrayType();
            _fsp--;

             after(grammarAccess.getIntArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntArrayType2227); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1040:1: ruleIntArrayType : ( ( rule__IntArrayType__Group__0 ) ) ;
    public final void ruleIntArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1044:2: ( ( ( rule__IntArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1045:1: ( ( rule__IntArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1045:1: ( ( rule__IntArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1046:1: ( rule__IntArrayType__Group__0 )
            {
             before(grammarAccess.getIntArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1047:1: ( rule__IntArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1047:2: rule__IntArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__IntArrayType__Group__0_in_ruleIntArrayType2254);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1059:1: entryRuleUIntArrayType : ruleUIntArrayType EOF ;
    public final void entryRuleUIntArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1059:24: ( ruleUIntArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1060:1: ruleUIntArrayType EOF
            {
             before(grammarAccess.getUIntArrayTypeRule()); 
            pushFollow(FOLLOW_ruleUIntArrayType_in_entryRuleUIntArrayType2280);
            ruleUIntArrayType();
            _fsp--;

             after(grammarAccess.getUIntArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIntArrayType2287); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1067:1: ruleUIntArrayType : ( ( rule__UIntArrayType__Group__0 ) ) ;
    public final void ruleUIntArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1071:2: ( ( ( rule__UIntArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1072:1: ( ( rule__UIntArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1072:1: ( ( rule__UIntArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1073:1: ( rule__UIntArrayType__Group__0 )
            {
             before(grammarAccess.getUIntArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1074:1: ( rule__UIntArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1074:2: rule__UIntArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__UIntArrayType__Group__0_in_ruleUIntArrayType2314);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1086:1: entryRuleFloatArrayType : ruleFloatArrayType EOF ;
    public final void entryRuleFloatArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1086:25: ( ruleFloatArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1087:1: ruleFloatArrayType EOF
            {
             before(grammarAccess.getFloatArrayTypeRule()); 
            pushFollow(FOLLOW_ruleFloatArrayType_in_entryRuleFloatArrayType2340);
            ruleFloatArrayType();
            _fsp--;

             after(grammarAccess.getFloatArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatArrayType2347); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1094:1: ruleFloatArrayType : ( ( rule__FloatArrayType__Group__0 ) ) ;
    public final void ruleFloatArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1098:2: ( ( ( rule__FloatArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1099:1: ( ( rule__FloatArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1099:1: ( ( rule__FloatArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1100:1: ( rule__FloatArrayType__Group__0 )
            {
             before(grammarAccess.getFloatArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1101:1: ( rule__FloatArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1101:2: rule__FloatArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__FloatArrayType__Group__0_in_ruleFloatArrayType2374);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1113:1: entryRuleDoubleArrayType : ruleDoubleArrayType EOF ;
    public final void entryRuleDoubleArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1113:26: ( ruleDoubleArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1114:1: ruleDoubleArrayType EOF
            {
             before(grammarAccess.getDoubleArrayTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleArrayType_in_entryRuleDoubleArrayType2400);
            ruleDoubleArrayType();
            _fsp--;

             after(grammarAccess.getDoubleArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleArrayType2407); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1121:1: ruleDoubleArrayType : ( ( rule__DoubleArrayType__Group__0 ) ) ;
    public final void ruleDoubleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1125:2: ( ( ( rule__DoubleArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1126:1: ( ( rule__DoubleArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1126:1: ( ( rule__DoubleArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1127:1: ( rule__DoubleArrayType__Group__0 )
            {
             before(grammarAccess.getDoubleArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1128:1: ( rule__DoubleArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1128:2: rule__DoubleArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__DoubleArrayType__Group__0_in_ruleDoubleArrayType2434);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1140:1: entryRuleStringArrayType : ruleStringArrayType EOF ;
    public final void entryRuleStringArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1140:26: ( ruleStringArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1141:1: ruleStringArrayType EOF
            {
             before(grammarAccess.getStringArrayTypeRule()); 
            pushFollow(FOLLOW_ruleStringArrayType_in_entryRuleStringArrayType2460);
            ruleStringArrayType();
            _fsp--;

             after(grammarAccess.getStringArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringArrayType2467); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1148:1: ruleStringArrayType : ( ( rule__StringArrayType__Group__0 ) ) ;
    public final void ruleStringArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1152:2: ( ( ( rule__StringArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1153:1: ( ( rule__StringArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1153:1: ( ( rule__StringArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1154:1: ( rule__StringArrayType__Group__0 )
            {
             before(grammarAccess.getStringArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1155:1: ( rule__StringArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1155:2: rule__StringArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__StringArrayType__Group__0_in_ruleStringArrayType2494);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1167:1: entryRuleLongStringArrayType : ruleLongStringArrayType EOF ;
    public final void entryRuleLongStringArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1167:30: ( ruleLongStringArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1168:1: ruleLongStringArrayType EOF
            {
             before(grammarAccess.getLongStringArrayTypeRule()); 
            pushFollow(FOLLOW_ruleLongStringArrayType_in_entryRuleLongStringArrayType2520);
            ruleLongStringArrayType();
            _fsp--;

             after(grammarAccess.getLongStringArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongStringArrayType2527); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1175:1: ruleLongStringArrayType : ( ( rule__LongStringArrayType__Group__0 ) ) ;
    public final void ruleLongStringArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1179:2: ( ( ( rule__LongStringArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1180:1: ( ( rule__LongStringArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1180:1: ( ( rule__LongStringArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1181:1: ( rule__LongStringArrayType__Group__0 )
            {
             before(grammarAccess.getLongStringArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1182:1: ( rule__LongStringArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1182:2: rule__LongStringArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__LongStringArrayType__Group__0_in_ruleLongStringArrayType2554);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1194:1: entryRuleDoubleStringArrayType : ruleDoubleStringArrayType EOF ;
    public final void entryRuleDoubleStringArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1194:32: ( ruleDoubleStringArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1195:1: ruleDoubleStringArrayType EOF
            {
             before(grammarAccess.getDoubleStringArrayTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleStringArrayType_in_entryRuleDoubleStringArrayType2580);
            ruleDoubleStringArrayType();
            _fsp--;

             after(grammarAccess.getDoubleStringArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleStringArrayType2587); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1202:1: ruleDoubleStringArrayType : ( ( rule__DoubleStringArrayType__Group__0 ) ) ;
    public final void ruleDoubleStringArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1206:2: ( ( ( rule__DoubleStringArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1207:1: ( ( rule__DoubleStringArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1207:1: ( ( rule__DoubleStringArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1208:1: ( rule__DoubleStringArrayType__Group__0 )
            {
             before(grammarAccess.getDoubleStringArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1209:1: ( rule__DoubleStringArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1209:2: rule__DoubleStringArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__DoubleStringArrayType__Group__0_in_ruleDoubleStringArrayType2614);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1221:1: entryRuleStateType : ruleStateType EOF ;
    public final void entryRuleStateType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1221:20: ( ruleStateType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1222:1: ruleStateType EOF
            {
             before(grammarAccess.getStateTypeRule()); 
            pushFollow(FOLLOW_ruleStateType_in_entryRuleStateType2640);
            ruleStateType();
            _fsp--;

             after(grammarAccess.getStateTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateType2647); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1229:1: ruleStateType : ( ( rule__StateType__Group__0 ) ) ;
    public final void ruleStateType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1233:2: ( ( ( rule__StateType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1234:1: ( ( rule__StateType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1234:1: ( ( rule__StateType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1235:1: ( rule__StateType__Group__0 )
            {
             before(grammarAccess.getStateTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1236:1: ( rule__StateType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1236:2: rule__StateType__Group__0
            {
            pushFollow(FOLLOW_rule__StateType__Group__0_in_ruleStateType2674);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1248:1: entryRuleConstStringType : ruleConstStringType EOF ;
    public final void entryRuleConstStringType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1248:26: ( ruleConstStringType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1249:1: ruleConstStringType EOF
            {
             before(grammarAccess.getConstStringTypeRule()); 
            pushFollow(FOLLOW_ruleConstStringType_in_entryRuleConstStringType2700);
            ruleConstStringType();
            _fsp--;

             after(grammarAccess.getConstStringTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstStringType2707); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1256:1: ruleConstStringType : ( ( rule__ConstStringType__Group__0 ) ) ;
    public final void ruleConstStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1260:2: ( ( ( rule__ConstStringType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1261:1: ( ( rule__ConstStringType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1261:1: ( ( rule__ConstStringType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1262:1: ( rule__ConstStringType__Group__0 )
            {
             before(grammarAccess.getConstStringTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1263:1: ( rule__ConstStringType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1263:2: rule__ConstStringType__Group__0
            {
            pushFollow(FOLLOW_rule__ConstStringType__Group__0_in_ruleConstStringType2734);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1275:1: entryRuleBooleanArrayType : ruleBooleanArrayType EOF ;
    public final void entryRuleBooleanArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1275:27: ( ruleBooleanArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1276:1: ruleBooleanArrayType EOF
            {
             before(grammarAccess.getBooleanArrayTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanArrayType_in_entryRuleBooleanArrayType2760);
            ruleBooleanArrayType();
            _fsp--;

             after(grammarAccess.getBooleanArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanArrayType2767); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1283:1: ruleBooleanArrayType : ( ( rule__BooleanArrayType__Group__0 ) ) ;
    public final void ruleBooleanArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1287:2: ( ( ( rule__BooleanArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1288:1: ( ( rule__BooleanArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1288:1: ( ( rule__BooleanArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1289:1: ( rule__BooleanArrayType__Group__0 )
            {
             before(grammarAccess.getBooleanArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1290:1: ( rule__BooleanArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1290:2: rule__BooleanArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__BooleanArrayType__Group__0_in_ruleBooleanArrayType2794);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1302:1: entryRuleUCharType : ruleUCharType EOF ;
    public final void entryRuleUCharType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1302:20: ( ruleUCharType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1303:1: ruleUCharType EOF
            {
             before(grammarAccess.getUCharTypeRule()); 
            pushFollow(FOLLOW_ruleUCharType_in_entryRuleUCharType2820);
            ruleUCharType();
            _fsp--;

             after(grammarAccess.getUCharTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUCharType2827); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1310:1: ruleUCharType : ( ( rule__UCharType__Group__0 ) ) ;
    public final void ruleUCharType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1314:2: ( ( ( rule__UCharType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1315:1: ( ( rule__UCharType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1315:1: ( ( rule__UCharType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1316:1: ( rule__UCharType__Group__0 )
            {
             before(grammarAccess.getUCharTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1317:1: ( rule__UCharType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1317:2: rule__UCharType__Group__0
            {
            pushFollow(FOLLOW_rule__UCharType__Group__0_in_ruleUCharType2854);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1329:1: entryRuleLongType : ruleLongType EOF ;
    public final void entryRuleLongType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1329:19: ( ruleLongType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1330:1: ruleLongType EOF
            {
             before(grammarAccess.getLongTypeRule()); 
            pushFollow(FOLLOW_ruleLongType_in_entryRuleLongType2880);
            ruleLongType();
            _fsp--;

             after(grammarAccess.getLongTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongType2887); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1337:1: ruleLongType : ( ( rule__LongType__Group__0 ) ) ;
    public final void ruleLongType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1341:2: ( ( ( rule__LongType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1342:1: ( ( rule__LongType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1342:1: ( ( rule__LongType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1343:1: ( rule__LongType__Group__0 )
            {
             before(grammarAccess.getLongTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1344:1: ( rule__LongType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1344:2: rule__LongType__Group__0
            {
            pushFollow(FOLLOW_rule__LongType__Group__0_in_ruleLongType2914);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1356:1: entryRuleULongType : ruleULongType EOF ;
    public final void entryRuleULongType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1356:20: ( ruleULongType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1357:1: ruleULongType EOF
            {
             before(grammarAccess.getULongTypeRule()); 
            pushFollow(FOLLOW_ruleULongType_in_entryRuleULongType2940);
            ruleULongType();
            _fsp--;

             after(grammarAccess.getULongTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleULongType2947); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1364:1: ruleULongType : ( ( rule__ULongType__Group__0 ) ) ;
    public final void ruleULongType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1368:2: ( ( ( rule__ULongType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1369:1: ( ( rule__ULongType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1369:1: ( ( rule__ULongType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1370:1: ( rule__ULongType__Group__0 )
            {
             before(grammarAccess.getULongTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1371:1: ( rule__ULongType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1371:2: rule__ULongType__Group__0
            {
            pushFollow(FOLLOW_rule__ULongType__Group__0_in_ruleULongType2974);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1383:1: entryRuleLongArrayType : ruleLongArrayType EOF ;
    public final void entryRuleLongArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1383:24: ( ruleLongArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1384:1: ruleLongArrayType EOF
            {
             before(grammarAccess.getLongArrayTypeRule()); 
            pushFollow(FOLLOW_ruleLongArrayType_in_entryRuleLongArrayType3000);
            ruleLongArrayType();
            _fsp--;

             after(grammarAccess.getLongArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongArrayType3007); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1391:1: ruleLongArrayType : ( ( rule__LongArrayType__Group__0 ) ) ;
    public final void ruleLongArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1395:2: ( ( ( rule__LongArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1396:1: ( ( rule__LongArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1396:1: ( ( rule__LongArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1397:1: ( rule__LongArrayType__Group__0 )
            {
             before(grammarAccess.getLongArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1398:1: ( rule__LongArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1398:2: rule__LongArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__LongArrayType__Group__0_in_ruleLongArrayType3034);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1410:1: entryRuleULongArrayType : ruleULongArrayType EOF ;
    public final void entryRuleULongArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1410:25: ( ruleULongArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1411:1: ruleULongArrayType EOF
            {
             before(grammarAccess.getULongArrayTypeRule()); 
            pushFollow(FOLLOW_ruleULongArrayType_in_entryRuleULongArrayType3060);
            ruleULongArrayType();
            _fsp--;

             after(grammarAccess.getULongArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleULongArrayType3067); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1418:1: ruleULongArrayType : ( ( rule__ULongArrayType__Group__0 ) ) ;
    public final void ruleULongArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1422:2: ( ( ( rule__ULongArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1423:1: ( ( rule__ULongArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1423:1: ( ( rule__ULongArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1424:1: ( rule__ULongArrayType__Group__0 )
            {
             before(grammarAccess.getULongArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1425:1: ( rule__ULongArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1425:2: rule__ULongArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__ULongArrayType__Group__0_in_ruleULongArrayType3094);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1437:1: entryRuleDevIntType : ruleDevIntType EOF ;
    public final void entryRuleDevIntType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1437:21: ( ruleDevIntType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1438:1: ruleDevIntType EOF
            {
             before(grammarAccess.getDevIntTypeRule()); 
            pushFollow(FOLLOW_ruleDevIntType_in_entryRuleDevIntType3120);
            ruleDevIntType();
            _fsp--;

             after(grammarAccess.getDevIntTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDevIntType3127); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1445:1: ruleDevIntType : ( ( rule__DevIntType__Group__0 ) ) ;
    public final void ruleDevIntType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1449:2: ( ( ( rule__DevIntType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1450:1: ( ( rule__DevIntType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1450:1: ( ( rule__DevIntType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1451:1: ( rule__DevIntType__Group__0 )
            {
             before(grammarAccess.getDevIntTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1452:1: ( rule__DevIntType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1452:2: rule__DevIntType__Group__0
            {
            pushFollow(FOLLOW_rule__DevIntType__Group__0_in_ruleDevIntType3154);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1464:1: entryRuleEncodedType : ruleEncodedType EOF ;
    public final void entryRuleEncodedType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1464:22: ( ruleEncodedType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1465:1: ruleEncodedType EOF
            {
             before(grammarAccess.getEncodedTypeRule()); 
            pushFollow(FOLLOW_ruleEncodedType_in_entryRuleEncodedType3180);
            ruleEncodedType();
            _fsp--;

             after(grammarAccess.getEncodedTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEncodedType3187); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1472:1: ruleEncodedType : ( ( rule__EncodedType__Group__0 ) ) ;
    public final void ruleEncodedType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1476:2: ( ( ( rule__EncodedType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1477:1: ( ( rule__EncodedType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1477:1: ( ( rule__EncodedType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1478:1: ( rule__EncodedType__Group__0 )
            {
             before(grammarAccess.getEncodedTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1479:1: ( rule__EncodedType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1479:2: rule__EncodedType__Group__0
            {
            pushFollow(FOLLOW_rule__EncodedType__Group__0_in_ruleEncodedType3214);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1491:1: entryRuleShortVectorType : ruleShortVectorType EOF ;
    public final void entryRuleShortVectorType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1491:26: ( ruleShortVectorType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1492:1: ruleShortVectorType EOF
            {
             before(grammarAccess.getShortVectorTypeRule()); 
            pushFollow(FOLLOW_ruleShortVectorType_in_entryRuleShortVectorType3240);
            ruleShortVectorType();
            _fsp--;

             after(grammarAccess.getShortVectorTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortVectorType3247); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1499:1: ruleShortVectorType : ( ( rule__ShortVectorType__Group__0 ) ) ;
    public final void ruleShortVectorType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1503:2: ( ( ( rule__ShortVectorType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1504:1: ( ( rule__ShortVectorType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1504:1: ( ( rule__ShortVectorType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1505:1: ( rule__ShortVectorType__Group__0 )
            {
             before(grammarAccess.getShortVectorTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1506:1: ( rule__ShortVectorType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1506:2: rule__ShortVectorType__Group__0
            {
            pushFollow(FOLLOW_rule__ShortVectorType__Group__0_in_ruleShortVectorType3274);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1518:1: entryRuleIntVectorType : ruleIntVectorType EOF ;
    public final void entryRuleIntVectorType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1518:24: ( ruleIntVectorType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1519:1: ruleIntVectorType EOF
            {
             before(grammarAccess.getIntVectorTypeRule()); 
            pushFollow(FOLLOW_ruleIntVectorType_in_entryRuleIntVectorType3300);
            ruleIntVectorType();
            _fsp--;

             after(grammarAccess.getIntVectorTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntVectorType3307); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1526:1: ruleIntVectorType : ( ( rule__IntVectorType__Group__0 ) ) ;
    public final void ruleIntVectorType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1530:2: ( ( ( rule__IntVectorType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1531:1: ( ( rule__IntVectorType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1531:1: ( ( rule__IntVectorType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1532:1: ( rule__IntVectorType__Group__0 )
            {
             before(grammarAccess.getIntVectorTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1533:1: ( rule__IntVectorType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1533:2: rule__IntVectorType__Group__0
            {
            pushFollow(FOLLOW_rule__IntVectorType__Group__0_in_ruleIntVectorType3334);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1545:1: entryRuleFloatVectorType : ruleFloatVectorType EOF ;
    public final void entryRuleFloatVectorType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1545:26: ( ruleFloatVectorType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1546:1: ruleFloatVectorType EOF
            {
             before(grammarAccess.getFloatVectorTypeRule()); 
            pushFollow(FOLLOW_ruleFloatVectorType_in_entryRuleFloatVectorType3360);
            ruleFloatVectorType();
            _fsp--;

             after(grammarAccess.getFloatVectorTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatVectorType3367); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1553:1: ruleFloatVectorType : ( ( rule__FloatVectorType__Group__0 ) ) ;
    public final void ruleFloatVectorType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1557:2: ( ( ( rule__FloatVectorType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1558:1: ( ( rule__FloatVectorType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1558:1: ( ( rule__FloatVectorType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1559:1: ( rule__FloatVectorType__Group__0 )
            {
             before(grammarAccess.getFloatVectorTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1560:1: ( rule__FloatVectorType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1560:2: rule__FloatVectorType__Group__0
            {
            pushFollow(FOLLOW_rule__FloatVectorType__Group__0_in_ruleFloatVectorType3394);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1572:1: entryRuleDoubleVectorType : ruleDoubleVectorType EOF ;
    public final void entryRuleDoubleVectorType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1572:27: ( ruleDoubleVectorType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1573:1: ruleDoubleVectorType EOF
            {
             before(grammarAccess.getDoubleVectorTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleVectorType_in_entryRuleDoubleVectorType3420);
            ruleDoubleVectorType();
            _fsp--;

             after(grammarAccess.getDoubleVectorTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleVectorType3427); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1580:1: ruleDoubleVectorType : ( ( rule__DoubleVectorType__Group__0 ) ) ;
    public final void ruleDoubleVectorType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1584:2: ( ( ( rule__DoubleVectorType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1585:1: ( ( rule__DoubleVectorType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1585:1: ( ( rule__DoubleVectorType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1586:1: ( rule__DoubleVectorType__Group__0 )
            {
             before(grammarAccess.getDoubleVectorTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1587:1: ( rule__DoubleVectorType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1587:2: rule__DoubleVectorType__Group__0
            {
            pushFollow(FOLLOW_rule__DoubleVectorType__Group__0_in_ruleDoubleVectorType3454);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1599:1: entryRuleStringVectorType : ruleStringVectorType EOF ;
    public final void entryRuleStringVectorType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1599:27: ( ruleStringVectorType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1600:1: ruleStringVectorType EOF
            {
             before(grammarAccess.getStringVectorTypeRule()); 
            pushFollow(FOLLOW_ruleStringVectorType_in_entryRuleStringVectorType3480);
            ruleStringVectorType();
            _fsp--;

             after(grammarAccess.getStringVectorTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringVectorType3487); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1607:1: ruleStringVectorType : ( ( rule__StringVectorType__Group__0 ) ) ;
    public final void ruleStringVectorType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1611:2: ( ( ( rule__StringVectorType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1612:1: ( ( rule__StringVectorType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1612:1: ( ( rule__StringVectorType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1613:1: ( rule__StringVectorType__Group__0 )
            {
             before(grammarAccess.getStringVectorTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1614:1: ( rule__StringVectorType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1614:2: rule__StringVectorType__Group__0
            {
            pushFollow(FOLLOW_rule__StringVectorType__Group__0_in_ruleStringVectorType3514);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1626:1: rule__Language__Alternatives : ( ( 'Cpp' ) | ( 'Java' ) | ( 'Python' ) );
    public final void rule__Language__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1630:1: ( ( 'Cpp' ) | ( 'Java' ) | ( 'Python' ) )
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
                    new NoViableAltException("1626:1: rule__Language__Alternatives : ( ( 'Cpp' ) | ( 'Java' ) | ( 'Python' ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1631:1: ( 'Cpp' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1631:1: ( 'Cpp' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1632:1: 'Cpp'
                    {
                     before(grammarAccess.getLanguageAccess().getCppKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Language__Alternatives3551); 
                     after(grammarAccess.getLanguageAccess().getCppKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1639:6: ( 'Java' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1639:6: ( 'Java' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1640:1: 'Java'
                    {
                     before(grammarAccess.getLanguageAccess().getJavaKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Language__Alternatives3571); 
                     after(grammarAccess.getLanguageAccess().getJavaKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1647:6: ( 'Python' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1647:6: ( 'Python' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1648:1: 'Python'
                    {
                     before(grammarAccess.getLanguageAccess().getPythonKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__Language__Alternatives3591); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1660:1: rule__DisplayLevel__Alternatives : ( ( 'OPERATOR' ) | ( 'EXPERT' ) );
    public final void rule__DisplayLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1664:1: ( ( 'OPERATOR' ) | ( 'EXPERT' ) )
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
                    new NoViableAltException("1660:1: rule__DisplayLevel__Alternatives : ( ( 'OPERATOR' ) | ( 'EXPERT' ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1665:1: ( 'OPERATOR' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1665:1: ( 'OPERATOR' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1666:1: 'OPERATOR'
                    {
                     before(grammarAccess.getDisplayLevelAccess().getOPERATORKeyword_0()); 
                    match(input,14,FOLLOW_14_in_rule__DisplayLevel__Alternatives3626); 
                     after(grammarAccess.getDisplayLevelAccess().getOPERATORKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1673:6: ( 'EXPERT' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1673:6: ( 'EXPERT' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1674:1: 'EXPERT'
                    {
                     before(grammarAccess.getDisplayLevelAccess().getEXPERTKeyword_1()); 
                    match(input,15,FOLLOW_15_in_rule__DisplayLevel__Alternatives3646); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1686:1: rule__AttrType__Alternatives : ( ( 'Scalar' ) | ( 'Spectrum' ) | ( 'Image' ) );
    public final void rule__AttrType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1690:1: ( ( 'Scalar' ) | ( 'Spectrum' ) | ( 'Image' ) )
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
                    new NoViableAltException("1686:1: rule__AttrType__Alternatives : ( ( 'Scalar' ) | ( 'Spectrum' ) | ( 'Image' ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1691:1: ( 'Scalar' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1691:1: ( 'Scalar' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1692:1: 'Scalar'
                    {
                     before(grammarAccess.getAttrTypeAccess().getScalarKeyword_0()); 
                    match(input,16,FOLLOW_16_in_rule__AttrType__Alternatives3681); 
                     after(grammarAccess.getAttrTypeAccess().getScalarKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1699:6: ( 'Spectrum' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1699:6: ( 'Spectrum' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1700:1: 'Spectrum'
                    {
                     before(grammarAccess.getAttrTypeAccess().getSpectrumKeyword_1()); 
                    match(input,17,FOLLOW_17_in_rule__AttrType__Alternatives3701); 
                     after(grammarAccess.getAttrTypeAccess().getSpectrumKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1707:6: ( 'Image' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1707:6: ( 'Image' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1708:1: 'Image'
                    {
                     before(grammarAccess.getAttrTypeAccess().getImageKeyword_2()); 
                    match(input,18,FOLLOW_18_in_rule__AttrType__Alternatives3721); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1720:1: rule__RW_Type__Alternatives : ( ( 'READ' ) | ( 'WRITE' ) | ( 'READ_WRITE' ) | ( 'READ_WITH_WRITE' ) );
    public final void rule__RW_Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1724:1: ( ( 'READ' ) | ( 'WRITE' ) | ( 'READ_WRITE' ) | ( 'READ_WITH_WRITE' ) )
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
                    new NoViableAltException("1720:1: rule__RW_Type__Alternatives : ( ( 'READ' ) | ( 'WRITE' ) | ( 'READ_WRITE' ) | ( 'READ_WITH_WRITE' ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1725:1: ( 'READ' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1725:1: ( 'READ' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1726:1: 'READ'
                    {
                     before(grammarAccess.getRW_TypeAccess().getREADKeyword_0()); 
                    match(input,19,FOLLOW_19_in_rule__RW_Type__Alternatives3756); 
                     after(grammarAccess.getRW_TypeAccess().getREADKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1733:6: ( 'WRITE' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1733:6: ( 'WRITE' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1734:1: 'WRITE'
                    {
                     before(grammarAccess.getRW_TypeAccess().getWRITEKeyword_1()); 
                    match(input,20,FOLLOW_20_in_rule__RW_Type__Alternatives3776); 
                     after(grammarAccess.getRW_TypeAccess().getWRITEKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1741:6: ( 'READ_WRITE' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1741:6: ( 'READ_WRITE' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1742:1: 'READ_WRITE'
                    {
                     before(grammarAccess.getRW_TypeAccess().getREAD_WRITEKeyword_2()); 
                    match(input,21,FOLLOW_21_in_rule__RW_Type__Alternatives3796); 
                     after(grammarAccess.getRW_TypeAccess().getREAD_WRITEKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1749:6: ( 'READ_WITH_WRITE' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1749:6: ( 'READ_WITH_WRITE' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1750:1: 'READ_WITH_WRITE'
                    {
                     before(grammarAccess.getRW_TypeAccess().getREAD_WITH_WRITEKeyword_3()); 
                    match(input,22,FOLLOW_22_in_rule__RW_Type__Alternatives3816); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1762:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1766:1: ( ( 'true' ) | ( 'false' ) )
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
                    new NoViableAltException("1762:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1767:1: ( 'true' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1767:1: ( 'true' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1768:1: 'true'
                    {
                     before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    match(input,23,FOLLOW_23_in_rule__Boolean__Alternatives3851); 
                     after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1775:6: ( 'false' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1775:6: ( 'false' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1776:1: 'false'
                    {
                     before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    match(input,24,FOLLOW_24_in_rule__Boolean__Alternatives3871); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1788:1: rule__PropType__Alternatives : ( ( ruleSimpleType ) | ( ruleVectorType ) );
    public final void rule__PropType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1792:1: ( ( ruleSimpleType ) | ( ruleVectorType ) )
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
                    new NoViableAltException("1788:1: rule__PropType__Alternatives : ( ( ruleSimpleType ) | ( ruleVectorType ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1793:1: ( ruleSimpleType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1793:1: ( ruleSimpleType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1794:1: ruleSimpleType
                    {
                     before(grammarAccess.getPropTypeAccess().getSimpleTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleType_in_rule__PropType__Alternatives3905);
                    ruleSimpleType();
                    _fsp--;

                     after(grammarAccess.getPropTypeAccess().getSimpleTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1799:6: ( ruleVectorType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1799:6: ( ruleVectorType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1800:1: ruleVectorType
                    {
                     before(grammarAccess.getPropTypeAccess().getVectorTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVectorType_in_rule__PropType__Alternatives3922);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1810:1: rule__SimpleType__Alternatives : ( ( ruleBooleanType ) | ( ruleShortType ) | ( ruleUShortType ) | ( ruleIntType ) | ( ruleUIntType ) | ( ruleFloatType ) | ( ruleDoubleType ) | ( ruleStringType ) );
    public final void rule__SimpleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1814:1: ( ( ruleBooleanType ) | ( ruleShortType ) | ( ruleUShortType ) | ( ruleIntType ) | ( ruleUIntType ) | ( ruleFloatType ) | ( ruleDoubleType ) | ( ruleStringType ) )
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
                    new NoViableAltException("1810:1: rule__SimpleType__Alternatives : ( ( ruleBooleanType ) | ( ruleShortType ) | ( ruleUShortType ) | ( ruleIntType ) | ( ruleUIntType ) | ( ruleFloatType ) | ( ruleDoubleType ) | ( ruleStringType ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1815:1: ( ruleBooleanType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1815:1: ( ruleBooleanType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1816:1: ruleBooleanType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getBooleanTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBooleanType_in_rule__SimpleType__Alternatives3954);
                    ruleBooleanType();
                    _fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getBooleanTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1821:6: ( ruleShortType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1821:6: ( ruleShortType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1822:1: ruleShortType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getShortTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleShortType_in_rule__SimpleType__Alternatives3971);
                    ruleShortType();
                    _fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getShortTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1827:6: ( ruleUShortType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1827:6: ( ruleUShortType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1828:1: ruleUShortType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getUShortTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleUShortType_in_rule__SimpleType__Alternatives3988);
                    ruleUShortType();
                    _fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getUShortTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1833:6: ( ruleIntType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1833:6: ( ruleIntType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1834:1: ruleIntType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getIntTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleIntType_in_rule__SimpleType__Alternatives4005);
                    ruleIntType();
                    _fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getIntTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1839:6: ( ruleUIntType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1839:6: ( ruleUIntType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1840:1: ruleUIntType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getUIntTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleUIntType_in_rule__SimpleType__Alternatives4022);
                    ruleUIntType();
                    _fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getUIntTypeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1845:6: ( ruleFloatType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1845:6: ( ruleFloatType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1846:1: ruleFloatType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getFloatTypeParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleFloatType_in_rule__SimpleType__Alternatives4039);
                    ruleFloatType();
                    _fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getFloatTypeParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1851:6: ( ruleDoubleType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1851:6: ( ruleDoubleType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1852:1: ruleDoubleType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getDoubleTypeParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleDoubleType_in_rule__SimpleType__Alternatives4056);
                    ruleDoubleType();
                    _fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getDoubleTypeParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1857:6: ( ruleStringType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1857:6: ( ruleStringType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1858:1: ruleStringType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getStringTypeParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleStringType_in_rule__SimpleType__Alternatives4073);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1868:1: rule__VectorType__Alternatives : ( ( ruleShortVectorType ) | ( ruleIntVectorType ) | ( ruleFloatVectorType ) | ( ruleDoubleVectorType ) | ( ruleStringVectorType ) );
    public final void rule__VectorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1872:1: ( ( ruleShortVectorType ) | ( ruleIntVectorType ) | ( ruleFloatVectorType ) | ( ruleDoubleVectorType ) | ( ruleStringVectorType ) )
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
                    new NoViableAltException("1868:1: rule__VectorType__Alternatives : ( ( ruleShortVectorType ) | ( ruleIntVectorType ) | ( ruleFloatVectorType ) | ( ruleDoubleVectorType ) | ( ruleStringVectorType ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1873:1: ( ruleShortVectorType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1873:1: ( ruleShortVectorType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1874:1: ruleShortVectorType
                    {
                     before(grammarAccess.getVectorTypeAccess().getShortVectorTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleShortVectorType_in_rule__VectorType__Alternatives4105);
                    ruleShortVectorType();
                    _fsp--;

                     after(grammarAccess.getVectorTypeAccess().getShortVectorTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1879:6: ( ruleIntVectorType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1879:6: ( ruleIntVectorType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1880:1: ruleIntVectorType
                    {
                     before(grammarAccess.getVectorTypeAccess().getIntVectorTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntVectorType_in_rule__VectorType__Alternatives4122);
                    ruleIntVectorType();
                    _fsp--;

                     after(grammarAccess.getVectorTypeAccess().getIntVectorTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1885:6: ( ruleFloatVectorType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1885:6: ( ruleFloatVectorType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1886:1: ruleFloatVectorType
                    {
                     before(grammarAccess.getVectorTypeAccess().getFloatVectorTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFloatVectorType_in_rule__VectorType__Alternatives4139);
                    ruleFloatVectorType();
                    _fsp--;

                     after(grammarAccess.getVectorTypeAccess().getFloatVectorTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1891:6: ( ruleDoubleVectorType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1891:6: ( ruleDoubleVectorType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1892:1: ruleDoubleVectorType
                    {
                     before(grammarAccess.getVectorTypeAccess().getDoubleVectorTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDoubleVectorType_in_rule__VectorType__Alternatives4156);
                    ruleDoubleVectorType();
                    _fsp--;

                     after(grammarAccess.getVectorTypeAccess().getDoubleVectorTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1897:6: ( ruleStringVectorType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1897:6: ( ruleStringVectorType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1898:1: ruleStringVectorType
                    {
                     before(grammarAccess.getVectorTypeAccess().getStringVectorTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleStringVectorType_in_rule__VectorType__Alternatives4173);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1908:1: rule__Type__Alternatives : ( ( ruleVoidType ) | ( ruleBooleanType ) | ( ruleShortType ) | ( ruleUShortType ) | ( ruleIntType ) | ( ruleUIntType ) | ( ruleFloatType ) | ( ruleDoubleType ) | ( ruleStringType ) | ( ruleCharArrayType ) | ( ruleShortArrayType ) | ( ruleUShortArrayType ) | ( ruleIntArrayType ) | ( ruleUIntArrayType ) | ( ruleFloatArrayType ) | ( ruleDoubleArrayType ) | ( ruleStringArrayType ) | ( ruleLongStringArrayType ) | ( ruleDoubleStringArrayType ) | ( ruleStateType ) | ( ruleConstStringType ) | ( ruleBooleanArrayType ) | ( ruleLongType ) | ( ruleULongType ) | ( ruleUCharType ) | ( ruleLongArrayType ) | ( ruleULongArrayType ) | ( ruleDevIntType ) | ( ruleEncodedType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1912:1: ( ( ruleVoidType ) | ( ruleBooleanType ) | ( ruleShortType ) | ( ruleUShortType ) | ( ruleIntType ) | ( ruleUIntType ) | ( ruleFloatType ) | ( ruleDoubleType ) | ( ruleStringType ) | ( ruleCharArrayType ) | ( ruleShortArrayType ) | ( ruleUShortArrayType ) | ( ruleIntArrayType ) | ( ruleUIntArrayType ) | ( ruleFloatArrayType ) | ( ruleDoubleArrayType ) | ( ruleStringArrayType ) | ( ruleLongStringArrayType ) | ( ruleDoubleStringArrayType ) | ( ruleStateType ) | ( ruleConstStringType ) | ( ruleBooleanArrayType ) | ( ruleLongType ) | ( ruleULongType ) | ( ruleUCharType ) | ( ruleLongArrayType ) | ( ruleULongArrayType ) | ( ruleDevIntType ) | ( ruleEncodedType ) )
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
                    new NoViableAltException("1908:1: rule__Type__Alternatives : ( ( ruleVoidType ) | ( ruleBooleanType ) | ( ruleShortType ) | ( ruleUShortType ) | ( ruleIntType ) | ( ruleUIntType ) | ( ruleFloatType ) | ( ruleDoubleType ) | ( ruleStringType ) | ( ruleCharArrayType ) | ( ruleShortArrayType ) | ( ruleUShortArrayType ) | ( ruleIntArrayType ) | ( ruleUIntArrayType ) | ( ruleFloatArrayType ) | ( ruleDoubleArrayType ) | ( ruleStringArrayType ) | ( ruleLongStringArrayType ) | ( ruleDoubleStringArrayType ) | ( ruleStateType ) | ( ruleConstStringType ) | ( ruleBooleanArrayType ) | ( ruleLongType ) | ( ruleULongType ) | ( ruleUCharType ) | ( ruleLongArrayType ) | ( ruleULongArrayType ) | ( ruleDevIntType ) | ( ruleEncodedType ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1913:1: ( ruleVoidType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1913:1: ( ruleVoidType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1914:1: ruleVoidType
                    {
                     before(grammarAccess.getTypeAccess().getVoidTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleVoidType_in_rule__Type__Alternatives4205);
                    ruleVoidType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getVoidTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1919:6: ( ruleBooleanType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1919:6: ( ruleBooleanType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1920:1: ruleBooleanType
                    {
                     before(grammarAccess.getTypeAccess().getBooleanTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBooleanType_in_rule__Type__Alternatives4222);
                    ruleBooleanType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getBooleanTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1925:6: ( ruleShortType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1925:6: ( ruleShortType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1926:1: ruleShortType
                    {
                     before(grammarAccess.getTypeAccess().getShortTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleShortType_in_rule__Type__Alternatives4239);
                    ruleShortType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getShortTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1931:6: ( ruleUShortType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1931:6: ( ruleUShortType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1932:1: ruleUShortType
                    {
                     before(grammarAccess.getTypeAccess().getUShortTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleUShortType_in_rule__Type__Alternatives4256);
                    ruleUShortType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getUShortTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1937:6: ( ruleIntType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1937:6: ( ruleIntType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1938:1: ruleIntType
                    {
                     before(grammarAccess.getTypeAccess().getIntTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleIntType_in_rule__Type__Alternatives4273);
                    ruleIntType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getIntTypeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1943:6: ( ruleUIntType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1943:6: ( ruleUIntType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1944:1: ruleUIntType
                    {
                     before(grammarAccess.getTypeAccess().getUIntTypeParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleUIntType_in_rule__Type__Alternatives4290);
                    ruleUIntType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getUIntTypeParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1949:6: ( ruleFloatType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1949:6: ( ruleFloatType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1950:1: ruleFloatType
                    {
                     before(grammarAccess.getTypeAccess().getFloatTypeParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleFloatType_in_rule__Type__Alternatives4307);
                    ruleFloatType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getFloatTypeParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1955:6: ( ruleDoubleType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1955:6: ( ruleDoubleType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1956:1: ruleDoubleType
                    {
                     before(grammarAccess.getTypeAccess().getDoubleTypeParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleDoubleType_in_rule__Type__Alternatives4324);
                    ruleDoubleType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getDoubleTypeParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1961:6: ( ruleStringType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1961:6: ( ruleStringType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1962:1: ruleStringType
                    {
                     before(grammarAccess.getTypeAccess().getStringTypeParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleStringType_in_rule__Type__Alternatives4341);
                    ruleStringType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getStringTypeParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1967:6: ( ruleCharArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1967:6: ( ruleCharArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1968:1: ruleCharArrayType
                    {
                     before(grammarAccess.getTypeAccess().getCharArrayTypeParserRuleCall_9()); 
                    pushFollow(FOLLOW_ruleCharArrayType_in_rule__Type__Alternatives4358);
                    ruleCharArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getCharArrayTypeParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1973:6: ( ruleShortArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1973:6: ( ruleShortArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1974:1: ruleShortArrayType
                    {
                     before(grammarAccess.getTypeAccess().getShortArrayTypeParserRuleCall_10()); 
                    pushFollow(FOLLOW_ruleShortArrayType_in_rule__Type__Alternatives4375);
                    ruleShortArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getShortArrayTypeParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1979:6: ( ruleUShortArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1979:6: ( ruleUShortArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1980:1: ruleUShortArrayType
                    {
                     before(grammarAccess.getTypeAccess().getUShortArrayTypeParserRuleCall_11()); 
                    pushFollow(FOLLOW_ruleUShortArrayType_in_rule__Type__Alternatives4392);
                    ruleUShortArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getUShortArrayTypeParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1985:6: ( ruleIntArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1985:6: ( ruleIntArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1986:1: ruleIntArrayType
                    {
                     before(grammarAccess.getTypeAccess().getIntArrayTypeParserRuleCall_12()); 
                    pushFollow(FOLLOW_ruleIntArrayType_in_rule__Type__Alternatives4409);
                    ruleIntArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getIntArrayTypeParserRuleCall_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1991:6: ( ruleUIntArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1991:6: ( ruleUIntArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1992:1: ruleUIntArrayType
                    {
                     before(grammarAccess.getTypeAccess().getUIntArrayTypeParserRuleCall_13()); 
                    pushFollow(FOLLOW_ruleUIntArrayType_in_rule__Type__Alternatives4426);
                    ruleUIntArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getUIntArrayTypeParserRuleCall_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1997:6: ( ruleFloatArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1997:6: ( ruleFloatArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1998:1: ruleFloatArrayType
                    {
                     before(grammarAccess.getTypeAccess().getFloatArrayTypeParserRuleCall_14()); 
                    pushFollow(FOLLOW_ruleFloatArrayType_in_rule__Type__Alternatives4443);
                    ruleFloatArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getFloatArrayTypeParserRuleCall_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2003:6: ( ruleDoubleArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2003:6: ( ruleDoubleArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2004:1: ruleDoubleArrayType
                    {
                     before(grammarAccess.getTypeAccess().getDoubleArrayTypeParserRuleCall_15()); 
                    pushFollow(FOLLOW_ruleDoubleArrayType_in_rule__Type__Alternatives4460);
                    ruleDoubleArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getDoubleArrayTypeParserRuleCall_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2009:6: ( ruleStringArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2009:6: ( ruleStringArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2010:1: ruleStringArrayType
                    {
                     before(grammarAccess.getTypeAccess().getStringArrayTypeParserRuleCall_16()); 
                    pushFollow(FOLLOW_ruleStringArrayType_in_rule__Type__Alternatives4477);
                    ruleStringArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getStringArrayTypeParserRuleCall_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2015:6: ( ruleLongStringArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2015:6: ( ruleLongStringArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2016:1: ruleLongStringArrayType
                    {
                     before(grammarAccess.getTypeAccess().getLongStringArrayTypeParserRuleCall_17()); 
                    pushFollow(FOLLOW_ruleLongStringArrayType_in_rule__Type__Alternatives4494);
                    ruleLongStringArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getLongStringArrayTypeParserRuleCall_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2021:6: ( ruleDoubleStringArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2021:6: ( ruleDoubleStringArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2022:1: ruleDoubleStringArrayType
                    {
                     before(grammarAccess.getTypeAccess().getDoubleStringArrayTypeParserRuleCall_18()); 
                    pushFollow(FOLLOW_ruleDoubleStringArrayType_in_rule__Type__Alternatives4511);
                    ruleDoubleStringArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getDoubleStringArrayTypeParserRuleCall_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2027:6: ( ruleStateType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2027:6: ( ruleStateType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2028:1: ruleStateType
                    {
                     before(grammarAccess.getTypeAccess().getStateTypeParserRuleCall_19()); 
                    pushFollow(FOLLOW_ruleStateType_in_rule__Type__Alternatives4528);
                    ruleStateType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getStateTypeParserRuleCall_19()); 

                    }


                    }
                    break;
                case 21 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2033:6: ( ruleConstStringType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2033:6: ( ruleConstStringType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2034:1: ruleConstStringType
                    {
                     before(grammarAccess.getTypeAccess().getConstStringTypeParserRuleCall_20()); 
                    pushFollow(FOLLOW_ruleConstStringType_in_rule__Type__Alternatives4545);
                    ruleConstStringType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getConstStringTypeParserRuleCall_20()); 

                    }


                    }
                    break;
                case 22 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2039:6: ( ruleBooleanArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2039:6: ( ruleBooleanArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2040:1: ruleBooleanArrayType
                    {
                     before(grammarAccess.getTypeAccess().getBooleanArrayTypeParserRuleCall_21()); 
                    pushFollow(FOLLOW_ruleBooleanArrayType_in_rule__Type__Alternatives4562);
                    ruleBooleanArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getBooleanArrayTypeParserRuleCall_21()); 

                    }


                    }
                    break;
                case 23 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2045:6: ( ruleLongType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2045:6: ( ruleLongType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2046:1: ruleLongType
                    {
                     before(grammarAccess.getTypeAccess().getLongTypeParserRuleCall_22()); 
                    pushFollow(FOLLOW_ruleLongType_in_rule__Type__Alternatives4579);
                    ruleLongType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getLongTypeParserRuleCall_22()); 

                    }


                    }
                    break;
                case 24 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2051:6: ( ruleULongType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2051:6: ( ruleULongType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2052:1: ruleULongType
                    {
                     before(grammarAccess.getTypeAccess().getULongTypeParserRuleCall_23()); 
                    pushFollow(FOLLOW_ruleULongType_in_rule__Type__Alternatives4596);
                    ruleULongType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getULongTypeParserRuleCall_23()); 

                    }


                    }
                    break;
                case 25 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2057:6: ( ruleUCharType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2057:6: ( ruleUCharType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2058:1: ruleUCharType
                    {
                     before(grammarAccess.getTypeAccess().getUCharTypeParserRuleCall_24()); 
                    pushFollow(FOLLOW_ruleUCharType_in_rule__Type__Alternatives4613);
                    ruleUCharType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getUCharTypeParserRuleCall_24()); 

                    }


                    }
                    break;
                case 26 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2063:6: ( ruleLongArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2063:6: ( ruleLongArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2064:1: ruleLongArrayType
                    {
                     before(grammarAccess.getTypeAccess().getLongArrayTypeParserRuleCall_25()); 
                    pushFollow(FOLLOW_ruleLongArrayType_in_rule__Type__Alternatives4630);
                    ruleLongArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getLongArrayTypeParserRuleCall_25()); 

                    }


                    }
                    break;
                case 27 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2069:6: ( ruleULongArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2069:6: ( ruleULongArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2070:1: ruleULongArrayType
                    {
                     before(grammarAccess.getTypeAccess().getULongArrayTypeParserRuleCall_26()); 
                    pushFollow(FOLLOW_ruleULongArrayType_in_rule__Type__Alternatives4647);
                    ruleULongArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getULongArrayTypeParserRuleCall_26()); 

                    }


                    }
                    break;
                case 28 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2075:6: ( ruleDevIntType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2075:6: ( ruleDevIntType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2076:1: ruleDevIntType
                    {
                     before(grammarAccess.getTypeAccess().getDevIntTypeParserRuleCall_27()); 
                    pushFollow(FOLLOW_ruleDevIntType_in_rule__Type__Alternatives4664);
                    ruleDevIntType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getDevIntTypeParserRuleCall_27()); 

                    }


                    }
                    break;
                case 29 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2081:6: ( ruleEncodedType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2081:6: ( ruleEncodedType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2082:1: ruleEncodedType
                    {
                     before(grammarAccess.getTypeAccess().getEncodedTypeParserRuleCall_28()); 
                    pushFollow(FOLLOW_ruleEncodedType_in_rule__Type__Alternatives4681);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2094:1: rule__PogoSystem__Group__0 : ( ( rule__PogoSystem__ImportsAssignment_0 )* ) rule__PogoSystem__Group__1 ;
    public final void rule__PogoSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2098:1: ( ( ( rule__PogoSystem__ImportsAssignment_0 )* ) rule__PogoSystem__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2099:1: ( ( rule__PogoSystem__ImportsAssignment_0 )* ) rule__PogoSystem__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2099:1: ( ( rule__PogoSystem__ImportsAssignment_0 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2100:1: ( rule__PogoSystem__ImportsAssignment_0 )*
            {
             before(grammarAccess.getPogoSystemAccess().getImportsAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2101:1: ( rule__PogoSystem__ImportsAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2101:2: rule__PogoSystem__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__PogoSystem__ImportsAssignment_0_in_rule__PogoSystem__Group__04715);
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

            pushFollow(FOLLOW_rule__PogoSystem__Group__1_in_rule__PogoSystem__Group__04725);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2112:1: rule__PogoSystem__Group__1 : ( ( rule__PogoSystem__ClassesAssignment_1 )* ) ;
    public final void rule__PogoSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2116:1: ( ( ( rule__PogoSystem__ClassesAssignment_1 )* ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2117:1: ( ( rule__PogoSystem__ClassesAssignment_1 )* )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2117:1: ( ( rule__PogoSystem__ClassesAssignment_1 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2118:1: ( rule__PogoSystem__ClassesAssignment_1 )*
            {
             before(grammarAccess.getPogoSystemAccess().getClassesAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2119:1: ( rule__PogoSystem__ClassesAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2119:2: rule__PogoSystem__ClassesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__PogoSystem__ClassesAssignment_1_in_rule__PogoSystem__Group__14753);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2133:1: rule__Import__Group__0 : ( 'import' ) rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2137:1: ( ( 'import' ) rule__Import__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2138:1: ( 'import' ) rule__Import__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2138:1: ( 'import' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2139:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Import__Group__04793); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__04803);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2153:1: rule__Import__Group__1 : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2157:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2158:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2158:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2159:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2160:1: ( rule__Import__ImportURIAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2160:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__14831);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2174:1: rule__PogoDeviceClass__Group__0 : ( 'deviceclass' ) rule__PogoDeviceClass__Group__1 ;
    public final void rule__PogoDeviceClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2178:1: ( ( 'deviceclass' ) rule__PogoDeviceClass__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2179:1: ( 'deviceclass' ) rule__PogoDeviceClass__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2179:1: ( 'deviceclass' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2180:1: 'deviceclass'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getDeviceclassKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__PogoDeviceClass__Group__04870); 
             after(grammarAccess.getPogoDeviceClassAccess().getDeviceclassKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__1_in_rule__PogoDeviceClass__Group__04880);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2194:1: rule__PogoDeviceClass__Group__1 : ( ( rule__PogoDeviceClass__NameAssignment_1 ) ) rule__PogoDeviceClass__Group__2 ;
    public final void rule__PogoDeviceClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2198:1: ( ( ( rule__PogoDeviceClass__NameAssignment_1 ) ) rule__PogoDeviceClass__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2199:1: ( ( rule__PogoDeviceClass__NameAssignment_1 ) ) rule__PogoDeviceClass__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2199:1: ( ( rule__PogoDeviceClass__NameAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2200:1: ( rule__PogoDeviceClass__NameAssignment_1 )
            {
             before(grammarAccess.getPogoDeviceClassAccess().getNameAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2201:1: ( rule__PogoDeviceClass__NameAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2201:2: rule__PogoDeviceClass__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PogoDeviceClass__NameAssignment_1_in_rule__PogoDeviceClass__Group__14908);
            rule__PogoDeviceClass__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPogoDeviceClassAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__2_in_rule__PogoDeviceClass__Group__14917);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2212:1: rule__PogoDeviceClass__Group__2 : ( ( rule__PogoDeviceClass__IsAbstractAssignment_2 )? ) rule__PogoDeviceClass__Group__3 ;
    public final void rule__PogoDeviceClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2216:1: ( ( ( rule__PogoDeviceClass__IsAbstractAssignment_2 )? ) rule__PogoDeviceClass__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2217:1: ( ( rule__PogoDeviceClass__IsAbstractAssignment_2 )? ) rule__PogoDeviceClass__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2217:1: ( ( rule__PogoDeviceClass__IsAbstractAssignment_2 )? )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2218:1: ( rule__PogoDeviceClass__IsAbstractAssignment_2 )?
            {
             before(grammarAccess.getPogoDeviceClassAccess().getIsAbstractAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2219:1: ( rule__PogoDeviceClass__IsAbstractAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==73) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2219:2: rule__PogoDeviceClass__IsAbstractAssignment_2
                    {
                    pushFollow(FOLLOW_rule__PogoDeviceClass__IsAbstractAssignment_2_in_rule__PogoDeviceClass__Group__24945);
                    rule__PogoDeviceClass__IsAbstractAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPogoDeviceClassAccess().getIsAbstractAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__3_in_rule__PogoDeviceClass__Group__24955);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2230:1: rule__PogoDeviceClass__Group__3 : ( ( rule__PogoDeviceClass__Group_3__0 )? ) rule__PogoDeviceClass__Group__4 ;
    public final void rule__PogoDeviceClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2234:1: ( ( ( rule__PogoDeviceClass__Group_3__0 )? ) rule__PogoDeviceClass__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2235:1: ( ( rule__PogoDeviceClass__Group_3__0 )? ) rule__PogoDeviceClass__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2235:1: ( ( rule__PogoDeviceClass__Group_3__0 )? )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2236:1: ( rule__PogoDeviceClass__Group_3__0 )?
            {
             before(grammarAccess.getPogoDeviceClassAccess().getGroup_3()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2237:1: ( rule__PogoDeviceClass__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2237:2: rule__PogoDeviceClass__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PogoDeviceClass__Group_3__0_in_rule__PogoDeviceClass__Group__34983);
                    rule__PogoDeviceClass__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPogoDeviceClassAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__4_in_rule__PogoDeviceClass__Group__34993);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2248:1: rule__PogoDeviceClass__Group__4 : ( '{' ) rule__PogoDeviceClass__Group__5 ;
    public final void rule__PogoDeviceClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2252:1: ( ( '{' ) rule__PogoDeviceClass__Group__5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2253:1: ( '{' ) rule__PogoDeviceClass__Group__5
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2253:1: ( '{' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2254:1: '{'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__PogoDeviceClass__Group__45022); 
             after(grammarAccess.getPogoDeviceClassAccess().getLeftCurlyBracketKeyword_4()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__5_in_rule__PogoDeviceClass__Group__45032);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2268:1: rule__PogoDeviceClass__Group__5 : ( ( rule__PogoDeviceClass__InstituteAssignment_5 ) ) rule__PogoDeviceClass__Group__6 ;
    public final void rule__PogoDeviceClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2272:1: ( ( ( rule__PogoDeviceClass__InstituteAssignment_5 ) ) rule__PogoDeviceClass__Group__6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2273:1: ( ( rule__PogoDeviceClass__InstituteAssignment_5 ) ) rule__PogoDeviceClass__Group__6
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2273:1: ( ( rule__PogoDeviceClass__InstituteAssignment_5 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2274:1: ( rule__PogoDeviceClass__InstituteAssignment_5 )
            {
             before(grammarAccess.getPogoDeviceClassAccess().getInstituteAssignment_5()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2275:1: ( rule__PogoDeviceClass__InstituteAssignment_5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2275:2: rule__PogoDeviceClass__InstituteAssignment_5
            {
            pushFollow(FOLLOW_rule__PogoDeviceClass__InstituteAssignment_5_in_rule__PogoDeviceClass__Group__55060);
            rule__PogoDeviceClass__InstituteAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getPogoDeviceClassAccess().getInstituteAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__6_in_rule__PogoDeviceClass__Group__55069);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2286:1: rule__PogoDeviceClass__Group__6 : ( 'description:' ) rule__PogoDeviceClass__Group__7 ;
    public final void rule__PogoDeviceClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2290:1: ( ( 'description:' ) rule__PogoDeviceClass__Group__7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2291:1: ( 'description:' ) rule__PogoDeviceClass__Group__7
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2291:1: ( 'description:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2292:1: 'description:'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getDescriptionKeyword_6()); 
            match(input,28,FOLLOW_28_in_rule__PogoDeviceClass__Group__65098); 
             after(grammarAccess.getPogoDeviceClassAccess().getDescriptionKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__7_in_rule__PogoDeviceClass__Group__65108);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2306:1: rule__PogoDeviceClass__Group__7 : ( ( rule__PogoDeviceClass__DescriptionAssignment_7 ) ) rule__PogoDeviceClass__Group__8 ;
    public final void rule__PogoDeviceClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2310:1: ( ( ( rule__PogoDeviceClass__DescriptionAssignment_7 ) ) rule__PogoDeviceClass__Group__8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2311:1: ( ( rule__PogoDeviceClass__DescriptionAssignment_7 ) ) rule__PogoDeviceClass__Group__8
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2311:1: ( ( rule__PogoDeviceClass__DescriptionAssignment_7 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2312:1: ( rule__PogoDeviceClass__DescriptionAssignment_7 )
            {
             before(grammarAccess.getPogoDeviceClassAccess().getDescriptionAssignment_7()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2313:1: ( rule__PogoDeviceClass__DescriptionAssignment_7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2313:2: rule__PogoDeviceClass__DescriptionAssignment_7
            {
            pushFollow(FOLLOW_rule__PogoDeviceClass__DescriptionAssignment_7_in_rule__PogoDeviceClass__Group__75136);
            rule__PogoDeviceClass__DescriptionAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getPogoDeviceClassAccess().getDescriptionAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__8_in_rule__PogoDeviceClass__Group__75145);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2324:1: rule__PogoDeviceClass__Group__8 : ( 'classProperties:' ) rule__PogoDeviceClass__Group__9 ;
    public final void rule__PogoDeviceClass__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2328:1: ( ( 'classProperties:' ) rule__PogoDeviceClass__Group__9 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2329:1: ( 'classProperties:' ) rule__PogoDeviceClass__Group__9
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2329:1: ( 'classProperties:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2330:1: 'classProperties:'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getClassPropertiesKeyword_8()); 
            match(input,29,FOLLOW_29_in_rule__PogoDeviceClass__Group__85174); 
             after(grammarAccess.getPogoDeviceClassAccess().getClassPropertiesKeyword_8()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__9_in_rule__PogoDeviceClass__Group__85184);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2344:1: rule__PogoDeviceClass__Group__9 : ( ( rule__PogoDeviceClass__ClassPropertiesAssignment_9 )* ) rule__PogoDeviceClass__Group__10 ;
    public final void rule__PogoDeviceClass__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2348:1: ( ( ( rule__PogoDeviceClass__ClassPropertiesAssignment_9 )* ) rule__PogoDeviceClass__Group__10 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2349:1: ( ( rule__PogoDeviceClass__ClassPropertiesAssignment_9 )* ) rule__PogoDeviceClass__Group__10
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2349:1: ( ( rule__PogoDeviceClass__ClassPropertiesAssignment_9 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2350:1: ( rule__PogoDeviceClass__ClassPropertiesAssignment_9 )*
            {
             before(grammarAccess.getPogoDeviceClassAccess().getClassPropertiesAssignment_9()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2351:1: ( rule__PogoDeviceClass__ClassPropertiesAssignment_9 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2351:2: rule__PogoDeviceClass__ClassPropertiesAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__PogoDeviceClass__ClassPropertiesAssignment_9_in_rule__PogoDeviceClass__Group__95212);
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

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__10_in_rule__PogoDeviceClass__Group__95222);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2362:1: rule__PogoDeviceClass__Group__10 : ( 'deviceProperties:' ) rule__PogoDeviceClass__Group__11 ;
    public final void rule__PogoDeviceClass__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2366:1: ( ( 'deviceProperties:' ) rule__PogoDeviceClass__Group__11 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2367:1: ( 'deviceProperties:' ) rule__PogoDeviceClass__Group__11
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2367:1: ( 'deviceProperties:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2368:1: 'deviceProperties:'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getDevicePropertiesKeyword_10()); 
            match(input,30,FOLLOW_30_in_rule__PogoDeviceClass__Group__105251); 
             after(grammarAccess.getPogoDeviceClassAccess().getDevicePropertiesKeyword_10()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__11_in_rule__PogoDeviceClass__Group__105261);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2382:1: rule__PogoDeviceClass__Group__11 : ( ( rule__PogoDeviceClass__DevicePropertiesAssignment_11 )* ) rule__PogoDeviceClass__Group__12 ;
    public final void rule__PogoDeviceClass__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2386:1: ( ( ( rule__PogoDeviceClass__DevicePropertiesAssignment_11 )* ) rule__PogoDeviceClass__Group__12 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2387:1: ( ( rule__PogoDeviceClass__DevicePropertiesAssignment_11 )* ) rule__PogoDeviceClass__Group__12
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2387:1: ( ( rule__PogoDeviceClass__DevicePropertiesAssignment_11 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2388:1: ( rule__PogoDeviceClass__DevicePropertiesAssignment_11 )*
            {
             before(grammarAccess.getPogoDeviceClassAccess().getDevicePropertiesAssignment_11()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2389:1: ( rule__PogoDeviceClass__DevicePropertiesAssignment_11 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2389:2: rule__PogoDeviceClass__DevicePropertiesAssignment_11
            	    {
            	    pushFollow(FOLLOW_rule__PogoDeviceClass__DevicePropertiesAssignment_11_in_rule__PogoDeviceClass__Group__115289);
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

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__12_in_rule__PogoDeviceClass__Group__115299);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2400:1: rule__PogoDeviceClass__Group__12 : ( 'commands:' ) rule__PogoDeviceClass__Group__13 ;
    public final void rule__PogoDeviceClass__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2404:1: ( ( 'commands:' ) rule__PogoDeviceClass__Group__13 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2405:1: ( 'commands:' ) rule__PogoDeviceClass__Group__13
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2405:1: ( 'commands:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2406:1: 'commands:'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getCommandsKeyword_12()); 
            match(input,31,FOLLOW_31_in_rule__PogoDeviceClass__Group__125328); 
             after(grammarAccess.getPogoDeviceClassAccess().getCommandsKeyword_12()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__13_in_rule__PogoDeviceClass__Group__125338);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2420:1: rule__PogoDeviceClass__Group__13 : ( ( rule__PogoDeviceClass__CommandsAssignment_13 )* ) rule__PogoDeviceClass__Group__14 ;
    public final void rule__PogoDeviceClass__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2424:1: ( ( ( rule__PogoDeviceClass__CommandsAssignment_13 )* ) rule__PogoDeviceClass__Group__14 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2425:1: ( ( rule__PogoDeviceClass__CommandsAssignment_13 )* ) rule__PogoDeviceClass__Group__14
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2425:1: ( ( rule__PogoDeviceClass__CommandsAssignment_13 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2426:1: ( rule__PogoDeviceClass__CommandsAssignment_13 )*
            {
             before(grammarAccess.getPogoDeviceClassAccess().getCommandsAssignment_13()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2427:1: ( rule__PogoDeviceClass__CommandsAssignment_13 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2427:2: rule__PogoDeviceClass__CommandsAssignment_13
            	    {
            	    pushFollow(FOLLOW_rule__PogoDeviceClass__CommandsAssignment_13_in_rule__PogoDeviceClass__Group__135366);
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

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__14_in_rule__PogoDeviceClass__Group__135376);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2438:1: rule__PogoDeviceClass__Group__14 : ( 'attributes:' ) rule__PogoDeviceClass__Group__15 ;
    public final void rule__PogoDeviceClass__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2442:1: ( ( 'attributes:' ) rule__PogoDeviceClass__Group__15 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2443:1: ( 'attributes:' ) rule__PogoDeviceClass__Group__15
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2443:1: ( 'attributes:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2444:1: 'attributes:'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getAttributesKeyword_14()); 
            match(input,32,FOLLOW_32_in_rule__PogoDeviceClass__Group__145405); 
             after(grammarAccess.getPogoDeviceClassAccess().getAttributesKeyword_14()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__15_in_rule__PogoDeviceClass__Group__145415);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2458:1: rule__PogoDeviceClass__Group__15 : ( ( rule__PogoDeviceClass__AttributesAssignment_15 )* ) rule__PogoDeviceClass__Group__16 ;
    public final void rule__PogoDeviceClass__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2462:1: ( ( ( rule__PogoDeviceClass__AttributesAssignment_15 )* ) rule__PogoDeviceClass__Group__16 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2463:1: ( ( rule__PogoDeviceClass__AttributesAssignment_15 )* ) rule__PogoDeviceClass__Group__16
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2463:1: ( ( rule__PogoDeviceClass__AttributesAssignment_15 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2464:1: ( rule__PogoDeviceClass__AttributesAssignment_15 )*
            {
             before(grammarAccess.getPogoDeviceClassAccess().getAttributesAssignment_15()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2465:1: ( rule__PogoDeviceClass__AttributesAssignment_15 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2465:2: rule__PogoDeviceClass__AttributesAssignment_15
            	    {
            	    pushFollow(FOLLOW_rule__PogoDeviceClass__AttributesAssignment_15_in_rule__PogoDeviceClass__Group__155443);
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

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__16_in_rule__PogoDeviceClass__Group__155453);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2476:1: rule__PogoDeviceClass__Group__16 : ( 'states:' ) rule__PogoDeviceClass__Group__17 ;
    public final void rule__PogoDeviceClass__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2480:1: ( ( 'states:' ) rule__PogoDeviceClass__Group__17 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2481:1: ( 'states:' ) rule__PogoDeviceClass__Group__17
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2481:1: ( 'states:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2482:1: 'states:'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getStatesKeyword_16()); 
            match(input,33,FOLLOW_33_in_rule__PogoDeviceClass__Group__165482); 
             after(grammarAccess.getPogoDeviceClassAccess().getStatesKeyword_16()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__17_in_rule__PogoDeviceClass__Group__165492);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2496:1: rule__PogoDeviceClass__Group__17 : ( ( rule__PogoDeviceClass__StatesAssignment_17 )* ) rule__PogoDeviceClass__Group__18 ;
    public final void rule__PogoDeviceClass__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2500:1: ( ( ( rule__PogoDeviceClass__StatesAssignment_17 )* ) rule__PogoDeviceClass__Group__18 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2501:1: ( ( rule__PogoDeviceClass__StatesAssignment_17 )* ) rule__PogoDeviceClass__Group__18
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2501:1: ( ( rule__PogoDeviceClass__StatesAssignment_17 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2502:1: ( rule__PogoDeviceClass__StatesAssignment_17 )*
            {
             before(grammarAccess.getPogoDeviceClassAccess().getStatesAssignment_17()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2503:1: ( rule__PogoDeviceClass__StatesAssignment_17 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2503:2: rule__PogoDeviceClass__StatesAssignment_17
            	    {
            	    pushFollow(FOLLOW_rule__PogoDeviceClass__StatesAssignment_17_in_rule__PogoDeviceClass__Group__175520);
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

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__18_in_rule__PogoDeviceClass__Group__175530);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2514:1: rule__PogoDeviceClass__Group__18 : ( '}' ) ;
    public final void rule__PogoDeviceClass__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2518:1: ( ( '}' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2519:1: ( '}' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2519:1: ( '}' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2520:1: '}'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getRightCurlyBracketKeyword_18()); 
            match(input,34,FOLLOW_34_in_rule__PogoDeviceClass__Group__185559); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2571:1: rule__PogoDeviceClass__Group_3__0 : ( 'extends' ) rule__PogoDeviceClass__Group_3__1 ;
    public final void rule__PogoDeviceClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2575:1: ( ( 'extends' ) rule__PogoDeviceClass__Group_3__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2576:1: ( 'extends' ) rule__PogoDeviceClass__Group_3__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2576:1: ( 'extends' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2577:1: 'extends'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getExtendsKeyword_3_0()); 
            match(input,35,FOLLOW_35_in_rule__PogoDeviceClass__Group_3__05633); 
             after(grammarAccess.getPogoDeviceClassAccess().getExtendsKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group_3__1_in_rule__PogoDeviceClass__Group_3__05643);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2591:1: rule__PogoDeviceClass__Group_3__1 : ( ( rule__PogoDeviceClass__BaseClassAssignment_3_1 ) ) ;
    public final void rule__PogoDeviceClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2595:1: ( ( ( rule__PogoDeviceClass__BaseClassAssignment_3_1 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2596:1: ( ( rule__PogoDeviceClass__BaseClassAssignment_3_1 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2596:1: ( ( rule__PogoDeviceClass__BaseClassAssignment_3_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2597:1: ( rule__PogoDeviceClass__BaseClassAssignment_3_1 )
            {
             before(grammarAccess.getPogoDeviceClassAccess().getBaseClassAssignment_3_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2598:1: ( rule__PogoDeviceClass__BaseClassAssignment_3_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2598:2: rule__PogoDeviceClass__BaseClassAssignment_3_1
            {
            pushFollow(FOLLOW_rule__PogoDeviceClass__BaseClassAssignment_3_1_in_rule__PogoDeviceClass__Group_3__15671);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2612:1: rule__ClassDescription__Group__0 : ( ( rule__ClassDescription__DescriptionAssignment_0 ) ) rule__ClassDescription__Group__1 ;
    public final void rule__ClassDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2616:1: ( ( ( rule__ClassDescription__DescriptionAssignment_0 ) ) rule__ClassDescription__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2617:1: ( ( rule__ClassDescription__DescriptionAssignment_0 ) ) rule__ClassDescription__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2617:1: ( ( rule__ClassDescription__DescriptionAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2618:1: ( rule__ClassDescription__DescriptionAssignment_0 )
            {
             before(grammarAccess.getClassDescriptionAccess().getDescriptionAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2619:1: ( rule__ClassDescription__DescriptionAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2619:2: rule__ClassDescription__DescriptionAssignment_0
            {
            pushFollow(FOLLOW_rule__ClassDescription__DescriptionAssignment_0_in_rule__ClassDescription__Group__05709);
            rule__ClassDescription__DescriptionAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__1_in_rule__ClassDescription__Group__05718);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2630:1: rule__ClassDescription__Group__1 : ( ( rule__ClassDescription__TitleAssignment_1 ) ) rule__ClassDescription__Group__2 ;
    public final void rule__ClassDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2634:1: ( ( ( rule__ClassDescription__TitleAssignment_1 ) ) rule__ClassDescription__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2635:1: ( ( rule__ClassDescription__TitleAssignment_1 ) ) rule__ClassDescription__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2635:1: ( ( rule__ClassDescription__TitleAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2636:1: ( rule__ClassDescription__TitleAssignment_1 )
            {
             before(grammarAccess.getClassDescriptionAccess().getTitleAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2637:1: ( rule__ClassDescription__TitleAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2637:2: rule__ClassDescription__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__ClassDescription__TitleAssignment_1_in_rule__ClassDescription__Group__15746);
            rule__ClassDescription__TitleAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getTitleAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__2_in_rule__ClassDescription__Group__15755);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2648:1: rule__ClassDescription__Group__2 : ( ( rule__ClassDescription__SourcePathAssignment_2 ) ) rule__ClassDescription__Group__3 ;
    public final void rule__ClassDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2652:1: ( ( ( rule__ClassDescription__SourcePathAssignment_2 ) ) rule__ClassDescription__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2653:1: ( ( rule__ClassDescription__SourcePathAssignment_2 ) ) rule__ClassDescription__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2653:1: ( ( rule__ClassDescription__SourcePathAssignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2654:1: ( rule__ClassDescription__SourcePathAssignment_2 )
            {
             before(grammarAccess.getClassDescriptionAccess().getSourcePathAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2655:1: ( rule__ClassDescription__SourcePathAssignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2655:2: rule__ClassDescription__SourcePathAssignment_2
            {
            pushFollow(FOLLOW_rule__ClassDescription__SourcePathAssignment_2_in_rule__ClassDescription__Group__25783);
            rule__ClassDescription__SourcePathAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getSourcePathAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__3_in_rule__ClassDescription__Group__25792);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2666:1: rule__ClassDescription__Group__3 : ( 'inheritances:' ) rule__ClassDescription__Group__4 ;
    public final void rule__ClassDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2670:1: ( ( 'inheritances:' ) rule__ClassDescription__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2671:1: ( 'inheritances:' ) rule__ClassDescription__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2671:1: ( 'inheritances:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2672:1: 'inheritances:'
            {
             before(grammarAccess.getClassDescriptionAccess().getInheritancesKeyword_3()); 
            match(input,36,FOLLOW_36_in_rule__ClassDescription__Group__35821); 
             after(grammarAccess.getClassDescriptionAccess().getInheritancesKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__4_in_rule__ClassDescription__Group__35831);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2686:1: rule__ClassDescription__Group__4 : ( ( rule__ClassDescription__InheritancesAssignment_4 )* ) rule__ClassDescription__Group__5 ;
    public final void rule__ClassDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2690:1: ( ( ( rule__ClassDescription__InheritancesAssignment_4 )* ) rule__ClassDescription__Group__5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2691:1: ( ( rule__ClassDescription__InheritancesAssignment_4 )* ) rule__ClassDescription__Group__5
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2691:1: ( ( rule__ClassDescription__InheritancesAssignment_4 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2692:1: ( rule__ClassDescription__InheritancesAssignment_4 )*
            {
             before(grammarAccess.getClassDescriptionAccess().getInheritancesAssignment_4()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2693:1: ( rule__ClassDescription__InheritancesAssignment_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_STRING) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2693:2: rule__ClassDescription__InheritancesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__ClassDescription__InheritancesAssignment_4_in_rule__ClassDescription__Group__45859);
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

            pushFollow(FOLLOW_rule__ClassDescription__Group__5_in_rule__ClassDescription__Group__45869);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2704:1: rule__ClassDescription__Group__5 : ( ( rule__ClassDescription__LanguageAssignment_5 ) ) rule__ClassDescription__Group__6 ;
    public final void rule__ClassDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2708:1: ( ( ( rule__ClassDescription__LanguageAssignment_5 ) ) rule__ClassDescription__Group__6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2709:1: ( ( rule__ClassDescription__LanguageAssignment_5 ) ) rule__ClassDescription__Group__6
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2709:1: ( ( rule__ClassDescription__LanguageAssignment_5 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2710:1: ( rule__ClassDescription__LanguageAssignment_5 )
            {
             before(grammarAccess.getClassDescriptionAccess().getLanguageAssignment_5()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2711:1: ( rule__ClassDescription__LanguageAssignment_5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2711:2: rule__ClassDescription__LanguageAssignment_5
            {
            pushFollow(FOLLOW_rule__ClassDescription__LanguageAssignment_5_in_rule__ClassDescription__Group__55897);
            rule__ClassDescription__LanguageAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getLanguageAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__6_in_rule__ClassDescription__Group__55906);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2722:1: rule__ClassDescription__Group__6 : ( ( rule__ClassDescription__FilestogenerateAssignment_6 ) ) rule__ClassDescription__Group__7 ;
    public final void rule__ClassDescription__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2726:1: ( ( ( rule__ClassDescription__FilestogenerateAssignment_6 ) ) rule__ClassDescription__Group__7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2727:1: ( ( rule__ClassDescription__FilestogenerateAssignment_6 ) ) rule__ClassDescription__Group__7
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2727:1: ( ( rule__ClassDescription__FilestogenerateAssignment_6 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2728:1: ( rule__ClassDescription__FilestogenerateAssignment_6 )
            {
             before(grammarAccess.getClassDescriptionAccess().getFilestogenerateAssignment_6()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2729:1: ( rule__ClassDescription__FilestogenerateAssignment_6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2729:2: rule__ClassDescription__FilestogenerateAssignment_6
            {
            pushFollow(FOLLOW_rule__ClassDescription__FilestogenerateAssignment_6_in_rule__ClassDescription__Group__65934);
            rule__ClassDescription__FilestogenerateAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getFilestogenerateAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__7_in_rule__ClassDescription__Group__65943);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2740:1: rule__ClassDescription__Group__7 : ( ( rule__ClassDescription__IdentificationAssignment_7 ) ) rule__ClassDescription__Group__8 ;
    public final void rule__ClassDescription__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2744:1: ( ( ( rule__ClassDescription__IdentificationAssignment_7 ) ) rule__ClassDescription__Group__8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2745:1: ( ( rule__ClassDescription__IdentificationAssignment_7 ) ) rule__ClassDescription__Group__8
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2745:1: ( ( rule__ClassDescription__IdentificationAssignment_7 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2746:1: ( rule__ClassDescription__IdentificationAssignment_7 )
            {
             before(grammarAccess.getClassDescriptionAccess().getIdentificationAssignment_7()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2747:1: ( rule__ClassDescription__IdentificationAssignment_7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2747:2: rule__ClassDescription__IdentificationAssignment_7
            {
            pushFollow(FOLLOW_rule__ClassDescription__IdentificationAssignment_7_in_rule__ClassDescription__Group__75971);
            rule__ClassDescription__IdentificationAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getIdentificationAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__8_in_rule__ClassDescription__Group__75980);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2758:1: rule__ClassDescription__Group__8 : ( ( rule__ClassDescription__CommentsAssignment_8 ) ) ;
    public final void rule__ClassDescription__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2762:1: ( ( ( rule__ClassDescription__CommentsAssignment_8 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2763:1: ( ( rule__ClassDescription__CommentsAssignment_8 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2763:1: ( ( rule__ClassDescription__CommentsAssignment_8 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2764:1: ( rule__ClassDescription__CommentsAssignment_8 )
            {
             before(grammarAccess.getClassDescriptionAccess().getCommentsAssignment_8()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2765:1: ( rule__ClassDescription__CommentsAssignment_8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2765:2: rule__ClassDescription__CommentsAssignment_8
            {
            pushFollow(FOLLOW_rule__ClassDescription__CommentsAssignment_8_in_rule__ClassDescription__Group__86008);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2793:1: rule__Inheritance__Group__0 : ( ( rule__Inheritance__ClassnameAssignment_0 ) ) rule__Inheritance__Group__1 ;
    public final void rule__Inheritance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2797:1: ( ( ( rule__Inheritance__ClassnameAssignment_0 ) ) rule__Inheritance__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2798:1: ( ( rule__Inheritance__ClassnameAssignment_0 ) ) rule__Inheritance__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2798:1: ( ( rule__Inheritance__ClassnameAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2799:1: ( rule__Inheritance__ClassnameAssignment_0 )
            {
             before(grammarAccess.getInheritanceAccess().getClassnameAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2800:1: ( rule__Inheritance__ClassnameAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2800:2: rule__Inheritance__ClassnameAssignment_0
            {
            pushFollow(FOLLOW_rule__Inheritance__ClassnameAssignment_0_in_rule__Inheritance__Group__06060);
            rule__Inheritance__ClassnameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getInheritanceAccess().getClassnameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Inheritance__Group__1_in_rule__Inheritance__Group__06069);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2811:1: rule__Inheritance__Group__1 : ( ( rule__Inheritance__SourcePathAssignment_1 ) ) ;
    public final void rule__Inheritance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2815:1: ( ( ( rule__Inheritance__SourcePathAssignment_1 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2816:1: ( ( rule__Inheritance__SourcePathAssignment_1 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2816:1: ( ( rule__Inheritance__SourcePathAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2817:1: ( rule__Inheritance__SourcePathAssignment_1 )
            {
             before(grammarAccess.getInheritanceAccess().getSourcePathAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2818:1: ( rule__Inheritance__SourcePathAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2818:2: rule__Inheritance__SourcePathAssignment_1
            {
            pushFollow(FOLLOW_rule__Inheritance__SourcePathAssignment_1_in_rule__Inheritance__Group__16097);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2832:1: rule__ClassIdentification__Group__0 : ( ( rule__ClassIdentification__ContactAssignment_0 ) ) rule__ClassIdentification__Group__1 ;
    public final void rule__ClassIdentification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2836:1: ( ( ( rule__ClassIdentification__ContactAssignment_0 ) ) rule__ClassIdentification__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2837:1: ( ( rule__ClassIdentification__ContactAssignment_0 ) ) rule__ClassIdentification__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2837:1: ( ( rule__ClassIdentification__ContactAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2838:1: ( rule__ClassIdentification__ContactAssignment_0 )
            {
             before(grammarAccess.getClassIdentificationAccess().getContactAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2839:1: ( rule__ClassIdentification__ContactAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2839:2: rule__ClassIdentification__ContactAssignment_0
            {
            pushFollow(FOLLOW_rule__ClassIdentification__ContactAssignment_0_in_rule__ClassIdentification__Group__06135);
            rule__ClassIdentification__ContactAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getClassIdentificationAccess().getContactAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ClassIdentification__Group__1_in_rule__ClassIdentification__Group__06144);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2850:1: rule__ClassIdentification__Group__1 : ( ( rule__ClassIdentification__ClassFamilyAssignment_1 ) ) rule__ClassIdentification__Group__2 ;
    public final void rule__ClassIdentification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2854:1: ( ( ( rule__ClassIdentification__ClassFamilyAssignment_1 ) ) rule__ClassIdentification__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2855:1: ( ( rule__ClassIdentification__ClassFamilyAssignment_1 ) ) rule__ClassIdentification__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2855:1: ( ( rule__ClassIdentification__ClassFamilyAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2856:1: ( rule__ClassIdentification__ClassFamilyAssignment_1 )
            {
             before(grammarAccess.getClassIdentificationAccess().getClassFamilyAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2857:1: ( rule__ClassIdentification__ClassFamilyAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2857:2: rule__ClassIdentification__ClassFamilyAssignment_1
            {
            pushFollow(FOLLOW_rule__ClassIdentification__ClassFamilyAssignment_1_in_rule__ClassIdentification__Group__16172);
            rule__ClassIdentification__ClassFamilyAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getClassIdentificationAccess().getClassFamilyAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__ClassIdentification__Group__2_in_rule__ClassIdentification__Group__16181);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2868:1: rule__ClassIdentification__Group__2 : ( ( rule__ClassIdentification__SiteSpecificAssignment_2 ) ) rule__ClassIdentification__Group__3 ;
    public final void rule__ClassIdentification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2872:1: ( ( ( rule__ClassIdentification__SiteSpecificAssignment_2 ) ) rule__ClassIdentification__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2873:1: ( ( rule__ClassIdentification__SiteSpecificAssignment_2 ) ) rule__ClassIdentification__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2873:1: ( ( rule__ClassIdentification__SiteSpecificAssignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2874:1: ( rule__ClassIdentification__SiteSpecificAssignment_2 )
            {
             before(grammarAccess.getClassIdentificationAccess().getSiteSpecificAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2875:1: ( rule__ClassIdentification__SiteSpecificAssignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2875:2: rule__ClassIdentification__SiteSpecificAssignment_2
            {
            pushFollow(FOLLOW_rule__ClassIdentification__SiteSpecificAssignment_2_in_rule__ClassIdentification__Group__26209);
            rule__ClassIdentification__SiteSpecificAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getClassIdentificationAccess().getSiteSpecificAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__ClassIdentification__Group__3_in_rule__ClassIdentification__Group__26218);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2886:1: rule__ClassIdentification__Group__3 : ( ( rule__ClassIdentification__PlatformAssignment_3 ) ) rule__ClassIdentification__Group__4 ;
    public final void rule__ClassIdentification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2890:1: ( ( ( rule__ClassIdentification__PlatformAssignment_3 ) ) rule__ClassIdentification__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2891:1: ( ( rule__ClassIdentification__PlatformAssignment_3 ) ) rule__ClassIdentification__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2891:1: ( ( rule__ClassIdentification__PlatformAssignment_3 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2892:1: ( rule__ClassIdentification__PlatformAssignment_3 )
            {
             before(grammarAccess.getClassIdentificationAccess().getPlatformAssignment_3()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2893:1: ( rule__ClassIdentification__PlatformAssignment_3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2893:2: rule__ClassIdentification__PlatformAssignment_3
            {
            pushFollow(FOLLOW_rule__ClassIdentification__PlatformAssignment_3_in_rule__ClassIdentification__Group__36246);
            rule__ClassIdentification__PlatformAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getClassIdentificationAccess().getPlatformAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__ClassIdentification__Group__4_in_rule__ClassIdentification__Group__36255);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2904:1: rule__ClassIdentification__Group__4 : ( ( rule__ClassIdentification__BusAssignment_4 ) ) rule__ClassIdentification__Group__5 ;
    public final void rule__ClassIdentification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2908:1: ( ( ( rule__ClassIdentification__BusAssignment_4 ) ) rule__ClassIdentification__Group__5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2909:1: ( ( rule__ClassIdentification__BusAssignment_4 ) ) rule__ClassIdentification__Group__5
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2909:1: ( ( rule__ClassIdentification__BusAssignment_4 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2910:1: ( rule__ClassIdentification__BusAssignment_4 )
            {
             before(grammarAccess.getClassIdentificationAccess().getBusAssignment_4()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2911:1: ( rule__ClassIdentification__BusAssignment_4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2911:2: rule__ClassIdentification__BusAssignment_4
            {
            pushFollow(FOLLOW_rule__ClassIdentification__BusAssignment_4_in_rule__ClassIdentification__Group__46283);
            rule__ClassIdentification__BusAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getClassIdentificationAccess().getBusAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__ClassIdentification__Group__5_in_rule__ClassIdentification__Group__46292);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2922:1: rule__ClassIdentification__Group__5 : ( ( rule__ClassIdentification__ManufacturerAssignment_5 ) ) rule__ClassIdentification__Group__6 ;
    public final void rule__ClassIdentification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2926:1: ( ( ( rule__ClassIdentification__ManufacturerAssignment_5 ) ) rule__ClassIdentification__Group__6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2927:1: ( ( rule__ClassIdentification__ManufacturerAssignment_5 ) ) rule__ClassIdentification__Group__6
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2927:1: ( ( rule__ClassIdentification__ManufacturerAssignment_5 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2928:1: ( rule__ClassIdentification__ManufacturerAssignment_5 )
            {
             before(grammarAccess.getClassIdentificationAccess().getManufacturerAssignment_5()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2929:1: ( rule__ClassIdentification__ManufacturerAssignment_5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2929:2: rule__ClassIdentification__ManufacturerAssignment_5
            {
            pushFollow(FOLLOW_rule__ClassIdentification__ManufacturerAssignment_5_in_rule__ClassIdentification__Group__56320);
            rule__ClassIdentification__ManufacturerAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getClassIdentificationAccess().getManufacturerAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__ClassIdentification__Group__6_in_rule__ClassIdentification__Group__56329);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2940:1: rule__ClassIdentification__Group__6 : ( ( rule__ClassIdentification__ReferenceAssignment_6 ) ) ;
    public final void rule__ClassIdentification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2944:1: ( ( ( rule__ClassIdentification__ReferenceAssignment_6 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2945:1: ( ( rule__ClassIdentification__ReferenceAssignment_6 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2945:1: ( ( rule__ClassIdentification__ReferenceAssignment_6 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2946:1: ( rule__ClassIdentification__ReferenceAssignment_6 )
            {
             before(grammarAccess.getClassIdentificationAccess().getReferenceAssignment_6()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2947:1: ( rule__ClassIdentification__ReferenceAssignment_6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2947:2: rule__ClassIdentification__ReferenceAssignment_6
            {
            pushFollow(FOLLOW_rule__ClassIdentification__ReferenceAssignment_6_in_rule__ClassIdentification__Group__66357);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2971:1: rule__State__Group__0 : ( ( rule__State__NameAssignment_0 ) ) rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2975:1: ( ( ( rule__State__NameAssignment_0 ) ) rule__State__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2976:1: ( ( rule__State__NameAssignment_0 ) ) rule__State__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2976:1: ( ( rule__State__NameAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2977:1: ( rule__State__NameAssignment_0 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2978:1: ( rule__State__NameAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2978:2: rule__State__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_0_in_rule__State__Group__06405);
            rule__State__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__06414);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2989:1: rule__State__Group__1 : ( ( rule__State__DescriptionAssignment_1 ) ) ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2993:1: ( ( ( rule__State__DescriptionAssignment_1 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2994:1: ( ( rule__State__DescriptionAssignment_1 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2994:1: ( ( rule__State__DescriptionAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2995:1: ( rule__State__DescriptionAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getDescriptionAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2996:1: ( rule__State__DescriptionAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2996:2: rule__State__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__State__DescriptionAssignment_1_in_rule__State__Group__16442);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3010:1: rule__Property__Group__0 : ( ( rule__Property__NameAssignment_0 ) ) rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3014:1: ( ( ( rule__Property__NameAssignment_0 ) ) rule__Property__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3015:1: ( ( rule__Property__NameAssignment_0 ) ) rule__Property__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3015:1: ( ( rule__Property__NameAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3016:1: ( rule__Property__NameAssignment_0 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3017:1: ( rule__Property__NameAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3017:2: rule__Property__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Property__NameAssignment_0_in_rule__Property__Group__06480);
            rule__Property__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__06489);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3028:1: rule__Property__Group__1 : ( ( rule__Property__TypeAssignment_1 ) ) rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3032:1: ( ( ( rule__Property__TypeAssignment_1 ) ) rule__Property__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3033:1: ( ( rule__Property__TypeAssignment_1 ) ) rule__Property__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3033:1: ( ( rule__Property__TypeAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3034:1: ( rule__Property__TypeAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3035:1: ( rule__Property__TypeAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3035:2: rule__Property__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Property__TypeAssignment_1_in_rule__Property__Group__16517);
            rule__Property__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__16526);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3046:1: rule__Property__Group__2 : ( ( rule__Property__StatusAssignment_2 ) ) rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3050:1: ( ( ( rule__Property__StatusAssignment_2 ) ) rule__Property__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3051:1: ( ( rule__Property__StatusAssignment_2 ) ) rule__Property__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3051:1: ( ( rule__Property__StatusAssignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3052:1: ( rule__Property__StatusAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getStatusAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3053:1: ( rule__Property__StatusAssignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3053:2: rule__Property__StatusAssignment_2
            {
            pushFollow(FOLLOW_rule__Property__StatusAssignment_2_in_rule__Property__Group__26554);
            rule__Property__StatusAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getStatusAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__3_in_rule__Property__Group__26563);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3064:1: rule__Property__Group__3 : ( ( rule__Property__DescriptionAssignment_3 ) ) rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3068:1: ( ( ( rule__Property__DescriptionAssignment_3 ) ) rule__Property__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3069:1: ( ( rule__Property__DescriptionAssignment_3 ) ) rule__Property__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3069:1: ( ( rule__Property__DescriptionAssignment_3 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3070:1: ( rule__Property__DescriptionAssignment_3 )
            {
             before(grammarAccess.getPropertyAccess().getDescriptionAssignment_3()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3071:1: ( rule__Property__DescriptionAssignment_3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3071:2: rule__Property__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_rule__Property__DescriptionAssignment_3_in_rule__Property__Group__36591);
            rule__Property__DescriptionAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getDescriptionAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__4_in_rule__Property__Group__36600);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3082:1: rule__Property__Group__4 : ( 'defaultPropValue:' ) rule__Property__Group__5 ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3086:1: ( ( 'defaultPropValue:' ) rule__Property__Group__5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3087:1: ( 'defaultPropValue:' ) rule__Property__Group__5
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3087:1: ( 'defaultPropValue:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3088:1: 'defaultPropValue:'
            {
             before(grammarAccess.getPropertyAccess().getDefaultPropValueKeyword_4()); 
            match(input,37,FOLLOW_37_in_rule__Property__Group__46629); 
             after(grammarAccess.getPropertyAccess().getDefaultPropValueKeyword_4()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__5_in_rule__Property__Group__46639);
            rule__Property__Group__5();
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
    // $ANTLR end rule__Property__Group__4


    // $ANTLR start rule__Property__Group__5
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3102:1: rule__Property__Group__5 : ( ( rule__Property__DefaultPropValueAssignment_5 )* ) ;
    public final void rule__Property__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3106:1: ( ( ( rule__Property__DefaultPropValueAssignment_5 )* ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3107:1: ( ( rule__Property__DefaultPropValueAssignment_5 )* )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3107:1: ( ( rule__Property__DefaultPropValueAssignment_5 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3108:1: ( rule__Property__DefaultPropValueAssignment_5 )*
            {
             before(grammarAccess.getPropertyAccess().getDefaultPropValueAssignment_5()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3109:1: ( rule__Property__DefaultPropValueAssignment_5 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_STRING) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3109:2: rule__Property__DefaultPropValueAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Property__DefaultPropValueAssignment_5_in_rule__Property__Group__56667);
            	    rule__Property__DefaultPropValueAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getPropertyAccess().getDefaultPropValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__5


    // $ANTLR start rule__InheritanceStatus__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3131:1: rule__InheritanceStatus__Group__0 : ( ( rule__InheritanceStatus__AbstractAssignment_0 ) ) rule__InheritanceStatus__Group__1 ;
    public final void rule__InheritanceStatus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3135:1: ( ( ( rule__InheritanceStatus__AbstractAssignment_0 ) ) rule__InheritanceStatus__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3136:1: ( ( rule__InheritanceStatus__AbstractAssignment_0 ) ) rule__InheritanceStatus__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3136:1: ( ( rule__InheritanceStatus__AbstractAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3137:1: ( rule__InheritanceStatus__AbstractAssignment_0 )
            {
             before(grammarAccess.getInheritanceStatusAccess().getAbstractAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3138:1: ( rule__InheritanceStatus__AbstractAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3138:2: rule__InheritanceStatus__AbstractAssignment_0
            {
            pushFollow(FOLLOW_rule__InheritanceStatus__AbstractAssignment_0_in_rule__InheritanceStatus__Group__06714);
            rule__InheritanceStatus__AbstractAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getInheritanceStatusAccess().getAbstractAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__InheritanceStatus__Group__1_in_rule__InheritanceStatus__Group__06723);
            rule__InheritanceStatus__Group__1();
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
    // $ANTLR end rule__InheritanceStatus__Group__0


    // $ANTLR start rule__InheritanceStatus__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3149:1: rule__InheritanceStatus__Group__1 : ( ( rule__InheritanceStatus__InheritedAssignment_1 ) ) rule__InheritanceStatus__Group__2 ;
    public final void rule__InheritanceStatus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3153:1: ( ( ( rule__InheritanceStatus__InheritedAssignment_1 ) ) rule__InheritanceStatus__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3154:1: ( ( rule__InheritanceStatus__InheritedAssignment_1 ) ) rule__InheritanceStatus__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3154:1: ( ( rule__InheritanceStatus__InheritedAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3155:1: ( rule__InheritanceStatus__InheritedAssignment_1 )
            {
             before(grammarAccess.getInheritanceStatusAccess().getInheritedAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3156:1: ( rule__InheritanceStatus__InheritedAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3156:2: rule__InheritanceStatus__InheritedAssignment_1
            {
            pushFollow(FOLLOW_rule__InheritanceStatus__InheritedAssignment_1_in_rule__InheritanceStatus__Group__16751);
            rule__InheritanceStatus__InheritedAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getInheritanceStatusAccess().getInheritedAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__InheritanceStatus__Group__2_in_rule__InheritanceStatus__Group__16760);
            rule__InheritanceStatus__Group__2();
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
    // $ANTLR end rule__InheritanceStatus__Group__1


    // $ANTLR start rule__InheritanceStatus__Group__2
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3167:1: rule__InheritanceStatus__Group__2 : ( ( rule__InheritanceStatus__ConcreteAssignment_2 ) ) rule__InheritanceStatus__Group__3 ;
    public final void rule__InheritanceStatus__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3171:1: ( ( ( rule__InheritanceStatus__ConcreteAssignment_2 ) ) rule__InheritanceStatus__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3172:1: ( ( rule__InheritanceStatus__ConcreteAssignment_2 ) ) rule__InheritanceStatus__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3172:1: ( ( rule__InheritanceStatus__ConcreteAssignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3173:1: ( rule__InheritanceStatus__ConcreteAssignment_2 )
            {
             before(grammarAccess.getInheritanceStatusAccess().getConcreteAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3174:1: ( rule__InheritanceStatus__ConcreteAssignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3174:2: rule__InheritanceStatus__ConcreteAssignment_2
            {
            pushFollow(FOLLOW_rule__InheritanceStatus__ConcreteAssignment_2_in_rule__InheritanceStatus__Group__26788);
            rule__InheritanceStatus__ConcreteAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getInheritanceStatusAccess().getConcreteAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__InheritanceStatus__Group__3_in_rule__InheritanceStatus__Group__26797);
            rule__InheritanceStatus__Group__3();
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
    // $ANTLR end rule__InheritanceStatus__Group__2


    // $ANTLR start rule__InheritanceStatus__Group__3
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3185:1: rule__InheritanceStatus__Group__3 : ( ( rule__InheritanceStatus__ConcreteHereAssignment_3 ) ) rule__InheritanceStatus__Group__4 ;
    public final void rule__InheritanceStatus__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3189:1: ( ( ( rule__InheritanceStatus__ConcreteHereAssignment_3 ) ) rule__InheritanceStatus__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3190:1: ( ( rule__InheritanceStatus__ConcreteHereAssignment_3 ) ) rule__InheritanceStatus__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3190:1: ( ( rule__InheritanceStatus__ConcreteHereAssignment_3 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3191:1: ( rule__InheritanceStatus__ConcreteHereAssignment_3 )
            {
             before(grammarAccess.getInheritanceStatusAccess().getConcreteHereAssignment_3()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3192:1: ( rule__InheritanceStatus__ConcreteHereAssignment_3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3192:2: rule__InheritanceStatus__ConcreteHereAssignment_3
            {
            pushFollow(FOLLOW_rule__InheritanceStatus__ConcreteHereAssignment_3_in_rule__InheritanceStatus__Group__36825);
            rule__InheritanceStatus__ConcreteHereAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getInheritanceStatusAccess().getConcreteHereAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__InheritanceStatus__Group__4_in_rule__InheritanceStatus__Group__36834);
            rule__InheritanceStatus__Group__4();
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
    // $ANTLR end rule__InheritanceStatus__Group__3


    // $ANTLR start rule__InheritanceStatus__Group__4
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3203:1: rule__InheritanceStatus__Group__4 : ( ( rule__InheritanceStatus__HasChangedAssignment_4 ) ) ;
    public final void rule__InheritanceStatus__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3207:1: ( ( ( rule__InheritanceStatus__HasChangedAssignment_4 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3208:1: ( ( rule__InheritanceStatus__HasChangedAssignment_4 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3208:1: ( ( rule__InheritanceStatus__HasChangedAssignment_4 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3209:1: ( rule__InheritanceStatus__HasChangedAssignment_4 )
            {
             before(grammarAccess.getInheritanceStatusAccess().getHasChangedAssignment_4()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3210:1: ( rule__InheritanceStatus__HasChangedAssignment_4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3210:2: rule__InheritanceStatus__HasChangedAssignment_4
            {
            pushFollow(FOLLOW_rule__InheritanceStatus__HasChangedAssignment_4_in_rule__InheritanceStatus__Group__46862);
            rule__InheritanceStatus__HasChangedAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getInheritanceStatusAccess().getHasChangedAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InheritanceStatus__Group__4


    // $ANTLR start rule__Command__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3230:1: rule__Command__Group__0 : ( ( rule__Command__NameAssignment_0 ) ) rule__Command__Group__1 ;
    public final void rule__Command__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3234:1: ( ( ( rule__Command__NameAssignment_0 ) ) rule__Command__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3235:1: ( ( rule__Command__NameAssignment_0 ) ) rule__Command__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3235:1: ( ( rule__Command__NameAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3236:1: ( rule__Command__NameAssignment_0 )
            {
             before(grammarAccess.getCommandAccess().getNameAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3237:1: ( rule__Command__NameAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3237:2: rule__Command__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Command__NameAssignment_0_in_rule__Command__Group__06906);
            rule__Command__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__1_in_rule__Command__Group__06915);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3248:1: rule__Command__Group__1 : ( ( rule__Command__ArginAssignment_1 ) ) rule__Command__Group__2 ;
    public final void rule__Command__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3252:1: ( ( ( rule__Command__ArginAssignment_1 ) ) rule__Command__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3253:1: ( ( rule__Command__ArginAssignment_1 ) ) rule__Command__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3253:1: ( ( rule__Command__ArginAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3254:1: ( rule__Command__ArginAssignment_1 )
            {
             before(grammarAccess.getCommandAccess().getArginAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3255:1: ( rule__Command__ArginAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3255:2: rule__Command__ArginAssignment_1
            {
            pushFollow(FOLLOW_rule__Command__ArginAssignment_1_in_rule__Command__Group__16943);
            rule__Command__ArginAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getArginAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__2_in_rule__Command__Group__16952);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3266:1: rule__Command__Group__2 : ( ( rule__Command__ArgoutAssignment_2 ) ) rule__Command__Group__3 ;
    public final void rule__Command__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3270:1: ( ( ( rule__Command__ArgoutAssignment_2 ) ) rule__Command__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3271:1: ( ( rule__Command__ArgoutAssignment_2 ) ) rule__Command__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3271:1: ( ( rule__Command__ArgoutAssignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3272:1: ( rule__Command__ArgoutAssignment_2 )
            {
             before(grammarAccess.getCommandAccess().getArgoutAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3273:1: ( rule__Command__ArgoutAssignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3273:2: rule__Command__ArgoutAssignment_2
            {
            pushFollow(FOLLOW_rule__Command__ArgoutAssignment_2_in_rule__Command__Group__26980);
            rule__Command__ArgoutAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getArgoutAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__3_in_rule__Command__Group__26989);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3284:1: rule__Command__Group__3 : ( ( rule__Command__DescriptionAssignment_3 ) ) rule__Command__Group__4 ;
    public final void rule__Command__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3288:1: ( ( ( rule__Command__DescriptionAssignment_3 ) ) rule__Command__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3289:1: ( ( rule__Command__DescriptionAssignment_3 ) ) rule__Command__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3289:1: ( ( rule__Command__DescriptionAssignment_3 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3290:1: ( rule__Command__DescriptionAssignment_3 )
            {
             before(grammarAccess.getCommandAccess().getDescriptionAssignment_3()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3291:1: ( rule__Command__DescriptionAssignment_3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3291:2: rule__Command__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_rule__Command__DescriptionAssignment_3_in_rule__Command__Group__37017);
            rule__Command__DescriptionAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getDescriptionAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__4_in_rule__Command__Group__37026);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3302:1: rule__Command__Group__4 : ( ( rule__Command__StatusAssignment_4 ) ) rule__Command__Group__5 ;
    public final void rule__Command__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3306:1: ( ( ( rule__Command__StatusAssignment_4 ) ) rule__Command__Group__5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3307:1: ( ( rule__Command__StatusAssignment_4 ) ) rule__Command__Group__5
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3307:1: ( ( rule__Command__StatusAssignment_4 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3308:1: ( rule__Command__StatusAssignment_4 )
            {
             before(grammarAccess.getCommandAccess().getStatusAssignment_4()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3309:1: ( rule__Command__StatusAssignment_4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3309:2: rule__Command__StatusAssignment_4
            {
            pushFollow(FOLLOW_rule__Command__StatusAssignment_4_in_rule__Command__Group__47054);
            rule__Command__StatusAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getStatusAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__5_in_rule__Command__Group__47063);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3320:1: rule__Command__Group__5 : ( ( rule__Command__ExecMethodAssignment_5 ) ) rule__Command__Group__6 ;
    public final void rule__Command__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3324:1: ( ( ( rule__Command__ExecMethodAssignment_5 ) ) rule__Command__Group__6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3325:1: ( ( rule__Command__ExecMethodAssignment_5 ) ) rule__Command__Group__6
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3325:1: ( ( rule__Command__ExecMethodAssignment_5 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3326:1: ( rule__Command__ExecMethodAssignment_5 )
            {
             before(grammarAccess.getCommandAccess().getExecMethodAssignment_5()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3327:1: ( rule__Command__ExecMethodAssignment_5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3327:2: rule__Command__ExecMethodAssignment_5
            {
            pushFollow(FOLLOW_rule__Command__ExecMethodAssignment_5_in_rule__Command__Group__57091);
            rule__Command__ExecMethodAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getExecMethodAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__6_in_rule__Command__Group__57100);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3338:1: rule__Command__Group__6 : ( ( rule__Command__DisplayLevelAssignment_6 ) ) rule__Command__Group__7 ;
    public final void rule__Command__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3342:1: ( ( ( rule__Command__DisplayLevelAssignment_6 ) ) rule__Command__Group__7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3343:1: ( ( rule__Command__DisplayLevelAssignment_6 ) ) rule__Command__Group__7
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3343:1: ( ( rule__Command__DisplayLevelAssignment_6 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3344:1: ( rule__Command__DisplayLevelAssignment_6 )
            {
             before(grammarAccess.getCommandAccess().getDisplayLevelAssignment_6()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3345:1: ( rule__Command__DisplayLevelAssignment_6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3345:2: rule__Command__DisplayLevelAssignment_6
            {
            pushFollow(FOLLOW_rule__Command__DisplayLevelAssignment_6_in_rule__Command__Group__67128);
            rule__Command__DisplayLevelAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getDisplayLevelAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__7_in_rule__Command__Group__67137);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3356:1: rule__Command__Group__7 : ( ( rule__Command__PolledPeriodAssignment_7 ) ) rule__Command__Group__8 ;
    public final void rule__Command__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3360:1: ( ( ( rule__Command__PolledPeriodAssignment_7 ) ) rule__Command__Group__8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3361:1: ( ( rule__Command__PolledPeriodAssignment_7 ) ) rule__Command__Group__8
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3361:1: ( ( rule__Command__PolledPeriodAssignment_7 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3362:1: ( rule__Command__PolledPeriodAssignment_7 )
            {
             before(grammarAccess.getCommandAccess().getPolledPeriodAssignment_7()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3363:1: ( rule__Command__PolledPeriodAssignment_7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3363:2: rule__Command__PolledPeriodAssignment_7
            {
            pushFollow(FOLLOW_rule__Command__PolledPeriodAssignment_7_in_rule__Command__Group__77165);
            rule__Command__PolledPeriodAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getPolledPeriodAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__8_in_rule__Command__Group__77174);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3374:1: rule__Command__Group__8 : ( 'excludedStates:' ) rule__Command__Group__9 ;
    public final void rule__Command__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3378:1: ( ( 'excludedStates:' ) rule__Command__Group__9 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3379:1: ( 'excludedStates:' ) rule__Command__Group__9
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3379:1: ( 'excludedStates:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3380:1: 'excludedStates:'
            {
             before(grammarAccess.getCommandAccess().getExcludedStatesKeyword_8()); 
            match(input,38,FOLLOW_38_in_rule__Command__Group__87203); 
             after(grammarAccess.getCommandAccess().getExcludedStatesKeyword_8()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__9_in_rule__Command__Group__87213);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3394:1: rule__Command__Group__9 : ( ( rule__Command__ExcludedStatesAssignment_9 )* ) ;
    public final void rule__Command__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3398:1: ( ( ( rule__Command__ExcludedStatesAssignment_9 )* ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3399:1: ( ( rule__Command__ExcludedStatesAssignment_9 )* )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3399:1: ( ( rule__Command__ExcludedStatesAssignment_9 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3400:1: ( rule__Command__ExcludedStatesAssignment_9 )*
            {
             before(grammarAccess.getCommandAccess().getExcludedStatesAssignment_9()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3401:1: ( rule__Command__ExcludedStatesAssignment_9 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STRING) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3401:2: rule__Command__ExcludedStatesAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__Command__ExcludedStatesAssignment_9_in_rule__Command__Group__97241);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3431:1: rule__Argument__Group__0 : ( ( rule__Argument__TypeAssignment_0 ) ) rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3435:1: ( ( ( rule__Argument__TypeAssignment_0 ) ) rule__Argument__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3436:1: ( ( rule__Argument__TypeAssignment_0 ) ) rule__Argument__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3436:1: ( ( rule__Argument__TypeAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3437:1: ( rule__Argument__TypeAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getTypeAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3438:1: ( rule__Argument__TypeAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3438:2: rule__Argument__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Argument__TypeAssignment_0_in_rule__Argument__Group__07296);
            rule__Argument__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getTypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__07305);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3449:1: rule__Argument__Group__1 : ( ( rule__Argument__DescriptionAssignment_1 ) ) ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3453:1: ( ( ( rule__Argument__DescriptionAssignment_1 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3454:1: ( ( rule__Argument__DescriptionAssignment_1 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3454:1: ( ( rule__Argument__DescriptionAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3455:1: ( rule__Argument__DescriptionAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getDescriptionAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3456:1: ( rule__Argument__DescriptionAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3456:2: rule__Argument__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__Argument__DescriptionAssignment_1_in_rule__Argument__Group__17333);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3470:1: rule__Attribute__Group__0 : ( ( rule__Attribute__NameAssignment_0 ) ) rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3474:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) rule__Attribute__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3475:1: ( ( rule__Attribute__NameAssignment_0 ) ) rule__Attribute__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3475:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3476:1: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3477:1: ( rule__Attribute__NameAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3477:2: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__07371);
            rule__Attribute__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__07380);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3488:1: rule__Attribute__Group__1 : ( ( rule__Attribute__AttTypeAssignment_1 ) ) rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3492:1: ( ( ( rule__Attribute__AttTypeAssignment_1 ) ) rule__Attribute__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3493:1: ( ( rule__Attribute__AttTypeAssignment_1 ) ) rule__Attribute__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3493:1: ( ( rule__Attribute__AttTypeAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3494:1: ( rule__Attribute__AttTypeAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getAttTypeAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3495:1: ( rule__Attribute__AttTypeAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3495:2: rule__Attribute__AttTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__AttTypeAssignment_1_in_rule__Attribute__Group__17408);
            rule__Attribute__AttTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAttTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__17417);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3506:1: rule__Attribute__Group__2 : ( ( rule__Attribute__DataTypeAssignment_2 ) ) rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3510:1: ( ( ( rule__Attribute__DataTypeAssignment_2 ) ) rule__Attribute__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3511:1: ( ( rule__Attribute__DataTypeAssignment_2 ) ) rule__Attribute__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3511:1: ( ( rule__Attribute__DataTypeAssignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3512:1: ( rule__Attribute__DataTypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getDataTypeAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3513:1: ( rule__Attribute__DataTypeAssignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3513:2: rule__Attribute__DataTypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__DataTypeAssignment_2_in_rule__Attribute__Group__27445);
            rule__Attribute__DataTypeAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getDataTypeAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__27454);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3524:1: rule__Attribute__Group__3 : ( ( rule__Attribute__RwTypeAssignment_3 ) ) rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3528:1: ( ( ( rule__Attribute__RwTypeAssignment_3 ) ) rule__Attribute__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3529:1: ( ( rule__Attribute__RwTypeAssignment_3 ) ) rule__Attribute__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3529:1: ( ( rule__Attribute__RwTypeAssignment_3 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3530:1: ( rule__Attribute__RwTypeAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getRwTypeAssignment_3()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3531:1: ( rule__Attribute__RwTypeAssignment_3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3531:2: rule__Attribute__RwTypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Attribute__RwTypeAssignment_3_in_rule__Attribute__Group__37482);
            rule__Attribute__RwTypeAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getRwTypeAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__37491);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3542:1: rule__Attribute__Group__4 : ( ( rule__Attribute__DisplayLevelAssignment_4 ) ) rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3546:1: ( ( ( rule__Attribute__DisplayLevelAssignment_4 ) ) rule__Attribute__Group__5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3547:1: ( ( rule__Attribute__DisplayLevelAssignment_4 ) ) rule__Attribute__Group__5
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3547:1: ( ( rule__Attribute__DisplayLevelAssignment_4 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3548:1: ( rule__Attribute__DisplayLevelAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getDisplayLevelAssignment_4()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3549:1: ( rule__Attribute__DisplayLevelAssignment_4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3549:2: rule__Attribute__DisplayLevelAssignment_4
            {
            pushFollow(FOLLOW_rule__Attribute__DisplayLevelAssignment_4_in_rule__Attribute__Group__47519);
            rule__Attribute__DisplayLevelAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getDisplayLevelAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__47528);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3560:1: rule__Attribute__Group__5 : ( ( rule__Attribute__PolledPeriodAssignment_5 ) ) rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3564:1: ( ( ( rule__Attribute__PolledPeriodAssignment_5 ) ) rule__Attribute__Group__6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3565:1: ( ( rule__Attribute__PolledPeriodAssignment_5 ) ) rule__Attribute__Group__6
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3565:1: ( ( rule__Attribute__PolledPeriodAssignment_5 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3566:1: ( rule__Attribute__PolledPeriodAssignment_5 )
            {
             before(grammarAccess.getAttributeAccess().getPolledPeriodAssignment_5()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3567:1: ( rule__Attribute__PolledPeriodAssignment_5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3567:2: rule__Attribute__PolledPeriodAssignment_5
            {
            pushFollow(FOLLOW_rule__Attribute__PolledPeriodAssignment_5_in_rule__Attribute__Group__57556);
            rule__Attribute__PolledPeriodAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getPolledPeriodAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__6_in_rule__Attribute__Group__57565);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3578:1: rule__Attribute__Group__6 : ( ( rule__Attribute__MaxXAssignment_6 ) ) rule__Attribute__Group__7 ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3582:1: ( ( ( rule__Attribute__MaxXAssignment_6 ) ) rule__Attribute__Group__7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3583:1: ( ( rule__Attribute__MaxXAssignment_6 ) ) rule__Attribute__Group__7
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3583:1: ( ( rule__Attribute__MaxXAssignment_6 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3584:1: ( rule__Attribute__MaxXAssignment_6 )
            {
             before(grammarAccess.getAttributeAccess().getMaxXAssignment_6()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3585:1: ( rule__Attribute__MaxXAssignment_6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3585:2: rule__Attribute__MaxXAssignment_6
            {
            pushFollow(FOLLOW_rule__Attribute__MaxXAssignment_6_in_rule__Attribute__Group__67593);
            rule__Attribute__MaxXAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getMaxXAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__7_in_rule__Attribute__Group__67602);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3596:1: rule__Attribute__Group__7 : ( ( rule__Attribute__MaxYAssignment_7 ) ) rule__Attribute__Group__8 ;
    public final void rule__Attribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3600:1: ( ( ( rule__Attribute__MaxYAssignment_7 ) ) rule__Attribute__Group__8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3601:1: ( ( rule__Attribute__MaxYAssignment_7 ) ) rule__Attribute__Group__8
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3601:1: ( ( rule__Attribute__MaxYAssignment_7 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3602:1: ( rule__Attribute__MaxYAssignment_7 )
            {
             before(grammarAccess.getAttributeAccess().getMaxYAssignment_7()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3603:1: ( rule__Attribute__MaxYAssignment_7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3603:2: rule__Attribute__MaxYAssignment_7
            {
            pushFollow(FOLLOW_rule__Attribute__MaxYAssignment_7_in_rule__Attribute__Group__77630);
            rule__Attribute__MaxYAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getMaxYAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__8_in_rule__Attribute__Group__77639);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3614:1: rule__Attribute__Group__8 : ( ( rule__Attribute__MemorizedAssignment_8 ) ) rule__Attribute__Group__9 ;
    public final void rule__Attribute__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3618:1: ( ( ( rule__Attribute__MemorizedAssignment_8 ) ) rule__Attribute__Group__9 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3619:1: ( ( rule__Attribute__MemorizedAssignment_8 ) ) rule__Attribute__Group__9
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3619:1: ( ( rule__Attribute__MemorizedAssignment_8 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3620:1: ( rule__Attribute__MemorizedAssignment_8 )
            {
             before(grammarAccess.getAttributeAccess().getMemorizedAssignment_8()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3621:1: ( rule__Attribute__MemorizedAssignment_8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3621:2: rule__Attribute__MemorizedAssignment_8
            {
            pushFollow(FOLLOW_rule__Attribute__MemorizedAssignment_8_in_rule__Attribute__Group__87667);
            rule__Attribute__MemorizedAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getMemorizedAssignment_8()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__9_in_rule__Attribute__Group__87676);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3632:1: rule__Attribute__Group__9 : ( ( rule__Attribute__MemorizedAtInitAssignment_9 ) ) rule__Attribute__Group__10 ;
    public final void rule__Attribute__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3636:1: ( ( ( rule__Attribute__MemorizedAtInitAssignment_9 ) ) rule__Attribute__Group__10 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3637:1: ( ( rule__Attribute__MemorizedAtInitAssignment_9 ) ) rule__Attribute__Group__10
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3637:1: ( ( rule__Attribute__MemorizedAtInitAssignment_9 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3638:1: ( rule__Attribute__MemorizedAtInitAssignment_9 )
            {
             before(grammarAccess.getAttributeAccess().getMemorizedAtInitAssignment_9()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3639:1: ( rule__Attribute__MemorizedAtInitAssignment_9 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3639:2: rule__Attribute__MemorizedAtInitAssignment_9
            {
            pushFollow(FOLLOW_rule__Attribute__MemorizedAtInitAssignment_9_in_rule__Attribute__Group__97704);
            rule__Attribute__MemorizedAtInitAssignment_9();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getMemorizedAtInitAssignment_9()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__10_in_rule__Attribute__Group__97713);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3650:1: rule__Attribute__Group__10 : ( ( rule__Attribute__ChangeEventAssignment_10 ) ) rule__Attribute__Group__11 ;
    public final void rule__Attribute__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3654:1: ( ( ( rule__Attribute__ChangeEventAssignment_10 ) ) rule__Attribute__Group__11 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3655:1: ( ( rule__Attribute__ChangeEventAssignment_10 ) ) rule__Attribute__Group__11
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3655:1: ( ( rule__Attribute__ChangeEventAssignment_10 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3656:1: ( rule__Attribute__ChangeEventAssignment_10 )
            {
             before(grammarAccess.getAttributeAccess().getChangeEventAssignment_10()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3657:1: ( rule__Attribute__ChangeEventAssignment_10 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3657:2: rule__Attribute__ChangeEventAssignment_10
            {
            pushFollow(FOLLOW_rule__Attribute__ChangeEventAssignment_10_in_rule__Attribute__Group__107741);
            rule__Attribute__ChangeEventAssignment_10();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getChangeEventAssignment_10()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__11_in_rule__Attribute__Group__107750);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3668:1: rule__Attribute__Group__11 : ( ( rule__Attribute__ArchiveEventAssignment_11 ) ) rule__Attribute__Group__12 ;
    public final void rule__Attribute__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3672:1: ( ( ( rule__Attribute__ArchiveEventAssignment_11 ) ) rule__Attribute__Group__12 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3673:1: ( ( rule__Attribute__ArchiveEventAssignment_11 ) ) rule__Attribute__Group__12
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3673:1: ( ( rule__Attribute__ArchiveEventAssignment_11 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3674:1: ( rule__Attribute__ArchiveEventAssignment_11 )
            {
             before(grammarAccess.getAttributeAccess().getArchiveEventAssignment_11()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3675:1: ( rule__Attribute__ArchiveEventAssignment_11 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3675:2: rule__Attribute__ArchiveEventAssignment_11
            {
            pushFollow(FOLLOW_rule__Attribute__ArchiveEventAssignment_11_in_rule__Attribute__Group__117778);
            rule__Attribute__ArchiveEventAssignment_11();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getArchiveEventAssignment_11()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__12_in_rule__Attribute__Group__117787);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3686:1: rule__Attribute__Group__12 : ( ( rule__Attribute__StatusAssignment_12 ) ) rule__Attribute__Group__13 ;
    public final void rule__Attribute__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3690:1: ( ( ( rule__Attribute__StatusAssignment_12 ) ) rule__Attribute__Group__13 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3691:1: ( ( rule__Attribute__StatusAssignment_12 ) ) rule__Attribute__Group__13
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3691:1: ( ( rule__Attribute__StatusAssignment_12 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3692:1: ( rule__Attribute__StatusAssignment_12 )
            {
             before(grammarAccess.getAttributeAccess().getStatusAssignment_12()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3693:1: ( rule__Attribute__StatusAssignment_12 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3693:2: rule__Attribute__StatusAssignment_12
            {
            pushFollow(FOLLOW_rule__Attribute__StatusAssignment_12_in_rule__Attribute__Group__127815);
            rule__Attribute__StatusAssignment_12();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getStatusAssignment_12()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__13_in_rule__Attribute__Group__127824);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3704:1: rule__Attribute__Group__13 : ( ( rule__Attribute__PropertiesAssignment_13 ) ) rule__Attribute__Group__14 ;
    public final void rule__Attribute__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3708:1: ( ( ( rule__Attribute__PropertiesAssignment_13 ) ) rule__Attribute__Group__14 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3709:1: ( ( rule__Attribute__PropertiesAssignment_13 ) ) rule__Attribute__Group__14
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3709:1: ( ( rule__Attribute__PropertiesAssignment_13 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3710:1: ( rule__Attribute__PropertiesAssignment_13 )
            {
             before(grammarAccess.getAttributeAccess().getPropertiesAssignment_13()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3711:1: ( rule__Attribute__PropertiesAssignment_13 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3711:2: rule__Attribute__PropertiesAssignment_13
            {
            pushFollow(FOLLOW_rule__Attribute__PropertiesAssignment_13_in_rule__Attribute__Group__137852);
            rule__Attribute__PropertiesAssignment_13();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getPropertiesAssignment_13()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__14_in_rule__Attribute__Group__137861);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3722:1: rule__Attribute__Group__14 : ( 'excludedStates:' ) rule__Attribute__Group__15 ;
    public final void rule__Attribute__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3726:1: ( ( 'excludedStates:' ) rule__Attribute__Group__15 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3727:1: ( 'excludedStates:' ) rule__Attribute__Group__15
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3727:1: ( 'excludedStates:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3728:1: 'excludedStates:'
            {
             before(grammarAccess.getAttributeAccess().getExcludedStatesKeyword_14()); 
            match(input,38,FOLLOW_38_in_rule__Attribute__Group__147890); 
             after(grammarAccess.getAttributeAccess().getExcludedStatesKeyword_14()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__15_in_rule__Attribute__Group__147900);
            rule__Attribute__Group__15();
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
    // $ANTLR end rule__Attribute__Group__14


    // $ANTLR start rule__Attribute__Group__15
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3742:1: rule__Attribute__Group__15 : ( ( rule__Attribute__ExcludedStatesAssignment_15 )* ) ;
    public final void rule__Attribute__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3746:1: ( ( ( rule__Attribute__ExcludedStatesAssignment_15 )* ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3747:1: ( ( rule__Attribute__ExcludedStatesAssignment_15 )* )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3747:1: ( ( rule__Attribute__ExcludedStatesAssignment_15 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3748:1: ( rule__Attribute__ExcludedStatesAssignment_15 )*
            {
             before(grammarAccess.getAttributeAccess().getExcludedStatesAssignment_15()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3749:1: ( rule__Attribute__ExcludedStatesAssignment_15 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_STRING) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3749:2: rule__Attribute__ExcludedStatesAssignment_15
            	    {
            	    pushFollow(FOLLOW_rule__Attribute__ExcludedStatesAssignment_15_in_rule__Attribute__Group__157928);
            	    rule__Attribute__ExcludedStatesAssignment_15();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getAttributeAccess().getExcludedStatesAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__15


    // $ANTLR start rule__FireEvents__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3791:1: rule__FireEvents__Group__0 : ( ( rule__FireEvents__FireAssignment_0 ) ) rule__FireEvents__Group__1 ;
    public final void rule__FireEvents__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3795:1: ( ( ( rule__FireEvents__FireAssignment_0 ) ) rule__FireEvents__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3796:1: ( ( rule__FireEvents__FireAssignment_0 ) ) rule__FireEvents__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3796:1: ( ( rule__FireEvents__FireAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3797:1: ( rule__FireEvents__FireAssignment_0 )
            {
             before(grammarAccess.getFireEventsAccess().getFireAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3798:1: ( rule__FireEvents__FireAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3798:2: rule__FireEvents__FireAssignment_0
            {
            pushFollow(FOLLOW_rule__FireEvents__FireAssignment_0_in_rule__FireEvents__Group__07995);
            rule__FireEvents__FireAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getFireEventsAccess().getFireAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__FireEvents__Group__1_in_rule__FireEvents__Group__08004);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3809:1: rule__FireEvents__Group__1 : ( ( rule__FireEvents__LibCheckCriteriaAssignment_1 ) ) ;
    public final void rule__FireEvents__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3813:1: ( ( ( rule__FireEvents__LibCheckCriteriaAssignment_1 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3814:1: ( ( rule__FireEvents__LibCheckCriteriaAssignment_1 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3814:1: ( ( rule__FireEvents__LibCheckCriteriaAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3815:1: ( rule__FireEvents__LibCheckCriteriaAssignment_1 )
            {
             before(grammarAccess.getFireEventsAccess().getLibCheckCriteriaAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3816:1: ( rule__FireEvents__LibCheckCriteriaAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3816:2: rule__FireEvents__LibCheckCriteriaAssignment_1
            {
            pushFollow(FOLLOW_rule__FireEvents__LibCheckCriteriaAssignment_1_in_rule__FireEvents__Group__18032);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3830:1: rule__AttrProperties__Group__0 : ( ( rule__AttrProperties__DescriptionAssignment_0 ) ) rule__AttrProperties__Group__1 ;
    public final void rule__AttrProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3834:1: ( ( ( rule__AttrProperties__DescriptionAssignment_0 ) ) rule__AttrProperties__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3835:1: ( ( rule__AttrProperties__DescriptionAssignment_0 ) ) rule__AttrProperties__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3835:1: ( ( rule__AttrProperties__DescriptionAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3836:1: ( rule__AttrProperties__DescriptionAssignment_0 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getDescriptionAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3837:1: ( rule__AttrProperties__DescriptionAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3837:2: rule__AttrProperties__DescriptionAssignment_0
            {
            pushFollow(FOLLOW_rule__AttrProperties__DescriptionAssignment_0_in_rule__AttrProperties__Group__08070);
            rule__AttrProperties__DescriptionAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__1_in_rule__AttrProperties__Group__08079);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3848:1: rule__AttrProperties__Group__1 : ( ( rule__AttrProperties__LabelAssignment_1 ) ) rule__AttrProperties__Group__2 ;
    public final void rule__AttrProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3852:1: ( ( ( rule__AttrProperties__LabelAssignment_1 ) ) rule__AttrProperties__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3853:1: ( ( rule__AttrProperties__LabelAssignment_1 ) ) rule__AttrProperties__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3853:1: ( ( rule__AttrProperties__LabelAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3854:1: ( rule__AttrProperties__LabelAssignment_1 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getLabelAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3855:1: ( rule__AttrProperties__LabelAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3855:2: rule__AttrProperties__LabelAssignment_1
            {
            pushFollow(FOLLOW_rule__AttrProperties__LabelAssignment_1_in_rule__AttrProperties__Group__18107);
            rule__AttrProperties__LabelAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getLabelAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__2_in_rule__AttrProperties__Group__18116);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3866:1: rule__AttrProperties__Group__2 : ( ( rule__AttrProperties__UnitAssignment_2 ) ) rule__AttrProperties__Group__3 ;
    public final void rule__AttrProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3870:1: ( ( ( rule__AttrProperties__UnitAssignment_2 ) ) rule__AttrProperties__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3871:1: ( ( rule__AttrProperties__UnitAssignment_2 ) ) rule__AttrProperties__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3871:1: ( ( rule__AttrProperties__UnitAssignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3872:1: ( rule__AttrProperties__UnitAssignment_2 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getUnitAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3873:1: ( rule__AttrProperties__UnitAssignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3873:2: rule__AttrProperties__UnitAssignment_2
            {
            pushFollow(FOLLOW_rule__AttrProperties__UnitAssignment_2_in_rule__AttrProperties__Group__28144);
            rule__AttrProperties__UnitAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getUnitAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__3_in_rule__AttrProperties__Group__28153);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3884:1: rule__AttrProperties__Group__3 : ( ( rule__AttrProperties__StandardUnitAssignment_3 ) ) rule__AttrProperties__Group__4 ;
    public final void rule__AttrProperties__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3888:1: ( ( ( rule__AttrProperties__StandardUnitAssignment_3 ) ) rule__AttrProperties__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3889:1: ( ( rule__AttrProperties__StandardUnitAssignment_3 ) ) rule__AttrProperties__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3889:1: ( ( rule__AttrProperties__StandardUnitAssignment_3 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3890:1: ( rule__AttrProperties__StandardUnitAssignment_3 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getStandardUnitAssignment_3()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3891:1: ( rule__AttrProperties__StandardUnitAssignment_3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3891:2: rule__AttrProperties__StandardUnitAssignment_3
            {
            pushFollow(FOLLOW_rule__AttrProperties__StandardUnitAssignment_3_in_rule__AttrProperties__Group__38181);
            rule__AttrProperties__StandardUnitAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getStandardUnitAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__4_in_rule__AttrProperties__Group__38190);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3902:1: rule__AttrProperties__Group__4 : ( ( rule__AttrProperties__DisplayUnitAssignment_4 ) ) rule__AttrProperties__Group__5 ;
    public final void rule__AttrProperties__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3906:1: ( ( ( rule__AttrProperties__DisplayUnitAssignment_4 ) ) rule__AttrProperties__Group__5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3907:1: ( ( rule__AttrProperties__DisplayUnitAssignment_4 ) ) rule__AttrProperties__Group__5
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3907:1: ( ( rule__AttrProperties__DisplayUnitAssignment_4 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3908:1: ( rule__AttrProperties__DisplayUnitAssignment_4 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getDisplayUnitAssignment_4()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3909:1: ( rule__AttrProperties__DisplayUnitAssignment_4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3909:2: rule__AttrProperties__DisplayUnitAssignment_4
            {
            pushFollow(FOLLOW_rule__AttrProperties__DisplayUnitAssignment_4_in_rule__AttrProperties__Group__48218);
            rule__AttrProperties__DisplayUnitAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getDisplayUnitAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__5_in_rule__AttrProperties__Group__48227);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3920:1: rule__AttrProperties__Group__5 : ( ( rule__AttrProperties__FormatAssignment_5 ) ) rule__AttrProperties__Group__6 ;
    public final void rule__AttrProperties__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3924:1: ( ( ( rule__AttrProperties__FormatAssignment_5 ) ) rule__AttrProperties__Group__6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3925:1: ( ( rule__AttrProperties__FormatAssignment_5 ) ) rule__AttrProperties__Group__6
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3925:1: ( ( rule__AttrProperties__FormatAssignment_5 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3926:1: ( rule__AttrProperties__FormatAssignment_5 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getFormatAssignment_5()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3927:1: ( rule__AttrProperties__FormatAssignment_5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3927:2: rule__AttrProperties__FormatAssignment_5
            {
            pushFollow(FOLLOW_rule__AttrProperties__FormatAssignment_5_in_rule__AttrProperties__Group__58255);
            rule__AttrProperties__FormatAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getFormatAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__6_in_rule__AttrProperties__Group__58264);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3938:1: rule__AttrProperties__Group__6 : ( ( rule__AttrProperties__MaxValueAssignment_6 ) ) rule__AttrProperties__Group__7 ;
    public final void rule__AttrProperties__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3942:1: ( ( ( rule__AttrProperties__MaxValueAssignment_6 ) ) rule__AttrProperties__Group__7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3943:1: ( ( rule__AttrProperties__MaxValueAssignment_6 ) ) rule__AttrProperties__Group__7
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3943:1: ( ( rule__AttrProperties__MaxValueAssignment_6 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3944:1: ( rule__AttrProperties__MaxValueAssignment_6 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getMaxValueAssignment_6()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3945:1: ( rule__AttrProperties__MaxValueAssignment_6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3945:2: rule__AttrProperties__MaxValueAssignment_6
            {
            pushFollow(FOLLOW_rule__AttrProperties__MaxValueAssignment_6_in_rule__AttrProperties__Group__68292);
            rule__AttrProperties__MaxValueAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getMaxValueAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__7_in_rule__AttrProperties__Group__68301);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3956:1: rule__AttrProperties__Group__7 : ( ( rule__AttrProperties__MinValueAssignment_7 ) ) rule__AttrProperties__Group__8 ;
    public final void rule__AttrProperties__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3960:1: ( ( ( rule__AttrProperties__MinValueAssignment_7 ) ) rule__AttrProperties__Group__8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3961:1: ( ( rule__AttrProperties__MinValueAssignment_7 ) ) rule__AttrProperties__Group__8
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3961:1: ( ( rule__AttrProperties__MinValueAssignment_7 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3962:1: ( rule__AttrProperties__MinValueAssignment_7 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getMinValueAssignment_7()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3963:1: ( rule__AttrProperties__MinValueAssignment_7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3963:2: rule__AttrProperties__MinValueAssignment_7
            {
            pushFollow(FOLLOW_rule__AttrProperties__MinValueAssignment_7_in_rule__AttrProperties__Group__78329);
            rule__AttrProperties__MinValueAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getMinValueAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__8_in_rule__AttrProperties__Group__78338);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3974:1: rule__AttrProperties__Group__8 : ( ( rule__AttrProperties__MaxAlarmAssignment_8 ) ) rule__AttrProperties__Group__9 ;
    public final void rule__AttrProperties__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3978:1: ( ( ( rule__AttrProperties__MaxAlarmAssignment_8 ) ) rule__AttrProperties__Group__9 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3979:1: ( ( rule__AttrProperties__MaxAlarmAssignment_8 ) ) rule__AttrProperties__Group__9
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3979:1: ( ( rule__AttrProperties__MaxAlarmAssignment_8 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3980:1: ( rule__AttrProperties__MaxAlarmAssignment_8 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getMaxAlarmAssignment_8()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3981:1: ( rule__AttrProperties__MaxAlarmAssignment_8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3981:2: rule__AttrProperties__MaxAlarmAssignment_8
            {
            pushFollow(FOLLOW_rule__AttrProperties__MaxAlarmAssignment_8_in_rule__AttrProperties__Group__88366);
            rule__AttrProperties__MaxAlarmAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getMaxAlarmAssignment_8()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__9_in_rule__AttrProperties__Group__88375);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3992:1: rule__AttrProperties__Group__9 : ( ( rule__AttrProperties__MinAlarmAssignment_9 ) ) rule__AttrProperties__Group__10 ;
    public final void rule__AttrProperties__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3996:1: ( ( ( rule__AttrProperties__MinAlarmAssignment_9 ) ) rule__AttrProperties__Group__10 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3997:1: ( ( rule__AttrProperties__MinAlarmAssignment_9 ) ) rule__AttrProperties__Group__10
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3997:1: ( ( rule__AttrProperties__MinAlarmAssignment_9 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3998:1: ( rule__AttrProperties__MinAlarmAssignment_9 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getMinAlarmAssignment_9()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3999:1: ( rule__AttrProperties__MinAlarmAssignment_9 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3999:2: rule__AttrProperties__MinAlarmAssignment_9
            {
            pushFollow(FOLLOW_rule__AttrProperties__MinAlarmAssignment_9_in_rule__AttrProperties__Group__98403);
            rule__AttrProperties__MinAlarmAssignment_9();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getMinAlarmAssignment_9()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__10_in_rule__AttrProperties__Group__98412);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4010:1: rule__AttrProperties__Group__10 : ( ( rule__AttrProperties__MaxWarningAssignment_10 ) ) rule__AttrProperties__Group__11 ;
    public final void rule__AttrProperties__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4014:1: ( ( ( rule__AttrProperties__MaxWarningAssignment_10 ) ) rule__AttrProperties__Group__11 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4015:1: ( ( rule__AttrProperties__MaxWarningAssignment_10 ) ) rule__AttrProperties__Group__11
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4015:1: ( ( rule__AttrProperties__MaxWarningAssignment_10 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4016:1: ( rule__AttrProperties__MaxWarningAssignment_10 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getMaxWarningAssignment_10()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4017:1: ( rule__AttrProperties__MaxWarningAssignment_10 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4017:2: rule__AttrProperties__MaxWarningAssignment_10
            {
            pushFollow(FOLLOW_rule__AttrProperties__MaxWarningAssignment_10_in_rule__AttrProperties__Group__108440);
            rule__AttrProperties__MaxWarningAssignment_10();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getMaxWarningAssignment_10()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__11_in_rule__AttrProperties__Group__108449);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4028:1: rule__AttrProperties__Group__11 : ( ( rule__AttrProperties__MinWarningAssignment_11 ) ) rule__AttrProperties__Group__12 ;
    public final void rule__AttrProperties__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4032:1: ( ( ( rule__AttrProperties__MinWarningAssignment_11 ) ) rule__AttrProperties__Group__12 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4033:1: ( ( rule__AttrProperties__MinWarningAssignment_11 ) ) rule__AttrProperties__Group__12
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4033:1: ( ( rule__AttrProperties__MinWarningAssignment_11 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4034:1: ( rule__AttrProperties__MinWarningAssignment_11 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getMinWarningAssignment_11()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4035:1: ( rule__AttrProperties__MinWarningAssignment_11 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4035:2: rule__AttrProperties__MinWarningAssignment_11
            {
            pushFollow(FOLLOW_rule__AttrProperties__MinWarningAssignment_11_in_rule__AttrProperties__Group__118477);
            rule__AttrProperties__MinWarningAssignment_11();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getMinWarningAssignment_11()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__12_in_rule__AttrProperties__Group__118486);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4046:1: rule__AttrProperties__Group__12 : ( ( rule__AttrProperties__DeltaTimeAssignment_12 ) ) rule__AttrProperties__Group__13 ;
    public final void rule__AttrProperties__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4050:1: ( ( ( rule__AttrProperties__DeltaTimeAssignment_12 ) ) rule__AttrProperties__Group__13 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4051:1: ( ( rule__AttrProperties__DeltaTimeAssignment_12 ) ) rule__AttrProperties__Group__13
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4051:1: ( ( rule__AttrProperties__DeltaTimeAssignment_12 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4052:1: ( rule__AttrProperties__DeltaTimeAssignment_12 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getDeltaTimeAssignment_12()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4053:1: ( rule__AttrProperties__DeltaTimeAssignment_12 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4053:2: rule__AttrProperties__DeltaTimeAssignment_12
            {
            pushFollow(FOLLOW_rule__AttrProperties__DeltaTimeAssignment_12_in_rule__AttrProperties__Group__128514);
            rule__AttrProperties__DeltaTimeAssignment_12();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getDeltaTimeAssignment_12()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__13_in_rule__AttrProperties__Group__128523);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4064:1: rule__AttrProperties__Group__13 : ( ( rule__AttrProperties__DeltaValueAssignment_13 ) ) ;
    public final void rule__AttrProperties__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4068:1: ( ( ( rule__AttrProperties__DeltaValueAssignment_13 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4069:1: ( ( rule__AttrProperties__DeltaValueAssignment_13 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4069:1: ( ( rule__AttrProperties__DeltaValueAssignment_13 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4070:1: ( rule__AttrProperties__DeltaValueAssignment_13 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getDeltaValueAssignment_13()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4071:1: ( rule__AttrProperties__DeltaValueAssignment_13 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4071:2: rule__AttrProperties__DeltaValueAssignment_13
            {
            pushFollow(FOLLOW_rule__AttrProperties__DeltaValueAssignment_13_in_rule__AttrProperties__Group__138551);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4109:1: rule__VoidType__Group__0 : ( () ) rule__VoidType__Group__1 ;
    public final void rule__VoidType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4113:1: ( ( () ) rule__VoidType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4114:1: ( () ) rule__VoidType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4114:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4115:1: ()
            {
             before(grammarAccess.getVoidTypeAccess().getVoidTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4116:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4118:1: 
            {
            }

             after(grammarAccess.getVoidTypeAccess().getVoidTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__VoidType__Group__1_in_rule__VoidType__Group__08623);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4129:1: rule__VoidType__Group__1 : ( 'void' ) ;
    public final void rule__VoidType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4133:1: ( ( 'void' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4134:1: ( 'void' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4134:1: ( 'void' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4135:1: 'void'
            {
             before(grammarAccess.getVoidTypeAccess().getVoidKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__VoidType__Group__18652); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4152:1: rule__BooleanType__Group__0 : ( () ) rule__BooleanType__Group__1 ;
    public final void rule__BooleanType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4156:1: ( ( () ) rule__BooleanType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4157:1: ( () ) rule__BooleanType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4157:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4158:1: ()
            {
             before(grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4159:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4161:1: 
            {
            }

             after(grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__BooleanType__Group__1_in_rule__BooleanType__Group__08701);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4172:1: rule__BooleanType__Group__1 : ( 'boolean' ) ;
    public final void rule__BooleanType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4176:1: ( ( 'boolean' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4177:1: ( 'boolean' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4177:1: ( 'boolean' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4178:1: 'boolean'
            {
             before(grammarAccess.getBooleanTypeAccess().getBooleanKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__BooleanType__Group__18730); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4195:1: rule__ShortType__Group__0 : ( () ) rule__ShortType__Group__1 ;
    public final void rule__ShortType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4199:1: ( ( () ) rule__ShortType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4200:1: ( () ) rule__ShortType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4200:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4201:1: ()
            {
             before(grammarAccess.getShortTypeAccess().getShortTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4202:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4204:1: 
            {
            }

             after(grammarAccess.getShortTypeAccess().getShortTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__ShortType__Group__1_in_rule__ShortType__Group__08779);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4215:1: rule__ShortType__Group__1 : ( 'short' ) ;
    public final void rule__ShortType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4219:1: ( ( 'short' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4220:1: ( 'short' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4220:1: ( 'short' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4221:1: 'short'
            {
             before(grammarAccess.getShortTypeAccess().getShortKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__ShortType__Group__18808); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4238:1: rule__UShortType__Group__0 : ( () ) rule__UShortType__Group__1 ;
    public final void rule__UShortType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4242:1: ( ( () ) rule__UShortType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4243:1: ( () ) rule__UShortType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4243:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4244:1: ()
            {
             before(grammarAccess.getUShortTypeAccess().getUShortTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4245:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4247:1: 
            {
            }

             after(grammarAccess.getUShortTypeAccess().getUShortTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__UShortType__Group__1_in_rule__UShortType__Group__08857);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4258:1: rule__UShortType__Group__1 : ( 'ushort' ) ;
    public final void rule__UShortType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4262:1: ( ( 'ushort' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4263:1: ( 'ushort' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4263:1: ( 'ushort' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4264:1: 'ushort'
            {
             before(grammarAccess.getUShortTypeAccess().getUshortKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__UShortType__Group__18886); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4281:1: rule__IntType__Group__0 : ( () ) rule__IntType__Group__1 ;
    public final void rule__IntType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4285:1: ( ( () ) rule__IntType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4286:1: ( () ) rule__IntType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4286:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4287:1: ()
            {
             before(grammarAccess.getIntTypeAccess().getIntTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4288:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4290:1: 
            {
            }

             after(grammarAccess.getIntTypeAccess().getIntTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__IntType__Group__1_in_rule__IntType__Group__08935);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4301:1: rule__IntType__Group__1 : ( 'int' ) ;
    public final void rule__IntType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4305:1: ( ( 'int' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4306:1: ( 'int' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4306:1: ( 'int' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4307:1: 'int'
            {
             before(grammarAccess.getIntTypeAccess().getIntKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__IntType__Group__18964); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4324:1: rule__UIntType__Group__0 : ( () ) rule__UIntType__Group__1 ;
    public final void rule__UIntType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4328:1: ( ( () ) rule__UIntType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4329:1: ( () ) rule__UIntType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4329:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4330:1: ()
            {
             before(grammarAccess.getUIntTypeAccess().getUIntTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4331:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4333:1: 
            {
            }

             after(grammarAccess.getUIntTypeAccess().getUIntTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__UIntType__Group__1_in_rule__UIntType__Group__09013);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4344:1: rule__UIntType__Group__1 : ( 'uint' ) ;
    public final void rule__UIntType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4348:1: ( ( 'uint' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4349:1: ( 'uint' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4349:1: ( 'uint' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4350:1: 'uint'
            {
             before(grammarAccess.getUIntTypeAccess().getUintKeyword_1()); 
            match(input,44,FOLLOW_44_in_rule__UIntType__Group__19042); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4367:1: rule__FloatType__Group__0 : ( () ) rule__FloatType__Group__1 ;
    public final void rule__FloatType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4371:1: ( ( () ) rule__FloatType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4372:1: ( () ) rule__FloatType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4372:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4373:1: ()
            {
             before(grammarAccess.getFloatTypeAccess().getFloatTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4374:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4376:1: 
            {
            }

             after(grammarAccess.getFloatTypeAccess().getFloatTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__FloatType__Group__1_in_rule__FloatType__Group__09091);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4387:1: rule__FloatType__Group__1 : ( 'float' ) ;
    public final void rule__FloatType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4391:1: ( ( 'float' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4392:1: ( 'float' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4392:1: ( 'float' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4393:1: 'float'
            {
             before(grammarAccess.getFloatTypeAccess().getFloatKeyword_1()); 
            match(input,45,FOLLOW_45_in_rule__FloatType__Group__19120); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4410:1: rule__DoubleType__Group__0 : ( () ) rule__DoubleType__Group__1 ;
    public final void rule__DoubleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4414:1: ( ( () ) rule__DoubleType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4415:1: ( () ) rule__DoubleType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4415:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4416:1: ()
            {
             before(grammarAccess.getDoubleTypeAccess().getDoubleTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4417:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4419:1: 
            {
            }

             after(grammarAccess.getDoubleTypeAccess().getDoubleTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__DoubleType__Group__1_in_rule__DoubleType__Group__09169);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4430:1: rule__DoubleType__Group__1 : ( 'double' ) ;
    public final void rule__DoubleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4434:1: ( ( 'double' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4435:1: ( 'double' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4435:1: ( 'double' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4436:1: 'double'
            {
             before(grammarAccess.getDoubleTypeAccess().getDoubleKeyword_1()); 
            match(input,46,FOLLOW_46_in_rule__DoubleType__Group__19198); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4453:1: rule__StringType__Group__0 : ( () ) rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4457:1: ( ( () ) rule__StringType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4458:1: ( () ) rule__StringType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4458:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4459:1: ()
            {
             before(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4460:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4462:1: 
            {
            }

             after(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__StringType__Group__1_in_rule__StringType__Group__09247);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4473:1: rule__StringType__Group__1 : ( 'string' ) ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4477:1: ( ( 'string' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4478:1: ( 'string' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4478:1: ( 'string' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4479:1: 'string'
            {
             before(grammarAccess.getStringTypeAccess().getStringKeyword_1()); 
            match(input,47,FOLLOW_47_in_rule__StringType__Group__19276); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4496:1: rule__CharArrayType__Group__0 : ( () ) rule__CharArrayType__Group__1 ;
    public final void rule__CharArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4500:1: ( ( () ) rule__CharArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4501:1: ( () ) rule__CharArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4501:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4502:1: ()
            {
             before(grammarAccess.getCharArrayTypeAccess().getCharArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4503:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4505:1: 
            {
            }

             after(grammarAccess.getCharArrayTypeAccess().getCharArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__CharArrayType__Group__1_in_rule__CharArrayType__Group__09325);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4516:1: rule__CharArrayType__Group__1 : ( 'DevVarCharArray' ) ;
    public final void rule__CharArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4520:1: ( ( 'DevVarCharArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4521:1: ( 'DevVarCharArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4521:1: ( 'DevVarCharArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4522:1: 'DevVarCharArray'
            {
             before(grammarAccess.getCharArrayTypeAccess().getDevVarCharArrayKeyword_1()); 
            match(input,48,FOLLOW_48_in_rule__CharArrayType__Group__19354); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4539:1: rule__ShortArrayType__Group__0 : ( () ) rule__ShortArrayType__Group__1 ;
    public final void rule__ShortArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4543:1: ( ( () ) rule__ShortArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4544:1: ( () ) rule__ShortArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4544:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4545:1: ()
            {
             before(grammarAccess.getShortArrayTypeAccess().getShortArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4546:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4548:1: 
            {
            }

             after(grammarAccess.getShortArrayTypeAccess().getShortArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__ShortArrayType__Group__1_in_rule__ShortArrayType__Group__09403);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4559:1: rule__ShortArrayType__Group__1 : ( 'DevVarShortArray' ) ;
    public final void rule__ShortArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4563:1: ( ( 'DevVarShortArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4564:1: ( 'DevVarShortArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4564:1: ( 'DevVarShortArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4565:1: 'DevVarShortArray'
            {
             before(grammarAccess.getShortArrayTypeAccess().getDevVarShortArrayKeyword_1()); 
            match(input,49,FOLLOW_49_in_rule__ShortArrayType__Group__19432); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4582:1: rule__UShortArrayType__Group__0 : ( () ) rule__UShortArrayType__Group__1 ;
    public final void rule__UShortArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4586:1: ( ( () ) rule__UShortArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4587:1: ( () ) rule__UShortArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4587:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4588:1: ()
            {
             before(grammarAccess.getUShortArrayTypeAccess().getUShortArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4589:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4591:1: 
            {
            }

             after(grammarAccess.getUShortArrayTypeAccess().getUShortArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__UShortArrayType__Group__1_in_rule__UShortArrayType__Group__09481);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4602:1: rule__UShortArrayType__Group__1 : ( 'DevVarUShortArray' ) ;
    public final void rule__UShortArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4606:1: ( ( 'DevVarUShortArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4607:1: ( 'DevVarUShortArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4607:1: ( 'DevVarUShortArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4608:1: 'DevVarUShortArray'
            {
             before(grammarAccess.getUShortArrayTypeAccess().getDevVarUShortArrayKeyword_1()); 
            match(input,50,FOLLOW_50_in_rule__UShortArrayType__Group__19510); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4625:1: rule__IntArrayType__Group__0 : ( () ) rule__IntArrayType__Group__1 ;
    public final void rule__IntArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4629:1: ( ( () ) rule__IntArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4630:1: ( () ) rule__IntArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4630:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4631:1: ()
            {
             before(grammarAccess.getIntArrayTypeAccess().getIntArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4632:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4634:1: 
            {
            }

             after(grammarAccess.getIntArrayTypeAccess().getIntArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__IntArrayType__Group__1_in_rule__IntArrayType__Group__09559);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4645:1: rule__IntArrayType__Group__1 : ( 'DevVarLongArray' ) ;
    public final void rule__IntArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4649:1: ( ( 'DevVarLongArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4650:1: ( 'DevVarLongArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4650:1: ( 'DevVarLongArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4651:1: 'DevVarLongArray'
            {
             before(grammarAccess.getIntArrayTypeAccess().getDevVarLongArrayKeyword_1()); 
            match(input,51,FOLLOW_51_in_rule__IntArrayType__Group__19588); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4668:1: rule__UIntArrayType__Group__0 : ( () ) rule__UIntArrayType__Group__1 ;
    public final void rule__UIntArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4672:1: ( ( () ) rule__UIntArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4673:1: ( () ) rule__UIntArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4673:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4674:1: ()
            {
             before(grammarAccess.getUIntArrayTypeAccess().getUIntArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4675:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4677:1: 
            {
            }

             after(grammarAccess.getUIntArrayTypeAccess().getUIntArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__UIntArrayType__Group__1_in_rule__UIntArrayType__Group__09637);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4688:1: rule__UIntArrayType__Group__1 : ( 'DevVarULongArray' ) ;
    public final void rule__UIntArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4692:1: ( ( 'DevVarULongArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4693:1: ( 'DevVarULongArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4693:1: ( 'DevVarULongArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4694:1: 'DevVarULongArray'
            {
             before(grammarAccess.getUIntArrayTypeAccess().getDevVarULongArrayKeyword_1()); 
            match(input,52,FOLLOW_52_in_rule__UIntArrayType__Group__19666); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4711:1: rule__FloatArrayType__Group__0 : ( () ) rule__FloatArrayType__Group__1 ;
    public final void rule__FloatArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4715:1: ( ( () ) rule__FloatArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4716:1: ( () ) rule__FloatArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4716:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4717:1: ()
            {
             before(grammarAccess.getFloatArrayTypeAccess().getFloatArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4718:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4720:1: 
            {
            }

             after(grammarAccess.getFloatArrayTypeAccess().getFloatArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__FloatArrayType__Group__1_in_rule__FloatArrayType__Group__09715);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4731:1: rule__FloatArrayType__Group__1 : ( 'DevVarFloatArray' ) ;
    public final void rule__FloatArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4735:1: ( ( 'DevVarFloatArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4736:1: ( 'DevVarFloatArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4736:1: ( 'DevVarFloatArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4737:1: 'DevVarFloatArray'
            {
             before(grammarAccess.getFloatArrayTypeAccess().getDevVarFloatArrayKeyword_1()); 
            match(input,53,FOLLOW_53_in_rule__FloatArrayType__Group__19744); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4754:1: rule__DoubleArrayType__Group__0 : ( () ) rule__DoubleArrayType__Group__1 ;
    public final void rule__DoubleArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4758:1: ( ( () ) rule__DoubleArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4759:1: ( () ) rule__DoubleArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4759:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4760:1: ()
            {
             before(grammarAccess.getDoubleArrayTypeAccess().getDoubleArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4761:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4763:1: 
            {
            }

             after(grammarAccess.getDoubleArrayTypeAccess().getDoubleArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__DoubleArrayType__Group__1_in_rule__DoubleArrayType__Group__09793);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4774:1: rule__DoubleArrayType__Group__1 : ( 'DevVarDoubleArray' ) ;
    public final void rule__DoubleArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4778:1: ( ( 'DevVarDoubleArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4779:1: ( 'DevVarDoubleArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4779:1: ( 'DevVarDoubleArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4780:1: 'DevVarDoubleArray'
            {
             before(grammarAccess.getDoubleArrayTypeAccess().getDevVarDoubleArrayKeyword_1()); 
            match(input,54,FOLLOW_54_in_rule__DoubleArrayType__Group__19822); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4797:1: rule__StringArrayType__Group__0 : ( () ) rule__StringArrayType__Group__1 ;
    public final void rule__StringArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4801:1: ( ( () ) rule__StringArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4802:1: ( () ) rule__StringArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4802:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4803:1: ()
            {
             before(grammarAccess.getStringArrayTypeAccess().getStringArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4804:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4806:1: 
            {
            }

             after(grammarAccess.getStringArrayTypeAccess().getStringArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__StringArrayType__Group__1_in_rule__StringArrayType__Group__09871);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4817:1: rule__StringArrayType__Group__1 : ( 'DevVarStringArray' ) ;
    public final void rule__StringArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4821:1: ( ( 'DevVarStringArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4822:1: ( 'DevVarStringArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4822:1: ( 'DevVarStringArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4823:1: 'DevVarStringArray'
            {
             before(grammarAccess.getStringArrayTypeAccess().getDevVarStringArrayKeyword_1()); 
            match(input,55,FOLLOW_55_in_rule__StringArrayType__Group__19900); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4840:1: rule__LongStringArrayType__Group__0 : ( () ) rule__LongStringArrayType__Group__1 ;
    public final void rule__LongStringArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4844:1: ( ( () ) rule__LongStringArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4845:1: ( () ) rule__LongStringArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4845:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4846:1: ()
            {
             before(grammarAccess.getLongStringArrayTypeAccess().getLongStringArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4847:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4849:1: 
            {
            }

             after(grammarAccess.getLongStringArrayTypeAccess().getLongStringArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__LongStringArrayType__Group__1_in_rule__LongStringArrayType__Group__09949);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4860:1: rule__LongStringArrayType__Group__1 : ( 'DevVarLongStringArray' ) ;
    public final void rule__LongStringArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4864:1: ( ( 'DevVarLongStringArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4865:1: ( 'DevVarLongStringArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4865:1: ( 'DevVarLongStringArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4866:1: 'DevVarLongStringArray'
            {
             before(grammarAccess.getLongStringArrayTypeAccess().getDevVarLongStringArrayKeyword_1()); 
            match(input,56,FOLLOW_56_in_rule__LongStringArrayType__Group__19978); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4883:1: rule__DoubleStringArrayType__Group__0 : ( () ) rule__DoubleStringArrayType__Group__1 ;
    public final void rule__DoubleStringArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4887:1: ( ( () ) rule__DoubleStringArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4888:1: ( () ) rule__DoubleStringArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4888:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4889:1: ()
            {
             before(grammarAccess.getDoubleStringArrayTypeAccess().getDoubleStringArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4890:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4892:1: 
            {
            }

             after(grammarAccess.getDoubleStringArrayTypeAccess().getDoubleStringArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__DoubleStringArrayType__Group__1_in_rule__DoubleStringArrayType__Group__010027);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4903:1: rule__DoubleStringArrayType__Group__1 : ( 'DevVarDoubleStringArray' ) ;
    public final void rule__DoubleStringArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4907:1: ( ( 'DevVarDoubleStringArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4908:1: ( 'DevVarDoubleStringArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4908:1: ( 'DevVarDoubleStringArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4909:1: 'DevVarDoubleStringArray'
            {
             before(grammarAccess.getDoubleStringArrayTypeAccess().getDevVarDoubleStringArrayKeyword_1()); 
            match(input,57,FOLLOW_57_in_rule__DoubleStringArrayType__Group__110056); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4926:1: rule__StateType__Group__0 : ( () ) rule__StateType__Group__1 ;
    public final void rule__StateType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4930:1: ( ( () ) rule__StateType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4931:1: ( () ) rule__StateType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4931:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4932:1: ()
            {
             before(grammarAccess.getStateTypeAccess().getStateTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4933:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4935:1: 
            {
            }

             after(grammarAccess.getStateTypeAccess().getStateTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__StateType__Group__1_in_rule__StateType__Group__010105);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4946:1: rule__StateType__Group__1 : ( 'DevState' ) ;
    public final void rule__StateType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4950:1: ( ( 'DevState' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4951:1: ( 'DevState' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4951:1: ( 'DevState' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4952:1: 'DevState'
            {
             before(grammarAccess.getStateTypeAccess().getDevStateKeyword_1()); 
            match(input,58,FOLLOW_58_in_rule__StateType__Group__110134); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4969:1: rule__ConstStringType__Group__0 : ( () ) rule__ConstStringType__Group__1 ;
    public final void rule__ConstStringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4973:1: ( ( () ) rule__ConstStringType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4974:1: ( () ) rule__ConstStringType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4974:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4975:1: ()
            {
             before(grammarAccess.getConstStringTypeAccess().getConstStringTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4976:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4978:1: 
            {
            }

             after(grammarAccess.getConstStringTypeAccess().getConstStringTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__ConstStringType__Group__1_in_rule__ConstStringType__Group__010183);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4989:1: rule__ConstStringType__Group__1 : ( 'ConstDevString' ) ;
    public final void rule__ConstStringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4993:1: ( ( 'ConstDevString' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4994:1: ( 'ConstDevString' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4994:1: ( 'ConstDevString' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4995:1: 'ConstDevString'
            {
             before(grammarAccess.getConstStringTypeAccess().getConstDevStringKeyword_1()); 
            match(input,59,FOLLOW_59_in_rule__ConstStringType__Group__110212); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5012:1: rule__BooleanArrayType__Group__0 : ( () ) rule__BooleanArrayType__Group__1 ;
    public final void rule__BooleanArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5016:1: ( ( () ) rule__BooleanArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5017:1: ( () ) rule__BooleanArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5017:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5018:1: ()
            {
             before(grammarAccess.getBooleanArrayTypeAccess().getBooleanArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5019:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5021:1: 
            {
            }

             after(grammarAccess.getBooleanArrayTypeAccess().getBooleanArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__BooleanArrayType__Group__1_in_rule__BooleanArrayType__Group__010261);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5032:1: rule__BooleanArrayType__Group__1 : ( 'DevVarBooleanArray' ) ;
    public final void rule__BooleanArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5036:1: ( ( 'DevVarBooleanArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5037:1: ( 'DevVarBooleanArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5037:1: ( 'DevVarBooleanArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5038:1: 'DevVarBooleanArray'
            {
             before(grammarAccess.getBooleanArrayTypeAccess().getDevVarBooleanArrayKeyword_1()); 
            match(input,60,FOLLOW_60_in_rule__BooleanArrayType__Group__110290); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5055:1: rule__UCharType__Group__0 : ( () ) rule__UCharType__Group__1 ;
    public final void rule__UCharType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5059:1: ( ( () ) rule__UCharType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5060:1: ( () ) rule__UCharType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5060:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5061:1: ()
            {
             before(grammarAccess.getUCharTypeAccess().getUCharTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5062:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5064:1: 
            {
            }

             after(grammarAccess.getUCharTypeAccess().getUCharTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__UCharType__Group__1_in_rule__UCharType__Group__010339);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5075:1: rule__UCharType__Group__1 : ( 'DevUChar' ) ;
    public final void rule__UCharType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5079:1: ( ( 'DevUChar' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5080:1: ( 'DevUChar' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5080:1: ( 'DevUChar' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5081:1: 'DevUChar'
            {
             before(grammarAccess.getUCharTypeAccess().getDevUCharKeyword_1()); 
            match(input,61,FOLLOW_61_in_rule__UCharType__Group__110368); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5098:1: rule__LongType__Group__0 : ( () ) rule__LongType__Group__1 ;
    public final void rule__LongType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5102:1: ( ( () ) rule__LongType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5103:1: ( () ) rule__LongType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5103:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5104:1: ()
            {
             before(grammarAccess.getLongTypeAccess().getLongTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5105:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5107:1: 
            {
            }

             after(grammarAccess.getLongTypeAccess().getLongTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__LongType__Group__1_in_rule__LongType__Group__010417);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5118:1: rule__LongType__Group__1 : ( 'DevLong64' ) ;
    public final void rule__LongType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5122:1: ( ( 'DevLong64' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5123:1: ( 'DevLong64' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5123:1: ( 'DevLong64' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5124:1: 'DevLong64'
            {
             before(grammarAccess.getLongTypeAccess().getDevLong64Keyword_1()); 
            match(input,62,FOLLOW_62_in_rule__LongType__Group__110446); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5141:1: rule__ULongType__Group__0 : ( () ) rule__ULongType__Group__1 ;
    public final void rule__ULongType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5145:1: ( ( () ) rule__ULongType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5146:1: ( () ) rule__ULongType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5146:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5147:1: ()
            {
             before(grammarAccess.getULongTypeAccess().getULongTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5148:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5150:1: 
            {
            }

             after(grammarAccess.getULongTypeAccess().getULongTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__ULongType__Group__1_in_rule__ULongType__Group__010495);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5161:1: rule__ULongType__Group__1 : ( 'DevULong64' ) ;
    public final void rule__ULongType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5165:1: ( ( 'DevULong64' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5166:1: ( 'DevULong64' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5166:1: ( 'DevULong64' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5167:1: 'DevULong64'
            {
             before(grammarAccess.getULongTypeAccess().getDevULong64Keyword_1()); 
            match(input,63,FOLLOW_63_in_rule__ULongType__Group__110524); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5184:1: rule__LongArrayType__Group__0 : ( () ) rule__LongArrayType__Group__1 ;
    public final void rule__LongArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5188:1: ( ( () ) rule__LongArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5189:1: ( () ) rule__LongArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5189:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5190:1: ()
            {
             before(grammarAccess.getLongArrayTypeAccess().getLongArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5191:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5193:1: 
            {
            }

             after(grammarAccess.getLongArrayTypeAccess().getLongArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__LongArrayType__Group__1_in_rule__LongArrayType__Group__010573);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5204:1: rule__LongArrayType__Group__1 : ( 'DevVarLong64Array' ) ;
    public final void rule__LongArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5208:1: ( ( 'DevVarLong64Array' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5209:1: ( 'DevVarLong64Array' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5209:1: ( 'DevVarLong64Array' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5210:1: 'DevVarLong64Array'
            {
             before(grammarAccess.getLongArrayTypeAccess().getDevVarLong64ArrayKeyword_1()); 
            match(input,64,FOLLOW_64_in_rule__LongArrayType__Group__110602); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5227:1: rule__ULongArrayType__Group__0 : ( () ) rule__ULongArrayType__Group__1 ;
    public final void rule__ULongArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5231:1: ( ( () ) rule__ULongArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5232:1: ( () ) rule__ULongArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5232:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5233:1: ()
            {
             before(grammarAccess.getULongArrayTypeAccess().getULongArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5234:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5236:1: 
            {
            }

             after(grammarAccess.getULongArrayTypeAccess().getULongArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__ULongArrayType__Group__1_in_rule__ULongArrayType__Group__010651);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5247:1: rule__ULongArrayType__Group__1 : ( 'DevVarULong64Array' ) ;
    public final void rule__ULongArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5251:1: ( ( 'DevVarULong64Array' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5252:1: ( 'DevVarULong64Array' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5252:1: ( 'DevVarULong64Array' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5253:1: 'DevVarULong64Array'
            {
             before(grammarAccess.getULongArrayTypeAccess().getDevVarULong64ArrayKeyword_1()); 
            match(input,65,FOLLOW_65_in_rule__ULongArrayType__Group__110680); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5270:1: rule__DevIntType__Group__0 : ( () ) rule__DevIntType__Group__1 ;
    public final void rule__DevIntType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5274:1: ( ( () ) rule__DevIntType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5275:1: ( () ) rule__DevIntType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5275:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5276:1: ()
            {
             before(grammarAccess.getDevIntTypeAccess().getDevIntTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5277:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5279:1: 
            {
            }

             after(grammarAccess.getDevIntTypeAccess().getDevIntTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__DevIntType__Group__1_in_rule__DevIntType__Group__010729);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5290:1: rule__DevIntType__Group__1 : ( 'DevInt' ) ;
    public final void rule__DevIntType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5294:1: ( ( 'DevInt' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5295:1: ( 'DevInt' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5295:1: ( 'DevInt' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5296:1: 'DevInt'
            {
             before(grammarAccess.getDevIntTypeAccess().getDevIntKeyword_1()); 
            match(input,66,FOLLOW_66_in_rule__DevIntType__Group__110758); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5313:1: rule__EncodedType__Group__0 : ( () ) rule__EncodedType__Group__1 ;
    public final void rule__EncodedType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5317:1: ( ( () ) rule__EncodedType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5318:1: ( () ) rule__EncodedType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5318:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5319:1: ()
            {
             before(grammarAccess.getEncodedTypeAccess().getEncodedTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5320:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5322:1: 
            {
            }

             after(grammarAccess.getEncodedTypeAccess().getEncodedTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__EncodedType__Group__1_in_rule__EncodedType__Group__010807);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5333:1: rule__EncodedType__Group__1 : ( 'DevEncoded' ) ;
    public final void rule__EncodedType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5337:1: ( ( 'DevEncoded' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5338:1: ( 'DevEncoded' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5338:1: ( 'DevEncoded' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5339:1: 'DevEncoded'
            {
             before(grammarAccess.getEncodedTypeAccess().getDevEncodedKeyword_1()); 
            match(input,67,FOLLOW_67_in_rule__EncodedType__Group__110836); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5356:1: rule__ShortVectorType__Group__0 : ( () ) rule__ShortVectorType__Group__1 ;
    public final void rule__ShortVectorType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5360:1: ( ( () ) rule__ShortVectorType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5361:1: ( () ) rule__ShortVectorType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5361:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5362:1: ()
            {
             before(grammarAccess.getShortVectorTypeAccess().getShortVectorTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5363:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5365:1: 
            {
            }

             after(grammarAccess.getShortVectorTypeAccess().getShortVectorTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__ShortVectorType__Group__1_in_rule__ShortVectorType__Group__010885);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5376:1: rule__ShortVectorType__Group__1 : ( 'vector<short>' ) ;
    public final void rule__ShortVectorType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5380:1: ( ( 'vector<short>' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5381:1: ( 'vector<short>' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5381:1: ( 'vector<short>' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5382:1: 'vector<short>'
            {
             before(grammarAccess.getShortVectorTypeAccess().getVectorShortKeyword_1()); 
            match(input,68,FOLLOW_68_in_rule__ShortVectorType__Group__110914); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5399:1: rule__IntVectorType__Group__0 : ( () ) rule__IntVectorType__Group__1 ;
    public final void rule__IntVectorType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5403:1: ( ( () ) rule__IntVectorType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5404:1: ( () ) rule__IntVectorType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5404:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5405:1: ()
            {
             before(grammarAccess.getIntVectorTypeAccess().getIntVectorTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5406:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5408:1: 
            {
            }

             after(grammarAccess.getIntVectorTypeAccess().getIntVectorTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__IntVectorType__Group__1_in_rule__IntVectorType__Group__010963);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5419:1: rule__IntVectorType__Group__1 : ( 'vector<int>' ) ;
    public final void rule__IntVectorType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5423:1: ( ( 'vector<int>' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5424:1: ( 'vector<int>' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5424:1: ( 'vector<int>' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5425:1: 'vector<int>'
            {
             before(grammarAccess.getIntVectorTypeAccess().getVectorIntKeyword_1()); 
            match(input,69,FOLLOW_69_in_rule__IntVectorType__Group__110992); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5442:1: rule__FloatVectorType__Group__0 : ( () ) rule__FloatVectorType__Group__1 ;
    public final void rule__FloatVectorType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5446:1: ( ( () ) rule__FloatVectorType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5447:1: ( () ) rule__FloatVectorType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5447:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5448:1: ()
            {
             before(grammarAccess.getFloatVectorTypeAccess().getFloatVectorTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5449:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5451:1: 
            {
            }

             after(grammarAccess.getFloatVectorTypeAccess().getFloatVectorTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__FloatVectorType__Group__1_in_rule__FloatVectorType__Group__011041);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5462:1: rule__FloatVectorType__Group__1 : ( 'vector<float>' ) ;
    public final void rule__FloatVectorType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5466:1: ( ( 'vector<float>' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5467:1: ( 'vector<float>' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5467:1: ( 'vector<float>' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5468:1: 'vector<float>'
            {
             before(grammarAccess.getFloatVectorTypeAccess().getVectorFloatKeyword_1()); 
            match(input,70,FOLLOW_70_in_rule__FloatVectorType__Group__111070); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5485:1: rule__DoubleVectorType__Group__0 : ( () ) rule__DoubleVectorType__Group__1 ;
    public final void rule__DoubleVectorType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5489:1: ( ( () ) rule__DoubleVectorType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5490:1: ( () ) rule__DoubleVectorType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5490:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5491:1: ()
            {
             before(grammarAccess.getDoubleVectorTypeAccess().getDoubleVectorTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5492:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5494:1: 
            {
            }

             after(grammarAccess.getDoubleVectorTypeAccess().getDoubleVectorTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__DoubleVectorType__Group__1_in_rule__DoubleVectorType__Group__011119);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5505:1: rule__DoubleVectorType__Group__1 : ( 'vector<double>' ) ;
    public final void rule__DoubleVectorType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5509:1: ( ( 'vector<double>' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5510:1: ( 'vector<double>' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5510:1: ( 'vector<double>' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5511:1: 'vector<double>'
            {
             before(grammarAccess.getDoubleVectorTypeAccess().getVectorDoubleKeyword_1()); 
            match(input,71,FOLLOW_71_in_rule__DoubleVectorType__Group__111148); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5528:1: rule__StringVectorType__Group__0 : ( () ) rule__StringVectorType__Group__1 ;
    public final void rule__StringVectorType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5532:1: ( ( () ) rule__StringVectorType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5533:1: ( () ) rule__StringVectorType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5533:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5534:1: ()
            {
             before(grammarAccess.getStringVectorTypeAccess().getStringVectorTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5535:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5537:1: 
            {
            }

             after(grammarAccess.getStringVectorTypeAccess().getStringVectorTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__StringVectorType__Group__1_in_rule__StringVectorType__Group__011197);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5548:1: rule__StringVectorType__Group__1 : ( 'vector<string>' ) ;
    public final void rule__StringVectorType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5552:1: ( ( 'vector<string>' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5553:1: ( 'vector<string>' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5553:1: ( 'vector<string>' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5554:1: 'vector<string>'
            {
             before(grammarAccess.getStringVectorTypeAccess().getVectorStringKeyword_1()); 
            match(input,72,FOLLOW_72_in_rule__StringVectorType__Group__111226); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5571:1: rule__PogoSystem__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__PogoSystem__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5575:1: ( ( ruleImport ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5576:1: ( ruleImport )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5576:1: ( ruleImport )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5577:1: ruleImport
            {
             before(grammarAccess.getPogoSystemAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__PogoSystem__ImportsAssignment_011265);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5586:1: rule__PogoSystem__ClassesAssignment_1 : ( rulePogoDeviceClass ) ;
    public final void rule__PogoSystem__ClassesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5590:1: ( ( rulePogoDeviceClass ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5591:1: ( rulePogoDeviceClass )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5591:1: ( rulePogoDeviceClass )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5592:1: rulePogoDeviceClass
            {
             before(grammarAccess.getPogoSystemAccess().getClassesPogoDeviceClassParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePogoDeviceClass_in_rule__PogoSystem__ClassesAssignment_111296);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5601:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5605:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5606:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5606:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5607:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_111327); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5616:1: rule__PogoDeviceClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PogoDeviceClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5620:1: ( ( RULE_ID ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5621:1: ( RULE_ID )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5621:1: ( RULE_ID )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5622:1: RULE_ID
            {
             before(grammarAccess.getPogoDeviceClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PogoDeviceClass__NameAssignment_111358); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5631:1: rule__PogoDeviceClass__IsAbstractAssignment_2 : ( ( 'abstract' ) ) ;
    public final void rule__PogoDeviceClass__IsAbstractAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5635:1: ( ( ( 'abstract' ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5636:1: ( ( 'abstract' ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5636:1: ( ( 'abstract' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5637:1: ( 'abstract' )
            {
             before(grammarAccess.getPogoDeviceClassAccess().getIsAbstractAbstractKeyword_2_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5638:1: ( 'abstract' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5639:1: 'abstract'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getIsAbstractAbstractKeyword_2_0()); 
            match(input,73,FOLLOW_73_in_rule__PogoDeviceClass__IsAbstractAssignment_211394); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5654:1: rule__PogoDeviceClass__BaseClassAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__PogoDeviceClass__BaseClassAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5658:1: ( ( ( RULE_ID ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5659:1: ( ( RULE_ID ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5659:1: ( ( RULE_ID ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5660:1: ( RULE_ID )
            {
             before(grammarAccess.getPogoDeviceClassAccess().getBaseClassPogoDeviceClassCrossReference_3_1_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5661:1: ( RULE_ID )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5662:1: RULE_ID
            {
             before(grammarAccess.getPogoDeviceClassAccess().getBaseClassPogoDeviceClassIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PogoDeviceClass__BaseClassAssignment_3_111437); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5673:1: rule__PogoDeviceClass__InstituteAssignment_5 : ( RULE_ID ) ;
    public final void rule__PogoDeviceClass__InstituteAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5677:1: ( ( RULE_ID ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5678:1: ( RULE_ID )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5678:1: ( RULE_ID )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5679:1: RULE_ID
            {
             before(grammarAccess.getPogoDeviceClassAccess().getInstituteIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PogoDeviceClass__InstituteAssignment_511472); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5688:1: rule__PogoDeviceClass__DescriptionAssignment_7 : ( ruleClassDescription ) ;
    public final void rule__PogoDeviceClass__DescriptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5692:1: ( ( ruleClassDescription ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5693:1: ( ruleClassDescription )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5693:1: ( ruleClassDescription )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5694:1: ruleClassDescription
            {
             before(grammarAccess.getPogoDeviceClassAccess().getDescriptionClassDescriptionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleClassDescription_in_rule__PogoDeviceClass__DescriptionAssignment_711503);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5703:1: rule__PogoDeviceClass__ClassPropertiesAssignment_9 : ( ruleProperty ) ;
    public final void rule__PogoDeviceClass__ClassPropertiesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5707:1: ( ( ruleProperty ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5708:1: ( ruleProperty )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5708:1: ( ruleProperty )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5709:1: ruleProperty
            {
             before(grammarAccess.getPogoDeviceClassAccess().getClassPropertiesPropertyParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__PogoDeviceClass__ClassPropertiesAssignment_911534);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5718:1: rule__PogoDeviceClass__DevicePropertiesAssignment_11 : ( ruleProperty ) ;
    public final void rule__PogoDeviceClass__DevicePropertiesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5722:1: ( ( ruleProperty ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5723:1: ( ruleProperty )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5723:1: ( ruleProperty )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5724:1: ruleProperty
            {
             before(grammarAccess.getPogoDeviceClassAccess().getDevicePropertiesPropertyParserRuleCall_11_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__PogoDeviceClass__DevicePropertiesAssignment_1111565);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5733:1: rule__PogoDeviceClass__CommandsAssignment_13 : ( ruleCommand ) ;
    public final void rule__PogoDeviceClass__CommandsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5737:1: ( ( ruleCommand ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5738:1: ( ruleCommand )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5738:1: ( ruleCommand )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5739:1: ruleCommand
            {
             before(grammarAccess.getPogoDeviceClassAccess().getCommandsCommandParserRuleCall_13_0()); 
            pushFollow(FOLLOW_ruleCommand_in_rule__PogoDeviceClass__CommandsAssignment_1311596);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5748:1: rule__PogoDeviceClass__AttributesAssignment_15 : ( ruleAttribute ) ;
    public final void rule__PogoDeviceClass__AttributesAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5752:1: ( ( ruleAttribute ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5753:1: ( ruleAttribute )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5753:1: ( ruleAttribute )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5754:1: ruleAttribute
            {
             before(grammarAccess.getPogoDeviceClassAccess().getAttributesAttributeParserRuleCall_15_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__PogoDeviceClass__AttributesAssignment_1511627);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5763:1: rule__PogoDeviceClass__StatesAssignment_17 : ( ruleState ) ;
    public final void rule__PogoDeviceClass__StatesAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5767:1: ( ( ruleState ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5768:1: ( ruleState )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5768:1: ( ruleState )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5769:1: ruleState
            {
             before(grammarAccess.getPogoDeviceClassAccess().getStatesStateParserRuleCall_17_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__PogoDeviceClass__StatesAssignment_1711658);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5778:1: rule__ClassDescription__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ClassDescription__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5782:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5783:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5783:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5784:1: RULE_STRING
            {
             before(grammarAccess.getClassDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassDescription__DescriptionAssignment_011689); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5793:1: rule__ClassDescription__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ClassDescription__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5797:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5798:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5798:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5799:1: RULE_STRING
            {
             before(grammarAccess.getClassDescriptionAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassDescription__TitleAssignment_111720); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5808:1: rule__ClassDescription__SourcePathAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ClassDescription__SourcePathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5812:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5813:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5813:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5814:1: RULE_STRING
            {
             before(grammarAccess.getClassDescriptionAccess().getSourcePathSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassDescription__SourcePathAssignment_211751); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5823:1: rule__ClassDescription__InheritancesAssignment_4 : ( ruleInheritance ) ;
    public final void rule__ClassDescription__InheritancesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5827:1: ( ( ruleInheritance ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5828:1: ( ruleInheritance )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5828:1: ( ruleInheritance )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5829:1: ruleInheritance
            {
             before(grammarAccess.getClassDescriptionAccess().getInheritancesInheritanceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInheritance_in_rule__ClassDescription__InheritancesAssignment_411782);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5838:1: rule__ClassDescription__LanguageAssignment_5 : ( ruleLanguage ) ;
    public final void rule__ClassDescription__LanguageAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5842:1: ( ( ruleLanguage ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5843:1: ( ruleLanguage )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5843:1: ( ruleLanguage )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5844:1: ruleLanguage
            {
             before(grammarAccess.getClassDescriptionAccess().getLanguageLanguageParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleLanguage_in_rule__ClassDescription__LanguageAssignment_511813);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5853:1: rule__ClassDescription__FilestogenerateAssignment_6 : ( RULE_STRING ) ;
    public final void rule__ClassDescription__FilestogenerateAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5857:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5858:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5858:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5859:1: RULE_STRING
            {
             before(grammarAccess.getClassDescriptionAccess().getFilestogenerateSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassDescription__FilestogenerateAssignment_611844); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5868:1: rule__ClassDescription__IdentificationAssignment_7 : ( ruleClassIdentification ) ;
    public final void rule__ClassDescription__IdentificationAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5872:1: ( ( ruleClassIdentification ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5873:1: ( ruleClassIdentification )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5873:1: ( ruleClassIdentification )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5874:1: ruleClassIdentification
            {
             before(grammarAccess.getClassDescriptionAccess().getIdentificationClassIdentificationParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleClassIdentification_in_rule__ClassDescription__IdentificationAssignment_711875);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5883:1: rule__ClassDescription__CommentsAssignment_8 : ( ruleComments ) ;
    public final void rule__ClassDescription__CommentsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5887:1: ( ( ruleComments ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5888:1: ( ruleComments )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5888:1: ( ruleComments )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5889:1: ruleComments
            {
             before(grammarAccess.getClassDescriptionAccess().getCommentsCommentsParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleComments_in_rule__ClassDescription__CommentsAssignment_811906);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5898:1: rule__Inheritance__ClassnameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Inheritance__ClassnameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5902:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5903:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5903:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5904:1: RULE_STRING
            {
             before(grammarAccess.getInheritanceAccess().getClassnameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Inheritance__ClassnameAssignment_011937); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5913:1: rule__Inheritance__SourcePathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Inheritance__SourcePathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5917:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5918:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5918:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5919:1: RULE_STRING
            {
             before(grammarAccess.getInheritanceAccess().getSourcePathSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Inheritance__SourcePathAssignment_111968); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5928:1: rule__ClassIdentification__ContactAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ClassIdentification__ContactAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5932:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5933:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5933:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5934:1: RULE_STRING
            {
             before(grammarAccess.getClassIdentificationAccess().getContactSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassIdentification__ContactAssignment_011999); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5943:1: rule__ClassIdentification__ClassFamilyAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ClassIdentification__ClassFamilyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5947:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5948:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5948:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5949:1: RULE_STRING
            {
             before(grammarAccess.getClassIdentificationAccess().getClassFamilySTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassIdentification__ClassFamilyAssignment_112030); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5958:1: rule__ClassIdentification__SiteSpecificAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ClassIdentification__SiteSpecificAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5962:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5963:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5963:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5964:1: RULE_STRING
            {
             before(grammarAccess.getClassIdentificationAccess().getSiteSpecificSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassIdentification__SiteSpecificAssignment_212061); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5973:1: rule__ClassIdentification__PlatformAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ClassIdentification__PlatformAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5977:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5978:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5978:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5979:1: RULE_STRING
            {
             before(grammarAccess.getClassIdentificationAccess().getPlatformSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassIdentification__PlatformAssignment_312092); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5988:1: rule__ClassIdentification__BusAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ClassIdentification__BusAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5992:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5993:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5993:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5994:1: RULE_STRING
            {
             before(grammarAccess.getClassIdentificationAccess().getBusSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassIdentification__BusAssignment_412123); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6003:1: rule__ClassIdentification__ManufacturerAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ClassIdentification__ManufacturerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6007:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6008:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6008:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6009:1: RULE_STRING
            {
             before(grammarAccess.getClassIdentificationAccess().getManufacturerSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassIdentification__ManufacturerAssignment_512154); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6018:1: rule__ClassIdentification__ReferenceAssignment_6 : ( RULE_STRING ) ;
    public final void rule__ClassIdentification__ReferenceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6022:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6023:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6023:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6024:1: RULE_STRING
            {
             before(grammarAccess.getClassIdentificationAccess().getReferenceSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassIdentification__ReferenceAssignment_612185); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6033:1: rule__Comments__CommandsTableAssignment : ( RULE_STRING ) ;
    public final void rule__Comments__CommandsTableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6037:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6038:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6038:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6039:1: RULE_STRING
            {
             before(grammarAccess.getCommentsAccess().getCommandsTableSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Comments__CommandsTableAssignment12216); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6048:1: rule__State__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6052:1: ( ( RULE_ID ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6053:1: ( RULE_ID )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6053:1: ( RULE_ID )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6054:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_012247); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6063:1: rule__State__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__State__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6067:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6068:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6068:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6069:1: RULE_STRING
            {
             before(grammarAccess.getStateAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__State__DescriptionAssignment_112278); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6078:1: rule__Property__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6082:1: ( ( RULE_ID ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6083:1: ( RULE_ID )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6083:1: ( RULE_ID )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6084:1: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__NameAssignment_012309); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6093:1: rule__Property__TypeAssignment_1 : ( rulePropType ) ;
    public final void rule__Property__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6097:1: ( ( rulePropType ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6098:1: ( rulePropType )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6098:1: ( rulePropType )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6099:1: rulePropType
            {
             before(grammarAccess.getPropertyAccess().getTypePropTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePropType_in_rule__Property__TypeAssignment_112340);
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


    // $ANTLR start rule__Property__StatusAssignment_2
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6108:1: rule__Property__StatusAssignment_2 : ( ruleInheritanceStatus ) ;
    public final void rule__Property__StatusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6112:1: ( ( ruleInheritanceStatus ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6113:1: ( ruleInheritanceStatus )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6113:1: ( ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6114:1: ruleInheritanceStatus
            {
             before(grammarAccess.getPropertyAccess().getStatusInheritanceStatusParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleInheritanceStatus_in_rule__Property__StatusAssignment_212371);
            ruleInheritanceStatus();
            _fsp--;

             after(grammarAccess.getPropertyAccess().getStatusInheritanceStatusParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__StatusAssignment_2


    // $ANTLR start rule__Property__DescriptionAssignment_3
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6123:1: rule__Property__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Property__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6127:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6128:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6128:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6129:1: RULE_STRING
            {
             before(grammarAccess.getPropertyAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Property__DescriptionAssignment_312402); 
             after(grammarAccess.getPropertyAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__DescriptionAssignment_3


    // $ANTLR start rule__Property__DefaultPropValueAssignment_5
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6138:1: rule__Property__DefaultPropValueAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Property__DefaultPropValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6142:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6143:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6143:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6144:1: RULE_STRING
            {
             before(grammarAccess.getPropertyAccess().getDefaultPropValueSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Property__DefaultPropValueAssignment_512433); 
             after(grammarAccess.getPropertyAccess().getDefaultPropValueSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__DefaultPropValueAssignment_5


    // $ANTLR start rule__InheritanceStatus__AbstractAssignment_0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6153:1: rule__InheritanceStatus__AbstractAssignment_0 : ( ruleBoolean ) ;
    public final void rule__InheritanceStatus__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6157:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6158:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6158:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6159:1: ruleBoolean
            {
             before(grammarAccess.getInheritanceStatusAccess().getAbstractBooleanParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__InheritanceStatus__AbstractAssignment_012464);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getInheritanceStatusAccess().getAbstractBooleanParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InheritanceStatus__AbstractAssignment_0


    // $ANTLR start rule__InheritanceStatus__InheritedAssignment_1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6168:1: rule__InheritanceStatus__InheritedAssignment_1 : ( ruleBoolean ) ;
    public final void rule__InheritanceStatus__InheritedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6172:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6173:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6173:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6174:1: ruleBoolean
            {
             before(grammarAccess.getInheritanceStatusAccess().getInheritedBooleanParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__InheritanceStatus__InheritedAssignment_112495);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getInheritanceStatusAccess().getInheritedBooleanParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InheritanceStatus__InheritedAssignment_1


    // $ANTLR start rule__InheritanceStatus__ConcreteAssignment_2
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6183:1: rule__InheritanceStatus__ConcreteAssignment_2 : ( ruleBoolean ) ;
    public final void rule__InheritanceStatus__ConcreteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6187:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6188:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6188:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6189:1: ruleBoolean
            {
             before(grammarAccess.getInheritanceStatusAccess().getConcreteBooleanParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__InheritanceStatus__ConcreteAssignment_212526);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getInheritanceStatusAccess().getConcreteBooleanParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InheritanceStatus__ConcreteAssignment_2


    // $ANTLR start rule__InheritanceStatus__ConcreteHereAssignment_3
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6198:1: rule__InheritanceStatus__ConcreteHereAssignment_3 : ( ruleBoolean ) ;
    public final void rule__InheritanceStatus__ConcreteHereAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6202:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6203:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6203:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6204:1: ruleBoolean
            {
             before(grammarAccess.getInheritanceStatusAccess().getConcreteHereBooleanParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__InheritanceStatus__ConcreteHereAssignment_312557);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getInheritanceStatusAccess().getConcreteHereBooleanParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InheritanceStatus__ConcreteHereAssignment_3


    // $ANTLR start rule__InheritanceStatus__HasChangedAssignment_4
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6213:1: rule__InheritanceStatus__HasChangedAssignment_4 : ( ruleBoolean ) ;
    public final void rule__InheritanceStatus__HasChangedAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6217:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6218:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6218:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6219:1: ruleBoolean
            {
             before(grammarAccess.getInheritanceStatusAccess().getHasChangedBooleanParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__InheritanceStatus__HasChangedAssignment_412588);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getInheritanceStatusAccess().getHasChangedBooleanParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InheritanceStatus__HasChangedAssignment_4


    // $ANTLR start rule__Command__NameAssignment_0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6228:1: rule__Command__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Command__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6232:1: ( ( RULE_ID ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6233:1: ( RULE_ID )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6233:1: ( RULE_ID )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6234:1: RULE_ID
            {
             before(grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Command__NameAssignment_012619); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6243:1: rule__Command__ArginAssignment_1 : ( ruleArgument ) ;
    public final void rule__Command__ArginAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6247:1: ( ( ruleArgument ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6248:1: ( ruleArgument )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6248:1: ( ruleArgument )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6249:1: ruleArgument
            {
             before(grammarAccess.getCommandAccess().getArginArgumentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Command__ArginAssignment_112650);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6258:1: rule__Command__ArgoutAssignment_2 : ( ruleArgument ) ;
    public final void rule__Command__ArgoutAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6262:1: ( ( ruleArgument ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6263:1: ( ruleArgument )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6263:1: ( ruleArgument )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6264:1: ruleArgument
            {
             before(grammarAccess.getCommandAccess().getArgoutArgumentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Command__ArgoutAssignment_212681);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6273:1: rule__Command__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Command__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6277:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6278:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6278:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6279:1: RULE_STRING
            {
             before(grammarAccess.getCommandAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Command__DescriptionAssignment_312712); 
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


    // $ANTLR start rule__Command__StatusAssignment_4
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6288:1: rule__Command__StatusAssignment_4 : ( ruleInheritanceStatus ) ;
    public final void rule__Command__StatusAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6292:1: ( ( ruleInheritanceStatus ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6293:1: ( ruleInheritanceStatus )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6293:1: ( ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6294:1: ruleInheritanceStatus
            {
             before(grammarAccess.getCommandAccess().getStatusInheritanceStatusParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInheritanceStatus_in_rule__Command__StatusAssignment_412743);
            ruleInheritanceStatus();
            _fsp--;

             after(grammarAccess.getCommandAccess().getStatusInheritanceStatusParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Command__StatusAssignment_4


    // $ANTLR start rule__Command__ExecMethodAssignment_5
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6303:1: rule__Command__ExecMethodAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Command__ExecMethodAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6307:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6308:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6308:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6309:1: RULE_STRING
            {
             before(grammarAccess.getCommandAccess().getExecMethodSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Command__ExecMethodAssignment_512774); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6318:1: rule__Command__DisplayLevelAssignment_6 : ( ruleDisplayLevel ) ;
    public final void rule__Command__DisplayLevelAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6322:1: ( ( ruleDisplayLevel ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6323:1: ( ruleDisplayLevel )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6323:1: ( ruleDisplayLevel )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6324:1: ruleDisplayLevel
            {
             before(grammarAccess.getCommandAccess().getDisplayLevelDisplayLevelParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleDisplayLevel_in_rule__Command__DisplayLevelAssignment_612805);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6333:1: rule__Command__PolledPeriodAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Command__PolledPeriodAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6337:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6338:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6338:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6339:1: RULE_STRING
            {
             before(grammarAccess.getCommandAccess().getPolledPeriodSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Command__PolledPeriodAssignment_712836); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6348:1: rule__Command__ExcludedStatesAssignment_9 : ( RULE_STRING ) ;
    public final void rule__Command__ExcludedStatesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6352:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6353:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6353:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6354:1: RULE_STRING
            {
             before(grammarAccess.getCommandAccess().getExcludedStatesSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Command__ExcludedStatesAssignment_912867); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6363:1: rule__Argument__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Argument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6367:1: ( ( ruleType ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6368:1: ( ruleType )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6368:1: ( ruleType )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6369:1: ruleType
            {
             before(grammarAccess.getArgumentAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Argument__TypeAssignment_012898);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6378:1: rule__Argument__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Argument__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6382:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6383:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6383:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6384:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__DescriptionAssignment_112929); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6393:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6397:1: ( ( RULE_ID ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6398:1: ( RULE_ID )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6398:1: ( RULE_ID )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6399:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_012960); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6408:1: rule__Attribute__AttTypeAssignment_1 : ( ruleAttrType ) ;
    public final void rule__Attribute__AttTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6412:1: ( ( ruleAttrType ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6413:1: ( ruleAttrType )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6413:1: ( ruleAttrType )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6414:1: ruleAttrType
            {
             before(grammarAccess.getAttributeAccess().getAttTypeAttrTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttrType_in_rule__Attribute__AttTypeAssignment_112991);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6423:1: rule__Attribute__DataTypeAssignment_2 : ( ruleType ) ;
    public final void rule__Attribute__DataTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6427:1: ( ( ruleType ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6428:1: ( ruleType )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6428:1: ( ruleType )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6429:1: ruleType
            {
             before(grammarAccess.getAttributeAccess().getDataTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Attribute__DataTypeAssignment_213022);
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


    // $ANTLR start rule__Attribute__RwTypeAssignment_3
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6438:1: rule__Attribute__RwTypeAssignment_3 : ( ruleRW_Type ) ;
    public final void rule__Attribute__RwTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6442:1: ( ( ruleRW_Type ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6443:1: ( ruleRW_Type )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6443:1: ( ruleRW_Type )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6444:1: ruleRW_Type
            {
             before(grammarAccess.getAttributeAccess().getRwTypeRW_TypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRW_Type_in_rule__Attribute__RwTypeAssignment_313053);
            ruleRW_Type();
            _fsp--;

             after(grammarAccess.getAttributeAccess().getRwTypeRW_TypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__RwTypeAssignment_3


    // $ANTLR start rule__Attribute__DisplayLevelAssignment_4
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6453:1: rule__Attribute__DisplayLevelAssignment_4 : ( ruleDisplayLevel ) ;
    public final void rule__Attribute__DisplayLevelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6457:1: ( ( ruleDisplayLevel ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6458:1: ( ruleDisplayLevel )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6458:1: ( ruleDisplayLevel )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6459:1: ruleDisplayLevel
            {
             before(grammarAccess.getAttributeAccess().getDisplayLevelDisplayLevelParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleDisplayLevel_in_rule__Attribute__DisplayLevelAssignment_413084);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6468:1: rule__Attribute__PolledPeriodAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Attribute__PolledPeriodAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6472:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6473:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6473:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6474:1: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getPolledPeriodSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__PolledPeriodAssignment_513115); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6483:1: rule__Attribute__MaxXAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Attribute__MaxXAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6487:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6488:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6488:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6489:1: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getMaxXSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__MaxXAssignment_613146); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6498:1: rule__Attribute__MaxYAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Attribute__MaxYAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6502:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6503:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6503:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6504:1: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getMaxYSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__MaxYAssignment_713177); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6513:1: rule__Attribute__MemorizedAssignment_8 : ( ruleBoolean ) ;
    public final void rule__Attribute__MemorizedAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6517:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6518:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6518:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6519:1: ruleBoolean
            {
             before(grammarAccess.getAttributeAccess().getMemorizedBooleanParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__Attribute__MemorizedAssignment_813208);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6528:1: rule__Attribute__MemorizedAtInitAssignment_9 : ( ruleBoolean ) ;
    public final void rule__Attribute__MemorizedAtInitAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6532:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6533:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6533:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6534:1: ruleBoolean
            {
             before(grammarAccess.getAttributeAccess().getMemorizedAtInitBooleanParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__Attribute__MemorizedAtInitAssignment_913239);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6543:1: rule__Attribute__ChangeEventAssignment_10 : ( ruleFireEvents ) ;
    public final void rule__Attribute__ChangeEventAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6547:1: ( ( ruleFireEvents ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6548:1: ( ruleFireEvents )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6548:1: ( ruleFireEvents )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6549:1: ruleFireEvents
            {
             before(grammarAccess.getAttributeAccess().getChangeEventFireEventsParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleFireEvents_in_rule__Attribute__ChangeEventAssignment_1013270);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6558:1: rule__Attribute__ArchiveEventAssignment_11 : ( ruleFireEvents ) ;
    public final void rule__Attribute__ArchiveEventAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6562:1: ( ( ruleFireEvents ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6563:1: ( ruleFireEvents )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6563:1: ( ruleFireEvents )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6564:1: ruleFireEvents
            {
             before(grammarAccess.getAttributeAccess().getArchiveEventFireEventsParserRuleCall_11_0()); 
            pushFollow(FOLLOW_ruleFireEvents_in_rule__Attribute__ArchiveEventAssignment_1113301);
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


    // $ANTLR start rule__Attribute__StatusAssignment_12
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6573:1: rule__Attribute__StatusAssignment_12 : ( ruleInheritanceStatus ) ;
    public final void rule__Attribute__StatusAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6577:1: ( ( ruleInheritanceStatus ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6578:1: ( ruleInheritanceStatus )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6578:1: ( ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6579:1: ruleInheritanceStatus
            {
             before(grammarAccess.getAttributeAccess().getStatusInheritanceStatusParserRuleCall_12_0()); 
            pushFollow(FOLLOW_ruleInheritanceStatus_in_rule__Attribute__StatusAssignment_1213332);
            ruleInheritanceStatus();
            _fsp--;

             after(grammarAccess.getAttributeAccess().getStatusInheritanceStatusParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__StatusAssignment_12


    // $ANTLR start rule__Attribute__PropertiesAssignment_13
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6588:1: rule__Attribute__PropertiesAssignment_13 : ( ruleAttrProperties ) ;
    public final void rule__Attribute__PropertiesAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6592:1: ( ( ruleAttrProperties ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6593:1: ( ruleAttrProperties )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6593:1: ( ruleAttrProperties )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6594:1: ruleAttrProperties
            {
             before(grammarAccess.getAttributeAccess().getPropertiesAttrPropertiesParserRuleCall_13_0()); 
            pushFollow(FOLLOW_ruleAttrProperties_in_rule__Attribute__PropertiesAssignment_1313363);
            ruleAttrProperties();
            _fsp--;

             after(grammarAccess.getAttributeAccess().getPropertiesAttrPropertiesParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__PropertiesAssignment_13


    // $ANTLR start rule__Attribute__ExcludedStatesAssignment_15
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6603:1: rule__Attribute__ExcludedStatesAssignment_15 : ( RULE_STRING ) ;
    public final void rule__Attribute__ExcludedStatesAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6607:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6608:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6608:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6609:1: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getExcludedStatesSTRINGTerminalRuleCall_15_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__ExcludedStatesAssignment_1513394); 
             after(grammarAccess.getAttributeAccess().getExcludedStatesSTRINGTerminalRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__ExcludedStatesAssignment_15


    // $ANTLR start rule__FireEvents__FireAssignment_0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6618:1: rule__FireEvents__FireAssignment_0 : ( ruleBoolean ) ;
    public final void rule__FireEvents__FireAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6622:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6623:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6623:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6624:1: ruleBoolean
            {
             before(grammarAccess.getFireEventsAccess().getFireBooleanParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__FireEvents__FireAssignment_013425);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6633:1: rule__FireEvents__LibCheckCriteriaAssignment_1 : ( ruleBoolean ) ;
    public final void rule__FireEvents__LibCheckCriteriaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6637:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6638:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6638:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6639:1: ruleBoolean
            {
             before(grammarAccess.getFireEventsAccess().getLibCheckCriteriaBooleanParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__FireEvents__LibCheckCriteriaAssignment_113456);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6648:1: rule__AttrProperties__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6652:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6653:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6653:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6654:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__DescriptionAssignment_013487); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6663:1: rule__AttrProperties__LabelAssignment_1 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6667:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6668:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6668:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6669:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getLabelSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__LabelAssignment_113518); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6678:1: rule__AttrProperties__UnitAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__UnitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6682:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6683:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6683:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6684:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getUnitSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__UnitAssignment_213549); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6693:1: rule__AttrProperties__StandardUnitAssignment_3 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__StandardUnitAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6697:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6698:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6698:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6699:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getStandardUnitSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__StandardUnitAssignment_313580); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6708:1: rule__AttrProperties__DisplayUnitAssignment_4 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__DisplayUnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6712:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6713:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6713:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6714:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getDisplayUnitSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__DisplayUnitAssignment_413611); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6723:1: rule__AttrProperties__FormatAssignment_5 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__FormatAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6727:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6728:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6728:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6729:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getFormatSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__FormatAssignment_513642); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6738:1: rule__AttrProperties__MaxValueAssignment_6 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__MaxValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6742:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6743:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6743:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6744:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getMaxValueSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__MaxValueAssignment_613673); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6753:1: rule__AttrProperties__MinValueAssignment_7 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__MinValueAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6757:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6758:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6758:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6759:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getMinValueSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__MinValueAssignment_713704); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6768:1: rule__AttrProperties__MaxAlarmAssignment_8 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__MaxAlarmAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6772:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6773:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6773:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6774:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getMaxAlarmSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__MaxAlarmAssignment_813735); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6783:1: rule__AttrProperties__MinAlarmAssignment_9 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__MinAlarmAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6787:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6788:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6788:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6789:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getMinAlarmSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__MinAlarmAssignment_913766); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6798:1: rule__AttrProperties__MaxWarningAssignment_10 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__MaxWarningAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6802:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6803:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6803:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6804:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getMaxWarningSTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__MaxWarningAssignment_1013797); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6813:1: rule__AttrProperties__MinWarningAssignment_11 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__MinWarningAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6817:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6818:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6818:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6819:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getMinWarningSTRINGTerminalRuleCall_11_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__MinWarningAssignment_1113828); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6828:1: rule__AttrProperties__DeltaTimeAssignment_12 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__DeltaTimeAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6832:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6833:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6833:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6834:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getDeltaTimeSTRINGTerminalRuleCall_12_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__DeltaTimeAssignment_1213859); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6843:1: rule__AttrProperties__DeltaValueAssignment_13 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__DeltaValueAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6847:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6848:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6848:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6849:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getDeltaValueSTRINGTerminalRuleCall_13_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__DeltaValueAssignment_1313890); 
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
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_entryRuleInheritanceStatus1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInheritanceStatus1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InheritanceStatus__Group__0_in_ruleInheritanceStatus1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__0_in_ruleCommand1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument1200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0_in_ruleArgument1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFireEvents_in_entryRuleFireEvents1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFireEvents1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FireEvents__Group__0_in_ruleFireEvents1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrProperties_in_entryRuleAttrProperties1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrProperties1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__0_in_ruleAttrProperties1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidType_in_entryRuleVoidType1500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVoidType1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VoidType__Group__0_in_ruleVoidType1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_entryRuleBooleanType1560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanType1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanType__Group__0_in_ruleBooleanType1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortType_in_entryRuleShortType1620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortType1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortType__Group__0_in_ruleShortType1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortType_in_entryRuleUShortType1680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUShortType1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UShortType__Group__0_in_ruleUShortType1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_entryRuleIntType1740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntType1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntType__Group__0_in_ruleIntType1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntType_in_entryRuleUIntType1800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIntType1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIntType__Group__0_in_ruleUIntType1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_entryRuleFloatType1860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatType1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatType__Group__0_in_ruleFloatType1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_entryRuleDoubleType1920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleType1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleType__Group__0_in_ruleDoubleType1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType1980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group__0_in_ruleStringType2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharArrayType_in_entryRuleCharArrayType2040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharArrayType2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharArrayType__Group__0_in_ruleCharArrayType2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortArrayType_in_entryRuleShortArrayType2100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortArrayType2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortArrayType__Group__0_in_ruleShortArrayType2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortArrayType_in_entryRuleUShortArrayType2160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUShortArrayType2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UShortArrayType__Group__0_in_ruleUShortArrayType2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntArrayType_in_entryRuleIntArrayType2220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntArrayType2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntArrayType__Group__0_in_ruleIntArrayType2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntArrayType_in_entryRuleUIntArrayType2280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIntArrayType2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIntArrayType__Group__0_in_ruleUIntArrayType2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatArrayType_in_entryRuleFloatArrayType2340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatArrayType2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatArrayType__Group__0_in_ruleFloatArrayType2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleArrayType_in_entryRuleDoubleArrayType2400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleArrayType2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleArrayType__Group__0_in_ruleDoubleArrayType2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringArrayType_in_entryRuleStringArrayType2460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringArrayType2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringArrayType__Group__0_in_ruleStringArrayType2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongStringArrayType_in_entryRuleLongStringArrayType2520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongStringArrayType2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongStringArrayType__Group__0_in_ruleLongStringArrayType2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleStringArrayType_in_entryRuleDoubleStringArrayType2580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleStringArrayType2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleStringArrayType__Group__0_in_ruleDoubleStringArrayType2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_entryRuleStateType2640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateType2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateType__Group__0_in_ruleStateType2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstStringType_in_entryRuleConstStringType2700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstStringType2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstStringType__Group__0_in_ruleConstStringType2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanArrayType_in_entryRuleBooleanArrayType2760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanArrayType2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanArrayType__Group__0_in_ruleBooleanArrayType2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUCharType_in_entryRuleUCharType2820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUCharType2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UCharType__Group__0_in_ruleUCharType2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_entryRuleLongType2880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongType2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongType__Group__0_in_ruleLongType2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongType_in_entryRuleULongType2940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleULongType2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ULongType__Group__0_in_ruleULongType2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongArrayType_in_entryRuleLongArrayType3000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongArrayType3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongArrayType__Group__0_in_ruleLongArrayType3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongArrayType_in_entryRuleULongArrayType3060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleULongArrayType3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ULongArrayType__Group__0_in_ruleULongArrayType3094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDevIntType_in_entryRuleDevIntType3120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDevIntType3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DevIntType__Group__0_in_ruleDevIntType3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncodedType_in_entryRuleEncodedType3180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEncodedType3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodedType__Group__0_in_ruleEncodedType3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortVectorType_in_entryRuleShortVectorType3240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortVectorType3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortVectorType__Group__0_in_ruleShortVectorType3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntVectorType_in_entryRuleIntVectorType3300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntVectorType3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntVectorType__Group__0_in_ruleIntVectorType3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatVectorType_in_entryRuleFloatVectorType3360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatVectorType3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatVectorType__Group__0_in_ruleFloatVectorType3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleVectorType_in_entryRuleDoubleVectorType3420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleVectorType3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleVectorType__Group__0_in_ruleDoubleVectorType3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVectorType_in_entryRuleStringVectorType3480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringVectorType3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVectorType__Group__0_in_ruleStringVectorType3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Language__Alternatives3551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Language__Alternatives3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Language__Alternatives3591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DisplayLevel__Alternatives3626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DisplayLevel__Alternatives3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AttrType__Alternatives3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AttrType__Alternatives3701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AttrType__Alternatives3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RW_Type__Alternatives3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RW_Type__Alternatives3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RW_Type__Alternatives3796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RW_Type__Alternatives3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Boolean__Alternatives3851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Boolean__Alternatives3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rule__PropType__Alternatives3905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVectorType_in_rule__PropType__Alternatives3922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_rule__SimpleType__Alternatives3954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortType_in_rule__SimpleType__Alternatives3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortType_in_rule__SimpleType__Alternatives3988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_rule__SimpleType__Alternatives4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntType_in_rule__SimpleType__Alternatives4022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_rule__SimpleType__Alternatives4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_rule__SimpleType__Alternatives4056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_rule__SimpleType__Alternatives4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortVectorType_in_rule__VectorType__Alternatives4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntVectorType_in_rule__VectorType__Alternatives4122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatVectorType_in_rule__VectorType__Alternatives4139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleVectorType_in_rule__VectorType__Alternatives4156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVectorType_in_rule__VectorType__Alternatives4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidType_in_rule__Type__Alternatives4205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_rule__Type__Alternatives4222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortType_in_rule__Type__Alternatives4239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortType_in_rule__Type__Alternatives4256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_rule__Type__Alternatives4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntType_in_rule__Type__Alternatives4290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_rule__Type__Alternatives4307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_rule__Type__Alternatives4324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_rule__Type__Alternatives4341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharArrayType_in_rule__Type__Alternatives4358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortArrayType_in_rule__Type__Alternatives4375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortArrayType_in_rule__Type__Alternatives4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntArrayType_in_rule__Type__Alternatives4409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntArrayType_in_rule__Type__Alternatives4426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatArrayType_in_rule__Type__Alternatives4443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleArrayType_in_rule__Type__Alternatives4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringArrayType_in_rule__Type__Alternatives4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongStringArrayType_in_rule__Type__Alternatives4494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleStringArrayType_in_rule__Type__Alternatives4511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__Type__Alternatives4528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstStringType_in_rule__Type__Alternatives4545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanArrayType_in_rule__Type__Alternatives4562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_rule__Type__Alternatives4579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongType_in_rule__Type__Alternatives4596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUCharType_in_rule__Type__Alternatives4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongArrayType_in_rule__Type__Alternatives4630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongArrayType_in_rule__Type__Alternatives4647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDevIntType_in_rule__Type__Alternatives4664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncodedType_in_rule__Type__Alternatives4681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoSystem__ImportsAssignment_0_in_rule__PogoSystem__Group__04715 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_rule__PogoSystem__Group__1_in_rule__PogoSystem__Group__04725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoSystem__ClassesAssignment_1_in_rule__PogoSystem__Group__14753 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_25_in_rule__Import__Group__04793 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__04803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__14831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PogoDeviceClass__Group__04870 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__1_in_rule__PogoDeviceClass__Group__04880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__NameAssignment_1_in_rule__PogoDeviceClass__Group__14908 = new BitSet(new long[]{0x0000000808000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__2_in_rule__PogoDeviceClass__Group__14917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__IsAbstractAssignment_2_in_rule__PogoDeviceClass__Group__24945 = new BitSet(new long[]{0x0000000808000000L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__3_in_rule__PogoDeviceClass__Group__24955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group_3__0_in_rule__PogoDeviceClass__Group__34983 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__4_in_rule__PogoDeviceClass__Group__34993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PogoDeviceClass__Group__45022 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__5_in_rule__PogoDeviceClass__Group__45032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__InstituteAssignment_5_in_rule__PogoDeviceClass__Group__55060 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__6_in_rule__PogoDeviceClass__Group__55069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__PogoDeviceClass__Group__65098 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__7_in_rule__PogoDeviceClass__Group__65108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__DescriptionAssignment_7_in_rule__PogoDeviceClass__Group__75136 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__8_in_rule__PogoDeviceClass__Group__75145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PogoDeviceClass__Group__85174 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__9_in_rule__PogoDeviceClass__Group__85184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__ClassPropertiesAssignment_9_in_rule__PogoDeviceClass__Group__95212 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__10_in_rule__PogoDeviceClass__Group__95222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__PogoDeviceClass__Group__105251 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__11_in_rule__PogoDeviceClass__Group__105261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__DevicePropertiesAssignment_11_in_rule__PogoDeviceClass__Group__115289 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__12_in_rule__PogoDeviceClass__Group__115299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__PogoDeviceClass__Group__125328 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__13_in_rule__PogoDeviceClass__Group__125338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__CommandsAssignment_13_in_rule__PogoDeviceClass__Group__135366 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__14_in_rule__PogoDeviceClass__Group__135376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__PogoDeviceClass__Group__145405 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__15_in_rule__PogoDeviceClass__Group__145415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__AttributesAssignment_15_in_rule__PogoDeviceClass__Group__155443 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__16_in_rule__PogoDeviceClass__Group__155453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__PogoDeviceClass__Group__165482 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__17_in_rule__PogoDeviceClass__Group__165492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__StatesAssignment_17_in_rule__PogoDeviceClass__Group__175520 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__18_in_rule__PogoDeviceClass__Group__175530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__PogoDeviceClass__Group__185559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__PogoDeviceClass__Group_3__05633 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group_3__1_in_rule__PogoDeviceClass__Group_3__05643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__BaseClassAssignment_3_1_in_rule__PogoDeviceClass__Group_3__15671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__DescriptionAssignment_0_in_rule__ClassDescription__Group__05709 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__1_in_rule__ClassDescription__Group__05718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__TitleAssignment_1_in_rule__ClassDescription__Group__15746 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__2_in_rule__ClassDescription__Group__15755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__SourcePathAssignment_2_in_rule__ClassDescription__Group__25783 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__3_in_rule__ClassDescription__Group__25792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ClassDescription__Group__35821 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__4_in_rule__ClassDescription__Group__35831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__InheritancesAssignment_4_in_rule__ClassDescription__Group__45859 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__5_in_rule__ClassDescription__Group__45869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__LanguageAssignment_5_in_rule__ClassDescription__Group__55897 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__6_in_rule__ClassDescription__Group__55906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__FilestogenerateAssignment_6_in_rule__ClassDescription__Group__65934 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__7_in_rule__ClassDescription__Group__65943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__IdentificationAssignment_7_in_rule__ClassDescription__Group__75971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__8_in_rule__ClassDescription__Group__75980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__CommentsAssignment_8_in_rule__ClassDescription__Group__86008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inheritance__ClassnameAssignment_0_in_rule__Inheritance__Group__06060 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Inheritance__Group__1_in_rule__Inheritance__Group__06069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inheritance__SourcePathAssignment_1_in_rule__Inheritance__Group__16097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__ContactAssignment_0_in_rule__ClassIdentification__Group__06135 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassIdentification__Group__1_in_rule__ClassIdentification__Group__06144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__ClassFamilyAssignment_1_in_rule__ClassIdentification__Group__16172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassIdentification__Group__2_in_rule__ClassIdentification__Group__16181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__SiteSpecificAssignment_2_in_rule__ClassIdentification__Group__26209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassIdentification__Group__3_in_rule__ClassIdentification__Group__26218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__PlatformAssignment_3_in_rule__ClassIdentification__Group__36246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassIdentification__Group__4_in_rule__ClassIdentification__Group__36255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__BusAssignment_4_in_rule__ClassIdentification__Group__46283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassIdentification__Group__5_in_rule__ClassIdentification__Group__46292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__ManufacturerAssignment_5_in_rule__ClassIdentification__Group__56320 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassIdentification__Group__6_in_rule__ClassIdentification__Group__56329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__ReferenceAssignment_6_in_rule__ClassIdentification__Group__66357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_0_in_rule__State__Group__06405 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__06414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__DescriptionAssignment_1_in_rule__State__Group__16442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NameAssignment_0_in_rule__Property__Group__06480 = new BitSet(new long[]{0x0000FF0000000000L,0x00000000000001F0L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__06489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__TypeAssignment_1_in_rule__Property__Group__16517 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__16526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__StatusAssignment_2_in_rule__Property__Group__26554 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__3_in_rule__Property__Group__26563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__DescriptionAssignment_3_in_rule__Property__Group__36591 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Property__Group__4_in_rule__Property__Group__36600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Property__Group__46629 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Property__Group__5_in_rule__Property__Group__46639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__DefaultPropValueAssignment_5_in_rule__Property__Group__56667 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__InheritanceStatus__AbstractAssignment_0_in_rule__InheritanceStatus__Group__06714 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__InheritanceStatus__Group__1_in_rule__InheritanceStatus__Group__06723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InheritanceStatus__InheritedAssignment_1_in_rule__InheritanceStatus__Group__16751 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__InheritanceStatus__Group__2_in_rule__InheritanceStatus__Group__16760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InheritanceStatus__ConcreteAssignment_2_in_rule__InheritanceStatus__Group__26788 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__InheritanceStatus__Group__3_in_rule__InheritanceStatus__Group__26797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InheritanceStatus__ConcreteHereAssignment_3_in_rule__InheritanceStatus__Group__36825 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__InheritanceStatus__Group__4_in_rule__InheritanceStatus__Group__36834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InheritanceStatus__HasChangedAssignment_4_in_rule__InheritanceStatus__Group__46862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__NameAssignment_0_in_rule__Command__Group__06906 = new BitSet(new long[]{0xFFFFFF8000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_rule__Command__Group__1_in_rule__Command__Group__06915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ArginAssignment_1_in_rule__Command__Group__16943 = new BitSet(new long[]{0xFFFFFF8000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_rule__Command__Group__2_in_rule__Command__Group__16952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ArgoutAssignment_2_in_rule__Command__Group__26980 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group__3_in_rule__Command__Group__26989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__DescriptionAssignment_3_in_rule__Command__Group__37017 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Command__Group__4_in_rule__Command__Group__37026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__StatusAssignment_4_in_rule__Command__Group__47054 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group__5_in_rule__Command__Group__47063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ExecMethodAssignment_5_in_rule__Command__Group__57091 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Command__Group__6_in_rule__Command__Group__57100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__DisplayLevelAssignment_6_in_rule__Command__Group__67128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group__7_in_rule__Command__Group__67137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__PolledPeriodAssignment_7_in_rule__Command__Group__77165 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Command__Group__8_in_rule__Command__Group__77174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Command__Group__87203 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Command__Group__9_in_rule__Command__Group__87213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ExcludedStatesAssignment_9_in_rule__Command__Group__97241 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Argument__TypeAssignment_0_in_rule__Argument__Group__07296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__07305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__DescriptionAssignment_1_in_rule__Argument__Group__17333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__07371 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__07380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__AttTypeAssignment_1_in_rule__Attribute__Group__17408 = new BitSet(new long[]{0xFFFFFF8000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__17417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__DataTypeAssignment_2_in_rule__Attribute__Group__27445 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__27454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__RwTypeAssignment_3_in_rule__Attribute__Group__37482 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__37491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__DisplayLevelAssignment_4_in_rule__Attribute__Group__47519 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__47528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__PolledPeriodAssignment_5_in_rule__Attribute__Group__57556 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__6_in_rule__Attribute__Group__57565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__MaxXAssignment_6_in_rule__Attribute__Group__67593 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__7_in_rule__Attribute__Group__67602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__MaxYAssignment_7_in_rule__Attribute__Group__77630 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__8_in_rule__Attribute__Group__77639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__MemorizedAssignment_8_in_rule__Attribute__Group__87667 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__9_in_rule__Attribute__Group__87676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__MemorizedAtInitAssignment_9_in_rule__Attribute__Group__97704 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__10_in_rule__Attribute__Group__97713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ChangeEventAssignment_10_in_rule__Attribute__Group__107741 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__11_in_rule__Attribute__Group__107750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ArchiveEventAssignment_11_in_rule__Attribute__Group__117778 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__12_in_rule__Attribute__Group__117787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__StatusAssignment_12_in_rule__Attribute__Group__127815 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__13_in_rule__Attribute__Group__127824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__PropertiesAssignment_13_in_rule__Attribute__Group__137852 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__14_in_rule__Attribute__Group__137861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Attribute__Group__147890 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Attribute__Group__15_in_rule__Attribute__Group__147900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ExcludedStatesAssignment_15_in_rule__Attribute__Group__157928 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__FireEvents__FireAssignment_0_in_rule__FireEvents__Group__07995 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__FireEvents__Group__1_in_rule__FireEvents__Group__08004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FireEvents__LibCheckCriteriaAssignment_1_in_rule__FireEvents__Group__18032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__DescriptionAssignment_0_in_rule__AttrProperties__Group__08070 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__1_in_rule__AttrProperties__Group__08079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__LabelAssignment_1_in_rule__AttrProperties__Group__18107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__2_in_rule__AttrProperties__Group__18116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__UnitAssignment_2_in_rule__AttrProperties__Group__28144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__3_in_rule__AttrProperties__Group__28153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__StandardUnitAssignment_3_in_rule__AttrProperties__Group__38181 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__4_in_rule__AttrProperties__Group__38190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__DisplayUnitAssignment_4_in_rule__AttrProperties__Group__48218 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__5_in_rule__AttrProperties__Group__48227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__FormatAssignment_5_in_rule__AttrProperties__Group__58255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__6_in_rule__AttrProperties__Group__58264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__MaxValueAssignment_6_in_rule__AttrProperties__Group__68292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__7_in_rule__AttrProperties__Group__68301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__MinValueAssignment_7_in_rule__AttrProperties__Group__78329 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__8_in_rule__AttrProperties__Group__78338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__MaxAlarmAssignment_8_in_rule__AttrProperties__Group__88366 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__9_in_rule__AttrProperties__Group__88375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__MinAlarmAssignment_9_in_rule__AttrProperties__Group__98403 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__10_in_rule__AttrProperties__Group__98412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__MaxWarningAssignment_10_in_rule__AttrProperties__Group__108440 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__11_in_rule__AttrProperties__Group__108449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__MinWarningAssignment_11_in_rule__AttrProperties__Group__118477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__12_in_rule__AttrProperties__Group__118486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__DeltaTimeAssignment_12_in_rule__AttrProperties__Group__128514 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__13_in_rule__AttrProperties__Group__128523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__DeltaValueAssignment_13_in_rule__AttrProperties__Group__138551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VoidType__Group__1_in_rule__VoidType__Group__08623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__VoidType__Group__18652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanType__Group__1_in_rule__BooleanType__Group__08701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__BooleanType__Group__18730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortType__Group__1_in_rule__ShortType__Group__08779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ShortType__Group__18808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UShortType__Group__1_in_rule__UShortType__Group__08857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__UShortType__Group__18886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntType__Group__1_in_rule__IntType__Group__08935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__IntType__Group__18964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIntType__Group__1_in_rule__UIntType__Group__09013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__UIntType__Group__19042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatType__Group__1_in_rule__FloatType__Group__09091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__FloatType__Group__19120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleType__Group__1_in_rule__DoubleType__Group__09169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__DoubleType__Group__19198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group__1_in_rule__StringType__Group__09247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__StringType__Group__19276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharArrayType__Group__1_in_rule__CharArrayType__Group__09325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__CharArrayType__Group__19354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortArrayType__Group__1_in_rule__ShortArrayType__Group__09403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__ShortArrayType__Group__19432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UShortArrayType__Group__1_in_rule__UShortArrayType__Group__09481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__UShortArrayType__Group__19510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntArrayType__Group__1_in_rule__IntArrayType__Group__09559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__IntArrayType__Group__19588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIntArrayType__Group__1_in_rule__UIntArrayType__Group__09637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__UIntArrayType__Group__19666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatArrayType__Group__1_in_rule__FloatArrayType__Group__09715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__FloatArrayType__Group__19744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleArrayType__Group__1_in_rule__DoubleArrayType__Group__09793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__DoubleArrayType__Group__19822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringArrayType__Group__1_in_rule__StringArrayType__Group__09871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__StringArrayType__Group__19900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongStringArrayType__Group__1_in_rule__LongStringArrayType__Group__09949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__LongStringArrayType__Group__19978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleStringArrayType__Group__1_in_rule__DoubleStringArrayType__Group__010027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__DoubleStringArrayType__Group__110056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateType__Group__1_in_rule__StateType__Group__010105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__StateType__Group__110134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstStringType__Group__1_in_rule__ConstStringType__Group__010183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__ConstStringType__Group__110212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanArrayType__Group__1_in_rule__BooleanArrayType__Group__010261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__BooleanArrayType__Group__110290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UCharType__Group__1_in_rule__UCharType__Group__010339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__UCharType__Group__110368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongType__Group__1_in_rule__LongType__Group__010417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__LongType__Group__110446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ULongType__Group__1_in_rule__ULongType__Group__010495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__ULongType__Group__110524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongArrayType__Group__1_in_rule__LongArrayType__Group__010573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__LongArrayType__Group__110602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ULongArrayType__Group__1_in_rule__ULongArrayType__Group__010651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__ULongArrayType__Group__110680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DevIntType__Group__1_in_rule__DevIntType__Group__010729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__DevIntType__Group__110758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodedType__Group__1_in_rule__EncodedType__Group__010807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__EncodedType__Group__110836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortVectorType__Group__1_in_rule__ShortVectorType__Group__010885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__ShortVectorType__Group__110914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntVectorType__Group__1_in_rule__IntVectorType__Group__010963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__IntVectorType__Group__110992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatVectorType__Group__1_in_rule__FloatVectorType__Group__011041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__FloatVectorType__Group__111070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleVectorType__Group__1_in_rule__DoubleVectorType__Group__011119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__DoubleVectorType__Group__111148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVectorType__Group__1_in_rule__StringVectorType__Group__011197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__StringVectorType__Group__111226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__PogoSystem__ImportsAssignment_011265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePogoDeviceClass_in_rule__PogoSystem__ClassesAssignment_111296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_111327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PogoDeviceClass__NameAssignment_111358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__PogoDeviceClass__IsAbstractAssignment_211394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PogoDeviceClass__BaseClassAssignment_3_111437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PogoDeviceClass__InstituteAssignment_511472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDescription_in_rule__PogoDeviceClass__DescriptionAssignment_711503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__PogoDeviceClass__ClassPropertiesAssignment_911534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__PogoDeviceClass__DevicePropertiesAssignment_1111565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__PogoDeviceClass__CommandsAssignment_1311596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__PogoDeviceClass__AttributesAssignment_1511627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__PogoDeviceClass__StatesAssignment_1711658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassDescription__DescriptionAssignment_011689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassDescription__TitleAssignment_111720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassDescription__SourcePathAssignment_211751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritance_in_rule__ClassDescription__InheritancesAssignment_411782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLanguage_in_rule__ClassDescription__LanguageAssignment_511813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassDescription__FilestogenerateAssignment_611844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassIdentification_in_rule__ClassDescription__IdentificationAssignment_711875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComments_in_rule__ClassDescription__CommentsAssignment_811906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Inheritance__ClassnameAssignment_011937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Inheritance__SourcePathAssignment_111968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassIdentification__ContactAssignment_011999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassIdentification__ClassFamilyAssignment_112030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassIdentification__SiteSpecificAssignment_212061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassIdentification__PlatformAssignment_312092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassIdentification__BusAssignment_412123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassIdentification__ManufacturerAssignment_512154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassIdentification__ReferenceAssignment_612185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Comments__CommandsTableAssignment12216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_012247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__State__DescriptionAssignment_112278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__NameAssignment_012309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropType_in_rule__Property__TypeAssignment_112340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_rule__Property__StatusAssignment_212371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Property__DescriptionAssignment_312402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Property__DefaultPropValueAssignment_512433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__InheritanceStatus__AbstractAssignment_012464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__InheritanceStatus__InheritedAssignment_112495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__InheritanceStatus__ConcreteAssignment_212526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__InheritanceStatus__ConcreteHereAssignment_312557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__InheritanceStatus__HasChangedAssignment_412588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Command__NameAssignment_012619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Command__ArginAssignment_112650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Command__ArgoutAssignment_212681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Command__DescriptionAssignment_312712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_rule__Command__StatusAssignment_412743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Command__ExecMethodAssignment_512774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisplayLevel_in_rule__Command__DisplayLevelAssignment_612805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Command__PolledPeriodAssignment_712836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Command__ExcludedStatesAssignment_912867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Argument__TypeAssignment_012898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__DescriptionAssignment_112929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_012960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrType_in_rule__Attribute__AttTypeAssignment_112991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Attribute__DataTypeAssignment_213022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRW_Type_in_rule__Attribute__RwTypeAssignment_313053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisplayLevel_in_rule__Attribute__DisplayLevelAssignment_413084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__PolledPeriodAssignment_513115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__MaxXAssignment_613146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__MaxYAssignment_713177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__Attribute__MemorizedAssignment_813208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__Attribute__MemorizedAtInitAssignment_913239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFireEvents_in_rule__Attribute__ChangeEventAssignment_1013270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFireEvents_in_rule__Attribute__ArchiveEventAssignment_1113301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_rule__Attribute__StatusAssignment_1213332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrProperties_in_rule__Attribute__PropertiesAssignment_1313363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__ExcludedStatesAssignment_1513394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__FireEvents__FireAssignment_013425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__FireEvents__LibCheckCriteriaAssignment_113456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__DescriptionAssignment_013487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__LabelAssignment_113518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__UnitAssignment_213549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__StandardUnitAssignment_313580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__DisplayUnitAssignment_413611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__FormatAssignment_513642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__MaxValueAssignment_613673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__MinValueAssignment_713704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__MaxAlarmAssignment_813735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__MinAlarmAssignment_913766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__MaxWarningAssignment_1013797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__MinWarningAssignment_1113828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__DeltaTimeAssignment_1213859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__DeltaValueAssignment_1313890 = new BitSet(new long[]{0x0000000000000002L});

}