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


    // $ANTLR start entryRuleMiscellaneous
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1626:1: entryRuleMiscellaneous : ruleMiscellaneous EOF ;
    public final void entryRuleMiscellaneous() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1626:24: ( ruleMiscellaneous EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1627:1: ruleMiscellaneous EOF
            {
             before(grammarAccess.getMiscellaneousRule()); 
            pushFollow(FOLLOW_ruleMiscellaneous_in_entryRuleMiscellaneous3540);
            ruleMiscellaneous();
            _fsp--;

             after(grammarAccess.getMiscellaneousRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMiscellaneous3547); 

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
    // $ANTLR end entryRuleMiscellaneous


    // $ANTLR start ruleMiscellaneous
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1634:1: ruleMiscellaneous : ( ( rule__Miscellaneous__Group__0 ) ) ;
    public final void ruleMiscellaneous() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1638:2: ( ( ( rule__Miscellaneous__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1639:1: ( ( rule__Miscellaneous__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1639:1: ( ( rule__Miscellaneous__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1640:1: ( rule__Miscellaneous__Group__0 )
            {
             before(grammarAccess.getMiscellaneousAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1641:1: ( rule__Miscellaneous__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1641:2: rule__Miscellaneous__Group__0
            {
            pushFollow(FOLLOW_rule__Miscellaneous__Group__0_in_ruleMiscellaneous3574);
            rule__Miscellaneous__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMiscellaneousAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMiscellaneous


    // $ANTLR start rule__Language__Alternatives
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1653:1: rule__Language__Alternatives : ( ( 'Cpp' ) | ( 'Java' ) | ( 'Python' ) );
    public final void rule__Language__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1657:1: ( ( 'Cpp' ) | ( 'Java' ) | ( 'Python' ) )
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
                    new NoViableAltException("1653:1: rule__Language__Alternatives : ( ( 'Cpp' ) | ( 'Java' ) | ( 'Python' ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1658:1: ( 'Cpp' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1658:1: ( 'Cpp' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1659:1: 'Cpp'
                    {
                     before(grammarAccess.getLanguageAccess().getCppKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Language__Alternatives3611); 
                     after(grammarAccess.getLanguageAccess().getCppKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1666:6: ( 'Java' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1666:6: ( 'Java' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1667:1: 'Java'
                    {
                     before(grammarAccess.getLanguageAccess().getJavaKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Language__Alternatives3631); 
                     after(grammarAccess.getLanguageAccess().getJavaKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1674:6: ( 'Python' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1674:6: ( 'Python' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1675:1: 'Python'
                    {
                     before(grammarAccess.getLanguageAccess().getPythonKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__Language__Alternatives3651); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1687:1: rule__DisplayLevel__Alternatives : ( ( 'OPERATOR' ) | ( 'EXPERT' ) );
    public final void rule__DisplayLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1691:1: ( ( 'OPERATOR' ) | ( 'EXPERT' ) )
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
                    new NoViableAltException("1687:1: rule__DisplayLevel__Alternatives : ( ( 'OPERATOR' ) | ( 'EXPERT' ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1692:1: ( 'OPERATOR' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1692:1: ( 'OPERATOR' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1693:1: 'OPERATOR'
                    {
                     before(grammarAccess.getDisplayLevelAccess().getOPERATORKeyword_0()); 
                    match(input,14,FOLLOW_14_in_rule__DisplayLevel__Alternatives3686); 
                     after(grammarAccess.getDisplayLevelAccess().getOPERATORKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1700:6: ( 'EXPERT' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1700:6: ( 'EXPERT' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1701:1: 'EXPERT'
                    {
                     before(grammarAccess.getDisplayLevelAccess().getEXPERTKeyword_1()); 
                    match(input,15,FOLLOW_15_in_rule__DisplayLevel__Alternatives3706); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1713:1: rule__AttrType__Alternatives : ( ( 'Scalar' ) | ( 'Spectrum' ) | ( 'Image' ) );
    public final void rule__AttrType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1717:1: ( ( 'Scalar' ) | ( 'Spectrum' ) | ( 'Image' ) )
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
                    new NoViableAltException("1713:1: rule__AttrType__Alternatives : ( ( 'Scalar' ) | ( 'Spectrum' ) | ( 'Image' ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1718:1: ( 'Scalar' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1718:1: ( 'Scalar' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1719:1: 'Scalar'
                    {
                     before(grammarAccess.getAttrTypeAccess().getScalarKeyword_0()); 
                    match(input,16,FOLLOW_16_in_rule__AttrType__Alternatives3741); 
                     after(grammarAccess.getAttrTypeAccess().getScalarKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1726:6: ( 'Spectrum' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1726:6: ( 'Spectrum' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1727:1: 'Spectrum'
                    {
                     before(grammarAccess.getAttrTypeAccess().getSpectrumKeyword_1()); 
                    match(input,17,FOLLOW_17_in_rule__AttrType__Alternatives3761); 
                     after(grammarAccess.getAttrTypeAccess().getSpectrumKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1734:6: ( 'Image' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1734:6: ( 'Image' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1735:1: 'Image'
                    {
                     before(grammarAccess.getAttrTypeAccess().getImageKeyword_2()); 
                    match(input,18,FOLLOW_18_in_rule__AttrType__Alternatives3781); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1747:1: rule__RW_Type__Alternatives : ( ( 'READ' ) | ( 'WRITE' ) | ( 'READ_WRITE' ) | ( 'READ_WITH_WRITE' ) );
    public final void rule__RW_Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1751:1: ( ( 'READ' ) | ( 'WRITE' ) | ( 'READ_WRITE' ) | ( 'READ_WITH_WRITE' ) )
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
                    new NoViableAltException("1747:1: rule__RW_Type__Alternatives : ( ( 'READ' ) | ( 'WRITE' ) | ( 'READ_WRITE' ) | ( 'READ_WITH_WRITE' ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1752:1: ( 'READ' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1752:1: ( 'READ' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1753:1: 'READ'
                    {
                     before(grammarAccess.getRW_TypeAccess().getREADKeyword_0()); 
                    match(input,19,FOLLOW_19_in_rule__RW_Type__Alternatives3816); 
                     after(grammarAccess.getRW_TypeAccess().getREADKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1760:6: ( 'WRITE' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1760:6: ( 'WRITE' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1761:1: 'WRITE'
                    {
                     before(grammarAccess.getRW_TypeAccess().getWRITEKeyword_1()); 
                    match(input,20,FOLLOW_20_in_rule__RW_Type__Alternatives3836); 
                     after(grammarAccess.getRW_TypeAccess().getWRITEKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1768:6: ( 'READ_WRITE' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1768:6: ( 'READ_WRITE' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1769:1: 'READ_WRITE'
                    {
                     before(grammarAccess.getRW_TypeAccess().getREAD_WRITEKeyword_2()); 
                    match(input,21,FOLLOW_21_in_rule__RW_Type__Alternatives3856); 
                     after(grammarAccess.getRW_TypeAccess().getREAD_WRITEKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1776:6: ( 'READ_WITH_WRITE' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1776:6: ( 'READ_WITH_WRITE' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1777:1: 'READ_WITH_WRITE'
                    {
                     before(grammarAccess.getRW_TypeAccess().getREAD_WITH_WRITEKeyword_3()); 
                    match(input,22,FOLLOW_22_in_rule__RW_Type__Alternatives3876); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1789:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1793:1: ( ( 'true' ) | ( 'false' ) )
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
                    new NoViableAltException("1789:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1794:1: ( 'true' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1794:1: ( 'true' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1795:1: 'true'
                    {
                     before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    match(input,23,FOLLOW_23_in_rule__Boolean__Alternatives3911); 
                     after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1802:6: ( 'false' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1802:6: ( 'false' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1803:1: 'false'
                    {
                     before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    match(input,24,FOLLOW_24_in_rule__Boolean__Alternatives3931); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1815:1: rule__PropType__Alternatives : ( ( ruleSimpleType ) | ( ruleVectorType ) );
    public final void rule__PropType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1819:1: ( ( ruleSimpleType ) | ( ruleVectorType ) )
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
                    new NoViableAltException("1815:1: rule__PropType__Alternatives : ( ( ruleSimpleType ) | ( ruleVectorType ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1820:1: ( ruleSimpleType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1820:1: ( ruleSimpleType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1821:1: ruleSimpleType
                    {
                     before(grammarAccess.getPropTypeAccess().getSimpleTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleType_in_rule__PropType__Alternatives3965);
                    ruleSimpleType();
                    _fsp--;

                     after(grammarAccess.getPropTypeAccess().getSimpleTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1826:6: ( ruleVectorType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1826:6: ( ruleVectorType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1827:1: ruleVectorType
                    {
                     before(grammarAccess.getPropTypeAccess().getVectorTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVectorType_in_rule__PropType__Alternatives3982);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1837:1: rule__SimpleType__Alternatives : ( ( ruleBooleanType ) | ( ruleShortType ) | ( ruleUShortType ) | ( ruleIntType ) | ( ruleUIntType ) | ( ruleFloatType ) | ( ruleDoubleType ) | ( ruleStringType ) );
    public final void rule__SimpleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1841:1: ( ( ruleBooleanType ) | ( ruleShortType ) | ( ruleUShortType ) | ( ruleIntType ) | ( ruleUIntType ) | ( ruleFloatType ) | ( ruleDoubleType ) | ( ruleStringType ) )
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
                    new NoViableAltException("1837:1: rule__SimpleType__Alternatives : ( ( ruleBooleanType ) | ( ruleShortType ) | ( ruleUShortType ) | ( ruleIntType ) | ( ruleUIntType ) | ( ruleFloatType ) | ( ruleDoubleType ) | ( ruleStringType ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1842:1: ( ruleBooleanType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1842:1: ( ruleBooleanType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1843:1: ruleBooleanType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getBooleanTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBooleanType_in_rule__SimpleType__Alternatives4014);
                    ruleBooleanType();
                    _fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getBooleanTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1848:6: ( ruleShortType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1848:6: ( ruleShortType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1849:1: ruleShortType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getShortTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleShortType_in_rule__SimpleType__Alternatives4031);
                    ruleShortType();
                    _fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getShortTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1854:6: ( ruleUShortType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1854:6: ( ruleUShortType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1855:1: ruleUShortType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getUShortTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleUShortType_in_rule__SimpleType__Alternatives4048);
                    ruleUShortType();
                    _fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getUShortTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1860:6: ( ruleIntType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1860:6: ( ruleIntType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1861:1: ruleIntType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getIntTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleIntType_in_rule__SimpleType__Alternatives4065);
                    ruleIntType();
                    _fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getIntTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1866:6: ( ruleUIntType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1866:6: ( ruleUIntType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1867:1: ruleUIntType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getUIntTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleUIntType_in_rule__SimpleType__Alternatives4082);
                    ruleUIntType();
                    _fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getUIntTypeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1872:6: ( ruleFloatType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1872:6: ( ruleFloatType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1873:1: ruleFloatType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getFloatTypeParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleFloatType_in_rule__SimpleType__Alternatives4099);
                    ruleFloatType();
                    _fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getFloatTypeParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1878:6: ( ruleDoubleType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1878:6: ( ruleDoubleType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1879:1: ruleDoubleType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getDoubleTypeParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleDoubleType_in_rule__SimpleType__Alternatives4116);
                    ruleDoubleType();
                    _fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getDoubleTypeParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1884:6: ( ruleStringType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1884:6: ( ruleStringType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1885:1: ruleStringType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getStringTypeParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleStringType_in_rule__SimpleType__Alternatives4133);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1895:1: rule__VectorType__Alternatives : ( ( ruleShortVectorType ) | ( ruleIntVectorType ) | ( ruleFloatVectorType ) | ( ruleDoubleVectorType ) | ( ruleStringVectorType ) );
    public final void rule__VectorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1899:1: ( ( ruleShortVectorType ) | ( ruleIntVectorType ) | ( ruleFloatVectorType ) | ( ruleDoubleVectorType ) | ( ruleStringVectorType ) )
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
                    new NoViableAltException("1895:1: rule__VectorType__Alternatives : ( ( ruleShortVectorType ) | ( ruleIntVectorType ) | ( ruleFloatVectorType ) | ( ruleDoubleVectorType ) | ( ruleStringVectorType ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1900:1: ( ruleShortVectorType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1900:1: ( ruleShortVectorType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1901:1: ruleShortVectorType
                    {
                     before(grammarAccess.getVectorTypeAccess().getShortVectorTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleShortVectorType_in_rule__VectorType__Alternatives4165);
                    ruleShortVectorType();
                    _fsp--;

                     after(grammarAccess.getVectorTypeAccess().getShortVectorTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1906:6: ( ruleIntVectorType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1906:6: ( ruleIntVectorType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1907:1: ruleIntVectorType
                    {
                     before(grammarAccess.getVectorTypeAccess().getIntVectorTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntVectorType_in_rule__VectorType__Alternatives4182);
                    ruleIntVectorType();
                    _fsp--;

                     after(grammarAccess.getVectorTypeAccess().getIntVectorTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1912:6: ( ruleFloatVectorType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1912:6: ( ruleFloatVectorType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1913:1: ruleFloatVectorType
                    {
                     before(grammarAccess.getVectorTypeAccess().getFloatVectorTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFloatVectorType_in_rule__VectorType__Alternatives4199);
                    ruleFloatVectorType();
                    _fsp--;

                     after(grammarAccess.getVectorTypeAccess().getFloatVectorTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1918:6: ( ruleDoubleVectorType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1918:6: ( ruleDoubleVectorType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1919:1: ruleDoubleVectorType
                    {
                     before(grammarAccess.getVectorTypeAccess().getDoubleVectorTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDoubleVectorType_in_rule__VectorType__Alternatives4216);
                    ruleDoubleVectorType();
                    _fsp--;

                     after(grammarAccess.getVectorTypeAccess().getDoubleVectorTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1924:6: ( ruleStringVectorType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1924:6: ( ruleStringVectorType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1925:1: ruleStringVectorType
                    {
                     before(grammarAccess.getVectorTypeAccess().getStringVectorTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleStringVectorType_in_rule__VectorType__Alternatives4233);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1935:1: rule__Type__Alternatives : ( ( ruleVoidType ) | ( ruleBooleanType ) | ( ruleShortType ) | ( ruleUShortType ) | ( ruleIntType ) | ( ruleUIntType ) | ( ruleFloatType ) | ( ruleDoubleType ) | ( ruleStringType ) | ( ruleCharArrayType ) | ( ruleShortArrayType ) | ( ruleUShortArrayType ) | ( ruleIntArrayType ) | ( ruleUIntArrayType ) | ( ruleFloatArrayType ) | ( ruleDoubleArrayType ) | ( ruleStringArrayType ) | ( ruleLongStringArrayType ) | ( ruleDoubleStringArrayType ) | ( ruleStateType ) | ( ruleConstStringType ) | ( ruleBooleanArrayType ) | ( ruleLongType ) | ( ruleULongType ) | ( ruleUCharType ) | ( ruleLongArrayType ) | ( ruleULongArrayType ) | ( ruleDevIntType ) | ( ruleEncodedType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1939:1: ( ( ruleVoidType ) | ( ruleBooleanType ) | ( ruleShortType ) | ( ruleUShortType ) | ( ruleIntType ) | ( ruleUIntType ) | ( ruleFloatType ) | ( ruleDoubleType ) | ( ruleStringType ) | ( ruleCharArrayType ) | ( ruleShortArrayType ) | ( ruleUShortArrayType ) | ( ruleIntArrayType ) | ( ruleUIntArrayType ) | ( ruleFloatArrayType ) | ( ruleDoubleArrayType ) | ( ruleStringArrayType ) | ( ruleLongStringArrayType ) | ( ruleDoubleStringArrayType ) | ( ruleStateType ) | ( ruleConstStringType ) | ( ruleBooleanArrayType ) | ( ruleLongType ) | ( ruleULongType ) | ( ruleUCharType ) | ( ruleLongArrayType ) | ( ruleULongArrayType ) | ( ruleDevIntType ) | ( ruleEncodedType ) )
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
                    new NoViableAltException("1935:1: rule__Type__Alternatives : ( ( ruleVoidType ) | ( ruleBooleanType ) | ( ruleShortType ) | ( ruleUShortType ) | ( ruleIntType ) | ( ruleUIntType ) | ( ruleFloatType ) | ( ruleDoubleType ) | ( ruleStringType ) | ( ruleCharArrayType ) | ( ruleShortArrayType ) | ( ruleUShortArrayType ) | ( ruleIntArrayType ) | ( ruleUIntArrayType ) | ( ruleFloatArrayType ) | ( ruleDoubleArrayType ) | ( ruleStringArrayType ) | ( ruleLongStringArrayType ) | ( ruleDoubleStringArrayType ) | ( ruleStateType ) | ( ruleConstStringType ) | ( ruleBooleanArrayType ) | ( ruleLongType ) | ( ruleULongType ) | ( ruleUCharType ) | ( ruleLongArrayType ) | ( ruleULongArrayType ) | ( ruleDevIntType ) | ( ruleEncodedType ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1940:1: ( ruleVoidType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1940:1: ( ruleVoidType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1941:1: ruleVoidType
                    {
                     before(grammarAccess.getTypeAccess().getVoidTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleVoidType_in_rule__Type__Alternatives4265);
                    ruleVoidType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getVoidTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1946:6: ( ruleBooleanType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1946:6: ( ruleBooleanType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1947:1: ruleBooleanType
                    {
                     before(grammarAccess.getTypeAccess().getBooleanTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBooleanType_in_rule__Type__Alternatives4282);
                    ruleBooleanType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getBooleanTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1952:6: ( ruleShortType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1952:6: ( ruleShortType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1953:1: ruleShortType
                    {
                     before(grammarAccess.getTypeAccess().getShortTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleShortType_in_rule__Type__Alternatives4299);
                    ruleShortType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getShortTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1958:6: ( ruleUShortType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1958:6: ( ruleUShortType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1959:1: ruleUShortType
                    {
                     before(grammarAccess.getTypeAccess().getUShortTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleUShortType_in_rule__Type__Alternatives4316);
                    ruleUShortType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getUShortTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1964:6: ( ruleIntType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1964:6: ( ruleIntType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1965:1: ruleIntType
                    {
                     before(grammarAccess.getTypeAccess().getIntTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleIntType_in_rule__Type__Alternatives4333);
                    ruleIntType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getIntTypeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1970:6: ( ruleUIntType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1970:6: ( ruleUIntType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1971:1: ruleUIntType
                    {
                     before(grammarAccess.getTypeAccess().getUIntTypeParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleUIntType_in_rule__Type__Alternatives4350);
                    ruleUIntType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getUIntTypeParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1976:6: ( ruleFloatType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1976:6: ( ruleFloatType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1977:1: ruleFloatType
                    {
                     before(grammarAccess.getTypeAccess().getFloatTypeParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleFloatType_in_rule__Type__Alternatives4367);
                    ruleFloatType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getFloatTypeParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1982:6: ( ruleDoubleType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1982:6: ( ruleDoubleType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1983:1: ruleDoubleType
                    {
                     before(grammarAccess.getTypeAccess().getDoubleTypeParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleDoubleType_in_rule__Type__Alternatives4384);
                    ruleDoubleType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getDoubleTypeParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1988:6: ( ruleStringType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1988:6: ( ruleStringType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1989:1: ruleStringType
                    {
                     before(grammarAccess.getTypeAccess().getStringTypeParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleStringType_in_rule__Type__Alternatives4401);
                    ruleStringType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getStringTypeParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1994:6: ( ruleCharArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1994:6: ( ruleCharArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1995:1: ruleCharArrayType
                    {
                     before(grammarAccess.getTypeAccess().getCharArrayTypeParserRuleCall_9()); 
                    pushFollow(FOLLOW_ruleCharArrayType_in_rule__Type__Alternatives4418);
                    ruleCharArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getCharArrayTypeParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2000:6: ( ruleShortArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2000:6: ( ruleShortArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2001:1: ruleShortArrayType
                    {
                     before(grammarAccess.getTypeAccess().getShortArrayTypeParserRuleCall_10()); 
                    pushFollow(FOLLOW_ruleShortArrayType_in_rule__Type__Alternatives4435);
                    ruleShortArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getShortArrayTypeParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2006:6: ( ruleUShortArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2006:6: ( ruleUShortArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2007:1: ruleUShortArrayType
                    {
                     before(grammarAccess.getTypeAccess().getUShortArrayTypeParserRuleCall_11()); 
                    pushFollow(FOLLOW_ruleUShortArrayType_in_rule__Type__Alternatives4452);
                    ruleUShortArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getUShortArrayTypeParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2012:6: ( ruleIntArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2012:6: ( ruleIntArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2013:1: ruleIntArrayType
                    {
                     before(grammarAccess.getTypeAccess().getIntArrayTypeParserRuleCall_12()); 
                    pushFollow(FOLLOW_ruleIntArrayType_in_rule__Type__Alternatives4469);
                    ruleIntArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getIntArrayTypeParserRuleCall_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2018:6: ( ruleUIntArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2018:6: ( ruleUIntArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2019:1: ruleUIntArrayType
                    {
                     before(grammarAccess.getTypeAccess().getUIntArrayTypeParserRuleCall_13()); 
                    pushFollow(FOLLOW_ruleUIntArrayType_in_rule__Type__Alternatives4486);
                    ruleUIntArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getUIntArrayTypeParserRuleCall_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2024:6: ( ruleFloatArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2024:6: ( ruleFloatArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2025:1: ruleFloatArrayType
                    {
                     before(grammarAccess.getTypeAccess().getFloatArrayTypeParserRuleCall_14()); 
                    pushFollow(FOLLOW_ruleFloatArrayType_in_rule__Type__Alternatives4503);
                    ruleFloatArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getFloatArrayTypeParserRuleCall_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2030:6: ( ruleDoubleArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2030:6: ( ruleDoubleArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2031:1: ruleDoubleArrayType
                    {
                     before(grammarAccess.getTypeAccess().getDoubleArrayTypeParserRuleCall_15()); 
                    pushFollow(FOLLOW_ruleDoubleArrayType_in_rule__Type__Alternatives4520);
                    ruleDoubleArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getDoubleArrayTypeParserRuleCall_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2036:6: ( ruleStringArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2036:6: ( ruleStringArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2037:1: ruleStringArrayType
                    {
                     before(grammarAccess.getTypeAccess().getStringArrayTypeParserRuleCall_16()); 
                    pushFollow(FOLLOW_ruleStringArrayType_in_rule__Type__Alternatives4537);
                    ruleStringArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getStringArrayTypeParserRuleCall_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2042:6: ( ruleLongStringArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2042:6: ( ruleLongStringArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2043:1: ruleLongStringArrayType
                    {
                     before(grammarAccess.getTypeAccess().getLongStringArrayTypeParserRuleCall_17()); 
                    pushFollow(FOLLOW_ruleLongStringArrayType_in_rule__Type__Alternatives4554);
                    ruleLongStringArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getLongStringArrayTypeParserRuleCall_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2048:6: ( ruleDoubleStringArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2048:6: ( ruleDoubleStringArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2049:1: ruleDoubleStringArrayType
                    {
                     before(grammarAccess.getTypeAccess().getDoubleStringArrayTypeParserRuleCall_18()); 
                    pushFollow(FOLLOW_ruleDoubleStringArrayType_in_rule__Type__Alternatives4571);
                    ruleDoubleStringArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getDoubleStringArrayTypeParserRuleCall_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2054:6: ( ruleStateType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2054:6: ( ruleStateType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2055:1: ruleStateType
                    {
                     before(grammarAccess.getTypeAccess().getStateTypeParserRuleCall_19()); 
                    pushFollow(FOLLOW_ruleStateType_in_rule__Type__Alternatives4588);
                    ruleStateType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getStateTypeParserRuleCall_19()); 

                    }


                    }
                    break;
                case 21 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2060:6: ( ruleConstStringType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2060:6: ( ruleConstStringType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2061:1: ruleConstStringType
                    {
                     before(grammarAccess.getTypeAccess().getConstStringTypeParserRuleCall_20()); 
                    pushFollow(FOLLOW_ruleConstStringType_in_rule__Type__Alternatives4605);
                    ruleConstStringType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getConstStringTypeParserRuleCall_20()); 

                    }


                    }
                    break;
                case 22 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2066:6: ( ruleBooleanArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2066:6: ( ruleBooleanArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2067:1: ruleBooleanArrayType
                    {
                     before(grammarAccess.getTypeAccess().getBooleanArrayTypeParserRuleCall_21()); 
                    pushFollow(FOLLOW_ruleBooleanArrayType_in_rule__Type__Alternatives4622);
                    ruleBooleanArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getBooleanArrayTypeParserRuleCall_21()); 

                    }


                    }
                    break;
                case 23 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2072:6: ( ruleLongType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2072:6: ( ruleLongType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2073:1: ruleLongType
                    {
                     before(grammarAccess.getTypeAccess().getLongTypeParserRuleCall_22()); 
                    pushFollow(FOLLOW_ruleLongType_in_rule__Type__Alternatives4639);
                    ruleLongType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getLongTypeParserRuleCall_22()); 

                    }


                    }
                    break;
                case 24 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2078:6: ( ruleULongType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2078:6: ( ruleULongType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2079:1: ruleULongType
                    {
                     before(grammarAccess.getTypeAccess().getULongTypeParserRuleCall_23()); 
                    pushFollow(FOLLOW_ruleULongType_in_rule__Type__Alternatives4656);
                    ruleULongType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getULongTypeParserRuleCall_23()); 

                    }


                    }
                    break;
                case 25 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2084:6: ( ruleUCharType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2084:6: ( ruleUCharType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2085:1: ruleUCharType
                    {
                     before(grammarAccess.getTypeAccess().getUCharTypeParserRuleCall_24()); 
                    pushFollow(FOLLOW_ruleUCharType_in_rule__Type__Alternatives4673);
                    ruleUCharType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getUCharTypeParserRuleCall_24()); 

                    }


                    }
                    break;
                case 26 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2090:6: ( ruleLongArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2090:6: ( ruleLongArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2091:1: ruleLongArrayType
                    {
                     before(grammarAccess.getTypeAccess().getLongArrayTypeParserRuleCall_25()); 
                    pushFollow(FOLLOW_ruleLongArrayType_in_rule__Type__Alternatives4690);
                    ruleLongArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getLongArrayTypeParserRuleCall_25()); 

                    }


                    }
                    break;
                case 27 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2096:6: ( ruleULongArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2096:6: ( ruleULongArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2097:1: ruleULongArrayType
                    {
                     before(grammarAccess.getTypeAccess().getULongArrayTypeParserRuleCall_26()); 
                    pushFollow(FOLLOW_ruleULongArrayType_in_rule__Type__Alternatives4707);
                    ruleULongArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getULongArrayTypeParserRuleCall_26()); 

                    }


                    }
                    break;
                case 28 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2102:6: ( ruleDevIntType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2102:6: ( ruleDevIntType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2103:1: ruleDevIntType
                    {
                     before(grammarAccess.getTypeAccess().getDevIntTypeParserRuleCall_27()); 
                    pushFollow(FOLLOW_ruleDevIntType_in_rule__Type__Alternatives4724);
                    ruleDevIntType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getDevIntTypeParserRuleCall_27()); 

                    }


                    }
                    break;
                case 29 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2108:6: ( ruleEncodedType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2108:6: ( ruleEncodedType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2109:1: ruleEncodedType
                    {
                     before(grammarAccess.getTypeAccess().getEncodedTypeParserRuleCall_28()); 
                    pushFollow(FOLLOW_ruleEncodedType_in_rule__Type__Alternatives4741);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2121:1: rule__PogoSystem__Group__0 : ( ( rule__PogoSystem__ImportsAssignment_0 )* ) rule__PogoSystem__Group__1 ;
    public final void rule__PogoSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2125:1: ( ( ( rule__PogoSystem__ImportsAssignment_0 )* ) rule__PogoSystem__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2126:1: ( ( rule__PogoSystem__ImportsAssignment_0 )* ) rule__PogoSystem__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2126:1: ( ( rule__PogoSystem__ImportsAssignment_0 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2127:1: ( rule__PogoSystem__ImportsAssignment_0 )*
            {
             before(grammarAccess.getPogoSystemAccess().getImportsAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2128:1: ( rule__PogoSystem__ImportsAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2128:2: rule__PogoSystem__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__PogoSystem__ImportsAssignment_0_in_rule__PogoSystem__Group__04775);
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

            pushFollow(FOLLOW_rule__PogoSystem__Group__1_in_rule__PogoSystem__Group__04785);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2139:1: rule__PogoSystem__Group__1 : ( ( rule__PogoSystem__ClassesAssignment_1 )* ) ;
    public final void rule__PogoSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2143:1: ( ( ( rule__PogoSystem__ClassesAssignment_1 )* ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2144:1: ( ( rule__PogoSystem__ClassesAssignment_1 )* )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2144:1: ( ( rule__PogoSystem__ClassesAssignment_1 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2145:1: ( rule__PogoSystem__ClassesAssignment_1 )*
            {
             before(grammarAccess.getPogoSystemAccess().getClassesAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2146:1: ( rule__PogoSystem__ClassesAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2146:2: rule__PogoSystem__ClassesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__PogoSystem__ClassesAssignment_1_in_rule__PogoSystem__Group__14813);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2160:1: rule__Import__Group__0 : ( 'import' ) rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2164:1: ( ( 'import' ) rule__Import__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2165:1: ( 'import' ) rule__Import__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2165:1: ( 'import' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2166:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Import__Group__04853); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__04863);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2180:1: rule__Import__Group__1 : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2184:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2185:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2185:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2186:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2187:1: ( rule__Import__ImportURIAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2187:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__14891);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2201:1: rule__PogoDeviceClass__Group__0 : ( 'deviceclass' ) rule__PogoDeviceClass__Group__1 ;
    public final void rule__PogoDeviceClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2205:1: ( ( 'deviceclass' ) rule__PogoDeviceClass__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2206:1: ( 'deviceclass' ) rule__PogoDeviceClass__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2206:1: ( 'deviceclass' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2207:1: 'deviceclass'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getDeviceclassKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__PogoDeviceClass__Group__04930); 
             after(grammarAccess.getPogoDeviceClassAccess().getDeviceclassKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__1_in_rule__PogoDeviceClass__Group__04940);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2221:1: rule__PogoDeviceClass__Group__1 : ( ( rule__PogoDeviceClass__NameAssignment_1 ) ) rule__PogoDeviceClass__Group__2 ;
    public final void rule__PogoDeviceClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2225:1: ( ( ( rule__PogoDeviceClass__NameAssignment_1 ) ) rule__PogoDeviceClass__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2226:1: ( ( rule__PogoDeviceClass__NameAssignment_1 ) ) rule__PogoDeviceClass__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2226:1: ( ( rule__PogoDeviceClass__NameAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2227:1: ( rule__PogoDeviceClass__NameAssignment_1 )
            {
             before(grammarAccess.getPogoDeviceClassAccess().getNameAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2228:1: ( rule__PogoDeviceClass__NameAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2228:2: rule__PogoDeviceClass__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PogoDeviceClass__NameAssignment_1_in_rule__PogoDeviceClass__Group__14968);
            rule__PogoDeviceClass__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPogoDeviceClassAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__2_in_rule__PogoDeviceClass__Group__14977);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2239:1: rule__PogoDeviceClass__Group__2 : ( ( rule__PogoDeviceClass__IsAbstractAssignment_2 )? ) rule__PogoDeviceClass__Group__3 ;
    public final void rule__PogoDeviceClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2243:1: ( ( ( rule__PogoDeviceClass__IsAbstractAssignment_2 )? ) rule__PogoDeviceClass__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2244:1: ( ( rule__PogoDeviceClass__IsAbstractAssignment_2 )? ) rule__PogoDeviceClass__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2244:1: ( ( rule__PogoDeviceClass__IsAbstractAssignment_2 )? )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2245:1: ( rule__PogoDeviceClass__IsAbstractAssignment_2 )?
            {
             before(grammarAccess.getPogoDeviceClassAccess().getIsAbstractAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2246:1: ( rule__PogoDeviceClass__IsAbstractAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==73) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2246:2: rule__PogoDeviceClass__IsAbstractAssignment_2
                    {
                    pushFollow(FOLLOW_rule__PogoDeviceClass__IsAbstractAssignment_2_in_rule__PogoDeviceClass__Group__25005);
                    rule__PogoDeviceClass__IsAbstractAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPogoDeviceClassAccess().getIsAbstractAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__3_in_rule__PogoDeviceClass__Group__25015);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2257:1: rule__PogoDeviceClass__Group__3 : ( ( rule__PogoDeviceClass__Group_3__0 )? ) rule__PogoDeviceClass__Group__4 ;
    public final void rule__PogoDeviceClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2261:1: ( ( ( rule__PogoDeviceClass__Group_3__0 )? ) rule__PogoDeviceClass__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2262:1: ( ( rule__PogoDeviceClass__Group_3__0 )? ) rule__PogoDeviceClass__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2262:1: ( ( rule__PogoDeviceClass__Group_3__0 )? )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2263:1: ( rule__PogoDeviceClass__Group_3__0 )?
            {
             before(grammarAccess.getPogoDeviceClassAccess().getGroup_3()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2264:1: ( rule__PogoDeviceClass__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2264:2: rule__PogoDeviceClass__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PogoDeviceClass__Group_3__0_in_rule__PogoDeviceClass__Group__35043);
                    rule__PogoDeviceClass__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPogoDeviceClassAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__4_in_rule__PogoDeviceClass__Group__35053);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2275:1: rule__PogoDeviceClass__Group__4 : ( '{' ) rule__PogoDeviceClass__Group__5 ;
    public final void rule__PogoDeviceClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2279:1: ( ( '{' ) rule__PogoDeviceClass__Group__5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2280:1: ( '{' ) rule__PogoDeviceClass__Group__5
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2280:1: ( '{' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2281:1: '{'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__PogoDeviceClass__Group__45082); 
             after(grammarAccess.getPogoDeviceClassAccess().getLeftCurlyBracketKeyword_4()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__5_in_rule__PogoDeviceClass__Group__45092);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2295:1: rule__PogoDeviceClass__Group__5 : ( ( rule__PogoDeviceClass__InstituteAssignment_5 ) ) rule__PogoDeviceClass__Group__6 ;
    public final void rule__PogoDeviceClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2299:1: ( ( ( rule__PogoDeviceClass__InstituteAssignment_5 ) ) rule__PogoDeviceClass__Group__6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2300:1: ( ( rule__PogoDeviceClass__InstituteAssignment_5 ) ) rule__PogoDeviceClass__Group__6
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2300:1: ( ( rule__PogoDeviceClass__InstituteAssignment_5 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2301:1: ( rule__PogoDeviceClass__InstituteAssignment_5 )
            {
             before(grammarAccess.getPogoDeviceClassAccess().getInstituteAssignment_5()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2302:1: ( rule__PogoDeviceClass__InstituteAssignment_5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2302:2: rule__PogoDeviceClass__InstituteAssignment_5
            {
            pushFollow(FOLLOW_rule__PogoDeviceClass__InstituteAssignment_5_in_rule__PogoDeviceClass__Group__55120);
            rule__PogoDeviceClass__InstituteAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getPogoDeviceClassAccess().getInstituteAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__6_in_rule__PogoDeviceClass__Group__55129);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2313:1: rule__PogoDeviceClass__Group__6 : ( 'description:' ) rule__PogoDeviceClass__Group__7 ;
    public final void rule__PogoDeviceClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2317:1: ( ( 'description:' ) rule__PogoDeviceClass__Group__7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2318:1: ( 'description:' ) rule__PogoDeviceClass__Group__7
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2318:1: ( 'description:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2319:1: 'description:'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getDescriptionKeyword_6()); 
            match(input,28,FOLLOW_28_in_rule__PogoDeviceClass__Group__65158); 
             after(grammarAccess.getPogoDeviceClassAccess().getDescriptionKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__7_in_rule__PogoDeviceClass__Group__65168);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2333:1: rule__PogoDeviceClass__Group__7 : ( ( rule__PogoDeviceClass__DescriptionAssignment_7 ) ) rule__PogoDeviceClass__Group__8 ;
    public final void rule__PogoDeviceClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2337:1: ( ( ( rule__PogoDeviceClass__DescriptionAssignment_7 ) ) rule__PogoDeviceClass__Group__8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2338:1: ( ( rule__PogoDeviceClass__DescriptionAssignment_7 ) ) rule__PogoDeviceClass__Group__8
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2338:1: ( ( rule__PogoDeviceClass__DescriptionAssignment_7 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2339:1: ( rule__PogoDeviceClass__DescriptionAssignment_7 )
            {
             before(grammarAccess.getPogoDeviceClassAccess().getDescriptionAssignment_7()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2340:1: ( rule__PogoDeviceClass__DescriptionAssignment_7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2340:2: rule__PogoDeviceClass__DescriptionAssignment_7
            {
            pushFollow(FOLLOW_rule__PogoDeviceClass__DescriptionAssignment_7_in_rule__PogoDeviceClass__Group__75196);
            rule__PogoDeviceClass__DescriptionAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getPogoDeviceClassAccess().getDescriptionAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__8_in_rule__PogoDeviceClass__Group__75205);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2351:1: rule__PogoDeviceClass__Group__8 : ( 'classProperties:' ) rule__PogoDeviceClass__Group__9 ;
    public final void rule__PogoDeviceClass__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2355:1: ( ( 'classProperties:' ) rule__PogoDeviceClass__Group__9 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2356:1: ( 'classProperties:' ) rule__PogoDeviceClass__Group__9
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2356:1: ( 'classProperties:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2357:1: 'classProperties:'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getClassPropertiesKeyword_8()); 
            match(input,29,FOLLOW_29_in_rule__PogoDeviceClass__Group__85234); 
             after(grammarAccess.getPogoDeviceClassAccess().getClassPropertiesKeyword_8()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__9_in_rule__PogoDeviceClass__Group__85244);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2371:1: rule__PogoDeviceClass__Group__9 : ( ( rule__PogoDeviceClass__ClassPropertiesAssignment_9 )* ) rule__PogoDeviceClass__Group__10 ;
    public final void rule__PogoDeviceClass__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2375:1: ( ( ( rule__PogoDeviceClass__ClassPropertiesAssignment_9 )* ) rule__PogoDeviceClass__Group__10 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2376:1: ( ( rule__PogoDeviceClass__ClassPropertiesAssignment_9 )* ) rule__PogoDeviceClass__Group__10
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2376:1: ( ( rule__PogoDeviceClass__ClassPropertiesAssignment_9 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2377:1: ( rule__PogoDeviceClass__ClassPropertiesAssignment_9 )*
            {
             before(grammarAccess.getPogoDeviceClassAccess().getClassPropertiesAssignment_9()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2378:1: ( rule__PogoDeviceClass__ClassPropertiesAssignment_9 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2378:2: rule__PogoDeviceClass__ClassPropertiesAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__PogoDeviceClass__ClassPropertiesAssignment_9_in_rule__PogoDeviceClass__Group__95272);
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

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__10_in_rule__PogoDeviceClass__Group__95282);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2389:1: rule__PogoDeviceClass__Group__10 : ( 'deviceProperties:' ) rule__PogoDeviceClass__Group__11 ;
    public final void rule__PogoDeviceClass__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2393:1: ( ( 'deviceProperties:' ) rule__PogoDeviceClass__Group__11 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2394:1: ( 'deviceProperties:' ) rule__PogoDeviceClass__Group__11
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2394:1: ( 'deviceProperties:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2395:1: 'deviceProperties:'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getDevicePropertiesKeyword_10()); 
            match(input,30,FOLLOW_30_in_rule__PogoDeviceClass__Group__105311); 
             after(grammarAccess.getPogoDeviceClassAccess().getDevicePropertiesKeyword_10()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__11_in_rule__PogoDeviceClass__Group__105321);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2409:1: rule__PogoDeviceClass__Group__11 : ( ( rule__PogoDeviceClass__DevicePropertiesAssignment_11 )* ) rule__PogoDeviceClass__Group__12 ;
    public final void rule__PogoDeviceClass__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2413:1: ( ( ( rule__PogoDeviceClass__DevicePropertiesAssignment_11 )* ) rule__PogoDeviceClass__Group__12 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2414:1: ( ( rule__PogoDeviceClass__DevicePropertiesAssignment_11 )* ) rule__PogoDeviceClass__Group__12
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2414:1: ( ( rule__PogoDeviceClass__DevicePropertiesAssignment_11 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2415:1: ( rule__PogoDeviceClass__DevicePropertiesAssignment_11 )*
            {
             before(grammarAccess.getPogoDeviceClassAccess().getDevicePropertiesAssignment_11()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2416:1: ( rule__PogoDeviceClass__DevicePropertiesAssignment_11 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2416:2: rule__PogoDeviceClass__DevicePropertiesAssignment_11
            	    {
            	    pushFollow(FOLLOW_rule__PogoDeviceClass__DevicePropertiesAssignment_11_in_rule__PogoDeviceClass__Group__115349);
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

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__12_in_rule__PogoDeviceClass__Group__115359);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2427:1: rule__PogoDeviceClass__Group__12 : ( 'commands:' ) rule__PogoDeviceClass__Group__13 ;
    public final void rule__PogoDeviceClass__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2431:1: ( ( 'commands:' ) rule__PogoDeviceClass__Group__13 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2432:1: ( 'commands:' ) rule__PogoDeviceClass__Group__13
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2432:1: ( 'commands:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2433:1: 'commands:'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getCommandsKeyword_12()); 
            match(input,31,FOLLOW_31_in_rule__PogoDeviceClass__Group__125388); 
             after(grammarAccess.getPogoDeviceClassAccess().getCommandsKeyword_12()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__13_in_rule__PogoDeviceClass__Group__125398);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2447:1: rule__PogoDeviceClass__Group__13 : ( ( rule__PogoDeviceClass__CommandsAssignment_13 )* ) rule__PogoDeviceClass__Group__14 ;
    public final void rule__PogoDeviceClass__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2451:1: ( ( ( rule__PogoDeviceClass__CommandsAssignment_13 )* ) rule__PogoDeviceClass__Group__14 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2452:1: ( ( rule__PogoDeviceClass__CommandsAssignment_13 )* ) rule__PogoDeviceClass__Group__14
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2452:1: ( ( rule__PogoDeviceClass__CommandsAssignment_13 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2453:1: ( rule__PogoDeviceClass__CommandsAssignment_13 )*
            {
             before(grammarAccess.getPogoDeviceClassAccess().getCommandsAssignment_13()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2454:1: ( rule__PogoDeviceClass__CommandsAssignment_13 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2454:2: rule__PogoDeviceClass__CommandsAssignment_13
            	    {
            	    pushFollow(FOLLOW_rule__PogoDeviceClass__CommandsAssignment_13_in_rule__PogoDeviceClass__Group__135426);
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

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__14_in_rule__PogoDeviceClass__Group__135436);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2465:1: rule__PogoDeviceClass__Group__14 : ( 'attributes:' ) rule__PogoDeviceClass__Group__15 ;
    public final void rule__PogoDeviceClass__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2469:1: ( ( 'attributes:' ) rule__PogoDeviceClass__Group__15 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2470:1: ( 'attributes:' ) rule__PogoDeviceClass__Group__15
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2470:1: ( 'attributes:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2471:1: 'attributes:'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getAttributesKeyword_14()); 
            match(input,32,FOLLOW_32_in_rule__PogoDeviceClass__Group__145465); 
             after(grammarAccess.getPogoDeviceClassAccess().getAttributesKeyword_14()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__15_in_rule__PogoDeviceClass__Group__145475);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2485:1: rule__PogoDeviceClass__Group__15 : ( ( rule__PogoDeviceClass__AttributesAssignment_15 )* ) rule__PogoDeviceClass__Group__16 ;
    public final void rule__PogoDeviceClass__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2489:1: ( ( ( rule__PogoDeviceClass__AttributesAssignment_15 )* ) rule__PogoDeviceClass__Group__16 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2490:1: ( ( rule__PogoDeviceClass__AttributesAssignment_15 )* ) rule__PogoDeviceClass__Group__16
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2490:1: ( ( rule__PogoDeviceClass__AttributesAssignment_15 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2491:1: ( rule__PogoDeviceClass__AttributesAssignment_15 )*
            {
             before(grammarAccess.getPogoDeviceClassAccess().getAttributesAssignment_15()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2492:1: ( rule__PogoDeviceClass__AttributesAssignment_15 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2492:2: rule__PogoDeviceClass__AttributesAssignment_15
            	    {
            	    pushFollow(FOLLOW_rule__PogoDeviceClass__AttributesAssignment_15_in_rule__PogoDeviceClass__Group__155503);
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

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__16_in_rule__PogoDeviceClass__Group__155513);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2503:1: rule__PogoDeviceClass__Group__16 : ( 'states:' ) rule__PogoDeviceClass__Group__17 ;
    public final void rule__PogoDeviceClass__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2507:1: ( ( 'states:' ) rule__PogoDeviceClass__Group__17 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2508:1: ( 'states:' ) rule__PogoDeviceClass__Group__17
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2508:1: ( 'states:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2509:1: 'states:'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getStatesKeyword_16()); 
            match(input,33,FOLLOW_33_in_rule__PogoDeviceClass__Group__165542); 
             after(grammarAccess.getPogoDeviceClassAccess().getStatesKeyword_16()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__17_in_rule__PogoDeviceClass__Group__165552);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2523:1: rule__PogoDeviceClass__Group__17 : ( ( rule__PogoDeviceClass__StatesAssignment_17 )* ) rule__PogoDeviceClass__Group__18 ;
    public final void rule__PogoDeviceClass__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2527:1: ( ( ( rule__PogoDeviceClass__StatesAssignment_17 )* ) rule__PogoDeviceClass__Group__18 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2528:1: ( ( rule__PogoDeviceClass__StatesAssignment_17 )* ) rule__PogoDeviceClass__Group__18
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2528:1: ( ( rule__PogoDeviceClass__StatesAssignment_17 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2529:1: ( rule__PogoDeviceClass__StatesAssignment_17 )*
            {
             before(grammarAccess.getPogoDeviceClassAccess().getStatesAssignment_17()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2530:1: ( rule__PogoDeviceClass__StatesAssignment_17 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2530:2: rule__PogoDeviceClass__StatesAssignment_17
            	    {
            	    pushFollow(FOLLOW_rule__PogoDeviceClass__StatesAssignment_17_in_rule__PogoDeviceClass__Group__175580);
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

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__18_in_rule__PogoDeviceClass__Group__175590);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2541:1: rule__PogoDeviceClass__Group__18 : ( ( rule__PogoDeviceClass__MiscellaneousAssignment_18 ) ) rule__PogoDeviceClass__Group__19 ;
    public final void rule__PogoDeviceClass__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2545:1: ( ( ( rule__PogoDeviceClass__MiscellaneousAssignment_18 ) ) rule__PogoDeviceClass__Group__19 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2546:1: ( ( rule__PogoDeviceClass__MiscellaneousAssignment_18 ) ) rule__PogoDeviceClass__Group__19
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2546:1: ( ( rule__PogoDeviceClass__MiscellaneousAssignment_18 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2547:1: ( rule__PogoDeviceClass__MiscellaneousAssignment_18 )
            {
             before(grammarAccess.getPogoDeviceClassAccess().getMiscellaneousAssignment_18()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2548:1: ( rule__PogoDeviceClass__MiscellaneousAssignment_18 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2548:2: rule__PogoDeviceClass__MiscellaneousAssignment_18
            {
            pushFollow(FOLLOW_rule__PogoDeviceClass__MiscellaneousAssignment_18_in_rule__PogoDeviceClass__Group__185618);
            rule__PogoDeviceClass__MiscellaneousAssignment_18();
            _fsp--;


            }

             after(grammarAccess.getPogoDeviceClassAccess().getMiscellaneousAssignment_18()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__19_in_rule__PogoDeviceClass__Group__185627);
            rule__PogoDeviceClass__Group__19();
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
    // $ANTLR end rule__PogoDeviceClass__Group__18


    // $ANTLR start rule__PogoDeviceClass__Group__19
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2559:1: rule__PogoDeviceClass__Group__19 : ( '}' ) ;
    public final void rule__PogoDeviceClass__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2563:1: ( ( '}' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2564:1: ( '}' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2564:1: ( '}' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2565:1: '}'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getRightCurlyBracketKeyword_19()); 
            match(input,34,FOLLOW_34_in_rule__PogoDeviceClass__Group__195656); 
             after(grammarAccess.getPogoDeviceClassAccess().getRightCurlyBracketKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__Group__19


    // $ANTLR start rule__PogoDeviceClass__Group_3__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2618:1: rule__PogoDeviceClass__Group_3__0 : ( 'extends' ) rule__PogoDeviceClass__Group_3__1 ;
    public final void rule__PogoDeviceClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2622:1: ( ( 'extends' ) rule__PogoDeviceClass__Group_3__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2623:1: ( 'extends' ) rule__PogoDeviceClass__Group_3__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2623:1: ( 'extends' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2624:1: 'extends'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getExtendsKeyword_3_0()); 
            match(input,35,FOLLOW_35_in_rule__PogoDeviceClass__Group_3__05732); 
             after(grammarAccess.getPogoDeviceClassAccess().getExtendsKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group_3__1_in_rule__PogoDeviceClass__Group_3__05742);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2638:1: rule__PogoDeviceClass__Group_3__1 : ( ( rule__PogoDeviceClass__BaseClassAssignment_3_1 ) ) ;
    public final void rule__PogoDeviceClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2642:1: ( ( ( rule__PogoDeviceClass__BaseClassAssignment_3_1 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2643:1: ( ( rule__PogoDeviceClass__BaseClassAssignment_3_1 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2643:1: ( ( rule__PogoDeviceClass__BaseClassAssignment_3_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2644:1: ( rule__PogoDeviceClass__BaseClassAssignment_3_1 )
            {
             before(grammarAccess.getPogoDeviceClassAccess().getBaseClassAssignment_3_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2645:1: ( rule__PogoDeviceClass__BaseClassAssignment_3_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2645:2: rule__PogoDeviceClass__BaseClassAssignment_3_1
            {
            pushFollow(FOLLOW_rule__PogoDeviceClass__BaseClassAssignment_3_1_in_rule__PogoDeviceClass__Group_3__15770);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2659:1: rule__ClassDescription__Group__0 : ( ( rule__ClassDescription__DescriptionAssignment_0 ) ) rule__ClassDescription__Group__1 ;
    public final void rule__ClassDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2663:1: ( ( ( rule__ClassDescription__DescriptionAssignment_0 ) ) rule__ClassDescription__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2664:1: ( ( rule__ClassDescription__DescriptionAssignment_0 ) ) rule__ClassDescription__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2664:1: ( ( rule__ClassDescription__DescriptionAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2665:1: ( rule__ClassDescription__DescriptionAssignment_0 )
            {
             before(grammarAccess.getClassDescriptionAccess().getDescriptionAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2666:1: ( rule__ClassDescription__DescriptionAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2666:2: rule__ClassDescription__DescriptionAssignment_0
            {
            pushFollow(FOLLOW_rule__ClassDescription__DescriptionAssignment_0_in_rule__ClassDescription__Group__05808);
            rule__ClassDescription__DescriptionAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__1_in_rule__ClassDescription__Group__05817);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2677:1: rule__ClassDescription__Group__1 : ( ( rule__ClassDescription__TitleAssignment_1 ) ) rule__ClassDescription__Group__2 ;
    public final void rule__ClassDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2681:1: ( ( ( rule__ClassDescription__TitleAssignment_1 ) ) rule__ClassDescription__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2682:1: ( ( rule__ClassDescription__TitleAssignment_1 ) ) rule__ClassDescription__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2682:1: ( ( rule__ClassDescription__TitleAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2683:1: ( rule__ClassDescription__TitleAssignment_1 )
            {
             before(grammarAccess.getClassDescriptionAccess().getTitleAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2684:1: ( rule__ClassDescription__TitleAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2684:2: rule__ClassDescription__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__ClassDescription__TitleAssignment_1_in_rule__ClassDescription__Group__15845);
            rule__ClassDescription__TitleAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getTitleAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__2_in_rule__ClassDescription__Group__15854);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2695:1: rule__ClassDescription__Group__2 : ( ( rule__ClassDescription__SourcePathAssignment_2 ) ) rule__ClassDescription__Group__3 ;
    public final void rule__ClassDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2699:1: ( ( ( rule__ClassDescription__SourcePathAssignment_2 ) ) rule__ClassDescription__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2700:1: ( ( rule__ClassDescription__SourcePathAssignment_2 ) ) rule__ClassDescription__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2700:1: ( ( rule__ClassDescription__SourcePathAssignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2701:1: ( rule__ClassDescription__SourcePathAssignment_2 )
            {
             before(grammarAccess.getClassDescriptionAccess().getSourcePathAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2702:1: ( rule__ClassDescription__SourcePathAssignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2702:2: rule__ClassDescription__SourcePathAssignment_2
            {
            pushFollow(FOLLOW_rule__ClassDescription__SourcePathAssignment_2_in_rule__ClassDescription__Group__25882);
            rule__ClassDescription__SourcePathAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getSourcePathAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__3_in_rule__ClassDescription__Group__25891);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2713:1: rule__ClassDescription__Group__3 : ( 'inheritances:' ) rule__ClassDescription__Group__4 ;
    public final void rule__ClassDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2717:1: ( ( 'inheritances:' ) rule__ClassDescription__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2718:1: ( 'inheritances:' ) rule__ClassDescription__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2718:1: ( 'inheritances:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2719:1: 'inheritances:'
            {
             before(grammarAccess.getClassDescriptionAccess().getInheritancesKeyword_3()); 
            match(input,36,FOLLOW_36_in_rule__ClassDescription__Group__35920); 
             after(grammarAccess.getClassDescriptionAccess().getInheritancesKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__4_in_rule__ClassDescription__Group__35930);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2733:1: rule__ClassDescription__Group__4 : ( ( rule__ClassDescription__InheritancesAssignment_4 ) ) rule__ClassDescription__Group__5 ;
    public final void rule__ClassDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2737:1: ( ( ( rule__ClassDescription__InheritancesAssignment_4 ) ) rule__ClassDescription__Group__5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2738:1: ( ( rule__ClassDescription__InheritancesAssignment_4 ) ) rule__ClassDescription__Group__5
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2738:1: ( ( rule__ClassDescription__InheritancesAssignment_4 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2739:1: ( rule__ClassDescription__InheritancesAssignment_4 )
            {
             before(grammarAccess.getClassDescriptionAccess().getInheritancesAssignment_4()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2740:1: ( rule__ClassDescription__InheritancesAssignment_4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2740:2: rule__ClassDescription__InheritancesAssignment_4
            {
            pushFollow(FOLLOW_rule__ClassDescription__InheritancesAssignment_4_in_rule__ClassDescription__Group__45958);
            rule__ClassDescription__InheritancesAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getInheritancesAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__5_in_rule__ClassDescription__Group__45967);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2751:1: rule__ClassDescription__Group__5 : ( ( rule__ClassDescription__LanguageAssignment_5 ) ) rule__ClassDescription__Group__6 ;
    public final void rule__ClassDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2755:1: ( ( ( rule__ClassDescription__LanguageAssignment_5 ) ) rule__ClassDescription__Group__6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2756:1: ( ( rule__ClassDescription__LanguageAssignment_5 ) ) rule__ClassDescription__Group__6
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2756:1: ( ( rule__ClassDescription__LanguageAssignment_5 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2757:1: ( rule__ClassDescription__LanguageAssignment_5 )
            {
             before(grammarAccess.getClassDescriptionAccess().getLanguageAssignment_5()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2758:1: ( rule__ClassDescription__LanguageAssignment_5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2758:2: rule__ClassDescription__LanguageAssignment_5
            {
            pushFollow(FOLLOW_rule__ClassDescription__LanguageAssignment_5_in_rule__ClassDescription__Group__55995);
            rule__ClassDescription__LanguageAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getLanguageAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__6_in_rule__ClassDescription__Group__56004);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2769:1: rule__ClassDescription__Group__6 : ( ( rule__ClassDescription__FilestogenerateAssignment_6 ) ) rule__ClassDescription__Group__7 ;
    public final void rule__ClassDescription__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2773:1: ( ( ( rule__ClassDescription__FilestogenerateAssignment_6 ) ) rule__ClassDescription__Group__7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2774:1: ( ( rule__ClassDescription__FilestogenerateAssignment_6 ) ) rule__ClassDescription__Group__7
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2774:1: ( ( rule__ClassDescription__FilestogenerateAssignment_6 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2775:1: ( rule__ClassDescription__FilestogenerateAssignment_6 )
            {
             before(grammarAccess.getClassDescriptionAccess().getFilestogenerateAssignment_6()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2776:1: ( rule__ClassDescription__FilestogenerateAssignment_6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2776:2: rule__ClassDescription__FilestogenerateAssignment_6
            {
            pushFollow(FOLLOW_rule__ClassDescription__FilestogenerateAssignment_6_in_rule__ClassDescription__Group__66032);
            rule__ClassDescription__FilestogenerateAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getFilestogenerateAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__7_in_rule__ClassDescription__Group__66041);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2787:1: rule__ClassDescription__Group__7 : ( ( rule__ClassDescription__IdentificationAssignment_7 ) ) rule__ClassDescription__Group__8 ;
    public final void rule__ClassDescription__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2791:1: ( ( ( rule__ClassDescription__IdentificationAssignment_7 ) ) rule__ClassDescription__Group__8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2792:1: ( ( rule__ClassDescription__IdentificationAssignment_7 ) ) rule__ClassDescription__Group__8
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2792:1: ( ( rule__ClassDescription__IdentificationAssignment_7 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2793:1: ( rule__ClassDescription__IdentificationAssignment_7 )
            {
             before(grammarAccess.getClassDescriptionAccess().getIdentificationAssignment_7()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2794:1: ( rule__ClassDescription__IdentificationAssignment_7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2794:2: rule__ClassDescription__IdentificationAssignment_7
            {
            pushFollow(FOLLOW_rule__ClassDescription__IdentificationAssignment_7_in_rule__ClassDescription__Group__76069);
            rule__ClassDescription__IdentificationAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getIdentificationAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__8_in_rule__ClassDescription__Group__76078);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2805:1: rule__ClassDescription__Group__8 : ( ( rule__ClassDescription__CommentsAssignment_8 ) ) rule__ClassDescription__Group__9 ;
    public final void rule__ClassDescription__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2809:1: ( ( ( rule__ClassDescription__CommentsAssignment_8 ) ) rule__ClassDescription__Group__9 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2810:1: ( ( rule__ClassDescription__CommentsAssignment_8 ) ) rule__ClassDescription__Group__9
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2810:1: ( ( rule__ClassDescription__CommentsAssignment_8 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2811:1: ( rule__ClassDescription__CommentsAssignment_8 )
            {
             before(grammarAccess.getClassDescriptionAccess().getCommentsAssignment_8()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2812:1: ( rule__ClassDescription__CommentsAssignment_8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2812:2: rule__ClassDescription__CommentsAssignment_8
            {
            pushFollow(FOLLOW_rule__ClassDescription__CommentsAssignment_8_in_rule__ClassDescription__Group__86106);
            rule__ClassDescription__CommentsAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getCommentsAssignment_8()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__9_in_rule__ClassDescription__Group__86115);
            rule__ClassDescription__Group__9();
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
    // $ANTLR end rule__ClassDescription__Group__8


    // $ANTLR start rule__ClassDescription__Group__9
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2823:1: rule__ClassDescription__Group__9 : ( ( rule__ClassDescription__HasAbstractCommandAssignment_9 ) ) rule__ClassDescription__Group__10 ;
    public final void rule__ClassDescription__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2827:1: ( ( ( rule__ClassDescription__HasAbstractCommandAssignment_9 ) ) rule__ClassDescription__Group__10 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2828:1: ( ( rule__ClassDescription__HasAbstractCommandAssignment_9 ) ) rule__ClassDescription__Group__10
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2828:1: ( ( rule__ClassDescription__HasAbstractCommandAssignment_9 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2829:1: ( rule__ClassDescription__HasAbstractCommandAssignment_9 )
            {
             before(grammarAccess.getClassDescriptionAccess().getHasAbstractCommandAssignment_9()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2830:1: ( rule__ClassDescription__HasAbstractCommandAssignment_9 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2830:2: rule__ClassDescription__HasAbstractCommandAssignment_9
            {
            pushFollow(FOLLOW_rule__ClassDescription__HasAbstractCommandAssignment_9_in_rule__ClassDescription__Group__96143);
            rule__ClassDescription__HasAbstractCommandAssignment_9();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getHasAbstractCommandAssignment_9()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__10_in_rule__ClassDescription__Group__96152);
            rule__ClassDescription__Group__10();
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
    // $ANTLR end rule__ClassDescription__Group__9


    // $ANTLR start rule__ClassDescription__Group__10
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2841:1: rule__ClassDescription__Group__10 : ( ( rule__ClassDescription__HasAbstractAttributeAssignment_10 ) ) ;
    public final void rule__ClassDescription__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2845:1: ( ( ( rule__ClassDescription__HasAbstractAttributeAssignment_10 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2846:1: ( ( rule__ClassDescription__HasAbstractAttributeAssignment_10 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2846:1: ( ( rule__ClassDescription__HasAbstractAttributeAssignment_10 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2847:1: ( rule__ClassDescription__HasAbstractAttributeAssignment_10 )
            {
             before(grammarAccess.getClassDescriptionAccess().getHasAbstractAttributeAssignment_10()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2848:1: ( rule__ClassDescription__HasAbstractAttributeAssignment_10 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2848:2: rule__ClassDescription__HasAbstractAttributeAssignment_10
            {
            pushFollow(FOLLOW_rule__ClassDescription__HasAbstractAttributeAssignment_10_in_rule__ClassDescription__Group__106180);
            rule__ClassDescription__HasAbstractAttributeAssignment_10();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getHasAbstractAttributeAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassDescription__Group__10


    // $ANTLR start rule__Inheritance__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2880:1: rule__Inheritance__Group__0 : ( ( rule__Inheritance__ClassnameAssignment_0 ) ) rule__Inheritance__Group__1 ;
    public final void rule__Inheritance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2884:1: ( ( ( rule__Inheritance__ClassnameAssignment_0 ) ) rule__Inheritance__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2885:1: ( ( rule__Inheritance__ClassnameAssignment_0 ) ) rule__Inheritance__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2885:1: ( ( rule__Inheritance__ClassnameAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2886:1: ( rule__Inheritance__ClassnameAssignment_0 )
            {
             before(grammarAccess.getInheritanceAccess().getClassnameAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2887:1: ( rule__Inheritance__ClassnameAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2887:2: rule__Inheritance__ClassnameAssignment_0
            {
            pushFollow(FOLLOW_rule__Inheritance__ClassnameAssignment_0_in_rule__Inheritance__Group__06236);
            rule__Inheritance__ClassnameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getInheritanceAccess().getClassnameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Inheritance__Group__1_in_rule__Inheritance__Group__06245);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2898:1: rule__Inheritance__Group__1 : ( ( rule__Inheritance__SourcePathAssignment_1 ) ) ;
    public final void rule__Inheritance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2902:1: ( ( ( rule__Inheritance__SourcePathAssignment_1 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2903:1: ( ( rule__Inheritance__SourcePathAssignment_1 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2903:1: ( ( rule__Inheritance__SourcePathAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2904:1: ( rule__Inheritance__SourcePathAssignment_1 )
            {
             before(grammarAccess.getInheritanceAccess().getSourcePathAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2905:1: ( rule__Inheritance__SourcePathAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2905:2: rule__Inheritance__SourcePathAssignment_1
            {
            pushFollow(FOLLOW_rule__Inheritance__SourcePathAssignment_1_in_rule__Inheritance__Group__16273);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2919:1: rule__ClassIdentification__Group__0 : ( ( rule__ClassIdentification__ContactAssignment_0 ) ) rule__ClassIdentification__Group__1 ;
    public final void rule__ClassIdentification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2923:1: ( ( ( rule__ClassIdentification__ContactAssignment_0 ) ) rule__ClassIdentification__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2924:1: ( ( rule__ClassIdentification__ContactAssignment_0 ) ) rule__ClassIdentification__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2924:1: ( ( rule__ClassIdentification__ContactAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2925:1: ( rule__ClassIdentification__ContactAssignment_0 )
            {
             before(grammarAccess.getClassIdentificationAccess().getContactAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2926:1: ( rule__ClassIdentification__ContactAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2926:2: rule__ClassIdentification__ContactAssignment_0
            {
            pushFollow(FOLLOW_rule__ClassIdentification__ContactAssignment_0_in_rule__ClassIdentification__Group__06311);
            rule__ClassIdentification__ContactAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getClassIdentificationAccess().getContactAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ClassIdentification__Group__1_in_rule__ClassIdentification__Group__06320);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2937:1: rule__ClassIdentification__Group__1 : ( ( rule__ClassIdentification__ClassFamilyAssignment_1 ) ) rule__ClassIdentification__Group__2 ;
    public final void rule__ClassIdentification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2941:1: ( ( ( rule__ClassIdentification__ClassFamilyAssignment_1 ) ) rule__ClassIdentification__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2942:1: ( ( rule__ClassIdentification__ClassFamilyAssignment_1 ) ) rule__ClassIdentification__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2942:1: ( ( rule__ClassIdentification__ClassFamilyAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2943:1: ( rule__ClassIdentification__ClassFamilyAssignment_1 )
            {
             before(grammarAccess.getClassIdentificationAccess().getClassFamilyAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2944:1: ( rule__ClassIdentification__ClassFamilyAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2944:2: rule__ClassIdentification__ClassFamilyAssignment_1
            {
            pushFollow(FOLLOW_rule__ClassIdentification__ClassFamilyAssignment_1_in_rule__ClassIdentification__Group__16348);
            rule__ClassIdentification__ClassFamilyAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getClassIdentificationAccess().getClassFamilyAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__ClassIdentification__Group__2_in_rule__ClassIdentification__Group__16357);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2955:1: rule__ClassIdentification__Group__2 : ( ( rule__ClassIdentification__SiteSpecificAssignment_2 ) ) rule__ClassIdentification__Group__3 ;
    public final void rule__ClassIdentification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2959:1: ( ( ( rule__ClassIdentification__SiteSpecificAssignment_2 ) ) rule__ClassIdentification__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2960:1: ( ( rule__ClassIdentification__SiteSpecificAssignment_2 ) ) rule__ClassIdentification__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2960:1: ( ( rule__ClassIdentification__SiteSpecificAssignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2961:1: ( rule__ClassIdentification__SiteSpecificAssignment_2 )
            {
             before(grammarAccess.getClassIdentificationAccess().getSiteSpecificAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2962:1: ( rule__ClassIdentification__SiteSpecificAssignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2962:2: rule__ClassIdentification__SiteSpecificAssignment_2
            {
            pushFollow(FOLLOW_rule__ClassIdentification__SiteSpecificAssignment_2_in_rule__ClassIdentification__Group__26385);
            rule__ClassIdentification__SiteSpecificAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getClassIdentificationAccess().getSiteSpecificAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__ClassIdentification__Group__3_in_rule__ClassIdentification__Group__26394);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2973:1: rule__ClassIdentification__Group__3 : ( ( rule__ClassIdentification__PlatformAssignment_3 ) ) rule__ClassIdentification__Group__4 ;
    public final void rule__ClassIdentification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2977:1: ( ( ( rule__ClassIdentification__PlatformAssignment_3 ) ) rule__ClassIdentification__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2978:1: ( ( rule__ClassIdentification__PlatformAssignment_3 ) ) rule__ClassIdentification__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2978:1: ( ( rule__ClassIdentification__PlatformAssignment_3 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2979:1: ( rule__ClassIdentification__PlatformAssignment_3 )
            {
             before(grammarAccess.getClassIdentificationAccess().getPlatformAssignment_3()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2980:1: ( rule__ClassIdentification__PlatformAssignment_3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2980:2: rule__ClassIdentification__PlatformAssignment_3
            {
            pushFollow(FOLLOW_rule__ClassIdentification__PlatformAssignment_3_in_rule__ClassIdentification__Group__36422);
            rule__ClassIdentification__PlatformAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getClassIdentificationAccess().getPlatformAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__ClassIdentification__Group__4_in_rule__ClassIdentification__Group__36431);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2991:1: rule__ClassIdentification__Group__4 : ( ( rule__ClassIdentification__BusAssignment_4 ) ) rule__ClassIdentification__Group__5 ;
    public final void rule__ClassIdentification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2995:1: ( ( ( rule__ClassIdentification__BusAssignment_4 ) ) rule__ClassIdentification__Group__5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2996:1: ( ( rule__ClassIdentification__BusAssignment_4 ) ) rule__ClassIdentification__Group__5
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2996:1: ( ( rule__ClassIdentification__BusAssignment_4 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2997:1: ( rule__ClassIdentification__BusAssignment_4 )
            {
             before(grammarAccess.getClassIdentificationAccess().getBusAssignment_4()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2998:1: ( rule__ClassIdentification__BusAssignment_4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2998:2: rule__ClassIdentification__BusAssignment_4
            {
            pushFollow(FOLLOW_rule__ClassIdentification__BusAssignment_4_in_rule__ClassIdentification__Group__46459);
            rule__ClassIdentification__BusAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getClassIdentificationAccess().getBusAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__ClassIdentification__Group__5_in_rule__ClassIdentification__Group__46468);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3009:1: rule__ClassIdentification__Group__5 : ( ( rule__ClassIdentification__ManufacturerAssignment_5 ) ) rule__ClassIdentification__Group__6 ;
    public final void rule__ClassIdentification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3013:1: ( ( ( rule__ClassIdentification__ManufacturerAssignment_5 ) ) rule__ClassIdentification__Group__6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3014:1: ( ( rule__ClassIdentification__ManufacturerAssignment_5 ) ) rule__ClassIdentification__Group__6
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3014:1: ( ( rule__ClassIdentification__ManufacturerAssignment_5 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3015:1: ( rule__ClassIdentification__ManufacturerAssignment_5 )
            {
             before(grammarAccess.getClassIdentificationAccess().getManufacturerAssignment_5()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3016:1: ( rule__ClassIdentification__ManufacturerAssignment_5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3016:2: rule__ClassIdentification__ManufacturerAssignment_5
            {
            pushFollow(FOLLOW_rule__ClassIdentification__ManufacturerAssignment_5_in_rule__ClassIdentification__Group__56496);
            rule__ClassIdentification__ManufacturerAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getClassIdentificationAccess().getManufacturerAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__ClassIdentification__Group__6_in_rule__ClassIdentification__Group__56505);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3027:1: rule__ClassIdentification__Group__6 : ( ( rule__ClassIdentification__ReferenceAssignment_6 ) ) ;
    public final void rule__ClassIdentification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3031:1: ( ( ( rule__ClassIdentification__ReferenceAssignment_6 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3032:1: ( ( rule__ClassIdentification__ReferenceAssignment_6 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3032:1: ( ( rule__ClassIdentification__ReferenceAssignment_6 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3033:1: ( rule__ClassIdentification__ReferenceAssignment_6 )
            {
             before(grammarAccess.getClassIdentificationAccess().getReferenceAssignment_6()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3034:1: ( rule__ClassIdentification__ReferenceAssignment_6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3034:2: rule__ClassIdentification__ReferenceAssignment_6
            {
            pushFollow(FOLLOW_rule__ClassIdentification__ReferenceAssignment_6_in_rule__ClassIdentification__Group__66533);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3058:1: rule__State__Group__0 : ( ( rule__State__NameAssignment_0 ) ) rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3062:1: ( ( ( rule__State__NameAssignment_0 ) ) rule__State__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3063:1: ( ( rule__State__NameAssignment_0 ) ) rule__State__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3063:1: ( ( rule__State__NameAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3064:1: ( rule__State__NameAssignment_0 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3065:1: ( rule__State__NameAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3065:2: rule__State__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_0_in_rule__State__Group__06581);
            rule__State__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__06590);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3076:1: rule__State__Group__1 : ( ( rule__State__DescriptionAssignment_1 ) ) rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3080:1: ( ( ( rule__State__DescriptionAssignment_1 ) ) rule__State__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3081:1: ( ( rule__State__DescriptionAssignment_1 ) ) rule__State__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3081:1: ( ( rule__State__DescriptionAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3082:1: ( rule__State__DescriptionAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getDescriptionAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3083:1: ( rule__State__DescriptionAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3083:2: rule__State__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__State__DescriptionAssignment_1_in_rule__State__Group__16618);
            rule__State__DescriptionAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getStateAccess().getDescriptionAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__16627);
            rule__State__Group__2();
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
    // $ANTLR end rule__State__Group__1


    // $ANTLR start rule__State__Group__2
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3094:1: rule__State__Group__2 : ( ( rule__State__StatusAssignment_2 ) ) ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3098:1: ( ( ( rule__State__StatusAssignment_2 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3099:1: ( ( rule__State__StatusAssignment_2 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3099:1: ( ( rule__State__StatusAssignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3100:1: ( rule__State__StatusAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getStatusAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3101:1: ( rule__State__StatusAssignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3101:2: rule__State__StatusAssignment_2
            {
            pushFollow(FOLLOW_rule__State__StatusAssignment_2_in_rule__State__Group__26655);
            rule__State__StatusAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getStateAccess().getStatusAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__2


    // $ANTLR start rule__Property__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3117:1: rule__Property__Group__0 : ( ( rule__Property__NameAssignment_0 ) ) rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3121:1: ( ( ( rule__Property__NameAssignment_0 ) ) rule__Property__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3122:1: ( ( rule__Property__NameAssignment_0 ) ) rule__Property__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3122:1: ( ( rule__Property__NameAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3123:1: ( rule__Property__NameAssignment_0 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3124:1: ( rule__Property__NameAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3124:2: rule__Property__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Property__NameAssignment_0_in_rule__Property__Group__06695);
            rule__Property__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__06704);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3135:1: rule__Property__Group__1 : ( ( rule__Property__TypeAssignment_1 ) ) rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3139:1: ( ( ( rule__Property__TypeAssignment_1 ) ) rule__Property__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3140:1: ( ( rule__Property__TypeAssignment_1 ) ) rule__Property__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3140:1: ( ( rule__Property__TypeAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3141:1: ( rule__Property__TypeAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3142:1: ( rule__Property__TypeAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3142:2: rule__Property__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Property__TypeAssignment_1_in_rule__Property__Group__16732);
            rule__Property__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__16741);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3153:1: rule__Property__Group__2 : ( ( rule__Property__StatusAssignment_2 ) ) rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3157:1: ( ( ( rule__Property__StatusAssignment_2 ) ) rule__Property__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3158:1: ( ( rule__Property__StatusAssignment_2 ) ) rule__Property__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3158:1: ( ( rule__Property__StatusAssignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3159:1: ( rule__Property__StatusAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getStatusAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3160:1: ( rule__Property__StatusAssignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3160:2: rule__Property__StatusAssignment_2
            {
            pushFollow(FOLLOW_rule__Property__StatusAssignment_2_in_rule__Property__Group__26769);
            rule__Property__StatusAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getStatusAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__3_in_rule__Property__Group__26778);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3171:1: rule__Property__Group__3 : ( ( rule__Property__DescriptionAssignment_3 ) ) rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3175:1: ( ( ( rule__Property__DescriptionAssignment_3 ) ) rule__Property__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3176:1: ( ( rule__Property__DescriptionAssignment_3 ) ) rule__Property__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3176:1: ( ( rule__Property__DescriptionAssignment_3 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3177:1: ( rule__Property__DescriptionAssignment_3 )
            {
             before(grammarAccess.getPropertyAccess().getDescriptionAssignment_3()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3178:1: ( rule__Property__DescriptionAssignment_3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3178:2: rule__Property__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_rule__Property__DescriptionAssignment_3_in_rule__Property__Group__36806);
            rule__Property__DescriptionAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getDescriptionAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__4_in_rule__Property__Group__36815);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3189:1: rule__Property__Group__4 : ( 'defaultPropValue:' ) rule__Property__Group__5 ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3193:1: ( ( 'defaultPropValue:' ) rule__Property__Group__5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3194:1: ( 'defaultPropValue:' ) rule__Property__Group__5
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3194:1: ( 'defaultPropValue:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3195:1: 'defaultPropValue:'
            {
             before(grammarAccess.getPropertyAccess().getDefaultPropValueKeyword_4()); 
            match(input,37,FOLLOW_37_in_rule__Property__Group__46844); 
             after(grammarAccess.getPropertyAccess().getDefaultPropValueKeyword_4()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__5_in_rule__Property__Group__46854);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3209:1: rule__Property__Group__5 : ( ( rule__Property__DefaultPropValueAssignment_5 )* ) ;
    public final void rule__Property__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3213:1: ( ( ( rule__Property__DefaultPropValueAssignment_5 )* ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3214:1: ( ( rule__Property__DefaultPropValueAssignment_5 )* )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3214:1: ( ( rule__Property__DefaultPropValueAssignment_5 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3215:1: ( rule__Property__DefaultPropValueAssignment_5 )*
            {
             before(grammarAccess.getPropertyAccess().getDefaultPropValueAssignment_5()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3216:1: ( rule__Property__DefaultPropValueAssignment_5 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_STRING) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3216:2: rule__Property__DefaultPropValueAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Property__DefaultPropValueAssignment_5_in_rule__Property__Group__56882);
            	    rule__Property__DefaultPropValueAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3238:1: rule__InheritanceStatus__Group__0 : ( ( rule__InheritanceStatus__AbstractAssignment_0 ) ) rule__InheritanceStatus__Group__1 ;
    public final void rule__InheritanceStatus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3242:1: ( ( ( rule__InheritanceStatus__AbstractAssignment_0 ) ) rule__InheritanceStatus__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3243:1: ( ( rule__InheritanceStatus__AbstractAssignment_0 ) ) rule__InheritanceStatus__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3243:1: ( ( rule__InheritanceStatus__AbstractAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3244:1: ( rule__InheritanceStatus__AbstractAssignment_0 )
            {
             before(grammarAccess.getInheritanceStatusAccess().getAbstractAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3245:1: ( rule__InheritanceStatus__AbstractAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3245:2: rule__InheritanceStatus__AbstractAssignment_0
            {
            pushFollow(FOLLOW_rule__InheritanceStatus__AbstractAssignment_0_in_rule__InheritanceStatus__Group__06929);
            rule__InheritanceStatus__AbstractAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getInheritanceStatusAccess().getAbstractAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__InheritanceStatus__Group__1_in_rule__InheritanceStatus__Group__06938);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3256:1: rule__InheritanceStatus__Group__1 : ( ( rule__InheritanceStatus__InheritedAssignment_1 ) ) rule__InheritanceStatus__Group__2 ;
    public final void rule__InheritanceStatus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3260:1: ( ( ( rule__InheritanceStatus__InheritedAssignment_1 ) ) rule__InheritanceStatus__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3261:1: ( ( rule__InheritanceStatus__InheritedAssignment_1 ) ) rule__InheritanceStatus__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3261:1: ( ( rule__InheritanceStatus__InheritedAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3262:1: ( rule__InheritanceStatus__InheritedAssignment_1 )
            {
             before(grammarAccess.getInheritanceStatusAccess().getInheritedAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3263:1: ( rule__InheritanceStatus__InheritedAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3263:2: rule__InheritanceStatus__InheritedAssignment_1
            {
            pushFollow(FOLLOW_rule__InheritanceStatus__InheritedAssignment_1_in_rule__InheritanceStatus__Group__16966);
            rule__InheritanceStatus__InheritedAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getInheritanceStatusAccess().getInheritedAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__InheritanceStatus__Group__2_in_rule__InheritanceStatus__Group__16975);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3274:1: rule__InheritanceStatus__Group__2 : ( ( rule__InheritanceStatus__ConcreteAssignment_2 ) ) rule__InheritanceStatus__Group__3 ;
    public final void rule__InheritanceStatus__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3278:1: ( ( ( rule__InheritanceStatus__ConcreteAssignment_2 ) ) rule__InheritanceStatus__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3279:1: ( ( rule__InheritanceStatus__ConcreteAssignment_2 ) ) rule__InheritanceStatus__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3279:1: ( ( rule__InheritanceStatus__ConcreteAssignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3280:1: ( rule__InheritanceStatus__ConcreteAssignment_2 )
            {
             before(grammarAccess.getInheritanceStatusAccess().getConcreteAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3281:1: ( rule__InheritanceStatus__ConcreteAssignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3281:2: rule__InheritanceStatus__ConcreteAssignment_2
            {
            pushFollow(FOLLOW_rule__InheritanceStatus__ConcreteAssignment_2_in_rule__InheritanceStatus__Group__27003);
            rule__InheritanceStatus__ConcreteAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getInheritanceStatusAccess().getConcreteAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__InheritanceStatus__Group__3_in_rule__InheritanceStatus__Group__27012);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3292:1: rule__InheritanceStatus__Group__3 : ( ( rule__InheritanceStatus__ConcreteHereAssignment_3 ) ) rule__InheritanceStatus__Group__4 ;
    public final void rule__InheritanceStatus__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3296:1: ( ( ( rule__InheritanceStatus__ConcreteHereAssignment_3 ) ) rule__InheritanceStatus__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3297:1: ( ( rule__InheritanceStatus__ConcreteHereAssignment_3 ) ) rule__InheritanceStatus__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3297:1: ( ( rule__InheritanceStatus__ConcreteHereAssignment_3 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3298:1: ( rule__InheritanceStatus__ConcreteHereAssignment_3 )
            {
             before(grammarAccess.getInheritanceStatusAccess().getConcreteHereAssignment_3()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3299:1: ( rule__InheritanceStatus__ConcreteHereAssignment_3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3299:2: rule__InheritanceStatus__ConcreteHereAssignment_3
            {
            pushFollow(FOLLOW_rule__InheritanceStatus__ConcreteHereAssignment_3_in_rule__InheritanceStatus__Group__37040);
            rule__InheritanceStatus__ConcreteHereAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getInheritanceStatusAccess().getConcreteHereAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__InheritanceStatus__Group__4_in_rule__InheritanceStatus__Group__37049);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3310:1: rule__InheritanceStatus__Group__4 : ( ( rule__InheritanceStatus__HasChangedAssignment_4 ) ) ;
    public final void rule__InheritanceStatus__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3314:1: ( ( ( rule__InheritanceStatus__HasChangedAssignment_4 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3315:1: ( ( rule__InheritanceStatus__HasChangedAssignment_4 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3315:1: ( ( rule__InheritanceStatus__HasChangedAssignment_4 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3316:1: ( rule__InheritanceStatus__HasChangedAssignment_4 )
            {
             before(grammarAccess.getInheritanceStatusAccess().getHasChangedAssignment_4()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3317:1: ( rule__InheritanceStatus__HasChangedAssignment_4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3317:2: rule__InheritanceStatus__HasChangedAssignment_4
            {
            pushFollow(FOLLOW_rule__InheritanceStatus__HasChangedAssignment_4_in_rule__InheritanceStatus__Group__47077);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3337:1: rule__Command__Group__0 : ( ( rule__Command__NameAssignment_0 ) ) rule__Command__Group__1 ;
    public final void rule__Command__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3341:1: ( ( ( rule__Command__NameAssignment_0 ) ) rule__Command__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3342:1: ( ( rule__Command__NameAssignment_0 ) ) rule__Command__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3342:1: ( ( rule__Command__NameAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3343:1: ( rule__Command__NameAssignment_0 )
            {
             before(grammarAccess.getCommandAccess().getNameAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3344:1: ( rule__Command__NameAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3344:2: rule__Command__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Command__NameAssignment_0_in_rule__Command__Group__07121);
            rule__Command__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__1_in_rule__Command__Group__07130);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3355:1: rule__Command__Group__1 : ( ( rule__Command__ArginAssignment_1 ) ) rule__Command__Group__2 ;
    public final void rule__Command__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3359:1: ( ( ( rule__Command__ArginAssignment_1 ) ) rule__Command__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3360:1: ( ( rule__Command__ArginAssignment_1 ) ) rule__Command__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3360:1: ( ( rule__Command__ArginAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3361:1: ( rule__Command__ArginAssignment_1 )
            {
             before(grammarAccess.getCommandAccess().getArginAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3362:1: ( rule__Command__ArginAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3362:2: rule__Command__ArginAssignment_1
            {
            pushFollow(FOLLOW_rule__Command__ArginAssignment_1_in_rule__Command__Group__17158);
            rule__Command__ArginAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getArginAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__2_in_rule__Command__Group__17167);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3373:1: rule__Command__Group__2 : ( ( rule__Command__ArgoutAssignment_2 ) ) rule__Command__Group__3 ;
    public final void rule__Command__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3377:1: ( ( ( rule__Command__ArgoutAssignment_2 ) ) rule__Command__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3378:1: ( ( rule__Command__ArgoutAssignment_2 ) ) rule__Command__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3378:1: ( ( rule__Command__ArgoutAssignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3379:1: ( rule__Command__ArgoutAssignment_2 )
            {
             before(grammarAccess.getCommandAccess().getArgoutAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3380:1: ( rule__Command__ArgoutAssignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3380:2: rule__Command__ArgoutAssignment_2
            {
            pushFollow(FOLLOW_rule__Command__ArgoutAssignment_2_in_rule__Command__Group__27195);
            rule__Command__ArgoutAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getArgoutAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__3_in_rule__Command__Group__27204);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3391:1: rule__Command__Group__3 : ( ( rule__Command__DescriptionAssignment_3 ) ) rule__Command__Group__4 ;
    public final void rule__Command__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3395:1: ( ( ( rule__Command__DescriptionAssignment_3 ) ) rule__Command__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3396:1: ( ( rule__Command__DescriptionAssignment_3 ) ) rule__Command__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3396:1: ( ( rule__Command__DescriptionAssignment_3 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3397:1: ( rule__Command__DescriptionAssignment_3 )
            {
             before(grammarAccess.getCommandAccess().getDescriptionAssignment_3()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3398:1: ( rule__Command__DescriptionAssignment_3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3398:2: rule__Command__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_rule__Command__DescriptionAssignment_3_in_rule__Command__Group__37232);
            rule__Command__DescriptionAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getDescriptionAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__4_in_rule__Command__Group__37241);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3409:1: rule__Command__Group__4 : ( ( rule__Command__StatusAssignment_4 ) ) rule__Command__Group__5 ;
    public final void rule__Command__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3413:1: ( ( ( rule__Command__StatusAssignment_4 ) ) rule__Command__Group__5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3414:1: ( ( rule__Command__StatusAssignment_4 ) ) rule__Command__Group__5
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3414:1: ( ( rule__Command__StatusAssignment_4 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3415:1: ( rule__Command__StatusAssignment_4 )
            {
             before(grammarAccess.getCommandAccess().getStatusAssignment_4()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3416:1: ( rule__Command__StatusAssignment_4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3416:2: rule__Command__StatusAssignment_4
            {
            pushFollow(FOLLOW_rule__Command__StatusAssignment_4_in_rule__Command__Group__47269);
            rule__Command__StatusAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getStatusAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__5_in_rule__Command__Group__47278);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3427:1: rule__Command__Group__5 : ( ( rule__Command__ExecMethodAssignment_5 ) ) rule__Command__Group__6 ;
    public final void rule__Command__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3431:1: ( ( ( rule__Command__ExecMethodAssignment_5 ) ) rule__Command__Group__6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3432:1: ( ( rule__Command__ExecMethodAssignment_5 ) ) rule__Command__Group__6
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3432:1: ( ( rule__Command__ExecMethodAssignment_5 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3433:1: ( rule__Command__ExecMethodAssignment_5 )
            {
             before(grammarAccess.getCommandAccess().getExecMethodAssignment_5()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3434:1: ( rule__Command__ExecMethodAssignment_5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3434:2: rule__Command__ExecMethodAssignment_5
            {
            pushFollow(FOLLOW_rule__Command__ExecMethodAssignment_5_in_rule__Command__Group__57306);
            rule__Command__ExecMethodAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getExecMethodAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__6_in_rule__Command__Group__57315);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3445:1: rule__Command__Group__6 : ( ( rule__Command__DisplayLevelAssignment_6 ) ) rule__Command__Group__7 ;
    public final void rule__Command__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3449:1: ( ( ( rule__Command__DisplayLevelAssignment_6 ) ) rule__Command__Group__7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3450:1: ( ( rule__Command__DisplayLevelAssignment_6 ) ) rule__Command__Group__7
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3450:1: ( ( rule__Command__DisplayLevelAssignment_6 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3451:1: ( rule__Command__DisplayLevelAssignment_6 )
            {
             before(grammarAccess.getCommandAccess().getDisplayLevelAssignment_6()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3452:1: ( rule__Command__DisplayLevelAssignment_6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3452:2: rule__Command__DisplayLevelAssignment_6
            {
            pushFollow(FOLLOW_rule__Command__DisplayLevelAssignment_6_in_rule__Command__Group__67343);
            rule__Command__DisplayLevelAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getDisplayLevelAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__7_in_rule__Command__Group__67352);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3463:1: rule__Command__Group__7 : ( ( rule__Command__PolledPeriodAssignment_7 ) ) rule__Command__Group__8 ;
    public final void rule__Command__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3467:1: ( ( ( rule__Command__PolledPeriodAssignment_7 ) ) rule__Command__Group__8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3468:1: ( ( rule__Command__PolledPeriodAssignment_7 ) ) rule__Command__Group__8
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3468:1: ( ( rule__Command__PolledPeriodAssignment_7 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3469:1: ( rule__Command__PolledPeriodAssignment_7 )
            {
             before(grammarAccess.getCommandAccess().getPolledPeriodAssignment_7()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3470:1: ( rule__Command__PolledPeriodAssignment_7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3470:2: rule__Command__PolledPeriodAssignment_7
            {
            pushFollow(FOLLOW_rule__Command__PolledPeriodAssignment_7_in_rule__Command__Group__77380);
            rule__Command__PolledPeriodAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getPolledPeriodAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__8_in_rule__Command__Group__77389);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3481:1: rule__Command__Group__8 : ( 'excludedStates:' ) rule__Command__Group__9 ;
    public final void rule__Command__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3485:1: ( ( 'excludedStates:' ) rule__Command__Group__9 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3486:1: ( 'excludedStates:' ) rule__Command__Group__9
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3486:1: ( 'excludedStates:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3487:1: 'excludedStates:'
            {
             before(grammarAccess.getCommandAccess().getExcludedStatesKeyword_8()); 
            match(input,38,FOLLOW_38_in_rule__Command__Group__87418); 
             after(grammarAccess.getCommandAccess().getExcludedStatesKeyword_8()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__9_in_rule__Command__Group__87428);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3501:1: rule__Command__Group__9 : ( ( rule__Command__ExcludedStatesAssignment_9 )* ) ;
    public final void rule__Command__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3505:1: ( ( ( rule__Command__ExcludedStatesAssignment_9 )* ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3506:1: ( ( rule__Command__ExcludedStatesAssignment_9 )* )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3506:1: ( ( rule__Command__ExcludedStatesAssignment_9 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3507:1: ( rule__Command__ExcludedStatesAssignment_9 )*
            {
             before(grammarAccess.getCommandAccess().getExcludedStatesAssignment_9()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3508:1: ( rule__Command__ExcludedStatesAssignment_9 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_STRING) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3508:2: rule__Command__ExcludedStatesAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__Command__ExcludedStatesAssignment_9_in_rule__Command__Group__97456);
            	    rule__Command__ExcludedStatesAssignment_9();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3538:1: rule__Argument__Group__0 : ( ( rule__Argument__TypeAssignment_0 ) ) rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3542:1: ( ( ( rule__Argument__TypeAssignment_0 ) ) rule__Argument__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3543:1: ( ( rule__Argument__TypeAssignment_0 ) ) rule__Argument__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3543:1: ( ( rule__Argument__TypeAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3544:1: ( rule__Argument__TypeAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getTypeAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3545:1: ( rule__Argument__TypeAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3545:2: rule__Argument__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Argument__TypeAssignment_0_in_rule__Argument__Group__07511);
            rule__Argument__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getTypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__07520);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3556:1: rule__Argument__Group__1 : ( ( rule__Argument__DescriptionAssignment_1 ) ) ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3560:1: ( ( ( rule__Argument__DescriptionAssignment_1 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3561:1: ( ( rule__Argument__DescriptionAssignment_1 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3561:1: ( ( rule__Argument__DescriptionAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3562:1: ( rule__Argument__DescriptionAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getDescriptionAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3563:1: ( rule__Argument__DescriptionAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3563:2: rule__Argument__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__Argument__DescriptionAssignment_1_in_rule__Argument__Group__17548);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3577:1: rule__Attribute__Group__0 : ( ( rule__Attribute__NameAssignment_0 ) ) rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3581:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) rule__Attribute__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3582:1: ( ( rule__Attribute__NameAssignment_0 ) ) rule__Attribute__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3582:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3583:1: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3584:1: ( rule__Attribute__NameAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3584:2: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__07586);
            rule__Attribute__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__07595);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3595:1: rule__Attribute__Group__1 : ( ( rule__Attribute__AttTypeAssignment_1 ) ) rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3599:1: ( ( ( rule__Attribute__AttTypeAssignment_1 ) ) rule__Attribute__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3600:1: ( ( rule__Attribute__AttTypeAssignment_1 ) ) rule__Attribute__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3600:1: ( ( rule__Attribute__AttTypeAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3601:1: ( rule__Attribute__AttTypeAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getAttTypeAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3602:1: ( rule__Attribute__AttTypeAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3602:2: rule__Attribute__AttTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__AttTypeAssignment_1_in_rule__Attribute__Group__17623);
            rule__Attribute__AttTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAttTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__17632);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3613:1: rule__Attribute__Group__2 : ( ( rule__Attribute__DataTypeAssignment_2 ) ) rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3617:1: ( ( ( rule__Attribute__DataTypeAssignment_2 ) ) rule__Attribute__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3618:1: ( ( rule__Attribute__DataTypeAssignment_2 ) ) rule__Attribute__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3618:1: ( ( rule__Attribute__DataTypeAssignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3619:1: ( rule__Attribute__DataTypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getDataTypeAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3620:1: ( rule__Attribute__DataTypeAssignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3620:2: rule__Attribute__DataTypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__DataTypeAssignment_2_in_rule__Attribute__Group__27660);
            rule__Attribute__DataTypeAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getDataTypeAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__27669);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3631:1: rule__Attribute__Group__3 : ( ( rule__Attribute__RwTypeAssignment_3 ) ) rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3635:1: ( ( ( rule__Attribute__RwTypeAssignment_3 ) ) rule__Attribute__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3636:1: ( ( rule__Attribute__RwTypeAssignment_3 ) ) rule__Attribute__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3636:1: ( ( rule__Attribute__RwTypeAssignment_3 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3637:1: ( rule__Attribute__RwTypeAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getRwTypeAssignment_3()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3638:1: ( rule__Attribute__RwTypeAssignment_3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3638:2: rule__Attribute__RwTypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Attribute__RwTypeAssignment_3_in_rule__Attribute__Group__37697);
            rule__Attribute__RwTypeAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getRwTypeAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__37706);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3649:1: rule__Attribute__Group__4 : ( ( rule__Attribute__DisplayLevelAssignment_4 ) ) rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3653:1: ( ( ( rule__Attribute__DisplayLevelAssignment_4 ) ) rule__Attribute__Group__5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3654:1: ( ( rule__Attribute__DisplayLevelAssignment_4 ) ) rule__Attribute__Group__5
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3654:1: ( ( rule__Attribute__DisplayLevelAssignment_4 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3655:1: ( rule__Attribute__DisplayLevelAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getDisplayLevelAssignment_4()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3656:1: ( rule__Attribute__DisplayLevelAssignment_4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3656:2: rule__Attribute__DisplayLevelAssignment_4
            {
            pushFollow(FOLLOW_rule__Attribute__DisplayLevelAssignment_4_in_rule__Attribute__Group__47734);
            rule__Attribute__DisplayLevelAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getDisplayLevelAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__47743);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3667:1: rule__Attribute__Group__5 : ( ( rule__Attribute__PolledPeriodAssignment_5 ) ) rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3671:1: ( ( ( rule__Attribute__PolledPeriodAssignment_5 ) ) rule__Attribute__Group__6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3672:1: ( ( rule__Attribute__PolledPeriodAssignment_5 ) ) rule__Attribute__Group__6
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3672:1: ( ( rule__Attribute__PolledPeriodAssignment_5 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3673:1: ( rule__Attribute__PolledPeriodAssignment_5 )
            {
             before(grammarAccess.getAttributeAccess().getPolledPeriodAssignment_5()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3674:1: ( rule__Attribute__PolledPeriodAssignment_5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3674:2: rule__Attribute__PolledPeriodAssignment_5
            {
            pushFollow(FOLLOW_rule__Attribute__PolledPeriodAssignment_5_in_rule__Attribute__Group__57771);
            rule__Attribute__PolledPeriodAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getPolledPeriodAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__6_in_rule__Attribute__Group__57780);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3685:1: rule__Attribute__Group__6 : ( ( rule__Attribute__MaxXAssignment_6 ) ) rule__Attribute__Group__7 ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3689:1: ( ( ( rule__Attribute__MaxXAssignment_6 ) ) rule__Attribute__Group__7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3690:1: ( ( rule__Attribute__MaxXAssignment_6 ) ) rule__Attribute__Group__7
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3690:1: ( ( rule__Attribute__MaxXAssignment_6 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3691:1: ( rule__Attribute__MaxXAssignment_6 )
            {
             before(grammarAccess.getAttributeAccess().getMaxXAssignment_6()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3692:1: ( rule__Attribute__MaxXAssignment_6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3692:2: rule__Attribute__MaxXAssignment_6
            {
            pushFollow(FOLLOW_rule__Attribute__MaxXAssignment_6_in_rule__Attribute__Group__67808);
            rule__Attribute__MaxXAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getMaxXAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__7_in_rule__Attribute__Group__67817);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3703:1: rule__Attribute__Group__7 : ( ( rule__Attribute__MaxYAssignment_7 ) ) rule__Attribute__Group__8 ;
    public final void rule__Attribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3707:1: ( ( ( rule__Attribute__MaxYAssignment_7 ) ) rule__Attribute__Group__8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3708:1: ( ( rule__Attribute__MaxYAssignment_7 ) ) rule__Attribute__Group__8
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3708:1: ( ( rule__Attribute__MaxYAssignment_7 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3709:1: ( rule__Attribute__MaxYAssignment_7 )
            {
             before(grammarAccess.getAttributeAccess().getMaxYAssignment_7()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3710:1: ( rule__Attribute__MaxYAssignment_7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3710:2: rule__Attribute__MaxYAssignment_7
            {
            pushFollow(FOLLOW_rule__Attribute__MaxYAssignment_7_in_rule__Attribute__Group__77845);
            rule__Attribute__MaxYAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getMaxYAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__8_in_rule__Attribute__Group__77854);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3721:1: rule__Attribute__Group__8 : ( ( rule__Attribute__MemorizedAssignment_8 ) ) rule__Attribute__Group__9 ;
    public final void rule__Attribute__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3725:1: ( ( ( rule__Attribute__MemorizedAssignment_8 ) ) rule__Attribute__Group__9 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3726:1: ( ( rule__Attribute__MemorizedAssignment_8 ) ) rule__Attribute__Group__9
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3726:1: ( ( rule__Attribute__MemorizedAssignment_8 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3727:1: ( rule__Attribute__MemorizedAssignment_8 )
            {
             before(grammarAccess.getAttributeAccess().getMemorizedAssignment_8()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3728:1: ( rule__Attribute__MemorizedAssignment_8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3728:2: rule__Attribute__MemorizedAssignment_8
            {
            pushFollow(FOLLOW_rule__Attribute__MemorizedAssignment_8_in_rule__Attribute__Group__87882);
            rule__Attribute__MemorizedAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getMemorizedAssignment_8()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__9_in_rule__Attribute__Group__87891);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3739:1: rule__Attribute__Group__9 : ( ( rule__Attribute__MemorizedAtInitAssignment_9 ) ) rule__Attribute__Group__10 ;
    public final void rule__Attribute__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3743:1: ( ( ( rule__Attribute__MemorizedAtInitAssignment_9 ) ) rule__Attribute__Group__10 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3744:1: ( ( rule__Attribute__MemorizedAtInitAssignment_9 ) ) rule__Attribute__Group__10
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3744:1: ( ( rule__Attribute__MemorizedAtInitAssignment_9 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3745:1: ( rule__Attribute__MemorizedAtInitAssignment_9 )
            {
             before(grammarAccess.getAttributeAccess().getMemorizedAtInitAssignment_9()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3746:1: ( rule__Attribute__MemorizedAtInitAssignment_9 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3746:2: rule__Attribute__MemorizedAtInitAssignment_9
            {
            pushFollow(FOLLOW_rule__Attribute__MemorizedAtInitAssignment_9_in_rule__Attribute__Group__97919);
            rule__Attribute__MemorizedAtInitAssignment_9();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getMemorizedAtInitAssignment_9()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__10_in_rule__Attribute__Group__97928);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3757:1: rule__Attribute__Group__10 : ( ( rule__Attribute__ChangeEventAssignment_10 ) ) rule__Attribute__Group__11 ;
    public final void rule__Attribute__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3761:1: ( ( ( rule__Attribute__ChangeEventAssignment_10 ) ) rule__Attribute__Group__11 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3762:1: ( ( rule__Attribute__ChangeEventAssignment_10 ) ) rule__Attribute__Group__11
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3762:1: ( ( rule__Attribute__ChangeEventAssignment_10 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3763:1: ( rule__Attribute__ChangeEventAssignment_10 )
            {
             before(grammarAccess.getAttributeAccess().getChangeEventAssignment_10()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3764:1: ( rule__Attribute__ChangeEventAssignment_10 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3764:2: rule__Attribute__ChangeEventAssignment_10
            {
            pushFollow(FOLLOW_rule__Attribute__ChangeEventAssignment_10_in_rule__Attribute__Group__107956);
            rule__Attribute__ChangeEventAssignment_10();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getChangeEventAssignment_10()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__11_in_rule__Attribute__Group__107965);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3775:1: rule__Attribute__Group__11 : ( ( rule__Attribute__ArchiveEventAssignment_11 ) ) rule__Attribute__Group__12 ;
    public final void rule__Attribute__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3779:1: ( ( ( rule__Attribute__ArchiveEventAssignment_11 ) ) rule__Attribute__Group__12 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3780:1: ( ( rule__Attribute__ArchiveEventAssignment_11 ) ) rule__Attribute__Group__12
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3780:1: ( ( rule__Attribute__ArchiveEventAssignment_11 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3781:1: ( rule__Attribute__ArchiveEventAssignment_11 )
            {
             before(grammarAccess.getAttributeAccess().getArchiveEventAssignment_11()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3782:1: ( rule__Attribute__ArchiveEventAssignment_11 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3782:2: rule__Attribute__ArchiveEventAssignment_11
            {
            pushFollow(FOLLOW_rule__Attribute__ArchiveEventAssignment_11_in_rule__Attribute__Group__117993);
            rule__Attribute__ArchiveEventAssignment_11();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getArchiveEventAssignment_11()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__12_in_rule__Attribute__Group__118002);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3793:1: rule__Attribute__Group__12 : ( ( rule__Attribute__StatusAssignment_12 ) ) rule__Attribute__Group__13 ;
    public final void rule__Attribute__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3797:1: ( ( ( rule__Attribute__StatusAssignment_12 ) ) rule__Attribute__Group__13 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3798:1: ( ( rule__Attribute__StatusAssignment_12 ) ) rule__Attribute__Group__13
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3798:1: ( ( rule__Attribute__StatusAssignment_12 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3799:1: ( rule__Attribute__StatusAssignment_12 )
            {
             before(grammarAccess.getAttributeAccess().getStatusAssignment_12()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3800:1: ( rule__Attribute__StatusAssignment_12 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3800:2: rule__Attribute__StatusAssignment_12
            {
            pushFollow(FOLLOW_rule__Attribute__StatusAssignment_12_in_rule__Attribute__Group__128030);
            rule__Attribute__StatusAssignment_12();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getStatusAssignment_12()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__13_in_rule__Attribute__Group__128039);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3811:1: rule__Attribute__Group__13 : ( ( rule__Attribute__PropertiesAssignment_13 ) ) rule__Attribute__Group__14 ;
    public final void rule__Attribute__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3815:1: ( ( ( rule__Attribute__PropertiesAssignment_13 ) ) rule__Attribute__Group__14 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3816:1: ( ( rule__Attribute__PropertiesAssignment_13 ) ) rule__Attribute__Group__14
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3816:1: ( ( rule__Attribute__PropertiesAssignment_13 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3817:1: ( rule__Attribute__PropertiesAssignment_13 )
            {
             before(grammarAccess.getAttributeAccess().getPropertiesAssignment_13()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3818:1: ( rule__Attribute__PropertiesAssignment_13 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3818:2: rule__Attribute__PropertiesAssignment_13
            {
            pushFollow(FOLLOW_rule__Attribute__PropertiesAssignment_13_in_rule__Attribute__Group__138067);
            rule__Attribute__PropertiesAssignment_13();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getPropertiesAssignment_13()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__14_in_rule__Attribute__Group__138076);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3829:1: rule__Attribute__Group__14 : ( 'excludedStates:' ) rule__Attribute__Group__15 ;
    public final void rule__Attribute__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3833:1: ( ( 'excludedStates:' ) rule__Attribute__Group__15 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3834:1: ( 'excludedStates:' ) rule__Attribute__Group__15
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3834:1: ( 'excludedStates:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3835:1: 'excludedStates:'
            {
             before(grammarAccess.getAttributeAccess().getExcludedStatesKeyword_14()); 
            match(input,38,FOLLOW_38_in_rule__Attribute__Group__148105); 
             after(grammarAccess.getAttributeAccess().getExcludedStatesKeyword_14()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__15_in_rule__Attribute__Group__148115);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3849:1: rule__Attribute__Group__15 : ( ( rule__Attribute__ExcludedStatesAssignment_15 )* ) ;
    public final void rule__Attribute__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3853:1: ( ( ( rule__Attribute__ExcludedStatesAssignment_15 )* ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3854:1: ( ( rule__Attribute__ExcludedStatesAssignment_15 )* )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3854:1: ( ( rule__Attribute__ExcludedStatesAssignment_15 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3855:1: ( rule__Attribute__ExcludedStatesAssignment_15 )*
            {
             before(grammarAccess.getAttributeAccess().getExcludedStatesAssignment_15()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3856:1: ( rule__Attribute__ExcludedStatesAssignment_15 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STRING) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3856:2: rule__Attribute__ExcludedStatesAssignment_15
            	    {
            	    pushFollow(FOLLOW_rule__Attribute__ExcludedStatesAssignment_15_in_rule__Attribute__Group__158143);
            	    rule__Attribute__ExcludedStatesAssignment_15();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3898:1: rule__FireEvents__Group__0 : ( ( rule__FireEvents__FireAssignment_0 ) ) rule__FireEvents__Group__1 ;
    public final void rule__FireEvents__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3902:1: ( ( ( rule__FireEvents__FireAssignment_0 ) ) rule__FireEvents__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3903:1: ( ( rule__FireEvents__FireAssignment_0 ) ) rule__FireEvents__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3903:1: ( ( rule__FireEvents__FireAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3904:1: ( rule__FireEvents__FireAssignment_0 )
            {
             before(grammarAccess.getFireEventsAccess().getFireAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3905:1: ( rule__FireEvents__FireAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3905:2: rule__FireEvents__FireAssignment_0
            {
            pushFollow(FOLLOW_rule__FireEvents__FireAssignment_0_in_rule__FireEvents__Group__08210);
            rule__FireEvents__FireAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getFireEventsAccess().getFireAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__FireEvents__Group__1_in_rule__FireEvents__Group__08219);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3916:1: rule__FireEvents__Group__1 : ( ( rule__FireEvents__LibCheckCriteriaAssignment_1 ) ) ;
    public final void rule__FireEvents__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3920:1: ( ( ( rule__FireEvents__LibCheckCriteriaAssignment_1 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3921:1: ( ( rule__FireEvents__LibCheckCriteriaAssignment_1 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3921:1: ( ( rule__FireEvents__LibCheckCriteriaAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3922:1: ( rule__FireEvents__LibCheckCriteriaAssignment_1 )
            {
             before(grammarAccess.getFireEventsAccess().getLibCheckCriteriaAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3923:1: ( rule__FireEvents__LibCheckCriteriaAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3923:2: rule__FireEvents__LibCheckCriteriaAssignment_1
            {
            pushFollow(FOLLOW_rule__FireEvents__LibCheckCriteriaAssignment_1_in_rule__FireEvents__Group__18247);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3937:1: rule__AttrProperties__Group__0 : ( ( rule__AttrProperties__DescriptionAssignment_0 ) ) rule__AttrProperties__Group__1 ;
    public final void rule__AttrProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3941:1: ( ( ( rule__AttrProperties__DescriptionAssignment_0 ) ) rule__AttrProperties__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3942:1: ( ( rule__AttrProperties__DescriptionAssignment_0 ) ) rule__AttrProperties__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3942:1: ( ( rule__AttrProperties__DescriptionAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3943:1: ( rule__AttrProperties__DescriptionAssignment_0 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getDescriptionAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3944:1: ( rule__AttrProperties__DescriptionAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3944:2: rule__AttrProperties__DescriptionAssignment_0
            {
            pushFollow(FOLLOW_rule__AttrProperties__DescriptionAssignment_0_in_rule__AttrProperties__Group__08285);
            rule__AttrProperties__DescriptionAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__1_in_rule__AttrProperties__Group__08294);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3955:1: rule__AttrProperties__Group__1 : ( ( rule__AttrProperties__LabelAssignment_1 ) ) rule__AttrProperties__Group__2 ;
    public final void rule__AttrProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3959:1: ( ( ( rule__AttrProperties__LabelAssignment_1 ) ) rule__AttrProperties__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3960:1: ( ( rule__AttrProperties__LabelAssignment_1 ) ) rule__AttrProperties__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3960:1: ( ( rule__AttrProperties__LabelAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3961:1: ( rule__AttrProperties__LabelAssignment_1 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getLabelAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3962:1: ( rule__AttrProperties__LabelAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3962:2: rule__AttrProperties__LabelAssignment_1
            {
            pushFollow(FOLLOW_rule__AttrProperties__LabelAssignment_1_in_rule__AttrProperties__Group__18322);
            rule__AttrProperties__LabelAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getLabelAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__2_in_rule__AttrProperties__Group__18331);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3973:1: rule__AttrProperties__Group__2 : ( ( rule__AttrProperties__UnitAssignment_2 ) ) rule__AttrProperties__Group__3 ;
    public final void rule__AttrProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3977:1: ( ( ( rule__AttrProperties__UnitAssignment_2 ) ) rule__AttrProperties__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3978:1: ( ( rule__AttrProperties__UnitAssignment_2 ) ) rule__AttrProperties__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3978:1: ( ( rule__AttrProperties__UnitAssignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3979:1: ( rule__AttrProperties__UnitAssignment_2 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getUnitAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3980:1: ( rule__AttrProperties__UnitAssignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3980:2: rule__AttrProperties__UnitAssignment_2
            {
            pushFollow(FOLLOW_rule__AttrProperties__UnitAssignment_2_in_rule__AttrProperties__Group__28359);
            rule__AttrProperties__UnitAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getUnitAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__3_in_rule__AttrProperties__Group__28368);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3991:1: rule__AttrProperties__Group__3 : ( ( rule__AttrProperties__StandardUnitAssignment_3 ) ) rule__AttrProperties__Group__4 ;
    public final void rule__AttrProperties__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3995:1: ( ( ( rule__AttrProperties__StandardUnitAssignment_3 ) ) rule__AttrProperties__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3996:1: ( ( rule__AttrProperties__StandardUnitAssignment_3 ) ) rule__AttrProperties__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3996:1: ( ( rule__AttrProperties__StandardUnitAssignment_3 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3997:1: ( rule__AttrProperties__StandardUnitAssignment_3 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getStandardUnitAssignment_3()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3998:1: ( rule__AttrProperties__StandardUnitAssignment_3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3998:2: rule__AttrProperties__StandardUnitAssignment_3
            {
            pushFollow(FOLLOW_rule__AttrProperties__StandardUnitAssignment_3_in_rule__AttrProperties__Group__38396);
            rule__AttrProperties__StandardUnitAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getStandardUnitAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__4_in_rule__AttrProperties__Group__38405);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4009:1: rule__AttrProperties__Group__4 : ( ( rule__AttrProperties__DisplayUnitAssignment_4 ) ) rule__AttrProperties__Group__5 ;
    public final void rule__AttrProperties__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4013:1: ( ( ( rule__AttrProperties__DisplayUnitAssignment_4 ) ) rule__AttrProperties__Group__5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4014:1: ( ( rule__AttrProperties__DisplayUnitAssignment_4 ) ) rule__AttrProperties__Group__5
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4014:1: ( ( rule__AttrProperties__DisplayUnitAssignment_4 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4015:1: ( rule__AttrProperties__DisplayUnitAssignment_4 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getDisplayUnitAssignment_4()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4016:1: ( rule__AttrProperties__DisplayUnitAssignment_4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4016:2: rule__AttrProperties__DisplayUnitAssignment_4
            {
            pushFollow(FOLLOW_rule__AttrProperties__DisplayUnitAssignment_4_in_rule__AttrProperties__Group__48433);
            rule__AttrProperties__DisplayUnitAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getDisplayUnitAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__5_in_rule__AttrProperties__Group__48442);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4027:1: rule__AttrProperties__Group__5 : ( ( rule__AttrProperties__FormatAssignment_5 ) ) rule__AttrProperties__Group__6 ;
    public final void rule__AttrProperties__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4031:1: ( ( ( rule__AttrProperties__FormatAssignment_5 ) ) rule__AttrProperties__Group__6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4032:1: ( ( rule__AttrProperties__FormatAssignment_5 ) ) rule__AttrProperties__Group__6
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4032:1: ( ( rule__AttrProperties__FormatAssignment_5 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4033:1: ( rule__AttrProperties__FormatAssignment_5 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getFormatAssignment_5()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4034:1: ( rule__AttrProperties__FormatAssignment_5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4034:2: rule__AttrProperties__FormatAssignment_5
            {
            pushFollow(FOLLOW_rule__AttrProperties__FormatAssignment_5_in_rule__AttrProperties__Group__58470);
            rule__AttrProperties__FormatAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getFormatAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__6_in_rule__AttrProperties__Group__58479);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4045:1: rule__AttrProperties__Group__6 : ( ( rule__AttrProperties__MaxValueAssignment_6 ) ) rule__AttrProperties__Group__7 ;
    public final void rule__AttrProperties__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4049:1: ( ( ( rule__AttrProperties__MaxValueAssignment_6 ) ) rule__AttrProperties__Group__7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4050:1: ( ( rule__AttrProperties__MaxValueAssignment_6 ) ) rule__AttrProperties__Group__7
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4050:1: ( ( rule__AttrProperties__MaxValueAssignment_6 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4051:1: ( rule__AttrProperties__MaxValueAssignment_6 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getMaxValueAssignment_6()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4052:1: ( rule__AttrProperties__MaxValueAssignment_6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4052:2: rule__AttrProperties__MaxValueAssignment_6
            {
            pushFollow(FOLLOW_rule__AttrProperties__MaxValueAssignment_6_in_rule__AttrProperties__Group__68507);
            rule__AttrProperties__MaxValueAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getMaxValueAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__7_in_rule__AttrProperties__Group__68516);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4063:1: rule__AttrProperties__Group__7 : ( ( rule__AttrProperties__MinValueAssignment_7 ) ) rule__AttrProperties__Group__8 ;
    public final void rule__AttrProperties__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4067:1: ( ( ( rule__AttrProperties__MinValueAssignment_7 ) ) rule__AttrProperties__Group__8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4068:1: ( ( rule__AttrProperties__MinValueAssignment_7 ) ) rule__AttrProperties__Group__8
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4068:1: ( ( rule__AttrProperties__MinValueAssignment_7 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4069:1: ( rule__AttrProperties__MinValueAssignment_7 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getMinValueAssignment_7()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4070:1: ( rule__AttrProperties__MinValueAssignment_7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4070:2: rule__AttrProperties__MinValueAssignment_7
            {
            pushFollow(FOLLOW_rule__AttrProperties__MinValueAssignment_7_in_rule__AttrProperties__Group__78544);
            rule__AttrProperties__MinValueAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getMinValueAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__8_in_rule__AttrProperties__Group__78553);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4081:1: rule__AttrProperties__Group__8 : ( ( rule__AttrProperties__MaxAlarmAssignment_8 ) ) rule__AttrProperties__Group__9 ;
    public final void rule__AttrProperties__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4085:1: ( ( ( rule__AttrProperties__MaxAlarmAssignment_8 ) ) rule__AttrProperties__Group__9 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4086:1: ( ( rule__AttrProperties__MaxAlarmAssignment_8 ) ) rule__AttrProperties__Group__9
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4086:1: ( ( rule__AttrProperties__MaxAlarmAssignment_8 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4087:1: ( rule__AttrProperties__MaxAlarmAssignment_8 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getMaxAlarmAssignment_8()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4088:1: ( rule__AttrProperties__MaxAlarmAssignment_8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4088:2: rule__AttrProperties__MaxAlarmAssignment_8
            {
            pushFollow(FOLLOW_rule__AttrProperties__MaxAlarmAssignment_8_in_rule__AttrProperties__Group__88581);
            rule__AttrProperties__MaxAlarmAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getMaxAlarmAssignment_8()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__9_in_rule__AttrProperties__Group__88590);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4099:1: rule__AttrProperties__Group__9 : ( ( rule__AttrProperties__MinAlarmAssignment_9 ) ) rule__AttrProperties__Group__10 ;
    public final void rule__AttrProperties__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4103:1: ( ( ( rule__AttrProperties__MinAlarmAssignment_9 ) ) rule__AttrProperties__Group__10 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4104:1: ( ( rule__AttrProperties__MinAlarmAssignment_9 ) ) rule__AttrProperties__Group__10
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4104:1: ( ( rule__AttrProperties__MinAlarmAssignment_9 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4105:1: ( rule__AttrProperties__MinAlarmAssignment_9 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getMinAlarmAssignment_9()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4106:1: ( rule__AttrProperties__MinAlarmAssignment_9 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4106:2: rule__AttrProperties__MinAlarmAssignment_9
            {
            pushFollow(FOLLOW_rule__AttrProperties__MinAlarmAssignment_9_in_rule__AttrProperties__Group__98618);
            rule__AttrProperties__MinAlarmAssignment_9();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getMinAlarmAssignment_9()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__10_in_rule__AttrProperties__Group__98627);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4117:1: rule__AttrProperties__Group__10 : ( ( rule__AttrProperties__MaxWarningAssignment_10 ) ) rule__AttrProperties__Group__11 ;
    public final void rule__AttrProperties__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4121:1: ( ( ( rule__AttrProperties__MaxWarningAssignment_10 ) ) rule__AttrProperties__Group__11 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4122:1: ( ( rule__AttrProperties__MaxWarningAssignment_10 ) ) rule__AttrProperties__Group__11
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4122:1: ( ( rule__AttrProperties__MaxWarningAssignment_10 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4123:1: ( rule__AttrProperties__MaxWarningAssignment_10 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getMaxWarningAssignment_10()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4124:1: ( rule__AttrProperties__MaxWarningAssignment_10 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4124:2: rule__AttrProperties__MaxWarningAssignment_10
            {
            pushFollow(FOLLOW_rule__AttrProperties__MaxWarningAssignment_10_in_rule__AttrProperties__Group__108655);
            rule__AttrProperties__MaxWarningAssignment_10();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getMaxWarningAssignment_10()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__11_in_rule__AttrProperties__Group__108664);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4135:1: rule__AttrProperties__Group__11 : ( ( rule__AttrProperties__MinWarningAssignment_11 ) ) rule__AttrProperties__Group__12 ;
    public final void rule__AttrProperties__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4139:1: ( ( ( rule__AttrProperties__MinWarningAssignment_11 ) ) rule__AttrProperties__Group__12 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4140:1: ( ( rule__AttrProperties__MinWarningAssignment_11 ) ) rule__AttrProperties__Group__12
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4140:1: ( ( rule__AttrProperties__MinWarningAssignment_11 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4141:1: ( rule__AttrProperties__MinWarningAssignment_11 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getMinWarningAssignment_11()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4142:1: ( rule__AttrProperties__MinWarningAssignment_11 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4142:2: rule__AttrProperties__MinWarningAssignment_11
            {
            pushFollow(FOLLOW_rule__AttrProperties__MinWarningAssignment_11_in_rule__AttrProperties__Group__118692);
            rule__AttrProperties__MinWarningAssignment_11();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getMinWarningAssignment_11()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__12_in_rule__AttrProperties__Group__118701);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4153:1: rule__AttrProperties__Group__12 : ( ( rule__AttrProperties__DeltaTimeAssignment_12 ) ) rule__AttrProperties__Group__13 ;
    public final void rule__AttrProperties__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4157:1: ( ( ( rule__AttrProperties__DeltaTimeAssignment_12 ) ) rule__AttrProperties__Group__13 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4158:1: ( ( rule__AttrProperties__DeltaTimeAssignment_12 ) ) rule__AttrProperties__Group__13
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4158:1: ( ( rule__AttrProperties__DeltaTimeAssignment_12 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4159:1: ( rule__AttrProperties__DeltaTimeAssignment_12 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getDeltaTimeAssignment_12()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4160:1: ( rule__AttrProperties__DeltaTimeAssignment_12 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4160:2: rule__AttrProperties__DeltaTimeAssignment_12
            {
            pushFollow(FOLLOW_rule__AttrProperties__DeltaTimeAssignment_12_in_rule__AttrProperties__Group__128729);
            rule__AttrProperties__DeltaTimeAssignment_12();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getDeltaTimeAssignment_12()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__13_in_rule__AttrProperties__Group__128738);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4171:1: rule__AttrProperties__Group__13 : ( ( rule__AttrProperties__DeltaValueAssignment_13 ) ) ;
    public final void rule__AttrProperties__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4175:1: ( ( ( rule__AttrProperties__DeltaValueAssignment_13 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4176:1: ( ( rule__AttrProperties__DeltaValueAssignment_13 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4176:1: ( ( rule__AttrProperties__DeltaValueAssignment_13 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4177:1: ( rule__AttrProperties__DeltaValueAssignment_13 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getDeltaValueAssignment_13()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4178:1: ( rule__AttrProperties__DeltaValueAssignment_13 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4178:2: rule__AttrProperties__DeltaValueAssignment_13
            {
            pushFollow(FOLLOW_rule__AttrProperties__DeltaValueAssignment_13_in_rule__AttrProperties__Group__138766);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4216:1: rule__VoidType__Group__0 : ( () ) rule__VoidType__Group__1 ;
    public final void rule__VoidType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4220:1: ( ( () ) rule__VoidType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4221:1: ( () ) rule__VoidType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4221:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4222:1: ()
            {
             before(grammarAccess.getVoidTypeAccess().getVoidTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4223:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4225:1: 
            {
            }

             after(grammarAccess.getVoidTypeAccess().getVoidTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__VoidType__Group__1_in_rule__VoidType__Group__08838);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4236:1: rule__VoidType__Group__1 : ( 'void' ) ;
    public final void rule__VoidType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4240:1: ( ( 'void' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4241:1: ( 'void' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4241:1: ( 'void' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4242:1: 'void'
            {
             before(grammarAccess.getVoidTypeAccess().getVoidKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__VoidType__Group__18867); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4259:1: rule__BooleanType__Group__0 : ( () ) rule__BooleanType__Group__1 ;
    public final void rule__BooleanType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4263:1: ( ( () ) rule__BooleanType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4264:1: ( () ) rule__BooleanType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4264:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4265:1: ()
            {
             before(grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4266:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4268:1: 
            {
            }

             after(grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__BooleanType__Group__1_in_rule__BooleanType__Group__08916);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4279:1: rule__BooleanType__Group__1 : ( 'boolean' ) ;
    public final void rule__BooleanType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4283:1: ( ( 'boolean' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4284:1: ( 'boolean' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4284:1: ( 'boolean' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4285:1: 'boolean'
            {
             before(grammarAccess.getBooleanTypeAccess().getBooleanKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__BooleanType__Group__18945); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4302:1: rule__ShortType__Group__0 : ( () ) rule__ShortType__Group__1 ;
    public final void rule__ShortType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4306:1: ( ( () ) rule__ShortType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4307:1: ( () ) rule__ShortType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4307:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4308:1: ()
            {
             before(grammarAccess.getShortTypeAccess().getShortTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4309:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4311:1: 
            {
            }

             after(grammarAccess.getShortTypeAccess().getShortTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__ShortType__Group__1_in_rule__ShortType__Group__08994);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4322:1: rule__ShortType__Group__1 : ( 'short' ) ;
    public final void rule__ShortType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4326:1: ( ( 'short' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4327:1: ( 'short' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4327:1: ( 'short' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4328:1: 'short'
            {
             before(grammarAccess.getShortTypeAccess().getShortKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__ShortType__Group__19023); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4345:1: rule__UShortType__Group__0 : ( () ) rule__UShortType__Group__1 ;
    public final void rule__UShortType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4349:1: ( ( () ) rule__UShortType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4350:1: ( () ) rule__UShortType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4350:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4351:1: ()
            {
             before(grammarAccess.getUShortTypeAccess().getUShortTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4352:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4354:1: 
            {
            }

             after(grammarAccess.getUShortTypeAccess().getUShortTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__UShortType__Group__1_in_rule__UShortType__Group__09072);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4365:1: rule__UShortType__Group__1 : ( 'ushort' ) ;
    public final void rule__UShortType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4369:1: ( ( 'ushort' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4370:1: ( 'ushort' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4370:1: ( 'ushort' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4371:1: 'ushort'
            {
             before(grammarAccess.getUShortTypeAccess().getUshortKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__UShortType__Group__19101); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4388:1: rule__IntType__Group__0 : ( () ) rule__IntType__Group__1 ;
    public final void rule__IntType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4392:1: ( ( () ) rule__IntType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4393:1: ( () ) rule__IntType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4393:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4394:1: ()
            {
             before(grammarAccess.getIntTypeAccess().getIntTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4395:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4397:1: 
            {
            }

             after(grammarAccess.getIntTypeAccess().getIntTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__IntType__Group__1_in_rule__IntType__Group__09150);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4408:1: rule__IntType__Group__1 : ( 'int' ) ;
    public final void rule__IntType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4412:1: ( ( 'int' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4413:1: ( 'int' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4413:1: ( 'int' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4414:1: 'int'
            {
             before(grammarAccess.getIntTypeAccess().getIntKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__IntType__Group__19179); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4431:1: rule__UIntType__Group__0 : ( () ) rule__UIntType__Group__1 ;
    public final void rule__UIntType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4435:1: ( ( () ) rule__UIntType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4436:1: ( () ) rule__UIntType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4436:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4437:1: ()
            {
             before(grammarAccess.getUIntTypeAccess().getUIntTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4438:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4440:1: 
            {
            }

             after(grammarAccess.getUIntTypeAccess().getUIntTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__UIntType__Group__1_in_rule__UIntType__Group__09228);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4451:1: rule__UIntType__Group__1 : ( 'uint' ) ;
    public final void rule__UIntType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4455:1: ( ( 'uint' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4456:1: ( 'uint' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4456:1: ( 'uint' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4457:1: 'uint'
            {
             before(grammarAccess.getUIntTypeAccess().getUintKeyword_1()); 
            match(input,44,FOLLOW_44_in_rule__UIntType__Group__19257); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4474:1: rule__FloatType__Group__0 : ( () ) rule__FloatType__Group__1 ;
    public final void rule__FloatType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4478:1: ( ( () ) rule__FloatType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4479:1: ( () ) rule__FloatType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4479:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4480:1: ()
            {
             before(grammarAccess.getFloatTypeAccess().getFloatTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4481:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4483:1: 
            {
            }

             after(grammarAccess.getFloatTypeAccess().getFloatTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__FloatType__Group__1_in_rule__FloatType__Group__09306);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4494:1: rule__FloatType__Group__1 : ( 'float' ) ;
    public final void rule__FloatType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4498:1: ( ( 'float' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4499:1: ( 'float' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4499:1: ( 'float' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4500:1: 'float'
            {
             before(grammarAccess.getFloatTypeAccess().getFloatKeyword_1()); 
            match(input,45,FOLLOW_45_in_rule__FloatType__Group__19335); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4517:1: rule__DoubleType__Group__0 : ( () ) rule__DoubleType__Group__1 ;
    public final void rule__DoubleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4521:1: ( ( () ) rule__DoubleType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4522:1: ( () ) rule__DoubleType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4522:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4523:1: ()
            {
             before(grammarAccess.getDoubleTypeAccess().getDoubleTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4524:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4526:1: 
            {
            }

             after(grammarAccess.getDoubleTypeAccess().getDoubleTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__DoubleType__Group__1_in_rule__DoubleType__Group__09384);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4537:1: rule__DoubleType__Group__1 : ( 'double' ) ;
    public final void rule__DoubleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4541:1: ( ( 'double' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4542:1: ( 'double' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4542:1: ( 'double' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4543:1: 'double'
            {
             before(grammarAccess.getDoubleTypeAccess().getDoubleKeyword_1()); 
            match(input,46,FOLLOW_46_in_rule__DoubleType__Group__19413); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4560:1: rule__StringType__Group__0 : ( () ) rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4564:1: ( ( () ) rule__StringType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4565:1: ( () ) rule__StringType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4565:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4566:1: ()
            {
             before(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4567:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4569:1: 
            {
            }

             after(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__StringType__Group__1_in_rule__StringType__Group__09462);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4580:1: rule__StringType__Group__1 : ( 'string' ) ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4584:1: ( ( 'string' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4585:1: ( 'string' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4585:1: ( 'string' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4586:1: 'string'
            {
             before(grammarAccess.getStringTypeAccess().getStringKeyword_1()); 
            match(input,47,FOLLOW_47_in_rule__StringType__Group__19491); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4603:1: rule__CharArrayType__Group__0 : ( () ) rule__CharArrayType__Group__1 ;
    public final void rule__CharArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4607:1: ( ( () ) rule__CharArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4608:1: ( () ) rule__CharArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4608:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4609:1: ()
            {
             before(grammarAccess.getCharArrayTypeAccess().getCharArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4610:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4612:1: 
            {
            }

             after(grammarAccess.getCharArrayTypeAccess().getCharArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__CharArrayType__Group__1_in_rule__CharArrayType__Group__09540);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4623:1: rule__CharArrayType__Group__1 : ( 'DevVarCharArray' ) ;
    public final void rule__CharArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4627:1: ( ( 'DevVarCharArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4628:1: ( 'DevVarCharArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4628:1: ( 'DevVarCharArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4629:1: 'DevVarCharArray'
            {
             before(grammarAccess.getCharArrayTypeAccess().getDevVarCharArrayKeyword_1()); 
            match(input,48,FOLLOW_48_in_rule__CharArrayType__Group__19569); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4646:1: rule__ShortArrayType__Group__0 : ( () ) rule__ShortArrayType__Group__1 ;
    public final void rule__ShortArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4650:1: ( ( () ) rule__ShortArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4651:1: ( () ) rule__ShortArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4651:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4652:1: ()
            {
             before(grammarAccess.getShortArrayTypeAccess().getShortArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4653:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4655:1: 
            {
            }

             after(grammarAccess.getShortArrayTypeAccess().getShortArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__ShortArrayType__Group__1_in_rule__ShortArrayType__Group__09618);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4666:1: rule__ShortArrayType__Group__1 : ( 'DevVarShortArray' ) ;
    public final void rule__ShortArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4670:1: ( ( 'DevVarShortArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4671:1: ( 'DevVarShortArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4671:1: ( 'DevVarShortArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4672:1: 'DevVarShortArray'
            {
             before(grammarAccess.getShortArrayTypeAccess().getDevVarShortArrayKeyword_1()); 
            match(input,49,FOLLOW_49_in_rule__ShortArrayType__Group__19647); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4689:1: rule__UShortArrayType__Group__0 : ( () ) rule__UShortArrayType__Group__1 ;
    public final void rule__UShortArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4693:1: ( ( () ) rule__UShortArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4694:1: ( () ) rule__UShortArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4694:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4695:1: ()
            {
             before(grammarAccess.getUShortArrayTypeAccess().getUShortArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4696:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4698:1: 
            {
            }

             after(grammarAccess.getUShortArrayTypeAccess().getUShortArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__UShortArrayType__Group__1_in_rule__UShortArrayType__Group__09696);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4709:1: rule__UShortArrayType__Group__1 : ( 'DevVarUShortArray' ) ;
    public final void rule__UShortArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4713:1: ( ( 'DevVarUShortArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4714:1: ( 'DevVarUShortArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4714:1: ( 'DevVarUShortArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4715:1: 'DevVarUShortArray'
            {
             before(grammarAccess.getUShortArrayTypeAccess().getDevVarUShortArrayKeyword_1()); 
            match(input,50,FOLLOW_50_in_rule__UShortArrayType__Group__19725); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4732:1: rule__IntArrayType__Group__0 : ( () ) rule__IntArrayType__Group__1 ;
    public final void rule__IntArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4736:1: ( ( () ) rule__IntArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4737:1: ( () ) rule__IntArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4737:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4738:1: ()
            {
             before(grammarAccess.getIntArrayTypeAccess().getIntArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4739:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4741:1: 
            {
            }

             after(grammarAccess.getIntArrayTypeAccess().getIntArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__IntArrayType__Group__1_in_rule__IntArrayType__Group__09774);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4752:1: rule__IntArrayType__Group__1 : ( 'DevVarLongArray' ) ;
    public final void rule__IntArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4756:1: ( ( 'DevVarLongArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4757:1: ( 'DevVarLongArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4757:1: ( 'DevVarLongArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4758:1: 'DevVarLongArray'
            {
             before(grammarAccess.getIntArrayTypeAccess().getDevVarLongArrayKeyword_1()); 
            match(input,51,FOLLOW_51_in_rule__IntArrayType__Group__19803); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4775:1: rule__UIntArrayType__Group__0 : ( () ) rule__UIntArrayType__Group__1 ;
    public final void rule__UIntArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4779:1: ( ( () ) rule__UIntArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4780:1: ( () ) rule__UIntArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4780:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4781:1: ()
            {
             before(grammarAccess.getUIntArrayTypeAccess().getUIntArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4782:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4784:1: 
            {
            }

             after(grammarAccess.getUIntArrayTypeAccess().getUIntArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__UIntArrayType__Group__1_in_rule__UIntArrayType__Group__09852);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4795:1: rule__UIntArrayType__Group__1 : ( 'DevVarULongArray' ) ;
    public final void rule__UIntArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4799:1: ( ( 'DevVarULongArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4800:1: ( 'DevVarULongArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4800:1: ( 'DevVarULongArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4801:1: 'DevVarULongArray'
            {
             before(grammarAccess.getUIntArrayTypeAccess().getDevVarULongArrayKeyword_1()); 
            match(input,52,FOLLOW_52_in_rule__UIntArrayType__Group__19881); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4818:1: rule__FloatArrayType__Group__0 : ( () ) rule__FloatArrayType__Group__1 ;
    public final void rule__FloatArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4822:1: ( ( () ) rule__FloatArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4823:1: ( () ) rule__FloatArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4823:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4824:1: ()
            {
             before(grammarAccess.getFloatArrayTypeAccess().getFloatArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4825:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4827:1: 
            {
            }

             after(grammarAccess.getFloatArrayTypeAccess().getFloatArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__FloatArrayType__Group__1_in_rule__FloatArrayType__Group__09930);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4838:1: rule__FloatArrayType__Group__1 : ( 'DevVarFloatArray' ) ;
    public final void rule__FloatArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4842:1: ( ( 'DevVarFloatArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4843:1: ( 'DevVarFloatArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4843:1: ( 'DevVarFloatArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4844:1: 'DevVarFloatArray'
            {
             before(grammarAccess.getFloatArrayTypeAccess().getDevVarFloatArrayKeyword_1()); 
            match(input,53,FOLLOW_53_in_rule__FloatArrayType__Group__19959); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4861:1: rule__DoubleArrayType__Group__0 : ( () ) rule__DoubleArrayType__Group__1 ;
    public final void rule__DoubleArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4865:1: ( ( () ) rule__DoubleArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4866:1: ( () ) rule__DoubleArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4866:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4867:1: ()
            {
             before(grammarAccess.getDoubleArrayTypeAccess().getDoubleArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4868:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4870:1: 
            {
            }

             after(grammarAccess.getDoubleArrayTypeAccess().getDoubleArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__DoubleArrayType__Group__1_in_rule__DoubleArrayType__Group__010008);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4881:1: rule__DoubleArrayType__Group__1 : ( 'DevVarDoubleArray' ) ;
    public final void rule__DoubleArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4885:1: ( ( 'DevVarDoubleArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4886:1: ( 'DevVarDoubleArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4886:1: ( 'DevVarDoubleArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4887:1: 'DevVarDoubleArray'
            {
             before(grammarAccess.getDoubleArrayTypeAccess().getDevVarDoubleArrayKeyword_1()); 
            match(input,54,FOLLOW_54_in_rule__DoubleArrayType__Group__110037); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4904:1: rule__StringArrayType__Group__0 : ( () ) rule__StringArrayType__Group__1 ;
    public final void rule__StringArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4908:1: ( ( () ) rule__StringArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4909:1: ( () ) rule__StringArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4909:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4910:1: ()
            {
             before(grammarAccess.getStringArrayTypeAccess().getStringArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4911:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4913:1: 
            {
            }

             after(grammarAccess.getStringArrayTypeAccess().getStringArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__StringArrayType__Group__1_in_rule__StringArrayType__Group__010086);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4924:1: rule__StringArrayType__Group__1 : ( 'DevVarStringArray' ) ;
    public final void rule__StringArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4928:1: ( ( 'DevVarStringArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4929:1: ( 'DevVarStringArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4929:1: ( 'DevVarStringArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4930:1: 'DevVarStringArray'
            {
             before(grammarAccess.getStringArrayTypeAccess().getDevVarStringArrayKeyword_1()); 
            match(input,55,FOLLOW_55_in_rule__StringArrayType__Group__110115); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4947:1: rule__LongStringArrayType__Group__0 : ( () ) rule__LongStringArrayType__Group__1 ;
    public final void rule__LongStringArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4951:1: ( ( () ) rule__LongStringArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4952:1: ( () ) rule__LongStringArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4952:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4953:1: ()
            {
             before(grammarAccess.getLongStringArrayTypeAccess().getLongStringArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4954:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4956:1: 
            {
            }

             after(grammarAccess.getLongStringArrayTypeAccess().getLongStringArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__LongStringArrayType__Group__1_in_rule__LongStringArrayType__Group__010164);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4967:1: rule__LongStringArrayType__Group__1 : ( 'DevVarLongStringArray' ) ;
    public final void rule__LongStringArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4971:1: ( ( 'DevVarLongStringArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4972:1: ( 'DevVarLongStringArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4972:1: ( 'DevVarLongStringArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4973:1: 'DevVarLongStringArray'
            {
             before(grammarAccess.getLongStringArrayTypeAccess().getDevVarLongStringArrayKeyword_1()); 
            match(input,56,FOLLOW_56_in_rule__LongStringArrayType__Group__110193); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4990:1: rule__DoubleStringArrayType__Group__0 : ( () ) rule__DoubleStringArrayType__Group__1 ;
    public final void rule__DoubleStringArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4994:1: ( ( () ) rule__DoubleStringArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4995:1: ( () ) rule__DoubleStringArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4995:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4996:1: ()
            {
             before(grammarAccess.getDoubleStringArrayTypeAccess().getDoubleStringArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4997:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4999:1: 
            {
            }

             after(grammarAccess.getDoubleStringArrayTypeAccess().getDoubleStringArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__DoubleStringArrayType__Group__1_in_rule__DoubleStringArrayType__Group__010242);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5010:1: rule__DoubleStringArrayType__Group__1 : ( 'DevVarDoubleStringArray' ) ;
    public final void rule__DoubleStringArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5014:1: ( ( 'DevVarDoubleStringArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5015:1: ( 'DevVarDoubleStringArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5015:1: ( 'DevVarDoubleStringArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5016:1: 'DevVarDoubleStringArray'
            {
             before(grammarAccess.getDoubleStringArrayTypeAccess().getDevVarDoubleStringArrayKeyword_1()); 
            match(input,57,FOLLOW_57_in_rule__DoubleStringArrayType__Group__110271); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5033:1: rule__StateType__Group__0 : ( () ) rule__StateType__Group__1 ;
    public final void rule__StateType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5037:1: ( ( () ) rule__StateType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5038:1: ( () ) rule__StateType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5038:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5039:1: ()
            {
             before(grammarAccess.getStateTypeAccess().getStateTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5040:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5042:1: 
            {
            }

             after(grammarAccess.getStateTypeAccess().getStateTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__StateType__Group__1_in_rule__StateType__Group__010320);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5053:1: rule__StateType__Group__1 : ( 'DevState' ) ;
    public final void rule__StateType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5057:1: ( ( 'DevState' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5058:1: ( 'DevState' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5058:1: ( 'DevState' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5059:1: 'DevState'
            {
             before(grammarAccess.getStateTypeAccess().getDevStateKeyword_1()); 
            match(input,58,FOLLOW_58_in_rule__StateType__Group__110349); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5076:1: rule__ConstStringType__Group__0 : ( () ) rule__ConstStringType__Group__1 ;
    public final void rule__ConstStringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5080:1: ( ( () ) rule__ConstStringType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5081:1: ( () ) rule__ConstStringType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5081:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5082:1: ()
            {
             before(grammarAccess.getConstStringTypeAccess().getConstStringTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5083:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5085:1: 
            {
            }

             after(grammarAccess.getConstStringTypeAccess().getConstStringTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__ConstStringType__Group__1_in_rule__ConstStringType__Group__010398);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5096:1: rule__ConstStringType__Group__1 : ( 'ConstDevString' ) ;
    public final void rule__ConstStringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5100:1: ( ( 'ConstDevString' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5101:1: ( 'ConstDevString' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5101:1: ( 'ConstDevString' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5102:1: 'ConstDevString'
            {
             before(grammarAccess.getConstStringTypeAccess().getConstDevStringKeyword_1()); 
            match(input,59,FOLLOW_59_in_rule__ConstStringType__Group__110427); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5119:1: rule__BooleanArrayType__Group__0 : ( () ) rule__BooleanArrayType__Group__1 ;
    public final void rule__BooleanArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5123:1: ( ( () ) rule__BooleanArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5124:1: ( () ) rule__BooleanArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5124:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5125:1: ()
            {
             before(grammarAccess.getBooleanArrayTypeAccess().getBooleanArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5126:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5128:1: 
            {
            }

             after(grammarAccess.getBooleanArrayTypeAccess().getBooleanArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__BooleanArrayType__Group__1_in_rule__BooleanArrayType__Group__010476);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5139:1: rule__BooleanArrayType__Group__1 : ( 'DevVarBooleanArray' ) ;
    public final void rule__BooleanArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5143:1: ( ( 'DevVarBooleanArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5144:1: ( 'DevVarBooleanArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5144:1: ( 'DevVarBooleanArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5145:1: 'DevVarBooleanArray'
            {
             before(grammarAccess.getBooleanArrayTypeAccess().getDevVarBooleanArrayKeyword_1()); 
            match(input,60,FOLLOW_60_in_rule__BooleanArrayType__Group__110505); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5162:1: rule__UCharType__Group__0 : ( () ) rule__UCharType__Group__1 ;
    public final void rule__UCharType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5166:1: ( ( () ) rule__UCharType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5167:1: ( () ) rule__UCharType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5167:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5168:1: ()
            {
             before(grammarAccess.getUCharTypeAccess().getUCharTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5169:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5171:1: 
            {
            }

             after(grammarAccess.getUCharTypeAccess().getUCharTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__UCharType__Group__1_in_rule__UCharType__Group__010554);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5182:1: rule__UCharType__Group__1 : ( 'DevUChar' ) ;
    public final void rule__UCharType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5186:1: ( ( 'DevUChar' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5187:1: ( 'DevUChar' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5187:1: ( 'DevUChar' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5188:1: 'DevUChar'
            {
             before(grammarAccess.getUCharTypeAccess().getDevUCharKeyword_1()); 
            match(input,61,FOLLOW_61_in_rule__UCharType__Group__110583); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5205:1: rule__LongType__Group__0 : ( () ) rule__LongType__Group__1 ;
    public final void rule__LongType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5209:1: ( ( () ) rule__LongType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5210:1: ( () ) rule__LongType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5210:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5211:1: ()
            {
             before(grammarAccess.getLongTypeAccess().getLongTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5212:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5214:1: 
            {
            }

             after(grammarAccess.getLongTypeAccess().getLongTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__LongType__Group__1_in_rule__LongType__Group__010632);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5225:1: rule__LongType__Group__1 : ( 'DevLong64' ) ;
    public final void rule__LongType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5229:1: ( ( 'DevLong64' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5230:1: ( 'DevLong64' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5230:1: ( 'DevLong64' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5231:1: 'DevLong64'
            {
             before(grammarAccess.getLongTypeAccess().getDevLong64Keyword_1()); 
            match(input,62,FOLLOW_62_in_rule__LongType__Group__110661); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5248:1: rule__ULongType__Group__0 : ( () ) rule__ULongType__Group__1 ;
    public final void rule__ULongType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5252:1: ( ( () ) rule__ULongType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5253:1: ( () ) rule__ULongType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5253:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5254:1: ()
            {
             before(grammarAccess.getULongTypeAccess().getULongTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5255:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5257:1: 
            {
            }

             after(grammarAccess.getULongTypeAccess().getULongTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__ULongType__Group__1_in_rule__ULongType__Group__010710);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5268:1: rule__ULongType__Group__1 : ( 'DevULong64' ) ;
    public final void rule__ULongType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5272:1: ( ( 'DevULong64' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5273:1: ( 'DevULong64' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5273:1: ( 'DevULong64' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5274:1: 'DevULong64'
            {
             before(grammarAccess.getULongTypeAccess().getDevULong64Keyword_1()); 
            match(input,63,FOLLOW_63_in_rule__ULongType__Group__110739); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5291:1: rule__LongArrayType__Group__0 : ( () ) rule__LongArrayType__Group__1 ;
    public final void rule__LongArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5295:1: ( ( () ) rule__LongArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5296:1: ( () ) rule__LongArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5296:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5297:1: ()
            {
             before(grammarAccess.getLongArrayTypeAccess().getLongArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5298:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5300:1: 
            {
            }

             after(grammarAccess.getLongArrayTypeAccess().getLongArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__LongArrayType__Group__1_in_rule__LongArrayType__Group__010788);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5311:1: rule__LongArrayType__Group__1 : ( 'DevVarLong64Array' ) ;
    public final void rule__LongArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5315:1: ( ( 'DevVarLong64Array' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5316:1: ( 'DevVarLong64Array' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5316:1: ( 'DevVarLong64Array' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5317:1: 'DevVarLong64Array'
            {
             before(grammarAccess.getLongArrayTypeAccess().getDevVarLong64ArrayKeyword_1()); 
            match(input,64,FOLLOW_64_in_rule__LongArrayType__Group__110817); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5334:1: rule__ULongArrayType__Group__0 : ( () ) rule__ULongArrayType__Group__1 ;
    public final void rule__ULongArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5338:1: ( ( () ) rule__ULongArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5339:1: ( () ) rule__ULongArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5339:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5340:1: ()
            {
             before(grammarAccess.getULongArrayTypeAccess().getULongArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5341:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5343:1: 
            {
            }

             after(grammarAccess.getULongArrayTypeAccess().getULongArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__ULongArrayType__Group__1_in_rule__ULongArrayType__Group__010866);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5354:1: rule__ULongArrayType__Group__1 : ( 'DevVarULong64Array' ) ;
    public final void rule__ULongArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5358:1: ( ( 'DevVarULong64Array' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5359:1: ( 'DevVarULong64Array' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5359:1: ( 'DevVarULong64Array' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5360:1: 'DevVarULong64Array'
            {
             before(grammarAccess.getULongArrayTypeAccess().getDevVarULong64ArrayKeyword_1()); 
            match(input,65,FOLLOW_65_in_rule__ULongArrayType__Group__110895); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5377:1: rule__DevIntType__Group__0 : ( () ) rule__DevIntType__Group__1 ;
    public final void rule__DevIntType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5381:1: ( ( () ) rule__DevIntType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5382:1: ( () ) rule__DevIntType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5382:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5383:1: ()
            {
             before(grammarAccess.getDevIntTypeAccess().getDevIntTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5384:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5386:1: 
            {
            }

             after(grammarAccess.getDevIntTypeAccess().getDevIntTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__DevIntType__Group__1_in_rule__DevIntType__Group__010944);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5397:1: rule__DevIntType__Group__1 : ( 'DevInt' ) ;
    public final void rule__DevIntType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5401:1: ( ( 'DevInt' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5402:1: ( 'DevInt' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5402:1: ( 'DevInt' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5403:1: 'DevInt'
            {
             before(grammarAccess.getDevIntTypeAccess().getDevIntKeyword_1()); 
            match(input,66,FOLLOW_66_in_rule__DevIntType__Group__110973); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5420:1: rule__EncodedType__Group__0 : ( () ) rule__EncodedType__Group__1 ;
    public final void rule__EncodedType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5424:1: ( ( () ) rule__EncodedType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5425:1: ( () ) rule__EncodedType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5425:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5426:1: ()
            {
             before(grammarAccess.getEncodedTypeAccess().getEncodedTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5427:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5429:1: 
            {
            }

             after(grammarAccess.getEncodedTypeAccess().getEncodedTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__EncodedType__Group__1_in_rule__EncodedType__Group__011022);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5440:1: rule__EncodedType__Group__1 : ( 'DevEncoded' ) ;
    public final void rule__EncodedType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5444:1: ( ( 'DevEncoded' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5445:1: ( 'DevEncoded' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5445:1: ( 'DevEncoded' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5446:1: 'DevEncoded'
            {
             before(grammarAccess.getEncodedTypeAccess().getDevEncodedKeyword_1()); 
            match(input,67,FOLLOW_67_in_rule__EncodedType__Group__111051); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5463:1: rule__ShortVectorType__Group__0 : ( () ) rule__ShortVectorType__Group__1 ;
    public final void rule__ShortVectorType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5467:1: ( ( () ) rule__ShortVectorType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5468:1: ( () ) rule__ShortVectorType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5468:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5469:1: ()
            {
             before(grammarAccess.getShortVectorTypeAccess().getShortVectorTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5470:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5472:1: 
            {
            }

             after(grammarAccess.getShortVectorTypeAccess().getShortVectorTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__ShortVectorType__Group__1_in_rule__ShortVectorType__Group__011100);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5483:1: rule__ShortVectorType__Group__1 : ( 'vector<short>' ) ;
    public final void rule__ShortVectorType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5487:1: ( ( 'vector<short>' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5488:1: ( 'vector<short>' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5488:1: ( 'vector<short>' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5489:1: 'vector<short>'
            {
             before(grammarAccess.getShortVectorTypeAccess().getVectorShortKeyword_1()); 
            match(input,68,FOLLOW_68_in_rule__ShortVectorType__Group__111129); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5506:1: rule__IntVectorType__Group__0 : ( () ) rule__IntVectorType__Group__1 ;
    public final void rule__IntVectorType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5510:1: ( ( () ) rule__IntVectorType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5511:1: ( () ) rule__IntVectorType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5511:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5512:1: ()
            {
             before(grammarAccess.getIntVectorTypeAccess().getIntVectorTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5513:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5515:1: 
            {
            }

             after(grammarAccess.getIntVectorTypeAccess().getIntVectorTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__IntVectorType__Group__1_in_rule__IntVectorType__Group__011178);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5526:1: rule__IntVectorType__Group__1 : ( 'vector<int>' ) ;
    public final void rule__IntVectorType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5530:1: ( ( 'vector<int>' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5531:1: ( 'vector<int>' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5531:1: ( 'vector<int>' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5532:1: 'vector<int>'
            {
             before(grammarAccess.getIntVectorTypeAccess().getVectorIntKeyword_1()); 
            match(input,69,FOLLOW_69_in_rule__IntVectorType__Group__111207); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5549:1: rule__FloatVectorType__Group__0 : ( () ) rule__FloatVectorType__Group__1 ;
    public final void rule__FloatVectorType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5553:1: ( ( () ) rule__FloatVectorType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5554:1: ( () ) rule__FloatVectorType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5554:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5555:1: ()
            {
             before(grammarAccess.getFloatVectorTypeAccess().getFloatVectorTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5556:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5558:1: 
            {
            }

             after(grammarAccess.getFloatVectorTypeAccess().getFloatVectorTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__FloatVectorType__Group__1_in_rule__FloatVectorType__Group__011256);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5569:1: rule__FloatVectorType__Group__1 : ( 'vector<float>' ) ;
    public final void rule__FloatVectorType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5573:1: ( ( 'vector<float>' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5574:1: ( 'vector<float>' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5574:1: ( 'vector<float>' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5575:1: 'vector<float>'
            {
             before(grammarAccess.getFloatVectorTypeAccess().getVectorFloatKeyword_1()); 
            match(input,70,FOLLOW_70_in_rule__FloatVectorType__Group__111285); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5592:1: rule__DoubleVectorType__Group__0 : ( () ) rule__DoubleVectorType__Group__1 ;
    public final void rule__DoubleVectorType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5596:1: ( ( () ) rule__DoubleVectorType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5597:1: ( () ) rule__DoubleVectorType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5597:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5598:1: ()
            {
             before(grammarAccess.getDoubleVectorTypeAccess().getDoubleVectorTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5599:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5601:1: 
            {
            }

             after(grammarAccess.getDoubleVectorTypeAccess().getDoubleVectorTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__DoubleVectorType__Group__1_in_rule__DoubleVectorType__Group__011334);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5612:1: rule__DoubleVectorType__Group__1 : ( 'vector<double>' ) ;
    public final void rule__DoubleVectorType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5616:1: ( ( 'vector<double>' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5617:1: ( 'vector<double>' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5617:1: ( 'vector<double>' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5618:1: 'vector<double>'
            {
             before(grammarAccess.getDoubleVectorTypeAccess().getVectorDoubleKeyword_1()); 
            match(input,71,FOLLOW_71_in_rule__DoubleVectorType__Group__111363); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5635:1: rule__StringVectorType__Group__0 : ( () ) rule__StringVectorType__Group__1 ;
    public final void rule__StringVectorType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5639:1: ( ( () ) rule__StringVectorType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5640:1: ( () ) rule__StringVectorType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5640:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5641:1: ()
            {
             before(grammarAccess.getStringVectorTypeAccess().getStringVectorTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5642:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5644:1: 
            {
            }

             after(grammarAccess.getStringVectorTypeAccess().getStringVectorTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__StringVectorType__Group__1_in_rule__StringVectorType__Group__011412);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5655:1: rule__StringVectorType__Group__1 : ( 'vector<string>' ) ;
    public final void rule__StringVectorType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5659:1: ( ( 'vector<string>' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5660:1: ( 'vector<string>' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5660:1: ( 'vector<string>' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5661:1: 'vector<string>'
            {
             before(grammarAccess.getStringVectorTypeAccess().getVectorStringKeyword_1()); 
            match(input,72,FOLLOW_72_in_rule__StringVectorType__Group__111441); 
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


    // $ANTLR start rule__Miscellaneous__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5678:1: rule__Miscellaneous__Group__0 : ( ( rule__Miscellaneous__MakefileHomeAssignment_0 ) ) rule__Miscellaneous__Group__1 ;
    public final void rule__Miscellaneous__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5682:1: ( ( ( rule__Miscellaneous__MakefileHomeAssignment_0 ) ) rule__Miscellaneous__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5683:1: ( ( rule__Miscellaneous__MakefileHomeAssignment_0 ) ) rule__Miscellaneous__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5683:1: ( ( rule__Miscellaneous__MakefileHomeAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5684:1: ( rule__Miscellaneous__MakefileHomeAssignment_0 )
            {
             before(grammarAccess.getMiscellaneousAccess().getMakefileHomeAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5685:1: ( rule__Miscellaneous__MakefileHomeAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5685:2: rule__Miscellaneous__MakefileHomeAssignment_0
            {
            pushFollow(FOLLOW_rule__Miscellaneous__MakefileHomeAssignment_0_in_rule__Miscellaneous__Group__011480);
            rule__Miscellaneous__MakefileHomeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getMiscellaneousAccess().getMakefileHomeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Miscellaneous__Group__1_in_rule__Miscellaneous__Group__011489);
            rule__Miscellaneous__Group__1();
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
    // $ANTLR end rule__Miscellaneous__Group__0


    // $ANTLR start rule__Miscellaneous__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5696:1: rule__Miscellaneous__Group__1 : ( ( rule__Miscellaneous__InstallHomeAssignment_1 ) ) ;
    public final void rule__Miscellaneous__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5700:1: ( ( ( rule__Miscellaneous__InstallHomeAssignment_1 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5701:1: ( ( rule__Miscellaneous__InstallHomeAssignment_1 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5701:1: ( ( rule__Miscellaneous__InstallHomeAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5702:1: ( rule__Miscellaneous__InstallHomeAssignment_1 )
            {
             before(grammarAccess.getMiscellaneousAccess().getInstallHomeAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5703:1: ( rule__Miscellaneous__InstallHomeAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5703:2: rule__Miscellaneous__InstallHomeAssignment_1
            {
            pushFollow(FOLLOW_rule__Miscellaneous__InstallHomeAssignment_1_in_rule__Miscellaneous__Group__111517);
            rule__Miscellaneous__InstallHomeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getMiscellaneousAccess().getInstallHomeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Miscellaneous__Group__1


    // $ANTLR start rule__PogoSystem__ImportsAssignment_0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5717:1: rule__PogoSystem__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__PogoSystem__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5721:1: ( ( ruleImport ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5722:1: ( ruleImport )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5722:1: ( ruleImport )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5723:1: ruleImport
            {
             before(grammarAccess.getPogoSystemAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__PogoSystem__ImportsAssignment_011555);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5732:1: rule__PogoSystem__ClassesAssignment_1 : ( rulePogoDeviceClass ) ;
    public final void rule__PogoSystem__ClassesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5736:1: ( ( rulePogoDeviceClass ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5737:1: ( rulePogoDeviceClass )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5737:1: ( rulePogoDeviceClass )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5738:1: rulePogoDeviceClass
            {
             before(grammarAccess.getPogoSystemAccess().getClassesPogoDeviceClassParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePogoDeviceClass_in_rule__PogoSystem__ClassesAssignment_111586);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5747:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5751:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5752:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5752:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5753:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_111617); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5762:1: rule__PogoDeviceClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PogoDeviceClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5766:1: ( ( RULE_ID ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5767:1: ( RULE_ID )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5767:1: ( RULE_ID )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5768:1: RULE_ID
            {
             before(grammarAccess.getPogoDeviceClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PogoDeviceClass__NameAssignment_111648); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5777:1: rule__PogoDeviceClass__IsAbstractAssignment_2 : ( ( 'abstract' ) ) ;
    public final void rule__PogoDeviceClass__IsAbstractAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5781:1: ( ( ( 'abstract' ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5782:1: ( ( 'abstract' ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5782:1: ( ( 'abstract' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5783:1: ( 'abstract' )
            {
             before(grammarAccess.getPogoDeviceClassAccess().getIsAbstractAbstractKeyword_2_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5784:1: ( 'abstract' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5785:1: 'abstract'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getIsAbstractAbstractKeyword_2_0()); 
            match(input,73,FOLLOW_73_in_rule__PogoDeviceClass__IsAbstractAssignment_211684); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5800:1: rule__PogoDeviceClass__BaseClassAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__PogoDeviceClass__BaseClassAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5804:1: ( ( ( RULE_ID ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5805:1: ( ( RULE_ID ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5805:1: ( ( RULE_ID ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5806:1: ( RULE_ID )
            {
             before(grammarAccess.getPogoDeviceClassAccess().getBaseClassPogoDeviceClassCrossReference_3_1_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5807:1: ( RULE_ID )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5808:1: RULE_ID
            {
             before(grammarAccess.getPogoDeviceClassAccess().getBaseClassPogoDeviceClassIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PogoDeviceClass__BaseClassAssignment_3_111727); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5819:1: rule__PogoDeviceClass__InstituteAssignment_5 : ( RULE_ID ) ;
    public final void rule__PogoDeviceClass__InstituteAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5823:1: ( ( RULE_ID ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5824:1: ( RULE_ID )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5824:1: ( RULE_ID )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5825:1: RULE_ID
            {
             before(grammarAccess.getPogoDeviceClassAccess().getInstituteIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PogoDeviceClass__InstituteAssignment_511762); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5834:1: rule__PogoDeviceClass__DescriptionAssignment_7 : ( ruleClassDescription ) ;
    public final void rule__PogoDeviceClass__DescriptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5838:1: ( ( ruleClassDescription ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5839:1: ( ruleClassDescription )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5839:1: ( ruleClassDescription )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5840:1: ruleClassDescription
            {
             before(grammarAccess.getPogoDeviceClassAccess().getDescriptionClassDescriptionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleClassDescription_in_rule__PogoDeviceClass__DescriptionAssignment_711793);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5849:1: rule__PogoDeviceClass__ClassPropertiesAssignment_9 : ( ruleProperty ) ;
    public final void rule__PogoDeviceClass__ClassPropertiesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5853:1: ( ( ruleProperty ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5854:1: ( ruleProperty )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5854:1: ( ruleProperty )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5855:1: ruleProperty
            {
             before(grammarAccess.getPogoDeviceClassAccess().getClassPropertiesPropertyParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__PogoDeviceClass__ClassPropertiesAssignment_911824);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5864:1: rule__PogoDeviceClass__DevicePropertiesAssignment_11 : ( ruleProperty ) ;
    public final void rule__PogoDeviceClass__DevicePropertiesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5868:1: ( ( ruleProperty ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5869:1: ( ruleProperty )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5869:1: ( ruleProperty )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5870:1: ruleProperty
            {
             before(grammarAccess.getPogoDeviceClassAccess().getDevicePropertiesPropertyParserRuleCall_11_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__PogoDeviceClass__DevicePropertiesAssignment_1111855);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5879:1: rule__PogoDeviceClass__CommandsAssignment_13 : ( ruleCommand ) ;
    public final void rule__PogoDeviceClass__CommandsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5883:1: ( ( ruleCommand ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5884:1: ( ruleCommand )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5884:1: ( ruleCommand )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5885:1: ruleCommand
            {
             before(grammarAccess.getPogoDeviceClassAccess().getCommandsCommandParserRuleCall_13_0()); 
            pushFollow(FOLLOW_ruleCommand_in_rule__PogoDeviceClass__CommandsAssignment_1311886);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5894:1: rule__PogoDeviceClass__AttributesAssignment_15 : ( ruleAttribute ) ;
    public final void rule__PogoDeviceClass__AttributesAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5898:1: ( ( ruleAttribute ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5899:1: ( ruleAttribute )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5899:1: ( ruleAttribute )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5900:1: ruleAttribute
            {
             before(grammarAccess.getPogoDeviceClassAccess().getAttributesAttributeParserRuleCall_15_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__PogoDeviceClass__AttributesAssignment_1511917);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5909:1: rule__PogoDeviceClass__StatesAssignment_17 : ( ruleState ) ;
    public final void rule__PogoDeviceClass__StatesAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5913:1: ( ( ruleState ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5914:1: ( ruleState )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5914:1: ( ruleState )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5915:1: ruleState
            {
             before(grammarAccess.getPogoDeviceClassAccess().getStatesStateParserRuleCall_17_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__PogoDeviceClass__StatesAssignment_1711948);
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


    // $ANTLR start rule__PogoDeviceClass__MiscellaneousAssignment_18
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5924:1: rule__PogoDeviceClass__MiscellaneousAssignment_18 : ( ruleMiscellaneous ) ;
    public final void rule__PogoDeviceClass__MiscellaneousAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5928:1: ( ( ruleMiscellaneous ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5929:1: ( ruleMiscellaneous )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5929:1: ( ruleMiscellaneous )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5930:1: ruleMiscellaneous
            {
             before(grammarAccess.getPogoDeviceClassAccess().getMiscellaneousMiscellaneousParserRuleCall_18_0()); 
            pushFollow(FOLLOW_ruleMiscellaneous_in_rule__PogoDeviceClass__MiscellaneousAssignment_1811979);
            ruleMiscellaneous();
            _fsp--;

             after(grammarAccess.getPogoDeviceClassAccess().getMiscellaneousMiscellaneousParserRuleCall_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__MiscellaneousAssignment_18


    // $ANTLR start rule__ClassDescription__DescriptionAssignment_0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5939:1: rule__ClassDescription__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ClassDescription__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5943:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5944:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5944:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5945:1: RULE_STRING
            {
             before(grammarAccess.getClassDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassDescription__DescriptionAssignment_012010); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5954:1: rule__ClassDescription__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ClassDescription__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5958:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5959:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5959:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5960:1: RULE_STRING
            {
             before(grammarAccess.getClassDescriptionAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassDescription__TitleAssignment_112041); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5969:1: rule__ClassDescription__SourcePathAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ClassDescription__SourcePathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5973:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5974:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5974:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5975:1: RULE_STRING
            {
             before(grammarAccess.getClassDescriptionAccess().getSourcePathSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassDescription__SourcePathAssignment_212072); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5984:1: rule__ClassDescription__InheritancesAssignment_4 : ( ruleInheritance ) ;
    public final void rule__ClassDescription__InheritancesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5988:1: ( ( ruleInheritance ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5989:1: ( ruleInheritance )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5989:1: ( ruleInheritance )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5990:1: ruleInheritance
            {
             before(grammarAccess.getClassDescriptionAccess().getInheritancesInheritanceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInheritance_in_rule__ClassDescription__InheritancesAssignment_412103);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5999:1: rule__ClassDescription__LanguageAssignment_5 : ( ruleLanguage ) ;
    public final void rule__ClassDescription__LanguageAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6003:1: ( ( ruleLanguage ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6004:1: ( ruleLanguage )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6004:1: ( ruleLanguage )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6005:1: ruleLanguage
            {
             before(grammarAccess.getClassDescriptionAccess().getLanguageLanguageParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleLanguage_in_rule__ClassDescription__LanguageAssignment_512134);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6014:1: rule__ClassDescription__FilestogenerateAssignment_6 : ( RULE_STRING ) ;
    public final void rule__ClassDescription__FilestogenerateAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6018:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6019:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6019:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6020:1: RULE_STRING
            {
             before(grammarAccess.getClassDescriptionAccess().getFilestogenerateSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassDescription__FilestogenerateAssignment_612165); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6029:1: rule__ClassDescription__IdentificationAssignment_7 : ( ruleClassIdentification ) ;
    public final void rule__ClassDescription__IdentificationAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6033:1: ( ( ruleClassIdentification ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6034:1: ( ruleClassIdentification )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6034:1: ( ruleClassIdentification )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6035:1: ruleClassIdentification
            {
             before(grammarAccess.getClassDescriptionAccess().getIdentificationClassIdentificationParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleClassIdentification_in_rule__ClassDescription__IdentificationAssignment_712196);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6044:1: rule__ClassDescription__CommentsAssignment_8 : ( ruleComments ) ;
    public final void rule__ClassDescription__CommentsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6048:1: ( ( ruleComments ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6049:1: ( ruleComments )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6049:1: ( ruleComments )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6050:1: ruleComments
            {
             before(grammarAccess.getClassDescriptionAccess().getCommentsCommentsParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleComments_in_rule__ClassDescription__CommentsAssignment_812227);
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


    // $ANTLR start rule__ClassDescription__HasAbstractCommandAssignment_9
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6059:1: rule__ClassDescription__HasAbstractCommandAssignment_9 : ( ruleBoolean ) ;
    public final void rule__ClassDescription__HasAbstractCommandAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6063:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6064:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6064:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6065:1: ruleBoolean
            {
             before(grammarAccess.getClassDescriptionAccess().getHasAbstractCommandBooleanParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__ClassDescription__HasAbstractCommandAssignment_912258);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getClassDescriptionAccess().getHasAbstractCommandBooleanParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassDescription__HasAbstractCommandAssignment_9


    // $ANTLR start rule__ClassDescription__HasAbstractAttributeAssignment_10
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6074:1: rule__ClassDescription__HasAbstractAttributeAssignment_10 : ( ruleBoolean ) ;
    public final void rule__ClassDescription__HasAbstractAttributeAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6078:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6079:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6079:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6080:1: ruleBoolean
            {
             before(grammarAccess.getClassDescriptionAccess().getHasAbstractAttributeBooleanParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__ClassDescription__HasAbstractAttributeAssignment_1012289);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getClassDescriptionAccess().getHasAbstractAttributeBooleanParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassDescription__HasAbstractAttributeAssignment_10


    // $ANTLR start rule__Inheritance__ClassnameAssignment_0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6089:1: rule__Inheritance__ClassnameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Inheritance__ClassnameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6093:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6094:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6094:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6095:1: RULE_STRING
            {
             before(grammarAccess.getInheritanceAccess().getClassnameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Inheritance__ClassnameAssignment_012320); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6104:1: rule__Inheritance__SourcePathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Inheritance__SourcePathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6108:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6109:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6109:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6110:1: RULE_STRING
            {
             before(grammarAccess.getInheritanceAccess().getSourcePathSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Inheritance__SourcePathAssignment_112351); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6119:1: rule__ClassIdentification__ContactAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ClassIdentification__ContactAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6123:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6124:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6124:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6125:1: RULE_STRING
            {
             before(grammarAccess.getClassIdentificationAccess().getContactSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassIdentification__ContactAssignment_012382); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6134:1: rule__ClassIdentification__ClassFamilyAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ClassIdentification__ClassFamilyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6138:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6139:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6139:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6140:1: RULE_STRING
            {
             before(grammarAccess.getClassIdentificationAccess().getClassFamilySTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassIdentification__ClassFamilyAssignment_112413); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6149:1: rule__ClassIdentification__SiteSpecificAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ClassIdentification__SiteSpecificAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6153:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6154:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6154:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6155:1: RULE_STRING
            {
             before(grammarAccess.getClassIdentificationAccess().getSiteSpecificSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassIdentification__SiteSpecificAssignment_212444); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6164:1: rule__ClassIdentification__PlatformAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ClassIdentification__PlatformAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6168:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6169:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6169:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6170:1: RULE_STRING
            {
             before(grammarAccess.getClassIdentificationAccess().getPlatformSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassIdentification__PlatformAssignment_312475); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6179:1: rule__ClassIdentification__BusAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ClassIdentification__BusAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6183:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6184:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6184:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6185:1: RULE_STRING
            {
             before(grammarAccess.getClassIdentificationAccess().getBusSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassIdentification__BusAssignment_412506); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6194:1: rule__ClassIdentification__ManufacturerAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ClassIdentification__ManufacturerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6198:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6199:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6199:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6200:1: RULE_STRING
            {
             before(grammarAccess.getClassIdentificationAccess().getManufacturerSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassIdentification__ManufacturerAssignment_512537); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6209:1: rule__ClassIdentification__ReferenceAssignment_6 : ( RULE_STRING ) ;
    public final void rule__ClassIdentification__ReferenceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6213:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6214:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6214:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6215:1: RULE_STRING
            {
             before(grammarAccess.getClassIdentificationAccess().getReferenceSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassIdentification__ReferenceAssignment_612568); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6224:1: rule__Comments__CommandsTableAssignment : ( RULE_STRING ) ;
    public final void rule__Comments__CommandsTableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6228:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6229:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6229:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6230:1: RULE_STRING
            {
             before(grammarAccess.getCommentsAccess().getCommandsTableSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Comments__CommandsTableAssignment12599); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6239:1: rule__State__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6243:1: ( ( RULE_ID ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6244:1: ( RULE_ID )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6244:1: ( RULE_ID )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6245:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_012630); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6254:1: rule__State__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__State__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6258:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6259:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6259:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6260:1: RULE_STRING
            {
             before(grammarAccess.getStateAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__State__DescriptionAssignment_112661); 
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


    // $ANTLR start rule__State__StatusAssignment_2
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6269:1: rule__State__StatusAssignment_2 : ( ruleInheritanceStatus ) ;
    public final void rule__State__StatusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6273:1: ( ( ruleInheritanceStatus ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6274:1: ( ruleInheritanceStatus )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6274:1: ( ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6275:1: ruleInheritanceStatus
            {
             before(grammarAccess.getStateAccess().getStatusInheritanceStatusParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleInheritanceStatus_in_rule__State__StatusAssignment_212692);
            ruleInheritanceStatus();
            _fsp--;

             after(grammarAccess.getStateAccess().getStatusInheritanceStatusParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__StatusAssignment_2


    // $ANTLR start rule__Property__NameAssignment_0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6284:1: rule__Property__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6288:1: ( ( RULE_ID ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6289:1: ( RULE_ID )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6289:1: ( RULE_ID )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6290:1: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__NameAssignment_012723); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6299:1: rule__Property__TypeAssignment_1 : ( rulePropType ) ;
    public final void rule__Property__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6303:1: ( ( rulePropType ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6304:1: ( rulePropType )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6304:1: ( rulePropType )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6305:1: rulePropType
            {
             before(grammarAccess.getPropertyAccess().getTypePropTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePropType_in_rule__Property__TypeAssignment_112754);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6314:1: rule__Property__StatusAssignment_2 : ( ruleInheritanceStatus ) ;
    public final void rule__Property__StatusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6318:1: ( ( ruleInheritanceStatus ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6319:1: ( ruleInheritanceStatus )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6319:1: ( ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6320:1: ruleInheritanceStatus
            {
             before(grammarAccess.getPropertyAccess().getStatusInheritanceStatusParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleInheritanceStatus_in_rule__Property__StatusAssignment_212785);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6329:1: rule__Property__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Property__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6333:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6334:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6334:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6335:1: RULE_STRING
            {
             before(grammarAccess.getPropertyAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Property__DescriptionAssignment_312816); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6344:1: rule__Property__DefaultPropValueAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Property__DefaultPropValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6348:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6349:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6349:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6350:1: RULE_STRING
            {
             before(grammarAccess.getPropertyAccess().getDefaultPropValueSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Property__DefaultPropValueAssignment_512847); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6359:1: rule__InheritanceStatus__AbstractAssignment_0 : ( ruleBoolean ) ;
    public final void rule__InheritanceStatus__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6363:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6364:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6364:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6365:1: ruleBoolean
            {
             before(grammarAccess.getInheritanceStatusAccess().getAbstractBooleanParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__InheritanceStatus__AbstractAssignment_012878);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6374:1: rule__InheritanceStatus__InheritedAssignment_1 : ( ruleBoolean ) ;
    public final void rule__InheritanceStatus__InheritedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6378:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6379:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6379:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6380:1: ruleBoolean
            {
             before(grammarAccess.getInheritanceStatusAccess().getInheritedBooleanParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__InheritanceStatus__InheritedAssignment_112909);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6389:1: rule__InheritanceStatus__ConcreteAssignment_2 : ( ruleBoolean ) ;
    public final void rule__InheritanceStatus__ConcreteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6393:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6394:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6394:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6395:1: ruleBoolean
            {
             before(grammarAccess.getInheritanceStatusAccess().getConcreteBooleanParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__InheritanceStatus__ConcreteAssignment_212940);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6404:1: rule__InheritanceStatus__ConcreteHereAssignment_3 : ( ruleBoolean ) ;
    public final void rule__InheritanceStatus__ConcreteHereAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6408:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6409:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6409:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6410:1: ruleBoolean
            {
             before(grammarAccess.getInheritanceStatusAccess().getConcreteHereBooleanParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__InheritanceStatus__ConcreteHereAssignment_312971);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6419:1: rule__InheritanceStatus__HasChangedAssignment_4 : ( ruleBoolean ) ;
    public final void rule__InheritanceStatus__HasChangedAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6423:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6424:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6424:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6425:1: ruleBoolean
            {
             before(grammarAccess.getInheritanceStatusAccess().getHasChangedBooleanParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__InheritanceStatus__HasChangedAssignment_413002);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6434:1: rule__Command__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Command__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6438:1: ( ( RULE_ID ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6439:1: ( RULE_ID )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6439:1: ( RULE_ID )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6440:1: RULE_ID
            {
             before(grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Command__NameAssignment_013033); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6449:1: rule__Command__ArginAssignment_1 : ( ruleArgument ) ;
    public final void rule__Command__ArginAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6453:1: ( ( ruleArgument ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6454:1: ( ruleArgument )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6454:1: ( ruleArgument )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6455:1: ruleArgument
            {
             before(grammarAccess.getCommandAccess().getArginArgumentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Command__ArginAssignment_113064);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6464:1: rule__Command__ArgoutAssignment_2 : ( ruleArgument ) ;
    public final void rule__Command__ArgoutAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6468:1: ( ( ruleArgument ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6469:1: ( ruleArgument )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6469:1: ( ruleArgument )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6470:1: ruleArgument
            {
             before(grammarAccess.getCommandAccess().getArgoutArgumentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Command__ArgoutAssignment_213095);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6479:1: rule__Command__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Command__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6483:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6484:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6484:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6485:1: RULE_STRING
            {
             before(grammarAccess.getCommandAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Command__DescriptionAssignment_313126); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6494:1: rule__Command__StatusAssignment_4 : ( ruleInheritanceStatus ) ;
    public final void rule__Command__StatusAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6498:1: ( ( ruleInheritanceStatus ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6499:1: ( ruleInheritanceStatus )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6499:1: ( ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6500:1: ruleInheritanceStatus
            {
             before(grammarAccess.getCommandAccess().getStatusInheritanceStatusParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInheritanceStatus_in_rule__Command__StatusAssignment_413157);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6509:1: rule__Command__ExecMethodAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Command__ExecMethodAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6513:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6514:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6514:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6515:1: RULE_STRING
            {
             before(grammarAccess.getCommandAccess().getExecMethodSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Command__ExecMethodAssignment_513188); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6524:1: rule__Command__DisplayLevelAssignment_6 : ( ruleDisplayLevel ) ;
    public final void rule__Command__DisplayLevelAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6528:1: ( ( ruleDisplayLevel ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6529:1: ( ruleDisplayLevel )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6529:1: ( ruleDisplayLevel )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6530:1: ruleDisplayLevel
            {
             before(grammarAccess.getCommandAccess().getDisplayLevelDisplayLevelParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleDisplayLevel_in_rule__Command__DisplayLevelAssignment_613219);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6539:1: rule__Command__PolledPeriodAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Command__PolledPeriodAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6543:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6544:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6544:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6545:1: RULE_STRING
            {
             before(grammarAccess.getCommandAccess().getPolledPeriodSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Command__PolledPeriodAssignment_713250); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6554:1: rule__Command__ExcludedStatesAssignment_9 : ( RULE_STRING ) ;
    public final void rule__Command__ExcludedStatesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6558:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6559:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6559:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6560:1: RULE_STRING
            {
             before(grammarAccess.getCommandAccess().getExcludedStatesSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Command__ExcludedStatesAssignment_913281); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6569:1: rule__Argument__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Argument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6573:1: ( ( ruleType ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6574:1: ( ruleType )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6574:1: ( ruleType )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6575:1: ruleType
            {
             before(grammarAccess.getArgumentAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Argument__TypeAssignment_013312);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6584:1: rule__Argument__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Argument__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6588:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6589:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6589:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6590:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__DescriptionAssignment_113343); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6599:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6603:1: ( ( RULE_ID ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6604:1: ( RULE_ID )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6604:1: ( RULE_ID )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6605:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_013374); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6614:1: rule__Attribute__AttTypeAssignment_1 : ( ruleAttrType ) ;
    public final void rule__Attribute__AttTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6618:1: ( ( ruleAttrType ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6619:1: ( ruleAttrType )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6619:1: ( ruleAttrType )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6620:1: ruleAttrType
            {
             before(grammarAccess.getAttributeAccess().getAttTypeAttrTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttrType_in_rule__Attribute__AttTypeAssignment_113405);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6629:1: rule__Attribute__DataTypeAssignment_2 : ( ruleType ) ;
    public final void rule__Attribute__DataTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6633:1: ( ( ruleType ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6634:1: ( ruleType )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6634:1: ( ruleType )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6635:1: ruleType
            {
             before(grammarAccess.getAttributeAccess().getDataTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Attribute__DataTypeAssignment_213436);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6644:1: rule__Attribute__RwTypeAssignment_3 : ( ruleRW_Type ) ;
    public final void rule__Attribute__RwTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6648:1: ( ( ruleRW_Type ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6649:1: ( ruleRW_Type )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6649:1: ( ruleRW_Type )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6650:1: ruleRW_Type
            {
             before(grammarAccess.getAttributeAccess().getRwTypeRW_TypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRW_Type_in_rule__Attribute__RwTypeAssignment_313467);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6659:1: rule__Attribute__DisplayLevelAssignment_4 : ( ruleDisplayLevel ) ;
    public final void rule__Attribute__DisplayLevelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6663:1: ( ( ruleDisplayLevel ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6664:1: ( ruleDisplayLevel )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6664:1: ( ruleDisplayLevel )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6665:1: ruleDisplayLevel
            {
             before(grammarAccess.getAttributeAccess().getDisplayLevelDisplayLevelParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleDisplayLevel_in_rule__Attribute__DisplayLevelAssignment_413498);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6674:1: rule__Attribute__PolledPeriodAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Attribute__PolledPeriodAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6678:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6679:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6679:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6680:1: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getPolledPeriodSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__PolledPeriodAssignment_513529); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6689:1: rule__Attribute__MaxXAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Attribute__MaxXAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6693:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6694:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6694:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6695:1: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getMaxXSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__MaxXAssignment_613560); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6704:1: rule__Attribute__MaxYAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Attribute__MaxYAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6708:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6709:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6709:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6710:1: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getMaxYSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__MaxYAssignment_713591); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6719:1: rule__Attribute__MemorizedAssignment_8 : ( ruleBoolean ) ;
    public final void rule__Attribute__MemorizedAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6723:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6724:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6724:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6725:1: ruleBoolean
            {
             before(grammarAccess.getAttributeAccess().getMemorizedBooleanParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__Attribute__MemorizedAssignment_813622);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6734:1: rule__Attribute__MemorizedAtInitAssignment_9 : ( ruleBoolean ) ;
    public final void rule__Attribute__MemorizedAtInitAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6738:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6739:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6739:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6740:1: ruleBoolean
            {
             before(grammarAccess.getAttributeAccess().getMemorizedAtInitBooleanParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__Attribute__MemorizedAtInitAssignment_913653);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6749:1: rule__Attribute__ChangeEventAssignment_10 : ( ruleFireEvents ) ;
    public final void rule__Attribute__ChangeEventAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6753:1: ( ( ruleFireEvents ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6754:1: ( ruleFireEvents )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6754:1: ( ruleFireEvents )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6755:1: ruleFireEvents
            {
             before(grammarAccess.getAttributeAccess().getChangeEventFireEventsParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleFireEvents_in_rule__Attribute__ChangeEventAssignment_1013684);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6764:1: rule__Attribute__ArchiveEventAssignment_11 : ( ruleFireEvents ) ;
    public final void rule__Attribute__ArchiveEventAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6768:1: ( ( ruleFireEvents ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6769:1: ( ruleFireEvents )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6769:1: ( ruleFireEvents )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6770:1: ruleFireEvents
            {
             before(grammarAccess.getAttributeAccess().getArchiveEventFireEventsParserRuleCall_11_0()); 
            pushFollow(FOLLOW_ruleFireEvents_in_rule__Attribute__ArchiveEventAssignment_1113715);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6779:1: rule__Attribute__StatusAssignment_12 : ( ruleInheritanceStatus ) ;
    public final void rule__Attribute__StatusAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6783:1: ( ( ruleInheritanceStatus ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6784:1: ( ruleInheritanceStatus )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6784:1: ( ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6785:1: ruleInheritanceStatus
            {
             before(grammarAccess.getAttributeAccess().getStatusInheritanceStatusParserRuleCall_12_0()); 
            pushFollow(FOLLOW_ruleInheritanceStatus_in_rule__Attribute__StatusAssignment_1213746);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6794:1: rule__Attribute__PropertiesAssignment_13 : ( ruleAttrProperties ) ;
    public final void rule__Attribute__PropertiesAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6798:1: ( ( ruleAttrProperties ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6799:1: ( ruleAttrProperties )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6799:1: ( ruleAttrProperties )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6800:1: ruleAttrProperties
            {
             before(grammarAccess.getAttributeAccess().getPropertiesAttrPropertiesParserRuleCall_13_0()); 
            pushFollow(FOLLOW_ruleAttrProperties_in_rule__Attribute__PropertiesAssignment_1313777);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6809:1: rule__Attribute__ExcludedStatesAssignment_15 : ( RULE_STRING ) ;
    public final void rule__Attribute__ExcludedStatesAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6813:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6814:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6814:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6815:1: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getExcludedStatesSTRINGTerminalRuleCall_15_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__ExcludedStatesAssignment_1513808); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6824:1: rule__FireEvents__FireAssignment_0 : ( ruleBoolean ) ;
    public final void rule__FireEvents__FireAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6828:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6829:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6829:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6830:1: ruleBoolean
            {
             before(grammarAccess.getFireEventsAccess().getFireBooleanParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__FireEvents__FireAssignment_013839);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6839:1: rule__FireEvents__LibCheckCriteriaAssignment_1 : ( ruleBoolean ) ;
    public final void rule__FireEvents__LibCheckCriteriaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6843:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6844:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6844:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6845:1: ruleBoolean
            {
             before(grammarAccess.getFireEventsAccess().getLibCheckCriteriaBooleanParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__FireEvents__LibCheckCriteriaAssignment_113870);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6854:1: rule__AttrProperties__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6858:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6859:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6859:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6860:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__DescriptionAssignment_013901); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6869:1: rule__AttrProperties__LabelAssignment_1 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6873:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6874:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6874:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6875:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getLabelSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__LabelAssignment_113932); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6884:1: rule__AttrProperties__UnitAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__UnitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6888:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6889:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6889:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6890:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getUnitSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__UnitAssignment_213963); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6899:1: rule__AttrProperties__StandardUnitAssignment_3 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__StandardUnitAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6903:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6904:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6904:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6905:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getStandardUnitSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__StandardUnitAssignment_313994); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6914:1: rule__AttrProperties__DisplayUnitAssignment_4 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__DisplayUnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6918:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6919:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6919:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6920:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getDisplayUnitSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__DisplayUnitAssignment_414025); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6929:1: rule__AttrProperties__FormatAssignment_5 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__FormatAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6933:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6934:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6934:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6935:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getFormatSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__FormatAssignment_514056); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6944:1: rule__AttrProperties__MaxValueAssignment_6 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__MaxValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6948:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6949:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6949:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6950:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getMaxValueSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__MaxValueAssignment_614087); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6959:1: rule__AttrProperties__MinValueAssignment_7 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__MinValueAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6963:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6964:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6964:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6965:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getMinValueSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__MinValueAssignment_714118); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6974:1: rule__AttrProperties__MaxAlarmAssignment_8 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__MaxAlarmAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6978:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6979:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6979:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6980:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getMaxAlarmSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__MaxAlarmAssignment_814149); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6989:1: rule__AttrProperties__MinAlarmAssignment_9 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__MinAlarmAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6993:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6994:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6994:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6995:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getMinAlarmSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__MinAlarmAssignment_914180); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7004:1: rule__AttrProperties__MaxWarningAssignment_10 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__MaxWarningAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7008:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7009:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7009:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7010:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getMaxWarningSTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__MaxWarningAssignment_1014211); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7019:1: rule__AttrProperties__MinWarningAssignment_11 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__MinWarningAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7023:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7024:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7024:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7025:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getMinWarningSTRINGTerminalRuleCall_11_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__MinWarningAssignment_1114242); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7034:1: rule__AttrProperties__DeltaTimeAssignment_12 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__DeltaTimeAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7038:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7039:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7039:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7040:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getDeltaTimeSTRINGTerminalRuleCall_12_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__DeltaTimeAssignment_1214273); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7049:1: rule__AttrProperties__DeltaValueAssignment_13 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__DeltaValueAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7053:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7054:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7054:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7055:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getDeltaValueSTRINGTerminalRuleCall_13_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__DeltaValueAssignment_1314304); 
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


    // $ANTLR start rule__Miscellaneous__MakefileHomeAssignment_0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7064:1: rule__Miscellaneous__MakefileHomeAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Miscellaneous__MakefileHomeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7068:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7069:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7069:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7070:1: RULE_STRING
            {
             before(grammarAccess.getMiscellaneousAccess().getMakefileHomeSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Miscellaneous__MakefileHomeAssignment_014335); 
             after(grammarAccess.getMiscellaneousAccess().getMakefileHomeSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Miscellaneous__MakefileHomeAssignment_0


    // $ANTLR start rule__Miscellaneous__InstallHomeAssignment_1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7079:1: rule__Miscellaneous__InstallHomeAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Miscellaneous__InstallHomeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7083:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7084:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7084:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7085:1: RULE_STRING
            {
             before(grammarAccess.getMiscellaneousAccess().getInstallHomeSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Miscellaneous__InstallHomeAssignment_114366); 
             after(grammarAccess.getMiscellaneousAccess().getInstallHomeSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Miscellaneous__InstallHomeAssignment_1


 

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
    public static final BitSet FOLLOW_ruleMiscellaneous_in_entryRuleMiscellaneous3540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMiscellaneous3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Miscellaneous__Group__0_in_ruleMiscellaneous3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Language__Alternatives3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Language__Alternatives3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Language__Alternatives3651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DisplayLevel__Alternatives3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DisplayLevel__Alternatives3706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AttrType__Alternatives3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AttrType__Alternatives3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AttrType__Alternatives3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RW_Type__Alternatives3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RW_Type__Alternatives3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RW_Type__Alternatives3856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RW_Type__Alternatives3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Boolean__Alternatives3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Boolean__Alternatives3931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rule__PropType__Alternatives3965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVectorType_in_rule__PropType__Alternatives3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_rule__SimpleType__Alternatives4014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortType_in_rule__SimpleType__Alternatives4031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortType_in_rule__SimpleType__Alternatives4048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_rule__SimpleType__Alternatives4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntType_in_rule__SimpleType__Alternatives4082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_rule__SimpleType__Alternatives4099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_rule__SimpleType__Alternatives4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_rule__SimpleType__Alternatives4133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortVectorType_in_rule__VectorType__Alternatives4165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntVectorType_in_rule__VectorType__Alternatives4182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatVectorType_in_rule__VectorType__Alternatives4199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleVectorType_in_rule__VectorType__Alternatives4216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVectorType_in_rule__VectorType__Alternatives4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidType_in_rule__Type__Alternatives4265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_rule__Type__Alternatives4282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortType_in_rule__Type__Alternatives4299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortType_in_rule__Type__Alternatives4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_rule__Type__Alternatives4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntType_in_rule__Type__Alternatives4350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_rule__Type__Alternatives4367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_rule__Type__Alternatives4384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_rule__Type__Alternatives4401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharArrayType_in_rule__Type__Alternatives4418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortArrayType_in_rule__Type__Alternatives4435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortArrayType_in_rule__Type__Alternatives4452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntArrayType_in_rule__Type__Alternatives4469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntArrayType_in_rule__Type__Alternatives4486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatArrayType_in_rule__Type__Alternatives4503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleArrayType_in_rule__Type__Alternatives4520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringArrayType_in_rule__Type__Alternatives4537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongStringArrayType_in_rule__Type__Alternatives4554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleStringArrayType_in_rule__Type__Alternatives4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__Type__Alternatives4588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstStringType_in_rule__Type__Alternatives4605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanArrayType_in_rule__Type__Alternatives4622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_rule__Type__Alternatives4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongType_in_rule__Type__Alternatives4656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUCharType_in_rule__Type__Alternatives4673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongArrayType_in_rule__Type__Alternatives4690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongArrayType_in_rule__Type__Alternatives4707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDevIntType_in_rule__Type__Alternatives4724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncodedType_in_rule__Type__Alternatives4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoSystem__ImportsAssignment_0_in_rule__PogoSystem__Group__04775 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_rule__PogoSystem__Group__1_in_rule__PogoSystem__Group__04785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoSystem__ClassesAssignment_1_in_rule__PogoSystem__Group__14813 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_25_in_rule__Import__Group__04853 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__04863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__14891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PogoDeviceClass__Group__04930 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__1_in_rule__PogoDeviceClass__Group__04940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__NameAssignment_1_in_rule__PogoDeviceClass__Group__14968 = new BitSet(new long[]{0x0000000808000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__2_in_rule__PogoDeviceClass__Group__14977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__IsAbstractAssignment_2_in_rule__PogoDeviceClass__Group__25005 = new BitSet(new long[]{0x0000000808000000L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__3_in_rule__PogoDeviceClass__Group__25015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group_3__0_in_rule__PogoDeviceClass__Group__35043 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__4_in_rule__PogoDeviceClass__Group__35053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PogoDeviceClass__Group__45082 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__5_in_rule__PogoDeviceClass__Group__45092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__InstituteAssignment_5_in_rule__PogoDeviceClass__Group__55120 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__6_in_rule__PogoDeviceClass__Group__55129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__PogoDeviceClass__Group__65158 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__7_in_rule__PogoDeviceClass__Group__65168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__DescriptionAssignment_7_in_rule__PogoDeviceClass__Group__75196 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__8_in_rule__PogoDeviceClass__Group__75205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PogoDeviceClass__Group__85234 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__9_in_rule__PogoDeviceClass__Group__85244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__ClassPropertiesAssignment_9_in_rule__PogoDeviceClass__Group__95272 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__10_in_rule__PogoDeviceClass__Group__95282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__PogoDeviceClass__Group__105311 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__11_in_rule__PogoDeviceClass__Group__105321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__DevicePropertiesAssignment_11_in_rule__PogoDeviceClass__Group__115349 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__12_in_rule__PogoDeviceClass__Group__115359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__PogoDeviceClass__Group__125388 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__13_in_rule__PogoDeviceClass__Group__125398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__CommandsAssignment_13_in_rule__PogoDeviceClass__Group__135426 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__14_in_rule__PogoDeviceClass__Group__135436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__PogoDeviceClass__Group__145465 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__15_in_rule__PogoDeviceClass__Group__145475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__AttributesAssignment_15_in_rule__PogoDeviceClass__Group__155503 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__16_in_rule__PogoDeviceClass__Group__155513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__PogoDeviceClass__Group__165542 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__17_in_rule__PogoDeviceClass__Group__165552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__StatesAssignment_17_in_rule__PogoDeviceClass__Group__175580 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__18_in_rule__PogoDeviceClass__Group__175590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__MiscellaneousAssignment_18_in_rule__PogoDeviceClass__Group__185618 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__19_in_rule__PogoDeviceClass__Group__185627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__PogoDeviceClass__Group__195656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__PogoDeviceClass__Group_3__05732 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group_3__1_in_rule__PogoDeviceClass__Group_3__05742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__BaseClassAssignment_3_1_in_rule__PogoDeviceClass__Group_3__15770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__DescriptionAssignment_0_in_rule__ClassDescription__Group__05808 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__1_in_rule__ClassDescription__Group__05817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__TitleAssignment_1_in_rule__ClassDescription__Group__15845 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__2_in_rule__ClassDescription__Group__15854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__SourcePathAssignment_2_in_rule__ClassDescription__Group__25882 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__3_in_rule__ClassDescription__Group__25891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ClassDescription__Group__35920 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__4_in_rule__ClassDescription__Group__35930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__InheritancesAssignment_4_in_rule__ClassDescription__Group__45958 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__5_in_rule__ClassDescription__Group__45967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__LanguageAssignment_5_in_rule__ClassDescription__Group__55995 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__6_in_rule__ClassDescription__Group__56004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__FilestogenerateAssignment_6_in_rule__ClassDescription__Group__66032 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__7_in_rule__ClassDescription__Group__66041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__IdentificationAssignment_7_in_rule__ClassDescription__Group__76069 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__8_in_rule__ClassDescription__Group__76078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__CommentsAssignment_8_in_rule__ClassDescription__Group__86106 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__9_in_rule__ClassDescription__Group__86115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__HasAbstractCommandAssignment_9_in_rule__ClassDescription__Group__96143 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__10_in_rule__ClassDescription__Group__96152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__HasAbstractAttributeAssignment_10_in_rule__ClassDescription__Group__106180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inheritance__ClassnameAssignment_0_in_rule__Inheritance__Group__06236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Inheritance__Group__1_in_rule__Inheritance__Group__06245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inheritance__SourcePathAssignment_1_in_rule__Inheritance__Group__16273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__ContactAssignment_0_in_rule__ClassIdentification__Group__06311 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassIdentification__Group__1_in_rule__ClassIdentification__Group__06320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__ClassFamilyAssignment_1_in_rule__ClassIdentification__Group__16348 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassIdentification__Group__2_in_rule__ClassIdentification__Group__16357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__SiteSpecificAssignment_2_in_rule__ClassIdentification__Group__26385 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassIdentification__Group__3_in_rule__ClassIdentification__Group__26394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__PlatformAssignment_3_in_rule__ClassIdentification__Group__36422 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassIdentification__Group__4_in_rule__ClassIdentification__Group__36431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__BusAssignment_4_in_rule__ClassIdentification__Group__46459 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassIdentification__Group__5_in_rule__ClassIdentification__Group__46468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__ManufacturerAssignment_5_in_rule__ClassIdentification__Group__56496 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassIdentification__Group__6_in_rule__ClassIdentification__Group__56505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__ReferenceAssignment_6_in_rule__ClassIdentification__Group__66533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_0_in_rule__State__Group__06581 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__06590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__DescriptionAssignment_1_in_rule__State__Group__16618 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__16627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StatusAssignment_2_in_rule__State__Group__26655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NameAssignment_0_in_rule__Property__Group__06695 = new BitSet(new long[]{0x0000FF0000000000L,0x00000000000001F0L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__06704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__TypeAssignment_1_in_rule__Property__Group__16732 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__16741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__StatusAssignment_2_in_rule__Property__Group__26769 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__3_in_rule__Property__Group__26778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__DescriptionAssignment_3_in_rule__Property__Group__36806 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Property__Group__4_in_rule__Property__Group__36815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Property__Group__46844 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Property__Group__5_in_rule__Property__Group__46854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__DefaultPropValueAssignment_5_in_rule__Property__Group__56882 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__InheritanceStatus__AbstractAssignment_0_in_rule__InheritanceStatus__Group__06929 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__InheritanceStatus__Group__1_in_rule__InheritanceStatus__Group__06938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InheritanceStatus__InheritedAssignment_1_in_rule__InheritanceStatus__Group__16966 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__InheritanceStatus__Group__2_in_rule__InheritanceStatus__Group__16975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InheritanceStatus__ConcreteAssignment_2_in_rule__InheritanceStatus__Group__27003 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__InheritanceStatus__Group__3_in_rule__InheritanceStatus__Group__27012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InheritanceStatus__ConcreteHereAssignment_3_in_rule__InheritanceStatus__Group__37040 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__InheritanceStatus__Group__4_in_rule__InheritanceStatus__Group__37049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InheritanceStatus__HasChangedAssignment_4_in_rule__InheritanceStatus__Group__47077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__NameAssignment_0_in_rule__Command__Group__07121 = new BitSet(new long[]{0xFFFFFF8000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_rule__Command__Group__1_in_rule__Command__Group__07130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ArginAssignment_1_in_rule__Command__Group__17158 = new BitSet(new long[]{0xFFFFFF8000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_rule__Command__Group__2_in_rule__Command__Group__17167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ArgoutAssignment_2_in_rule__Command__Group__27195 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group__3_in_rule__Command__Group__27204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__DescriptionAssignment_3_in_rule__Command__Group__37232 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Command__Group__4_in_rule__Command__Group__37241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__StatusAssignment_4_in_rule__Command__Group__47269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group__5_in_rule__Command__Group__47278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ExecMethodAssignment_5_in_rule__Command__Group__57306 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Command__Group__6_in_rule__Command__Group__57315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__DisplayLevelAssignment_6_in_rule__Command__Group__67343 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group__7_in_rule__Command__Group__67352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__PolledPeriodAssignment_7_in_rule__Command__Group__77380 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Command__Group__8_in_rule__Command__Group__77389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Command__Group__87418 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Command__Group__9_in_rule__Command__Group__87428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ExcludedStatesAssignment_9_in_rule__Command__Group__97456 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Argument__TypeAssignment_0_in_rule__Argument__Group__07511 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__07520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__DescriptionAssignment_1_in_rule__Argument__Group__17548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__07586 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__07595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__AttTypeAssignment_1_in_rule__Attribute__Group__17623 = new BitSet(new long[]{0xFFFFFF8000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__17632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__DataTypeAssignment_2_in_rule__Attribute__Group__27660 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__27669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__RwTypeAssignment_3_in_rule__Attribute__Group__37697 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__37706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__DisplayLevelAssignment_4_in_rule__Attribute__Group__47734 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__47743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__PolledPeriodAssignment_5_in_rule__Attribute__Group__57771 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__6_in_rule__Attribute__Group__57780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__MaxXAssignment_6_in_rule__Attribute__Group__67808 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__7_in_rule__Attribute__Group__67817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__MaxYAssignment_7_in_rule__Attribute__Group__77845 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__8_in_rule__Attribute__Group__77854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__MemorizedAssignment_8_in_rule__Attribute__Group__87882 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__9_in_rule__Attribute__Group__87891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__MemorizedAtInitAssignment_9_in_rule__Attribute__Group__97919 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__10_in_rule__Attribute__Group__97928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ChangeEventAssignment_10_in_rule__Attribute__Group__107956 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__11_in_rule__Attribute__Group__107965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ArchiveEventAssignment_11_in_rule__Attribute__Group__117993 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__12_in_rule__Attribute__Group__118002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__StatusAssignment_12_in_rule__Attribute__Group__128030 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__13_in_rule__Attribute__Group__128039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__PropertiesAssignment_13_in_rule__Attribute__Group__138067 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__14_in_rule__Attribute__Group__138076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Attribute__Group__148105 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Attribute__Group__15_in_rule__Attribute__Group__148115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ExcludedStatesAssignment_15_in_rule__Attribute__Group__158143 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__FireEvents__FireAssignment_0_in_rule__FireEvents__Group__08210 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__FireEvents__Group__1_in_rule__FireEvents__Group__08219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FireEvents__LibCheckCriteriaAssignment_1_in_rule__FireEvents__Group__18247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__DescriptionAssignment_0_in_rule__AttrProperties__Group__08285 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__1_in_rule__AttrProperties__Group__08294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__LabelAssignment_1_in_rule__AttrProperties__Group__18322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__2_in_rule__AttrProperties__Group__18331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__UnitAssignment_2_in_rule__AttrProperties__Group__28359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__3_in_rule__AttrProperties__Group__28368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__StandardUnitAssignment_3_in_rule__AttrProperties__Group__38396 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__4_in_rule__AttrProperties__Group__38405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__DisplayUnitAssignment_4_in_rule__AttrProperties__Group__48433 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__5_in_rule__AttrProperties__Group__48442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__FormatAssignment_5_in_rule__AttrProperties__Group__58470 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__6_in_rule__AttrProperties__Group__58479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__MaxValueAssignment_6_in_rule__AttrProperties__Group__68507 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__7_in_rule__AttrProperties__Group__68516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__MinValueAssignment_7_in_rule__AttrProperties__Group__78544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__8_in_rule__AttrProperties__Group__78553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__MaxAlarmAssignment_8_in_rule__AttrProperties__Group__88581 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__9_in_rule__AttrProperties__Group__88590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__MinAlarmAssignment_9_in_rule__AttrProperties__Group__98618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__10_in_rule__AttrProperties__Group__98627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__MaxWarningAssignment_10_in_rule__AttrProperties__Group__108655 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__11_in_rule__AttrProperties__Group__108664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__MinWarningAssignment_11_in_rule__AttrProperties__Group__118692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__12_in_rule__AttrProperties__Group__118701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__DeltaTimeAssignment_12_in_rule__AttrProperties__Group__128729 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__13_in_rule__AttrProperties__Group__128738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__DeltaValueAssignment_13_in_rule__AttrProperties__Group__138766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VoidType__Group__1_in_rule__VoidType__Group__08838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__VoidType__Group__18867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanType__Group__1_in_rule__BooleanType__Group__08916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__BooleanType__Group__18945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortType__Group__1_in_rule__ShortType__Group__08994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ShortType__Group__19023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UShortType__Group__1_in_rule__UShortType__Group__09072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__UShortType__Group__19101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntType__Group__1_in_rule__IntType__Group__09150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__IntType__Group__19179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIntType__Group__1_in_rule__UIntType__Group__09228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__UIntType__Group__19257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatType__Group__1_in_rule__FloatType__Group__09306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__FloatType__Group__19335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleType__Group__1_in_rule__DoubleType__Group__09384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__DoubleType__Group__19413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group__1_in_rule__StringType__Group__09462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__StringType__Group__19491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharArrayType__Group__1_in_rule__CharArrayType__Group__09540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__CharArrayType__Group__19569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortArrayType__Group__1_in_rule__ShortArrayType__Group__09618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__ShortArrayType__Group__19647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UShortArrayType__Group__1_in_rule__UShortArrayType__Group__09696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__UShortArrayType__Group__19725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntArrayType__Group__1_in_rule__IntArrayType__Group__09774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__IntArrayType__Group__19803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIntArrayType__Group__1_in_rule__UIntArrayType__Group__09852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__UIntArrayType__Group__19881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatArrayType__Group__1_in_rule__FloatArrayType__Group__09930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__FloatArrayType__Group__19959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleArrayType__Group__1_in_rule__DoubleArrayType__Group__010008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__DoubleArrayType__Group__110037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringArrayType__Group__1_in_rule__StringArrayType__Group__010086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__StringArrayType__Group__110115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongStringArrayType__Group__1_in_rule__LongStringArrayType__Group__010164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__LongStringArrayType__Group__110193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleStringArrayType__Group__1_in_rule__DoubleStringArrayType__Group__010242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__DoubleStringArrayType__Group__110271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateType__Group__1_in_rule__StateType__Group__010320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__StateType__Group__110349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstStringType__Group__1_in_rule__ConstStringType__Group__010398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__ConstStringType__Group__110427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanArrayType__Group__1_in_rule__BooleanArrayType__Group__010476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__BooleanArrayType__Group__110505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UCharType__Group__1_in_rule__UCharType__Group__010554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__UCharType__Group__110583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongType__Group__1_in_rule__LongType__Group__010632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__LongType__Group__110661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ULongType__Group__1_in_rule__ULongType__Group__010710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__ULongType__Group__110739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongArrayType__Group__1_in_rule__LongArrayType__Group__010788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__LongArrayType__Group__110817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ULongArrayType__Group__1_in_rule__ULongArrayType__Group__010866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__ULongArrayType__Group__110895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DevIntType__Group__1_in_rule__DevIntType__Group__010944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__DevIntType__Group__110973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodedType__Group__1_in_rule__EncodedType__Group__011022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__EncodedType__Group__111051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortVectorType__Group__1_in_rule__ShortVectorType__Group__011100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__ShortVectorType__Group__111129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntVectorType__Group__1_in_rule__IntVectorType__Group__011178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__IntVectorType__Group__111207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatVectorType__Group__1_in_rule__FloatVectorType__Group__011256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__FloatVectorType__Group__111285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleVectorType__Group__1_in_rule__DoubleVectorType__Group__011334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__DoubleVectorType__Group__111363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVectorType__Group__1_in_rule__StringVectorType__Group__011412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__StringVectorType__Group__111441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Miscellaneous__MakefileHomeAssignment_0_in_rule__Miscellaneous__Group__011480 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Miscellaneous__Group__1_in_rule__Miscellaneous__Group__011489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Miscellaneous__InstallHomeAssignment_1_in_rule__Miscellaneous__Group__111517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__PogoSystem__ImportsAssignment_011555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePogoDeviceClass_in_rule__PogoSystem__ClassesAssignment_111586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_111617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PogoDeviceClass__NameAssignment_111648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__PogoDeviceClass__IsAbstractAssignment_211684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PogoDeviceClass__BaseClassAssignment_3_111727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PogoDeviceClass__InstituteAssignment_511762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDescription_in_rule__PogoDeviceClass__DescriptionAssignment_711793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__PogoDeviceClass__ClassPropertiesAssignment_911824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__PogoDeviceClass__DevicePropertiesAssignment_1111855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__PogoDeviceClass__CommandsAssignment_1311886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__PogoDeviceClass__AttributesAssignment_1511917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__PogoDeviceClass__StatesAssignment_1711948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMiscellaneous_in_rule__PogoDeviceClass__MiscellaneousAssignment_1811979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassDescription__DescriptionAssignment_012010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassDescription__TitleAssignment_112041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassDescription__SourcePathAssignment_212072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritance_in_rule__ClassDescription__InheritancesAssignment_412103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLanguage_in_rule__ClassDescription__LanguageAssignment_512134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassDescription__FilestogenerateAssignment_612165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassIdentification_in_rule__ClassDescription__IdentificationAssignment_712196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComments_in_rule__ClassDescription__CommentsAssignment_812227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__ClassDescription__HasAbstractCommandAssignment_912258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__ClassDescription__HasAbstractAttributeAssignment_1012289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Inheritance__ClassnameAssignment_012320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Inheritance__SourcePathAssignment_112351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassIdentification__ContactAssignment_012382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassIdentification__ClassFamilyAssignment_112413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassIdentification__SiteSpecificAssignment_212444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassIdentification__PlatformAssignment_312475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassIdentification__BusAssignment_412506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassIdentification__ManufacturerAssignment_512537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassIdentification__ReferenceAssignment_612568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Comments__CommandsTableAssignment12599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_012630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__State__DescriptionAssignment_112661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_rule__State__StatusAssignment_212692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__NameAssignment_012723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropType_in_rule__Property__TypeAssignment_112754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_rule__Property__StatusAssignment_212785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Property__DescriptionAssignment_312816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Property__DefaultPropValueAssignment_512847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__InheritanceStatus__AbstractAssignment_012878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__InheritanceStatus__InheritedAssignment_112909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__InheritanceStatus__ConcreteAssignment_212940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__InheritanceStatus__ConcreteHereAssignment_312971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__InheritanceStatus__HasChangedAssignment_413002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Command__NameAssignment_013033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Command__ArginAssignment_113064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Command__ArgoutAssignment_213095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Command__DescriptionAssignment_313126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_rule__Command__StatusAssignment_413157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Command__ExecMethodAssignment_513188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisplayLevel_in_rule__Command__DisplayLevelAssignment_613219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Command__PolledPeriodAssignment_713250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Command__ExcludedStatesAssignment_913281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Argument__TypeAssignment_013312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__DescriptionAssignment_113343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_013374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrType_in_rule__Attribute__AttTypeAssignment_113405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Attribute__DataTypeAssignment_213436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRW_Type_in_rule__Attribute__RwTypeAssignment_313467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisplayLevel_in_rule__Attribute__DisplayLevelAssignment_413498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__PolledPeriodAssignment_513529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__MaxXAssignment_613560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__MaxYAssignment_713591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__Attribute__MemorizedAssignment_813622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__Attribute__MemorizedAtInitAssignment_913653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFireEvents_in_rule__Attribute__ChangeEventAssignment_1013684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFireEvents_in_rule__Attribute__ArchiveEventAssignment_1113715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_rule__Attribute__StatusAssignment_1213746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrProperties_in_rule__Attribute__PropertiesAssignment_1313777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__ExcludedStatesAssignment_1513808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__FireEvents__FireAssignment_013839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__FireEvents__LibCheckCriteriaAssignment_113870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__DescriptionAssignment_013901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__LabelAssignment_113932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__UnitAssignment_213963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__StandardUnitAssignment_313994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__DisplayUnitAssignment_414025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__FormatAssignment_514056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__MaxValueAssignment_614087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__MinValueAssignment_714118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__MaxAlarmAssignment_814149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__MinAlarmAssignment_914180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__MaxWarningAssignment_1014211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__MinWarningAssignment_1114242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__DeltaTimeAssignment_1214273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__DeltaValueAssignment_1314304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Miscellaneous__MakefileHomeAssignment_014335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Miscellaneous__InstallHomeAssignment_114366 = new BitSet(new long[]{0x0000000000000002L});

}