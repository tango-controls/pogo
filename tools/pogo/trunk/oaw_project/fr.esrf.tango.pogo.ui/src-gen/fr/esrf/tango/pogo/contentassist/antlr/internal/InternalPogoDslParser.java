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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Cpp'", "'Java'", "'Python'", "'OPERATOR'", "'EXPERT'", "'Scalar'", "'Spectrum'", "'Image'", "'READ'", "'WRITE'", "'READ_WRITE'", "'READ_WITH_WRITE'", "'true'", "'false'", "'import'", "'multiclasses'", "'{'", "'classes:'", "'}'", "'inheritances:'", "'parentClasses:'", "'deviceclass'", "'description:'", "'classProperties:'", "'deviceProperties:'", "'commands:'", "'attributes:'", "'states:'", "'extends'", "'defaultPropValue:'", "'excludedStates:'", "'readExcludedStates:'", "'writeExcludedStates:'", "'void'", "'boolean'", "'short'", "'ushort'", "'int'", "'uint'", "'float'", "'double'", "'string'", "'DevVarCharArray'", "'DevVarShortArray'", "'DevVarUShortArray'", "'DevVarLongArray'", "'DevVarULongArray'", "'DevVarFloatArray'", "'DevVarDoubleArray'", "'DevVarStringArray'", "'DevVarLongStringArray'", "'DevVarDoubleStringArray'", "'DevState'", "'ConstDevString'", "'DevVarBooleanArray'", "'DevUChar'", "'DevLong64'", "'DevULong64'", "'DevVarLong64Array'", "'DevVarULong64Array'", "'DevInt'", "'DevEncoded'", "'vector<short>'", "'vector<int>'", "'vector<float>'", "'vector<double>'", "'vector<string>'", "'abstract'"
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


    // $ANTLR start entryRulePogoMultiClasses
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:114:1: entryRulePogoMultiClasses : rulePogoMultiClasses EOF ;
    public final void entryRulePogoMultiClasses() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:114:27: ( rulePogoMultiClasses EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:115:1: rulePogoMultiClasses EOF
            {
             before(grammarAccess.getPogoMultiClassesRule()); 
            pushFollow(FOLLOW_rulePogoMultiClasses_in_entryRulePogoMultiClasses180);
            rulePogoMultiClasses();
            _fsp--;

             after(grammarAccess.getPogoMultiClassesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePogoMultiClasses187); 

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
    // $ANTLR end entryRulePogoMultiClasses


    // $ANTLR start rulePogoMultiClasses
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:122:1: rulePogoMultiClasses : ( ( rule__PogoMultiClasses__Group__0 ) ) ;
    public final void rulePogoMultiClasses() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:126:2: ( ( ( rule__PogoMultiClasses__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:127:1: ( ( rule__PogoMultiClasses__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:127:1: ( ( rule__PogoMultiClasses__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:128:1: ( rule__PogoMultiClasses__Group__0 )
            {
             before(grammarAccess.getPogoMultiClassesAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:129:1: ( rule__PogoMultiClasses__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:129:2: rule__PogoMultiClasses__Group__0
            {
            pushFollow(FOLLOW_rule__PogoMultiClasses__Group__0_in_rulePogoMultiClasses214);
            rule__PogoMultiClasses__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPogoMultiClassesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePogoMultiClasses


    // $ANTLR start entryRuleOneClassSimpleDef
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:141:1: entryRuleOneClassSimpleDef : ruleOneClassSimpleDef EOF ;
    public final void entryRuleOneClassSimpleDef() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:141:28: ( ruleOneClassSimpleDef EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:142:1: ruleOneClassSimpleDef EOF
            {
             before(grammarAccess.getOneClassSimpleDefRule()); 
            pushFollow(FOLLOW_ruleOneClassSimpleDef_in_entryRuleOneClassSimpleDef240);
            ruleOneClassSimpleDef();
            _fsp--;

             after(grammarAccess.getOneClassSimpleDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneClassSimpleDef247); 

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
    // $ANTLR end entryRuleOneClassSimpleDef


    // $ANTLR start ruleOneClassSimpleDef
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:149:1: ruleOneClassSimpleDef : ( ( rule__OneClassSimpleDef__Group__0 ) ) ;
    public final void ruleOneClassSimpleDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:153:2: ( ( ( rule__OneClassSimpleDef__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:154:1: ( ( rule__OneClassSimpleDef__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:154:1: ( ( rule__OneClassSimpleDef__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:155:1: ( rule__OneClassSimpleDef__Group__0 )
            {
             before(grammarAccess.getOneClassSimpleDefAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:156:1: ( rule__OneClassSimpleDef__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:156:2: rule__OneClassSimpleDef__Group__0
            {
            pushFollow(FOLLOW_rule__OneClassSimpleDef__Group__0_in_ruleOneClassSimpleDef274);
            rule__OneClassSimpleDef__Group__0();
            _fsp--;


            }

             after(grammarAccess.getOneClassSimpleDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleOneClassSimpleDef


    // $ANTLR start entryRulePogoDeviceClass
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:168:1: entryRulePogoDeviceClass : rulePogoDeviceClass EOF ;
    public final void entryRulePogoDeviceClass() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:168:26: ( rulePogoDeviceClass EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:169:1: rulePogoDeviceClass EOF
            {
             before(grammarAccess.getPogoDeviceClassRule()); 
            pushFollow(FOLLOW_rulePogoDeviceClass_in_entryRulePogoDeviceClass300);
            rulePogoDeviceClass();
            _fsp--;

             after(grammarAccess.getPogoDeviceClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePogoDeviceClass307); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:176:1: rulePogoDeviceClass : ( ( rule__PogoDeviceClass__Group__0 ) ) ;
    public final void rulePogoDeviceClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:180:2: ( ( ( rule__PogoDeviceClass__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:181:1: ( ( rule__PogoDeviceClass__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:181:1: ( ( rule__PogoDeviceClass__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:182:1: ( rule__PogoDeviceClass__Group__0 )
            {
             before(grammarAccess.getPogoDeviceClassAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:183:1: ( rule__PogoDeviceClass__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:183:2: rule__PogoDeviceClass__Group__0
            {
            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__0_in_rulePogoDeviceClass334);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:195:1: entryRuleLanguage : ruleLanguage EOF ;
    public final void entryRuleLanguage() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:195:19: ( ruleLanguage EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:196:1: ruleLanguage EOF
            {
             before(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_ruleLanguage_in_entryRuleLanguage360);
            ruleLanguage();
            _fsp--;

             after(grammarAccess.getLanguageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLanguage367); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:203:1: ruleLanguage : ( ( rule__Language__Alternatives ) ) ;
    public final void ruleLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:207:2: ( ( ( rule__Language__Alternatives ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:208:1: ( ( rule__Language__Alternatives ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:208:1: ( ( rule__Language__Alternatives ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:209:1: ( rule__Language__Alternatives )
            {
             before(grammarAccess.getLanguageAccess().getAlternatives()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:210:1: ( rule__Language__Alternatives )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:210:2: rule__Language__Alternatives
            {
            pushFollow(FOLLOW_rule__Language__Alternatives_in_ruleLanguage394);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:222:1: entryRuleDisplayLevel : ruleDisplayLevel EOF ;
    public final void entryRuleDisplayLevel() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:222:23: ( ruleDisplayLevel EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:223:1: ruleDisplayLevel EOF
            {
             before(grammarAccess.getDisplayLevelRule()); 
            pushFollow(FOLLOW_ruleDisplayLevel_in_entryRuleDisplayLevel420);
            ruleDisplayLevel();
            _fsp--;

             after(grammarAccess.getDisplayLevelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisplayLevel427); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:230:1: ruleDisplayLevel : ( ( rule__DisplayLevel__Alternatives ) ) ;
    public final void ruleDisplayLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:234:2: ( ( ( rule__DisplayLevel__Alternatives ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:235:1: ( ( rule__DisplayLevel__Alternatives ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:235:1: ( ( rule__DisplayLevel__Alternatives ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:236:1: ( rule__DisplayLevel__Alternatives )
            {
             before(grammarAccess.getDisplayLevelAccess().getAlternatives()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:237:1: ( rule__DisplayLevel__Alternatives )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:237:2: rule__DisplayLevel__Alternatives
            {
            pushFollow(FOLLOW_rule__DisplayLevel__Alternatives_in_ruleDisplayLevel454);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:249:1: entryRuleAttrType : ruleAttrType EOF ;
    public final void entryRuleAttrType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:249:19: ( ruleAttrType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:250:1: ruleAttrType EOF
            {
             before(grammarAccess.getAttrTypeRule()); 
            pushFollow(FOLLOW_ruleAttrType_in_entryRuleAttrType480);
            ruleAttrType();
            _fsp--;

             after(grammarAccess.getAttrTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrType487); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:257:1: ruleAttrType : ( ( rule__AttrType__Alternatives ) ) ;
    public final void ruleAttrType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:261:2: ( ( ( rule__AttrType__Alternatives ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:262:1: ( ( rule__AttrType__Alternatives ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:262:1: ( ( rule__AttrType__Alternatives ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:263:1: ( rule__AttrType__Alternatives )
            {
             before(grammarAccess.getAttrTypeAccess().getAlternatives()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:264:1: ( rule__AttrType__Alternatives )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:264:2: rule__AttrType__Alternatives
            {
            pushFollow(FOLLOW_rule__AttrType__Alternatives_in_ruleAttrType514);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:276:1: entryRuleRW_Type : ruleRW_Type EOF ;
    public final void entryRuleRW_Type() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:276:18: ( ruleRW_Type EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:277:1: ruleRW_Type EOF
            {
             before(grammarAccess.getRW_TypeRule()); 
            pushFollow(FOLLOW_ruleRW_Type_in_entryRuleRW_Type540);
            ruleRW_Type();
            _fsp--;

             after(grammarAccess.getRW_TypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRW_Type547); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:284:1: ruleRW_Type : ( ( rule__RW_Type__Alternatives ) ) ;
    public final void ruleRW_Type() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:288:2: ( ( ( rule__RW_Type__Alternatives ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:289:1: ( ( rule__RW_Type__Alternatives ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:289:1: ( ( rule__RW_Type__Alternatives ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:290:1: ( rule__RW_Type__Alternatives )
            {
             before(grammarAccess.getRW_TypeAccess().getAlternatives()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:291:1: ( rule__RW_Type__Alternatives )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:291:2: rule__RW_Type__Alternatives
            {
            pushFollow(FOLLOW_rule__RW_Type__Alternatives_in_ruleRW_Type574);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:303:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:303:18: ( ruleBoolean EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:304:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean600);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean607); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:311:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:315:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:316:1: ( ( rule__Boolean__Alternatives ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:316:1: ( ( rule__Boolean__Alternatives ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:317:1: ( rule__Boolean__Alternatives )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:318:1: ( rule__Boolean__Alternatives )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:318:2: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_rule__Boolean__Alternatives_in_ruleBoolean634);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:330:1: entryRuleClassDescription : ruleClassDescription EOF ;
    public final void entryRuleClassDescription() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:330:27: ( ruleClassDescription EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:331:1: ruleClassDescription EOF
            {
             before(grammarAccess.getClassDescriptionRule()); 
            pushFollow(FOLLOW_ruleClassDescription_in_entryRuleClassDescription660);
            ruleClassDescription();
            _fsp--;

             after(grammarAccess.getClassDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassDescription667); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:338:1: ruleClassDescription : ( ( rule__ClassDescription__Group__0 ) ) ;
    public final void ruleClassDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:342:2: ( ( ( rule__ClassDescription__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:343:1: ( ( rule__ClassDescription__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:343:1: ( ( rule__ClassDescription__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:344:1: ( rule__ClassDescription__Group__0 )
            {
             before(grammarAccess.getClassDescriptionAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:345:1: ( rule__ClassDescription__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:345:2: rule__ClassDescription__Group__0
            {
            pushFollow(FOLLOW_rule__ClassDescription__Group__0_in_ruleClassDescription694);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:357:1: entryRuleInheritance : ruleInheritance EOF ;
    public final void entryRuleInheritance() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:357:22: ( ruleInheritance EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:358:1: ruleInheritance EOF
            {
             before(grammarAccess.getInheritanceRule()); 
            pushFollow(FOLLOW_ruleInheritance_in_entryRuleInheritance720);
            ruleInheritance();
            _fsp--;

             after(grammarAccess.getInheritanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInheritance727); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:365:1: ruleInheritance : ( ( rule__Inheritance__Group__0 ) ) ;
    public final void ruleInheritance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:369:2: ( ( ( rule__Inheritance__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:370:1: ( ( rule__Inheritance__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:370:1: ( ( rule__Inheritance__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:371:1: ( rule__Inheritance__Group__0 )
            {
             before(grammarAccess.getInheritanceAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:372:1: ( rule__Inheritance__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:372:2: rule__Inheritance__Group__0
            {
            pushFollow(FOLLOW_rule__Inheritance__Group__0_in_ruleInheritance754);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:384:1: entryRuleClassIdentification : ruleClassIdentification EOF ;
    public final void entryRuleClassIdentification() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:384:30: ( ruleClassIdentification EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:385:1: ruleClassIdentification EOF
            {
             before(grammarAccess.getClassIdentificationRule()); 
            pushFollow(FOLLOW_ruleClassIdentification_in_entryRuleClassIdentification780);
            ruleClassIdentification();
            _fsp--;

             after(grammarAccess.getClassIdentificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassIdentification787); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:392:1: ruleClassIdentification : ( ( rule__ClassIdentification__Group__0 ) ) ;
    public final void ruleClassIdentification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:396:2: ( ( ( rule__ClassIdentification__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:397:1: ( ( rule__ClassIdentification__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:397:1: ( ( rule__ClassIdentification__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:398:1: ( rule__ClassIdentification__Group__0 )
            {
             before(grammarAccess.getClassIdentificationAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:399:1: ( rule__ClassIdentification__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:399:2: rule__ClassIdentification__Group__0
            {
            pushFollow(FOLLOW_rule__ClassIdentification__Group__0_in_ruleClassIdentification814);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:411:1: entryRuleComments : ruleComments EOF ;
    public final void entryRuleComments() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:411:19: ( ruleComments EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:412:1: ruleComments EOF
            {
             before(grammarAccess.getCommentsRule()); 
            pushFollow(FOLLOW_ruleComments_in_entryRuleComments840);
            ruleComments();
            _fsp--;

             after(grammarAccess.getCommentsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComments847); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:419:1: ruleComments : ( ( rule__Comments__Group__0 ) ) ;
    public final void ruleComments() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:423:2: ( ( ( rule__Comments__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:424:1: ( ( rule__Comments__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:424:1: ( ( rule__Comments__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:425:1: ( rule__Comments__Group__0 )
            {
             before(grammarAccess.getCommentsAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:426:1: ( rule__Comments__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:426:2: rule__Comments__Group__0
            {
            pushFollow(FOLLOW_rule__Comments__Group__0_in_ruleComments874);
            rule__Comments__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCommentsAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start entryRulePreferences
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:438:1: entryRulePreferences : rulePreferences EOF ;
    public final void entryRulePreferences() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:438:22: ( rulePreferences EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:439:1: rulePreferences EOF
            {
             before(grammarAccess.getPreferencesRule()); 
            pushFollow(FOLLOW_rulePreferences_in_entryRulePreferences900);
            rulePreferences();
            _fsp--;

             after(grammarAccess.getPreferencesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePreferences907); 

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
    // $ANTLR end entryRulePreferences


    // $ANTLR start rulePreferences
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:446:1: rulePreferences : ( ( rule__Preferences__Group__0 ) ) ;
    public final void rulePreferences() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:450:2: ( ( ( rule__Preferences__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:451:1: ( ( rule__Preferences__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:451:1: ( ( rule__Preferences__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:452:1: ( rule__Preferences__Group__0 )
            {
             before(grammarAccess.getPreferencesAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:453:1: ( rule__Preferences__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:453:2: rule__Preferences__Group__0
            {
            pushFollow(FOLLOW_rule__Preferences__Group__0_in_rulePreferences934);
            rule__Preferences__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPreferencesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePreferences


    // $ANTLR start entryRuleState
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:465:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:465:16: ( ruleState EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:466:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState960);
            ruleState();
            _fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState967); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:473:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:477:2: ( ( ( rule__State__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:478:1: ( ( rule__State__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:478:1: ( ( rule__State__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:479:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:480:1: ( rule__State__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:480:2: rule__State__Group__0
            {
            pushFollow(FOLLOW_rule__State__Group__0_in_ruleState994);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:492:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:492:19: ( ruleProperty EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:493:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1020);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1027); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:500:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:504:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:505:1: ( ( rule__Property__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:505:1: ( ( rule__Property__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:506:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:507:1: ( rule__Property__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:507:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty1054);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:519:1: entryRulePropType : rulePropType EOF ;
    public final void entryRulePropType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:519:19: ( rulePropType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:520:1: rulePropType EOF
            {
             before(grammarAccess.getPropTypeRule()); 
            pushFollow(FOLLOW_rulePropType_in_entryRulePropType1080);
            rulePropType();
            _fsp--;

             after(grammarAccess.getPropTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropType1087); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:527:1: rulePropType : ( ( rule__PropType__Alternatives ) ) ;
    public final void rulePropType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:531:2: ( ( ( rule__PropType__Alternatives ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:532:1: ( ( rule__PropType__Alternatives ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:532:1: ( ( rule__PropType__Alternatives ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:533:1: ( rule__PropType__Alternatives )
            {
             before(grammarAccess.getPropTypeAccess().getAlternatives()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:534:1: ( rule__PropType__Alternatives )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:534:2: rule__PropType__Alternatives
            {
            pushFollow(FOLLOW_rule__PropType__Alternatives_in_rulePropType1114);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:546:1: entryRuleSimpleType : ruleSimpleType EOF ;
    public final void entryRuleSimpleType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:546:21: ( ruleSimpleType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:547:1: ruleSimpleType EOF
            {
             before(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType1140);
            ruleSimpleType();
            _fsp--;

             after(grammarAccess.getSimpleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType1147); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:554:1: ruleSimpleType : ( ( rule__SimpleType__Alternatives ) ) ;
    public final void ruleSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:558:2: ( ( ( rule__SimpleType__Alternatives ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:559:1: ( ( rule__SimpleType__Alternatives ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:559:1: ( ( rule__SimpleType__Alternatives ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:560:1: ( rule__SimpleType__Alternatives )
            {
             before(grammarAccess.getSimpleTypeAccess().getAlternatives()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:561:1: ( rule__SimpleType__Alternatives )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:561:2: rule__SimpleType__Alternatives
            {
            pushFollow(FOLLOW_rule__SimpleType__Alternatives_in_ruleSimpleType1174);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:573:1: entryRuleVectorType : ruleVectorType EOF ;
    public final void entryRuleVectorType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:573:21: ( ruleVectorType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:574:1: ruleVectorType EOF
            {
             before(grammarAccess.getVectorTypeRule()); 
            pushFollow(FOLLOW_ruleVectorType_in_entryRuleVectorType1200);
            ruleVectorType();
            _fsp--;

             after(grammarAccess.getVectorTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVectorType1207); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:581:1: ruleVectorType : ( ( rule__VectorType__Alternatives ) ) ;
    public final void ruleVectorType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:585:2: ( ( ( rule__VectorType__Alternatives ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:586:1: ( ( rule__VectorType__Alternatives ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:586:1: ( ( rule__VectorType__Alternatives ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:587:1: ( rule__VectorType__Alternatives )
            {
             before(grammarAccess.getVectorTypeAccess().getAlternatives()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:588:1: ( rule__VectorType__Alternatives )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:588:2: rule__VectorType__Alternatives
            {
            pushFollow(FOLLOW_rule__VectorType__Alternatives_in_ruleVectorType1234);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:600:1: entryRuleInheritanceStatus : ruleInheritanceStatus EOF ;
    public final void entryRuleInheritanceStatus() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:600:28: ( ruleInheritanceStatus EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:601:1: ruleInheritanceStatus EOF
            {
             before(grammarAccess.getInheritanceStatusRule()); 
            pushFollow(FOLLOW_ruleInheritanceStatus_in_entryRuleInheritanceStatus1260);
            ruleInheritanceStatus();
            _fsp--;

             after(grammarAccess.getInheritanceStatusRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInheritanceStatus1267); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:608:1: ruleInheritanceStatus : ( ( rule__InheritanceStatus__Group__0 ) ) ;
    public final void ruleInheritanceStatus() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:612:2: ( ( ( rule__InheritanceStatus__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:613:1: ( ( rule__InheritanceStatus__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:613:1: ( ( rule__InheritanceStatus__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:614:1: ( rule__InheritanceStatus__Group__0 )
            {
             before(grammarAccess.getInheritanceStatusAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:615:1: ( rule__InheritanceStatus__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:615:2: rule__InheritanceStatus__Group__0
            {
            pushFollow(FOLLOW_rule__InheritanceStatus__Group__0_in_ruleInheritanceStatus1294);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:627:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:627:18: ( ruleCommand EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:628:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand1320);
            ruleCommand();
            _fsp--;

             after(grammarAccess.getCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand1327); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:635:1: ruleCommand : ( ( rule__Command__Group__0 ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:639:2: ( ( ( rule__Command__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:640:1: ( ( rule__Command__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:640:1: ( ( rule__Command__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:641:1: ( rule__Command__Group__0 )
            {
             before(grammarAccess.getCommandAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:642:1: ( rule__Command__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:642:2: rule__Command__Group__0
            {
            pushFollow(FOLLOW_rule__Command__Group__0_in_ruleCommand1354);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:654:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:654:19: ( ruleArgument EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:655:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument1380);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getArgumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument1387); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:662:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:666:2: ( ( ( rule__Argument__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:667:1: ( ( rule__Argument__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:667:1: ( ( rule__Argument__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:668:1: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:669:1: ( rule__Argument__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:669:2: rule__Argument__Group__0
            {
            pushFollow(FOLLOW_rule__Argument__Group__0_in_ruleArgument1414);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:681:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:681:20: ( ruleAttribute EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:682:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1440);
            ruleAttribute();
            _fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1447); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:689:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:693:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:694:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:694:1: ( ( rule__Attribute__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:695:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:696:1: ( rule__Attribute__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:696:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute1474);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:708:1: entryRuleFireEvents : ruleFireEvents EOF ;
    public final void entryRuleFireEvents() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:708:21: ( ruleFireEvents EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:709:1: ruleFireEvents EOF
            {
             before(grammarAccess.getFireEventsRule()); 
            pushFollow(FOLLOW_ruleFireEvents_in_entryRuleFireEvents1500);
            ruleFireEvents();
            _fsp--;

             after(grammarAccess.getFireEventsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFireEvents1507); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:716:1: ruleFireEvents : ( ( rule__FireEvents__Group__0 ) ) ;
    public final void ruleFireEvents() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:720:2: ( ( ( rule__FireEvents__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:721:1: ( ( rule__FireEvents__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:721:1: ( ( rule__FireEvents__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:722:1: ( rule__FireEvents__Group__0 )
            {
             before(grammarAccess.getFireEventsAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:723:1: ( rule__FireEvents__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:723:2: rule__FireEvents__Group__0
            {
            pushFollow(FOLLOW_rule__FireEvents__Group__0_in_ruleFireEvents1534);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:735:1: entryRuleAttrProperties : ruleAttrProperties EOF ;
    public final void entryRuleAttrProperties() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:735:25: ( ruleAttrProperties EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:736:1: ruleAttrProperties EOF
            {
             before(grammarAccess.getAttrPropertiesRule()); 
            pushFollow(FOLLOW_ruleAttrProperties_in_entryRuleAttrProperties1560);
            ruleAttrProperties();
            _fsp--;

             after(grammarAccess.getAttrPropertiesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrProperties1567); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:743:1: ruleAttrProperties : ( ( rule__AttrProperties__Group__0 ) ) ;
    public final void ruleAttrProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:747:2: ( ( ( rule__AttrProperties__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:748:1: ( ( rule__AttrProperties__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:748:1: ( ( rule__AttrProperties__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:749:1: ( rule__AttrProperties__Group__0 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:750:1: ( rule__AttrProperties__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:750:2: rule__AttrProperties__Group__0
            {
            pushFollow(FOLLOW_rule__AttrProperties__Group__0_in_ruleAttrProperties1594);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:762:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:762:15: ( ruleType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:763:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1620);
            ruleType();
            _fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1627); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:770:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:774:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:775:1: ( ( rule__Type__Alternatives ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:775:1: ( ( rule__Type__Alternatives ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:776:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:777:1: ( rule__Type__Alternatives )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:777:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType1654);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:789:1: entryRuleVoidType : ruleVoidType EOF ;
    public final void entryRuleVoidType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:789:19: ( ruleVoidType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:790:1: ruleVoidType EOF
            {
             before(grammarAccess.getVoidTypeRule()); 
            pushFollow(FOLLOW_ruleVoidType_in_entryRuleVoidType1680);
            ruleVoidType();
            _fsp--;

             after(grammarAccess.getVoidTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVoidType1687); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:797:1: ruleVoidType : ( ( rule__VoidType__Group__0 ) ) ;
    public final void ruleVoidType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:801:2: ( ( ( rule__VoidType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:802:1: ( ( rule__VoidType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:802:1: ( ( rule__VoidType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:803:1: ( rule__VoidType__Group__0 )
            {
             before(grammarAccess.getVoidTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:804:1: ( rule__VoidType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:804:2: rule__VoidType__Group__0
            {
            pushFollow(FOLLOW_rule__VoidType__Group__0_in_ruleVoidType1714);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:816:1: entryRuleBooleanType : ruleBooleanType EOF ;
    public final void entryRuleBooleanType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:816:22: ( ruleBooleanType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:817:1: ruleBooleanType EOF
            {
             before(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanType_in_entryRuleBooleanType1740);
            ruleBooleanType();
            _fsp--;

             after(grammarAccess.getBooleanTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanType1747); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:824:1: ruleBooleanType : ( ( rule__BooleanType__Group__0 ) ) ;
    public final void ruleBooleanType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:828:2: ( ( ( rule__BooleanType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:829:1: ( ( rule__BooleanType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:829:1: ( ( rule__BooleanType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:830:1: ( rule__BooleanType__Group__0 )
            {
             before(grammarAccess.getBooleanTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:831:1: ( rule__BooleanType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:831:2: rule__BooleanType__Group__0
            {
            pushFollow(FOLLOW_rule__BooleanType__Group__0_in_ruleBooleanType1774);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:843:1: entryRuleShortType : ruleShortType EOF ;
    public final void entryRuleShortType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:843:20: ( ruleShortType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:844:1: ruleShortType EOF
            {
             before(grammarAccess.getShortTypeRule()); 
            pushFollow(FOLLOW_ruleShortType_in_entryRuleShortType1800);
            ruleShortType();
            _fsp--;

             after(grammarAccess.getShortTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortType1807); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:851:1: ruleShortType : ( ( rule__ShortType__Group__0 ) ) ;
    public final void ruleShortType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:855:2: ( ( ( rule__ShortType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:856:1: ( ( rule__ShortType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:856:1: ( ( rule__ShortType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:857:1: ( rule__ShortType__Group__0 )
            {
             before(grammarAccess.getShortTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:858:1: ( rule__ShortType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:858:2: rule__ShortType__Group__0
            {
            pushFollow(FOLLOW_rule__ShortType__Group__0_in_ruleShortType1834);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:870:1: entryRuleUShortType : ruleUShortType EOF ;
    public final void entryRuleUShortType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:870:21: ( ruleUShortType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:871:1: ruleUShortType EOF
            {
             before(grammarAccess.getUShortTypeRule()); 
            pushFollow(FOLLOW_ruleUShortType_in_entryRuleUShortType1860);
            ruleUShortType();
            _fsp--;

             after(grammarAccess.getUShortTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUShortType1867); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:878:1: ruleUShortType : ( ( rule__UShortType__Group__0 ) ) ;
    public final void ruleUShortType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:882:2: ( ( ( rule__UShortType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:883:1: ( ( rule__UShortType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:883:1: ( ( rule__UShortType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:884:1: ( rule__UShortType__Group__0 )
            {
             before(grammarAccess.getUShortTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:885:1: ( rule__UShortType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:885:2: rule__UShortType__Group__0
            {
            pushFollow(FOLLOW_rule__UShortType__Group__0_in_ruleUShortType1894);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:897:1: entryRuleIntType : ruleIntType EOF ;
    public final void entryRuleIntType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:897:18: ( ruleIntType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:898:1: ruleIntType EOF
            {
             before(grammarAccess.getIntTypeRule()); 
            pushFollow(FOLLOW_ruleIntType_in_entryRuleIntType1920);
            ruleIntType();
            _fsp--;

             after(grammarAccess.getIntTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntType1927); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:905:1: ruleIntType : ( ( rule__IntType__Group__0 ) ) ;
    public final void ruleIntType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:909:2: ( ( ( rule__IntType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:910:1: ( ( rule__IntType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:910:1: ( ( rule__IntType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:911:1: ( rule__IntType__Group__0 )
            {
             before(grammarAccess.getIntTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:912:1: ( rule__IntType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:912:2: rule__IntType__Group__0
            {
            pushFollow(FOLLOW_rule__IntType__Group__0_in_ruleIntType1954);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:924:1: entryRuleUIntType : ruleUIntType EOF ;
    public final void entryRuleUIntType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:924:19: ( ruleUIntType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:925:1: ruleUIntType EOF
            {
             before(grammarAccess.getUIntTypeRule()); 
            pushFollow(FOLLOW_ruleUIntType_in_entryRuleUIntType1980);
            ruleUIntType();
            _fsp--;

             after(grammarAccess.getUIntTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIntType1987); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:932:1: ruleUIntType : ( ( rule__UIntType__Group__0 ) ) ;
    public final void ruleUIntType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:936:2: ( ( ( rule__UIntType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:937:1: ( ( rule__UIntType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:937:1: ( ( rule__UIntType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:938:1: ( rule__UIntType__Group__0 )
            {
             before(grammarAccess.getUIntTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:939:1: ( rule__UIntType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:939:2: rule__UIntType__Group__0
            {
            pushFollow(FOLLOW_rule__UIntType__Group__0_in_ruleUIntType2014);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:951:1: entryRuleFloatType : ruleFloatType EOF ;
    public final void entryRuleFloatType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:951:20: ( ruleFloatType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:952:1: ruleFloatType EOF
            {
             before(grammarAccess.getFloatTypeRule()); 
            pushFollow(FOLLOW_ruleFloatType_in_entryRuleFloatType2040);
            ruleFloatType();
            _fsp--;

             after(grammarAccess.getFloatTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatType2047); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:959:1: ruleFloatType : ( ( rule__FloatType__Group__0 ) ) ;
    public final void ruleFloatType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:963:2: ( ( ( rule__FloatType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:964:1: ( ( rule__FloatType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:964:1: ( ( rule__FloatType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:965:1: ( rule__FloatType__Group__0 )
            {
             before(grammarAccess.getFloatTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:966:1: ( rule__FloatType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:966:2: rule__FloatType__Group__0
            {
            pushFollow(FOLLOW_rule__FloatType__Group__0_in_ruleFloatType2074);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:978:1: entryRuleDoubleType : ruleDoubleType EOF ;
    public final void entryRuleDoubleType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:978:21: ( ruleDoubleType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:979:1: ruleDoubleType EOF
            {
             before(grammarAccess.getDoubleTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleType_in_entryRuleDoubleType2100);
            ruleDoubleType();
            _fsp--;

             after(grammarAccess.getDoubleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleType2107); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:986:1: ruleDoubleType : ( ( rule__DoubleType__Group__0 ) ) ;
    public final void ruleDoubleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:990:2: ( ( ( rule__DoubleType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:991:1: ( ( rule__DoubleType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:991:1: ( ( rule__DoubleType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:992:1: ( rule__DoubleType__Group__0 )
            {
             before(grammarAccess.getDoubleTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:993:1: ( rule__DoubleType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:993:2: rule__DoubleType__Group__0
            {
            pushFollow(FOLLOW_rule__DoubleType__Group__0_in_ruleDoubleType2134);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1005:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1005:21: ( ruleStringType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1006:1: ruleStringType EOF
            {
             before(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType2160);
            ruleStringType();
            _fsp--;

             after(grammarAccess.getStringTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType2167); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1013:1: ruleStringType : ( ( rule__StringType__Group__0 ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1017:2: ( ( ( rule__StringType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1018:1: ( ( rule__StringType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1018:1: ( ( rule__StringType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1019:1: ( rule__StringType__Group__0 )
            {
             before(grammarAccess.getStringTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1020:1: ( rule__StringType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1020:2: rule__StringType__Group__0
            {
            pushFollow(FOLLOW_rule__StringType__Group__0_in_ruleStringType2194);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1032:1: entryRuleCharArrayType : ruleCharArrayType EOF ;
    public final void entryRuleCharArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1032:24: ( ruleCharArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1033:1: ruleCharArrayType EOF
            {
             before(grammarAccess.getCharArrayTypeRule()); 
            pushFollow(FOLLOW_ruleCharArrayType_in_entryRuleCharArrayType2220);
            ruleCharArrayType();
            _fsp--;

             after(grammarAccess.getCharArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharArrayType2227); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1040:1: ruleCharArrayType : ( ( rule__CharArrayType__Group__0 ) ) ;
    public final void ruleCharArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1044:2: ( ( ( rule__CharArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1045:1: ( ( rule__CharArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1045:1: ( ( rule__CharArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1046:1: ( rule__CharArrayType__Group__0 )
            {
             before(grammarAccess.getCharArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1047:1: ( rule__CharArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1047:2: rule__CharArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__CharArrayType__Group__0_in_ruleCharArrayType2254);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1059:1: entryRuleShortArrayType : ruleShortArrayType EOF ;
    public final void entryRuleShortArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1059:25: ( ruleShortArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1060:1: ruleShortArrayType EOF
            {
             before(grammarAccess.getShortArrayTypeRule()); 
            pushFollow(FOLLOW_ruleShortArrayType_in_entryRuleShortArrayType2280);
            ruleShortArrayType();
            _fsp--;

             after(grammarAccess.getShortArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortArrayType2287); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1067:1: ruleShortArrayType : ( ( rule__ShortArrayType__Group__0 ) ) ;
    public final void ruleShortArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1071:2: ( ( ( rule__ShortArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1072:1: ( ( rule__ShortArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1072:1: ( ( rule__ShortArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1073:1: ( rule__ShortArrayType__Group__0 )
            {
             before(grammarAccess.getShortArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1074:1: ( rule__ShortArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1074:2: rule__ShortArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__ShortArrayType__Group__0_in_ruleShortArrayType2314);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1086:1: entryRuleUShortArrayType : ruleUShortArrayType EOF ;
    public final void entryRuleUShortArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1086:26: ( ruleUShortArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1087:1: ruleUShortArrayType EOF
            {
             before(grammarAccess.getUShortArrayTypeRule()); 
            pushFollow(FOLLOW_ruleUShortArrayType_in_entryRuleUShortArrayType2340);
            ruleUShortArrayType();
            _fsp--;

             after(grammarAccess.getUShortArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUShortArrayType2347); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1094:1: ruleUShortArrayType : ( ( rule__UShortArrayType__Group__0 ) ) ;
    public final void ruleUShortArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1098:2: ( ( ( rule__UShortArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1099:1: ( ( rule__UShortArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1099:1: ( ( rule__UShortArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1100:1: ( rule__UShortArrayType__Group__0 )
            {
             before(grammarAccess.getUShortArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1101:1: ( rule__UShortArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1101:2: rule__UShortArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__UShortArrayType__Group__0_in_ruleUShortArrayType2374);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1113:1: entryRuleIntArrayType : ruleIntArrayType EOF ;
    public final void entryRuleIntArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1113:23: ( ruleIntArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1114:1: ruleIntArrayType EOF
            {
             before(grammarAccess.getIntArrayTypeRule()); 
            pushFollow(FOLLOW_ruleIntArrayType_in_entryRuleIntArrayType2400);
            ruleIntArrayType();
            _fsp--;

             after(grammarAccess.getIntArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntArrayType2407); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1121:1: ruleIntArrayType : ( ( rule__IntArrayType__Group__0 ) ) ;
    public final void ruleIntArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1125:2: ( ( ( rule__IntArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1126:1: ( ( rule__IntArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1126:1: ( ( rule__IntArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1127:1: ( rule__IntArrayType__Group__0 )
            {
             before(grammarAccess.getIntArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1128:1: ( rule__IntArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1128:2: rule__IntArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__IntArrayType__Group__0_in_ruleIntArrayType2434);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1140:1: entryRuleUIntArrayType : ruleUIntArrayType EOF ;
    public final void entryRuleUIntArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1140:24: ( ruleUIntArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1141:1: ruleUIntArrayType EOF
            {
             before(grammarAccess.getUIntArrayTypeRule()); 
            pushFollow(FOLLOW_ruleUIntArrayType_in_entryRuleUIntArrayType2460);
            ruleUIntArrayType();
            _fsp--;

             after(grammarAccess.getUIntArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIntArrayType2467); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1148:1: ruleUIntArrayType : ( ( rule__UIntArrayType__Group__0 ) ) ;
    public final void ruleUIntArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1152:2: ( ( ( rule__UIntArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1153:1: ( ( rule__UIntArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1153:1: ( ( rule__UIntArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1154:1: ( rule__UIntArrayType__Group__0 )
            {
             before(grammarAccess.getUIntArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1155:1: ( rule__UIntArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1155:2: rule__UIntArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__UIntArrayType__Group__0_in_ruleUIntArrayType2494);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1167:1: entryRuleFloatArrayType : ruleFloatArrayType EOF ;
    public final void entryRuleFloatArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1167:25: ( ruleFloatArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1168:1: ruleFloatArrayType EOF
            {
             before(grammarAccess.getFloatArrayTypeRule()); 
            pushFollow(FOLLOW_ruleFloatArrayType_in_entryRuleFloatArrayType2520);
            ruleFloatArrayType();
            _fsp--;

             after(grammarAccess.getFloatArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatArrayType2527); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1175:1: ruleFloatArrayType : ( ( rule__FloatArrayType__Group__0 ) ) ;
    public final void ruleFloatArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1179:2: ( ( ( rule__FloatArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1180:1: ( ( rule__FloatArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1180:1: ( ( rule__FloatArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1181:1: ( rule__FloatArrayType__Group__0 )
            {
             before(grammarAccess.getFloatArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1182:1: ( rule__FloatArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1182:2: rule__FloatArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__FloatArrayType__Group__0_in_ruleFloatArrayType2554);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1194:1: entryRuleDoubleArrayType : ruleDoubleArrayType EOF ;
    public final void entryRuleDoubleArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1194:26: ( ruleDoubleArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1195:1: ruleDoubleArrayType EOF
            {
             before(grammarAccess.getDoubleArrayTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleArrayType_in_entryRuleDoubleArrayType2580);
            ruleDoubleArrayType();
            _fsp--;

             after(grammarAccess.getDoubleArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleArrayType2587); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1202:1: ruleDoubleArrayType : ( ( rule__DoubleArrayType__Group__0 ) ) ;
    public final void ruleDoubleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1206:2: ( ( ( rule__DoubleArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1207:1: ( ( rule__DoubleArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1207:1: ( ( rule__DoubleArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1208:1: ( rule__DoubleArrayType__Group__0 )
            {
             before(grammarAccess.getDoubleArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1209:1: ( rule__DoubleArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1209:2: rule__DoubleArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__DoubleArrayType__Group__0_in_ruleDoubleArrayType2614);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1221:1: entryRuleStringArrayType : ruleStringArrayType EOF ;
    public final void entryRuleStringArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1221:26: ( ruleStringArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1222:1: ruleStringArrayType EOF
            {
             before(grammarAccess.getStringArrayTypeRule()); 
            pushFollow(FOLLOW_ruleStringArrayType_in_entryRuleStringArrayType2640);
            ruleStringArrayType();
            _fsp--;

             after(grammarAccess.getStringArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringArrayType2647); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1229:1: ruleStringArrayType : ( ( rule__StringArrayType__Group__0 ) ) ;
    public final void ruleStringArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1233:2: ( ( ( rule__StringArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1234:1: ( ( rule__StringArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1234:1: ( ( rule__StringArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1235:1: ( rule__StringArrayType__Group__0 )
            {
             before(grammarAccess.getStringArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1236:1: ( rule__StringArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1236:2: rule__StringArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__StringArrayType__Group__0_in_ruleStringArrayType2674);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1248:1: entryRuleLongStringArrayType : ruleLongStringArrayType EOF ;
    public final void entryRuleLongStringArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1248:30: ( ruleLongStringArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1249:1: ruleLongStringArrayType EOF
            {
             before(grammarAccess.getLongStringArrayTypeRule()); 
            pushFollow(FOLLOW_ruleLongStringArrayType_in_entryRuleLongStringArrayType2700);
            ruleLongStringArrayType();
            _fsp--;

             after(grammarAccess.getLongStringArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongStringArrayType2707); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1256:1: ruleLongStringArrayType : ( ( rule__LongStringArrayType__Group__0 ) ) ;
    public final void ruleLongStringArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1260:2: ( ( ( rule__LongStringArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1261:1: ( ( rule__LongStringArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1261:1: ( ( rule__LongStringArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1262:1: ( rule__LongStringArrayType__Group__0 )
            {
             before(grammarAccess.getLongStringArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1263:1: ( rule__LongStringArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1263:2: rule__LongStringArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__LongStringArrayType__Group__0_in_ruleLongStringArrayType2734);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1275:1: entryRuleDoubleStringArrayType : ruleDoubleStringArrayType EOF ;
    public final void entryRuleDoubleStringArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1275:32: ( ruleDoubleStringArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1276:1: ruleDoubleStringArrayType EOF
            {
             before(grammarAccess.getDoubleStringArrayTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleStringArrayType_in_entryRuleDoubleStringArrayType2760);
            ruleDoubleStringArrayType();
            _fsp--;

             after(grammarAccess.getDoubleStringArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleStringArrayType2767); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1283:1: ruleDoubleStringArrayType : ( ( rule__DoubleStringArrayType__Group__0 ) ) ;
    public final void ruleDoubleStringArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1287:2: ( ( ( rule__DoubleStringArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1288:1: ( ( rule__DoubleStringArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1288:1: ( ( rule__DoubleStringArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1289:1: ( rule__DoubleStringArrayType__Group__0 )
            {
             before(grammarAccess.getDoubleStringArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1290:1: ( rule__DoubleStringArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1290:2: rule__DoubleStringArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__DoubleStringArrayType__Group__0_in_ruleDoubleStringArrayType2794);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1302:1: entryRuleStateType : ruleStateType EOF ;
    public final void entryRuleStateType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1302:20: ( ruleStateType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1303:1: ruleStateType EOF
            {
             before(grammarAccess.getStateTypeRule()); 
            pushFollow(FOLLOW_ruleStateType_in_entryRuleStateType2820);
            ruleStateType();
            _fsp--;

             after(grammarAccess.getStateTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateType2827); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1310:1: ruleStateType : ( ( rule__StateType__Group__0 ) ) ;
    public final void ruleStateType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1314:2: ( ( ( rule__StateType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1315:1: ( ( rule__StateType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1315:1: ( ( rule__StateType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1316:1: ( rule__StateType__Group__0 )
            {
             before(grammarAccess.getStateTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1317:1: ( rule__StateType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1317:2: rule__StateType__Group__0
            {
            pushFollow(FOLLOW_rule__StateType__Group__0_in_ruleStateType2854);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1329:1: entryRuleConstStringType : ruleConstStringType EOF ;
    public final void entryRuleConstStringType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1329:26: ( ruleConstStringType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1330:1: ruleConstStringType EOF
            {
             before(grammarAccess.getConstStringTypeRule()); 
            pushFollow(FOLLOW_ruleConstStringType_in_entryRuleConstStringType2880);
            ruleConstStringType();
            _fsp--;

             after(grammarAccess.getConstStringTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstStringType2887); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1337:1: ruleConstStringType : ( ( rule__ConstStringType__Group__0 ) ) ;
    public final void ruleConstStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1341:2: ( ( ( rule__ConstStringType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1342:1: ( ( rule__ConstStringType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1342:1: ( ( rule__ConstStringType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1343:1: ( rule__ConstStringType__Group__0 )
            {
             before(grammarAccess.getConstStringTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1344:1: ( rule__ConstStringType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1344:2: rule__ConstStringType__Group__0
            {
            pushFollow(FOLLOW_rule__ConstStringType__Group__0_in_ruleConstStringType2914);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1356:1: entryRuleBooleanArrayType : ruleBooleanArrayType EOF ;
    public final void entryRuleBooleanArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1356:27: ( ruleBooleanArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1357:1: ruleBooleanArrayType EOF
            {
             before(grammarAccess.getBooleanArrayTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanArrayType_in_entryRuleBooleanArrayType2940);
            ruleBooleanArrayType();
            _fsp--;

             after(grammarAccess.getBooleanArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanArrayType2947); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1364:1: ruleBooleanArrayType : ( ( rule__BooleanArrayType__Group__0 ) ) ;
    public final void ruleBooleanArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1368:2: ( ( ( rule__BooleanArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1369:1: ( ( rule__BooleanArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1369:1: ( ( rule__BooleanArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1370:1: ( rule__BooleanArrayType__Group__0 )
            {
             before(grammarAccess.getBooleanArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1371:1: ( rule__BooleanArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1371:2: rule__BooleanArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__BooleanArrayType__Group__0_in_ruleBooleanArrayType2974);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1383:1: entryRuleUCharType : ruleUCharType EOF ;
    public final void entryRuleUCharType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1383:20: ( ruleUCharType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1384:1: ruleUCharType EOF
            {
             before(grammarAccess.getUCharTypeRule()); 
            pushFollow(FOLLOW_ruleUCharType_in_entryRuleUCharType3000);
            ruleUCharType();
            _fsp--;

             after(grammarAccess.getUCharTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUCharType3007); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1391:1: ruleUCharType : ( ( rule__UCharType__Group__0 ) ) ;
    public final void ruleUCharType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1395:2: ( ( ( rule__UCharType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1396:1: ( ( rule__UCharType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1396:1: ( ( rule__UCharType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1397:1: ( rule__UCharType__Group__0 )
            {
             before(grammarAccess.getUCharTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1398:1: ( rule__UCharType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1398:2: rule__UCharType__Group__0
            {
            pushFollow(FOLLOW_rule__UCharType__Group__0_in_ruleUCharType3034);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1410:1: entryRuleLongType : ruleLongType EOF ;
    public final void entryRuleLongType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1410:19: ( ruleLongType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1411:1: ruleLongType EOF
            {
             before(grammarAccess.getLongTypeRule()); 
            pushFollow(FOLLOW_ruleLongType_in_entryRuleLongType3060);
            ruleLongType();
            _fsp--;

             after(grammarAccess.getLongTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongType3067); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1418:1: ruleLongType : ( ( rule__LongType__Group__0 ) ) ;
    public final void ruleLongType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1422:2: ( ( ( rule__LongType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1423:1: ( ( rule__LongType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1423:1: ( ( rule__LongType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1424:1: ( rule__LongType__Group__0 )
            {
             before(grammarAccess.getLongTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1425:1: ( rule__LongType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1425:2: rule__LongType__Group__0
            {
            pushFollow(FOLLOW_rule__LongType__Group__0_in_ruleLongType3094);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1437:1: entryRuleULongType : ruleULongType EOF ;
    public final void entryRuleULongType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1437:20: ( ruleULongType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1438:1: ruleULongType EOF
            {
             before(grammarAccess.getULongTypeRule()); 
            pushFollow(FOLLOW_ruleULongType_in_entryRuleULongType3120);
            ruleULongType();
            _fsp--;

             after(grammarAccess.getULongTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleULongType3127); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1445:1: ruleULongType : ( ( rule__ULongType__Group__0 ) ) ;
    public final void ruleULongType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1449:2: ( ( ( rule__ULongType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1450:1: ( ( rule__ULongType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1450:1: ( ( rule__ULongType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1451:1: ( rule__ULongType__Group__0 )
            {
             before(grammarAccess.getULongTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1452:1: ( rule__ULongType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1452:2: rule__ULongType__Group__0
            {
            pushFollow(FOLLOW_rule__ULongType__Group__0_in_ruleULongType3154);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1464:1: entryRuleLongArrayType : ruleLongArrayType EOF ;
    public final void entryRuleLongArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1464:24: ( ruleLongArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1465:1: ruleLongArrayType EOF
            {
             before(grammarAccess.getLongArrayTypeRule()); 
            pushFollow(FOLLOW_ruleLongArrayType_in_entryRuleLongArrayType3180);
            ruleLongArrayType();
            _fsp--;

             after(grammarAccess.getLongArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongArrayType3187); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1472:1: ruleLongArrayType : ( ( rule__LongArrayType__Group__0 ) ) ;
    public final void ruleLongArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1476:2: ( ( ( rule__LongArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1477:1: ( ( rule__LongArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1477:1: ( ( rule__LongArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1478:1: ( rule__LongArrayType__Group__0 )
            {
             before(grammarAccess.getLongArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1479:1: ( rule__LongArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1479:2: rule__LongArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__LongArrayType__Group__0_in_ruleLongArrayType3214);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1491:1: entryRuleULongArrayType : ruleULongArrayType EOF ;
    public final void entryRuleULongArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1491:25: ( ruleULongArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1492:1: ruleULongArrayType EOF
            {
             before(grammarAccess.getULongArrayTypeRule()); 
            pushFollow(FOLLOW_ruleULongArrayType_in_entryRuleULongArrayType3240);
            ruleULongArrayType();
            _fsp--;

             after(grammarAccess.getULongArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleULongArrayType3247); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1499:1: ruleULongArrayType : ( ( rule__ULongArrayType__Group__0 ) ) ;
    public final void ruleULongArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1503:2: ( ( ( rule__ULongArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1504:1: ( ( rule__ULongArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1504:1: ( ( rule__ULongArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1505:1: ( rule__ULongArrayType__Group__0 )
            {
             before(grammarAccess.getULongArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1506:1: ( rule__ULongArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1506:2: rule__ULongArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__ULongArrayType__Group__0_in_ruleULongArrayType3274);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1518:1: entryRuleDevIntType : ruleDevIntType EOF ;
    public final void entryRuleDevIntType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1518:21: ( ruleDevIntType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1519:1: ruleDevIntType EOF
            {
             before(grammarAccess.getDevIntTypeRule()); 
            pushFollow(FOLLOW_ruleDevIntType_in_entryRuleDevIntType3300);
            ruleDevIntType();
            _fsp--;

             after(grammarAccess.getDevIntTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDevIntType3307); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1526:1: ruleDevIntType : ( ( rule__DevIntType__Group__0 ) ) ;
    public final void ruleDevIntType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1530:2: ( ( ( rule__DevIntType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1531:1: ( ( rule__DevIntType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1531:1: ( ( rule__DevIntType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1532:1: ( rule__DevIntType__Group__0 )
            {
             before(grammarAccess.getDevIntTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1533:1: ( rule__DevIntType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1533:2: rule__DevIntType__Group__0
            {
            pushFollow(FOLLOW_rule__DevIntType__Group__0_in_ruleDevIntType3334);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1545:1: entryRuleEncodedType : ruleEncodedType EOF ;
    public final void entryRuleEncodedType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1545:22: ( ruleEncodedType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1546:1: ruleEncodedType EOF
            {
             before(grammarAccess.getEncodedTypeRule()); 
            pushFollow(FOLLOW_ruleEncodedType_in_entryRuleEncodedType3360);
            ruleEncodedType();
            _fsp--;

             after(grammarAccess.getEncodedTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEncodedType3367); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1553:1: ruleEncodedType : ( ( rule__EncodedType__Group__0 ) ) ;
    public final void ruleEncodedType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1557:2: ( ( ( rule__EncodedType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1558:1: ( ( rule__EncodedType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1558:1: ( ( rule__EncodedType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1559:1: ( rule__EncodedType__Group__0 )
            {
             before(grammarAccess.getEncodedTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1560:1: ( rule__EncodedType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1560:2: rule__EncodedType__Group__0
            {
            pushFollow(FOLLOW_rule__EncodedType__Group__0_in_ruleEncodedType3394);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1572:1: entryRuleShortVectorType : ruleShortVectorType EOF ;
    public final void entryRuleShortVectorType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1572:26: ( ruleShortVectorType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1573:1: ruleShortVectorType EOF
            {
             before(grammarAccess.getShortVectorTypeRule()); 
            pushFollow(FOLLOW_ruleShortVectorType_in_entryRuleShortVectorType3420);
            ruleShortVectorType();
            _fsp--;

             after(grammarAccess.getShortVectorTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortVectorType3427); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1580:1: ruleShortVectorType : ( ( rule__ShortVectorType__Group__0 ) ) ;
    public final void ruleShortVectorType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1584:2: ( ( ( rule__ShortVectorType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1585:1: ( ( rule__ShortVectorType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1585:1: ( ( rule__ShortVectorType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1586:1: ( rule__ShortVectorType__Group__0 )
            {
             before(grammarAccess.getShortVectorTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1587:1: ( rule__ShortVectorType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1587:2: rule__ShortVectorType__Group__0
            {
            pushFollow(FOLLOW_rule__ShortVectorType__Group__0_in_ruleShortVectorType3454);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1599:1: entryRuleIntVectorType : ruleIntVectorType EOF ;
    public final void entryRuleIntVectorType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1599:24: ( ruleIntVectorType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1600:1: ruleIntVectorType EOF
            {
             before(grammarAccess.getIntVectorTypeRule()); 
            pushFollow(FOLLOW_ruleIntVectorType_in_entryRuleIntVectorType3480);
            ruleIntVectorType();
            _fsp--;

             after(grammarAccess.getIntVectorTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntVectorType3487); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1607:1: ruleIntVectorType : ( ( rule__IntVectorType__Group__0 ) ) ;
    public final void ruleIntVectorType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1611:2: ( ( ( rule__IntVectorType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1612:1: ( ( rule__IntVectorType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1612:1: ( ( rule__IntVectorType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1613:1: ( rule__IntVectorType__Group__0 )
            {
             before(grammarAccess.getIntVectorTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1614:1: ( rule__IntVectorType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1614:2: rule__IntVectorType__Group__0
            {
            pushFollow(FOLLOW_rule__IntVectorType__Group__0_in_ruleIntVectorType3514);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1626:1: entryRuleFloatVectorType : ruleFloatVectorType EOF ;
    public final void entryRuleFloatVectorType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1626:26: ( ruleFloatVectorType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1627:1: ruleFloatVectorType EOF
            {
             before(grammarAccess.getFloatVectorTypeRule()); 
            pushFollow(FOLLOW_ruleFloatVectorType_in_entryRuleFloatVectorType3540);
            ruleFloatVectorType();
            _fsp--;

             after(grammarAccess.getFloatVectorTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatVectorType3547); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1634:1: ruleFloatVectorType : ( ( rule__FloatVectorType__Group__0 ) ) ;
    public final void ruleFloatVectorType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1638:2: ( ( ( rule__FloatVectorType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1639:1: ( ( rule__FloatVectorType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1639:1: ( ( rule__FloatVectorType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1640:1: ( rule__FloatVectorType__Group__0 )
            {
             before(grammarAccess.getFloatVectorTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1641:1: ( rule__FloatVectorType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1641:2: rule__FloatVectorType__Group__0
            {
            pushFollow(FOLLOW_rule__FloatVectorType__Group__0_in_ruleFloatVectorType3574);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1653:1: entryRuleDoubleVectorType : ruleDoubleVectorType EOF ;
    public final void entryRuleDoubleVectorType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1653:27: ( ruleDoubleVectorType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1654:1: ruleDoubleVectorType EOF
            {
             before(grammarAccess.getDoubleVectorTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleVectorType_in_entryRuleDoubleVectorType3600);
            ruleDoubleVectorType();
            _fsp--;

             after(grammarAccess.getDoubleVectorTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleVectorType3607); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1661:1: ruleDoubleVectorType : ( ( rule__DoubleVectorType__Group__0 ) ) ;
    public final void ruleDoubleVectorType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1665:2: ( ( ( rule__DoubleVectorType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1666:1: ( ( rule__DoubleVectorType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1666:1: ( ( rule__DoubleVectorType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1667:1: ( rule__DoubleVectorType__Group__0 )
            {
             before(grammarAccess.getDoubleVectorTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1668:1: ( rule__DoubleVectorType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1668:2: rule__DoubleVectorType__Group__0
            {
            pushFollow(FOLLOW_rule__DoubleVectorType__Group__0_in_ruleDoubleVectorType3634);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1680:1: entryRuleStringVectorType : ruleStringVectorType EOF ;
    public final void entryRuleStringVectorType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1680:27: ( ruleStringVectorType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1681:1: ruleStringVectorType EOF
            {
             before(grammarAccess.getStringVectorTypeRule()); 
            pushFollow(FOLLOW_ruleStringVectorType_in_entryRuleStringVectorType3660);
            ruleStringVectorType();
            _fsp--;

             after(grammarAccess.getStringVectorTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringVectorType3667); 

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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1688:1: ruleStringVectorType : ( ( rule__StringVectorType__Group__0 ) ) ;
    public final void ruleStringVectorType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1692:2: ( ( ( rule__StringVectorType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1693:1: ( ( rule__StringVectorType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1693:1: ( ( rule__StringVectorType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1694:1: ( rule__StringVectorType__Group__0 )
            {
             before(grammarAccess.getStringVectorTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1695:1: ( rule__StringVectorType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1695:2: rule__StringVectorType__Group__0
            {
            pushFollow(FOLLOW_rule__StringVectorType__Group__0_in_ruleStringVectorType3694);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1707:1: rule__Language__Alternatives : ( ( 'Cpp' ) | ( 'Java' ) | ( 'Python' ) );
    public final void rule__Language__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1711:1: ( ( 'Cpp' ) | ( 'Java' ) | ( 'Python' ) )
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
                    new NoViableAltException("1707:1: rule__Language__Alternatives : ( ( 'Cpp' ) | ( 'Java' ) | ( 'Python' ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1712:1: ( 'Cpp' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1712:1: ( 'Cpp' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1713:1: 'Cpp'
                    {
                     before(grammarAccess.getLanguageAccess().getCppKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Language__Alternatives3731); 
                     after(grammarAccess.getLanguageAccess().getCppKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1720:6: ( 'Java' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1720:6: ( 'Java' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1721:1: 'Java'
                    {
                     before(grammarAccess.getLanguageAccess().getJavaKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Language__Alternatives3751); 
                     after(grammarAccess.getLanguageAccess().getJavaKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1728:6: ( 'Python' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1728:6: ( 'Python' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1729:1: 'Python'
                    {
                     before(grammarAccess.getLanguageAccess().getPythonKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__Language__Alternatives3771); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1741:1: rule__DisplayLevel__Alternatives : ( ( 'OPERATOR' ) | ( 'EXPERT' ) );
    public final void rule__DisplayLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1745:1: ( ( 'OPERATOR' ) | ( 'EXPERT' ) )
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
                    new NoViableAltException("1741:1: rule__DisplayLevel__Alternatives : ( ( 'OPERATOR' ) | ( 'EXPERT' ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1746:1: ( 'OPERATOR' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1746:1: ( 'OPERATOR' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1747:1: 'OPERATOR'
                    {
                     before(grammarAccess.getDisplayLevelAccess().getOPERATORKeyword_0()); 
                    match(input,14,FOLLOW_14_in_rule__DisplayLevel__Alternatives3806); 
                     after(grammarAccess.getDisplayLevelAccess().getOPERATORKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1754:6: ( 'EXPERT' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1754:6: ( 'EXPERT' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1755:1: 'EXPERT'
                    {
                     before(grammarAccess.getDisplayLevelAccess().getEXPERTKeyword_1()); 
                    match(input,15,FOLLOW_15_in_rule__DisplayLevel__Alternatives3826); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1767:1: rule__AttrType__Alternatives : ( ( 'Scalar' ) | ( 'Spectrum' ) | ( 'Image' ) );
    public final void rule__AttrType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1771:1: ( ( 'Scalar' ) | ( 'Spectrum' ) | ( 'Image' ) )
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
                    new NoViableAltException("1767:1: rule__AttrType__Alternatives : ( ( 'Scalar' ) | ( 'Spectrum' ) | ( 'Image' ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1772:1: ( 'Scalar' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1772:1: ( 'Scalar' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1773:1: 'Scalar'
                    {
                     before(grammarAccess.getAttrTypeAccess().getScalarKeyword_0()); 
                    match(input,16,FOLLOW_16_in_rule__AttrType__Alternatives3861); 
                     after(grammarAccess.getAttrTypeAccess().getScalarKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1780:6: ( 'Spectrum' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1780:6: ( 'Spectrum' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1781:1: 'Spectrum'
                    {
                     before(grammarAccess.getAttrTypeAccess().getSpectrumKeyword_1()); 
                    match(input,17,FOLLOW_17_in_rule__AttrType__Alternatives3881); 
                     after(grammarAccess.getAttrTypeAccess().getSpectrumKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1788:6: ( 'Image' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1788:6: ( 'Image' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1789:1: 'Image'
                    {
                     before(grammarAccess.getAttrTypeAccess().getImageKeyword_2()); 
                    match(input,18,FOLLOW_18_in_rule__AttrType__Alternatives3901); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1801:1: rule__RW_Type__Alternatives : ( ( 'READ' ) | ( 'WRITE' ) | ( 'READ_WRITE' ) | ( 'READ_WITH_WRITE' ) );
    public final void rule__RW_Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1805:1: ( ( 'READ' ) | ( 'WRITE' ) | ( 'READ_WRITE' ) | ( 'READ_WITH_WRITE' ) )
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
                    new NoViableAltException("1801:1: rule__RW_Type__Alternatives : ( ( 'READ' ) | ( 'WRITE' ) | ( 'READ_WRITE' ) | ( 'READ_WITH_WRITE' ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1806:1: ( 'READ' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1806:1: ( 'READ' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1807:1: 'READ'
                    {
                     before(grammarAccess.getRW_TypeAccess().getREADKeyword_0()); 
                    match(input,19,FOLLOW_19_in_rule__RW_Type__Alternatives3936); 
                     after(grammarAccess.getRW_TypeAccess().getREADKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1814:6: ( 'WRITE' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1814:6: ( 'WRITE' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1815:1: 'WRITE'
                    {
                     before(grammarAccess.getRW_TypeAccess().getWRITEKeyword_1()); 
                    match(input,20,FOLLOW_20_in_rule__RW_Type__Alternatives3956); 
                     after(grammarAccess.getRW_TypeAccess().getWRITEKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1822:6: ( 'READ_WRITE' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1822:6: ( 'READ_WRITE' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1823:1: 'READ_WRITE'
                    {
                     before(grammarAccess.getRW_TypeAccess().getREAD_WRITEKeyword_2()); 
                    match(input,21,FOLLOW_21_in_rule__RW_Type__Alternatives3976); 
                     after(grammarAccess.getRW_TypeAccess().getREAD_WRITEKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1830:6: ( 'READ_WITH_WRITE' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1830:6: ( 'READ_WITH_WRITE' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1831:1: 'READ_WITH_WRITE'
                    {
                     before(grammarAccess.getRW_TypeAccess().getREAD_WITH_WRITEKeyword_3()); 
                    match(input,22,FOLLOW_22_in_rule__RW_Type__Alternatives3996); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1843:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1847:1: ( ( 'true' ) | ( 'false' ) )
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
                    new NoViableAltException("1843:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1848:1: ( 'true' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1848:1: ( 'true' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1849:1: 'true'
                    {
                     before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    match(input,23,FOLLOW_23_in_rule__Boolean__Alternatives4031); 
                     after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1856:6: ( 'false' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1856:6: ( 'false' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1857:1: 'false'
                    {
                     before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    match(input,24,FOLLOW_24_in_rule__Boolean__Alternatives4051); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1869:1: rule__PropType__Alternatives : ( ( ruleSimpleType ) | ( ruleVectorType ) );
    public final void rule__PropType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1873:1: ( ( ruleSimpleType ) | ( ruleVectorType ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=45 && LA6_0<=52)) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=73 && LA6_0<=77)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1869:1: rule__PropType__Alternatives : ( ( ruleSimpleType ) | ( ruleVectorType ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1874:1: ( ruleSimpleType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1874:1: ( ruleSimpleType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1875:1: ruleSimpleType
                    {
                     before(grammarAccess.getPropTypeAccess().getSimpleTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleType_in_rule__PropType__Alternatives4085);
                    ruleSimpleType();
                    _fsp--;

                     after(grammarAccess.getPropTypeAccess().getSimpleTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1880:6: ( ruleVectorType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1880:6: ( ruleVectorType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1881:1: ruleVectorType
                    {
                     before(grammarAccess.getPropTypeAccess().getVectorTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVectorType_in_rule__PropType__Alternatives4102);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1891:1: rule__SimpleType__Alternatives : ( ( ruleBooleanType ) | ( ruleShortType ) | ( ruleUShortType ) | ( ruleIntType ) | ( ruleUIntType ) | ( ruleFloatType ) | ( ruleDoubleType ) | ( ruleStringType ) );
    public final void rule__SimpleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1895:1: ( ( ruleBooleanType ) | ( ruleShortType ) | ( ruleUShortType ) | ( ruleIntType ) | ( ruleUIntType ) | ( ruleFloatType ) | ( ruleDoubleType ) | ( ruleStringType ) )
            int alt7=8;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt7=1;
                }
                break;
            case 46:
                {
                alt7=2;
                }
                break;
            case 47:
                {
                alt7=3;
                }
                break;
            case 48:
                {
                alt7=4;
                }
                break;
            case 49:
                {
                alt7=5;
                }
                break;
            case 50:
                {
                alt7=6;
                }
                break;
            case 51:
                {
                alt7=7;
                }
                break;
            case 52:
                {
                alt7=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1891:1: rule__SimpleType__Alternatives : ( ( ruleBooleanType ) | ( ruleShortType ) | ( ruleUShortType ) | ( ruleIntType ) | ( ruleUIntType ) | ( ruleFloatType ) | ( ruleDoubleType ) | ( ruleStringType ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1896:1: ( ruleBooleanType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1896:1: ( ruleBooleanType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1897:1: ruleBooleanType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getBooleanTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBooleanType_in_rule__SimpleType__Alternatives4134);
                    ruleBooleanType();
                    _fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getBooleanTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1902:6: ( ruleShortType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1902:6: ( ruleShortType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1903:1: ruleShortType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getShortTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleShortType_in_rule__SimpleType__Alternatives4151);
                    ruleShortType();
                    _fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getShortTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1908:6: ( ruleUShortType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1908:6: ( ruleUShortType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1909:1: ruleUShortType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getUShortTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleUShortType_in_rule__SimpleType__Alternatives4168);
                    ruleUShortType();
                    _fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getUShortTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1914:6: ( ruleIntType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1914:6: ( ruleIntType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1915:1: ruleIntType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getIntTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleIntType_in_rule__SimpleType__Alternatives4185);
                    ruleIntType();
                    _fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getIntTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1920:6: ( ruleUIntType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1920:6: ( ruleUIntType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1921:1: ruleUIntType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getUIntTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleUIntType_in_rule__SimpleType__Alternatives4202);
                    ruleUIntType();
                    _fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getUIntTypeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1926:6: ( ruleFloatType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1926:6: ( ruleFloatType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1927:1: ruleFloatType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getFloatTypeParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleFloatType_in_rule__SimpleType__Alternatives4219);
                    ruleFloatType();
                    _fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getFloatTypeParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1932:6: ( ruleDoubleType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1932:6: ( ruleDoubleType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1933:1: ruleDoubleType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getDoubleTypeParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleDoubleType_in_rule__SimpleType__Alternatives4236);
                    ruleDoubleType();
                    _fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getDoubleTypeParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1938:6: ( ruleStringType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1938:6: ( ruleStringType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1939:1: ruleStringType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getStringTypeParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleStringType_in_rule__SimpleType__Alternatives4253);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1949:1: rule__VectorType__Alternatives : ( ( ruleShortVectorType ) | ( ruleIntVectorType ) | ( ruleFloatVectorType ) | ( ruleDoubleVectorType ) | ( ruleStringVectorType ) );
    public final void rule__VectorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1953:1: ( ( ruleShortVectorType ) | ( ruleIntVectorType ) | ( ruleFloatVectorType ) | ( ruleDoubleVectorType ) | ( ruleStringVectorType ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt8=1;
                }
                break;
            case 74:
                {
                alt8=2;
                }
                break;
            case 75:
                {
                alt8=3;
                }
                break;
            case 76:
                {
                alt8=4;
                }
                break;
            case 77:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1949:1: rule__VectorType__Alternatives : ( ( ruleShortVectorType ) | ( ruleIntVectorType ) | ( ruleFloatVectorType ) | ( ruleDoubleVectorType ) | ( ruleStringVectorType ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1954:1: ( ruleShortVectorType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1954:1: ( ruleShortVectorType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1955:1: ruleShortVectorType
                    {
                     before(grammarAccess.getVectorTypeAccess().getShortVectorTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleShortVectorType_in_rule__VectorType__Alternatives4285);
                    ruleShortVectorType();
                    _fsp--;

                     after(grammarAccess.getVectorTypeAccess().getShortVectorTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1960:6: ( ruleIntVectorType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1960:6: ( ruleIntVectorType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1961:1: ruleIntVectorType
                    {
                     before(grammarAccess.getVectorTypeAccess().getIntVectorTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntVectorType_in_rule__VectorType__Alternatives4302);
                    ruleIntVectorType();
                    _fsp--;

                     after(grammarAccess.getVectorTypeAccess().getIntVectorTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1966:6: ( ruleFloatVectorType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1966:6: ( ruleFloatVectorType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1967:1: ruleFloatVectorType
                    {
                     before(grammarAccess.getVectorTypeAccess().getFloatVectorTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFloatVectorType_in_rule__VectorType__Alternatives4319);
                    ruleFloatVectorType();
                    _fsp--;

                     after(grammarAccess.getVectorTypeAccess().getFloatVectorTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1972:6: ( ruleDoubleVectorType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1972:6: ( ruleDoubleVectorType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1973:1: ruleDoubleVectorType
                    {
                     before(grammarAccess.getVectorTypeAccess().getDoubleVectorTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDoubleVectorType_in_rule__VectorType__Alternatives4336);
                    ruleDoubleVectorType();
                    _fsp--;

                     after(grammarAccess.getVectorTypeAccess().getDoubleVectorTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1978:6: ( ruleStringVectorType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1978:6: ( ruleStringVectorType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1979:1: ruleStringVectorType
                    {
                     before(grammarAccess.getVectorTypeAccess().getStringVectorTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleStringVectorType_in_rule__VectorType__Alternatives4353);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1989:1: rule__Type__Alternatives : ( ( ruleVoidType ) | ( ruleBooleanType ) | ( ruleShortType ) | ( ruleUShortType ) | ( ruleIntType ) | ( ruleUIntType ) | ( ruleFloatType ) | ( ruleDoubleType ) | ( ruleStringType ) | ( ruleCharArrayType ) | ( ruleShortArrayType ) | ( ruleUShortArrayType ) | ( ruleIntArrayType ) | ( ruleUIntArrayType ) | ( ruleFloatArrayType ) | ( ruleDoubleArrayType ) | ( ruleStringArrayType ) | ( ruleLongStringArrayType ) | ( ruleDoubleStringArrayType ) | ( ruleStateType ) | ( ruleConstStringType ) | ( ruleBooleanArrayType ) | ( ruleLongType ) | ( ruleULongType ) | ( ruleUCharType ) | ( ruleLongArrayType ) | ( ruleULongArrayType ) | ( ruleDevIntType ) | ( ruleEncodedType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1993:1: ( ( ruleVoidType ) | ( ruleBooleanType ) | ( ruleShortType ) | ( ruleUShortType ) | ( ruleIntType ) | ( ruleUIntType ) | ( ruleFloatType ) | ( ruleDoubleType ) | ( ruleStringType ) | ( ruleCharArrayType ) | ( ruleShortArrayType ) | ( ruleUShortArrayType ) | ( ruleIntArrayType ) | ( ruleUIntArrayType ) | ( ruleFloatArrayType ) | ( ruleDoubleArrayType ) | ( ruleStringArrayType ) | ( ruleLongStringArrayType ) | ( ruleDoubleStringArrayType ) | ( ruleStateType ) | ( ruleConstStringType ) | ( ruleBooleanArrayType ) | ( ruleLongType ) | ( ruleULongType ) | ( ruleUCharType ) | ( ruleLongArrayType ) | ( ruleULongArrayType ) | ( ruleDevIntType ) | ( ruleEncodedType ) )
            int alt9=29;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt9=1;
                }
                break;
            case 45:
                {
                alt9=2;
                }
                break;
            case 46:
                {
                alt9=3;
                }
                break;
            case 47:
                {
                alt9=4;
                }
                break;
            case 48:
                {
                alt9=5;
                }
                break;
            case 49:
                {
                alt9=6;
                }
                break;
            case 50:
                {
                alt9=7;
                }
                break;
            case 51:
                {
                alt9=8;
                }
                break;
            case 52:
                {
                alt9=9;
                }
                break;
            case 53:
                {
                alt9=10;
                }
                break;
            case 54:
                {
                alt9=11;
                }
                break;
            case 55:
                {
                alt9=12;
                }
                break;
            case 56:
                {
                alt9=13;
                }
                break;
            case 57:
                {
                alt9=14;
                }
                break;
            case 58:
                {
                alt9=15;
                }
                break;
            case 59:
                {
                alt9=16;
                }
                break;
            case 60:
                {
                alt9=17;
                }
                break;
            case 61:
                {
                alt9=18;
                }
                break;
            case 62:
                {
                alt9=19;
                }
                break;
            case 63:
                {
                alt9=20;
                }
                break;
            case 64:
                {
                alt9=21;
                }
                break;
            case 65:
                {
                alt9=22;
                }
                break;
            case 67:
                {
                alt9=23;
                }
                break;
            case 68:
                {
                alt9=24;
                }
                break;
            case 66:
                {
                alt9=25;
                }
                break;
            case 69:
                {
                alt9=26;
                }
                break;
            case 70:
                {
                alt9=27;
                }
                break;
            case 71:
                {
                alt9=28;
                }
                break;
            case 72:
                {
                alt9=29;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1989:1: rule__Type__Alternatives : ( ( ruleVoidType ) | ( ruleBooleanType ) | ( ruleShortType ) | ( ruleUShortType ) | ( ruleIntType ) | ( ruleUIntType ) | ( ruleFloatType ) | ( ruleDoubleType ) | ( ruleStringType ) | ( ruleCharArrayType ) | ( ruleShortArrayType ) | ( ruleUShortArrayType ) | ( ruleIntArrayType ) | ( ruleUIntArrayType ) | ( ruleFloatArrayType ) | ( ruleDoubleArrayType ) | ( ruleStringArrayType ) | ( ruleLongStringArrayType ) | ( ruleDoubleStringArrayType ) | ( ruleStateType ) | ( ruleConstStringType ) | ( ruleBooleanArrayType ) | ( ruleLongType ) | ( ruleULongType ) | ( ruleUCharType ) | ( ruleLongArrayType ) | ( ruleULongArrayType ) | ( ruleDevIntType ) | ( ruleEncodedType ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1994:1: ( ruleVoidType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1994:1: ( ruleVoidType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1995:1: ruleVoidType
                    {
                     before(grammarAccess.getTypeAccess().getVoidTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleVoidType_in_rule__Type__Alternatives4385);
                    ruleVoidType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getVoidTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2000:6: ( ruleBooleanType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2000:6: ( ruleBooleanType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2001:1: ruleBooleanType
                    {
                     before(grammarAccess.getTypeAccess().getBooleanTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBooleanType_in_rule__Type__Alternatives4402);
                    ruleBooleanType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getBooleanTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2006:6: ( ruleShortType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2006:6: ( ruleShortType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2007:1: ruleShortType
                    {
                     before(grammarAccess.getTypeAccess().getShortTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleShortType_in_rule__Type__Alternatives4419);
                    ruleShortType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getShortTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2012:6: ( ruleUShortType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2012:6: ( ruleUShortType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2013:1: ruleUShortType
                    {
                     before(grammarAccess.getTypeAccess().getUShortTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleUShortType_in_rule__Type__Alternatives4436);
                    ruleUShortType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getUShortTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2018:6: ( ruleIntType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2018:6: ( ruleIntType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2019:1: ruleIntType
                    {
                     before(grammarAccess.getTypeAccess().getIntTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleIntType_in_rule__Type__Alternatives4453);
                    ruleIntType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getIntTypeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2024:6: ( ruleUIntType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2024:6: ( ruleUIntType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2025:1: ruleUIntType
                    {
                     before(grammarAccess.getTypeAccess().getUIntTypeParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleUIntType_in_rule__Type__Alternatives4470);
                    ruleUIntType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getUIntTypeParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2030:6: ( ruleFloatType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2030:6: ( ruleFloatType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2031:1: ruleFloatType
                    {
                     before(grammarAccess.getTypeAccess().getFloatTypeParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleFloatType_in_rule__Type__Alternatives4487);
                    ruleFloatType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getFloatTypeParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2036:6: ( ruleDoubleType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2036:6: ( ruleDoubleType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2037:1: ruleDoubleType
                    {
                     before(grammarAccess.getTypeAccess().getDoubleTypeParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleDoubleType_in_rule__Type__Alternatives4504);
                    ruleDoubleType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getDoubleTypeParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2042:6: ( ruleStringType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2042:6: ( ruleStringType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2043:1: ruleStringType
                    {
                     before(grammarAccess.getTypeAccess().getStringTypeParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleStringType_in_rule__Type__Alternatives4521);
                    ruleStringType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getStringTypeParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2048:6: ( ruleCharArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2048:6: ( ruleCharArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2049:1: ruleCharArrayType
                    {
                     before(grammarAccess.getTypeAccess().getCharArrayTypeParserRuleCall_9()); 
                    pushFollow(FOLLOW_ruleCharArrayType_in_rule__Type__Alternatives4538);
                    ruleCharArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getCharArrayTypeParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2054:6: ( ruleShortArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2054:6: ( ruleShortArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2055:1: ruleShortArrayType
                    {
                     before(grammarAccess.getTypeAccess().getShortArrayTypeParserRuleCall_10()); 
                    pushFollow(FOLLOW_ruleShortArrayType_in_rule__Type__Alternatives4555);
                    ruleShortArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getShortArrayTypeParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2060:6: ( ruleUShortArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2060:6: ( ruleUShortArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2061:1: ruleUShortArrayType
                    {
                     before(grammarAccess.getTypeAccess().getUShortArrayTypeParserRuleCall_11()); 
                    pushFollow(FOLLOW_ruleUShortArrayType_in_rule__Type__Alternatives4572);
                    ruleUShortArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getUShortArrayTypeParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2066:6: ( ruleIntArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2066:6: ( ruleIntArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2067:1: ruleIntArrayType
                    {
                     before(grammarAccess.getTypeAccess().getIntArrayTypeParserRuleCall_12()); 
                    pushFollow(FOLLOW_ruleIntArrayType_in_rule__Type__Alternatives4589);
                    ruleIntArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getIntArrayTypeParserRuleCall_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2072:6: ( ruleUIntArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2072:6: ( ruleUIntArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2073:1: ruleUIntArrayType
                    {
                     before(grammarAccess.getTypeAccess().getUIntArrayTypeParserRuleCall_13()); 
                    pushFollow(FOLLOW_ruleUIntArrayType_in_rule__Type__Alternatives4606);
                    ruleUIntArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getUIntArrayTypeParserRuleCall_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2078:6: ( ruleFloatArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2078:6: ( ruleFloatArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2079:1: ruleFloatArrayType
                    {
                     before(grammarAccess.getTypeAccess().getFloatArrayTypeParserRuleCall_14()); 
                    pushFollow(FOLLOW_ruleFloatArrayType_in_rule__Type__Alternatives4623);
                    ruleFloatArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getFloatArrayTypeParserRuleCall_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2084:6: ( ruleDoubleArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2084:6: ( ruleDoubleArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2085:1: ruleDoubleArrayType
                    {
                     before(grammarAccess.getTypeAccess().getDoubleArrayTypeParserRuleCall_15()); 
                    pushFollow(FOLLOW_ruleDoubleArrayType_in_rule__Type__Alternatives4640);
                    ruleDoubleArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getDoubleArrayTypeParserRuleCall_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2090:6: ( ruleStringArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2090:6: ( ruleStringArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2091:1: ruleStringArrayType
                    {
                     before(grammarAccess.getTypeAccess().getStringArrayTypeParserRuleCall_16()); 
                    pushFollow(FOLLOW_ruleStringArrayType_in_rule__Type__Alternatives4657);
                    ruleStringArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getStringArrayTypeParserRuleCall_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2096:6: ( ruleLongStringArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2096:6: ( ruleLongStringArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2097:1: ruleLongStringArrayType
                    {
                     before(grammarAccess.getTypeAccess().getLongStringArrayTypeParserRuleCall_17()); 
                    pushFollow(FOLLOW_ruleLongStringArrayType_in_rule__Type__Alternatives4674);
                    ruleLongStringArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getLongStringArrayTypeParserRuleCall_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2102:6: ( ruleDoubleStringArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2102:6: ( ruleDoubleStringArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2103:1: ruleDoubleStringArrayType
                    {
                     before(grammarAccess.getTypeAccess().getDoubleStringArrayTypeParserRuleCall_18()); 
                    pushFollow(FOLLOW_ruleDoubleStringArrayType_in_rule__Type__Alternatives4691);
                    ruleDoubleStringArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getDoubleStringArrayTypeParserRuleCall_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2108:6: ( ruleStateType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2108:6: ( ruleStateType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2109:1: ruleStateType
                    {
                     before(grammarAccess.getTypeAccess().getStateTypeParserRuleCall_19()); 
                    pushFollow(FOLLOW_ruleStateType_in_rule__Type__Alternatives4708);
                    ruleStateType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getStateTypeParserRuleCall_19()); 

                    }


                    }
                    break;
                case 21 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2114:6: ( ruleConstStringType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2114:6: ( ruleConstStringType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2115:1: ruleConstStringType
                    {
                     before(grammarAccess.getTypeAccess().getConstStringTypeParserRuleCall_20()); 
                    pushFollow(FOLLOW_ruleConstStringType_in_rule__Type__Alternatives4725);
                    ruleConstStringType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getConstStringTypeParserRuleCall_20()); 

                    }


                    }
                    break;
                case 22 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2120:6: ( ruleBooleanArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2120:6: ( ruleBooleanArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2121:1: ruleBooleanArrayType
                    {
                     before(grammarAccess.getTypeAccess().getBooleanArrayTypeParserRuleCall_21()); 
                    pushFollow(FOLLOW_ruleBooleanArrayType_in_rule__Type__Alternatives4742);
                    ruleBooleanArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getBooleanArrayTypeParserRuleCall_21()); 

                    }


                    }
                    break;
                case 23 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2126:6: ( ruleLongType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2126:6: ( ruleLongType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2127:1: ruleLongType
                    {
                     before(grammarAccess.getTypeAccess().getLongTypeParserRuleCall_22()); 
                    pushFollow(FOLLOW_ruleLongType_in_rule__Type__Alternatives4759);
                    ruleLongType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getLongTypeParserRuleCall_22()); 

                    }


                    }
                    break;
                case 24 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2132:6: ( ruleULongType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2132:6: ( ruleULongType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2133:1: ruleULongType
                    {
                     before(grammarAccess.getTypeAccess().getULongTypeParserRuleCall_23()); 
                    pushFollow(FOLLOW_ruleULongType_in_rule__Type__Alternatives4776);
                    ruleULongType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getULongTypeParserRuleCall_23()); 

                    }


                    }
                    break;
                case 25 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2138:6: ( ruleUCharType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2138:6: ( ruleUCharType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2139:1: ruleUCharType
                    {
                     before(grammarAccess.getTypeAccess().getUCharTypeParserRuleCall_24()); 
                    pushFollow(FOLLOW_ruleUCharType_in_rule__Type__Alternatives4793);
                    ruleUCharType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getUCharTypeParserRuleCall_24()); 

                    }


                    }
                    break;
                case 26 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2144:6: ( ruleLongArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2144:6: ( ruleLongArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2145:1: ruleLongArrayType
                    {
                     before(grammarAccess.getTypeAccess().getLongArrayTypeParserRuleCall_25()); 
                    pushFollow(FOLLOW_ruleLongArrayType_in_rule__Type__Alternatives4810);
                    ruleLongArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getLongArrayTypeParserRuleCall_25()); 

                    }


                    }
                    break;
                case 27 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2150:6: ( ruleULongArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2150:6: ( ruleULongArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2151:1: ruleULongArrayType
                    {
                     before(grammarAccess.getTypeAccess().getULongArrayTypeParserRuleCall_26()); 
                    pushFollow(FOLLOW_ruleULongArrayType_in_rule__Type__Alternatives4827);
                    ruleULongArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getULongArrayTypeParserRuleCall_26()); 

                    }


                    }
                    break;
                case 28 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2156:6: ( ruleDevIntType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2156:6: ( ruleDevIntType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2157:1: ruleDevIntType
                    {
                     before(grammarAccess.getTypeAccess().getDevIntTypeParserRuleCall_27()); 
                    pushFollow(FOLLOW_ruleDevIntType_in_rule__Type__Alternatives4844);
                    ruleDevIntType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getDevIntTypeParserRuleCall_27()); 

                    }


                    }
                    break;
                case 29 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2162:6: ( ruleEncodedType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2162:6: ( ruleEncodedType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2163:1: ruleEncodedType
                    {
                     before(grammarAccess.getTypeAccess().getEncodedTypeParserRuleCall_28()); 
                    pushFollow(FOLLOW_ruleEncodedType_in_rule__Type__Alternatives4861);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2175:1: rule__PogoSystem__Group__0 : ( ( rule__PogoSystem__ImportsAssignment_0 )* ) rule__PogoSystem__Group__1 ;
    public final void rule__PogoSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2179:1: ( ( ( rule__PogoSystem__ImportsAssignment_0 )* ) rule__PogoSystem__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2180:1: ( ( rule__PogoSystem__ImportsAssignment_0 )* ) rule__PogoSystem__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2180:1: ( ( rule__PogoSystem__ImportsAssignment_0 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2181:1: ( rule__PogoSystem__ImportsAssignment_0 )*
            {
             before(grammarAccess.getPogoSystemAccess().getImportsAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2182:1: ( rule__PogoSystem__ImportsAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2182:2: rule__PogoSystem__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__PogoSystem__ImportsAssignment_0_in_rule__PogoSystem__Group__04895);
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

            pushFollow(FOLLOW_rule__PogoSystem__Group__1_in_rule__PogoSystem__Group__04905);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2193:1: rule__PogoSystem__Group__1 : ( ( rule__PogoSystem__ClassesAssignment_1 )* ) rule__PogoSystem__Group__2 ;
    public final void rule__PogoSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2197:1: ( ( ( rule__PogoSystem__ClassesAssignment_1 )* ) rule__PogoSystem__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2198:1: ( ( rule__PogoSystem__ClassesAssignment_1 )* ) rule__PogoSystem__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2198:1: ( ( rule__PogoSystem__ClassesAssignment_1 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2199:1: ( rule__PogoSystem__ClassesAssignment_1 )*
            {
             before(grammarAccess.getPogoSystemAccess().getClassesAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2200:1: ( rule__PogoSystem__ClassesAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==32) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2200:2: rule__PogoSystem__ClassesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__PogoSystem__ClassesAssignment_1_in_rule__PogoSystem__Group__14933);
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

            pushFollow(FOLLOW_rule__PogoSystem__Group__2_in_rule__PogoSystem__Group__14943);
            rule__PogoSystem__Group__2();
            _fsp--;


            }

        }
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


    // $ANTLR start rule__PogoSystem__Group__2
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2211:1: rule__PogoSystem__Group__2 : ( ( rule__PogoSystem__MultiClassesAssignment_2 )* ) ;
    public final void rule__PogoSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2215:1: ( ( ( rule__PogoSystem__MultiClassesAssignment_2 )* ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2216:1: ( ( rule__PogoSystem__MultiClassesAssignment_2 )* )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2216:1: ( ( rule__PogoSystem__MultiClassesAssignment_2 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2217:1: ( rule__PogoSystem__MultiClassesAssignment_2 )*
            {
             before(grammarAccess.getPogoSystemAccess().getMultiClassesAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2218:1: ( rule__PogoSystem__MultiClassesAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2218:2: rule__PogoSystem__MultiClassesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__PogoSystem__MultiClassesAssignment_2_in_rule__PogoSystem__Group__24971);
            	    rule__PogoSystem__MultiClassesAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getPogoSystemAccess().getMultiClassesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoSystem__Group__2


    // $ANTLR start rule__Import__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2234:1: rule__Import__Group__0 : ( 'import' ) rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2238:1: ( ( 'import' ) rule__Import__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2239:1: ( 'import' ) rule__Import__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2239:1: ( 'import' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2240:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Import__Group__05013); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__05023);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2254:1: rule__Import__Group__1 : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2258:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2259:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2259:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2260:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2261:1: ( rule__Import__ImportURIAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2261:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__15051);
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


    // $ANTLR start rule__PogoMultiClasses__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2275:1: rule__PogoMultiClasses__Group__0 : ( 'multiclasses' ) rule__PogoMultiClasses__Group__1 ;
    public final void rule__PogoMultiClasses__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2279:1: ( ( 'multiclasses' ) rule__PogoMultiClasses__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2280:1: ( 'multiclasses' ) rule__PogoMultiClasses__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2280:1: ( 'multiclasses' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2281:1: 'multiclasses'
            {
             before(grammarAccess.getPogoMultiClassesAccess().getMulticlassesKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__PogoMultiClasses__Group__05090); 
             after(grammarAccess.getPogoMultiClassesAccess().getMulticlassesKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__PogoMultiClasses__Group__1_in_rule__PogoMultiClasses__Group__05100);
            rule__PogoMultiClasses__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoMultiClasses__Group__0


    // $ANTLR start rule__PogoMultiClasses__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2295:1: rule__PogoMultiClasses__Group__1 : ( ( rule__PogoMultiClasses__NameAssignment_1 ) ) rule__PogoMultiClasses__Group__2 ;
    public final void rule__PogoMultiClasses__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2299:1: ( ( ( rule__PogoMultiClasses__NameAssignment_1 ) ) rule__PogoMultiClasses__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2300:1: ( ( rule__PogoMultiClasses__NameAssignment_1 ) ) rule__PogoMultiClasses__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2300:1: ( ( rule__PogoMultiClasses__NameAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2301:1: ( rule__PogoMultiClasses__NameAssignment_1 )
            {
             before(grammarAccess.getPogoMultiClassesAccess().getNameAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2302:1: ( rule__PogoMultiClasses__NameAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2302:2: rule__PogoMultiClasses__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PogoMultiClasses__NameAssignment_1_in_rule__PogoMultiClasses__Group__15128);
            rule__PogoMultiClasses__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPogoMultiClassesAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__PogoMultiClasses__Group__2_in_rule__PogoMultiClasses__Group__15137);
            rule__PogoMultiClasses__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoMultiClasses__Group__1


    // $ANTLR start rule__PogoMultiClasses__Group__2
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2313:1: rule__PogoMultiClasses__Group__2 : ( '{' ) rule__PogoMultiClasses__Group__3 ;
    public final void rule__PogoMultiClasses__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2317:1: ( ( '{' ) rule__PogoMultiClasses__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2318:1: ( '{' ) rule__PogoMultiClasses__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2318:1: ( '{' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2319:1: '{'
            {
             before(grammarAccess.getPogoMultiClassesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__PogoMultiClasses__Group__25166); 
             after(grammarAccess.getPogoMultiClassesAccess().getLeftCurlyBracketKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__PogoMultiClasses__Group__3_in_rule__PogoMultiClasses__Group__25176);
            rule__PogoMultiClasses__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoMultiClasses__Group__2


    // $ANTLR start rule__PogoMultiClasses__Group__3
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2333:1: rule__PogoMultiClasses__Group__3 : ( ( rule__PogoMultiClasses__SourcePathAssignment_3 ) ) rule__PogoMultiClasses__Group__4 ;
    public final void rule__PogoMultiClasses__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2337:1: ( ( ( rule__PogoMultiClasses__SourcePathAssignment_3 ) ) rule__PogoMultiClasses__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2338:1: ( ( rule__PogoMultiClasses__SourcePathAssignment_3 ) ) rule__PogoMultiClasses__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2338:1: ( ( rule__PogoMultiClasses__SourcePathAssignment_3 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2339:1: ( rule__PogoMultiClasses__SourcePathAssignment_3 )
            {
             before(grammarAccess.getPogoMultiClassesAccess().getSourcePathAssignment_3()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2340:1: ( rule__PogoMultiClasses__SourcePathAssignment_3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2340:2: rule__PogoMultiClasses__SourcePathAssignment_3
            {
            pushFollow(FOLLOW_rule__PogoMultiClasses__SourcePathAssignment_3_in_rule__PogoMultiClasses__Group__35204);
            rule__PogoMultiClasses__SourcePathAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getPogoMultiClassesAccess().getSourcePathAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__PogoMultiClasses__Group__4_in_rule__PogoMultiClasses__Group__35213);
            rule__PogoMultiClasses__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoMultiClasses__Group__3


    // $ANTLR start rule__PogoMultiClasses__Group__4
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2351:1: rule__PogoMultiClasses__Group__4 : ( ( rule__PogoMultiClasses__DescriptionAssignment_4 ) ) rule__PogoMultiClasses__Group__5 ;
    public final void rule__PogoMultiClasses__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2355:1: ( ( ( rule__PogoMultiClasses__DescriptionAssignment_4 ) ) rule__PogoMultiClasses__Group__5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2356:1: ( ( rule__PogoMultiClasses__DescriptionAssignment_4 ) ) rule__PogoMultiClasses__Group__5
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2356:1: ( ( rule__PogoMultiClasses__DescriptionAssignment_4 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2357:1: ( rule__PogoMultiClasses__DescriptionAssignment_4 )
            {
             before(grammarAccess.getPogoMultiClassesAccess().getDescriptionAssignment_4()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2358:1: ( rule__PogoMultiClasses__DescriptionAssignment_4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2358:2: rule__PogoMultiClasses__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_rule__PogoMultiClasses__DescriptionAssignment_4_in_rule__PogoMultiClasses__Group__45241);
            rule__PogoMultiClasses__DescriptionAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getPogoMultiClassesAccess().getDescriptionAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__PogoMultiClasses__Group__5_in_rule__PogoMultiClasses__Group__45250);
            rule__PogoMultiClasses__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoMultiClasses__Group__4


    // $ANTLR start rule__PogoMultiClasses__Group__5
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2369:1: rule__PogoMultiClasses__Group__5 : ( ( rule__PogoMultiClasses__TitleAssignment_5 ) ) rule__PogoMultiClasses__Group__6 ;
    public final void rule__PogoMultiClasses__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2373:1: ( ( ( rule__PogoMultiClasses__TitleAssignment_5 ) ) rule__PogoMultiClasses__Group__6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2374:1: ( ( rule__PogoMultiClasses__TitleAssignment_5 ) ) rule__PogoMultiClasses__Group__6
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2374:1: ( ( rule__PogoMultiClasses__TitleAssignment_5 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2375:1: ( rule__PogoMultiClasses__TitleAssignment_5 )
            {
             before(grammarAccess.getPogoMultiClassesAccess().getTitleAssignment_5()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2376:1: ( rule__PogoMultiClasses__TitleAssignment_5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2376:2: rule__PogoMultiClasses__TitleAssignment_5
            {
            pushFollow(FOLLOW_rule__PogoMultiClasses__TitleAssignment_5_in_rule__PogoMultiClasses__Group__55278);
            rule__PogoMultiClasses__TitleAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getPogoMultiClassesAccess().getTitleAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__PogoMultiClasses__Group__6_in_rule__PogoMultiClasses__Group__55287);
            rule__PogoMultiClasses__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoMultiClasses__Group__5


    // $ANTLR start rule__PogoMultiClasses__Group__6
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2387:1: rule__PogoMultiClasses__Group__6 : ( 'classes:' ) rule__PogoMultiClasses__Group__7 ;
    public final void rule__PogoMultiClasses__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2391:1: ( ( 'classes:' ) rule__PogoMultiClasses__Group__7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2392:1: ( 'classes:' ) rule__PogoMultiClasses__Group__7
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2392:1: ( 'classes:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2393:1: 'classes:'
            {
             before(grammarAccess.getPogoMultiClassesAccess().getClassesKeyword_6()); 
            match(input,28,FOLLOW_28_in_rule__PogoMultiClasses__Group__65316); 
             after(grammarAccess.getPogoMultiClassesAccess().getClassesKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__PogoMultiClasses__Group__7_in_rule__PogoMultiClasses__Group__65326);
            rule__PogoMultiClasses__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoMultiClasses__Group__6


    // $ANTLR start rule__PogoMultiClasses__Group__7
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2407:1: rule__PogoMultiClasses__Group__7 : ( ( rule__PogoMultiClasses__ClassesAssignment_7 ) ) rule__PogoMultiClasses__Group__8 ;
    public final void rule__PogoMultiClasses__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2411:1: ( ( ( rule__PogoMultiClasses__ClassesAssignment_7 ) ) rule__PogoMultiClasses__Group__8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2412:1: ( ( rule__PogoMultiClasses__ClassesAssignment_7 ) ) rule__PogoMultiClasses__Group__8
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2412:1: ( ( rule__PogoMultiClasses__ClassesAssignment_7 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2413:1: ( rule__PogoMultiClasses__ClassesAssignment_7 )
            {
             before(grammarAccess.getPogoMultiClassesAccess().getClassesAssignment_7()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2414:1: ( rule__PogoMultiClasses__ClassesAssignment_7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2414:2: rule__PogoMultiClasses__ClassesAssignment_7
            {
            pushFollow(FOLLOW_rule__PogoMultiClasses__ClassesAssignment_7_in_rule__PogoMultiClasses__Group__75354);
            rule__PogoMultiClasses__ClassesAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getPogoMultiClassesAccess().getClassesAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__PogoMultiClasses__Group__8_in_rule__PogoMultiClasses__Group__75363);
            rule__PogoMultiClasses__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoMultiClasses__Group__7


    // $ANTLR start rule__PogoMultiClasses__Group__8
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2425:1: rule__PogoMultiClasses__Group__8 : ( ( rule__PogoMultiClasses__FilestogenerateAssignment_8 ) ) rule__PogoMultiClasses__Group__9 ;
    public final void rule__PogoMultiClasses__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2429:1: ( ( ( rule__PogoMultiClasses__FilestogenerateAssignment_8 ) ) rule__PogoMultiClasses__Group__9 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2430:1: ( ( rule__PogoMultiClasses__FilestogenerateAssignment_8 ) ) rule__PogoMultiClasses__Group__9
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2430:1: ( ( rule__PogoMultiClasses__FilestogenerateAssignment_8 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2431:1: ( rule__PogoMultiClasses__FilestogenerateAssignment_8 )
            {
             before(grammarAccess.getPogoMultiClassesAccess().getFilestogenerateAssignment_8()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2432:1: ( rule__PogoMultiClasses__FilestogenerateAssignment_8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2432:2: rule__PogoMultiClasses__FilestogenerateAssignment_8
            {
            pushFollow(FOLLOW_rule__PogoMultiClasses__FilestogenerateAssignment_8_in_rule__PogoMultiClasses__Group__85391);
            rule__PogoMultiClasses__FilestogenerateAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getPogoMultiClassesAccess().getFilestogenerateAssignment_8()); 

            }

            pushFollow(FOLLOW_rule__PogoMultiClasses__Group__9_in_rule__PogoMultiClasses__Group__85400);
            rule__PogoMultiClasses__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoMultiClasses__Group__8


    // $ANTLR start rule__PogoMultiClasses__Group__9
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2443:1: rule__PogoMultiClasses__Group__9 : ( ( rule__PogoMultiClasses__PreferencesAssignment_9 ) ) rule__PogoMultiClasses__Group__10 ;
    public final void rule__PogoMultiClasses__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2447:1: ( ( ( rule__PogoMultiClasses__PreferencesAssignment_9 ) ) rule__PogoMultiClasses__Group__10 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2448:1: ( ( rule__PogoMultiClasses__PreferencesAssignment_9 ) ) rule__PogoMultiClasses__Group__10
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2448:1: ( ( rule__PogoMultiClasses__PreferencesAssignment_9 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2449:1: ( rule__PogoMultiClasses__PreferencesAssignment_9 )
            {
             before(grammarAccess.getPogoMultiClassesAccess().getPreferencesAssignment_9()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2450:1: ( rule__PogoMultiClasses__PreferencesAssignment_9 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2450:2: rule__PogoMultiClasses__PreferencesAssignment_9
            {
            pushFollow(FOLLOW_rule__PogoMultiClasses__PreferencesAssignment_9_in_rule__PogoMultiClasses__Group__95428);
            rule__PogoMultiClasses__PreferencesAssignment_9();
            _fsp--;


            }

             after(grammarAccess.getPogoMultiClassesAccess().getPreferencesAssignment_9()); 

            }

            pushFollow(FOLLOW_rule__PogoMultiClasses__Group__10_in_rule__PogoMultiClasses__Group__95437);
            rule__PogoMultiClasses__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoMultiClasses__Group__9


    // $ANTLR start rule__PogoMultiClasses__Group__10
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2461:1: rule__PogoMultiClasses__Group__10 : ( '}' ) ;
    public final void rule__PogoMultiClasses__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2465:1: ( ( '}' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2466:1: ( '}' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2466:1: ( '}' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2467:1: '}'
            {
             before(grammarAccess.getPogoMultiClassesAccess().getRightCurlyBracketKeyword_10()); 
            match(input,29,FOLLOW_29_in_rule__PogoMultiClasses__Group__105466); 
             after(grammarAccess.getPogoMultiClassesAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoMultiClasses__Group__10


    // $ANTLR start rule__OneClassSimpleDef__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2502:1: rule__OneClassSimpleDef__Group__0 : ( ( rule__OneClassSimpleDef__ClassnameAssignment_0 ) ) rule__OneClassSimpleDef__Group__1 ;
    public final void rule__OneClassSimpleDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2506:1: ( ( ( rule__OneClassSimpleDef__ClassnameAssignment_0 ) ) rule__OneClassSimpleDef__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2507:1: ( ( rule__OneClassSimpleDef__ClassnameAssignment_0 ) ) rule__OneClassSimpleDef__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2507:1: ( ( rule__OneClassSimpleDef__ClassnameAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2508:1: ( rule__OneClassSimpleDef__ClassnameAssignment_0 )
            {
             before(grammarAccess.getOneClassSimpleDefAccess().getClassnameAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2509:1: ( rule__OneClassSimpleDef__ClassnameAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2509:2: rule__OneClassSimpleDef__ClassnameAssignment_0
            {
            pushFollow(FOLLOW_rule__OneClassSimpleDef__ClassnameAssignment_0_in_rule__OneClassSimpleDef__Group__05523);
            rule__OneClassSimpleDef__ClassnameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getOneClassSimpleDefAccess().getClassnameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__OneClassSimpleDef__Group__1_in_rule__OneClassSimpleDef__Group__05532);
            rule__OneClassSimpleDef__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OneClassSimpleDef__Group__0


    // $ANTLR start rule__OneClassSimpleDef__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2520:1: rule__OneClassSimpleDef__Group__1 : ( ( rule__OneClassSimpleDef__SourcePathAssignment_1 ) ) rule__OneClassSimpleDef__Group__2 ;
    public final void rule__OneClassSimpleDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2524:1: ( ( ( rule__OneClassSimpleDef__SourcePathAssignment_1 ) ) rule__OneClassSimpleDef__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2525:1: ( ( rule__OneClassSimpleDef__SourcePathAssignment_1 ) ) rule__OneClassSimpleDef__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2525:1: ( ( rule__OneClassSimpleDef__SourcePathAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2526:1: ( rule__OneClassSimpleDef__SourcePathAssignment_1 )
            {
             before(grammarAccess.getOneClassSimpleDefAccess().getSourcePathAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2527:1: ( rule__OneClassSimpleDef__SourcePathAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2527:2: rule__OneClassSimpleDef__SourcePathAssignment_1
            {
            pushFollow(FOLLOW_rule__OneClassSimpleDef__SourcePathAssignment_1_in_rule__OneClassSimpleDef__Group__15560);
            rule__OneClassSimpleDef__SourcePathAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getOneClassSimpleDefAccess().getSourcePathAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__OneClassSimpleDef__Group__2_in_rule__OneClassSimpleDef__Group__15569);
            rule__OneClassSimpleDef__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OneClassSimpleDef__Group__1


    // $ANTLR start rule__OneClassSimpleDef__Group__2
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2538:1: rule__OneClassSimpleDef__Group__2 : ( ( rule__OneClassSimpleDef__Pogo6Assignment_2 ) ) rule__OneClassSimpleDef__Group__3 ;
    public final void rule__OneClassSimpleDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2542:1: ( ( ( rule__OneClassSimpleDef__Pogo6Assignment_2 ) ) rule__OneClassSimpleDef__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2543:1: ( ( rule__OneClassSimpleDef__Pogo6Assignment_2 ) ) rule__OneClassSimpleDef__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2543:1: ( ( rule__OneClassSimpleDef__Pogo6Assignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2544:1: ( rule__OneClassSimpleDef__Pogo6Assignment_2 )
            {
             before(grammarAccess.getOneClassSimpleDefAccess().getPogo6Assignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2545:1: ( rule__OneClassSimpleDef__Pogo6Assignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2545:2: rule__OneClassSimpleDef__Pogo6Assignment_2
            {
            pushFollow(FOLLOW_rule__OneClassSimpleDef__Pogo6Assignment_2_in_rule__OneClassSimpleDef__Group__25597);
            rule__OneClassSimpleDef__Pogo6Assignment_2();
            _fsp--;


            }

             after(grammarAccess.getOneClassSimpleDefAccess().getPogo6Assignment_2()); 

            }

            pushFollow(FOLLOW_rule__OneClassSimpleDef__Group__3_in_rule__OneClassSimpleDef__Group__25606);
            rule__OneClassSimpleDef__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OneClassSimpleDef__Group__2


    // $ANTLR start rule__OneClassSimpleDef__Group__3
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2556:1: rule__OneClassSimpleDef__Group__3 : ( 'inheritances:' ) rule__OneClassSimpleDef__Group__4 ;
    public final void rule__OneClassSimpleDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2560:1: ( ( 'inheritances:' ) rule__OneClassSimpleDef__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2561:1: ( 'inheritances:' ) rule__OneClassSimpleDef__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2561:1: ( 'inheritances:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2562:1: 'inheritances:'
            {
             before(grammarAccess.getOneClassSimpleDefAccess().getInheritancesKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__OneClassSimpleDef__Group__35635); 
             after(grammarAccess.getOneClassSimpleDefAccess().getInheritancesKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__OneClassSimpleDef__Group__4_in_rule__OneClassSimpleDef__Group__35645);
            rule__OneClassSimpleDef__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OneClassSimpleDef__Group__3


    // $ANTLR start rule__OneClassSimpleDef__Group__4
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2576:1: rule__OneClassSimpleDef__Group__4 : ( ( rule__OneClassSimpleDef__InheritancesAssignment_4 ) ) rule__OneClassSimpleDef__Group__5 ;
    public final void rule__OneClassSimpleDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2580:1: ( ( ( rule__OneClassSimpleDef__InheritancesAssignment_4 ) ) rule__OneClassSimpleDef__Group__5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2581:1: ( ( rule__OneClassSimpleDef__InheritancesAssignment_4 ) ) rule__OneClassSimpleDef__Group__5
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2581:1: ( ( rule__OneClassSimpleDef__InheritancesAssignment_4 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2582:1: ( rule__OneClassSimpleDef__InheritancesAssignment_4 )
            {
             before(grammarAccess.getOneClassSimpleDefAccess().getInheritancesAssignment_4()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2583:1: ( rule__OneClassSimpleDef__InheritancesAssignment_4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2583:2: rule__OneClassSimpleDef__InheritancesAssignment_4
            {
            pushFollow(FOLLOW_rule__OneClassSimpleDef__InheritancesAssignment_4_in_rule__OneClassSimpleDef__Group__45673);
            rule__OneClassSimpleDef__InheritancesAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getOneClassSimpleDefAccess().getInheritancesAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__OneClassSimpleDef__Group__5_in_rule__OneClassSimpleDef__Group__45682);
            rule__OneClassSimpleDef__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OneClassSimpleDef__Group__4


    // $ANTLR start rule__OneClassSimpleDef__Group__5
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2594:1: rule__OneClassSimpleDef__Group__5 : ( 'parentClasses:' ) rule__OneClassSimpleDef__Group__6 ;
    public final void rule__OneClassSimpleDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2598:1: ( ( 'parentClasses:' ) rule__OneClassSimpleDef__Group__6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2599:1: ( 'parentClasses:' ) rule__OneClassSimpleDef__Group__6
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2599:1: ( 'parentClasses:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2600:1: 'parentClasses:'
            {
             before(grammarAccess.getOneClassSimpleDefAccess().getParentClassesKeyword_5()); 
            match(input,31,FOLLOW_31_in_rule__OneClassSimpleDef__Group__55711); 
             after(grammarAccess.getOneClassSimpleDefAccess().getParentClassesKeyword_5()); 

            }

            pushFollow(FOLLOW_rule__OneClassSimpleDef__Group__6_in_rule__OneClassSimpleDef__Group__55721);
            rule__OneClassSimpleDef__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OneClassSimpleDef__Group__5


    // $ANTLR start rule__OneClassSimpleDef__Group__6
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2614:1: rule__OneClassSimpleDef__Group__6 : ( ( rule__OneClassSimpleDef__ParentClassesAssignment_6 ) ) ;
    public final void rule__OneClassSimpleDef__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2618:1: ( ( ( rule__OneClassSimpleDef__ParentClassesAssignment_6 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2619:1: ( ( rule__OneClassSimpleDef__ParentClassesAssignment_6 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2619:1: ( ( rule__OneClassSimpleDef__ParentClassesAssignment_6 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2620:1: ( rule__OneClassSimpleDef__ParentClassesAssignment_6 )
            {
             before(grammarAccess.getOneClassSimpleDefAccess().getParentClassesAssignment_6()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2621:1: ( rule__OneClassSimpleDef__ParentClassesAssignment_6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2621:2: rule__OneClassSimpleDef__ParentClassesAssignment_6
            {
            pushFollow(FOLLOW_rule__OneClassSimpleDef__ParentClassesAssignment_6_in_rule__OneClassSimpleDef__Group__65749);
            rule__OneClassSimpleDef__ParentClassesAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getOneClassSimpleDefAccess().getParentClassesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OneClassSimpleDef__Group__6


    // $ANTLR start rule__PogoDeviceClass__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2645:1: rule__PogoDeviceClass__Group__0 : ( 'deviceclass' ) rule__PogoDeviceClass__Group__1 ;
    public final void rule__PogoDeviceClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2649:1: ( ( 'deviceclass' ) rule__PogoDeviceClass__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2650:1: ( 'deviceclass' ) rule__PogoDeviceClass__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2650:1: ( 'deviceclass' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2651:1: 'deviceclass'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getDeviceclassKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__PogoDeviceClass__Group__05798); 
             after(grammarAccess.getPogoDeviceClassAccess().getDeviceclassKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__1_in_rule__PogoDeviceClass__Group__05808);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2665:1: rule__PogoDeviceClass__Group__1 : ( ( rule__PogoDeviceClass__NameAssignment_1 ) ) rule__PogoDeviceClass__Group__2 ;
    public final void rule__PogoDeviceClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2669:1: ( ( ( rule__PogoDeviceClass__NameAssignment_1 ) ) rule__PogoDeviceClass__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2670:1: ( ( rule__PogoDeviceClass__NameAssignment_1 ) ) rule__PogoDeviceClass__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2670:1: ( ( rule__PogoDeviceClass__NameAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2671:1: ( rule__PogoDeviceClass__NameAssignment_1 )
            {
             before(grammarAccess.getPogoDeviceClassAccess().getNameAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2672:1: ( rule__PogoDeviceClass__NameAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2672:2: rule__PogoDeviceClass__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PogoDeviceClass__NameAssignment_1_in_rule__PogoDeviceClass__Group__15836);
            rule__PogoDeviceClass__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPogoDeviceClassAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__2_in_rule__PogoDeviceClass__Group__15845);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2683:1: rule__PogoDeviceClass__Group__2 : ( ( rule__PogoDeviceClass__IsAbstractAssignment_2 )? ) rule__PogoDeviceClass__Group__3 ;
    public final void rule__PogoDeviceClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2687:1: ( ( ( rule__PogoDeviceClass__IsAbstractAssignment_2 )? ) rule__PogoDeviceClass__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2688:1: ( ( rule__PogoDeviceClass__IsAbstractAssignment_2 )? ) rule__PogoDeviceClass__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2688:1: ( ( rule__PogoDeviceClass__IsAbstractAssignment_2 )? )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2689:1: ( rule__PogoDeviceClass__IsAbstractAssignment_2 )?
            {
             before(grammarAccess.getPogoDeviceClassAccess().getIsAbstractAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2690:1: ( rule__PogoDeviceClass__IsAbstractAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==78) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2690:2: rule__PogoDeviceClass__IsAbstractAssignment_2
                    {
                    pushFollow(FOLLOW_rule__PogoDeviceClass__IsAbstractAssignment_2_in_rule__PogoDeviceClass__Group__25873);
                    rule__PogoDeviceClass__IsAbstractAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPogoDeviceClassAccess().getIsAbstractAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__3_in_rule__PogoDeviceClass__Group__25883);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2701:1: rule__PogoDeviceClass__Group__3 : ( ( rule__PogoDeviceClass__Group_3__0 )? ) rule__PogoDeviceClass__Group__4 ;
    public final void rule__PogoDeviceClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2705:1: ( ( ( rule__PogoDeviceClass__Group_3__0 )? ) rule__PogoDeviceClass__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2706:1: ( ( rule__PogoDeviceClass__Group_3__0 )? ) rule__PogoDeviceClass__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2706:1: ( ( rule__PogoDeviceClass__Group_3__0 )? )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2707:1: ( rule__PogoDeviceClass__Group_3__0 )?
            {
             before(grammarAccess.getPogoDeviceClassAccess().getGroup_3()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2708:1: ( rule__PogoDeviceClass__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==39) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2708:2: rule__PogoDeviceClass__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PogoDeviceClass__Group_3__0_in_rule__PogoDeviceClass__Group__35911);
                    rule__PogoDeviceClass__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPogoDeviceClassAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__4_in_rule__PogoDeviceClass__Group__35921);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2719:1: rule__PogoDeviceClass__Group__4 : ( '{' ) rule__PogoDeviceClass__Group__5 ;
    public final void rule__PogoDeviceClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2723:1: ( ( '{' ) rule__PogoDeviceClass__Group__5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2724:1: ( '{' ) rule__PogoDeviceClass__Group__5
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2724:1: ( '{' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2725:1: '{'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__PogoDeviceClass__Group__45950); 
             after(grammarAccess.getPogoDeviceClassAccess().getLeftCurlyBracketKeyword_4()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__5_in_rule__PogoDeviceClass__Group__45960);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2739:1: rule__PogoDeviceClass__Group__5 : ( ( rule__PogoDeviceClass__InstituteAssignment_5 ) ) rule__PogoDeviceClass__Group__6 ;
    public final void rule__PogoDeviceClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2743:1: ( ( ( rule__PogoDeviceClass__InstituteAssignment_5 ) ) rule__PogoDeviceClass__Group__6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2744:1: ( ( rule__PogoDeviceClass__InstituteAssignment_5 ) ) rule__PogoDeviceClass__Group__6
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2744:1: ( ( rule__PogoDeviceClass__InstituteAssignment_5 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2745:1: ( rule__PogoDeviceClass__InstituteAssignment_5 )
            {
             before(grammarAccess.getPogoDeviceClassAccess().getInstituteAssignment_5()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2746:1: ( rule__PogoDeviceClass__InstituteAssignment_5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2746:2: rule__PogoDeviceClass__InstituteAssignment_5
            {
            pushFollow(FOLLOW_rule__PogoDeviceClass__InstituteAssignment_5_in_rule__PogoDeviceClass__Group__55988);
            rule__PogoDeviceClass__InstituteAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getPogoDeviceClassAccess().getInstituteAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__6_in_rule__PogoDeviceClass__Group__55997);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2757:1: rule__PogoDeviceClass__Group__6 : ( 'description:' ) rule__PogoDeviceClass__Group__7 ;
    public final void rule__PogoDeviceClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2761:1: ( ( 'description:' ) rule__PogoDeviceClass__Group__7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2762:1: ( 'description:' ) rule__PogoDeviceClass__Group__7
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2762:1: ( 'description:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2763:1: 'description:'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getDescriptionKeyword_6()); 
            match(input,33,FOLLOW_33_in_rule__PogoDeviceClass__Group__66026); 
             after(grammarAccess.getPogoDeviceClassAccess().getDescriptionKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__7_in_rule__PogoDeviceClass__Group__66036);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2777:1: rule__PogoDeviceClass__Group__7 : ( ( rule__PogoDeviceClass__DescriptionAssignment_7 ) ) rule__PogoDeviceClass__Group__8 ;
    public final void rule__PogoDeviceClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2781:1: ( ( ( rule__PogoDeviceClass__DescriptionAssignment_7 ) ) rule__PogoDeviceClass__Group__8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2782:1: ( ( rule__PogoDeviceClass__DescriptionAssignment_7 ) ) rule__PogoDeviceClass__Group__8
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2782:1: ( ( rule__PogoDeviceClass__DescriptionAssignment_7 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2783:1: ( rule__PogoDeviceClass__DescriptionAssignment_7 )
            {
             before(grammarAccess.getPogoDeviceClassAccess().getDescriptionAssignment_7()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2784:1: ( rule__PogoDeviceClass__DescriptionAssignment_7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2784:2: rule__PogoDeviceClass__DescriptionAssignment_7
            {
            pushFollow(FOLLOW_rule__PogoDeviceClass__DescriptionAssignment_7_in_rule__PogoDeviceClass__Group__76064);
            rule__PogoDeviceClass__DescriptionAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getPogoDeviceClassAccess().getDescriptionAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__8_in_rule__PogoDeviceClass__Group__76073);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2795:1: rule__PogoDeviceClass__Group__8 : ( 'classProperties:' ) rule__PogoDeviceClass__Group__9 ;
    public final void rule__PogoDeviceClass__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2799:1: ( ( 'classProperties:' ) rule__PogoDeviceClass__Group__9 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2800:1: ( 'classProperties:' ) rule__PogoDeviceClass__Group__9
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2800:1: ( 'classProperties:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2801:1: 'classProperties:'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getClassPropertiesKeyword_8()); 
            match(input,34,FOLLOW_34_in_rule__PogoDeviceClass__Group__86102); 
             after(grammarAccess.getPogoDeviceClassAccess().getClassPropertiesKeyword_8()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__9_in_rule__PogoDeviceClass__Group__86112);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2815:1: rule__PogoDeviceClass__Group__9 : ( ( rule__PogoDeviceClass__ClassPropertiesAssignment_9 )* ) rule__PogoDeviceClass__Group__10 ;
    public final void rule__PogoDeviceClass__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2819:1: ( ( ( rule__PogoDeviceClass__ClassPropertiesAssignment_9 )* ) rule__PogoDeviceClass__Group__10 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2820:1: ( ( rule__PogoDeviceClass__ClassPropertiesAssignment_9 )* ) rule__PogoDeviceClass__Group__10
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2820:1: ( ( rule__PogoDeviceClass__ClassPropertiesAssignment_9 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2821:1: ( rule__PogoDeviceClass__ClassPropertiesAssignment_9 )*
            {
             before(grammarAccess.getPogoDeviceClassAccess().getClassPropertiesAssignment_9()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2822:1: ( rule__PogoDeviceClass__ClassPropertiesAssignment_9 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2822:2: rule__PogoDeviceClass__ClassPropertiesAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__PogoDeviceClass__ClassPropertiesAssignment_9_in_rule__PogoDeviceClass__Group__96140);
            	    rule__PogoDeviceClass__ClassPropertiesAssignment_9();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getPogoDeviceClassAccess().getClassPropertiesAssignment_9()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__10_in_rule__PogoDeviceClass__Group__96150);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2833:1: rule__PogoDeviceClass__Group__10 : ( 'deviceProperties:' ) rule__PogoDeviceClass__Group__11 ;
    public final void rule__PogoDeviceClass__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2837:1: ( ( 'deviceProperties:' ) rule__PogoDeviceClass__Group__11 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2838:1: ( 'deviceProperties:' ) rule__PogoDeviceClass__Group__11
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2838:1: ( 'deviceProperties:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2839:1: 'deviceProperties:'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getDevicePropertiesKeyword_10()); 
            match(input,35,FOLLOW_35_in_rule__PogoDeviceClass__Group__106179); 
             after(grammarAccess.getPogoDeviceClassAccess().getDevicePropertiesKeyword_10()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__11_in_rule__PogoDeviceClass__Group__106189);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2853:1: rule__PogoDeviceClass__Group__11 : ( ( rule__PogoDeviceClass__DevicePropertiesAssignment_11 )* ) rule__PogoDeviceClass__Group__12 ;
    public final void rule__PogoDeviceClass__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2857:1: ( ( ( rule__PogoDeviceClass__DevicePropertiesAssignment_11 )* ) rule__PogoDeviceClass__Group__12 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2858:1: ( ( rule__PogoDeviceClass__DevicePropertiesAssignment_11 )* ) rule__PogoDeviceClass__Group__12
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2858:1: ( ( rule__PogoDeviceClass__DevicePropertiesAssignment_11 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2859:1: ( rule__PogoDeviceClass__DevicePropertiesAssignment_11 )*
            {
             before(grammarAccess.getPogoDeviceClassAccess().getDevicePropertiesAssignment_11()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2860:1: ( rule__PogoDeviceClass__DevicePropertiesAssignment_11 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2860:2: rule__PogoDeviceClass__DevicePropertiesAssignment_11
            	    {
            	    pushFollow(FOLLOW_rule__PogoDeviceClass__DevicePropertiesAssignment_11_in_rule__PogoDeviceClass__Group__116217);
            	    rule__PogoDeviceClass__DevicePropertiesAssignment_11();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getPogoDeviceClassAccess().getDevicePropertiesAssignment_11()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__12_in_rule__PogoDeviceClass__Group__116227);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2871:1: rule__PogoDeviceClass__Group__12 : ( 'commands:' ) rule__PogoDeviceClass__Group__13 ;
    public final void rule__PogoDeviceClass__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2875:1: ( ( 'commands:' ) rule__PogoDeviceClass__Group__13 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2876:1: ( 'commands:' ) rule__PogoDeviceClass__Group__13
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2876:1: ( 'commands:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2877:1: 'commands:'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getCommandsKeyword_12()); 
            match(input,36,FOLLOW_36_in_rule__PogoDeviceClass__Group__126256); 
             after(grammarAccess.getPogoDeviceClassAccess().getCommandsKeyword_12()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__13_in_rule__PogoDeviceClass__Group__126266);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2891:1: rule__PogoDeviceClass__Group__13 : ( ( rule__PogoDeviceClass__CommandsAssignment_13 )* ) rule__PogoDeviceClass__Group__14 ;
    public final void rule__PogoDeviceClass__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2895:1: ( ( ( rule__PogoDeviceClass__CommandsAssignment_13 )* ) rule__PogoDeviceClass__Group__14 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2896:1: ( ( rule__PogoDeviceClass__CommandsAssignment_13 )* ) rule__PogoDeviceClass__Group__14
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2896:1: ( ( rule__PogoDeviceClass__CommandsAssignment_13 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2897:1: ( rule__PogoDeviceClass__CommandsAssignment_13 )*
            {
             before(grammarAccess.getPogoDeviceClassAccess().getCommandsAssignment_13()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2898:1: ( rule__PogoDeviceClass__CommandsAssignment_13 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2898:2: rule__PogoDeviceClass__CommandsAssignment_13
            	    {
            	    pushFollow(FOLLOW_rule__PogoDeviceClass__CommandsAssignment_13_in_rule__PogoDeviceClass__Group__136294);
            	    rule__PogoDeviceClass__CommandsAssignment_13();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getPogoDeviceClassAccess().getCommandsAssignment_13()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__14_in_rule__PogoDeviceClass__Group__136304);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2909:1: rule__PogoDeviceClass__Group__14 : ( 'attributes:' ) rule__PogoDeviceClass__Group__15 ;
    public final void rule__PogoDeviceClass__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2913:1: ( ( 'attributes:' ) rule__PogoDeviceClass__Group__15 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2914:1: ( 'attributes:' ) rule__PogoDeviceClass__Group__15
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2914:1: ( 'attributes:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2915:1: 'attributes:'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getAttributesKeyword_14()); 
            match(input,37,FOLLOW_37_in_rule__PogoDeviceClass__Group__146333); 
             after(grammarAccess.getPogoDeviceClassAccess().getAttributesKeyword_14()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__15_in_rule__PogoDeviceClass__Group__146343);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2929:1: rule__PogoDeviceClass__Group__15 : ( ( rule__PogoDeviceClass__AttributesAssignment_15 )* ) rule__PogoDeviceClass__Group__16 ;
    public final void rule__PogoDeviceClass__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2933:1: ( ( ( rule__PogoDeviceClass__AttributesAssignment_15 )* ) rule__PogoDeviceClass__Group__16 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2934:1: ( ( rule__PogoDeviceClass__AttributesAssignment_15 )* ) rule__PogoDeviceClass__Group__16
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2934:1: ( ( rule__PogoDeviceClass__AttributesAssignment_15 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2935:1: ( rule__PogoDeviceClass__AttributesAssignment_15 )*
            {
             before(grammarAccess.getPogoDeviceClassAccess().getAttributesAssignment_15()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2936:1: ( rule__PogoDeviceClass__AttributesAssignment_15 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2936:2: rule__PogoDeviceClass__AttributesAssignment_15
            	    {
            	    pushFollow(FOLLOW_rule__PogoDeviceClass__AttributesAssignment_15_in_rule__PogoDeviceClass__Group__156371);
            	    rule__PogoDeviceClass__AttributesAssignment_15();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getPogoDeviceClassAccess().getAttributesAssignment_15()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__16_in_rule__PogoDeviceClass__Group__156381);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2947:1: rule__PogoDeviceClass__Group__16 : ( 'states:' ) rule__PogoDeviceClass__Group__17 ;
    public final void rule__PogoDeviceClass__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2951:1: ( ( 'states:' ) rule__PogoDeviceClass__Group__17 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2952:1: ( 'states:' ) rule__PogoDeviceClass__Group__17
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2952:1: ( 'states:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2953:1: 'states:'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getStatesKeyword_16()); 
            match(input,38,FOLLOW_38_in_rule__PogoDeviceClass__Group__166410); 
             after(grammarAccess.getPogoDeviceClassAccess().getStatesKeyword_16()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__17_in_rule__PogoDeviceClass__Group__166420);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2967:1: rule__PogoDeviceClass__Group__17 : ( ( rule__PogoDeviceClass__StatesAssignment_17 )* ) rule__PogoDeviceClass__Group__18 ;
    public final void rule__PogoDeviceClass__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2971:1: ( ( ( rule__PogoDeviceClass__StatesAssignment_17 )* ) rule__PogoDeviceClass__Group__18 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2972:1: ( ( rule__PogoDeviceClass__StatesAssignment_17 )* ) rule__PogoDeviceClass__Group__18
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2972:1: ( ( rule__PogoDeviceClass__StatesAssignment_17 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2973:1: ( rule__PogoDeviceClass__StatesAssignment_17 )*
            {
             before(grammarAccess.getPogoDeviceClassAccess().getStatesAssignment_17()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2974:1: ( rule__PogoDeviceClass__StatesAssignment_17 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2974:2: rule__PogoDeviceClass__StatesAssignment_17
            	    {
            	    pushFollow(FOLLOW_rule__PogoDeviceClass__StatesAssignment_17_in_rule__PogoDeviceClass__Group__176448);
            	    rule__PogoDeviceClass__StatesAssignment_17();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getPogoDeviceClassAccess().getStatesAssignment_17()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__18_in_rule__PogoDeviceClass__Group__176458);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2985:1: rule__PogoDeviceClass__Group__18 : ( ( rule__PogoDeviceClass__PreferencesAssignment_18 ) ) rule__PogoDeviceClass__Group__19 ;
    public final void rule__PogoDeviceClass__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2989:1: ( ( ( rule__PogoDeviceClass__PreferencesAssignment_18 ) ) rule__PogoDeviceClass__Group__19 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2990:1: ( ( rule__PogoDeviceClass__PreferencesAssignment_18 ) ) rule__PogoDeviceClass__Group__19
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2990:1: ( ( rule__PogoDeviceClass__PreferencesAssignment_18 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2991:1: ( rule__PogoDeviceClass__PreferencesAssignment_18 )
            {
             before(grammarAccess.getPogoDeviceClassAccess().getPreferencesAssignment_18()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2992:1: ( rule__PogoDeviceClass__PreferencesAssignment_18 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2992:2: rule__PogoDeviceClass__PreferencesAssignment_18
            {
            pushFollow(FOLLOW_rule__PogoDeviceClass__PreferencesAssignment_18_in_rule__PogoDeviceClass__Group__186486);
            rule__PogoDeviceClass__PreferencesAssignment_18();
            _fsp--;


            }

             after(grammarAccess.getPogoDeviceClassAccess().getPreferencesAssignment_18()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__19_in_rule__PogoDeviceClass__Group__186495);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3003:1: rule__PogoDeviceClass__Group__19 : ( '}' ) ;
    public final void rule__PogoDeviceClass__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3007:1: ( ( '}' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3008:1: ( '}' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3008:1: ( '}' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3009:1: '}'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getRightCurlyBracketKeyword_19()); 
            match(input,29,FOLLOW_29_in_rule__PogoDeviceClass__Group__196524); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3062:1: rule__PogoDeviceClass__Group_3__0 : ( 'extends' ) rule__PogoDeviceClass__Group_3__1 ;
    public final void rule__PogoDeviceClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3066:1: ( ( 'extends' ) rule__PogoDeviceClass__Group_3__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3067:1: ( 'extends' ) rule__PogoDeviceClass__Group_3__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3067:1: ( 'extends' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3068:1: 'extends'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getExtendsKeyword_3_0()); 
            match(input,39,FOLLOW_39_in_rule__PogoDeviceClass__Group_3__06600); 
             after(grammarAccess.getPogoDeviceClassAccess().getExtendsKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group_3__1_in_rule__PogoDeviceClass__Group_3__06610);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3082:1: rule__PogoDeviceClass__Group_3__1 : ( ( rule__PogoDeviceClass__BaseClassAssignment_3_1 ) ) ;
    public final void rule__PogoDeviceClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3086:1: ( ( ( rule__PogoDeviceClass__BaseClassAssignment_3_1 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3087:1: ( ( rule__PogoDeviceClass__BaseClassAssignment_3_1 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3087:1: ( ( rule__PogoDeviceClass__BaseClassAssignment_3_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3088:1: ( rule__PogoDeviceClass__BaseClassAssignment_3_1 )
            {
             before(grammarAccess.getPogoDeviceClassAccess().getBaseClassAssignment_3_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3089:1: ( rule__PogoDeviceClass__BaseClassAssignment_3_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3089:2: rule__PogoDeviceClass__BaseClassAssignment_3_1
            {
            pushFollow(FOLLOW_rule__PogoDeviceClass__BaseClassAssignment_3_1_in_rule__PogoDeviceClass__Group_3__16638);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3103:1: rule__ClassDescription__Group__0 : ( ( rule__ClassDescription__DescriptionAssignment_0 ) ) rule__ClassDescription__Group__1 ;
    public final void rule__ClassDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3107:1: ( ( ( rule__ClassDescription__DescriptionAssignment_0 ) ) rule__ClassDescription__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3108:1: ( ( rule__ClassDescription__DescriptionAssignment_0 ) ) rule__ClassDescription__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3108:1: ( ( rule__ClassDescription__DescriptionAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3109:1: ( rule__ClassDescription__DescriptionAssignment_0 )
            {
             before(grammarAccess.getClassDescriptionAccess().getDescriptionAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3110:1: ( rule__ClassDescription__DescriptionAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3110:2: rule__ClassDescription__DescriptionAssignment_0
            {
            pushFollow(FOLLOW_rule__ClassDescription__DescriptionAssignment_0_in_rule__ClassDescription__Group__06676);
            rule__ClassDescription__DescriptionAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__1_in_rule__ClassDescription__Group__06685);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3121:1: rule__ClassDescription__Group__1 : ( ( rule__ClassDescription__TitleAssignment_1 ) ) rule__ClassDescription__Group__2 ;
    public final void rule__ClassDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3125:1: ( ( ( rule__ClassDescription__TitleAssignment_1 ) ) rule__ClassDescription__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3126:1: ( ( rule__ClassDescription__TitleAssignment_1 ) ) rule__ClassDescription__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3126:1: ( ( rule__ClassDescription__TitleAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3127:1: ( rule__ClassDescription__TitleAssignment_1 )
            {
             before(grammarAccess.getClassDescriptionAccess().getTitleAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3128:1: ( rule__ClassDescription__TitleAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3128:2: rule__ClassDescription__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__ClassDescription__TitleAssignment_1_in_rule__ClassDescription__Group__16713);
            rule__ClassDescription__TitleAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getTitleAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__2_in_rule__ClassDescription__Group__16722);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3139:1: rule__ClassDescription__Group__2 : ( ( rule__ClassDescription__SourcePathAssignment_2 ) ) rule__ClassDescription__Group__3 ;
    public final void rule__ClassDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3143:1: ( ( ( rule__ClassDescription__SourcePathAssignment_2 ) ) rule__ClassDescription__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3144:1: ( ( rule__ClassDescription__SourcePathAssignment_2 ) ) rule__ClassDescription__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3144:1: ( ( rule__ClassDescription__SourcePathAssignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3145:1: ( rule__ClassDescription__SourcePathAssignment_2 )
            {
             before(grammarAccess.getClassDescriptionAccess().getSourcePathAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3146:1: ( rule__ClassDescription__SourcePathAssignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3146:2: rule__ClassDescription__SourcePathAssignment_2
            {
            pushFollow(FOLLOW_rule__ClassDescription__SourcePathAssignment_2_in_rule__ClassDescription__Group__26750);
            rule__ClassDescription__SourcePathAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getSourcePathAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__3_in_rule__ClassDescription__Group__26759);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3157:1: rule__ClassDescription__Group__3 : ( 'inheritances:' ) rule__ClassDescription__Group__4 ;
    public final void rule__ClassDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3161:1: ( ( 'inheritances:' ) rule__ClassDescription__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3162:1: ( 'inheritances:' ) rule__ClassDescription__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3162:1: ( 'inheritances:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3163:1: 'inheritances:'
            {
             before(grammarAccess.getClassDescriptionAccess().getInheritancesKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__ClassDescription__Group__36788); 
             after(grammarAccess.getClassDescriptionAccess().getInheritancesKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__4_in_rule__ClassDescription__Group__36798);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3177:1: rule__ClassDescription__Group__4 : ( ( rule__ClassDescription__InheritancesAssignment_4 ) ) rule__ClassDescription__Group__5 ;
    public final void rule__ClassDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3181:1: ( ( ( rule__ClassDescription__InheritancesAssignment_4 ) ) rule__ClassDescription__Group__5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3182:1: ( ( rule__ClassDescription__InheritancesAssignment_4 ) ) rule__ClassDescription__Group__5
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3182:1: ( ( rule__ClassDescription__InheritancesAssignment_4 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3183:1: ( rule__ClassDescription__InheritancesAssignment_4 )
            {
             before(grammarAccess.getClassDescriptionAccess().getInheritancesAssignment_4()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3184:1: ( rule__ClassDescription__InheritancesAssignment_4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3184:2: rule__ClassDescription__InheritancesAssignment_4
            {
            pushFollow(FOLLOW_rule__ClassDescription__InheritancesAssignment_4_in_rule__ClassDescription__Group__46826);
            rule__ClassDescription__InheritancesAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getInheritancesAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__5_in_rule__ClassDescription__Group__46835);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3195:1: rule__ClassDescription__Group__5 : ( ( rule__ClassDescription__LanguageAssignment_5 ) ) rule__ClassDescription__Group__6 ;
    public final void rule__ClassDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3199:1: ( ( ( rule__ClassDescription__LanguageAssignment_5 ) ) rule__ClassDescription__Group__6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3200:1: ( ( rule__ClassDescription__LanguageAssignment_5 ) ) rule__ClassDescription__Group__6
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3200:1: ( ( rule__ClassDescription__LanguageAssignment_5 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3201:1: ( rule__ClassDescription__LanguageAssignment_5 )
            {
             before(grammarAccess.getClassDescriptionAccess().getLanguageAssignment_5()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3202:1: ( rule__ClassDescription__LanguageAssignment_5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3202:2: rule__ClassDescription__LanguageAssignment_5
            {
            pushFollow(FOLLOW_rule__ClassDescription__LanguageAssignment_5_in_rule__ClassDescription__Group__56863);
            rule__ClassDescription__LanguageAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getLanguageAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__6_in_rule__ClassDescription__Group__56872);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3213:1: rule__ClassDescription__Group__6 : ( ( rule__ClassDescription__FilestogenerateAssignment_6 ) ) rule__ClassDescription__Group__7 ;
    public final void rule__ClassDescription__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3217:1: ( ( ( rule__ClassDescription__FilestogenerateAssignment_6 ) ) rule__ClassDescription__Group__7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3218:1: ( ( rule__ClassDescription__FilestogenerateAssignment_6 ) ) rule__ClassDescription__Group__7
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3218:1: ( ( rule__ClassDescription__FilestogenerateAssignment_6 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3219:1: ( rule__ClassDescription__FilestogenerateAssignment_6 )
            {
             before(grammarAccess.getClassDescriptionAccess().getFilestogenerateAssignment_6()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3220:1: ( rule__ClassDescription__FilestogenerateAssignment_6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3220:2: rule__ClassDescription__FilestogenerateAssignment_6
            {
            pushFollow(FOLLOW_rule__ClassDescription__FilestogenerateAssignment_6_in_rule__ClassDescription__Group__66900);
            rule__ClassDescription__FilestogenerateAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getFilestogenerateAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__7_in_rule__ClassDescription__Group__66909);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3231:1: rule__ClassDescription__Group__7 : ( ( rule__ClassDescription__IdentificationAssignment_7 ) ) rule__ClassDescription__Group__8 ;
    public final void rule__ClassDescription__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3235:1: ( ( ( rule__ClassDescription__IdentificationAssignment_7 ) ) rule__ClassDescription__Group__8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3236:1: ( ( rule__ClassDescription__IdentificationAssignment_7 ) ) rule__ClassDescription__Group__8
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3236:1: ( ( rule__ClassDescription__IdentificationAssignment_7 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3237:1: ( rule__ClassDescription__IdentificationAssignment_7 )
            {
             before(grammarAccess.getClassDescriptionAccess().getIdentificationAssignment_7()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3238:1: ( rule__ClassDescription__IdentificationAssignment_7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3238:2: rule__ClassDescription__IdentificationAssignment_7
            {
            pushFollow(FOLLOW_rule__ClassDescription__IdentificationAssignment_7_in_rule__ClassDescription__Group__76937);
            rule__ClassDescription__IdentificationAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getIdentificationAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__8_in_rule__ClassDescription__Group__76946);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3249:1: rule__ClassDescription__Group__8 : ( ( rule__ClassDescription__CommentsAssignment_8 ) ) rule__ClassDescription__Group__9 ;
    public final void rule__ClassDescription__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3253:1: ( ( ( rule__ClassDescription__CommentsAssignment_8 ) ) rule__ClassDescription__Group__9 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3254:1: ( ( rule__ClassDescription__CommentsAssignment_8 ) ) rule__ClassDescription__Group__9
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3254:1: ( ( rule__ClassDescription__CommentsAssignment_8 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3255:1: ( rule__ClassDescription__CommentsAssignment_8 )
            {
             before(grammarAccess.getClassDescriptionAccess().getCommentsAssignment_8()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3256:1: ( rule__ClassDescription__CommentsAssignment_8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3256:2: rule__ClassDescription__CommentsAssignment_8
            {
            pushFollow(FOLLOW_rule__ClassDescription__CommentsAssignment_8_in_rule__ClassDescription__Group__86974);
            rule__ClassDescription__CommentsAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getCommentsAssignment_8()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__9_in_rule__ClassDescription__Group__86983);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3267:1: rule__ClassDescription__Group__9 : ( ( rule__ClassDescription__HasAbstractCommandAssignment_9 ) ) rule__ClassDescription__Group__10 ;
    public final void rule__ClassDescription__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3271:1: ( ( ( rule__ClassDescription__HasAbstractCommandAssignment_9 ) ) rule__ClassDescription__Group__10 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3272:1: ( ( rule__ClassDescription__HasAbstractCommandAssignment_9 ) ) rule__ClassDescription__Group__10
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3272:1: ( ( rule__ClassDescription__HasAbstractCommandAssignment_9 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3273:1: ( rule__ClassDescription__HasAbstractCommandAssignment_9 )
            {
             before(grammarAccess.getClassDescriptionAccess().getHasAbstractCommandAssignment_9()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3274:1: ( rule__ClassDescription__HasAbstractCommandAssignment_9 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3274:2: rule__ClassDescription__HasAbstractCommandAssignment_9
            {
            pushFollow(FOLLOW_rule__ClassDescription__HasAbstractCommandAssignment_9_in_rule__ClassDescription__Group__97011);
            rule__ClassDescription__HasAbstractCommandAssignment_9();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getHasAbstractCommandAssignment_9()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__10_in_rule__ClassDescription__Group__97020);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3285:1: rule__ClassDescription__Group__10 : ( ( rule__ClassDescription__HasAbstractAttributeAssignment_10 ) ) rule__ClassDescription__Group__11 ;
    public final void rule__ClassDescription__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3289:1: ( ( ( rule__ClassDescription__HasAbstractAttributeAssignment_10 ) ) rule__ClassDescription__Group__11 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3290:1: ( ( rule__ClassDescription__HasAbstractAttributeAssignment_10 ) ) rule__ClassDescription__Group__11
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3290:1: ( ( rule__ClassDescription__HasAbstractAttributeAssignment_10 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3291:1: ( rule__ClassDescription__HasAbstractAttributeAssignment_10 )
            {
             before(grammarAccess.getClassDescriptionAccess().getHasAbstractAttributeAssignment_10()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3292:1: ( rule__ClassDescription__HasAbstractAttributeAssignment_10 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3292:2: rule__ClassDescription__HasAbstractAttributeAssignment_10
            {
            pushFollow(FOLLOW_rule__ClassDescription__HasAbstractAttributeAssignment_10_in_rule__ClassDescription__Group__107048);
            rule__ClassDescription__HasAbstractAttributeAssignment_10();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getHasAbstractAttributeAssignment_10()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__11_in_rule__ClassDescription__Group__107057);
            rule__ClassDescription__Group__11();
            _fsp--;


            }

        }
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


    // $ANTLR start rule__ClassDescription__Group__11
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3303:1: rule__ClassDescription__Group__11 : ( ( rule__ClassDescription__HasDynamicAttributeAssignment_11 ) ) ;
    public final void rule__ClassDescription__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3307:1: ( ( ( rule__ClassDescription__HasDynamicAttributeAssignment_11 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3308:1: ( ( rule__ClassDescription__HasDynamicAttributeAssignment_11 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3308:1: ( ( rule__ClassDescription__HasDynamicAttributeAssignment_11 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3309:1: ( rule__ClassDescription__HasDynamicAttributeAssignment_11 )
            {
             before(grammarAccess.getClassDescriptionAccess().getHasDynamicAttributeAssignment_11()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3310:1: ( rule__ClassDescription__HasDynamicAttributeAssignment_11 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3310:2: rule__ClassDescription__HasDynamicAttributeAssignment_11
            {
            pushFollow(FOLLOW_rule__ClassDescription__HasDynamicAttributeAssignment_11_in_rule__ClassDescription__Group__117085);
            rule__ClassDescription__HasDynamicAttributeAssignment_11();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getHasDynamicAttributeAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassDescription__Group__11


    // $ANTLR start rule__Inheritance__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3344:1: rule__Inheritance__Group__0 : ( ( rule__Inheritance__ClassnameAssignment_0 ) ) rule__Inheritance__Group__1 ;
    public final void rule__Inheritance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3348:1: ( ( ( rule__Inheritance__ClassnameAssignment_0 ) ) rule__Inheritance__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3349:1: ( ( rule__Inheritance__ClassnameAssignment_0 ) ) rule__Inheritance__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3349:1: ( ( rule__Inheritance__ClassnameAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3350:1: ( rule__Inheritance__ClassnameAssignment_0 )
            {
             before(grammarAccess.getInheritanceAccess().getClassnameAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3351:1: ( rule__Inheritance__ClassnameAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3351:2: rule__Inheritance__ClassnameAssignment_0
            {
            pushFollow(FOLLOW_rule__Inheritance__ClassnameAssignment_0_in_rule__Inheritance__Group__07143);
            rule__Inheritance__ClassnameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getInheritanceAccess().getClassnameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Inheritance__Group__1_in_rule__Inheritance__Group__07152);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3362:1: rule__Inheritance__Group__1 : ( ( rule__Inheritance__SourcePathAssignment_1 ) ) ;
    public final void rule__Inheritance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3366:1: ( ( ( rule__Inheritance__SourcePathAssignment_1 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3367:1: ( ( rule__Inheritance__SourcePathAssignment_1 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3367:1: ( ( rule__Inheritance__SourcePathAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3368:1: ( rule__Inheritance__SourcePathAssignment_1 )
            {
             before(grammarAccess.getInheritanceAccess().getSourcePathAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3369:1: ( rule__Inheritance__SourcePathAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3369:2: rule__Inheritance__SourcePathAssignment_1
            {
            pushFollow(FOLLOW_rule__Inheritance__SourcePathAssignment_1_in_rule__Inheritance__Group__17180);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3383:1: rule__ClassIdentification__Group__0 : ( ( rule__ClassIdentification__ContactAssignment_0 ) ) rule__ClassIdentification__Group__1 ;
    public final void rule__ClassIdentification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3387:1: ( ( ( rule__ClassIdentification__ContactAssignment_0 ) ) rule__ClassIdentification__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3388:1: ( ( rule__ClassIdentification__ContactAssignment_0 ) ) rule__ClassIdentification__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3388:1: ( ( rule__ClassIdentification__ContactAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3389:1: ( rule__ClassIdentification__ContactAssignment_0 )
            {
             before(grammarAccess.getClassIdentificationAccess().getContactAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3390:1: ( rule__ClassIdentification__ContactAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3390:2: rule__ClassIdentification__ContactAssignment_0
            {
            pushFollow(FOLLOW_rule__ClassIdentification__ContactAssignment_0_in_rule__ClassIdentification__Group__07218);
            rule__ClassIdentification__ContactAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getClassIdentificationAccess().getContactAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ClassIdentification__Group__1_in_rule__ClassIdentification__Group__07227);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3401:1: rule__ClassIdentification__Group__1 : ( ( rule__ClassIdentification__AuthorAssignment_1 ) ) rule__ClassIdentification__Group__2 ;
    public final void rule__ClassIdentification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3405:1: ( ( ( rule__ClassIdentification__AuthorAssignment_1 ) ) rule__ClassIdentification__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3406:1: ( ( rule__ClassIdentification__AuthorAssignment_1 ) ) rule__ClassIdentification__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3406:1: ( ( rule__ClassIdentification__AuthorAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3407:1: ( rule__ClassIdentification__AuthorAssignment_1 )
            {
             before(grammarAccess.getClassIdentificationAccess().getAuthorAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3408:1: ( rule__ClassIdentification__AuthorAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3408:2: rule__ClassIdentification__AuthorAssignment_1
            {
            pushFollow(FOLLOW_rule__ClassIdentification__AuthorAssignment_1_in_rule__ClassIdentification__Group__17255);
            rule__ClassIdentification__AuthorAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getClassIdentificationAccess().getAuthorAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__ClassIdentification__Group__2_in_rule__ClassIdentification__Group__17264);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3419:1: rule__ClassIdentification__Group__2 : ( ( rule__ClassIdentification__EmailDomainAssignment_2 ) ) rule__ClassIdentification__Group__3 ;
    public final void rule__ClassIdentification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3423:1: ( ( ( rule__ClassIdentification__EmailDomainAssignment_2 ) ) rule__ClassIdentification__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3424:1: ( ( rule__ClassIdentification__EmailDomainAssignment_2 ) ) rule__ClassIdentification__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3424:1: ( ( rule__ClassIdentification__EmailDomainAssignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3425:1: ( rule__ClassIdentification__EmailDomainAssignment_2 )
            {
             before(grammarAccess.getClassIdentificationAccess().getEmailDomainAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3426:1: ( rule__ClassIdentification__EmailDomainAssignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3426:2: rule__ClassIdentification__EmailDomainAssignment_2
            {
            pushFollow(FOLLOW_rule__ClassIdentification__EmailDomainAssignment_2_in_rule__ClassIdentification__Group__27292);
            rule__ClassIdentification__EmailDomainAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getClassIdentificationAccess().getEmailDomainAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__ClassIdentification__Group__3_in_rule__ClassIdentification__Group__27301);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3437:1: rule__ClassIdentification__Group__3 : ( ( rule__ClassIdentification__ClassFamilyAssignment_3 ) ) rule__ClassIdentification__Group__4 ;
    public final void rule__ClassIdentification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3441:1: ( ( ( rule__ClassIdentification__ClassFamilyAssignment_3 ) ) rule__ClassIdentification__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3442:1: ( ( rule__ClassIdentification__ClassFamilyAssignment_3 ) ) rule__ClassIdentification__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3442:1: ( ( rule__ClassIdentification__ClassFamilyAssignment_3 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3443:1: ( rule__ClassIdentification__ClassFamilyAssignment_3 )
            {
             before(grammarAccess.getClassIdentificationAccess().getClassFamilyAssignment_3()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3444:1: ( rule__ClassIdentification__ClassFamilyAssignment_3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3444:2: rule__ClassIdentification__ClassFamilyAssignment_3
            {
            pushFollow(FOLLOW_rule__ClassIdentification__ClassFamilyAssignment_3_in_rule__ClassIdentification__Group__37329);
            rule__ClassIdentification__ClassFamilyAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getClassIdentificationAccess().getClassFamilyAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__ClassIdentification__Group__4_in_rule__ClassIdentification__Group__37338);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3455:1: rule__ClassIdentification__Group__4 : ( ( rule__ClassIdentification__SiteSpecificAssignment_4 ) ) rule__ClassIdentification__Group__5 ;
    public final void rule__ClassIdentification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3459:1: ( ( ( rule__ClassIdentification__SiteSpecificAssignment_4 ) ) rule__ClassIdentification__Group__5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3460:1: ( ( rule__ClassIdentification__SiteSpecificAssignment_4 ) ) rule__ClassIdentification__Group__5
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3460:1: ( ( rule__ClassIdentification__SiteSpecificAssignment_4 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3461:1: ( rule__ClassIdentification__SiteSpecificAssignment_4 )
            {
             before(grammarAccess.getClassIdentificationAccess().getSiteSpecificAssignment_4()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3462:1: ( rule__ClassIdentification__SiteSpecificAssignment_4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3462:2: rule__ClassIdentification__SiteSpecificAssignment_4
            {
            pushFollow(FOLLOW_rule__ClassIdentification__SiteSpecificAssignment_4_in_rule__ClassIdentification__Group__47366);
            rule__ClassIdentification__SiteSpecificAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getClassIdentificationAccess().getSiteSpecificAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__ClassIdentification__Group__5_in_rule__ClassIdentification__Group__47375);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3473:1: rule__ClassIdentification__Group__5 : ( ( rule__ClassIdentification__PlatformAssignment_5 ) ) rule__ClassIdentification__Group__6 ;
    public final void rule__ClassIdentification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3477:1: ( ( ( rule__ClassIdentification__PlatformAssignment_5 ) ) rule__ClassIdentification__Group__6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3478:1: ( ( rule__ClassIdentification__PlatformAssignment_5 ) ) rule__ClassIdentification__Group__6
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3478:1: ( ( rule__ClassIdentification__PlatformAssignment_5 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3479:1: ( rule__ClassIdentification__PlatformAssignment_5 )
            {
             before(grammarAccess.getClassIdentificationAccess().getPlatformAssignment_5()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3480:1: ( rule__ClassIdentification__PlatformAssignment_5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3480:2: rule__ClassIdentification__PlatformAssignment_5
            {
            pushFollow(FOLLOW_rule__ClassIdentification__PlatformAssignment_5_in_rule__ClassIdentification__Group__57403);
            rule__ClassIdentification__PlatformAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getClassIdentificationAccess().getPlatformAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__ClassIdentification__Group__6_in_rule__ClassIdentification__Group__57412);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3491:1: rule__ClassIdentification__Group__6 : ( ( rule__ClassIdentification__BusAssignment_6 ) ) rule__ClassIdentification__Group__7 ;
    public final void rule__ClassIdentification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3495:1: ( ( ( rule__ClassIdentification__BusAssignment_6 ) ) rule__ClassIdentification__Group__7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3496:1: ( ( rule__ClassIdentification__BusAssignment_6 ) ) rule__ClassIdentification__Group__7
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3496:1: ( ( rule__ClassIdentification__BusAssignment_6 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3497:1: ( rule__ClassIdentification__BusAssignment_6 )
            {
             before(grammarAccess.getClassIdentificationAccess().getBusAssignment_6()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3498:1: ( rule__ClassIdentification__BusAssignment_6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3498:2: rule__ClassIdentification__BusAssignment_6
            {
            pushFollow(FOLLOW_rule__ClassIdentification__BusAssignment_6_in_rule__ClassIdentification__Group__67440);
            rule__ClassIdentification__BusAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getClassIdentificationAccess().getBusAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__ClassIdentification__Group__7_in_rule__ClassIdentification__Group__67449);
            rule__ClassIdentification__Group__7();
            _fsp--;


            }

        }
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


    // $ANTLR start rule__ClassIdentification__Group__7
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3509:1: rule__ClassIdentification__Group__7 : ( ( rule__ClassIdentification__ManufacturerAssignment_7 ) ) rule__ClassIdentification__Group__8 ;
    public final void rule__ClassIdentification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3513:1: ( ( ( rule__ClassIdentification__ManufacturerAssignment_7 ) ) rule__ClassIdentification__Group__8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3514:1: ( ( rule__ClassIdentification__ManufacturerAssignment_7 ) ) rule__ClassIdentification__Group__8
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3514:1: ( ( rule__ClassIdentification__ManufacturerAssignment_7 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3515:1: ( rule__ClassIdentification__ManufacturerAssignment_7 )
            {
             before(grammarAccess.getClassIdentificationAccess().getManufacturerAssignment_7()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3516:1: ( rule__ClassIdentification__ManufacturerAssignment_7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3516:2: rule__ClassIdentification__ManufacturerAssignment_7
            {
            pushFollow(FOLLOW_rule__ClassIdentification__ManufacturerAssignment_7_in_rule__ClassIdentification__Group__77477);
            rule__ClassIdentification__ManufacturerAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getClassIdentificationAccess().getManufacturerAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__ClassIdentification__Group__8_in_rule__ClassIdentification__Group__77486);
            rule__ClassIdentification__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassIdentification__Group__7


    // $ANTLR start rule__ClassIdentification__Group__8
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3527:1: rule__ClassIdentification__Group__8 : ( ( rule__ClassIdentification__ReferenceAssignment_8 ) ) ;
    public final void rule__ClassIdentification__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3531:1: ( ( ( rule__ClassIdentification__ReferenceAssignment_8 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3532:1: ( ( rule__ClassIdentification__ReferenceAssignment_8 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3532:1: ( ( rule__ClassIdentification__ReferenceAssignment_8 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3533:1: ( rule__ClassIdentification__ReferenceAssignment_8 )
            {
             before(grammarAccess.getClassIdentificationAccess().getReferenceAssignment_8()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3534:1: ( rule__ClassIdentification__ReferenceAssignment_8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3534:2: rule__ClassIdentification__ReferenceAssignment_8
            {
            pushFollow(FOLLOW_rule__ClassIdentification__ReferenceAssignment_8_in_rule__ClassIdentification__Group__87514);
            rule__ClassIdentification__ReferenceAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getClassIdentificationAccess().getReferenceAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassIdentification__Group__8


    // $ANTLR start rule__Comments__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3562:1: rule__Comments__Group__0 : ( ( rule__Comments__HtmlInheritanceAssignment_0 ) ) rule__Comments__Group__1 ;
    public final void rule__Comments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3566:1: ( ( ( rule__Comments__HtmlInheritanceAssignment_0 ) ) rule__Comments__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3567:1: ( ( rule__Comments__HtmlInheritanceAssignment_0 ) ) rule__Comments__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3567:1: ( ( rule__Comments__HtmlInheritanceAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3568:1: ( rule__Comments__HtmlInheritanceAssignment_0 )
            {
             before(grammarAccess.getCommentsAccess().getHtmlInheritanceAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3569:1: ( rule__Comments__HtmlInheritanceAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3569:2: rule__Comments__HtmlInheritanceAssignment_0
            {
            pushFollow(FOLLOW_rule__Comments__HtmlInheritanceAssignment_0_in_rule__Comments__Group__07566);
            rule__Comments__HtmlInheritanceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getCommentsAccess().getHtmlInheritanceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Comments__Group__1_in_rule__Comments__Group__07575);
            rule__Comments__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Comments__Group__0


    // $ANTLR start rule__Comments__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3580:1: rule__Comments__Group__1 : ( ( rule__Comments__CommandsTableAssignment_1 ) ) ;
    public final void rule__Comments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3584:1: ( ( ( rule__Comments__CommandsTableAssignment_1 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3585:1: ( ( rule__Comments__CommandsTableAssignment_1 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3585:1: ( ( rule__Comments__CommandsTableAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3586:1: ( rule__Comments__CommandsTableAssignment_1 )
            {
             before(grammarAccess.getCommentsAccess().getCommandsTableAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3587:1: ( rule__Comments__CommandsTableAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3587:2: rule__Comments__CommandsTableAssignment_1
            {
            pushFollow(FOLLOW_rule__Comments__CommandsTableAssignment_1_in_rule__Comments__Group__17603);
            rule__Comments__CommandsTableAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getCommentsAccess().getCommandsTableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Comments__Group__1


    // $ANTLR start rule__Preferences__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3601:1: rule__Preferences__Group__0 : ( ( rule__Preferences__DocHomeAssignment_0 ) ) rule__Preferences__Group__1 ;
    public final void rule__Preferences__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3605:1: ( ( ( rule__Preferences__DocHomeAssignment_0 ) ) rule__Preferences__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3606:1: ( ( rule__Preferences__DocHomeAssignment_0 ) ) rule__Preferences__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3606:1: ( ( rule__Preferences__DocHomeAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3607:1: ( rule__Preferences__DocHomeAssignment_0 )
            {
             before(grammarAccess.getPreferencesAccess().getDocHomeAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3608:1: ( rule__Preferences__DocHomeAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3608:2: rule__Preferences__DocHomeAssignment_0
            {
            pushFollow(FOLLOW_rule__Preferences__DocHomeAssignment_0_in_rule__Preferences__Group__07641);
            rule__Preferences__DocHomeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getPreferencesAccess().getDocHomeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Preferences__Group__1_in_rule__Preferences__Group__07650);
            rule__Preferences__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Preferences__Group__0


    // $ANTLR start rule__Preferences__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3619:1: rule__Preferences__Group__1 : ( ( rule__Preferences__MakefileHomeAssignment_1 ) ) rule__Preferences__Group__2 ;
    public final void rule__Preferences__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3623:1: ( ( ( rule__Preferences__MakefileHomeAssignment_1 ) ) rule__Preferences__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3624:1: ( ( rule__Preferences__MakefileHomeAssignment_1 ) ) rule__Preferences__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3624:1: ( ( rule__Preferences__MakefileHomeAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3625:1: ( rule__Preferences__MakefileHomeAssignment_1 )
            {
             before(grammarAccess.getPreferencesAccess().getMakefileHomeAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3626:1: ( rule__Preferences__MakefileHomeAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3626:2: rule__Preferences__MakefileHomeAssignment_1
            {
            pushFollow(FOLLOW_rule__Preferences__MakefileHomeAssignment_1_in_rule__Preferences__Group__17678);
            rule__Preferences__MakefileHomeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPreferencesAccess().getMakefileHomeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Preferences__Group__2_in_rule__Preferences__Group__17687);
            rule__Preferences__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Preferences__Group__1


    // $ANTLR start rule__Preferences__Group__2
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3637:1: rule__Preferences__Group__2 : ( ( rule__Preferences__InstallHomeAssignment_2 ) ) rule__Preferences__Group__3 ;
    public final void rule__Preferences__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3641:1: ( ( ( rule__Preferences__InstallHomeAssignment_2 ) ) rule__Preferences__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3642:1: ( ( rule__Preferences__InstallHomeAssignment_2 ) ) rule__Preferences__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3642:1: ( ( rule__Preferences__InstallHomeAssignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3643:1: ( rule__Preferences__InstallHomeAssignment_2 )
            {
             before(grammarAccess.getPreferencesAccess().getInstallHomeAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3644:1: ( rule__Preferences__InstallHomeAssignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3644:2: rule__Preferences__InstallHomeAssignment_2
            {
            pushFollow(FOLLOW_rule__Preferences__InstallHomeAssignment_2_in_rule__Preferences__Group__27715);
            rule__Preferences__InstallHomeAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getPreferencesAccess().getInstallHomeAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Preferences__Group__3_in_rule__Preferences__Group__27724);
            rule__Preferences__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Preferences__Group__2


    // $ANTLR start rule__Preferences__Group__3
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3655:1: rule__Preferences__Group__3 : ( ( rule__Preferences__HtmlVersionAssignment_3 ) ) ;
    public final void rule__Preferences__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3659:1: ( ( ( rule__Preferences__HtmlVersionAssignment_3 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3660:1: ( ( rule__Preferences__HtmlVersionAssignment_3 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3660:1: ( ( rule__Preferences__HtmlVersionAssignment_3 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3661:1: ( rule__Preferences__HtmlVersionAssignment_3 )
            {
             before(grammarAccess.getPreferencesAccess().getHtmlVersionAssignment_3()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3662:1: ( rule__Preferences__HtmlVersionAssignment_3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3662:2: rule__Preferences__HtmlVersionAssignment_3
            {
            pushFollow(FOLLOW_rule__Preferences__HtmlVersionAssignment_3_in_rule__Preferences__Group__37752);
            rule__Preferences__HtmlVersionAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getPreferencesAccess().getHtmlVersionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Preferences__Group__3


    // $ANTLR start rule__State__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3680:1: rule__State__Group__0 : ( ( rule__State__NameAssignment_0 ) ) rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3684:1: ( ( ( rule__State__NameAssignment_0 ) ) rule__State__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3685:1: ( ( rule__State__NameAssignment_0 ) ) rule__State__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3685:1: ( ( rule__State__NameAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3686:1: ( rule__State__NameAssignment_0 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3687:1: ( rule__State__NameAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3687:2: rule__State__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_0_in_rule__State__Group__07794);
            rule__State__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__07803);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3698:1: rule__State__Group__1 : ( ( rule__State__DescriptionAssignment_1 ) ) rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3702:1: ( ( ( rule__State__DescriptionAssignment_1 ) ) rule__State__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3703:1: ( ( rule__State__DescriptionAssignment_1 ) ) rule__State__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3703:1: ( ( rule__State__DescriptionAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3704:1: ( rule__State__DescriptionAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getDescriptionAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3705:1: ( rule__State__DescriptionAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3705:2: rule__State__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__State__DescriptionAssignment_1_in_rule__State__Group__17831);
            rule__State__DescriptionAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getStateAccess().getDescriptionAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__17840);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3716:1: rule__State__Group__2 : ( ( rule__State__StatusAssignment_2 ) ) ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3720:1: ( ( ( rule__State__StatusAssignment_2 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3721:1: ( ( rule__State__StatusAssignment_2 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3721:1: ( ( rule__State__StatusAssignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3722:1: ( rule__State__StatusAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getStatusAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3723:1: ( rule__State__StatusAssignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3723:2: rule__State__StatusAssignment_2
            {
            pushFollow(FOLLOW_rule__State__StatusAssignment_2_in_rule__State__Group__27868);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3739:1: rule__Property__Group__0 : ( ( rule__Property__NameAssignment_0 ) ) rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3743:1: ( ( ( rule__Property__NameAssignment_0 ) ) rule__Property__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3744:1: ( ( rule__Property__NameAssignment_0 ) ) rule__Property__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3744:1: ( ( rule__Property__NameAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3745:1: ( rule__Property__NameAssignment_0 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3746:1: ( rule__Property__NameAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3746:2: rule__Property__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Property__NameAssignment_0_in_rule__Property__Group__07908);
            rule__Property__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__07917);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3757:1: rule__Property__Group__1 : ( ( rule__Property__TypeAssignment_1 ) ) rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3761:1: ( ( ( rule__Property__TypeAssignment_1 ) ) rule__Property__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3762:1: ( ( rule__Property__TypeAssignment_1 ) ) rule__Property__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3762:1: ( ( rule__Property__TypeAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3763:1: ( rule__Property__TypeAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3764:1: ( rule__Property__TypeAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3764:2: rule__Property__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Property__TypeAssignment_1_in_rule__Property__Group__17945);
            rule__Property__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__17954);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3775:1: rule__Property__Group__2 : ( ( rule__Property__StatusAssignment_2 ) ) rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3779:1: ( ( ( rule__Property__StatusAssignment_2 ) ) rule__Property__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3780:1: ( ( rule__Property__StatusAssignment_2 ) ) rule__Property__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3780:1: ( ( rule__Property__StatusAssignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3781:1: ( rule__Property__StatusAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getStatusAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3782:1: ( rule__Property__StatusAssignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3782:2: rule__Property__StatusAssignment_2
            {
            pushFollow(FOLLOW_rule__Property__StatusAssignment_2_in_rule__Property__Group__27982);
            rule__Property__StatusAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getStatusAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__3_in_rule__Property__Group__27991);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3793:1: rule__Property__Group__3 : ( ( rule__Property__DescriptionAssignment_3 ) ) rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3797:1: ( ( ( rule__Property__DescriptionAssignment_3 ) ) rule__Property__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3798:1: ( ( rule__Property__DescriptionAssignment_3 ) ) rule__Property__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3798:1: ( ( rule__Property__DescriptionAssignment_3 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3799:1: ( rule__Property__DescriptionAssignment_3 )
            {
             before(grammarAccess.getPropertyAccess().getDescriptionAssignment_3()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3800:1: ( rule__Property__DescriptionAssignment_3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3800:2: rule__Property__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_rule__Property__DescriptionAssignment_3_in_rule__Property__Group__38019);
            rule__Property__DescriptionAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getDescriptionAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__4_in_rule__Property__Group__38028);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3811:1: rule__Property__Group__4 : ( 'defaultPropValue:' ) rule__Property__Group__5 ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3815:1: ( ( 'defaultPropValue:' ) rule__Property__Group__5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3816:1: ( 'defaultPropValue:' ) rule__Property__Group__5
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3816:1: ( 'defaultPropValue:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3817:1: 'defaultPropValue:'
            {
             before(grammarAccess.getPropertyAccess().getDefaultPropValueKeyword_4()); 
            match(input,40,FOLLOW_40_in_rule__Property__Group__48057); 
             after(grammarAccess.getPropertyAccess().getDefaultPropValueKeyword_4()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__5_in_rule__Property__Group__48067);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3831:1: rule__Property__Group__5 : ( ( rule__Property__DefaultPropValueAssignment_5 )* ) ;
    public final void rule__Property__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3835:1: ( ( ( rule__Property__DefaultPropValueAssignment_5 )* ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3836:1: ( ( rule__Property__DefaultPropValueAssignment_5 )* )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3836:1: ( ( rule__Property__DefaultPropValueAssignment_5 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3837:1: ( rule__Property__DefaultPropValueAssignment_5 )*
            {
             before(grammarAccess.getPropertyAccess().getDefaultPropValueAssignment_5()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3838:1: ( rule__Property__DefaultPropValueAssignment_5 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_STRING) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3838:2: rule__Property__DefaultPropValueAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Property__DefaultPropValueAssignment_5_in_rule__Property__Group__58095);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3860:1: rule__InheritanceStatus__Group__0 : ( ( rule__InheritanceStatus__AbstractAssignment_0 ) ) rule__InheritanceStatus__Group__1 ;
    public final void rule__InheritanceStatus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3864:1: ( ( ( rule__InheritanceStatus__AbstractAssignment_0 ) ) rule__InheritanceStatus__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3865:1: ( ( rule__InheritanceStatus__AbstractAssignment_0 ) ) rule__InheritanceStatus__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3865:1: ( ( rule__InheritanceStatus__AbstractAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3866:1: ( rule__InheritanceStatus__AbstractAssignment_0 )
            {
             before(grammarAccess.getInheritanceStatusAccess().getAbstractAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3867:1: ( rule__InheritanceStatus__AbstractAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3867:2: rule__InheritanceStatus__AbstractAssignment_0
            {
            pushFollow(FOLLOW_rule__InheritanceStatus__AbstractAssignment_0_in_rule__InheritanceStatus__Group__08142);
            rule__InheritanceStatus__AbstractAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getInheritanceStatusAccess().getAbstractAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__InheritanceStatus__Group__1_in_rule__InheritanceStatus__Group__08151);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3878:1: rule__InheritanceStatus__Group__1 : ( ( rule__InheritanceStatus__InheritedAssignment_1 ) ) rule__InheritanceStatus__Group__2 ;
    public final void rule__InheritanceStatus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3882:1: ( ( ( rule__InheritanceStatus__InheritedAssignment_1 ) ) rule__InheritanceStatus__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3883:1: ( ( rule__InheritanceStatus__InheritedAssignment_1 ) ) rule__InheritanceStatus__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3883:1: ( ( rule__InheritanceStatus__InheritedAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3884:1: ( rule__InheritanceStatus__InheritedAssignment_1 )
            {
             before(grammarAccess.getInheritanceStatusAccess().getInheritedAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3885:1: ( rule__InheritanceStatus__InheritedAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3885:2: rule__InheritanceStatus__InheritedAssignment_1
            {
            pushFollow(FOLLOW_rule__InheritanceStatus__InheritedAssignment_1_in_rule__InheritanceStatus__Group__18179);
            rule__InheritanceStatus__InheritedAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getInheritanceStatusAccess().getInheritedAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__InheritanceStatus__Group__2_in_rule__InheritanceStatus__Group__18188);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3896:1: rule__InheritanceStatus__Group__2 : ( ( rule__InheritanceStatus__ConcreteAssignment_2 ) ) rule__InheritanceStatus__Group__3 ;
    public final void rule__InheritanceStatus__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3900:1: ( ( ( rule__InheritanceStatus__ConcreteAssignment_2 ) ) rule__InheritanceStatus__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3901:1: ( ( rule__InheritanceStatus__ConcreteAssignment_2 ) ) rule__InheritanceStatus__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3901:1: ( ( rule__InheritanceStatus__ConcreteAssignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3902:1: ( rule__InheritanceStatus__ConcreteAssignment_2 )
            {
             before(grammarAccess.getInheritanceStatusAccess().getConcreteAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3903:1: ( rule__InheritanceStatus__ConcreteAssignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3903:2: rule__InheritanceStatus__ConcreteAssignment_2
            {
            pushFollow(FOLLOW_rule__InheritanceStatus__ConcreteAssignment_2_in_rule__InheritanceStatus__Group__28216);
            rule__InheritanceStatus__ConcreteAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getInheritanceStatusAccess().getConcreteAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__InheritanceStatus__Group__3_in_rule__InheritanceStatus__Group__28225);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3914:1: rule__InheritanceStatus__Group__3 : ( ( rule__InheritanceStatus__ConcreteHereAssignment_3 ) ) rule__InheritanceStatus__Group__4 ;
    public final void rule__InheritanceStatus__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3918:1: ( ( ( rule__InheritanceStatus__ConcreteHereAssignment_3 ) ) rule__InheritanceStatus__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3919:1: ( ( rule__InheritanceStatus__ConcreteHereAssignment_3 ) ) rule__InheritanceStatus__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3919:1: ( ( rule__InheritanceStatus__ConcreteHereAssignment_3 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3920:1: ( rule__InheritanceStatus__ConcreteHereAssignment_3 )
            {
             before(grammarAccess.getInheritanceStatusAccess().getConcreteHereAssignment_3()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3921:1: ( rule__InheritanceStatus__ConcreteHereAssignment_3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3921:2: rule__InheritanceStatus__ConcreteHereAssignment_3
            {
            pushFollow(FOLLOW_rule__InheritanceStatus__ConcreteHereAssignment_3_in_rule__InheritanceStatus__Group__38253);
            rule__InheritanceStatus__ConcreteHereAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getInheritanceStatusAccess().getConcreteHereAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__InheritanceStatus__Group__4_in_rule__InheritanceStatus__Group__38262);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3932:1: rule__InheritanceStatus__Group__4 : ( ( rule__InheritanceStatus__HasChangedAssignment_4 ) ) ;
    public final void rule__InheritanceStatus__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3936:1: ( ( ( rule__InheritanceStatus__HasChangedAssignment_4 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3937:1: ( ( rule__InheritanceStatus__HasChangedAssignment_4 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3937:1: ( ( rule__InheritanceStatus__HasChangedAssignment_4 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3938:1: ( rule__InheritanceStatus__HasChangedAssignment_4 )
            {
             before(grammarAccess.getInheritanceStatusAccess().getHasChangedAssignment_4()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3939:1: ( rule__InheritanceStatus__HasChangedAssignment_4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3939:2: rule__InheritanceStatus__HasChangedAssignment_4
            {
            pushFollow(FOLLOW_rule__InheritanceStatus__HasChangedAssignment_4_in_rule__InheritanceStatus__Group__48290);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3959:1: rule__Command__Group__0 : ( ( rule__Command__NameAssignment_0 ) ) rule__Command__Group__1 ;
    public final void rule__Command__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3963:1: ( ( ( rule__Command__NameAssignment_0 ) ) rule__Command__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3964:1: ( ( rule__Command__NameAssignment_0 ) ) rule__Command__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3964:1: ( ( rule__Command__NameAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3965:1: ( rule__Command__NameAssignment_0 )
            {
             before(grammarAccess.getCommandAccess().getNameAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3966:1: ( rule__Command__NameAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3966:2: rule__Command__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Command__NameAssignment_0_in_rule__Command__Group__08334);
            rule__Command__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__1_in_rule__Command__Group__08343);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3977:1: rule__Command__Group__1 : ( ( rule__Command__ArginAssignment_1 ) ) rule__Command__Group__2 ;
    public final void rule__Command__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3981:1: ( ( ( rule__Command__ArginAssignment_1 ) ) rule__Command__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3982:1: ( ( rule__Command__ArginAssignment_1 ) ) rule__Command__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3982:1: ( ( rule__Command__ArginAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3983:1: ( rule__Command__ArginAssignment_1 )
            {
             before(grammarAccess.getCommandAccess().getArginAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3984:1: ( rule__Command__ArginAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3984:2: rule__Command__ArginAssignment_1
            {
            pushFollow(FOLLOW_rule__Command__ArginAssignment_1_in_rule__Command__Group__18371);
            rule__Command__ArginAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getArginAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__2_in_rule__Command__Group__18380);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3995:1: rule__Command__Group__2 : ( ( rule__Command__ArgoutAssignment_2 ) ) rule__Command__Group__3 ;
    public final void rule__Command__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3999:1: ( ( ( rule__Command__ArgoutAssignment_2 ) ) rule__Command__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4000:1: ( ( rule__Command__ArgoutAssignment_2 ) ) rule__Command__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4000:1: ( ( rule__Command__ArgoutAssignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4001:1: ( rule__Command__ArgoutAssignment_2 )
            {
             before(grammarAccess.getCommandAccess().getArgoutAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4002:1: ( rule__Command__ArgoutAssignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4002:2: rule__Command__ArgoutAssignment_2
            {
            pushFollow(FOLLOW_rule__Command__ArgoutAssignment_2_in_rule__Command__Group__28408);
            rule__Command__ArgoutAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getArgoutAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__3_in_rule__Command__Group__28417);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4013:1: rule__Command__Group__3 : ( ( rule__Command__DescriptionAssignment_3 ) ) rule__Command__Group__4 ;
    public final void rule__Command__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4017:1: ( ( ( rule__Command__DescriptionAssignment_3 ) ) rule__Command__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4018:1: ( ( rule__Command__DescriptionAssignment_3 ) ) rule__Command__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4018:1: ( ( rule__Command__DescriptionAssignment_3 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4019:1: ( rule__Command__DescriptionAssignment_3 )
            {
             before(grammarAccess.getCommandAccess().getDescriptionAssignment_3()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4020:1: ( rule__Command__DescriptionAssignment_3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4020:2: rule__Command__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_rule__Command__DescriptionAssignment_3_in_rule__Command__Group__38445);
            rule__Command__DescriptionAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getDescriptionAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__4_in_rule__Command__Group__38454);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4031:1: rule__Command__Group__4 : ( ( rule__Command__StatusAssignment_4 ) ) rule__Command__Group__5 ;
    public final void rule__Command__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4035:1: ( ( ( rule__Command__StatusAssignment_4 ) ) rule__Command__Group__5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4036:1: ( ( rule__Command__StatusAssignment_4 ) ) rule__Command__Group__5
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4036:1: ( ( rule__Command__StatusAssignment_4 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4037:1: ( rule__Command__StatusAssignment_4 )
            {
             before(grammarAccess.getCommandAccess().getStatusAssignment_4()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4038:1: ( rule__Command__StatusAssignment_4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4038:2: rule__Command__StatusAssignment_4
            {
            pushFollow(FOLLOW_rule__Command__StatusAssignment_4_in_rule__Command__Group__48482);
            rule__Command__StatusAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getStatusAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__5_in_rule__Command__Group__48491);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4049:1: rule__Command__Group__5 : ( ( rule__Command__ExecMethodAssignment_5 ) ) rule__Command__Group__6 ;
    public final void rule__Command__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4053:1: ( ( ( rule__Command__ExecMethodAssignment_5 ) ) rule__Command__Group__6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4054:1: ( ( rule__Command__ExecMethodAssignment_5 ) ) rule__Command__Group__6
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4054:1: ( ( rule__Command__ExecMethodAssignment_5 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4055:1: ( rule__Command__ExecMethodAssignment_5 )
            {
             before(grammarAccess.getCommandAccess().getExecMethodAssignment_5()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4056:1: ( rule__Command__ExecMethodAssignment_5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4056:2: rule__Command__ExecMethodAssignment_5
            {
            pushFollow(FOLLOW_rule__Command__ExecMethodAssignment_5_in_rule__Command__Group__58519);
            rule__Command__ExecMethodAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getExecMethodAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__6_in_rule__Command__Group__58528);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4067:1: rule__Command__Group__6 : ( ( rule__Command__DisplayLevelAssignment_6 ) ) rule__Command__Group__7 ;
    public final void rule__Command__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4071:1: ( ( ( rule__Command__DisplayLevelAssignment_6 ) ) rule__Command__Group__7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4072:1: ( ( rule__Command__DisplayLevelAssignment_6 ) ) rule__Command__Group__7
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4072:1: ( ( rule__Command__DisplayLevelAssignment_6 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4073:1: ( rule__Command__DisplayLevelAssignment_6 )
            {
             before(grammarAccess.getCommandAccess().getDisplayLevelAssignment_6()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4074:1: ( rule__Command__DisplayLevelAssignment_6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4074:2: rule__Command__DisplayLevelAssignment_6
            {
            pushFollow(FOLLOW_rule__Command__DisplayLevelAssignment_6_in_rule__Command__Group__68556);
            rule__Command__DisplayLevelAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getDisplayLevelAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__7_in_rule__Command__Group__68565);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4085:1: rule__Command__Group__7 : ( ( rule__Command__PolledPeriodAssignment_7 ) ) rule__Command__Group__8 ;
    public final void rule__Command__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4089:1: ( ( ( rule__Command__PolledPeriodAssignment_7 ) ) rule__Command__Group__8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4090:1: ( ( rule__Command__PolledPeriodAssignment_7 ) ) rule__Command__Group__8
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4090:1: ( ( rule__Command__PolledPeriodAssignment_7 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4091:1: ( rule__Command__PolledPeriodAssignment_7 )
            {
             before(grammarAccess.getCommandAccess().getPolledPeriodAssignment_7()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4092:1: ( rule__Command__PolledPeriodAssignment_7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4092:2: rule__Command__PolledPeriodAssignment_7
            {
            pushFollow(FOLLOW_rule__Command__PolledPeriodAssignment_7_in_rule__Command__Group__78593);
            rule__Command__PolledPeriodAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getPolledPeriodAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__8_in_rule__Command__Group__78602);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4103:1: rule__Command__Group__8 : ( 'excludedStates:' ) rule__Command__Group__9 ;
    public final void rule__Command__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4107:1: ( ( 'excludedStates:' ) rule__Command__Group__9 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4108:1: ( 'excludedStates:' ) rule__Command__Group__9
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4108:1: ( 'excludedStates:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4109:1: 'excludedStates:'
            {
             before(grammarAccess.getCommandAccess().getExcludedStatesKeyword_8()); 
            match(input,41,FOLLOW_41_in_rule__Command__Group__88631); 
             after(grammarAccess.getCommandAccess().getExcludedStatesKeyword_8()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__9_in_rule__Command__Group__88641);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4123:1: rule__Command__Group__9 : ( ( rule__Command__ExcludedStatesAssignment_9 )* ) ;
    public final void rule__Command__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4127:1: ( ( ( rule__Command__ExcludedStatesAssignment_9 )* ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4128:1: ( ( rule__Command__ExcludedStatesAssignment_9 )* )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4128:1: ( ( rule__Command__ExcludedStatesAssignment_9 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4129:1: ( rule__Command__ExcludedStatesAssignment_9 )*
            {
             before(grammarAccess.getCommandAccess().getExcludedStatesAssignment_9()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4130:1: ( rule__Command__ExcludedStatesAssignment_9 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STRING) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4130:2: rule__Command__ExcludedStatesAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__Command__ExcludedStatesAssignment_9_in_rule__Command__Group__98669);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4160:1: rule__Argument__Group__0 : ( ( rule__Argument__TypeAssignment_0 ) ) rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4164:1: ( ( ( rule__Argument__TypeAssignment_0 ) ) rule__Argument__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4165:1: ( ( rule__Argument__TypeAssignment_0 ) ) rule__Argument__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4165:1: ( ( rule__Argument__TypeAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4166:1: ( rule__Argument__TypeAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getTypeAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4167:1: ( rule__Argument__TypeAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4167:2: rule__Argument__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Argument__TypeAssignment_0_in_rule__Argument__Group__08724);
            rule__Argument__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getTypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__08733);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4178:1: rule__Argument__Group__1 : ( ( rule__Argument__DescriptionAssignment_1 ) ) ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4182:1: ( ( ( rule__Argument__DescriptionAssignment_1 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4183:1: ( ( rule__Argument__DescriptionAssignment_1 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4183:1: ( ( rule__Argument__DescriptionAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4184:1: ( rule__Argument__DescriptionAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getDescriptionAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4185:1: ( rule__Argument__DescriptionAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4185:2: rule__Argument__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__Argument__DescriptionAssignment_1_in_rule__Argument__Group__18761);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4199:1: rule__Attribute__Group__0 : ( ( rule__Attribute__NameAssignment_0 ) ) rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4203:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) rule__Attribute__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4204:1: ( ( rule__Attribute__NameAssignment_0 ) ) rule__Attribute__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4204:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4205:1: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4206:1: ( rule__Attribute__NameAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4206:2: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__08799);
            rule__Attribute__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__08808);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4217:1: rule__Attribute__Group__1 : ( ( rule__Attribute__AttTypeAssignment_1 ) ) rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4221:1: ( ( ( rule__Attribute__AttTypeAssignment_1 ) ) rule__Attribute__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4222:1: ( ( rule__Attribute__AttTypeAssignment_1 ) ) rule__Attribute__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4222:1: ( ( rule__Attribute__AttTypeAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4223:1: ( rule__Attribute__AttTypeAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getAttTypeAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4224:1: ( rule__Attribute__AttTypeAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4224:2: rule__Attribute__AttTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__AttTypeAssignment_1_in_rule__Attribute__Group__18836);
            rule__Attribute__AttTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAttTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__18845);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4235:1: rule__Attribute__Group__2 : ( ( rule__Attribute__DataTypeAssignment_2 ) ) rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4239:1: ( ( ( rule__Attribute__DataTypeAssignment_2 ) ) rule__Attribute__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4240:1: ( ( rule__Attribute__DataTypeAssignment_2 ) ) rule__Attribute__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4240:1: ( ( rule__Attribute__DataTypeAssignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4241:1: ( rule__Attribute__DataTypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getDataTypeAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4242:1: ( rule__Attribute__DataTypeAssignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4242:2: rule__Attribute__DataTypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__DataTypeAssignment_2_in_rule__Attribute__Group__28873);
            rule__Attribute__DataTypeAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getDataTypeAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__28882);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4253:1: rule__Attribute__Group__3 : ( ( rule__Attribute__RwTypeAssignment_3 ) ) rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4257:1: ( ( ( rule__Attribute__RwTypeAssignment_3 ) ) rule__Attribute__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4258:1: ( ( rule__Attribute__RwTypeAssignment_3 ) ) rule__Attribute__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4258:1: ( ( rule__Attribute__RwTypeAssignment_3 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4259:1: ( rule__Attribute__RwTypeAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getRwTypeAssignment_3()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4260:1: ( rule__Attribute__RwTypeAssignment_3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4260:2: rule__Attribute__RwTypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Attribute__RwTypeAssignment_3_in_rule__Attribute__Group__38910);
            rule__Attribute__RwTypeAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getRwTypeAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__38919);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4271:1: rule__Attribute__Group__4 : ( ( rule__Attribute__DisplayLevelAssignment_4 ) ) rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4275:1: ( ( ( rule__Attribute__DisplayLevelAssignment_4 ) ) rule__Attribute__Group__5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4276:1: ( ( rule__Attribute__DisplayLevelAssignment_4 ) ) rule__Attribute__Group__5
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4276:1: ( ( rule__Attribute__DisplayLevelAssignment_4 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4277:1: ( rule__Attribute__DisplayLevelAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getDisplayLevelAssignment_4()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4278:1: ( rule__Attribute__DisplayLevelAssignment_4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4278:2: rule__Attribute__DisplayLevelAssignment_4
            {
            pushFollow(FOLLOW_rule__Attribute__DisplayLevelAssignment_4_in_rule__Attribute__Group__48947);
            rule__Attribute__DisplayLevelAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getDisplayLevelAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__48956);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4289:1: rule__Attribute__Group__5 : ( ( rule__Attribute__PolledPeriodAssignment_5 ) ) rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4293:1: ( ( ( rule__Attribute__PolledPeriodAssignment_5 ) ) rule__Attribute__Group__6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4294:1: ( ( rule__Attribute__PolledPeriodAssignment_5 ) ) rule__Attribute__Group__6
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4294:1: ( ( rule__Attribute__PolledPeriodAssignment_5 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4295:1: ( rule__Attribute__PolledPeriodAssignment_5 )
            {
             before(grammarAccess.getAttributeAccess().getPolledPeriodAssignment_5()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4296:1: ( rule__Attribute__PolledPeriodAssignment_5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4296:2: rule__Attribute__PolledPeriodAssignment_5
            {
            pushFollow(FOLLOW_rule__Attribute__PolledPeriodAssignment_5_in_rule__Attribute__Group__58984);
            rule__Attribute__PolledPeriodAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getPolledPeriodAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__6_in_rule__Attribute__Group__58993);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4307:1: rule__Attribute__Group__6 : ( ( rule__Attribute__MaxXAssignment_6 ) ) rule__Attribute__Group__7 ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4311:1: ( ( ( rule__Attribute__MaxXAssignment_6 ) ) rule__Attribute__Group__7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4312:1: ( ( rule__Attribute__MaxXAssignment_6 ) ) rule__Attribute__Group__7
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4312:1: ( ( rule__Attribute__MaxXAssignment_6 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4313:1: ( rule__Attribute__MaxXAssignment_6 )
            {
             before(grammarAccess.getAttributeAccess().getMaxXAssignment_6()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4314:1: ( rule__Attribute__MaxXAssignment_6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4314:2: rule__Attribute__MaxXAssignment_6
            {
            pushFollow(FOLLOW_rule__Attribute__MaxXAssignment_6_in_rule__Attribute__Group__69021);
            rule__Attribute__MaxXAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getMaxXAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__7_in_rule__Attribute__Group__69030);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4325:1: rule__Attribute__Group__7 : ( ( rule__Attribute__MaxYAssignment_7 ) ) rule__Attribute__Group__8 ;
    public final void rule__Attribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4329:1: ( ( ( rule__Attribute__MaxYAssignment_7 ) ) rule__Attribute__Group__8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4330:1: ( ( rule__Attribute__MaxYAssignment_7 ) ) rule__Attribute__Group__8
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4330:1: ( ( rule__Attribute__MaxYAssignment_7 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4331:1: ( rule__Attribute__MaxYAssignment_7 )
            {
             before(grammarAccess.getAttributeAccess().getMaxYAssignment_7()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4332:1: ( rule__Attribute__MaxYAssignment_7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4332:2: rule__Attribute__MaxYAssignment_7
            {
            pushFollow(FOLLOW_rule__Attribute__MaxYAssignment_7_in_rule__Attribute__Group__79058);
            rule__Attribute__MaxYAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getMaxYAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__8_in_rule__Attribute__Group__79067);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4343:1: rule__Attribute__Group__8 : ( ( rule__Attribute__MemorizedAssignment_8 ) ) rule__Attribute__Group__9 ;
    public final void rule__Attribute__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4347:1: ( ( ( rule__Attribute__MemorizedAssignment_8 ) ) rule__Attribute__Group__9 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4348:1: ( ( rule__Attribute__MemorizedAssignment_8 ) ) rule__Attribute__Group__9
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4348:1: ( ( rule__Attribute__MemorizedAssignment_8 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4349:1: ( rule__Attribute__MemorizedAssignment_8 )
            {
             before(grammarAccess.getAttributeAccess().getMemorizedAssignment_8()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4350:1: ( rule__Attribute__MemorizedAssignment_8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4350:2: rule__Attribute__MemorizedAssignment_8
            {
            pushFollow(FOLLOW_rule__Attribute__MemorizedAssignment_8_in_rule__Attribute__Group__89095);
            rule__Attribute__MemorizedAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getMemorizedAssignment_8()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__9_in_rule__Attribute__Group__89104);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4361:1: rule__Attribute__Group__9 : ( ( rule__Attribute__MemorizedAtInitAssignment_9 ) ) rule__Attribute__Group__10 ;
    public final void rule__Attribute__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4365:1: ( ( ( rule__Attribute__MemorizedAtInitAssignment_9 ) ) rule__Attribute__Group__10 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4366:1: ( ( rule__Attribute__MemorizedAtInitAssignment_9 ) ) rule__Attribute__Group__10
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4366:1: ( ( rule__Attribute__MemorizedAtInitAssignment_9 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4367:1: ( rule__Attribute__MemorizedAtInitAssignment_9 )
            {
             before(grammarAccess.getAttributeAccess().getMemorizedAtInitAssignment_9()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4368:1: ( rule__Attribute__MemorizedAtInitAssignment_9 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4368:2: rule__Attribute__MemorizedAtInitAssignment_9
            {
            pushFollow(FOLLOW_rule__Attribute__MemorizedAtInitAssignment_9_in_rule__Attribute__Group__99132);
            rule__Attribute__MemorizedAtInitAssignment_9();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getMemorizedAtInitAssignment_9()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__10_in_rule__Attribute__Group__99141);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4379:1: rule__Attribute__Group__10 : ( ( rule__Attribute__ChangeEventAssignment_10 ) ) rule__Attribute__Group__11 ;
    public final void rule__Attribute__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4383:1: ( ( ( rule__Attribute__ChangeEventAssignment_10 ) ) rule__Attribute__Group__11 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4384:1: ( ( rule__Attribute__ChangeEventAssignment_10 ) ) rule__Attribute__Group__11
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4384:1: ( ( rule__Attribute__ChangeEventAssignment_10 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4385:1: ( rule__Attribute__ChangeEventAssignment_10 )
            {
             before(grammarAccess.getAttributeAccess().getChangeEventAssignment_10()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4386:1: ( rule__Attribute__ChangeEventAssignment_10 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4386:2: rule__Attribute__ChangeEventAssignment_10
            {
            pushFollow(FOLLOW_rule__Attribute__ChangeEventAssignment_10_in_rule__Attribute__Group__109169);
            rule__Attribute__ChangeEventAssignment_10();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getChangeEventAssignment_10()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__11_in_rule__Attribute__Group__109178);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4397:1: rule__Attribute__Group__11 : ( ( rule__Attribute__ArchiveEventAssignment_11 ) ) rule__Attribute__Group__12 ;
    public final void rule__Attribute__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4401:1: ( ( ( rule__Attribute__ArchiveEventAssignment_11 ) ) rule__Attribute__Group__12 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4402:1: ( ( rule__Attribute__ArchiveEventAssignment_11 ) ) rule__Attribute__Group__12
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4402:1: ( ( rule__Attribute__ArchiveEventAssignment_11 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4403:1: ( rule__Attribute__ArchiveEventAssignment_11 )
            {
             before(grammarAccess.getAttributeAccess().getArchiveEventAssignment_11()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4404:1: ( rule__Attribute__ArchiveEventAssignment_11 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4404:2: rule__Attribute__ArchiveEventAssignment_11
            {
            pushFollow(FOLLOW_rule__Attribute__ArchiveEventAssignment_11_in_rule__Attribute__Group__119206);
            rule__Attribute__ArchiveEventAssignment_11();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getArchiveEventAssignment_11()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__12_in_rule__Attribute__Group__119215);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4415:1: rule__Attribute__Group__12 : ( ( rule__Attribute__DataReadyEventAssignment_12 ) ) rule__Attribute__Group__13 ;
    public final void rule__Attribute__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4419:1: ( ( ( rule__Attribute__DataReadyEventAssignment_12 ) ) rule__Attribute__Group__13 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4420:1: ( ( rule__Attribute__DataReadyEventAssignment_12 ) ) rule__Attribute__Group__13
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4420:1: ( ( rule__Attribute__DataReadyEventAssignment_12 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4421:1: ( rule__Attribute__DataReadyEventAssignment_12 )
            {
             before(grammarAccess.getAttributeAccess().getDataReadyEventAssignment_12()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4422:1: ( rule__Attribute__DataReadyEventAssignment_12 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4422:2: rule__Attribute__DataReadyEventAssignment_12
            {
            pushFollow(FOLLOW_rule__Attribute__DataReadyEventAssignment_12_in_rule__Attribute__Group__129243);
            rule__Attribute__DataReadyEventAssignment_12();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getDataReadyEventAssignment_12()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__13_in_rule__Attribute__Group__129252);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4433:1: rule__Attribute__Group__13 : ( ( rule__Attribute__StatusAssignment_13 ) ) rule__Attribute__Group__14 ;
    public final void rule__Attribute__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4437:1: ( ( ( rule__Attribute__StatusAssignment_13 ) ) rule__Attribute__Group__14 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4438:1: ( ( rule__Attribute__StatusAssignment_13 ) ) rule__Attribute__Group__14
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4438:1: ( ( rule__Attribute__StatusAssignment_13 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4439:1: ( rule__Attribute__StatusAssignment_13 )
            {
             before(grammarAccess.getAttributeAccess().getStatusAssignment_13()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4440:1: ( rule__Attribute__StatusAssignment_13 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4440:2: rule__Attribute__StatusAssignment_13
            {
            pushFollow(FOLLOW_rule__Attribute__StatusAssignment_13_in_rule__Attribute__Group__139280);
            rule__Attribute__StatusAssignment_13();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getStatusAssignment_13()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__14_in_rule__Attribute__Group__139289);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4451:1: rule__Attribute__Group__14 : ( ( rule__Attribute__PropertiesAssignment_14 ) ) rule__Attribute__Group__15 ;
    public final void rule__Attribute__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4455:1: ( ( ( rule__Attribute__PropertiesAssignment_14 ) ) rule__Attribute__Group__15 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4456:1: ( ( rule__Attribute__PropertiesAssignment_14 ) ) rule__Attribute__Group__15
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4456:1: ( ( rule__Attribute__PropertiesAssignment_14 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4457:1: ( rule__Attribute__PropertiesAssignment_14 )
            {
             before(grammarAccess.getAttributeAccess().getPropertiesAssignment_14()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4458:1: ( rule__Attribute__PropertiesAssignment_14 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4458:2: rule__Attribute__PropertiesAssignment_14
            {
            pushFollow(FOLLOW_rule__Attribute__PropertiesAssignment_14_in_rule__Attribute__Group__149317);
            rule__Attribute__PropertiesAssignment_14();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getPropertiesAssignment_14()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__15_in_rule__Attribute__Group__149326);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4469:1: rule__Attribute__Group__15 : ( ( rule__Attribute__AllocReadMemberAssignment_15 ) ) rule__Attribute__Group__16 ;
    public final void rule__Attribute__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4473:1: ( ( ( rule__Attribute__AllocReadMemberAssignment_15 ) ) rule__Attribute__Group__16 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4474:1: ( ( rule__Attribute__AllocReadMemberAssignment_15 ) ) rule__Attribute__Group__16
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4474:1: ( ( rule__Attribute__AllocReadMemberAssignment_15 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4475:1: ( rule__Attribute__AllocReadMemberAssignment_15 )
            {
             before(grammarAccess.getAttributeAccess().getAllocReadMemberAssignment_15()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4476:1: ( rule__Attribute__AllocReadMemberAssignment_15 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4476:2: rule__Attribute__AllocReadMemberAssignment_15
            {
            pushFollow(FOLLOW_rule__Attribute__AllocReadMemberAssignment_15_in_rule__Attribute__Group__159354);
            rule__Attribute__AllocReadMemberAssignment_15();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAllocReadMemberAssignment_15()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__16_in_rule__Attribute__Group__159363);
            rule__Attribute__Group__16();
            _fsp--;


            }

        }
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


    // $ANTLR start rule__Attribute__Group__16
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4487:1: rule__Attribute__Group__16 : ( ( rule__Attribute__IsDynamicAssignment_16 ) ) rule__Attribute__Group__17 ;
    public final void rule__Attribute__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4491:1: ( ( ( rule__Attribute__IsDynamicAssignment_16 ) ) rule__Attribute__Group__17 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4492:1: ( ( rule__Attribute__IsDynamicAssignment_16 ) ) rule__Attribute__Group__17
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4492:1: ( ( rule__Attribute__IsDynamicAssignment_16 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4493:1: ( rule__Attribute__IsDynamicAssignment_16 )
            {
             before(grammarAccess.getAttributeAccess().getIsDynamicAssignment_16()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4494:1: ( rule__Attribute__IsDynamicAssignment_16 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4494:2: rule__Attribute__IsDynamicAssignment_16
            {
            pushFollow(FOLLOW_rule__Attribute__IsDynamicAssignment_16_in_rule__Attribute__Group__169391);
            rule__Attribute__IsDynamicAssignment_16();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getIsDynamicAssignment_16()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__17_in_rule__Attribute__Group__169400);
            rule__Attribute__Group__17();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__16


    // $ANTLR start rule__Attribute__Group__17
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4505:1: rule__Attribute__Group__17 : ( 'readExcludedStates:' ) rule__Attribute__Group__18 ;
    public final void rule__Attribute__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4509:1: ( ( 'readExcludedStates:' ) rule__Attribute__Group__18 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4510:1: ( 'readExcludedStates:' ) rule__Attribute__Group__18
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4510:1: ( 'readExcludedStates:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4511:1: 'readExcludedStates:'
            {
             before(grammarAccess.getAttributeAccess().getReadExcludedStatesKeyword_17()); 
            match(input,42,FOLLOW_42_in_rule__Attribute__Group__179429); 
             after(grammarAccess.getAttributeAccess().getReadExcludedStatesKeyword_17()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__18_in_rule__Attribute__Group__179439);
            rule__Attribute__Group__18();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__17


    // $ANTLR start rule__Attribute__Group__18
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4525:1: rule__Attribute__Group__18 : ( ( rule__Attribute__ReadExcludedStatesAssignment_18 )* ) rule__Attribute__Group__19 ;
    public final void rule__Attribute__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4529:1: ( ( ( rule__Attribute__ReadExcludedStatesAssignment_18 )* ) rule__Attribute__Group__19 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4530:1: ( ( rule__Attribute__ReadExcludedStatesAssignment_18 )* ) rule__Attribute__Group__19
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4530:1: ( ( rule__Attribute__ReadExcludedStatesAssignment_18 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4531:1: ( rule__Attribute__ReadExcludedStatesAssignment_18 )*
            {
             before(grammarAccess.getAttributeAccess().getReadExcludedStatesAssignment_18()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4532:1: ( rule__Attribute__ReadExcludedStatesAssignment_18 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_STRING) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4532:2: rule__Attribute__ReadExcludedStatesAssignment_18
            	    {
            	    pushFollow(FOLLOW_rule__Attribute__ReadExcludedStatesAssignment_18_in_rule__Attribute__Group__189467);
            	    rule__Attribute__ReadExcludedStatesAssignment_18();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getAttributeAccess().getReadExcludedStatesAssignment_18()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__19_in_rule__Attribute__Group__189477);
            rule__Attribute__Group__19();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__18


    // $ANTLR start rule__Attribute__Group__19
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4543:1: rule__Attribute__Group__19 : ( 'writeExcludedStates:' ) rule__Attribute__Group__20 ;
    public final void rule__Attribute__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4547:1: ( ( 'writeExcludedStates:' ) rule__Attribute__Group__20 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4548:1: ( 'writeExcludedStates:' ) rule__Attribute__Group__20
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4548:1: ( 'writeExcludedStates:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4549:1: 'writeExcludedStates:'
            {
             before(grammarAccess.getAttributeAccess().getWriteExcludedStatesKeyword_19()); 
            match(input,43,FOLLOW_43_in_rule__Attribute__Group__199506); 
             after(grammarAccess.getAttributeAccess().getWriteExcludedStatesKeyword_19()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__20_in_rule__Attribute__Group__199516);
            rule__Attribute__Group__20();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__19


    // $ANTLR start rule__Attribute__Group__20
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4563:1: rule__Attribute__Group__20 : ( ( rule__Attribute__WriteExcludedStatesAssignment_20 )* ) ;
    public final void rule__Attribute__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4567:1: ( ( ( rule__Attribute__WriteExcludedStatesAssignment_20 )* ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4568:1: ( ( rule__Attribute__WriteExcludedStatesAssignment_20 )* )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4568:1: ( ( rule__Attribute__WriteExcludedStatesAssignment_20 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4569:1: ( rule__Attribute__WriteExcludedStatesAssignment_20 )*
            {
             before(grammarAccess.getAttributeAccess().getWriteExcludedStatesAssignment_20()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4570:1: ( rule__Attribute__WriteExcludedStatesAssignment_20 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_STRING) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4570:2: rule__Attribute__WriteExcludedStatesAssignment_20
            	    {
            	    pushFollow(FOLLOW_rule__Attribute__WriteExcludedStatesAssignment_20_in_rule__Attribute__Group__209544);
            	    rule__Attribute__WriteExcludedStatesAssignment_20();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getAttributeAccess().getWriteExcludedStatesAssignment_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__20


    // $ANTLR start rule__FireEvents__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4622:1: rule__FireEvents__Group__0 : ( ( rule__FireEvents__FireAssignment_0 ) ) rule__FireEvents__Group__1 ;
    public final void rule__FireEvents__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4626:1: ( ( ( rule__FireEvents__FireAssignment_0 ) ) rule__FireEvents__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4627:1: ( ( rule__FireEvents__FireAssignment_0 ) ) rule__FireEvents__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4627:1: ( ( rule__FireEvents__FireAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4628:1: ( rule__FireEvents__FireAssignment_0 )
            {
             before(grammarAccess.getFireEventsAccess().getFireAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4629:1: ( rule__FireEvents__FireAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4629:2: rule__FireEvents__FireAssignment_0
            {
            pushFollow(FOLLOW_rule__FireEvents__FireAssignment_0_in_rule__FireEvents__Group__09621);
            rule__FireEvents__FireAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getFireEventsAccess().getFireAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__FireEvents__Group__1_in_rule__FireEvents__Group__09630);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4640:1: rule__FireEvents__Group__1 : ( ( rule__FireEvents__LibCheckCriteriaAssignment_1 ) ) ;
    public final void rule__FireEvents__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4644:1: ( ( ( rule__FireEvents__LibCheckCriteriaAssignment_1 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4645:1: ( ( rule__FireEvents__LibCheckCriteriaAssignment_1 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4645:1: ( ( rule__FireEvents__LibCheckCriteriaAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4646:1: ( rule__FireEvents__LibCheckCriteriaAssignment_1 )
            {
             before(grammarAccess.getFireEventsAccess().getLibCheckCriteriaAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4647:1: ( rule__FireEvents__LibCheckCriteriaAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4647:2: rule__FireEvents__LibCheckCriteriaAssignment_1
            {
            pushFollow(FOLLOW_rule__FireEvents__LibCheckCriteriaAssignment_1_in_rule__FireEvents__Group__19658);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4661:1: rule__AttrProperties__Group__0 : ( ( rule__AttrProperties__DescriptionAssignment_0 ) ) rule__AttrProperties__Group__1 ;
    public final void rule__AttrProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4665:1: ( ( ( rule__AttrProperties__DescriptionAssignment_0 ) ) rule__AttrProperties__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4666:1: ( ( rule__AttrProperties__DescriptionAssignment_0 ) ) rule__AttrProperties__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4666:1: ( ( rule__AttrProperties__DescriptionAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4667:1: ( rule__AttrProperties__DescriptionAssignment_0 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getDescriptionAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4668:1: ( rule__AttrProperties__DescriptionAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4668:2: rule__AttrProperties__DescriptionAssignment_0
            {
            pushFollow(FOLLOW_rule__AttrProperties__DescriptionAssignment_0_in_rule__AttrProperties__Group__09696);
            rule__AttrProperties__DescriptionAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__1_in_rule__AttrProperties__Group__09705);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4679:1: rule__AttrProperties__Group__1 : ( ( rule__AttrProperties__LabelAssignment_1 ) ) rule__AttrProperties__Group__2 ;
    public final void rule__AttrProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4683:1: ( ( ( rule__AttrProperties__LabelAssignment_1 ) ) rule__AttrProperties__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4684:1: ( ( rule__AttrProperties__LabelAssignment_1 ) ) rule__AttrProperties__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4684:1: ( ( rule__AttrProperties__LabelAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4685:1: ( rule__AttrProperties__LabelAssignment_1 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getLabelAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4686:1: ( rule__AttrProperties__LabelAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4686:2: rule__AttrProperties__LabelAssignment_1
            {
            pushFollow(FOLLOW_rule__AttrProperties__LabelAssignment_1_in_rule__AttrProperties__Group__19733);
            rule__AttrProperties__LabelAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getLabelAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__2_in_rule__AttrProperties__Group__19742);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4697:1: rule__AttrProperties__Group__2 : ( ( rule__AttrProperties__UnitAssignment_2 ) ) rule__AttrProperties__Group__3 ;
    public final void rule__AttrProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4701:1: ( ( ( rule__AttrProperties__UnitAssignment_2 ) ) rule__AttrProperties__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4702:1: ( ( rule__AttrProperties__UnitAssignment_2 ) ) rule__AttrProperties__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4702:1: ( ( rule__AttrProperties__UnitAssignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4703:1: ( rule__AttrProperties__UnitAssignment_2 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getUnitAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4704:1: ( rule__AttrProperties__UnitAssignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4704:2: rule__AttrProperties__UnitAssignment_2
            {
            pushFollow(FOLLOW_rule__AttrProperties__UnitAssignment_2_in_rule__AttrProperties__Group__29770);
            rule__AttrProperties__UnitAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getUnitAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__3_in_rule__AttrProperties__Group__29779);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4715:1: rule__AttrProperties__Group__3 : ( ( rule__AttrProperties__StandardUnitAssignment_3 ) ) rule__AttrProperties__Group__4 ;
    public final void rule__AttrProperties__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4719:1: ( ( ( rule__AttrProperties__StandardUnitAssignment_3 ) ) rule__AttrProperties__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4720:1: ( ( rule__AttrProperties__StandardUnitAssignment_3 ) ) rule__AttrProperties__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4720:1: ( ( rule__AttrProperties__StandardUnitAssignment_3 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4721:1: ( rule__AttrProperties__StandardUnitAssignment_3 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getStandardUnitAssignment_3()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4722:1: ( rule__AttrProperties__StandardUnitAssignment_3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4722:2: rule__AttrProperties__StandardUnitAssignment_3
            {
            pushFollow(FOLLOW_rule__AttrProperties__StandardUnitAssignment_3_in_rule__AttrProperties__Group__39807);
            rule__AttrProperties__StandardUnitAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getStandardUnitAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__4_in_rule__AttrProperties__Group__39816);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4733:1: rule__AttrProperties__Group__4 : ( ( rule__AttrProperties__DisplayUnitAssignment_4 ) ) rule__AttrProperties__Group__5 ;
    public final void rule__AttrProperties__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4737:1: ( ( ( rule__AttrProperties__DisplayUnitAssignment_4 ) ) rule__AttrProperties__Group__5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4738:1: ( ( rule__AttrProperties__DisplayUnitAssignment_4 ) ) rule__AttrProperties__Group__5
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4738:1: ( ( rule__AttrProperties__DisplayUnitAssignment_4 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4739:1: ( rule__AttrProperties__DisplayUnitAssignment_4 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getDisplayUnitAssignment_4()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4740:1: ( rule__AttrProperties__DisplayUnitAssignment_4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4740:2: rule__AttrProperties__DisplayUnitAssignment_4
            {
            pushFollow(FOLLOW_rule__AttrProperties__DisplayUnitAssignment_4_in_rule__AttrProperties__Group__49844);
            rule__AttrProperties__DisplayUnitAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getDisplayUnitAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__5_in_rule__AttrProperties__Group__49853);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4751:1: rule__AttrProperties__Group__5 : ( ( rule__AttrProperties__FormatAssignment_5 ) ) rule__AttrProperties__Group__6 ;
    public final void rule__AttrProperties__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4755:1: ( ( ( rule__AttrProperties__FormatAssignment_5 ) ) rule__AttrProperties__Group__6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4756:1: ( ( rule__AttrProperties__FormatAssignment_5 ) ) rule__AttrProperties__Group__6
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4756:1: ( ( rule__AttrProperties__FormatAssignment_5 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4757:1: ( rule__AttrProperties__FormatAssignment_5 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getFormatAssignment_5()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4758:1: ( rule__AttrProperties__FormatAssignment_5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4758:2: rule__AttrProperties__FormatAssignment_5
            {
            pushFollow(FOLLOW_rule__AttrProperties__FormatAssignment_5_in_rule__AttrProperties__Group__59881);
            rule__AttrProperties__FormatAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getFormatAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__6_in_rule__AttrProperties__Group__59890);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4769:1: rule__AttrProperties__Group__6 : ( ( rule__AttrProperties__MaxValueAssignment_6 ) ) rule__AttrProperties__Group__7 ;
    public final void rule__AttrProperties__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4773:1: ( ( ( rule__AttrProperties__MaxValueAssignment_6 ) ) rule__AttrProperties__Group__7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4774:1: ( ( rule__AttrProperties__MaxValueAssignment_6 ) ) rule__AttrProperties__Group__7
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4774:1: ( ( rule__AttrProperties__MaxValueAssignment_6 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4775:1: ( rule__AttrProperties__MaxValueAssignment_6 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getMaxValueAssignment_6()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4776:1: ( rule__AttrProperties__MaxValueAssignment_6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4776:2: rule__AttrProperties__MaxValueAssignment_6
            {
            pushFollow(FOLLOW_rule__AttrProperties__MaxValueAssignment_6_in_rule__AttrProperties__Group__69918);
            rule__AttrProperties__MaxValueAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getMaxValueAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__7_in_rule__AttrProperties__Group__69927);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4787:1: rule__AttrProperties__Group__7 : ( ( rule__AttrProperties__MinValueAssignment_7 ) ) rule__AttrProperties__Group__8 ;
    public final void rule__AttrProperties__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4791:1: ( ( ( rule__AttrProperties__MinValueAssignment_7 ) ) rule__AttrProperties__Group__8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4792:1: ( ( rule__AttrProperties__MinValueAssignment_7 ) ) rule__AttrProperties__Group__8
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4792:1: ( ( rule__AttrProperties__MinValueAssignment_7 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4793:1: ( rule__AttrProperties__MinValueAssignment_7 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getMinValueAssignment_7()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4794:1: ( rule__AttrProperties__MinValueAssignment_7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4794:2: rule__AttrProperties__MinValueAssignment_7
            {
            pushFollow(FOLLOW_rule__AttrProperties__MinValueAssignment_7_in_rule__AttrProperties__Group__79955);
            rule__AttrProperties__MinValueAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getMinValueAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__8_in_rule__AttrProperties__Group__79964);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4805:1: rule__AttrProperties__Group__8 : ( ( rule__AttrProperties__MaxAlarmAssignment_8 ) ) rule__AttrProperties__Group__9 ;
    public final void rule__AttrProperties__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4809:1: ( ( ( rule__AttrProperties__MaxAlarmAssignment_8 ) ) rule__AttrProperties__Group__9 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4810:1: ( ( rule__AttrProperties__MaxAlarmAssignment_8 ) ) rule__AttrProperties__Group__9
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4810:1: ( ( rule__AttrProperties__MaxAlarmAssignment_8 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4811:1: ( rule__AttrProperties__MaxAlarmAssignment_8 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getMaxAlarmAssignment_8()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4812:1: ( rule__AttrProperties__MaxAlarmAssignment_8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4812:2: rule__AttrProperties__MaxAlarmAssignment_8
            {
            pushFollow(FOLLOW_rule__AttrProperties__MaxAlarmAssignment_8_in_rule__AttrProperties__Group__89992);
            rule__AttrProperties__MaxAlarmAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getMaxAlarmAssignment_8()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__9_in_rule__AttrProperties__Group__810001);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4823:1: rule__AttrProperties__Group__9 : ( ( rule__AttrProperties__MinAlarmAssignment_9 ) ) rule__AttrProperties__Group__10 ;
    public final void rule__AttrProperties__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4827:1: ( ( ( rule__AttrProperties__MinAlarmAssignment_9 ) ) rule__AttrProperties__Group__10 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4828:1: ( ( rule__AttrProperties__MinAlarmAssignment_9 ) ) rule__AttrProperties__Group__10
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4828:1: ( ( rule__AttrProperties__MinAlarmAssignment_9 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4829:1: ( rule__AttrProperties__MinAlarmAssignment_9 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getMinAlarmAssignment_9()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4830:1: ( rule__AttrProperties__MinAlarmAssignment_9 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4830:2: rule__AttrProperties__MinAlarmAssignment_9
            {
            pushFollow(FOLLOW_rule__AttrProperties__MinAlarmAssignment_9_in_rule__AttrProperties__Group__910029);
            rule__AttrProperties__MinAlarmAssignment_9();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getMinAlarmAssignment_9()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__10_in_rule__AttrProperties__Group__910038);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4841:1: rule__AttrProperties__Group__10 : ( ( rule__AttrProperties__MaxWarningAssignment_10 ) ) rule__AttrProperties__Group__11 ;
    public final void rule__AttrProperties__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4845:1: ( ( ( rule__AttrProperties__MaxWarningAssignment_10 ) ) rule__AttrProperties__Group__11 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4846:1: ( ( rule__AttrProperties__MaxWarningAssignment_10 ) ) rule__AttrProperties__Group__11
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4846:1: ( ( rule__AttrProperties__MaxWarningAssignment_10 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4847:1: ( rule__AttrProperties__MaxWarningAssignment_10 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getMaxWarningAssignment_10()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4848:1: ( rule__AttrProperties__MaxWarningAssignment_10 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4848:2: rule__AttrProperties__MaxWarningAssignment_10
            {
            pushFollow(FOLLOW_rule__AttrProperties__MaxWarningAssignment_10_in_rule__AttrProperties__Group__1010066);
            rule__AttrProperties__MaxWarningAssignment_10();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getMaxWarningAssignment_10()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__11_in_rule__AttrProperties__Group__1010075);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4859:1: rule__AttrProperties__Group__11 : ( ( rule__AttrProperties__MinWarningAssignment_11 ) ) rule__AttrProperties__Group__12 ;
    public final void rule__AttrProperties__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4863:1: ( ( ( rule__AttrProperties__MinWarningAssignment_11 ) ) rule__AttrProperties__Group__12 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4864:1: ( ( rule__AttrProperties__MinWarningAssignment_11 ) ) rule__AttrProperties__Group__12
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4864:1: ( ( rule__AttrProperties__MinWarningAssignment_11 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4865:1: ( rule__AttrProperties__MinWarningAssignment_11 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getMinWarningAssignment_11()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4866:1: ( rule__AttrProperties__MinWarningAssignment_11 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4866:2: rule__AttrProperties__MinWarningAssignment_11
            {
            pushFollow(FOLLOW_rule__AttrProperties__MinWarningAssignment_11_in_rule__AttrProperties__Group__1110103);
            rule__AttrProperties__MinWarningAssignment_11();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getMinWarningAssignment_11()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__12_in_rule__AttrProperties__Group__1110112);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4877:1: rule__AttrProperties__Group__12 : ( ( rule__AttrProperties__DeltaTimeAssignment_12 ) ) rule__AttrProperties__Group__13 ;
    public final void rule__AttrProperties__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4881:1: ( ( ( rule__AttrProperties__DeltaTimeAssignment_12 ) ) rule__AttrProperties__Group__13 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4882:1: ( ( rule__AttrProperties__DeltaTimeAssignment_12 ) ) rule__AttrProperties__Group__13
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4882:1: ( ( rule__AttrProperties__DeltaTimeAssignment_12 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4883:1: ( rule__AttrProperties__DeltaTimeAssignment_12 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getDeltaTimeAssignment_12()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4884:1: ( rule__AttrProperties__DeltaTimeAssignment_12 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4884:2: rule__AttrProperties__DeltaTimeAssignment_12
            {
            pushFollow(FOLLOW_rule__AttrProperties__DeltaTimeAssignment_12_in_rule__AttrProperties__Group__1210140);
            rule__AttrProperties__DeltaTimeAssignment_12();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getDeltaTimeAssignment_12()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__13_in_rule__AttrProperties__Group__1210149);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4895:1: rule__AttrProperties__Group__13 : ( ( rule__AttrProperties__DeltaValueAssignment_13 ) ) ;
    public final void rule__AttrProperties__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4899:1: ( ( ( rule__AttrProperties__DeltaValueAssignment_13 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4900:1: ( ( rule__AttrProperties__DeltaValueAssignment_13 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4900:1: ( ( rule__AttrProperties__DeltaValueAssignment_13 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4901:1: ( rule__AttrProperties__DeltaValueAssignment_13 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getDeltaValueAssignment_13()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4902:1: ( rule__AttrProperties__DeltaValueAssignment_13 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4902:2: rule__AttrProperties__DeltaValueAssignment_13
            {
            pushFollow(FOLLOW_rule__AttrProperties__DeltaValueAssignment_13_in_rule__AttrProperties__Group__1310177);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4940:1: rule__VoidType__Group__0 : ( () ) rule__VoidType__Group__1 ;
    public final void rule__VoidType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4944:1: ( ( () ) rule__VoidType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4945:1: ( () ) rule__VoidType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4945:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4946:1: ()
            {
             before(grammarAccess.getVoidTypeAccess().getVoidTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4947:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4949:1: 
            {
            }

             after(grammarAccess.getVoidTypeAccess().getVoidTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__VoidType__Group__1_in_rule__VoidType__Group__010249);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4960:1: rule__VoidType__Group__1 : ( 'void' ) ;
    public final void rule__VoidType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4964:1: ( ( 'void' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4965:1: ( 'void' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4965:1: ( 'void' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4966:1: 'void'
            {
             before(grammarAccess.getVoidTypeAccess().getVoidKeyword_1()); 
            match(input,44,FOLLOW_44_in_rule__VoidType__Group__110278); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4983:1: rule__BooleanType__Group__0 : ( () ) rule__BooleanType__Group__1 ;
    public final void rule__BooleanType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4987:1: ( ( () ) rule__BooleanType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4988:1: ( () ) rule__BooleanType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4988:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4989:1: ()
            {
             before(grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4990:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4992:1: 
            {
            }

             after(grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__BooleanType__Group__1_in_rule__BooleanType__Group__010327);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5003:1: rule__BooleanType__Group__1 : ( 'boolean' ) ;
    public final void rule__BooleanType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5007:1: ( ( 'boolean' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5008:1: ( 'boolean' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5008:1: ( 'boolean' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5009:1: 'boolean'
            {
             before(grammarAccess.getBooleanTypeAccess().getBooleanKeyword_1()); 
            match(input,45,FOLLOW_45_in_rule__BooleanType__Group__110356); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5026:1: rule__ShortType__Group__0 : ( () ) rule__ShortType__Group__1 ;
    public final void rule__ShortType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5030:1: ( ( () ) rule__ShortType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5031:1: ( () ) rule__ShortType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5031:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5032:1: ()
            {
             before(grammarAccess.getShortTypeAccess().getShortTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5033:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5035:1: 
            {
            }

             after(grammarAccess.getShortTypeAccess().getShortTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__ShortType__Group__1_in_rule__ShortType__Group__010405);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5046:1: rule__ShortType__Group__1 : ( 'short' ) ;
    public final void rule__ShortType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5050:1: ( ( 'short' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5051:1: ( 'short' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5051:1: ( 'short' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5052:1: 'short'
            {
             before(grammarAccess.getShortTypeAccess().getShortKeyword_1()); 
            match(input,46,FOLLOW_46_in_rule__ShortType__Group__110434); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5069:1: rule__UShortType__Group__0 : ( () ) rule__UShortType__Group__1 ;
    public final void rule__UShortType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5073:1: ( ( () ) rule__UShortType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5074:1: ( () ) rule__UShortType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5074:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5075:1: ()
            {
             before(grammarAccess.getUShortTypeAccess().getUShortTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5076:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5078:1: 
            {
            }

             after(grammarAccess.getUShortTypeAccess().getUShortTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__UShortType__Group__1_in_rule__UShortType__Group__010483);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5089:1: rule__UShortType__Group__1 : ( 'ushort' ) ;
    public final void rule__UShortType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5093:1: ( ( 'ushort' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5094:1: ( 'ushort' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5094:1: ( 'ushort' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5095:1: 'ushort'
            {
             before(grammarAccess.getUShortTypeAccess().getUshortKeyword_1()); 
            match(input,47,FOLLOW_47_in_rule__UShortType__Group__110512); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5112:1: rule__IntType__Group__0 : ( () ) rule__IntType__Group__1 ;
    public final void rule__IntType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5116:1: ( ( () ) rule__IntType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5117:1: ( () ) rule__IntType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5117:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5118:1: ()
            {
             before(grammarAccess.getIntTypeAccess().getIntTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5119:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5121:1: 
            {
            }

             after(grammarAccess.getIntTypeAccess().getIntTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__IntType__Group__1_in_rule__IntType__Group__010561);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5132:1: rule__IntType__Group__1 : ( 'int' ) ;
    public final void rule__IntType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5136:1: ( ( 'int' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5137:1: ( 'int' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5137:1: ( 'int' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5138:1: 'int'
            {
             before(grammarAccess.getIntTypeAccess().getIntKeyword_1()); 
            match(input,48,FOLLOW_48_in_rule__IntType__Group__110590); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5155:1: rule__UIntType__Group__0 : ( () ) rule__UIntType__Group__1 ;
    public final void rule__UIntType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5159:1: ( ( () ) rule__UIntType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5160:1: ( () ) rule__UIntType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5160:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5161:1: ()
            {
             before(grammarAccess.getUIntTypeAccess().getUIntTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5162:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5164:1: 
            {
            }

             after(grammarAccess.getUIntTypeAccess().getUIntTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__UIntType__Group__1_in_rule__UIntType__Group__010639);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5175:1: rule__UIntType__Group__1 : ( 'uint' ) ;
    public final void rule__UIntType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5179:1: ( ( 'uint' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5180:1: ( 'uint' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5180:1: ( 'uint' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5181:1: 'uint'
            {
             before(grammarAccess.getUIntTypeAccess().getUintKeyword_1()); 
            match(input,49,FOLLOW_49_in_rule__UIntType__Group__110668); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5198:1: rule__FloatType__Group__0 : ( () ) rule__FloatType__Group__1 ;
    public final void rule__FloatType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5202:1: ( ( () ) rule__FloatType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5203:1: ( () ) rule__FloatType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5203:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5204:1: ()
            {
             before(grammarAccess.getFloatTypeAccess().getFloatTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5205:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5207:1: 
            {
            }

             after(grammarAccess.getFloatTypeAccess().getFloatTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__FloatType__Group__1_in_rule__FloatType__Group__010717);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5218:1: rule__FloatType__Group__1 : ( 'float' ) ;
    public final void rule__FloatType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5222:1: ( ( 'float' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5223:1: ( 'float' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5223:1: ( 'float' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5224:1: 'float'
            {
             before(grammarAccess.getFloatTypeAccess().getFloatKeyword_1()); 
            match(input,50,FOLLOW_50_in_rule__FloatType__Group__110746); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5241:1: rule__DoubleType__Group__0 : ( () ) rule__DoubleType__Group__1 ;
    public final void rule__DoubleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5245:1: ( ( () ) rule__DoubleType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5246:1: ( () ) rule__DoubleType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5246:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5247:1: ()
            {
             before(grammarAccess.getDoubleTypeAccess().getDoubleTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5248:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5250:1: 
            {
            }

             after(grammarAccess.getDoubleTypeAccess().getDoubleTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__DoubleType__Group__1_in_rule__DoubleType__Group__010795);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5261:1: rule__DoubleType__Group__1 : ( 'double' ) ;
    public final void rule__DoubleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5265:1: ( ( 'double' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5266:1: ( 'double' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5266:1: ( 'double' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5267:1: 'double'
            {
             before(grammarAccess.getDoubleTypeAccess().getDoubleKeyword_1()); 
            match(input,51,FOLLOW_51_in_rule__DoubleType__Group__110824); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5284:1: rule__StringType__Group__0 : ( () ) rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5288:1: ( ( () ) rule__StringType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5289:1: ( () ) rule__StringType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5289:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5290:1: ()
            {
             before(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5291:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5293:1: 
            {
            }

             after(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__StringType__Group__1_in_rule__StringType__Group__010873);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5304:1: rule__StringType__Group__1 : ( 'string' ) ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5308:1: ( ( 'string' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5309:1: ( 'string' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5309:1: ( 'string' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5310:1: 'string'
            {
             before(grammarAccess.getStringTypeAccess().getStringKeyword_1()); 
            match(input,52,FOLLOW_52_in_rule__StringType__Group__110902); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5327:1: rule__CharArrayType__Group__0 : ( () ) rule__CharArrayType__Group__1 ;
    public final void rule__CharArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5331:1: ( ( () ) rule__CharArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5332:1: ( () ) rule__CharArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5332:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5333:1: ()
            {
             before(grammarAccess.getCharArrayTypeAccess().getCharArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5334:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5336:1: 
            {
            }

             after(grammarAccess.getCharArrayTypeAccess().getCharArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__CharArrayType__Group__1_in_rule__CharArrayType__Group__010951);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5347:1: rule__CharArrayType__Group__1 : ( 'DevVarCharArray' ) ;
    public final void rule__CharArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5351:1: ( ( 'DevVarCharArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5352:1: ( 'DevVarCharArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5352:1: ( 'DevVarCharArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5353:1: 'DevVarCharArray'
            {
             before(grammarAccess.getCharArrayTypeAccess().getDevVarCharArrayKeyword_1()); 
            match(input,53,FOLLOW_53_in_rule__CharArrayType__Group__110980); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5370:1: rule__ShortArrayType__Group__0 : ( () ) rule__ShortArrayType__Group__1 ;
    public final void rule__ShortArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5374:1: ( ( () ) rule__ShortArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5375:1: ( () ) rule__ShortArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5375:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5376:1: ()
            {
             before(grammarAccess.getShortArrayTypeAccess().getShortArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5377:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5379:1: 
            {
            }

             after(grammarAccess.getShortArrayTypeAccess().getShortArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__ShortArrayType__Group__1_in_rule__ShortArrayType__Group__011029);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5390:1: rule__ShortArrayType__Group__1 : ( 'DevVarShortArray' ) ;
    public final void rule__ShortArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5394:1: ( ( 'DevVarShortArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5395:1: ( 'DevVarShortArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5395:1: ( 'DevVarShortArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5396:1: 'DevVarShortArray'
            {
             before(grammarAccess.getShortArrayTypeAccess().getDevVarShortArrayKeyword_1()); 
            match(input,54,FOLLOW_54_in_rule__ShortArrayType__Group__111058); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5413:1: rule__UShortArrayType__Group__0 : ( () ) rule__UShortArrayType__Group__1 ;
    public final void rule__UShortArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5417:1: ( ( () ) rule__UShortArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5418:1: ( () ) rule__UShortArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5418:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5419:1: ()
            {
             before(grammarAccess.getUShortArrayTypeAccess().getUShortArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5420:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5422:1: 
            {
            }

             after(grammarAccess.getUShortArrayTypeAccess().getUShortArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__UShortArrayType__Group__1_in_rule__UShortArrayType__Group__011107);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5433:1: rule__UShortArrayType__Group__1 : ( 'DevVarUShortArray' ) ;
    public final void rule__UShortArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5437:1: ( ( 'DevVarUShortArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5438:1: ( 'DevVarUShortArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5438:1: ( 'DevVarUShortArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5439:1: 'DevVarUShortArray'
            {
             before(grammarAccess.getUShortArrayTypeAccess().getDevVarUShortArrayKeyword_1()); 
            match(input,55,FOLLOW_55_in_rule__UShortArrayType__Group__111136); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5456:1: rule__IntArrayType__Group__0 : ( () ) rule__IntArrayType__Group__1 ;
    public final void rule__IntArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5460:1: ( ( () ) rule__IntArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5461:1: ( () ) rule__IntArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5461:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5462:1: ()
            {
             before(grammarAccess.getIntArrayTypeAccess().getIntArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5463:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5465:1: 
            {
            }

             after(grammarAccess.getIntArrayTypeAccess().getIntArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__IntArrayType__Group__1_in_rule__IntArrayType__Group__011185);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5476:1: rule__IntArrayType__Group__1 : ( 'DevVarLongArray' ) ;
    public final void rule__IntArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5480:1: ( ( 'DevVarLongArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5481:1: ( 'DevVarLongArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5481:1: ( 'DevVarLongArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5482:1: 'DevVarLongArray'
            {
             before(grammarAccess.getIntArrayTypeAccess().getDevVarLongArrayKeyword_1()); 
            match(input,56,FOLLOW_56_in_rule__IntArrayType__Group__111214); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5499:1: rule__UIntArrayType__Group__0 : ( () ) rule__UIntArrayType__Group__1 ;
    public final void rule__UIntArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5503:1: ( ( () ) rule__UIntArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5504:1: ( () ) rule__UIntArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5504:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5505:1: ()
            {
             before(grammarAccess.getUIntArrayTypeAccess().getUIntArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5506:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5508:1: 
            {
            }

             after(grammarAccess.getUIntArrayTypeAccess().getUIntArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__UIntArrayType__Group__1_in_rule__UIntArrayType__Group__011263);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5519:1: rule__UIntArrayType__Group__1 : ( 'DevVarULongArray' ) ;
    public final void rule__UIntArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5523:1: ( ( 'DevVarULongArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5524:1: ( 'DevVarULongArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5524:1: ( 'DevVarULongArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5525:1: 'DevVarULongArray'
            {
             before(grammarAccess.getUIntArrayTypeAccess().getDevVarULongArrayKeyword_1()); 
            match(input,57,FOLLOW_57_in_rule__UIntArrayType__Group__111292); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5542:1: rule__FloatArrayType__Group__0 : ( () ) rule__FloatArrayType__Group__1 ;
    public final void rule__FloatArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5546:1: ( ( () ) rule__FloatArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5547:1: ( () ) rule__FloatArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5547:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5548:1: ()
            {
             before(grammarAccess.getFloatArrayTypeAccess().getFloatArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5549:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5551:1: 
            {
            }

             after(grammarAccess.getFloatArrayTypeAccess().getFloatArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__FloatArrayType__Group__1_in_rule__FloatArrayType__Group__011341);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5562:1: rule__FloatArrayType__Group__1 : ( 'DevVarFloatArray' ) ;
    public final void rule__FloatArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5566:1: ( ( 'DevVarFloatArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5567:1: ( 'DevVarFloatArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5567:1: ( 'DevVarFloatArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5568:1: 'DevVarFloatArray'
            {
             before(grammarAccess.getFloatArrayTypeAccess().getDevVarFloatArrayKeyword_1()); 
            match(input,58,FOLLOW_58_in_rule__FloatArrayType__Group__111370); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5585:1: rule__DoubleArrayType__Group__0 : ( () ) rule__DoubleArrayType__Group__1 ;
    public final void rule__DoubleArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5589:1: ( ( () ) rule__DoubleArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5590:1: ( () ) rule__DoubleArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5590:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5591:1: ()
            {
             before(grammarAccess.getDoubleArrayTypeAccess().getDoubleArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5592:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5594:1: 
            {
            }

             after(grammarAccess.getDoubleArrayTypeAccess().getDoubleArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__DoubleArrayType__Group__1_in_rule__DoubleArrayType__Group__011419);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5605:1: rule__DoubleArrayType__Group__1 : ( 'DevVarDoubleArray' ) ;
    public final void rule__DoubleArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5609:1: ( ( 'DevVarDoubleArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5610:1: ( 'DevVarDoubleArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5610:1: ( 'DevVarDoubleArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5611:1: 'DevVarDoubleArray'
            {
             before(grammarAccess.getDoubleArrayTypeAccess().getDevVarDoubleArrayKeyword_1()); 
            match(input,59,FOLLOW_59_in_rule__DoubleArrayType__Group__111448); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5628:1: rule__StringArrayType__Group__0 : ( () ) rule__StringArrayType__Group__1 ;
    public final void rule__StringArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5632:1: ( ( () ) rule__StringArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5633:1: ( () ) rule__StringArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5633:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5634:1: ()
            {
             before(grammarAccess.getStringArrayTypeAccess().getStringArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5635:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5637:1: 
            {
            }

             after(grammarAccess.getStringArrayTypeAccess().getStringArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__StringArrayType__Group__1_in_rule__StringArrayType__Group__011497);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5648:1: rule__StringArrayType__Group__1 : ( 'DevVarStringArray' ) ;
    public final void rule__StringArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5652:1: ( ( 'DevVarStringArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5653:1: ( 'DevVarStringArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5653:1: ( 'DevVarStringArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5654:1: 'DevVarStringArray'
            {
             before(grammarAccess.getStringArrayTypeAccess().getDevVarStringArrayKeyword_1()); 
            match(input,60,FOLLOW_60_in_rule__StringArrayType__Group__111526); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5671:1: rule__LongStringArrayType__Group__0 : ( () ) rule__LongStringArrayType__Group__1 ;
    public final void rule__LongStringArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5675:1: ( ( () ) rule__LongStringArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5676:1: ( () ) rule__LongStringArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5676:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5677:1: ()
            {
             before(grammarAccess.getLongStringArrayTypeAccess().getLongStringArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5678:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5680:1: 
            {
            }

             after(grammarAccess.getLongStringArrayTypeAccess().getLongStringArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__LongStringArrayType__Group__1_in_rule__LongStringArrayType__Group__011575);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5691:1: rule__LongStringArrayType__Group__1 : ( 'DevVarLongStringArray' ) ;
    public final void rule__LongStringArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5695:1: ( ( 'DevVarLongStringArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5696:1: ( 'DevVarLongStringArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5696:1: ( 'DevVarLongStringArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5697:1: 'DevVarLongStringArray'
            {
             before(grammarAccess.getLongStringArrayTypeAccess().getDevVarLongStringArrayKeyword_1()); 
            match(input,61,FOLLOW_61_in_rule__LongStringArrayType__Group__111604); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5714:1: rule__DoubleStringArrayType__Group__0 : ( () ) rule__DoubleStringArrayType__Group__1 ;
    public final void rule__DoubleStringArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5718:1: ( ( () ) rule__DoubleStringArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5719:1: ( () ) rule__DoubleStringArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5719:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5720:1: ()
            {
             before(grammarAccess.getDoubleStringArrayTypeAccess().getDoubleStringArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5721:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5723:1: 
            {
            }

             after(grammarAccess.getDoubleStringArrayTypeAccess().getDoubleStringArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__DoubleStringArrayType__Group__1_in_rule__DoubleStringArrayType__Group__011653);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5734:1: rule__DoubleStringArrayType__Group__1 : ( 'DevVarDoubleStringArray' ) ;
    public final void rule__DoubleStringArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5738:1: ( ( 'DevVarDoubleStringArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5739:1: ( 'DevVarDoubleStringArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5739:1: ( 'DevVarDoubleStringArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5740:1: 'DevVarDoubleStringArray'
            {
             before(grammarAccess.getDoubleStringArrayTypeAccess().getDevVarDoubleStringArrayKeyword_1()); 
            match(input,62,FOLLOW_62_in_rule__DoubleStringArrayType__Group__111682); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5757:1: rule__StateType__Group__0 : ( () ) rule__StateType__Group__1 ;
    public final void rule__StateType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5761:1: ( ( () ) rule__StateType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5762:1: ( () ) rule__StateType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5762:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5763:1: ()
            {
             before(grammarAccess.getStateTypeAccess().getStateTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5764:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5766:1: 
            {
            }

             after(grammarAccess.getStateTypeAccess().getStateTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__StateType__Group__1_in_rule__StateType__Group__011731);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5777:1: rule__StateType__Group__1 : ( 'DevState' ) ;
    public final void rule__StateType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5781:1: ( ( 'DevState' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5782:1: ( 'DevState' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5782:1: ( 'DevState' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5783:1: 'DevState'
            {
             before(grammarAccess.getStateTypeAccess().getDevStateKeyword_1()); 
            match(input,63,FOLLOW_63_in_rule__StateType__Group__111760); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5800:1: rule__ConstStringType__Group__0 : ( () ) rule__ConstStringType__Group__1 ;
    public final void rule__ConstStringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5804:1: ( ( () ) rule__ConstStringType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5805:1: ( () ) rule__ConstStringType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5805:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5806:1: ()
            {
             before(grammarAccess.getConstStringTypeAccess().getConstStringTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5807:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5809:1: 
            {
            }

             after(grammarAccess.getConstStringTypeAccess().getConstStringTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__ConstStringType__Group__1_in_rule__ConstStringType__Group__011809);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5820:1: rule__ConstStringType__Group__1 : ( 'ConstDevString' ) ;
    public final void rule__ConstStringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5824:1: ( ( 'ConstDevString' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5825:1: ( 'ConstDevString' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5825:1: ( 'ConstDevString' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5826:1: 'ConstDevString'
            {
             before(grammarAccess.getConstStringTypeAccess().getConstDevStringKeyword_1()); 
            match(input,64,FOLLOW_64_in_rule__ConstStringType__Group__111838); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5843:1: rule__BooleanArrayType__Group__0 : ( () ) rule__BooleanArrayType__Group__1 ;
    public final void rule__BooleanArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5847:1: ( ( () ) rule__BooleanArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5848:1: ( () ) rule__BooleanArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5848:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5849:1: ()
            {
             before(grammarAccess.getBooleanArrayTypeAccess().getBooleanArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5850:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5852:1: 
            {
            }

             after(grammarAccess.getBooleanArrayTypeAccess().getBooleanArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__BooleanArrayType__Group__1_in_rule__BooleanArrayType__Group__011887);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5863:1: rule__BooleanArrayType__Group__1 : ( 'DevVarBooleanArray' ) ;
    public final void rule__BooleanArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5867:1: ( ( 'DevVarBooleanArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5868:1: ( 'DevVarBooleanArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5868:1: ( 'DevVarBooleanArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5869:1: 'DevVarBooleanArray'
            {
             before(grammarAccess.getBooleanArrayTypeAccess().getDevVarBooleanArrayKeyword_1()); 
            match(input,65,FOLLOW_65_in_rule__BooleanArrayType__Group__111916); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5886:1: rule__UCharType__Group__0 : ( () ) rule__UCharType__Group__1 ;
    public final void rule__UCharType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5890:1: ( ( () ) rule__UCharType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5891:1: ( () ) rule__UCharType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5891:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5892:1: ()
            {
             before(grammarAccess.getUCharTypeAccess().getUCharTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5893:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5895:1: 
            {
            }

             after(grammarAccess.getUCharTypeAccess().getUCharTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__UCharType__Group__1_in_rule__UCharType__Group__011965);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5906:1: rule__UCharType__Group__1 : ( 'DevUChar' ) ;
    public final void rule__UCharType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5910:1: ( ( 'DevUChar' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5911:1: ( 'DevUChar' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5911:1: ( 'DevUChar' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5912:1: 'DevUChar'
            {
             before(grammarAccess.getUCharTypeAccess().getDevUCharKeyword_1()); 
            match(input,66,FOLLOW_66_in_rule__UCharType__Group__111994); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5929:1: rule__LongType__Group__0 : ( () ) rule__LongType__Group__1 ;
    public final void rule__LongType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5933:1: ( ( () ) rule__LongType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5934:1: ( () ) rule__LongType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5934:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5935:1: ()
            {
             before(grammarAccess.getLongTypeAccess().getLongTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5936:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5938:1: 
            {
            }

             after(grammarAccess.getLongTypeAccess().getLongTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__LongType__Group__1_in_rule__LongType__Group__012043);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5949:1: rule__LongType__Group__1 : ( 'DevLong64' ) ;
    public final void rule__LongType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5953:1: ( ( 'DevLong64' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5954:1: ( 'DevLong64' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5954:1: ( 'DevLong64' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5955:1: 'DevLong64'
            {
             before(grammarAccess.getLongTypeAccess().getDevLong64Keyword_1()); 
            match(input,67,FOLLOW_67_in_rule__LongType__Group__112072); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5972:1: rule__ULongType__Group__0 : ( () ) rule__ULongType__Group__1 ;
    public final void rule__ULongType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5976:1: ( ( () ) rule__ULongType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5977:1: ( () ) rule__ULongType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5977:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5978:1: ()
            {
             before(grammarAccess.getULongTypeAccess().getULongTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5979:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5981:1: 
            {
            }

             after(grammarAccess.getULongTypeAccess().getULongTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__ULongType__Group__1_in_rule__ULongType__Group__012121);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5992:1: rule__ULongType__Group__1 : ( 'DevULong64' ) ;
    public final void rule__ULongType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5996:1: ( ( 'DevULong64' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5997:1: ( 'DevULong64' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5997:1: ( 'DevULong64' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5998:1: 'DevULong64'
            {
             before(grammarAccess.getULongTypeAccess().getDevULong64Keyword_1()); 
            match(input,68,FOLLOW_68_in_rule__ULongType__Group__112150); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6015:1: rule__LongArrayType__Group__0 : ( () ) rule__LongArrayType__Group__1 ;
    public final void rule__LongArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6019:1: ( ( () ) rule__LongArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6020:1: ( () ) rule__LongArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6020:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6021:1: ()
            {
             before(grammarAccess.getLongArrayTypeAccess().getLongArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6022:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6024:1: 
            {
            }

             after(grammarAccess.getLongArrayTypeAccess().getLongArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__LongArrayType__Group__1_in_rule__LongArrayType__Group__012199);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6035:1: rule__LongArrayType__Group__1 : ( 'DevVarLong64Array' ) ;
    public final void rule__LongArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6039:1: ( ( 'DevVarLong64Array' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6040:1: ( 'DevVarLong64Array' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6040:1: ( 'DevVarLong64Array' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6041:1: 'DevVarLong64Array'
            {
             before(grammarAccess.getLongArrayTypeAccess().getDevVarLong64ArrayKeyword_1()); 
            match(input,69,FOLLOW_69_in_rule__LongArrayType__Group__112228); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6058:1: rule__ULongArrayType__Group__0 : ( () ) rule__ULongArrayType__Group__1 ;
    public final void rule__ULongArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6062:1: ( ( () ) rule__ULongArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6063:1: ( () ) rule__ULongArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6063:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6064:1: ()
            {
             before(grammarAccess.getULongArrayTypeAccess().getULongArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6065:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6067:1: 
            {
            }

             after(grammarAccess.getULongArrayTypeAccess().getULongArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__ULongArrayType__Group__1_in_rule__ULongArrayType__Group__012277);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6078:1: rule__ULongArrayType__Group__1 : ( 'DevVarULong64Array' ) ;
    public final void rule__ULongArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6082:1: ( ( 'DevVarULong64Array' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6083:1: ( 'DevVarULong64Array' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6083:1: ( 'DevVarULong64Array' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6084:1: 'DevVarULong64Array'
            {
             before(grammarAccess.getULongArrayTypeAccess().getDevVarULong64ArrayKeyword_1()); 
            match(input,70,FOLLOW_70_in_rule__ULongArrayType__Group__112306); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6101:1: rule__DevIntType__Group__0 : ( () ) rule__DevIntType__Group__1 ;
    public final void rule__DevIntType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6105:1: ( ( () ) rule__DevIntType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6106:1: ( () ) rule__DevIntType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6106:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6107:1: ()
            {
             before(grammarAccess.getDevIntTypeAccess().getDevIntTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6108:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6110:1: 
            {
            }

             after(grammarAccess.getDevIntTypeAccess().getDevIntTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__DevIntType__Group__1_in_rule__DevIntType__Group__012355);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6121:1: rule__DevIntType__Group__1 : ( 'DevInt' ) ;
    public final void rule__DevIntType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6125:1: ( ( 'DevInt' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6126:1: ( 'DevInt' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6126:1: ( 'DevInt' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6127:1: 'DevInt'
            {
             before(grammarAccess.getDevIntTypeAccess().getDevIntKeyword_1()); 
            match(input,71,FOLLOW_71_in_rule__DevIntType__Group__112384); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6144:1: rule__EncodedType__Group__0 : ( () ) rule__EncodedType__Group__1 ;
    public final void rule__EncodedType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6148:1: ( ( () ) rule__EncodedType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6149:1: ( () ) rule__EncodedType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6149:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6150:1: ()
            {
             before(grammarAccess.getEncodedTypeAccess().getEncodedTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6151:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6153:1: 
            {
            }

             after(grammarAccess.getEncodedTypeAccess().getEncodedTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__EncodedType__Group__1_in_rule__EncodedType__Group__012433);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6164:1: rule__EncodedType__Group__1 : ( 'DevEncoded' ) ;
    public final void rule__EncodedType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6168:1: ( ( 'DevEncoded' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6169:1: ( 'DevEncoded' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6169:1: ( 'DevEncoded' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6170:1: 'DevEncoded'
            {
             before(grammarAccess.getEncodedTypeAccess().getDevEncodedKeyword_1()); 
            match(input,72,FOLLOW_72_in_rule__EncodedType__Group__112462); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6187:1: rule__ShortVectorType__Group__0 : ( () ) rule__ShortVectorType__Group__1 ;
    public final void rule__ShortVectorType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6191:1: ( ( () ) rule__ShortVectorType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6192:1: ( () ) rule__ShortVectorType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6192:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6193:1: ()
            {
             before(grammarAccess.getShortVectorTypeAccess().getShortVectorTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6194:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6196:1: 
            {
            }

             after(grammarAccess.getShortVectorTypeAccess().getShortVectorTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__ShortVectorType__Group__1_in_rule__ShortVectorType__Group__012511);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6207:1: rule__ShortVectorType__Group__1 : ( 'vector<short>' ) ;
    public final void rule__ShortVectorType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6211:1: ( ( 'vector<short>' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6212:1: ( 'vector<short>' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6212:1: ( 'vector<short>' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6213:1: 'vector<short>'
            {
             before(grammarAccess.getShortVectorTypeAccess().getVectorShortKeyword_1()); 
            match(input,73,FOLLOW_73_in_rule__ShortVectorType__Group__112540); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6230:1: rule__IntVectorType__Group__0 : ( () ) rule__IntVectorType__Group__1 ;
    public final void rule__IntVectorType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6234:1: ( ( () ) rule__IntVectorType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6235:1: ( () ) rule__IntVectorType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6235:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6236:1: ()
            {
             before(grammarAccess.getIntVectorTypeAccess().getIntVectorTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6237:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6239:1: 
            {
            }

             after(grammarAccess.getIntVectorTypeAccess().getIntVectorTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__IntVectorType__Group__1_in_rule__IntVectorType__Group__012589);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6250:1: rule__IntVectorType__Group__1 : ( 'vector<int>' ) ;
    public final void rule__IntVectorType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6254:1: ( ( 'vector<int>' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6255:1: ( 'vector<int>' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6255:1: ( 'vector<int>' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6256:1: 'vector<int>'
            {
             before(grammarAccess.getIntVectorTypeAccess().getVectorIntKeyword_1()); 
            match(input,74,FOLLOW_74_in_rule__IntVectorType__Group__112618); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6273:1: rule__FloatVectorType__Group__0 : ( () ) rule__FloatVectorType__Group__1 ;
    public final void rule__FloatVectorType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6277:1: ( ( () ) rule__FloatVectorType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6278:1: ( () ) rule__FloatVectorType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6278:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6279:1: ()
            {
             before(grammarAccess.getFloatVectorTypeAccess().getFloatVectorTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6280:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6282:1: 
            {
            }

             after(grammarAccess.getFloatVectorTypeAccess().getFloatVectorTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__FloatVectorType__Group__1_in_rule__FloatVectorType__Group__012667);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6293:1: rule__FloatVectorType__Group__1 : ( 'vector<float>' ) ;
    public final void rule__FloatVectorType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6297:1: ( ( 'vector<float>' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6298:1: ( 'vector<float>' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6298:1: ( 'vector<float>' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6299:1: 'vector<float>'
            {
             before(grammarAccess.getFloatVectorTypeAccess().getVectorFloatKeyword_1()); 
            match(input,75,FOLLOW_75_in_rule__FloatVectorType__Group__112696); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6316:1: rule__DoubleVectorType__Group__0 : ( () ) rule__DoubleVectorType__Group__1 ;
    public final void rule__DoubleVectorType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6320:1: ( ( () ) rule__DoubleVectorType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6321:1: ( () ) rule__DoubleVectorType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6321:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6322:1: ()
            {
             before(grammarAccess.getDoubleVectorTypeAccess().getDoubleVectorTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6323:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6325:1: 
            {
            }

             after(grammarAccess.getDoubleVectorTypeAccess().getDoubleVectorTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__DoubleVectorType__Group__1_in_rule__DoubleVectorType__Group__012745);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6336:1: rule__DoubleVectorType__Group__1 : ( 'vector<double>' ) ;
    public final void rule__DoubleVectorType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6340:1: ( ( 'vector<double>' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6341:1: ( 'vector<double>' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6341:1: ( 'vector<double>' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6342:1: 'vector<double>'
            {
             before(grammarAccess.getDoubleVectorTypeAccess().getVectorDoubleKeyword_1()); 
            match(input,76,FOLLOW_76_in_rule__DoubleVectorType__Group__112774); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6359:1: rule__StringVectorType__Group__0 : ( () ) rule__StringVectorType__Group__1 ;
    public final void rule__StringVectorType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6363:1: ( ( () ) rule__StringVectorType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6364:1: ( () ) rule__StringVectorType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6364:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6365:1: ()
            {
             before(grammarAccess.getStringVectorTypeAccess().getStringVectorTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6366:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6368:1: 
            {
            }

             after(grammarAccess.getStringVectorTypeAccess().getStringVectorTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__StringVectorType__Group__1_in_rule__StringVectorType__Group__012823);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6379:1: rule__StringVectorType__Group__1 : ( 'vector<string>' ) ;
    public final void rule__StringVectorType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6383:1: ( ( 'vector<string>' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6384:1: ( 'vector<string>' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6384:1: ( 'vector<string>' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6385:1: 'vector<string>'
            {
             before(grammarAccess.getStringVectorTypeAccess().getVectorStringKeyword_1()); 
            match(input,77,FOLLOW_77_in_rule__StringVectorType__Group__112852); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6402:1: rule__PogoSystem__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__PogoSystem__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6406:1: ( ( ruleImport ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6407:1: ( ruleImport )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6407:1: ( ruleImport )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6408:1: ruleImport
            {
             before(grammarAccess.getPogoSystemAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__PogoSystem__ImportsAssignment_012891);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6417:1: rule__PogoSystem__ClassesAssignment_1 : ( rulePogoDeviceClass ) ;
    public final void rule__PogoSystem__ClassesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6421:1: ( ( rulePogoDeviceClass ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6422:1: ( rulePogoDeviceClass )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6422:1: ( rulePogoDeviceClass )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6423:1: rulePogoDeviceClass
            {
             before(grammarAccess.getPogoSystemAccess().getClassesPogoDeviceClassParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePogoDeviceClass_in_rule__PogoSystem__ClassesAssignment_112922);
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


    // $ANTLR start rule__PogoSystem__MultiClassesAssignment_2
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6432:1: rule__PogoSystem__MultiClassesAssignment_2 : ( rulePogoMultiClasses ) ;
    public final void rule__PogoSystem__MultiClassesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6436:1: ( ( rulePogoMultiClasses ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6437:1: ( rulePogoMultiClasses )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6437:1: ( rulePogoMultiClasses )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6438:1: rulePogoMultiClasses
            {
             before(grammarAccess.getPogoSystemAccess().getMultiClassesPogoMultiClassesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePogoMultiClasses_in_rule__PogoSystem__MultiClassesAssignment_212953);
            rulePogoMultiClasses();
            _fsp--;

             after(grammarAccess.getPogoSystemAccess().getMultiClassesPogoMultiClassesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoSystem__MultiClassesAssignment_2


    // $ANTLR start rule__Import__ImportURIAssignment_1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6447:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6451:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6452:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6452:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6453:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_112984); 
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


    // $ANTLR start rule__PogoMultiClasses__NameAssignment_1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6462:1: rule__PogoMultiClasses__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PogoMultiClasses__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6466:1: ( ( RULE_ID ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6467:1: ( RULE_ID )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6467:1: ( RULE_ID )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6468:1: RULE_ID
            {
             before(grammarAccess.getPogoMultiClassesAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PogoMultiClasses__NameAssignment_113015); 
             after(grammarAccess.getPogoMultiClassesAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoMultiClasses__NameAssignment_1


    // $ANTLR start rule__PogoMultiClasses__SourcePathAssignment_3
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6477:1: rule__PogoMultiClasses__SourcePathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__PogoMultiClasses__SourcePathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6481:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6482:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6482:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6483:1: RULE_STRING
            {
             before(grammarAccess.getPogoMultiClassesAccess().getSourcePathSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PogoMultiClasses__SourcePathAssignment_313046); 
             after(grammarAccess.getPogoMultiClassesAccess().getSourcePathSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoMultiClasses__SourcePathAssignment_3


    // $ANTLR start rule__PogoMultiClasses__DescriptionAssignment_4
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6492:1: rule__PogoMultiClasses__DescriptionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__PogoMultiClasses__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6496:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6497:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6497:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6498:1: RULE_STRING
            {
             before(grammarAccess.getPogoMultiClassesAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PogoMultiClasses__DescriptionAssignment_413077); 
             after(grammarAccess.getPogoMultiClassesAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoMultiClasses__DescriptionAssignment_4


    // $ANTLR start rule__PogoMultiClasses__TitleAssignment_5
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6507:1: rule__PogoMultiClasses__TitleAssignment_5 : ( RULE_STRING ) ;
    public final void rule__PogoMultiClasses__TitleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6511:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6512:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6512:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6513:1: RULE_STRING
            {
             before(grammarAccess.getPogoMultiClassesAccess().getTitleSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PogoMultiClasses__TitleAssignment_513108); 
             after(grammarAccess.getPogoMultiClassesAccess().getTitleSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoMultiClasses__TitleAssignment_5


    // $ANTLR start rule__PogoMultiClasses__ClassesAssignment_7
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6522:1: rule__PogoMultiClasses__ClassesAssignment_7 : ( ruleOneClassSimpleDef ) ;
    public final void rule__PogoMultiClasses__ClassesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6526:1: ( ( ruleOneClassSimpleDef ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6527:1: ( ruleOneClassSimpleDef )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6527:1: ( ruleOneClassSimpleDef )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6528:1: ruleOneClassSimpleDef
            {
             before(grammarAccess.getPogoMultiClassesAccess().getClassesOneClassSimpleDefParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleOneClassSimpleDef_in_rule__PogoMultiClasses__ClassesAssignment_713139);
            ruleOneClassSimpleDef();
            _fsp--;

             after(grammarAccess.getPogoMultiClassesAccess().getClassesOneClassSimpleDefParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoMultiClasses__ClassesAssignment_7


    // $ANTLR start rule__PogoMultiClasses__FilestogenerateAssignment_8
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6537:1: rule__PogoMultiClasses__FilestogenerateAssignment_8 : ( RULE_STRING ) ;
    public final void rule__PogoMultiClasses__FilestogenerateAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6541:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6542:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6542:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6543:1: RULE_STRING
            {
             before(grammarAccess.getPogoMultiClassesAccess().getFilestogenerateSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PogoMultiClasses__FilestogenerateAssignment_813170); 
             after(grammarAccess.getPogoMultiClassesAccess().getFilestogenerateSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoMultiClasses__FilestogenerateAssignment_8


    // $ANTLR start rule__PogoMultiClasses__PreferencesAssignment_9
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6552:1: rule__PogoMultiClasses__PreferencesAssignment_9 : ( rulePreferences ) ;
    public final void rule__PogoMultiClasses__PreferencesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6556:1: ( ( rulePreferences ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6557:1: ( rulePreferences )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6557:1: ( rulePreferences )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6558:1: rulePreferences
            {
             before(grammarAccess.getPogoMultiClassesAccess().getPreferencesPreferencesParserRuleCall_9_0()); 
            pushFollow(FOLLOW_rulePreferences_in_rule__PogoMultiClasses__PreferencesAssignment_913201);
            rulePreferences();
            _fsp--;

             after(grammarAccess.getPogoMultiClassesAccess().getPreferencesPreferencesParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoMultiClasses__PreferencesAssignment_9


    // $ANTLR start rule__OneClassSimpleDef__ClassnameAssignment_0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6567:1: rule__OneClassSimpleDef__ClassnameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__OneClassSimpleDef__ClassnameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6571:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6572:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6572:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6573:1: RULE_STRING
            {
             before(grammarAccess.getOneClassSimpleDefAccess().getClassnameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__OneClassSimpleDef__ClassnameAssignment_013232); 
             after(grammarAccess.getOneClassSimpleDefAccess().getClassnameSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OneClassSimpleDef__ClassnameAssignment_0


    // $ANTLR start rule__OneClassSimpleDef__SourcePathAssignment_1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6582:1: rule__OneClassSimpleDef__SourcePathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__OneClassSimpleDef__SourcePathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6586:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6587:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6587:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6588:1: RULE_STRING
            {
             before(grammarAccess.getOneClassSimpleDefAccess().getSourcePathSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__OneClassSimpleDef__SourcePathAssignment_113263); 
             after(grammarAccess.getOneClassSimpleDefAccess().getSourcePathSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OneClassSimpleDef__SourcePathAssignment_1


    // $ANTLR start rule__OneClassSimpleDef__Pogo6Assignment_2
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6597:1: rule__OneClassSimpleDef__Pogo6Assignment_2 : ( ruleBoolean ) ;
    public final void rule__OneClassSimpleDef__Pogo6Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6601:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6602:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6602:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6603:1: ruleBoolean
            {
             before(grammarAccess.getOneClassSimpleDefAccess().getPogo6BooleanParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__OneClassSimpleDef__Pogo6Assignment_213294);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getOneClassSimpleDefAccess().getPogo6BooleanParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OneClassSimpleDef__Pogo6Assignment_2


    // $ANTLR start rule__OneClassSimpleDef__InheritancesAssignment_4
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6612:1: rule__OneClassSimpleDef__InheritancesAssignment_4 : ( ruleInheritance ) ;
    public final void rule__OneClassSimpleDef__InheritancesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6616:1: ( ( ruleInheritance ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6617:1: ( ruleInheritance )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6617:1: ( ruleInheritance )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6618:1: ruleInheritance
            {
             before(grammarAccess.getOneClassSimpleDefAccess().getInheritancesInheritanceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInheritance_in_rule__OneClassSimpleDef__InheritancesAssignment_413325);
            ruleInheritance();
            _fsp--;

             after(grammarAccess.getOneClassSimpleDefAccess().getInheritancesInheritanceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OneClassSimpleDef__InheritancesAssignment_4


    // $ANTLR start rule__OneClassSimpleDef__ParentClassesAssignment_6
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6627:1: rule__OneClassSimpleDef__ParentClassesAssignment_6 : ( RULE_STRING ) ;
    public final void rule__OneClassSimpleDef__ParentClassesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6631:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6632:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6632:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6633:1: RULE_STRING
            {
             before(grammarAccess.getOneClassSimpleDefAccess().getParentClassesSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__OneClassSimpleDef__ParentClassesAssignment_613356); 
             after(grammarAccess.getOneClassSimpleDefAccess().getParentClassesSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OneClassSimpleDef__ParentClassesAssignment_6


    // $ANTLR start rule__PogoDeviceClass__NameAssignment_1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6642:1: rule__PogoDeviceClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PogoDeviceClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6646:1: ( ( RULE_ID ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6647:1: ( RULE_ID )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6647:1: ( RULE_ID )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6648:1: RULE_ID
            {
             before(grammarAccess.getPogoDeviceClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PogoDeviceClass__NameAssignment_113387); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6657:1: rule__PogoDeviceClass__IsAbstractAssignment_2 : ( ( 'abstract' ) ) ;
    public final void rule__PogoDeviceClass__IsAbstractAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6661:1: ( ( ( 'abstract' ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6662:1: ( ( 'abstract' ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6662:1: ( ( 'abstract' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6663:1: ( 'abstract' )
            {
             before(grammarAccess.getPogoDeviceClassAccess().getIsAbstractAbstractKeyword_2_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6664:1: ( 'abstract' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6665:1: 'abstract'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getIsAbstractAbstractKeyword_2_0()); 
            match(input,78,FOLLOW_78_in_rule__PogoDeviceClass__IsAbstractAssignment_213423); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6680:1: rule__PogoDeviceClass__BaseClassAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__PogoDeviceClass__BaseClassAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6684:1: ( ( ( RULE_ID ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6685:1: ( ( RULE_ID ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6685:1: ( ( RULE_ID ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6686:1: ( RULE_ID )
            {
             before(grammarAccess.getPogoDeviceClassAccess().getBaseClassPogoDeviceClassCrossReference_3_1_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6687:1: ( RULE_ID )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6688:1: RULE_ID
            {
             before(grammarAccess.getPogoDeviceClassAccess().getBaseClassPogoDeviceClassIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PogoDeviceClass__BaseClassAssignment_3_113466); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6699:1: rule__PogoDeviceClass__InstituteAssignment_5 : ( RULE_ID ) ;
    public final void rule__PogoDeviceClass__InstituteAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6703:1: ( ( RULE_ID ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6704:1: ( RULE_ID )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6704:1: ( RULE_ID )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6705:1: RULE_ID
            {
             before(grammarAccess.getPogoDeviceClassAccess().getInstituteIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PogoDeviceClass__InstituteAssignment_513501); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6714:1: rule__PogoDeviceClass__DescriptionAssignment_7 : ( ruleClassDescription ) ;
    public final void rule__PogoDeviceClass__DescriptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6718:1: ( ( ruleClassDescription ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6719:1: ( ruleClassDescription )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6719:1: ( ruleClassDescription )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6720:1: ruleClassDescription
            {
             before(grammarAccess.getPogoDeviceClassAccess().getDescriptionClassDescriptionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleClassDescription_in_rule__PogoDeviceClass__DescriptionAssignment_713532);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6729:1: rule__PogoDeviceClass__ClassPropertiesAssignment_9 : ( ruleProperty ) ;
    public final void rule__PogoDeviceClass__ClassPropertiesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6733:1: ( ( ruleProperty ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6734:1: ( ruleProperty )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6734:1: ( ruleProperty )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6735:1: ruleProperty
            {
             before(grammarAccess.getPogoDeviceClassAccess().getClassPropertiesPropertyParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__PogoDeviceClass__ClassPropertiesAssignment_913563);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6744:1: rule__PogoDeviceClass__DevicePropertiesAssignment_11 : ( ruleProperty ) ;
    public final void rule__PogoDeviceClass__DevicePropertiesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6748:1: ( ( ruleProperty ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6749:1: ( ruleProperty )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6749:1: ( ruleProperty )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6750:1: ruleProperty
            {
             before(grammarAccess.getPogoDeviceClassAccess().getDevicePropertiesPropertyParserRuleCall_11_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__PogoDeviceClass__DevicePropertiesAssignment_1113594);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6759:1: rule__PogoDeviceClass__CommandsAssignment_13 : ( ruleCommand ) ;
    public final void rule__PogoDeviceClass__CommandsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6763:1: ( ( ruleCommand ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6764:1: ( ruleCommand )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6764:1: ( ruleCommand )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6765:1: ruleCommand
            {
             before(grammarAccess.getPogoDeviceClassAccess().getCommandsCommandParserRuleCall_13_0()); 
            pushFollow(FOLLOW_ruleCommand_in_rule__PogoDeviceClass__CommandsAssignment_1313625);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6774:1: rule__PogoDeviceClass__AttributesAssignment_15 : ( ruleAttribute ) ;
    public final void rule__PogoDeviceClass__AttributesAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6778:1: ( ( ruleAttribute ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6779:1: ( ruleAttribute )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6779:1: ( ruleAttribute )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6780:1: ruleAttribute
            {
             before(grammarAccess.getPogoDeviceClassAccess().getAttributesAttributeParserRuleCall_15_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__PogoDeviceClass__AttributesAssignment_1513656);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6789:1: rule__PogoDeviceClass__StatesAssignment_17 : ( ruleState ) ;
    public final void rule__PogoDeviceClass__StatesAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6793:1: ( ( ruleState ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6794:1: ( ruleState )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6794:1: ( ruleState )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6795:1: ruleState
            {
             before(grammarAccess.getPogoDeviceClassAccess().getStatesStateParserRuleCall_17_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__PogoDeviceClass__StatesAssignment_1713687);
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


    // $ANTLR start rule__PogoDeviceClass__PreferencesAssignment_18
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6804:1: rule__PogoDeviceClass__PreferencesAssignment_18 : ( rulePreferences ) ;
    public final void rule__PogoDeviceClass__PreferencesAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6808:1: ( ( rulePreferences ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6809:1: ( rulePreferences )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6809:1: ( rulePreferences )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6810:1: rulePreferences
            {
             before(grammarAccess.getPogoDeviceClassAccess().getPreferencesPreferencesParserRuleCall_18_0()); 
            pushFollow(FOLLOW_rulePreferences_in_rule__PogoDeviceClass__PreferencesAssignment_1813718);
            rulePreferences();
            _fsp--;

             after(grammarAccess.getPogoDeviceClassAccess().getPreferencesPreferencesParserRuleCall_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__PreferencesAssignment_18


    // $ANTLR start rule__ClassDescription__DescriptionAssignment_0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6819:1: rule__ClassDescription__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ClassDescription__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6823:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6824:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6824:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6825:1: RULE_STRING
            {
             before(grammarAccess.getClassDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassDescription__DescriptionAssignment_013749); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6834:1: rule__ClassDescription__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ClassDescription__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6838:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6839:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6839:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6840:1: RULE_STRING
            {
             before(grammarAccess.getClassDescriptionAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassDescription__TitleAssignment_113780); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6849:1: rule__ClassDescription__SourcePathAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ClassDescription__SourcePathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6853:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6854:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6854:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6855:1: RULE_STRING
            {
             before(grammarAccess.getClassDescriptionAccess().getSourcePathSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassDescription__SourcePathAssignment_213811); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6864:1: rule__ClassDescription__InheritancesAssignment_4 : ( ruleInheritance ) ;
    public final void rule__ClassDescription__InheritancesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6868:1: ( ( ruleInheritance ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6869:1: ( ruleInheritance )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6869:1: ( ruleInheritance )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6870:1: ruleInheritance
            {
             before(grammarAccess.getClassDescriptionAccess().getInheritancesInheritanceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInheritance_in_rule__ClassDescription__InheritancesAssignment_413842);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6879:1: rule__ClassDescription__LanguageAssignment_5 : ( ruleLanguage ) ;
    public final void rule__ClassDescription__LanguageAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6883:1: ( ( ruleLanguage ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6884:1: ( ruleLanguage )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6884:1: ( ruleLanguage )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6885:1: ruleLanguage
            {
             before(grammarAccess.getClassDescriptionAccess().getLanguageLanguageParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleLanguage_in_rule__ClassDescription__LanguageAssignment_513873);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6894:1: rule__ClassDescription__FilestogenerateAssignment_6 : ( RULE_STRING ) ;
    public final void rule__ClassDescription__FilestogenerateAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6898:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6899:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6899:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6900:1: RULE_STRING
            {
             before(grammarAccess.getClassDescriptionAccess().getFilestogenerateSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassDescription__FilestogenerateAssignment_613904); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6909:1: rule__ClassDescription__IdentificationAssignment_7 : ( ruleClassIdentification ) ;
    public final void rule__ClassDescription__IdentificationAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6913:1: ( ( ruleClassIdentification ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6914:1: ( ruleClassIdentification )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6914:1: ( ruleClassIdentification )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6915:1: ruleClassIdentification
            {
             before(grammarAccess.getClassDescriptionAccess().getIdentificationClassIdentificationParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleClassIdentification_in_rule__ClassDescription__IdentificationAssignment_713935);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6924:1: rule__ClassDescription__CommentsAssignment_8 : ( ruleComments ) ;
    public final void rule__ClassDescription__CommentsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6928:1: ( ( ruleComments ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6929:1: ( ruleComments )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6929:1: ( ruleComments )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6930:1: ruleComments
            {
             before(grammarAccess.getClassDescriptionAccess().getCommentsCommentsParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleComments_in_rule__ClassDescription__CommentsAssignment_813966);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6939:1: rule__ClassDescription__HasAbstractCommandAssignment_9 : ( ruleBoolean ) ;
    public final void rule__ClassDescription__HasAbstractCommandAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6943:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6944:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6944:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6945:1: ruleBoolean
            {
             before(grammarAccess.getClassDescriptionAccess().getHasAbstractCommandBooleanParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__ClassDescription__HasAbstractCommandAssignment_913997);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6954:1: rule__ClassDescription__HasAbstractAttributeAssignment_10 : ( ruleBoolean ) ;
    public final void rule__ClassDescription__HasAbstractAttributeAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6958:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6959:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6959:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6960:1: ruleBoolean
            {
             before(grammarAccess.getClassDescriptionAccess().getHasAbstractAttributeBooleanParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__ClassDescription__HasAbstractAttributeAssignment_1014028);
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


    // $ANTLR start rule__ClassDescription__HasDynamicAttributeAssignment_11
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6969:1: rule__ClassDescription__HasDynamicAttributeAssignment_11 : ( ruleBoolean ) ;
    public final void rule__ClassDescription__HasDynamicAttributeAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6973:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6974:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6974:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6975:1: ruleBoolean
            {
             before(grammarAccess.getClassDescriptionAccess().getHasDynamicAttributeBooleanParserRuleCall_11_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__ClassDescription__HasDynamicAttributeAssignment_1114059);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getClassDescriptionAccess().getHasDynamicAttributeBooleanParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassDescription__HasDynamicAttributeAssignment_11


    // $ANTLR start rule__Inheritance__ClassnameAssignment_0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6984:1: rule__Inheritance__ClassnameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Inheritance__ClassnameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6988:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6989:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6989:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6990:1: RULE_STRING
            {
             before(grammarAccess.getInheritanceAccess().getClassnameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Inheritance__ClassnameAssignment_014090); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6999:1: rule__Inheritance__SourcePathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Inheritance__SourcePathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7003:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7004:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7004:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7005:1: RULE_STRING
            {
             before(grammarAccess.getInheritanceAccess().getSourcePathSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Inheritance__SourcePathAssignment_114121); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7014:1: rule__ClassIdentification__ContactAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ClassIdentification__ContactAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7018:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7019:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7019:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7020:1: RULE_STRING
            {
             before(grammarAccess.getClassIdentificationAccess().getContactSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassIdentification__ContactAssignment_014152); 
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


    // $ANTLR start rule__ClassIdentification__AuthorAssignment_1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7029:1: rule__ClassIdentification__AuthorAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ClassIdentification__AuthorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7033:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7034:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7034:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7035:1: RULE_STRING
            {
             before(grammarAccess.getClassIdentificationAccess().getAuthorSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassIdentification__AuthorAssignment_114183); 
             after(grammarAccess.getClassIdentificationAccess().getAuthorSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassIdentification__AuthorAssignment_1


    // $ANTLR start rule__ClassIdentification__EmailDomainAssignment_2
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7044:1: rule__ClassIdentification__EmailDomainAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ClassIdentification__EmailDomainAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7048:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7049:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7049:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7050:1: RULE_STRING
            {
             before(grammarAccess.getClassIdentificationAccess().getEmailDomainSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassIdentification__EmailDomainAssignment_214214); 
             after(grammarAccess.getClassIdentificationAccess().getEmailDomainSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassIdentification__EmailDomainAssignment_2


    // $ANTLR start rule__ClassIdentification__ClassFamilyAssignment_3
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7059:1: rule__ClassIdentification__ClassFamilyAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ClassIdentification__ClassFamilyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7063:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7064:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7064:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7065:1: RULE_STRING
            {
             before(grammarAccess.getClassIdentificationAccess().getClassFamilySTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassIdentification__ClassFamilyAssignment_314245); 
             after(grammarAccess.getClassIdentificationAccess().getClassFamilySTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassIdentification__ClassFamilyAssignment_3


    // $ANTLR start rule__ClassIdentification__SiteSpecificAssignment_4
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7074:1: rule__ClassIdentification__SiteSpecificAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ClassIdentification__SiteSpecificAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7078:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7079:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7079:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7080:1: RULE_STRING
            {
             before(grammarAccess.getClassIdentificationAccess().getSiteSpecificSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassIdentification__SiteSpecificAssignment_414276); 
             after(grammarAccess.getClassIdentificationAccess().getSiteSpecificSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassIdentification__SiteSpecificAssignment_4


    // $ANTLR start rule__ClassIdentification__PlatformAssignment_5
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7089:1: rule__ClassIdentification__PlatformAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ClassIdentification__PlatformAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7093:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7094:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7094:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7095:1: RULE_STRING
            {
             before(grammarAccess.getClassIdentificationAccess().getPlatformSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassIdentification__PlatformAssignment_514307); 
             after(grammarAccess.getClassIdentificationAccess().getPlatformSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassIdentification__PlatformAssignment_5


    // $ANTLR start rule__ClassIdentification__BusAssignment_6
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7104:1: rule__ClassIdentification__BusAssignment_6 : ( RULE_STRING ) ;
    public final void rule__ClassIdentification__BusAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7108:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7109:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7109:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7110:1: RULE_STRING
            {
             before(grammarAccess.getClassIdentificationAccess().getBusSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassIdentification__BusAssignment_614338); 
             after(grammarAccess.getClassIdentificationAccess().getBusSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassIdentification__BusAssignment_6


    // $ANTLR start rule__ClassIdentification__ManufacturerAssignment_7
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7119:1: rule__ClassIdentification__ManufacturerAssignment_7 : ( RULE_STRING ) ;
    public final void rule__ClassIdentification__ManufacturerAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7123:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7124:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7124:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7125:1: RULE_STRING
            {
             before(grammarAccess.getClassIdentificationAccess().getManufacturerSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassIdentification__ManufacturerAssignment_714369); 
             after(grammarAccess.getClassIdentificationAccess().getManufacturerSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassIdentification__ManufacturerAssignment_7


    // $ANTLR start rule__ClassIdentification__ReferenceAssignment_8
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7134:1: rule__ClassIdentification__ReferenceAssignment_8 : ( RULE_STRING ) ;
    public final void rule__ClassIdentification__ReferenceAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7138:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7139:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7139:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7140:1: RULE_STRING
            {
             before(grammarAccess.getClassIdentificationAccess().getReferenceSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassIdentification__ReferenceAssignment_814400); 
             after(grammarAccess.getClassIdentificationAccess().getReferenceSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassIdentification__ReferenceAssignment_8


    // $ANTLR start rule__Comments__HtmlInheritanceAssignment_0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7149:1: rule__Comments__HtmlInheritanceAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Comments__HtmlInheritanceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7153:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7154:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7154:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7155:1: RULE_STRING
            {
             before(grammarAccess.getCommentsAccess().getHtmlInheritanceSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Comments__HtmlInheritanceAssignment_014431); 
             after(grammarAccess.getCommentsAccess().getHtmlInheritanceSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Comments__HtmlInheritanceAssignment_0


    // $ANTLR start rule__Comments__CommandsTableAssignment_1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7164:1: rule__Comments__CommandsTableAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Comments__CommandsTableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7168:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7169:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7169:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7170:1: RULE_STRING
            {
             before(grammarAccess.getCommentsAccess().getCommandsTableSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Comments__CommandsTableAssignment_114462); 
             after(grammarAccess.getCommentsAccess().getCommandsTableSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Comments__CommandsTableAssignment_1


    // $ANTLR start rule__Preferences__DocHomeAssignment_0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7179:1: rule__Preferences__DocHomeAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Preferences__DocHomeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7183:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7184:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7184:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7185:1: RULE_STRING
            {
             before(grammarAccess.getPreferencesAccess().getDocHomeSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Preferences__DocHomeAssignment_014493); 
             after(grammarAccess.getPreferencesAccess().getDocHomeSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Preferences__DocHomeAssignment_0


    // $ANTLR start rule__Preferences__MakefileHomeAssignment_1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7194:1: rule__Preferences__MakefileHomeAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Preferences__MakefileHomeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7198:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7199:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7199:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7200:1: RULE_STRING
            {
             before(grammarAccess.getPreferencesAccess().getMakefileHomeSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Preferences__MakefileHomeAssignment_114524); 
             after(grammarAccess.getPreferencesAccess().getMakefileHomeSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Preferences__MakefileHomeAssignment_1


    // $ANTLR start rule__Preferences__InstallHomeAssignment_2
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7209:1: rule__Preferences__InstallHomeAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Preferences__InstallHomeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7213:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7214:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7214:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7215:1: RULE_STRING
            {
             before(grammarAccess.getPreferencesAccess().getInstallHomeSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Preferences__InstallHomeAssignment_214555); 
             after(grammarAccess.getPreferencesAccess().getInstallHomeSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Preferences__InstallHomeAssignment_2


    // $ANTLR start rule__Preferences__HtmlVersionAssignment_3
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7224:1: rule__Preferences__HtmlVersionAssignment_3 : ( ruleBoolean ) ;
    public final void rule__Preferences__HtmlVersionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7228:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7229:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7229:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7230:1: ruleBoolean
            {
             before(grammarAccess.getPreferencesAccess().getHtmlVersionBooleanParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__Preferences__HtmlVersionAssignment_314586);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getPreferencesAccess().getHtmlVersionBooleanParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Preferences__HtmlVersionAssignment_3


    // $ANTLR start rule__State__NameAssignment_0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7239:1: rule__State__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7243:1: ( ( RULE_ID ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7244:1: ( RULE_ID )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7244:1: ( RULE_ID )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7245:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_014617); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7254:1: rule__State__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__State__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7258:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7259:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7259:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7260:1: RULE_STRING
            {
             before(grammarAccess.getStateAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__State__DescriptionAssignment_114648); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7269:1: rule__State__StatusAssignment_2 : ( ruleInheritanceStatus ) ;
    public final void rule__State__StatusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7273:1: ( ( ruleInheritanceStatus ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7274:1: ( ruleInheritanceStatus )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7274:1: ( ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7275:1: ruleInheritanceStatus
            {
             before(grammarAccess.getStateAccess().getStatusInheritanceStatusParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleInheritanceStatus_in_rule__State__StatusAssignment_214679);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7284:1: rule__Property__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7288:1: ( ( RULE_ID ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7289:1: ( RULE_ID )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7289:1: ( RULE_ID )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7290:1: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__NameAssignment_014710); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7299:1: rule__Property__TypeAssignment_1 : ( rulePropType ) ;
    public final void rule__Property__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7303:1: ( ( rulePropType ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7304:1: ( rulePropType )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7304:1: ( rulePropType )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7305:1: rulePropType
            {
             before(grammarAccess.getPropertyAccess().getTypePropTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePropType_in_rule__Property__TypeAssignment_114741);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7314:1: rule__Property__StatusAssignment_2 : ( ruleInheritanceStatus ) ;
    public final void rule__Property__StatusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7318:1: ( ( ruleInheritanceStatus ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7319:1: ( ruleInheritanceStatus )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7319:1: ( ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7320:1: ruleInheritanceStatus
            {
             before(grammarAccess.getPropertyAccess().getStatusInheritanceStatusParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleInheritanceStatus_in_rule__Property__StatusAssignment_214772);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7329:1: rule__Property__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Property__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7333:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7334:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7334:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7335:1: RULE_STRING
            {
             before(grammarAccess.getPropertyAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Property__DescriptionAssignment_314803); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7344:1: rule__Property__DefaultPropValueAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Property__DefaultPropValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7348:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7349:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7349:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7350:1: RULE_STRING
            {
             before(grammarAccess.getPropertyAccess().getDefaultPropValueSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Property__DefaultPropValueAssignment_514834); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7359:1: rule__InheritanceStatus__AbstractAssignment_0 : ( ruleBoolean ) ;
    public final void rule__InheritanceStatus__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7363:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7364:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7364:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7365:1: ruleBoolean
            {
             before(grammarAccess.getInheritanceStatusAccess().getAbstractBooleanParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__InheritanceStatus__AbstractAssignment_014865);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7374:1: rule__InheritanceStatus__InheritedAssignment_1 : ( ruleBoolean ) ;
    public final void rule__InheritanceStatus__InheritedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7378:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7379:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7379:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7380:1: ruleBoolean
            {
             before(grammarAccess.getInheritanceStatusAccess().getInheritedBooleanParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__InheritanceStatus__InheritedAssignment_114896);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7389:1: rule__InheritanceStatus__ConcreteAssignment_2 : ( ruleBoolean ) ;
    public final void rule__InheritanceStatus__ConcreteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7393:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7394:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7394:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7395:1: ruleBoolean
            {
             before(grammarAccess.getInheritanceStatusAccess().getConcreteBooleanParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__InheritanceStatus__ConcreteAssignment_214927);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7404:1: rule__InheritanceStatus__ConcreteHereAssignment_3 : ( ruleBoolean ) ;
    public final void rule__InheritanceStatus__ConcreteHereAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7408:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7409:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7409:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7410:1: ruleBoolean
            {
             before(grammarAccess.getInheritanceStatusAccess().getConcreteHereBooleanParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__InheritanceStatus__ConcreteHereAssignment_314958);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7419:1: rule__InheritanceStatus__HasChangedAssignment_4 : ( RULE_STRING ) ;
    public final void rule__InheritanceStatus__HasChangedAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7423:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7424:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7424:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7425:1: RULE_STRING
            {
             before(grammarAccess.getInheritanceStatusAccess().getHasChangedSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__InheritanceStatus__HasChangedAssignment_414989); 
             after(grammarAccess.getInheritanceStatusAccess().getHasChangedSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7434:1: rule__Command__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Command__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7438:1: ( ( RULE_ID ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7439:1: ( RULE_ID )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7439:1: ( RULE_ID )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7440:1: RULE_ID
            {
             before(grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Command__NameAssignment_015020); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7449:1: rule__Command__ArginAssignment_1 : ( ruleArgument ) ;
    public final void rule__Command__ArginAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7453:1: ( ( ruleArgument ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7454:1: ( ruleArgument )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7454:1: ( ruleArgument )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7455:1: ruleArgument
            {
             before(grammarAccess.getCommandAccess().getArginArgumentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Command__ArginAssignment_115051);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7464:1: rule__Command__ArgoutAssignment_2 : ( ruleArgument ) ;
    public final void rule__Command__ArgoutAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7468:1: ( ( ruleArgument ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7469:1: ( ruleArgument )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7469:1: ( ruleArgument )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7470:1: ruleArgument
            {
             before(grammarAccess.getCommandAccess().getArgoutArgumentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Command__ArgoutAssignment_215082);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7479:1: rule__Command__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Command__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7483:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7484:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7484:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7485:1: RULE_STRING
            {
             before(grammarAccess.getCommandAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Command__DescriptionAssignment_315113); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7494:1: rule__Command__StatusAssignment_4 : ( ruleInheritanceStatus ) ;
    public final void rule__Command__StatusAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7498:1: ( ( ruleInheritanceStatus ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7499:1: ( ruleInheritanceStatus )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7499:1: ( ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7500:1: ruleInheritanceStatus
            {
             before(grammarAccess.getCommandAccess().getStatusInheritanceStatusParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInheritanceStatus_in_rule__Command__StatusAssignment_415144);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7509:1: rule__Command__ExecMethodAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Command__ExecMethodAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7513:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7514:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7514:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7515:1: RULE_STRING
            {
             before(grammarAccess.getCommandAccess().getExecMethodSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Command__ExecMethodAssignment_515175); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7524:1: rule__Command__DisplayLevelAssignment_6 : ( ruleDisplayLevel ) ;
    public final void rule__Command__DisplayLevelAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7528:1: ( ( ruleDisplayLevel ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7529:1: ( ruleDisplayLevel )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7529:1: ( ruleDisplayLevel )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7530:1: ruleDisplayLevel
            {
             before(grammarAccess.getCommandAccess().getDisplayLevelDisplayLevelParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleDisplayLevel_in_rule__Command__DisplayLevelAssignment_615206);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7539:1: rule__Command__PolledPeriodAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Command__PolledPeriodAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7543:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7544:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7544:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7545:1: RULE_STRING
            {
             before(grammarAccess.getCommandAccess().getPolledPeriodSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Command__PolledPeriodAssignment_715237); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7554:1: rule__Command__ExcludedStatesAssignment_9 : ( RULE_STRING ) ;
    public final void rule__Command__ExcludedStatesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7558:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7559:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7559:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7560:1: RULE_STRING
            {
             before(grammarAccess.getCommandAccess().getExcludedStatesSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Command__ExcludedStatesAssignment_915268); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7569:1: rule__Argument__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Argument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7573:1: ( ( ruleType ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7574:1: ( ruleType )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7574:1: ( ruleType )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7575:1: ruleType
            {
             before(grammarAccess.getArgumentAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Argument__TypeAssignment_015299);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7584:1: rule__Argument__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Argument__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7588:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7589:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7589:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7590:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__DescriptionAssignment_115330); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7599:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7603:1: ( ( RULE_ID ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7604:1: ( RULE_ID )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7604:1: ( RULE_ID )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7605:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_015361); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7614:1: rule__Attribute__AttTypeAssignment_1 : ( ruleAttrType ) ;
    public final void rule__Attribute__AttTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7618:1: ( ( ruleAttrType ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7619:1: ( ruleAttrType )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7619:1: ( ruleAttrType )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7620:1: ruleAttrType
            {
             before(grammarAccess.getAttributeAccess().getAttTypeAttrTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttrType_in_rule__Attribute__AttTypeAssignment_115392);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7629:1: rule__Attribute__DataTypeAssignment_2 : ( ruleType ) ;
    public final void rule__Attribute__DataTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7633:1: ( ( ruleType ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7634:1: ( ruleType )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7634:1: ( ruleType )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7635:1: ruleType
            {
             before(grammarAccess.getAttributeAccess().getDataTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Attribute__DataTypeAssignment_215423);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7644:1: rule__Attribute__RwTypeAssignment_3 : ( ruleRW_Type ) ;
    public final void rule__Attribute__RwTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7648:1: ( ( ruleRW_Type ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7649:1: ( ruleRW_Type )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7649:1: ( ruleRW_Type )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7650:1: ruleRW_Type
            {
             before(grammarAccess.getAttributeAccess().getRwTypeRW_TypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRW_Type_in_rule__Attribute__RwTypeAssignment_315454);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7659:1: rule__Attribute__DisplayLevelAssignment_4 : ( ruleDisplayLevel ) ;
    public final void rule__Attribute__DisplayLevelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7663:1: ( ( ruleDisplayLevel ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7664:1: ( ruleDisplayLevel )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7664:1: ( ruleDisplayLevel )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7665:1: ruleDisplayLevel
            {
             before(grammarAccess.getAttributeAccess().getDisplayLevelDisplayLevelParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleDisplayLevel_in_rule__Attribute__DisplayLevelAssignment_415485);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7674:1: rule__Attribute__PolledPeriodAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Attribute__PolledPeriodAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7678:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7679:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7679:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7680:1: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getPolledPeriodSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__PolledPeriodAssignment_515516); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7689:1: rule__Attribute__MaxXAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Attribute__MaxXAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7693:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7694:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7694:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7695:1: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getMaxXSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__MaxXAssignment_615547); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7704:1: rule__Attribute__MaxYAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Attribute__MaxYAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7708:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7709:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7709:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7710:1: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getMaxYSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__MaxYAssignment_715578); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7719:1: rule__Attribute__MemorizedAssignment_8 : ( ruleBoolean ) ;
    public final void rule__Attribute__MemorizedAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7723:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7724:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7724:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7725:1: ruleBoolean
            {
             before(grammarAccess.getAttributeAccess().getMemorizedBooleanParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__Attribute__MemorizedAssignment_815609);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7734:1: rule__Attribute__MemorizedAtInitAssignment_9 : ( ruleBoolean ) ;
    public final void rule__Attribute__MemorizedAtInitAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7738:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7739:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7739:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7740:1: ruleBoolean
            {
             before(grammarAccess.getAttributeAccess().getMemorizedAtInitBooleanParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__Attribute__MemorizedAtInitAssignment_915640);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7749:1: rule__Attribute__ChangeEventAssignment_10 : ( ruleFireEvents ) ;
    public final void rule__Attribute__ChangeEventAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7753:1: ( ( ruleFireEvents ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7754:1: ( ruleFireEvents )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7754:1: ( ruleFireEvents )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7755:1: ruleFireEvents
            {
             before(grammarAccess.getAttributeAccess().getChangeEventFireEventsParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleFireEvents_in_rule__Attribute__ChangeEventAssignment_1015671);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7764:1: rule__Attribute__ArchiveEventAssignment_11 : ( ruleFireEvents ) ;
    public final void rule__Attribute__ArchiveEventAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7768:1: ( ( ruleFireEvents ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7769:1: ( ruleFireEvents )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7769:1: ( ruleFireEvents )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7770:1: ruleFireEvents
            {
             before(grammarAccess.getAttributeAccess().getArchiveEventFireEventsParserRuleCall_11_0()); 
            pushFollow(FOLLOW_ruleFireEvents_in_rule__Attribute__ArchiveEventAssignment_1115702);
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


    // $ANTLR start rule__Attribute__DataReadyEventAssignment_12
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7779:1: rule__Attribute__DataReadyEventAssignment_12 : ( ruleFireEvents ) ;
    public final void rule__Attribute__DataReadyEventAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7783:1: ( ( ruleFireEvents ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7784:1: ( ruleFireEvents )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7784:1: ( ruleFireEvents )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7785:1: ruleFireEvents
            {
             before(grammarAccess.getAttributeAccess().getDataReadyEventFireEventsParserRuleCall_12_0()); 
            pushFollow(FOLLOW_ruleFireEvents_in_rule__Attribute__DataReadyEventAssignment_1215733);
            ruleFireEvents();
            _fsp--;

             after(grammarAccess.getAttributeAccess().getDataReadyEventFireEventsParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__DataReadyEventAssignment_12


    // $ANTLR start rule__Attribute__StatusAssignment_13
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7794:1: rule__Attribute__StatusAssignment_13 : ( ruleInheritanceStatus ) ;
    public final void rule__Attribute__StatusAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7798:1: ( ( ruleInheritanceStatus ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7799:1: ( ruleInheritanceStatus )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7799:1: ( ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7800:1: ruleInheritanceStatus
            {
             before(grammarAccess.getAttributeAccess().getStatusInheritanceStatusParserRuleCall_13_0()); 
            pushFollow(FOLLOW_ruleInheritanceStatus_in_rule__Attribute__StatusAssignment_1315764);
            ruleInheritanceStatus();
            _fsp--;

             after(grammarAccess.getAttributeAccess().getStatusInheritanceStatusParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__StatusAssignment_13


    // $ANTLR start rule__Attribute__PropertiesAssignment_14
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7809:1: rule__Attribute__PropertiesAssignment_14 : ( ruleAttrProperties ) ;
    public final void rule__Attribute__PropertiesAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7813:1: ( ( ruleAttrProperties ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7814:1: ( ruleAttrProperties )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7814:1: ( ruleAttrProperties )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7815:1: ruleAttrProperties
            {
             before(grammarAccess.getAttributeAccess().getPropertiesAttrPropertiesParserRuleCall_14_0()); 
            pushFollow(FOLLOW_ruleAttrProperties_in_rule__Attribute__PropertiesAssignment_1415795);
            ruleAttrProperties();
            _fsp--;

             after(grammarAccess.getAttributeAccess().getPropertiesAttrPropertiesParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__PropertiesAssignment_14


    // $ANTLR start rule__Attribute__AllocReadMemberAssignment_15
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7824:1: rule__Attribute__AllocReadMemberAssignment_15 : ( ruleBoolean ) ;
    public final void rule__Attribute__AllocReadMemberAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7828:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7829:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7829:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7830:1: ruleBoolean
            {
             before(grammarAccess.getAttributeAccess().getAllocReadMemberBooleanParserRuleCall_15_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__Attribute__AllocReadMemberAssignment_1515826);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getAttributeAccess().getAllocReadMemberBooleanParserRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__AllocReadMemberAssignment_15


    // $ANTLR start rule__Attribute__IsDynamicAssignment_16
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7839:1: rule__Attribute__IsDynamicAssignment_16 : ( ruleBoolean ) ;
    public final void rule__Attribute__IsDynamicAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7843:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7844:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7844:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7845:1: ruleBoolean
            {
             before(grammarAccess.getAttributeAccess().getIsDynamicBooleanParserRuleCall_16_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__Attribute__IsDynamicAssignment_1615857);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getAttributeAccess().getIsDynamicBooleanParserRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__IsDynamicAssignment_16


    // $ANTLR start rule__Attribute__ReadExcludedStatesAssignment_18
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7854:1: rule__Attribute__ReadExcludedStatesAssignment_18 : ( RULE_STRING ) ;
    public final void rule__Attribute__ReadExcludedStatesAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7858:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7859:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7859:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7860:1: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getReadExcludedStatesSTRINGTerminalRuleCall_18_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__ReadExcludedStatesAssignment_1815888); 
             after(grammarAccess.getAttributeAccess().getReadExcludedStatesSTRINGTerminalRuleCall_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__ReadExcludedStatesAssignment_18


    // $ANTLR start rule__Attribute__WriteExcludedStatesAssignment_20
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7869:1: rule__Attribute__WriteExcludedStatesAssignment_20 : ( RULE_STRING ) ;
    public final void rule__Attribute__WriteExcludedStatesAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7873:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7874:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7874:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7875:1: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getWriteExcludedStatesSTRINGTerminalRuleCall_20_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__WriteExcludedStatesAssignment_2015919); 
             after(grammarAccess.getAttributeAccess().getWriteExcludedStatesSTRINGTerminalRuleCall_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__WriteExcludedStatesAssignment_20


    // $ANTLR start rule__FireEvents__FireAssignment_0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7884:1: rule__FireEvents__FireAssignment_0 : ( ruleBoolean ) ;
    public final void rule__FireEvents__FireAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7888:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7889:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7889:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7890:1: ruleBoolean
            {
             before(grammarAccess.getFireEventsAccess().getFireBooleanParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__FireEvents__FireAssignment_015950);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7899:1: rule__FireEvents__LibCheckCriteriaAssignment_1 : ( ruleBoolean ) ;
    public final void rule__FireEvents__LibCheckCriteriaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7903:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7904:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7904:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7905:1: ruleBoolean
            {
             before(grammarAccess.getFireEventsAccess().getLibCheckCriteriaBooleanParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__FireEvents__LibCheckCriteriaAssignment_115981);
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7914:1: rule__AttrProperties__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7918:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7919:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7919:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7920:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__DescriptionAssignment_016012); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7929:1: rule__AttrProperties__LabelAssignment_1 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7933:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7934:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7934:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7935:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getLabelSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__LabelAssignment_116043); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7944:1: rule__AttrProperties__UnitAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__UnitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7948:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7949:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7949:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7950:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getUnitSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__UnitAssignment_216074); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7959:1: rule__AttrProperties__StandardUnitAssignment_3 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__StandardUnitAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7963:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7964:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7964:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7965:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getStandardUnitSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__StandardUnitAssignment_316105); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7974:1: rule__AttrProperties__DisplayUnitAssignment_4 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__DisplayUnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7978:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7979:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7979:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7980:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getDisplayUnitSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__DisplayUnitAssignment_416136); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7989:1: rule__AttrProperties__FormatAssignment_5 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__FormatAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7993:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7994:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7994:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:7995:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getFormatSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__FormatAssignment_516167); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8004:1: rule__AttrProperties__MaxValueAssignment_6 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__MaxValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8008:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8009:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8009:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8010:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getMaxValueSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__MaxValueAssignment_616198); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8019:1: rule__AttrProperties__MinValueAssignment_7 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__MinValueAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8023:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8024:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8024:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8025:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getMinValueSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__MinValueAssignment_716229); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8034:1: rule__AttrProperties__MaxAlarmAssignment_8 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__MaxAlarmAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8038:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8039:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8039:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8040:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getMaxAlarmSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__MaxAlarmAssignment_816260); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8049:1: rule__AttrProperties__MinAlarmAssignment_9 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__MinAlarmAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8053:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8054:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8054:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8055:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getMinAlarmSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__MinAlarmAssignment_916291); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8064:1: rule__AttrProperties__MaxWarningAssignment_10 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__MaxWarningAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8068:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8069:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8069:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8070:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getMaxWarningSTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__MaxWarningAssignment_1016322); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8079:1: rule__AttrProperties__MinWarningAssignment_11 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__MinWarningAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8083:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8084:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8084:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8085:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getMinWarningSTRINGTerminalRuleCall_11_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__MinWarningAssignment_1116353); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8094:1: rule__AttrProperties__DeltaTimeAssignment_12 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__DeltaTimeAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8098:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8099:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8099:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8100:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getDeltaTimeSTRINGTerminalRuleCall_12_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__DeltaTimeAssignment_1216384); 
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
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8109:1: rule__AttrProperties__DeltaValueAssignment_13 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__DeltaValueAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8113:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8114:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8114:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:8115:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getDeltaValueSTRINGTerminalRuleCall_13_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__DeltaValueAssignment_1316415); 
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
    public static final BitSet FOLLOW_rulePogoMultiClasses_in_entryRulePogoMultiClasses180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePogoMultiClasses187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoMultiClasses__Group__0_in_rulePogoMultiClasses214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneClassSimpleDef_in_entryRuleOneClassSimpleDef240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneClassSimpleDef247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneClassSimpleDef__Group__0_in_ruleOneClassSimpleDef274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePogoDeviceClass_in_entryRulePogoDeviceClass300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePogoDeviceClass307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__0_in_rulePogoDeviceClass334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLanguage_in_entryRuleLanguage360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLanguage367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Alternatives_in_ruleLanguage394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisplayLevel_in_entryRuleDisplayLevel420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisplayLevel427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DisplayLevel__Alternatives_in_ruleDisplayLevel454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrType_in_entryRuleAttrType480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrType487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrType__Alternatives_in_ruleAttrType514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRW_Type_in_entryRuleRW_Type540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRW_Type547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RW_Type__Alternatives_in_ruleRW_Type574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Boolean__Alternatives_in_ruleBoolean634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDescription_in_entryRuleClassDescription660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassDescription667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__0_in_ruleClassDescription694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritance_in_entryRuleInheritance720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInheritance727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inheritance__Group__0_in_ruleInheritance754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassIdentification_in_entryRuleClassIdentification780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassIdentification787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__Group__0_in_ruleClassIdentification814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComments_in_entryRuleComments840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComments847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comments__Group__0_in_ruleComments874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreferences_in_entryRulePreferences900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreferences907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Preferences__Group__0_in_rulePreferences934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropType_in_entryRulePropType1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropType1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropType__Alternatives_in_rulePropType1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Alternatives_in_ruleSimpleType1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVectorType_in_entryRuleVectorType1200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVectorType1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VectorType__Alternatives_in_ruleVectorType1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_entryRuleInheritanceStatus1260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInheritanceStatus1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InheritanceStatus__Group__0_in_ruleInheritanceStatus1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__0_in_ruleCommand1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0_in_ruleArgument1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFireEvents_in_entryRuleFireEvents1500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFireEvents1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FireEvents__Group__0_in_ruleFireEvents1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrProperties_in_entryRuleAttrProperties1560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrProperties1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__0_in_ruleAttrProperties1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidType_in_entryRuleVoidType1680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVoidType1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VoidType__Group__0_in_ruleVoidType1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_entryRuleBooleanType1740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanType1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanType__Group__0_in_ruleBooleanType1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortType_in_entryRuleShortType1800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortType1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortType__Group__0_in_ruleShortType1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortType_in_entryRuleUShortType1860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUShortType1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UShortType__Group__0_in_ruleUShortType1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_entryRuleIntType1920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntType1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntType__Group__0_in_ruleIntType1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntType_in_entryRuleUIntType1980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIntType1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIntType__Group__0_in_ruleUIntType2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_entryRuleFloatType2040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatType2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatType__Group__0_in_ruleFloatType2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_entryRuleDoubleType2100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleType2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleType__Group__0_in_ruleDoubleType2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType2160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group__0_in_ruleStringType2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharArrayType_in_entryRuleCharArrayType2220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharArrayType2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharArrayType__Group__0_in_ruleCharArrayType2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortArrayType_in_entryRuleShortArrayType2280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortArrayType2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortArrayType__Group__0_in_ruleShortArrayType2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortArrayType_in_entryRuleUShortArrayType2340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUShortArrayType2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UShortArrayType__Group__0_in_ruleUShortArrayType2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntArrayType_in_entryRuleIntArrayType2400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntArrayType2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntArrayType__Group__0_in_ruleIntArrayType2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntArrayType_in_entryRuleUIntArrayType2460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIntArrayType2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIntArrayType__Group__0_in_ruleUIntArrayType2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatArrayType_in_entryRuleFloatArrayType2520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatArrayType2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatArrayType__Group__0_in_ruleFloatArrayType2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleArrayType_in_entryRuleDoubleArrayType2580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleArrayType2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleArrayType__Group__0_in_ruleDoubleArrayType2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringArrayType_in_entryRuleStringArrayType2640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringArrayType2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringArrayType__Group__0_in_ruleStringArrayType2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongStringArrayType_in_entryRuleLongStringArrayType2700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongStringArrayType2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongStringArrayType__Group__0_in_ruleLongStringArrayType2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleStringArrayType_in_entryRuleDoubleStringArrayType2760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleStringArrayType2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleStringArrayType__Group__0_in_ruleDoubleStringArrayType2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_entryRuleStateType2820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateType2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateType__Group__0_in_ruleStateType2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstStringType_in_entryRuleConstStringType2880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstStringType2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstStringType__Group__0_in_ruleConstStringType2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanArrayType_in_entryRuleBooleanArrayType2940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanArrayType2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanArrayType__Group__0_in_ruleBooleanArrayType2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUCharType_in_entryRuleUCharType3000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUCharType3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UCharType__Group__0_in_ruleUCharType3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_entryRuleLongType3060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongType3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongType__Group__0_in_ruleLongType3094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongType_in_entryRuleULongType3120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleULongType3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ULongType__Group__0_in_ruleULongType3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongArrayType_in_entryRuleLongArrayType3180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongArrayType3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongArrayType__Group__0_in_ruleLongArrayType3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongArrayType_in_entryRuleULongArrayType3240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleULongArrayType3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ULongArrayType__Group__0_in_ruleULongArrayType3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDevIntType_in_entryRuleDevIntType3300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDevIntType3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DevIntType__Group__0_in_ruleDevIntType3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncodedType_in_entryRuleEncodedType3360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEncodedType3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodedType__Group__0_in_ruleEncodedType3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortVectorType_in_entryRuleShortVectorType3420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortVectorType3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortVectorType__Group__0_in_ruleShortVectorType3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntVectorType_in_entryRuleIntVectorType3480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntVectorType3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntVectorType__Group__0_in_ruleIntVectorType3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatVectorType_in_entryRuleFloatVectorType3540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatVectorType3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatVectorType__Group__0_in_ruleFloatVectorType3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleVectorType_in_entryRuleDoubleVectorType3600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleVectorType3607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleVectorType__Group__0_in_ruleDoubleVectorType3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVectorType_in_entryRuleStringVectorType3660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringVectorType3667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVectorType__Group__0_in_ruleStringVectorType3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Language__Alternatives3731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Language__Alternatives3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Language__Alternatives3771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DisplayLevel__Alternatives3806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DisplayLevel__Alternatives3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AttrType__Alternatives3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AttrType__Alternatives3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AttrType__Alternatives3901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RW_Type__Alternatives3936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RW_Type__Alternatives3956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RW_Type__Alternatives3976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RW_Type__Alternatives3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Boolean__Alternatives4031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Boolean__Alternatives4051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rule__PropType__Alternatives4085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVectorType_in_rule__PropType__Alternatives4102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_rule__SimpleType__Alternatives4134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortType_in_rule__SimpleType__Alternatives4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortType_in_rule__SimpleType__Alternatives4168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_rule__SimpleType__Alternatives4185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntType_in_rule__SimpleType__Alternatives4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_rule__SimpleType__Alternatives4219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_rule__SimpleType__Alternatives4236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_rule__SimpleType__Alternatives4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortVectorType_in_rule__VectorType__Alternatives4285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntVectorType_in_rule__VectorType__Alternatives4302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatVectorType_in_rule__VectorType__Alternatives4319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleVectorType_in_rule__VectorType__Alternatives4336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVectorType_in_rule__VectorType__Alternatives4353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidType_in_rule__Type__Alternatives4385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_rule__Type__Alternatives4402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortType_in_rule__Type__Alternatives4419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortType_in_rule__Type__Alternatives4436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_rule__Type__Alternatives4453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntType_in_rule__Type__Alternatives4470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_rule__Type__Alternatives4487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_rule__Type__Alternatives4504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_rule__Type__Alternatives4521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharArrayType_in_rule__Type__Alternatives4538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortArrayType_in_rule__Type__Alternatives4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortArrayType_in_rule__Type__Alternatives4572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntArrayType_in_rule__Type__Alternatives4589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntArrayType_in_rule__Type__Alternatives4606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatArrayType_in_rule__Type__Alternatives4623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleArrayType_in_rule__Type__Alternatives4640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringArrayType_in_rule__Type__Alternatives4657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongStringArrayType_in_rule__Type__Alternatives4674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleStringArrayType_in_rule__Type__Alternatives4691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__Type__Alternatives4708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstStringType_in_rule__Type__Alternatives4725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanArrayType_in_rule__Type__Alternatives4742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_rule__Type__Alternatives4759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongType_in_rule__Type__Alternatives4776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUCharType_in_rule__Type__Alternatives4793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongArrayType_in_rule__Type__Alternatives4810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongArrayType_in_rule__Type__Alternatives4827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDevIntType_in_rule__Type__Alternatives4844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncodedType_in_rule__Type__Alternatives4861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoSystem__ImportsAssignment_0_in_rule__PogoSystem__Group__04895 = new BitSet(new long[]{0x0000000106000002L});
    public static final BitSet FOLLOW_rule__PogoSystem__Group__1_in_rule__PogoSystem__Group__04905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoSystem__ClassesAssignment_1_in_rule__PogoSystem__Group__14933 = new BitSet(new long[]{0x0000000104000002L});
    public static final BitSet FOLLOW_rule__PogoSystem__Group__2_in_rule__PogoSystem__Group__14943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoSystem__MultiClassesAssignment_2_in_rule__PogoSystem__Group__24971 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_25_in_rule__Import__Group__05013 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__05023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__15051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PogoMultiClasses__Group__05090 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PogoMultiClasses__Group__1_in_rule__PogoMultiClasses__Group__05100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoMultiClasses__NameAssignment_1_in_rule__PogoMultiClasses__Group__15128 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__PogoMultiClasses__Group__2_in_rule__PogoMultiClasses__Group__15137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PogoMultiClasses__Group__25166 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PogoMultiClasses__Group__3_in_rule__PogoMultiClasses__Group__25176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoMultiClasses__SourcePathAssignment_3_in_rule__PogoMultiClasses__Group__35204 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PogoMultiClasses__Group__4_in_rule__PogoMultiClasses__Group__35213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoMultiClasses__DescriptionAssignment_4_in_rule__PogoMultiClasses__Group__45241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PogoMultiClasses__Group__5_in_rule__PogoMultiClasses__Group__45250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoMultiClasses__TitleAssignment_5_in_rule__PogoMultiClasses__Group__55278 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__PogoMultiClasses__Group__6_in_rule__PogoMultiClasses__Group__55287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__PogoMultiClasses__Group__65316 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PogoMultiClasses__Group__7_in_rule__PogoMultiClasses__Group__65326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoMultiClasses__ClassesAssignment_7_in_rule__PogoMultiClasses__Group__75354 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PogoMultiClasses__Group__8_in_rule__PogoMultiClasses__Group__75363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoMultiClasses__FilestogenerateAssignment_8_in_rule__PogoMultiClasses__Group__85391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PogoMultiClasses__Group__9_in_rule__PogoMultiClasses__Group__85400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoMultiClasses__PreferencesAssignment_9_in_rule__PogoMultiClasses__Group__95428 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__PogoMultiClasses__Group__10_in_rule__PogoMultiClasses__Group__95437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PogoMultiClasses__Group__105466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneClassSimpleDef__ClassnameAssignment_0_in_rule__OneClassSimpleDef__Group__05523 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OneClassSimpleDef__Group__1_in_rule__OneClassSimpleDef__Group__05532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneClassSimpleDef__SourcePathAssignment_1_in_rule__OneClassSimpleDef__Group__15560 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__OneClassSimpleDef__Group__2_in_rule__OneClassSimpleDef__Group__15569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneClassSimpleDef__Pogo6Assignment_2_in_rule__OneClassSimpleDef__Group__25597 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__OneClassSimpleDef__Group__3_in_rule__OneClassSimpleDef__Group__25606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__OneClassSimpleDef__Group__35635 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OneClassSimpleDef__Group__4_in_rule__OneClassSimpleDef__Group__35645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneClassSimpleDef__InheritancesAssignment_4_in_rule__OneClassSimpleDef__Group__45673 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__OneClassSimpleDef__Group__5_in_rule__OneClassSimpleDef__Group__45682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__OneClassSimpleDef__Group__55711 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OneClassSimpleDef__Group__6_in_rule__OneClassSimpleDef__Group__55721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneClassSimpleDef__ParentClassesAssignment_6_in_rule__OneClassSimpleDef__Group__65749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__PogoDeviceClass__Group__05798 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__1_in_rule__PogoDeviceClass__Group__05808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__NameAssignment_1_in_rule__PogoDeviceClass__Group__15836 = new BitSet(new long[]{0x0000008008000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__2_in_rule__PogoDeviceClass__Group__15845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__IsAbstractAssignment_2_in_rule__PogoDeviceClass__Group__25873 = new BitSet(new long[]{0x0000008008000000L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__3_in_rule__PogoDeviceClass__Group__25883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group_3__0_in_rule__PogoDeviceClass__Group__35911 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__4_in_rule__PogoDeviceClass__Group__35921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PogoDeviceClass__Group__45950 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__5_in_rule__PogoDeviceClass__Group__45960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__InstituteAssignment_5_in_rule__PogoDeviceClass__Group__55988 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__6_in_rule__PogoDeviceClass__Group__55997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__PogoDeviceClass__Group__66026 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__7_in_rule__PogoDeviceClass__Group__66036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__DescriptionAssignment_7_in_rule__PogoDeviceClass__Group__76064 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__8_in_rule__PogoDeviceClass__Group__76073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__PogoDeviceClass__Group__86102 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__9_in_rule__PogoDeviceClass__Group__86112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__ClassPropertiesAssignment_9_in_rule__PogoDeviceClass__Group__96140 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__10_in_rule__PogoDeviceClass__Group__96150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__PogoDeviceClass__Group__106179 = new BitSet(new long[]{0x0000001000000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__11_in_rule__PogoDeviceClass__Group__106189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__DevicePropertiesAssignment_11_in_rule__PogoDeviceClass__Group__116217 = new BitSet(new long[]{0x0000001000000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__12_in_rule__PogoDeviceClass__Group__116227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__PogoDeviceClass__Group__126256 = new BitSet(new long[]{0x0000002000000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__13_in_rule__PogoDeviceClass__Group__126266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__CommandsAssignment_13_in_rule__PogoDeviceClass__Group__136294 = new BitSet(new long[]{0x0000002000000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__14_in_rule__PogoDeviceClass__Group__136304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__PogoDeviceClass__Group__146333 = new BitSet(new long[]{0x0000004000000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__15_in_rule__PogoDeviceClass__Group__146343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__AttributesAssignment_15_in_rule__PogoDeviceClass__Group__156371 = new BitSet(new long[]{0x0000004000000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__16_in_rule__PogoDeviceClass__Group__156381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__PogoDeviceClass__Group__166410 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__17_in_rule__PogoDeviceClass__Group__166420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__StatesAssignment_17_in_rule__PogoDeviceClass__Group__176448 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__18_in_rule__PogoDeviceClass__Group__176458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__PreferencesAssignment_18_in_rule__PogoDeviceClass__Group__186486 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__19_in_rule__PogoDeviceClass__Group__186495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PogoDeviceClass__Group__196524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__PogoDeviceClass__Group_3__06600 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group_3__1_in_rule__PogoDeviceClass__Group_3__06610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__BaseClassAssignment_3_1_in_rule__PogoDeviceClass__Group_3__16638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__DescriptionAssignment_0_in_rule__ClassDescription__Group__06676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__1_in_rule__ClassDescription__Group__06685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__TitleAssignment_1_in_rule__ClassDescription__Group__16713 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__2_in_rule__ClassDescription__Group__16722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__SourcePathAssignment_2_in_rule__ClassDescription__Group__26750 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__3_in_rule__ClassDescription__Group__26759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ClassDescription__Group__36788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__4_in_rule__ClassDescription__Group__36798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__InheritancesAssignment_4_in_rule__ClassDescription__Group__46826 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__5_in_rule__ClassDescription__Group__46835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__LanguageAssignment_5_in_rule__ClassDescription__Group__56863 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__6_in_rule__ClassDescription__Group__56872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__FilestogenerateAssignment_6_in_rule__ClassDescription__Group__66900 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__7_in_rule__ClassDescription__Group__66909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__IdentificationAssignment_7_in_rule__ClassDescription__Group__76937 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__8_in_rule__ClassDescription__Group__76946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__CommentsAssignment_8_in_rule__ClassDescription__Group__86974 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__9_in_rule__ClassDescription__Group__86983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__HasAbstractCommandAssignment_9_in_rule__ClassDescription__Group__97011 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__10_in_rule__ClassDescription__Group__97020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__HasAbstractAttributeAssignment_10_in_rule__ClassDescription__Group__107048 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__11_in_rule__ClassDescription__Group__107057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__HasDynamicAttributeAssignment_11_in_rule__ClassDescription__Group__117085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inheritance__ClassnameAssignment_0_in_rule__Inheritance__Group__07143 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Inheritance__Group__1_in_rule__Inheritance__Group__07152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inheritance__SourcePathAssignment_1_in_rule__Inheritance__Group__17180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__ContactAssignment_0_in_rule__ClassIdentification__Group__07218 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassIdentification__Group__1_in_rule__ClassIdentification__Group__07227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__AuthorAssignment_1_in_rule__ClassIdentification__Group__17255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassIdentification__Group__2_in_rule__ClassIdentification__Group__17264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__EmailDomainAssignment_2_in_rule__ClassIdentification__Group__27292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassIdentification__Group__3_in_rule__ClassIdentification__Group__27301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__ClassFamilyAssignment_3_in_rule__ClassIdentification__Group__37329 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassIdentification__Group__4_in_rule__ClassIdentification__Group__37338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__SiteSpecificAssignment_4_in_rule__ClassIdentification__Group__47366 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassIdentification__Group__5_in_rule__ClassIdentification__Group__47375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__PlatformAssignment_5_in_rule__ClassIdentification__Group__57403 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassIdentification__Group__6_in_rule__ClassIdentification__Group__57412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__BusAssignment_6_in_rule__ClassIdentification__Group__67440 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassIdentification__Group__7_in_rule__ClassIdentification__Group__67449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__ManufacturerAssignment_7_in_rule__ClassIdentification__Group__77477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassIdentification__Group__8_in_rule__ClassIdentification__Group__77486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__ReferenceAssignment_8_in_rule__ClassIdentification__Group__87514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comments__HtmlInheritanceAssignment_0_in_rule__Comments__Group__07566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Comments__Group__1_in_rule__Comments__Group__07575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comments__CommandsTableAssignment_1_in_rule__Comments__Group__17603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Preferences__DocHomeAssignment_0_in_rule__Preferences__Group__07641 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Preferences__Group__1_in_rule__Preferences__Group__07650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Preferences__MakefileHomeAssignment_1_in_rule__Preferences__Group__17678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Preferences__Group__2_in_rule__Preferences__Group__17687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Preferences__InstallHomeAssignment_2_in_rule__Preferences__Group__27715 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Preferences__Group__3_in_rule__Preferences__Group__27724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Preferences__HtmlVersionAssignment_3_in_rule__Preferences__Group__37752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_0_in_rule__State__Group__07794 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__07803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__DescriptionAssignment_1_in_rule__State__Group__17831 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__17840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StatusAssignment_2_in_rule__State__Group__27868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NameAssignment_0_in_rule__Property__Group__07908 = new BitSet(new long[]{0x001FE00000000000L,0x0000000000003E00L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__07917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__TypeAssignment_1_in_rule__Property__Group__17945 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__17954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__StatusAssignment_2_in_rule__Property__Group__27982 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__3_in_rule__Property__Group__27991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__DescriptionAssignment_3_in_rule__Property__Group__38019 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Property__Group__4_in_rule__Property__Group__38028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Property__Group__48057 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Property__Group__5_in_rule__Property__Group__48067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__DefaultPropValueAssignment_5_in_rule__Property__Group__58095 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__InheritanceStatus__AbstractAssignment_0_in_rule__InheritanceStatus__Group__08142 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__InheritanceStatus__Group__1_in_rule__InheritanceStatus__Group__08151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InheritanceStatus__InheritedAssignment_1_in_rule__InheritanceStatus__Group__18179 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__InheritanceStatus__Group__2_in_rule__InheritanceStatus__Group__18188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InheritanceStatus__ConcreteAssignment_2_in_rule__InheritanceStatus__Group__28216 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__InheritanceStatus__Group__3_in_rule__InheritanceStatus__Group__28225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InheritanceStatus__ConcreteHereAssignment_3_in_rule__InheritanceStatus__Group__38253 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InheritanceStatus__Group__4_in_rule__InheritanceStatus__Group__38262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InheritanceStatus__HasChangedAssignment_4_in_rule__InheritanceStatus__Group__48290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__NameAssignment_0_in_rule__Command__Group__08334 = new BitSet(new long[]{0xFFFFF00000000000L,0x00000000000001FFL});
    public static final BitSet FOLLOW_rule__Command__Group__1_in_rule__Command__Group__08343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ArginAssignment_1_in_rule__Command__Group__18371 = new BitSet(new long[]{0xFFFFF00000000000L,0x00000000000001FFL});
    public static final BitSet FOLLOW_rule__Command__Group__2_in_rule__Command__Group__18380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ArgoutAssignment_2_in_rule__Command__Group__28408 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group__3_in_rule__Command__Group__28417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__DescriptionAssignment_3_in_rule__Command__Group__38445 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Command__Group__4_in_rule__Command__Group__38454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__StatusAssignment_4_in_rule__Command__Group__48482 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group__5_in_rule__Command__Group__48491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ExecMethodAssignment_5_in_rule__Command__Group__58519 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Command__Group__6_in_rule__Command__Group__58528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__DisplayLevelAssignment_6_in_rule__Command__Group__68556 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group__7_in_rule__Command__Group__68565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__PolledPeriodAssignment_7_in_rule__Command__Group__78593 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Command__Group__8_in_rule__Command__Group__78602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Command__Group__88631 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Command__Group__9_in_rule__Command__Group__88641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ExcludedStatesAssignment_9_in_rule__Command__Group__98669 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Argument__TypeAssignment_0_in_rule__Argument__Group__08724 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__08733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__DescriptionAssignment_1_in_rule__Argument__Group__18761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__08799 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__08808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__AttTypeAssignment_1_in_rule__Attribute__Group__18836 = new BitSet(new long[]{0xFFFFF00000000000L,0x00000000000001FFL});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__18845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__DataTypeAssignment_2_in_rule__Attribute__Group__28873 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__28882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__RwTypeAssignment_3_in_rule__Attribute__Group__38910 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__38919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__DisplayLevelAssignment_4_in_rule__Attribute__Group__48947 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__48956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__PolledPeriodAssignment_5_in_rule__Attribute__Group__58984 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__6_in_rule__Attribute__Group__58993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__MaxXAssignment_6_in_rule__Attribute__Group__69021 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__7_in_rule__Attribute__Group__69030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__MaxYAssignment_7_in_rule__Attribute__Group__79058 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__8_in_rule__Attribute__Group__79067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__MemorizedAssignment_8_in_rule__Attribute__Group__89095 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__9_in_rule__Attribute__Group__89104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__MemorizedAtInitAssignment_9_in_rule__Attribute__Group__99132 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__10_in_rule__Attribute__Group__99141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ChangeEventAssignment_10_in_rule__Attribute__Group__109169 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__11_in_rule__Attribute__Group__109178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ArchiveEventAssignment_11_in_rule__Attribute__Group__119206 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__12_in_rule__Attribute__Group__119215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__DataReadyEventAssignment_12_in_rule__Attribute__Group__129243 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__13_in_rule__Attribute__Group__129252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__StatusAssignment_13_in_rule__Attribute__Group__139280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__14_in_rule__Attribute__Group__139289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__PropertiesAssignment_14_in_rule__Attribute__Group__149317 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__15_in_rule__Attribute__Group__149326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__AllocReadMemberAssignment_15_in_rule__Attribute__Group__159354 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__16_in_rule__Attribute__Group__159363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__IsDynamicAssignment_16_in_rule__Attribute__Group__169391 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__17_in_rule__Attribute__Group__169400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Attribute__Group__179429 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__18_in_rule__Attribute__Group__179439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ReadExcludedStatesAssignment_18_in_rule__Attribute__Group__189467 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__19_in_rule__Attribute__Group__189477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Attribute__Group__199506 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Attribute__Group__20_in_rule__Attribute__Group__199516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__WriteExcludedStatesAssignment_20_in_rule__Attribute__Group__209544 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__FireEvents__FireAssignment_0_in_rule__FireEvents__Group__09621 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__FireEvents__Group__1_in_rule__FireEvents__Group__09630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FireEvents__LibCheckCriteriaAssignment_1_in_rule__FireEvents__Group__19658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__DescriptionAssignment_0_in_rule__AttrProperties__Group__09696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__1_in_rule__AttrProperties__Group__09705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__LabelAssignment_1_in_rule__AttrProperties__Group__19733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__2_in_rule__AttrProperties__Group__19742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__UnitAssignment_2_in_rule__AttrProperties__Group__29770 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__3_in_rule__AttrProperties__Group__29779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__StandardUnitAssignment_3_in_rule__AttrProperties__Group__39807 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__4_in_rule__AttrProperties__Group__39816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__DisplayUnitAssignment_4_in_rule__AttrProperties__Group__49844 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__5_in_rule__AttrProperties__Group__49853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__FormatAssignment_5_in_rule__AttrProperties__Group__59881 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__6_in_rule__AttrProperties__Group__59890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__MaxValueAssignment_6_in_rule__AttrProperties__Group__69918 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__7_in_rule__AttrProperties__Group__69927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__MinValueAssignment_7_in_rule__AttrProperties__Group__79955 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__8_in_rule__AttrProperties__Group__79964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__MaxAlarmAssignment_8_in_rule__AttrProperties__Group__89992 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__9_in_rule__AttrProperties__Group__810001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__MinAlarmAssignment_9_in_rule__AttrProperties__Group__910029 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__10_in_rule__AttrProperties__Group__910038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__MaxWarningAssignment_10_in_rule__AttrProperties__Group__1010066 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__11_in_rule__AttrProperties__Group__1010075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__MinWarningAssignment_11_in_rule__AttrProperties__Group__1110103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__12_in_rule__AttrProperties__Group__1110112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__DeltaTimeAssignment_12_in_rule__AttrProperties__Group__1210140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__13_in_rule__AttrProperties__Group__1210149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__DeltaValueAssignment_13_in_rule__AttrProperties__Group__1310177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VoidType__Group__1_in_rule__VoidType__Group__010249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__VoidType__Group__110278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanType__Group__1_in_rule__BooleanType__Group__010327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__BooleanType__Group__110356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortType__Group__1_in_rule__ShortType__Group__010405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ShortType__Group__110434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UShortType__Group__1_in_rule__UShortType__Group__010483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__UShortType__Group__110512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntType__Group__1_in_rule__IntType__Group__010561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__IntType__Group__110590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIntType__Group__1_in_rule__UIntType__Group__010639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__UIntType__Group__110668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatType__Group__1_in_rule__FloatType__Group__010717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__FloatType__Group__110746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleType__Group__1_in_rule__DoubleType__Group__010795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__DoubleType__Group__110824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group__1_in_rule__StringType__Group__010873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__StringType__Group__110902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharArrayType__Group__1_in_rule__CharArrayType__Group__010951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__CharArrayType__Group__110980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortArrayType__Group__1_in_rule__ShortArrayType__Group__011029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__ShortArrayType__Group__111058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UShortArrayType__Group__1_in_rule__UShortArrayType__Group__011107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__UShortArrayType__Group__111136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntArrayType__Group__1_in_rule__IntArrayType__Group__011185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__IntArrayType__Group__111214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIntArrayType__Group__1_in_rule__UIntArrayType__Group__011263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__UIntArrayType__Group__111292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatArrayType__Group__1_in_rule__FloatArrayType__Group__011341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__FloatArrayType__Group__111370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleArrayType__Group__1_in_rule__DoubleArrayType__Group__011419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__DoubleArrayType__Group__111448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringArrayType__Group__1_in_rule__StringArrayType__Group__011497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__StringArrayType__Group__111526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongStringArrayType__Group__1_in_rule__LongStringArrayType__Group__011575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__LongStringArrayType__Group__111604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleStringArrayType__Group__1_in_rule__DoubleStringArrayType__Group__011653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__DoubleStringArrayType__Group__111682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateType__Group__1_in_rule__StateType__Group__011731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__StateType__Group__111760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstStringType__Group__1_in_rule__ConstStringType__Group__011809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__ConstStringType__Group__111838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanArrayType__Group__1_in_rule__BooleanArrayType__Group__011887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__BooleanArrayType__Group__111916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UCharType__Group__1_in_rule__UCharType__Group__011965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__UCharType__Group__111994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongType__Group__1_in_rule__LongType__Group__012043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__LongType__Group__112072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ULongType__Group__1_in_rule__ULongType__Group__012121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__ULongType__Group__112150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongArrayType__Group__1_in_rule__LongArrayType__Group__012199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__LongArrayType__Group__112228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ULongArrayType__Group__1_in_rule__ULongArrayType__Group__012277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__ULongArrayType__Group__112306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DevIntType__Group__1_in_rule__DevIntType__Group__012355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__DevIntType__Group__112384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodedType__Group__1_in_rule__EncodedType__Group__012433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__EncodedType__Group__112462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortVectorType__Group__1_in_rule__ShortVectorType__Group__012511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__ShortVectorType__Group__112540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntVectorType__Group__1_in_rule__IntVectorType__Group__012589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rule__IntVectorType__Group__112618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatVectorType__Group__1_in_rule__FloatVectorType__Group__012667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__FloatVectorType__Group__112696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleVectorType__Group__1_in_rule__DoubleVectorType__Group__012745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rule__DoubleVectorType__Group__112774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVectorType__Group__1_in_rule__StringVectorType__Group__012823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_rule__StringVectorType__Group__112852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__PogoSystem__ImportsAssignment_012891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePogoDeviceClass_in_rule__PogoSystem__ClassesAssignment_112922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePogoMultiClasses_in_rule__PogoSystem__MultiClassesAssignment_212953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_112984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PogoMultiClasses__NameAssignment_113015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PogoMultiClasses__SourcePathAssignment_313046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PogoMultiClasses__DescriptionAssignment_413077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PogoMultiClasses__TitleAssignment_513108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneClassSimpleDef_in_rule__PogoMultiClasses__ClassesAssignment_713139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PogoMultiClasses__FilestogenerateAssignment_813170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreferences_in_rule__PogoMultiClasses__PreferencesAssignment_913201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__OneClassSimpleDef__ClassnameAssignment_013232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__OneClassSimpleDef__SourcePathAssignment_113263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__OneClassSimpleDef__Pogo6Assignment_213294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritance_in_rule__OneClassSimpleDef__InheritancesAssignment_413325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__OneClassSimpleDef__ParentClassesAssignment_613356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PogoDeviceClass__NameAssignment_113387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_rule__PogoDeviceClass__IsAbstractAssignment_213423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PogoDeviceClass__BaseClassAssignment_3_113466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PogoDeviceClass__InstituteAssignment_513501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDescription_in_rule__PogoDeviceClass__DescriptionAssignment_713532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__PogoDeviceClass__ClassPropertiesAssignment_913563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__PogoDeviceClass__DevicePropertiesAssignment_1113594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__PogoDeviceClass__CommandsAssignment_1313625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__PogoDeviceClass__AttributesAssignment_1513656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__PogoDeviceClass__StatesAssignment_1713687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreferences_in_rule__PogoDeviceClass__PreferencesAssignment_1813718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassDescription__DescriptionAssignment_013749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassDescription__TitleAssignment_113780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassDescription__SourcePathAssignment_213811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritance_in_rule__ClassDescription__InheritancesAssignment_413842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLanguage_in_rule__ClassDescription__LanguageAssignment_513873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassDescription__FilestogenerateAssignment_613904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassIdentification_in_rule__ClassDescription__IdentificationAssignment_713935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComments_in_rule__ClassDescription__CommentsAssignment_813966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__ClassDescription__HasAbstractCommandAssignment_913997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__ClassDescription__HasAbstractAttributeAssignment_1014028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__ClassDescription__HasDynamicAttributeAssignment_1114059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Inheritance__ClassnameAssignment_014090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Inheritance__SourcePathAssignment_114121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassIdentification__ContactAssignment_014152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassIdentification__AuthorAssignment_114183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassIdentification__EmailDomainAssignment_214214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassIdentification__ClassFamilyAssignment_314245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassIdentification__SiteSpecificAssignment_414276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassIdentification__PlatformAssignment_514307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassIdentification__BusAssignment_614338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassIdentification__ManufacturerAssignment_714369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassIdentification__ReferenceAssignment_814400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Comments__HtmlInheritanceAssignment_014431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Comments__CommandsTableAssignment_114462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Preferences__DocHomeAssignment_014493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Preferences__MakefileHomeAssignment_114524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Preferences__InstallHomeAssignment_214555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__Preferences__HtmlVersionAssignment_314586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_014617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__State__DescriptionAssignment_114648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_rule__State__StatusAssignment_214679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__NameAssignment_014710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropType_in_rule__Property__TypeAssignment_114741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_rule__Property__StatusAssignment_214772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Property__DescriptionAssignment_314803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Property__DefaultPropValueAssignment_514834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__InheritanceStatus__AbstractAssignment_014865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__InheritanceStatus__InheritedAssignment_114896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__InheritanceStatus__ConcreteAssignment_214927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__InheritanceStatus__ConcreteHereAssignment_314958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__InheritanceStatus__HasChangedAssignment_414989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Command__NameAssignment_015020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Command__ArginAssignment_115051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Command__ArgoutAssignment_215082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Command__DescriptionAssignment_315113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_rule__Command__StatusAssignment_415144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Command__ExecMethodAssignment_515175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisplayLevel_in_rule__Command__DisplayLevelAssignment_615206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Command__PolledPeriodAssignment_715237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Command__ExcludedStatesAssignment_915268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Argument__TypeAssignment_015299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__DescriptionAssignment_115330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_015361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrType_in_rule__Attribute__AttTypeAssignment_115392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Attribute__DataTypeAssignment_215423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRW_Type_in_rule__Attribute__RwTypeAssignment_315454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisplayLevel_in_rule__Attribute__DisplayLevelAssignment_415485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__PolledPeriodAssignment_515516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__MaxXAssignment_615547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__MaxYAssignment_715578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__Attribute__MemorizedAssignment_815609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__Attribute__MemorizedAtInitAssignment_915640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFireEvents_in_rule__Attribute__ChangeEventAssignment_1015671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFireEvents_in_rule__Attribute__ArchiveEventAssignment_1115702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFireEvents_in_rule__Attribute__DataReadyEventAssignment_1215733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_rule__Attribute__StatusAssignment_1315764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrProperties_in_rule__Attribute__PropertiesAssignment_1415795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__Attribute__AllocReadMemberAssignment_1515826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__Attribute__IsDynamicAssignment_1615857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__ReadExcludedStatesAssignment_1815888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__WriteExcludedStatesAssignment_2015919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__FireEvents__FireAssignment_015950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__FireEvents__LibCheckCriteriaAssignment_115981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__DescriptionAssignment_016012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__LabelAssignment_116043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__UnitAssignment_216074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__StandardUnitAssignment_316105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__DisplayUnitAssignment_416136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__FormatAssignment_516167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__MaxValueAssignment_616198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__MinValueAssignment_716229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__MaxAlarmAssignment_816260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__MinAlarmAssignment_916291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__MaxWarningAssignment_1016322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__MinWarningAssignment_1116353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__DeltaTimeAssignment_1216384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__DeltaValueAssignment_1316415 = new BitSet(new long[]{0x0000000000000002L});

}