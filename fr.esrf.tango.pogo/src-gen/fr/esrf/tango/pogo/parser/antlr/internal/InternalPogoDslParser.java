package fr.esrf.tango.pogo.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.esrf.tango.pogo.services.PogoDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPogoDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'multiclasses'", "'{'", "'classes:'", "'}'", "'inheritances:'", "'parentClasses:'", "'additionalFiles:'", "'deviceclass'", "'abstract'", "'extends'", "'description:'", "'classProperties:'", "'deviceProperties:'", "'commands:'", "'attributes:'", "'dynamicAttributes:'", "'states:'", "'overlodedPollPeriodObject:'", "'Cpp'", "'Java'", "'Python'", "'OPERATOR'", "'EXPERT'", "'Scalar'", "'Spectrum'", "'Image'", "'READ'", "'WRITE'", "'READ_WRITE'", "'READ_WITH_WRITE'", "'true'", "'false'", "'defaultPropValue:'", "'excludedStates:'", "'readExcludedStates:'", "'writeExcludedStates:'", "'void'", "'boolean'", "'short'", "'ushort'", "'int'", "'uint'", "'float'", "'double'", "'string'", "'DevVarCharArray'", "'DevVarShortArray'", "'DevVarUShortArray'", "'DevVarLongArray'", "'DevVarULongArray'", "'DevVarFloatArray'", "'DevVarDoubleArray'", "'DevVarStringArray'", "'DevVarLongStringArray'", "'DevVarDoubleStringArray'", "'DevState'", "'ConstDevString'", "'DevVarBooleanArray'", "'DevUChar'", "'DevLong64'", "'DevULong64'", "'DevVarLong64Array'", "'DevVarULong64Array'", "'DevInt'", "'DevEncoded'", "'vector<short>'", "'vector<int>'", "'vector<float>'", "'vector<double>'", "'vector<string>'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=5;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalPogoDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPogoDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPogoDslParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g"; }



     	private PogoDslGrammarAccess grammarAccess;
     	
        public InternalPogoDslParser(TokenStream input, PogoDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "PogoSystem";	
       	}
       	
       	@Override
       	protected PogoDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePogoSystem"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:67:1: entryRulePogoSystem returns [EObject current=null] : iv_rulePogoSystem= rulePogoSystem EOF ;
    public final EObject entryRulePogoSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePogoSystem = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:68:2: (iv_rulePogoSystem= rulePogoSystem EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:69:2: iv_rulePogoSystem= rulePogoSystem EOF
            {
             newCompositeNode(grammarAccess.getPogoSystemRule()); 
            pushFollow(FOLLOW_rulePogoSystem_in_entryRulePogoSystem75);
            iv_rulePogoSystem=rulePogoSystem();

            state._fsp--;

             current =iv_rulePogoSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePogoSystem85); 

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
    // $ANTLR end "entryRulePogoSystem"


    // $ANTLR start "rulePogoSystem"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:76:1: rulePogoSystem returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_classes_1_0= rulePogoDeviceClass ) )* ( (lv_multiClasses_2_0= rulePogoMultiClasses ) )* ) ;
    public final EObject rulePogoSystem() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_classes_1_0 = null;

        EObject lv_multiClasses_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_classes_1_0= rulePogoDeviceClass ) )* ( (lv_multiClasses_2_0= rulePogoMultiClasses ) )* ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_classes_1_0= rulePogoDeviceClass ) )* ( (lv_multiClasses_2_0= rulePogoMultiClasses ) )* )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_classes_1_0= rulePogoDeviceClass ) )* ( (lv_multiClasses_2_0= rulePogoMultiClasses ) )* )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:80:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_classes_1_0= rulePogoDeviceClass ) )* ( (lv_multiClasses_2_0= rulePogoMultiClasses ) )*
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:81:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:81:1: (lv_imports_0_0= ruleImport )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:82:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoSystemAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_rulePogoSystem131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPogoSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_0_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:98:3: ( (lv_classes_1_0= rulePogoDeviceClass ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:99:1: (lv_classes_1_0= rulePogoDeviceClass )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:99:1: (lv_classes_1_0= rulePogoDeviceClass )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:100:3: lv_classes_1_0= rulePogoDeviceClass
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoSystemAccess().getClassesPogoDeviceClassParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePogoDeviceClass_in_rulePogoSystem153);
            	    lv_classes_1_0=rulePogoDeviceClass();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPogoSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"classes",
            	            		lv_classes_1_0, 
            	            		"PogoDeviceClass");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:116:3: ( (lv_multiClasses_2_0= rulePogoMultiClasses ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:117:1: (lv_multiClasses_2_0= rulePogoMultiClasses )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:117:1: (lv_multiClasses_2_0= rulePogoMultiClasses )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:118:3: lv_multiClasses_2_0= rulePogoMultiClasses
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoSystemAccess().getMultiClassesPogoMultiClassesParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePogoMultiClasses_in_rulePogoSystem175);
            	    lv_multiClasses_2_0=rulePogoMultiClasses();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPogoSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"multiClasses",
            	            		lv_multiClasses_2_0, 
            	            		"PogoMultiClasses");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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
    // $ANTLR end "rulePogoSystem"


    // $ANTLR start "entryRuleImport"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:142:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:143:2: (iv_ruleImport= ruleImport EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:144:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport212);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport222); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:151:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:154:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:155:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:155:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:155:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImport259); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:159:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:160:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:160:1: (lv_importURI_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:161:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport276); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"STRING");
            	    

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


    // $ANTLR start "entryRulePogoMultiClasses"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:185:1: entryRulePogoMultiClasses returns [EObject current=null] : iv_rulePogoMultiClasses= rulePogoMultiClasses EOF ;
    public final EObject entryRulePogoMultiClasses() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePogoMultiClasses = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:186:2: (iv_rulePogoMultiClasses= rulePogoMultiClasses EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:187:2: iv_rulePogoMultiClasses= rulePogoMultiClasses EOF
            {
             newCompositeNode(grammarAccess.getPogoMultiClassesRule()); 
            pushFollow(FOLLOW_rulePogoMultiClasses_in_entryRulePogoMultiClasses317);
            iv_rulePogoMultiClasses=rulePogoMultiClasses();

            state._fsp--;

             current =iv_rulePogoMultiClasses; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePogoMultiClasses327); 

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
    // $ANTLR end "entryRulePogoMultiClasses"


    // $ANTLR start "rulePogoMultiClasses"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:194:1: rulePogoMultiClasses returns [EObject current=null] : ( ( (lv_pogoRevision_0_0= RULE_ID ) ) otherlv_1= 'multiclasses' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_sourcePath_4_0= RULE_STRING ) ) ( (lv_description_5_0= RULE_STRING ) ) ( (lv_title_6_0= RULE_STRING ) ) ( (lv_license_7_0= RULE_STRING ) ) otherlv_8= 'classes:' ( (lv_classes_9_0= ruleOneClassSimpleDef ) ) ( (lv_filestogenerate_10_0= RULE_STRING ) ) ( (lv_preferences_11_0= rulePreferences ) ) otherlv_12= '}' ) ;
    public final EObject rulePogoMultiClasses() throws RecognitionException {
        EObject current = null;

        Token lv_pogoRevision_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_sourcePath_4_0=null;
        Token lv_description_5_0=null;
        Token lv_title_6_0=null;
        Token lv_license_7_0=null;
        Token otherlv_8=null;
        Token lv_filestogenerate_10_0=null;
        Token otherlv_12=null;
        EObject lv_classes_9_0 = null;

        EObject lv_preferences_11_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:197:28: ( ( ( (lv_pogoRevision_0_0= RULE_ID ) ) otherlv_1= 'multiclasses' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_sourcePath_4_0= RULE_STRING ) ) ( (lv_description_5_0= RULE_STRING ) ) ( (lv_title_6_0= RULE_STRING ) ) ( (lv_license_7_0= RULE_STRING ) ) otherlv_8= 'classes:' ( (lv_classes_9_0= ruleOneClassSimpleDef ) ) ( (lv_filestogenerate_10_0= RULE_STRING ) ) ( (lv_preferences_11_0= rulePreferences ) ) otherlv_12= '}' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:198:1: ( ( (lv_pogoRevision_0_0= RULE_ID ) ) otherlv_1= 'multiclasses' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_sourcePath_4_0= RULE_STRING ) ) ( (lv_description_5_0= RULE_STRING ) ) ( (lv_title_6_0= RULE_STRING ) ) ( (lv_license_7_0= RULE_STRING ) ) otherlv_8= 'classes:' ( (lv_classes_9_0= ruleOneClassSimpleDef ) ) ( (lv_filestogenerate_10_0= RULE_STRING ) ) ( (lv_preferences_11_0= rulePreferences ) ) otherlv_12= '}' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:198:1: ( ( (lv_pogoRevision_0_0= RULE_ID ) ) otherlv_1= 'multiclasses' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_sourcePath_4_0= RULE_STRING ) ) ( (lv_description_5_0= RULE_STRING ) ) ( (lv_title_6_0= RULE_STRING ) ) ( (lv_license_7_0= RULE_STRING ) ) otherlv_8= 'classes:' ( (lv_classes_9_0= ruleOneClassSimpleDef ) ) ( (lv_filestogenerate_10_0= RULE_STRING ) ) ( (lv_preferences_11_0= rulePreferences ) ) otherlv_12= '}' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:198:2: ( (lv_pogoRevision_0_0= RULE_ID ) ) otherlv_1= 'multiclasses' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_sourcePath_4_0= RULE_STRING ) ) ( (lv_description_5_0= RULE_STRING ) ) ( (lv_title_6_0= RULE_STRING ) ) ( (lv_license_7_0= RULE_STRING ) ) otherlv_8= 'classes:' ( (lv_classes_9_0= ruleOneClassSimpleDef ) ) ( (lv_filestogenerate_10_0= RULE_STRING ) ) ( (lv_preferences_11_0= rulePreferences ) ) otherlv_12= '}'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:198:2: ( (lv_pogoRevision_0_0= RULE_ID ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:199:1: (lv_pogoRevision_0_0= RULE_ID )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:199:1: (lv_pogoRevision_0_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:200:3: lv_pogoRevision_0_0= RULE_ID
            {
            lv_pogoRevision_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePogoMultiClasses369); 

            			newLeafNode(lv_pogoRevision_0_0, grammarAccess.getPogoMultiClassesAccess().getPogoRevisionIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPogoMultiClassesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"pogoRevision",
                    		lv_pogoRevision_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_rulePogoMultiClasses386); 

                	newLeafNode(otherlv_1, grammarAccess.getPogoMultiClassesAccess().getMulticlassesKeyword_1());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:220:1: ( (lv_name_2_0= RULE_ID ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:221:1: (lv_name_2_0= RULE_ID )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:221:1: (lv_name_2_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:222:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePogoMultiClasses403); 

            			newLeafNode(lv_name_2_0, grammarAccess.getPogoMultiClassesAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPogoMultiClassesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_rulePogoMultiClasses420); 

                	newLeafNode(otherlv_3, grammarAccess.getPogoMultiClassesAccess().getLeftCurlyBracketKeyword_3());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:242:1: ( (lv_sourcePath_4_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:243:1: (lv_sourcePath_4_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:243:1: (lv_sourcePath_4_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:244:3: lv_sourcePath_4_0= RULE_STRING
            {
            lv_sourcePath_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePogoMultiClasses437); 

            			newLeafNode(lv_sourcePath_4_0, grammarAccess.getPogoMultiClassesAccess().getSourcePathSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPogoMultiClassesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"sourcePath",
                    		lv_sourcePath_4_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:260:2: ( (lv_description_5_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:261:1: (lv_description_5_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:261:1: (lv_description_5_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:262:3: lv_description_5_0= RULE_STRING
            {
            lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePogoMultiClasses459); 

            			newLeafNode(lv_description_5_0, grammarAccess.getPogoMultiClassesAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPogoMultiClassesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_5_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:278:2: ( (lv_title_6_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:279:1: (lv_title_6_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:279:1: (lv_title_6_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:280:3: lv_title_6_0= RULE_STRING
            {
            lv_title_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePogoMultiClasses481); 

            			newLeafNode(lv_title_6_0, grammarAccess.getPogoMultiClassesAccess().getTitleSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPogoMultiClassesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_6_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:296:2: ( (lv_license_7_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:297:1: (lv_license_7_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:297:1: (lv_license_7_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:298:3: lv_license_7_0= RULE_STRING
            {
            lv_license_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePogoMultiClasses503); 

            			newLeafNode(lv_license_7_0, grammarAccess.getPogoMultiClassesAccess().getLicenseSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPogoMultiClassesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"license",
                    		lv_license_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_rulePogoMultiClasses520); 

                	newLeafNode(otherlv_8, grammarAccess.getPogoMultiClassesAccess().getClassesKeyword_8());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:318:1: ( (lv_classes_9_0= ruleOneClassSimpleDef ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:319:1: (lv_classes_9_0= ruleOneClassSimpleDef )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:319:1: (lv_classes_9_0= ruleOneClassSimpleDef )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:320:3: lv_classes_9_0= ruleOneClassSimpleDef
            {
             
            	        newCompositeNode(grammarAccess.getPogoMultiClassesAccess().getClassesOneClassSimpleDefParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleOneClassSimpleDef_in_rulePogoMultiClasses541);
            lv_classes_9_0=ruleOneClassSimpleDef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPogoMultiClassesRule());
            	        }
                   		add(
                   			current, 
                   			"classes",
                    		lv_classes_9_0, 
                    		"OneClassSimpleDef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:336:2: ( (lv_filestogenerate_10_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:337:1: (lv_filestogenerate_10_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:337:1: (lv_filestogenerate_10_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:338:3: lv_filestogenerate_10_0= RULE_STRING
            {
            lv_filestogenerate_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePogoMultiClasses558); 

            			newLeafNode(lv_filestogenerate_10_0, grammarAccess.getPogoMultiClassesAccess().getFilestogenerateSTRINGTerminalRuleCall_10_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPogoMultiClassesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"filestogenerate",
                    		lv_filestogenerate_10_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:354:2: ( (lv_preferences_11_0= rulePreferences ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:355:1: (lv_preferences_11_0= rulePreferences )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:355:1: (lv_preferences_11_0= rulePreferences )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:356:3: lv_preferences_11_0= rulePreferences
            {
             
            	        newCompositeNode(grammarAccess.getPogoMultiClassesAccess().getPreferencesPreferencesParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_rulePreferences_in_rulePogoMultiClasses584);
            lv_preferences_11_0=rulePreferences();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPogoMultiClassesRule());
            	        }
                   		set(
                   			current, 
                   			"preferences",
                    		lv_preferences_11_0, 
                    		"Preferences");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_12=(Token)match(input,15,FOLLOW_15_in_rulePogoMultiClasses596); 

                	newLeafNode(otherlv_12, grammarAccess.getPogoMultiClassesAccess().getRightCurlyBracketKeyword_12());
                

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
    // $ANTLR end "rulePogoMultiClasses"


    // $ANTLR start "entryRuleOneClassSimpleDef"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:384:1: entryRuleOneClassSimpleDef returns [EObject current=null] : iv_ruleOneClassSimpleDef= ruleOneClassSimpleDef EOF ;
    public final EObject entryRuleOneClassSimpleDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneClassSimpleDef = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:385:2: (iv_ruleOneClassSimpleDef= ruleOneClassSimpleDef EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:386:2: iv_ruleOneClassSimpleDef= ruleOneClassSimpleDef EOF
            {
             newCompositeNode(grammarAccess.getOneClassSimpleDefRule()); 
            pushFollow(FOLLOW_ruleOneClassSimpleDef_in_entryRuleOneClassSimpleDef632);
            iv_ruleOneClassSimpleDef=ruleOneClassSimpleDef();

            state._fsp--;

             current =iv_ruleOneClassSimpleDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneClassSimpleDef642); 

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
    // $ANTLR end "entryRuleOneClassSimpleDef"


    // $ANTLR start "ruleOneClassSimpleDef"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:393:1: ruleOneClassSimpleDef returns [EObject current=null] : ( ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) ( (lv_hasDynamic_2_0= ruleBoolean ) ) ( (lv_pogo6_3_0= ruleBoolean ) ) otherlv_4= 'inheritances:' ( (lv_inheritances_5_0= ruleInheritance ) ) otherlv_6= 'parentClasses:' ( (lv_parentClasses_7_0= RULE_STRING ) ) otherlv_8= 'additionalFiles:' ( (lv_additionalFiles_9_0= ruleAdditionalFile ) )* ) ;
    public final EObject ruleOneClassSimpleDef() throws RecognitionException {
        EObject current = null;

        Token lv_classname_0_0=null;
        Token lv_sourcePath_1_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_parentClasses_7_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_hasDynamic_2_0 = null;

        AntlrDatatypeRuleToken lv_pogo6_3_0 = null;

        EObject lv_inheritances_5_0 = null;

        EObject lv_additionalFiles_9_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:396:28: ( ( ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) ( (lv_hasDynamic_2_0= ruleBoolean ) ) ( (lv_pogo6_3_0= ruleBoolean ) ) otherlv_4= 'inheritances:' ( (lv_inheritances_5_0= ruleInheritance ) ) otherlv_6= 'parentClasses:' ( (lv_parentClasses_7_0= RULE_STRING ) ) otherlv_8= 'additionalFiles:' ( (lv_additionalFiles_9_0= ruleAdditionalFile ) )* ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:397:1: ( ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) ( (lv_hasDynamic_2_0= ruleBoolean ) ) ( (lv_pogo6_3_0= ruleBoolean ) ) otherlv_4= 'inheritances:' ( (lv_inheritances_5_0= ruleInheritance ) ) otherlv_6= 'parentClasses:' ( (lv_parentClasses_7_0= RULE_STRING ) ) otherlv_8= 'additionalFiles:' ( (lv_additionalFiles_9_0= ruleAdditionalFile ) )* )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:397:1: ( ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) ( (lv_hasDynamic_2_0= ruleBoolean ) ) ( (lv_pogo6_3_0= ruleBoolean ) ) otherlv_4= 'inheritances:' ( (lv_inheritances_5_0= ruleInheritance ) ) otherlv_6= 'parentClasses:' ( (lv_parentClasses_7_0= RULE_STRING ) ) otherlv_8= 'additionalFiles:' ( (lv_additionalFiles_9_0= ruleAdditionalFile ) )* )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:397:2: ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) ( (lv_hasDynamic_2_0= ruleBoolean ) ) ( (lv_pogo6_3_0= ruleBoolean ) ) otherlv_4= 'inheritances:' ( (lv_inheritances_5_0= ruleInheritance ) ) otherlv_6= 'parentClasses:' ( (lv_parentClasses_7_0= RULE_STRING ) ) otherlv_8= 'additionalFiles:' ( (lv_additionalFiles_9_0= ruleAdditionalFile ) )*
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:397:2: ( (lv_classname_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:398:1: (lv_classname_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:398:1: (lv_classname_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:399:3: lv_classname_0_0= RULE_STRING
            {
            lv_classname_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOneClassSimpleDef684); 

            			newLeafNode(lv_classname_0_0, grammarAccess.getOneClassSimpleDefAccess().getClassnameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOneClassSimpleDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"classname",
                    		lv_classname_0_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:415:2: ( (lv_sourcePath_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:416:1: (lv_sourcePath_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:416:1: (lv_sourcePath_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:417:3: lv_sourcePath_1_0= RULE_STRING
            {
            lv_sourcePath_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOneClassSimpleDef706); 

            			newLeafNode(lv_sourcePath_1_0, grammarAccess.getOneClassSimpleDefAccess().getSourcePathSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOneClassSimpleDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"sourcePath",
                    		lv_sourcePath_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:433:2: ( (lv_hasDynamic_2_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:434:1: (lv_hasDynamic_2_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:434:1: (lv_hasDynamic_2_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:435:3: lv_hasDynamic_2_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getOneClassSimpleDefAccess().getHasDynamicBooleanParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleOneClassSimpleDef732);
            lv_hasDynamic_2_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOneClassSimpleDefRule());
            	        }
                   		set(
                   			current, 
                   			"hasDynamic",
                    		lv_hasDynamic_2_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:451:2: ( (lv_pogo6_3_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:452:1: (lv_pogo6_3_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:452:1: (lv_pogo6_3_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:453:3: lv_pogo6_3_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getOneClassSimpleDefAccess().getPogo6BooleanParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleOneClassSimpleDef753);
            lv_pogo6_3_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOneClassSimpleDefRule());
            	        }
                   		set(
                   			current, 
                   			"pogo6",
                    		lv_pogo6_3_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleOneClassSimpleDef765); 

                	newLeafNode(otherlv_4, grammarAccess.getOneClassSimpleDefAccess().getInheritancesKeyword_4());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:473:1: ( (lv_inheritances_5_0= ruleInheritance ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:474:1: (lv_inheritances_5_0= ruleInheritance )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:474:1: (lv_inheritances_5_0= ruleInheritance )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:475:3: lv_inheritances_5_0= ruleInheritance
            {
             
            	        newCompositeNode(grammarAccess.getOneClassSimpleDefAccess().getInheritancesInheritanceParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleInheritance_in_ruleOneClassSimpleDef786);
            lv_inheritances_5_0=ruleInheritance();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOneClassSimpleDefRule());
            	        }
                   		add(
                   			current, 
                   			"inheritances",
                    		lv_inheritances_5_0, 
                    		"Inheritance");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleOneClassSimpleDef798); 

                	newLeafNode(otherlv_6, grammarAccess.getOneClassSimpleDefAccess().getParentClassesKeyword_6());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:495:1: ( (lv_parentClasses_7_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:496:1: (lv_parentClasses_7_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:496:1: (lv_parentClasses_7_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:497:3: lv_parentClasses_7_0= RULE_STRING
            {
            lv_parentClasses_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOneClassSimpleDef815); 

            			newLeafNode(lv_parentClasses_7_0, grammarAccess.getOneClassSimpleDefAccess().getParentClassesSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOneClassSimpleDefRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"parentClasses",
                    		lv_parentClasses_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleOneClassSimpleDef832); 

                	newLeafNode(otherlv_8, grammarAccess.getOneClassSimpleDefAccess().getAdditionalFilesKeyword_8());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:517:1: ( (lv_additionalFiles_9_0= ruleAdditionalFile ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==RULE_STRING) ) {
                        int LA4_3 = input.LA(3);

                        if ( (LA4_3==RULE_STRING) ) {
                            int LA4_4 = input.LA(4);

                            if ( (LA4_4==RULE_STRING) ) {
                                int LA4_6 = input.LA(5);

                                if ( (LA4_6==EOF||LA4_6==RULE_STRING) ) {
                                    alt4=1;
                                }


                            }


                        }
                        else if ( (LA4_3==EOF) ) {
                            alt4=1;
                        }


                    }


                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:518:1: (lv_additionalFiles_9_0= ruleAdditionalFile )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:518:1: (lv_additionalFiles_9_0= ruleAdditionalFile )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:519:3: lv_additionalFiles_9_0= ruleAdditionalFile
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOneClassSimpleDefAccess().getAdditionalFilesAdditionalFileParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAdditionalFile_in_ruleOneClassSimpleDef853);
            	    lv_additionalFiles_9_0=ruleAdditionalFile();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOneClassSimpleDefRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"additionalFiles",
            	            		lv_additionalFiles_9_0, 
            	            		"AdditionalFile");
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
    // $ANTLR end "ruleOneClassSimpleDef"


    // $ANTLR start "entryRulePogoDeviceClass"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:543:1: entryRulePogoDeviceClass returns [EObject current=null] : iv_rulePogoDeviceClass= rulePogoDeviceClass EOF ;
    public final EObject entryRulePogoDeviceClass() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePogoDeviceClass = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:544:2: (iv_rulePogoDeviceClass= rulePogoDeviceClass EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:545:2: iv_rulePogoDeviceClass= rulePogoDeviceClass EOF
            {
             newCompositeNode(grammarAccess.getPogoDeviceClassRule()); 
            pushFollow(FOLLOW_rulePogoDeviceClass_in_entryRulePogoDeviceClass890);
            iv_rulePogoDeviceClass=rulePogoDeviceClass();

            state._fsp--;

             current =iv_rulePogoDeviceClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePogoDeviceClass900); 

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
    // $ANTLR end "entryRulePogoDeviceClass"


    // $ANTLR start "rulePogoDeviceClass"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:552:1: rulePogoDeviceClass returns [EObject current=null] : (otherlv_0= 'deviceclass' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isAbstract_2_0= 'abstract' ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_pogoRevision_6_0= RULE_ID ) ) ( (lv_institute_7_0= RULE_ID ) ) otherlv_8= 'description:' ( (lv_description_9_0= ruleClassDescription ) ) otherlv_10= 'classProperties:' ( (lv_classProperties_11_0= ruleProperty ) )* otherlv_12= 'deviceProperties:' ( (lv_deviceProperties_13_0= ruleProperty ) )* otherlv_14= 'commands:' ( (lv_commands_15_0= ruleCommand ) )* otherlv_16= 'attributes:' ( (lv_attributes_17_0= ruleAttribute ) )* otherlv_18= 'dynamicAttributes:' ( (lv_dynamicAttributes_19_0= ruleAttribute ) )* otherlv_20= 'states:' ( (lv_states_21_0= ruleState ) )* ( (lv_preferences_22_0= rulePreferences ) ) otherlv_23= 'additionalFiles:' ( (lv_additionalFiles_24_0= ruleAdditionalFile ) )* otherlv_25= 'overlodedPollPeriodObject:' ( (lv_overlodedPollPeriodObject_26_0= ruleOverlodedPollPeriodObject ) )* otherlv_27= '}' ) ;
    public final EObject rulePogoDeviceClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_isAbstract_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_pogoRevision_6_0=null;
        Token lv_institute_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        EObject lv_description_9_0 = null;

        EObject lv_classProperties_11_0 = null;

        EObject lv_deviceProperties_13_0 = null;

        EObject lv_commands_15_0 = null;

        EObject lv_attributes_17_0 = null;

        EObject lv_dynamicAttributes_19_0 = null;

        EObject lv_states_21_0 = null;

        EObject lv_preferences_22_0 = null;

        EObject lv_additionalFiles_24_0 = null;

        EObject lv_overlodedPollPeriodObject_26_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:555:28: ( (otherlv_0= 'deviceclass' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isAbstract_2_0= 'abstract' ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_pogoRevision_6_0= RULE_ID ) ) ( (lv_institute_7_0= RULE_ID ) ) otherlv_8= 'description:' ( (lv_description_9_0= ruleClassDescription ) ) otherlv_10= 'classProperties:' ( (lv_classProperties_11_0= ruleProperty ) )* otherlv_12= 'deviceProperties:' ( (lv_deviceProperties_13_0= ruleProperty ) )* otherlv_14= 'commands:' ( (lv_commands_15_0= ruleCommand ) )* otherlv_16= 'attributes:' ( (lv_attributes_17_0= ruleAttribute ) )* otherlv_18= 'dynamicAttributes:' ( (lv_dynamicAttributes_19_0= ruleAttribute ) )* otherlv_20= 'states:' ( (lv_states_21_0= ruleState ) )* ( (lv_preferences_22_0= rulePreferences ) ) otherlv_23= 'additionalFiles:' ( (lv_additionalFiles_24_0= ruleAdditionalFile ) )* otherlv_25= 'overlodedPollPeriodObject:' ( (lv_overlodedPollPeriodObject_26_0= ruleOverlodedPollPeriodObject ) )* otherlv_27= '}' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:556:1: (otherlv_0= 'deviceclass' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isAbstract_2_0= 'abstract' ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_pogoRevision_6_0= RULE_ID ) ) ( (lv_institute_7_0= RULE_ID ) ) otherlv_8= 'description:' ( (lv_description_9_0= ruleClassDescription ) ) otherlv_10= 'classProperties:' ( (lv_classProperties_11_0= ruleProperty ) )* otherlv_12= 'deviceProperties:' ( (lv_deviceProperties_13_0= ruleProperty ) )* otherlv_14= 'commands:' ( (lv_commands_15_0= ruleCommand ) )* otherlv_16= 'attributes:' ( (lv_attributes_17_0= ruleAttribute ) )* otherlv_18= 'dynamicAttributes:' ( (lv_dynamicAttributes_19_0= ruleAttribute ) )* otherlv_20= 'states:' ( (lv_states_21_0= ruleState ) )* ( (lv_preferences_22_0= rulePreferences ) ) otherlv_23= 'additionalFiles:' ( (lv_additionalFiles_24_0= ruleAdditionalFile ) )* otherlv_25= 'overlodedPollPeriodObject:' ( (lv_overlodedPollPeriodObject_26_0= ruleOverlodedPollPeriodObject ) )* otherlv_27= '}' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:556:1: (otherlv_0= 'deviceclass' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isAbstract_2_0= 'abstract' ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_pogoRevision_6_0= RULE_ID ) ) ( (lv_institute_7_0= RULE_ID ) ) otherlv_8= 'description:' ( (lv_description_9_0= ruleClassDescription ) ) otherlv_10= 'classProperties:' ( (lv_classProperties_11_0= ruleProperty ) )* otherlv_12= 'deviceProperties:' ( (lv_deviceProperties_13_0= ruleProperty ) )* otherlv_14= 'commands:' ( (lv_commands_15_0= ruleCommand ) )* otherlv_16= 'attributes:' ( (lv_attributes_17_0= ruleAttribute ) )* otherlv_18= 'dynamicAttributes:' ( (lv_dynamicAttributes_19_0= ruleAttribute ) )* otherlv_20= 'states:' ( (lv_states_21_0= ruleState ) )* ( (lv_preferences_22_0= rulePreferences ) ) otherlv_23= 'additionalFiles:' ( (lv_additionalFiles_24_0= ruleAdditionalFile ) )* otherlv_25= 'overlodedPollPeriodObject:' ( (lv_overlodedPollPeriodObject_26_0= ruleOverlodedPollPeriodObject ) )* otherlv_27= '}' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:556:3: otherlv_0= 'deviceclass' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isAbstract_2_0= 'abstract' ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_pogoRevision_6_0= RULE_ID ) ) ( (lv_institute_7_0= RULE_ID ) ) otherlv_8= 'description:' ( (lv_description_9_0= ruleClassDescription ) ) otherlv_10= 'classProperties:' ( (lv_classProperties_11_0= ruleProperty ) )* otherlv_12= 'deviceProperties:' ( (lv_deviceProperties_13_0= ruleProperty ) )* otherlv_14= 'commands:' ( (lv_commands_15_0= ruleCommand ) )* otherlv_16= 'attributes:' ( (lv_attributes_17_0= ruleAttribute ) )* otherlv_18= 'dynamicAttributes:' ( (lv_dynamicAttributes_19_0= ruleAttribute ) )* otherlv_20= 'states:' ( (lv_states_21_0= ruleState ) )* ( (lv_preferences_22_0= rulePreferences ) ) otherlv_23= 'additionalFiles:' ( (lv_additionalFiles_24_0= ruleAdditionalFile ) )* otherlv_25= 'overlodedPollPeriodObject:' ( (lv_overlodedPollPeriodObject_26_0= ruleOverlodedPollPeriodObject ) )* otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_rulePogoDeviceClass937); 

                	newLeafNode(otherlv_0, grammarAccess.getPogoDeviceClassAccess().getDeviceclassKeyword_0());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:560:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:561:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:561:1: (lv_name_1_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:562:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePogoDeviceClass954); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPogoDeviceClassAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPogoDeviceClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:578:2: ( (lv_isAbstract_2_0= 'abstract' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:579:1: (lv_isAbstract_2_0= 'abstract' )
                    {
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:579:1: (lv_isAbstract_2_0= 'abstract' )
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:580:3: lv_isAbstract_2_0= 'abstract'
                    {
                    lv_isAbstract_2_0=(Token)match(input,20,FOLLOW_20_in_rulePogoDeviceClass977); 

                            newLeafNode(lv_isAbstract_2_0, grammarAccess.getPogoDeviceClassAccess().getIsAbstractAbstractKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPogoDeviceClassRule());
                    	        }
                           		setWithLastConsumed(current, "isAbstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:593:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:593:5: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_rulePogoDeviceClass1004); 

                        	newLeafNode(otherlv_3, grammarAccess.getPogoDeviceClassAccess().getExtendsKeyword_3_0());
                        
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:597:1: ( (otherlv_4= RULE_ID ) )
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:598:1: (otherlv_4= RULE_ID )
                    {
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:598:1: (otherlv_4= RULE_ID )
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:599:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPogoDeviceClassRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePogoDeviceClass1024); 

                    		newLeafNode(otherlv_4, grammarAccess.getPogoDeviceClassAccess().getBaseClassPogoDeviceClassCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_rulePogoDeviceClass1038); 

                	newLeafNode(otherlv_5, grammarAccess.getPogoDeviceClassAccess().getLeftCurlyBracketKeyword_4());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:614:1: ( (lv_pogoRevision_6_0= RULE_ID ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:615:1: (lv_pogoRevision_6_0= RULE_ID )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:615:1: (lv_pogoRevision_6_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:616:3: lv_pogoRevision_6_0= RULE_ID
            {
            lv_pogoRevision_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePogoDeviceClass1055); 

            			newLeafNode(lv_pogoRevision_6_0, grammarAccess.getPogoDeviceClassAccess().getPogoRevisionIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPogoDeviceClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"pogoRevision",
                    		lv_pogoRevision_6_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:632:2: ( (lv_institute_7_0= RULE_ID ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:633:1: (lv_institute_7_0= RULE_ID )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:633:1: (lv_institute_7_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:634:3: lv_institute_7_0= RULE_ID
            {
            lv_institute_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePogoDeviceClass1077); 

            			newLeafNode(lv_institute_7_0, grammarAccess.getPogoDeviceClassAccess().getInstituteIDTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPogoDeviceClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"institute",
                    		lv_institute_7_0, 
                    		"ID");
            	    

            }


            }

            otherlv_8=(Token)match(input,22,FOLLOW_22_in_rulePogoDeviceClass1094); 

                	newLeafNode(otherlv_8, grammarAccess.getPogoDeviceClassAccess().getDescriptionKeyword_7());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:654:1: ( (lv_description_9_0= ruleClassDescription ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:655:1: (lv_description_9_0= ruleClassDescription )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:655:1: (lv_description_9_0= ruleClassDescription )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:656:3: lv_description_9_0= ruleClassDescription
            {
             
            	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getDescriptionClassDescriptionParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleClassDescription_in_rulePogoDeviceClass1115);
            lv_description_9_0=ruleClassDescription();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	        }
                   		set(
                   			current, 
                   			"description",
                    		lv_description_9_0, 
                    		"ClassDescription");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,23,FOLLOW_23_in_rulePogoDeviceClass1127); 

                	newLeafNode(otherlv_10, grammarAccess.getPogoDeviceClassAccess().getClassPropertiesKeyword_9());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:676:1: ( (lv_classProperties_11_0= ruleProperty ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:677:1: (lv_classProperties_11_0= ruleProperty )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:677:1: (lv_classProperties_11_0= ruleProperty )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:678:3: lv_classProperties_11_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getClassPropertiesPropertyParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_rulePogoDeviceClass1148);
            	    lv_classProperties_11_0=ruleProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"classProperties",
            	            		lv_classProperties_11_0, 
            	            		"Property");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_12=(Token)match(input,24,FOLLOW_24_in_rulePogoDeviceClass1161); 

                	newLeafNode(otherlv_12, grammarAccess.getPogoDeviceClassAccess().getDevicePropertiesKeyword_11());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:698:1: ( (lv_deviceProperties_13_0= ruleProperty ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:699:1: (lv_deviceProperties_13_0= ruleProperty )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:699:1: (lv_deviceProperties_13_0= ruleProperty )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:700:3: lv_deviceProperties_13_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getDevicePropertiesPropertyParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_rulePogoDeviceClass1182);
            	    lv_deviceProperties_13_0=ruleProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"deviceProperties",
            	            		lv_deviceProperties_13_0, 
            	            		"Property");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_14=(Token)match(input,25,FOLLOW_25_in_rulePogoDeviceClass1195); 

                	newLeafNode(otherlv_14, grammarAccess.getPogoDeviceClassAccess().getCommandsKeyword_13());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:720:1: ( (lv_commands_15_0= ruleCommand ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:721:1: (lv_commands_15_0= ruleCommand )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:721:1: (lv_commands_15_0= ruleCommand )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:722:3: lv_commands_15_0= ruleCommand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getCommandsCommandParserRuleCall_14_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommand_in_rulePogoDeviceClass1216);
            	    lv_commands_15_0=ruleCommand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"commands",
            	            		lv_commands_15_0, 
            	            		"Command");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_16=(Token)match(input,26,FOLLOW_26_in_rulePogoDeviceClass1229); 

                	newLeafNode(otherlv_16, grammarAccess.getPogoDeviceClassAccess().getAttributesKeyword_15());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:742:1: ( (lv_attributes_17_0= ruleAttribute ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:743:1: (lv_attributes_17_0= ruleAttribute )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:743:1: (lv_attributes_17_0= ruleAttribute )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:744:3: lv_attributes_17_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getAttributesAttributeParserRuleCall_16_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_rulePogoDeviceClass1250);
            	    lv_attributes_17_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_17_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_18=(Token)match(input,27,FOLLOW_27_in_rulePogoDeviceClass1263); 

                	newLeafNode(otherlv_18, grammarAccess.getPogoDeviceClassAccess().getDynamicAttributesKeyword_17());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:764:1: ( (lv_dynamicAttributes_19_0= ruleAttribute ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:765:1: (lv_dynamicAttributes_19_0= ruleAttribute )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:765:1: (lv_dynamicAttributes_19_0= ruleAttribute )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:766:3: lv_dynamicAttributes_19_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getDynamicAttributesAttributeParserRuleCall_18_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_rulePogoDeviceClass1284);
            	    lv_dynamicAttributes_19_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dynamicAttributes",
            	            		lv_dynamicAttributes_19_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_20=(Token)match(input,28,FOLLOW_28_in_rulePogoDeviceClass1297); 

                	newLeafNode(otherlv_20, grammarAccess.getPogoDeviceClassAccess().getStatesKeyword_19());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:786:1: ( (lv_states_21_0= ruleState ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:787:1: (lv_states_21_0= ruleState )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:787:1: (lv_states_21_0= ruleState )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:788:3: lv_states_21_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getStatesStateParserRuleCall_20_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_rulePogoDeviceClass1318);
            	    lv_states_21_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_21_0, 
            	            		"State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:804:3: ( (lv_preferences_22_0= rulePreferences ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:805:1: (lv_preferences_22_0= rulePreferences )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:805:1: (lv_preferences_22_0= rulePreferences )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:806:3: lv_preferences_22_0= rulePreferences
            {
             
            	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getPreferencesPreferencesParserRuleCall_21_0()); 
            	    
            pushFollow(FOLLOW_rulePreferences_in_rulePogoDeviceClass1340);
            lv_preferences_22_0=rulePreferences();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	        }
                   		set(
                   			current, 
                   			"preferences",
                    		lv_preferences_22_0, 
                    		"Preferences");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_23=(Token)match(input,18,FOLLOW_18_in_rulePogoDeviceClass1352); 

                	newLeafNode(otherlv_23, grammarAccess.getPogoDeviceClassAccess().getAdditionalFilesKeyword_22());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:826:1: ( (lv_additionalFiles_24_0= ruleAdditionalFile ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:827:1: (lv_additionalFiles_24_0= ruleAdditionalFile )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:827:1: (lv_additionalFiles_24_0= ruleAdditionalFile )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:828:3: lv_additionalFiles_24_0= ruleAdditionalFile
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getAdditionalFilesAdditionalFileParserRuleCall_23_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAdditionalFile_in_rulePogoDeviceClass1373);
            	    lv_additionalFiles_24_0=ruleAdditionalFile();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"additionalFiles",
            	            		lv_additionalFiles_24_0, 
            	            		"AdditionalFile");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_25=(Token)match(input,29,FOLLOW_29_in_rulePogoDeviceClass1386); 

                	newLeafNode(otherlv_25, grammarAccess.getPogoDeviceClassAccess().getOverlodedPollPeriodObjectKeyword_24());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:848:1: ( (lv_overlodedPollPeriodObject_26_0= ruleOverlodedPollPeriodObject ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_STRING) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:849:1: (lv_overlodedPollPeriodObject_26_0= ruleOverlodedPollPeriodObject )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:849:1: (lv_overlodedPollPeriodObject_26_0= ruleOverlodedPollPeriodObject )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:850:3: lv_overlodedPollPeriodObject_26_0= ruleOverlodedPollPeriodObject
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getOverlodedPollPeriodObjectOverlodedPollPeriodObjectParserRuleCall_25_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOverlodedPollPeriodObject_in_rulePogoDeviceClass1407);
            	    lv_overlodedPollPeriodObject_26_0=ruleOverlodedPollPeriodObject();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"overlodedPollPeriodObject",
            	            		lv_overlodedPollPeriodObject_26_0, 
            	            		"OverlodedPollPeriodObject");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_27=(Token)match(input,15,FOLLOW_15_in_rulePogoDeviceClass1420); 

                	newLeafNode(otherlv_27, grammarAccess.getPogoDeviceClassAccess().getRightCurlyBracketKeyword_26());
                

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
    // $ANTLR end "rulePogoDeviceClass"


    // $ANTLR start "entryRuleLanguage"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:878:1: entryRuleLanguage returns [String current=null] : iv_ruleLanguage= ruleLanguage EOF ;
    public final String entryRuleLanguage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLanguage = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:879:2: (iv_ruleLanguage= ruleLanguage EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:880:2: iv_ruleLanguage= ruleLanguage EOF
            {
             newCompositeNode(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_ruleLanguage_in_entryRuleLanguage1457);
            iv_ruleLanguage=ruleLanguage();

            state._fsp--;

             current =iv_ruleLanguage.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLanguage1468); 

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
    // $ANTLR end "entryRuleLanguage"


    // $ANTLR start "ruleLanguage"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:887:1: ruleLanguage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Cpp' | kw= 'Java' | kw= 'Python' ) ;
    public final AntlrDatatypeRuleToken ruleLanguage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:890:28: ( (kw= 'Cpp' | kw= 'Java' | kw= 'Python' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:891:1: (kw= 'Cpp' | kw= 'Java' | kw= 'Python' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:891:1: (kw= 'Cpp' | kw= 'Java' | kw= 'Python' )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt15=1;
                }
                break;
            case 31:
                {
                alt15=2;
                }
                break;
            case 32:
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
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:892:2: kw= 'Cpp'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleLanguage1506); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLanguageAccess().getCppKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:899:2: kw= 'Java'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleLanguage1525); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLanguageAccess().getJavaKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:906:2: kw= 'Python'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleLanguage1544); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLanguageAccess().getPythonKeyword_2()); 
                        

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
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "entryRuleDisplayLevel"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:919:1: entryRuleDisplayLevel returns [String current=null] : iv_ruleDisplayLevel= ruleDisplayLevel EOF ;
    public final String entryRuleDisplayLevel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDisplayLevel = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:920:2: (iv_ruleDisplayLevel= ruleDisplayLevel EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:921:2: iv_ruleDisplayLevel= ruleDisplayLevel EOF
            {
             newCompositeNode(grammarAccess.getDisplayLevelRule()); 
            pushFollow(FOLLOW_ruleDisplayLevel_in_entryRuleDisplayLevel1585);
            iv_ruleDisplayLevel=ruleDisplayLevel();

            state._fsp--;

             current =iv_ruleDisplayLevel.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisplayLevel1596); 

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
    // $ANTLR end "entryRuleDisplayLevel"


    // $ANTLR start "ruleDisplayLevel"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:928:1: ruleDisplayLevel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'OPERATOR' | kw= 'EXPERT' ) ;
    public final AntlrDatatypeRuleToken ruleDisplayLevel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:931:28: ( (kw= 'OPERATOR' | kw= 'EXPERT' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:932:1: (kw= 'OPERATOR' | kw= 'EXPERT' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:932:1: (kw= 'OPERATOR' | kw= 'EXPERT' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            else if ( (LA16_0==34) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:933:2: kw= 'OPERATOR'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleDisplayLevel1634); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDisplayLevelAccess().getOPERATORKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:940:2: kw= 'EXPERT'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleDisplayLevel1653); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDisplayLevelAccess().getEXPERTKeyword_1()); 
                        

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
    // $ANTLR end "ruleDisplayLevel"


    // $ANTLR start "entryRuleAttrType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:953:1: entryRuleAttrType returns [String current=null] : iv_ruleAttrType= ruleAttrType EOF ;
    public final String entryRuleAttrType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttrType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:954:2: (iv_ruleAttrType= ruleAttrType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:955:2: iv_ruleAttrType= ruleAttrType EOF
            {
             newCompositeNode(grammarAccess.getAttrTypeRule()); 
            pushFollow(FOLLOW_ruleAttrType_in_entryRuleAttrType1694);
            iv_ruleAttrType=ruleAttrType();

            state._fsp--;

             current =iv_ruleAttrType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrType1705); 

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
    // $ANTLR end "entryRuleAttrType"


    // $ANTLR start "ruleAttrType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:962:1: ruleAttrType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Scalar' | kw= 'Spectrum' | kw= 'Image' ) ;
    public final AntlrDatatypeRuleToken ruleAttrType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:965:28: ( (kw= 'Scalar' | kw= 'Spectrum' | kw= 'Image' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:966:1: (kw= 'Scalar' | kw= 'Spectrum' | kw= 'Image' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:966:1: (kw= 'Scalar' | kw= 'Spectrum' | kw= 'Image' )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt17=1;
                }
                break;
            case 36:
                {
                alt17=2;
                }
                break;
            case 37:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:967:2: kw= 'Scalar'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleAttrType1743); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAttrTypeAccess().getScalarKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:974:2: kw= 'Spectrum'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleAttrType1762); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAttrTypeAccess().getSpectrumKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:981:2: kw= 'Image'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleAttrType1781); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAttrTypeAccess().getImageKeyword_2()); 
                        

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
    // $ANTLR end "ruleAttrType"


    // $ANTLR start "entryRuleRW_Type"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:994:1: entryRuleRW_Type returns [String current=null] : iv_ruleRW_Type= ruleRW_Type EOF ;
    public final String entryRuleRW_Type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRW_Type = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:995:2: (iv_ruleRW_Type= ruleRW_Type EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:996:2: iv_ruleRW_Type= ruleRW_Type EOF
            {
             newCompositeNode(grammarAccess.getRW_TypeRule()); 
            pushFollow(FOLLOW_ruleRW_Type_in_entryRuleRW_Type1822);
            iv_ruleRW_Type=ruleRW_Type();

            state._fsp--;

             current =iv_ruleRW_Type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRW_Type1833); 

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
    // $ANTLR end "entryRuleRW_Type"


    // $ANTLR start "ruleRW_Type"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1003:1: ruleRW_Type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'READ' | kw= 'WRITE' | kw= 'READ_WRITE' | kw= 'READ_WITH_WRITE' ) ;
    public final AntlrDatatypeRuleToken ruleRW_Type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1006:28: ( (kw= 'READ' | kw= 'WRITE' | kw= 'READ_WRITE' | kw= 'READ_WITH_WRITE' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1007:1: (kw= 'READ' | kw= 'WRITE' | kw= 'READ_WRITE' | kw= 'READ_WITH_WRITE' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1007:1: (kw= 'READ' | kw= 'WRITE' | kw= 'READ_WRITE' | kw= 'READ_WITH_WRITE' )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt18=1;
                }
                break;
            case 39:
                {
                alt18=2;
                }
                break;
            case 40:
                {
                alt18=3;
                }
                break;
            case 41:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1008:2: kw= 'READ'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleRW_Type1871); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRW_TypeAccess().getREADKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1015:2: kw= 'WRITE'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleRW_Type1890); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRW_TypeAccess().getWRITEKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1022:2: kw= 'READ_WRITE'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleRW_Type1909); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRW_TypeAccess().getREAD_WRITEKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1029:2: kw= 'READ_WITH_WRITE'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleRW_Type1928); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRW_TypeAccess().getREAD_WITH_WRITEKeyword_3()); 
                        

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
    // $ANTLR end "ruleRW_Type"


    // $ANTLR start "entryRuleBoolean"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1042:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1043:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1044:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean1969);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean1980); 

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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1051:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1054:28: ( (kw= 'true' | kw= 'false' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1055:1: (kw= 'true' | kw= 'false' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1055:1: (kw= 'true' | kw= 'false' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==42) ) {
                alt19=1;
            }
            else if ( (LA19_0==43) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1056:2: kw= 'true'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleBoolean2018); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1063:2: kw= 'false'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleBoolean2037); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                        

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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleClassDescription"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1076:1: entryRuleClassDescription returns [EObject current=null] : iv_ruleClassDescription= ruleClassDescription EOF ;
    public final EObject entryRuleClassDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDescription = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1077:2: (iv_ruleClassDescription= ruleClassDescription EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1078:2: iv_ruleClassDescription= ruleClassDescription EOF
            {
             newCompositeNode(grammarAccess.getClassDescriptionRule()); 
            pushFollow(FOLLOW_ruleClassDescription_in_entryRuleClassDescription2077);
            iv_ruleClassDescription=ruleClassDescription();

            state._fsp--;

             current =iv_ruleClassDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassDescription2087); 

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
    // $ANTLR end "entryRuleClassDescription"


    // $ANTLR start "ruleClassDescription"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1085:1: ruleClassDescription returns [EObject current=null] : ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_title_1_0= RULE_STRING ) ) ( (lv_sourcePath_2_0= RULE_STRING ) ) otherlv_3= 'inheritances:' ( (lv_inheritances_4_0= ruleInheritance ) ) ( (lv_language_5_0= ruleLanguage ) ) ( (lv_filestogenerate_6_0= RULE_STRING ) ) ( (lv_identification_7_0= ruleClassIdentification ) ) ( (lv_comments_8_0= ruleComments ) ) ( (lv_license_9_0= RULE_STRING ) ) ( (lv_hasMandatoryProperty_10_0= ruleBoolean ) ) ( (lv_hasConcreteProperty_11_0= ruleBoolean ) ) ( (lv_hasAbstractCommand_12_0= ruleBoolean ) ) ( (lv_hasAbstractAttribute_13_0= ruleBoolean ) ) ( (lv_descriptionHtmlExists_14_0= ruleBoolean ) ) ) ;
    public final EObject ruleClassDescription() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token lv_title_1_0=null;
        Token lv_sourcePath_2_0=null;
        Token otherlv_3=null;
        Token lv_filestogenerate_6_0=null;
        Token lv_license_9_0=null;
        EObject lv_inheritances_4_0 = null;

        AntlrDatatypeRuleToken lv_language_5_0 = null;

        EObject lv_identification_7_0 = null;

        EObject lv_comments_8_0 = null;

        AntlrDatatypeRuleToken lv_hasMandatoryProperty_10_0 = null;

        AntlrDatatypeRuleToken lv_hasConcreteProperty_11_0 = null;

        AntlrDatatypeRuleToken lv_hasAbstractCommand_12_0 = null;

        AntlrDatatypeRuleToken lv_hasAbstractAttribute_13_0 = null;

        AntlrDatatypeRuleToken lv_descriptionHtmlExists_14_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1088:28: ( ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_title_1_0= RULE_STRING ) ) ( (lv_sourcePath_2_0= RULE_STRING ) ) otherlv_3= 'inheritances:' ( (lv_inheritances_4_0= ruleInheritance ) ) ( (lv_language_5_0= ruleLanguage ) ) ( (lv_filestogenerate_6_0= RULE_STRING ) ) ( (lv_identification_7_0= ruleClassIdentification ) ) ( (lv_comments_8_0= ruleComments ) ) ( (lv_license_9_0= RULE_STRING ) ) ( (lv_hasMandatoryProperty_10_0= ruleBoolean ) ) ( (lv_hasConcreteProperty_11_0= ruleBoolean ) ) ( (lv_hasAbstractCommand_12_0= ruleBoolean ) ) ( (lv_hasAbstractAttribute_13_0= ruleBoolean ) ) ( (lv_descriptionHtmlExists_14_0= ruleBoolean ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1089:1: ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_title_1_0= RULE_STRING ) ) ( (lv_sourcePath_2_0= RULE_STRING ) ) otherlv_3= 'inheritances:' ( (lv_inheritances_4_0= ruleInheritance ) ) ( (lv_language_5_0= ruleLanguage ) ) ( (lv_filestogenerate_6_0= RULE_STRING ) ) ( (lv_identification_7_0= ruleClassIdentification ) ) ( (lv_comments_8_0= ruleComments ) ) ( (lv_license_9_0= RULE_STRING ) ) ( (lv_hasMandatoryProperty_10_0= ruleBoolean ) ) ( (lv_hasConcreteProperty_11_0= ruleBoolean ) ) ( (lv_hasAbstractCommand_12_0= ruleBoolean ) ) ( (lv_hasAbstractAttribute_13_0= ruleBoolean ) ) ( (lv_descriptionHtmlExists_14_0= ruleBoolean ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1089:1: ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_title_1_0= RULE_STRING ) ) ( (lv_sourcePath_2_0= RULE_STRING ) ) otherlv_3= 'inheritances:' ( (lv_inheritances_4_0= ruleInheritance ) ) ( (lv_language_5_0= ruleLanguage ) ) ( (lv_filestogenerate_6_0= RULE_STRING ) ) ( (lv_identification_7_0= ruleClassIdentification ) ) ( (lv_comments_8_0= ruleComments ) ) ( (lv_license_9_0= RULE_STRING ) ) ( (lv_hasMandatoryProperty_10_0= ruleBoolean ) ) ( (lv_hasConcreteProperty_11_0= ruleBoolean ) ) ( (lv_hasAbstractCommand_12_0= ruleBoolean ) ) ( (lv_hasAbstractAttribute_13_0= ruleBoolean ) ) ( (lv_descriptionHtmlExists_14_0= ruleBoolean ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1089:2: ( (lv_description_0_0= RULE_STRING ) ) ( (lv_title_1_0= RULE_STRING ) ) ( (lv_sourcePath_2_0= RULE_STRING ) ) otherlv_3= 'inheritances:' ( (lv_inheritances_4_0= ruleInheritance ) ) ( (lv_language_5_0= ruleLanguage ) ) ( (lv_filestogenerate_6_0= RULE_STRING ) ) ( (lv_identification_7_0= ruleClassIdentification ) ) ( (lv_comments_8_0= ruleComments ) ) ( (lv_license_9_0= RULE_STRING ) ) ( (lv_hasMandatoryProperty_10_0= ruleBoolean ) ) ( (lv_hasConcreteProperty_11_0= ruleBoolean ) ) ( (lv_hasAbstractCommand_12_0= ruleBoolean ) ) ( (lv_hasAbstractAttribute_13_0= ruleBoolean ) ) ( (lv_descriptionHtmlExists_14_0= ruleBoolean ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1089:2: ( (lv_description_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1090:1: (lv_description_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1090:1: (lv_description_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1091:3: lv_description_0_0= RULE_STRING
            {
            lv_description_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassDescription2129); 

            			newLeafNode(lv_description_0_0, grammarAccess.getClassDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassDescriptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_0_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1107:2: ( (lv_title_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1108:1: (lv_title_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1108:1: (lv_title_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1109:3: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassDescription2151); 

            			newLeafNode(lv_title_1_0, grammarAccess.getClassDescriptionAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassDescriptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1125:2: ( (lv_sourcePath_2_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1126:1: (lv_sourcePath_2_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1126:1: (lv_sourcePath_2_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1127:3: lv_sourcePath_2_0= RULE_STRING
            {
            lv_sourcePath_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassDescription2173); 

            			newLeafNode(lv_sourcePath_2_0, grammarAccess.getClassDescriptionAccess().getSourcePathSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassDescriptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"sourcePath",
                    		lv_sourcePath_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleClassDescription2190); 

                	newLeafNode(otherlv_3, grammarAccess.getClassDescriptionAccess().getInheritancesKeyword_3());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1147:1: ( (lv_inheritances_4_0= ruleInheritance ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1148:1: (lv_inheritances_4_0= ruleInheritance )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1148:1: (lv_inheritances_4_0= ruleInheritance )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1149:3: lv_inheritances_4_0= ruleInheritance
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getInheritancesInheritanceParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleInheritance_in_ruleClassDescription2211);
            lv_inheritances_4_0=ruleInheritance();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassDescriptionRule());
            	        }
                   		add(
                   			current, 
                   			"inheritances",
                    		lv_inheritances_4_0, 
                    		"Inheritance");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1165:2: ( (lv_language_5_0= ruleLanguage ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1166:1: (lv_language_5_0= ruleLanguage )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1166:1: (lv_language_5_0= ruleLanguage )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1167:3: lv_language_5_0= ruleLanguage
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getLanguageLanguageParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleLanguage_in_ruleClassDescription2232);
            lv_language_5_0=ruleLanguage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassDescriptionRule());
            	        }
                   		set(
                   			current, 
                   			"language",
                    		lv_language_5_0, 
                    		"Language");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1183:2: ( (lv_filestogenerate_6_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1184:1: (lv_filestogenerate_6_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1184:1: (lv_filestogenerate_6_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1185:3: lv_filestogenerate_6_0= RULE_STRING
            {
            lv_filestogenerate_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassDescription2249); 

            			newLeafNode(lv_filestogenerate_6_0, grammarAccess.getClassDescriptionAccess().getFilestogenerateSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassDescriptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"filestogenerate",
                    		lv_filestogenerate_6_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1201:2: ( (lv_identification_7_0= ruleClassIdentification ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1202:1: (lv_identification_7_0= ruleClassIdentification )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1202:1: (lv_identification_7_0= ruleClassIdentification )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1203:3: lv_identification_7_0= ruleClassIdentification
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getIdentificationClassIdentificationParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleClassIdentification_in_ruleClassDescription2275);
            lv_identification_7_0=ruleClassIdentification();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassDescriptionRule());
            	        }
                   		set(
                   			current, 
                   			"identification",
                    		lv_identification_7_0, 
                    		"ClassIdentification");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1219:2: ( (lv_comments_8_0= ruleComments ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1220:1: (lv_comments_8_0= ruleComments )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1220:1: (lv_comments_8_0= ruleComments )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1221:3: lv_comments_8_0= ruleComments
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getCommentsCommentsParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleComments_in_ruleClassDescription2296);
            lv_comments_8_0=ruleComments();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassDescriptionRule());
            	        }
                   		set(
                   			current, 
                   			"comments",
                    		lv_comments_8_0, 
                    		"Comments");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1237:2: ( (lv_license_9_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1238:1: (lv_license_9_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1238:1: (lv_license_9_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1239:3: lv_license_9_0= RULE_STRING
            {
            lv_license_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassDescription2313); 

            			newLeafNode(lv_license_9_0, grammarAccess.getClassDescriptionAccess().getLicenseSTRINGTerminalRuleCall_9_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassDescriptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"license",
                    		lv_license_9_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1255:2: ( (lv_hasMandatoryProperty_10_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1256:1: (lv_hasMandatoryProperty_10_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1256:1: (lv_hasMandatoryProperty_10_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1257:3: lv_hasMandatoryProperty_10_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getHasMandatoryPropertyBooleanParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleClassDescription2339);
            lv_hasMandatoryProperty_10_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassDescriptionRule());
            	        }
                   		set(
                   			current, 
                   			"hasMandatoryProperty",
                    		lv_hasMandatoryProperty_10_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1273:2: ( (lv_hasConcreteProperty_11_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1274:1: (lv_hasConcreteProperty_11_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1274:1: (lv_hasConcreteProperty_11_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1275:3: lv_hasConcreteProperty_11_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getHasConcretePropertyBooleanParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleClassDescription2360);
            lv_hasConcreteProperty_11_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassDescriptionRule());
            	        }
                   		set(
                   			current, 
                   			"hasConcreteProperty",
                    		lv_hasConcreteProperty_11_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1291:2: ( (lv_hasAbstractCommand_12_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1292:1: (lv_hasAbstractCommand_12_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1292:1: (lv_hasAbstractCommand_12_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1293:3: lv_hasAbstractCommand_12_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getHasAbstractCommandBooleanParserRuleCall_12_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleClassDescription2381);
            lv_hasAbstractCommand_12_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassDescriptionRule());
            	        }
                   		set(
                   			current, 
                   			"hasAbstractCommand",
                    		lv_hasAbstractCommand_12_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1309:2: ( (lv_hasAbstractAttribute_13_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1310:1: (lv_hasAbstractAttribute_13_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1310:1: (lv_hasAbstractAttribute_13_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1311:3: lv_hasAbstractAttribute_13_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getHasAbstractAttributeBooleanParserRuleCall_13_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleClassDescription2402);
            lv_hasAbstractAttribute_13_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassDescriptionRule());
            	        }
                   		set(
                   			current, 
                   			"hasAbstractAttribute",
                    		lv_hasAbstractAttribute_13_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1327:2: ( (lv_descriptionHtmlExists_14_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1328:1: (lv_descriptionHtmlExists_14_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1328:1: (lv_descriptionHtmlExists_14_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1329:3: lv_descriptionHtmlExists_14_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getDescriptionHtmlExistsBooleanParserRuleCall_14_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleClassDescription2423);
            lv_descriptionHtmlExists_14_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassDescriptionRule());
            	        }
                   		set(
                   			current, 
                   			"descriptionHtmlExists",
                    		lv_descriptionHtmlExists_14_0, 
                    		"Boolean");
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
    // $ANTLR end "ruleClassDescription"


    // $ANTLR start "entryRuleInheritance"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1353:1: entryRuleInheritance returns [EObject current=null] : iv_ruleInheritance= ruleInheritance EOF ;
    public final EObject entryRuleInheritance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritance = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1354:2: (iv_ruleInheritance= ruleInheritance EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1355:2: iv_ruleInheritance= ruleInheritance EOF
            {
             newCompositeNode(grammarAccess.getInheritanceRule()); 
            pushFollow(FOLLOW_ruleInheritance_in_entryRuleInheritance2459);
            iv_ruleInheritance=ruleInheritance();

            state._fsp--;

             current =iv_ruleInheritance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInheritance2469); 

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
    // $ANTLR end "entryRuleInheritance"


    // $ANTLR start "ruleInheritance"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1362:1: ruleInheritance returns [EObject current=null] : ( ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInheritance() throws RecognitionException {
        EObject current = null;

        Token lv_classname_0_0=null;
        Token lv_sourcePath_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1365:28: ( ( ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1366:1: ( ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1366:1: ( ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1366:2: ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1366:2: ( (lv_classname_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1367:1: (lv_classname_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1367:1: (lv_classname_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1368:3: lv_classname_0_0= RULE_STRING
            {
            lv_classname_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInheritance2511); 

            			newLeafNode(lv_classname_0_0, grammarAccess.getInheritanceAccess().getClassnameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInheritanceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"classname",
                    		lv_classname_0_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1384:2: ( (lv_sourcePath_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1385:1: (lv_sourcePath_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1385:1: (lv_sourcePath_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1386:3: lv_sourcePath_1_0= RULE_STRING
            {
            lv_sourcePath_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInheritance2533); 

            			newLeafNode(lv_sourcePath_1_0, grammarAccess.getInheritanceAccess().getSourcePathSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInheritanceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"sourcePath",
                    		lv_sourcePath_1_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleInheritance"


    // $ANTLR start "entryRuleClassIdentification"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1410:1: entryRuleClassIdentification returns [EObject current=null] : iv_ruleClassIdentification= ruleClassIdentification EOF ;
    public final EObject entryRuleClassIdentification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassIdentification = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1411:2: (iv_ruleClassIdentification= ruleClassIdentification EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1412:2: iv_ruleClassIdentification= ruleClassIdentification EOF
            {
             newCompositeNode(grammarAccess.getClassIdentificationRule()); 
            pushFollow(FOLLOW_ruleClassIdentification_in_entryRuleClassIdentification2574);
            iv_ruleClassIdentification=ruleClassIdentification();

            state._fsp--;

             current =iv_ruleClassIdentification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassIdentification2584); 

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
    // $ANTLR end "entryRuleClassIdentification"


    // $ANTLR start "ruleClassIdentification"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1419:1: ruleClassIdentification returns [EObject current=null] : ( ( (lv_contact_0_0= RULE_STRING ) ) ( (lv_author_1_0= RULE_STRING ) ) ( (lv_emailDomain_2_0= RULE_STRING ) ) ( (lv_classFamily_3_0= RULE_STRING ) ) ( (lv_siteSpecific_4_0= RULE_STRING ) ) ( (lv_platform_5_0= RULE_STRING ) ) ( (lv_bus_6_0= RULE_STRING ) ) ( (lv_manufacturer_7_0= RULE_STRING ) ) ( (lv_reference_8_0= RULE_STRING ) ) ) ;
    public final EObject ruleClassIdentification() throws RecognitionException {
        EObject current = null;

        Token lv_contact_0_0=null;
        Token lv_author_1_0=null;
        Token lv_emailDomain_2_0=null;
        Token lv_classFamily_3_0=null;
        Token lv_siteSpecific_4_0=null;
        Token lv_platform_5_0=null;
        Token lv_bus_6_0=null;
        Token lv_manufacturer_7_0=null;
        Token lv_reference_8_0=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1422:28: ( ( ( (lv_contact_0_0= RULE_STRING ) ) ( (lv_author_1_0= RULE_STRING ) ) ( (lv_emailDomain_2_0= RULE_STRING ) ) ( (lv_classFamily_3_0= RULE_STRING ) ) ( (lv_siteSpecific_4_0= RULE_STRING ) ) ( (lv_platform_5_0= RULE_STRING ) ) ( (lv_bus_6_0= RULE_STRING ) ) ( (lv_manufacturer_7_0= RULE_STRING ) ) ( (lv_reference_8_0= RULE_STRING ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1423:1: ( ( (lv_contact_0_0= RULE_STRING ) ) ( (lv_author_1_0= RULE_STRING ) ) ( (lv_emailDomain_2_0= RULE_STRING ) ) ( (lv_classFamily_3_0= RULE_STRING ) ) ( (lv_siteSpecific_4_0= RULE_STRING ) ) ( (lv_platform_5_0= RULE_STRING ) ) ( (lv_bus_6_0= RULE_STRING ) ) ( (lv_manufacturer_7_0= RULE_STRING ) ) ( (lv_reference_8_0= RULE_STRING ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1423:1: ( ( (lv_contact_0_0= RULE_STRING ) ) ( (lv_author_1_0= RULE_STRING ) ) ( (lv_emailDomain_2_0= RULE_STRING ) ) ( (lv_classFamily_3_0= RULE_STRING ) ) ( (lv_siteSpecific_4_0= RULE_STRING ) ) ( (lv_platform_5_0= RULE_STRING ) ) ( (lv_bus_6_0= RULE_STRING ) ) ( (lv_manufacturer_7_0= RULE_STRING ) ) ( (lv_reference_8_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1423:2: ( (lv_contact_0_0= RULE_STRING ) ) ( (lv_author_1_0= RULE_STRING ) ) ( (lv_emailDomain_2_0= RULE_STRING ) ) ( (lv_classFamily_3_0= RULE_STRING ) ) ( (lv_siteSpecific_4_0= RULE_STRING ) ) ( (lv_platform_5_0= RULE_STRING ) ) ( (lv_bus_6_0= RULE_STRING ) ) ( (lv_manufacturer_7_0= RULE_STRING ) ) ( (lv_reference_8_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1423:2: ( (lv_contact_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1424:1: (lv_contact_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1424:1: (lv_contact_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1425:3: lv_contact_0_0= RULE_STRING
            {
            lv_contact_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2626); 

            			newLeafNode(lv_contact_0_0, grammarAccess.getClassIdentificationAccess().getContactSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassIdentificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"contact",
                    		lv_contact_0_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1441:2: ( (lv_author_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1442:1: (lv_author_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1442:1: (lv_author_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1443:3: lv_author_1_0= RULE_STRING
            {
            lv_author_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2648); 

            			newLeafNode(lv_author_1_0, grammarAccess.getClassIdentificationAccess().getAuthorSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassIdentificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"author",
                    		lv_author_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1459:2: ( (lv_emailDomain_2_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1460:1: (lv_emailDomain_2_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1460:1: (lv_emailDomain_2_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1461:3: lv_emailDomain_2_0= RULE_STRING
            {
            lv_emailDomain_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2670); 

            			newLeafNode(lv_emailDomain_2_0, grammarAccess.getClassIdentificationAccess().getEmailDomainSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassIdentificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"emailDomain",
                    		lv_emailDomain_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1477:2: ( (lv_classFamily_3_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1478:1: (lv_classFamily_3_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1478:1: (lv_classFamily_3_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1479:3: lv_classFamily_3_0= RULE_STRING
            {
            lv_classFamily_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2692); 

            			newLeafNode(lv_classFamily_3_0, grammarAccess.getClassIdentificationAccess().getClassFamilySTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassIdentificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"classFamily",
                    		lv_classFamily_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1495:2: ( (lv_siteSpecific_4_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1496:1: (lv_siteSpecific_4_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1496:1: (lv_siteSpecific_4_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1497:3: lv_siteSpecific_4_0= RULE_STRING
            {
            lv_siteSpecific_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2714); 

            			newLeafNode(lv_siteSpecific_4_0, grammarAccess.getClassIdentificationAccess().getSiteSpecificSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassIdentificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"siteSpecific",
                    		lv_siteSpecific_4_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1513:2: ( (lv_platform_5_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1514:1: (lv_platform_5_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1514:1: (lv_platform_5_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1515:3: lv_platform_5_0= RULE_STRING
            {
            lv_platform_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2736); 

            			newLeafNode(lv_platform_5_0, grammarAccess.getClassIdentificationAccess().getPlatformSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassIdentificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"platform",
                    		lv_platform_5_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1531:2: ( (lv_bus_6_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1532:1: (lv_bus_6_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1532:1: (lv_bus_6_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1533:3: lv_bus_6_0= RULE_STRING
            {
            lv_bus_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2758); 

            			newLeafNode(lv_bus_6_0, grammarAccess.getClassIdentificationAccess().getBusSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassIdentificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"bus",
                    		lv_bus_6_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1549:2: ( (lv_manufacturer_7_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1550:1: (lv_manufacturer_7_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1550:1: (lv_manufacturer_7_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1551:3: lv_manufacturer_7_0= RULE_STRING
            {
            lv_manufacturer_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2780); 

            			newLeafNode(lv_manufacturer_7_0, grammarAccess.getClassIdentificationAccess().getManufacturerSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassIdentificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"manufacturer",
                    		lv_manufacturer_7_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1567:2: ( (lv_reference_8_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1568:1: (lv_reference_8_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1568:1: (lv_reference_8_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1569:3: lv_reference_8_0= RULE_STRING
            {
            lv_reference_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2802); 

            			newLeafNode(lv_reference_8_0, grammarAccess.getClassIdentificationAccess().getReferenceSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassIdentificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"reference",
                    		lv_reference_8_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleClassIdentification"


    // $ANTLR start "entryRuleComments"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1593:1: entryRuleComments returns [EObject current=null] : iv_ruleComments= ruleComments EOF ;
    public final EObject entryRuleComments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComments = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1594:2: (iv_ruleComments= ruleComments EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1595:2: iv_ruleComments= ruleComments EOF
            {
             newCompositeNode(grammarAccess.getCommentsRule()); 
            pushFollow(FOLLOW_ruleComments_in_entryRuleComments2843);
            iv_ruleComments=ruleComments();

            state._fsp--;

             current =iv_ruleComments; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComments2853); 

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
    // $ANTLR end "entryRuleComments"


    // $ANTLR start "ruleComments"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1602:1: ruleComments returns [EObject current=null] : ( (lv_commandsTable_0_0= RULE_STRING ) ) ;
    public final EObject ruleComments() throws RecognitionException {
        EObject current = null;

        Token lv_commandsTable_0_0=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1605:28: ( ( (lv_commandsTable_0_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1606:1: ( (lv_commandsTable_0_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1606:1: ( (lv_commandsTable_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1607:1: (lv_commandsTable_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1607:1: (lv_commandsTable_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1608:3: lv_commandsTable_0_0= RULE_STRING
            {
            lv_commandsTable_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleComments2894); 

            			newLeafNode(lv_commandsTable_0_0, grammarAccess.getCommentsAccess().getCommandsTableSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommentsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"commandsTable",
                    		lv_commandsTable_0_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleComments"


    // $ANTLR start "entryRulePreferences"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1632:1: entryRulePreferences returns [EObject current=null] : iv_rulePreferences= rulePreferences EOF ;
    public final EObject entryRulePreferences() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreferences = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1633:2: (iv_rulePreferences= rulePreferences EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1634:2: iv_rulePreferences= rulePreferences EOF
            {
             newCompositeNode(grammarAccess.getPreferencesRule()); 
            pushFollow(FOLLOW_rulePreferences_in_entryRulePreferences2934);
            iv_rulePreferences=rulePreferences();

            state._fsp--;

             current =iv_rulePreferences; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePreferences2944); 

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
    // $ANTLR end "entryRulePreferences"


    // $ANTLR start "rulePreferences"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1641:1: rulePreferences returns [EObject current=null] : ( ( (lv_docHome_0_0= RULE_STRING ) ) ( (lv_makefileHome_1_0= RULE_STRING ) ) ( (lv_installHome_2_0= RULE_STRING ) ) ( (lv_htmlVersion_3_0= ruleBoolean ) ) ) ;
    public final EObject rulePreferences() throws RecognitionException {
        EObject current = null;

        Token lv_docHome_0_0=null;
        Token lv_makefileHome_1_0=null;
        Token lv_installHome_2_0=null;
        AntlrDatatypeRuleToken lv_htmlVersion_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1644:28: ( ( ( (lv_docHome_0_0= RULE_STRING ) ) ( (lv_makefileHome_1_0= RULE_STRING ) ) ( (lv_installHome_2_0= RULE_STRING ) ) ( (lv_htmlVersion_3_0= ruleBoolean ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1645:1: ( ( (lv_docHome_0_0= RULE_STRING ) ) ( (lv_makefileHome_1_0= RULE_STRING ) ) ( (lv_installHome_2_0= RULE_STRING ) ) ( (lv_htmlVersion_3_0= ruleBoolean ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1645:1: ( ( (lv_docHome_0_0= RULE_STRING ) ) ( (lv_makefileHome_1_0= RULE_STRING ) ) ( (lv_installHome_2_0= RULE_STRING ) ) ( (lv_htmlVersion_3_0= ruleBoolean ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1645:2: ( (lv_docHome_0_0= RULE_STRING ) ) ( (lv_makefileHome_1_0= RULE_STRING ) ) ( (lv_installHome_2_0= RULE_STRING ) ) ( (lv_htmlVersion_3_0= ruleBoolean ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1645:2: ( (lv_docHome_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1646:1: (lv_docHome_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1646:1: (lv_docHome_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1647:3: lv_docHome_0_0= RULE_STRING
            {
            lv_docHome_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePreferences2986); 

            			newLeafNode(lv_docHome_0_0, grammarAccess.getPreferencesAccess().getDocHomeSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPreferencesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"docHome",
                    		lv_docHome_0_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1663:2: ( (lv_makefileHome_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1664:1: (lv_makefileHome_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1664:1: (lv_makefileHome_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1665:3: lv_makefileHome_1_0= RULE_STRING
            {
            lv_makefileHome_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePreferences3008); 

            			newLeafNode(lv_makefileHome_1_0, grammarAccess.getPreferencesAccess().getMakefileHomeSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPreferencesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"makefileHome",
                    		lv_makefileHome_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1681:2: ( (lv_installHome_2_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1682:1: (lv_installHome_2_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1682:1: (lv_installHome_2_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1683:3: lv_installHome_2_0= RULE_STRING
            {
            lv_installHome_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePreferences3030); 

            			newLeafNode(lv_installHome_2_0, grammarAccess.getPreferencesAccess().getInstallHomeSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPreferencesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"installHome",
                    		lv_installHome_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1699:2: ( (lv_htmlVersion_3_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1700:1: (lv_htmlVersion_3_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1700:1: (lv_htmlVersion_3_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1701:3: lv_htmlVersion_3_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getPreferencesAccess().getHtmlVersionBooleanParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_rulePreferences3056);
            lv_htmlVersion_3_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPreferencesRule());
            	        }
                   		set(
                   			current, 
                   			"htmlVersion",
                    		lv_htmlVersion_3_0, 
                    		"Boolean");
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
    // $ANTLR end "rulePreferences"


    // $ANTLR start "entryRuleState"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1725:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1726:2: (iv_ruleState= ruleState EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1727:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState3092);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState3102); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1734:1: ruleState returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_1_0=null;
        EObject lv_status_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1737:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1738:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1738:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1738:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_status_2_0= ruleInheritanceStatus ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1738:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1739:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1739:1: (lv_name_0_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1740:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState3144); 

            			newLeafNode(lv_name_0_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1756:2: ( (lv_description_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1757:1: (lv_description_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1757:1: (lv_description_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1758:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState3166); 

            			newLeafNode(lv_description_1_0, grammarAccess.getStateAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1774:2: ( (lv_status_2_0= ruleInheritanceStatus ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1775:1: (lv_status_2_0= ruleInheritanceStatus )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1775:1: (lv_status_2_0= ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1776:3: lv_status_2_0= ruleInheritanceStatus
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getStatusInheritanceStatusParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleInheritanceStatus_in_ruleState3192);
            lv_status_2_0=ruleInheritanceStatus();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateRule());
            	        }
                   		set(
                   			current, 
                   			"status",
                    		lv_status_2_0, 
                    		"InheritanceStatus");
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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleProperty"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1800:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1801:2: (iv_ruleProperty= ruleProperty EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1802:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty3228);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty3238); 

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1809:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= rulePropType ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) ( (lv_mandatory_3_0= ruleBoolean ) ) ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'defaultPropValue:' ( (lv_DefaultPropValue_6_0= RULE_STRING ) )* ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token lv_DefaultPropValue_6_0=null;
        EObject lv_type_1_0 = null;

        EObject lv_status_2_0 = null;

        AntlrDatatypeRuleToken lv_mandatory_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1812:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= rulePropType ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) ( (lv_mandatory_3_0= ruleBoolean ) ) ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'defaultPropValue:' ( (lv_DefaultPropValue_6_0= RULE_STRING ) )* ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1813:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= rulePropType ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) ( (lv_mandatory_3_0= ruleBoolean ) ) ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'defaultPropValue:' ( (lv_DefaultPropValue_6_0= RULE_STRING ) )* )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1813:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= rulePropType ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) ( (lv_mandatory_3_0= ruleBoolean ) ) ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'defaultPropValue:' ( (lv_DefaultPropValue_6_0= RULE_STRING ) )* )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1813:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= rulePropType ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) ( (lv_mandatory_3_0= ruleBoolean ) ) ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'defaultPropValue:' ( (lv_DefaultPropValue_6_0= RULE_STRING ) )*
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1813:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1814:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1814:1: (lv_name_0_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1815:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty3280); 

            			newLeafNode(lv_name_0_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1831:2: ( (lv_type_1_0= rulePropType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1832:1: (lv_type_1_0= rulePropType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1832:1: (lv_type_1_0= rulePropType )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1833:3: lv_type_1_0= rulePropType
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getTypePropTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePropType_in_ruleProperty3306);
            lv_type_1_0=rulePropType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"PropType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1849:2: ( (lv_status_2_0= ruleInheritanceStatus ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1850:1: (lv_status_2_0= ruleInheritanceStatus )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1850:1: (lv_status_2_0= ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1851:3: lv_status_2_0= ruleInheritanceStatus
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getStatusInheritanceStatusParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleInheritanceStatus_in_ruleProperty3327);
            lv_status_2_0=ruleInheritanceStatus();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"status",
                    		lv_status_2_0, 
                    		"InheritanceStatus");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1867:2: ( (lv_mandatory_3_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1868:1: (lv_mandatory_3_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1868:1: (lv_mandatory_3_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1869:3: lv_mandatory_3_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getMandatoryBooleanParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleProperty3348);
            lv_mandatory_3_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"mandatory",
                    		lv_mandatory_3_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1885:2: ( (lv_description_4_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1886:1: (lv_description_4_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1886:1: (lv_description_4_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1887:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProperty3365); 

            			newLeafNode(lv_description_4_0, grammarAccess.getPropertyAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleProperty3382); 

                	newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getDefaultPropValueKeyword_5());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1907:1: ( (lv_DefaultPropValue_6_0= RULE_STRING ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_STRING) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1908:1: (lv_DefaultPropValue_6_0= RULE_STRING )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1908:1: (lv_DefaultPropValue_6_0= RULE_STRING )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1909:3: lv_DefaultPropValue_6_0= RULE_STRING
            	    {
            	    lv_DefaultPropValue_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProperty3399); 

            	    			newLeafNode(lv_DefaultPropValue_6_0, grammarAccess.getPropertyAccess().getDefaultPropValueSTRINGTerminalRuleCall_6_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPropertyRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"DefaultPropValue",
            	            		lv_DefaultPropValue_6_0, 
            	            		"STRING");
            	    	    

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRulePropType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1933:1: entryRulePropType returns [EObject current=null] : iv_rulePropType= rulePropType EOF ;
    public final EObject entryRulePropType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1934:2: (iv_rulePropType= rulePropType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1935:2: iv_rulePropType= rulePropType EOF
            {
             newCompositeNode(grammarAccess.getPropTypeRule()); 
            pushFollow(FOLLOW_rulePropType_in_entryRulePropType3441);
            iv_rulePropType=rulePropType();

            state._fsp--;

             current =iv_rulePropType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropType3451); 

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
    // $ANTLR end "entryRulePropType"


    // $ANTLR start "rulePropType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1942:1: rulePropType returns [EObject current=null] : (this_SimpleType_0= ruleSimpleType | this_VectorType_1= ruleVectorType ) ;
    public final EObject rulePropType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleType_0 = null;

        EObject this_VectorType_1 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1945:28: ( (this_SimpleType_0= ruleSimpleType | this_VectorType_1= ruleVectorType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1946:1: (this_SimpleType_0= ruleSimpleType | this_VectorType_1= ruleVectorType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1946:1: (this_SimpleType_0= ruleSimpleType | this_VectorType_1= ruleVectorType )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=49 && LA21_0<=56)) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=77 && LA21_0<=81)) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1947:5: this_SimpleType_0= ruleSimpleType
                    {
                     
                            newCompositeNode(grammarAccess.getPropTypeAccess().getSimpleTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleType_in_rulePropType3498);
                    this_SimpleType_0=ruleSimpleType();

                    state._fsp--;

                     
                            current = this_SimpleType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1957:5: this_VectorType_1= ruleVectorType
                    {
                     
                            newCompositeNode(grammarAccess.getPropTypeAccess().getVectorTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVectorType_in_rulePropType3525);
                    this_VectorType_1=ruleVectorType();

                    state._fsp--;

                     
                            current = this_VectorType_1; 
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
    // $ANTLR end "rulePropType"


    // $ANTLR start "entryRuleSimpleType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1973:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1974:2: (iv_ruleSimpleType= ruleSimpleType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1975:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType3560);
            iv_ruleSimpleType=ruleSimpleType();

            state._fsp--;

             current =iv_ruleSimpleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType3570); 

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
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1982:1: ruleSimpleType returns [EObject current=null] : (this_BooleanType_0= ruleBooleanType | this_ShortType_1= ruleShortType | this_UShortType_2= ruleUShortType | this_IntType_3= ruleIntType | this_UIntType_4= ruleUIntType | this_FloatType_5= ruleFloatType | this_DoubleType_6= ruleDoubleType | this_StringType_7= ruleStringType ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanType_0 = null;

        EObject this_ShortType_1 = null;

        EObject this_UShortType_2 = null;

        EObject this_IntType_3 = null;

        EObject this_UIntType_4 = null;

        EObject this_FloatType_5 = null;

        EObject this_DoubleType_6 = null;

        EObject this_StringType_7 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1985:28: ( (this_BooleanType_0= ruleBooleanType | this_ShortType_1= ruleShortType | this_UShortType_2= ruleUShortType | this_IntType_3= ruleIntType | this_UIntType_4= ruleUIntType | this_FloatType_5= ruleFloatType | this_DoubleType_6= ruleDoubleType | this_StringType_7= ruleStringType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1986:1: (this_BooleanType_0= ruleBooleanType | this_ShortType_1= ruleShortType | this_UShortType_2= ruleUShortType | this_IntType_3= ruleIntType | this_UIntType_4= ruleUIntType | this_FloatType_5= ruleFloatType | this_DoubleType_6= ruleDoubleType | this_StringType_7= ruleStringType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1986:1: (this_BooleanType_0= ruleBooleanType | this_ShortType_1= ruleShortType | this_UShortType_2= ruleUShortType | this_IntType_3= ruleIntType | this_UIntType_4= ruleUIntType | this_FloatType_5= ruleFloatType | this_DoubleType_6= ruleDoubleType | this_StringType_7= ruleStringType )
            int alt22=8;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt22=1;
                }
                break;
            case 50:
                {
                alt22=2;
                }
                break;
            case 51:
                {
                alt22=3;
                }
                break;
            case 52:
                {
                alt22=4;
                }
                break;
            case 53:
                {
                alt22=5;
                }
                break;
            case 54:
                {
                alt22=6;
                }
                break;
            case 55:
                {
                alt22=7;
                }
                break;
            case 56:
                {
                alt22=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1987:5: this_BooleanType_0= ruleBooleanType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getBooleanTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBooleanType_in_ruleSimpleType3617);
                    this_BooleanType_0=ruleBooleanType();

                    state._fsp--;

                     
                            current = this_BooleanType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1997:5: this_ShortType_1= ruleShortType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getShortTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleShortType_in_ruleSimpleType3644);
                    this_ShortType_1=ruleShortType();

                    state._fsp--;

                     
                            current = this_ShortType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2007:5: this_UShortType_2= ruleUShortType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getUShortTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleUShortType_in_ruleSimpleType3671);
                    this_UShortType_2=ruleUShortType();

                    state._fsp--;

                     
                            current = this_UShortType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2017:5: this_IntType_3= ruleIntType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getIntTypeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleIntType_in_ruleSimpleType3698);
                    this_IntType_3=ruleIntType();

                    state._fsp--;

                     
                            current = this_IntType_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2027:5: this_UIntType_4= ruleUIntType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getUIntTypeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleUIntType_in_ruleSimpleType3725);
                    this_UIntType_4=ruleUIntType();

                    state._fsp--;

                     
                            current = this_UIntType_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2037:5: this_FloatType_5= ruleFloatType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getFloatTypeParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleFloatType_in_ruleSimpleType3752);
                    this_FloatType_5=ruleFloatType();

                    state._fsp--;

                     
                            current = this_FloatType_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2047:5: this_DoubleType_6= ruleDoubleType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getDoubleTypeParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleDoubleType_in_ruleSimpleType3779);
                    this_DoubleType_6=ruleDoubleType();

                    state._fsp--;

                     
                            current = this_DoubleType_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2057:5: this_StringType_7= ruleStringType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getStringTypeParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleStringType_in_ruleSimpleType3806);
                    this_StringType_7=ruleStringType();

                    state._fsp--;

                     
                            current = this_StringType_7; 
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
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleVectorType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2073:1: entryRuleVectorType returns [EObject current=null] : iv_ruleVectorType= ruleVectorType EOF ;
    public final EObject entryRuleVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2074:2: (iv_ruleVectorType= ruleVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2075:2: iv_ruleVectorType= ruleVectorType EOF
            {
             newCompositeNode(grammarAccess.getVectorTypeRule()); 
            pushFollow(FOLLOW_ruleVectorType_in_entryRuleVectorType3841);
            iv_ruleVectorType=ruleVectorType();

            state._fsp--;

             current =iv_ruleVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVectorType3851); 

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
    // $ANTLR end "entryRuleVectorType"


    // $ANTLR start "ruleVectorType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2082:1: ruleVectorType returns [EObject current=null] : (this_ShortVectorType_0= ruleShortVectorType | this_IntVectorType_1= ruleIntVectorType | this_FloatVectorType_2= ruleFloatVectorType | this_DoubleVectorType_3= ruleDoubleVectorType | this_StringVectorType_4= ruleStringVectorType ) ;
    public final EObject ruleVectorType() throws RecognitionException {
        EObject current = null;

        EObject this_ShortVectorType_0 = null;

        EObject this_IntVectorType_1 = null;

        EObject this_FloatVectorType_2 = null;

        EObject this_DoubleVectorType_3 = null;

        EObject this_StringVectorType_4 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2085:28: ( (this_ShortVectorType_0= ruleShortVectorType | this_IntVectorType_1= ruleIntVectorType | this_FloatVectorType_2= ruleFloatVectorType | this_DoubleVectorType_3= ruleDoubleVectorType | this_StringVectorType_4= ruleStringVectorType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2086:1: (this_ShortVectorType_0= ruleShortVectorType | this_IntVectorType_1= ruleIntVectorType | this_FloatVectorType_2= ruleFloatVectorType | this_DoubleVectorType_3= ruleDoubleVectorType | this_StringVectorType_4= ruleStringVectorType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2086:1: (this_ShortVectorType_0= ruleShortVectorType | this_IntVectorType_1= ruleIntVectorType | this_FloatVectorType_2= ruleFloatVectorType | this_DoubleVectorType_3= ruleDoubleVectorType | this_StringVectorType_4= ruleStringVectorType )
            int alt23=5;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt23=1;
                }
                break;
            case 78:
                {
                alt23=2;
                }
                break;
            case 79:
                {
                alt23=3;
                }
                break;
            case 80:
                {
                alt23=4;
                }
                break;
            case 81:
                {
                alt23=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2087:5: this_ShortVectorType_0= ruleShortVectorType
                    {
                     
                            newCompositeNode(grammarAccess.getVectorTypeAccess().getShortVectorTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleShortVectorType_in_ruleVectorType3898);
                    this_ShortVectorType_0=ruleShortVectorType();

                    state._fsp--;

                     
                            current = this_ShortVectorType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2097:5: this_IntVectorType_1= ruleIntVectorType
                    {
                     
                            newCompositeNode(grammarAccess.getVectorTypeAccess().getIntVectorTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntVectorType_in_ruleVectorType3925);
                    this_IntVectorType_1=ruleIntVectorType();

                    state._fsp--;

                     
                            current = this_IntVectorType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2107:5: this_FloatVectorType_2= ruleFloatVectorType
                    {
                     
                            newCompositeNode(grammarAccess.getVectorTypeAccess().getFloatVectorTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFloatVectorType_in_ruleVectorType3952);
                    this_FloatVectorType_2=ruleFloatVectorType();

                    state._fsp--;

                     
                            current = this_FloatVectorType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2117:5: this_DoubleVectorType_3= ruleDoubleVectorType
                    {
                     
                            newCompositeNode(grammarAccess.getVectorTypeAccess().getDoubleVectorTypeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDoubleVectorType_in_ruleVectorType3979);
                    this_DoubleVectorType_3=ruleDoubleVectorType();

                    state._fsp--;

                     
                            current = this_DoubleVectorType_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2127:5: this_StringVectorType_4= ruleStringVectorType
                    {
                     
                            newCompositeNode(grammarAccess.getVectorTypeAccess().getStringVectorTypeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleStringVectorType_in_ruleVectorType4006);
                    this_StringVectorType_4=ruleStringVectorType();

                    state._fsp--;

                     
                            current = this_StringVectorType_4; 
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
    // $ANTLR end "ruleVectorType"


    // $ANTLR start "entryRuleInheritanceStatus"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2143:1: entryRuleInheritanceStatus returns [EObject current=null] : iv_ruleInheritanceStatus= ruleInheritanceStatus EOF ;
    public final EObject entryRuleInheritanceStatus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritanceStatus = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2144:2: (iv_ruleInheritanceStatus= ruleInheritanceStatus EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2145:2: iv_ruleInheritanceStatus= ruleInheritanceStatus EOF
            {
             newCompositeNode(grammarAccess.getInheritanceStatusRule()); 
            pushFollow(FOLLOW_ruleInheritanceStatus_in_entryRuleInheritanceStatus4041);
            iv_ruleInheritanceStatus=ruleInheritanceStatus();

            state._fsp--;

             current =iv_ruleInheritanceStatus; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInheritanceStatus4051); 

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
    // $ANTLR end "entryRuleInheritanceStatus"


    // $ANTLR start "ruleInheritanceStatus"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2152:1: ruleInheritanceStatus returns [EObject current=null] : ( ( (lv_abstract_0_0= ruleBoolean ) ) ( (lv_inherited_1_0= ruleBoolean ) ) ( (lv_concrete_2_0= ruleBoolean ) ) ( (lv_concreteHere_3_0= ruleBoolean ) ) ( (lv_hasChanged_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleInheritanceStatus() throws RecognitionException {
        EObject current = null;

        Token lv_hasChanged_4_0=null;
        AntlrDatatypeRuleToken lv_abstract_0_0 = null;

        AntlrDatatypeRuleToken lv_inherited_1_0 = null;

        AntlrDatatypeRuleToken lv_concrete_2_0 = null;

        AntlrDatatypeRuleToken lv_concreteHere_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2155:28: ( ( ( (lv_abstract_0_0= ruleBoolean ) ) ( (lv_inherited_1_0= ruleBoolean ) ) ( (lv_concrete_2_0= ruleBoolean ) ) ( (lv_concreteHere_3_0= ruleBoolean ) ) ( (lv_hasChanged_4_0= RULE_STRING ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2156:1: ( ( (lv_abstract_0_0= ruleBoolean ) ) ( (lv_inherited_1_0= ruleBoolean ) ) ( (lv_concrete_2_0= ruleBoolean ) ) ( (lv_concreteHere_3_0= ruleBoolean ) ) ( (lv_hasChanged_4_0= RULE_STRING ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2156:1: ( ( (lv_abstract_0_0= ruleBoolean ) ) ( (lv_inherited_1_0= ruleBoolean ) ) ( (lv_concrete_2_0= ruleBoolean ) ) ( (lv_concreteHere_3_0= ruleBoolean ) ) ( (lv_hasChanged_4_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2156:2: ( (lv_abstract_0_0= ruleBoolean ) ) ( (lv_inherited_1_0= ruleBoolean ) ) ( (lv_concrete_2_0= ruleBoolean ) ) ( (lv_concreteHere_3_0= ruleBoolean ) ) ( (lv_hasChanged_4_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2156:2: ( (lv_abstract_0_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2157:1: (lv_abstract_0_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2157:1: (lv_abstract_0_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2158:3: lv_abstract_0_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getInheritanceStatusAccess().getAbstractBooleanParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleInheritanceStatus4097);
            lv_abstract_0_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInheritanceStatusRule());
            	        }
                   		set(
                   			current, 
                   			"abstract",
                    		lv_abstract_0_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2174:2: ( (lv_inherited_1_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2175:1: (lv_inherited_1_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2175:1: (lv_inherited_1_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2176:3: lv_inherited_1_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getInheritanceStatusAccess().getInheritedBooleanParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleInheritanceStatus4118);
            lv_inherited_1_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInheritanceStatusRule());
            	        }
                   		set(
                   			current, 
                   			"inherited",
                    		lv_inherited_1_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2192:2: ( (lv_concrete_2_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2193:1: (lv_concrete_2_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2193:1: (lv_concrete_2_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2194:3: lv_concrete_2_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getInheritanceStatusAccess().getConcreteBooleanParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleInheritanceStatus4139);
            lv_concrete_2_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInheritanceStatusRule());
            	        }
                   		set(
                   			current, 
                   			"concrete",
                    		lv_concrete_2_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2210:2: ( (lv_concreteHere_3_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2211:1: (lv_concreteHere_3_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2211:1: (lv_concreteHere_3_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2212:3: lv_concreteHere_3_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getInheritanceStatusAccess().getConcreteHereBooleanParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleInheritanceStatus4160);
            lv_concreteHere_3_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInheritanceStatusRule());
            	        }
                   		set(
                   			current, 
                   			"concreteHere",
                    		lv_concreteHere_3_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2228:2: ( (lv_hasChanged_4_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2229:1: (lv_hasChanged_4_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2229:1: (lv_hasChanged_4_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2230:3: lv_hasChanged_4_0= RULE_STRING
            {
            lv_hasChanged_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInheritanceStatus4177); 

            			newLeafNode(lv_hasChanged_4_0, grammarAccess.getInheritanceStatusAccess().getHasChangedSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInheritanceStatusRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"hasChanged",
                    		lv_hasChanged_4_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleInheritanceStatus"


    // $ANTLR start "entryRuleCommand"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2254:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2255:2: (iv_ruleCommand= ruleCommand EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2256:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand4218);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand4228); 

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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2263:1: ruleCommand returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_argin_1_0= ruleArgument ) ) ( (lv_argout_2_0= ruleArgument ) ) ( (lv_description_3_0= RULE_STRING ) ) ( (lv_status_4_0= ruleInheritanceStatus ) ) ( (lv_execMethod_5_0= RULE_STRING ) ) ( (lv_displayLevel_6_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_7_0= RULE_STRING ) ) otherlv_8= 'excludedStates:' ( (lv_excludedStates_9_0= RULE_STRING ) )* ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_3_0=null;
        Token lv_execMethod_5_0=null;
        Token lv_polledPeriod_7_0=null;
        Token otherlv_8=null;
        Token lv_excludedStates_9_0=null;
        EObject lv_argin_1_0 = null;

        EObject lv_argout_2_0 = null;

        EObject lv_status_4_0 = null;

        AntlrDatatypeRuleToken lv_displayLevel_6_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2266:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_argin_1_0= ruleArgument ) ) ( (lv_argout_2_0= ruleArgument ) ) ( (lv_description_3_0= RULE_STRING ) ) ( (lv_status_4_0= ruleInheritanceStatus ) ) ( (lv_execMethod_5_0= RULE_STRING ) ) ( (lv_displayLevel_6_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_7_0= RULE_STRING ) ) otherlv_8= 'excludedStates:' ( (lv_excludedStates_9_0= RULE_STRING ) )* ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2267:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_argin_1_0= ruleArgument ) ) ( (lv_argout_2_0= ruleArgument ) ) ( (lv_description_3_0= RULE_STRING ) ) ( (lv_status_4_0= ruleInheritanceStatus ) ) ( (lv_execMethod_5_0= RULE_STRING ) ) ( (lv_displayLevel_6_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_7_0= RULE_STRING ) ) otherlv_8= 'excludedStates:' ( (lv_excludedStates_9_0= RULE_STRING ) )* )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2267:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_argin_1_0= ruleArgument ) ) ( (lv_argout_2_0= ruleArgument ) ) ( (lv_description_3_0= RULE_STRING ) ) ( (lv_status_4_0= ruleInheritanceStatus ) ) ( (lv_execMethod_5_0= RULE_STRING ) ) ( (lv_displayLevel_6_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_7_0= RULE_STRING ) ) otherlv_8= 'excludedStates:' ( (lv_excludedStates_9_0= RULE_STRING ) )* )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2267:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_argin_1_0= ruleArgument ) ) ( (lv_argout_2_0= ruleArgument ) ) ( (lv_description_3_0= RULE_STRING ) ) ( (lv_status_4_0= ruleInheritanceStatus ) ) ( (lv_execMethod_5_0= RULE_STRING ) ) ( (lv_displayLevel_6_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_7_0= RULE_STRING ) ) otherlv_8= 'excludedStates:' ( (lv_excludedStates_9_0= RULE_STRING ) )*
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2267:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2268:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2268:1: (lv_name_0_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2269:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand4270); 

            			newLeafNode(lv_name_0_0, grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommandRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2285:2: ( (lv_argin_1_0= ruleArgument ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2286:1: (lv_argin_1_0= ruleArgument )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2286:1: (lv_argin_1_0= ruleArgument )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2287:3: lv_argin_1_0= ruleArgument
            {
             
            	        newCompositeNode(grammarAccess.getCommandAccess().getArginArgumentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleArgument_in_ruleCommand4296);
            lv_argin_1_0=ruleArgument();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCommandRule());
            	        }
                   		set(
                   			current, 
                   			"argin",
                    		lv_argin_1_0, 
                    		"Argument");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2303:2: ( (lv_argout_2_0= ruleArgument ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2304:1: (lv_argout_2_0= ruleArgument )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2304:1: (lv_argout_2_0= ruleArgument )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2305:3: lv_argout_2_0= ruleArgument
            {
             
            	        newCompositeNode(grammarAccess.getCommandAccess().getArgoutArgumentParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleArgument_in_ruleCommand4317);
            lv_argout_2_0=ruleArgument();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCommandRule());
            	        }
                   		set(
                   			current, 
                   			"argout",
                    		lv_argout_2_0, 
                    		"Argument");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2321:2: ( (lv_description_3_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2322:1: (lv_description_3_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2322:1: (lv_description_3_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2323:3: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommand4334); 

            			newLeafNode(lv_description_3_0, grammarAccess.getCommandAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommandRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2339:2: ( (lv_status_4_0= ruleInheritanceStatus ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2340:1: (lv_status_4_0= ruleInheritanceStatus )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2340:1: (lv_status_4_0= ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2341:3: lv_status_4_0= ruleInheritanceStatus
            {
             
            	        newCompositeNode(grammarAccess.getCommandAccess().getStatusInheritanceStatusParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleInheritanceStatus_in_ruleCommand4360);
            lv_status_4_0=ruleInheritanceStatus();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCommandRule());
            	        }
                   		set(
                   			current, 
                   			"status",
                    		lv_status_4_0, 
                    		"InheritanceStatus");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2357:2: ( (lv_execMethod_5_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2358:1: (lv_execMethod_5_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2358:1: (lv_execMethod_5_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2359:3: lv_execMethod_5_0= RULE_STRING
            {
            lv_execMethod_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommand4377); 

            			newLeafNode(lv_execMethod_5_0, grammarAccess.getCommandAccess().getExecMethodSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommandRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"execMethod",
                    		lv_execMethod_5_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2375:2: ( (lv_displayLevel_6_0= ruleDisplayLevel ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2376:1: (lv_displayLevel_6_0= ruleDisplayLevel )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2376:1: (lv_displayLevel_6_0= ruleDisplayLevel )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2377:3: lv_displayLevel_6_0= ruleDisplayLevel
            {
             
            	        newCompositeNode(grammarAccess.getCommandAccess().getDisplayLevelDisplayLevelParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleDisplayLevel_in_ruleCommand4403);
            lv_displayLevel_6_0=ruleDisplayLevel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCommandRule());
            	        }
                   		set(
                   			current, 
                   			"displayLevel",
                    		lv_displayLevel_6_0, 
                    		"DisplayLevel");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2393:2: ( (lv_polledPeriod_7_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2394:1: (lv_polledPeriod_7_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2394:1: (lv_polledPeriod_7_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2395:3: lv_polledPeriod_7_0= RULE_STRING
            {
            lv_polledPeriod_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommand4420); 

            			newLeafNode(lv_polledPeriod_7_0, grammarAccess.getCommandAccess().getPolledPeriodSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommandRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"polledPeriod",
                    		lv_polledPeriod_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,45,FOLLOW_45_in_ruleCommand4437); 

                	newLeafNode(otherlv_8, grammarAccess.getCommandAccess().getExcludedStatesKeyword_8());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2415:1: ( (lv_excludedStates_9_0= RULE_STRING ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_STRING) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2416:1: (lv_excludedStates_9_0= RULE_STRING )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2416:1: (lv_excludedStates_9_0= RULE_STRING )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2417:3: lv_excludedStates_9_0= RULE_STRING
            	    {
            	    lv_excludedStates_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommand4454); 

            	    			newLeafNode(lv_excludedStates_9_0, grammarAccess.getCommandAccess().getExcludedStatesSTRINGTerminalRuleCall_9_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCommandRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"excludedStates",
            	            		lv_excludedStates_9_0, 
            	            		"STRING");
            	    	    

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleArgument"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2441:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2442:2: (iv_ruleArgument= ruleArgument EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2443:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument4496);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument4506); 

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
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2450:1: ruleArgument returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_description_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_description_1_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2453:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_description_1_0= RULE_STRING ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2454:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_description_1_0= RULE_STRING ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2454:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_description_1_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2454:2: ( (lv_type_0_0= ruleType ) ) ( (lv_description_1_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2454:2: ( (lv_type_0_0= ruleType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2455:1: (lv_type_0_0= ruleType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2455:1: (lv_type_0_0= ruleType )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2456:3: lv_type_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getArgumentAccess().getTypeTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleArgument4552);
            lv_type_0_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArgumentRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2472:2: ( (lv_description_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2473:1: (lv_description_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2473:1: (lv_description_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2474:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument4569); 

            			newLeafNode(lv_description_1_0, grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArgumentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_1_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleAttribute"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2498:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2499:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2500:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute4610);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute4620); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2507:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_attType_1_0= ruleAttrType ) ) ( (lv_dataType_2_0= ruleType ) ) ( (lv_rwType_3_0= ruleRW_Type ) ) ( (lv_displayLevel_4_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_5_0= RULE_STRING ) ) ( (lv_maxX_6_0= RULE_STRING ) ) ( (lv_maxY_7_0= RULE_STRING ) ) ( (lv_associatedAttr_8_0= RULE_STRING ) ) ( (lv_memorized_9_0= ruleBoolean ) ) ( (lv_memorizedAtInit_10_0= ruleBoolean ) ) ( (lv_changeEvent_11_0= ruleFireEvents ) ) ( (lv_archiveEvent_12_0= ruleFireEvents ) ) ( (lv_dataReadyEvent_13_0= ruleFireEvents ) ) ( (lv_status_14_0= ruleInheritanceStatus ) ) ( (lv_properties_15_0= ruleAttrProperties ) ) ( (lv_allocReadMember_16_0= ruleBoolean ) ) ( (lv_isDynamic_17_0= ruleBoolean ) ) ( (lv_eventCriteria_18_0= ruleEventCriteria ) ) ( (lv_evArchiveCriteria_19_0= ruleEventCriteria ) ) otherlv_20= 'readExcludedStates:' ( (lv_readExcludedStates_21_0= RULE_STRING ) )* otherlv_22= 'writeExcludedStates:' ( (lv_writeExcludedStates_23_0= RULE_STRING ) )* ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_polledPeriod_5_0=null;
        Token lv_maxX_6_0=null;
        Token lv_maxY_7_0=null;
        Token lv_associatedAttr_8_0=null;
        Token otherlv_20=null;
        Token lv_readExcludedStates_21_0=null;
        Token otherlv_22=null;
        Token lv_writeExcludedStates_23_0=null;
        AntlrDatatypeRuleToken lv_attType_1_0 = null;

        EObject lv_dataType_2_0 = null;

        AntlrDatatypeRuleToken lv_rwType_3_0 = null;

        AntlrDatatypeRuleToken lv_displayLevel_4_0 = null;

        AntlrDatatypeRuleToken lv_memorized_9_0 = null;

        AntlrDatatypeRuleToken lv_memorizedAtInit_10_0 = null;

        EObject lv_changeEvent_11_0 = null;

        EObject lv_archiveEvent_12_0 = null;

        EObject lv_dataReadyEvent_13_0 = null;

        EObject lv_status_14_0 = null;

        EObject lv_properties_15_0 = null;

        AntlrDatatypeRuleToken lv_allocReadMember_16_0 = null;

        AntlrDatatypeRuleToken lv_isDynamic_17_0 = null;

        EObject lv_eventCriteria_18_0 = null;

        EObject lv_evArchiveCriteria_19_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2510:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_attType_1_0= ruleAttrType ) ) ( (lv_dataType_2_0= ruleType ) ) ( (lv_rwType_3_0= ruleRW_Type ) ) ( (lv_displayLevel_4_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_5_0= RULE_STRING ) ) ( (lv_maxX_6_0= RULE_STRING ) ) ( (lv_maxY_7_0= RULE_STRING ) ) ( (lv_associatedAttr_8_0= RULE_STRING ) ) ( (lv_memorized_9_0= ruleBoolean ) ) ( (lv_memorizedAtInit_10_0= ruleBoolean ) ) ( (lv_changeEvent_11_0= ruleFireEvents ) ) ( (lv_archiveEvent_12_0= ruleFireEvents ) ) ( (lv_dataReadyEvent_13_0= ruleFireEvents ) ) ( (lv_status_14_0= ruleInheritanceStatus ) ) ( (lv_properties_15_0= ruleAttrProperties ) ) ( (lv_allocReadMember_16_0= ruleBoolean ) ) ( (lv_isDynamic_17_0= ruleBoolean ) ) ( (lv_eventCriteria_18_0= ruleEventCriteria ) ) ( (lv_evArchiveCriteria_19_0= ruleEventCriteria ) ) otherlv_20= 'readExcludedStates:' ( (lv_readExcludedStates_21_0= RULE_STRING ) )* otherlv_22= 'writeExcludedStates:' ( (lv_writeExcludedStates_23_0= RULE_STRING ) )* ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2511:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_attType_1_0= ruleAttrType ) ) ( (lv_dataType_2_0= ruleType ) ) ( (lv_rwType_3_0= ruleRW_Type ) ) ( (lv_displayLevel_4_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_5_0= RULE_STRING ) ) ( (lv_maxX_6_0= RULE_STRING ) ) ( (lv_maxY_7_0= RULE_STRING ) ) ( (lv_associatedAttr_8_0= RULE_STRING ) ) ( (lv_memorized_9_0= ruleBoolean ) ) ( (lv_memorizedAtInit_10_0= ruleBoolean ) ) ( (lv_changeEvent_11_0= ruleFireEvents ) ) ( (lv_archiveEvent_12_0= ruleFireEvents ) ) ( (lv_dataReadyEvent_13_0= ruleFireEvents ) ) ( (lv_status_14_0= ruleInheritanceStatus ) ) ( (lv_properties_15_0= ruleAttrProperties ) ) ( (lv_allocReadMember_16_0= ruleBoolean ) ) ( (lv_isDynamic_17_0= ruleBoolean ) ) ( (lv_eventCriteria_18_0= ruleEventCriteria ) ) ( (lv_evArchiveCriteria_19_0= ruleEventCriteria ) ) otherlv_20= 'readExcludedStates:' ( (lv_readExcludedStates_21_0= RULE_STRING ) )* otherlv_22= 'writeExcludedStates:' ( (lv_writeExcludedStates_23_0= RULE_STRING ) )* )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2511:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_attType_1_0= ruleAttrType ) ) ( (lv_dataType_2_0= ruleType ) ) ( (lv_rwType_3_0= ruleRW_Type ) ) ( (lv_displayLevel_4_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_5_0= RULE_STRING ) ) ( (lv_maxX_6_0= RULE_STRING ) ) ( (lv_maxY_7_0= RULE_STRING ) ) ( (lv_associatedAttr_8_0= RULE_STRING ) ) ( (lv_memorized_9_0= ruleBoolean ) ) ( (lv_memorizedAtInit_10_0= ruleBoolean ) ) ( (lv_changeEvent_11_0= ruleFireEvents ) ) ( (lv_archiveEvent_12_0= ruleFireEvents ) ) ( (lv_dataReadyEvent_13_0= ruleFireEvents ) ) ( (lv_status_14_0= ruleInheritanceStatus ) ) ( (lv_properties_15_0= ruleAttrProperties ) ) ( (lv_allocReadMember_16_0= ruleBoolean ) ) ( (lv_isDynamic_17_0= ruleBoolean ) ) ( (lv_eventCriteria_18_0= ruleEventCriteria ) ) ( (lv_evArchiveCriteria_19_0= ruleEventCriteria ) ) otherlv_20= 'readExcludedStates:' ( (lv_readExcludedStates_21_0= RULE_STRING ) )* otherlv_22= 'writeExcludedStates:' ( (lv_writeExcludedStates_23_0= RULE_STRING ) )* )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2511:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_attType_1_0= ruleAttrType ) ) ( (lv_dataType_2_0= ruleType ) ) ( (lv_rwType_3_0= ruleRW_Type ) ) ( (lv_displayLevel_4_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_5_0= RULE_STRING ) ) ( (lv_maxX_6_0= RULE_STRING ) ) ( (lv_maxY_7_0= RULE_STRING ) ) ( (lv_associatedAttr_8_0= RULE_STRING ) ) ( (lv_memorized_9_0= ruleBoolean ) ) ( (lv_memorizedAtInit_10_0= ruleBoolean ) ) ( (lv_changeEvent_11_0= ruleFireEvents ) ) ( (lv_archiveEvent_12_0= ruleFireEvents ) ) ( (lv_dataReadyEvent_13_0= ruleFireEvents ) ) ( (lv_status_14_0= ruleInheritanceStatus ) ) ( (lv_properties_15_0= ruleAttrProperties ) ) ( (lv_allocReadMember_16_0= ruleBoolean ) ) ( (lv_isDynamic_17_0= ruleBoolean ) ) ( (lv_eventCriteria_18_0= ruleEventCriteria ) ) ( (lv_evArchiveCriteria_19_0= ruleEventCriteria ) ) otherlv_20= 'readExcludedStates:' ( (lv_readExcludedStates_21_0= RULE_STRING ) )* otherlv_22= 'writeExcludedStates:' ( (lv_writeExcludedStates_23_0= RULE_STRING ) )*
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2511:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2512:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2512:1: (lv_name_0_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2513:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute4662); 

            			newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2529:2: ( (lv_attType_1_0= ruleAttrType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2530:1: (lv_attType_1_0= ruleAttrType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2530:1: (lv_attType_1_0= ruleAttrType )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2531:3: lv_attType_1_0= ruleAttrType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getAttTypeAttrTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAttrType_in_ruleAttribute4688);
            lv_attType_1_0=ruleAttrType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"attType",
                    		lv_attType_1_0, 
                    		"AttrType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2547:2: ( (lv_dataType_2_0= ruleType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2548:1: (lv_dataType_2_0= ruleType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2548:1: (lv_dataType_2_0= ruleType )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2549:3: lv_dataType_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getDataTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleAttribute4709);
            lv_dataType_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"dataType",
                    		lv_dataType_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2565:2: ( (lv_rwType_3_0= ruleRW_Type ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2566:1: (lv_rwType_3_0= ruleRW_Type )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2566:1: (lv_rwType_3_0= ruleRW_Type )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2567:3: lv_rwType_3_0= ruleRW_Type
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getRwTypeRW_TypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleRW_Type_in_ruleAttribute4730);
            lv_rwType_3_0=ruleRW_Type();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"rwType",
                    		lv_rwType_3_0, 
                    		"RW_Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2583:2: ( (lv_displayLevel_4_0= ruleDisplayLevel ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2584:1: (lv_displayLevel_4_0= ruleDisplayLevel )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2584:1: (lv_displayLevel_4_0= ruleDisplayLevel )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2585:3: lv_displayLevel_4_0= ruleDisplayLevel
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getDisplayLevelDisplayLevelParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleDisplayLevel_in_ruleAttribute4751);
            lv_displayLevel_4_0=ruleDisplayLevel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"displayLevel",
                    		lv_displayLevel_4_0, 
                    		"DisplayLevel");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2601:2: ( (lv_polledPeriod_5_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2602:1: (lv_polledPeriod_5_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2602:1: (lv_polledPeriod_5_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2603:3: lv_polledPeriod_5_0= RULE_STRING
            {
            lv_polledPeriod_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute4768); 

            			newLeafNode(lv_polledPeriod_5_0, grammarAccess.getAttributeAccess().getPolledPeriodSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"polledPeriod",
                    		lv_polledPeriod_5_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2619:2: ( (lv_maxX_6_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2620:1: (lv_maxX_6_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2620:1: (lv_maxX_6_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2621:3: lv_maxX_6_0= RULE_STRING
            {
            lv_maxX_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute4790); 

            			newLeafNode(lv_maxX_6_0, grammarAccess.getAttributeAccess().getMaxXSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"maxX",
                    		lv_maxX_6_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2637:2: ( (lv_maxY_7_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2638:1: (lv_maxY_7_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2638:1: (lv_maxY_7_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2639:3: lv_maxY_7_0= RULE_STRING
            {
            lv_maxY_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute4812); 

            			newLeafNode(lv_maxY_7_0, grammarAccess.getAttributeAccess().getMaxYSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"maxY",
                    		lv_maxY_7_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2655:2: ( (lv_associatedAttr_8_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2656:1: (lv_associatedAttr_8_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2656:1: (lv_associatedAttr_8_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2657:3: lv_associatedAttr_8_0= RULE_STRING
            {
            lv_associatedAttr_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute4834); 

            			newLeafNode(lv_associatedAttr_8_0, grammarAccess.getAttributeAccess().getAssociatedAttrSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"associatedAttr",
                    		lv_associatedAttr_8_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2673:2: ( (lv_memorized_9_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2674:1: (lv_memorized_9_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2674:1: (lv_memorized_9_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2675:3: lv_memorized_9_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getMemorizedBooleanParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleAttribute4860);
            lv_memorized_9_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"memorized",
                    		lv_memorized_9_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2691:2: ( (lv_memorizedAtInit_10_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2692:1: (lv_memorizedAtInit_10_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2692:1: (lv_memorizedAtInit_10_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2693:3: lv_memorizedAtInit_10_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getMemorizedAtInitBooleanParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleAttribute4881);
            lv_memorizedAtInit_10_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"memorizedAtInit",
                    		lv_memorizedAtInit_10_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2709:2: ( (lv_changeEvent_11_0= ruleFireEvents ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2710:1: (lv_changeEvent_11_0= ruleFireEvents )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2710:1: (lv_changeEvent_11_0= ruleFireEvents )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2711:3: lv_changeEvent_11_0= ruleFireEvents
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getChangeEventFireEventsParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_ruleFireEvents_in_ruleAttribute4902);
            lv_changeEvent_11_0=ruleFireEvents();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"changeEvent",
                    		lv_changeEvent_11_0, 
                    		"FireEvents");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2727:2: ( (lv_archiveEvent_12_0= ruleFireEvents ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2728:1: (lv_archiveEvent_12_0= ruleFireEvents )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2728:1: (lv_archiveEvent_12_0= ruleFireEvents )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2729:3: lv_archiveEvent_12_0= ruleFireEvents
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getArchiveEventFireEventsParserRuleCall_12_0()); 
            	    
            pushFollow(FOLLOW_ruleFireEvents_in_ruleAttribute4923);
            lv_archiveEvent_12_0=ruleFireEvents();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"archiveEvent",
                    		lv_archiveEvent_12_0, 
                    		"FireEvents");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2745:2: ( (lv_dataReadyEvent_13_0= ruleFireEvents ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2746:1: (lv_dataReadyEvent_13_0= ruleFireEvents )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2746:1: (lv_dataReadyEvent_13_0= ruleFireEvents )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2747:3: lv_dataReadyEvent_13_0= ruleFireEvents
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getDataReadyEventFireEventsParserRuleCall_13_0()); 
            	    
            pushFollow(FOLLOW_ruleFireEvents_in_ruleAttribute4944);
            lv_dataReadyEvent_13_0=ruleFireEvents();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"dataReadyEvent",
                    		lv_dataReadyEvent_13_0, 
                    		"FireEvents");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2763:2: ( (lv_status_14_0= ruleInheritanceStatus ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2764:1: (lv_status_14_0= ruleInheritanceStatus )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2764:1: (lv_status_14_0= ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2765:3: lv_status_14_0= ruleInheritanceStatus
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getStatusInheritanceStatusParserRuleCall_14_0()); 
            	    
            pushFollow(FOLLOW_ruleInheritanceStatus_in_ruleAttribute4965);
            lv_status_14_0=ruleInheritanceStatus();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"status",
                    		lv_status_14_0, 
                    		"InheritanceStatus");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2781:2: ( (lv_properties_15_0= ruleAttrProperties ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2782:1: (lv_properties_15_0= ruleAttrProperties )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2782:1: (lv_properties_15_0= ruleAttrProperties )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2783:3: lv_properties_15_0= ruleAttrProperties
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getPropertiesAttrPropertiesParserRuleCall_15_0()); 
            	    
            pushFollow(FOLLOW_ruleAttrProperties_in_ruleAttribute4986);
            lv_properties_15_0=ruleAttrProperties();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"properties",
                    		lv_properties_15_0, 
                    		"AttrProperties");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2799:2: ( (lv_allocReadMember_16_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2800:1: (lv_allocReadMember_16_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2800:1: (lv_allocReadMember_16_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2801:3: lv_allocReadMember_16_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getAllocReadMemberBooleanParserRuleCall_16_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleAttribute5007);
            lv_allocReadMember_16_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"allocReadMember",
                    		lv_allocReadMember_16_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2817:2: ( (lv_isDynamic_17_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2818:1: (lv_isDynamic_17_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2818:1: (lv_isDynamic_17_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2819:3: lv_isDynamic_17_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getIsDynamicBooleanParserRuleCall_17_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleAttribute5028);
            lv_isDynamic_17_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"isDynamic",
                    		lv_isDynamic_17_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2835:2: ( (lv_eventCriteria_18_0= ruleEventCriteria ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2836:1: (lv_eventCriteria_18_0= ruleEventCriteria )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2836:1: (lv_eventCriteria_18_0= ruleEventCriteria )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2837:3: lv_eventCriteria_18_0= ruleEventCriteria
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getEventCriteriaEventCriteriaParserRuleCall_18_0()); 
            	    
            pushFollow(FOLLOW_ruleEventCriteria_in_ruleAttribute5049);
            lv_eventCriteria_18_0=ruleEventCriteria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"eventCriteria",
                    		lv_eventCriteria_18_0, 
                    		"EventCriteria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2853:2: ( (lv_evArchiveCriteria_19_0= ruleEventCriteria ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2854:1: (lv_evArchiveCriteria_19_0= ruleEventCriteria )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2854:1: (lv_evArchiveCriteria_19_0= ruleEventCriteria )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2855:3: lv_evArchiveCriteria_19_0= ruleEventCriteria
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getEvArchiveCriteriaEventCriteriaParserRuleCall_19_0()); 
            	    
            pushFollow(FOLLOW_ruleEventCriteria_in_ruleAttribute5070);
            lv_evArchiveCriteria_19_0=ruleEventCriteria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"evArchiveCriteria",
                    		lv_evArchiveCriteria_19_0, 
                    		"EventCriteria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_20=(Token)match(input,46,FOLLOW_46_in_ruleAttribute5082); 

                	newLeafNode(otherlv_20, grammarAccess.getAttributeAccess().getReadExcludedStatesKeyword_20());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2875:1: ( (lv_readExcludedStates_21_0= RULE_STRING ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_STRING) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2876:1: (lv_readExcludedStates_21_0= RULE_STRING )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2876:1: (lv_readExcludedStates_21_0= RULE_STRING )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2877:3: lv_readExcludedStates_21_0= RULE_STRING
            	    {
            	    lv_readExcludedStates_21_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute5099); 

            	    			newLeafNode(lv_readExcludedStates_21_0, grammarAccess.getAttributeAccess().getReadExcludedStatesSTRINGTerminalRuleCall_21_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAttributeRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"readExcludedStates",
            	            		lv_readExcludedStates_21_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_22=(Token)match(input,47,FOLLOW_47_in_ruleAttribute5117); 

                	newLeafNode(otherlv_22, grammarAccess.getAttributeAccess().getWriteExcludedStatesKeyword_22());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2897:1: ( (lv_writeExcludedStates_23_0= RULE_STRING ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_STRING) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2898:1: (lv_writeExcludedStates_23_0= RULE_STRING )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2898:1: (lv_writeExcludedStates_23_0= RULE_STRING )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2899:3: lv_writeExcludedStates_23_0= RULE_STRING
            	    {
            	    lv_writeExcludedStates_23_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute5134); 

            	    			newLeafNode(lv_writeExcludedStates_23_0, grammarAccess.getAttributeAccess().getWriteExcludedStatesSTRINGTerminalRuleCall_23_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAttributeRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"writeExcludedStates",
            	            		lv_writeExcludedStates_23_0, 
            	            		"STRING");
            	    	    

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleFireEvents"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2923:1: entryRuleFireEvents returns [EObject current=null] : iv_ruleFireEvents= ruleFireEvents EOF ;
    public final EObject entryRuleFireEvents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFireEvents = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2924:2: (iv_ruleFireEvents= ruleFireEvents EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2925:2: iv_ruleFireEvents= ruleFireEvents EOF
            {
             newCompositeNode(grammarAccess.getFireEventsRule()); 
            pushFollow(FOLLOW_ruleFireEvents_in_entryRuleFireEvents5176);
            iv_ruleFireEvents=ruleFireEvents();

            state._fsp--;

             current =iv_ruleFireEvents; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFireEvents5186); 

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
    // $ANTLR end "entryRuleFireEvents"


    // $ANTLR start "ruleFireEvents"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2932:1: ruleFireEvents returns [EObject current=null] : ( ( (lv_fire_0_0= ruleBoolean ) ) ( (lv_libCheckCriteria_1_0= ruleBoolean ) ) ) ;
    public final EObject ruleFireEvents() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_fire_0_0 = null;

        AntlrDatatypeRuleToken lv_libCheckCriteria_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2935:28: ( ( ( (lv_fire_0_0= ruleBoolean ) ) ( (lv_libCheckCriteria_1_0= ruleBoolean ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2936:1: ( ( (lv_fire_0_0= ruleBoolean ) ) ( (lv_libCheckCriteria_1_0= ruleBoolean ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2936:1: ( ( (lv_fire_0_0= ruleBoolean ) ) ( (lv_libCheckCriteria_1_0= ruleBoolean ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2936:2: ( (lv_fire_0_0= ruleBoolean ) ) ( (lv_libCheckCriteria_1_0= ruleBoolean ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2936:2: ( (lv_fire_0_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2937:1: (lv_fire_0_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2937:1: (lv_fire_0_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2938:3: lv_fire_0_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getFireEventsAccess().getFireBooleanParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleFireEvents5232);
            lv_fire_0_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFireEventsRule());
            	        }
                   		set(
                   			current, 
                   			"fire",
                    		lv_fire_0_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2954:2: ( (lv_libCheckCriteria_1_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2955:1: (lv_libCheckCriteria_1_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2955:1: (lv_libCheckCriteria_1_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2956:3: lv_libCheckCriteria_1_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getFireEventsAccess().getLibCheckCriteriaBooleanParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleFireEvents5253);
            lv_libCheckCriteria_1_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFireEventsRule());
            	        }
                   		set(
                   			current, 
                   			"libCheckCriteria",
                    		lv_libCheckCriteria_1_0, 
                    		"Boolean");
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
    // $ANTLR end "ruleFireEvents"


    // $ANTLR start "entryRuleEventCriteria"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2980:1: entryRuleEventCriteria returns [EObject current=null] : iv_ruleEventCriteria= ruleEventCriteria EOF ;
    public final EObject entryRuleEventCriteria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventCriteria = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2981:2: (iv_ruleEventCriteria= ruleEventCriteria EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2982:2: iv_ruleEventCriteria= ruleEventCriteria EOF
            {
             newCompositeNode(grammarAccess.getEventCriteriaRule()); 
            pushFollow(FOLLOW_ruleEventCriteria_in_entryRuleEventCriteria5289);
            iv_ruleEventCriteria=ruleEventCriteria();

            state._fsp--;

             current =iv_ruleEventCriteria; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventCriteria5299); 

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
    // $ANTLR end "entryRuleEventCriteria"


    // $ANTLR start "ruleEventCriteria"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2989:1: ruleEventCriteria returns [EObject current=null] : ( ( (lv_relChange_0_0= RULE_STRING ) ) ( (lv_absChange_1_0= RULE_STRING ) ) ( (lv_period_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEventCriteria() throws RecognitionException {
        EObject current = null;

        Token lv_relChange_0_0=null;
        Token lv_absChange_1_0=null;
        Token lv_period_2_0=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2992:28: ( ( ( (lv_relChange_0_0= RULE_STRING ) ) ( (lv_absChange_1_0= RULE_STRING ) ) ( (lv_period_2_0= RULE_STRING ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2993:1: ( ( (lv_relChange_0_0= RULE_STRING ) ) ( (lv_absChange_1_0= RULE_STRING ) ) ( (lv_period_2_0= RULE_STRING ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2993:1: ( ( (lv_relChange_0_0= RULE_STRING ) ) ( (lv_absChange_1_0= RULE_STRING ) ) ( (lv_period_2_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2993:2: ( (lv_relChange_0_0= RULE_STRING ) ) ( (lv_absChange_1_0= RULE_STRING ) ) ( (lv_period_2_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2993:2: ( (lv_relChange_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2994:1: (lv_relChange_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2994:1: (lv_relChange_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2995:3: lv_relChange_0_0= RULE_STRING
            {
            lv_relChange_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEventCriteria5341); 

            			newLeafNode(lv_relChange_0_0, grammarAccess.getEventCriteriaAccess().getRelChangeSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventCriteriaRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"relChange",
                    		lv_relChange_0_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3011:2: ( (lv_absChange_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3012:1: (lv_absChange_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3012:1: (lv_absChange_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3013:3: lv_absChange_1_0= RULE_STRING
            {
            lv_absChange_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEventCriteria5363); 

            			newLeafNode(lv_absChange_1_0, grammarAccess.getEventCriteriaAccess().getAbsChangeSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventCriteriaRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"absChange",
                    		lv_absChange_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3029:2: ( (lv_period_2_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3030:1: (lv_period_2_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3030:1: (lv_period_2_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3031:3: lv_period_2_0= RULE_STRING
            {
            lv_period_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEventCriteria5385); 

            			newLeafNode(lv_period_2_0, grammarAccess.getEventCriteriaAccess().getPeriodSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventCriteriaRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"period",
                    		lv_period_2_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleEventCriteria"


    // $ANTLR start "entryRuleAttrProperties"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3055:1: entryRuleAttrProperties returns [EObject current=null] : iv_ruleAttrProperties= ruleAttrProperties EOF ;
    public final EObject entryRuleAttrProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrProperties = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3056:2: (iv_ruleAttrProperties= ruleAttrProperties EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3057:2: iv_ruleAttrProperties= ruleAttrProperties EOF
            {
             newCompositeNode(grammarAccess.getAttrPropertiesRule()); 
            pushFollow(FOLLOW_ruleAttrProperties_in_entryRuleAttrProperties5426);
            iv_ruleAttrProperties=ruleAttrProperties();

            state._fsp--;

             current =iv_ruleAttrProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrProperties5436); 

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
    // $ANTLR end "entryRuleAttrProperties"


    // $ANTLR start "ruleAttrProperties"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3064:1: ruleAttrProperties returns [EObject current=null] : ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_label_1_0= RULE_STRING ) ) ( (lv_unit_2_0= RULE_STRING ) ) ( (lv_standardUnit_3_0= RULE_STRING ) ) ( (lv_displayUnit_4_0= RULE_STRING ) ) ( (lv_format_5_0= RULE_STRING ) ) ( (lv_maxValue_6_0= RULE_STRING ) ) ( (lv_minValue_7_0= RULE_STRING ) ) ( (lv_maxAlarm_8_0= RULE_STRING ) ) ( (lv_minAlarm_9_0= RULE_STRING ) ) ( (lv_maxWarning_10_0= RULE_STRING ) ) ( (lv_minWarning_11_0= RULE_STRING ) ) ( (lv_deltaTime_12_0= RULE_STRING ) ) ( (lv_deltaValue_13_0= RULE_STRING ) ) ) ;
    public final EObject ruleAttrProperties() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token lv_label_1_0=null;
        Token lv_unit_2_0=null;
        Token lv_standardUnit_3_0=null;
        Token lv_displayUnit_4_0=null;
        Token lv_format_5_0=null;
        Token lv_maxValue_6_0=null;
        Token lv_minValue_7_0=null;
        Token lv_maxAlarm_8_0=null;
        Token lv_minAlarm_9_0=null;
        Token lv_maxWarning_10_0=null;
        Token lv_minWarning_11_0=null;
        Token lv_deltaTime_12_0=null;
        Token lv_deltaValue_13_0=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3067:28: ( ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_label_1_0= RULE_STRING ) ) ( (lv_unit_2_0= RULE_STRING ) ) ( (lv_standardUnit_3_0= RULE_STRING ) ) ( (lv_displayUnit_4_0= RULE_STRING ) ) ( (lv_format_5_0= RULE_STRING ) ) ( (lv_maxValue_6_0= RULE_STRING ) ) ( (lv_minValue_7_0= RULE_STRING ) ) ( (lv_maxAlarm_8_0= RULE_STRING ) ) ( (lv_minAlarm_9_0= RULE_STRING ) ) ( (lv_maxWarning_10_0= RULE_STRING ) ) ( (lv_minWarning_11_0= RULE_STRING ) ) ( (lv_deltaTime_12_0= RULE_STRING ) ) ( (lv_deltaValue_13_0= RULE_STRING ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3068:1: ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_label_1_0= RULE_STRING ) ) ( (lv_unit_2_0= RULE_STRING ) ) ( (lv_standardUnit_3_0= RULE_STRING ) ) ( (lv_displayUnit_4_0= RULE_STRING ) ) ( (lv_format_5_0= RULE_STRING ) ) ( (lv_maxValue_6_0= RULE_STRING ) ) ( (lv_minValue_7_0= RULE_STRING ) ) ( (lv_maxAlarm_8_0= RULE_STRING ) ) ( (lv_minAlarm_9_0= RULE_STRING ) ) ( (lv_maxWarning_10_0= RULE_STRING ) ) ( (lv_minWarning_11_0= RULE_STRING ) ) ( (lv_deltaTime_12_0= RULE_STRING ) ) ( (lv_deltaValue_13_0= RULE_STRING ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3068:1: ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_label_1_0= RULE_STRING ) ) ( (lv_unit_2_0= RULE_STRING ) ) ( (lv_standardUnit_3_0= RULE_STRING ) ) ( (lv_displayUnit_4_0= RULE_STRING ) ) ( (lv_format_5_0= RULE_STRING ) ) ( (lv_maxValue_6_0= RULE_STRING ) ) ( (lv_minValue_7_0= RULE_STRING ) ) ( (lv_maxAlarm_8_0= RULE_STRING ) ) ( (lv_minAlarm_9_0= RULE_STRING ) ) ( (lv_maxWarning_10_0= RULE_STRING ) ) ( (lv_minWarning_11_0= RULE_STRING ) ) ( (lv_deltaTime_12_0= RULE_STRING ) ) ( (lv_deltaValue_13_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3068:2: ( (lv_description_0_0= RULE_STRING ) ) ( (lv_label_1_0= RULE_STRING ) ) ( (lv_unit_2_0= RULE_STRING ) ) ( (lv_standardUnit_3_0= RULE_STRING ) ) ( (lv_displayUnit_4_0= RULE_STRING ) ) ( (lv_format_5_0= RULE_STRING ) ) ( (lv_maxValue_6_0= RULE_STRING ) ) ( (lv_minValue_7_0= RULE_STRING ) ) ( (lv_maxAlarm_8_0= RULE_STRING ) ) ( (lv_minAlarm_9_0= RULE_STRING ) ) ( (lv_maxWarning_10_0= RULE_STRING ) ) ( (lv_minWarning_11_0= RULE_STRING ) ) ( (lv_deltaTime_12_0= RULE_STRING ) ) ( (lv_deltaValue_13_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3068:2: ( (lv_description_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3069:1: (lv_description_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3069:1: (lv_description_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3070:3: lv_description_0_0= RULE_STRING
            {
            lv_description_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5478); 

            			newLeafNode(lv_description_0_0, grammarAccess.getAttrPropertiesAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttrPropertiesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_0_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3086:2: ( (lv_label_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3087:1: (lv_label_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3087:1: (lv_label_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3088:3: lv_label_1_0= RULE_STRING
            {
            lv_label_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5500); 

            			newLeafNode(lv_label_1_0, grammarAccess.getAttrPropertiesAccess().getLabelSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttrPropertiesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3104:2: ( (lv_unit_2_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3105:1: (lv_unit_2_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3105:1: (lv_unit_2_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3106:3: lv_unit_2_0= RULE_STRING
            {
            lv_unit_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5522); 

            			newLeafNode(lv_unit_2_0, grammarAccess.getAttrPropertiesAccess().getUnitSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttrPropertiesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"unit",
                    		lv_unit_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3122:2: ( (lv_standardUnit_3_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3123:1: (lv_standardUnit_3_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3123:1: (lv_standardUnit_3_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3124:3: lv_standardUnit_3_0= RULE_STRING
            {
            lv_standardUnit_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5544); 

            			newLeafNode(lv_standardUnit_3_0, grammarAccess.getAttrPropertiesAccess().getStandardUnitSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttrPropertiesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"standardUnit",
                    		lv_standardUnit_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3140:2: ( (lv_displayUnit_4_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3141:1: (lv_displayUnit_4_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3141:1: (lv_displayUnit_4_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3142:3: lv_displayUnit_4_0= RULE_STRING
            {
            lv_displayUnit_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5566); 

            			newLeafNode(lv_displayUnit_4_0, grammarAccess.getAttrPropertiesAccess().getDisplayUnitSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttrPropertiesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"displayUnit",
                    		lv_displayUnit_4_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3158:2: ( (lv_format_5_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3159:1: (lv_format_5_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3159:1: (lv_format_5_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3160:3: lv_format_5_0= RULE_STRING
            {
            lv_format_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5588); 

            			newLeafNode(lv_format_5_0, grammarAccess.getAttrPropertiesAccess().getFormatSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttrPropertiesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"format",
                    		lv_format_5_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3176:2: ( (lv_maxValue_6_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3177:1: (lv_maxValue_6_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3177:1: (lv_maxValue_6_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3178:3: lv_maxValue_6_0= RULE_STRING
            {
            lv_maxValue_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5610); 

            			newLeafNode(lv_maxValue_6_0, grammarAccess.getAttrPropertiesAccess().getMaxValueSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttrPropertiesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"maxValue",
                    		lv_maxValue_6_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3194:2: ( (lv_minValue_7_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3195:1: (lv_minValue_7_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3195:1: (lv_minValue_7_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3196:3: lv_minValue_7_0= RULE_STRING
            {
            lv_minValue_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5632); 

            			newLeafNode(lv_minValue_7_0, grammarAccess.getAttrPropertiesAccess().getMinValueSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttrPropertiesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"minValue",
                    		lv_minValue_7_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3212:2: ( (lv_maxAlarm_8_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3213:1: (lv_maxAlarm_8_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3213:1: (lv_maxAlarm_8_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3214:3: lv_maxAlarm_8_0= RULE_STRING
            {
            lv_maxAlarm_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5654); 

            			newLeafNode(lv_maxAlarm_8_0, grammarAccess.getAttrPropertiesAccess().getMaxAlarmSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttrPropertiesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"maxAlarm",
                    		lv_maxAlarm_8_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3230:2: ( (lv_minAlarm_9_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3231:1: (lv_minAlarm_9_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3231:1: (lv_minAlarm_9_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3232:3: lv_minAlarm_9_0= RULE_STRING
            {
            lv_minAlarm_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5676); 

            			newLeafNode(lv_minAlarm_9_0, grammarAccess.getAttrPropertiesAccess().getMinAlarmSTRINGTerminalRuleCall_9_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttrPropertiesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"minAlarm",
                    		lv_minAlarm_9_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3248:2: ( (lv_maxWarning_10_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3249:1: (lv_maxWarning_10_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3249:1: (lv_maxWarning_10_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3250:3: lv_maxWarning_10_0= RULE_STRING
            {
            lv_maxWarning_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5698); 

            			newLeafNode(lv_maxWarning_10_0, grammarAccess.getAttrPropertiesAccess().getMaxWarningSTRINGTerminalRuleCall_10_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttrPropertiesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"maxWarning",
                    		lv_maxWarning_10_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3266:2: ( (lv_minWarning_11_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3267:1: (lv_minWarning_11_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3267:1: (lv_minWarning_11_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3268:3: lv_minWarning_11_0= RULE_STRING
            {
            lv_minWarning_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5720); 

            			newLeafNode(lv_minWarning_11_0, grammarAccess.getAttrPropertiesAccess().getMinWarningSTRINGTerminalRuleCall_11_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttrPropertiesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"minWarning",
                    		lv_minWarning_11_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3284:2: ( (lv_deltaTime_12_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3285:1: (lv_deltaTime_12_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3285:1: (lv_deltaTime_12_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3286:3: lv_deltaTime_12_0= RULE_STRING
            {
            lv_deltaTime_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5742); 

            			newLeafNode(lv_deltaTime_12_0, grammarAccess.getAttrPropertiesAccess().getDeltaTimeSTRINGTerminalRuleCall_12_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttrPropertiesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"deltaTime",
                    		lv_deltaTime_12_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3302:2: ( (lv_deltaValue_13_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3303:1: (lv_deltaValue_13_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3303:1: (lv_deltaValue_13_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3304:3: lv_deltaValue_13_0= RULE_STRING
            {
            lv_deltaValue_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5764); 

            			newLeafNode(lv_deltaValue_13_0, grammarAccess.getAttrPropertiesAccess().getDeltaValueSTRINGTerminalRuleCall_13_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttrPropertiesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"deltaValue",
                    		lv_deltaValue_13_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleAttrProperties"


    // $ANTLR start "entryRuleAdditionalFile"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3328:1: entryRuleAdditionalFile returns [EObject current=null] : iv_ruleAdditionalFile= ruleAdditionalFile EOF ;
    public final EObject entryRuleAdditionalFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionalFile = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3329:2: (iv_ruleAdditionalFile= ruleAdditionalFile EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3330:2: iv_ruleAdditionalFile= ruleAdditionalFile EOF
            {
             newCompositeNode(grammarAccess.getAdditionalFileRule()); 
            pushFollow(FOLLOW_ruleAdditionalFile_in_entryRuleAdditionalFile5805);
            iv_ruleAdditionalFile=ruleAdditionalFile();

            state._fsp--;

             current =iv_ruleAdditionalFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionalFile5815); 

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
    // $ANTLR end "entryRuleAdditionalFile"


    // $ANTLR start "ruleAdditionalFile"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3337:1: ruleAdditionalFile returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_path_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAdditionalFile() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_path_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3340:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_path_1_0= RULE_STRING ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3341:1: ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_path_1_0= RULE_STRING ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3341:1: ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_path_1_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3341:2: ( (lv_name_0_0= RULE_STRING ) ) ( (lv_path_1_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3341:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3342:1: (lv_name_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3342:1: (lv_name_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3343:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAdditionalFile5857); 

            			newLeafNode(lv_name_0_0, grammarAccess.getAdditionalFileAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAdditionalFileRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3359:2: ( (lv_path_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3360:1: (lv_path_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3360:1: (lv_path_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3361:3: lv_path_1_0= RULE_STRING
            {
            lv_path_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAdditionalFile5879); 

            			newLeafNode(lv_path_1_0, grammarAccess.getAdditionalFileAccess().getPathSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAdditionalFileRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"path",
                    		lv_path_1_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleAdditionalFile"


    // $ANTLR start "entryRuleOverlodedPollPeriodObject"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3385:1: entryRuleOverlodedPollPeriodObject returns [EObject current=null] : iv_ruleOverlodedPollPeriodObject= ruleOverlodedPollPeriodObject EOF ;
    public final EObject entryRuleOverlodedPollPeriodObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverlodedPollPeriodObject = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3386:2: (iv_ruleOverlodedPollPeriodObject= ruleOverlodedPollPeriodObject EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3387:2: iv_ruleOverlodedPollPeriodObject= ruleOverlodedPollPeriodObject EOF
            {
             newCompositeNode(grammarAccess.getOverlodedPollPeriodObjectRule()); 
            pushFollow(FOLLOW_ruleOverlodedPollPeriodObject_in_entryRuleOverlodedPollPeriodObject5920);
            iv_ruleOverlodedPollPeriodObject=ruleOverlodedPollPeriodObject();

            state._fsp--;

             current =iv_ruleOverlodedPollPeriodObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverlodedPollPeriodObject5930); 

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
    // $ANTLR end "entryRuleOverlodedPollPeriodObject"


    // $ANTLR start "ruleOverlodedPollPeriodObject"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3394:1: ruleOverlodedPollPeriodObject returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_type_1_0= RULE_STRING ) ) ( (lv_pollPeriod_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleOverlodedPollPeriodObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_type_1_0=null;
        Token lv_pollPeriod_2_0=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3397:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_type_1_0= RULE_STRING ) ) ( (lv_pollPeriod_2_0= RULE_STRING ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3398:1: ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_type_1_0= RULE_STRING ) ) ( (lv_pollPeriod_2_0= RULE_STRING ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3398:1: ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_type_1_0= RULE_STRING ) ) ( (lv_pollPeriod_2_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3398:2: ( (lv_name_0_0= RULE_STRING ) ) ( (lv_type_1_0= RULE_STRING ) ) ( (lv_pollPeriod_2_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3398:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3399:1: (lv_name_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3399:1: (lv_name_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3400:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOverlodedPollPeriodObject5972); 

            			newLeafNode(lv_name_0_0, grammarAccess.getOverlodedPollPeriodObjectAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOverlodedPollPeriodObjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3416:2: ( (lv_type_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3417:1: (lv_type_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3417:1: (lv_type_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3418:3: lv_type_1_0= RULE_STRING
            {
            lv_type_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOverlodedPollPeriodObject5994); 

            			newLeafNode(lv_type_1_0, grammarAccess.getOverlodedPollPeriodObjectAccess().getTypeSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOverlodedPollPeriodObjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3434:2: ( (lv_pollPeriod_2_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3435:1: (lv_pollPeriod_2_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3435:1: (lv_pollPeriod_2_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3436:3: lv_pollPeriod_2_0= RULE_STRING
            {
            lv_pollPeriod_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOverlodedPollPeriodObject6016); 

            			newLeafNode(lv_pollPeriod_2_0, grammarAccess.getOverlodedPollPeriodObjectAccess().getPollPeriodSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOverlodedPollPeriodObjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"pollPeriod",
                    		lv_pollPeriod_2_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleOverlodedPollPeriodObject"


    // $ANTLR start "entryRuleType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3460:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3461:2: (iv_ruleType= ruleType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3462:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType6057);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType6067); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3469:1: ruleType returns [EObject current=null] : (this_VoidType_0= ruleVoidType | this_BooleanType_1= ruleBooleanType | this_ShortType_2= ruleShortType | this_UShortType_3= ruleUShortType | this_IntType_4= ruleIntType | this_UIntType_5= ruleUIntType | this_FloatType_6= ruleFloatType | this_DoubleType_7= ruleDoubleType | this_StringType_8= ruleStringType | this_CharArrayType_9= ruleCharArrayType | this_ShortArrayType_10= ruleShortArrayType | this_UShortArrayType_11= ruleUShortArrayType | this_IntArrayType_12= ruleIntArrayType | this_UIntArrayType_13= ruleUIntArrayType | this_FloatArrayType_14= ruleFloatArrayType | this_DoubleArrayType_15= ruleDoubleArrayType | this_StringArrayType_16= ruleStringArrayType | this_LongStringArrayType_17= ruleLongStringArrayType | this_DoubleStringArrayType_18= ruleDoubleStringArrayType | this_StateType_19= ruleStateType | this_ConstStringType_20= ruleConstStringType | this_BooleanArrayType_21= ruleBooleanArrayType | this_LongType_22= ruleLongType | this_ULongType_23= ruleULongType | this_UCharType_24= ruleUCharType | this_LongArrayType_25= ruleLongArrayType | this_ULongArrayType_26= ruleULongArrayType | this_DevIntType_27= ruleDevIntType | this_EncodedType_28= ruleEncodedType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_VoidType_0 = null;

        EObject this_BooleanType_1 = null;

        EObject this_ShortType_2 = null;

        EObject this_UShortType_3 = null;

        EObject this_IntType_4 = null;

        EObject this_UIntType_5 = null;

        EObject this_FloatType_6 = null;

        EObject this_DoubleType_7 = null;

        EObject this_StringType_8 = null;

        EObject this_CharArrayType_9 = null;

        EObject this_ShortArrayType_10 = null;

        EObject this_UShortArrayType_11 = null;

        EObject this_IntArrayType_12 = null;

        EObject this_UIntArrayType_13 = null;

        EObject this_FloatArrayType_14 = null;

        EObject this_DoubleArrayType_15 = null;

        EObject this_StringArrayType_16 = null;

        EObject this_LongStringArrayType_17 = null;

        EObject this_DoubleStringArrayType_18 = null;

        EObject this_StateType_19 = null;

        EObject this_ConstStringType_20 = null;

        EObject this_BooleanArrayType_21 = null;

        EObject this_LongType_22 = null;

        EObject this_ULongType_23 = null;

        EObject this_UCharType_24 = null;

        EObject this_LongArrayType_25 = null;

        EObject this_ULongArrayType_26 = null;

        EObject this_DevIntType_27 = null;

        EObject this_EncodedType_28 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3472:28: ( (this_VoidType_0= ruleVoidType | this_BooleanType_1= ruleBooleanType | this_ShortType_2= ruleShortType | this_UShortType_3= ruleUShortType | this_IntType_4= ruleIntType | this_UIntType_5= ruleUIntType | this_FloatType_6= ruleFloatType | this_DoubleType_7= ruleDoubleType | this_StringType_8= ruleStringType | this_CharArrayType_9= ruleCharArrayType | this_ShortArrayType_10= ruleShortArrayType | this_UShortArrayType_11= ruleUShortArrayType | this_IntArrayType_12= ruleIntArrayType | this_UIntArrayType_13= ruleUIntArrayType | this_FloatArrayType_14= ruleFloatArrayType | this_DoubleArrayType_15= ruleDoubleArrayType | this_StringArrayType_16= ruleStringArrayType | this_LongStringArrayType_17= ruleLongStringArrayType | this_DoubleStringArrayType_18= ruleDoubleStringArrayType | this_StateType_19= ruleStateType | this_ConstStringType_20= ruleConstStringType | this_BooleanArrayType_21= ruleBooleanArrayType | this_LongType_22= ruleLongType | this_ULongType_23= ruleULongType | this_UCharType_24= ruleUCharType | this_LongArrayType_25= ruleLongArrayType | this_ULongArrayType_26= ruleULongArrayType | this_DevIntType_27= ruleDevIntType | this_EncodedType_28= ruleEncodedType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3473:1: (this_VoidType_0= ruleVoidType | this_BooleanType_1= ruleBooleanType | this_ShortType_2= ruleShortType | this_UShortType_3= ruleUShortType | this_IntType_4= ruleIntType | this_UIntType_5= ruleUIntType | this_FloatType_6= ruleFloatType | this_DoubleType_7= ruleDoubleType | this_StringType_8= ruleStringType | this_CharArrayType_9= ruleCharArrayType | this_ShortArrayType_10= ruleShortArrayType | this_UShortArrayType_11= ruleUShortArrayType | this_IntArrayType_12= ruleIntArrayType | this_UIntArrayType_13= ruleUIntArrayType | this_FloatArrayType_14= ruleFloatArrayType | this_DoubleArrayType_15= ruleDoubleArrayType | this_StringArrayType_16= ruleStringArrayType | this_LongStringArrayType_17= ruleLongStringArrayType | this_DoubleStringArrayType_18= ruleDoubleStringArrayType | this_StateType_19= ruleStateType | this_ConstStringType_20= ruleConstStringType | this_BooleanArrayType_21= ruleBooleanArrayType | this_LongType_22= ruleLongType | this_ULongType_23= ruleULongType | this_UCharType_24= ruleUCharType | this_LongArrayType_25= ruleLongArrayType | this_ULongArrayType_26= ruleULongArrayType | this_DevIntType_27= ruleDevIntType | this_EncodedType_28= ruleEncodedType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3473:1: (this_VoidType_0= ruleVoidType | this_BooleanType_1= ruleBooleanType | this_ShortType_2= ruleShortType | this_UShortType_3= ruleUShortType | this_IntType_4= ruleIntType | this_UIntType_5= ruleUIntType | this_FloatType_6= ruleFloatType | this_DoubleType_7= ruleDoubleType | this_StringType_8= ruleStringType | this_CharArrayType_9= ruleCharArrayType | this_ShortArrayType_10= ruleShortArrayType | this_UShortArrayType_11= ruleUShortArrayType | this_IntArrayType_12= ruleIntArrayType | this_UIntArrayType_13= ruleUIntArrayType | this_FloatArrayType_14= ruleFloatArrayType | this_DoubleArrayType_15= ruleDoubleArrayType | this_StringArrayType_16= ruleStringArrayType | this_LongStringArrayType_17= ruleLongStringArrayType | this_DoubleStringArrayType_18= ruleDoubleStringArrayType | this_StateType_19= ruleStateType | this_ConstStringType_20= ruleConstStringType | this_BooleanArrayType_21= ruleBooleanArrayType | this_LongType_22= ruleLongType | this_ULongType_23= ruleULongType | this_UCharType_24= ruleUCharType | this_LongArrayType_25= ruleLongArrayType | this_ULongArrayType_26= ruleULongArrayType | this_DevIntType_27= ruleDevIntType | this_EncodedType_28= ruleEncodedType )
            int alt27=29;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt27=1;
                }
                break;
            case 49:
                {
                alt27=2;
                }
                break;
            case 50:
                {
                alt27=3;
                }
                break;
            case 51:
                {
                alt27=4;
                }
                break;
            case 52:
                {
                alt27=5;
                }
                break;
            case 53:
                {
                alt27=6;
                }
                break;
            case 54:
                {
                alt27=7;
                }
                break;
            case 55:
                {
                alt27=8;
                }
                break;
            case 56:
                {
                alt27=9;
                }
                break;
            case 57:
                {
                alt27=10;
                }
                break;
            case 58:
                {
                alt27=11;
                }
                break;
            case 59:
                {
                alt27=12;
                }
                break;
            case 60:
                {
                alt27=13;
                }
                break;
            case 61:
                {
                alt27=14;
                }
                break;
            case 62:
                {
                alt27=15;
                }
                break;
            case 63:
                {
                alt27=16;
                }
                break;
            case 64:
                {
                alt27=17;
                }
                break;
            case 65:
                {
                alt27=18;
                }
                break;
            case 66:
                {
                alt27=19;
                }
                break;
            case 67:
                {
                alt27=20;
                }
                break;
            case 68:
                {
                alt27=21;
                }
                break;
            case 69:
                {
                alt27=22;
                }
                break;
            case 71:
                {
                alt27=23;
                }
                break;
            case 72:
                {
                alt27=24;
                }
                break;
            case 70:
                {
                alt27=25;
                }
                break;
            case 73:
                {
                alt27=26;
                }
                break;
            case 74:
                {
                alt27=27;
                }
                break;
            case 75:
                {
                alt27=28;
                }
                break;
            case 76:
                {
                alt27=29;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3474:5: this_VoidType_0= ruleVoidType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getVoidTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVoidType_in_ruleType6114);
                    this_VoidType_0=ruleVoidType();

                    state._fsp--;

                     
                            current = this_VoidType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3484:5: this_BooleanType_1= ruleBooleanType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getBooleanTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBooleanType_in_ruleType6141);
                    this_BooleanType_1=ruleBooleanType();

                    state._fsp--;

                     
                            current = this_BooleanType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3494:5: this_ShortType_2= ruleShortType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getShortTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleShortType_in_ruleType6168);
                    this_ShortType_2=ruleShortType();

                    state._fsp--;

                     
                            current = this_ShortType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3504:5: this_UShortType_3= ruleUShortType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getUShortTypeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleUShortType_in_ruleType6195);
                    this_UShortType_3=ruleUShortType();

                    state._fsp--;

                     
                            current = this_UShortType_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3514:5: this_IntType_4= ruleIntType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getIntTypeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleIntType_in_ruleType6222);
                    this_IntType_4=ruleIntType();

                    state._fsp--;

                     
                            current = this_IntType_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3524:5: this_UIntType_5= ruleUIntType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getUIntTypeParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleUIntType_in_ruleType6249);
                    this_UIntType_5=ruleUIntType();

                    state._fsp--;

                     
                            current = this_UIntType_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3534:5: this_FloatType_6= ruleFloatType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getFloatTypeParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleFloatType_in_ruleType6276);
                    this_FloatType_6=ruleFloatType();

                    state._fsp--;

                     
                            current = this_FloatType_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3544:5: this_DoubleType_7= ruleDoubleType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDoubleTypeParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleDoubleType_in_ruleType6303);
                    this_DoubleType_7=ruleDoubleType();

                    state._fsp--;

                     
                            current = this_DoubleType_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3554:5: this_StringType_8= ruleStringType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getStringTypeParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleStringType_in_ruleType6330);
                    this_StringType_8=ruleStringType();

                    state._fsp--;

                     
                            current = this_StringType_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3564:5: this_CharArrayType_9= ruleCharArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getCharArrayTypeParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleCharArrayType_in_ruleType6357);
                    this_CharArrayType_9=ruleCharArrayType();

                    state._fsp--;

                     
                            current = this_CharArrayType_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3574:5: this_ShortArrayType_10= ruleShortArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getShortArrayTypeParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleShortArrayType_in_ruleType6384);
                    this_ShortArrayType_10=ruleShortArrayType();

                    state._fsp--;

                     
                            current = this_ShortArrayType_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3584:5: this_UShortArrayType_11= ruleUShortArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getUShortArrayTypeParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleUShortArrayType_in_ruleType6411);
                    this_UShortArrayType_11=ruleUShortArrayType();

                    state._fsp--;

                     
                            current = this_UShortArrayType_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3594:5: this_IntArrayType_12= ruleIntArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getIntArrayTypeParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleIntArrayType_in_ruleType6438);
                    this_IntArrayType_12=ruleIntArrayType();

                    state._fsp--;

                     
                            current = this_IntArrayType_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3604:5: this_UIntArrayType_13= ruleUIntArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getUIntArrayTypeParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleUIntArrayType_in_ruleType6465);
                    this_UIntArrayType_13=ruleUIntArrayType();

                    state._fsp--;

                     
                            current = this_UIntArrayType_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3614:5: this_FloatArrayType_14= ruleFloatArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getFloatArrayTypeParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_ruleFloatArrayType_in_ruleType6492);
                    this_FloatArrayType_14=ruleFloatArrayType();

                    state._fsp--;

                     
                            current = this_FloatArrayType_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 16 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3624:5: this_DoubleArrayType_15= ruleDoubleArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDoubleArrayTypeParserRuleCall_15()); 
                        
                    pushFollow(FOLLOW_ruleDoubleArrayType_in_ruleType6519);
                    this_DoubleArrayType_15=ruleDoubleArrayType();

                    state._fsp--;

                     
                            current = this_DoubleArrayType_15; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 17 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3634:5: this_StringArrayType_16= ruleStringArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getStringArrayTypeParserRuleCall_16()); 
                        
                    pushFollow(FOLLOW_ruleStringArrayType_in_ruleType6546);
                    this_StringArrayType_16=ruleStringArrayType();

                    state._fsp--;

                     
                            current = this_StringArrayType_16; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 18 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3644:5: this_LongStringArrayType_17= ruleLongStringArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getLongStringArrayTypeParserRuleCall_17()); 
                        
                    pushFollow(FOLLOW_ruleLongStringArrayType_in_ruleType6573);
                    this_LongStringArrayType_17=ruleLongStringArrayType();

                    state._fsp--;

                     
                            current = this_LongStringArrayType_17; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 19 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3654:5: this_DoubleStringArrayType_18= ruleDoubleStringArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDoubleStringArrayTypeParserRuleCall_18()); 
                        
                    pushFollow(FOLLOW_ruleDoubleStringArrayType_in_ruleType6600);
                    this_DoubleStringArrayType_18=ruleDoubleStringArrayType();

                    state._fsp--;

                     
                            current = this_DoubleStringArrayType_18; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 20 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3664:5: this_StateType_19= ruleStateType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getStateTypeParserRuleCall_19()); 
                        
                    pushFollow(FOLLOW_ruleStateType_in_ruleType6627);
                    this_StateType_19=ruleStateType();

                    state._fsp--;

                     
                            current = this_StateType_19; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 21 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3674:5: this_ConstStringType_20= ruleConstStringType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getConstStringTypeParserRuleCall_20()); 
                        
                    pushFollow(FOLLOW_ruleConstStringType_in_ruleType6654);
                    this_ConstStringType_20=ruleConstStringType();

                    state._fsp--;

                     
                            current = this_ConstStringType_20; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 22 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3684:5: this_BooleanArrayType_21= ruleBooleanArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getBooleanArrayTypeParserRuleCall_21()); 
                        
                    pushFollow(FOLLOW_ruleBooleanArrayType_in_ruleType6681);
                    this_BooleanArrayType_21=ruleBooleanArrayType();

                    state._fsp--;

                     
                            current = this_BooleanArrayType_21; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 23 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3694:5: this_LongType_22= ruleLongType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getLongTypeParserRuleCall_22()); 
                        
                    pushFollow(FOLLOW_ruleLongType_in_ruleType6708);
                    this_LongType_22=ruleLongType();

                    state._fsp--;

                     
                            current = this_LongType_22; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 24 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3704:5: this_ULongType_23= ruleULongType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getULongTypeParserRuleCall_23()); 
                        
                    pushFollow(FOLLOW_ruleULongType_in_ruleType6735);
                    this_ULongType_23=ruleULongType();

                    state._fsp--;

                     
                            current = this_ULongType_23; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 25 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3714:5: this_UCharType_24= ruleUCharType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getUCharTypeParserRuleCall_24()); 
                        
                    pushFollow(FOLLOW_ruleUCharType_in_ruleType6762);
                    this_UCharType_24=ruleUCharType();

                    state._fsp--;

                     
                            current = this_UCharType_24; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 26 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3724:5: this_LongArrayType_25= ruleLongArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getLongArrayTypeParserRuleCall_25()); 
                        
                    pushFollow(FOLLOW_ruleLongArrayType_in_ruleType6789);
                    this_LongArrayType_25=ruleLongArrayType();

                    state._fsp--;

                     
                            current = this_LongArrayType_25; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 27 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3734:5: this_ULongArrayType_26= ruleULongArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getULongArrayTypeParserRuleCall_26()); 
                        
                    pushFollow(FOLLOW_ruleULongArrayType_in_ruleType6816);
                    this_ULongArrayType_26=ruleULongArrayType();

                    state._fsp--;

                     
                            current = this_ULongArrayType_26; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 28 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3744:5: this_DevIntType_27= ruleDevIntType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDevIntTypeParserRuleCall_27()); 
                        
                    pushFollow(FOLLOW_ruleDevIntType_in_ruleType6843);
                    this_DevIntType_27=ruleDevIntType();

                    state._fsp--;

                     
                            current = this_DevIntType_27; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 29 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3754:5: this_EncodedType_28= ruleEncodedType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getEncodedTypeParserRuleCall_28()); 
                        
                    pushFollow(FOLLOW_ruleEncodedType_in_ruleType6870);
                    this_EncodedType_28=ruleEncodedType();

                    state._fsp--;

                     
                            current = this_EncodedType_28; 
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleVoidType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3770:1: entryRuleVoidType returns [EObject current=null] : iv_ruleVoidType= ruleVoidType EOF ;
    public final EObject entryRuleVoidType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoidType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3771:2: (iv_ruleVoidType= ruleVoidType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3772:2: iv_ruleVoidType= ruleVoidType EOF
            {
             newCompositeNode(grammarAccess.getVoidTypeRule()); 
            pushFollow(FOLLOW_ruleVoidType_in_entryRuleVoidType6905);
            iv_ruleVoidType=ruleVoidType();

            state._fsp--;

             current =iv_ruleVoidType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVoidType6915); 

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
    // $ANTLR end "entryRuleVoidType"


    // $ANTLR start "ruleVoidType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3779:1: ruleVoidType returns [EObject current=null] : ( () otherlv_1= 'void' ) ;
    public final EObject ruleVoidType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3782:28: ( ( () otherlv_1= 'void' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3783:1: ( () otherlv_1= 'void' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3783:1: ( () otherlv_1= 'void' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3783:2: () otherlv_1= 'void'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3783:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3784:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVoidTypeAccess().getVoidTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleVoidType6961); 

                	newLeafNode(otherlv_1, grammarAccess.getVoidTypeAccess().getVoidKeyword_1());
                

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
    // $ANTLR end "ruleVoidType"


    // $ANTLR start "entryRuleBooleanType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3801:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3802:2: (iv_ruleBooleanType= ruleBooleanType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3803:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
             newCompositeNode(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanType_in_entryRuleBooleanType6997);
            iv_ruleBooleanType=ruleBooleanType();

            state._fsp--;

             current =iv_ruleBooleanType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanType7007); 

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
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3810:1: ruleBooleanType returns [EObject current=null] : ( () otherlv_1= 'boolean' ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3813:28: ( ( () otherlv_1= 'boolean' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3814:1: ( () otherlv_1= 'boolean' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3814:1: ( () otherlv_1= 'boolean' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3814:2: () otherlv_1= 'boolean'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3814:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3815:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleBooleanType7053); 

                	newLeafNode(otherlv_1, grammarAccess.getBooleanTypeAccess().getBooleanKeyword_1());
                

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
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleShortType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3832:1: entryRuleShortType returns [EObject current=null] : iv_ruleShortType= ruleShortType EOF ;
    public final EObject entryRuleShortType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3833:2: (iv_ruleShortType= ruleShortType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3834:2: iv_ruleShortType= ruleShortType EOF
            {
             newCompositeNode(grammarAccess.getShortTypeRule()); 
            pushFollow(FOLLOW_ruleShortType_in_entryRuleShortType7089);
            iv_ruleShortType=ruleShortType();

            state._fsp--;

             current =iv_ruleShortType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortType7099); 

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
    // $ANTLR end "entryRuleShortType"


    // $ANTLR start "ruleShortType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3841:1: ruleShortType returns [EObject current=null] : ( () otherlv_1= 'short' ) ;
    public final EObject ruleShortType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3844:28: ( ( () otherlv_1= 'short' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3845:1: ( () otherlv_1= 'short' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3845:1: ( () otherlv_1= 'short' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3845:2: () otherlv_1= 'short'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3845:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3846:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getShortTypeAccess().getShortTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleShortType7145); 

                	newLeafNode(otherlv_1, grammarAccess.getShortTypeAccess().getShortKeyword_1());
                

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
    // $ANTLR end "ruleShortType"


    // $ANTLR start "entryRuleUShortType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3863:1: entryRuleUShortType returns [EObject current=null] : iv_ruleUShortType= ruleUShortType EOF ;
    public final EObject entryRuleUShortType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUShortType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3864:2: (iv_ruleUShortType= ruleUShortType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3865:2: iv_ruleUShortType= ruleUShortType EOF
            {
             newCompositeNode(grammarAccess.getUShortTypeRule()); 
            pushFollow(FOLLOW_ruleUShortType_in_entryRuleUShortType7181);
            iv_ruleUShortType=ruleUShortType();

            state._fsp--;

             current =iv_ruleUShortType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUShortType7191); 

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
    // $ANTLR end "entryRuleUShortType"


    // $ANTLR start "ruleUShortType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3872:1: ruleUShortType returns [EObject current=null] : ( () otherlv_1= 'ushort' ) ;
    public final EObject ruleUShortType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3875:28: ( ( () otherlv_1= 'ushort' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3876:1: ( () otherlv_1= 'ushort' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3876:1: ( () otherlv_1= 'ushort' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3876:2: () otherlv_1= 'ushort'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3876:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3877:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUShortTypeAccess().getUShortTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleUShortType7237); 

                	newLeafNode(otherlv_1, grammarAccess.getUShortTypeAccess().getUshortKeyword_1());
                

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
    // $ANTLR end "ruleUShortType"


    // $ANTLR start "entryRuleIntType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3894:1: entryRuleIntType returns [EObject current=null] : iv_ruleIntType= ruleIntType EOF ;
    public final EObject entryRuleIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3895:2: (iv_ruleIntType= ruleIntType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3896:2: iv_ruleIntType= ruleIntType EOF
            {
             newCompositeNode(grammarAccess.getIntTypeRule()); 
            pushFollow(FOLLOW_ruleIntType_in_entryRuleIntType7273);
            iv_ruleIntType=ruleIntType();

            state._fsp--;

             current =iv_ruleIntType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntType7283); 

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
    // $ANTLR end "entryRuleIntType"


    // $ANTLR start "ruleIntType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3903:1: ruleIntType returns [EObject current=null] : ( () otherlv_1= 'int' ) ;
    public final EObject ruleIntType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3906:28: ( ( () otherlv_1= 'int' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3907:1: ( () otherlv_1= 'int' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3907:1: ( () otherlv_1= 'int' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3907:2: () otherlv_1= 'int'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3907:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3908:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntTypeAccess().getIntTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleIntType7329); 

                	newLeafNode(otherlv_1, grammarAccess.getIntTypeAccess().getIntKeyword_1());
                

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
    // $ANTLR end "ruleIntType"


    // $ANTLR start "entryRuleUIntType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3925:1: entryRuleUIntType returns [EObject current=null] : iv_ruleUIntType= ruleUIntType EOF ;
    public final EObject entryRuleUIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIntType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3926:2: (iv_ruleUIntType= ruleUIntType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3927:2: iv_ruleUIntType= ruleUIntType EOF
            {
             newCompositeNode(grammarAccess.getUIntTypeRule()); 
            pushFollow(FOLLOW_ruleUIntType_in_entryRuleUIntType7365);
            iv_ruleUIntType=ruleUIntType();

            state._fsp--;

             current =iv_ruleUIntType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIntType7375); 

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
    // $ANTLR end "entryRuleUIntType"


    // $ANTLR start "ruleUIntType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3934:1: ruleUIntType returns [EObject current=null] : ( () otherlv_1= 'uint' ) ;
    public final EObject ruleUIntType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3937:28: ( ( () otherlv_1= 'uint' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3938:1: ( () otherlv_1= 'uint' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3938:1: ( () otherlv_1= 'uint' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3938:2: () otherlv_1= 'uint'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3938:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3939:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUIntTypeAccess().getUIntTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleUIntType7421); 

                	newLeafNode(otherlv_1, grammarAccess.getUIntTypeAccess().getUintKeyword_1());
                

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
    // $ANTLR end "ruleUIntType"


    // $ANTLR start "entryRuleFloatType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3956:1: entryRuleFloatType returns [EObject current=null] : iv_ruleFloatType= ruleFloatType EOF ;
    public final EObject entryRuleFloatType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3957:2: (iv_ruleFloatType= ruleFloatType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3958:2: iv_ruleFloatType= ruleFloatType EOF
            {
             newCompositeNode(grammarAccess.getFloatTypeRule()); 
            pushFollow(FOLLOW_ruleFloatType_in_entryRuleFloatType7457);
            iv_ruleFloatType=ruleFloatType();

            state._fsp--;

             current =iv_ruleFloatType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatType7467); 

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
    // $ANTLR end "entryRuleFloatType"


    // $ANTLR start "ruleFloatType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3965:1: ruleFloatType returns [EObject current=null] : ( () otherlv_1= 'float' ) ;
    public final EObject ruleFloatType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3968:28: ( ( () otherlv_1= 'float' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3969:1: ( () otherlv_1= 'float' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3969:1: ( () otherlv_1= 'float' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3969:2: () otherlv_1= 'float'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3969:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3970:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFloatTypeAccess().getFloatTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleFloatType7513); 

                	newLeafNode(otherlv_1, grammarAccess.getFloatTypeAccess().getFloatKeyword_1());
                

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
    // $ANTLR end "ruleFloatType"


    // $ANTLR start "entryRuleDoubleType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3987:1: entryRuleDoubleType returns [EObject current=null] : iv_ruleDoubleType= ruleDoubleType EOF ;
    public final EObject entryRuleDoubleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3988:2: (iv_ruleDoubleType= ruleDoubleType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3989:2: iv_ruleDoubleType= ruleDoubleType EOF
            {
             newCompositeNode(grammarAccess.getDoubleTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleType_in_entryRuleDoubleType7549);
            iv_ruleDoubleType=ruleDoubleType();

            state._fsp--;

             current =iv_ruleDoubleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleType7559); 

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
    // $ANTLR end "entryRuleDoubleType"


    // $ANTLR start "ruleDoubleType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3996:1: ruleDoubleType returns [EObject current=null] : ( () otherlv_1= 'double' ) ;
    public final EObject ruleDoubleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3999:28: ( ( () otherlv_1= 'double' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4000:1: ( () otherlv_1= 'double' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4000:1: ( () otherlv_1= 'double' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4000:2: () otherlv_1= 'double'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4000:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4001:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDoubleTypeAccess().getDoubleTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleDoubleType7605); 

                	newLeafNode(otherlv_1, grammarAccess.getDoubleTypeAccess().getDoubleKeyword_1());
                

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
    // $ANTLR end "ruleDoubleType"


    // $ANTLR start "entryRuleStringType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4018:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4019:2: (iv_ruleStringType= ruleStringType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4020:2: iv_ruleStringType= ruleStringType EOF
            {
             newCompositeNode(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType7641);
            iv_ruleStringType=ruleStringType();

            state._fsp--;

             current =iv_ruleStringType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType7651); 

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
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4027:1: ruleStringType returns [EObject current=null] : ( () otherlv_1= 'string' ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4030:28: ( ( () otherlv_1= 'string' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4031:1: ( () otherlv_1= 'string' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4031:1: ( () otherlv_1= 'string' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4031:2: () otherlv_1= 'string'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4031:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4032:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleStringType7697); 

                	newLeafNode(otherlv_1, grammarAccess.getStringTypeAccess().getStringKeyword_1());
                

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
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleCharArrayType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4049:1: entryRuleCharArrayType returns [EObject current=null] : iv_ruleCharArrayType= ruleCharArrayType EOF ;
    public final EObject entryRuleCharArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4050:2: (iv_ruleCharArrayType= ruleCharArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4051:2: iv_ruleCharArrayType= ruleCharArrayType EOF
            {
             newCompositeNode(grammarAccess.getCharArrayTypeRule()); 
            pushFollow(FOLLOW_ruleCharArrayType_in_entryRuleCharArrayType7733);
            iv_ruleCharArrayType=ruleCharArrayType();

            state._fsp--;

             current =iv_ruleCharArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharArrayType7743); 

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
    // $ANTLR end "entryRuleCharArrayType"


    // $ANTLR start "ruleCharArrayType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4058:1: ruleCharArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarCharArray' ) ;
    public final EObject ruleCharArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4061:28: ( ( () otherlv_1= 'DevVarCharArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4062:1: ( () otherlv_1= 'DevVarCharArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4062:1: ( () otherlv_1= 'DevVarCharArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4062:2: () otherlv_1= 'DevVarCharArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4062:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4063:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCharArrayTypeAccess().getCharArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleCharArrayType7789); 

                	newLeafNode(otherlv_1, grammarAccess.getCharArrayTypeAccess().getDevVarCharArrayKeyword_1());
                

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
    // $ANTLR end "ruleCharArrayType"


    // $ANTLR start "entryRuleShortArrayType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4080:1: entryRuleShortArrayType returns [EObject current=null] : iv_ruleShortArrayType= ruleShortArrayType EOF ;
    public final EObject entryRuleShortArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4081:2: (iv_ruleShortArrayType= ruleShortArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4082:2: iv_ruleShortArrayType= ruleShortArrayType EOF
            {
             newCompositeNode(grammarAccess.getShortArrayTypeRule()); 
            pushFollow(FOLLOW_ruleShortArrayType_in_entryRuleShortArrayType7825);
            iv_ruleShortArrayType=ruleShortArrayType();

            state._fsp--;

             current =iv_ruleShortArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortArrayType7835); 

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
    // $ANTLR end "entryRuleShortArrayType"


    // $ANTLR start "ruleShortArrayType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4089:1: ruleShortArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarShortArray' ) ;
    public final EObject ruleShortArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4092:28: ( ( () otherlv_1= 'DevVarShortArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4093:1: ( () otherlv_1= 'DevVarShortArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4093:1: ( () otherlv_1= 'DevVarShortArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4093:2: () otherlv_1= 'DevVarShortArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4093:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4094:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getShortArrayTypeAccess().getShortArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleShortArrayType7881); 

                	newLeafNode(otherlv_1, grammarAccess.getShortArrayTypeAccess().getDevVarShortArrayKeyword_1());
                

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
    // $ANTLR end "ruleShortArrayType"


    // $ANTLR start "entryRuleUShortArrayType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4111:1: entryRuleUShortArrayType returns [EObject current=null] : iv_ruleUShortArrayType= ruleUShortArrayType EOF ;
    public final EObject entryRuleUShortArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUShortArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4112:2: (iv_ruleUShortArrayType= ruleUShortArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4113:2: iv_ruleUShortArrayType= ruleUShortArrayType EOF
            {
             newCompositeNode(grammarAccess.getUShortArrayTypeRule()); 
            pushFollow(FOLLOW_ruleUShortArrayType_in_entryRuleUShortArrayType7917);
            iv_ruleUShortArrayType=ruleUShortArrayType();

            state._fsp--;

             current =iv_ruleUShortArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUShortArrayType7927); 

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
    // $ANTLR end "entryRuleUShortArrayType"


    // $ANTLR start "ruleUShortArrayType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4120:1: ruleUShortArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarUShortArray' ) ;
    public final EObject ruleUShortArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4123:28: ( ( () otherlv_1= 'DevVarUShortArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4124:1: ( () otherlv_1= 'DevVarUShortArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4124:1: ( () otherlv_1= 'DevVarUShortArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4124:2: () otherlv_1= 'DevVarUShortArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4124:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4125:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUShortArrayTypeAccess().getUShortArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleUShortArrayType7973); 

                	newLeafNode(otherlv_1, grammarAccess.getUShortArrayTypeAccess().getDevVarUShortArrayKeyword_1());
                

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
    // $ANTLR end "ruleUShortArrayType"


    // $ANTLR start "entryRuleIntArrayType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4142:1: entryRuleIntArrayType returns [EObject current=null] : iv_ruleIntArrayType= ruleIntArrayType EOF ;
    public final EObject entryRuleIntArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4143:2: (iv_ruleIntArrayType= ruleIntArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4144:2: iv_ruleIntArrayType= ruleIntArrayType EOF
            {
             newCompositeNode(grammarAccess.getIntArrayTypeRule()); 
            pushFollow(FOLLOW_ruleIntArrayType_in_entryRuleIntArrayType8009);
            iv_ruleIntArrayType=ruleIntArrayType();

            state._fsp--;

             current =iv_ruleIntArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntArrayType8019); 

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
    // $ANTLR end "entryRuleIntArrayType"


    // $ANTLR start "ruleIntArrayType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4151:1: ruleIntArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarLongArray' ) ;
    public final EObject ruleIntArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4154:28: ( ( () otherlv_1= 'DevVarLongArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4155:1: ( () otherlv_1= 'DevVarLongArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4155:1: ( () otherlv_1= 'DevVarLongArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4155:2: () otherlv_1= 'DevVarLongArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4155:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4156:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntArrayTypeAccess().getIntArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleIntArrayType8065); 

                	newLeafNode(otherlv_1, grammarAccess.getIntArrayTypeAccess().getDevVarLongArrayKeyword_1());
                

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
    // $ANTLR end "ruleIntArrayType"


    // $ANTLR start "entryRuleUIntArrayType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4173:1: entryRuleUIntArrayType returns [EObject current=null] : iv_ruleUIntArrayType= ruleUIntArrayType EOF ;
    public final EObject entryRuleUIntArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIntArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4174:2: (iv_ruleUIntArrayType= ruleUIntArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4175:2: iv_ruleUIntArrayType= ruleUIntArrayType EOF
            {
             newCompositeNode(grammarAccess.getUIntArrayTypeRule()); 
            pushFollow(FOLLOW_ruleUIntArrayType_in_entryRuleUIntArrayType8101);
            iv_ruleUIntArrayType=ruleUIntArrayType();

            state._fsp--;

             current =iv_ruleUIntArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIntArrayType8111); 

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
    // $ANTLR end "entryRuleUIntArrayType"


    // $ANTLR start "ruleUIntArrayType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4182:1: ruleUIntArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarULongArray' ) ;
    public final EObject ruleUIntArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4185:28: ( ( () otherlv_1= 'DevVarULongArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4186:1: ( () otherlv_1= 'DevVarULongArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4186:1: ( () otherlv_1= 'DevVarULongArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4186:2: () otherlv_1= 'DevVarULongArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4186:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4187:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUIntArrayTypeAccess().getUIntArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleUIntArrayType8157); 

                	newLeafNode(otherlv_1, grammarAccess.getUIntArrayTypeAccess().getDevVarULongArrayKeyword_1());
                

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
    // $ANTLR end "ruleUIntArrayType"


    // $ANTLR start "entryRuleFloatArrayType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4204:1: entryRuleFloatArrayType returns [EObject current=null] : iv_ruleFloatArrayType= ruleFloatArrayType EOF ;
    public final EObject entryRuleFloatArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4205:2: (iv_ruleFloatArrayType= ruleFloatArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4206:2: iv_ruleFloatArrayType= ruleFloatArrayType EOF
            {
             newCompositeNode(grammarAccess.getFloatArrayTypeRule()); 
            pushFollow(FOLLOW_ruleFloatArrayType_in_entryRuleFloatArrayType8193);
            iv_ruleFloatArrayType=ruleFloatArrayType();

            state._fsp--;

             current =iv_ruleFloatArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatArrayType8203); 

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
    // $ANTLR end "entryRuleFloatArrayType"


    // $ANTLR start "ruleFloatArrayType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4213:1: ruleFloatArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarFloatArray' ) ;
    public final EObject ruleFloatArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4216:28: ( ( () otherlv_1= 'DevVarFloatArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4217:1: ( () otherlv_1= 'DevVarFloatArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4217:1: ( () otherlv_1= 'DevVarFloatArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4217:2: () otherlv_1= 'DevVarFloatArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4217:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4218:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFloatArrayTypeAccess().getFloatArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleFloatArrayType8249); 

                	newLeafNode(otherlv_1, grammarAccess.getFloatArrayTypeAccess().getDevVarFloatArrayKeyword_1());
                

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
    // $ANTLR end "ruleFloatArrayType"


    // $ANTLR start "entryRuleDoubleArrayType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4235:1: entryRuleDoubleArrayType returns [EObject current=null] : iv_ruleDoubleArrayType= ruleDoubleArrayType EOF ;
    public final EObject entryRuleDoubleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4236:2: (iv_ruleDoubleArrayType= ruleDoubleArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4237:2: iv_ruleDoubleArrayType= ruleDoubleArrayType EOF
            {
             newCompositeNode(grammarAccess.getDoubleArrayTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleArrayType_in_entryRuleDoubleArrayType8285);
            iv_ruleDoubleArrayType=ruleDoubleArrayType();

            state._fsp--;

             current =iv_ruleDoubleArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleArrayType8295); 

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
    // $ANTLR end "entryRuleDoubleArrayType"


    // $ANTLR start "ruleDoubleArrayType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4244:1: ruleDoubleArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarDoubleArray' ) ;
    public final EObject ruleDoubleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4247:28: ( ( () otherlv_1= 'DevVarDoubleArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4248:1: ( () otherlv_1= 'DevVarDoubleArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4248:1: ( () otherlv_1= 'DevVarDoubleArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4248:2: () otherlv_1= 'DevVarDoubleArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4248:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4249:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDoubleArrayTypeAccess().getDoubleArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleDoubleArrayType8341); 

                	newLeafNode(otherlv_1, grammarAccess.getDoubleArrayTypeAccess().getDevVarDoubleArrayKeyword_1());
                

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
    // $ANTLR end "ruleDoubleArrayType"


    // $ANTLR start "entryRuleStringArrayType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4266:1: entryRuleStringArrayType returns [EObject current=null] : iv_ruleStringArrayType= ruleStringArrayType EOF ;
    public final EObject entryRuleStringArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4267:2: (iv_ruleStringArrayType= ruleStringArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4268:2: iv_ruleStringArrayType= ruleStringArrayType EOF
            {
             newCompositeNode(grammarAccess.getStringArrayTypeRule()); 
            pushFollow(FOLLOW_ruleStringArrayType_in_entryRuleStringArrayType8377);
            iv_ruleStringArrayType=ruleStringArrayType();

            state._fsp--;

             current =iv_ruleStringArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringArrayType8387); 

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
    // $ANTLR end "entryRuleStringArrayType"


    // $ANTLR start "ruleStringArrayType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4275:1: ruleStringArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarStringArray' ) ;
    public final EObject ruleStringArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4278:28: ( ( () otherlv_1= 'DevVarStringArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4279:1: ( () otherlv_1= 'DevVarStringArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4279:1: ( () otherlv_1= 'DevVarStringArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4279:2: () otherlv_1= 'DevVarStringArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4279:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4280:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringArrayTypeAccess().getStringArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleStringArrayType8433); 

                	newLeafNode(otherlv_1, grammarAccess.getStringArrayTypeAccess().getDevVarStringArrayKeyword_1());
                

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
    // $ANTLR end "ruleStringArrayType"


    // $ANTLR start "entryRuleLongStringArrayType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4297:1: entryRuleLongStringArrayType returns [EObject current=null] : iv_ruleLongStringArrayType= ruleLongStringArrayType EOF ;
    public final EObject entryRuleLongStringArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongStringArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4298:2: (iv_ruleLongStringArrayType= ruleLongStringArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4299:2: iv_ruleLongStringArrayType= ruleLongStringArrayType EOF
            {
             newCompositeNode(grammarAccess.getLongStringArrayTypeRule()); 
            pushFollow(FOLLOW_ruleLongStringArrayType_in_entryRuleLongStringArrayType8469);
            iv_ruleLongStringArrayType=ruleLongStringArrayType();

            state._fsp--;

             current =iv_ruleLongStringArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongStringArrayType8479); 

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
    // $ANTLR end "entryRuleLongStringArrayType"


    // $ANTLR start "ruleLongStringArrayType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4306:1: ruleLongStringArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarLongStringArray' ) ;
    public final EObject ruleLongStringArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4309:28: ( ( () otherlv_1= 'DevVarLongStringArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4310:1: ( () otherlv_1= 'DevVarLongStringArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4310:1: ( () otherlv_1= 'DevVarLongStringArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4310:2: () otherlv_1= 'DevVarLongStringArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4310:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4311:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLongStringArrayTypeAccess().getLongStringArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleLongStringArrayType8525); 

                	newLeafNode(otherlv_1, grammarAccess.getLongStringArrayTypeAccess().getDevVarLongStringArrayKeyword_1());
                

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
    // $ANTLR end "ruleLongStringArrayType"


    // $ANTLR start "entryRuleDoubleStringArrayType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4328:1: entryRuleDoubleStringArrayType returns [EObject current=null] : iv_ruleDoubleStringArrayType= ruleDoubleStringArrayType EOF ;
    public final EObject entryRuleDoubleStringArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleStringArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4329:2: (iv_ruleDoubleStringArrayType= ruleDoubleStringArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4330:2: iv_ruleDoubleStringArrayType= ruleDoubleStringArrayType EOF
            {
             newCompositeNode(grammarAccess.getDoubleStringArrayTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleStringArrayType_in_entryRuleDoubleStringArrayType8561);
            iv_ruleDoubleStringArrayType=ruleDoubleStringArrayType();

            state._fsp--;

             current =iv_ruleDoubleStringArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleStringArrayType8571); 

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
    // $ANTLR end "entryRuleDoubleStringArrayType"


    // $ANTLR start "ruleDoubleStringArrayType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4337:1: ruleDoubleStringArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarDoubleStringArray' ) ;
    public final EObject ruleDoubleStringArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4340:28: ( ( () otherlv_1= 'DevVarDoubleStringArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4341:1: ( () otherlv_1= 'DevVarDoubleStringArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4341:1: ( () otherlv_1= 'DevVarDoubleStringArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4341:2: () otherlv_1= 'DevVarDoubleStringArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4341:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4342:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDoubleStringArrayTypeAccess().getDoubleStringArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleDoubleStringArrayType8617); 

                	newLeafNode(otherlv_1, grammarAccess.getDoubleStringArrayTypeAccess().getDevVarDoubleStringArrayKeyword_1());
                

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
    // $ANTLR end "ruleDoubleStringArrayType"


    // $ANTLR start "entryRuleStateType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4359:1: entryRuleStateType returns [EObject current=null] : iv_ruleStateType= ruleStateType EOF ;
    public final EObject entryRuleStateType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4360:2: (iv_ruleStateType= ruleStateType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4361:2: iv_ruleStateType= ruleStateType EOF
            {
             newCompositeNode(grammarAccess.getStateTypeRule()); 
            pushFollow(FOLLOW_ruleStateType_in_entryRuleStateType8653);
            iv_ruleStateType=ruleStateType();

            state._fsp--;

             current =iv_ruleStateType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateType8663); 

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
    // $ANTLR end "entryRuleStateType"


    // $ANTLR start "ruleStateType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4368:1: ruleStateType returns [EObject current=null] : ( () otherlv_1= 'DevState' ) ;
    public final EObject ruleStateType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4371:28: ( ( () otherlv_1= 'DevState' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4372:1: ( () otherlv_1= 'DevState' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4372:1: ( () otherlv_1= 'DevState' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4372:2: () otherlv_1= 'DevState'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4372:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4373:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateTypeAccess().getStateTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleStateType8709); 

                	newLeafNode(otherlv_1, grammarAccess.getStateTypeAccess().getDevStateKeyword_1());
                

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
    // $ANTLR end "ruleStateType"


    // $ANTLR start "entryRuleConstStringType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4390:1: entryRuleConstStringType returns [EObject current=null] : iv_ruleConstStringType= ruleConstStringType EOF ;
    public final EObject entryRuleConstStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstStringType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4391:2: (iv_ruleConstStringType= ruleConstStringType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4392:2: iv_ruleConstStringType= ruleConstStringType EOF
            {
             newCompositeNode(grammarAccess.getConstStringTypeRule()); 
            pushFollow(FOLLOW_ruleConstStringType_in_entryRuleConstStringType8745);
            iv_ruleConstStringType=ruleConstStringType();

            state._fsp--;

             current =iv_ruleConstStringType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstStringType8755); 

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
    // $ANTLR end "entryRuleConstStringType"


    // $ANTLR start "ruleConstStringType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4399:1: ruleConstStringType returns [EObject current=null] : ( () otherlv_1= 'ConstDevString' ) ;
    public final EObject ruleConstStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4402:28: ( ( () otherlv_1= 'ConstDevString' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4403:1: ( () otherlv_1= 'ConstDevString' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4403:1: ( () otherlv_1= 'ConstDevString' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4403:2: () otherlv_1= 'ConstDevString'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4403:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4404:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConstStringTypeAccess().getConstStringTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleConstStringType8801); 

                	newLeafNode(otherlv_1, grammarAccess.getConstStringTypeAccess().getConstDevStringKeyword_1());
                

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
    // $ANTLR end "ruleConstStringType"


    // $ANTLR start "entryRuleBooleanArrayType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4421:1: entryRuleBooleanArrayType returns [EObject current=null] : iv_ruleBooleanArrayType= ruleBooleanArrayType EOF ;
    public final EObject entryRuleBooleanArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4422:2: (iv_ruleBooleanArrayType= ruleBooleanArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4423:2: iv_ruleBooleanArrayType= ruleBooleanArrayType EOF
            {
             newCompositeNode(grammarAccess.getBooleanArrayTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanArrayType_in_entryRuleBooleanArrayType8837);
            iv_ruleBooleanArrayType=ruleBooleanArrayType();

            state._fsp--;

             current =iv_ruleBooleanArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanArrayType8847); 

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
    // $ANTLR end "entryRuleBooleanArrayType"


    // $ANTLR start "ruleBooleanArrayType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4430:1: ruleBooleanArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarBooleanArray' ) ;
    public final EObject ruleBooleanArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4433:28: ( ( () otherlv_1= 'DevVarBooleanArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4434:1: ( () otherlv_1= 'DevVarBooleanArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4434:1: ( () otherlv_1= 'DevVarBooleanArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4434:2: () otherlv_1= 'DevVarBooleanArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4434:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4435:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanArrayTypeAccess().getBooleanArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleBooleanArrayType8893); 

                	newLeafNode(otherlv_1, grammarAccess.getBooleanArrayTypeAccess().getDevVarBooleanArrayKeyword_1());
                

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
    // $ANTLR end "ruleBooleanArrayType"


    // $ANTLR start "entryRuleUCharType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4452:1: entryRuleUCharType returns [EObject current=null] : iv_ruleUCharType= ruleUCharType EOF ;
    public final EObject entryRuleUCharType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUCharType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4453:2: (iv_ruleUCharType= ruleUCharType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4454:2: iv_ruleUCharType= ruleUCharType EOF
            {
             newCompositeNode(grammarAccess.getUCharTypeRule()); 
            pushFollow(FOLLOW_ruleUCharType_in_entryRuleUCharType8929);
            iv_ruleUCharType=ruleUCharType();

            state._fsp--;

             current =iv_ruleUCharType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUCharType8939); 

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
    // $ANTLR end "entryRuleUCharType"


    // $ANTLR start "ruleUCharType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4461:1: ruleUCharType returns [EObject current=null] : ( () otherlv_1= 'DevUChar' ) ;
    public final EObject ruleUCharType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4464:28: ( ( () otherlv_1= 'DevUChar' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4465:1: ( () otherlv_1= 'DevUChar' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4465:1: ( () otherlv_1= 'DevUChar' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4465:2: () otherlv_1= 'DevUChar'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4465:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4466:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUCharTypeAccess().getUCharTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleUCharType8985); 

                	newLeafNode(otherlv_1, grammarAccess.getUCharTypeAccess().getDevUCharKeyword_1());
                

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
    // $ANTLR end "ruleUCharType"


    // $ANTLR start "entryRuleLongType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4483:1: entryRuleLongType returns [EObject current=null] : iv_ruleLongType= ruleLongType EOF ;
    public final EObject entryRuleLongType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4484:2: (iv_ruleLongType= ruleLongType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4485:2: iv_ruleLongType= ruleLongType EOF
            {
             newCompositeNode(grammarAccess.getLongTypeRule()); 
            pushFollow(FOLLOW_ruleLongType_in_entryRuleLongType9021);
            iv_ruleLongType=ruleLongType();

            state._fsp--;

             current =iv_ruleLongType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongType9031); 

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
    // $ANTLR end "entryRuleLongType"


    // $ANTLR start "ruleLongType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4492:1: ruleLongType returns [EObject current=null] : ( () otherlv_1= 'DevLong64' ) ;
    public final EObject ruleLongType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4495:28: ( ( () otherlv_1= 'DevLong64' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4496:1: ( () otherlv_1= 'DevLong64' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4496:1: ( () otherlv_1= 'DevLong64' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4496:2: () otherlv_1= 'DevLong64'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4496:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4497:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLongTypeAccess().getLongTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleLongType9077); 

                	newLeafNode(otherlv_1, grammarAccess.getLongTypeAccess().getDevLong64Keyword_1());
                

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
    // $ANTLR end "ruleLongType"


    // $ANTLR start "entryRuleULongType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4514:1: entryRuleULongType returns [EObject current=null] : iv_ruleULongType= ruleULongType EOF ;
    public final EObject entryRuleULongType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleULongType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4515:2: (iv_ruleULongType= ruleULongType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4516:2: iv_ruleULongType= ruleULongType EOF
            {
             newCompositeNode(grammarAccess.getULongTypeRule()); 
            pushFollow(FOLLOW_ruleULongType_in_entryRuleULongType9113);
            iv_ruleULongType=ruleULongType();

            state._fsp--;

             current =iv_ruleULongType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleULongType9123); 

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
    // $ANTLR end "entryRuleULongType"


    // $ANTLR start "ruleULongType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4523:1: ruleULongType returns [EObject current=null] : ( () otherlv_1= 'DevULong64' ) ;
    public final EObject ruleULongType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4526:28: ( ( () otherlv_1= 'DevULong64' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4527:1: ( () otherlv_1= 'DevULong64' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4527:1: ( () otherlv_1= 'DevULong64' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4527:2: () otherlv_1= 'DevULong64'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4527:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4528:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getULongTypeAccess().getULongTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleULongType9169); 

                	newLeafNode(otherlv_1, grammarAccess.getULongTypeAccess().getDevULong64Keyword_1());
                

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
    // $ANTLR end "ruleULongType"


    // $ANTLR start "entryRuleLongArrayType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4545:1: entryRuleLongArrayType returns [EObject current=null] : iv_ruleLongArrayType= ruleLongArrayType EOF ;
    public final EObject entryRuleLongArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4546:2: (iv_ruleLongArrayType= ruleLongArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4547:2: iv_ruleLongArrayType= ruleLongArrayType EOF
            {
             newCompositeNode(grammarAccess.getLongArrayTypeRule()); 
            pushFollow(FOLLOW_ruleLongArrayType_in_entryRuleLongArrayType9205);
            iv_ruleLongArrayType=ruleLongArrayType();

            state._fsp--;

             current =iv_ruleLongArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongArrayType9215); 

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
    // $ANTLR end "entryRuleLongArrayType"


    // $ANTLR start "ruleLongArrayType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4554:1: ruleLongArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarLong64Array' ) ;
    public final EObject ruleLongArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4557:28: ( ( () otherlv_1= 'DevVarLong64Array' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4558:1: ( () otherlv_1= 'DevVarLong64Array' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4558:1: ( () otherlv_1= 'DevVarLong64Array' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4558:2: () otherlv_1= 'DevVarLong64Array'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4558:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4559:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLongArrayTypeAccess().getLongArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleLongArrayType9261); 

                	newLeafNode(otherlv_1, grammarAccess.getLongArrayTypeAccess().getDevVarLong64ArrayKeyword_1());
                

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
    // $ANTLR end "ruleLongArrayType"


    // $ANTLR start "entryRuleULongArrayType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4576:1: entryRuleULongArrayType returns [EObject current=null] : iv_ruleULongArrayType= ruleULongArrayType EOF ;
    public final EObject entryRuleULongArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleULongArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4577:2: (iv_ruleULongArrayType= ruleULongArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4578:2: iv_ruleULongArrayType= ruleULongArrayType EOF
            {
             newCompositeNode(grammarAccess.getULongArrayTypeRule()); 
            pushFollow(FOLLOW_ruleULongArrayType_in_entryRuleULongArrayType9297);
            iv_ruleULongArrayType=ruleULongArrayType();

            state._fsp--;

             current =iv_ruleULongArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleULongArrayType9307); 

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
    // $ANTLR end "entryRuleULongArrayType"


    // $ANTLR start "ruleULongArrayType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4585:1: ruleULongArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarULong64Array' ) ;
    public final EObject ruleULongArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4588:28: ( ( () otherlv_1= 'DevVarULong64Array' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4589:1: ( () otherlv_1= 'DevVarULong64Array' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4589:1: ( () otherlv_1= 'DevVarULong64Array' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4589:2: () otherlv_1= 'DevVarULong64Array'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4589:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4590:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getULongArrayTypeAccess().getULongArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleULongArrayType9353); 

                	newLeafNode(otherlv_1, grammarAccess.getULongArrayTypeAccess().getDevVarULong64ArrayKeyword_1());
                

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
    // $ANTLR end "ruleULongArrayType"


    // $ANTLR start "entryRuleDevIntType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4607:1: entryRuleDevIntType returns [EObject current=null] : iv_ruleDevIntType= ruleDevIntType EOF ;
    public final EObject entryRuleDevIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevIntType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4608:2: (iv_ruleDevIntType= ruleDevIntType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4609:2: iv_ruleDevIntType= ruleDevIntType EOF
            {
             newCompositeNode(grammarAccess.getDevIntTypeRule()); 
            pushFollow(FOLLOW_ruleDevIntType_in_entryRuleDevIntType9389);
            iv_ruleDevIntType=ruleDevIntType();

            state._fsp--;

             current =iv_ruleDevIntType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDevIntType9399); 

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
    // $ANTLR end "entryRuleDevIntType"


    // $ANTLR start "ruleDevIntType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4616:1: ruleDevIntType returns [EObject current=null] : ( () otherlv_1= 'DevInt' ) ;
    public final EObject ruleDevIntType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4619:28: ( ( () otherlv_1= 'DevInt' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4620:1: ( () otherlv_1= 'DevInt' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4620:1: ( () otherlv_1= 'DevInt' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4620:2: () otherlv_1= 'DevInt'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4620:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4621:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDevIntTypeAccess().getDevIntTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleDevIntType9445); 

                	newLeafNode(otherlv_1, grammarAccess.getDevIntTypeAccess().getDevIntKeyword_1());
                

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
    // $ANTLR end "ruleDevIntType"


    // $ANTLR start "entryRuleEncodedType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4638:1: entryRuleEncodedType returns [EObject current=null] : iv_ruleEncodedType= ruleEncodedType EOF ;
    public final EObject entryRuleEncodedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEncodedType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4639:2: (iv_ruleEncodedType= ruleEncodedType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4640:2: iv_ruleEncodedType= ruleEncodedType EOF
            {
             newCompositeNode(grammarAccess.getEncodedTypeRule()); 
            pushFollow(FOLLOW_ruleEncodedType_in_entryRuleEncodedType9481);
            iv_ruleEncodedType=ruleEncodedType();

            state._fsp--;

             current =iv_ruleEncodedType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEncodedType9491); 

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
    // $ANTLR end "entryRuleEncodedType"


    // $ANTLR start "ruleEncodedType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4647:1: ruleEncodedType returns [EObject current=null] : ( () otherlv_1= 'DevEncoded' ) ;
    public final EObject ruleEncodedType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4650:28: ( ( () otherlv_1= 'DevEncoded' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4651:1: ( () otherlv_1= 'DevEncoded' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4651:1: ( () otherlv_1= 'DevEncoded' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4651:2: () otherlv_1= 'DevEncoded'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4651:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4652:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEncodedTypeAccess().getEncodedTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleEncodedType9537); 

                	newLeafNode(otherlv_1, grammarAccess.getEncodedTypeAccess().getDevEncodedKeyword_1());
                

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
    // $ANTLR end "ruleEncodedType"


    // $ANTLR start "entryRuleShortVectorType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4669:1: entryRuleShortVectorType returns [EObject current=null] : iv_ruleShortVectorType= ruleShortVectorType EOF ;
    public final EObject entryRuleShortVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4670:2: (iv_ruleShortVectorType= ruleShortVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4671:2: iv_ruleShortVectorType= ruleShortVectorType EOF
            {
             newCompositeNode(grammarAccess.getShortVectorTypeRule()); 
            pushFollow(FOLLOW_ruleShortVectorType_in_entryRuleShortVectorType9573);
            iv_ruleShortVectorType=ruleShortVectorType();

            state._fsp--;

             current =iv_ruleShortVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortVectorType9583); 

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
    // $ANTLR end "entryRuleShortVectorType"


    // $ANTLR start "ruleShortVectorType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4678:1: ruleShortVectorType returns [EObject current=null] : ( () otherlv_1= 'vector<short>' ) ;
    public final EObject ruleShortVectorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4681:28: ( ( () otherlv_1= 'vector<short>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4682:1: ( () otherlv_1= 'vector<short>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4682:1: ( () otherlv_1= 'vector<short>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4682:2: () otherlv_1= 'vector<short>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4682:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4683:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getShortVectorTypeAccess().getShortVectorTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleShortVectorType9629); 

                	newLeafNode(otherlv_1, grammarAccess.getShortVectorTypeAccess().getVectorShortKeyword_1());
                

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
    // $ANTLR end "ruleShortVectorType"


    // $ANTLR start "entryRuleIntVectorType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4700:1: entryRuleIntVectorType returns [EObject current=null] : iv_ruleIntVectorType= ruleIntVectorType EOF ;
    public final EObject entryRuleIntVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4701:2: (iv_ruleIntVectorType= ruleIntVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4702:2: iv_ruleIntVectorType= ruleIntVectorType EOF
            {
             newCompositeNode(grammarAccess.getIntVectorTypeRule()); 
            pushFollow(FOLLOW_ruleIntVectorType_in_entryRuleIntVectorType9665);
            iv_ruleIntVectorType=ruleIntVectorType();

            state._fsp--;

             current =iv_ruleIntVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntVectorType9675); 

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
    // $ANTLR end "entryRuleIntVectorType"


    // $ANTLR start "ruleIntVectorType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4709:1: ruleIntVectorType returns [EObject current=null] : ( () otherlv_1= 'vector<int>' ) ;
    public final EObject ruleIntVectorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4712:28: ( ( () otherlv_1= 'vector<int>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4713:1: ( () otherlv_1= 'vector<int>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4713:1: ( () otherlv_1= 'vector<int>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4713:2: () otherlv_1= 'vector<int>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4713:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4714:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntVectorTypeAccess().getIntVectorTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,78,FOLLOW_78_in_ruleIntVectorType9721); 

                	newLeafNode(otherlv_1, grammarAccess.getIntVectorTypeAccess().getVectorIntKeyword_1());
                

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
    // $ANTLR end "ruleIntVectorType"


    // $ANTLR start "entryRuleFloatVectorType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4731:1: entryRuleFloatVectorType returns [EObject current=null] : iv_ruleFloatVectorType= ruleFloatVectorType EOF ;
    public final EObject entryRuleFloatVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4732:2: (iv_ruleFloatVectorType= ruleFloatVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4733:2: iv_ruleFloatVectorType= ruleFloatVectorType EOF
            {
             newCompositeNode(grammarAccess.getFloatVectorTypeRule()); 
            pushFollow(FOLLOW_ruleFloatVectorType_in_entryRuleFloatVectorType9757);
            iv_ruleFloatVectorType=ruleFloatVectorType();

            state._fsp--;

             current =iv_ruleFloatVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatVectorType9767); 

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
    // $ANTLR end "entryRuleFloatVectorType"


    // $ANTLR start "ruleFloatVectorType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4740:1: ruleFloatVectorType returns [EObject current=null] : ( () otherlv_1= 'vector<float>' ) ;
    public final EObject ruleFloatVectorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4743:28: ( ( () otherlv_1= 'vector<float>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4744:1: ( () otherlv_1= 'vector<float>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4744:1: ( () otherlv_1= 'vector<float>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4744:2: () otherlv_1= 'vector<float>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4744:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4745:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFloatVectorTypeAccess().getFloatVectorTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,79,FOLLOW_79_in_ruleFloatVectorType9813); 

                	newLeafNode(otherlv_1, grammarAccess.getFloatVectorTypeAccess().getVectorFloatKeyword_1());
                

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
    // $ANTLR end "ruleFloatVectorType"


    // $ANTLR start "entryRuleDoubleVectorType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4762:1: entryRuleDoubleVectorType returns [EObject current=null] : iv_ruleDoubleVectorType= ruleDoubleVectorType EOF ;
    public final EObject entryRuleDoubleVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4763:2: (iv_ruleDoubleVectorType= ruleDoubleVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4764:2: iv_ruleDoubleVectorType= ruleDoubleVectorType EOF
            {
             newCompositeNode(grammarAccess.getDoubleVectorTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleVectorType_in_entryRuleDoubleVectorType9849);
            iv_ruleDoubleVectorType=ruleDoubleVectorType();

            state._fsp--;

             current =iv_ruleDoubleVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleVectorType9859); 

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
    // $ANTLR end "entryRuleDoubleVectorType"


    // $ANTLR start "ruleDoubleVectorType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4771:1: ruleDoubleVectorType returns [EObject current=null] : ( () otherlv_1= 'vector<double>' ) ;
    public final EObject ruleDoubleVectorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4774:28: ( ( () otherlv_1= 'vector<double>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4775:1: ( () otherlv_1= 'vector<double>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4775:1: ( () otherlv_1= 'vector<double>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4775:2: () otherlv_1= 'vector<double>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4775:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4776:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDoubleVectorTypeAccess().getDoubleVectorTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,80,FOLLOW_80_in_ruleDoubleVectorType9905); 

                	newLeafNode(otherlv_1, grammarAccess.getDoubleVectorTypeAccess().getVectorDoubleKeyword_1());
                

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
    // $ANTLR end "ruleDoubleVectorType"


    // $ANTLR start "entryRuleStringVectorType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4793:1: entryRuleStringVectorType returns [EObject current=null] : iv_ruleStringVectorType= ruleStringVectorType EOF ;
    public final EObject entryRuleStringVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4794:2: (iv_ruleStringVectorType= ruleStringVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4795:2: iv_ruleStringVectorType= ruleStringVectorType EOF
            {
             newCompositeNode(grammarAccess.getStringVectorTypeRule()); 
            pushFollow(FOLLOW_ruleStringVectorType_in_entryRuleStringVectorType9941);
            iv_ruleStringVectorType=ruleStringVectorType();

            state._fsp--;

             current =iv_ruleStringVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringVectorType9951); 

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
    // $ANTLR end "entryRuleStringVectorType"


    // $ANTLR start "ruleStringVectorType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4802:1: ruleStringVectorType returns [EObject current=null] : ( () otherlv_1= 'vector<string>' ) ;
    public final EObject ruleStringVectorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4805:28: ( ( () otherlv_1= 'vector<string>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4806:1: ( () otherlv_1= 'vector<string>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4806:1: ( () otherlv_1= 'vector<string>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4806:2: () otherlv_1= 'vector<string>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4806:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4807:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringVectorTypeAccess().getStringVectorTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,81,FOLLOW_81_in_ruleStringVectorType9997); 

                	newLeafNode(otherlv_1, grammarAccess.getStringVectorTypeAccess().getVectorStringKeyword_1());
                

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
    // $ANTLR end "ruleStringVectorType"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePogoSystem_in_entryRulePogoSystem75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePogoSystem85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rulePogoSystem131 = new BitSet(new long[]{0x0000000000080822L});
    public static final BitSet FOLLOW_rulePogoDeviceClass_in_rulePogoSystem153 = new BitSet(new long[]{0x0000000000080022L});
    public static final BitSet FOLLOW_rulePogoMultiClasses_in_rulePogoSystem175 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePogoMultiClasses_in_entryRulePogoMultiClasses317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePogoMultiClasses327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePogoMultiClasses369 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePogoMultiClasses386 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePogoMultiClasses403 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePogoMultiClasses420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePogoMultiClasses437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePogoMultiClasses459 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePogoMultiClasses481 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePogoMultiClasses503 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePogoMultiClasses520 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOneClassSimpleDef_in_rulePogoMultiClasses541 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePogoMultiClasses558 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePreferences_in_rulePogoMultiClasses584 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePogoMultiClasses596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneClassSimpleDef_in_entryRuleOneClassSimpleDef632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneClassSimpleDef642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOneClassSimpleDef684 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOneClassSimpleDef706 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleOneClassSimpleDef732 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleOneClassSimpleDef753 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOneClassSimpleDef765 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInheritance_in_ruleOneClassSimpleDef786 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleOneClassSimpleDef798 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOneClassSimpleDef815 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOneClassSimpleDef832 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleAdditionalFile_in_ruleOneClassSimpleDef853 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rulePogoDeviceClass_in_entryRulePogoDeviceClass890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePogoDeviceClass900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePogoDeviceClass937 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePogoDeviceClass954 = new BitSet(new long[]{0x0000000000302000L});
    public static final BitSet FOLLOW_20_in_rulePogoDeviceClass977 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_21_in_rulePogoDeviceClass1004 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePogoDeviceClass1024 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePogoDeviceClass1038 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePogoDeviceClass1055 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePogoDeviceClass1077 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePogoDeviceClass1094 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClassDescription_in_rulePogoDeviceClass1115 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePogoDeviceClass1127 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePogoDeviceClass1148 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_rulePogoDeviceClass1161 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePogoDeviceClass1182 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_rulePogoDeviceClass1195 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_ruleCommand_in_rulePogoDeviceClass1216 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_26_in_rulePogoDeviceClass1229 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_ruleAttribute_in_rulePogoDeviceClass1250 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_27_in_rulePogoDeviceClass1263 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_ruleAttribute_in_rulePogoDeviceClass1284 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_28_in_rulePogoDeviceClass1297 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleState_in_rulePogoDeviceClass1318 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rulePreferences_in_rulePogoDeviceClass1340 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePogoDeviceClass1352 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleAdditionalFile_in_rulePogoDeviceClass1373 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_29_in_rulePogoDeviceClass1386 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleOverlodedPollPeriodObject_in_rulePogoDeviceClass1407 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_rulePogoDeviceClass1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLanguage_in_entryRuleLanguage1457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLanguage1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleLanguage1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleLanguage1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleLanguage1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisplayLevel_in_entryRuleDisplayLevel1585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisplayLevel1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDisplayLevel1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleDisplayLevel1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrType_in_entryRuleAttrType1694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrType1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleAttrType1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleAttrType1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleAttrType1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRW_Type_in_entryRuleRW_Type1822 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRW_Type1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleRW_Type1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleRW_Type1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleRW_Type1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleRW_Type1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean1969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleBoolean2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleBoolean2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDescription_in_entryRuleClassDescription2077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassDescription2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassDescription2129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassDescription2151 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassDescription2173 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleClassDescription2190 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInheritance_in_ruleClassDescription2211 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_ruleLanguage_in_ruleClassDescription2232 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassDescription2249 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClassIdentification_in_ruleClassDescription2275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleComments_in_ruleClassDescription2296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassDescription2313 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleClassDescription2339 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleClassDescription2360 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleClassDescription2381 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleClassDescription2402 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleClassDescription2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritance_in_entryRuleInheritance2459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInheritance2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInheritance2511 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInheritance2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassIdentification_in_entryRuleClassIdentification2574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassIdentification2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2626 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2648 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2670 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2714 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2736 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2758 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2780 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComments_in_entryRuleComments2843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComments2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleComments2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreferences_in_entryRulePreferences2934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreferences2944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePreferences2986 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePreferences3008 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePreferences3030 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_rulePreferences3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState3092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState3144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState3166 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_ruleState3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty3228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty3238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty3280 = new BitSet(new long[]{0x01FE000000000000L,0x000000000003E000L});
    public static final BitSet FOLLOW_rulePropType_in_ruleProperty3306 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_ruleProperty3327 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleProperty3348 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProperty3365 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleProperty3382 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProperty3399 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rulePropType_in_entryRulePropType3441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropType3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rulePropType3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVectorType_in_rulePropType3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType3560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_ruleSimpleType3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortType_in_ruleSimpleType3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortType_in_ruleSimpleType3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_ruleSimpleType3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntType_in_ruleSimpleType3725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_ruleSimpleType3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_ruleSimpleType3779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_ruleSimpleType3806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVectorType_in_entryRuleVectorType3841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVectorType3851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortVectorType_in_ruleVectorType3898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntVectorType_in_ruleVectorType3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatVectorType_in_ruleVectorType3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleVectorType_in_ruleVectorType3979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVectorType_in_ruleVectorType4006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_entryRuleInheritanceStatus4041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInheritanceStatus4051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleInheritanceStatus4097 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleInheritanceStatus4118 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleInheritanceStatus4139 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleInheritanceStatus4160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInheritanceStatus4177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand4218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand4228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand4270 = new BitSet(new long[]{0xFFFF000000000000L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_ruleArgument_in_ruleCommand4296 = new BitSet(new long[]{0xFFFF000000000000L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_ruleArgument_in_ruleCommand4317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommand4334 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_ruleCommand4360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommand4377 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_ruleDisplayLevel_in_ruleCommand4403 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommand4420 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleCommand4437 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommand4454 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument4496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument4506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleArgument4552 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument4569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute4610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute4620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute4662 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_ruleAttrType_in_ruleAttribute4688 = new BitSet(new long[]{0xFFFF000000000000L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_ruleType_in_ruleAttribute4709 = new BitSet(new long[]{0x000003C000000000L});
    public static final BitSet FOLLOW_ruleRW_Type_in_ruleAttribute4730 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_ruleDisplayLevel_in_ruleAttribute4751 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute4768 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute4790 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute4812 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute4834 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleAttribute4860 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleAttribute4881 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleFireEvents_in_ruleAttribute4902 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleFireEvents_in_ruleAttribute4923 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleFireEvents_in_ruleAttribute4944 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_ruleAttribute4965 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttrProperties_in_ruleAttribute4986 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleAttribute5007 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleAttribute5028 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEventCriteria_in_ruleAttribute5049 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEventCriteria_in_ruleAttribute5070 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleAttribute5082 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute5099 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_47_in_ruleAttribute5117 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute5134 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleFireEvents_in_entryRuleFireEvents5176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFireEvents5186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleFireEvents5232 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleFireEvents5253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventCriteria_in_entryRuleEventCriteria5289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventCriteria5299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEventCriteria5341 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEventCriteria5363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEventCriteria5385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrProperties_in_entryRuleAttrProperties5426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrProperties5436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5522 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5588 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5632 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5654 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5698 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5720 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5742 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionalFile_in_entryRuleAdditionalFile5805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionalFile5815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAdditionalFile5857 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAdditionalFile5879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverlodedPollPeriodObject_in_entryRuleOverlodedPollPeriodObject5920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverlodedPollPeriodObject5930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOverlodedPollPeriodObject5972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOverlodedPollPeriodObject5994 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOverlodedPollPeriodObject6016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType6057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType6067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidType_in_ruleType6114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_ruleType6141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortType_in_ruleType6168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortType_in_ruleType6195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_ruleType6222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntType_in_ruleType6249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_ruleType6276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_ruleType6303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_ruleType6330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharArrayType_in_ruleType6357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortArrayType_in_ruleType6384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortArrayType_in_ruleType6411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntArrayType_in_ruleType6438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntArrayType_in_ruleType6465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatArrayType_in_ruleType6492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleArrayType_in_ruleType6519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringArrayType_in_ruleType6546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongStringArrayType_in_ruleType6573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleStringArrayType_in_ruleType6600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleType6627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstStringType_in_ruleType6654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanArrayType_in_ruleType6681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_ruleType6708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongType_in_ruleType6735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUCharType_in_ruleType6762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongArrayType_in_ruleType6789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongArrayType_in_ruleType6816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDevIntType_in_ruleType6843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncodedType_in_ruleType6870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidType_in_entryRuleVoidType6905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVoidType6915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleVoidType6961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_entryRuleBooleanType6997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanType7007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleBooleanType7053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortType_in_entryRuleShortType7089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortType7099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleShortType7145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortType_in_entryRuleUShortType7181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUShortType7191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleUShortType7237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_entryRuleIntType7273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntType7283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleIntType7329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntType_in_entryRuleUIntType7365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIntType7375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleUIntType7421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_entryRuleFloatType7457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatType7467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleFloatType7513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_entryRuleDoubleType7549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleType7559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleDoubleType7605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType7641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType7651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleStringType7697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharArrayType_in_entryRuleCharArrayType7733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharArrayType7743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleCharArrayType7789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortArrayType_in_entryRuleShortArrayType7825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortArrayType7835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleShortArrayType7881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortArrayType_in_entryRuleUShortArrayType7917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUShortArrayType7927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleUShortArrayType7973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntArrayType_in_entryRuleIntArrayType8009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntArrayType8019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleIntArrayType8065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntArrayType_in_entryRuleUIntArrayType8101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIntArrayType8111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleUIntArrayType8157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatArrayType_in_entryRuleFloatArrayType8193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatArrayType8203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleFloatArrayType8249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleArrayType_in_entryRuleDoubleArrayType8285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleArrayType8295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleDoubleArrayType8341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringArrayType_in_entryRuleStringArrayType8377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringArrayType8387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleStringArrayType8433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongStringArrayType_in_entryRuleLongStringArrayType8469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongStringArrayType8479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleLongStringArrayType8525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleStringArrayType_in_entryRuleDoubleStringArrayType8561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleStringArrayType8571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleDoubleStringArrayType8617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_entryRuleStateType8653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateType8663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleStateType8709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstStringType_in_entryRuleConstStringType8745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstStringType8755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleConstStringType8801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanArrayType_in_entryRuleBooleanArrayType8837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanArrayType8847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleBooleanArrayType8893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUCharType_in_entryRuleUCharType8929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUCharType8939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleUCharType8985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_entryRuleLongType9021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongType9031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleLongType9077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongType_in_entryRuleULongType9113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleULongType9123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleULongType9169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongArrayType_in_entryRuleLongArrayType9205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongArrayType9215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleLongArrayType9261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongArrayType_in_entryRuleULongArrayType9297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleULongArrayType9307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleULongArrayType9353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDevIntType_in_entryRuleDevIntType9389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDevIntType9399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleDevIntType9445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncodedType_in_entryRuleEncodedType9481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEncodedType9491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleEncodedType9537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortVectorType_in_entryRuleShortVectorType9573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortVectorType9583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleShortVectorType9629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntVectorType_in_entryRuleIntVectorType9665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntVectorType9675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleIntVectorType9721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatVectorType_in_entryRuleFloatVectorType9757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatVectorType9767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleFloatVectorType9813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleVectorType_in_entryRuleDoubleVectorType9849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleVectorType9859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleDoubleVectorType9905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVectorType_in_entryRuleStringVectorType9941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringVectorType9951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleStringVectorType9997 = new BitSet(new long[]{0x0000000000000002L});

}