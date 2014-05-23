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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'multiclasses'", "'{'", "'classes:'", "'}'", "'inheritances:'", "'parentClasses:'", "'additionalFiles:'", "'deviceclass'", "'abstract'", "'extends'", "'description:'", "'classProperties:'", "'deviceProperties:'", "'commands:'", "'dynamicCommands:'", "'attributes:'", "'dynamicAttributes:'", "'states:'", "'overlodedPollPeriodObject:'", "'Cpp'", "'Java'", "'Python'", "'OPERATOR'", "'EXPERT'", "'Scalar'", "'Spectrum'", "'Image'", "'READ'", "'WRITE'", "'READ_WRITE'", "'READ_WITH_WRITE'", "'true'", "'false'", "'defaultPropValue:'", "'excludedStates:'", "'enumLabels:'", "'readExcludedStates:'", "'writeExcludedStates:'", "'void'", "'boolean'", "'short'", "'ushort'", "'int'", "'uint'", "'float'", "'double'", "'string'", "'DevVarCharArray'", "'DevVarShortArray'", "'DevVarUShortArray'", "'DevVarLongArray'", "'DevVarULongArray'", "'DevVarFloatArray'", "'DevVarDoubleArray'", "'DevVarStringArray'", "'DevVarLongStringArray'", "'DevVarDoubleStringArray'", "'DevState'", "'ConstDevString'", "'DevVarBooleanArray'", "'DevUChar'", "'DevLong64'", "'DevULong64'", "'DevVarLong64Array'", "'DevVarULong64Array'", "'DevInt'", "'DevEncoded'", "'DevEnum'", "'vector<short>'", "'vector<int>'", "'vector<float>'", "'vector<double>'", "'vector<string>'"
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
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__83=83;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__84=84;
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:552:1: rulePogoDeviceClass returns [EObject current=null] : (otherlv_0= 'deviceclass' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isAbstract_2_0= 'abstract' ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_pogoRevision_6_0= RULE_ID ) ) ( (lv_institute_7_0= RULE_ID ) ) otherlv_8= 'description:' ( (lv_description_9_0= ruleClassDescription ) ) otherlv_10= 'classProperties:' ( (lv_classProperties_11_0= ruleProperty ) )* otherlv_12= 'deviceProperties:' ( (lv_deviceProperties_13_0= ruleProperty ) )* otherlv_14= 'commands:' ( (lv_commands_15_0= ruleCommand ) )* otherlv_16= 'dynamicCommands:' ( (lv_dynamicCommands_17_0= ruleCommand ) )* otherlv_18= 'attributes:' ( (lv_attributes_19_0= ruleAttribute ) )* otherlv_20= 'dynamicAttributes:' ( (lv_dynamicAttributes_21_0= ruleAttribute ) )* otherlv_22= 'states:' ( (lv_states_23_0= ruleState ) )* ( (lv_preferences_24_0= rulePreferences ) ) otherlv_25= 'additionalFiles:' ( (lv_additionalFiles_26_0= ruleAdditionalFile ) )* otherlv_27= 'overlodedPollPeriodObject:' ( (lv_overlodedPollPeriodObject_28_0= ruleOverlodedPollPeriodObject ) )* otherlv_29= '}' ) ;
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
        Token otherlv_22=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        EObject lv_description_9_0 = null;

        EObject lv_classProperties_11_0 = null;

        EObject lv_deviceProperties_13_0 = null;

        EObject lv_commands_15_0 = null;

        EObject lv_dynamicCommands_17_0 = null;

        EObject lv_attributes_19_0 = null;

        EObject lv_dynamicAttributes_21_0 = null;

        EObject lv_states_23_0 = null;

        EObject lv_preferences_24_0 = null;

        EObject lv_additionalFiles_26_0 = null;

        EObject lv_overlodedPollPeriodObject_28_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:555:28: ( (otherlv_0= 'deviceclass' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isAbstract_2_0= 'abstract' ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_pogoRevision_6_0= RULE_ID ) ) ( (lv_institute_7_0= RULE_ID ) ) otherlv_8= 'description:' ( (lv_description_9_0= ruleClassDescription ) ) otherlv_10= 'classProperties:' ( (lv_classProperties_11_0= ruleProperty ) )* otherlv_12= 'deviceProperties:' ( (lv_deviceProperties_13_0= ruleProperty ) )* otherlv_14= 'commands:' ( (lv_commands_15_0= ruleCommand ) )* otherlv_16= 'dynamicCommands:' ( (lv_dynamicCommands_17_0= ruleCommand ) )* otherlv_18= 'attributes:' ( (lv_attributes_19_0= ruleAttribute ) )* otherlv_20= 'dynamicAttributes:' ( (lv_dynamicAttributes_21_0= ruleAttribute ) )* otherlv_22= 'states:' ( (lv_states_23_0= ruleState ) )* ( (lv_preferences_24_0= rulePreferences ) ) otherlv_25= 'additionalFiles:' ( (lv_additionalFiles_26_0= ruleAdditionalFile ) )* otherlv_27= 'overlodedPollPeriodObject:' ( (lv_overlodedPollPeriodObject_28_0= ruleOverlodedPollPeriodObject ) )* otherlv_29= '}' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:556:1: (otherlv_0= 'deviceclass' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isAbstract_2_0= 'abstract' ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_pogoRevision_6_0= RULE_ID ) ) ( (lv_institute_7_0= RULE_ID ) ) otherlv_8= 'description:' ( (lv_description_9_0= ruleClassDescription ) ) otherlv_10= 'classProperties:' ( (lv_classProperties_11_0= ruleProperty ) )* otherlv_12= 'deviceProperties:' ( (lv_deviceProperties_13_0= ruleProperty ) )* otherlv_14= 'commands:' ( (lv_commands_15_0= ruleCommand ) )* otherlv_16= 'dynamicCommands:' ( (lv_dynamicCommands_17_0= ruleCommand ) )* otherlv_18= 'attributes:' ( (lv_attributes_19_0= ruleAttribute ) )* otherlv_20= 'dynamicAttributes:' ( (lv_dynamicAttributes_21_0= ruleAttribute ) )* otherlv_22= 'states:' ( (lv_states_23_0= ruleState ) )* ( (lv_preferences_24_0= rulePreferences ) ) otherlv_25= 'additionalFiles:' ( (lv_additionalFiles_26_0= ruleAdditionalFile ) )* otherlv_27= 'overlodedPollPeriodObject:' ( (lv_overlodedPollPeriodObject_28_0= ruleOverlodedPollPeriodObject ) )* otherlv_29= '}' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:556:1: (otherlv_0= 'deviceclass' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isAbstract_2_0= 'abstract' ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_pogoRevision_6_0= RULE_ID ) ) ( (lv_institute_7_0= RULE_ID ) ) otherlv_8= 'description:' ( (lv_description_9_0= ruleClassDescription ) ) otherlv_10= 'classProperties:' ( (lv_classProperties_11_0= ruleProperty ) )* otherlv_12= 'deviceProperties:' ( (lv_deviceProperties_13_0= ruleProperty ) )* otherlv_14= 'commands:' ( (lv_commands_15_0= ruleCommand ) )* otherlv_16= 'dynamicCommands:' ( (lv_dynamicCommands_17_0= ruleCommand ) )* otherlv_18= 'attributes:' ( (lv_attributes_19_0= ruleAttribute ) )* otherlv_20= 'dynamicAttributes:' ( (lv_dynamicAttributes_21_0= ruleAttribute ) )* otherlv_22= 'states:' ( (lv_states_23_0= ruleState ) )* ( (lv_preferences_24_0= rulePreferences ) ) otherlv_25= 'additionalFiles:' ( (lv_additionalFiles_26_0= ruleAdditionalFile ) )* otherlv_27= 'overlodedPollPeriodObject:' ( (lv_overlodedPollPeriodObject_28_0= ruleOverlodedPollPeriodObject ) )* otherlv_29= '}' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:556:3: otherlv_0= 'deviceclass' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isAbstract_2_0= 'abstract' ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_pogoRevision_6_0= RULE_ID ) ) ( (lv_institute_7_0= RULE_ID ) ) otherlv_8= 'description:' ( (lv_description_9_0= ruleClassDescription ) ) otherlv_10= 'classProperties:' ( (lv_classProperties_11_0= ruleProperty ) )* otherlv_12= 'deviceProperties:' ( (lv_deviceProperties_13_0= ruleProperty ) )* otherlv_14= 'commands:' ( (lv_commands_15_0= ruleCommand ) )* otherlv_16= 'dynamicCommands:' ( (lv_dynamicCommands_17_0= ruleCommand ) )* otherlv_18= 'attributes:' ( (lv_attributes_19_0= ruleAttribute ) )* otherlv_20= 'dynamicAttributes:' ( (lv_dynamicAttributes_21_0= ruleAttribute ) )* otherlv_22= 'states:' ( (lv_states_23_0= ruleState ) )* ( (lv_preferences_24_0= rulePreferences ) ) otherlv_25= 'additionalFiles:' ( (lv_additionalFiles_26_0= ruleAdditionalFile ) )* otherlv_27= 'overlodedPollPeriodObject:' ( (lv_overlodedPollPeriodObject_28_0= ruleOverlodedPollPeriodObject ) )* otherlv_29= '}'
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

                	newLeafNode(otherlv_16, grammarAccess.getPogoDeviceClassAccess().getDynamicCommandsKeyword_15());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:742:1: ( (lv_dynamicCommands_17_0= ruleCommand ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:743:1: (lv_dynamicCommands_17_0= ruleCommand )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:743:1: (lv_dynamicCommands_17_0= ruleCommand )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:744:3: lv_dynamicCommands_17_0= ruleCommand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getDynamicCommandsCommandParserRuleCall_16_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommand_in_rulePogoDeviceClass1250);
            	    lv_dynamicCommands_17_0=ruleCommand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dynamicCommands",
            	            		lv_dynamicCommands_17_0, 
            	            		"Command");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_18=(Token)match(input,27,FOLLOW_27_in_rulePogoDeviceClass1263); 

                	newLeafNode(otherlv_18, grammarAccess.getPogoDeviceClassAccess().getAttributesKeyword_17());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:764:1: ( (lv_attributes_19_0= ruleAttribute ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:765:1: (lv_attributes_19_0= ruleAttribute )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:765:1: (lv_attributes_19_0= ruleAttribute )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:766:3: lv_attributes_19_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getAttributesAttributeParserRuleCall_18_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_rulePogoDeviceClass1284);
            	    lv_attributes_19_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_19_0, 
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

                	newLeafNode(otherlv_20, grammarAccess.getPogoDeviceClassAccess().getDynamicAttributesKeyword_19());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:786:1: ( (lv_dynamicAttributes_21_0= ruleAttribute ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:787:1: (lv_dynamicAttributes_21_0= ruleAttribute )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:787:1: (lv_dynamicAttributes_21_0= ruleAttribute )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:788:3: lv_dynamicAttributes_21_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getDynamicAttributesAttributeParserRuleCall_20_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_rulePogoDeviceClass1318);
            	    lv_dynamicAttributes_21_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dynamicAttributes",
            	            		lv_dynamicAttributes_21_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_22=(Token)match(input,29,FOLLOW_29_in_rulePogoDeviceClass1331); 

                	newLeafNode(otherlv_22, grammarAccess.getPogoDeviceClassAccess().getStatesKeyword_21());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:808:1: ( (lv_states_23_0= ruleState ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:809:1: (lv_states_23_0= ruleState )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:809:1: (lv_states_23_0= ruleState )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:810:3: lv_states_23_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getStatesStateParserRuleCall_22_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_rulePogoDeviceClass1352);
            	    lv_states_23_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_23_0, 
            	            		"State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:826:3: ( (lv_preferences_24_0= rulePreferences ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:827:1: (lv_preferences_24_0= rulePreferences )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:827:1: (lv_preferences_24_0= rulePreferences )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:828:3: lv_preferences_24_0= rulePreferences
            {
             
            	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getPreferencesPreferencesParserRuleCall_23_0()); 
            	    
            pushFollow(FOLLOW_rulePreferences_in_rulePogoDeviceClass1374);
            lv_preferences_24_0=rulePreferences();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	        }
                   		set(
                   			current, 
                   			"preferences",
                    		lv_preferences_24_0, 
                    		"Preferences");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_25=(Token)match(input,18,FOLLOW_18_in_rulePogoDeviceClass1386); 

                	newLeafNode(otherlv_25, grammarAccess.getPogoDeviceClassAccess().getAdditionalFilesKeyword_24());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:848:1: ( (lv_additionalFiles_26_0= ruleAdditionalFile ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_STRING) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:849:1: (lv_additionalFiles_26_0= ruleAdditionalFile )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:849:1: (lv_additionalFiles_26_0= ruleAdditionalFile )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:850:3: lv_additionalFiles_26_0= ruleAdditionalFile
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getAdditionalFilesAdditionalFileParserRuleCall_25_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAdditionalFile_in_rulePogoDeviceClass1407);
            	    lv_additionalFiles_26_0=ruleAdditionalFile();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"additionalFiles",
            	            		lv_additionalFiles_26_0, 
            	            		"AdditionalFile");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_27=(Token)match(input,30,FOLLOW_30_in_rulePogoDeviceClass1420); 

                	newLeafNode(otherlv_27, grammarAccess.getPogoDeviceClassAccess().getOverlodedPollPeriodObjectKeyword_26());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:870:1: ( (lv_overlodedPollPeriodObject_28_0= ruleOverlodedPollPeriodObject ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_STRING) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:871:1: (lv_overlodedPollPeriodObject_28_0= ruleOverlodedPollPeriodObject )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:871:1: (lv_overlodedPollPeriodObject_28_0= ruleOverlodedPollPeriodObject )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:872:3: lv_overlodedPollPeriodObject_28_0= ruleOverlodedPollPeriodObject
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getOverlodedPollPeriodObjectOverlodedPollPeriodObjectParserRuleCall_27_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOverlodedPollPeriodObject_in_rulePogoDeviceClass1441);
            	    lv_overlodedPollPeriodObject_28_0=ruleOverlodedPollPeriodObject();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"overlodedPollPeriodObject",
            	            		lv_overlodedPollPeriodObject_28_0, 
            	            		"OverlodedPollPeriodObject");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_29=(Token)match(input,15,FOLLOW_15_in_rulePogoDeviceClass1454); 

                	newLeafNode(otherlv_29, grammarAccess.getPogoDeviceClassAccess().getRightCurlyBracketKeyword_28());
                

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:900:1: entryRuleLanguage returns [String current=null] : iv_ruleLanguage= ruleLanguage EOF ;
    public final String entryRuleLanguage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLanguage = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:901:2: (iv_ruleLanguage= ruleLanguage EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:902:2: iv_ruleLanguage= ruleLanguage EOF
            {
             newCompositeNode(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_ruleLanguage_in_entryRuleLanguage1491);
            iv_ruleLanguage=ruleLanguage();

            state._fsp--;

             current =iv_ruleLanguage.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLanguage1502); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:909:1: ruleLanguage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Cpp' | kw= 'Java' | kw= 'Python' ) ;
    public final AntlrDatatypeRuleToken ruleLanguage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:912:28: ( (kw= 'Cpp' | kw= 'Java' | kw= 'Python' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:913:1: (kw= 'Cpp' | kw= 'Java' | kw= 'Python' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:913:1: (kw= 'Cpp' | kw= 'Java' | kw= 'Python' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt16=1;
                }
                break;
            case 32:
                {
                alt16=2;
                }
                break;
            case 33:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:914:2: kw= 'Cpp'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleLanguage1540); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLanguageAccess().getCppKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:921:2: kw= 'Java'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleLanguage1559); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLanguageAccess().getJavaKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:928:2: kw= 'Python'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleLanguage1578); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:941:1: entryRuleDisplayLevel returns [String current=null] : iv_ruleDisplayLevel= ruleDisplayLevel EOF ;
    public final String entryRuleDisplayLevel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDisplayLevel = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:942:2: (iv_ruleDisplayLevel= ruleDisplayLevel EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:943:2: iv_ruleDisplayLevel= ruleDisplayLevel EOF
            {
             newCompositeNode(grammarAccess.getDisplayLevelRule()); 
            pushFollow(FOLLOW_ruleDisplayLevel_in_entryRuleDisplayLevel1619);
            iv_ruleDisplayLevel=ruleDisplayLevel();

            state._fsp--;

             current =iv_ruleDisplayLevel.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisplayLevel1630); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:950:1: ruleDisplayLevel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'OPERATOR' | kw= 'EXPERT' ) ;
    public final AntlrDatatypeRuleToken ruleDisplayLevel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:953:28: ( (kw= 'OPERATOR' | kw= 'EXPERT' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:954:1: (kw= 'OPERATOR' | kw= 'EXPERT' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:954:1: (kw= 'OPERATOR' | kw= 'EXPERT' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            else if ( (LA17_0==35) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:955:2: kw= 'OPERATOR'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleDisplayLevel1668); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDisplayLevelAccess().getOPERATORKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:962:2: kw= 'EXPERT'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleDisplayLevel1687); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:975:1: entryRuleAttrType returns [String current=null] : iv_ruleAttrType= ruleAttrType EOF ;
    public final String entryRuleAttrType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttrType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:976:2: (iv_ruleAttrType= ruleAttrType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:977:2: iv_ruleAttrType= ruleAttrType EOF
            {
             newCompositeNode(grammarAccess.getAttrTypeRule()); 
            pushFollow(FOLLOW_ruleAttrType_in_entryRuleAttrType1728);
            iv_ruleAttrType=ruleAttrType();

            state._fsp--;

             current =iv_ruleAttrType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrType1739); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:984:1: ruleAttrType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Scalar' | kw= 'Spectrum' | kw= 'Image' ) ;
    public final AntlrDatatypeRuleToken ruleAttrType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:987:28: ( (kw= 'Scalar' | kw= 'Spectrum' | kw= 'Image' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:988:1: (kw= 'Scalar' | kw= 'Spectrum' | kw= 'Image' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:988:1: (kw= 'Scalar' | kw= 'Spectrum' | kw= 'Image' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt18=1;
                }
                break;
            case 37:
                {
                alt18=2;
                }
                break;
            case 38:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:989:2: kw= 'Scalar'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleAttrType1777); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAttrTypeAccess().getScalarKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:996:2: kw= 'Spectrum'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleAttrType1796); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAttrTypeAccess().getSpectrumKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1003:2: kw= 'Image'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleAttrType1815); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1016:1: entryRuleRW_Type returns [String current=null] : iv_ruleRW_Type= ruleRW_Type EOF ;
    public final String entryRuleRW_Type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRW_Type = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1017:2: (iv_ruleRW_Type= ruleRW_Type EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1018:2: iv_ruleRW_Type= ruleRW_Type EOF
            {
             newCompositeNode(grammarAccess.getRW_TypeRule()); 
            pushFollow(FOLLOW_ruleRW_Type_in_entryRuleRW_Type1856);
            iv_ruleRW_Type=ruleRW_Type();

            state._fsp--;

             current =iv_ruleRW_Type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRW_Type1867); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1025:1: ruleRW_Type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'READ' | kw= 'WRITE' | kw= 'READ_WRITE' | kw= 'READ_WITH_WRITE' ) ;
    public final AntlrDatatypeRuleToken ruleRW_Type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1028:28: ( (kw= 'READ' | kw= 'WRITE' | kw= 'READ_WRITE' | kw= 'READ_WITH_WRITE' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1029:1: (kw= 'READ' | kw= 'WRITE' | kw= 'READ_WRITE' | kw= 'READ_WITH_WRITE' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1029:1: (kw= 'READ' | kw= 'WRITE' | kw= 'READ_WRITE' | kw= 'READ_WITH_WRITE' )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt19=1;
                }
                break;
            case 40:
                {
                alt19=2;
                }
                break;
            case 41:
                {
                alt19=3;
                }
                break;
            case 42:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1030:2: kw= 'READ'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleRW_Type1905); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRW_TypeAccess().getREADKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1037:2: kw= 'WRITE'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleRW_Type1924); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRW_TypeAccess().getWRITEKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1044:2: kw= 'READ_WRITE'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleRW_Type1943); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRW_TypeAccess().getREAD_WRITEKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1051:2: kw= 'READ_WITH_WRITE'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleRW_Type1962); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1064:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1065:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1066:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean2003);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean2014); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1073:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1076:28: ( (kw= 'true' | kw= 'false' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1077:1: (kw= 'true' | kw= 'false' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1077:1: (kw= 'true' | kw= 'false' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==43) ) {
                alt20=1;
            }
            else if ( (LA20_0==44) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1078:2: kw= 'true'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleBoolean2052); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1085:2: kw= 'false'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleBoolean2071); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1098:1: entryRuleClassDescription returns [EObject current=null] : iv_ruleClassDescription= ruleClassDescription EOF ;
    public final EObject entryRuleClassDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDescription = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1099:2: (iv_ruleClassDescription= ruleClassDescription EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1100:2: iv_ruleClassDescription= ruleClassDescription EOF
            {
             newCompositeNode(grammarAccess.getClassDescriptionRule()); 
            pushFollow(FOLLOW_ruleClassDescription_in_entryRuleClassDescription2111);
            iv_ruleClassDescription=ruleClassDescription();

            state._fsp--;

             current =iv_ruleClassDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassDescription2121); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1107:1: ruleClassDescription returns [EObject current=null] : ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_title_1_0= RULE_STRING ) ) ( (lv_sourcePath_2_0= RULE_STRING ) ) otherlv_3= 'inheritances:' ( (lv_inheritances_4_0= ruleInheritance ) ) ( (lv_language_5_0= ruleLanguage ) ) ( (lv_filestogenerate_6_0= RULE_STRING ) ) ( (lv_identification_7_0= ruleClassIdentification ) ) ( (lv_comments_8_0= ruleComments ) ) ( (lv_license_9_0= RULE_STRING ) ) ( (lv_hasMandatoryProperty_10_0= ruleBoolean ) ) ( (lv_hasConcreteProperty_11_0= ruleBoolean ) ) ( (lv_hasAbstractCommand_12_0= ruleBoolean ) ) ( (lv_hasAbstractAttribute_13_0= ruleBoolean ) ) ( (lv_descriptionHtmlExists_14_0= ruleBoolean ) ) ) ;
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
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1110:28: ( ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_title_1_0= RULE_STRING ) ) ( (lv_sourcePath_2_0= RULE_STRING ) ) otherlv_3= 'inheritances:' ( (lv_inheritances_4_0= ruleInheritance ) ) ( (lv_language_5_0= ruleLanguage ) ) ( (lv_filestogenerate_6_0= RULE_STRING ) ) ( (lv_identification_7_0= ruleClassIdentification ) ) ( (lv_comments_8_0= ruleComments ) ) ( (lv_license_9_0= RULE_STRING ) ) ( (lv_hasMandatoryProperty_10_0= ruleBoolean ) ) ( (lv_hasConcreteProperty_11_0= ruleBoolean ) ) ( (lv_hasAbstractCommand_12_0= ruleBoolean ) ) ( (lv_hasAbstractAttribute_13_0= ruleBoolean ) ) ( (lv_descriptionHtmlExists_14_0= ruleBoolean ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1111:1: ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_title_1_0= RULE_STRING ) ) ( (lv_sourcePath_2_0= RULE_STRING ) ) otherlv_3= 'inheritances:' ( (lv_inheritances_4_0= ruleInheritance ) ) ( (lv_language_5_0= ruleLanguage ) ) ( (lv_filestogenerate_6_0= RULE_STRING ) ) ( (lv_identification_7_0= ruleClassIdentification ) ) ( (lv_comments_8_0= ruleComments ) ) ( (lv_license_9_0= RULE_STRING ) ) ( (lv_hasMandatoryProperty_10_0= ruleBoolean ) ) ( (lv_hasConcreteProperty_11_0= ruleBoolean ) ) ( (lv_hasAbstractCommand_12_0= ruleBoolean ) ) ( (lv_hasAbstractAttribute_13_0= ruleBoolean ) ) ( (lv_descriptionHtmlExists_14_0= ruleBoolean ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1111:1: ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_title_1_0= RULE_STRING ) ) ( (lv_sourcePath_2_0= RULE_STRING ) ) otherlv_3= 'inheritances:' ( (lv_inheritances_4_0= ruleInheritance ) ) ( (lv_language_5_0= ruleLanguage ) ) ( (lv_filestogenerate_6_0= RULE_STRING ) ) ( (lv_identification_7_0= ruleClassIdentification ) ) ( (lv_comments_8_0= ruleComments ) ) ( (lv_license_9_0= RULE_STRING ) ) ( (lv_hasMandatoryProperty_10_0= ruleBoolean ) ) ( (lv_hasConcreteProperty_11_0= ruleBoolean ) ) ( (lv_hasAbstractCommand_12_0= ruleBoolean ) ) ( (lv_hasAbstractAttribute_13_0= ruleBoolean ) ) ( (lv_descriptionHtmlExists_14_0= ruleBoolean ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1111:2: ( (lv_description_0_0= RULE_STRING ) ) ( (lv_title_1_0= RULE_STRING ) ) ( (lv_sourcePath_2_0= RULE_STRING ) ) otherlv_3= 'inheritances:' ( (lv_inheritances_4_0= ruleInheritance ) ) ( (lv_language_5_0= ruleLanguage ) ) ( (lv_filestogenerate_6_0= RULE_STRING ) ) ( (lv_identification_7_0= ruleClassIdentification ) ) ( (lv_comments_8_0= ruleComments ) ) ( (lv_license_9_0= RULE_STRING ) ) ( (lv_hasMandatoryProperty_10_0= ruleBoolean ) ) ( (lv_hasConcreteProperty_11_0= ruleBoolean ) ) ( (lv_hasAbstractCommand_12_0= ruleBoolean ) ) ( (lv_hasAbstractAttribute_13_0= ruleBoolean ) ) ( (lv_descriptionHtmlExists_14_0= ruleBoolean ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1111:2: ( (lv_description_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1112:1: (lv_description_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1112:1: (lv_description_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1113:3: lv_description_0_0= RULE_STRING
            {
            lv_description_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassDescription2163); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1129:2: ( (lv_title_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1130:1: (lv_title_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1130:1: (lv_title_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1131:3: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassDescription2185); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1147:2: ( (lv_sourcePath_2_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1148:1: (lv_sourcePath_2_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1148:1: (lv_sourcePath_2_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1149:3: lv_sourcePath_2_0= RULE_STRING
            {
            lv_sourcePath_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassDescription2207); 

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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleClassDescription2224); 

                	newLeafNode(otherlv_3, grammarAccess.getClassDescriptionAccess().getInheritancesKeyword_3());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1169:1: ( (lv_inheritances_4_0= ruleInheritance ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1170:1: (lv_inheritances_4_0= ruleInheritance )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1170:1: (lv_inheritances_4_0= ruleInheritance )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1171:3: lv_inheritances_4_0= ruleInheritance
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getInheritancesInheritanceParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleInheritance_in_ruleClassDescription2245);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1187:2: ( (lv_language_5_0= ruleLanguage ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1188:1: (lv_language_5_0= ruleLanguage )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1188:1: (lv_language_5_0= ruleLanguage )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1189:3: lv_language_5_0= ruleLanguage
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getLanguageLanguageParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleLanguage_in_ruleClassDescription2266);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1205:2: ( (lv_filestogenerate_6_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1206:1: (lv_filestogenerate_6_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1206:1: (lv_filestogenerate_6_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1207:3: lv_filestogenerate_6_0= RULE_STRING
            {
            lv_filestogenerate_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassDescription2283); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1223:2: ( (lv_identification_7_0= ruleClassIdentification ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1224:1: (lv_identification_7_0= ruleClassIdentification )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1224:1: (lv_identification_7_0= ruleClassIdentification )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1225:3: lv_identification_7_0= ruleClassIdentification
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getIdentificationClassIdentificationParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleClassIdentification_in_ruleClassDescription2309);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1241:2: ( (lv_comments_8_0= ruleComments ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1242:1: (lv_comments_8_0= ruleComments )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1242:1: (lv_comments_8_0= ruleComments )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1243:3: lv_comments_8_0= ruleComments
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getCommentsCommentsParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleComments_in_ruleClassDescription2330);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1259:2: ( (lv_license_9_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1260:1: (lv_license_9_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1260:1: (lv_license_9_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1261:3: lv_license_9_0= RULE_STRING
            {
            lv_license_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassDescription2347); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1277:2: ( (lv_hasMandatoryProperty_10_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1278:1: (lv_hasMandatoryProperty_10_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1278:1: (lv_hasMandatoryProperty_10_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1279:3: lv_hasMandatoryProperty_10_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getHasMandatoryPropertyBooleanParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleClassDescription2373);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1295:2: ( (lv_hasConcreteProperty_11_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1296:1: (lv_hasConcreteProperty_11_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1296:1: (lv_hasConcreteProperty_11_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1297:3: lv_hasConcreteProperty_11_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getHasConcretePropertyBooleanParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleClassDescription2394);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1313:2: ( (lv_hasAbstractCommand_12_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1314:1: (lv_hasAbstractCommand_12_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1314:1: (lv_hasAbstractCommand_12_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1315:3: lv_hasAbstractCommand_12_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getHasAbstractCommandBooleanParserRuleCall_12_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleClassDescription2415);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1331:2: ( (lv_hasAbstractAttribute_13_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1332:1: (lv_hasAbstractAttribute_13_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1332:1: (lv_hasAbstractAttribute_13_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1333:3: lv_hasAbstractAttribute_13_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getHasAbstractAttributeBooleanParserRuleCall_13_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleClassDescription2436);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1349:2: ( (lv_descriptionHtmlExists_14_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1350:1: (lv_descriptionHtmlExists_14_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1350:1: (lv_descriptionHtmlExists_14_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1351:3: lv_descriptionHtmlExists_14_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getDescriptionHtmlExistsBooleanParserRuleCall_14_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleClassDescription2457);
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1375:1: entryRuleInheritance returns [EObject current=null] : iv_ruleInheritance= ruleInheritance EOF ;
    public final EObject entryRuleInheritance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritance = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1376:2: (iv_ruleInheritance= ruleInheritance EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1377:2: iv_ruleInheritance= ruleInheritance EOF
            {
             newCompositeNode(grammarAccess.getInheritanceRule()); 
            pushFollow(FOLLOW_ruleInheritance_in_entryRuleInheritance2493);
            iv_ruleInheritance=ruleInheritance();

            state._fsp--;

             current =iv_ruleInheritance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInheritance2503); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1384:1: ruleInheritance returns [EObject current=null] : ( ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInheritance() throws RecognitionException {
        EObject current = null;

        Token lv_classname_0_0=null;
        Token lv_sourcePath_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1387:28: ( ( ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1388:1: ( ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1388:1: ( ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1388:2: ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1388:2: ( (lv_classname_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1389:1: (lv_classname_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1389:1: (lv_classname_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1390:3: lv_classname_0_0= RULE_STRING
            {
            lv_classname_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInheritance2545); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1406:2: ( (lv_sourcePath_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1407:1: (lv_sourcePath_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1407:1: (lv_sourcePath_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1408:3: lv_sourcePath_1_0= RULE_STRING
            {
            lv_sourcePath_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInheritance2567); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1432:1: entryRuleClassIdentification returns [EObject current=null] : iv_ruleClassIdentification= ruleClassIdentification EOF ;
    public final EObject entryRuleClassIdentification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassIdentification = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1433:2: (iv_ruleClassIdentification= ruleClassIdentification EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1434:2: iv_ruleClassIdentification= ruleClassIdentification EOF
            {
             newCompositeNode(grammarAccess.getClassIdentificationRule()); 
            pushFollow(FOLLOW_ruleClassIdentification_in_entryRuleClassIdentification2608);
            iv_ruleClassIdentification=ruleClassIdentification();

            state._fsp--;

             current =iv_ruleClassIdentification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassIdentification2618); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1441:1: ruleClassIdentification returns [EObject current=null] : ( ( (lv_contact_0_0= RULE_STRING ) ) ( (lv_author_1_0= RULE_STRING ) ) ( (lv_emailDomain_2_0= RULE_STRING ) ) ( (lv_classFamily_3_0= RULE_STRING ) ) ( (lv_siteSpecific_4_0= RULE_STRING ) ) ( (lv_platform_5_0= RULE_STRING ) ) ( (lv_bus_6_0= RULE_STRING ) ) ( (lv_manufacturer_7_0= RULE_STRING ) ) ( (lv_reference_8_0= RULE_STRING ) ) ) ;
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
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1444:28: ( ( ( (lv_contact_0_0= RULE_STRING ) ) ( (lv_author_1_0= RULE_STRING ) ) ( (lv_emailDomain_2_0= RULE_STRING ) ) ( (lv_classFamily_3_0= RULE_STRING ) ) ( (lv_siteSpecific_4_0= RULE_STRING ) ) ( (lv_platform_5_0= RULE_STRING ) ) ( (lv_bus_6_0= RULE_STRING ) ) ( (lv_manufacturer_7_0= RULE_STRING ) ) ( (lv_reference_8_0= RULE_STRING ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1445:1: ( ( (lv_contact_0_0= RULE_STRING ) ) ( (lv_author_1_0= RULE_STRING ) ) ( (lv_emailDomain_2_0= RULE_STRING ) ) ( (lv_classFamily_3_0= RULE_STRING ) ) ( (lv_siteSpecific_4_0= RULE_STRING ) ) ( (lv_platform_5_0= RULE_STRING ) ) ( (lv_bus_6_0= RULE_STRING ) ) ( (lv_manufacturer_7_0= RULE_STRING ) ) ( (lv_reference_8_0= RULE_STRING ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1445:1: ( ( (lv_contact_0_0= RULE_STRING ) ) ( (lv_author_1_0= RULE_STRING ) ) ( (lv_emailDomain_2_0= RULE_STRING ) ) ( (lv_classFamily_3_0= RULE_STRING ) ) ( (lv_siteSpecific_4_0= RULE_STRING ) ) ( (lv_platform_5_0= RULE_STRING ) ) ( (lv_bus_6_0= RULE_STRING ) ) ( (lv_manufacturer_7_0= RULE_STRING ) ) ( (lv_reference_8_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1445:2: ( (lv_contact_0_0= RULE_STRING ) ) ( (lv_author_1_0= RULE_STRING ) ) ( (lv_emailDomain_2_0= RULE_STRING ) ) ( (lv_classFamily_3_0= RULE_STRING ) ) ( (lv_siteSpecific_4_0= RULE_STRING ) ) ( (lv_platform_5_0= RULE_STRING ) ) ( (lv_bus_6_0= RULE_STRING ) ) ( (lv_manufacturer_7_0= RULE_STRING ) ) ( (lv_reference_8_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1445:2: ( (lv_contact_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1446:1: (lv_contact_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1446:1: (lv_contact_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1447:3: lv_contact_0_0= RULE_STRING
            {
            lv_contact_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2660); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1463:2: ( (lv_author_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1464:1: (lv_author_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1464:1: (lv_author_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1465:3: lv_author_1_0= RULE_STRING
            {
            lv_author_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2682); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1481:2: ( (lv_emailDomain_2_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1482:1: (lv_emailDomain_2_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1482:1: (lv_emailDomain_2_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1483:3: lv_emailDomain_2_0= RULE_STRING
            {
            lv_emailDomain_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2704); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1499:2: ( (lv_classFamily_3_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1500:1: (lv_classFamily_3_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1500:1: (lv_classFamily_3_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1501:3: lv_classFamily_3_0= RULE_STRING
            {
            lv_classFamily_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2726); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1517:2: ( (lv_siteSpecific_4_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1518:1: (lv_siteSpecific_4_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1518:1: (lv_siteSpecific_4_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1519:3: lv_siteSpecific_4_0= RULE_STRING
            {
            lv_siteSpecific_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2748); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1535:2: ( (lv_platform_5_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1536:1: (lv_platform_5_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1536:1: (lv_platform_5_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1537:3: lv_platform_5_0= RULE_STRING
            {
            lv_platform_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2770); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1553:2: ( (lv_bus_6_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1554:1: (lv_bus_6_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1554:1: (lv_bus_6_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1555:3: lv_bus_6_0= RULE_STRING
            {
            lv_bus_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2792); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1571:2: ( (lv_manufacturer_7_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1572:1: (lv_manufacturer_7_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1572:1: (lv_manufacturer_7_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1573:3: lv_manufacturer_7_0= RULE_STRING
            {
            lv_manufacturer_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2814); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1589:2: ( (lv_reference_8_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1590:1: (lv_reference_8_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1590:1: (lv_reference_8_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1591:3: lv_reference_8_0= RULE_STRING
            {
            lv_reference_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2836); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1615:1: entryRuleComments returns [EObject current=null] : iv_ruleComments= ruleComments EOF ;
    public final EObject entryRuleComments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComments = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1616:2: (iv_ruleComments= ruleComments EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1617:2: iv_ruleComments= ruleComments EOF
            {
             newCompositeNode(grammarAccess.getCommentsRule()); 
            pushFollow(FOLLOW_ruleComments_in_entryRuleComments2877);
            iv_ruleComments=ruleComments();

            state._fsp--;

             current =iv_ruleComments; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComments2887); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1624:1: ruleComments returns [EObject current=null] : ( (lv_commandsTable_0_0= RULE_STRING ) ) ;
    public final EObject ruleComments() throws RecognitionException {
        EObject current = null;

        Token lv_commandsTable_0_0=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1627:28: ( ( (lv_commandsTable_0_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1628:1: ( (lv_commandsTable_0_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1628:1: ( (lv_commandsTable_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1629:1: (lv_commandsTable_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1629:1: (lv_commandsTable_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1630:3: lv_commandsTable_0_0= RULE_STRING
            {
            lv_commandsTable_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleComments2928); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1654:1: entryRulePreferences returns [EObject current=null] : iv_rulePreferences= rulePreferences EOF ;
    public final EObject entryRulePreferences() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreferences = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1655:2: (iv_rulePreferences= rulePreferences EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1656:2: iv_rulePreferences= rulePreferences EOF
            {
             newCompositeNode(grammarAccess.getPreferencesRule()); 
            pushFollow(FOLLOW_rulePreferences_in_entryRulePreferences2968);
            iv_rulePreferences=rulePreferences();

            state._fsp--;

             current =iv_rulePreferences; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePreferences2978); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1663:1: rulePreferences returns [EObject current=null] : ( ( (lv_docHome_0_0= RULE_STRING ) ) ( (lv_makefileHome_1_0= RULE_STRING ) ) ( (lv_installHome_2_0= RULE_STRING ) ) ( (lv_htmlVersion_3_0= ruleBoolean ) ) ) ;
    public final EObject rulePreferences() throws RecognitionException {
        EObject current = null;

        Token lv_docHome_0_0=null;
        Token lv_makefileHome_1_0=null;
        Token lv_installHome_2_0=null;
        AntlrDatatypeRuleToken lv_htmlVersion_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1666:28: ( ( ( (lv_docHome_0_0= RULE_STRING ) ) ( (lv_makefileHome_1_0= RULE_STRING ) ) ( (lv_installHome_2_0= RULE_STRING ) ) ( (lv_htmlVersion_3_0= ruleBoolean ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1667:1: ( ( (lv_docHome_0_0= RULE_STRING ) ) ( (lv_makefileHome_1_0= RULE_STRING ) ) ( (lv_installHome_2_0= RULE_STRING ) ) ( (lv_htmlVersion_3_0= ruleBoolean ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1667:1: ( ( (lv_docHome_0_0= RULE_STRING ) ) ( (lv_makefileHome_1_0= RULE_STRING ) ) ( (lv_installHome_2_0= RULE_STRING ) ) ( (lv_htmlVersion_3_0= ruleBoolean ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1667:2: ( (lv_docHome_0_0= RULE_STRING ) ) ( (lv_makefileHome_1_0= RULE_STRING ) ) ( (lv_installHome_2_0= RULE_STRING ) ) ( (lv_htmlVersion_3_0= ruleBoolean ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1667:2: ( (lv_docHome_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1668:1: (lv_docHome_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1668:1: (lv_docHome_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1669:3: lv_docHome_0_0= RULE_STRING
            {
            lv_docHome_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePreferences3020); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1685:2: ( (lv_makefileHome_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1686:1: (lv_makefileHome_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1686:1: (lv_makefileHome_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1687:3: lv_makefileHome_1_0= RULE_STRING
            {
            lv_makefileHome_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePreferences3042); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1703:2: ( (lv_installHome_2_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1704:1: (lv_installHome_2_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1704:1: (lv_installHome_2_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1705:3: lv_installHome_2_0= RULE_STRING
            {
            lv_installHome_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePreferences3064); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1721:2: ( (lv_htmlVersion_3_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1722:1: (lv_htmlVersion_3_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1722:1: (lv_htmlVersion_3_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1723:3: lv_htmlVersion_3_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getPreferencesAccess().getHtmlVersionBooleanParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_rulePreferences3090);
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1747:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1748:2: (iv_ruleState= ruleState EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1749:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState3126);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState3136); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1756:1: ruleState returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_1_0=null;
        EObject lv_status_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1759:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1760:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1760:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1760:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_status_2_0= ruleInheritanceStatus ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1760:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1761:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1761:1: (lv_name_0_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1762:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState3178); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1778:2: ( (lv_description_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1779:1: (lv_description_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1779:1: (lv_description_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1780:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState3200); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1796:2: ( (lv_status_2_0= ruleInheritanceStatus ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1797:1: (lv_status_2_0= ruleInheritanceStatus )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1797:1: (lv_status_2_0= ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1798:3: lv_status_2_0= ruleInheritanceStatus
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getStatusInheritanceStatusParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleInheritanceStatus_in_ruleState3226);
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1822:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1823:2: (iv_ruleProperty= ruleProperty EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1824:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty3262);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty3272); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1831:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= rulePropType ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) ( (lv_mandatory_3_0= ruleBoolean ) ) ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'defaultPropValue:' ( (lv_DefaultPropValue_6_0= RULE_STRING ) )* ) ;
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
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1834:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= rulePropType ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) ( (lv_mandatory_3_0= ruleBoolean ) ) ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'defaultPropValue:' ( (lv_DefaultPropValue_6_0= RULE_STRING ) )* ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1835:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= rulePropType ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) ( (lv_mandatory_3_0= ruleBoolean ) ) ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'defaultPropValue:' ( (lv_DefaultPropValue_6_0= RULE_STRING ) )* )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1835:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= rulePropType ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) ( (lv_mandatory_3_0= ruleBoolean ) ) ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'defaultPropValue:' ( (lv_DefaultPropValue_6_0= RULE_STRING ) )* )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1835:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= rulePropType ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) ( (lv_mandatory_3_0= ruleBoolean ) ) ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'defaultPropValue:' ( (lv_DefaultPropValue_6_0= RULE_STRING ) )*
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1835:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1836:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1836:1: (lv_name_0_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1837:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty3314); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1853:2: ( (lv_type_1_0= rulePropType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1854:1: (lv_type_1_0= rulePropType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1854:1: (lv_type_1_0= rulePropType )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1855:3: lv_type_1_0= rulePropType
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getTypePropTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePropType_in_ruleProperty3340);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1871:2: ( (lv_status_2_0= ruleInheritanceStatus ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1872:1: (lv_status_2_0= ruleInheritanceStatus )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1872:1: (lv_status_2_0= ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1873:3: lv_status_2_0= ruleInheritanceStatus
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getStatusInheritanceStatusParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleInheritanceStatus_in_ruleProperty3361);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1889:2: ( (lv_mandatory_3_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1890:1: (lv_mandatory_3_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1890:1: (lv_mandatory_3_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1891:3: lv_mandatory_3_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getMandatoryBooleanParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleProperty3382);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1907:2: ( (lv_description_4_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1908:1: (lv_description_4_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1908:1: (lv_description_4_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1909:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProperty3399); 

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

            otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleProperty3416); 

                	newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getDefaultPropValueKeyword_5());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1929:1: ( (lv_DefaultPropValue_6_0= RULE_STRING ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STRING) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1930:1: (lv_DefaultPropValue_6_0= RULE_STRING )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1930:1: (lv_DefaultPropValue_6_0= RULE_STRING )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1931:3: lv_DefaultPropValue_6_0= RULE_STRING
            	    {
            	    lv_DefaultPropValue_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProperty3433); 

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
            	    break loop21;
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1955:1: entryRulePropType returns [EObject current=null] : iv_rulePropType= rulePropType EOF ;
    public final EObject entryRulePropType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1956:2: (iv_rulePropType= rulePropType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1957:2: iv_rulePropType= rulePropType EOF
            {
             newCompositeNode(grammarAccess.getPropTypeRule()); 
            pushFollow(FOLLOW_rulePropType_in_entryRulePropType3475);
            iv_rulePropType=rulePropType();

            state._fsp--;

             current =iv_rulePropType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropType3485); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1964:1: rulePropType returns [EObject current=null] : (this_SimpleType_0= ruleSimpleType | this_VectorType_1= ruleVectorType ) ;
    public final EObject rulePropType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleType_0 = null;

        EObject this_VectorType_1 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1967:28: ( (this_SimpleType_0= ruleSimpleType | this_VectorType_1= ruleVectorType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1968:1: (this_SimpleType_0= ruleSimpleType | this_VectorType_1= ruleVectorType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1968:1: (this_SimpleType_0= ruleSimpleType | this_VectorType_1= ruleVectorType )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=51 && LA22_0<=58)) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=80 && LA22_0<=84)) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1969:5: this_SimpleType_0= ruleSimpleType
                    {
                     
                            newCompositeNode(grammarAccess.getPropTypeAccess().getSimpleTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleType_in_rulePropType3532);
                    this_SimpleType_0=ruleSimpleType();

                    state._fsp--;

                     
                            current = this_SimpleType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1979:5: this_VectorType_1= ruleVectorType
                    {
                     
                            newCompositeNode(grammarAccess.getPropTypeAccess().getVectorTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVectorType_in_rulePropType3559);
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1995:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1996:2: (iv_ruleSimpleType= ruleSimpleType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1997:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType3594);
            iv_ruleSimpleType=ruleSimpleType();

            state._fsp--;

             current =iv_ruleSimpleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType3604); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2004:1: ruleSimpleType returns [EObject current=null] : (this_BooleanType_0= ruleBooleanType | this_ShortType_1= ruleShortType | this_UShortType_2= ruleUShortType | this_IntType_3= ruleIntType | this_UIntType_4= ruleUIntType | this_FloatType_5= ruleFloatType | this_DoubleType_6= ruleDoubleType | this_StringType_7= ruleStringType ) ;
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
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2007:28: ( (this_BooleanType_0= ruleBooleanType | this_ShortType_1= ruleShortType | this_UShortType_2= ruleUShortType | this_IntType_3= ruleIntType | this_UIntType_4= ruleUIntType | this_FloatType_5= ruleFloatType | this_DoubleType_6= ruleDoubleType | this_StringType_7= ruleStringType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2008:1: (this_BooleanType_0= ruleBooleanType | this_ShortType_1= ruleShortType | this_UShortType_2= ruleUShortType | this_IntType_3= ruleIntType | this_UIntType_4= ruleUIntType | this_FloatType_5= ruleFloatType | this_DoubleType_6= ruleDoubleType | this_StringType_7= ruleStringType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2008:1: (this_BooleanType_0= ruleBooleanType | this_ShortType_1= ruleShortType | this_UShortType_2= ruleUShortType | this_IntType_3= ruleIntType | this_UIntType_4= ruleUIntType | this_FloatType_5= ruleFloatType | this_DoubleType_6= ruleDoubleType | this_StringType_7= ruleStringType )
            int alt23=8;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt23=1;
                }
                break;
            case 52:
                {
                alt23=2;
                }
                break;
            case 53:
                {
                alt23=3;
                }
                break;
            case 54:
                {
                alt23=4;
                }
                break;
            case 55:
                {
                alt23=5;
                }
                break;
            case 56:
                {
                alt23=6;
                }
                break;
            case 57:
                {
                alt23=7;
                }
                break;
            case 58:
                {
                alt23=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2009:5: this_BooleanType_0= ruleBooleanType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getBooleanTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBooleanType_in_ruleSimpleType3651);
                    this_BooleanType_0=ruleBooleanType();

                    state._fsp--;

                     
                            current = this_BooleanType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2019:5: this_ShortType_1= ruleShortType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getShortTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleShortType_in_ruleSimpleType3678);
                    this_ShortType_1=ruleShortType();

                    state._fsp--;

                     
                            current = this_ShortType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2029:5: this_UShortType_2= ruleUShortType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getUShortTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleUShortType_in_ruleSimpleType3705);
                    this_UShortType_2=ruleUShortType();

                    state._fsp--;

                     
                            current = this_UShortType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2039:5: this_IntType_3= ruleIntType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getIntTypeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleIntType_in_ruleSimpleType3732);
                    this_IntType_3=ruleIntType();

                    state._fsp--;

                     
                            current = this_IntType_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2049:5: this_UIntType_4= ruleUIntType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getUIntTypeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleUIntType_in_ruleSimpleType3759);
                    this_UIntType_4=ruleUIntType();

                    state._fsp--;

                     
                            current = this_UIntType_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2059:5: this_FloatType_5= ruleFloatType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getFloatTypeParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleFloatType_in_ruleSimpleType3786);
                    this_FloatType_5=ruleFloatType();

                    state._fsp--;

                     
                            current = this_FloatType_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2069:5: this_DoubleType_6= ruleDoubleType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getDoubleTypeParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleDoubleType_in_ruleSimpleType3813);
                    this_DoubleType_6=ruleDoubleType();

                    state._fsp--;

                     
                            current = this_DoubleType_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2079:5: this_StringType_7= ruleStringType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getStringTypeParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleStringType_in_ruleSimpleType3840);
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2095:1: entryRuleVectorType returns [EObject current=null] : iv_ruleVectorType= ruleVectorType EOF ;
    public final EObject entryRuleVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2096:2: (iv_ruleVectorType= ruleVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2097:2: iv_ruleVectorType= ruleVectorType EOF
            {
             newCompositeNode(grammarAccess.getVectorTypeRule()); 
            pushFollow(FOLLOW_ruleVectorType_in_entryRuleVectorType3875);
            iv_ruleVectorType=ruleVectorType();

            state._fsp--;

             current =iv_ruleVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVectorType3885); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2104:1: ruleVectorType returns [EObject current=null] : (this_ShortVectorType_0= ruleShortVectorType | this_IntVectorType_1= ruleIntVectorType | this_FloatVectorType_2= ruleFloatVectorType | this_DoubleVectorType_3= ruleDoubleVectorType | this_StringVectorType_4= ruleStringVectorType ) ;
    public final EObject ruleVectorType() throws RecognitionException {
        EObject current = null;

        EObject this_ShortVectorType_0 = null;

        EObject this_IntVectorType_1 = null;

        EObject this_FloatVectorType_2 = null;

        EObject this_DoubleVectorType_3 = null;

        EObject this_StringVectorType_4 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2107:28: ( (this_ShortVectorType_0= ruleShortVectorType | this_IntVectorType_1= ruleIntVectorType | this_FloatVectorType_2= ruleFloatVectorType | this_DoubleVectorType_3= ruleDoubleVectorType | this_StringVectorType_4= ruleStringVectorType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2108:1: (this_ShortVectorType_0= ruleShortVectorType | this_IntVectorType_1= ruleIntVectorType | this_FloatVectorType_2= ruleFloatVectorType | this_DoubleVectorType_3= ruleDoubleVectorType | this_StringVectorType_4= ruleStringVectorType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2108:1: (this_ShortVectorType_0= ruleShortVectorType | this_IntVectorType_1= ruleIntVectorType | this_FloatVectorType_2= ruleFloatVectorType | this_DoubleVectorType_3= ruleDoubleVectorType | this_StringVectorType_4= ruleStringVectorType )
            int alt24=5;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt24=1;
                }
                break;
            case 81:
                {
                alt24=2;
                }
                break;
            case 82:
                {
                alt24=3;
                }
                break;
            case 83:
                {
                alt24=4;
                }
                break;
            case 84:
                {
                alt24=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2109:5: this_ShortVectorType_0= ruleShortVectorType
                    {
                     
                            newCompositeNode(grammarAccess.getVectorTypeAccess().getShortVectorTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleShortVectorType_in_ruleVectorType3932);
                    this_ShortVectorType_0=ruleShortVectorType();

                    state._fsp--;

                     
                            current = this_ShortVectorType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2119:5: this_IntVectorType_1= ruleIntVectorType
                    {
                     
                            newCompositeNode(grammarAccess.getVectorTypeAccess().getIntVectorTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntVectorType_in_ruleVectorType3959);
                    this_IntVectorType_1=ruleIntVectorType();

                    state._fsp--;

                     
                            current = this_IntVectorType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2129:5: this_FloatVectorType_2= ruleFloatVectorType
                    {
                     
                            newCompositeNode(grammarAccess.getVectorTypeAccess().getFloatVectorTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFloatVectorType_in_ruleVectorType3986);
                    this_FloatVectorType_2=ruleFloatVectorType();

                    state._fsp--;

                     
                            current = this_FloatVectorType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2139:5: this_DoubleVectorType_3= ruleDoubleVectorType
                    {
                     
                            newCompositeNode(grammarAccess.getVectorTypeAccess().getDoubleVectorTypeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDoubleVectorType_in_ruleVectorType4013);
                    this_DoubleVectorType_3=ruleDoubleVectorType();

                    state._fsp--;

                     
                            current = this_DoubleVectorType_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2149:5: this_StringVectorType_4= ruleStringVectorType
                    {
                     
                            newCompositeNode(grammarAccess.getVectorTypeAccess().getStringVectorTypeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleStringVectorType_in_ruleVectorType4040);
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2165:1: entryRuleInheritanceStatus returns [EObject current=null] : iv_ruleInheritanceStatus= ruleInheritanceStatus EOF ;
    public final EObject entryRuleInheritanceStatus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritanceStatus = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2166:2: (iv_ruleInheritanceStatus= ruleInheritanceStatus EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2167:2: iv_ruleInheritanceStatus= ruleInheritanceStatus EOF
            {
             newCompositeNode(grammarAccess.getInheritanceStatusRule()); 
            pushFollow(FOLLOW_ruleInheritanceStatus_in_entryRuleInheritanceStatus4075);
            iv_ruleInheritanceStatus=ruleInheritanceStatus();

            state._fsp--;

             current =iv_ruleInheritanceStatus; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInheritanceStatus4085); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2174:1: ruleInheritanceStatus returns [EObject current=null] : ( ( (lv_abstract_0_0= ruleBoolean ) ) ( (lv_inherited_1_0= ruleBoolean ) ) ( (lv_concrete_2_0= ruleBoolean ) ) ( (lv_concreteHere_3_0= ruleBoolean ) ) ( (lv_hasChanged_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleInheritanceStatus() throws RecognitionException {
        EObject current = null;

        Token lv_hasChanged_4_0=null;
        AntlrDatatypeRuleToken lv_abstract_0_0 = null;

        AntlrDatatypeRuleToken lv_inherited_1_0 = null;

        AntlrDatatypeRuleToken lv_concrete_2_0 = null;

        AntlrDatatypeRuleToken lv_concreteHere_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2177:28: ( ( ( (lv_abstract_0_0= ruleBoolean ) ) ( (lv_inherited_1_0= ruleBoolean ) ) ( (lv_concrete_2_0= ruleBoolean ) ) ( (lv_concreteHere_3_0= ruleBoolean ) ) ( (lv_hasChanged_4_0= RULE_STRING ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2178:1: ( ( (lv_abstract_0_0= ruleBoolean ) ) ( (lv_inherited_1_0= ruleBoolean ) ) ( (lv_concrete_2_0= ruleBoolean ) ) ( (lv_concreteHere_3_0= ruleBoolean ) ) ( (lv_hasChanged_4_0= RULE_STRING ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2178:1: ( ( (lv_abstract_0_0= ruleBoolean ) ) ( (lv_inherited_1_0= ruleBoolean ) ) ( (lv_concrete_2_0= ruleBoolean ) ) ( (lv_concreteHere_3_0= ruleBoolean ) ) ( (lv_hasChanged_4_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2178:2: ( (lv_abstract_0_0= ruleBoolean ) ) ( (lv_inherited_1_0= ruleBoolean ) ) ( (lv_concrete_2_0= ruleBoolean ) ) ( (lv_concreteHere_3_0= ruleBoolean ) ) ( (lv_hasChanged_4_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2178:2: ( (lv_abstract_0_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2179:1: (lv_abstract_0_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2179:1: (lv_abstract_0_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2180:3: lv_abstract_0_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getInheritanceStatusAccess().getAbstractBooleanParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleInheritanceStatus4131);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2196:2: ( (lv_inherited_1_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2197:1: (lv_inherited_1_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2197:1: (lv_inherited_1_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2198:3: lv_inherited_1_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getInheritanceStatusAccess().getInheritedBooleanParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleInheritanceStatus4152);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2214:2: ( (lv_concrete_2_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2215:1: (lv_concrete_2_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2215:1: (lv_concrete_2_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2216:3: lv_concrete_2_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getInheritanceStatusAccess().getConcreteBooleanParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleInheritanceStatus4173);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2232:2: ( (lv_concreteHere_3_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2233:1: (lv_concreteHere_3_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2233:1: (lv_concreteHere_3_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2234:3: lv_concreteHere_3_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getInheritanceStatusAccess().getConcreteHereBooleanParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleInheritanceStatus4194);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2250:2: ( (lv_hasChanged_4_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2251:1: (lv_hasChanged_4_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2251:1: (lv_hasChanged_4_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2252:3: lv_hasChanged_4_0= RULE_STRING
            {
            lv_hasChanged_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInheritanceStatus4211); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2276:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2277:2: (iv_ruleCommand= ruleCommand EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2278:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand4252);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand4262); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2285:1: ruleCommand returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_argin_1_0= ruleArgument ) ) ( (lv_argout_2_0= ruleArgument ) ) ( (lv_description_3_0= RULE_STRING ) ) ( (lv_status_4_0= ruleInheritanceStatus ) ) ( (lv_execMethod_5_0= RULE_STRING ) ) ( (lv_displayLevel_6_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_7_0= RULE_STRING ) ) ( (lv_isDynamic_8_0= ruleBoolean ) ) otherlv_9= 'excludedStates:' ( (lv_excludedStates_10_0= RULE_STRING ) )* ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_3_0=null;
        Token lv_execMethod_5_0=null;
        Token lv_polledPeriod_7_0=null;
        Token otherlv_9=null;
        Token lv_excludedStates_10_0=null;
        EObject lv_argin_1_0 = null;

        EObject lv_argout_2_0 = null;

        EObject lv_status_4_0 = null;

        AntlrDatatypeRuleToken lv_displayLevel_6_0 = null;

        AntlrDatatypeRuleToken lv_isDynamic_8_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2288:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_argin_1_0= ruleArgument ) ) ( (lv_argout_2_0= ruleArgument ) ) ( (lv_description_3_0= RULE_STRING ) ) ( (lv_status_4_0= ruleInheritanceStatus ) ) ( (lv_execMethod_5_0= RULE_STRING ) ) ( (lv_displayLevel_6_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_7_0= RULE_STRING ) ) ( (lv_isDynamic_8_0= ruleBoolean ) ) otherlv_9= 'excludedStates:' ( (lv_excludedStates_10_0= RULE_STRING ) )* ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2289:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_argin_1_0= ruleArgument ) ) ( (lv_argout_2_0= ruleArgument ) ) ( (lv_description_3_0= RULE_STRING ) ) ( (lv_status_4_0= ruleInheritanceStatus ) ) ( (lv_execMethod_5_0= RULE_STRING ) ) ( (lv_displayLevel_6_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_7_0= RULE_STRING ) ) ( (lv_isDynamic_8_0= ruleBoolean ) ) otherlv_9= 'excludedStates:' ( (lv_excludedStates_10_0= RULE_STRING ) )* )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2289:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_argin_1_0= ruleArgument ) ) ( (lv_argout_2_0= ruleArgument ) ) ( (lv_description_3_0= RULE_STRING ) ) ( (lv_status_4_0= ruleInheritanceStatus ) ) ( (lv_execMethod_5_0= RULE_STRING ) ) ( (lv_displayLevel_6_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_7_0= RULE_STRING ) ) ( (lv_isDynamic_8_0= ruleBoolean ) ) otherlv_9= 'excludedStates:' ( (lv_excludedStates_10_0= RULE_STRING ) )* )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2289:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_argin_1_0= ruleArgument ) ) ( (lv_argout_2_0= ruleArgument ) ) ( (lv_description_3_0= RULE_STRING ) ) ( (lv_status_4_0= ruleInheritanceStatus ) ) ( (lv_execMethod_5_0= RULE_STRING ) ) ( (lv_displayLevel_6_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_7_0= RULE_STRING ) ) ( (lv_isDynamic_8_0= ruleBoolean ) ) otherlv_9= 'excludedStates:' ( (lv_excludedStates_10_0= RULE_STRING ) )*
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2289:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2290:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2290:1: (lv_name_0_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2291:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand4304); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2307:2: ( (lv_argin_1_0= ruleArgument ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2308:1: (lv_argin_1_0= ruleArgument )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2308:1: (lv_argin_1_0= ruleArgument )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2309:3: lv_argin_1_0= ruleArgument
            {
             
            	        newCompositeNode(grammarAccess.getCommandAccess().getArginArgumentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleArgument_in_ruleCommand4330);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2325:2: ( (lv_argout_2_0= ruleArgument ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2326:1: (lv_argout_2_0= ruleArgument )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2326:1: (lv_argout_2_0= ruleArgument )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2327:3: lv_argout_2_0= ruleArgument
            {
             
            	        newCompositeNode(grammarAccess.getCommandAccess().getArgoutArgumentParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleArgument_in_ruleCommand4351);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2343:2: ( (lv_description_3_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2344:1: (lv_description_3_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2344:1: (lv_description_3_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2345:3: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommand4368); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2361:2: ( (lv_status_4_0= ruleInheritanceStatus ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2362:1: (lv_status_4_0= ruleInheritanceStatus )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2362:1: (lv_status_4_0= ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2363:3: lv_status_4_0= ruleInheritanceStatus
            {
             
            	        newCompositeNode(grammarAccess.getCommandAccess().getStatusInheritanceStatusParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleInheritanceStatus_in_ruleCommand4394);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2379:2: ( (lv_execMethod_5_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2380:1: (lv_execMethod_5_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2380:1: (lv_execMethod_5_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2381:3: lv_execMethod_5_0= RULE_STRING
            {
            lv_execMethod_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommand4411); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2397:2: ( (lv_displayLevel_6_0= ruleDisplayLevel ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2398:1: (lv_displayLevel_6_0= ruleDisplayLevel )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2398:1: (lv_displayLevel_6_0= ruleDisplayLevel )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2399:3: lv_displayLevel_6_0= ruleDisplayLevel
            {
             
            	        newCompositeNode(grammarAccess.getCommandAccess().getDisplayLevelDisplayLevelParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleDisplayLevel_in_ruleCommand4437);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2415:2: ( (lv_polledPeriod_7_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2416:1: (lv_polledPeriod_7_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2416:1: (lv_polledPeriod_7_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2417:3: lv_polledPeriod_7_0= RULE_STRING
            {
            lv_polledPeriod_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommand4454); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2433:2: ( (lv_isDynamic_8_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2434:1: (lv_isDynamic_8_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2434:1: (lv_isDynamic_8_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2435:3: lv_isDynamic_8_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getCommandAccess().getIsDynamicBooleanParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleCommand4480);
            lv_isDynamic_8_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCommandRule());
            	        }
                   		set(
                   			current, 
                   			"isDynamic",
                    		lv_isDynamic_8_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,46,FOLLOW_46_in_ruleCommand4492); 

                	newLeafNode(otherlv_9, grammarAccess.getCommandAccess().getExcludedStatesKeyword_9());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2455:1: ( (lv_excludedStates_10_0= RULE_STRING ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_STRING) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2456:1: (lv_excludedStates_10_0= RULE_STRING )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2456:1: (lv_excludedStates_10_0= RULE_STRING )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2457:3: lv_excludedStates_10_0= RULE_STRING
            	    {
            	    lv_excludedStates_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommand4509); 

            	    			newLeafNode(lv_excludedStates_10_0, grammarAccess.getCommandAccess().getExcludedStatesSTRINGTerminalRuleCall_10_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCommandRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"excludedStates",
            	            		lv_excludedStates_10_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2481:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2482:2: (iv_ruleArgument= ruleArgument EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2483:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument4551);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument4561); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2490:1: ruleArgument returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_description_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_description_1_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2493:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_description_1_0= RULE_STRING ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2494:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_description_1_0= RULE_STRING ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2494:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_description_1_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2494:2: ( (lv_type_0_0= ruleType ) ) ( (lv_description_1_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2494:2: ( (lv_type_0_0= ruleType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2495:1: (lv_type_0_0= ruleType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2495:1: (lv_type_0_0= ruleType )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2496:3: lv_type_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getArgumentAccess().getTypeTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleArgument4607);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2512:2: ( (lv_description_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2513:1: (lv_description_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2513:1: (lv_description_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2514:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument4624); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2538:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2539:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2540:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute4665);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute4675); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2547:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_attType_1_0= ruleAttrType ) ) ( (lv_dataType_2_0= ruleType ) ) ( (lv_rwType_3_0= ruleRW_Type ) ) ( (lv_displayLevel_4_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_5_0= RULE_STRING ) ) ( (lv_maxX_6_0= RULE_STRING ) ) ( (lv_maxY_7_0= RULE_STRING ) ) ( (lv_associatedAttr_8_0= RULE_STRING ) ) ( (lv_memorized_9_0= ruleBoolean ) ) ( (lv_memorizedAtInit_10_0= ruleBoolean ) ) ( (lv_changeEvent_11_0= ruleFireEvents ) ) ( (lv_archiveEvent_12_0= ruleFireEvents ) ) ( (lv_dataReadyEvent_13_0= ruleFireEvents ) ) ( (lv_status_14_0= ruleInheritanceStatus ) ) ( (lv_properties_15_0= ruleAttrProperties ) ) ( (lv_allocReadMember_16_0= ruleBoolean ) ) ( (lv_isDynamic_17_0= ruleBoolean ) ) ( (lv_eventCriteria_18_0= ruleEventCriteria ) ) ( (lv_evArchiveCriteria_19_0= ruleEventCriteria ) ) otherlv_20= 'enumLabels:' ( (lv_enumLabels_21_0= RULE_STRING ) )* otherlv_22= 'readExcludedStates:' ( (lv_readExcludedStates_23_0= RULE_STRING ) )* otherlv_24= 'writeExcludedStates:' ( (lv_writeExcludedStates_25_0= RULE_STRING ) )* ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_polledPeriod_5_0=null;
        Token lv_maxX_6_0=null;
        Token lv_maxY_7_0=null;
        Token lv_associatedAttr_8_0=null;
        Token otherlv_20=null;
        Token lv_enumLabels_21_0=null;
        Token otherlv_22=null;
        Token lv_readExcludedStates_23_0=null;
        Token otherlv_24=null;
        Token lv_writeExcludedStates_25_0=null;
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
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2550:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_attType_1_0= ruleAttrType ) ) ( (lv_dataType_2_0= ruleType ) ) ( (lv_rwType_3_0= ruleRW_Type ) ) ( (lv_displayLevel_4_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_5_0= RULE_STRING ) ) ( (lv_maxX_6_0= RULE_STRING ) ) ( (lv_maxY_7_0= RULE_STRING ) ) ( (lv_associatedAttr_8_0= RULE_STRING ) ) ( (lv_memorized_9_0= ruleBoolean ) ) ( (lv_memorizedAtInit_10_0= ruleBoolean ) ) ( (lv_changeEvent_11_0= ruleFireEvents ) ) ( (lv_archiveEvent_12_0= ruleFireEvents ) ) ( (lv_dataReadyEvent_13_0= ruleFireEvents ) ) ( (lv_status_14_0= ruleInheritanceStatus ) ) ( (lv_properties_15_0= ruleAttrProperties ) ) ( (lv_allocReadMember_16_0= ruleBoolean ) ) ( (lv_isDynamic_17_0= ruleBoolean ) ) ( (lv_eventCriteria_18_0= ruleEventCriteria ) ) ( (lv_evArchiveCriteria_19_0= ruleEventCriteria ) ) otherlv_20= 'enumLabels:' ( (lv_enumLabels_21_0= RULE_STRING ) )* otherlv_22= 'readExcludedStates:' ( (lv_readExcludedStates_23_0= RULE_STRING ) )* otherlv_24= 'writeExcludedStates:' ( (lv_writeExcludedStates_25_0= RULE_STRING ) )* ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2551:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_attType_1_0= ruleAttrType ) ) ( (lv_dataType_2_0= ruleType ) ) ( (lv_rwType_3_0= ruleRW_Type ) ) ( (lv_displayLevel_4_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_5_0= RULE_STRING ) ) ( (lv_maxX_6_0= RULE_STRING ) ) ( (lv_maxY_7_0= RULE_STRING ) ) ( (lv_associatedAttr_8_0= RULE_STRING ) ) ( (lv_memorized_9_0= ruleBoolean ) ) ( (lv_memorizedAtInit_10_0= ruleBoolean ) ) ( (lv_changeEvent_11_0= ruleFireEvents ) ) ( (lv_archiveEvent_12_0= ruleFireEvents ) ) ( (lv_dataReadyEvent_13_0= ruleFireEvents ) ) ( (lv_status_14_0= ruleInheritanceStatus ) ) ( (lv_properties_15_0= ruleAttrProperties ) ) ( (lv_allocReadMember_16_0= ruleBoolean ) ) ( (lv_isDynamic_17_0= ruleBoolean ) ) ( (lv_eventCriteria_18_0= ruleEventCriteria ) ) ( (lv_evArchiveCriteria_19_0= ruleEventCriteria ) ) otherlv_20= 'enumLabels:' ( (lv_enumLabels_21_0= RULE_STRING ) )* otherlv_22= 'readExcludedStates:' ( (lv_readExcludedStates_23_0= RULE_STRING ) )* otherlv_24= 'writeExcludedStates:' ( (lv_writeExcludedStates_25_0= RULE_STRING ) )* )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2551:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_attType_1_0= ruleAttrType ) ) ( (lv_dataType_2_0= ruleType ) ) ( (lv_rwType_3_0= ruleRW_Type ) ) ( (lv_displayLevel_4_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_5_0= RULE_STRING ) ) ( (lv_maxX_6_0= RULE_STRING ) ) ( (lv_maxY_7_0= RULE_STRING ) ) ( (lv_associatedAttr_8_0= RULE_STRING ) ) ( (lv_memorized_9_0= ruleBoolean ) ) ( (lv_memorizedAtInit_10_0= ruleBoolean ) ) ( (lv_changeEvent_11_0= ruleFireEvents ) ) ( (lv_archiveEvent_12_0= ruleFireEvents ) ) ( (lv_dataReadyEvent_13_0= ruleFireEvents ) ) ( (lv_status_14_0= ruleInheritanceStatus ) ) ( (lv_properties_15_0= ruleAttrProperties ) ) ( (lv_allocReadMember_16_0= ruleBoolean ) ) ( (lv_isDynamic_17_0= ruleBoolean ) ) ( (lv_eventCriteria_18_0= ruleEventCriteria ) ) ( (lv_evArchiveCriteria_19_0= ruleEventCriteria ) ) otherlv_20= 'enumLabels:' ( (lv_enumLabels_21_0= RULE_STRING ) )* otherlv_22= 'readExcludedStates:' ( (lv_readExcludedStates_23_0= RULE_STRING ) )* otherlv_24= 'writeExcludedStates:' ( (lv_writeExcludedStates_25_0= RULE_STRING ) )* )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2551:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_attType_1_0= ruleAttrType ) ) ( (lv_dataType_2_0= ruleType ) ) ( (lv_rwType_3_0= ruleRW_Type ) ) ( (lv_displayLevel_4_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_5_0= RULE_STRING ) ) ( (lv_maxX_6_0= RULE_STRING ) ) ( (lv_maxY_7_0= RULE_STRING ) ) ( (lv_associatedAttr_8_0= RULE_STRING ) ) ( (lv_memorized_9_0= ruleBoolean ) ) ( (lv_memorizedAtInit_10_0= ruleBoolean ) ) ( (lv_changeEvent_11_0= ruleFireEvents ) ) ( (lv_archiveEvent_12_0= ruleFireEvents ) ) ( (lv_dataReadyEvent_13_0= ruleFireEvents ) ) ( (lv_status_14_0= ruleInheritanceStatus ) ) ( (lv_properties_15_0= ruleAttrProperties ) ) ( (lv_allocReadMember_16_0= ruleBoolean ) ) ( (lv_isDynamic_17_0= ruleBoolean ) ) ( (lv_eventCriteria_18_0= ruleEventCriteria ) ) ( (lv_evArchiveCriteria_19_0= ruleEventCriteria ) ) otherlv_20= 'enumLabels:' ( (lv_enumLabels_21_0= RULE_STRING ) )* otherlv_22= 'readExcludedStates:' ( (lv_readExcludedStates_23_0= RULE_STRING ) )* otherlv_24= 'writeExcludedStates:' ( (lv_writeExcludedStates_25_0= RULE_STRING ) )*
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2551:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2552:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2552:1: (lv_name_0_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2553:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute4717); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2569:2: ( (lv_attType_1_0= ruleAttrType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2570:1: (lv_attType_1_0= ruleAttrType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2570:1: (lv_attType_1_0= ruleAttrType )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2571:3: lv_attType_1_0= ruleAttrType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getAttTypeAttrTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAttrType_in_ruleAttribute4743);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2587:2: ( (lv_dataType_2_0= ruleType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2588:1: (lv_dataType_2_0= ruleType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2588:1: (lv_dataType_2_0= ruleType )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2589:3: lv_dataType_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getDataTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleAttribute4764);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2605:2: ( (lv_rwType_3_0= ruleRW_Type ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2606:1: (lv_rwType_3_0= ruleRW_Type )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2606:1: (lv_rwType_3_0= ruleRW_Type )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2607:3: lv_rwType_3_0= ruleRW_Type
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getRwTypeRW_TypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleRW_Type_in_ruleAttribute4785);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2623:2: ( (lv_displayLevel_4_0= ruleDisplayLevel ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2624:1: (lv_displayLevel_4_0= ruleDisplayLevel )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2624:1: (lv_displayLevel_4_0= ruleDisplayLevel )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2625:3: lv_displayLevel_4_0= ruleDisplayLevel
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getDisplayLevelDisplayLevelParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleDisplayLevel_in_ruleAttribute4806);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2641:2: ( (lv_polledPeriod_5_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2642:1: (lv_polledPeriod_5_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2642:1: (lv_polledPeriod_5_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2643:3: lv_polledPeriod_5_0= RULE_STRING
            {
            lv_polledPeriod_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute4823); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2659:2: ( (lv_maxX_6_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2660:1: (lv_maxX_6_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2660:1: (lv_maxX_6_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2661:3: lv_maxX_6_0= RULE_STRING
            {
            lv_maxX_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute4845); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2677:2: ( (lv_maxY_7_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2678:1: (lv_maxY_7_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2678:1: (lv_maxY_7_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2679:3: lv_maxY_7_0= RULE_STRING
            {
            lv_maxY_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute4867); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2695:2: ( (lv_associatedAttr_8_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2696:1: (lv_associatedAttr_8_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2696:1: (lv_associatedAttr_8_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2697:3: lv_associatedAttr_8_0= RULE_STRING
            {
            lv_associatedAttr_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute4889); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2713:2: ( (lv_memorized_9_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2714:1: (lv_memorized_9_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2714:1: (lv_memorized_9_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2715:3: lv_memorized_9_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getMemorizedBooleanParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleAttribute4915);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2731:2: ( (lv_memorizedAtInit_10_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2732:1: (lv_memorizedAtInit_10_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2732:1: (lv_memorizedAtInit_10_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2733:3: lv_memorizedAtInit_10_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getMemorizedAtInitBooleanParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleAttribute4936);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2749:2: ( (lv_changeEvent_11_0= ruleFireEvents ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2750:1: (lv_changeEvent_11_0= ruleFireEvents )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2750:1: (lv_changeEvent_11_0= ruleFireEvents )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2751:3: lv_changeEvent_11_0= ruleFireEvents
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getChangeEventFireEventsParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_ruleFireEvents_in_ruleAttribute4957);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2767:2: ( (lv_archiveEvent_12_0= ruleFireEvents ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2768:1: (lv_archiveEvent_12_0= ruleFireEvents )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2768:1: (lv_archiveEvent_12_0= ruleFireEvents )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2769:3: lv_archiveEvent_12_0= ruleFireEvents
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getArchiveEventFireEventsParserRuleCall_12_0()); 
            	    
            pushFollow(FOLLOW_ruleFireEvents_in_ruleAttribute4978);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2785:2: ( (lv_dataReadyEvent_13_0= ruleFireEvents ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2786:1: (lv_dataReadyEvent_13_0= ruleFireEvents )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2786:1: (lv_dataReadyEvent_13_0= ruleFireEvents )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2787:3: lv_dataReadyEvent_13_0= ruleFireEvents
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getDataReadyEventFireEventsParserRuleCall_13_0()); 
            	    
            pushFollow(FOLLOW_ruleFireEvents_in_ruleAttribute4999);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2803:2: ( (lv_status_14_0= ruleInheritanceStatus ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2804:1: (lv_status_14_0= ruleInheritanceStatus )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2804:1: (lv_status_14_0= ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2805:3: lv_status_14_0= ruleInheritanceStatus
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getStatusInheritanceStatusParserRuleCall_14_0()); 
            	    
            pushFollow(FOLLOW_ruleInheritanceStatus_in_ruleAttribute5020);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2821:2: ( (lv_properties_15_0= ruleAttrProperties ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2822:1: (lv_properties_15_0= ruleAttrProperties )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2822:1: (lv_properties_15_0= ruleAttrProperties )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2823:3: lv_properties_15_0= ruleAttrProperties
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getPropertiesAttrPropertiesParserRuleCall_15_0()); 
            	    
            pushFollow(FOLLOW_ruleAttrProperties_in_ruleAttribute5041);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2839:2: ( (lv_allocReadMember_16_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2840:1: (lv_allocReadMember_16_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2840:1: (lv_allocReadMember_16_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2841:3: lv_allocReadMember_16_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getAllocReadMemberBooleanParserRuleCall_16_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleAttribute5062);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2857:2: ( (lv_isDynamic_17_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2858:1: (lv_isDynamic_17_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2858:1: (lv_isDynamic_17_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2859:3: lv_isDynamic_17_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getIsDynamicBooleanParserRuleCall_17_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleAttribute5083);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2875:2: ( (lv_eventCriteria_18_0= ruleEventCriteria ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2876:1: (lv_eventCriteria_18_0= ruleEventCriteria )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2876:1: (lv_eventCriteria_18_0= ruleEventCriteria )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2877:3: lv_eventCriteria_18_0= ruleEventCriteria
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getEventCriteriaEventCriteriaParserRuleCall_18_0()); 
            	    
            pushFollow(FOLLOW_ruleEventCriteria_in_ruleAttribute5104);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2893:2: ( (lv_evArchiveCriteria_19_0= ruleEventCriteria ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2894:1: (lv_evArchiveCriteria_19_0= ruleEventCriteria )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2894:1: (lv_evArchiveCriteria_19_0= ruleEventCriteria )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2895:3: lv_evArchiveCriteria_19_0= ruleEventCriteria
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getEvArchiveCriteriaEventCriteriaParserRuleCall_19_0()); 
            	    
            pushFollow(FOLLOW_ruleEventCriteria_in_ruleAttribute5125);
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

            otherlv_20=(Token)match(input,47,FOLLOW_47_in_ruleAttribute5137); 

                	newLeafNode(otherlv_20, grammarAccess.getAttributeAccess().getEnumLabelsKeyword_20());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2915:1: ( (lv_enumLabels_21_0= RULE_STRING ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_STRING) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2916:1: (lv_enumLabels_21_0= RULE_STRING )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2916:1: (lv_enumLabels_21_0= RULE_STRING )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2917:3: lv_enumLabels_21_0= RULE_STRING
            	    {
            	    lv_enumLabels_21_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute5154); 

            	    			newLeafNode(lv_enumLabels_21_0, grammarAccess.getAttributeAccess().getEnumLabelsSTRINGTerminalRuleCall_21_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAttributeRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"enumLabels",
            	            		lv_enumLabels_21_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_22=(Token)match(input,48,FOLLOW_48_in_ruleAttribute5172); 

                	newLeafNode(otherlv_22, grammarAccess.getAttributeAccess().getReadExcludedStatesKeyword_22());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2937:1: ( (lv_readExcludedStates_23_0= RULE_STRING ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_STRING) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2938:1: (lv_readExcludedStates_23_0= RULE_STRING )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2938:1: (lv_readExcludedStates_23_0= RULE_STRING )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2939:3: lv_readExcludedStates_23_0= RULE_STRING
            	    {
            	    lv_readExcludedStates_23_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute5189); 

            	    			newLeafNode(lv_readExcludedStates_23_0, grammarAccess.getAttributeAccess().getReadExcludedStatesSTRINGTerminalRuleCall_23_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAttributeRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"readExcludedStates",
            	            		lv_readExcludedStates_23_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_24=(Token)match(input,49,FOLLOW_49_in_ruleAttribute5207); 

                	newLeafNode(otherlv_24, grammarAccess.getAttributeAccess().getWriteExcludedStatesKeyword_24());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2959:1: ( (lv_writeExcludedStates_25_0= RULE_STRING ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_STRING) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2960:1: (lv_writeExcludedStates_25_0= RULE_STRING )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2960:1: (lv_writeExcludedStates_25_0= RULE_STRING )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2961:3: lv_writeExcludedStates_25_0= RULE_STRING
            	    {
            	    lv_writeExcludedStates_25_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute5224); 

            	    			newLeafNode(lv_writeExcludedStates_25_0, grammarAccess.getAttributeAccess().getWriteExcludedStatesSTRINGTerminalRuleCall_25_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAttributeRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"writeExcludedStates",
            	            		lv_writeExcludedStates_25_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2985:1: entryRuleFireEvents returns [EObject current=null] : iv_ruleFireEvents= ruleFireEvents EOF ;
    public final EObject entryRuleFireEvents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFireEvents = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2986:2: (iv_ruleFireEvents= ruleFireEvents EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2987:2: iv_ruleFireEvents= ruleFireEvents EOF
            {
             newCompositeNode(grammarAccess.getFireEventsRule()); 
            pushFollow(FOLLOW_ruleFireEvents_in_entryRuleFireEvents5266);
            iv_ruleFireEvents=ruleFireEvents();

            state._fsp--;

             current =iv_ruleFireEvents; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFireEvents5276); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2994:1: ruleFireEvents returns [EObject current=null] : ( ( (lv_fire_0_0= ruleBoolean ) ) ( (lv_libCheckCriteria_1_0= ruleBoolean ) ) ) ;
    public final EObject ruleFireEvents() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_fire_0_0 = null;

        AntlrDatatypeRuleToken lv_libCheckCriteria_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2997:28: ( ( ( (lv_fire_0_0= ruleBoolean ) ) ( (lv_libCheckCriteria_1_0= ruleBoolean ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2998:1: ( ( (lv_fire_0_0= ruleBoolean ) ) ( (lv_libCheckCriteria_1_0= ruleBoolean ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2998:1: ( ( (lv_fire_0_0= ruleBoolean ) ) ( (lv_libCheckCriteria_1_0= ruleBoolean ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2998:2: ( (lv_fire_0_0= ruleBoolean ) ) ( (lv_libCheckCriteria_1_0= ruleBoolean ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2998:2: ( (lv_fire_0_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2999:1: (lv_fire_0_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2999:1: (lv_fire_0_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3000:3: lv_fire_0_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getFireEventsAccess().getFireBooleanParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleFireEvents5322);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3016:2: ( (lv_libCheckCriteria_1_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3017:1: (lv_libCheckCriteria_1_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3017:1: (lv_libCheckCriteria_1_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3018:3: lv_libCheckCriteria_1_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getFireEventsAccess().getLibCheckCriteriaBooleanParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleFireEvents5343);
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3042:1: entryRuleEventCriteria returns [EObject current=null] : iv_ruleEventCriteria= ruleEventCriteria EOF ;
    public final EObject entryRuleEventCriteria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventCriteria = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3043:2: (iv_ruleEventCriteria= ruleEventCriteria EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3044:2: iv_ruleEventCriteria= ruleEventCriteria EOF
            {
             newCompositeNode(grammarAccess.getEventCriteriaRule()); 
            pushFollow(FOLLOW_ruleEventCriteria_in_entryRuleEventCriteria5379);
            iv_ruleEventCriteria=ruleEventCriteria();

            state._fsp--;

             current =iv_ruleEventCriteria; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventCriteria5389); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3051:1: ruleEventCriteria returns [EObject current=null] : ( ( (lv_relChange_0_0= RULE_STRING ) ) ( (lv_absChange_1_0= RULE_STRING ) ) ( (lv_period_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEventCriteria() throws RecognitionException {
        EObject current = null;

        Token lv_relChange_0_0=null;
        Token lv_absChange_1_0=null;
        Token lv_period_2_0=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3054:28: ( ( ( (lv_relChange_0_0= RULE_STRING ) ) ( (lv_absChange_1_0= RULE_STRING ) ) ( (lv_period_2_0= RULE_STRING ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3055:1: ( ( (lv_relChange_0_0= RULE_STRING ) ) ( (lv_absChange_1_0= RULE_STRING ) ) ( (lv_period_2_0= RULE_STRING ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3055:1: ( ( (lv_relChange_0_0= RULE_STRING ) ) ( (lv_absChange_1_0= RULE_STRING ) ) ( (lv_period_2_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3055:2: ( (lv_relChange_0_0= RULE_STRING ) ) ( (lv_absChange_1_0= RULE_STRING ) ) ( (lv_period_2_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3055:2: ( (lv_relChange_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3056:1: (lv_relChange_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3056:1: (lv_relChange_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3057:3: lv_relChange_0_0= RULE_STRING
            {
            lv_relChange_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEventCriteria5431); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3073:2: ( (lv_absChange_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3074:1: (lv_absChange_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3074:1: (lv_absChange_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3075:3: lv_absChange_1_0= RULE_STRING
            {
            lv_absChange_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEventCriteria5453); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3091:2: ( (lv_period_2_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3092:1: (lv_period_2_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3092:1: (lv_period_2_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3093:3: lv_period_2_0= RULE_STRING
            {
            lv_period_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEventCriteria5475); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3117:1: entryRuleAttrProperties returns [EObject current=null] : iv_ruleAttrProperties= ruleAttrProperties EOF ;
    public final EObject entryRuleAttrProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrProperties = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3118:2: (iv_ruleAttrProperties= ruleAttrProperties EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3119:2: iv_ruleAttrProperties= ruleAttrProperties EOF
            {
             newCompositeNode(grammarAccess.getAttrPropertiesRule()); 
            pushFollow(FOLLOW_ruleAttrProperties_in_entryRuleAttrProperties5516);
            iv_ruleAttrProperties=ruleAttrProperties();

            state._fsp--;

             current =iv_ruleAttrProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrProperties5526); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3126:1: ruleAttrProperties returns [EObject current=null] : ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_label_1_0= RULE_STRING ) ) ( (lv_unit_2_0= RULE_STRING ) ) ( (lv_standardUnit_3_0= RULE_STRING ) ) ( (lv_displayUnit_4_0= RULE_STRING ) ) ( (lv_format_5_0= RULE_STRING ) ) ( (lv_maxValue_6_0= RULE_STRING ) ) ( (lv_minValue_7_0= RULE_STRING ) ) ( (lv_maxAlarm_8_0= RULE_STRING ) ) ( (lv_minAlarm_9_0= RULE_STRING ) ) ( (lv_maxWarning_10_0= RULE_STRING ) ) ( (lv_minWarning_11_0= RULE_STRING ) ) ( (lv_deltaTime_12_0= RULE_STRING ) ) ( (lv_deltaValue_13_0= RULE_STRING ) ) ) ;
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
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3129:28: ( ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_label_1_0= RULE_STRING ) ) ( (lv_unit_2_0= RULE_STRING ) ) ( (lv_standardUnit_3_0= RULE_STRING ) ) ( (lv_displayUnit_4_0= RULE_STRING ) ) ( (lv_format_5_0= RULE_STRING ) ) ( (lv_maxValue_6_0= RULE_STRING ) ) ( (lv_minValue_7_0= RULE_STRING ) ) ( (lv_maxAlarm_8_0= RULE_STRING ) ) ( (lv_minAlarm_9_0= RULE_STRING ) ) ( (lv_maxWarning_10_0= RULE_STRING ) ) ( (lv_minWarning_11_0= RULE_STRING ) ) ( (lv_deltaTime_12_0= RULE_STRING ) ) ( (lv_deltaValue_13_0= RULE_STRING ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3130:1: ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_label_1_0= RULE_STRING ) ) ( (lv_unit_2_0= RULE_STRING ) ) ( (lv_standardUnit_3_0= RULE_STRING ) ) ( (lv_displayUnit_4_0= RULE_STRING ) ) ( (lv_format_5_0= RULE_STRING ) ) ( (lv_maxValue_6_0= RULE_STRING ) ) ( (lv_minValue_7_0= RULE_STRING ) ) ( (lv_maxAlarm_8_0= RULE_STRING ) ) ( (lv_minAlarm_9_0= RULE_STRING ) ) ( (lv_maxWarning_10_0= RULE_STRING ) ) ( (lv_minWarning_11_0= RULE_STRING ) ) ( (lv_deltaTime_12_0= RULE_STRING ) ) ( (lv_deltaValue_13_0= RULE_STRING ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3130:1: ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_label_1_0= RULE_STRING ) ) ( (lv_unit_2_0= RULE_STRING ) ) ( (lv_standardUnit_3_0= RULE_STRING ) ) ( (lv_displayUnit_4_0= RULE_STRING ) ) ( (lv_format_5_0= RULE_STRING ) ) ( (lv_maxValue_6_0= RULE_STRING ) ) ( (lv_minValue_7_0= RULE_STRING ) ) ( (lv_maxAlarm_8_0= RULE_STRING ) ) ( (lv_minAlarm_9_0= RULE_STRING ) ) ( (lv_maxWarning_10_0= RULE_STRING ) ) ( (lv_minWarning_11_0= RULE_STRING ) ) ( (lv_deltaTime_12_0= RULE_STRING ) ) ( (lv_deltaValue_13_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3130:2: ( (lv_description_0_0= RULE_STRING ) ) ( (lv_label_1_0= RULE_STRING ) ) ( (lv_unit_2_0= RULE_STRING ) ) ( (lv_standardUnit_3_0= RULE_STRING ) ) ( (lv_displayUnit_4_0= RULE_STRING ) ) ( (lv_format_5_0= RULE_STRING ) ) ( (lv_maxValue_6_0= RULE_STRING ) ) ( (lv_minValue_7_0= RULE_STRING ) ) ( (lv_maxAlarm_8_0= RULE_STRING ) ) ( (lv_minAlarm_9_0= RULE_STRING ) ) ( (lv_maxWarning_10_0= RULE_STRING ) ) ( (lv_minWarning_11_0= RULE_STRING ) ) ( (lv_deltaTime_12_0= RULE_STRING ) ) ( (lv_deltaValue_13_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3130:2: ( (lv_description_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3131:1: (lv_description_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3131:1: (lv_description_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3132:3: lv_description_0_0= RULE_STRING
            {
            lv_description_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5568); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3148:2: ( (lv_label_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3149:1: (lv_label_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3149:1: (lv_label_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3150:3: lv_label_1_0= RULE_STRING
            {
            lv_label_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5590); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3166:2: ( (lv_unit_2_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3167:1: (lv_unit_2_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3167:1: (lv_unit_2_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3168:3: lv_unit_2_0= RULE_STRING
            {
            lv_unit_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5612); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3184:2: ( (lv_standardUnit_3_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3185:1: (lv_standardUnit_3_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3185:1: (lv_standardUnit_3_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3186:3: lv_standardUnit_3_0= RULE_STRING
            {
            lv_standardUnit_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5634); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3202:2: ( (lv_displayUnit_4_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3203:1: (lv_displayUnit_4_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3203:1: (lv_displayUnit_4_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3204:3: lv_displayUnit_4_0= RULE_STRING
            {
            lv_displayUnit_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5656); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3220:2: ( (lv_format_5_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3221:1: (lv_format_5_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3221:1: (lv_format_5_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3222:3: lv_format_5_0= RULE_STRING
            {
            lv_format_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5678); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3238:2: ( (lv_maxValue_6_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3239:1: (lv_maxValue_6_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3239:1: (lv_maxValue_6_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3240:3: lv_maxValue_6_0= RULE_STRING
            {
            lv_maxValue_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5700); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3256:2: ( (lv_minValue_7_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3257:1: (lv_minValue_7_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3257:1: (lv_minValue_7_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3258:3: lv_minValue_7_0= RULE_STRING
            {
            lv_minValue_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5722); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3274:2: ( (lv_maxAlarm_8_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3275:1: (lv_maxAlarm_8_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3275:1: (lv_maxAlarm_8_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3276:3: lv_maxAlarm_8_0= RULE_STRING
            {
            lv_maxAlarm_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5744); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3292:2: ( (lv_minAlarm_9_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3293:1: (lv_minAlarm_9_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3293:1: (lv_minAlarm_9_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3294:3: lv_minAlarm_9_0= RULE_STRING
            {
            lv_minAlarm_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5766); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3310:2: ( (lv_maxWarning_10_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3311:1: (lv_maxWarning_10_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3311:1: (lv_maxWarning_10_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3312:3: lv_maxWarning_10_0= RULE_STRING
            {
            lv_maxWarning_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5788); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3328:2: ( (lv_minWarning_11_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3329:1: (lv_minWarning_11_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3329:1: (lv_minWarning_11_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3330:3: lv_minWarning_11_0= RULE_STRING
            {
            lv_minWarning_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5810); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3346:2: ( (lv_deltaTime_12_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3347:1: (lv_deltaTime_12_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3347:1: (lv_deltaTime_12_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3348:3: lv_deltaTime_12_0= RULE_STRING
            {
            lv_deltaTime_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5832); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3364:2: ( (lv_deltaValue_13_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3365:1: (lv_deltaValue_13_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3365:1: (lv_deltaValue_13_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3366:3: lv_deltaValue_13_0= RULE_STRING
            {
            lv_deltaValue_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5854); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3390:1: entryRuleAdditionalFile returns [EObject current=null] : iv_ruleAdditionalFile= ruleAdditionalFile EOF ;
    public final EObject entryRuleAdditionalFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionalFile = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3391:2: (iv_ruleAdditionalFile= ruleAdditionalFile EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3392:2: iv_ruleAdditionalFile= ruleAdditionalFile EOF
            {
             newCompositeNode(grammarAccess.getAdditionalFileRule()); 
            pushFollow(FOLLOW_ruleAdditionalFile_in_entryRuleAdditionalFile5895);
            iv_ruleAdditionalFile=ruleAdditionalFile();

            state._fsp--;

             current =iv_ruleAdditionalFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionalFile5905); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3399:1: ruleAdditionalFile returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_path_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAdditionalFile() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_path_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3402:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_path_1_0= RULE_STRING ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3403:1: ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_path_1_0= RULE_STRING ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3403:1: ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_path_1_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3403:2: ( (lv_name_0_0= RULE_STRING ) ) ( (lv_path_1_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3403:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3404:1: (lv_name_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3404:1: (lv_name_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3405:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAdditionalFile5947); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3421:2: ( (lv_path_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3422:1: (lv_path_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3422:1: (lv_path_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3423:3: lv_path_1_0= RULE_STRING
            {
            lv_path_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAdditionalFile5969); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3447:1: entryRuleOverlodedPollPeriodObject returns [EObject current=null] : iv_ruleOverlodedPollPeriodObject= ruleOverlodedPollPeriodObject EOF ;
    public final EObject entryRuleOverlodedPollPeriodObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverlodedPollPeriodObject = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3448:2: (iv_ruleOverlodedPollPeriodObject= ruleOverlodedPollPeriodObject EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3449:2: iv_ruleOverlodedPollPeriodObject= ruleOverlodedPollPeriodObject EOF
            {
             newCompositeNode(grammarAccess.getOverlodedPollPeriodObjectRule()); 
            pushFollow(FOLLOW_ruleOverlodedPollPeriodObject_in_entryRuleOverlodedPollPeriodObject6010);
            iv_ruleOverlodedPollPeriodObject=ruleOverlodedPollPeriodObject();

            state._fsp--;

             current =iv_ruleOverlodedPollPeriodObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverlodedPollPeriodObject6020); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3456:1: ruleOverlodedPollPeriodObject returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_type_1_0= RULE_STRING ) ) ( (lv_pollPeriod_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleOverlodedPollPeriodObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_type_1_0=null;
        Token lv_pollPeriod_2_0=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3459:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_type_1_0= RULE_STRING ) ) ( (lv_pollPeriod_2_0= RULE_STRING ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3460:1: ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_type_1_0= RULE_STRING ) ) ( (lv_pollPeriod_2_0= RULE_STRING ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3460:1: ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_type_1_0= RULE_STRING ) ) ( (lv_pollPeriod_2_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3460:2: ( (lv_name_0_0= RULE_STRING ) ) ( (lv_type_1_0= RULE_STRING ) ) ( (lv_pollPeriod_2_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3460:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3461:1: (lv_name_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3461:1: (lv_name_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3462:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOverlodedPollPeriodObject6062); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3478:2: ( (lv_type_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3479:1: (lv_type_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3479:1: (lv_type_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3480:3: lv_type_1_0= RULE_STRING
            {
            lv_type_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOverlodedPollPeriodObject6084); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3496:2: ( (lv_pollPeriod_2_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3497:1: (lv_pollPeriod_2_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3497:1: (lv_pollPeriod_2_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3498:3: lv_pollPeriod_2_0= RULE_STRING
            {
            lv_pollPeriod_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOverlodedPollPeriodObject6106); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3522:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3523:2: (iv_ruleType= ruleType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3524:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType6147);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType6157); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3531:1: ruleType returns [EObject current=null] : (this_VoidType_0= ruleVoidType | this_BooleanType_1= ruleBooleanType | this_ShortType_2= ruleShortType | this_UShortType_3= ruleUShortType | this_IntType_4= ruleIntType | this_UIntType_5= ruleUIntType | this_FloatType_6= ruleFloatType | this_DoubleType_7= ruleDoubleType | this_StringType_8= ruleStringType | this_CharArrayType_9= ruleCharArrayType | this_ShortArrayType_10= ruleShortArrayType | this_UShortArrayType_11= ruleUShortArrayType | this_IntArrayType_12= ruleIntArrayType | this_UIntArrayType_13= ruleUIntArrayType | this_FloatArrayType_14= ruleFloatArrayType | this_DoubleArrayType_15= ruleDoubleArrayType | this_StringArrayType_16= ruleStringArrayType | this_LongStringArrayType_17= ruleLongStringArrayType | this_DoubleStringArrayType_18= ruleDoubleStringArrayType | this_StateType_19= ruleStateType | this_ConstStringType_20= ruleConstStringType | this_BooleanArrayType_21= ruleBooleanArrayType | this_LongType_22= ruleLongType | this_ULongType_23= ruleULongType | this_UCharType_24= ruleUCharType | this_LongArrayType_25= ruleLongArrayType | this_ULongArrayType_26= ruleULongArrayType | this_DevIntType_27= ruleDevIntType | this_EncodedType_28= ruleEncodedType | this_EnumType_29= ruleEnumType ) ;
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

        EObject this_EnumType_29 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3534:28: ( (this_VoidType_0= ruleVoidType | this_BooleanType_1= ruleBooleanType | this_ShortType_2= ruleShortType | this_UShortType_3= ruleUShortType | this_IntType_4= ruleIntType | this_UIntType_5= ruleUIntType | this_FloatType_6= ruleFloatType | this_DoubleType_7= ruleDoubleType | this_StringType_8= ruleStringType | this_CharArrayType_9= ruleCharArrayType | this_ShortArrayType_10= ruleShortArrayType | this_UShortArrayType_11= ruleUShortArrayType | this_IntArrayType_12= ruleIntArrayType | this_UIntArrayType_13= ruleUIntArrayType | this_FloatArrayType_14= ruleFloatArrayType | this_DoubleArrayType_15= ruleDoubleArrayType | this_StringArrayType_16= ruleStringArrayType | this_LongStringArrayType_17= ruleLongStringArrayType | this_DoubleStringArrayType_18= ruleDoubleStringArrayType | this_StateType_19= ruleStateType | this_ConstStringType_20= ruleConstStringType | this_BooleanArrayType_21= ruleBooleanArrayType | this_LongType_22= ruleLongType | this_ULongType_23= ruleULongType | this_UCharType_24= ruleUCharType | this_LongArrayType_25= ruleLongArrayType | this_ULongArrayType_26= ruleULongArrayType | this_DevIntType_27= ruleDevIntType | this_EncodedType_28= ruleEncodedType | this_EnumType_29= ruleEnumType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3535:1: (this_VoidType_0= ruleVoidType | this_BooleanType_1= ruleBooleanType | this_ShortType_2= ruleShortType | this_UShortType_3= ruleUShortType | this_IntType_4= ruleIntType | this_UIntType_5= ruleUIntType | this_FloatType_6= ruleFloatType | this_DoubleType_7= ruleDoubleType | this_StringType_8= ruleStringType | this_CharArrayType_9= ruleCharArrayType | this_ShortArrayType_10= ruleShortArrayType | this_UShortArrayType_11= ruleUShortArrayType | this_IntArrayType_12= ruleIntArrayType | this_UIntArrayType_13= ruleUIntArrayType | this_FloatArrayType_14= ruleFloatArrayType | this_DoubleArrayType_15= ruleDoubleArrayType | this_StringArrayType_16= ruleStringArrayType | this_LongStringArrayType_17= ruleLongStringArrayType | this_DoubleStringArrayType_18= ruleDoubleStringArrayType | this_StateType_19= ruleStateType | this_ConstStringType_20= ruleConstStringType | this_BooleanArrayType_21= ruleBooleanArrayType | this_LongType_22= ruleLongType | this_ULongType_23= ruleULongType | this_UCharType_24= ruleUCharType | this_LongArrayType_25= ruleLongArrayType | this_ULongArrayType_26= ruleULongArrayType | this_DevIntType_27= ruleDevIntType | this_EncodedType_28= ruleEncodedType | this_EnumType_29= ruleEnumType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3535:1: (this_VoidType_0= ruleVoidType | this_BooleanType_1= ruleBooleanType | this_ShortType_2= ruleShortType | this_UShortType_3= ruleUShortType | this_IntType_4= ruleIntType | this_UIntType_5= ruleUIntType | this_FloatType_6= ruleFloatType | this_DoubleType_7= ruleDoubleType | this_StringType_8= ruleStringType | this_CharArrayType_9= ruleCharArrayType | this_ShortArrayType_10= ruleShortArrayType | this_UShortArrayType_11= ruleUShortArrayType | this_IntArrayType_12= ruleIntArrayType | this_UIntArrayType_13= ruleUIntArrayType | this_FloatArrayType_14= ruleFloatArrayType | this_DoubleArrayType_15= ruleDoubleArrayType | this_StringArrayType_16= ruleStringArrayType | this_LongStringArrayType_17= ruleLongStringArrayType | this_DoubleStringArrayType_18= ruleDoubleStringArrayType | this_StateType_19= ruleStateType | this_ConstStringType_20= ruleConstStringType | this_BooleanArrayType_21= ruleBooleanArrayType | this_LongType_22= ruleLongType | this_ULongType_23= ruleULongType | this_UCharType_24= ruleUCharType | this_LongArrayType_25= ruleLongArrayType | this_ULongArrayType_26= ruleULongArrayType | this_DevIntType_27= ruleDevIntType | this_EncodedType_28= ruleEncodedType | this_EnumType_29= ruleEnumType )
            int alt29=30;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt29=1;
                }
                break;
            case 51:
                {
                alt29=2;
                }
                break;
            case 52:
                {
                alt29=3;
                }
                break;
            case 53:
                {
                alt29=4;
                }
                break;
            case 54:
                {
                alt29=5;
                }
                break;
            case 55:
                {
                alt29=6;
                }
                break;
            case 56:
                {
                alt29=7;
                }
                break;
            case 57:
                {
                alt29=8;
                }
                break;
            case 58:
                {
                alt29=9;
                }
                break;
            case 59:
                {
                alt29=10;
                }
                break;
            case 60:
                {
                alt29=11;
                }
                break;
            case 61:
                {
                alt29=12;
                }
                break;
            case 62:
                {
                alt29=13;
                }
                break;
            case 63:
                {
                alt29=14;
                }
                break;
            case 64:
                {
                alt29=15;
                }
                break;
            case 65:
                {
                alt29=16;
                }
                break;
            case 66:
                {
                alt29=17;
                }
                break;
            case 67:
                {
                alt29=18;
                }
                break;
            case 68:
                {
                alt29=19;
                }
                break;
            case 69:
                {
                alt29=20;
                }
                break;
            case 70:
                {
                alt29=21;
                }
                break;
            case 71:
                {
                alt29=22;
                }
                break;
            case 73:
                {
                alt29=23;
                }
                break;
            case 74:
                {
                alt29=24;
                }
                break;
            case 72:
                {
                alt29=25;
                }
                break;
            case 75:
                {
                alt29=26;
                }
                break;
            case 76:
                {
                alt29=27;
                }
                break;
            case 77:
                {
                alt29=28;
                }
                break;
            case 78:
                {
                alt29=29;
                }
                break;
            case 79:
                {
                alt29=30;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3536:5: this_VoidType_0= ruleVoidType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getVoidTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVoidType_in_ruleType6204);
                    this_VoidType_0=ruleVoidType();

                    state._fsp--;

                     
                            current = this_VoidType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3546:5: this_BooleanType_1= ruleBooleanType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getBooleanTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBooleanType_in_ruleType6231);
                    this_BooleanType_1=ruleBooleanType();

                    state._fsp--;

                     
                            current = this_BooleanType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3556:5: this_ShortType_2= ruleShortType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getShortTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleShortType_in_ruleType6258);
                    this_ShortType_2=ruleShortType();

                    state._fsp--;

                     
                            current = this_ShortType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3566:5: this_UShortType_3= ruleUShortType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getUShortTypeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleUShortType_in_ruleType6285);
                    this_UShortType_3=ruleUShortType();

                    state._fsp--;

                     
                            current = this_UShortType_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3576:5: this_IntType_4= ruleIntType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getIntTypeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleIntType_in_ruleType6312);
                    this_IntType_4=ruleIntType();

                    state._fsp--;

                     
                            current = this_IntType_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3586:5: this_UIntType_5= ruleUIntType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getUIntTypeParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleUIntType_in_ruleType6339);
                    this_UIntType_5=ruleUIntType();

                    state._fsp--;

                     
                            current = this_UIntType_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3596:5: this_FloatType_6= ruleFloatType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getFloatTypeParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleFloatType_in_ruleType6366);
                    this_FloatType_6=ruleFloatType();

                    state._fsp--;

                     
                            current = this_FloatType_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3606:5: this_DoubleType_7= ruleDoubleType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDoubleTypeParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleDoubleType_in_ruleType6393);
                    this_DoubleType_7=ruleDoubleType();

                    state._fsp--;

                     
                            current = this_DoubleType_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3616:5: this_StringType_8= ruleStringType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getStringTypeParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleStringType_in_ruleType6420);
                    this_StringType_8=ruleStringType();

                    state._fsp--;

                     
                            current = this_StringType_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3626:5: this_CharArrayType_9= ruleCharArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getCharArrayTypeParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleCharArrayType_in_ruleType6447);
                    this_CharArrayType_9=ruleCharArrayType();

                    state._fsp--;

                     
                            current = this_CharArrayType_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3636:5: this_ShortArrayType_10= ruleShortArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getShortArrayTypeParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleShortArrayType_in_ruleType6474);
                    this_ShortArrayType_10=ruleShortArrayType();

                    state._fsp--;

                     
                            current = this_ShortArrayType_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3646:5: this_UShortArrayType_11= ruleUShortArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getUShortArrayTypeParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleUShortArrayType_in_ruleType6501);
                    this_UShortArrayType_11=ruleUShortArrayType();

                    state._fsp--;

                     
                            current = this_UShortArrayType_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3656:5: this_IntArrayType_12= ruleIntArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getIntArrayTypeParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleIntArrayType_in_ruleType6528);
                    this_IntArrayType_12=ruleIntArrayType();

                    state._fsp--;

                     
                            current = this_IntArrayType_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3666:5: this_UIntArrayType_13= ruleUIntArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getUIntArrayTypeParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleUIntArrayType_in_ruleType6555);
                    this_UIntArrayType_13=ruleUIntArrayType();

                    state._fsp--;

                     
                            current = this_UIntArrayType_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3676:5: this_FloatArrayType_14= ruleFloatArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getFloatArrayTypeParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_ruleFloatArrayType_in_ruleType6582);
                    this_FloatArrayType_14=ruleFloatArrayType();

                    state._fsp--;

                     
                            current = this_FloatArrayType_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 16 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3686:5: this_DoubleArrayType_15= ruleDoubleArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDoubleArrayTypeParserRuleCall_15()); 
                        
                    pushFollow(FOLLOW_ruleDoubleArrayType_in_ruleType6609);
                    this_DoubleArrayType_15=ruleDoubleArrayType();

                    state._fsp--;

                     
                            current = this_DoubleArrayType_15; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 17 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3696:5: this_StringArrayType_16= ruleStringArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getStringArrayTypeParserRuleCall_16()); 
                        
                    pushFollow(FOLLOW_ruleStringArrayType_in_ruleType6636);
                    this_StringArrayType_16=ruleStringArrayType();

                    state._fsp--;

                     
                            current = this_StringArrayType_16; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 18 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3706:5: this_LongStringArrayType_17= ruleLongStringArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getLongStringArrayTypeParserRuleCall_17()); 
                        
                    pushFollow(FOLLOW_ruleLongStringArrayType_in_ruleType6663);
                    this_LongStringArrayType_17=ruleLongStringArrayType();

                    state._fsp--;

                     
                            current = this_LongStringArrayType_17; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 19 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3716:5: this_DoubleStringArrayType_18= ruleDoubleStringArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDoubleStringArrayTypeParserRuleCall_18()); 
                        
                    pushFollow(FOLLOW_ruleDoubleStringArrayType_in_ruleType6690);
                    this_DoubleStringArrayType_18=ruleDoubleStringArrayType();

                    state._fsp--;

                     
                            current = this_DoubleStringArrayType_18; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 20 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3726:5: this_StateType_19= ruleStateType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getStateTypeParserRuleCall_19()); 
                        
                    pushFollow(FOLLOW_ruleStateType_in_ruleType6717);
                    this_StateType_19=ruleStateType();

                    state._fsp--;

                     
                            current = this_StateType_19; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 21 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3736:5: this_ConstStringType_20= ruleConstStringType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getConstStringTypeParserRuleCall_20()); 
                        
                    pushFollow(FOLLOW_ruleConstStringType_in_ruleType6744);
                    this_ConstStringType_20=ruleConstStringType();

                    state._fsp--;

                     
                            current = this_ConstStringType_20; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 22 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3746:5: this_BooleanArrayType_21= ruleBooleanArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getBooleanArrayTypeParserRuleCall_21()); 
                        
                    pushFollow(FOLLOW_ruleBooleanArrayType_in_ruleType6771);
                    this_BooleanArrayType_21=ruleBooleanArrayType();

                    state._fsp--;

                     
                            current = this_BooleanArrayType_21; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 23 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3756:5: this_LongType_22= ruleLongType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getLongTypeParserRuleCall_22()); 
                        
                    pushFollow(FOLLOW_ruleLongType_in_ruleType6798);
                    this_LongType_22=ruleLongType();

                    state._fsp--;

                     
                            current = this_LongType_22; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 24 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3766:5: this_ULongType_23= ruleULongType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getULongTypeParserRuleCall_23()); 
                        
                    pushFollow(FOLLOW_ruleULongType_in_ruleType6825);
                    this_ULongType_23=ruleULongType();

                    state._fsp--;

                     
                            current = this_ULongType_23; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 25 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3776:5: this_UCharType_24= ruleUCharType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getUCharTypeParserRuleCall_24()); 
                        
                    pushFollow(FOLLOW_ruleUCharType_in_ruleType6852);
                    this_UCharType_24=ruleUCharType();

                    state._fsp--;

                     
                            current = this_UCharType_24; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 26 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3786:5: this_LongArrayType_25= ruleLongArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getLongArrayTypeParserRuleCall_25()); 
                        
                    pushFollow(FOLLOW_ruleLongArrayType_in_ruleType6879);
                    this_LongArrayType_25=ruleLongArrayType();

                    state._fsp--;

                     
                            current = this_LongArrayType_25; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 27 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3796:5: this_ULongArrayType_26= ruleULongArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getULongArrayTypeParserRuleCall_26()); 
                        
                    pushFollow(FOLLOW_ruleULongArrayType_in_ruleType6906);
                    this_ULongArrayType_26=ruleULongArrayType();

                    state._fsp--;

                     
                            current = this_ULongArrayType_26; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 28 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3806:5: this_DevIntType_27= ruleDevIntType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDevIntTypeParserRuleCall_27()); 
                        
                    pushFollow(FOLLOW_ruleDevIntType_in_ruleType6933);
                    this_DevIntType_27=ruleDevIntType();

                    state._fsp--;

                     
                            current = this_DevIntType_27; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 29 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3816:5: this_EncodedType_28= ruleEncodedType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getEncodedTypeParserRuleCall_28()); 
                        
                    pushFollow(FOLLOW_ruleEncodedType_in_ruleType6960);
                    this_EncodedType_28=ruleEncodedType();

                    state._fsp--;

                     
                            current = this_EncodedType_28; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 30 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3826:5: this_EnumType_29= ruleEnumType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getEnumTypeParserRuleCall_29()); 
                        
                    pushFollow(FOLLOW_ruleEnumType_in_ruleType6987);
                    this_EnumType_29=ruleEnumType();

                    state._fsp--;

                     
                            current = this_EnumType_29; 
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3842:1: entryRuleVoidType returns [EObject current=null] : iv_ruleVoidType= ruleVoidType EOF ;
    public final EObject entryRuleVoidType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoidType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3843:2: (iv_ruleVoidType= ruleVoidType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3844:2: iv_ruleVoidType= ruleVoidType EOF
            {
             newCompositeNode(grammarAccess.getVoidTypeRule()); 
            pushFollow(FOLLOW_ruleVoidType_in_entryRuleVoidType7022);
            iv_ruleVoidType=ruleVoidType();

            state._fsp--;

             current =iv_ruleVoidType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVoidType7032); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3851:1: ruleVoidType returns [EObject current=null] : ( () otherlv_1= 'void' ) ;
    public final EObject ruleVoidType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3854:28: ( ( () otherlv_1= 'void' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3855:1: ( () otherlv_1= 'void' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3855:1: ( () otherlv_1= 'void' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3855:2: () otherlv_1= 'void'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3855:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3856:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVoidTypeAccess().getVoidTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleVoidType7078); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3873:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3874:2: (iv_ruleBooleanType= ruleBooleanType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3875:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
             newCompositeNode(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanType_in_entryRuleBooleanType7114);
            iv_ruleBooleanType=ruleBooleanType();

            state._fsp--;

             current =iv_ruleBooleanType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanType7124); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3882:1: ruleBooleanType returns [EObject current=null] : ( () otherlv_1= 'boolean' ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3885:28: ( ( () otherlv_1= 'boolean' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3886:1: ( () otherlv_1= 'boolean' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3886:1: ( () otherlv_1= 'boolean' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3886:2: () otherlv_1= 'boolean'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3886:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3887:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleBooleanType7170); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3904:1: entryRuleShortType returns [EObject current=null] : iv_ruleShortType= ruleShortType EOF ;
    public final EObject entryRuleShortType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3905:2: (iv_ruleShortType= ruleShortType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3906:2: iv_ruleShortType= ruleShortType EOF
            {
             newCompositeNode(grammarAccess.getShortTypeRule()); 
            pushFollow(FOLLOW_ruleShortType_in_entryRuleShortType7206);
            iv_ruleShortType=ruleShortType();

            state._fsp--;

             current =iv_ruleShortType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortType7216); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3913:1: ruleShortType returns [EObject current=null] : ( () otherlv_1= 'short' ) ;
    public final EObject ruleShortType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3916:28: ( ( () otherlv_1= 'short' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3917:1: ( () otherlv_1= 'short' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3917:1: ( () otherlv_1= 'short' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3917:2: () otherlv_1= 'short'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3917:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3918:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getShortTypeAccess().getShortTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleShortType7262); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3935:1: entryRuleUShortType returns [EObject current=null] : iv_ruleUShortType= ruleUShortType EOF ;
    public final EObject entryRuleUShortType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUShortType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3936:2: (iv_ruleUShortType= ruleUShortType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3937:2: iv_ruleUShortType= ruleUShortType EOF
            {
             newCompositeNode(grammarAccess.getUShortTypeRule()); 
            pushFollow(FOLLOW_ruleUShortType_in_entryRuleUShortType7298);
            iv_ruleUShortType=ruleUShortType();

            state._fsp--;

             current =iv_ruleUShortType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUShortType7308); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3944:1: ruleUShortType returns [EObject current=null] : ( () otherlv_1= 'ushort' ) ;
    public final EObject ruleUShortType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3947:28: ( ( () otherlv_1= 'ushort' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3948:1: ( () otherlv_1= 'ushort' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3948:1: ( () otherlv_1= 'ushort' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3948:2: () otherlv_1= 'ushort'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3948:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3949:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUShortTypeAccess().getUShortTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleUShortType7354); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3966:1: entryRuleIntType returns [EObject current=null] : iv_ruleIntType= ruleIntType EOF ;
    public final EObject entryRuleIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3967:2: (iv_ruleIntType= ruleIntType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3968:2: iv_ruleIntType= ruleIntType EOF
            {
             newCompositeNode(grammarAccess.getIntTypeRule()); 
            pushFollow(FOLLOW_ruleIntType_in_entryRuleIntType7390);
            iv_ruleIntType=ruleIntType();

            state._fsp--;

             current =iv_ruleIntType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntType7400); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3975:1: ruleIntType returns [EObject current=null] : ( () otherlv_1= 'int' ) ;
    public final EObject ruleIntType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3978:28: ( ( () otherlv_1= 'int' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3979:1: ( () otherlv_1= 'int' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3979:1: ( () otherlv_1= 'int' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3979:2: () otherlv_1= 'int'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3979:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3980:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntTypeAccess().getIntTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleIntType7446); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3997:1: entryRuleUIntType returns [EObject current=null] : iv_ruleUIntType= ruleUIntType EOF ;
    public final EObject entryRuleUIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIntType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3998:2: (iv_ruleUIntType= ruleUIntType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3999:2: iv_ruleUIntType= ruleUIntType EOF
            {
             newCompositeNode(grammarAccess.getUIntTypeRule()); 
            pushFollow(FOLLOW_ruleUIntType_in_entryRuleUIntType7482);
            iv_ruleUIntType=ruleUIntType();

            state._fsp--;

             current =iv_ruleUIntType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIntType7492); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4006:1: ruleUIntType returns [EObject current=null] : ( () otherlv_1= 'uint' ) ;
    public final EObject ruleUIntType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4009:28: ( ( () otherlv_1= 'uint' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4010:1: ( () otherlv_1= 'uint' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4010:1: ( () otherlv_1= 'uint' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4010:2: () otherlv_1= 'uint'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4010:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4011:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUIntTypeAccess().getUIntTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleUIntType7538); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4028:1: entryRuleFloatType returns [EObject current=null] : iv_ruleFloatType= ruleFloatType EOF ;
    public final EObject entryRuleFloatType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4029:2: (iv_ruleFloatType= ruleFloatType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4030:2: iv_ruleFloatType= ruleFloatType EOF
            {
             newCompositeNode(grammarAccess.getFloatTypeRule()); 
            pushFollow(FOLLOW_ruleFloatType_in_entryRuleFloatType7574);
            iv_ruleFloatType=ruleFloatType();

            state._fsp--;

             current =iv_ruleFloatType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatType7584); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4037:1: ruleFloatType returns [EObject current=null] : ( () otherlv_1= 'float' ) ;
    public final EObject ruleFloatType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4040:28: ( ( () otherlv_1= 'float' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4041:1: ( () otherlv_1= 'float' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4041:1: ( () otherlv_1= 'float' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4041:2: () otherlv_1= 'float'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4041:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4042:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFloatTypeAccess().getFloatTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleFloatType7630); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4059:1: entryRuleDoubleType returns [EObject current=null] : iv_ruleDoubleType= ruleDoubleType EOF ;
    public final EObject entryRuleDoubleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4060:2: (iv_ruleDoubleType= ruleDoubleType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4061:2: iv_ruleDoubleType= ruleDoubleType EOF
            {
             newCompositeNode(grammarAccess.getDoubleTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleType_in_entryRuleDoubleType7666);
            iv_ruleDoubleType=ruleDoubleType();

            state._fsp--;

             current =iv_ruleDoubleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleType7676); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4068:1: ruleDoubleType returns [EObject current=null] : ( () otherlv_1= 'double' ) ;
    public final EObject ruleDoubleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4071:28: ( ( () otherlv_1= 'double' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4072:1: ( () otherlv_1= 'double' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4072:1: ( () otherlv_1= 'double' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4072:2: () otherlv_1= 'double'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4072:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4073:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDoubleTypeAccess().getDoubleTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleDoubleType7722); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4090:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4091:2: (iv_ruleStringType= ruleStringType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4092:2: iv_ruleStringType= ruleStringType EOF
            {
             newCompositeNode(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType7758);
            iv_ruleStringType=ruleStringType();

            state._fsp--;

             current =iv_ruleStringType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType7768); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4099:1: ruleStringType returns [EObject current=null] : ( () otherlv_1= 'string' ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4102:28: ( ( () otherlv_1= 'string' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4103:1: ( () otherlv_1= 'string' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4103:1: ( () otherlv_1= 'string' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4103:2: () otherlv_1= 'string'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4103:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4104:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleStringType7814); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4121:1: entryRuleCharArrayType returns [EObject current=null] : iv_ruleCharArrayType= ruleCharArrayType EOF ;
    public final EObject entryRuleCharArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4122:2: (iv_ruleCharArrayType= ruleCharArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4123:2: iv_ruleCharArrayType= ruleCharArrayType EOF
            {
             newCompositeNode(grammarAccess.getCharArrayTypeRule()); 
            pushFollow(FOLLOW_ruleCharArrayType_in_entryRuleCharArrayType7850);
            iv_ruleCharArrayType=ruleCharArrayType();

            state._fsp--;

             current =iv_ruleCharArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharArrayType7860); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4130:1: ruleCharArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarCharArray' ) ;
    public final EObject ruleCharArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4133:28: ( ( () otherlv_1= 'DevVarCharArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4134:1: ( () otherlv_1= 'DevVarCharArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4134:1: ( () otherlv_1= 'DevVarCharArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4134:2: () otherlv_1= 'DevVarCharArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4134:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4135:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCharArrayTypeAccess().getCharArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleCharArrayType7906); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4152:1: entryRuleShortArrayType returns [EObject current=null] : iv_ruleShortArrayType= ruleShortArrayType EOF ;
    public final EObject entryRuleShortArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4153:2: (iv_ruleShortArrayType= ruleShortArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4154:2: iv_ruleShortArrayType= ruleShortArrayType EOF
            {
             newCompositeNode(grammarAccess.getShortArrayTypeRule()); 
            pushFollow(FOLLOW_ruleShortArrayType_in_entryRuleShortArrayType7942);
            iv_ruleShortArrayType=ruleShortArrayType();

            state._fsp--;

             current =iv_ruleShortArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortArrayType7952); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4161:1: ruleShortArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarShortArray' ) ;
    public final EObject ruleShortArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4164:28: ( ( () otherlv_1= 'DevVarShortArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4165:1: ( () otherlv_1= 'DevVarShortArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4165:1: ( () otherlv_1= 'DevVarShortArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4165:2: () otherlv_1= 'DevVarShortArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4165:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4166:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getShortArrayTypeAccess().getShortArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleShortArrayType7998); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4183:1: entryRuleUShortArrayType returns [EObject current=null] : iv_ruleUShortArrayType= ruleUShortArrayType EOF ;
    public final EObject entryRuleUShortArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUShortArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4184:2: (iv_ruleUShortArrayType= ruleUShortArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4185:2: iv_ruleUShortArrayType= ruleUShortArrayType EOF
            {
             newCompositeNode(grammarAccess.getUShortArrayTypeRule()); 
            pushFollow(FOLLOW_ruleUShortArrayType_in_entryRuleUShortArrayType8034);
            iv_ruleUShortArrayType=ruleUShortArrayType();

            state._fsp--;

             current =iv_ruleUShortArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUShortArrayType8044); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4192:1: ruleUShortArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarUShortArray' ) ;
    public final EObject ruleUShortArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4195:28: ( ( () otherlv_1= 'DevVarUShortArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4196:1: ( () otherlv_1= 'DevVarUShortArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4196:1: ( () otherlv_1= 'DevVarUShortArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4196:2: () otherlv_1= 'DevVarUShortArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4196:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4197:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUShortArrayTypeAccess().getUShortArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleUShortArrayType8090); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4214:1: entryRuleIntArrayType returns [EObject current=null] : iv_ruleIntArrayType= ruleIntArrayType EOF ;
    public final EObject entryRuleIntArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4215:2: (iv_ruleIntArrayType= ruleIntArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4216:2: iv_ruleIntArrayType= ruleIntArrayType EOF
            {
             newCompositeNode(grammarAccess.getIntArrayTypeRule()); 
            pushFollow(FOLLOW_ruleIntArrayType_in_entryRuleIntArrayType8126);
            iv_ruleIntArrayType=ruleIntArrayType();

            state._fsp--;

             current =iv_ruleIntArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntArrayType8136); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4223:1: ruleIntArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarLongArray' ) ;
    public final EObject ruleIntArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4226:28: ( ( () otherlv_1= 'DevVarLongArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4227:1: ( () otherlv_1= 'DevVarLongArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4227:1: ( () otherlv_1= 'DevVarLongArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4227:2: () otherlv_1= 'DevVarLongArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4227:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4228:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntArrayTypeAccess().getIntArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleIntArrayType8182); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4245:1: entryRuleUIntArrayType returns [EObject current=null] : iv_ruleUIntArrayType= ruleUIntArrayType EOF ;
    public final EObject entryRuleUIntArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIntArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4246:2: (iv_ruleUIntArrayType= ruleUIntArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4247:2: iv_ruleUIntArrayType= ruleUIntArrayType EOF
            {
             newCompositeNode(grammarAccess.getUIntArrayTypeRule()); 
            pushFollow(FOLLOW_ruleUIntArrayType_in_entryRuleUIntArrayType8218);
            iv_ruleUIntArrayType=ruleUIntArrayType();

            state._fsp--;

             current =iv_ruleUIntArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIntArrayType8228); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4254:1: ruleUIntArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarULongArray' ) ;
    public final EObject ruleUIntArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4257:28: ( ( () otherlv_1= 'DevVarULongArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4258:1: ( () otherlv_1= 'DevVarULongArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4258:1: ( () otherlv_1= 'DevVarULongArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4258:2: () otherlv_1= 'DevVarULongArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4258:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4259:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUIntArrayTypeAccess().getUIntArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleUIntArrayType8274); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4276:1: entryRuleFloatArrayType returns [EObject current=null] : iv_ruleFloatArrayType= ruleFloatArrayType EOF ;
    public final EObject entryRuleFloatArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4277:2: (iv_ruleFloatArrayType= ruleFloatArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4278:2: iv_ruleFloatArrayType= ruleFloatArrayType EOF
            {
             newCompositeNode(grammarAccess.getFloatArrayTypeRule()); 
            pushFollow(FOLLOW_ruleFloatArrayType_in_entryRuleFloatArrayType8310);
            iv_ruleFloatArrayType=ruleFloatArrayType();

            state._fsp--;

             current =iv_ruleFloatArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatArrayType8320); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4285:1: ruleFloatArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarFloatArray' ) ;
    public final EObject ruleFloatArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4288:28: ( ( () otherlv_1= 'DevVarFloatArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4289:1: ( () otherlv_1= 'DevVarFloatArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4289:1: ( () otherlv_1= 'DevVarFloatArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4289:2: () otherlv_1= 'DevVarFloatArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4289:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4290:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFloatArrayTypeAccess().getFloatArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleFloatArrayType8366); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4307:1: entryRuleDoubleArrayType returns [EObject current=null] : iv_ruleDoubleArrayType= ruleDoubleArrayType EOF ;
    public final EObject entryRuleDoubleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4308:2: (iv_ruleDoubleArrayType= ruleDoubleArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4309:2: iv_ruleDoubleArrayType= ruleDoubleArrayType EOF
            {
             newCompositeNode(grammarAccess.getDoubleArrayTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleArrayType_in_entryRuleDoubleArrayType8402);
            iv_ruleDoubleArrayType=ruleDoubleArrayType();

            state._fsp--;

             current =iv_ruleDoubleArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleArrayType8412); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4316:1: ruleDoubleArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarDoubleArray' ) ;
    public final EObject ruleDoubleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4319:28: ( ( () otherlv_1= 'DevVarDoubleArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4320:1: ( () otherlv_1= 'DevVarDoubleArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4320:1: ( () otherlv_1= 'DevVarDoubleArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4320:2: () otherlv_1= 'DevVarDoubleArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4320:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4321:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDoubleArrayTypeAccess().getDoubleArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleDoubleArrayType8458); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4338:1: entryRuleStringArrayType returns [EObject current=null] : iv_ruleStringArrayType= ruleStringArrayType EOF ;
    public final EObject entryRuleStringArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4339:2: (iv_ruleStringArrayType= ruleStringArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4340:2: iv_ruleStringArrayType= ruleStringArrayType EOF
            {
             newCompositeNode(grammarAccess.getStringArrayTypeRule()); 
            pushFollow(FOLLOW_ruleStringArrayType_in_entryRuleStringArrayType8494);
            iv_ruleStringArrayType=ruleStringArrayType();

            state._fsp--;

             current =iv_ruleStringArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringArrayType8504); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4347:1: ruleStringArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarStringArray' ) ;
    public final EObject ruleStringArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4350:28: ( ( () otherlv_1= 'DevVarStringArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4351:1: ( () otherlv_1= 'DevVarStringArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4351:1: ( () otherlv_1= 'DevVarStringArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4351:2: () otherlv_1= 'DevVarStringArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4351:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4352:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringArrayTypeAccess().getStringArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleStringArrayType8550); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4369:1: entryRuleLongStringArrayType returns [EObject current=null] : iv_ruleLongStringArrayType= ruleLongStringArrayType EOF ;
    public final EObject entryRuleLongStringArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongStringArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4370:2: (iv_ruleLongStringArrayType= ruleLongStringArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4371:2: iv_ruleLongStringArrayType= ruleLongStringArrayType EOF
            {
             newCompositeNode(grammarAccess.getLongStringArrayTypeRule()); 
            pushFollow(FOLLOW_ruleLongStringArrayType_in_entryRuleLongStringArrayType8586);
            iv_ruleLongStringArrayType=ruleLongStringArrayType();

            state._fsp--;

             current =iv_ruleLongStringArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongStringArrayType8596); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4378:1: ruleLongStringArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarLongStringArray' ) ;
    public final EObject ruleLongStringArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4381:28: ( ( () otherlv_1= 'DevVarLongStringArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4382:1: ( () otherlv_1= 'DevVarLongStringArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4382:1: ( () otherlv_1= 'DevVarLongStringArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4382:2: () otherlv_1= 'DevVarLongStringArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4382:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4383:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLongStringArrayTypeAccess().getLongStringArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleLongStringArrayType8642); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4400:1: entryRuleDoubleStringArrayType returns [EObject current=null] : iv_ruleDoubleStringArrayType= ruleDoubleStringArrayType EOF ;
    public final EObject entryRuleDoubleStringArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleStringArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4401:2: (iv_ruleDoubleStringArrayType= ruleDoubleStringArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4402:2: iv_ruleDoubleStringArrayType= ruleDoubleStringArrayType EOF
            {
             newCompositeNode(grammarAccess.getDoubleStringArrayTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleStringArrayType_in_entryRuleDoubleStringArrayType8678);
            iv_ruleDoubleStringArrayType=ruleDoubleStringArrayType();

            state._fsp--;

             current =iv_ruleDoubleStringArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleStringArrayType8688); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4409:1: ruleDoubleStringArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarDoubleStringArray' ) ;
    public final EObject ruleDoubleStringArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4412:28: ( ( () otherlv_1= 'DevVarDoubleStringArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4413:1: ( () otherlv_1= 'DevVarDoubleStringArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4413:1: ( () otherlv_1= 'DevVarDoubleStringArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4413:2: () otherlv_1= 'DevVarDoubleStringArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4413:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4414:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDoubleStringArrayTypeAccess().getDoubleStringArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleDoubleStringArrayType8734); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4431:1: entryRuleStateType returns [EObject current=null] : iv_ruleStateType= ruleStateType EOF ;
    public final EObject entryRuleStateType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4432:2: (iv_ruleStateType= ruleStateType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4433:2: iv_ruleStateType= ruleStateType EOF
            {
             newCompositeNode(grammarAccess.getStateTypeRule()); 
            pushFollow(FOLLOW_ruleStateType_in_entryRuleStateType8770);
            iv_ruleStateType=ruleStateType();

            state._fsp--;

             current =iv_ruleStateType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateType8780); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4440:1: ruleStateType returns [EObject current=null] : ( () otherlv_1= 'DevState' ) ;
    public final EObject ruleStateType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4443:28: ( ( () otherlv_1= 'DevState' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4444:1: ( () otherlv_1= 'DevState' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4444:1: ( () otherlv_1= 'DevState' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4444:2: () otherlv_1= 'DevState'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4444:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4445:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateTypeAccess().getStateTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleStateType8826); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4462:1: entryRuleConstStringType returns [EObject current=null] : iv_ruleConstStringType= ruleConstStringType EOF ;
    public final EObject entryRuleConstStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstStringType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4463:2: (iv_ruleConstStringType= ruleConstStringType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4464:2: iv_ruleConstStringType= ruleConstStringType EOF
            {
             newCompositeNode(grammarAccess.getConstStringTypeRule()); 
            pushFollow(FOLLOW_ruleConstStringType_in_entryRuleConstStringType8862);
            iv_ruleConstStringType=ruleConstStringType();

            state._fsp--;

             current =iv_ruleConstStringType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstStringType8872); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4471:1: ruleConstStringType returns [EObject current=null] : ( () otherlv_1= 'ConstDevString' ) ;
    public final EObject ruleConstStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4474:28: ( ( () otherlv_1= 'ConstDevString' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4475:1: ( () otherlv_1= 'ConstDevString' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4475:1: ( () otherlv_1= 'ConstDevString' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4475:2: () otherlv_1= 'ConstDevString'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4475:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4476:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConstStringTypeAccess().getConstStringTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleConstStringType8918); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4493:1: entryRuleBooleanArrayType returns [EObject current=null] : iv_ruleBooleanArrayType= ruleBooleanArrayType EOF ;
    public final EObject entryRuleBooleanArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4494:2: (iv_ruleBooleanArrayType= ruleBooleanArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4495:2: iv_ruleBooleanArrayType= ruleBooleanArrayType EOF
            {
             newCompositeNode(grammarAccess.getBooleanArrayTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanArrayType_in_entryRuleBooleanArrayType8954);
            iv_ruleBooleanArrayType=ruleBooleanArrayType();

            state._fsp--;

             current =iv_ruleBooleanArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanArrayType8964); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4502:1: ruleBooleanArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarBooleanArray' ) ;
    public final EObject ruleBooleanArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4505:28: ( ( () otherlv_1= 'DevVarBooleanArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4506:1: ( () otherlv_1= 'DevVarBooleanArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4506:1: ( () otherlv_1= 'DevVarBooleanArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4506:2: () otherlv_1= 'DevVarBooleanArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4506:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4507:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanArrayTypeAccess().getBooleanArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleBooleanArrayType9010); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4524:1: entryRuleUCharType returns [EObject current=null] : iv_ruleUCharType= ruleUCharType EOF ;
    public final EObject entryRuleUCharType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUCharType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4525:2: (iv_ruleUCharType= ruleUCharType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4526:2: iv_ruleUCharType= ruleUCharType EOF
            {
             newCompositeNode(grammarAccess.getUCharTypeRule()); 
            pushFollow(FOLLOW_ruleUCharType_in_entryRuleUCharType9046);
            iv_ruleUCharType=ruleUCharType();

            state._fsp--;

             current =iv_ruleUCharType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUCharType9056); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4533:1: ruleUCharType returns [EObject current=null] : ( () otherlv_1= 'DevUChar' ) ;
    public final EObject ruleUCharType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4536:28: ( ( () otherlv_1= 'DevUChar' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4537:1: ( () otherlv_1= 'DevUChar' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4537:1: ( () otherlv_1= 'DevUChar' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4537:2: () otherlv_1= 'DevUChar'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4537:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4538:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUCharTypeAccess().getUCharTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleUCharType9102); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4555:1: entryRuleLongType returns [EObject current=null] : iv_ruleLongType= ruleLongType EOF ;
    public final EObject entryRuleLongType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4556:2: (iv_ruleLongType= ruleLongType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4557:2: iv_ruleLongType= ruleLongType EOF
            {
             newCompositeNode(grammarAccess.getLongTypeRule()); 
            pushFollow(FOLLOW_ruleLongType_in_entryRuleLongType9138);
            iv_ruleLongType=ruleLongType();

            state._fsp--;

             current =iv_ruleLongType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongType9148); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4564:1: ruleLongType returns [EObject current=null] : ( () otherlv_1= 'DevLong64' ) ;
    public final EObject ruleLongType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4567:28: ( ( () otherlv_1= 'DevLong64' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4568:1: ( () otherlv_1= 'DevLong64' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4568:1: ( () otherlv_1= 'DevLong64' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4568:2: () otherlv_1= 'DevLong64'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4568:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4569:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLongTypeAccess().getLongTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleLongType9194); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4586:1: entryRuleULongType returns [EObject current=null] : iv_ruleULongType= ruleULongType EOF ;
    public final EObject entryRuleULongType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleULongType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4587:2: (iv_ruleULongType= ruleULongType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4588:2: iv_ruleULongType= ruleULongType EOF
            {
             newCompositeNode(grammarAccess.getULongTypeRule()); 
            pushFollow(FOLLOW_ruleULongType_in_entryRuleULongType9230);
            iv_ruleULongType=ruleULongType();

            state._fsp--;

             current =iv_ruleULongType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleULongType9240); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4595:1: ruleULongType returns [EObject current=null] : ( () otherlv_1= 'DevULong64' ) ;
    public final EObject ruleULongType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4598:28: ( ( () otherlv_1= 'DevULong64' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4599:1: ( () otherlv_1= 'DevULong64' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4599:1: ( () otherlv_1= 'DevULong64' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4599:2: () otherlv_1= 'DevULong64'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4599:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4600:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getULongTypeAccess().getULongTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleULongType9286); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4617:1: entryRuleLongArrayType returns [EObject current=null] : iv_ruleLongArrayType= ruleLongArrayType EOF ;
    public final EObject entryRuleLongArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4618:2: (iv_ruleLongArrayType= ruleLongArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4619:2: iv_ruleLongArrayType= ruleLongArrayType EOF
            {
             newCompositeNode(grammarAccess.getLongArrayTypeRule()); 
            pushFollow(FOLLOW_ruleLongArrayType_in_entryRuleLongArrayType9322);
            iv_ruleLongArrayType=ruleLongArrayType();

            state._fsp--;

             current =iv_ruleLongArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongArrayType9332); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4626:1: ruleLongArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarLong64Array' ) ;
    public final EObject ruleLongArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4629:28: ( ( () otherlv_1= 'DevVarLong64Array' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4630:1: ( () otherlv_1= 'DevVarLong64Array' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4630:1: ( () otherlv_1= 'DevVarLong64Array' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4630:2: () otherlv_1= 'DevVarLong64Array'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4630:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4631:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLongArrayTypeAccess().getLongArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleLongArrayType9378); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4648:1: entryRuleULongArrayType returns [EObject current=null] : iv_ruleULongArrayType= ruleULongArrayType EOF ;
    public final EObject entryRuleULongArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleULongArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4649:2: (iv_ruleULongArrayType= ruleULongArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4650:2: iv_ruleULongArrayType= ruleULongArrayType EOF
            {
             newCompositeNode(grammarAccess.getULongArrayTypeRule()); 
            pushFollow(FOLLOW_ruleULongArrayType_in_entryRuleULongArrayType9414);
            iv_ruleULongArrayType=ruleULongArrayType();

            state._fsp--;

             current =iv_ruleULongArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleULongArrayType9424); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4657:1: ruleULongArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarULong64Array' ) ;
    public final EObject ruleULongArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4660:28: ( ( () otherlv_1= 'DevVarULong64Array' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4661:1: ( () otherlv_1= 'DevVarULong64Array' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4661:1: ( () otherlv_1= 'DevVarULong64Array' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4661:2: () otherlv_1= 'DevVarULong64Array'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4661:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4662:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getULongArrayTypeAccess().getULongArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleULongArrayType9470); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4679:1: entryRuleDevIntType returns [EObject current=null] : iv_ruleDevIntType= ruleDevIntType EOF ;
    public final EObject entryRuleDevIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevIntType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4680:2: (iv_ruleDevIntType= ruleDevIntType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4681:2: iv_ruleDevIntType= ruleDevIntType EOF
            {
             newCompositeNode(grammarAccess.getDevIntTypeRule()); 
            pushFollow(FOLLOW_ruleDevIntType_in_entryRuleDevIntType9506);
            iv_ruleDevIntType=ruleDevIntType();

            state._fsp--;

             current =iv_ruleDevIntType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDevIntType9516); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4688:1: ruleDevIntType returns [EObject current=null] : ( () otherlv_1= 'DevInt' ) ;
    public final EObject ruleDevIntType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4691:28: ( ( () otherlv_1= 'DevInt' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4692:1: ( () otherlv_1= 'DevInt' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4692:1: ( () otherlv_1= 'DevInt' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4692:2: () otherlv_1= 'DevInt'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4692:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4693:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDevIntTypeAccess().getDevIntTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleDevIntType9562); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4710:1: entryRuleEncodedType returns [EObject current=null] : iv_ruleEncodedType= ruleEncodedType EOF ;
    public final EObject entryRuleEncodedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEncodedType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4711:2: (iv_ruleEncodedType= ruleEncodedType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4712:2: iv_ruleEncodedType= ruleEncodedType EOF
            {
             newCompositeNode(grammarAccess.getEncodedTypeRule()); 
            pushFollow(FOLLOW_ruleEncodedType_in_entryRuleEncodedType9598);
            iv_ruleEncodedType=ruleEncodedType();

            state._fsp--;

             current =iv_ruleEncodedType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEncodedType9608); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4719:1: ruleEncodedType returns [EObject current=null] : ( () otherlv_1= 'DevEncoded' ) ;
    public final EObject ruleEncodedType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4722:28: ( ( () otherlv_1= 'DevEncoded' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4723:1: ( () otherlv_1= 'DevEncoded' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4723:1: ( () otherlv_1= 'DevEncoded' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4723:2: () otherlv_1= 'DevEncoded'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4723:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4724:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEncodedTypeAccess().getEncodedTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,78,FOLLOW_78_in_ruleEncodedType9654); 

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


    // $ANTLR start "entryRuleEnumType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4741:1: entryRuleEnumType returns [EObject current=null] : iv_ruleEnumType= ruleEnumType EOF ;
    public final EObject entryRuleEnumType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4742:2: (iv_ruleEnumType= ruleEnumType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4743:2: iv_ruleEnumType= ruleEnumType EOF
            {
             newCompositeNode(grammarAccess.getEnumTypeRule()); 
            pushFollow(FOLLOW_ruleEnumType_in_entryRuleEnumType9690);
            iv_ruleEnumType=ruleEnumType();

            state._fsp--;

             current =iv_ruleEnumType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumType9700); 

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
    // $ANTLR end "entryRuleEnumType"


    // $ANTLR start "ruleEnumType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4750:1: ruleEnumType returns [EObject current=null] : ( () otherlv_1= 'DevEnum' ) ;
    public final EObject ruleEnumType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4753:28: ( ( () otherlv_1= 'DevEnum' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4754:1: ( () otherlv_1= 'DevEnum' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4754:1: ( () otherlv_1= 'DevEnum' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4754:2: () otherlv_1= 'DevEnum'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4754:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4755:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEnumTypeAccess().getEnumTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,79,FOLLOW_79_in_ruleEnumType9746); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumTypeAccess().getDevEnumKeyword_1());
                

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
    // $ANTLR end "ruleEnumType"


    // $ANTLR start "entryRuleShortVectorType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4772:1: entryRuleShortVectorType returns [EObject current=null] : iv_ruleShortVectorType= ruleShortVectorType EOF ;
    public final EObject entryRuleShortVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4773:2: (iv_ruleShortVectorType= ruleShortVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4774:2: iv_ruleShortVectorType= ruleShortVectorType EOF
            {
             newCompositeNode(grammarAccess.getShortVectorTypeRule()); 
            pushFollow(FOLLOW_ruleShortVectorType_in_entryRuleShortVectorType9782);
            iv_ruleShortVectorType=ruleShortVectorType();

            state._fsp--;

             current =iv_ruleShortVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortVectorType9792); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4781:1: ruleShortVectorType returns [EObject current=null] : ( () otherlv_1= 'vector<short>' ) ;
    public final EObject ruleShortVectorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4784:28: ( ( () otherlv_1= 'vector<short>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4785:1: ( () otherlv_1= 'vector<short>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4785:1: ( () otherlv_1= 'vector<short>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4785:2: () otherlv_1= 'vector<short>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4785:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4786:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getShortVectorTypeAccess().getShortVectorTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,80,FOLLOW_80_in_ruleShortVectorType9838); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4803:1: entryRuleIntVectorType returns [EObject current=null] : iv_ruleIntVectorType= ruleIntVectorType EOF ;
    public final EObject entryRuleIntVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4804:2: (iv_ruleIntVectorType= ruleIntVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4805:2: iv_ruleIntVectorType= ruleIntVectorType EOF
            {
             newCompositeNode(grammarAccess.getIntVectorTypeRule()); 
            pushFollow(FOLLOW_ruleIntVectorType_in_entryRuleIntVectorType9874);
            iv_ruleIntVectorType=ruleIntVectorType();

            state._fsp--;

             current =iv_ruleIntVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntVectorType9884); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4812:1: ruleIntVectorType returns [EObject current=null] : ( () otherlv_1= 'vector<int>' ) ;
    public final EObject ruleIntVectorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4815:28: ( ( () otherlv_1= 'vector<int>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4816:1: ( () otherlv_1= 'vector<int>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4816:1: ( () otherlv_1= 'vector<int>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4816:2: () otherlv_1= 'vector<int>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4816:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4817:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntVectorTypeAccess().getIntVectorTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,81,FOLLOW_81_in_ruleIntVectorType9930); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4834:1: entryRuleFloatVectorType returns [EObject current=null] : iv_ruleFloatVectorType= ruleFloatVectorType EOF ;
    public final EObject entryRuleFloatVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4835:2: (iv_ruleFloatVectorType= ruleFloatVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4836:2: iv_ruleFloatVectorType= ruleFloatVectorType EOF
            {
             newCompositeNode(grammarAccess.getFloatVectorTypeRule()); 
            pushFollow(FOLLOW_ruleFloatVectorType_in_entryRuleFloatVectorType9966);
            iv_ruleFloatVectorType=ruleFloatVectorType();

            state._fsp--;

             current =iv_ruleFloatVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatVectorType9976); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4843:1: ruleFloatVectorType returns [EObject current=null] : ( () otherlv_1= 'vector<float>' ) ;
    public final EObject ruleFloatVectorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4846:28: ( ( () otherlv_1= 'vector<float>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4847:1: ( () otherlv_1= 'vector<float>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4847:1: ( () otherlv_1= 'vector<float>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4847:2: () otherlv_1= 'vector<float>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4847:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4848:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFloatVectorTypeAccess().getFloatVectorTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,82,FOLLOW_82_in_ruleFloatVectorType10022); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4865:1: entryRuleDoubleVectorType returns [EObject current=null] : iv_ruleDoubleVectorType= ruleDoubleVectorType EOF ;
    public final EObject entryRuleDoubleVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4866:2: (iv_ruleDoubleVectorType= ruleDoubleVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4867:2: iv_ruleDoubleVectorType= ruleDoubleVectorType EOF
            {
             newCompositeNode(grammarAccess.getDoubleVectorTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleVectorType_in_entryRuleDoubleVectorType10058);
            iv_ruleDoubleVectorType=ruleDoubleVectorType();

            state._fsp--;

             current =iv_ruleDoubleVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleVectorType10068); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4874:1: ruleDoubleVectorType returns [EObject current=null] : ( () otherlv_1= 'vector<double>' ) ;
    public final EObject ruleDoubleVectorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4877:28: ( ( () otherlv_1= 'vector<double>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4878:1: ( () otherlv_1= 'vector<double>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4878:1: ( () otherlv_1= 'vector<double>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4878:2: () otherlv_1= 'vector<double>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4878:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4879:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDoubleVectorTypeAccess().getDoubleVectorTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,83,FOLLOW_83_in_ruleDoubleVectorType10114); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4896:1: entryRuleStringVectorType returns [EObject current=null] : iv_ruleStringVectorType= ruleStringVectorType EOF ;
    public final EObject entryRuleStringVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4897:2: (iv_ruleStringVectorType= ruleStringVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4898:2: iv_ruleStringVectorType= ruleStringVectorType EOF
            {
             newCompositeNode(grammarAccess.getStringVectorTypeRule()); 
            pushFollow(FOLLOW_ruleStringVectorType_in_entryRuleStringVectorType10150);
            iv_ruleStringVectorType=ruleStringVectorType();

            state._fsp--;

             current =iv_ruleStringVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringVectorType10160); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4905:1: ruleStringVectorType returns [EObject current=null] : ( () otherlv_1= 'vector<string>' ) ;
    public final EObject ruleStringVectorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4908:28: ( ( () otherlv_1= 'vector<string>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4909:1: ( () otherlv_1= 'vector<string>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4909:1: ( () otherlv_1= 'vector<string>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4909:2: () otherlv_1= 'vector<string>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4909:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4910:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringVectorTypeAccess().getStringVectorTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,84,FOLLOW_84_in_ruleStringVectorType10206); 

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
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOneClassSimpleDef706 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleOneClassSimpleDef732 = new BitSet(new long[]{0x0000180000000000L});
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
    public static final BitSet FOLLOW_ruleCommand_in_rulePogoDeviceClass1250 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_27_in_rulePogoDeviceClass1263 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_ruleAttribute_in_rulePogoDeviceClass1284 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_28_in_rulePogoDeviceClass1297 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_ruleAttribute_in_rulePogoDeviceClass1318 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_29_in_rulePogoDeviceClass1331 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleState_in_rulePogoDeviceClass1352 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rulePreferences_in_rulePogoDeviceClass1374 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePogoDeviceClass1386 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleAdditionalFile_in_rulePogoDeviceClass1407 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_30_in_rulePogoDeviceClass1420 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleOverlodedPollPeriodObject_in_rulePogoDeviceClass1441 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_rulePogoDeviceClass1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLanguage_in_entryRuleLanguage1491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLanguage1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleLanguage1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleLanguage1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleLanguage1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisplayLevel_in_entryRuleDisplayLevel1619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisplayLevel1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleDisplayLevel1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleDisplayLevel1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrType_in_entryRuleAttrType1728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrType1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleAttrType1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleAttrType1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleAttrType1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRW_Type_in_entryRuleRW_Type1856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRW_Type1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleRW_Type1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleRW_Type1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleRW_Type1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleRW_Type1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean2003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleBoolean2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleBoolean2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDescription_in_entryRuleClassDescription2111 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassDescription2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassDescription2163 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassDescription2185 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassDescription2207 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleClassDescription2224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInheritance_in_ruleClassDescription2245 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_ruleLanguage_in_ruleClassDescription2266 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassDescription2283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClassIdentification_in_ruleClassDescription2309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleComments_in_ruleClassDescription2330 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassDescription2347 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleClassDescription2373 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleClassDescription2394 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleClassDescription2415 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleClassDescription2436 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleClassDescription2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritance_in_entryRuleInheritance2493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInheritance2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInheritance2545 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInheritance2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassIdentification_in_entryRuleClassIdentification2608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassIdentification2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2660 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2682 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2704 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2726 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2770 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2792 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComments_in_entryRuleComments2877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComments2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleComments2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreferences_in_entryRulePreferences2968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreferences2978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePreferences3020 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePreferences3042 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePreferences3064 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_rulePreferences3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState3126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState3136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState3178 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState3200 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_ruleState3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty3262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty3314 = new BitSet(new long[]{0x07F8000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_rulePropType_in_ruleProperty3340 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_ruleProperty3361 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleProperty3382 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProperty3399 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleProperty3416 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProperty3433 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rulePropType_in_entryRulePropType3475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropType3485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rulePropType3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVectorType_in_rulePropType3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType3594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType3604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_ruleSimpleType3651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortType_in_ruleSimpleType3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortType_in_ruleSimpleType3705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_ruleSimpleType3732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntType_in_ruleSimpleType3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_ruleSimpleType3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_ruleSimpleType3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_ruleSimpleType3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVectorType_in_entryRuleVectorType3875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVectorType3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortVectorType_in_ruleVectorType3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntVectorType_in_ruleVectorType3959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatVectorType_in_ruleVectorType3986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleVectorType_in_ruleVectorType4013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVectorType_in_ruleVectorType4040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_entryRuleInheritanceStatus4075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInheritanceStatus4085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleInheritanceStatus4131 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleInheritanceStatus4152 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleInheritanceStatus4173 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleInheritanceStatus4194 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInheritanceStatus4211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand4252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand4262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand4304 = new BitSet(new long[]{0xFFFC000000000000L,0x000000000000FFFFL});
    public static final BitSet FOLLOW_ruleArgument_in_ruleCommand4330 = new BitSet(new long[]{0xFFFC000000000000L,0x000000000000FFFFL});
    public static final BitSet FOLLOW_ruleArgument_in_ruleCommand4351 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommand4368 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_ruleCommand4394 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommand4411 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_ruleDisplayLevel_in_ruleCommand4437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommand4454 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleCommand4480 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleCommand4492 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommand4509 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument4551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument4561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleArgument4607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument4624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute4665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute4675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute4717 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_ruleAttrType_in_ruleAttribute4743 = new BitSet(new long[]{0xFFFC000000000000L,0x000000000000FFFFL});
    public static final BitSet FOLLOW_ruleType_in_ruleAttribute4764 = new BitSet(new long[]{0x0000078000000000L});
    public static final BitSet FOLLOW_ruleRW_Type_in_ruleAttribute4785 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_ruleDisplayLevel_in_ruleAttribute4806 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute4823 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute4845 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute4867 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute4889 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleAttribute4915 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleAttribute4936 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleFireEvents_in_ruleAttribute4957 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleFireEvents_in_ruleAttribute4978 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleFireEvents_in_ruleAttribute4999 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_ruleAttribute5020 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttrProperties_in_ruleAttribute5041 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleAttribute5062 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleAttribute5083 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEventCriteria_in_ruleAttribute5104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEventCriteria_in_ruleAttribute5125 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleAttribute5137 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute5154 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_48_in_ruleAttribute5172 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute5189 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_49_in_ruleAttribute5207 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute5224 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleFireEvents_in_entryRuleFireEvents5266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFireEvents5276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleFireEvents5322 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleFireEvents5343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventCriteria_in_entryRuleEventCriteria5379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventCriteria5389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEventCriteria5431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEventCriteria5453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEventCriteria5475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrProperties_in_entryRuleAttrProperties5516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrProperties5526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5568 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5634 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5700 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5722 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5744 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5766 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5810 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5832 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionalFile_in_entryRuleAdditionalFile5895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionalFile5905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAdditionalFile5947 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAdditionalFile5969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverlodedPollPeriodObject_in_entryRuleOverlodedPollPeriodObject6010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverlodedPollPeriodObject6020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOverlodedPollPeriodObject6062 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOverlodedPollPeriodObject6084 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOverlodedPollPeriodObject6106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType6147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType6157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidType_in_ruleType6204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_ruleType6231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortType_in_ruleType6258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortType_in_ruleType6285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_ruleType6312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntType_in_ruleType6339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_ruleType6366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_ruleType6393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_ruleType6420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharArrayType_in_ruleType6447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortArrayType_in_ruleType6474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortArrayType_in_ruleType6501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntArrayType_in_ruleType6528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntArrayType_in_ruleType6555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatArrayType_in_ruleType6582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleArrayType_in_ruleType6609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringArrayType_in_ruleType6636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongStringArrayType_in_ruleType6663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleStringArrayType_in_ruleType6690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleType6717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstStringType_in_ruleType6744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanArrayType_in_ruleType6771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_ruleType6798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongType_in_ruleType6825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUCharType_in_ruleType6852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongArrayType_in_ruleType6879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongArrayType_in_ruleType6906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDevIntType_in_ruleType6933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncodedType_in_ruleType6960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_ruleType6987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidType_in_entryRuleVoidType7022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVoidType7032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleVoidType7078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_entryRuleBooleanType7114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanType7124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleBooleanType7170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortType_in_entryRuleShortType7206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortType7216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleShortType7262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortType_in_entryRuleUShortType7298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUShortType7308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleUShortType7354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_entryRuleIntType7390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntType7400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleIntType7446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntType_in_entryRuleUIntType7482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIntType7492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleUIntType7538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_entryRuleFloatType7574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatType7584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleFloatType7630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_entryRuleDoubleType7666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleType7676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleDoubleType7722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType7758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType7768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleStringType7814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharArrayType_in_entryRuleCharArrayType7850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharArrayType7860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleCharArrayType7906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortArrayType_in_entryRuleShortArrayType7942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortArrayType7952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleShortArrayType7998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortArrayType_in_entryRuleUShortArrayType8034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUShortArrayType8044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleUShortArrayType8090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntArrayType_in_entryRuleIntArrayType8126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntArrayType8136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleIntArrayType8182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntArrayType_in_entryRuleUIntArrayType8218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIntArrayType8228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleUIntArrayType8274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatArrayType_in_entryRuleFloatArrayType8310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatArrayType8320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleFloatArrayType8366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleArrayType_in_entryRuleDoubleArrayType8402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleArrayType8412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleDoubleArrayType8458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringArrayType_in_entryRuleStringArrayType8494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringArrayType8504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleStringArrayType8550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongStringArrayType_in_entryRuleLongStringArrayType8586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongStringArrayType8596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleLongStringArrayType8642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleStringArrayType_in_entryRuleDoubleStringArrayType8678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleStringArrayType8688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleDoubleStringArrayType8734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_entryRuleStateType8770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateType8780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleStateType8826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstStringType_in_entryRuleConstStringType8862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstStringType8872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleConstStringType8918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanArrayType_in_entryRuleBooleanArrayType8954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanArrayType8964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleBooleanArrayType9010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUCharType_in_entryRuleUCharType9046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUCharType9056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleUCharType9102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_entryRuleLongType9138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongType9148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleLongType9194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongType_in_entryRuleULongType9230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleULongType9240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleULongType9286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongArrayType_in_entryRuleLongArrayType9322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongArrayType9332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleLongArrayType9378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongArrayType_in_entryRuleULongArrayType9414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleULongArrayType9424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleULongArrayType9470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDevIntType_in_entryRuleDevIntType9506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDevIntType9516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleDevIntType9562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncodedType_in_entryRuleEncodedType9598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEncodedType9608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleEncodedType9654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_entryRuleEnumType9690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumType9700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleEnumType9746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortVectorType_in_entryRuleShortVectorType9782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortVectorType9792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleShortVectorType9838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntVectorType_in_entryRuleIntVectorType9874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntVectorType9884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleIntVectorType9930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatVectorType_in_entryRuleFloatVectorType9966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatVectorType9976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleFloatVectorType10022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleVectorType_in_entryRuleDoubleVectorType10058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleVectorType10068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleDoubleVectorType10114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVectorType_in_entryRuleStringVectorType10150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringVectorType10160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleStringVectorType10206 = new BitSet(new long[]{0x0000000000000002L});

}