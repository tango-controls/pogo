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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'multiclasses'", "'{'", "'classes:'", "'}'", "'inheritances:'", "'parentClasses:'", "'additionalFiles:'", "'deviceclass'", "'abstract'", "'extends'", "'description:'", "'classProperties:'", "'deviceProperties:'", "'commands:'", "'dynamicCommands:'", "'attributes:'", "'dynamicAttributes:'", "'forwardedAttributes:'", "'pipes:'", "'states:'", "'overlodedPollPeriodObject:'", "'Cpp'", "'Java'", "'Python'", "'OPERATOR'", "'EXPERT'", "'Scalar'", "'Spectrum'", "'Image'", "'READ'", "'WRITE'", "'READ_WRITE'", "'READ_WITH_WRITE'", "'true'", "'false'", "'keyWords:'", "'defaultPropValue:'", "'excludedStates:'", "'enumLabels:'", "'readExcludedStates:'", "'writeExcludedStates:'", "'void'", "'boolean'", "'short'", "'ushort'", "'int'", "'uint'", "'float'", "'double'", "'string'", "'DevVarCharArray'", "'DevVarShortArray'", "'DevVarUShortArray'", "'DevVarLongArray'", "'DevVarULongArray'", "'DevVarFloatArray'", "'DevVarDoubleArray'", "'DevVarStringArray'", "'DevVarLongStringArray'", "'DevVarDoubleStringArray'", "'DevState'", "'ConstDevString'", "'DevVarBooleanArray'", "'DevUChar'", "'DevLong64'", "'DevULong64'", "'DevVarLong64Array'", "'DevVarULong64Array'", "'DevInt'", "'DevEncoded'", "'DevEnum'", "'vector<short>'", "'vector<int>'", "'vector<long>'", "'vector<ulong>'", "'vector<float>'", "'vector<double>'", "'vector<string>'"
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
    public static final int T__85=85;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:194:1: rulePogoMultiClasses returns [EObject current=null] : ( ( (lv_pogoRevision_0_0= RULE_ID ) ) otherlv_1= 'multiclasses' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_sourcePath_4_0= RULE_STRING ) ) ( (lv_description_5_0= RULE_STRING ) ) ( (lv_title_6_0= RULE_STRING ) ) ( (lv_license_7_0= RULE_STRING ) ) ( (lv_copyright_8_0= RULE_STRING ) ) otherlv_9= 'classes:' ( (lv_classes_10_0= ruleOneClassSimpleDef ) ) ( (lv_filestogenerate_11_0= RULE_STRING ) ) ( (lv_preferences_12_0= rulePreferences ) ) otherlv_13= '}' ) ;
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
        Token lv_copyright_8_0=null;
        Token otherlv_9=null;
        Token lv_filestogenerate_11_0=null;
        Token otherlv_13=null;
        EObject lv_classes_10_0 = null;

        EObject lv_preferences_12_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:197:28: ( ( ( (lv_pogoRevision_0_0= RULE_ID ) ) otherlv_1= 'multiclasses' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_sourcePath_4_0= RULE_STRING ) ) ( (lv_description_5_0= RULE_STRING ) ) ( (lv_title_6_0= RULE_STRING ) ) ( (lv_license_7_0= RULE_STRING ) ) ( (lv_copyright_8_0= RULE_STRING ) ) otherlv_9= 'classes:' ( (lv_classes_10_0= ruleOneClassSimpleDef ) ) ( (lv_filestogenerate_11_0= RULE_STRING ) ) ( (lv_preferences_12_0= rulePreferences ) ) otherlv_13= '}' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:198:1: ( ( (lv_pogoRevision_0_0= RULE_ID ) ) otherlv_1= 'multiclasses' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_sourcePath_4_0= RULE_STRING ) ) ( (lv_description_5_0= RULE_STRING ) ) ( (lv_title_6_0= RULE_STRING ) ) ( (lv_license_7_0= RULE_STRING ) ) ( (lv_copyright_8_0= RULE_STRING ) ) otherlv_9= 'classes:' ( (lv_classes_10_0= ruleOneClassSimpleDef ) ) ( (lv_filestogenerate_11_0= RULE_STRING ) ) ( (lv_preferences_12_0= rulePreferences ) ) otherlv_13= '}' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:198:1: ( ( (lv_pogoRevision_0_0= RULE_ID ) ) otherlv_1= 'multiclasses' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_sourcePath_4_0= RULE_STRING ) ) ( (lv_description_5_0= RULE_STRING ) ) ( (lv_title_6_0= RULE_STRING ) ) ( (lv_license_7_0= RULE_STRING ) ) ( (lv_copyright_8_0= RULE_STRING ) ) otherlv_9= 'classes:' ( (lv_classes_10_0= ruleOneClassSimpleDef ) ) ( (lv_filestogenerate_11_0= RULE_STRING ) ) ( (lv_preferences_12_0= rulePreferences ) ) otherlv_13= '}' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:198:2: ( (lv_pogoRevision_0_0= RULE_ID ) ) otherlv_1= 'multiclasses' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_sourcePath_4_0= RULE_STRING ) ) ( (lv_description_5_0= RULE_STRING ) ) ( (lv_title_6_0= RULE_STRING ) ) ( (lv_license_7_0= RULE_STRING ) ) ( (lv_copyright_8_0= RULE_STRING ) ) otherlv_9= 'classes:' ( (lv_classes_10_0= ruleOneClassSimpleDef ) ) ( (lv_filestogenerate_11_0= RULE_STRING ) ) ( (lv_preferences_12_0= rulePreferences ) ) otherlv_13= '}'
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:314:2: ( (lv_copyright_8_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:315:1: (lv_copyright_8_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:315:1: (lv_copyright_8_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:316:3: lv_copyright_8_0= RULE_STRING
            {
            lv_copyright_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePogoMultiClasses525); 

            			newLeafNode(lv_copyright_8_0, grammarAccess.getPogoMultiClassesAccess().getCopyrightSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPogoMultiClassesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"copyright",
                    		lv_copyright_8_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_rulePogoMultiClasses542); 

                	newLeafNode(otherlv_9, grammarAccess.getPogoMultiClassesAccess().getClassesKeyword_9());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:336:1: ( (lv_classes_10_0= ruleOneClassSimpleDef ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:337:1: (lv_classes_10_0= ruleOneClassSimpleDef )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:337:1: (lv_classes_10_0= ruleOneClassSimpleDef )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:338:3: lv_classes_10_0= ruleOneClassSimpleDef
            {
             
            	        newCompositeNode(grammarAccess.getPogoMultiClassesAccess().getClassesOneClassSimpleDefParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleOneClassSimpleDef_in_rulePogoMultiClasses563);
            lv_classes_10_0=ruleOneClassSimpleDef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPogoMultiClassesRule());
            	        }
                   		add(
                   			current, 
                   			"classes",
                    		lv_classes_10_0, 
                    		"OneClassSimpleDef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:354:2: ( (lv_filestogenerate_11_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:355:1: (lv_filestogenerate_11_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:355:1: (lv_filestogenerate_11_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:356:3: lv_filestogenerate_11_0= RULE_STRING
            {
            lv_filestogenerate_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePogoMultiClasses580); 

            			newLeafNode(lv_filestogenerate_11_0, grammarAccess.getPogoMultiClassesAccess().getFilestogenerateSTRINGTerminalRuleCall_11_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPogoMultiClassesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"filestogenerate",
                    		lv_filestogenerate_11_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:372:2: ( (lv_preferences_12_0= rulePreferences ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:373:1: (lv_preferences_12_0= rulePreferences )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:373:1: (lv_preferences_12_0= rulePreferences )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:374:3: lv_preferences_12_0= rulePreferences
            {
             
            	        newCompositeNode(grammarAccess.getPogoMultiClassesAccess().getPreferencesPreferencesParserRuleCall_12_0()); 
            	    
            pushFollow(FOLLOW_rulePreferences_in_rulePogoMultiClasses606);
            lv_preferences_12_0=rulePreferences();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPogoMultiClassesRule());
            	        }
                   		set(
                   			current, 
                   			"preferences",
                    		lv_preferences_12_0, 
                    		"Preferences");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_13=(Token)match(input,15,FOLLOW_15_in_rulePogoMultiClasses618); 

                	newLeafNode(otherlv_13, grammarAccess.getPogoMultiClassesAccess().getRightCurlyBracketKeyword_13());
                

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:402:1: entryRuleOneClassSimpleDef returns [EObject current=null] : iv_ruleOneClassSimpleDef= ruleOneClassSimpleDef EOF ;
    public final EObject entryRuleOneClassSimpleDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneClassSimpleDef = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:403:2: (iv_ruleOneClassSimpleDef= ruleOneClassSimpleDef EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:404:2: iv_ruleOneClassSimpleDef= ruleOneClassSimpleDef EOF
            {
             newCompositeNode(grammarAccess.getOneClassSimpleDefRule()); 
            pushFollow(FOLLOW_ruleOneClassSimpleDef_in_entryRuleOneClassSimpleDef654);
            iv_ruleOneClassSimpleDef=ruleOneClassSimpleDef();

            state._fsp--;

             current =iv_ruleOneClassSimpleDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneClassSimpleDef664); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:411:1: ruleOneClassSimpleDef returns [EObject current=null] : ( ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) ( (lv_hasDynamic_2_0= ruleBoolean ) ) ( (lv_pogo6_3_0= ruleBoolean ) ) otherlv_4= 'inheritances:' ( (lv_inheritances_5_0= ruleInheritance ) ) otherlv_6= 'parentClasses:' ( (lv_parentClasses_7_0= RULE_STRING ) ) otherlv_8= 'additionalFiles:' ( (lv_additionalFiles_9_0= ruleAdditionalFile ) )* ) ;
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
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:414:28: ( ( ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) ( (lv_hasDynamic_2_0= ruleBoolean ) ) ( (lv_pogo6_3_0= ruleBoolean ) ) otherlv_4= 'inheritances:' ( (lv_inheritances_5_0= ruleInheritance ) ) otherlv_6= 'parentClasses:' ( (lv_parentClasses_7_0= RULE_STRING ) ) otherlv_8= 'additionalFiles:' ( (lv_additionalFiles_9_0= ruleAdditionalFile ) )* ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:415:1: ( ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) ( (lv_hasDynamic_2_0= ruleBoolean ) ) ( (lv_pogo6_3_0= ruleBoolean ) ) otherlv_4= 'inheritances:' ( (lv_inheritances_5_0= ruleInheritance ) ) otherlv_6= 'parentClasses:' ( (lv_parentClasses_7_0= RULE_STRING ) ) otherlv_8= 'additionalFiles:' ( (lv_additionalFiles_9_0= ruleAdditionalFile ) )* )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:415:1: ( ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) ( (lv_hasDynamic_2_0= ruleBoolean ) ) ( (lv_pogo6_3_0= ruleBoolean ) ) otherlv_4= 'inheritances:' ( (lv_inheritances_5_0= ruleInheritance ) ) otherlv_6= 'parentClasses:' ( (lv_parentClasses_7_0= RULE_STRING ) ) otherlv_8= 'additionalFiles:' ( (lv_additionalFiles_9_0= ruleAdditionalFile ) )* )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:415:2: ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) ( (lv_hasDynamic_2_0= ruleBoolean ) ) ( (lv_pogo6_3_0= ruleBoolean ) ) otherlv_4= 'inheritances:' ( (lv_inheritances_5_0= ruleInheritance ) ) otherlv_6= 'parentClasses:' ( (lv_parentClasses_7_0= RULE_STRING ) ) otherlv_8= 'additionalFiles:' ( (lv_additionalFiles_9_0= ruleAdditionalFile ) )*
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:415:2: ( (lv_classname_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:416:1: (lv_classname_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:416:1: (lv_classname_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:417:3: lv_classname_0_0= RULE_STRING
            {
            lv_classname_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOneClassSimpleDef706); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:433:2: ( (lv_sourcePath_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:434:1: (lv_sourcePath_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:434:1: (lv_sourcePath_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:435:3: lv_sourcePath_1_0= RULE_STRING
            {
            lv_sourcePath_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOneClassSimpleDef728); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:451:2: ( (lv_hasDynamic_2_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:452:1: (lv_hasDynamic_2_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:452:1: (lv_hasDynamic_2_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:453:3: lv_hasDynamic_2_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getOneClassSimpleDefAccess().getHasDynamicBooleanParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleOneClassSimpleDef754);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:469:2: ( (lv_pogo6_3_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:470:1: (lv_pogo6_3_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:470:1: (lv_pogo6_3_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:471:3: lv_pogo6_3_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getOneClassSimpleDefAccess().getPogo6BooleanParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleOneClassSimpleDef775);
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

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleOneClassSimpleDef787); 

                	newLeafNode(otherlv_4, grammarAccess.getOneClassSimpleDefAccess().getInheritancesKeyword_4());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:491:1: ( (lv_inheritances_5_0= ruleInheritance ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:492:1: (lv_inheritances_5_0= ruleInheritance )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:492:1: (lv_inheritances_5_0= ruleInheritance )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:493:3: lv_inheritances_5_0= ruleInheritance
            {
             
            	        newCompositeNode(grammarAccess.getOneClassSimpleDefAccess().getInheritancesInheritanceParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleInheritance_in_ruleOneClassSimpleDef808);
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

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleOneClassSimpleDef820); 

                	newLeafNode(otherlv_6, grammarAccess.getOneClassSimpleDefAccess().getParentClassesKeyword_6());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:513:1: ( (lv_parentClasses_7_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:514:1: (lv_parentClasses_7_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:514:1: (lv_parentClasses_7_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:515:3: lv_parentClasses_7_0= RULE_STRING
            {
            lv_parentClasses_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOneClassSimpleDef837); 

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

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleOneClassSimpleDef854); 

                	newLeafNode(otherlv_8, grammarAccess.getOneClassSimpleDefAccess().getAdditionalFilesKeyword_8());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:535:1: ( (lv_additionalFiles_9_0= ruleAdditionalFile ) )*
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
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:536:1: (lv_additionalFiles_9_0= ruleAdditionalFile )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:536:1: (lv_additionalFiles_9_0= ruleAdditionalFile )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:537:3: lv_additionalFiles_9_0= ruleAdditionalFile
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOneClassSimpleDefAccess().getAdditionalFilesAdditionalFileParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAdditionalFile_in_ruleOneClassSimpleDef875);
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:561:1: entryRulePogoDeviceClass returns [EObject current=null] : iv_rulePogoDeviceClass= rulePogoDeviceClass EOF ;
    public final EObject entryRulePogoDeviceClass() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePogoDeviceClass = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:562:2: (iv_rulePogoDeviceClass= rulePogoDeviceClass EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:563:2: iv_rulePogoDeviceClass= rulePogoDeviceClass EOF
            {
             newCompositeNode(grammarAccess.getPogoDeviceClassRule()); 
            pushFollow(FOLLOW_rulePogoDeviceClass_in_entryRulePogoDeviceClass912);
            iv_rulePogoDeviceClass=rulePogoDeviceClass();

            state._fsp--;

             current =iv_rulePogoDeviceClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePogoDeviceClass922); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:570:1: rulePogoDeviceClass returns [EObject current=null] : (otherlv_0= 'deviceclass' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isAbstract_2_0= 'abstract' ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_pogoRevision_6_0= RULE_ID ) ) ( (lv_institute_7_0= RULE_ID ) ) otherlv_8= 'description:' ( (lv_description_9_0= ruleClassDescription ) ) otherlv_10= 'classProperties:' ( (lv_classProperties_11_0= ruleProperty ) )* otherlv_12= 'deviceProperties:' ( (lv_deviceProperties_13_0= ruleProperty ) )* otherlv_14= 'commands:' ( (lv_commands_15_0= ruleCommand ) )* otherlv_16= 'dynamicCommands:' ( (lv_dynamicCommands_17_0= ruleCommand ) )* otherlv_18= 'attributes:' ( (lv_attributes_19_0= ruleAttribute ) )* otherlv_20= 'dynamicAttributes:' ( (lv_dynamicAttributes_21_0= ruleAttribute ) )* otherlv_22= 'forwardedAttributes:' ( (lv_forwardedAttributes_23_0= ruleForwardedAttribute ) )* otherlv_24= 'pipes:' ( (lv_pipes_25_0= rulePipe ) )* otherlv_26= 'states:' ( (lv_states_27_0= ruleState ) )* ( (lv_preferences_28_0= rulePreferences ) ) otherlv_29= 'additionalFiles:' ( (lv_additionalFiles_30_0= ruleAdditionalFile ) )* otherlv_31= 'overlodedPollPeriodObject:' ( (lv_overlodedPollPeriodObject_32_0= ruleOverlodedPollPeriodObject ) )* otherlv_33= '}' ) ;
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
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        EObject lv_description_9_0 = null;

        EObject lv_classProperties_11_0 = null;

        EObject lv_deviceProperties_13_0 = null;

        EObject lv_commands_15_0 = null;

        EObject lv_dynamicCommands_17_0 = null;

        EObject lv_attributes_19_0 = null;

        EObject lv_dynamicAttributes_21_0 = null;

        EObject lv_forwardedAttributes_23_0 = null;

        EObject lv_pipes_25_0 = null;

        EObject lv_states_27_0 = null;

        EObject lv_preferences_28_0 = null;

        EObject lv_additionalFiles_30_0 = null;

        EObject lv_overlodedPollPeriodObject_32_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:573:28: ( (otherlv_0= 'deviceclass' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isAbstract_2_0= 'abstract' ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_pogoRevision_6_0= RULE_ID ) ) ( (lv_institute_7_0= RULE_ID ) ) otherlv_8= 'description:' ( (lv_description_9_0= ruleClassDescription ) ) otherlv_10= 'classProperties:' ( (lv_classProperties_11_0= ruleProperty ) )* otherlv_12= 'deviceProperties:' ( (lv_deviceProperties_13_0= ruleProperty ) )* otherlv_14= 'commands:' ( (lv_commands_15_0= ruleCommand ) )* otherlv_16= 'dynamicCommands:' ( (lv_dynamicCommands_17_0= ruleCommand ) )* otherlv_18= 'attributes:' ( (lv_attributes_19_0= ruleAttribute ) )* otherlv_20= 'dynamicAttributes:' ( (lv_dynamicAttributes_21_0= ruleAttribute ) )* otherlv_22= 'forwardedAttributes:' ( (lv_forwardedAttributes_23_0= ruleForwardedAttribute ) )* otherlv_24= 'pipes:' ( (lv_pipes_25_0= rulePipe ) )* otherlv_26= 'states:' ( (lv_states_27_0= ruleState ) )* ( (lv_preferences_28_0= rulePreferences ) ) otherlv_29= 'additionalFiles:' ( (lv_additionalFiles_30_0= ruleAdditionalFile ) )* otherlv_31= 'overlodedPollPeriodObject:' ( (lv_overlodedPollPeriodObject_32_0= ruleOverlodedPollPeriodObject ) )* otherlv_33= '}' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:574:1: (otherlv_0= 'deviceclass' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isAbstract_2_0= 'abstract' ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_pogoRevision_6_0= RULE_ID ) ) ( (lv_institute_7_0= RULE_ID ) ) otherlv_8= 'description:' ( (lv_description_9_0= ruleClassDescription ) ) otherlv_10= 'classProperties:' ( (lv_classProperties_11_0= ruleProperty ) )* otherlv_12= 'deviceProperties:' ( (lv_deviceProperties_13_0= ruleProperty ) )* otherlv_14= 'commands:' ( (lv_commands_15_0= ruleCommand ) )* otherlv_16= 'dynamicCommands:' ( (lv_dynamicCommands_17_0= ruleCommand ) )* otherlv_18= 'attributes:' ( (lv_attributes_19_0= ruleAttribute ) )* otherlv_20= 'dynamicAttributes:' ( (lv_dynamicAttributes_21_0= ruleAttribute ) )* otherlv_22= 'forwardedAttributes:' ( (lv_forwardedAttributes_23_0= ruleForwardedAttribute ) )* otherlv_24= 'pipes:' ( (lv_pipes_25_0= rulePipe ) )* otherlv_26= 'states:' ( (lv_states_27_0= ruleState ) )* ( (lv_preferences_28_0= rulePreferences ) ) otherlv_29= 'additionalFiles:' ( (lv_additionalFiles_30_0= ruleAdditionalFile ) )* otherlv_31= 'overlodedPollPeriodObject:' ( (lv_overlodedPollPeriodObject_32_0= ruleOverlodedPollPeriodObject ) )* otherlv_33= '}' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:574:1: (otherlv_0= 'deviceclass' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isAbstract_2_0= 'abstract' ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_pogoRevision_6_0= RULE_ID ) ) ( (lv_institute_7_0= RULE_ID ) ) otherlv_8= 'description:' ( (lv_description_9_0= ruleClassDescription ) ) otherlv_10= 'classProperties:' ( (lv_classProperties_11_0= ruleProperty ) )* otherlv_12= 'deviceProperties:' ( (lv_deviceProperties_13_0= ruleProperty ) )* otherlv_14= 'commands:' ( (lv_commands_15_0= ruleCommand ) )* otherlv_16= 'dynamicCommands:' ( (lv_dynamicCommands_17_0= ruleCommand ) )* otherlv_18= 'attributes:' ( (lv_attributes_19_0= ruleAttribute ) )* otherlv_20= 'dynamicAttributes:' ( (lv_dynamicAttributes_21_0= ruleAttribute ) )* otherlv_22= 'forwardedAttributes:' ( (lv_forwardedAttributes_23_0= ruleForwardedAttribute ) )* otherlv_24= 'pipes:' ( (lv_pipes_25_0= rulePipe ) )* otherlv_26= 'states:' ( (lv_states_27_0= ruleState ) )* ( (lv_preferences_28_0= rulePreferences ) ) otherlv_29= 'additionalFiles:' ( (lv_additionalFiles_30_0= ruleAdditionalFile ) )* otherlv_31= 'overlodedPollPeriodObject:' ( (lv_overlodedPollPeriodObject_32_0= ruleOverlodedPollPeriodObject ) )* otherlv_33= '}' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:574:3: otherlv_0= 'deviceclass' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isAbstract_2_0= 'abstract' ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_pogoRevision_6_0= RULE_ID ) ) ( (lv_institute_7_0= RULE_ID ) ) otherlv_8= 'description:' ( (lv_description_9_0= ruleClassDescription ) ) otherlv_10= 'classProperties:' ( (lv_classProperties_11_0= ruleProperty ) )* otherlv_12= 'deviceProperties:' ( (lv_deviceProperties_13_0= ruleProperty ) )* otherlv_14= 'commands:' ( (lv_commands_15_0= ruleCommand ) )* otherlv_16= 'dynamicCommands:' ( (lv_dynamicCommands_17_0= ruleCommand ) )* otherlv_18= 'attributes:' ( (lv_attributes_19_0= ruleAttribute ) )* otherlv_20= 'dynamicAttributes:' ( (lv_dynamicAttributes_21_0= ruleAttribute ) )* otherlv_22= 'forwardedAttributes:' ( (lv_forwardedAttributes_23_0= ruleForwardedAttribute ) )* otherlv_24= 'pipes:' ( (lv_pipes_25_0= rulePipe ) )* otherlv_26= 'states:' ( (lv_states_27_0= ruleState ) )* ( (lv_preferences_28_0= rulePreferences ) ) otherlv_29= 'additionalFiles:' ( (lv_additionalFiles_30_0= ruleAdditionalFile ) )* otherlv_31= 'overlodedPollPeriodObject:' ( (lv_overlodedPollPeriodObject_32_0= ruleOverlodedPollPeriodObject ) )* otherlv_33= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_rulePogoDeviceClass959); 

                	newLeafNode(otherlv_0, grammarAccess.getPogoDeviceClassAccess().getDeviceclassKeyword_0());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:578:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:579:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:579:1: (lv_name_1_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:580:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePogoDeviceClass976); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:596:2: ( (lv_isAbstract_2_0= 'abstract' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:597:1: (lv_isAbstract_2_0= 'abstract' )
                    {
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:597:1: (lv_isAbstract_2_0= 'abstract' )
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:598:3: lv_isAbstract_2_0= 'abstract'
                    {
                    lv_isAbstract_2_0=(Token)match(input,20,FOLLOW_20_in_rulePogoDeviceClass999); 

                            newLeafNode(lv_isAbstract_2_0, grammarAccess.getPogoDeviceClassAccess().getIsAbstractAbstractKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPogoDeviceClassRule());
                    	        }
                           		setWithLastConsumed(current, "isAbstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:611:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:611:5: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_rulePogoDeviceClass1026); 

                        	newLeafNode(otherlv_3, grammarAccess.getPogoDeviceClassAccess().getExtendsKeyword_3_0());
                        
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:615:1: ( (otherlv_4= RULE_ID ) )
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:616:1: (otherlv_4= RULE_ID )
                    {
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:616:1: (otherlv_4= RULE_ID )
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:617:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPogoDeviceClassRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePogoDeviceClass1046); 

                    		newLeafNode(otherlv_4, grammarAccess.getPogoDeviceClassAccess().getBaseClassPogoDeviceClassCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_rulePogoDeviceClass1060); 

                	newLeafNode(otherlv_5, grammarAccess.getPogoDeviceClassAccess().getLeftCurlyBracketKeyword_4());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:632:1: ( (lv_pogoRevision_6_0= RULE_ID ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:633:1: (lv_pogoRevision_6_0= RULE_ID )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:633:1: (lv_pogoRevision_6_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:634:3: lv_pogoRevision_6_0= RULE_ID
            {
            lv_pogoRevision_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePogoDeviceClass1077); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:650:2: ( (lv_institute_7_0= RULE_ID ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:651:1: (lv_institute_7_0= RULE_ID )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:651:1: (lv_institute_7_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:652:3: lv_institute_7_0= RULE_ID
            {
            lv_institute_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePogoDeviceClass1099); 

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

            otherlv_8=(Token)match(input,22,FOLLOW_22_in_rulePogoDeviceClass1116); 

                	newLeafNode(otherlv_8, grammarAccess.getPogoDeviceClassAccess().getDescriptionKeyword_7());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:672:1: ( (lv_description_9_0= ruleClassDescription ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:673:1: (lv_description_9_0= ruleClassDescription )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:673:1: (lv_description_9_0= ruleClassDescription )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:674:3: lv_description_9_0= ruleClassDescription
            {
             
            	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getDescriptionClassDescriptionParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleClassDescription_in_rulePogoDeviceClass1137);
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

            otherlv_10=(Token)match(input,23,FOLLOW_23_in_rulePogoDeviceClass1149); 

                	newLeafNode(otherlv_10, grammarAccess.getPogoDeviceClassAccess().getClassPropertiesKeyword_9());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:694:1: ( (lv_classProperties_11_0= ruleProperty ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:695:1: (lv_classProperties_11_0= ruleProperty )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:695:1: (lv_classProperties_11_0= ruleProperty )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:696:3: lv_classProperties_11_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getClassPropertiesPropertyParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_rulePogoDeviceClass1170);
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

            otherlv_12=(Token)match(input,24,FOLLOW_24_in_rulePogoDeviceClass1183); 

                	newLeafNode(otherlv_12, grammarAccess.getPogoDeviceClassAccess().getDevicePropertiesKeyword_11());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:716:1: ( (lv_deviceProperties_13_0= ruleProperty ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:717:1: (lv_deviceProperties_13_0= ruleProperty )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:717:1: (lv_deviceProperties_13_0= ruleProperty )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:718:3: lv_deviceProperties_13_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getDevicePropertiesPropertyParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_rulePogoDeviceClass1204);
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

            otherlv_14=(Token)match(input,25,FOLLOW_25_in_rulePogoDeviceClass1217); 

                	newLeafNode(otherlv_14, grammarAccess.getPogoDeviceClassAccess().getCommandsKeyword_13());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:738:1: ( (lv_commands_15_0= ruleCommand ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:739:1: (lv_commands_15_0= ruleCommand )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:739:1: (lv_commands_15_0= ruleCommand )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:740:3: lv_commands_15_0= ruleCommand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getCommandsCommandParserRuleCall_14_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommand_in_rulePogoDeviceClass1238);
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

            otherlv_16=(Token)match(input,26,FOLLOW_26_in_rulePogoDeviceClass1251); 

                	newLeafNode(otherlv_16, grammarAccess.getPogoDeviceClassAccess().getDynamicCommandsKeyword_15());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:760:1: ( (lv_dynamicCommands_17_0= ruleCommand ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:761:1: (lv_dynamicCommands_17_0= ruleCommand )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:761:1: (lv_dynamicCommands_17_0= ruleCommand )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:762:3: lv_dynamicCommands_17_0= ruleCommand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getDynamicCommandsCommandParserRuleCall_16_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommand_in_rulePogoDeviceClass1272);
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

            otherlv_18=(Token)match(input,27,FOLLOW_27_in_rulePogoDeviceClass1285); 

                	newLeafNode(otherlv_18, grammarAccess.getPogoDeviceClassAccess().getAttributesKeyword_17());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:782:1: ( (lv_attributes_19_0= ruleAttribute ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:783:1: (lv_attributes_19_0= ruleAttribute )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:783:1: (lv_attributes_19_0= ruleAttribute )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:784:3: lv_attributes_19_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getAttributesAttributeParserRuleCall_18_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_rulePogoDeviceClass1306);
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

            otherlv_20=(Token)match(input,28,FOLLOW_28_in_rulePogoDeviceClass1319); 

                	newLeafNode(otherlv_20, grammarAccess.getPogoDeviceClassAccess().getDynamicAttributesKeyword_19());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:804:1: ( (lv_dynamicAttributes_21_0= ruleAttribute ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:805:1: (lv_dynamicAttributes_21_0= ruleAttribute )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:805:1: (lv_dynamicAttributes_21_0= ruleAttribute )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:806:3: lv_dynamicAttributes_21_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getDynamicAttributesAttributeParserRuleCall_20_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_rulePogoDeviceClass1340);
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

            otherlv_22=(Token)match(input,29,FOLLOW_29_in_rulePogoDeviceClass1353); 

                	newLeafNode(otherlv_22, grammarAccess.getPogoDeviceClassAccess().getForwardedAttributesKeyword_21());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:826:1: ( (lv_forwardedAttributes_23_0= ruleForwardedAttribute ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:827:1: (lv_forwardedAttributes_23_0= ruleForwardedAttribute )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:827:1: (lv_forwardedAttributes_23_0= ruleForwardedAttribute )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:828:3: lv_forwardedAttributes_23_0= ruleForwardedAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getForwardedAttributesForwardedAttributeParserRuleCall_22_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleForwardedAttribute_in_rulePogoDeviceClass1374);
            	    lv_forwardedAttributes_23_0=ruleForwardedAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"forwardedAttributes",
            	            		lv_forwardedAttributes_23_0, 
            	            		"ForwardedAttribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_24=(Token)match(input,30,FOLLOW_30_in_rulePogoDeviceClass1387); 

                	newLeafNode(otherlv_24, grammarAccess.getPogoDeviceClassAccess().getPipesKeyword_23());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:848:1: ( (lv_pipes_25_0= rulePipe ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_STRING) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:849:1: (lv_pipes_25_0= rulePipe )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:849:1: (lv_pipes_25_0= rulePipe )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:850:3: lv_pipes_25_0= rulePipe
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getPipesPipeParserRuleCall_24_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePipe_in_rulePogoDeviceClass1408);
            	    lv_pipes_25_0=rulePipe();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pipes",
            	            		lv_pipes_25_0, 
            	            		"Pipe");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_26=(Token)match(input,31,FOLLOW_31_in_rulePogoDeviceClass1421); 

                	newLeafNode(otherlv_26, grammarAccess.getPogoDeviceClassAccess().getStatesKeyword_25());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:870:1: ( (lv_states_27_0= ruleState ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:871:1: (lv_states_27_0= ruleState )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:871:1: (lv_states_27_0= ruleState )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:872:3: lv_states_27_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getStatesStateParserRuleCall_26_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_rulePogoDeviceClass1442);
            	    lv_states_27_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_27_0, 
            	            		"State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:888:3: ( (lv_preferences_28_0= rulePreferences ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:889:1: (lv_preferences_28_0= rulePreferences )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:889:1: (lv_preferences_28_0= rulePreferences )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:890:3: lv_preferences_28_0= rulePreferences
            {
             
            	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getPreferencesPreferencesParserRuleCall_27_0()); 
            	    
            pushFollow(FOLLOW_rulePreferences_in_rulePogoDeviceClass1464);
            lv_preferences_28_0=rulePreferences();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	        }
                   		set(
                   			current, 
                   			"preferences",
                    		lv_preferences_28_0, 
                    		"Preferences");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_29=(Token)match(input,18,FOLLOW_18_in_rulePogoDeviceClass1476); 

                	newLeafNode(otherlv_29, grammarAccess.getPogoDeviceClassAccess().getAdditionalFilesKeyword_28());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:910:1: ( (lv_additionalFiles_30_0= ruleAdditionalFile ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_STRING) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:911:1: (lv_additionalFiles_30_0= ruleAdditionalFile )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:911:1: (lv_additionalFiles_30_0= ruleAdditionalFile )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:912:3: lv_additionalFiles_30_0= ruleAdditionalFile
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getAdditionalFilesAdditionalFileParserRuleCall_29_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAdditionalFile_in_rulePogoDeviceClass1497);
            	    lv_additionalFiles_30_0=ruleAdditionalFile();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"additionalFiles",
            	            		lv_additionalFiles_30_0, 
            	            		"AdditionalFile");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_31=(Token)match(input,32,FOLLOW_32_in_rulePogoDeviceClass1510); 

                	newLeafNode(otherlv_31, grammarAccess.getPogoDeviceClassAccess().getOverlodedPollPeriodObjectKeyword_30());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:932:1: ( (lv_overlodedPollPeriodObject_32_0= ruleOverlodedPollPeriodObject ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_STRING) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:933:1: (lv_overlodedPollPeriodObject_32_0= ruleOverlodedPollPeriodObject )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:933:1: (lv_overlodedPollPeriodObject_32_0= ruleOverlodedPollPeriodObject )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:934:3: lv_overlodedPollPeriodObject_32_0= ruleOverlodedPollPeriodObject
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getOverlodedPollPeriodObjectOverlodedPollPeriodObjectParserRuleCall_31_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOverlodedPollPeriodObject_in_rulePogoDeviceClass1531);
            	    lv_overlodedPollPeriodObject_32_0=ruleOverlodedPollPeriodObject();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"overlodedPollPeriodObject",
            	            		lv_overlodedPollPeriodObject_32_0, 
            	            		"OverlodedPollPeriodObject");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_33=(Token)match(input,15,FOLLOW_15_in_rulePogoDeviceClass1544); 

                	newLeafNode(otherlv_33, grammarAccess.getPogoDeviceClassAccess().getRightCurlyBracketKeyword_32());
                

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:962:1: entryRuleLanguage returns [String current=null] : iv_ruleLanguage= ruleLanguage EOF ;
    public final String entryRuleLanguage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLanguage = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:963:2: (iv_ruleLanguage= ruleLanguage EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:964:2: iv_ruleLanguage= ruleLanguage EOF
            {
             newCompositeNode(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_ruleLanguage_in_entryRuleLanguage1581);
            iv_ruleLanguage=ruleLanguage();

            state._fsp--;

             current =iv_ruleLanguage.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLanguage1592); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:971:1: ruleLanguage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Cpp' | kw= 'Java' | kw= 'Python' ) ;
    public final AntlrDatatypeRuleToken ruleLanguage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:974:28: ( (kw= 'Cpp' | kw= 'Java' | kw= 'Python' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:975:1: (kw= 'Cpp' | kw= 'Java' | kw= 'Python' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:975:1: (kw= 'Cpp' | kw= 'Java' | kw= 'Python' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt18=1;
                }
                break;
            case 34:
                {
                alt18=2;
                }
                break;
            case 35:
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
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:976:2: kw= 'Cpp'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleLanguage1630); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLanguageAccess().getCppKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:983:2: kw= 'Java'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleLanguage1649); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLanguageAccess().getJavaKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:990:2: kw= 'Python'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleLanguage1668); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1003:1: entryRuleDisplayLevel returns [String current=null] : iv_ruleDisplayLevel= ruleDisplayLevel EOF ;
    public final String entryRuleDisplayLevel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDisplayLevel = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1004:2: (iv_ruleDisplayLevel= ruleDisplayLevel EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1005:2: iv_ruleDisplayLevel= ruleDisplayLevel EOF
            {
             newCompositeNode(grammarAccess.getDisplayLevelRule()); 
            pushFollow(FOLLOW_ruleDisplayLevel_in_entryRuleDisplayLevel1709);
            iv_ruleDisplayLevel=ruleDisplayLevel();

            state._fsp--;

             current =iv_ruleDisplayLevel.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisplayLevel1720); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1012:1: ruleDisplayLevel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'OPERATOR' | kw= 'EXPERT' ) ;
    public final AntlrDatatypeRuleToken ruleDisplayLevel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1015:28: ( (kw= 'OPERATOR' | kw= 'EXPERT' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1016:1: (kw= 'OPERATOR' | kw= 'EXPERT' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1016:1: (kw= 'OPERATOR' | kw= 'EXPERT' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            else if ( (LA19_0==37) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1017:2: kw= 'OPERATOR'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleDisplayLevel1758); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDisplayLevelAccess().getOPERATORKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1024:2: kw= 'EXPERT'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleDisplayLevel1777); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1037:1: entryRuleAttrType returns [String current=null] : iv_ruleAttrType= ruleAttrType EOF ;
    public final String entryRuleAttrType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttrType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1038:2: (iv_ruleAttrType= ruleAttrType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1039:2: iv_ruleAttrType= ruleAttrType EOF
            {
             newCompositeNode(grammarAccess.getAttrTypeRule()); 
            pushFollow(FOLLOW_ruleAttrType_in_entryRuleAttrType1818);
            iv_ruleAttrType=ruleAttrType();

            state._fsp--;

             current =iv_ruleAttrType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrType1829); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1046:1: ruleAttrType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Scalar' | kw= 'Spectrum' | kw= 'Image' ) ;
    public final AntlrDatatypeRuleToken ruleAttrType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1049:28: ( (kw= 'Scalar' | kw= 'Spectrum' | kw= 'Image' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1050:1: (kw= 'Scalar' | kw= 'Spectrum' | kw= 'Image' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1050:1: (kw= 'Scalar' | kw= 'Spectrum' | kw= 'Image' )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt20=1;
                }
                break;
            case 39:
                {
                alt20=2;
                }
                break;
            case 40:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1051:2: kw= 'Scalar'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleAttrType1867); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAttrTypeAccess().getScalarKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1058:2: kw= 'Spectrum'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleAttrType1886); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAttrTypeAccess().getSpectrumKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1065:2: kw= 'Image'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleAttrType1905); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1078:1: entryRuleRW_Type returns [String current=null] : iv_ruleRW_Type= ruleRW_Type EOF ;
    public final String entryRuleRW_Type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRW_Type = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1079:2: (iv_ruleRW_Type= ruleRW_Type EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1080:2: iv_ruleRW_Type= ruleRW_Type EOF
            {
             newCompositeNode(grammarAccess.getRW_TypeRule()); 
            pushFollow(FOLLOW_ruleRW_Type_in_entryRuleRW_Type1946);
            iv_ruleRW_Type=ruleRW_Type();

            state._fsp--;

             current =iv_ruleRW_Type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRW_Type1957); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1087:1: ruleRW_Type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'READ' | kw= 'WRITE' | kw= 'READ_WRITE' | kw= 'READ_WITH_WRITE' ) ;
    public final AntlrDatatypeRuleToken ruleRW_Type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1090:28: ( (kw= 'READ' | kw= 'WRITE' | kw= 'READ_WRITE' | kw= 'READ_WITH_WRITE' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1091:1: (kw= 'READ' | kw= 'WRITE' | kw= 'READ_WRITE' | kw= 'READ_WITH_WRITE' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1091:1: (kw= 'READ' | kw= 'WRITE' | kw= 'READ_WRITE' | kw= 'READ_WITH_WRITE' )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt21=1;
                }
                break;
            case 42:
                {
                alt21=2;
                }
                break;
            case 43:
                {
                alt21=3;
                }
                break;
            case 44:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1092:2: kw= 'READ'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleRW_Type1995); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRW_TypeAccess().getREADKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1099:2: kw= 'WRITE'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleRW_Type2014); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRW_TypeAccess().getWRITEKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1106:2: kw= 'READ_WRITE'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleRW_Type2033); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRW_TypeAccess().getREAD_WRITEKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1113:2: kw= 'READ_WITH_WRITE'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleRW_Type2052); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1126:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1127:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1128:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean2093);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean2104); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1135:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1138:28: ( (kw= 'true' | kw= 'false' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1139:1: (kw= 'true' | kw= 'false' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1139:1: (kw= 'true' | kw= 'false' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==45) ) {
                alt22=1;
            }
            else if ( (LA22_0==46) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1140:2: kw= 'true'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleBoolean2142); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1147:2: kw= 'false'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleBoolean2161); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1160:1: entryRuleClassDescription returns [EObject current=null] : iv_ruleClassDescription= ruleClassDescription EOF ;
    public final EObject entryRuleClassDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDescription = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1161:2: (iv_ruleClassDescription= ruleClassDescription EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1162:2: iv_ruleClassDescription= ruleClassDescription EOF
            {
             newCompositeNode(grammarAccess.getClassDescriptionRule()); 
            pushFollow(FOLLOW_ruleClassDescription_in_entryRuleClassDescription2201);
            iv_ruleClassDescription=ruleClassDescription();

            state._fsp--;

             current =iv_ruleClassDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassDescription2211); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1169:1: ruleClassDescription returns [EObject current=null] : ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_title_1_0= RULE_STRING ) ) ( (lv_sourcePath_2_0= RULE_STRING ) ) otherlv_3= 'inheritances:' ( (lv_inheritances_4_0= ruleInheritance ) ) ( (lv_language_5_0= ruleLanguage ) ) ( (lv_filestogenerate_6_0= RULE_STRING ) ) ( (lv_identification_7_0= ruleClassIdentification ) ) ( (lv_comments_8_0= ruleComments ) ) ( (lv_license_9_0= RULE_STRING ) ) ( (lv_copyright_10_0= RULE_STRING ) ) ( (lv_hasMandatoryProperty_11_0= ruleBoolean ) ) ( (lv_hasConcreteProperty_12_0= ruleBoolean ) ) ( (lv_hasAbstractCommand_13_0= ruleBoolean ) ) ( (lv_hasAbstractAttribute_14_0= ruleBoolean ) ) ( (lv_descriptionHtmlExists_15_0= ruleBoolean ) ) ) ;
    public final EObject ruleClassDescription() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token lv_title_1_0=null;
        Token lv_sourcePath_2_0=null;
        Token otherlv_3=null;
        Token lv_filestogenerate_6_0=null;
        Token lv_license_9_0=null;
        Token lv_copyright_10_0=null;
        EObject lv_inheritances_4_0 = null;

        AntlrDatatypeRuleToken lv_language_5_0 = null;

        EObject lv_identification_7_0 = null;

        EObject lv_comments_8_0 = null;

        AntlrDatatypeRuleToken lv_hasMandatoryProperty_11_0 = null;

        AntlrDatatypeRuleToken lv_hasConcreteProperty_12_0 = null;

        AntlrDatatypeRuleToken lv_hasAbstractCommand_13_0 = null;

        AntlrDatatypeRuleToken lv_hasAbstractAttribute_14_0 = null;

        AntlrDatatypeRuleToken lv_descriptionHtmlExists_15_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1172:28: ( ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_title_1_0= RULE_STRING ) ) ( (lv_sourcePath_2_0= RULE_STRING ) ) otherlv_3= 'inheritances:' ( (lv_inheritances_4_0= ruleInheritance ) ) ( (lv_language_5_0= ruleLanguage ) ) ( (lv_filestogenerate_6_0= RULE_STRING ) ) ( (lv_identification_7_0= ruleClassIdentification ) ) ( (lv_comments_8_0= ruleComments ) ) ( (lv_license_9_0= RULE_STRING ) ) ( (lv_copyright_10_0= RULE_STRING ) ) ( (lv_hasMandatoryProperty_11_0= ruleBoolean ) ) ( (lv_hasConcreteProperty_12_0= ruleBoolean ) ) ( (lv_hasAbstractCommand_13_0= ruleBoolean ) ) ( (lv_hasAbstractAttribute_14_0= ruleBoolean ) ) ( (lv_descriptionHtmlExists_15_0= ruleBoolean ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1173:1: ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_title_1_0= RULE_STRING ) ) ( (lv_sourcePath_2_0= RULE_STRING ) ) otherlv_3= 'inheritances:' ( (lv_inheritances_4_0= ruleInheritance ) ) ( (lv_language_5_0= ruleLanguage ) ) ( (lv_filestogenerate_6_0= RULE_STRING ) ) ( (lv_identification_7_0= ruleClassIdentification ) ) ( (lv_comments_8_0= ruleComments ) ) ( (lv_license_9_0= RULE_STRING ) ) ( (lv_copyright_10_0= RULE_STRING ) ) ( (lv_hasMandatoryProperty_11_0= ruleBoolean ) ) ( (lv_hasConcreteProperty_12_0= ruleBoolean ) ) ( (lv_hasAbstractCommand_13_0= ruleBoolean ) ) ( (lv_hasAbstractAttribute_14_0= ruleBoolean ) ) ( (lv_descriptionHtmlExists_15_0= ruleBoolean ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1173:1: ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_title_1_0= RULE_STRING ) ) ( (lv_sourcePath_2_0= RULE_STRING ) ) otherlv_3= 'inheritances:' ( (lv_inheritances_4_0= ruleInheritance ) ) ( (lv_language_5_0= ruleLanguage ) ) ( (lv_filestogenerate_6_0= RULE_STRING ) ) ( (lv_identification_7_0= ruleClassIdentification ) ) ( (lv_comments_8_0= ruleComments ) ) ( (lv_license_9_0= RULE_STRING ) ) ( (lv_copyright_10_0= RULE_STRING ) ) ( (lv_hasMandatoryProperty_11_0= ruleBoolean ) ) ( (lv_hasConcreteProperty_12_0= ruleBoolean ) ) ( (lv_hasAbstractCommand_13_0= ruleBoolean ) ) ( (lv_hasAbstractAttribute_14_0= ruleBoolean ) ) ( (lv_descriptionHtmlExists_15_0= ruleBoolean ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1173:2: ( (lv_description_0_0= RULE_STRING ) ) ( (lv_title_1_0= RULE_STRING ) ) ( (lv_sourcePath_2_0= RULE_STRING ) ) otherlv_3= 'inheritances:' ( (lv_inheritances_4_0= ruleInheritance ) ) ( (lv_language_5_0= ruleLanguage ) ) ( (lv_filestogenerate_6_0= RULE_STRING ) ) ( (lv_identification_7_0= ruleClassIdentification ) ) ( (lv_comments_8_0= ruleComments ) ) ( (lv_license_9_0= RULE_STRING ) ) ( (lv_copyright_10_0= RULE_STRING ) ) ( (lv_hasMandatoryProperty_11_0= ruleBoolean ) ) ( (lv_hasConcreteProperty_12_0= ruleBoolean ) ) ( (lv_hasAbstractCommand_13_0= ruleBoolean ) ) ( (lv_hasAbstractAttribute_14_0= ruleBoolean ) ) ( (lv_descriptionHtmlExists_15_0= ruleBoolean ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1173:2: ( (lv_description_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1174:1: (lv_description_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1174:1: (lv_description_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1175:3: lv_description_0_0= RULE_STRING
            {
            lv_description_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassDescription2253); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1191:2: ( (lv_title_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1192:1: (lv_title_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1192:1: (lv_title_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1193:3: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassDescription2275); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1209:2: ( (lv_sourcePath_2_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1210:1: (lv_sourcePath_2_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1210:1: (lv_sourcePath_2_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1211:3: lv_sourcePath_2_0= RULE_STRING
            {
            lv_sourcePath_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassDescription2297); 

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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleClassDescription2314); 

                	newLeafNode(otherlv_3, grammarAccess.getClassDescriptionAccess().getInheritancesKeyword_3());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1231:1: ( (lv_inheritances_4_0= ruleInheritance ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1232:1: (lv_inheritances_4_0= ruleInheritance )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1232:1: (lv_inheritances_4_0= ruleInheritance )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1233:3: lv_inheritances_4_0= ruleInheritance
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getInheritancesInheritanceParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleInheritance_in_ruleClassDescription2335);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1249:2: ( (lv_language_5_0= ruleLanguage ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1250:1: (lv_language_5_0= ruleLanguage )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1250:1: (lv_language_5_0= ruleLanguage )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1251:3: lv_language_5_0= ruleLanguage
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getLanguageLanguageParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleLanguage_in_ruleClassDescription2356);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1267:2: ( (lv_filestogenerate_6_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1268:1: (lv_filestogenerate_6_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1268:1: (lv_filestogenerate_6_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1269:3: lv_filestogenerate_6_0= RULE_STRING
            {
            lv_filestogenerate_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassDescription2373); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1285:2: ( (lv_identification_7_0= ruleClassIdentification ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1286:1: (lv_identification_7_0= ruleClassIdentification )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1286:1: (lv_identification_7_0= ruleClassIdentification )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1287:3: lv_identification_7_0= ruleClassIdentification
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getIdentificationClassIdentificationParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleClassIdentification_in_ruleClassDescription2399);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1303:2: ( (lv_comments_8_0= ruleComments ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1304:1: (lv_comments_8_0= ruleComments )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1304:1: (lv_comments_8_0= ruleComments )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1305:3: lv_comments_8_0= ruleComments
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getCommentsCommentsParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleComments_in_ruleClassDescription2420);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1321:2: ( (lv_license_9_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1322:1: (lv_license_9_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1322:1: (lv_license_9_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1323:3: lv_license_9_0= RULE_STRING
            {
            lv_license_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassDescription2437); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1339:2: ( (lv_copyright_10_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1340:1: (lv_copyright_10_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1340:1: (lv_copyright_10_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1341:3: lv_copyright_10_0= RULE_STRING
            {
            lv_copyright_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassDescription2459); 

            			newLeafNode(lv_copyright_10_0, grammarAccess.getClassDescriptionAccess().getCopyrightSTRINGTerminalRuleCall_10_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassDescriptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"copyright",
                    		lv_copyright_10_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1357:2: ( (lv_hasMandatoryProperty_11_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1358:1: (lv_hasMandatoryProperty_11_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1358:1: (lv_hasMandatoryProperty_11_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1359:3: lv_hasMandatoryProperty_11_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getHasMandatoryPropertyBooleanParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleClassDescription2485);
            lv_hasMandatoryProperty_11_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassDescriptionRule());
            	        }
                   		set(
                   			current, 
                   			"hasMandatoryProperty",
                    		lv_hasMandatoryProperty_11_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1375:2: ( (lv_hasConcreteProperty_12_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1376:1: (lv_hasConcreteProperty_12_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1376:1: (lv_hasConcreteProperty_12_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1377:3: lv_hasConcreteProperty_12_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getHasConcretePropertyBooleanParserRuleCall_12_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleClassDescription2506);
            lv_hasConcreteProperty_12_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassDescriptionRule());
            	        }
                   		set(
                   			current, 
                   			"hasConcreteProperty",
                    		lv_hasConcreteProperty_12_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1393:2: ( (lv_hasAbstractCommand_13_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1394:1: (lv_hasAbstractCommand_13_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1394:1: (lv_hasAbstractCommand_13_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1395:3: lv_hasAbstractCommand_13_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getHasAbstractCommandBooleanParserRuleCall_13_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleClassDescription2527);
            lv_hasAbstractCommand_13_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassDescriptionRule());
            	        }
                   		set(
                   			current, 
                   			"hasAbstractCommand",
                    		lv_hasAbstractCommand_13_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1411:2: ( (lv_hasAbstractAttribute_14_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1412:1: (lv_hasAbstractAttribute_14_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1412:1: (lv_hasAbstractAttribute_14_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1413:3: lv_hasAbstractAttribute_14_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getHasAbstractAttributeBooleanParserRuleCall_14_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleClassDescription2548);
            lv_hasAbstractAttribute_14_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassDescriptionRule());
            	        }
                   		set(
                   			current, 
                   			"hasAbstractAttribute",
                    		lv_hasAbstractAttribute_14_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1429:2: ( (lv_descriptionHtmlExists_15_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1430:1: (lv_descriptionHtmlExists_15_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1430:1: (lv_descriptionHtmlExists_15_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1431:3: lv_descriptionHtmlExists_15_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getDescriptionHtmlExistsBooleanParserRuleCall_15_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleClassDescription2569);
            lv_descriptionHtmlExists_15_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassDescriptionRule());
            	        }
                   		set(
                   			current, 
                   			"descriptionHtmlExists",
                    		lv_descriptionHtmlExists_15_0, 
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1455:1: entryRuleInheritance returns [EObject current=null] : iv_ruleInheritance= ruleInheritance EOF ;
    public final EObject entryRuleInheritance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritance = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1456:2: (iv_ruleInheritance= ruleInheritance EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1457:2: iv_ruleInheritance= ruleInheritance EOF
            {
             newCompositeNode(grammarAccess.getInheritanceRule()); 
            pushFollow(FOLLOW_ruleInheritance_in_entryRuleInheritance2605);
            iv_ruleInheritance=ruleInheritance();

            state._fsp--;

             current =iv_ruleInheritance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInheritance2615); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1464:1: ruleInheritance returns [EObject current=null] : ( ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInheritance() throws RecognitionException {
        EObject current = null;

        Token lv_classname_0_0=null;
        Token lv_sourcePath_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1467:28: ( ( ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1468:1: ( ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1468:1: ( ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1468:2: ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1468:2: ( (lv_classname_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1469:1: (lv_classname_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1469:1: (lv_classname_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1470:3: lv_classname_0_0= RULE_STRING
            {
            lv_classname_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInheritance2657); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1486:2: ( (lv_sourcePath_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1487:1: (lv_sourcePath_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1487:1: (lv_sourcePath_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1488:3: lv_sourcePath_1_0= RULE_STRING
            {
            lv_sourcePath_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInheritance2679); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1512:1: entryRuleClassIdentification returns [EObject current=null] : iv_ruleClassIdentification= ruleClassIdentification EOF ;
    public final EObject entryRuleClassIdentification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassIdentification = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1513:2: (iv_ruleClassIdentification= ruleClassIdentification EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1514:2: iv_ruleClassIdentification= ruleClassIdentification EOF
            {
             newCompositeNode(grammarAccess.getClassIdentificationRule()); 
            pushFollow(FOLLOW_ruleClassIdentification_in_entryRuleClassIdentification2720);
            iv_ruleClassIdentification=ruleClassIdentification();

            state._fsp--;

             current =iv_ruleClassIdentification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassIdentification2730); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1521:1: ruleClassIdentification returns [EObject current=null] : ( ( (lv_contact_0_0= RULE_STRING ) ) ( (lv_author_1_0= RULE_STRING ) ) ( (lv_emailDomain_2_0= RULE_STRING ) ) ( (lv_classFamily_3_0= RULE_STRING ) ) ( (lv_siteSpecific_4_0= RULE_STRING ) ) ( (lv_platform_5_0= RULE_STRING ) ) ( (lv_bus_6_0= RULE_STRING ) ) ( (lv_manufacturer_7_0= RULE_STRING ) ) ( (lv_reference_8_0= RULE_STRING ) ) otherlv_9= 'keyWords:' ( (lv_keyWords_10_0= RULE_STRING ) )* ) ;
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
        Token otherlv_9=null;
        Token lv_keyWords_10_0=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1524:28: ( ( ( (lv_contact_0_0= RULE_STRING ) ) ( (lv_author_1_0= RULE_STRING ) ) ( (lv_emailDomain_2_0= RULE_STRING ) ) ( (lv_classFamily_3_0= RULE_STRING ) ) ( (lv_siteSpecific_4_0= RULE_STRING ) ) ( (lv_platform_5_0= RULE_STRING ) ) ( (lv_bus_6_0= RULE_STRING ) ) ( (lv_manufacturer_7_0= RULE_STRING ) ) ( (lv_reference_8_0= RULE_STRING ) ) otherlv_9= 'keyWords:' ( (lv_keyWords_10_0= RULE_STRING ) )* ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1525:1: ( ( (lv_contact_0_0= RULE_STRING ) ) ( (lv_author_1_0= RULE_STRING ) ) ( (lv_emailDomain_2_0= RULE_STRING ) ) ( (lv_classFamily_3_0= RULE_STRING ) ) ( (lv_siteSpecific_4_0= RULE_STRING ) ) ( (lv_platform_5_0= RULE_STRING ) ) ( (lv_bus_6_0= RULE_STRING ) ) ( (lv_manufacturer_7_0= RULE_STRING ) ) ( (lv_reference_8_0= RULE_STRING ) ) otherlv_9= 'keyWords:' ( (lv_keyWords_10_0= RULE_STRING ) )* )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1525:1: ( ( (lv_contact_0_0= RULE_STRING ) ) ( (lv_author_1_0= RULE_STRING ) ) ( (lv_emailDomain_2_0= RULE_STRING ) ) ( (lv_classFamily_3_0= RULE_STRING ) ) ( (lv_siteSpecific_4_0= RULE_STRING ) ) ( (lv_platform_5_0= RULE_STRING ) ) ( (lv_bus_6_0= RULE_STRING ) ) ( (lv_manufacturer_7_0= RULE_STRING ) ) ( (lv_reference_8_0= RULE_STRING ) ) otherlv_9= 'keyWords:' ( (lv_keyWords_10_0= RULE_STRING ) )* )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1525:2: ( (lv_contact_0_0= RULE_STRING ) ) ( (lv_author_1_0= RULE_STRING ) ) ( (lv_emailDomain_2_0= RULE_STRING ) ) ( (lv_classFamily_3_0= RULE_STRING ) ) ( (lv_siteSpecific_4_0= RULE_STRING ) ) ( (lv_platform_5_0= RULE_STRING ) ) ( (lv_bus_6_0= RULE_STRING ) ) ( (lv_manufacturer_7_0= RULE_STRING ) ) ( (lv_reference_8_0= RULE_STRING ) ) otherlv_9= 'keyWords:' ( (lv_keyWords_10_0= RULE_STRING ) )*
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1525:2: ( (lv_contact_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1526:1: (lv_contact_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1526:1: (lv_contact_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1527:3: lv_contact_0_0= RULE_STRING
            {
            lv_contact_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2772); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1543:2: ( (lv_author_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1544:1: (lv_author_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1544:1: (lv_author_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1545:3: lv_author_1_0= RULE_STRING
            {
            lv_author_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2794); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1561:2: ( (lv_emailDomain_2_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1562:1: (lv_emailDomain_2_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1562:1: (lv_emailDomain_2_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1563:3: lv_emailDomain_2_0= RULE_STRING
            {
            lv_emailDomain_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2816); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1579:2: ( (lv_classFamily_3_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1580:1: (lv_classFamily_3_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1580:1: (lv_classFamily_3_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1581:3: lv_classFamily_3_0= RULE_STRING
            {
            lv_classFamily_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2838); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1597:2: ( (lv_siteSpecific_4_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1598:1: (lv_siteSpecific_4_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1598:1: (lv_siteSpecific_4_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1599:3: lv_siteSpecific_4_0= RULE_STRING
            {
            lv_siteSpecific_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2860); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1615:2: ( (lv_platform_5_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1616:1: (lv_platform_5_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1616:1: (lv_platform_5_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1617:3: lv_platform_5_0= RULE_STRING
            {
            lv_platform_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2882); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1633:2: ( (lv_bus_6_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1634:1: (lv_bus_6_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1634:1: (lv_bus_6_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1635:3: lv_bus_6_0= RULE_STRING
            {
            lv_bus_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2904); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1651:2: ( (lv_manufacturer_7_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1652:1: (lv_manufacturer_7_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1652:1: (lv_manufacturer_7_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1653:3: lv_manufacturer_7_0= RULE_STRING
            {
            lv_manufacturer_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2926); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1669:2: ( (lv_reference_8_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1670:1: (lv_reference_8_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1670:1: (lv_reference_8_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1671:3: lv_reference_8_0= RULE_STRING
            {
            lv_reference_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2948); 

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

            otherlv_9=(Token)match(input,47,FOLLOW_47_in_ruleClassIdentification2965); 

                	newLeafNode(otherlv_9, grammarAccess.getClassIdentificationAccess().getKeyWordsKeyword_9());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1691:1: ( (lv_keyWords_10_0= RULE_STRING ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_STRING) ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1==RULE_STRING) ) {
                        int LA23_3 = input.LA(3);

                        if ( (LA23_3==RULE_STRING) ) {
                            int LA23_5 = input.LA(4);

                            if ( (LA23_5==EOF||LA23_5==RULE_STRING) ) {
                                alt23=1;
                            }


                        }
                        else if ( (LA23_3==EOF) ) {
                            alt23=1;
                        }


                    }
                    else if ( (LA23_1==EOF) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1692:1: (lv_keyWords_10_0= RULE_STRING )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1692:1: (lv_keyWords_10_0= RULE_STRING )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1693:3: lv_keyWords_10_0= RULE_STRING
            	    {
            	    lv_keyWords_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2982); 

            	    			newLeafNode(lv_keyWords_10_0, grammarAccess.getClassIdentificationAccess().getKeyWordsSTRINGTerminalRuleCall_10_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getClassIdentificationRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"keyWords",
            	            		lv_keyWords_10_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // $ANTLR end "ruleClassIdentification"


    // $ANTLR start "entryRuleComments"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1717:1: entryRuleComments returns [EObject current=null] : iv_ruleComments= ruleComments EOF ;
    public final EObject entryRuleComments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComments = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1718:2: (iv_ruleComments= ruleComments EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1719:2: iv_ruleComments= ruleComments EOF
            {
             newCompositeNode(grammarAccess.getCommentsRule()); 
            pushFollow(FOLLOW_ruleComments_in_entryRuleComments3024);
            iv_ruleComments=ruleComments();

            state._fsp--;

             current =iv_ruleComments; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComments3034); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1726:1: ruleComments returns [EObject current=null] : ( (lv_commandsTable_0_0= RULE_STRING ) ) ;
    public final EObject ruleComments() throws RecognitionException {
        EObject current = null;

        Token lv_commandsTable_0_0=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1729:28: ( ( (lv_commandsTable_0_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1730:1: ( (lv_commandsTable_0_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1730:1: ( (lv_commandsTable_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1731:1: (lv_commandsTable_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1731:1: (lv_commandsTable_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1732:3: lv_commandsTable_0_0= RULE_STRING
            {
            lv_commandsTable_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleComments3075); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1756:1: entryRulePreferences returns [EObject current=null] : iv_rulePreferences= rulePreferences EOF ;
    public final EObject entryRulePreferences() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreferences = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1757:2: (iv_rulePreferences= rulePreferences EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1758:2: iv_rulePreferences= rulePreferences EOF
            {
             newCompositeNode(grammarAccess.getPreferencesRule()); 
            pushFollow(FOLLOW_rulePreferences_in_entryRulePreferences3115);
            iv_rulePreferences=rulePreferences();

            state._fsp--;

             current =iv_rulePreferences; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePreferences3125); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1765:1: rulePreferences returns [EObject current=null] : ( ( (lv_docHome_0_0= RULE_STRING ) ) ( (lv_makefileHome_1_0= RULE_STRING ) ) ( (lv_installHome_2_0= RULE_STRING ) ) ( (lv_htmlVersion_3_0= ruleBoolean ) ) ) ;
    public final EObject rulePreferences() throws RecognitionException {
        EObject current = null;

        Token lv_docHome_0_0=null;
        Token lv_makefileHome_1_0=null;
        Token lv_installHome_2_0=null;
        AntlrDatatypeRuleToken lv_htmlVersion_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1768:28: ( ( ( (lv_docHome_0_0= RULE_STRING ) ) ( (lv_makefileHome_1_0= RULE_STRING ) ) ( (lv_installHome_2_0= RULE_STRING ) ) ( (lv_htmlVersion_3_0= ruleBoolean ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1769:1: ( ( (lv_docHome_0_0= RULE_STRING ) ) ( (lv_makefileHome_1_0= RULE_STRING ) ) ( (lv_installHome_2_0= RULE_STRING ) ) ( (lv_htmlVersion_3_0= ruleBoolean ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1769:1: ( ( (lv_docHome_0_0= RULE_STRING ) ) ( (lv_makefileHome_1_0= RULE_STRING ) ) ( (lv_installHome_2_0= RULE_STRING ) ) ( (lv_htmlVersion_3_0= ruleBoolean ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1769:2: ( (lv_docHome_0_0= RULE_STRING ) ) ( (lv_makefileHome_1_0= RULE_STRING ) ) ( (lv_installHome_2_0= RULE_STRING ) ) ( (lv_htmlVersion_3_0= ruleBoolean ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1769:2: ( (lv_docHome_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1770:1: (lv_docHome_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1770:1: (lv_docHome_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1771:3: lv_docHome_0_0= RULE_STRING
            {
            lv_docHome_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePreferences3167); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1787:2: ( (lv_makefileHome_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1788:1: (lv_makefileHome_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1788:1: (lv_makefileHome_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1789:3: lv_makefileHome_1_0= RULE_STRING
            {
            lv_makefileHome_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePreferences3189); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1805:2: ( (lv_installHome_2_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1806:1: (lv_installHome_2_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1806:1: (lv_installHome_2_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1807:3: lv_installHome_2_0= RULE_STRING
            {
            lv_installHome_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePreferences3211); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1823:2: ( (lv_htmlVersion_3_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1824:1: (lv_htmlVersion_3_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1824:1: (lv_htmlVersion_3_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1825:3: lv_htmlVersion_3_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getPreferencesAccess().getHtmlVersionBooleanParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_rulePreferences3237);
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1849:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1850:2: (iv_ruleState= ruleState EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1851:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState3273);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState3283); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1858:1: ruleState returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_1_0=null;
        EObject lv_status_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1861:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1862:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1862:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1862:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_status_2_0= ruleInheritanceStatus ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1862:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1863:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1863:1: (lv_name_0_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1864:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState3325); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1880:2: ( (lv_description_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1881:1: (lv_description_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1881:1: (lv_description_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1882:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState3347); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1898:2: ( (lv_status_2_0= ruleInheritanceStatus ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1899:1: (lv_status_2_0= ruleInheritanceStatus )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1899:1: (lv_status_2_0= ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1900:3: lv_status_2_0= ruleInheritanceStatus
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getStatusInheritanceStatusParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleInheritanceStatus_in_ruleState3373);
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1924:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1925:2: (iv_ruleProperty= ruleProperty EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1926:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty3409);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty3419); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1933:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= rulePropType ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) ( (lv_mandatory_3_0= ruleBoolean ) ) ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'defaultPropValue:' ( (lv_DefaultPropValue_6_0= RULE_STRING ) )* ) ;
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
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1936:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= rulePropType ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) ( (lv_mandatory_3_0= ruleBoolean ) ) ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'defaultPropValue:' ( (lv_DefaultPropValue_6_0= RULE_STRING ) )* ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1937:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= rulePropType ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) ( (lv_mandatory_3_0= ruleBoolean ) ) ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'defaultPropValue:' ( (lv_DefaultPropValue_6_0= RULE_STRING ) )* )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1937:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= rulePropType ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) ( (lv_mandatory_3_0= ruleBoolean ) ) ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'defaultPropValue:' ( (lv_DefaultPropValue_6_0= RULE_STRING ) )* )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1937:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= rulePropType ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) ( (lv_mandatory_3_0= ruleBoolean ) ) ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'defaultPropValue:' ( (lv_DefaultPropValue_6_0= RULE_STRING ) )*
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1937:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1938:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1938:1: (lv_name_0_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1939:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty3461); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1955:2: ( (lv_type_1_0= rulePropType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1956:1: (lv_type_1_0= rulePropType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1956:1: (lv_type_1_0= rulePropType )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1957:3: lv_type_1_0= rulePropType
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getTypePropTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePropType_in_ruleProperty3487);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1973:2: ( (lv_status_2_0= ruleInheritanceStatus ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1974:1: (lv_status_2_0= ruleInheritanceStatus )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1974:1: (lv_status_2_0= ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1975:3: lv_status_2_0= ruleInheritanceStatus
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getStatusInheritanceStatusParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleInheritanceStatus_in_ruleProperty3508);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1991:2: ( (lv_mandatory_3_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1992:1: (lv_mandatory_3_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1992:1: (lv_mandatory_3_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1993:3: lv_mandatory_3_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getMandatoryBooleanParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleProperty3529);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2009:2: ( (lv_description_4_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2010:1: (lv_description_4_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2010:1: (lv_description_4_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2011:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProperty3546); 

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

            otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleProperty3563); 

                	newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getDefaultPropValueKeyword_5());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2031:1: ( (lv_DefaultPropValue_6_0= RULE_STRING ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_STRING) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2032:1: (lv_DefaultPropValue_6_0= RULE_STRING )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2032:1: (lv_DefaultPropValue_6_0= RULE_STRING )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2033:3: lv_DefaultPropValue_6_0= RULE_STRING
            	    {
            	    lv_DefaultPropValue_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProperty3580); 

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRulePropType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2057:1: entryRulePropType returns [EObject current=null] : iv_rulePropType= rulePropType EOF ;
    public final EObject entryRulePropType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2058:2: (iv_rulePropType= rulePropType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2059:2: iv_rulePropType= rulePropType EOF
            {
             newCompositeNode(grammarAccess.getPropTypeRule()); 
            pushFollow(FOLLOW_rulePropType_in_entryRulePropType3622);
            iv_rulePropType=rulePropType();

            state._fsp--;

             current =iv_rulePropType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropType3632); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2066:1: rulePropType returns [EObject current=null] : (this_SimpleType_0= ruleSimpleType | this_VectorType_1= ruleVectorType ) ;
    public final EObject rulePropType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleType_0 = null;

        EObject this_VectorType_1 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2069:28: ( (this_SimpleType_0= ruleSimpleType | this_VectorType_1= ruleVectorType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2070:1: (this_SimpleType_0= ruleSimpleType | this_VectorType_1= ruleVectorType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2070:1: (this_SimpleType_0= ruleSimpleType | this_VectorType_1= ruleVectorType )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=54 && LA25_0<=61)||(LA25_0>=76 && LA25_0<=77)) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=83 && LA25_0<=89)) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2071:5: this_SimpleType_0= ruleSimpleType
                    {
                     
                            newCompositeNode(grammarAccess.getPropTypeAccess().getSimpleTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleType_in_rulePropType3679);
                    this_SimpleType_0=ruleSimpleType();

                    state._fsp--;

                     
                            current = this_SimpleType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2081:5: this_VectorType_1= ruleVectorType
                    {
                     
                            newCompositeNode(grammarAccess.getPropTypeAccess().getVectorTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVectorType_in_rulePropType3706);
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2097:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2098:2: (iv_ruleSimpleType= ruleSimpleType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2099:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType3741);
            iv_ruleSimpleType=ruleSimpleType();

            state._fsp--;

             current =iv_ruleSimpleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType3751); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2106:1: ruleSimpleType returns [EObject current=null] : (this_BooleanType_0= ruleBooleanType | this_ShortType_1= ruleShortType | this_UShortType_2= ruleUShortType | this_IntType_3= ruleIntType | this_UIntType_4= ruleUIntType | this_LongType_5= ruleLongType | this_ULongType_6= ruleULongType | this_FloatType_7= ruleFloatType | this_DoubleType_8= ruleDoubleType | this_StringType_9= ruleStringType ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanType_0 = null;

        EObject this_ShortType_1 = null;

        EObject this_UShortType_2 = null;

        EObject this_IntType_3 = null;

        EObject this_UIntType_4 = null;

        EObject this_LongType_5 = null;

        EObject this_ULongType_6 = null;

        EObject this_FloatType_7 = null;

        EObject this_DoubleType_8 = null;

        EObject this_StringType_9 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2109:28: ( (this_BooleanType_0= ruleBooleanType | this_ShortType_1= ruleShortType | this_UShortType_2= ruleUShortType | this_IntType_3= ruleIntType | this_UIntType_4= ruleUIntType | this_LongType_5= ruleLongType | this_ULongType_6= ruleULongType | this_FloatType_7= ruleFloatType | this_DoubleType_8= ruleDoubleType | this_StringType_9= ruleStringType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2110:1: (this_BooleanType_0= ruleBooleanType | this_ShortType_1= ruleShortType | this_UShortType_2= ruleUShortType | this_IntType_3= ruleIntType | this_UIntType_4= ruleUIntType | this_LongType_5= ruleLongType | this_ULongType_6= ruleULongType | this_FloatType_7= ruleFloatType | this_DoubleType_8= ruleDoubleType | this_StringType_9= ruleStringType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2110:1: (this_BooleanType_0= ruleBooleanType | this_ShortType_1= ruleShortType | this_UShortType_2= ruleUShortType | this_IntType_3= ruleIntType | this_UIntType_4= ruleUIntType | this_LongType_5= ruleLongType | this_ULongType_6= ruleULongType | this_FloatType_7= ruleFloatType | this_DoubleType_8= ruleDoubleType | this_StringType_9= ruleStringType )
            int alt26=10;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt26=1;
                }
                break;
            case 55:
                {
                alt26=2;
                }
                break;
            case 56:
                {
                alt26=3;
                }
                break;
            case 57:
                {
                alt26=4;
                }
                break;
            case 58:
                {
                alt26=5;
                }
                break;
            case 76:
                {
                alt26=6;
                }
                break;
            case 77:
                {
                alt26=7;
                }
                break;
            case 59:
                {
                alt26=8;
                }
                break;
            case 60:
                {
                alt26=9;
                }
                break;
            case 61:
                {
                alt26=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2111:5: this_BooleanType_0= ruleBooleanType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getBooleanTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBooleanType_in_ruleSimpleType3798);
                    this_BooleanType_0=ruleBooleanType();

                    state._fsp--;

                     
                            current = this_BooleanType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2121:5: this_ShortType_1= ruleShortType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getShortTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleShortType_in_ruleSimpleType3825);
                    this_ShortType_1=ruleShortType();

                    state._fsp--;

                     
                            current = this_ShortType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2131:5: this_UShortType_2= ruleUShortType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getUShortTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleUShortType_in_ruleSimpleType3852);
                    this_UShortType_2=ruleUShortType();

                    state._fsp--;

                     
                            current = this_UShortType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2141:5: this_IntType_3= ruleIntType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getIntTypeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleIntType_in_ruleSimpleType3879);
                    this_IntType_3=ruleIntType();

                    state._fsp--;

                     
                            current = this_IntType_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2151:5: this_UIntType_4= ruleUIntType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getUIntTypeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleUIntType_in_ruleSimpleType3906);
                    this_UIntType_4=ruleUIntType();

                    state._fsp--;

                     
                            current = this_UIntType_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2161:5: this_LongType_5= ruleLongType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getLongTypeParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleLongType_in_ruleSimpleType3933);
                    this_LongType_5=ruleLongType();

                    state._fsp--;

                     
                            current = this_LongType_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2171:5: this_ULongType_6= ruleULongType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getULongTypeParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleULongType_in_ruleSimpleType3960);
                    this_ULongType_6=ruleULongType();

                    state._fsp--;

                     
                            current = this_ULongType_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2181:5: this_FloatType_7= ruleFloatType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getFloatTypeParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleFloatType_in_ruleSimpleType3987);
                    this_FloatType_7=ruleFloatType();

                    state._fsp--;

                     
                            current = this_FloatType_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2191:5: this_DoubleType_8= ruleDoubleType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getDoubleTypeParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleDoubleType_in_ruleSimpleType4014);
                    this_DoubleType_8=ruleDoubleType();

                    state._fsp--;

                     
                            current = this_DoubleType_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2201:5: this_StringType_9= ruleStringType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getStringTypeParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleStringType_in_ruleSimpleType4041);
                    this_StringType_9=ruleStringType();

                    state._fsp--;

                     
                            current = this_StringType_9; 
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2217:1: entryRuleVectorType returns [EObject current=null] : iv_ruleVectorType= ruleVectorType EOF ;
    public final EObject entryRuleVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2218:2: (iv_ruleVectorType= ruleVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2219:2: iv_ruleVectorType= ruleVectorType EOF
            {
             newCompositeNode(grammarAccess.getVectorTypeRule()); 
            pushFollow(FOLLOW_ruleVectorType_in_entryRuleVectorType4076);
            iv_ruleVectorType=ruleVectorType();

            state._fsp--;

             current =iv_ruleVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVectorType4086); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2226:1: ruleVectorType returns [EObject current=null] : (this_ShortVectorType_0= ruleShortVectorType | this_IntVectorType_1= ruleIntVectorType | this_LongVectorType_2= ruleLongVectorType | this_ULongVectorType_3= ruleULongVectorType | this_FloatVectorType_4= ruleFloatVectorType | this_DoubleVectorType_5= ruleDoubleVectorType | this_StringVectorType_6= ruleStringVectorType ) ;
    public final EObject ruleVectorType() throws RecognitionException {
        EObject current = null;

        EObject this_ShortVectorType_0 = null;

        EObject this_IntVectorType_1 = null;

        EObject this_LongVectorType_2 = null;

        EObject this_ULongVectorType_3 = null;

        EObject this_FloatVectorType_4 = null;

        EObject this_DoubleVectorType_5 = null;

        EObject this_StringVectorType_6 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2229:28: ( (this_ShortVectorType_0= ruleShortVectorType | this_IntVectorType_1= ruleIntVectorType | this_LongVectorType_2= ruleLongVectorType | this_ULongVectorType_3= ruleULongVectorType | this_FloatVectorType_4= ruleFloatVectorType | this_DoubleVectorType_5= ruleDoubleVectorType | this_StringVectorType_6= ruleStringVectorType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2230:1: (this_ShortVectorType_0= ruleShortVectorType | this_IntVectorType_1= ruleIntVectorType | this_LongVectorType_2= ruleLongVectorType | this_ULongVectorType_3= ruleULongVectorType | this_FloatVectorType_4= ruleFloatVectorType | this_DoubleVectorType_5= ruleDoubleVectorType | this_StringVectorType_6= ruleStringVectorType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2230:1: (this_ShortVectorType_0= ruleShortVectorType | this_IntVectorType_1= ruleIntVectorType | this_LongVectorType_2= ruleLongVectorType | this_ULongVectorType_3= ruleULongVectorType | this_FloatVectorType_4= ruleFloatVectorType | this_DoubleVectorType_5= ruleDoubleVectorType | this_StringVectorType_6= ruleStringVectorType )
            int alt27=7;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt27=1;
                }
                break;
            case 84:
                {
                alt27=2;
                }
                break;
            case 85:
                {
                alt27=3;
                }
                break;
            case 86:
                {
                alt27=4;
                }
                break;
            case 87:
                {
                alt27=5;
                }
                break;
            case 88:
                {
                alt27=6;
                }
                break;
            case 89:
                {
                alt27=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2231:5: this_ShortVectorType_0= ruleShortVectorType
                    {
                     
                            newCompositeNode(grammarAccess.getVectorTypeAccess().getShortVectorTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleShortVectorType_in_ruleVectorType4133);
                    this_ShortVectorType_0=ruleShortVectorType();

                    state._fsp--;

                     
                            current = this_ShortVectorType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2241:5: this_IntVectorType_1= ruleIntVectorType
                    {
                     
                            newCompositeNode(grammarAccess.getVectorTypeAccess().getIntVectorTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntVectorType_in_ruleVectorType4160);
                    this_IntVectorType_1=ruleIntVectorType();

                    state._fsp--;

                     
                            current = this_IntVectorType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2251:5: this_LongVectorType_2= ruleLongVectorType
                    {
                     
                            newCompositeNode(grammarAccess.getVectorTypeAccess().getLongVectorTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLongVectorType_in_ruleVectorType4187);
                    this_LongVectorType_2=ruleLongVectorType();

                    state._fsp--;

                     
                            current = this_LongVectorType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2261:5: this_ULongVectorType_3= ruleULongVectorType
                    {
                     
                            newCompositeNode(grammarAccess.getVectorTypeAccess().getULongVectorTypeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleULongVectorType_in_ruleVectorType4214);
                    this_ULongVectorType_3=ruleULongVectorType();

                    state._fsp--;

                     
                            current = this_ULongVectorType_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2271:5: this_FloatVectorType_4= ruleFloatVectorType
                    {
                     
                            newCompositeNode(grammarAccess.getVectorTypeAccess().getFloatVectorTypeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleFloatVectorType_in_ruleVectorType4241);
                    this_FloatVectorType_4=ruleFloatVectorType();

                    state._fsp--;

                     
                            current = this_FloatVectorType_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2281:5: this_DoubleVectorType_5= ruleDoubleVectorType
                    {
                     
                            newCompositeNode(grammarAccess.getVectorTypeAccess().getDoubleVectorTypeParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleDoubleVectorType_in_ruleVectorType4268);
                    this_DoubleVectorType_5=ruleDoubleVectorType();

                    state._fsp--;

                     
                            current = this_DoubleVectorType_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2291:5: this_StringVectorType_6= ruleStringVectorType
                    {
                     
                            newCompositeNode(grammarAccess.getVectorTypeAccess().getStringVectorTypeParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleStringVectorType_in_ruleVectorType4295);
                    this_StringVectorType_6=ruleStringVectorType();

                    state._fsp--;

                     
                            current = this_StringVectorType_6; 
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2307:1: entryRuleInheritanceStatus returns [EObject current=null] : iv_ruleInheritanceStatus= ruleInheritanceStatus EOF ;
    public final EObject entryRuleInheritanceStatus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritanceStatus = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2308:2: (iv_ruleInheritanceStatus= ruleInheritanceStatus EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2309:2: iv_ruleInheritanceStatus= ruleInheritanceStatus EOF
            {
             newCompositeNode(grammarAccess.getInheritanceStatusRule()); 
            pushFollow(FOLLOW_ruleInheritanceStatus_in_entryRuleInheritanceStatus4330);
            iv_ruleInheritanceStatus=ruleInheritanceStatus();

            state._fsp--;

             current =iv_ruleInheritanceStatus; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInheritanceStatus4340); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2316:1: ruleInheritanceStatus returns [EObject current=null] : ( ( (lv_abstract_0_0= ruleBoolean ) ) ( (lv_inherited_1_0= ruleBoolean ) ) ( (lv_concrete_2_0= ruleBoolean ) ) ( (lv_concreteHere_3_0= ruleBoolean ) ) ( (lv_hasChanged_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleInheritanceStatus() throws RecognitionException {
        EObject current = null;

        Token lv_hasChanged_4_0=null;
        AntlrDatatypeRuleToken lv_abstract_0_0 = null;

        AntlrDatatypeRuleToken lv_inherited_1_0 = null;

        AntlrDatatypeRuleToken lv_concrete_2_0 = null;

        AntlrDatatypeRuleToken lv_concreteHere_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2319:28: ( ( ( (lv_abstract_0_0= ruleBoolean ) ) ( (lv_inherited_1_0= ruleBoolean ) ) ( (lv_concrete_2_0= ruleBoolean ) ) ( (lv_concreteHere_3_0= ruleBoolean ) ) ( (lv_hasChanged_4_0= RULE_STRING ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2320:1: ( ( (lv_abstract_0_0= ruleBoolean ) ) ( (lv_inherited_1_0= ruleBoolean ) ) ( (lv_concrete_2_0= ruleBoolean ) ) ( (lv_concreteHere_3_0= ruleBoolean ) ) ( (lv_hasChanged_4_0= RULE_STRING ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2320:1: ( ( (lv_abstract_0_0= ruleBoolean ) ) ( (lv_inherited_1_0= ruleBoolean ) ) ( (lv_concrete_2_0= ruleBoolean ) ) ( (lv_concreteHere_3_0= ruleBoolean ) ) ( (lv_hasChanged_4_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2320:2: ( (lv_abstract_0_0= ruleBoolean ) ) ( (lv_inherited_1_0= ruleBoolean ) ) ( (lv_concrete_2_0= ruleBoolean ) ) ( (lv_concreteHere_3_0= ruleBoolean ) ) ( (lv_hasChanged_4_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2320:2: ( (lv_abstract_0_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2321:1: (lv_abstract_0_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2321:1: (lv_abstract_0_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2322:3: lv_abstract_0_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getInheritanceStatusAccess().getAbstractBooleanParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleInheritanceStatus4386);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2338:2: ( (lv_inherited_1_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2339:1: (lv_inherited_1_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2339:1: (lv_inherited_1_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2340:3: lv_inherited_1_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getInheritanceStatusAccess().getInheritedBooleanParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleInheritanceStatus4407);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2356:2: ( (lv_concrete_2_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2357:1: (lv_concrete_2_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2357:1: (lv_concrete_2_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2358:3: lv_concrete_2_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getInheritanceStatusAccess().getConcreteBooleanParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleInheritanceStatus4428);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2374:2: ( (lv_concreteHere_3_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2375:1: (lv_concreteHere_3_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2375:1: (lv_concreteHere_3_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2376:3: lv_concreteHere_3_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getInheritanceStatusAccess().getConcreteHereBooleanParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleInheritanceStatus4449);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2392:2: ( (lv_hasChanged_4_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2393:1: (lv_hasChanged_4_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2393:1: (lv_hasChanged_4_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2394:3: lv_hasChanged_4_0= RULE_STRING
            {
            lv_hasChanged_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInheritanceStatus4466); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2418:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2419:2: (iv_ruleCommand= ruleCommand EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2420:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand4507);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand4517); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2427:1: ruleCommand returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_argin_1_0= ruleArgument ) ) ( (lv_argout_2_0= ruleArgument ) ) ( (lv_description_3_0= RULE_STRING ) ) ( (lv_status_4_0= ruleInheritanceStatus ) ) ( (lv_execMethod_5_0= RULE_STRING ) ) ( (lv_displayLevel_6_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_7_0= RULE_STRING ) ) ( (lv_isDynamic_8_0= ruleBoolean ) ) otherlv_9= 'excludedStates:' ( (lv_excludedStates_10_0= RULE_STRING ) )* ) ;
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
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2430:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_argin_1_0= ruleArgument ) ) ( (lv_argout_2_0= ruleArgument ) ) ( (lv_description_3_0= RULE_STRING ) ) ( (lv_status_4_0= ruleInheritanceStatus ) ) ( (lv_execMethod_5_0= RULE_STRING ) ) ( (lv_displayLevel_6_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_7_0= RULE_STRING ) ) ( (lv_isDynamic_8_0= ruleBoolean ) ) otherlv_9= 'excludedStates:' ( (lv_excludedStates_10_0= RULE_STRING ) )* ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2431:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_argin_1_0= ruleArgument ) ) ( (lv_argout_2_0= ruleArgument ) ) ( (lv_description_3_0= RULE_STRING ) ) ( (lv_status_4_0= ruleInheritanceStatus ) ) ( (lv_execMethod_5_0= RULE_STRING ) ) ( (lv_displayLevel_6_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_7_0= RULE_STRING ) ) ( (lv_isDynamic_8_0= ruleBoolean ) ) otherlv_9= 'excludedStates:' ( (lv_excludedStates_10_0= RULE_STRING ) )* )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2431:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_argin_1_0= ruleArgument ) ) ( (lv_argout_2_0= ruleArgument ) ) ( (lv_description_3_0= RULE_STRING ) ) ( (lv_status_4_0= ruleInheritanceStatus ) ) ( (lv_execMethod_5_0= RULE_STRING ) ) ( (lv_displayLevel_6_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_7_0= RULE_STRING ) ) ( (lv_isDynamic_8_0= ruleBoolean ) ) otherlv_9= 'excludedStates:' ( (lv_excludedStates_10_0= RULE_STRING ) )* )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2431:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_argin_1_0= ruleArgument ) ) ( (lv_argout_2_0= ruleArgument ) ) ( (lv_description_3_0= RULE_STRING ) ) ( (lv_status_4_0= ruleInheritanceStatus ) ) ( (lv_execMethod_5_0= RULE_STRING ) ) ( (lv_displayLevel_6_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_7_0= RULE_STRING ) ) ( (lv_isDynamic_8_0= ruleBoolean ) ) otherlv_9= 'excludedStates:' ( (lv_excludedStates_10_0= RULE_STRING ) )*
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2431:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2432:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2432:1: (lv_name_0_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2433:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand4559); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2449:2: ( (lv_argin_1_0= ruleArgument ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2450:1: (lv_argin_1_0= ruleArgument )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2450:1: (lv_argin_1_0= ruleArgument )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2451:3: lv_argin_1_0= ruleArgument
            {
             
            	        newCompositeNode(grammarAccess.getCommandAccess().getArginArgumentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleArgument_in_ruleCommand4585);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2467:2: ( (lv_argout_2_0= ruleArgument ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2468:1: (lv_argout_2_0= ruleArgument )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2468:1: (lv_argout_2_0= ruleArgument )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2469:3: lv_argout_2_0= ruleArgument
            {
             
            	        newCompositeNode(grammarAccess.getCommandAccess().getArgoutArgumentParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleArgument_in_ruleCommand4606);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2485:2: ( (lv_description_3_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2486:1: (lv_description_3_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2486:1: (lv_description_3_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2487:3: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommand4623); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2503:2: ( (lv_status_4_0= ruleInheritanceStatus ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2504:1: (lv_status_4_0= ruleInheritanceStatus )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2504:1: (lv_status_4_0= ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2505:3: lv_status_4_0= ruleInheritanceStatus
            {
             
            	        newCompositeNode(grammarAccess.getCommandAccess().getStatusInheritanceStatusParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleInheritanceStatus_in_ruleCommand4649);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2521:2: ( (lv_execMethod_5_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2522:1: (lv_execMethod_5_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2522:1: (lv_execMethod_5_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2523:3: lv_execMethod_5_0= RULE_STRING
            {
            lv_execMethod_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommand4666); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2539:2: ( (lv_displayLevel_6_0= ruleDisplayLevel ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2540:1: (lv_displayLevel_6_0= ruleDisplayLevel )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2540:1: (lv_displayLevel_6_0= ruleDisplayLevel )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2541:3: lv_displayLevel_6_0= ruleDisplayLevel
            {
             
            	        newCompositeNode(grammarAccess.getCommandAccess().getDisplayLevelDisplayLevelParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleDisplayLevel_in_ruleCommand4692);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2557:2: ( (lv_polledPeriod_7_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2558:1: (lv_polledPeriod_7_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2558:1: (lv_polledPeriod_7_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2559:3: lv_polledPeriod_7_0= RULE_STRING
            {
            lv_polledPeriod_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommand4709); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2575:2: ( (lv_isDynamic_8_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2576:1: (lv_isDynamic_8_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2576:1: (lv_isDynamic_8_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2577:3: lv_isDynamic_8_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getCommandAccess().getIsDynamicBooleanParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleCommand4735);
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

            otherlv_9=(Token)match(input,49,FOLLOW_49_in_ruleCommand4747); 

                	newLeafNode(otherlv_9, grammarAccess.getCommandAccess().getExcludedStatesKeyword_9());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2597:1: ( (lv_excludedStates_10_0= RULE_STRING ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_STRING) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2598:1: (lv_excludedStates_10_0= RULE_STRING )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2598:1: (lv_excludedStates_10_0= RULE_STRING )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2599:3: lv_excludedStates_10_0= RULE_STRING
            	    {
            	    lv_excludedStates_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommand4764); 

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleArgument"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2623:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2624:2: (iv_ruleArgument= ruleArgument EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2625:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument4806);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument4816); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2632:1: ruleArgument returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_description_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_description_1_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2635:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_description_1_0= RULE_STRING ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2636:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_description_1_0= RULE_STRING ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2636:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_description_1_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2636:2: ( (lv_type_0_0= ruleType ) ) ( (lv_description_1_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2636:2: ( (lv_type_0_0= ruleType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2637:1: (lv_type_0_0= ruleType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2637:1: (lv_type_0_0= ruleType )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2638:3: lv_type_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getArgumentAccess().getTypeTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleArgument4862);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2654:2: ( (lv_description_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2655:1: (lv_description_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2655:1: (lv_description_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2656:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument4879); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2680:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2681:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2682:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute4920);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute4930); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2689:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_attType_1_0= ruleAttrType ) ) ( (lv_dataType_2_0= ruleType ) ) ( (lv_rwType_3_0= ruleRW_Type ) ) ( (lv_displayLevel_4_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_5_0= RULE_STRING ) ) ( (lv_maxX_6_0= RULE_STRING ) ) ( (lv_maxY_7_0= RULE_STRING ) ) ( (lv_associatedAttr_8_0= RULE_STRING ) ) ( (lv_memorized_9_0= ruleBoolean ) ) ( (lv_memorizedAtInit_10_0= ruleBoolean ) ) ( (lv_changeEvent_11_0= ruleFireEvents ) ) ( (lv_archiveEvent_12_0= ruleFireEvents ) ) ( (lv_dataReadyEvent_13_0= ruleFireEvents ) ) ( (lv_status_14_0= ruleInheritanceStatus ) ) ( (lv_properties_15_0= ruleAttrProperties ) ) ( (lv_allocReadMember_16_0= ruleBoolean ) ) ( (lv_isDynamic_17_0= ruleBoolean ) ) ( (lv_eventCriteria_18_0= ruleEventCriteria ) ) ( (lv_evArchiveCriteria_19_0= ruleEventCriteria ) ) otherlv_20= 'enumLabels:' ( (lv_enumLabels_21_0= RULE_STRING ) )* otherlv_22= 'readExcludedStates:' ( (lv_readExcludedStates_23_0= RULE_STRING ) )* otherlv_24= 'writeExcludedStates:' ( (lv_writeExcludedStates_25_0= RULE_STRING ) )* ) ;
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
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2692:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_attType_1_0= ruleAttrType ) ) ( (lv_dataType_2_0= ruleType ) ) ( (lv_rwType_3_0= ruleRW_Type ) ) ( (lv_displayLevel_4_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_5_0= RULE_STRING ) ) ( (lv_maxX_6_0= RULE_STRING ) ) ( (lv_maxY_7_0= RULE_STRING ) ) ( (lv_associatedAttr_8_0= RULE_STRING ) ) ( (lv_memorized_9_0= ruleBoolean ) ) ( (lv_memorizedAtInit_10_0= ruleBoolean ) ) ( (lv_changeEvent_11_0= ruleFireEvents ) ) ( (lv_archiveEvent_12_0= ruleFireEvents ) ) ( (lv_dataReadyEvent_13_0= ruleFireEvents ) ) ( (lv_status_14_0= ruleInheritanceStatus ) ) ( (lv_properties_15_0= ruleAttrProperties ) ) ( (lv_allocReadMember_16_0= ruleBoolean ) ) ( (lv_isDynamic_17_0= ruleBoolean ) ) ( (lv_eventCriteria_18_0= ruleEventCriteria ) ) ( (lv_evArchiveCriteria_19_0= ruleEventCriteria ) ) otherlv_20= 'enumLabels:' ( (lv_enumLabels_21_0= RULE_STRING ) )* otherlv_22= 'readExcludedStates:' ( (lv_readExcludedStates_23_0= RULE_STRING ) )* otherlv_24= 'writeExcludedStates:' ( (lv_writeExcludedStates_25_0= RULE_STRING ) )* ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2693:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_attType_1_0= ruleAttrType ) ) ( (lv_dataType_2_0= ruleType ) ) ( (lv_rwType_3_0= ruleRW_Type ) ) ( (lv_displayLevel_4_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_5_0= RULE_STRING ) ) ( (lv_maxX_6_0= RULE_STRING ) ) ( (lv_maxY_7_0= RULE_STRING ) ) ( (lv_associatedAttr_8_0= RULE_STRING ) ) ( (lv_memorized_9_0= ruleBoolean ) ) ( (lv_memorizedAtInit_10_0= ruleBoolean ) ) ( (lv_changeEvent_11_0= ruleFireEvents ) ) ( (lv_archiveEvent_12_0= ruleFireEvents ) ) ( (lv_dataReadyEvent_13_0= ruleFireEvents ) ) ( (lv_status_14_0= ruleInheritanceStatus ) ) ( (lv_properties_15_0= ruleAttrProperties ) ) ( (lv_allocReadMember_16_0= ruleBoolean ) ) ( (lv_isDynamic_17_0= ruleBoolean ) ) ( (lv_eventCriteria_18_0= ruleEventCriteria ) ) ( (lv_evArchiveCriteria_19_0= ruleEventCriteria ) ) otherlv_20= 'enumLabels:' ( (lv_enumLabels_21_0= RULE_STRING ) )* otherlv_22= 'readExcludedStates:' ( (lv_readExcludedStates_23_0= RULE_STRING ) )* otherlv_24= 'writeExcludedStates:' ( (lv_writeExcludedStates_25_0= RULE_STRING ) )* )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2693:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_attType_1_0= ruleAttrType ) ) ( (lv_dataType_2_0= ruleType ) ) ( (lv_rwType_3_0= ruleRW_Type ) ) ( (lv_displayLevel_4_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_5_0= RULE_STRING ) ) ( (lv_maxX_6_0= RULE_STRING ) ) ( (lv_maxY_7_0= RULE_STRING ) ) ( (lv_associatedAttr_8_0= RULE_STRING ) ) ( (lv_memorized_9_0= ruleBoolean ) ) ( (lv_memorizedAtInit_10_0= ruleBoolean ) ) ( (lv_changeEvent_11_0= ruleFireEvents ) ) ( (lv_archiveEvent_12_0= ruleFireEvents ) ) ( (lv_dataReadyEvent_13_0= ruleFireEvents ) ) ( (lv_status_14_0= ruleInheritanceStatus ) ) ( (lv_properties_15_0= ruleAttrProperties ) ) ( (lv_allocReadMember_16_0= ruleBoolean ) ) ( (lv_isDynamic_17_0= ruleBoolean ) ) ( (lv_eventCriteria_18_0= ruleEventCriteria ) ) ( (lv_evArchiveCriteria_19_0= ruleEventCriteria ) ) otherlv_20= 'enumLabels:' ( (lv_enumLabels_21_0= RULE_STRING ) )* otherlv_22= 'readExcludedStates:' ( (lv_readExcludedStates_23_0= RULE_STRING ) )* otherlv_24= 'writeExcludedStates:' ( (lv_writeExcludedStates_25_0= RULE_STRING ) )* )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2693:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_attType_1_0= ruleAttrType ) ) ( (lv_dataType_2_0= ruleType ) ) ( (lv_rwType_3_0= ruleRW_Type ) ) ( (lv_displayLevel_4_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_5_0= RULE_STRING ) ) ( (lv_maxX_6_0= RULE_STRING ) ) ( (lv_maxY_7_0= RULE_STRING ) ) ( (lv_associatedAttr_8_0= RULE_STRING ) ) ( (lv_memorized_9_0= ruleBoolean ) ) ( (lv_memorizedAtInit_10_0= ruleBoolean ) ) ( (lv_changeEvent_11_0= ruleFireEvents ) ) ( (lv_archiveEvent_12_0= ruleFireEvents ) ) ( (lv_dataReadyEvent_13_0= ruleFireEvents ) ) ( (lv_status_14_0= ruleInheritanceStatus ) ) ( (lv_properties_15_0= ruleAttrProperties ) ) ( (lv_allocReadMember_16_0= ruleBoolean ) ) ( (lv_isDynamic_17_0= ruleBoolean ) ) ( (lv_eventCriteria_18_0= ruleEventCriteria ) ) ( (lv_evArchiveCriteria_19_0= ruleEventCriteria ) ) otherlv_20= 'enumLabels:' ( (lv_enumLabels_21_0= RULE_STRING ) )* otherlv_22= 'readExcludedStates:' ( (lv_readExcludedStates_23_0= RULE_STRING ) )* otherlv_24= 'writeExcludedStates:' ( (lv_writeExcludedStates_25_0= RULE_STRING ) )*
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2693:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2694:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2694:1: (lv_name_0_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2695:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute4972); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2711:2: ( (lv_attType_1_0= ruleAttrType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2712:1: (lv_attType_1_0= ruleAttrType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2712:1: (lv_attType_1_0= ruleAttrType )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2713:3: lv_attType_1_0= ruleAttrType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getAttTypeAttrTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAttrType_in_ruleAttribute4998);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2729:2: ( (lv_dataType_2_0= ruleType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2730:1: (lv_dataType_2_0= ruleType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2730:1: (lv_dataType_2_0= ruleType )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2731:3: lv_dataType_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getDataTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleAttribute5019);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2747:2: ( (lv_rwType_3_0= ruleRW_Type ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2748:1: (lv_rwType_3_0= ruleRW_Type )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2748:1: (lv_rwType_3_0= ruleRW_Type )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2749:3: lv_rwType_3_0= ruleRW_Type
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getRwTypeRW_TypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleRW_Type_in_ruleAttribute5040);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2765:2: ( (lv_displayLevel_4_0= ruleDisplayLevel ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2766:1: (lv_displayLevel_4_0= ruleDisplayLevel )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2766:1: (lv_displayLevel_4_0= ruleDisplayLevel )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2767:3: lv_displayLevel_4_0= ruleDisplayLevel
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getDisplayLevelDisplayLevelParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleDisplayLevel_in_ruleAttribute5061);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2783:2: ( (lv_polledPeriod_5_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2784:1: (lv_polledPeriod_5_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2784:1: (lv_polledPeriod_5_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2785:3: lv_polledPeriod_5_0= RULE_STRING
            {
            lv_polledPeriod_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute5078); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2801:2: ( (lv_maxX_6_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2802:1: (lv_maxX_6_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2802:1: (lv_maxX_6_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2803:3: lv_maxX_6_0= RULE_STRING
            {
            lv_maxX_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute5100); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2819:2: ( (lv_maxY_7_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2820:1: (lv_maxY_7_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2820:1: (lv_maxY_7_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2821:3: lv_maxY_7_0= RULE_STRING
            {
            lv_maxY_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute5122); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2837:2: ( (lv_associatedAttr_8_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2838:1: (lv_associatedAttr_8_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2838:1: (lv_associatedAttr_8_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2839:3: lv_associatedAttr_8_0= RULE_STRING
            {
            lv_associatedAttr_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute5144); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2855:2: ( (lv_memorized_9_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2856:1: (lv_memorized_9_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2856:1: (lv_memorized_9_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2857:3: lv_memorized_9_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getMemorizedBooleanParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleAttribute5170);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2873:2: ( (lv_memorizedAtInit_10_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2874:1: (lv_memorizedAtInit_10_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2874:1: (lv_memorizedAtInit_10_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2875:3: lv_memorizedAtInit_10_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getMemorizedAtInitBooleanParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleAttribute5191);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2891:2: ( (lv_changeEvent_11_0= ruleFireEvents ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2892:1: (lv_changeEvent_11_0= ruleFireEvents )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2892:1: (lv_changeEvent_11_0= ruleFireEvents )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2893:3: lv_changeEvent_11_0= ruleFireEvents
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getChangeEventFireEventsParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_ruleFireEvents_in_ruleAttribute5212);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2909:2: ( (lv_archiveEvent_12_0= ruleFireEvents ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2910:1: (lv_archiveEvent_12_0= ruleFireEvents )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2910:1: (lv_archiveEvent_12_0= ruleFireEvents )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2911:3: lv_archiveEvent_12_0= ruleFireEvents
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getArchiveEventFireEventsParserRuleCall_12_0()); 
            	    
            pushFollow(FOLLOW_ruleFireEvents_in_ruleAttribute5233);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2927:2: ( (lv_dataReadyEvent_13_0= ruleFireEvents ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2928:1: (lv_dataReadyEvent_13_0= ruleFireEvents )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2928:1: (lv_dataReadyEvent_13_0= ruleFireEvents )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2929:3: lv_dataReadyEvent_13_0= ruleFireEvents
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getDataReadyEventFireEventsParserRuleCall_13_0()); 
            	    
            pushFollow(FOLLOW_ruleFireEvents_in_ruleAttribute5254);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2945:2: ( (lv_status_14_0= ruleInheritanceStatus ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2946:1: (lv_status_14_0= ruleInheritanceStatus )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2946:1: (lv_status_14_0= ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2947:3: lv_status_14_0= ruleInheritanceStatus
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getStatusInheritanceStatusParserRuleCall_14_0()); 
            	    
            pushFollow(FOLLOW_ruleInheritanceStatus_in_ruleAttribute5275);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2963:2: ( (lv_properties_15_0= ruleAttrProperties ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2964:1: (lv_properties_15_0= ruleAttrProperties )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2964:1: (lv_properties_15_0= ruleAttrProperties )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2965:3: lv_properties_15_0= ruleAttrProperties
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getPropertiesAttrPropertiesParserRuleCall_15_0()); 
            	    
            pushFollow(FOLLOW_ruleAttrProperties_in_ruleAttribute5296);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2981:2: ( (lv_allocReadMember_16_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2982:1: (lv_allocReadMember_16_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2982:1: (lv_allocReadMember_16_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2983:3: lv_allocReadMember_16_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getAllocReadMemberBooleanParserRuleCall_16_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleAttribute5317);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2999:2: ( (lv_isDynamic_17_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3000:1: (lv_isDynamic_17_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3000:1: (lv_isDynamic_17_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3001:3: lv_isDynamic_17_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getIsDynamicBooleanParserRuleCall_17_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleAttribute5338);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3017:2: ( (lv_eventCriteria_18_0= ruleEventCriteria ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3018:1: (lv_eventCriteria_18_0= ruleEventCriteria )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3018:1: (lv_eventCriteria_18_0= ruleEventCriteria )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3019:3: lv_eventCriteria_18_0= ruleEventCriteria
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getEventCriteriaEventCriteriaParserRuleCall_18_0()); 
            	    
            pushFollow(FOLLOW_ruleEventCriteria_in_ruleAttribute5359);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3035:2: ( (lv_evArchiveCriteria_19_0= ruleEventCriteria ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3036:1: (lv_evArchiveCriteria_19_0= ruleEventCriteria )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3036:1: (lv_evArchiveCriteria_19_0= ruleEventCriteria )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3037:3: lv_evArchiveCriteria_19_0= ruleEventCriteria
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getEvArchiveCriteriaEventCriteriaParserRuleCall_19_0()); 
            	    
            pushFollow(FOLLOW_ruleEventCriteria_in_ruleAttribute5380);
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

            otherlv_20=(Token)match(input,50,FOLLOW_50_in_ruleAttribute5392); 

                	newLeafNode(otherlv_20, grammarAccess.getAttributeAccess().getEnumLabelsKeyword_20());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3057:1: ( (lv_enumLabels_21_0= RULE_STRING ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_STRING) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3058:1: (lv_enumLabels_21_0= RULE_STRING )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3058:1: (lv_enumLabels_21_0= RULE_STRING )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3059:3: lv_enumLabels_21_0= RULE_STRING
            	    {
            	    lv_enumLabels_21_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute5409); 

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
            	    break loop29;
                }
            } while (true);

            otherlv_22=(Token)match(input,51,FOLLOW_51_in_ruleAttribute5427); 

                	newLeafNode(otherlv_22, grammarAccess.getAttributeAccess().getReadExcludedStatesKeyword_22());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3079:1: ( (lv_readExcludedStates_23_0= RULE_STRING ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_STRING) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3080:1: (lv_readExcludedStates_23_0= RULE_STRING )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3080:1: (lv_readExcludedStates_23_0= RULE_STRING )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3081:3: lv_readExcludedStates_23_0= RULE_STRING
            	    {
            	    lv_readExcludedStates_23_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute5444); 

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
            	    break loop30;
                }
            } while (true);

            otherlv_24=(Token)match(input,52,FOLLOW_52_in_ruleAttribute5462); 

                	newLeafNode(otherlv_24, grammarAccess.getAttributeAccess().getWriteExcludedStatesKeyword_24());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3101:1: ( (lv_writeExcludedStates_25_0= RULE_STRING ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_STRING) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3102:1: (lv_writeExcludedStates_25_0= RULE_STRING )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3102:1: (lv_writeExcludedStates_25_0= RULE_STRING )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3103:3: lv_writeExcludedStates_25_0= RULE_STRING
            	    {
            	    lv_writeExcludedStates_25_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute5479); 

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
            	    break loop31;
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


    // $ANTLR start "entryRuleForwardedAttribute"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3127:1: entryRuleForwardedAttribute returns [EObject current=null] : iv_ruleForwardedAttribute= ruleForwardedAttribute EOF ;
    public final EObject entryRuleForwardedAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForwardedAttribute = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3128:2: (iv_ruleForwardedAttribute= ruleForwardedAttribute EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3129:2: iv_ruleForwardedAttribute= ruleForwardedAttribute EOF
            {
             newCompositeNode(grammarAccess.getForwardedAttributeRule()); 
            pushFollow(FOLLOW_ruleForwardedAttribute_in_entryRuleForwardedAttribute5521);
            iv_ruleForwardedAttribute=ruleForwardedAttribute();

            state._fsp--;

             current =iv_ruleForwardedAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForwardedAttribute5531); 

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
    // $ANTLR end "entryRuleForwardedAttribute"


    // $ANTLR start "ruleForwardedAttribute"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3136:1: ruleForwardedAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_label_1_0= RULE_STRING ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) ) ;
    public final EObject ruleForwardedAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_label_1_0=null;
        EObject lv_status_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3139:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_label_1_0= RULE_STRING ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3140:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_label_1_0= RULE_STRING ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3140:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_label_1_0= RULE_STRING ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3140:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_label_1_0= RULE_STRING ) ) ( (lv_status_2_0= ruleInheritanceStatus ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3140:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3141:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3141:1: (lv_name_0_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3142:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForwardedAttribute5573); 

            			newLeafNode(lv_name_0_0, grammarAccess.getForwardedAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getForwardedAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3158:2: ( (lv_label_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3159:1: (lv_label_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3159:1: (lv_label_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3160:3: lv_label_1_0= RULE_STRING
            {
            lv_label_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleForwardedAttribute5595); 

            			newLeafNode(lv_label_1_0, grammarAccess.getForwardedAttributeAccess().getLabelSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getForwardedAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3176:2: ( (lv_status_2_0= ruleInheritanceStatus ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3177:1: (lv_status_2_0= ruleInheritanceStatus )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3177:1: (lv_status_2_0= ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3178:3: lv_status_2_0= ruleInheritanceStatus
            {
             
            	        newCompositeNode(grammarAccess.getForwardedAttributeAccess().getStatusInheritanceStatusParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleInheritanceStatus_in_ruleForwardedAttribute5621);
            lv_status_2_0=ruleInheritanceStatus();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForwardedAttributeRule());
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
    // $ANTLR end "ruleForwardedAttribute"


    // $ANTLR start "entryRuleFireEvents"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3202:1: entryRuleFireEvents returns [EObject current=null] : iv_ruleFireEvents= ruleFireEvents EOF ;
    public final EObject entryRuleFireEvents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFireEvents = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3203:2: (iv_ruleFireEvents= ruleFireEvents EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3204:2: iv_ruleFireEvents= ruleFireEvents EOF
            {
             newCompositeNode(grammarAccess.getFireEventsRule()); 
            pushFollow(FOLLOW_ruleFireEvents_in_entryRuleFireEvents5657);
            iv_ruleFireEvents=ruleFireEvents();

            state._fsp--;

             current =iv_ruleFireEvents; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFireEvents5667); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3211:1: ruleFireEvents returns [EObject current=null] : ( ( (lv_fire_0_0= ruleBoolean ) ) ( (lv_libCheckCriteria_1_0= ruleBoolean ) ) ) ;
    public final EObject ruleFireEvents() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_fire_0_0 = null;

        AntlrDatatypeRuleToken lv_libCheckCriteria_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3214:28: ( ( ( (lv_fire_0_0= ruleBoolean ) ) ( (lv_libCheckCriteria_1_0= ruleBoolean ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3215:1: ( ( (lv_fire_0_0= ruleBoolean ) ) ( (lv_libCheckCriteria_1_0= ruleBoolean ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3215:1: ( ( (lv_fire_0_0= ruleBoolean ) ) ( (lv_libCheckCriteria_1_0= ruleBoolean ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3215:2: ( (lv_fire_0_0= ruleBoolean ) ) ( (lv_libCheckCriteria_1_0= ruleBoolean ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3215:2: ( (lv_fire_0_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3216:1: (lv_fire_0_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3216:1: (lv_fire_0_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3217:3: lv_fire_0_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getFireEventsAccess().getFireBooleanParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleFireEvents5713);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3233:2: ( (lv_libCheckCriteria_1_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3234:1: (lv_libCheckCriteria_1_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3234:1: (lv_libCheckCriteria_1_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3235:3: lv_libCheckCriteria_1_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getFireEventsAccess().getLibCheckCriteriaBooleanParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleFireEvents5734);
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3259:1: entryRuleEventCriteria returns [EObject current=null] : iv_ruleEventCriteria= ruleEventCriteria EOF ;
    public final EObject entryRuleEventCriteria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventCriteria = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3260:2: (iv_ruleEventCriteria= ruleEventCriteria EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3261:2: iv_ruleEventCriteria= ruleEventCriteria EOF
            {
             newCompositeNode(grammarAccess.getEventCriteriaRule()); 
            pushFollow(FOLLOW_ruleEventCriteria_in_entryRuleEventCriteria5770);
            iv_ruleEventCriteria=ruleEventCriteria();

            state._fsp--;

             current =iv_ruleEventCriteria; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventCriteria5780); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3268:1: ruleEventCriteria returns [EObject current=null] : ( ( (lv_relChange_0_0= RULE_STRING ) ) ( (lv_absChange_1_0= RULE_STRING ) ) ( (lv_period_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEventCriteria() throws RecognitionException {
        EObject current = null;

        Token lv_relChange_0_0=null;
        Token lv_absChange_1_0=null;
        Token lv_period_2_0=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3271:28: ( ( ( (lv_relChange_0_0= RULE_STRING ) ) ( (lv_absChange_1_0= RULE_STRING ) ) ( (lv_period_2_0= RULE_STRING ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3272:1: ( ( (lv_relChange_0_0= RULE_STRING ) ) ( (lv_absChange_1_0= RULE_STRING ) ) ( (lv_period_2_0= RULE_STRING ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3272:1: ( ( (lv_relChange_0_0= RULE_STRING ) ) ( (lv_absChange_1_0= RULE_STRING ) ) ( (lv_period_2_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3272:2: ( (lv_relChange_0_0= RULE_STRING ) ) ( (lv_absChange_1_0= RULE_STRING ) ) ( (lv_period_2_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3272:2: ( (lv_relChange_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3273:1: (lv_relChange_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3273:1: (lv_relChange_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3274:3: lv_relChange_0_0= RULE_STRING
            {
            lv_relChange_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEventCriteria5822); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3290:2: ( (lv_absChange_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3291:1: (lv_absChange_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3291:1: (lv_absChange_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3292:3: lv_absChange_1_0= RULE_STRING
            {
            lv_absChange_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEventCriteria5844); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3308:2: ( (lv_period_2_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3309:1: (lv_period_2_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3309:1: (lv_period_2_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3310:3: lv_period_2_0= RULE_STRING
            {
            lv_period_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEventCriteria5866); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3334:1: entryRuleAttrProperties returns [EObject current=null] : iv_ruleAttrProperties= ruleAttrProperties EOF ;
    public final EObject entryRuleAttrProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrProperties = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3335:2: (iv_ruleAttrProperties= ruleAttrProperties EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3336:2: iv_ruleAttrProperties= ruleAttrProperties EOF
            {
             newCompositeNode(grammarAccess.getAttrPropertiesRule()); 
            pushFollow(FOLLOW_ruleAttrProperties_in_entryRuleAttrProperties5907);
            iv_ruleAttrProperties=ruleAttrProperties();

            state._fsp--;

             current =iv_ruleAttrProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrProperties5917); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3343:1: ruleAttrProperties returns [EObject current=null] : ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_label_1_0= RULE_STRING ) ) ( (lv_unit_2_0= RULE_STRING ) ) ( (lv_standardUnit_3_0= RULE_STRING ) ) ( (lv_displayUnit_4_0= RULE_STRING ) ) ( (lv_format_5_0= RULE_STRING ) ) ( (lv_maxValue_6_0= RULE_STRING ) ) ( (lv_minValue_7_0= RULE_STRING ) ) ( (lv_maxAlarm_8_0= RULE_STRING ) ) ( (lv_minAlarm_9_0= RULE_STRING ) ) ( (lv_maxWarning_10_0= RULE_STRING ) ) ( (lv_minWarning_11_0= RULE_STRING ) ) ( (lv_deltaTime_12_0= RULE_STRING ) ) ( (lv_deltaValue_13_0= RULE_STRING ) ) ) ;
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
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3346:28: ( ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_label_1_0= RULE_STRING ) ) ( (lv_unit_2_0= RULE_STRING ) ) ( (lv_standardUnit_3_0= RULE_STRING ) ) ( (lv_displayUnit_4_0= RULE_STRING ) ) ( (lv_format_5_0= RULE_STRING ) ) ( (lv_maxValue_6_0= RULE_STRING ) ) ( (lv_minValue_7_0= RULE_STRING ) ) ( (lv_maxAlarm_8_0= RULE_STRING ) ) ( (lv_minAlarm_9_0= RULE_STRING ) ) ( (lv_maxWarning_10_0= RULE_STRING ) ) ( (lv_minWarning_11_0= RULE_STRING ) ) ( (lv_deltaTime_12_0= RULE_STRING ) ) ( (lv_deltaValue_13_0= RULE_STRING ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3347:1: ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_label_1_0= RULE_STRING ) ) ( (lv_unit_2_0= RULE_STRING ) ) ( (lv_standardUnit_3_0= RULE_STRING ) ) ( (lv_displayUnit_4_0= RULE_STRING ) ) ( (lv_format_5_0= RULE_STRING ) ) ( (lv_maxValue_6_0= RULE_STRING ) ) ( (lv_minValue_7_0= RULE_STRING ) ) ( (lv_maxAlarm_8_0= RULE_STRING ) ) ( (lv_minAlarm_9_0= RULE_STRING ) ) ( (lv_maxWarning_10_0= RULE_STRING ) ) ( (lv_minWarning_11_0= RULE_STRING ) ) ( (lv_deltaTime_12_0= RULE_STRING ) ) ( (lv_deltaValue_13_0= RULE_STRING ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3347:1: ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_label_1_0= RULE_STRING ) ) ( (lv_unit_2_0= RULE_STRING ) ) ( (lv_standardUnit_3_0= RULE_STRING ) ) ( (lv_displayUnit_4_0= RULE_STRING ) ) ( (lv_format_5_0= RULE_STRING ) ) ( (lv_maxValue_6_0= RULE_STRING ) ) ( (lv_minValue_7_0= RULE_STRING ) ) ( (lv_maxAlarm_8_0= RULE_STRING ) ) ( (lv_minAlarm_9_0= RULE_STRING ) ) ( (lv_maxWarning_10_0= RULE_STRING ) ) ( (lv_minWarning_11_0= RULE_STRING ) ) ( (lv_deltaTime_12_0= RULE_STRING ) ) ( (lv_deltaValue_13_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3347:2: ( (lv_description_0_0= RULE_STRING ) ) ( (lv_label_1_0= RULE_STRING ) ) ( (lv_unit_2_0= RULE_STRING ) ) ( (lv_standardUnit_3_0= RULE_STRING ) ) ( (lv_displayUnit_4_0= RULE_STRING ) ) ( (lv_format_5_0= RULE_STRING ) ) ( (lv_maxValue_6_0= RULE_STRING ) ) ( (lv_minValue_7_0= RULE_STRING ) ) ( (lv_maxAlarm_8_0= RULE_STRING ) ) ( (lv_minAlarm_9_0= RULE_STRING ) ) ( (lv_maxWarning_10_0= RULE_STRING ) ) ( (lv_minWarning_11_0= RULE_STRING ) ) ( (lv_deltaTime_12_0= RULE_STRING ) ) ( (lv_deltaValue_13_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3347:2: ( (lv_description_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3348:1: (lv_description_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3348:1: (lv_description_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3349:3: lv_description_0_0= RULE_STRING
            {
            lv_description_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5959); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3365:2: ( (lv_label_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3366:1: (lv_label_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3366:1: (lv_label_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3367:3: lv_label_1_0= RULE_STRING
            {
            lv_label_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5981); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3383:2: ( (lv_unit_2_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3384:1: (lv_unit_2_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3384:1: (lv_unit_2_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3385:3: lv_unit_2_0= RULE_STRING
            {
            lv_unit_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6003); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3401:2: ( (lv_standardUnit_3_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3402:1: (lv_standardUnit_3_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3402:1: (lv_standardUnit_3_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3403:3: lv_standardUnit_3_0= RULE_STRING
            {
            lv_standardUnit_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6025); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3419:2: ( (lv_displayUnit_4_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3420:1: (lv_displayUnit_4_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3420:1: (lv_displayUnit_4_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3421:3: lv_displayUnit_4_0= RULE_STRING
            {
            lv_displayUnit_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6047); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3437:2: ( (lv_format_5_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3438:1: (lv_format_5_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3438:1: (lv_format_5_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3439:3: lv_format_5_0= RULE_STRING
            {
            lv_format_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6069); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3455:2: ( (lv_maxValue_6_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3456:1: (lv_maxValue_6_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3456:1: (lv_maxValue_6_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3457:3: lv_maxValue_6_0= RULE_STRING
            {
            lv_maxValue_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6091); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3473:2: ( (lv_minValue_7_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3474:1: (lv_minValue_7_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3474:1: (lv_minValue_7_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3475:3: lv_minValue_7_0= RULE_STRING
            {
            lv_minValue_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6113); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3491:2: ( (lv_maxAlarm_8_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3492:1: (lv_maxAlarm_8_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3492:1: (lv_maxAlarm_8_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3493:3: lv_maxAlarm_8_0= RULE_STRING
            {
            lv_maxAlarm_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6135); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3509:2: ( (lv_minAlarm_9_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3510:1: (lv_minAlarm_9_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3510:1: (lv_minAlarm_9_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3511:3: lv_minAlarm_9_0= RULE_STRING
            {
            lv_minAlarm_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6157); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3527:2: ( (lv_maxWarning_10_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3528:1: (lv_maxWarning_10_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3528:1: (lv_maxWarning_10_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3529:3: lv_maxWarning_10_0= RULE_STRING
            {
            lv_maxWarning_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6179); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3545:2: ( (lv_minWarning_11_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3546:1: (lv_minWarning_11_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3546:1: (lv_minWarning_11_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3547:3: lv_minWarning_11_0= RULE_STRING
            {
            lv_minWarning_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6201); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3563:2: ( (lv_deltaTime_12_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3564:1: (lv_deltaTime_12_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3564:1: (lv_deltaTime_12_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3565:3: lv_deltaTime_12_0= RULE_STRING
            {
            lv_deltaTime_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6223); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3581:2: ( (lv_deltaValue_13_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3582:1: (lv_deltaValue_13_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3582:1: (lv_deltaValue_13_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3583:3: lv_deltaValue_13_0= RULE_STRING
            {
            lv_deltaValue_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6245); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3607:1: entryRuleAdditionalFile returns [EObject current=null] : iv_ruleAdditionalFile= ruleAdditionalFile EOF ;
    public final EObject entryRuleAdditionalFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionalFile = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3608:2: (iv_ruleAdditionalFile= ruleAdditionalFile EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3609:2: iv_ruleAdditionalFile= ruleAdditionalFile EOF
            {
             newCompositeNode(grammarAccess.getAdditionalFileRule()); 
            pushFollow(FOLLOW_ruleAdditionalFile_in_entryRuleAdditionalFile6286);
            iv_ruleAdditionalFile=ruleAdditionalFile();

            state._fsp--;

             current =iv_ruleAdditionalFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionalFile6296); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3616:1: ruleAdditionalFile returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_path_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAdditionalFile() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_path_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3619:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_path_1_0= RULE_STRING ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3620:1: ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_path_1_0= RULE_STRING ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3620:1: ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_path_1_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3620:2: ( (lv_name_0_0= RULE_STRING ) ) ( (lv_path_1_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3620:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3621:1: (lv_name_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3621:1: (lv_name_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3622:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAdditionalFile6338); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3638:2: ( (lv_path_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3639:1: (lv_path_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3639:1: (lv_path_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3640:3: lv_path_1_0= RULE_STRING
            {
            lv_path_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAdditionalFile6360); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3664:1: entryRuleOverlodedPollPeriodObject returns [EObject current=null] : iv_ruleOverlodedPollPeriodObject= ruleOverlodedPollPeriodObject EOF ;
    public final EObject entryRuleOverlodedPollPeriodObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverlodedPollPeriodObject = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3665:2: (iv_ruleOverlodedPollPeriodObject= ruleOverlodedPollPeriodObject EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3666:2: iv_ruleOverlodedPollPeriodObject= ruleOverlodedPollPeriodObject EOF
            {
             newCompositeNode(grammarAccess.getOverlodedPollPeriodObjectRule()); 
            pushFollow(FOLLOW_ruleOverlodedPollPeriodObject_in_entryRuleOverlodedPollPeriodObject6401);
            iv_ruleOverlodedPollPeriodObject=ruleOverlodedPollPeriodObject();

            state._fsp--;

             current =iv_ruleOverlodedPollPeriodObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverlodedPollPeriodObject6411); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3673:1: ruleOverlodedPollPeriodObject returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_type_1_0= RULE_STRING ) ) ( (lv_pollPeriod_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleOverlodedPollPeriodObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_type_1_0=null;
        Token lv_pollPeriod_2_0=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3676:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_type_1_0= RULE_STRING ) ) ( (lv_pollPeriod_2_0= RULE_STRING ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3677:1: ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_type_1_0= RULE_STRING ) ) ( (lv_pollPeriod_2_0= RULE_STRING ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3677:1: ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_type_1_0= RULE_STRING ) ) ( (lv_pollPeriod_2_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3677:2: ( (lv_name_0_0= RULE_STRING ) ) ( (lv_type_1_0= RULE_STRING ) ) ( (lv_pollPeriod_2_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3677:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3678:1: (lv_name_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3678:1: (lv_name_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3679:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOverlodedPollPeriodObject6453); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3695:2: ( (lv_type_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3696:1: (lv_type_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3696:1: (lv_type_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3697:3: lv_type_1_0= RULE_STRING
            {
            lv_type_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOverlodedPollPeriodObject6475); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3713:2: ( (lv_pollPeriod_2_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3714:1: (lv_pollPeriod_2_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3714:1: (lv_pollPeriod_2_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3715:3: lv_pollPeriod_2_0= RULE_STRING
            {
            lv_pollPeriod_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOverlodedPollPeriodObject6497); 

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


    // $ANTLR start "entryRulePipe"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3739:1: entryRulePipe returns [EObject current=null] : iv_rulePipe= rulePipe EOF ;
    public final EObject entryRulePipe() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePipe = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3740:2: (iv_rulePipe= rulePipe EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3741:2: iv_rulePipe= rulePipe EOF
            {
             newCompositeNode(grammarAccess.getPipeRule()); 
            pushFollow(FOLLOW_rulePipe_in_entryRulePipe6538);
            iv_rulePipe=rulePipe();

            state._fsp--;

             current =iv_rulePipe; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePipe6548); 

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
    // $ANTLR end "entryRulePipe"


    // $ANTLR start "rulePipe"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3748:1: rulePipe returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_label_2_0= RULE_STRING ) ) ( (lv_rwType_3_0= ruleRW_PipeType ) ) ( (lv_displayLevel_4_0= ruleDisplayLevel ) ) otherlv_5= 'readExcludedStates:' ( (lv_readExcludedStates_6_0= RULE_STRING ) )* otherlv_7= 'writeExcludedStates:' ( (lv_writeExcludedStates_8_0= RULE_STRING ) )* ) ;
    public final EObject rulePipe() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_1_0=null;
        Token lv_label_2_0=null;
        Token otherlv_5=null;
        Token lv_readExcludedStates_6_0=null;
        Token otherlv_7=null;
        Token lv_writeExcludedStates_8_0=null;
        AntlrDatatypeRuleToken lv_rwType_3_0 = null;

        AntlrDatatypeRuleToken lv_displayLevel_4_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3751:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_label_2_0= RULE_STRING ) ) ( (lv_rwType_3_0= ruleRW_PipeType ) ) ( (lv_displayLevel_4_0= ruleDisplayLevel ) ) otherlv_5= 'readExcludedStates:' ( (lv_readExcludedStates_6_0= RULE_STRING ) )* otherlv_7= 'writeExcludedStates:' ( (lv_writeExcludedStates_8_0= RULE_STRING ) )* ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3752:1: ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_label_2_0= RULE_STRING ) ) ( (lv_rwType_3_0= ruleRW_PipeType ) ) ( (lv_displayLevel_4_0= ruleDisplayLevel ) ) otherlv_5= 'readExcludedStates:' ( (lv_readExcludedStates_6_0= RULE_STRING ) )* otherlv_7= 'writeExcludedStates:' ( (lv_writeExcludedStates_8_0= RULE_STRING ) )* )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3752:1: ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_label_2_0= RULE_STRING ) ) ( (lv_rwType_3_0= ruleRW_PipeType ) ) ( (lv_displayLevel_4_0= ruleDisplayLevel ) ) otherlv_5= 'readExcludedStates:' ( (lv_readExcludedStates_6_0= RULE_STRING ) )* otherlv_7= 'writeExcludedStates:' ( (lv_writeExcludedStates_8_0= RULE_STRING ) )* )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3752:2: ( (lv_name_0_0= RULE_STRING ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_label_2_0= RULE_STRING ) ) ( (lv_rwType_3_0= ruleRW_PipeType ) ) ( (lv_displayLevel_4_0= ruleDisplayLevel ) ) otherlv_5= 'readExcludedStates:' ( (lv_readExcludedStates_6_0= RULE_STRING ) )* otherlv_7= 'writeExcludedStates:' ( (lv_writeExcludedStates_8_0= RULE_STRING ) )*
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3752:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3753:1: (lv_name_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3753:1: (lv_name_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3754:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePipe6590); 

            			newLeafNode(lv_name_0_0, grammarAccess.getPipeAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPipeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3770:2: ( (lv_description_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3771:1: (lv_description_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3771:1: (lv_description_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3772:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePipe6612); 

            			newLeafNode(lv_description_1_0, grammarAccess.getPipeAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPipeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3788:2: ( (lv_label_2_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3789:1: (lv_label_2_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3789:1: (lv_label_2_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3790:3: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePipe6634); 

            			newLeafNode(lv_label_2_0, grammarAccess.getPipeAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPipeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3806:2: ( (lv_rwType_3_0= ruleRW_PipeType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3807:1: (lv_rwType_3_0= ruleRW_PipeType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3807:1: (lv_rwType_3_0= ruleRW_PipeType )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3808:3: lv_rwType_3_0= ruleRW_PipeType
            {
             
            	        newCompositeNode(grammarAccess.getPipeAccess().getRwTypeRW_PipeTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleRW_PipeType_in_rulePipe6660);
            lv_rwType_3_0=ruleRW_PipeType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPipeRule());
            	        }
                   		set(
                   			current, 
                   			"rwType",
                    		lv_rwType_3_0, 
                    		"RW_PipeType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3824:2: ( (lv_displayLevel_4_0= ruleDisplayLevel ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3825:1: (lv_displayLevel_4_0= ruleDisplayLevel )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3825:1: (lv_displayLevel_4_0= ruleDisplayLevel )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3826:3: lv_displayLevel_4_0= ruleDisplayLevel
            {
             
            	        newCompositeNode(grammarAccess.getPipeAccess().getDisplayLevelDisplayLevelParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleDisplayLevel_in_rulePipe6681);
            lv_displayLevel_4_0=ruleDisplayLevel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPipeRule());
            	        }
                   		set(
                   			current, 
                   			"displayLevel",
                    		lv_displayLevel_4_0, 
                    		"DisplayLevel");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,51,FOLLOW_51_in_rulePipe6693); 

                	newLeafNode(otherlv_5, grammarAccess.getPipeAccess().getReadExcludedStatesKeyword_5());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3846:1: ( (lv_readExcludedStates_6_0= RULE_STRING ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_STRING) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3847:1: (lv_readExcludedStates_6_0= RULE_STRING )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3847:1: (lv_readExcludedStates_6_0= RULE_STRING )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3848:3: lv_readExcludedStates_6_0= RULE_STRING
            	    {
            	    lv_readExcludedStates_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePipe6710); 

            	    			newLeafNode(lv_readExcludedStates_6_0, grammarAccess.getPipeAccess().getReadExcludedStatesSTRINGTerminalRuleCall_6_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPipeRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"readExcludedStates",
            	            		lv_readExcludedStates_6_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_7=(Token)match(input,52,FOLLOW_52_in_rulePipe6728); 

                	newLeafNode(otherlv_7, grammarAccess.getPipeAccess().getWriteExcludedStatesKeyword_7());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3868:1: ( (lv_writeExcludedStates_8_0= RULE_STRING ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_STRING) ) {
                    int LA33_2 = input.LA(2);

                    if ( (LA33_2==RULE_STRING) ) {
                        int LA33_3 = input.LA(3);

                        if ( (LA33_3==RULE_STRING) ) {
                            int LA33_5 = input.LA(4);

                            if ( (LA33_5==EOF||LA33_5==RULE_STRING||LA33_5==31) ) {
                                alt33=1;
                            }


                        }
                        else if ( (LA33_3==EOF||LA33_3==31) ) {
                            alt33=1;
                        }


                    }
                    else if ( (LA33_2==EOF||LA33_2==31) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3869:1: (lv_writeExcludedStates_8_0= RULE_STRING )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3869:1: (lv_writeExcludedStates_8_0= RULE_STRING )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3870:3: lv_writeExcludedStates_8_0= RULE_STRING
            	    {
            	    lv_writeExcludedStates_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePipe6745); 

            	    			newLeafNode(lv_writeExcludedStates_8_0, grammarAccess.getPipeAccess().getWriteExcludedStatesSTRINGTerminalRuleCall_8_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPipeRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"writeExcludedStates",
            	            		lv_writeExcludedStates_8_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // $ANTLR end "rulePipe"


    // $ANTLR start "entryRuleRW_PipeType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3894:1: entryRuleRW_PipeType returns [String current=null] : iv_ruleRW_PipeType= ruleRW_PipeType EOF ;
    public final String entryRuleRW_PipeType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRW_PipeType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3895:2: (iv_ruleRW_PipeType= ruleRW_PipeType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3896:2: iv_ruleRW_PipeType= ruleRW_PipeType EOF
            {
             newCompositeNode(grammarAccess.getRW_PipeTypeRule()); 
            pushFollow(FOLLOW_ruleRW_PipeType_in_entryRuleRW_PipeType6788);
            iv_ruleRW_PipeType=ruleRW_PipeType();

            state._fsp--;

             current =iv_ruleRW_PipeType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRW_PipeType6799); 

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
    // $ANTLR end "entryRuleRW_PipeType"


    // $ANTLR start "ruleRW_PipeType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3903:1: ruleRW_PipeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'READ' | kw= 'READ_WRITE' ) ;
    public final AntlrDatatypeRuleToken ruleRW_PipeType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3906:28: ( (kw= 'READ' | kw= 'READ_WRITE' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3907:1: (kw= 'READ' | kw= 'READ_WRITE' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3907:1: (kw= 'READ' | kw= 'READ_WRITE' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==41) ) {
                alt34=1;
            }
            else if ( (LA34_0==43) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3908:2: kw= 'READ'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleRW_PipeType6837); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRW_PipeTypeAccess().getREADKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3915:2: kw= 'READ_WRITE'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleRW_PipeType6856); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRW_PipeTypeAccess().getREAD_WRITEKeyword_1()); 
                        

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
    // $ANTLR end "ruleRW_PipeType"


    // $ANTLR start "entryRuleType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3928:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3929:2: (iv_ruleType= ruleType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3930:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType6896);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType6906); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3937:1: ruleType returns [EObject current=null] : (this_VoidType_0= ruleVoidType | this_BooleanType_1= ruleBooleanType | this_ShortType_2= ruleShortType | this_UShortType_3= ruleUShortType | this_IntType_4= ruleIntType | this_UIntType_5= ruleUIntType | this_FloatType_6= ruleFloatType | this_DoubleType_7= ruleDoubleType | this_StringType_8= ruleStringType | this_CharArrayType_9= ruleCharArrayType | this_ShortArrayType_10= ruleShortArrayType | this_UShortArrayType_11= ruleUShortArrayType | this_IntArrayType_12= ruleIntArrayType | this_UIntArrayType_13= ruleUIntArrayType | this_FloatArrayType_14= ruleFloatArrayType | this_DoubleArrayType_15= ruleDoubleArrayType | this_StringArrayType_16= ruleStringArrayType | this_LongStringArrayType_17= ruleLongStringArrayType | this_DoubleStringArrayType_18= ruleDoubleStringArrayType | this_StateType_19= ruleStateType | this_ConstStringType_20= ruleConstStringType | this_BooleanArrayType_21= ruleBooleanArrayType | this_LongType_22= ruleLongType | this_ULongType_23= ruleULongType | this_UCharType_24= ruleUCharType | this_LongArrayType_25= ruleLongArrayType | this_ULongArrayType_26= ruleULongArrayType | this_DevIntType_27= ruleDevIntType | this_EncodedType_28= ruleEncodedType | this_EnumType_29= ruleEnumType ) ;
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
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3940:28: ( (this_VoidType_0= ruleVoidType | this_BooleanType_1= ruleBooleanType | this_ShortType_2= ruleShortType | this_UShortType_3= ruleUShortType | this_IntType_4= ruleIntType | this_UIntType_5= ruleUIntType | this_FloatType_6= ruleFloatType | this_DoubleType_7= ruleDoubleType | this_StringType_8= ruleStringType | this_CharArrayType_9= ruleCharArrayType | this_ShortArrayType_10= ruleShortArrayType | this_UShortArrayType_11= ruleUShortArrayType | this_IntArrayType_12= ruleIntArrayType | this_UIntArrayType_13= ruleUIntArrayType | this_FloatArrayType_14= ruleFloatArrayType | this_DoubleArrayType_15= ruleDoubleArrayType | this_StringArrayType_16= ruleStringArrayType | this_LongStringArrayType_17= ruleLongStringArrayType | this_DoubleStringArrayType_18= ruleDoubleStringArrayType | this_StateType_19= ruleStateType | this_ConstStringType_20= ruleConstStringType | this_BooleanArrayType_21= ruleBooleanArrayType | this_LongType_22= ruleLongType | this_ULongType_23= ruleULongType | this_UCharType_24= ruleUCharType | this_LongArrayType_25= ruleLongArrayType | this_ULongArrayType_26= ruleULongArrayType | this_DevIntType_27= ruleDevIntType | this_EncodedType_28= ruleEncodedType | this_EnumType_29= ruleEnumType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3941:1: (this_VoidType_0= ruleVoidType | this_BooleanType_1= ruleBooleanType | this_ShortType_2= ruleShortType | this_UShortType_3= ruleUShortType | this_IntType_4= ruleIntType | this_UIntType_5= ruleUIntType | this_FloatType_6= ruleFloatType | this_DoubleType_7= ruleDoubleType | this_StringType_8= ruleStringType | this_CharArrayType_9= ruleCharArrayType | this_ShortArrayType_10= ruleShortArrayType | this_UShortArrayType_11= ruleUShortArrayType | this_IntArrayType_12= ruleIntArrayType | this_UIntArrayType_13= ruleUIntArrayType | this_FloatArrayType_14= ruleFloatArrayType | this_DoubleArrayType_15= ruleDoubleArrayType | this_StringArrayType_16= ruleStringArrayType | this_LongStringArrayType_17= ruleLongStringArrayType | this_DoubleStringArrayType_18= ruleDoubleStringArrayType | this_StateType_19= ruleStateType | this_ConstStringType_20= ruleConstStringType | this_BooleanArrayType_21= ruleBooleanArrayType | this_LongType_22= ruleLongType | this_ULongType_23= ruleULongType | this_UCharType_24= ruleUCharType | this_LongArrayType_25= ruleLongArrayType | this_ULongArrayType_26= ruleULongArrayType | this_DevIntType_27= ruleDevIntType | this_EncodedType_28= ruleEncodedType | this_EnumType_29= ruleEnumType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3941:1: (this_VoidType_0= ruleVoidType | this_BooleanType_1= ruleBooleanType | this_ShortType_2= ruleShortType | this_UShortType_3= ruleUShortType | this_IntType_4= ruleIntType | this_UIntType_5= ruleUIntType | this_FloatType_6= ruleFloatType | this_DoubleType_7= ruleDoubleType | this_StringType_8= ruleStringType | this_CharArrayType_9= ruleCharArrayType | this_ShortArrayType_10= ruleShortArrayType | this_UShortArrayType_11= ruleUShortArrayType | this_IntArrayType_12= ruleIntArrayType | this_UIntArrayType_13= ruleUIntArrayType | this_FloatArrayType_14= ruleFloatArrayType | this_DoubleArrayType_15= ruleDoubleArrayType | this_StringArrayType_16= ruleStringArrayType | this_LongStringArrayType_17= ruleLongStringArrayType | this_DoubleStringArrayType_18= ruleDoubleStringArrayType | this_StateType_19= ruleStateType | this_ConstStringType_20= ruleConstStringType | this_BooleanArrayType_21= ruleBooleanArrayType | this_LongType_22= ruleLongType | this_ULongType_23= ruleULongType | this_UCharType_24= ruleUCharType | this_LongArrayType_25= ruleLongArrayType | this_ULongArrayType_26= ruleULongArrayType | this_DevIntType_27= ruleDevIntType | this_EncodedType_28= ruleEncodedType | this_EnumType_29= ruleEnumType )
            int alt35=30;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt35=1;
                }
                break;
            case 54:
                {
                alt35=2;
                }
                break;
            case 55:
                {
                alt35=3;
                }
                break;
            case 56:
                {
                alt35=4;
                }
                break;
            case 57:
                {
                alt35=5;
                }
                break;
            case 58:
                {
                alt35=6;
                }
                break;
            case 59:
                {
                alt35=7;
                }
                break;
            case 60:
                {
                alt35=8;
                }
                break;
            case 61:
                {
                alt35=9;
                }
                break;
            case 62:
                {
                alt35=10;
                }
                break;
            case 63:
                {
                alt35=11;
                }
                break;
            case 64:
                {
                alt35=12;
                }
                break;
            case 65:
                {
                alt35=13;
                }
                break;
            case 66:
                {
                alt35=14;
                }
                break;
            case 67:
                {
                alt35=15;
                }
                break;
            case 68:
                {
                alt35=16;
                }
                break;
            case 69:
                {
                alt35=17;
                }
                break;
            case 70:
                {
                alt35=18;
                }
                break;
            case 71:
                {
                alt35=19;
                }
                break;
            case 72:
                {
                alt35=20;
                }
                break;
            case 73:
                {
                alt35=21;
                }
                break;
            case 74:
                {
                alt35=22;
                }
                break;
            case 76:
                {
                alt35=23;
                }
                break;
            case 77:
                {
                alt35=24;
                }
                break;
            case 75:
                {
                alt35=25;
                }
                break;
            case 78:
                {
                alt35=26;
                }
                break;
            case 79:
                {
                alt35=27;
                }
                break;
            case 80:
                {
                alt35=28;
                }
                break;
            case 81:
                {
                alt35=29;
                }
                break;
            case 82:
                {
                alt35=30;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3942:5: this_VoidType_0= ruleVoidType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getVoidTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVoidType_in_ruleType6953);
                    this_VoidType_0=ruleVoidType();

                    state._fsp--;

                     
                            current = this_VoidType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3952:5: this_BooleanType_1= ruleBooleanType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getBooleanTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBooleanType_in_ruleType6980);
                    this_BooleanType_1=ruleBooleanType();

                    state._fsp--;

                     
                            current = this_BooleanType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3962:5: this_ShortType_2= ruleShortType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getShortTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleShortType_in_ruleType7007);
                    this_ShortType_2=ruleShortType();

                    state._fsp--;

                     
                            current = this_ShortType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3972:5: this_UShortType_3= ruleUShortType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getUShortTypeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleUShortType_in_ruleType7034);
                    this_UShortType_3=ruleUShortType();

                    state._fsp--;

                     
                            current = this_UShortType_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3982:5: this_IntType_4= ruleIntType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getIntTypeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleIntType_in_ruleType7061);
                    this_IntType_4=ruleIntType();

                    state._fsp--;

                     
                            current = this_IntType_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3992:5: this_UIntType_5= ruleUIntType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getUIntTypeParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleUIntType_in_ruleType7088);
                    this_UIntType_5=ruleUIntType();

                    state._fsp--;

                     
                            current = this_UIntType_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4002:5: this_FloatType_6= ruleFloatType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getFloatTypeParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleFloatType_in_ruleType7115);
                    this_FloatType_6=ruleFloatType();

                    state._fsp--;

                     
                            current = this_FloatType_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4012:5: this_DoubleType_7= ruleDoubleType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDoubleTypeParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleDoubleType_in_ruleType7142);
                    this_DoubleType_7=ruleDoubleType();

                    state._fsp--;

                     
                            current = this_DoubleType_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4022:5: this_StringType_8= ruleStringType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getStringTypeParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleStringType_in_ruleType7169);
                    this_StringType_8=ruleStringType();

                    state._fsp--;

                     
                            current = this_StringType_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4032:5: this_CharArrayType_9= ruleCharArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getCharArrayTypeParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleCharArrayType_in_ruleType7196);
                    this_CharArrayType_9=ruleCharArrayType();

                    state._fsp--;

                     
                            current = this_CharArrayType_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4042:5: this_ShortArrayType_10= ruleShortArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getShortArrayTypeParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleShortArrayType_in_ruleType7223);
                    this_ShortArrayType_10=ruleShortArrayType();

                    state._fsp--;

                     
                            current = this_ShortArrayType_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4052:5: this_UShortArrayType_11= ruleUShortArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getUShortArrayTypeParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleUShortArrayType_in_ruleType7250);
                    this_UShortArrayType_11=ruleUShortArrayType();

                    state._fsp--;

                     
                            current = this_UShortArrayType_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4062:5: this_IntArrayType_12= ruleIntArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getIntArrayTypeParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleIntArrayType_in_ruleType7277);
                    this_IntArrayType_12=ruleIntArrayType();

                    state._fsp--;

                     
                            current = this_IntArrayType_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4072:5: this_UIntArrayType_13= ruleUIntArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getUIntArrayTypeParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleUIntArrayType_in_ruleType7304);
                    this_UIntArrayType_13=ruleUIntArrayType();

                    state._fsp--;

                     
                            current = this_UIntArrayType_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4082:5: this_FloatArrayType_14= ruleFloatArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getFloatArrayTypeParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_ruleFloatArrayType_in_ruleType7331);
                    this_FloatArrayType_14=ruleFloatArrayType();

                    state._fsp--;

                     
                            current = this_FloatArrayType_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 16 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4092:5: this_DoubleArrayType_15= ruleDoubleArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDoubleArrayTypeParserRuleCall_15()); 
                        
                    pushFollow(FOLLOW_ruleDoubleArrayType_in_ruleType7358);
                    this_DoubleArrayType_15=ruleDoubleArrayType();

                    state._fsp--;

                     
                            current = this_DoubleArrayType_15; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 17 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4102:5: this_StringArrayType_16= ruleStringArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getStringArrayTypeParserRuleCall_16()); 
                        
                    pushFollow(FOLLOW_ruleStringArrayType_in_ruleType7385);
                    this_StringArrayType_16=ruleStringArrayType();

                    state._fsp--;

                     
                            current = this_StringArrayType_16; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 18 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4112:5: this_LongStringArrayType_17= ruleLongStringArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getLongStringArrayTypeParserRuleCall_17()); 
                        
                    pushFollow(FOLLOW_ruleLongStringArrayType_in_ruleType7412);
                    this_LongStringArrayType_17=ruleLongStringArrayType();

                    state._fsp--;

                     
                            current = this_LongStringArrayType_17; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 19 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4122:5: this_DoubleStringArrayType_18= ruleDoubleStringArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDoubleStringArrayTypeParserRuleCall_18()); 
                        
                    pushFollow(FOLLOW_ruleDoubleStringArrayType_in_ruleType7439);
                    this_DoubleStringArrayType_18=ruleDoubleStringArrayType();

                    state._fsp--;

                     
                            current = this_DoubleStringArrayType_18; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 20 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4132:5: this_StateType_19= ruleStateType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getStateTypeParserRuleCall_19()); 
                        
                    pushFollow(FOLLOW_ruleStateType_in_ruleType7466);
                    this_StateType_19=ruleStateType();

                    state._fsp--;

                     
                            current = this_StateType_19; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 21 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4142:5: this_ConstStringType_20= ruleConstStringType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getConstStringTypeParserRuleCall_20()); 
                        
                    pushFollow(FOLLOW_ruleConstStringType_in_ruleType7493);
                    this_ConstStringType_20=ruleConstStringType();

                    state._fsp--;

                     
                            current = this_ConstStringType_20; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 22 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4152:5: this_BooleanArrayType_21= ruleBooleanArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getBooleanArrayTypeParserRuleCall_21()); 
                        
                    pushFollow(FOLLOW_ruleBooleanArrayType_in_ruleType7520);
                    this_BooleanArrayType_21=ruleBooleanArrayType();

                    state._fsp--;

                     
                            current = this_BooleanArrayType_21; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 23 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4162:5: this_LongType_22= ruleLongType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getLongTypeParserRuleCall_22()); 
                        
                    pushFollow(FOLLOW_ruleLongType_in_ruleType7547);
                    this_LongType_22=ruleLongType();

                    state._fsp--;

                     
                            current = this_LongType_22; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 24 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4172:5: this_ULongType_23= ruleULongType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getULongTypeParserRuleCall_23()); 
                        
                    pushFollow(FOLLOW_ruleULongType_in_ruleType7574);
                    this_ULongType_23=ruleULongType();

                    state._fsp--;

                     
                            current = this_ULongType_23; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 25 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4182:5: this_UCharType_24= ruleUCharType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getUCharTypeParserRuleCall_24()); 
                        
                    pushFollow(FOLLOW_ruleUCharType_in_ruleType7601);
                    this_UCharType_24=ruleUCharType();

                    state._fsp--;

                     
                            current = this_UCharType_24; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 26 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4192:5: this_LongArrayType_25= ruleLongArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getLongArrayTypeParserRuleCall_25()); 
                        
                    pushFollow(FOLLOW_ruleLongArrayType_in_ruleType7628);
                    this_LongArrayType_25=ruleLongArrayType();

                    state._fsp--;

                     
                            current = this_LongArrayType_25; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 27 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4202:5: this_ULongArrayType_26= ruleULongArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getULongArrayTypeParserRuleCall_26()); 
                        
                    pushFollow(FOLLOW_ruleULongArrayType_in_ruleType7655);
                    this_ULongArrayType_26=ruleULongArrayType();

                    state._fsp--;

                     
                            current = this_ULongArrayType_26; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 28 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4212:5: this_DevIntType_27= ruleDevIntType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDevIntTypeParserRuleCall_27()); 
                        
                    pushFollow(FOLLOW_ruleDevIntType_in_ruleType7682);
                    this_DevIntType_27=ruleDevIntType();

                    state._fsp--;

                     
                            current = this_DevIntType_27; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 29 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4222:5: this_EncodedType_28= ruleEncodedType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getEncodedTypeParserRuleCall_28()); 
                        
                    pushFollow(FOLLOW_ruleEncodedType_in_ruleType7709);
                    this_EncodedType_28=ruleEncodedType();

                    state._fsp--;

                     
                            current = this_EncodedType_28; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 30 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4232:5: this_EnumType_29= ruleEnumType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getEnumTypeParserRuleCall_29()); 
                        
                    pushFollow(FOLLOW_ruleEnumType_in_ruleType7736);
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4248:1: entryRuleVoidType returns [EObject current=null] : iv_ruleVoidType= ruleVoidType EOF ;
    public final EObject entryRuleVoidType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoidType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4249:2: (iv_ruleVoidType= ruleVoidType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4250:2: iv_ruleVoidType= ruleVoidType EOF
            {
             newCompositeNode(grammarAccess.getVoidTypeRule()); 
            pushFollow(FOLLOW_ruleVoidType_in_entryRuleVoidType7771);
            iv_ruleVoidType=ruleVoidType();

            state._fsp--;

             current =iv_ruleVoidType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVoidType7781); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4257:1: ruleVoidType returns [EObject current=null] : ( () otherlv_1= 'void' ) ;
    public final EObject ruleVoidType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4260:28: ( ( () otherlv_1= 'void' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4261:1: ( () otherlv_1= 'void' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4261:1: ( () otherlv_1= 'void' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4261:2: () otherlv_1= 'void'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4261:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4262:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVoidTypeAccess().getVoidTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleVoidType7827); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4279:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4280:2: (iv_ruleBooleanType= ruleBooleanType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4281:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
             newCompositeNode(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanType_in_entryRuleBooleanType7863);
            iv_ruleBooleanType=ruleBooleanType();

            state._fsp--;

             current =iv_ruleBooleanType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanType7873); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4288:1: ruleBooleanType returns [EObject current=null] : ( () otherlv_1= 'boolean' ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4291:28: ( ( () otherlv_1= 'boolean' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4292:1: ( () otherlv_1= 'boolean' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4292:1: ( () otherlv_1= 'boolean' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4292:2: () otherlv_1= 'boolean'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4292:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4293:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleBooleanType7919); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4310:1: entryRuleShortType returns [EObject current=null] : iv_ruleShortType= ruleShortType EOF ;
    public final EObject entryRuleShortType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4311:2: (iv_ruleShortType= ruleShortType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4312:2: iv_ruleShortType= ruleShortType EOF
            {
             newCompositeNode(grammarAccess.getShortTypeRule()); 
            pushFollow(FOLLOW_ruleShortType_in_entryRuleShortType7955);
            iv_ruleShortType=ruleShortType();

            state._fsp--;

             current =iv_ruleShortType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortType7965); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4319:1: ruleShortType returns [EObject current=null] : ( () otherlv_1= 'short' ) ;
    public final EObject ruleShortType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4322:28: ( ( () otherlv_1= 'short' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4323:1: ( () otherlv_1= 'short' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4323:1: ( () otherlv_1= 'short' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4323:2: () otherlv_1= 'short'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4323:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4324:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getShortTypeAccess().getShortTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleShortType8011); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4341:1: entryRuleUShortType returns [EObject current=null] : iv_ruleUShortType= ruleUShortType EOF ;
    public final EObject entryRuleUShortType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUShortType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4342:2: (iv_ruleUShortType= ruleUShortType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4343:2: iv_ruleUShortType= ruleUShortType EOF
            {
             newCompositeNode(grammarAccess.getUShortTypeRule()); 
            pushFollow(FOLLOW_ruleUShortType_in_entryRuleUShortType8047);
            iv_ruleUShortType=ruleUShortType();

            state._fsp--;

             current =iv_ruleUShortType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUShortType8057); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4350:1: ruleUShortType returns [EObject current=null] : ( () otherlv_1= 'ushort' ) ;
    public final EObject ruleUShortType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4353:28: ( ( () otherlv_1= 'ushort' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4354:1: ( () otherlv_1= 'ushort' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4354:1: ( () otherlv_1= 'ushort' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4354:2: () otherlv_1= 'ushort'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4354:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4355:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUShortTypeAccess().getUShortTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleUShortType8103); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4372:1: entryRuleIntType returns [EObject current=null] : iv_ruleIntType= ruleIntType EOF ;
    public final EObject entryRuleIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4373:2: (iv_ruleIntType= ruleIntType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4374:2: iv_ruleIntType= ruleIntType EOF
            {
             newCompositeNode(grammarAccess.getIntTypeRule()); 
            pushFollow(FOLLOW_ruleIntType_in_entryRuleIntType8139);
            iv_ruleIntType=ruleIntType();

            state._fsp--;

             current =iv_ruleIntType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntType8149); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4381:1: ruleIntType returns [EObject current=null] : ( () otherlv_1= 'int' ) ;
    public final EObject ruleIntType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4384:28: ( ( () otherlv_1= 'int' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4385:1: ( () otherlv_1= 'int' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4385:1: ( () otherlv_1= 'int' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4385:2: () otherlv_1= 'int'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4385:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4386:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntTypeAccess().getIntTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleIntType8195); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4403:1: entryRuleUIntType returns [EObject current=null] : iv_ruleUIntType= ruleUIntType EOF ;
    public final EObject entryRuleUIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIntType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4404:2: (iv_ruleUIntType= ruleUIntType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4405:2: iv_ruleUIntType= ruleUIntType EOF
            {
             newCompositeNode(grammarAccess.getUIntTypeRule()); 
            pushFollow(FOLLOW_ruleUIntType_in_entryRuleUIntType8231);
            iv_ruleUIntType=ruleUIntType();

            state._fsp--;

             current =iv_ruleUIntType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIntType8241); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4412:1: ruleUIntType returns [EObject current=null] : ( () otherlv_1= 'uint' ) ;
    public final EObject ruleUIntType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4415:28: ( ( () otherlv_1= 'uint' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4416:1: ( () otherlv_1= 'uint' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4416:1: ( () otherlv_1= 'uint' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4416:2: () otherlv_1= 'uint'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4416:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4417:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUIntTypeAccess().getUIntTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleUIntType8287); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4434:1: entryRuleFloatType returns [EObject current=null] : iv_ruleFloatType= ruleFloatType EOF ;
    public final EObject entryRuleFloatType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4435:2: (iv_ruleFloatType= ruleFloatType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4436:2: iv_ruleFloatType= ruleFloatType EOF
            {
             newCompositeNode(grammarAccess.getFloatTypeRule()); 
            pushFollow(FOLLOW_ruleFloatType_in_entryRuleFloatType8323);
            iv_ruleFloatType=ruleFloatType();

            state._fsp--;

             current =iv_ruleFloatType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatType8333); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4443:1: ruleFloatType returns [EObject current=null] : ( () otherlv_1= 'float' ) ;
    public final EObject ruleFloatType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4446:28: ( ( () otherlv_1= 'float' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4447:1: ( () otherlv_1= 'float' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4447:1: ( () otherlv_1= 'float' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4447:2: () otherlv_1= 'float'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4447:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4448:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFloatTypeAccess().getFloatTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleFloatType8379); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4465:1: entryRuleDoubleType returns [EObject current=null] : iv_ruleDoubleType= ruleDoubleType EOF ;
    public final EObject entryRuleDoubleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4466:2: (iv_ruleDoubleType= ruleDoubleType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4467:2: iv_ruleDoubleType= ruleDoubleType EOF
            {
             newCompositeNode(grammarAccess.getDoubleTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleType_in_entryRuleDoubleType8415);
            iv_ruleDoubleType=ruleDoubleType();

            state._fsp--;

             current =iv_ruleDoubleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleType8425); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4474:1: ruleDoubleType returns [EObject current=null] : ( () otherlv_1= 'double' ) ;
    public final EObject ruleDoubleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4477:28: ( ( () otherlv_1= 'double' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4478:1: ( () otherlv_1= 'double' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4478:1: ( () otherlv_1= 'double' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4478:2: () otherlv_1= 'double'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4478:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4479:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDoubleTypeAccess().getDoubleTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleDoubleType8471); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4496:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4497:2: (iv_ruleStringType= ruleStringType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4498:2: iv_ruleStringType= ruleStringType EOF
            {
             newCompositeNode(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType8507);
            iv_ruleStringType=ruleStringType();

            state._fsp--;

             current =iv_ruleStringType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType8517); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4505:1: ruleStringType returns [EObject current=null] : ( () otherlv_1= 'string' ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4508:28: ( ( () otherlv_1= 'string' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4509:1: ( () otherlv_1= 'string' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4509:1: ( () otherlv_1= 'string' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4509:2: () otherlv_1= 'string'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4509:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4510:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleStringType8563); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4527:1: entryRuleCharArrayType returns [EObject current=null] : iv_ruleCharArrayType= ruleCharArrayType EOF ;
    public final EObject entryRuleCharArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4528:2: (iv_ruleCharArrayType= ruleCharArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4529:2: iv_ruleCharArrayType= ruleCharArrayType EOF
            {
             newCompositeNode(grammarAccess.getCharArrayTypeRule()); 
            pushFollow(FOLLOW_ruleCharArrayType_in_entryRuleCharArrayType8599);
            iv_ruleCharArrayType=ruleCharArrayType();

            state._fsp--;

             current =iv_ruleCharArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharArrayType8609); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4536:1: ruleCharArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarCharArray' ) ;
    public final EObject ruleCharArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4539:28: ( ( () otherlv_1= 'DevVarCharArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4540:1: ( () otherlv_1= 'DevVarCharArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4540:1: ( () otherlv_1= 'DevVarCharArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4540:2: () otherlv_1= 'DevVarCharArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4540:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4541:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCharArrayTypeAccess().getCharArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleCharArrayType8655); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4558:1: entryRuleShortArrayType returns [EObject current=null] : iv_ruleShortArrayType= ruleShortArrayType EOF ;
    public final EObject entryRuleShortArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4559:2: (iv_ruleShortArrayType= ruleShortArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4560:2: iv_ruleShortArrayType= ruleShortArrayType EOF
            {
             newCompositeNode(grammarAccess.getShortArrayTypeRule()); 
            pushFollow(FOLLOW_ruleShortArrayType_in_entryRuleShortArrayType8691);
            iv_ruleShortArrayType=ruleShortArrayType();

            state._fsp--;

             current =iv_ruleShortArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortArrayType8701); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4567:1: ruleShortArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarShortArray' ) ;
    public final EObject ruleShortArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4570:28: ( ( () otherlv_1= 'DevVarShortArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4571:1: ( () otherlv_1= 'DevVarShortArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4571:1: ( () otherlv_1= 'DevVarShortArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4571:2: () otherlv_1= 'DevVarShortArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4571:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4572:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getShortArrayTypeAccess().getShortArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleShortArrayType8747); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4589:1: entryRuleUShortArrayType returns [EObject current=null] : iv_ruleUShortArrayType= ruleUShortArrayType EOF ;
    public final EObject entryRuleUShortArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUShortArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4590:2: (iv_ruleUShortArrayType= ruleUShortArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4591:2: iv_ruleUShortArrayType= ruleUShortArrayType EOF
            {
             newCompositeNode(grammarAccess.getUShortArrayTypeRule()); 
            pushFollow(FOLLOW_ruleUShortArrayType_in_entryRuleUShortArrayType8783);
            iv_ruleUShortArrayType=ruleUShortArrayType();

            state._fsp--;

             current =iv_ruleUShortArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUShortArrayType8793); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4598:1: ruleUShortArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarUShortArray' ) ;
    public final EObject ruleUShortArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4601:28: ( ( () otherlv_1= 'DevVarUShortArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4602:1: ( () otherlv_1= 'DevVarUShortArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4602:1: ( () otherlv_1= 'DevVarUShortArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4602:2: () otherlv_1= 'DevVarUShortArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4602:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4603:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUShortArrayTypeAccess().getUShortArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleUShortArrayType8839); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4620:1: entryRuleIntArrayType returns [EObject current=null] : iv_ruleIntArrayType= ruleIntArrayType EOF ;
    public final EObject entryRuleIntArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4621:2: (iv_ruleIntArrayType= ruleIntArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4622:2: iv_ruleIntArrayType= ruleIntArrayType EOF
            {
             newCompositeNode(grammarAccess.getIntArrayTypeRule()); 
            pushFollow(FOLLOW_ruleIntArrayType_in_entryRuleIntArrayType8875);
            iv_ruleIntArrayType=ruleIntArrayType();

            state._fsp--;

             current =iv_ruleIntArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntArrayType8885); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4629:1: ruleIntArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarLongArray' ) ;
    public final EObject ruleIntArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4632:28: ( ( () otherlv_1= 'DevVarLongArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4633:1: ( () otherlv_1= 'DevVarLongArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4633:1: ( () otherlv_1= 'DevVarLongArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4633:2: () otherlv_1= 'DevVarLongArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4633:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4634:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntArrayTypeAccess().getIntArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleIntArrayType8931); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4651:1: entryRuleUIntArrayType returns [EObject current=null] : iv_ruleUIntArrayType= ruleUIntArrayType EOF ;
    public final EObject entryRuleUIntArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIntArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4652:2: (iv_ruleUIntArrayType= ruleUIntArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4653:2: iv_ruleUIntArrayType= ruleUIntArrayType EOF
            {
             newCompositeNode(grammarAccess.getUIntArrayTypeRule()); 
            pushFollow(FOLLOW_ruleUIntArrayType_in_entryRuleUIntArrayType8967);
            iv_ruleUIntArrayType=ruleUIntArrayType();

            state._fsp--;

             current =iv_ruleUIntArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIntArrayType8977); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4660:1: ruleUIntArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarULongArray' ) ;
    public final EObject ruleUIntArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4663:28: ( ( () otherlv_1= 'DevVarULongArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4664:1: ( () otherlv_1= 'DevVarULongArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4664:1: ( () otherlv_1= 'DevVarULongArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4664:2: () otherlv_1= 'DevVarULongArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4664:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4665:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUIntArrayTypeAccess().getUIntArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleUIntArrayType9023); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4682:1: entryRuleFloatArrayType returns [EObject current=null] : iv_ruleFloatArrayType= ruleFloatArrayType EOF ;
    public final EObject entryRuleFloatArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4683:2: (iv_ruleFloatArrayType= ruleFloatArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4684:2: iv_ruleFloatArrayType= ruleFloatArrayType EOF
            {
             newCompositeNode(grammarAccess.getFloatArrayTypeRule()); 
            pushFollow(FOLLOW_ruleFloatArrayType_in_entryRuleFloatArrayType9059);
            iv_ruleFloatArrayType=ruleFloatArrayType();

            state._fsp--;

             current =iv_ruleFloatArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatArrayType9069); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4691:1: ruleFloatArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarFloatArray' ) ;
    public final EObject ruleFloatArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4694:28: ( ( () otherlv_1= 'DevVarFloatArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4695:1: ( () otherlv_1= 'DevVarFloatArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4695:1: ( () otherlv_1= 'DevVarFloatArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4695:2: () otherlv_1= 'DevVarFloatArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4695:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4696:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFloatArrayTypeAccess().getFloatArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleFloatArrayType9115); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4713:1: entryRuleDoubleArrayType returns [EObject current=null] : iv_ruleDoubleArrayType= ruleDoubleArrayType EOF ;
    public final EObject entryRuleDoubleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4714:2: (iv_ruleDoubleArrayType= ruleDoubleArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4715:2: iv_ruleDoubleArrayType= ruleDoubleArrayType EOF
            {
             newCompositeNode(grammarAccess.getDoubleArrayTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleArrayType_in_entryRuleDoubleArrayType9151);
            iv_ruleDoubleArrayType=ruleDoubleArrayType();

            state._fsp--;

             current =iv_ruleDoubleArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleArrayType9161); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4722:1: ruleDoubleArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarDoubleArray' ) ;
    public final EObject ruleDoubleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4725:28: ( ( () otherlv_1= 'DevVarDoubleArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4726:1: ( () otherlv_1= 'DevVarDoubleArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4726:1: ( () otherlv_1= 'DevVarDoubleArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4726:2: () otherlv_1= 'DevVarDoubleArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4726:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4727:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDoubleArrayTypeAccess().getDoubleArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleDoubleArrayType9207); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4744:1: entryRuleStringArrayType returns [EObject current=null] : iv_ruleStringArrayType= ruleStringArrayType EOF ;
    public final EObject entryRuleStringArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4745:2: (iv_ruleStringArrayType= ruleStringArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4746:2: iv_ruleStringArrayType= ruleStringArrayType EOF
            {
             newCompositeNode(grammarAccess.getStringArrayTypeRule()); 
            pushFollow(FOLLOW_ruleStringArrayType_in_entryRuleStringArrayType9243);
            iv_ruleStringArrayType=ruleStringArrayType();

            state._fsp--;

             current =iv_ruleStringArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringArrayType9253); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4753:1: ruleStringArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarStringArray' ) ;
    public final EObject ruleStringArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4756:28: ( ( () otherlv_1= 'DevVarStringArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4757:1: ( () otherlv_1= 'DevVarStringArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4757:1: ( () otherlv_1= 'DevVarStringArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4757:2: () otherlv_1= 'DevVarStringArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4757:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4758:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringArrayTypeAccess().getStringArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleStringArrayType9299); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4775:1: entryRuleLongStringArrayType returns [EObject current=null] : iv_ruleLongStringArrayType= ruleLongStringArrayType EOF ;
    public final EObject entryRuleLongStringArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongStringArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4776:2: (iv_ruleLongStringArrayType= ruleLongStringArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4777:2: iv_ruleLongStringArrayType= ruleLongStringArrayType EOF
            {
             newCompositeNode(grammarAccess.getLongStringArrayTypeRule()); 
            pushFollow(FOLLOW_ruleLongStringArrayType_in_entryRuleLongStringArrayType9335);
            iv_ruleLongStringArrayType=ruleLongStringArrayType();

            state._fsp--;

             current =iv_ruleLongStringArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongStringArrayType9345); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4784:1: ruleLongStringArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarLongStringArray' ) ;
    public final EObject ruleLongStringArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4787:28: ( ( () otherlv_1= 'DevVarLongStringArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4788:1: ( () otherlv_1= 'DevVarLongStringArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4788:1: ( () otherlv_1= 'DevVarLongStringArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4788:2: () otherlv_1= 'DevVarLongStringArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4788:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4789:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLongStringArrayTypeAccess().getLongStringArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleLongStringArrayType9391); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4806:1: entryRuleDoubleStringArrayType returns [EObject current=null] : iv_ruleDoubleStringArrayType= ruleDoubleStringArrayType EOF ;
    public final EObject entryRuleDoubleStringArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleStringArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4807:2: (iv_ruleDoubleStringArrayType= ruleDoubleStringArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4808:2: iv_ruleDoubleStringArrayType= ruleDoubleStringArrayType EOF
            {
             newCompositeNode(grammarAccess.getDoubleStringArrayTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleStringArrayType_in_entryRuleDoubleStringArrayType9427);
            iv_ruleDoubleStringArrayType=ruleDoubleStringArrayType();

            state._fsp--;

             current =iv_ruleDoubleStringArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleStringArrayType9437); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4815:1: ruleDoubleStringArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarDoubleStringArray' ) ;
    public final EObject ruleDoubleStringArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4818:28: ( ( () otherlv_1= 'DevVarDoubleStringArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4819:1: ( () otherlv_1= 'DevVarDoubleStringArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4819:1: ( () otherlv_1= 'DevVarDoubleStringArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4819:2: () otherlv_1= 'DevVarDoubleStringArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4819:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4820:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDoubleStringArrayTypeAccess().getDoubleStringArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleDoubleStringArrayType9483); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4837:1: entryRuleStateType returns [EObject current=null] : iv_ruleStateType= ruleStateType EOF ;
    public final EObject entryRuleStateType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4838:2: (iv_ruleStateType= ruleStateType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4839:2: iv_ruleStateType= ruleStateType EOF
            {
             newCompositeNode(grammarAccess.getStateTypeRule()); 
            pushFollow(FOLLOW_ruleStateType_in_entryRuleStateType9519);
            iv_ruleStateType=ruleStateType();

            state._fsp--;

             current =iv_ruleStateType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateType9529); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4846:1: ruleStateType returns [EObject current=null] : ( () otherlv_1= 'DevState' ) ;
    public final EObject ruleStateType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4849:28: ( ( () otherlv_1= 'DevState' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4850:1: ( () otherlv_1= 'DevState' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4850:1: ( () otherlv_1= 'DevState' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4850:2: () otherlv_1= 'DevState'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4850:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4851:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateTypeAccess().getStateTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleStateType9575); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4868:1: entryRuleConstStringType returns [EObject current=null] : iv_ruleConstStringType= ruleConstStringType EOF ;
    public final EObject entryRuleConstStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstStringType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4869:2: (iv_ruleConstStringType= ruleConstStringType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4870:2: iv_ruleConstStringType= ruleConstStringType EOF
            {
             newCompositeNode(grammarAccess.getConstStringTypeRule()); 
            pushFollow(FOLLOW_ruleConstStringType_in_entryRuleConstStringType9611);
            iv_ruleConstStringType=ruleConstStringType();

            state._fsp--;

             current =iv_ruleConstStringType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstStringType9621); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4877:1: ruleConstStringType returns [EObject current=null] : ( () otherlv_1= 'ConstDevString' ) ;
    public final EObject ruleConstStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4880:28: ( ( () otherlv_1= 'ConstDevString' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4881:1: ( () otherlv_1= 'ConstDevString' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4881:1: ( () otherlv_1= 'ConstDevString' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4881:2: () otherlv_1= 'ConstDevString'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4881:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4882:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConstStringTypeAccess().getConstStringTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleConstStringType9667); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4899:1: entryRuleBooleanArrayType returns [EObject current=null] : iv_ruleBooleanArrayType= ruleBooleanArrayType EOF ;
    public final EObject entryRuleBooleanArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4900:2: (iv_ruleBooleanArrayType= ruleBooleanArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4901:2: iv_ruleBooleanArrayType= ruleBooleanArrayType EOF
            {
             newCompositeNode(grammarAccess.getBooleanArrayTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanArrayType_in_entryRuleBooleanArrayType9703);
            iv_ruleBooleanArrayType=ruleBooleanArrayType();

            state._fsp--;

             current =iv_ruleBooleanArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanArrayType9713); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4908:1: ruleBooleanArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarBooleanArray' ) ;
    public final EObject ruleBooleanArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4911:28: ( ( () otherlv_1= 'DevVarBooleanArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4912:1: ( () otherlv_1= 'DevVarBooleanArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4912:1: ( () otherlv_1= 'DevVarBooleanArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4912:2: () otherlv_1= 'DevVarBooleanArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4912:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4913:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanArrayTypeAccess().getBooleanArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleBooleanArrayType9759); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4930:1: entryRuleUCharType returns [EObject current=null] : iv_ruleUCharType= ruleUCharType EOF ;
    public final EObject entryRuleUCharType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUCharType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4931:2: (iv_ruleUCharType= ruleUCharType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4932:2: iv_ruleUCharType= ruleUCharType EOF
            {
             newCompositeNode(grammarAccess.getUCharTypeRule()); 
            pushFollow(FOLLOW_ruleUCharType_in_entryRuleUCharType9795);
            iv_ruleUCharType=ruleUCharType();

            state._fsp--;

             current =iv_ruleUCharType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUCharType9805); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4939:1: ruleUCharType returns [EObject current=null] : ( () otherlv_1= 'DevUChar' ) ;
    public final EObject ruleUCharType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4942:28: ( ( () otherlv_1= 'DevUChar' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4943:1: ( () otherlv_1= 'DevUChar' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4943:1: ( () otherlv_1= 'DevUChar' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4943:2: () otherlv_1= 'DevUChar'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4943:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4944:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUCharTypeAccess().getUCharTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleUCharType9851); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4961:1: entryRuleLongType returns [EObject current=null] : iv_ruleLongType= ruleLongType EOF ;
    public final EObject entryRuleLongType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4962:2: (iv_ruleLongType= ruleLongType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4963:2: iv_ruleLongType= ruleLongType EOF
            {
             newCompositeNode(grammarAccess.getLongTypeRule()); 
            pushFollow(FOLLOW_ruleLongType_in_entryRuleLongType9887);
            iv_ruleLongType=ruleLongType();

            state._fsp--;

             current =iv_ruleLongType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongType9897); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4970:1: ruleLongType returns [EObject current=null] : ( () otherlv_1= 'DevLong64' ) ;
    public final EObject ruleLongType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4973:28: ( ( () otherlv_1= 'DevLong64' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4974:1: ( () otherlv_1= 'DevLong64' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4974:1: ( () otherlv_1= 'DevLong64' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4974:2: () otherlv_1= 'DevLong64'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4974:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4975:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLongTypeAccess().getLongTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleLongType9943); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4992:1: entryRuleULongType returns [EObject current=null] : iv_ruleULongType= ruleULongType EOF ;
    public final EObject entryRuleULongType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleULongType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4993:2: (iv_ruleULongType= ruleULongType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4994:2: iv_ruleULongType= ruleULongType EOF
            {
             newCompositeNode(grammarAccess.getULongTypeRule()); 
            pushFollow(FOLLOW_ruleULongType_in_entryRuleULongType9979);
            iv_ruleULongType=ruleULongType();

            state._fsp--;

             current =iv_ruleULongType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleULongType9989); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5001:1: ruleULongType returns [EObject current=null] : ( () otherlv_1= 'DevULong64' ) ;
    public final EObject ruleULongType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5004:28: ( ( () otherlv_1= 'DevULong64' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5005:1: ( () otherlv_1= 'DevULong64' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5005:1: ( () otherlv_1= 'DevULong64' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5005:2: () otherlv_1= 'DevULong64'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5005:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5006:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getULongTypeAccess().getULongTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleULongType10035); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5023:1: entryRuleLongArrayType returns [EObject current=null] : iv_ruleLongArrayType= ruleLongArrayType EOF ;
    public final EObject entryRuleLongArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5024:2: (iv_ruleLongArrayType= ruleLongArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5025:2: iv_ruleLongArrayType= ruleLongArrayType EOF
            {
             newCompositeNode(grammarAccess.getLongArrayTypeRule()); 
            pushFollow(FOLLOW_ruleLongArrayType_in_entryRuleLongArrayType10071);
            iv_ruleLongArrayType=ruleLongArrayType();

            state._fsp--;

             current =iv_ruleLongArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongArrayType10081); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5032:1: ruleLongArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarLong64Array' ) ;
    public final EObject ruleLongArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5035:28: ( ( () otherlv_1= 'DevVarLong64Array' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5036:1: ( () otherlv_1= 'DevVarLong64Array' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5036:1: ( () otherlv_1= 'DevVarLong64Array' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5036:2: () otherlv_1= 'DevVarLong64Array'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5036:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5037:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLongArrayTypeAccess().getLongArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,78,FOLLOW_78_in_ruleLongArrayType10127); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5054:1: entryRuleULongArrayType returns [EObject current=null] : iv_ruleULongArrayType= ruleULongArrayType EOF ;
    public final EObject entryRuleULongArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleULongArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5055:2: (iv_ruleULongArrayType= ruleULongArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5056:2: iv_ruleULongArrayType= ruleULongArrayType EOF
            {
             newCompositeNode(grammarAccess.getULongArrayTypeRule()); 
            pushFollow(FOLLOW_ruleULongArrayType_in_entryRuleULongArrayType10163);
            iv_ruleULongArrayType=ruleULongArrayType();

            state._fsp--;

             current =iv_ruleULongArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleULongArrayType10173); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5063:1: ruleULongArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarULong64Array' ) ;
    public final EObject ruleULongArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5066:28: ( ( () otherlv_1= 'DevVarULong64Array' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5067:1: ( () otherlv_1= 'DevVarULong64Array' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5067:1: ( () otherlv_1= 'DevVarULong64Array' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5067:2: () otherlv_1= 'DevVarULong64Array'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5067:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5068:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getULongArrayTypeAccess().getULongArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,79,FOLLOW_79_in_ruleULongArrayType10219); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5085:1: entryRuleDevIntType returns [EObject current=null] : iv_ruleDevIntType= ruleDevIntType EOF ;
    public final EObject entryRuleDevIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevIntType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5086:2: (iv_ruleDevIntType= ruleDevIntType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5087:2: iv_ruleDevIntType= ruleDevIntType EOF
            {
             newCompositeNode(grammarAccess.getDevIntTypeRule()); 
            pushFollow(FOLLOW_ruleDevIntType_in_entryRuleDevIntType10255);
            iv_ruleDevIntType=ruleDevIntType();

            state._fsp--;

             current =iv_ruleDevIntType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDevIntType10265); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5094:1: ruleDevIntType returns [EObject current=null] : ( () otherlv_1= 'DevInt' ) ;
    public final EObject ruleDevIntType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5097:28: ( ( () otherlv_1= 'DevInt' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5098:1: ( () otherlv_1= 'DevInt' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5098:1: ( () otherlv_1= 'DevInt' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5098:2: () otherlv_1= 'DevInt'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5098:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5099:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDevIntTypeAccess().getDevIntTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,80,FOLLOW_80_in_ruleDevIntType10311); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5116:1: entryRuleEncodedType returns [EObject current=null] : iv_ruleEncodedType= ruleEncodedType EOF ;
    public final EObject entryRuleEncodedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEncodedType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5117:2: (iv_ruleEncodedType= ruleEncodedType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5118:2: iv_ruleEncodedType= ruleEncodedType EOF
            {
             newCompositeNode(grammarAccess.getEncodedTypeRule()); 
            pushFollow(FOLLOW_ruleEncodedType_in_entryRuleEncodedType10347);
            iv_ruleEncodedType=ruleEncodedType();

            state._fsp--;

             current =iv_ruleEncodedType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEncodedType10357); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5125:1: ruleEncodedType returns [EObject current=null] : ( () otherlv_1= 'DevEncoded' ) ;
    public final EObject ruleEncodedType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5128:28: ( ( () otherlv_1= 'DevEncoded' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5129:1: ( () otherlv_1= 'DevEncoded' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5129:1: ( () otherlv_1= 'DevEncoded' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5129:2: () otherlv_1= 'DevEncoded'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5129:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5130:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEncodedTypeAccess().getEncodedTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,81,FOLLOW_81_in_ruleEncodedType10403); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5147:1: entryRuleEnumType returns [EObject current=null] : iv_ruleEnumType= ruleEnumType EOF ;
    public final EObject entryRuleEnumType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5148:2: (iv_ruleEnumType= ruleEnumType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5149:2: iv_ruleEnumType= ruleEnumType EOF
            {
             newCompositeNode(grammarAccess.getEnumTypeRule()); 
            pushFollow(FOLLOW_ruleEnumType_in_entryRuleEnumType10439);
            iv_ruleEnumType=ruleEnumType();

            state._fsp--;

             current =iv_ruleEnumType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumType10449); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5156:1: ruleEnumType returns [EObject current=null] : ( () otherlv_1= 'DevEnum' ) ;
    public final EObject ruleEnumType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5159:28: ( ( () otherlv_1= 'DevEnum' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5160:1: ( () otherlv_1= 'DevEnum' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5160:1: ( () otherlv_1= 'DevEnum' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5160:2: () otherlv_1= 'DevEnum'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5160:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5161:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEnumTypeAccess().getEnumTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,82,FOLLOW_82_in_ruleEnumType10495); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5178:1: entryRuleShortVectorType returns [EObject current=null] : iv_ruleShortVectorType= ruleShortVectorType EOF ;
    public final EObject entryRuleShortVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5179:2: (iv_ruleShortVectorType= ruleShortVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5180:2: iv_ruleShortVectorType= ruleShortVectorType EOF
            {
             newCompositeNode(grammarAccess.getShortVectorTypeRule()); 
            pushFollow(FOLLOW_ruleShortVectorType_in_entryRuleShortVectorType10531);
            iv_ruleShortVectorType=ruleShortVectorType();

            state._fsp--;

             current =iv_ruleShortVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortVectorType10541); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5187:1: ruleShortVectorType returns [EObject current=null] : ( () otherlv_1= 'vector<short>' ) ;
    public final EObject ruleShortVectorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5190:28: ( ( () otherlv_1= 'vector<short>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5191:1: ( () otherlv_1= 'vector<short>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5191:1: ( () otherlv_1= 'vector<short>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5191:2: () otherlv_1= 'vector<short>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5191:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5192:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getShortVectorTypeAccess().getShortVectorTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,83,FOLLOW_83_in_ruleShortVectorType10587); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5209:1: entryRuleIntVectorType returns [EObject current=null] : iv_ruleIntVectorType= ruleIntVectorType EOF ;
    public final EObject entryRuleIntVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5210:2: (iv_ruleIntVectorType= ruleIntVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5211:2: iv_ruleIntVectorType= ruleIntVectorType EOF
            {
             newCompositeNode(grammarAccess.getIntVectorTypeRule()); 
            pushFollow(FOLLOW_ruleIntVectorType_in_entryRuleIntVectorType10623);
            iv_ruleIntVectorType=ruleIntVectorType();

            state._fsp--;

             current =iv_ruleIntVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntVectorType10633); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5218:1: ruleIntVectorType returns [EObject current=null] : ( () otherlv_1= 'vector<int>' ) ;
    public final EObject ruleIntVectorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5221:28: ( ( () otherlv_1= 'vector<int>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5222:1: ( () otherlv_1= 'vector<int>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5222:1: ( () otherlv_1= 'vector<int>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5222:2: () otherlv_1= 'vector<int>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5222:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5223:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntVectorTypeAccess().getIntVectorTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,84,FOLLOW_84_in_ruleIntVectorType10679); 

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


    // $ANTLR start "entryRuleLongVectorType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5240:1: entryRuleLongVectorType returns [EObject current=null] : iv_ruleLongVectorType= ruleLongVectorType EOF ;
    public final EObject entryRuleLongVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5241:2: (iv_ruleLongVectorType= ruleLongVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5242:2: iv_ruleLongVectorType= ruleLongVectorType EOF
            {
             newCompositeNode(grammarAccess.getLongVectorTypeRule()); 
            pushFollow(FOLLOW_ruleLongVectorType_in_entryRuleLongVectorType10715);
            iv_ruleLongVectorType=ruleLongVectorType();

            state._fsp--;

             current =iv_ruleLongVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongVectorType10725); 

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
    // $ANTLR end "entryRuleLongVectorType"


    // $ANTLR start "ruleLongVectorType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5249:1: ruleLongVectorType returns [EObject current=null] : ( () otherlv_1= 'vector<long>' ) ;
    public final EObject ruleLongVectorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5252:28: ( ( () otherlv_1= 'vector<long>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5253:1: ( () otherlv_1= 'vector<long>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5253:1: ( () otherlv_1= 'vector<long>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5253:2: () otherlv_1= 'vector<long>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5253:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5254:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLongVectorTypeAccess().getIntVectorTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,85,FOLLOW_85_in_ruleLongVectorType10771); 

                	newLeafNode(otherlv_1, grammarAccess.getLongVectorTypeAccess().getVectorLongKeyword_1());
                

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
    // $ANTLR end "ruleLongVectorType"


    // $ANTLR start "entryRuleULongVectorType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5271:1: entryRuleULongVectorType returns [EObject current=null] : iv_ruleULongVectorType= ruleULongVectorType EOF ;
    public final EObject entryRuleULongVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleULongVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5272:2: (iv_ruleULongVectorType= ruleULongVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5273:2: iv_ruleULongVectorType= ruleULongVectorType EOF
            {
             newCompositeNode(grammarAccess.getULongVectorTypeRule()); 
            pushFollow(FOLLOW_ruleULongVectorType_in_entryRuleULongVectorType10807);
            iv_ruleULongVectorType=ruleULongVectorType();

            state._fsp--;

             current =iv_ruleULongVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleULongVectorType10817); 

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
    // $ANTLR end "entryRuleULongVectorType"


    // $ANTLR start "ruleULongVectorType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5280:1: ruleULongVectorType returns [EObject current=null] : ( () otherlv_1= 'vector<ulong>' ) ;
    public final EObject ruleULongVectorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5283:28: ( ( () otherlv_1= 'vector<ulong>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5284:1: ( () otherlv_1= 'vector<ulong>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5284:1: ( () otherlv_1= 'vector<ulong>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5284:2: () otherlv_1= 'vector<ulong>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5284:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5285:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getULongVectorTypeAccess().getIntVectorTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,86,FOLLOW_86_in_ruleULongVectorType10863); 

                	newLeafNode(otherlv_1, grammarAccess.getULongVectorTypeAccess().getVectorUlongKeyword_1());
                

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
    // $ANTLR end "ruleULongVectorType"


    // $ANTLR start "entryRuleFloatVectorType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5302:1: entryRuleFloatVectorType returns [EObject current=null] : iv_ruleFloatVectorType= ruleFloatVectorType EOF ;
    public final EObject entryRuleFloatVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5303:2: (iv_ruleFloatVectorType= ruleFloatVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5304:2: iv_ruleFloatVectorType= ruleFloatVectorType EOF
            {
             newCompositeNode(grammarAccess.getFloatVectorTypeRule()); 
            pushFollow(FOLLOW_ruleFloatVectorType_in_entryRuleFloatVectorType10899);
            iv_ruleFloatVectorType=ruleFloatVectorType();

            state._fsp--;

             current =iv_ruleFloatVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatVectorType10909); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5311:1: ruleFloatVectorType returns [EObject current=null] : ( () otherlv_1= 'vector<float>' ) ;
    public final EObject ruleFloatVectorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5314:28: ( ( () otherlv_1= 'vector<float>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5315:1: ( () otherlv_1= 'vector<float>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5315:1: ( () otherlv_1= 'vector<float>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5315:2: () otherlv_1= 'vector<float>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5315:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5316:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFloatVectorTypeAccess().getFloatVectorTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,87,FOLLOW_87_in_ruleFloatVectorType10955); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5333:1: entryRuleDoubleVectorType returns [EObject current=null] : iv_ruleDoubleVectorType= ruleDoubleVectorType EOF ;
    public final EObject entryRuleDoubleVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5334:2: (iv_ruleDoubleVectorType= ruleDoubleVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5335:2: iv_ruleDoubleVectorType= ruleDoubleVectorType EOF
            {
             newCompositeNode(grammarAccess.getDoubleVectorTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleVectorType_in_entryRuleDoubleVectorType10991);
            iv_ruleDoubleVectorType=ruleDoubleVectorType();

            state._fsp--;

             current =iv_ruleDoubleVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleVectorType11001); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5342:1: ruleDoubleVectorType returns [EObject current=null] : ( () otherlv_1= 'vector<double>' ) ;
    public final EObject ruleDoubleVectorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5345:28: ( ( () otherlv_1= 'vector<double>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5346:1: ( () otherlv_1= 'vector<double>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5346:1: ( () otherlv_1= 'vector<double>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5346:2: () otherlv_1= 'vector<double>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5346:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5347:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDoubleVectorTypeAccess().getDoubleVectorTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,88,FOLLOW_88_in_ruleDoubleVectorType11047); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5364:1: entryRuleStringVectorType returns [EObject current=null] : iv_ruleStringVectorType= ruleStringVectorType EOF ;
    public final EObject entryRuleStringVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5365:2: (iv_ruleStringVectorType= ruleStringVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5366:2: iv_ruleStringVectorType= ruleStringVectorType EOF
            {
             newCompositeNode(grammarAccess.getStringVectorTypeRule()); 
            pushFollow(FOLLOW_ruleStringVectorType_in_entryRuleStringVectorType11083);
            iv_ruleStringVectorType=ruleStringVectorType();

            state._fsp--;

             current =iv_ruleStringVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringVectorType11093); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5373:1: ruleStringVectorType returns [EObject current=null] : ( () otherlv_1= 'vector<string>' ) ;
    public final EObject ruleStringVectorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5376:28: ( ( () otherlv_1= 'vector<string>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5377:1: ( () otherlv_1= 'vector<string>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5377:1: ( () otherlv_1= 'vector<string>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5377:2: () otherlv_1= 'vector<string>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5377:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:5378:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringVectorTypeAccess().getStringVectorTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,89,FOLLOW_89_in_ruleStringVectorType11139); 

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
    public static final BitSet FOLLOW_RULE_STRING_in_rulePogoMultiClasses503 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePogoMultiClasses525 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePogoMultiClasses542 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOneClassSimpleDef_in_rulePogoMultiClasses563 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePogoMultiClasses580 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePreferences_in_rulePogoMultiClasses606 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePogoMultiClasses618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneClassSimpleDef_in_entryRuleOneClassSimpleDef654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneClassSimpleDef664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOneClassSimpleDef706 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOneClassSimpleDef728 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleOneClassSimpleDef754 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleOneClassSimpleDef775 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOneClassSimpleDef787 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInheritance_in_ruleOneClassSimpleDef808 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleOneClassSimpleDef820 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOneClassSimpleDef837 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOneClassSimpleDef854 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleAdditionalFile_in_ruleOneClassSimpleDef875 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rulePogoDeviceClass_in_entryRulePogoDeviceClass912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePogoDeviceClass922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePogoDeviceClass959 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePogoDeviceClass976 = new BitSet(new long[]{0x0000000000302000L});
    public static final BitSet FOLLOW_20_in_rulePogoDeviceClass999 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_21_in_rulePogoDeviceClass1026 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePogoDeviceClass1046 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePogoDeviceClass1060 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePogoDeviceClass1077 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePogoDeviceClass1099 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePogoDeviceClass1116 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClassDescription_in_rulePogoDeviceClass1137 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePogoDeviceClass1149 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePogoDeviceClass1170 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_rulePogoDeviceClass1183 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePogoDeviceClass1204 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_rulePogoDeviceClass1217 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_ruleCommand_in_rulePogoDeviceClass1238 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_26_in_rulePogoDeviceClass1251 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_ruleCommand_in_rulePogoDeviceClass1272 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_27_in_rulePogoDeviceClass1285 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_ruleAttribute_in_rulePogoDeviceClass1306 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_28_in_rulePogoDeviceClass1319 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_ruleAttribute_in_rulePogoDeviceClass1340 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_29_in_rulePogoDeviceClass1353 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_ruleForwardedAttribute_in_rulePogoDeviceClass1374 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_30_in_rulePogoDeviceClass1387 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_rulePipe_in_rulePogoDeviceClass1408 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_31_in_rulePogoDeviceClass1421 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleState_in_rulePogoDeviceClass1442 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rulePreferences_in_rulePogoDeviceClass1464 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePogoDeviceClass1476 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_ruleAdditionalFile_in_rulePogoDeviceClass1497 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_32_in_rulePogoDeviceClass1510 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleOverlodedPollPeriodObject_in_rulePogoDeviceClass1531 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_rulePogoDeviceClass1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLanguage_in_entryRuleLanguage1581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLanguage1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleLanguage1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleLanguage1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleLanguage1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisplayLevel_in_entryRuleDisplayLevel1709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisplayLevel1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleDisplayLevel1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleDisplayLevel1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrType_in_entryRuleAttrType1818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrType1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleAttrType1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleAttrType1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleAttrType1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRW_Type_in_entryRuleRW_Type1946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRW_Type1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleRW_Type1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleRW_Type2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleRW_Type2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleRW_Type2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean2093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleBoolean2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleBoolean2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDescription_in_entryRuleClassDescription2201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassDescription2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassDescription2253 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassDescription2275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassDescription2297 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleClassDescription2314 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInheritance_in_ruleClassDescription2335 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_ruleLanguage_in_ruleClassDescription2356 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassDescription2373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClassIdentification_in_ruleClassDescription2399 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleComments_in_ruleClassDescription2420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassDescription2437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassDescription2459 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleClassDescription2485 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleClassDescription2506 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleClassDescription2527 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleClassDescription2548 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleClassDescription2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritance_in_entryRuleInheritance2605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInheritance2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInheritance2657 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInheritance2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassIdentification_in_entryRuleClassIdentification2720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassIdentification2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2772 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2794 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2816 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2838 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2860 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2904 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2926 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2948 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleClassIdentification2965 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2982 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleComments_in_entryRuleComments3024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComments3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleComments3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreferences_in_entryRulePreferences3115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreferences3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePreferences3167 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePreferences3189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePreferences3211 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_rulePreferences3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState3273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState3325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState3347 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_ruleState3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty3409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty3461 = new BitSet(new long[]{0x3FC0000000000000L,0x0000000003F83000L});
    public static final BitSet FOLLOW_rulePropType_in_ruleProperty3487 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_ruleProperty3508 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleProperty3529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProperty3546 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleProperty3563 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProperty3580 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rulePropType_in_entryRulePropType3622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropType3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rulePropType3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVectorType_in_rulePropType3706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType3741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_ruleSimpleType3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortType_in_ruleSimpleType3825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortType_in_ruleSimpleType3852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_ruleSimpleType3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntType_in_ruleSimpleType3906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_ruleSimpleType3933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongType_in_ruleSimpleType3960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_ruleSimpleType3987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_ruleSimpleType4014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_ruleSimpleType4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVectorType_in_entryRuleVectorType4076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVectorType4086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortVectorType_in_ruleVectorType4133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntVectorType_in_ruleVectorType4160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongVectorType_in_ruleVectorType4187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongVectorType_in_ruleVectorType4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatVectorType_in_ruleVectorType4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleVectorType_in_ruleVectorType4268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVectorType_in_ruleVectorType4295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_entryRuleInheritanceStatus4330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInheritanceStatus4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleInheritanceStatus4386 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleInheritanceStatus4407 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleInheritanceStatus4428 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleInheritanceStatus4449 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInheritanceStatus4466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand4507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand4517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand4559 = new BitSet(new long[]{0xFFE0000000000000L,0x000000000007FFFFL});
    public static final BitSet FOLLOW_ruleArgument_in_ruleCommand4585 = new BitSet(new long[]{0xFFE0000000000000L,0x000000000007FFFFL});
    public static final BitSet FOLLOW_ruleArgument_in_ruleCommand4606 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommand4623 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_ruleCommand4649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommand4666 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_ruleDisplayLevel_in_ruleCommand4692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommand4709 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleCommand4735 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleCommand4747 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommand4764 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument4806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleArgument4862 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument4879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute4920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute4930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute4972 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_ruleAttrType_in_ruleAttribute4998 = new BitSet(new long[]{0xFFE0000000000000L,0x000000000007FFFFL});
    public static final BitSet FOLLOW_ruleType_in_ruleAttribute5019 = new BitSet(new long[]{0x00001E0000000000L});
    public static final BitSet FOLLOW_ruleRW_Type_in_ruleAttribute5040 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_ruleDisplayLevel_in_ruleAttribute5061 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute5078 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute5100 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute5122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute5144 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleAttribute5170 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleAttribute5191 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleFireEvents_in_ruleAttribute5212 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleFireEvents_in_ruleAttribute5233 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleFireEvents_in_ruleAttribute5254 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_ruleAttribute5275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttrProperties_in_ruleAttribute5296 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleAttribute5317 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleAttribute5338 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEventCriteria_in_ruleAttribute5359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEventCriteria_in_ruleAttribute5380 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleAttribute5392 = new BitSet(new long[]{0x0008000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute5409 = new BitSet(new long[]{0x0008000000000010L});
    public static final BitSet FOLLOW_51_in_ruleAttribute5427 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute5444 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_52_in_ruleAttribute5462 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute5479 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleForwardedAttribute_in_entryRuleForwardedAttribute5521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForwardedAttribute5531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForwardedAttribute5573 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleForwardedAttribute5595 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_ruleForwardedAttribute5621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFireEvents_in_entryRuleFireEvents5657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFireEvents5667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleFireEvents5713 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleFireEvents5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventCriteria_in_entryRuleEventCriteria5770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventCriteria5780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEventCriteria5822 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEventCriteria5844 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEventCriteria5866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrProperties_in_entryRuleAttrProperties5907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrProperties5917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5959 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5981 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6025 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6047 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6069 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6091 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6113 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6135 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6179 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6201 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6223 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionalFile_in_entryRuleAdditionalFile6286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionalFile6296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAdditionalFile6338 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAdditionalFile6360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverlodedPollPeriodObject_in_entryRuleOverlodedPollPeriodObject6401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverlodedPollPeriodObject6411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOverlodedPollPeriodObject6453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOverlodedPollPeriodObject6475 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOverlodedPollPeriodObject6497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePipe_in_entryRulePipe6538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePipe6548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePipe6590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePipe6612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePipe6634 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_ruleRW_PipeType_in_rulePipe6660 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_ruleDisplayLevel_in_rulePipe6681 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_rulePipe6693 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePipe6710 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_52_in_rulePipe6728 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePipe6745 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleRW_PipeType_in_entryRuleRW_PipeType6788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRW_PipeType6799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleRW_PipeType6837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleRW_PipeType6856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType6896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType6906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidType_in_ruleType6953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_ruleType6980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortType_in_ruleType7007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortType_in_ruleType7034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_ruleType7061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntType_in_ruleType7088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_ruleType7115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_ruleType7142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_ruleType7169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharArrayType_in_ruleType7196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortArrayType_in_ruleType7223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortArrayType_in_ruleType7250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntArrayType_in_ruleType7277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntArrayType_in_ruleType7304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatArrayType_in_ruleType7331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleArrayType_in_ruleType7358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringArrayType_in_ruleType7385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongStringArrayType_in_ruleType7412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleStringArrayType_in_ruleType7439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleType7466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstStringType_in_ruleType7493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanArrayType_in_ruleType7520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_ruleType7547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongType_in_ruleType7574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUCharType_in_ruleType7601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongArrayType_in_ruleType7628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongArrayType_in_ruleType7655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDevIntType_in_ruleType7682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncodedType_in_ruleType7709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_ruleType7736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidType_in_entryRuleVoidType7771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVoidType7781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleVoidType7827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_entryRuleBooleanType7863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanType7873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleBooleanType7919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortType_in_entryRuleShortType7955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortType7965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleShortType8011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortType_in_entryRuleUShortType8047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUShortType8057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleUShortType8103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_entryRuleIntType8139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntType8149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleIntType8195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntType_in_entryRuleUIntType8231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIntType8241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleUIntType8287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_entryRuleFloatType8323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatType8333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleFloatType8379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_entryRuleDoubleType8415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleType8425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleDoubleType8471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType8507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType8517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleStringType8563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharArrayType_in_entryRuleCharArrayType8599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharArrayType8609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleCharArrayType8655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortArrayType_in_entryRuleShortArrayType8691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortArrayType8701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleShortArrayType8747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortArrayType_in_entryRuleUShortArrayType8783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUShortArrayType8793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleUShortArrayType8839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntArrayType_in_entryRuleIntArrayType8875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntArrayType8885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleIntArrayType8931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntArrayType_in_entryRuleUIntArrayType8967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIntArrayType8977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleUIntArrayType9023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatArrayType_in_entryRuleFloatArrayType9059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatArrayType9069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleFloatArrayType9115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleArrayType_in_entryRuleDoubleArrayType9151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleArrayType9161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleDoubleArrayType9207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringArrayType_in_entryRuleStringArrayType9243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringArrayType9253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleStringArrayType9299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongStringArrayType_in_entryRuleLongStringArrayType9335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongStringArrayType9345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleLongStringArrayType9391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleStringArrayType_in_entryRuleDoubleStringArrayType9427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleStringArrayType9437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleDoubleStringArrayType9483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_entryRuleStateType9519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateType9529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleStateType9575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstStringType_in_entryRuleConstStringType9611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstStringType9621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleConstStringType9667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanArrayType_in_entryRuleBooleanArrayType9703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanArrayType9713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleBooleanArrayType9759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUCharType_in_entryRuleUCharType9795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUCharType9805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleUCharType9851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_entryRuleLongType9887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongType9897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleLongType9943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongType_in_entryRuleULongType9979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleULongType9989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleULongType10035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongArrayType_in_entryRuleLongArrayType10071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongArrayType10081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleLongArrayType10127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongArrayType_in_entryRuleULongArrayType10163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleULongArrayType10173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleULongArrayType10219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDevIntType_in_entryRuleDevIntType10255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDevIntType10265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleDevIntType10311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncodedType_in_entryRuleEncodedType10347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEncodedType10357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleEncodedType10403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_entryRuleEnumType10439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumType10449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleEnumType10495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortVectorType_in_entryRuleShortVectorType10531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortVectorType10541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleShortVectorType10587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntVectorType_in_entryRuleIntVectorType10623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntVectorType10633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleIntVectorType10679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongVectorType_in_entryRuleLongVectorType10715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongVectorType10725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleLongVectorType10771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongVectorType_in_entryRuleULongVectorType10807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleULongVectorType10817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleULongVectorType10863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatVectorType_in_entryRuleFloatVectorType10899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatVectorType10909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleFloatVectorType10955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleVectorType_in_entryRuleDoubleVectorType10991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleVectorType11001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleDoubleVectorType11047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVectorType_in_entryRuleStringVectorType11083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringVectorType11093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleStringVectorType11139 = new BitSet(new long[]{0x0000000000000002L});

}