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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'multiclasses'", "'{'", "'classes:'", "'}'", "'inheritances:'", "'parentClasses:'", "'additionalFiles:'", "'deviceclass'", "'abstract'", "'extends'", "'description:'", "'classProperties:'", "'deviceProperties:'", "'commands:'", "'attributes:'", "'dynamicAttributes:'", "'states:'", "'Cpp'", "'Java'", "'Python'", "'OPERATOR'", "'EXPERT'", "'Scalar'", "'Spectrum'", "'Image'", "'READ'", "'WRITE'", "'READ_WRITE'", "'READ_WITH_WRITE'", "'true'", "'false'", "'defaultPropValue:'", "'excludedStates:'", "'readExcludedStates:'", "'writeExcludedStates:'", "'void'", "'boolean'", "'short'", "'ushort'", "'int'", "'uint'", "'float'", "'double'", "'string'", "'DevVarCharArray'", "'DevVarShortArray'", "'DevVarUShortArray'", "'DevVarLongArray'", "'DevVarULongArray'", "'DevVarFloatArray'", "'DevVarDoubleArray'", "'DevVarStringArray'", "'DevVarLongStringArray'", "'DevVarDoubleStringArray'", "'DevState'", "'ConstDevString'", "'DevVarBooleanArray'", "'DevUChar'", "'DevLong64'", "'DevULong64'", "'DevVarLong64Array'", "'DevVarULong64Array'", "'DevInt'", "'DevEncoded'", "'vector<short>'", "'vector<int>'", "'vector<float>'", "'vector<double>'", "'vector<string>'"
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

                if ( (LA3_0==12) ) {
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:194:1: rulePogoMultiClasses returns [EObject current=null] : (otherlv_0= 'multiclasses' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sourcePath_3_0= RULE_STRING ) ) ( (lv_description_4_0= RULE_STRING ) ) ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'classes:' ( (lv_classes_7_0= ruleOneClassSimpleDef ) ) ( (lv_filestogenerate_8_0= RULE_STRING ) ) ( (lv_preferences_9_0= rulePreferences ) ) otherlv_10= '}' ) ;
    public final EObject rulePogoMultiClasses() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_sourcePath_3_0=null;
        Token lv_description_4_0=null;
        Token lv_title_5_0=null;
        Token otherlv_6=null;
        Token lv_filestogenerate_8_0=null;
        Token otherlv_10=null;
        EObject lv_classes_7_0 = null;

        EObject lv_preferences_9_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:197:28: ( (otherlv_0= 'multiclasses' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sourcePath_3_0= RULE_STRING ) ) ( (lv_description_4_0= RULE_STRING ) ) ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'classes:' ( (lv_classes_7_0= ruleOneClassSimpleDef ) ) ( (lv_filestogenerate_8_0= RULE_STRING ) ) ( (lv_preferences_9_0= rulePreferences ) ) otherlv_10= '}' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:198:1: (otherlv_0= 'multiclasses' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sourcePath_3_0= RULE_STRING ) ) ( (lv_description_4_0= RULE_STRING ) ) ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'classes:' ( (lv_classes_7_0= ruleOneClassSimpleDef ) ) ( (lv_filestogenerate_8_0= RULE_STRING ) ) ( (lv_preferences_9_0= rulePreferences ) ) otherlv_10= '}' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:198:1: (otherlv_0= 'multiclasses' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sourcePath_3_0= RULE_STRING ) ) ( (lv_description_4_0= RULE_STRING ) ) ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'classes:' ( (lv_classes_7_0= ruleOneClassSimpleDef ) ) ( (lv_filestogenerate_8_0= RULE_STRING ) ) ( (lv_preferences_9_0= rulePreferences ) ) otherlv_10= '}' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:198:3: otherlv_0= 'multiclasses' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sourcePath_3_0= RULE_STRING ) ) ( (lv_description_4_0= RULE_STRING ) ) ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'classes:' ( (lv_classes_7_0= ruleOneClassSimpleDef ) ) ( (lv_filestogenerate_8_0= RULE_STRING ) ) ( (lv_preferences_9_0= rulePreferences ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_rulePogoMultiClasses364); 

                	newLeafNode(otherlv_0, grammarAccess.getPogoMultiClassesAccess().getMulticlassesKeyword_0());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:202:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:203:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:203:1: (lv_name_1_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:204:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePogoMultiClasses381); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPogoMultiClassesAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPogoMultiClassesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_rulePogoMultiClasses398); 

                	newLeafNode(otherlv_2, grammarAccess.getPogoMultiClassesAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:224:1: ( (lv_sourcePath_3_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:225:1: (lv_sourcePath_3_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:225:1: (lv_sourcePath_3_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:226:3: lv_sourcePath_3_0= RULE_STRING
            {
            lv_sourcePath_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePogoMultiClasses415); 

            			newLeafNode(lv_sourcePath_3_0, grammarAccess.getPogoMultiClassesAccess().getSourcePathSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPogoMultiClassesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"sourcePath",
                    		lv_sourcePath_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:242:2: ( (lv_description_4_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:243:1: (lv_description_4_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:243:1: (lv_description_4_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:244:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePogoMultiClasses437); 

            			newLeafNode(lv_description_4_0, grammarAccess.getPogoMultiClassesAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPogoMultiClassesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_4_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:260:2: ( (lv_title_5_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:261:1: (lv_title_5_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:261:1: (lv_title_5_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:262:3: lv_title_5_0= RULE_STRING
            {
            lv_title_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePogoMultiClasses459); 

            			newLeafNode(lv_title_5_0, grammarAccess.getPogoMultiClassesAccess().getTitleSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPogoMultiClassesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_5_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_rulePogoMultiClasses476); 

                	newLeafNode(otherlv_6, grammarAccess.getPogoMultiClassesAccess().getClassesKeyword_6());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:282:1: ( (lv_classes_7_0= ruleOneClassSimpleDef ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:283:1: (lv_classes_7_0= ruleOneClassSimpleDef )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:283:1: (lv_classes_7_0= ruleOneClassSimpleDef )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:284:3: lv_classes_7_0= ruleOneClassSimpleDef
            {
             
            	        newCompositeNode(grammarAccess.getPogoMultiClassesAccess().getClassesOneClassSimpleDefParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleOneClassSimpleDef_in_rulePogoMultiClasses497);
            lv_classes_7_0=ruleOneClassSimpleDef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPogoMultiClassesRule());
            	        }
                   		add(
                   			current, 
                   			"classes",
                    		lv_classes_7_0, 
                    		"OneClassSimpleDef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:300:2: ( (lv_filestogenerate_8_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:301:1: (lv_filestogenerate_8_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:301:1: (lv_filestogenerate_8_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:302:3: lv_filestogenerate_8_0= RULE_STRING
            {
            lv_filestogenerate_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePogoMultiClasses514); 

            			newLeafNode(lv_filestogenerate_8_0, grammarAccess.getPogoMultiClassesAccess().getFilestogenerateSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPogoMultiClassesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"filestogenerate",
                    		lv_filestogenerate_8_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:318:2: ( (lv_preferences_9_0= rulePreferences ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:319:1: (lv_preferences_9_0= rulePreferences )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:319:1: (lv_preferences_9_0= rulePreferences )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:320:3: lv_preferences_9_0= rulePreferences
            {
             
            	        newCompositeNode(grammarAccess.getPogoMultiClassesAccess().getPreferencesPreferencesParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_rulePreferences_in_rulePogoMultiClasses540);
            lv_preferences_9_0=rulePreferences();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPogoMultiClassesRule());
            	        }
                   		set(
                   			current, 
                   			"preferences",
                    		lv_preferences_9_0, 
                    		"Preferences");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_rulePogoMultiClasses552); 

                	newLeafNode(otherlv_10, grammarAccess.getPogoMultiClassesAccess().getRightCurlyBracketKeyword_10());
                

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:348:1: entryRuleOneClassSimpleDef returns [EObject current=null] : iv_ruleOneClassSimpleDef= ruleOneClassSimpleDef EOF ;
    public final EObject entryRuleOneClassSimpleDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneClassSimpleDef = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:349:2: (iv_ruleOneClassSimpleDef= ruleOneClassSimpleDef EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:350:2: iv_ruleOneClassSimpleDef= ruleOneClassSimpleDef EOF
            {
             newCompositeNode(grammarAccess.getOneClassSimpleDefRule()); 
            pushFollow(FOLLOW_ruleOneClassSimpleDef_in_entryRuleOneClassSimpleDef588);
            iv_ruleOneClassSimpleDef=ruleOneClassSimpleDef();

            state._fsp--;

             current =iv_ruleOneClassSimpleDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneClassSimpleDef598); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:357:1: ruleOneClassSimpleDef returns [EObject current=null] : ( ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) ( (lv_pogo6_2_0= ruleBoolean ) ) otherlv_3= 'inheritances:' ( (lv_inheritances_4_0= ruleInheritance ) ) otherlv_5= 'parentClasses:' ( (lv_parentClasses_6_0= RULE_STRING ) ) otherlv_7= 'additionalFiles:' ( (lv_additionalFiles_8_0= ruleAdditionalFile ) )* ) ;
    public final EObject ruleOneClassSimpleDef() throws RecognitionException {
        EObject current = null;

        Token lv_classname_0_0=null;
        Token lv_sourcePath_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_parentClasses_6_0=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_pogo6_2_0 = null;

        EObject lv_inheritances_4_0 = null;

        EObject lv_additionalFiles_8_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:360:28: ( ( ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) ( (lv_pogo6_2_0= ruleBoolean ) ) otherlv_3= 'inheritances:' ( (lv_inheritances_4_0= ruleInheritance ) ) otherlv_5= 'parentClasses:' ( (lv_parentClasses_6_0= RULE_STRING ) ) otherlv_7= 'additionalFiles:' ( (lv_additionalFiles_8_0= ruleAdditionalFile ) )* ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:361:1: ( ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) ( (lv_pogo6_2_0= ruleBoolean ) ) otherlv_3= 'inheritances:' ( (lv_inheritances_4_0= ruleInheritance ) ) otherlv_5= 'parentClasses:' ( (lv_parentClasses_6_0= RULE_STRING ) ) otherlv_7= 'additionalFiles:' ( (lv_additionalFiles_8_0= ruleAdditionalFile ) )* )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:361:1: ( ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) ( (lv_pogo6_2_0= ruleBoolean ) ) otherlv_3= 'inheritances:' ( (lv_inheritances_4_0= ruleInheritance ) ) otherlv_5= 'parentClasses:' ( (lv_parentClasses_6_0= RULE_STRING ) ) otherlv_7= 'additionalFiles:' ( (lv_additionalFiles_8_0= ruleAdditionalFile ) )* )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:361:2: ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) ( (lv_pogo6_2_0= ruleBoolean ) ) otherlv_3= 'inheritances:' ( (lv_inheritances_4_0= ruleInheritance ) ) otherlv_5= 'parentClasses:' ( (lv_parentClasses_6_0= RULE_STRING ) ) otherlv_7= 'additionalFiles:' ( (lv_additionalFiles_8_0= ruleAdditionalFile ) )*
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:361:2: ( (lv_classname_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:362:1: (lv_classname_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:362:1: (lv_classname_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:363:3: lv_classname_0_0= RULE_STRING
            {
            lv_classname_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOneClassSimpleDef640); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:379:2: ( (lv_sourcePath_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:380:1: (lv_sourcePath_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:380:1: (lv_sourcePath_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:381:3: lv_sourcePath_1_0= RULE_STRING
            {
            lv_sourcePath_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOneClassSimpleDef662); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:397:2: ( (lv_pogo6_2_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:398:1: (lv_pogo6_2_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:398:1: (lv_pogo6_2_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:399:3: lv_pogo6_2_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getOneClassSimpleDefAccess().getPogo6BooleanParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleOneClassSimpleDef688);
            lv_pogo6_2_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOneClassSimpleDefRule());
            	        }
                   		set(
                   			current, 
                   			"pogo6",
                    		lv_pogo6_2_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleOneClassSimpleDef700); 

                	newLeafNode(otherlv_3, grammarAccess.getOneClassSimpleDefAccess().getInheritancesKeyword_3());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:419:1: ( (lv_inheritances_4_0= ruleInheritance ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:420:1: (lv_inheritances_4_0= ruleInheritance )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:420:1: (lv_inheritances_4_0= ruleInheritance )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:421:3: lv_inheritances_4_0= ruleInheritance
            {
             
            	        newCompositeNode(grammarAccess.getOneClassSimpleDefAccess().getInheritancesInheritanceParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleInheritance_in_ruleOneClassSimpleDef721);
            lv_inheritances_4_0=ruleInheritance();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOneClassSimpleDefRule());
            	        }
                   		add(
                   			current, 
                   			"inheritances",
                    		lv_inheritances_4_0, 
                    		"Inheritance");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleOneClassSimpleDef733); 

                	newLeafNode(otherlv_5, grammarAccess.getOneClassSimpleDefAccess().getParentClassesKeyword_5());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:441:1: ( (lv_parentClasses_6_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:442:1: (lv_parentClasses_6_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:442:1: (lv_parentClasses_6_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:443:3: lv_parentClasses_6_0= RULE_STRING
            {
            lv_parentClasses_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOneClassSimpleDef750); 

            			newLeafNode(lv_parentClasses_6_0, grammarAccess.getOneClassSimpleDefAccess().getParentClassesSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOneClassSimpleDefRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"parentClasses",
                    		lv_parentClasses_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleOneClassSimpleDef767); 

                	newLeafNode(otherlv_7, grammarAccess.getOneClassSimpleDefAccess().getAdditionalFilesKeyword_7());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:463:1: ( (lv_additionalFiles_8_0= ruleAdditionalFile ) )*
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
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:464:1: (lv_additionalFiles_8_0= ruleAdditionalFile )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:464:1: (lv_additionalFiles_8_0= ruleAdditionalFile )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:465:3: lv_additionalFiles_8_0= ruleAdditionalFile
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOneClassSimpleDefAccess().getAdditionalFilesAdditionalFileParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAdditionalFile_in_ruleOneClassSimpleDef788);
            	    lv_additionalFiles_8_0=ruleAdditionalFile();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOneClassSimpleDefRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"additionalFiles",
            	            		lv_additionalFiles_8_0, 
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:489:1: entryRulePogoDeviceClass returns [EObject current=null] : iv_rulePogoDeviceClass= rulePogoDeviceClass EOF ;
    public final EObject entryRulePogoDeviceClass() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePogoDeviceClass = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:490:2: (iv_rulePogoDeviceClass= rulePogoDeviceClass EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:491:2: iv_rulePogoDeviceClass= rulePogoDeviceClass EOF
            {
             newCompositeNode(grammarAccess.getPogoDeviceClassRule()); 
            pushFollow(FOLLOW_rulePogoDeviceClass_in_entryRulePogoDeviceClass825);
            iv_rulePogoDeviceClass=rulePogoDeviceClass();

            state._fsp--;

             current =iv_rulePogoDeviceClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePogoDeviceClass835); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:498:1: rulePogoDeviceClass returns [EObject current=null] : (otherlv_0= 'deviceclass' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isAbstract_2_0= 'abstract' ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_institute_6_0= RULE_ID ) ) otherlv_7= 'description:' ( (lv_description_8_0= ruleClassDescription ) ) otherlv_9= 'classProperties:' ( (lv_classProperties_10_0= ruleProperty ) )* otherlv_11= 'deviceProperties:' ( (lv_deviceProperties_12_0= ruleProperty ) )* otherlv_13= 'commands:' ( (lv_commands_14_0= ruleCommand ) )* otherlv_15= 'attributes:' ( (lv_attributes_16_0= ruleAttribute ) )* otherlv_17= 'dynamicAttributes:' ( (lv_dynamicAttributes_18_0= ruleAttribute ) )* otherlv_19= 'states:' ( (lv_states_20_0= ruleState ) )* ( (lv_preferences_21_0= rulePreferences ) ) otherlv_22= 'additionalFiles:' ( (lv_additionalFiles_23_0= ruleAdditionalFile ) )* otherlv_24= '}' ) ;
    public final EObject rulePogoDeviceClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_isAbstract_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_institute_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        EObject lv_description_8_0 = null;

        EObject lv_classProperties_10_0 = null;

        EObject lv_deviceProperties_12_0 = null;

        EObject lv_commands_14_0 = null;

        EObject lv_attributes_16_0 = null;

        EObject lv_dynamicAttributes_18_0 = null;

        EObject lv_states_20_0 = null;

        EObject lv_preferences_21_0 = null;

        EObject lv_additionalFiles_23_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:501:28: ( (otherlv_0= 'deviceclass' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isAbstract_2_0= 'abstract' ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_institute_6_0= RULE_ID ) ) otherlv_7= 'description:' ( (lv_description_8_0= ruleClassDescription ) ) otherlv_9= 'classProperties:' ( (lv_classProperties_10_0= ruleProperty ) )* otherlv_11= 'deviceProperties:' ( (lv_deviceProperties_12_0= ruleProperty ) )* otherlv_13= 'commands:' ( (lv_commands_14_0= ruleCommand ) )* otherlv_15= 'attributes:' ( (lv_attributes_16_0= ruleAttribute ) )* otherlv_17= 'dynamicAttributes:' ( (lv_dynamicAttributes_18_0= ruleAttribute ) )* otherlv_19= 'states:' ( (lv_states_20_0= ruleState ) )* ( (lv_preferences_21_0= rulePreferences ) ) otherlv_22= 'additionalFiles:' ( (lv_additionalFiles_23_0= ruleAdditionalFile ) )* otherlv_24= '}' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:502:1: (otherlv_0= 'deviceclass' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isAbstract_2_0= 'abstract' ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_institute_6_0= RULE_ID ) ) otherlv_7= 'description:' ( (lv_description_8_0= ruleClassDescription ) ) otherlv_9= 'classProperties:' ( (lv_classProperties_10_0= ruleProperty ) )* otherlv_11= 'deviceProperties:' ( (lv_deviceProperties_12_0= ruleProperty ) )* otherlv_13= 'commands:' ( (lv_commands_14_0= ruleCommand ) )* otherlv_15= 'attributes:' ( (lv_attributes_16_0= ruleAttribute ) )* otherlv_17= 'dynamicAttributes:' ( (lv_dynamicAttributes_18_0= ruleAttribute ) )* otherlv_19= 'states:' ( (lv_states_20_0= ruleState ) )* ( (lv_preferences_21_0= rulePreferences ) ) otherlv_22= 'additionalFiles:' ( (lv_additionalFiles_23_0= ruleAdditionalFile ) )* otherlv_24= '}' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:502:1: (otherlv_0= 'deviceclass' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isAbstract_2_0= 'abstract' ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_institute_6_0= RULE_ID ) ) otherlv_7= 'description:' ( (lv_description_8_0= ruleClassDescription ) ) otherlv_9= 'classProperties:' ( (lv_classProperties_10_0= ruleProperty ) )* otherlv_11= 'deviceProperties:' ( (lv_deviceProperties_12_0= ruleProperty ) )* otherlv_13= 'commands:' ( (lv_commands_14_0= ruleCommand ) )* otherlv_15= 'attributes:' ( (lv_attributes_16_0= ruleAttribute ) )* otherlv_17= 'dynamicAttributes:' ( (lv_dynamicAttributes_18_0= ruleAttribute ) )* otherlv_19= 'states:' ( (lv_states_20_0= ruleState ) )* ( (lv_preferences_21_0= rulePreferences ) ) otherlv_22= 'additionalFiles:' ( (lv_additionalFiles_23_0= ruleAdditionalFile ) )* otherlv_24= '}' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:502:3: otherlv_0= 'deviceclass' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isAbstract_2_0= 'abstract' ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_institute_6_0= RULE_ID ) ) otherlv_7= 'description:' ( (lv_description_8_0= ruleClassDescription ) ) otherlv_9= 'classProperties:' ( (lv_classProperties_10_0= ruleProperty ) )* otherlv_11= 'deviceProperties:' ( (lv_deviceProperties_12_0= ruleProperty ) )* otherlv_13= 'commands:' ( (lv_commands_14_0= ruleCommand ) )* otherlv_15= 'attributes:' ( (lv_attributes_16_0= ruleAttribute ) )* otherlv_17= 'dynamicAttributes:' ( (lv_dynamicAttributes_18_0= ruleAttribute ) )* otherlv_19= 'states:' ( (lv_states_20_0= ruleState ) )* ( (lv_preferences_21_0= rulePreferences ) ) otherlv_22= 'additionalFiles:' ( (lv_additionalFiles_23_0= ruleAdditionalFile ) )* otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_rulePogoDeviceClass872); 

                	newLeafNode(otherlv_0, grammarAccess.getPogoDeviceClassAccess().getDeviceclassKeyword_0());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:506:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:507:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:507:1: (lv_name_1_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:508:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePogoDeviceClass889); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:524:2: ( (lv_isAbstract_2_0= 'abstract' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:525:1: (lv_isAbstract_2_0= 'abstract' )
                    {
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:525:1: (lv_isAbstract_2_0= 'abstract' )
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:526:3: lv_isAbstract_2_0= 'abstract'
                    {
                    lv_isAbstract_2_0=(Token)match(input,20,FOLLOW_20_in_rulePogoDeviceClass912); 

                            newLeafNode(lv_isAbstract_2_0, grammarAccess.getPogoDeviceClassAccess().getIsAbstractAbstractKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPogoDeviceClassRule());
                    	        }
                           		setWithLastConsumed(current, "isAbstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:539:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:539:5: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_rulePogoDeviceClass939); 

                        	newLeafNode(otherlv_3, grammarAccess.getPogoDeviceClassAccess().getExtendsKeyword_3_0());
                        
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:543:1: ( (otherlv_4= RULE_ID ) )
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:544:1: (otherlv_4= RULE_ID )
                    {
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:544:1: (otherlv_4= RULE_ID )
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:545:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPogoDeviceClassRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePogoDeviceClass959); 

                    		newLeafNode(otherlv_4, grammarAccess.getPogoDeviceClassAccess().getBaseClassPogoDeviceClassCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_rulePogoDeviceClass973); 

                	newLeafNode(otherlv_5, grammarAccess.getPogoDeviceClassAccess().getLeftCurlyBracketKeyword_4());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:560:1: ( (lv_institute_6_0= RULE_ID ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:561:1: (lv_institute_6_0= RULE_ID )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:561:1: (lv_institute_6_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:562:3: lv_institute_6_0= RULE_ID
            {
            lv_institute_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePogoDeviceClass990); 

            			newLeafNode(lv_institute_6_0, grammarAccess.getPogoDeviceClassAccess().getInstituteIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPogoDeviceClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"institute",
                    		lv_institute_6_0, 
                    		"ID");
            	    

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_rulePogoDeviceClass1007); 

                	newLeafNode(otherlv_7, grammarAccess.getPogoDeviceClassAccess().getDescriptionKeyword_6());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:582:1: ( (lv_description_8_0= ruleClassDescription ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:583:1: (lv_description_8_0= ruleClassDescription )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:583:1: (lv_description_8_0= ruleClassDescription )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:584:3: lv_description_8_0= ruleClassDescription
            {
             
            	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getDescriptionClassDescriptionParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleClassDescription_in_rulePogoDeviceClass1028);
            lv_description_8_0=ruleClassDescription();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	        }
                   		set(
                   			current, 
                   			"description",
                    		lv_description_8_0, 
                    		"ClassDescription");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,23,FOLLOW_23_in_rulePogoDeviceClass1040); 

                	newLeafNode(otherlv_9, grammarAccess.getPogoDeviceClassAccess().getClassPropertiesKeyword_8());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:604:1: ( (lv_classProperties_10_0= ruleProperty ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:605:1: (lv_classProperties_10_0= ruleProperty )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:605:1: (lv_classProperties_10_0= ruleProperty )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:606:3: lv_classProperties_10_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getClassPropertiesPropertyParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_rulePogoDeviceClass1061);
            	    lv_classProperties_10_0=ruleProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"classProperties",
            	            		lv_classProperties_10_0, 
            	            		"Property");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_11=(Token)match(input,24,FOLLOW_24_in_rulePogoDeviceClass1074); 

                	newLeafNode(otherlv_11, grammarAccess.getPogoDeviceClassAccess().getDevicePropertiesKeyword_10());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:626:1: ( (lv_deviceProperties_12_0= ruleProperty ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:627:1: (lv_deviceProperties_12_0= ruleProperty )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:627:1: (lv_deviceProperties_12_0= ruleProperty )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:628:3: lv_deviceProperties_12_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getDevicePropertiesPropertyParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_rulePogoDeviceClass1095);
            	    lv_deviceProperties_12_0=ruleProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"deviceProperties",
            	            		lv_deviceProperties_12_0, 
            	            		"Property");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_13=(Token)match(input,25,FOLLOW_25_in_rulePogoDeviceClass1108); 

                	newLeafNode(otherlv_13, grammarAccess.getPogoDeviceClassAccess().getCommandsKeyword_12());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:648:1: ( (lv_commands_14_0= ruleCommand ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:649:1: (lv_commands_14_0= ruleCommand )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:649:1: (lv_commands_14_0= ruleCommand )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:650:3: lv_commands_14_0= ruleCommand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getCommandsCommandParserRuleCall_13_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommand_in_rulePogoDeviceClass1129);
            	    lv_commands_14_0=ruleCommand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"commands",
            	            		lv_commands_14_0, 
            	            		"Command");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_15=(Token)match(input,26,FOLLOW_26_in_rulePogoDeviceClass1142); 

                	newLeafNode(otherlv_15, grammarAccess.getPogoDeviceClassAccess().getAttributesKeyword_14());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:670:1: ( (lv_attributes_16_0= ruleAttribute ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:671:1: (lv_attributes_16_0= ruleAttribute )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:671:1: (lv_attributes_16_0= ruleAttribute )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:672:3: lv_attributes_16_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getAttributesAttributeParserRuleCall_15_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_rulePogoDeviceClass1163);
            	    lv_attributes_16_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_16_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_17=(Token)match(input,27,FOLLOW_27_in_rulePogoDeviceClass1176); 

                	newLeafNode(otherlv_17, grammarAccess.getPogoDeviceClassAccess().getDynamicAttributesKeyword_16());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:692:1: ( (lv_dynamicAttributes_18_0= ruleAttribute ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:693:1: (lv_dynamicAttributes_18_0= ruleAttribute )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:693:1: (lv_dynamicAttributes_18_0= ruleAttribute )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:694:3: lv_dynamicAttributes_18_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getDynamicAttributesAttributeParserRuleCall_17_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_rulePogoDeviceClass1197);
            	    lv_dynamicAttributes_18_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dynamicAttributes",
            	            		lv_dynamicAttributes_18_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_19=(Token)match(input,28,FOLLOW_28_in_rulePogoDeviceClass1210); 

                	newLeafNode(otherlv_19, grammarAccess.getPogoDeviceClassAccess().getStatesKeyword_18());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:714:1: ( (lv_states_20_0= ruleState ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:715:1: (lv_states_20_0= ruleState )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:715:1: (lv_states_20_0= ruleState )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:716:3: lv_states_20_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getStatesStateParserRuleCall_19_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_rulePogoDeviceClass1231);
            	    lv_states_20_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_20_0, 
            	            		"State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:732:3: ( (lv_preferences_21_0= rulePreferences ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:733:1: (lv_preferences_21_0= rulePreferences )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:733:1: (lv_preferences_21_0= rulePreferences )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:734:3: lv_preferences_21_0= rulePreferences
            {
             
            	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getPreferencesPreferencesParserRuleCall_20_0()); 
            	    
            pushFollow(FOLLOW_rulePreferences_in_rulePogoDeviceClass1253);
            lv_preferences_21_0=rulePreferences();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	        }
                   		set(
                   			current, 
                   			"preferences",
                    		lv_preferences_21_0, 
                    		"Preferences");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_22=(Token)match(input,18,FOLLOW_18_in_rulePogoDeviceClass1265); 

                	newLeafNode(otherlv_22, grammarAccess.getPogoDeviceClassAccess().getAdditionalFilesKeyword_21());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:754:1: ( (lv_additionalFiles_23_0= ruleAdditionalFile ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:755:1: (lv_additionalFiles_23_0= ruleAdditionalFile )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:755:1: (lv_additionalFiles_23_0= ruleAdditionalFile )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:756:3: lv_additionalFiles_23_0= ruleAdditionalFile
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPogoDeviceClassAccess().getAdditionalFilesAdditionalFileParserRuleCall_22_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAdditionalFile_in_rulePogoDeviceClass1286);
            	    lv_additionalFiles_23_0=ruleAdditionalFile();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPogoDeviceClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"additionalFiles",
            	            		lv_additionalFiles_23_0, 
            	            		"AdditionalFile");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_24=(Token)match(input,15,FOLLOW_15_in_rulePogoDeviceClass1299); 

                	newLeafNode(otherlv_24, grammarAccess.getPogoDeviceClassAccess().getRightCurlyBracketKeyword_23());
                

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:784:1: entryRuleLanguage returns [String current=null] : iv_ruleLanguage= ruleLanguage EOF ;
    public final String entryRuleLanguage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLanguage = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:785:2: (iv_ruleLanguage= ruleLanguage EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:786:2: iv_ruleLanguage= ruleLanguage EOF
            {
             newCompositeNode(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_ruleLanguage_in_entryRuleLanguage1336);
            iv_ruleLanguage=ruleLanguage();

            state._fsp--;

             current =iv_ruleLanguage.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLanguage1347); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:793:1: ruleLanguage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Cpp' | kw= 'Java' | kw= 'Python' ) ;
    public final AntlrDatatypeRuleToken ruleLanguage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:796:28: ( (kw= 'Cpp' | kw= 'Java' | kw= 'Python' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:797:1: (kw= 'Cpp' | kw= 'Java' | kw= 'Python' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:797:1: (kw= 'Cpp' | kw= 'Java' | kw= 'Python' )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt14=1;
                }
                break;
            case 30:
                {
                alt14=2;
                }
                break;
            case 31:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:798:2: kw= 'Cpp'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleLanguage1385); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLanguageAccess().getCppKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:805:2: kw= 'Java'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleLanguage1404); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLanguageAccess().getJavaKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:812:2: kw= 'Python'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleLanguage1423); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:825:1: entryRuleDisplayLevel returns [String current=null] : iv_ruleDisplayLevel= ruleDisplayLevel EOF ;
    public final String entryRuleDisplayLevel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDisplayLevel = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:826:2: (iv_ruleDisplayLevel= ruleDisplayLevel EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:827:2: iv_ruleDisplayLevel= ruleDisplayLevel EOF
            {
             newCompositeNode(grammarAccess.getDisplayLevelRule()); 
            pushFollow(FOLLOW_ruleDisplayLevel_in_entryRuleDisplayLevel1464);
            iv_ruleDisplayLevel=ruleDisplayLevel();

            state._fsp--;

             current =iv_ruleDisplayLevel.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisplayLevel1475); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:834:1: ruleDisplayLevel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'OPERATOR' | kw= 'EXPERT' ) ;
    public final AntlrDatatypeRuleToken ruleDisplayLevel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:837:28: ( (kw= 'OPERATOR' | kw= 'EXPERT' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:838:1: (kw= 'OPERATOR' | kw= 'EXPERT' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:838:1: (kw= 'OPERATOR' | kw= 'EXPERT' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            else if ( (LA15_0==33) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:839:2: kw= 'OPERATOR'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleDisplayLevel1513); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDisplayLevelAccess().getOPERATORKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:846:2: kw= 'EXPERT'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleDisplayLevel1532); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:859:1: entryRuleAttrType returns [String current=null] : iv_ruleAttrType= ruleAttrType EOF ;
    public final String entryRuleAttrType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttrType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:860:2: (iv_ruleAttrType= ruleAttrType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:861:2: iv_ruleAttrType= ruleAttrType EOF
            {
             newCompositeNode(grammarAccess.getAttrTypeRule()); 
            pushFollow(FOLLOW_ruleAttrType_in_entryRuleAttrType1573);
            iv_ruleAttrType=ruleAttrType();

            state._fsp--;

             current =iv_ruleAttrType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrType1584); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:868:1: ruleAttrType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Scalar' | kw= 'Spectrum' | kw= 'Image' ) ;
    public final AntlrDatatypeRuleToken ruleAttrType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:871:28: ( (kw= 'Scalar' | kw= 'Spectrum' | kw= 'Image' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:872:1: (kw= 'Scalar' | kw= 'Spectrum' | kw= 'Image' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:872:1: (kw= 'Scalar' | kw= 'Spectrum' | kw= 'Image' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt16=1;
                }
                break;
            case 35:
                {
                alt16=2;
                }
                break;
            case 36:
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
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:873:2: kw= 'Scalar'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleAttrType1622); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAttrTypeAccess().getScalarKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:880:2: kw= 'Spectrum'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleAttrType1641); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAttrTypeAccess().getSpectrumKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:887:2: kw= 'Image'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleAttrType1660); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:900:1: entryRuleRW_Type returns [String current=null] : iv_ruleRW_Type= ruleRW_Type EOF ;
    public final String entryRuleRW_Type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRW_Type = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:901:2: (iv_ruleRW_Type= ruleRW_Type EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:902:2: iv_ruleRW_Type= ruleRW_Type EOF
            {
             newCompositeNode(grammarAccess.getRW_TypeRule()); 
            pushFollow(FOLLOW_ruleRW_Type_in_entryRuleRW_Type1701);
            iv_ruleRW_Type=ruleRW_Type();

            state._fsp--;

             current =iv_ruleRW_Type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRW_Type1712); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:909:1: ruleRW_Type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'READ' | kw= 'WRITE' | kw= 'READ_WRITE' | kw= 'READ_WITH_WRITE' ) ;
    public final AntlrDatatypeRuleToken ruleRW_Type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:912:28: ( (kw= 'READ' | kw= 'WRITE' | kw= 'READ_WRITE' | kw= 'READ_WITH_WRITE' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:913:1: (kw= 'READ' | kw= 'WRITE' | kw= 'READ_WRITE' | kw= 'READ_WITH_WRITE' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:913:1: (kw= 'READ' | kw= 'WRITE' | kw= 'READ_WRITE' | kw= 'READ_WITH_WRITE' )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt17=1;
                }
                break;
            case 38:
                {
                alt17=2;
                }
                break;
            case 39:
                {
                alt17=3;
                }
                break;
            case 40:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:914:2: kw= 'READ'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleRW_Type1750); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRW_TypeAccess().getREADKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:921:2: kw= 'WRITE'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleRW_Type1769); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRW_TypeAccess().getWRITEKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:928:2: kw= 'READ_WRITE'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleRW_Type1788); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRW_TypeAccess().getREAD_WRITEKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:935:2: kw= 'READ_WITH_WRITE'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleRW_Type1807); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:948:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:949:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:950:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean1848);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean1859); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:957:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:960:28: ( (kw= 'true' | kw= 'false' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:961:1: (kw= 'true' | kw= 'false' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:961:1: (kw= 'true' | kw= 'false' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==41) ) {
                alt18=1;
            }
            else if ( (LA18_0==42) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:962:2: kw= 'true'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleBoolean1897); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:969:2: kw= 'false'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleBoolean1916); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:982:1: entryRuleClassDescription returns [EObject current=null] : iv_ruleClassDescription= ruleClassDescription EOF ;
    public final EObject entryRuleClassDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDescription = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:983:2: (iv_ruleClassDescription= ruleClassDescription EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:984:2: iv_ruleClassDescription= ruleClassDescription EOF
            {
             newCompositeNode(grammarAccess.getClassDescriptionRule()); 
            pushFollow(FOLLOW_ruleClassDescription_in_entryRuleClassDescription1956);
            iv_ruleClassDescription=ruleClassDescription();

            state._fsp--;

             current =iv_ruleClassDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassDescription1966); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:991:1: ruleClassDescription returns [EObject current=null] : ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_title_1_0= RULE_STRING ) ) ( (lv_sourcePath_2_0= RULE_STRING ) ) otherlv_3= 'inheritances:' ( (lv_inheritances_4_0= ruleInheritance ) ) ( (lv_language_5_0= ruleLanguage ) ) ( (lv_filestogenerate_6_0= RULE_STRING ) ) ( (lv_identification_7_0= ruleClassIdentification ) ) ( (lv_comments_8_0= ruleComments ) ) ( (lv_hasMandatoryProperty_9_0= ruleBoolean ) ) ( (lv_hasAbstractCommand_10_0= ruleBoolean ) ) ( (lv_hasAbstractAttribute_11_0= ruleBoolean ) ) ( (lv_descriptionHtmlExists_12_0= ruleBoolean ) ) ) ;
    public final EObject ruleClassDescription() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token lv_title_1_0=null;
        Token lv_sourcePath_2_0=null;
        Token otherlv_3=null;
        Token lv_filestogenerate_6_0=null;
        EObject lv_inheritances_4_0 = null;

        AntlrDatatypeRuleToken lv_language_5_0 = null;

        EObject lv_identification_7_0 = null;

        EObject lv_comments_8_0 = null;

        AntlrDatatypeRuleToken lv_hasMandatoryProperty_9_0 = null;

        AntlrDatatypeRuleToken lv_hasAbstractCommand_10_0 = null;

        AntlrDatatypeRuleToken lv_hasAbstractAttribute_11_0 = null;

        AntlrDatatypeRuleToken lv_descriptionHtmlExists_12_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:994:28: ( ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_title_1_0= RULE_STRING ) ) ( (lv_sourcePath_2_0= RULE_STRING ) ) otherlv_3= 'inheritances:' ( (lv_inheritances_4_0= ruleInheritance ) ) ( (lv_language_5_0= ruleLanguage ) ) ( (lv_filestogenerate_6_0= RULE_STRING ) ) ( (lv_identification_7_0= ruleClassIdentification ) ) ( (lv_comments_8_0= ruleComments ) ) ( (lv_hasMandatoryProperty_9_0= ruleBoolean ) ) ( (lv_hasAbstractCommand_10_0= ruleBoolean ) ) ( (lv_hasAbstractAttribute_11_0= ruleBoolean ) ) ( (lv_descriptionHtmlExists_12_0= ruleBoolean ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:995:1: ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_title_1_0= RULE_STRING ) ) ( (lv_sourcePath_2_0= RULE_STRING ) ) otherlv_3= 'inheritances:' ( (lv_inheritances_4_0= ruleInheritance ) ) ( (lv_language_5_0= ruleLanguage ) ) ( (lv_filestogenerate_6_0= RULE_STRING ) ) ( (lv_identification_7_0= ruleClassIdentification ) ) ( (lv_comments_8_0= ruleComments ) ) ( (lv_hasMandatoryProperty_9_0= ruleBoolean ) ) ( (lv_hasAbstractCommand_10_0= ruleBoolean ) ) ( (lv_hasAbstractAttribute_11_0= ruleBoolean ) ) ( (lv_descriptionHtmlExists_12_0= ruleBoolean ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:995:1: ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_title_1_0= RULE_STRING ) ) ( (lv_sourcePath_2_0= RULE_STRING ) ) otherlv_3= 'inheritances:' ( (lv_inheritances_4_0= ruleInheritance ) ) ( (lv_language_5_0= ruleLanguage ) ) ( (lv_filestogenerate_6_0= RULE_STRING ) ) ( (lv_identification_7_0= ruleClassIdentification ) ) ( (lv_comments_8_0= ruleComments ) ) ( (lv_hasMandatoryProperty_9_0= ruleBoolean ) ) ( (lv_hasAbstractCommand_10_0= ruleBoolean ) ) ( (lv_hasAbstractAttribute_11_0= ruleBoolean ) ) ( (lv_descriptionHtmlExists_12_0= ruleBoolean ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:995:2: ( (lv_description_0_0= RULE_STRING ) ) ( (lv_title_1_0= RULE_STRING ) ) ( (lv_sourcePath_2_0= RULE_STRING ) ) otherlv_3= 'inheritances:' ( (lv_inheritances_4_0= ruleInheritance ) ) ( (lv_language_5_0= ruleLanguage ) ) ( (lv_filestogenerate_6_0= RULE_STRING ) ) ( (lv_identification_7_0= ruleClassIdentification ) ) ( (lv_comments_8_0= ruleComments ) ) ( (lv_hasMandatoryProperty_9_0= ruleBoolean ) ) ( (lv_hasAbstractCommand_10_0= ruleBoolean ) ) ( (lv_hasAbstractAttribute_11_0= ruleBoolean ) ) ( (lv_descriptionHtmlExists_12_0= ruleBoolean ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:995:2: ( (lv_description_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:996:1: (lv_description_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:996:1: (lv_description_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:997:3: lv_description_0_0= RULE_STRING
            {
            lv_description_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassDescription2008); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1013:2: ( (lv_title_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1014:1: (lv_title_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1014:1: (lv_title_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1015:3: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassDescription2030); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1031:2: ( (lv_sourcePath_2_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1032:1: (lv_sourcePath_2_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1032:1: (lv_sourcePath_2_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1033:3: lv_sourcePath_2_0= RULE_STRING
            {
            lv_sourcePath_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassDescription2052); 

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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleClassDescription2069); 

                	newLeafNode(otherlv_3, grammarAccess.getClassDescriptionAccess().getInheritancesKeyword_3());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1053:1: ( (lv_inheritances_4_0= ruleInheritance ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1054:1: (lv_inheritances_4_0= ruleInheritance )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1054:1: (lv_inheritances_4_0= ruleInheritance )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1055:3: lv_inheritances_4_0= ruleInheritance
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getInheritancesInheritanceParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleInheritance_in_ruleClassDescription2090);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1071:2: ( (lv_language_5_0= ruleLanguage ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1072:1: (lv_language_5_0= ruleLanguage )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1072:1: (lv_language_5_0= ruleLanguage )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1073:3: lv_language_5_0= ruleLanguage
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getLanguageLanguageParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleLanguage_in_ruleClassDescription2111);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1089:2: ( (lv_filestogenerate_6_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1090:1: (lv_filestogenerate_6_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1090:1: (lv_filestogenerate_6_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1091:3: lv_filestogenerate_6_0= RULE_STRING
            {
            lv_filestogenerate_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassDescription2128); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1107:2: ( (lv_identification_7_0= ruleClassIdentification ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1108:1: (lv_identification_7_0= ruleClassIdentification )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1108:1: (lv_identification_7_0= ruleClassIdentification )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1109:3: lv_identification_7_0= ruleClassIdentification
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getIdentificationClassIdentificationParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleClassIdentification_in_ruleClassDescription2154);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1125:2: ( (lv_comments_8_0= ruleComments ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1126:1: (lv_comments_8_0= ruleComments )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1126:1: (lv_comments_8_0= ruleComments )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1127:3: lv_comments_8_0= ruleComments
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getCommentsCommentsParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleComments_in_ruleClassDescription2175);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1143:2: ( (lv_hasMandatoryProperty_9_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1144:1: (lv_hasMandatoryProperty_9_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1144:1: (lv_hasMandatoryProperty_9_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1145:3: lv_hasMandatoryProperty_9_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getHasMandatoryPropertyBooleanParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleClassDescription2196);
            lv_hasMandatoryProperty_9_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassDescriptionRule());
            	        }
                   		set(
                   			current, 
                   			"hasMandatoryProperty",
                    		lv_hasMandatoryProperty_9_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1161:2: ( (lv_hasAbstractCommand_10_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1162:1: (lv_hasAbstractCommand_10_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1162:1: (lv_hasAbstractCommand_10_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1163:3: lv_hasAbstractCommand_10_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getHasAbstractCommandBooleanParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleClassDescription2217);
            lv_hasAbstractCommand_10_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassDescriptionRule());
            	        }
                   		set(
                   			current, 
                   			"hasAbstractCommand",
                    		lv_hasAbstractCommand_10_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1179:2: ( (lv_hasAbstractAttribute_11_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1180:1: (lv_hasAbstractAttribute_11_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1180:1: (lv_hasAbstractAttribute_11_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1181:3: lv_hasAbstractAttribute_11_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getHasAbstractAttributeBooleanParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleClassDescription2238);
            lv_hasAbstractAttribute_11_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassDescriptionRule());
            	        }
                   		set(
                   			current, 
                   			"hasAbstractAttribute",
                    		lv_hasAbstractAttribute_11_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1197:2: ( (lv_descriptionHtmlExists_12_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1198:1: (lv_descriptionHtmlExists_12_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1198:1: (lv_descriptionHtmlExists_12_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1199:3: lv_descriptionHtmlExists_12_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getClassDescriptionAccess().getDescriptionHtmlExistsBooleanParserRuleCall_12_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleClassDescription2259);
            lv_descriptionHtmlExists_12_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassDescriptionRule());
            	        }
                   		set(
                   			current, 
                   			"descriptionHtmlExists",
                    		lv_descriptionHtmlExists_12_0, 
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1223:1: entryRuleInheritance returns [EObject current=null] : iv_ruleInheritance= ruleInheritance EOF ;
    public final EObject entryRuleInheritance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritance = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1224:2: (iv_ruleInheritance= ruleInheritance EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1225:2: iv_ruleInheritance= ruleInheritance EOF
            {
             newCompositeNode(grammarAccess.getInheritanceRule()); 
            pushFollow(FOLLOW_ruleInheritance_in_entryRuleInheritance2295);
            iv_ruleInheritance=ruleInheritance();

            state._fsp--;

             current =iv_ruleInheritance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInheritance2305); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1232:1: ruleInheritance returns [EObject current=null] : ( ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInheritance() throws RecognitionException {
        EObject current = null;

        Token lv_classname_0_0=null;
        Token lv_sourcePath_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1235:28: ( ( ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1236:1: ( ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1236:1: ( ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1236:2: ( (lv_classname_0_0= RULE_STRING ) ) ( (lv_sourcePath_1_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1236:2: ( (lv_classname_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1237:1: (lv_classname_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1237:1: (lv_classname_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1238:3: lv_classname_0_0= RULE_STRING
            {
            lv_classname_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInheritance2347); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1254:2: ( (lv_sourcePath_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1255:1: (lv_sourcePath_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1255:1: (lv_sourcePath_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1256:3: lv_sourcePath_1_0= RULE_STRING
            {
            lv_sourcePath_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInheritance2369); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1280:1: entryRuleClassIdentification returns [EObject current=null] : iv_ruleClassIdentification= ruleClassIdentification EOF ;
    public final EObject entryRuleClassIdentification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassIdentification = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1281:2: (iv_ruleClassIdentification= ruleClassIdentification EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1282:2: iv_ruleClassIdentification= ruleClassIdentification EOF
            {
             newCompositeNode(grammarAccess.getClassIdentificationRule()); 
            pushFollow(FOLLOW_ruleClassIdentification_in_entryRuleClassIdentification2410);
            iv_ruleClassIdentification=ruleClassIdentification();

            state._fsp--;

             current =iv_ruleClassIdentification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassIdentification2420); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1289:1: ruleClassIdentification returns [EObject current=null] : ( ( (lv_contact_0_0= RULE_STRING ) ) ( (lv_author_1_0= RULE_STRING ) ) ( (lv_emailDomain_2_0= RULE_STRING ) ) ( (lv_classFamily_3_0= RULE_STRING ) ) ( (lv_siteSpecific_4_0= RULE_STRING ) ) ( (lv_platform_5_0= RULE_STRING ) ) ( (lv_bus_6_0= RULE_STRING ) ) ( (lv_manufacturer_7_0= RULE_STRING ) ) ( (lv_reference_8_0= RULE_STRING ) ) ) ;
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
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1292:28: ( ( ( (lv_contact_0_0= RULE_STRING ) ) ( (lv_author_1_0= RULE_STRING ) ) ( (lv_emailDomain_2_0= RULE_STRING ) ) ( (lv_classFamily_3_0= RULE_STRING ) ) ( (lv_siteSpecific_4_0= RULE_STRING ) ) ( (lv_platform_5_0= RULE_STRING ) ) ( (lv_bus_6_0= RULE_STRING ) ) ( (lv_manufacturer_7_0= RULE_STRING ) ) ( (lv_reference_8_0= RULE_STRING ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1293:1: ( ( (lv_contact_0_0= RULE_STRING ) ) ( (lv_author_1_0= RULE_STRING ) ) ( (lv_emailDomain_2_0= RULE_STRING ) ) ( (lv_classFamily_3_0= RULE_STRING ) ) ( (lv_siteSpecific_4_0= RULE_STRING ) ) ( (lv_platform_5_0= RULE_STRING ) ) ( (lv_bus_6_0= RULE_STRING ) ) ( (lv_manufacturer_7_0= RULE_STRING ) ) ( (lv_reference_8_0= RULE_STRING ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1293:1: ( ( (lv_contact_0_0= RULE_STRING ) ) ( (lv_author_1_0= RULE_STRING ) ) ( (lv_emailDomain_2_0= RULE_STRING ) ) ( (lv_classFamily_3_0= RULE_STRING ) ) ( (lv_siteSpecific_4_0= RULE_STRING ) ) ( (lv_platform_5_0= RULE_STRING ) ) ( (lv_bus_6_0= RULE_STRING ) ) ( (lv_manufacturer_7_0= RULE_STRING ) ) ( (lv_reference_8_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1293:2: ( (lv_contact_0_0= RULE_STRING ) ) ( (lv_author_1_0= RULE_STRING ) ) ( (lv_emailDomain_2_0= RULE_STRING ) ) ( (lv_classFamily_3_0= RULE_STRING ) ) ( (lv_siteSpecific_4_0= RULE_STRING ) ) ( (lv_platform_5_0= RULE_STRING ) ) ( (lv_bus_6_0= RULE_STRING ) ) ( (lv_manufacturer_7_0= RULE_STRING ) ) ( (lv_reference_8_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1293:2: ( (lv_contact_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1294:1: (lv_contact_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1294:1: (lv_contact_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1295:3: lv_contact_0_0= RULE_STRING
            {
            lv_contact_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2462); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1311:2: ( (lv_author_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1312:1: (lv_author_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1312:1: (lv_author_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1313:3: lv_author_1_0= RULE_STRING
            {
            lv_author_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2484); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1329:2: ( (lv_emailDomain_2_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1330:1: (lv_emailDomain_2_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1330:1: (lv_emailDomain_2_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1331:3: lv_emailDomain_2_0= RULE_STRING
            {
            lv_emailDomain_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2506); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1347:2: ( (lv_classFamily_3_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1348:1: (lv_classFamily_3_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1348:1: (lv_classFamily_3_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1349:3: lv_classFamily_3_0= RULE_STRING
            {
            lv_classFamily_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2528); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1365:2: ( (lv_siteSpecific_4_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1366:1: (lv_siteSpecific_4_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1366:1: (lv_siteSpecific_4_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1367:3: lv_siteSpecific_4_0= RULE_STRING
            {
            lv_siteSpecific_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2550); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1383:2: ( (lv_platform_5_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1384:1: (lv_platform_5_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1384:1: (lv_platform_5_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1385:3: lv_platform_5_0= RULE_STRING
            {
            lv_platform_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2572); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1401:2: ( (lv_bus_6_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1402:1: (lv_bus_6_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1402:1: (lv_bus_6_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1403:3: lv_bus_6_0= RULE_STRING
            {
            lv_bus_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2594); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1419:2: ( (lv_manufacturer_7_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1420:1: (lv_manufacturer_7_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1420:1: (lv_manufacturer_7_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1421:3: lv_manufacturer_7_0= RULE_STRING
            {
            lv_manufacturer_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2616); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1437:2: ( (lv_reference_8_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1438:1: (lv_reference_8_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1438:1: (lv_reference_8_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1439:3: lv_reference_8_0= RULE_STRING
            {
            lv_reference_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2638); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1463:1: entryRuleComments returns [EObject current=null] : iv_ruleComments= ruleComments EOF ;
    public final EObject entryRuleComments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComments = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1464:2: (iv_ruleComments= ruleComments EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1465:2: iv_ruleComments= ruleComments EOF
            {
             newCompositeNode(grammarAccess.getCommentsRule()); 
            pushFollow(FOLLOW_ruleComments_in_entryRuleComments2679);
            iv_ruleComments=ruleComments();

            state._fsp--;

             current =iv_ruleComments; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComments2689); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1472:1: ruleComments returns [EObject current=null] : ( (lv_commandsTable_0_0= RULE_STRING ) ) ;
    public final EObject ruleComments() throws RecognitionException {
        EObject current = null;

        Token lv_commandsTable_0_0=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1475:28: ( ( (lv_commandsTable_0_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1476:1: ( (lv_commandsTable_0_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1476:1: ( (lv_commandsTable_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1477:1: (lv_commandsTable_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1477:1: (lv_commandsTable_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1478:3: lv_commandsTable_0_0= RULE_STRING
            {
            lv_commandsTable_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleComments2730); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1502:1: entryRulePreferences returns [EObject current=null] : iv_rulePreferences= rulePreferences EOF ;
    public final EObject entryRulePreferences() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreferences = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1503:2: (iv_rulePreferences= rulePreferences EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1504:2: iv_rulePreferences= rulePreferences EOF
            {
             newCompositeNode(grammarAccess.getPreferencesRule()); 
            pushFollow(FOLLOW_rulePreferences_in_entryRulePreferences2770);
            iv_rulePreferences=rulePreferences();

            state._fsp--;

             current =iv_rulePreferences; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePreferences2780); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1511:1: rulePreferences returns [EObject current=null] : ( ( (lv_docHome_0_0= RULE_STRING ) ) ( (lv_makefileHome_1_0= RULE_STRING ) ) ( (lv_installHome_2_0= RULE_STRING ) ) ( (lv_htmlVersion_3_0= ruleBoolean ) ) ) ;
    public final EObject rulePreferences() throws RecognitionException {
        EObject current = null;

        Token lv_docHome_0_0=null;
        Token lv_makefileHome_1_0=null;
        Token lv_installHome_2_0=null;
        AntlrDatatypeRuleToken lv_htmlVersion_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1514:28: ( ( ( (lv_docHome_0_0= RULE_STRING ) ) ( (lv_makefileHome_1_0= RULE_STRING ) ) ( (lv_installHome_2_0= RULE_STRING ) ) ( (lv_htmlVersion_3_0= ruleBoolean ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1515:1: ( ( (lv_docHome_0_0= RULE_STRING ) ) ( (lv_makefileHome_1_0= RULE_STRING ) ) ( (lv_installHome_2_0= RULE_STRING ) ) ( (lv_htmlVersion_3_0= ruleBoolean ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1515:1: ( ( (lv_docHome_0_0= RULE_STRING ) ) ( (lv_makefileHome_1_0= RULE_STRING ) ) ( (lv_installHome_2_0= RULE_STRING ) ) ( (lv_htmlVersion_3_0= ruleBoolean ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1515:2: ( (lv_docHome_0_0= RULE_STRING ) ) ( (lv_makefileHome_1_0= RULE_STRING ) ) ( (lv_installHome_2_0= RULE_STRING ) ) ( (lv_htmlVersion_3_0= ruleBoolean ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1515:2: ( (lv_docHome_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1516:1: (lv_docHome_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1516:1: (lv_docHome_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1517:3: lv_docHome_0_0= RULE_STRING
            {
            lv_docHome_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePreferences2822); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1533:2: ( (lv_makefileHome_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1534:1: (lv_makefileHome_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1534:1: (lv_makefileHome_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1535:3: lv_makefileHome_1_0= RULE_STRING
            {
            lv_makefileHome_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePreferences2844); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1551:2: ( (lv_installHome_2_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1552:1: (lv_installHome_2_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1552:1: (lv_installHome_2_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1553:3: lv_installHome_2_0= RULE_STRING
            {
            lv_installHome_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePreferences2866); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1569:2: ( (lv_htmlVersion_3_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1570:1: (lv_htmlVersion_3_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1570:1: (lv_htmlVersion_3_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1571:3: lv_htmlVersion_3_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getPreferencesAccess().getHtmlVersionBooleanParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_rulePreferences2892);
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1595:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1596:2: (iv_ruleState= ruleState EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1597:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState2928);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState2938); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1604:1: ruleState returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_1_0=null;
        EObject lv_status_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1607:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1608:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1608:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1608:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_status_2_0= ruleInheritanceStatus ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1608:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1609:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1609:1: (lv_name_0_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1610:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState2980); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1626:2: ( (lv_description_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1627:1: (lv_description_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1627:1: (lv_description_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1628:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState3002); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1644:2: ( (lv_status_2_0= ruleInheritanceStatus ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1645:1: (lv_status_2_0= ruleInheritanceStatus )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1645:1: (lv_status_2_0= ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1646:3: lv_status_2_0= ruleInheritanceStatus
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getStatusInheritanceStatusParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleInheritanceStatus_in_ruleState3028);
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1670:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1671:2: (iv_ruleProperty= ruleProperty EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1672:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty3064);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty3074); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1679:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= rulePropType ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) ( (lv_mandatory_3_0= ruleBoolean ) ) ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'defaultPropValue:' ( (lv_DefaultPropValue_6_0= RULE_STRING ) )* ) ;
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
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1682:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= rulePropType ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) ( (lv_mandatory_3_0= ruleBoolean ) ) ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'defaultPropValue:' ( (lv_DefaultPropValue_6_0= RULE_STRING ) )* ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1683:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= rulePropType ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) ( (lv_mandatory_3_0= ruleBoolean ) ) ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'defaultPropValue:' ( (lv_DefaultPropValue_6_0= RULE_STRING ) )* )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1683:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= rulePropType ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) ( (lv_mandatory_3_0= ruleBoolean ) ) ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'defaultPropValue:' ( (lv_DefaultPropValue_6_0= RULE_STRING ) )* )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1683:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= rulePropType ) ) ( (lv_status_2_0= ruleInheritanceStatus ) ) ( (lv_mandatory_3_0= ruleBoolean ) ) ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'defaultPropValue:' ( (lv_DefaultPropValue_6_0= RULE_STRING ) )*
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1683:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1684:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1684:1: (lv_name_0_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1685:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty3116); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1701:2: ( (lv_type_1_0= rulePropType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1702:1: (lv_type_1_0= rulePropType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1702:1: (lv_type_1_0= rulePropType )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1703:3: lv_type_1_0= rulePropType
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getTypePropTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePropType_in_ruleProperty3142);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1719:2: ( (lv_status_2_0= ruleInheritanceStatus ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1720:1: (lv_status_2_0= ruleInheritanceStatus )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1720:1: (lv_status_2_0= ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1721:3: lv_status_2_0= ruleInheritanceStatus
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getStatusInheritanceStatusParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleInheritanceStatus_in_ruleProperty3163);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1737:2: ( (lv_mandatory_3_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1738:1: (lv_mandatory_3_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1738:1: (lv_mandatory_3_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1739:3: lv_mandatory_3_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getMandatoryBooleanParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleProperty3184);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1755:2: ( (lv_description_4_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1756:1: (lv_description_4_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1756:1: (lv_description_4_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1757:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProperty3201); 

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

            otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleProperty3218); 

                	newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getDefaultPropValueKeyword_5());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1777:1: ( (lv_DefaultPropValue_6_0= RULE_STRING ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_STRING) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1778:1: (lv_DefaultPropValue_6_0= RULE_STRING )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1778:1: (lv_DefaultPropValue_6_0= RULE_STRING )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1779:3: lv_DefaultPropValue_6_0= RULE_STRING
            	    {
            	    lv_DefaultPropValue_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProperty3235); 

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRulePropType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1803:1: entryRulePropType returns [EObject current=null] : iv_rulePropType= rulePropType EOF ;
    public final EObject entryRulePropType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1804:2: (iv_rulePropType= rulePropType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1805:2: iv_rulePropType= rulePropType EOF
            {
             newCompositeNode(grammarAccess.getPropTypeRule()); 
            pushFollow(FOLLOW_rulePropType_in_entryRulePropType3277);
            iv_rulePropType=rulePropType();

            state._fsp--;

             current =iv_rulePropType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropType3287); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1812:1: rulePropType returns [EObject current=null] : (this_SimpleType_0= ruleSimpleType | this_VectorType_1= ruleVectorType ) ;
    public final EObject rulePropType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleType_0 = null;

        EObject this_VectorType_1 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1815:28: ( (this_SimpleType_0= ruleSimpleType | this_VectorType_1= ruleVectorType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1816:1: (this_SimpleType_0= ruleSimpleType | this_VectorType_1= ruleVectorType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1816:1: (this_SimpleType_0= ruleSimpleType | this_VectorType_1= ruleVectorType )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=48 && LA20_0<=55)) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=76 && LA20_0<=80)) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1817:5: this_SimpleType_0= ruleSimpleType
                    {
                     
                            newCompositeNode(grammarAccess.getPropTypeAccess().getSimpleTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleType_in_rulePropType3334);
                    this_SimpleType_0=ruleSimpleType();

                    state._fsp--;

                     
                            current = this_SimpleType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1827:5: this_VectorType_1= ruleVectorType
                    {
                     
                            newCompositeNode(grammarAccess.getPropTypeAccess().getVectorTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVectorType_in_rulePropType3361);
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1843:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1844:2: (iv_ruleSimpleType= ruleSimpleType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1845:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType3396);
            iv_ruleSimpleType=ruleSimpleType();

            state._fsp--;

             current =iv_ruleSimpleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType3406); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1852:1: ruleSimpleType returns [EObject current=null] : (this_BooleanType_0= ruleBooleanType | this_ShortType_1= ruleShortType | this_UShortType_2= ruleUShortType | this_IntType_3= ruleIntType | this_UIntType_4= ruleUIntType | this_FloatType_5= ruleFloatType | this_DoubleType_6= ruleDoubleType | this_StringType_7= ruleStringType ) ;
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
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1855:28: ( (this_BooleanType_0= ruleBooleanType | this_ShortType_1= ruleShortType | this_UShortType_2= ruleUShortType | this_IntType_3= ruleIntType | this_UIntType_4= ruleUIntType | this_FloatType_5= ruleFloatType | this_DoubleType_6= ruleDoubleType | this_StringType_7= ruleStringType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1856:1: (this_BooleanType_0= ruleBooleanType | this_ShortType_1= ruleShortType | this_UShortType_2= ruleUShortType | this_IntType_3= ruleIntType | this_UIntType_4= ruleUIntType | this_FloatType_5= ruleFloatType | this_DoubleType_6= ruleDoubleType | this_StringType_7= ruleStringType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1856:1: (this_BooleanType_0= ruleBooleanType | this_ShortType_1= ruleShortType | this_UShortType_2= ruleUShortType | this_IntType_3= ruleIntType | this_UIntType_4= ruleUIntType | this_FloatType_5= ruleFloatType | this_DoubleType_6= ruleDoubleType | this_StringType_7= ruleStringType )
            int alt21=8;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt21=1;
                }
                break;
            case 49:
                {
                alt21=2;
                }
                break;
            case 50:
                {
                alt21=3;
                }
                break;
            case 51:
                {
                alt21=4;
                }
                break;
            case 52:
                {
                alt21=5;
                }
                break;
            case 53:
                {
                alt21=6;
                }
                break;
            case 54:
                {
                alt21=7;
                }
                break;
            case 55:
                {
                alt21=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1857:5: this_BooleanType_0= ruleBooleanType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getBooleanTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBooleanType_in_ruleSimpleType3453);
                    this_BooleanType_0=ruleBooleanType();

                    state._fsp--;

                     
                            current = this_BooleanType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1867:5: this_ShortType_1= ruleShortType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getShortTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleShortType_in_ruleSimpleType3480);
                    this_ShortType_1=ruleShortType();

                    state._fsp--;

                     
                            current = this_ShortType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1877:5: this_UShortType_2= ruleUShortType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getUShortTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleUShortType_in_ruleSimpleType3507);
                    this_UShortType_2=ruleUShortType();

                    state._fsp--;

                     
                            current = this_UShortType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1887:5: this_IntType_3= ruleIntType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getIntTypeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleIntType_in_ruleSimpleType3534);
                    this_IntType_3=ruleIntType();

                    state._fsp--;

                     
                            current = this_IntType_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1897:5: this_UIntType_4= ruleUIntType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getUIntTypeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleUIntType_in_ruleSimpleType3561);
                    this_UIntType_4=ruleUIntType();

                    state._fsp--;

                     
                            current = this_UIntType_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1907:5: this_FloatType_5= ruleFloatType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getFloatTypeParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleFloatType_in_ruleSimpleType3588);
                    this_FloatType_5=ruleFloatType();

                    state._fsp--;

                     
                            current = this_FloatType_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1917:5: this_DoubleType_6= ruleDoubleType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getDoubleTypeParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleDoubleType_in_ruleSimpleType3615);
                    this_DoubleType_6=ruleDoubleType();

                    state._fsp--;

                     
                            current = this_DoubleType_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1927:5: this_StringType_7= ruleStringType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeAccess().getStringTypeParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleStringType_in_ruleSimpleType3642);
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1943:1: entryRuleVectorType returns [EObject current=null] : iv_ruleVectorType= ruleVectorType EOF ;
    public final EObject entryRuleVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1944:2: (iv_ruleVectorType= ruleVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1945:2: iv_ruleVectorType= ruleVectorType EOF
            {
             newCompositeNode(grammarAccess.getVectorTypeRule()); 
            pushFollow(FOLLOW_ruleVectorType_in_entryRuleVectorType3677);
            iv_ruleVectorType=ruleVectorType();

            state._fsp--;

             current =iv_ruleVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVectorType3687); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1952:1: ruleVectorType returns [EObject current=null] : (this_ShortVectorType_0= ruleShortVectorType | this_IntVectorType_1= ruleIntVectorType | this_FloatVectorType_2= ruleFloatVectorType | this_DoubleVectorType_3= ruleDoubleVectorType | this_StringVectorType_4= ruleStringVectorType ) ;
    public final EObject ruleVectorType() throws RecognitionException {
        EObject current = null;

        EObject this_ShortVectorType_0 = null;

        EObject this_IntVectorType_1 = null;

        EObject this_FloatVectorType_2 = null;

        EObject this_DoubleVectorType_3 = null;

        EObject this_StringVectorType_4 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1955:28: ( (this_ShortVectorType_0= ruleShortVectorType | this_IntVectorType_1= ruleIntVectorType | this_FloatVectorType_2= ruleFloatVectorType | this_DoubleVectorType_3= ruleDoubleVectorType | this_StringVectorType_4= ruleStringVectorType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1956:1: (this_ShortVectorType_0= ruleShortVectorType | this_IntVectorType_1= ruleIntVectorType | this_FloatVectorType_2= ruleFloatVectorType | this_DoubleVectorType_3= ruleDoubleVectorType | this_StringVectorType_4= ruleStringVectorType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1956:1: (this_ShortVectorType_0= ruleShortVectorType | this_IntVectorType_1= ruleIntVectorType | this_FloatVectorType_2= ruleFloatVectorType | this_DoubleVectorType_3= ruleDoubleVectorType | this_StringVectorType_4= ruleStringVectorType )
            int alt22=5;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt22=1;
                }
                break;
            case 77:
                {
                alt22=2;
                }
                break;
            case 78:
                {
                alt22=3;
                }
                break;
            case 79:
                {
                alt22=4;
                }
                break;
            case 80:
                {
                alt22=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1957:5: this_ShortVectorType_0= ruleShortVectorType
                    {
                     
                            newCompositeNode(grammarAccess.getVectorTypeAccess().getShortVectorTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleShortVectorType_in_ruleVectorType3734);
                    this_ShortVectorType_0=ruleShortVectorType();

                    state._fsp--;

                     
                            current = this_ShortVectorType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1967:5: this_IntVectorType_1= ruleIntVectorType
                    {
                     
                            newCompositeNode(grammarAccess.getVectorTypeAccess().getIntVectorTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntVectorType_in_ruleVectorType3761);
                    this_IntVectorType_1=ruleIntVectorType();

                    state._fsp--;

                     
                            current = this_IntVectorType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1977:5: this_FloatVectorType_2= ruleFloatVectorType
                    {
                     
                            newCompositeNode(grammarAccess.getVectorTypeAccess().getFloatVectorTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFloatVectorType_in_ruleVectorType3788);
                    this_FloatVectorType_2=ruleFloatVectorType();

                    state._fsp--;

                     
                            current = this_FloatVectorType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1987:5: this_DoubleVectorType_3= ruleDoubleVectorType
                    {
                     
                            newCompositeNode(grammarAccess.getVectorTypeAccess().getDoubleVectorTypeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDoubleVectorType_in_ruleVectorType3815);
                    this_DoubleVectorType_3=ruleDoubleVectorType();

                    state._fsp--;

                     
                            current = this_DoubleVectorType_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1997:5: this_StringVectorType_4= ruleStringVectorType
                    {
                     
                            newCompositeNode(grammarAccess.getVectorTypeAccess().getStringVectorTypeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleStringVectorType_in_ruleVectorType3842);
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2013:1: entryRuleInheritanceStatus returns [EObject current=null] : iv_ruleInheritanceStatus= ruleInheritanceStatus EOF ;
    public final EObject entryRuleInheritanceStatus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritanceStatus = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2014:2: (iv_ruleInheritanceStatus= ruleInheritanceStatus EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2015:2: iv_ruleInheritanceStatus= ruleInheritanceStatus EOF
            {
             newCompositeNode(grammarAccess.getInheritanceStatusRule()); 
            pushFollow(FOLLOW_ruleInheritanceStatus_in_entryRuleInheritanceStatus3877);
            iv_ruleInheritanceStatus=ruleInheritanceStatus();

            state._fsp--;

             current =iv_ruleInheritanceStatus; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInheritanceStatus3887); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2022:1: ruleInheritanceStatus returns [EObject current=null] : ( ( (lv_abstract_0_0= ruleBoolean ) ) ( (lv_inherited_1_0= ruleBoolean ) ) ( (lv_concrete_2_0= ruleBoolean ) ) ( (lv_concreteHere_3_0= ruleBoolean ) ) ( (lv_hasChanged_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleInheritanceStatus() throws RecognitionException {
        EObject current = null;

        Token lv_hasChanged_4_0=null;
        AntlrDatatypeRuleToken lv_abstract_0_0 = null;

        AntlrDatatypeRuleToken lv_inherited_1_0 = null;

        AntlrDatatypeRuleToken lv_concrete_2_0 = null;

        AntlrDatatypeRuleToken lv_concreteHere_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2025:28: ( ( ( (lv_abstract_0_0= ruleBoolean ) ) ( (lv_inherited_1_0= ruleBoolean ) ) ( (lv_concrete_2_0= ruleBoolean ) ) ( (lv_concreteHere_3_0= ruleBoolean ) ) ( (lv_hasChanged_4_0= RULE_STRING ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2026:1: ( ( (lv_abstract_0_0= ruleBoolean ) ) ( (lv_inherited_1_0= ruleBoolean ) ) ( (lv_concrete_2_0= ruleBoolean ) ) ( (lv_concreteHere_3_0= ruleBoolean ) ) ( (lv_hasChanged_4_0= RULE_STRING ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2026:1: ( ( (lv_abstract_0_0= ruleBoolean ) ) ( (lv_inherited_1_0= ruleBoolean ) ) ( (lv_concrete_2_0= ruleBoolean ) ) ( (lv_concreteHere_3_0= ruleBoolean ) ) ( (lv_hasChanged_4_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2026:2: ( (lv_abstract_0_0= ruleBoolean ) ) ( (lv_inherited_1_0= ruleBoolean ) ) ( (lv_concrete_2_0= ruleBoolean ) ) ( (lv_concreteHere_3_0= ruleBoolean ) ) ( (lv_hasChanged_4_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2026:2: ( (lv_abstract_0_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2027:1: (lv_abstract_0_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2027:1: (lv_abstract_0_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2028:3: lv_abstract_0_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getInheritanceStatusAccess().getAbstractBooleanParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleInheritanceStatus3933);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2044:2: ( (lv_inherited_1_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2045:1: (lv_inherited_1_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2045:1: (lv_inherited_1_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2046:3: lv_inherited_1_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getInheritanceStatusAccess().getInheritedBooleanParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleInheritanceStatus3954);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2062:2: ( (lv_concrete_2_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2063:1: (lv_concrete_2_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2063:1: (lv_concrete_2_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2064:3: lv_concrete_2_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getInheritanceStatusAccess().getConcreteBooleanParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleInheritanceStatus3975);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2080:2: ( (lv_concreteHere_3_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2081:1: (lv_concreteHere_3_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2081:1: (lv_concreteHere_3_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2082:3: lv_concreteHere_3_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getInheritanceStatusAccess().getConcreteHereBooleanParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleInheritanceStatus3996);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2098:2: ( (lv_hasChanged_4_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2099:1: (lv_hasChanged_4_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2099:1: (lv_hasChanged_4_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2100:3: lv_hasChanged_4_0= RULE_STRING
            {
            lv_hasChanged_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInheritanceStatus4013); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2124:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2125:2: (iv_ruleCommand= ruleCommand EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2126:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand4054);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand4064); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2133:1: ruleCommand returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_argin_1_0= ruleArgument ) ) ( (lv_argout_2_0= ruleArgument ) ) ( (lv_description_3_0= RULE_STRING ) ) ( (lv_status_4_0= ruleInheritanceStatus ) ) ( (lv_execMethod_5_0= RULE_STRING ) ) ( (lv_displayLevel_6_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_7_0= RULE_STRING ) ) otherlv_8= 'excludedStates:' ( (lv_excludedStates_9_0= RULE_STRING ) )* ) ;
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
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2136:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_argin_1_0= ruleArgument ) ) ( (lv_argout_2_0= ruleArgument ) ) ( (lv_description_3_0= RULE_STRING ) ) ( (lv_status_4_0= ruleInheritanceStatus ) ) ( (lv_execMethod_5_0= RULE_STRING ) ) ( (lv_displayLevel_6_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_7_0= RULE_STRING ) ) otherlv_8= 'excludedStates:' ( (lv_excludedStates_9_0= RULE_STRING ) )* ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2137:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_argin_1_0= ruleArgument ) ) ( (lv_argout_2_0= ruleArgument ) ) ( (lv_description_3_0= RULE_STRING ) ) ( (lv_status_4_0= ruleInheritanceStatus ) ) ( (lv_execMethod_5_0= RULE_STRING ) ) ( (lv_displayLevel_6_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_7_0= RULE_STRING ) ) otherlv_8= 'excludedStates:' ( (lv_excludedStates_9_0= RULE_STRING ) )* )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2137:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_argin_1_0= ruleArgument ) ) ( (lv_argout_2_0= ruleArgument ) ) ( (lv_description_3_0= RULE_STRING ) ) ( (lv_status_4_0= ruleInheritanceStatus ) ) ( (lv_execMethod_5_0= RULE_STRING ) ) ( (lv_displayLevel_6_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_7_0= RULE_STRING ) ) otherlv_8= 'excludedStates:' ( (lv_excludedStates_9_0= RULE_STRING ) )* )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2137:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_argin_1_0= ruleArgument ) ) ( (lv_argout_2_0= ruleArgument ) ) ( (lv_description_3_0= RULE_STRING ) ) ( (lv_status_4_0= ruleInheritanceStatus ) ) ( (lv_execMethod_5_0= RULE_STRING ) ) ( (lv_displayLevel_6_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_7_0= RULE_STRING ) ) otherlv_8= 'excludedStates:' ( (lv_excludedStates_9_0= RULE_STRING ) )*
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2137:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2138:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2138:1: (lv_name_0_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2139:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand4106); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2155:2: ( (lv_argin_1_0= ruleArgument ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2156:1: (lv_argin_1_0= ruleArgument )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2156:1: (lv_argin_1_0= ruleArgument )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2157:3: lv_argin_1_0= ruleArgument
            {
             
            	        newCompositeNode(grammarAccess.getCommandAccess().getArginArgumentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleArgument_in_ruleCommand4132);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2173:2: ( (lv_argout_2_0= ruleArgument ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2174:1: (lv_argout_2_0= ruleArgument )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2174:1: (lv_argout_2_0= ruleArgument )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2175:3: lv_argout_2_0= ruleArgument
            {
             
            	        newCompositeNode(grammarAccess.getCommandAccess().getArgoutArgumentParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleArgument_in_ruleCommand4153);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2191:2: ( (lv_description_3_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2192:1: (lv_description_3_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2192:1: (lv_description_3_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2193:3: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommand4170); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2209:2: ( (lv_status_4_0= ruleInheritanceStatus ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2210:1: (lv_status_4_0= ruleInheritanceStatus )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2210:1: (lv_status_4_0= ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2211:3: lv_status_4_0= ruleInheritanceStatus
            {
             
            	        newCompositeNode(grammarAccess.getCommandAccess().getStatusInheritanceStatusParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleInheritanceStatus_in_ruleCommand4196);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2227:2: ( (lv_execMethod_5_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2228:1: (lv_execMethod_5_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2228:1: (lv_execMethod_5_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2229:3: lv_execMethod_5_0= RULE_STRING
            {
            lv_execMethod_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommand4213); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2245:2: ( (lv_displayLevel_6_0= ruleDisplayLevel ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2246:1: (lv_displayLevel_6_0= ruleDisplayLevel )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2246:1: (lv_displayLevel_6_0= ruleDisplayLevel )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2247:3: lv_displayLevel_6_0= ruleDisplayLevel
            {
             
            	        newCompositeNode(grammarAccess.getCommandAccess().getDisplayLevelDisplayLevelParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleDisplayLevel_in_ruleCommand4239);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2263:2: ( (lv_polledPeriod_7_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2264:1: (lv_polledPeriod_7_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2264:1: (lv_polledPeriod_7_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2265:3: lv_polledPeriod_7_0= RULE_STRING
            {
            lv_polledPeriod_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommand4256); 

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

            otherlv_8=(Token)match(input,44,FOLLOW_44_in_ruleCommand4273); 

                	newLeafNode(otherlv_8, grammarAccess.getCommandAccess().getExcludedStatesKeyword_8());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2285:1: ( (lv_excludedStates_9_0= RULE_STRING ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_STRING) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2286:1: (lv_excludedStates_9_0= RULE_STRING )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2286:1: (lv_excludedStates_9_0= RULE_STRING )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2287:3: lv_excludedStates_9_0= RULE_STRING
            	    {
            	    lv_excludedStates_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommand4290); 

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleArgument"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2311:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2312:2: (iv_ruleArgument= ruleArgument EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2313:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument4332);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument4342); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2320:1: ruleArgument returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_description_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_description_1_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2323:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_description_1_0= RULE_STRING ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2324:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_description_1_0= RULE_STRING ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2324:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_description_1_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2324:2: ( (lv_type_0_0= ruleType ) ) ( (lv_description_1_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2324:2: ( (lv_type_0_0= ruleType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2325:1: (lv_type_0_0= ruleType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2325:1: (lv_type_0_0= ruleType )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2326:3: lv_type_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getArgumentAccess().getTypeTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleArgument4388);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2342:2: ( (lv_description_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2343:1: (lv_description_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2343:1: (lv_description_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2344:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument4405); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2368:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2369:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2370:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute4446);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute4456); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2377:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_attType_1_0= ruleAttrType ) ) ( (lv_dataType_2_0= ruleType ) ) ( (lv_rwType_3_0= ruleRW_Type ) ) ( (lv_displayLevel_4_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_5_0= RULE_STRING ) ) ( (lv_maxX_6_0= RULE_STRING ) ) ( (lv_maxY_7_0= RULE_STRING ) ) ( (lv_associatedAttr_8_0= RULE_STRING ) ) ( (lv_memorized_9_0= ruleBoolean ) ) ( (lv_memorizedAtInit_10_0= ruleBoolean ) ) ( (lv_changeEvent_11_0= ruleFireEvents ) ) ( (lv_archiveEvent_12_0= ruleFireEvents ) ) ( (lv_dataReadyEvent_13_0= ruleFireEvents ) ) ( (lv_status_14_0= ruleInheritanceStatus ) ) ( (lv_properties_15_0= ruleAttrProperties ) ) ( (lv_allocReadMember_16_0= ruleBoolean ) ) ( (lv_isDynamic_17_0= ruleBoolean ) ) otherlv_18= 'readExcludedStates:' ( (lv_readExcludedStates_19_0= RULE_STRING ) )* otherlv_20= 'writeExcludedStates:' ( (lv_writeExcludedStates_21_0= RULE_STRING ) )* ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_polledPeriod_5_0=null;
        Token lv_maxX_6_0=null;
        Token lv_maxY_7_0=null;
        Token lv_associatedAttr_8_0=null;
        Token otherlv_18=null;
        Token lv_readExcludedStates_19_0=null;
        Token otherlv_20=null;
        Token lv_writeExcludedStates_21_0=null;
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


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2380:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_attType_1_0= ruleAttrType ) ) ( (lv_dataType_2_0= ruleType ) ) ( (lv_rwType_3_0= ruleRW_Type ) ) ( (lv_displayLevel_4_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_5_0= RULE_STRING ) ) ( (lv_maxX_6_0= RULE_STRING ) ) ( (lv_maxY_7_0= RULE_STRING ) ) ( (lv_associatedAttr_8_0= RULE_STRING ) ) ( (lv_memorized_9_0= ruleBoolean ) ) ( (lv_memorizedAtInit_10_0= ruleBoolean ) ) ( (lv_changeEvent_11_0= ruleFireEvents ) ) ( (lv_archiveEvent_12_0= ruleFireEvents ) ) ( (lv_dataReadyEvent_13_0= ruleFireEvents ) ) ( (lv_status_14_0= ruleInheritanceStatus ) ) ( (lv_properties_15_0= ruleAttrProperties ) ) ( (lv_allocReadMember_16_0= ruleBoolean ) ) ( (lv_isDynamic_17_0= ruleBoolean ) ) otherlv_18= 'readExcludedStates:' ( (lv_readExcludedStates_19_0= RULE_STRING ) )* otherlv_20= 'writeExcludedStates:' ( (lv_writeExcludedStates_21_0= RULE_STRING ) )* ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2381:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_attType_1_0= ruleAttrType ) ) ( (lv_dataType_2_0= ruleType ) ) ( (lv_rwType_3_0= ruleRW_Type ) ) ( (lv_displayLevel_4_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_5_0= RULE_STRING ) ) ( (lv_maxX_6_0= RULE_STRING ) ) ( (lv_maxY_7_0= RULE_STRING ) ) ( (lv_associatedAttr_8_0= RULE_STRING ) ) ( (lv_memorized_9_0= ruleBoolean ) ) ( (lv_memorizedAtInit_10_0= ruleBoolean ) ) ( (lv_changeEvent_11_0= ruleFireEvents ) ) ( (lv_archiveEvent_12_0= ruleFireEvents ) ) ( (lv_dataReadyEvent_13_0= ruleFireEvents ) ) ( (lv_status_14_0= ruleInheritanceStatus ) ) ( (lv_properties_15_0= ruleAttrProperties ) ) ( (lv_allocReadMember_16_0= ruleBoolean ) ) ( (lv_isDynamic_17_0= ruleBoolean ) ) otherlv_18= 'readExcludedStates:' ( (lv_readExcludedStates_19_0= RULE_STRING ) )* otherlv_20= 'writeExcludedStates:' ( (lv_writeExcludedStates_21_0= RULE_STRING ) )* )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2381:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_attType_1_0= ruleAttrType ) ) ( (lv_dataType_2_0= ruleType ) ) ( (lv_rwType_3_0= ruleRW_Type ) ) ( (lv_displayLevel_4_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_5_0= RULE_STRING ) ) ( (lv_maxX_6_0= RULE_STRING ) ) ( (lv_maxY_7_0= RULE_STRING ) ) ( (lv_associatedAttr_8_0= RULE_STRING ) ) ( (lv_memorized_9_0= ruleBoolean ) ) ( (lv_memorizedAtInit_10_0= ruleBoolean ) ) ( (lv_changeEvent_11_0= ruleFireEvents ) ) ( (lv_archiveEvent_12_0= ruleFireEvents ) ) ( (lv_dataReadyEvent_13_0= ruleFireEvents ) ) ( (lv_status_14_0= ruleInheritanceStatus ) ) ( (lv_properties_15_0= ruleAttrProperties ) ) ( (lv_allocReadMember_16_0= ruleBoolean ) ) ( (lv_isDynamic_17_0= ruleBoolean ) ) otherlv_18= 'readExcludedStates:' ( (lv_readExcludedStates_19_0= RULE_STRING ) )* otherlv_20= 'writeExcludedStates:' ( (lv_writeExcludedStates_21_0= RULE_STRING ) )* )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2381:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_attType_1_0= ruleAttrType ) ) ( (lv_dataType_2_0= ruleType ) ) ( (lv_rwType_3_0= ruleRW_Type ) ) ( (lv_displayLevel_4_0= ruleDisplayLevel ) ) ( (lv_polledPeriod_5_0= RULE_STRING ) ) ( (lv_maxX_6_0= RULE_STRING ) ) ( (lv_maxY_7_0= RULE_STRING ) ) ( (lv_associatedAttr_8_0= RULE_STRING ) ) ( (lv_memorized_9_0= ruleBoolean ) ) ( (lv_memorizedAtInit_10_0= ruleBoolean ) ) ( (lv_changeEvent_11_0= ruleFireEvents ) ) ( (lv_archiveEvent_12_0= ruleFireEvents ) ) ( (lv_dataReadyEvent_13_0= ruleFireEvents ) ) ( (lv_status_14_0= ruleInheritanceStatus ) ) ( (lv_properties_15_0= ruleAttrProperties ) ) ( (lv_allocReadMember_16_0= ruleBoolean ) ) ( (lv_isDynamic_17_0= ruleBoolean ) ) otherlv_18= 'readExcludedStates:' ( (lv_readExcludedStates_19_0= RULE_STRING ) )* otherlv_20= 'writeExcludedStates:' ( (lv_writeExcludedStates_21_0= RULE_STRING ) )*
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2381:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2382:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2382:1: (lv_name_0_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2383:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute4498); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2399:2: ( (lv_attType_1_0= ruleAttrType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2400:1: (lv_attType_1_0= ruleAttrType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2400:1: (lv_attType_1_0= ruleAttrType )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2401:3: lv_attType_1_0= ruleAttrType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getAttTypeAttrTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAttrType_in_ruleAttribute4524);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2417:2: ( (lv_dataType_2_0= ruleType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2418:1: (lv_dataType_2_0= ruleType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2418:1: (lv_dataType_2_0= ruleType )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2419:3: lv_dataType_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getDataTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleAttribute4545);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2435:2: ( (lv_rwType_3_0= ruleRW_Type ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2436:1: (lv_rwType_3_0= ruleRW_Type )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2436:1: (lv_rwType_3_0= ruleRW_Type )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2437:3: lv_rwType_3_0= ruleRW_Type
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getRwTypeRW_TypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleRW_Type_in_ruleAttribute4566);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2453:2: ( (lv_displayLevel_4_0= ruleDisplayLevel ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2454:1: (lv_displayLevel_4_0= ruleDisplayLevel )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2454:1: (lv_displayLevel_4_0= ruleDisplayLevel )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2455:3: lv_displayLevel_4_0= ruleDisplayLevel
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getDisplayLevelDisplayLevelParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleDisplayLevel_in_ruleAttribute4587);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2471:2: ( (lv_polledPeriod_5_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2472:1: (lv_polledPeriod_5_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2472:1: (lv_polledPeriod_5_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2473:3: lv_polledPeriod_5_0= RULE_STRING
            {
            lv_polledPeriod_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute4604); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2489:2: ( (lv_maxX_6_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2490:1: (lv_maxX_6_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2490:1: (lv_maxX_6_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2491:3: lv_maxX_6_0= RULE_STRING
            {
            lv_maxX_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute4626); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2507:2: ( (lv_maxY_7_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2508:1: (lv_maxY_7_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2508:1: (lv_maxY_7_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2509:3: lv_maxY_7_0= RULE_STRING
            {
            lv_maxY_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute4648); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2525:2: ( (lv_associatedAttr_8_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2526:1: (lv_associatedAttr_8_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2526:1: (lv_associatedAttr_8_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2527:3: lv_associatedAttr_8_0= RULE_STRING
            {
            lv_associatedAttr_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute4670); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2543:2: ( (lv_memorized_9_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2544:1: (lv_memorized_9_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2544:1: (lv_memorized_9_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2545:3: lv_memorized_9_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getMemorizedBooleanParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleAttribute4696);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2561:2: ( (lv_memorizedAtInit_10_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2562:1: (lv_memorizedAtInit_10_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2562:1: (lv_memorizedAtInit_10_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2563:3: lv_memorizedAtInit_10_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getMemorizedAtInitBooleanParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleAttribute4717);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2579:2: ( (lv_changeEvent_11_0= ruleFireEvents ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2580:1: (lv_changeEvent_11_0= ruleFireEvents )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2580:1: (lv_changeEvent_11_0= ruleFireEvents )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2581:3: lv_changeEvent_11_0= ruleFireEvents
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getChangeEventFireEventsParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_ruleFireEvents_in_ruleAttribute4738);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2597:2: ( (lv_archiveEvent_12_0= ruleFireEvents ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2598:1: (lv_archiveEvent_12_0= ruleFireEvents )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2598:1: (lv_archiveEvent_12_0= ruleFireEvents )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2599:3: lv_archiveEvent_12_0= ruleFireEvents
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getArchiveEventFireEventsParserRuleCall_12_0()); 
            	    
            pushFollow(FOLLOW_ruleFireEvents_in_ruleAttribute4759);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2615:2: ( (lv_dataReadyEvent_13_0= ruleFireEvents ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2616:1: (lv_dataReadyEvent_13_0= ruleFireEvents )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2616:1: (lv_dataReadyEvent_13_0= ruleFireEvents )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2617:3: lv_dataReadyEvent_13_0= ruleFireEvents
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getDataReadyEventFireEventsParserRuleCall_13_0()); 
            	    
            pushFollow(FOLLOW_ruleFireEvents_in_ruleAttribute4780);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2633:2: ( (lv_status_14_0= ruleInheritanceStatus ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2634:1: (lv_status_14_0= ruleInheritanceStatus )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2634:1: (lv_status_14_0= ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2635:3: lv_status_14_0= ruleInheritanceStatus
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getStatusInheritanceStatusParserRuleCall_14_0()); 
            	    
            pushFollow(FOLLOW_ruleInheritanceStatus_in_ruleAttribute4801);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2651:2: ( (lv_properties_15_0= ruleAttrProperties ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2652:1: (lv_properties_15_0= ruleAttrProperties )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2652:1: (lv_properties_15_0= ruleAttrProperties )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2653:3: lv_properties_15_0= ruleAttrProperties
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getPropertiesAttrPropertiesParserRuleCall_15_0()); 
            	    
            pushFollow(FOLLOW_ruleAttrProperties_in_ruleAttribute4822);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2669:2: ( (lv_allocReadMember_16_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2670:1: (lv_allocReadMember_16_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2670:1: (lv_allocReadMember_16_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2671:3: lv_allocReadMember_16_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getAllocReadMemberBooleanParserRuleCall_16_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleAttribute4843);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2687:2: ( (lv_isDynamic_17_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2688:1: (lv_isDynamic_17_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2688:1: (lv_isDynamic_17_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2689:3: lv_isDynamic_17_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getIsDynamicBooleanParserRuleCall_17_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleAttribute4864);
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

            otherlv_18=(Token)match(input,45,FOLLOW_45_in_ruleAttribute4876); 

                	newLeafNode(otherlv_18, grammarAccess.getAttributeAccess().getReadExcludedStatesKeyword_18());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2709:1: ( (lv_readExcludedStates_19_0= RULE_STRING ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_STRING) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2710:1: (lv_readExcludedStates_19_0= RULE_STRING )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2710:1: (lv_readExcludedStates_19_0= RULE_STRING )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2711:3: lv_readExcludedStates_19_0= RULE_STRING
            	    {
            	    lv_readExcludedStates_19_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute4893); 

            	    			newLeafNode(lv_readExcludedStates_19_0, grammarAccess.getAttributeAccess().getReadExcludedStatesSTRINGTerminalRuleCall_19_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAttributeRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"readExcludedStates",
            	            		lv_readExcludedStates_19_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_20=(Token)match(input,46,FOLLOW_46_in_ruleAttribute4911); 

                	newLeafNode(otherlv_20, grammarAccess.getAttributeAccess().getWriteExcludedStatesKeyword_20());
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2731:1: ( (lv_writeExcludedStates_21_0= RULE_STRING ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_STRING) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2732:1: (lv_writeExcludedStates_21_0= RULE_STRING )
            	    {
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2732:1: (lv_writeExcludedStates_21_0= RULE_STRING )
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2733:3: lv_writeExcludedStates_21_0= RULE_STRING
            	    {
            	    lv_writeExcludedStates_21_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute4928); 

            	    			newLeafNode(lv_writeExcludedStates_21_0, grammarAccess.getAttributeAccess().getWriteExcludedStatesSTRINGTerminalRuleCall_21_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAttributeRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"writeExcludedStates",
            	            		lv_writeExcludedStates_21_0, 
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleFireEvents"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2757:1: entryRuleFireEvents returns [EObject current=null] : iv_ruleFireEvents= ruleFireEvents EOF ;
    public final EObject entryRuleFireEvents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFireEvents = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2758:2: (iv_ruleFireEvents= ruleFireEvents EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2759:2: iv_ruleFireEvents= ruleFireEvents EOF
            {
             newCompositeNode(grammarAccess.getFireEventsRule()); 
            pushFollow(FOLLOW_ruleFireEvents_in_entryRuleFireEvents4970);
            iv_ruleFireEvents=ruleFireEvents();

            state._fsp--;

             current =iv_ruleFireEvents; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFireEvents4980); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2766:1: ruleFireEvents returns [EObject current=null] : ( ( (lv_fire_0_0= ruleBoolean ) ) ( (lv_libCheckCriteria_1_0= ruleBoolean ) ) ) ;
    public final EObject ruleFireEvents() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_fire_0_0 = null;

        AntlrDatatypeRuleToken lv_libCheckCriteria_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2769:28: ( ( ( (lv_fire_0_0= ruleBoolean ) ) ( (lv_libCheckCriteria_1_0= ruleBoolean ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2770:1: ( ( (lv_fire_0_0= ruleBoolean ) ) ( (lv_libCheckCriteria_1_0= ruleBoolean ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2770:1: ( ( (lv_fire_0_0= ruleBoolean ) ) ( (lv_libCheckCriteria_1_0= ruleBoolean ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2770:2: ( (lv_fire_0_0= ruleBoolean ) ) ( (lv_libCheckCriteria_1_0= ruleBoolean ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2770:2: ( (lv_fire_0_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2771:1: (lv_fire_0_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2771:1: (lv_fire_0_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2772:3: lv_fire_0_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getFireEventsAccess().getFireBooleanParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleFireEvents5026);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2788:2: ( (lv_libCheckCriteria_1_0= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2789:1: (lv_libCheckCriteria_1_0= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2789:1: (lv_libCheckCriteria_1_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2790:3: lv_libCheckCriteria_1_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getFireEventsAccess().getLibCheckCriteriaBooleanParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleFireEvents5047);
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


    // $ANTLR start "entryRuleAttrProperties"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2814:1: entryRuleAttrProperties returns [EObject current=null] : iv_ruleAttrProperties= ruleAttrProperties EOF ;
    public final EObject entryRuleAttrProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrProperties = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2815:2: (iv_ruleAttrProperties= ruleAttrProperties EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2816:2: iv_ruleAttrProperties= ruleAttrProperties EOF
            {
             newCompositeNode(grammarAccess.getAttrPropertiesRule()); 
            pushFollow(FOLLOW_ruleAttrProperties_in_entryRuleAttrProperties5083);
            iv_ruleAttrProperties=ruleAttrProperties();

            state._fsp--;

             current =iv_ruleAttrProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrProperties5093); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2823:1: ruleAttrProperties returns [EObject current=null] : ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_label_1_0= RULE_STRING ) ) ( (lv_unit_2_0= RULE_STRING ) ) ( (lv_standardUnit_3_0= RULE_STRING ) ) ( (lv_displayUnit_4_0= RULE_STRING ) ) ( (lv_format_5_0= RULE_STRING ) ) ( (lv_maxValue_6_0= RULE_STRING ) ) ( (lv_minValue_7_0= RULE_STRING ) ) ( (lv_maxAlarm_8_0= RULE_STRING ) ) ( (lv_minAlarm_9_0= RULE_STRING ) ) ( (lv_maxWarning_10_0= RULE_STRING ) ) ( (lv_minWarning_11_0= RULE_STRING ) ) ( (lv_deltaTime_12_0= RULE_STRING ) ) ( (lv_deltaValue_13_0= RULE_STRING ) ) ) ;
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
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2826:28: ( ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_label_1_0= RULE_STRING ) ) ( (lv_unit_2_0= RULE_STRING ) ) ( (lv_standardUnit_3_0= RULE_STRING ) ) ( (lv_displayUnit_4_0= RULE_STRING ) ) ( (lv_format_5_0= RULE_STRING ) ) ( (lv_maxValue_6_0= RULE_STRING ) ) ( (lv_minValue_7_0= RULE_STRING ) ) ( (lv_maxAlarm_8_0= RULE_STRING ) ) ( (lv_minAlarm_9_0= RULE_STRING ) ) ( (lv_maxWarning_10_0= RULE_STRING ) ) ( (lv_minWarning_11_0= RULE_STRING ) ) ( (lv_deltaTime_12_0= RULE_STRING ) ) ( (lv_deltaValue_13_0= RULE_STRING ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2827:1: ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_label_1_0= RULE_STRING ) ) ( (lv_unit_2_0= RULE_STRING ) ) ( (lv_standardUnit_3_0= RULE_STRING ) ) ( (lv_displayUnit_4_0= RULE_STRING ) ) ( (lv_format_5_0= RULE_STRING ) ) ( (lv_maxValue_6_0= RULE_STRING ) ) ( (lv_minValue_7_0= RULE_STRING ) ) ( (lv_maxAlarm_8_0= RULE_STRING ) ) ( (lv_minAlarm_9_0= RULE_STRING ) ) ( (lv_maxWarning_10_0= RULE_STRING ) ) ( (lv_minWarning_11_0= RULE_STRING ) ) ( (lv_deltaTime_12_0= RULE_STRING ) ) ( (lv_deltaValue_13_0= RULE_STRING ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2827:1: ( ( (lv_description_0_0= RULE_STRING ) ) ( (lv_label_1_0= RULE_STRING ) ) ( (lv_unit_2_0= RULE_STRING ) ) ( (lv_standardUnit_3_0= RULE_STRING ) ) ( (lv_displayUnit_4_0= RULE_STRING ) ) ( (lv_format_5_0= RULE_STRING ) ) ( (lv_maxValue_6_0= RULE_STRING ) ) ( (lv_minValue_7_0= RULE_STRING ) ) ( (lv_maxAlarm_8_0= RULE_STRING ) ) ( (lv_minAlarm_9_0= RULE_STRING ) ) ( (lv_maxWarning_10_0= RULE_STRING ) ) ( (lv_minWarning_11_0= RULE_STRING ) ) ( (lv_deltaTime_12_0= RULE_STRING ) ) ( (lv_deltaValue_13_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2827:2: ( (lv_description_0_0= RULE_STRING ) ) ( (lv_label_1_0= RULE_STRING ) ) ( (lv_unit_2_0= RULE_STRING ) ) ( (lv_standardUnit_3_0= RULE_STRING ) ) ( (lv_displayUnit_4_0= RULE_STRING ) ) ( (lv_format_5_0= RULE_STRING ) ) ( (lv_maxValue_6_0= RULE_STRING ) ) ( (lv_minValue_7_0= RULE_STRING ) ) ( (lv_maxAlarm_8_0= RULE_STRING ) ) ( (lv_minAlarm_9_0= RULE_STRING ) ) ( (lv_maxWarning_10_0= RULE_STRING ) ) ( (lv_minWarning_11_0= RULE_STRING ) ) ( (lv_deltaTime_12_0= RULE_STRING ) ) ( (lv_deltaValue_13_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2827:2: ( (lv_description_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2828:1: (lv_description_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2828:1: (lv_description_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2829:3: lv_description_0_0= RULE_STRING
            {
            lv_description_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5135); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2845:2: ( (lv_label_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2846:1: (lv_label_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2846:1: (lv_label_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2847:3: lv_label_1_0= RULE_STRING
            {
            lv_label_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5157); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2863:2: ( (lv_unit_2_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2864:1: (lv_unit_2_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2864:1: (lv_unit_2_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2865:3: lv_unit_2_0= RULE_STRING
            {
            lv_unit_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5179); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2881:2: ( (lv_standardUnit_3_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2882:1: (lv_standardUnit_3_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2882:1: (lv_standardUnit_3_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2883:3: lv_standardUnit_3_0= RULE_STRING
            {
            lv_standardUnit_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5201); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2899:2: ( (lv_displayUnit_4_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2900:1: (lv_displayUnit_4_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2900:1: (lv_displayUnit_4_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2901:3: lv_displayUnit_4_0= RULE_STRING
            {
            lv_displayUnit_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5223); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2917:2: ( (lv_format_5_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2918:1: (lv_format_5_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2918:1: (lv_format_5_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2919:3: lv_format_5_0= RULE_STRING
            {
            lv_format_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5245); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2935:2: ( (lv_maxValue_6_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2936:1: (lv_maxValue_6_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2936:1: (lv_maxValue_6_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2937:3: lv_maxValue_6_0= RULE_STRING
            {
            lv_maxValue_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5267); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2953:2: ( (lv_minValue_7_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2954:1: (lv_minValue_7_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2954:1: (lv_minValue_7_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2955:3: lv_minValue_7_0= RULE_STRING
            {
            lv_minValue_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5289); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2971:2: ( (lv_maxAlarm_8_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2972:1: (lv_maxAlarm_8_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2972:1: (lv_maxAlarm_8_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2973:3: lv_maxAlarm_8_0= RULE_STRING
            {
            lv_maxAlarm_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5311); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2989:2: ( (lv_minAlarm_9_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2990:1: (lv_minAlarm_9_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2990:1: (lv_minAlarm_9_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2991:3: lv_minAlarm_9_0= RULE_STRING
            {
            lv_minAlarm_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5333); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3007:2: ( (lv_maxWarning_10_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3008:1: (lv_maxWarning_10_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3008:1: (lv_maxWarning_10_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3009:3: lv_maxWarning_10_0= RULE_STRING
            {
            lv_maxWarning_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5355); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3025:2: ( (lv_minWarning_11_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3026:1: (lv_minWarning_11_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3026:1: (lv_minWarning_11_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3027:3: lv_minWarning_11_0= RULE_STRING
            {
            lv_minWarning_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5377); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3043:2: ( (lv_deltaTime_12_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3044:1: (lv_deltaTime_12_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3044:1: (lv_deltaTime_12_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3045:3: lv_deltaTime_12_0= RULE_STRING
            {
            lv_deltaTime_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5399); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3061:2: ( (lv_deltaValue_13_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3062:1: (lv_deltaValue_13_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3062:1: (lv_deltaValue_13_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3063:3: lv_deltaValue_13_0= RULE_STRING
            {
            lv_deltaValue_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties5421); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3087:1: entryRuleAdditionalFile returns [EObject current=null] : iv_ruleAdditionalFile= ruleAdditionalFile EOF ;
    public final EObject entryRuleAdditionalFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionalFile = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3088:2: (iv_ruleAdditionalFile= ruleAdditionalFile EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3089:2: iv_ruleAdditionalFile= ruleAdditionalFile EOF
            {
             newCompositeNode(grammarAccess.getAdditionalFileRule()); 
            pushFollow(FOLLOW_ruleAdditionalFile_in_entryRuleAdditionalFile5462);
            iv_ruleAdditionalFile=ruleAdditionalFile();

            state._fsp--;

             current =iv_ruleAdditionalFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionalFile5472); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3096:1: ruleAdditionalFile returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_path_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAdditionalFile() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_path_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3099:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_path_1_0= RULE_STRING ) ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3100:1: ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_path_1_0= RULE_STRING ) ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3100:1: ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_path_1_0= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3100:2: ( (lv_name_0_0= RULE_STRING ) ) ( (lv_path_1_0= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3100:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3101:1: (lv_name_0_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3101:1: (lv_name_0_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3102:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAdditionalFile5514); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3118:2: ( (lv_path_1_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3119:1: (lv_path_1_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3119:1: (lv_path_1_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3120:3: lv_path_1_0= RULE_STRING
            {
            lv_path_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAdditionalFile5536); 

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


    // $ANTLR start "entryRuleType"
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3144:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3145:2: (iv_ruleType= ruleType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3146:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType5577);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType5587); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3153:1: ruleType returns [EObject current=null] : (this_VoidType_0= ruleVoidType | this_BooleanType_1= ruleBooleanType | this_ShortType_2= ruleShortType | this_UShortType_3= ruleUShortType | this_IntType_4= ruleIntType | this_UIntType_5= ruleUIntType | this_FloatType_6= ruleFloatType | this_DoubleType_7= ruleDoubleType | this_StringType_8= ruleStringType | this_CharArrayType_9= ruleCharArrayType | this_ShortArrayType_10= ruleShortArrayType | this_UShortArrayType_11= ruleUShortArrayType | this_IntArrayType_12= ruleIntArrayType | this_UIntArrayType_13= ruleUIntArrayType | this_FloatArrayType_14= ruleFloatArrayType | this_DoubleArrayType_15= ruleDoubleArrayType | this_StringArrayType_16= ruleStringArrayType | this_LongStringArrayType_17= ruleLongStringArrayType | this_DoubleStringArrayType_18= ruleDoubleStringArrayType | this_StateType_19= ruleStateType | this_ConstStringType_20= ruleConstStringType | this_BooleanArrayType_21= ruleBooleanArrayType | this_LongType_22= ruleLongType | this_ULongType_23= ruleULongType | this_UCharType_24= ruleUCharType | this_LongArrayType_25= ruleLongArrayType | this_ULongArrayType_26= ruleULongArrayType | this_DevIntType_27= ruleDevIntType | this_EncodedType_28= ruleEncodedType ) ;
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
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3156:28: ( (this_VoidType_0= ruleVoidType | this_BooleanType_1= ruleBooleanType | this_ShortType_2= ruleShortType | this_UShortType_3= ruleUShortType | this_IntType_4= ruleIntType | this_UIntType_5= ruleUIntType | this_FloatType_6= ruleFloatType | this_DoubleType_7= ruleDoubleType | this_StringType_8= ruleStringType | this_CharArrayType_9= ruleCharArrayType | this_ShortArrayType_10= ruleShortArrayType | this_UShortArrayType_11= ruleUShortArrayType | this_IntArrayType_12= ruleIntArrayType | this_UIntArrayType_13= ruleUIntArrayType | this_FloatArrayType_14= ruleFloatArrayType | this_DoubleArrayType_15= ruleDoubleArrayType | this_StringArrayType_16= ruleStringArrayType | this_LongStringArrayType_17= ruleLongStringArrayType | this_DoubleStringArrayType_18= ruleDoubleStringArrayType | this_StateType_19= ruleStateType | this_ConstStringType_20= ruleConstStringType | this_BooleanArrayType_21= ruleBooleanArrayType | this_LongType_22= ruleLongType | this_ULongType_23= ruleULongType | this_UCharType_24= ruleUCharType | this_LongArrayType_25= ruleLongArrayType | this_ULongArrayType_26= ruleULongArrayType | this_DevIntType_27= ruleDevIntType | this_EncodedType_28= ruleEncodedType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3157:1: (this_VoidType_0= ruleVoidType | this_BooleanType_1= ruleBooleanType | this_ShortType_2= ruleShortType | this_UShortType_3= ruleUShortType | this_IntType_4= ruleIntType | this_UIntType_5= ruleUIntType | this_FloatType_6= ruleFloatType | this_DoubleType_7= ruleDoubleType | this_StringType_8= ruleStringType | this_CharArrayType_9= ruleCharArrayType | this_ShortArrayType_10= ruleShortArrayType | this_UShortArrayType_11= ruleUShortArrayType | this_IntArrayType_12= ruleIntArrayType | this_UIntArrayType_13= ruleUIntArrayType | this_FloatArrayType_14= ruleFloatArrayType | this_DoubleArrayType_15= ruleDoubleArrayType | this_StringArrayType_16= ruleStringArrayType | this_LongStringArrayType_17= ruleLongStringArrayType | this_DoubleStringArrayType_18= ruleDoubleStringArrayType | this_StateType_19= ruleStateType | this_ConstStringType_20= ruleConstStringType | this_BooleanArrayType_21= ruleBooleanArrayType | this_LongType_22= ruleLongType | this_ULongType_23= ruleULongType | this_UCharType_24= ruleUCharType | this_LongArrayType_25= ruleLongArrayType | this_ULongArrayType_26= ruleULongArrayType | this_DevIntType_27= ruleDevIntType | this_EncodedType_28= ruleEncodedType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3157:1: (this_VoidType_0= ruleVoidType | this_BooleanType_1= ruleBooleanType | this_ShortType_2= ruleShortType | this_UShortType_3= ruleUShortType | this_IntType_4= ruleIntType | this_UIntType_5= ruleUIntType | this_FloatType_6= ruleFloatType | this_DoubleType_7= ruleDoubleType | this_StringType_8= ruleStringType | this_CharArrayType_9= ruleCharArrayType | this_ShortArrayType_10= ruleShortArrayType | this_UShortArrayType_11= ruleUShortArrayType | this_IntArrayType_12= ruleIntArrayType | this_UIntArrayType_13= ruleUIntArrayType | this_FloatArrayType_14= ruleFloatArrayType | this_DoubleArrayType_15= ruleDoubleArrayType | this_StringArrayType_16= ruleStringArrayType | this_LongStringArrayType_17= ruleLongStringArrayType | this_DoubleStringArrayType_18= ruleDoubleStringArrayType | this_StateType_19= ruleStateType | this_ConstStringType_20= ruleConstStringType | this_BooleanArrayType_21= ruleBooleanArrayType | this_LongType_22= ruleLongType | this_ULongType_23= ruleULongType | this_UCharType_24= ruleUCharType | this_LongArrayType_25= ruleLongArrayType | this_ULongArrayType_26= ruleULongArrayType | this_DevIntType_27= ruleDevIntType | this_EncodedType_28= ruleEncodedType )
            int alt26=29;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt26=1;
                }
                break;
            case 48:
                {
                alt26=2;
                }
                break;
            case 49:
                {
                alt26=3;
                }
                break;
            case 50:
                {
                alt26=4;
                }
                break;
            case 51:
                {
                alt26=5;
                }
                break;
            case 52:
                {
                alt26=6;
                }
                break;
            case 53:
                {
                alt26=7;
                }
                break;
            case 54:
                {
                alt26=8;
                }
                break;
            case 55:
                {
                alt26=9;
                }
                break;
            case 56:
                {
                alt26=10;
                }
                break;
            case 57:
                {
                alt26=11;
                }
                break;
            case 58:
                {
                alt26=12;
                }
                break;
            case 59:
                {
                alt26=13;
                }
                break;
            case 60:
                {
                alt26=14;
                }
                break;
            case 61:
                {
                alt26=15;
                }
                break;
            case 62:
                {
                alt26=16;
                }
                break;
            case 63:
                {
                alt26=17;
                }
                break;
            case 64:
                {
                alt26=18;
                }
                break;
            case 65:
                {
                alt26=19;
                }
                break;
            case 66:
                {
                alt26=20;
                }
                break;
            case 67:
                {
                alt26=21;
                }
                break;
            case 68:
                {
                alt26=22;
                }
                break;
            case 70:
                {
                alt26=23;
                }
                break;
            case 71:
                {
                alt26=24;
                }
                break;
            case 69:
                {
                alt26=25;
                }
                break;
            case 72:
                {
                alt26=26;
                }
                break;
            case 73:
                {
                alt26=27;
                }
                break;
            case 74:
                {
                alt26=28;
                }
                break;
            case 75:
                {
                alt26=29;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3158:5: this_VoidType_0= ruleVoidType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getVoidTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVoidType_in_ruleType5634);
                    this_VoidType_0=ruleVoidType();

                    state._fsp--;

                     
                            current = this_VoidType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3168:5: this_BooleanType_1= ruleBooleanType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getBooleanTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBooleanType_in_ruleType5661);
                    this_BooleanType_1=ruleBooleanType();

                    state._fsp--;

                     
                            current = this_BooleanType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3178:5: this_ShortType_2= ruleShortType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getShortTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleShortType_in_ruleType5688);
                    this_ShortType_2=ruleShortType();

                    state._fsp--;

                     
                            current = this_ShortType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3188:5: this_UShortType_3= ruleUShortType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getUShortTypeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleUShortType_in_ruleType5715);
                    this_UShortType_3=ruleUShortType();

                    state._fsp--;

                     
                            current = this_UShortType_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3198:5: this_IntType_4= ruleIntType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getIntTypeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleIntType_in_ruleType5742);
                    this_IntType_4=ruleIntType();

                    state._fsp--;

                     
                            current = this_IntType_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3208:5: this_UIntType_5= ruleUIntType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getUIntTypeParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleUIntType_in_ruleType5769);
                    this_UIntType_5=ruleUIntType();

                    state._fsp--;

                     
                            current = this_UIntType_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3218:5: this_FloatType_6= ruleFloatType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getFloatTypeParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleFloatType_in_ruleType5796);
                    this_FloatType_6=ruleFloatType();

                    state._fsp--;

                     
                            current = this_FloatType_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3228:5: this_DoubleType_7= ruleDoubleType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDoubleTypeParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleDoubleType_in_ruleType5823);
                    this_DoubleType_7=ruleDoubleType();

                    state._fsp--;

                     
                            current = this_DoubleType_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3238:5: this_StringType_8= ruleStringType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getStringTypeParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleStringType_in_ruleType5850);
                    this_StringType_8=ruleStringType();

                    state._fsp--;

                     
                            current = this_StringType_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3248:5: this_CharArrayType_9= ruleCharArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getCharArrayTypeParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleCharArrayType_in_ruleType5877);
                    this_CharArrayType_9=ruleCharArrayType();

                    state._fsp--;

                     
                            current = this_CharArrayType_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3258:5: this_ShortArrayType_10= ruleShortArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getShortArrayTypeParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleShortArrayType_in_ruleType5904);
                    this_ShortArrayType_10=ruleShortArrayType();

                    state._fsp--;

                     
                            current = this_ShortArrayType_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3268:5: this_UShortArrayType_11= ruleUShortArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getUShortArrayTypeParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleUShortArrayType_in_ruleType5931);
                    this_UShortArrayType_11=ruleUShortArrayType();

                    state._fsp--;

                     
                            current = this_UShortArrayType_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3278:5: this_IntArrayType_12= ruleIntArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getIntArrayTypeParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleIntArrayType_in_ruleType5958);
                    this_IntArrayType_12=ruleIntArrayType();

                    state._fsp--;

                     
                            current = this_IntArrayType_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3288:5: this_UIntArrayType_13= ruleUIntArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getUIntArrayTypeParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleUIntArrayType_in_ruleType5985);
                    this_UIntArrayType_13=ruleUIntArrayType();

                    state._fsp--;

                     
                            current = this_UIntArrayType_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3298:5: this_FloatArrayType_14= ruleFloatArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getFloatArrayTypeParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_ruleFloatArrayType_in_ruleType6012);
                    this_FloatArrayType_14=ruleFloatArrayType();

                    state._fsp--;

                     
                            current = this_FloatArrayType_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 16 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3308:5: this_DoubleArrayType_15= ruleDoubleArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDoubleArrayTypeParserRuleCall_15()); 
                        
                    pushFollow(FOLLOW_ruleDoubleArrayType_in_ruleType6039);
                    this_DoubleArrayType_15=ruleDoubleArrayType();

                    state._fsp--;

                     
                            current = this_DoubleArrayType_15; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 17 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3318:5: this_StringArrayType_16= ruleStringArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getStringArrayTypeParserRuleCall_16()); 
                        
                    pushFollow(FOLLOW_ruleStringArrayType_in_ruleType6066);
                    this_StringArrayType_16=ruleStringArrayType();

                    state._fsp--;

                     
                            current = this_StringArrayType_16; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 18 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3328:5: this_LongStringArrayType_17= ruleLongStringArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getLongStringArrayTypeParserRuleCall_17()); 
                        
                    pushFollow(FOLLOW_ruleLongStringArrayType_in_ruleType6093);
                    this_LongStringArrayType_17=ruleLongStringArrayType();

                    state._fsp--;

                     
                            current = this_LongStringArrayType_17; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 19 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3338:5: this_DoubleStringArrayType_18= ruleDoubleStringArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDoubleStringArrayTypeParserRuleCall_18()); 
                        
                    pushFollow(FOLLOW_ruleDoubleStringArrayType_in_ruleType6120);
                    this_DoubleStringArrayType_18=ruleDoubleStringArrayType();

                    state._fsp--;

                     
                            current = this_DoubleStringArrayType_18; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 20 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3348:5: this_StateType_19= ruleStateType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getStateTypeParserRuleCall_19()); 
                        
                    pushFollow(FOLLOW_ruleStateType_in_ruleType6147);
                    this_StateType_19=ruleStateType();

                    state._fsp--;

                     
                            current = this_StateType_19; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 21 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3358:5: this_ConstStringType_20= ruleConstStringType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getConstStringTypeParserRuleCall_20()); 
                        
                    pushFollow(FOLLOW_ruleConstStringType_in_ruleType6174);
                    this_ConstStringType_20=ruleConstStringType();

                    state._fsp--;

                     
                            current = this_ConstStringType_20; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 22 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3368:5: this_BooleanArrayType_21= ruleBooleanArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getBooleanArrayTypeParserRuleCall_21()); 
                        
                    pushFollow(FOLLOW_ruleBooleanArrayType_in_ruleType6201);
                    this_BooleanArrayType_21=ruleBooleanArrayType();

                    state._fsp--;

                     
                            current = this_BooleanArrayType_21; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 23 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3378:5: this_LongType_22= ruleLongType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getLongTypeParserRuleCall_22()); 
                        
                    pushFollow(FOLLOW_ruleLongType_in_ruleType6228);
                    this_LongType_22=ruleLongType();

                    state._fsp--;

                     
                            current = this_LongType_22; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 24 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3388:5: this_ULongType_23= ruleULongType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getULongTypeParserRuleCall_23()); 
                        
                    pushFollow(FOLLOW_ruleULongType_in_ruleType6255);
                    this_ULongType_23=ruleULongType();

                    state._fsp--;

                     
                            current = this_ULongType_23; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 25 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3398:5: this_UCharType_24= ruleUCharType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getUCharTypeParserRuleCall_24()); 
                        
                    pushFollow(FOLLOW_ruleUCharType_in_ruleType6282);
                    this_UCharType_24=ruleUCharType();

                    state._fsp--;

                     
                            current = this_UCharType_24; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 26 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3408:5: this_LongArrayType_25= ruleLongArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getLongArrayTypeParserRuleCall_25()); 
                        
                    pushFollow(FOLLOW_ruleLongArrayType_in_ruleType6309);
                    this_LongArrayType_25=ruleLongArrayType();

                    state._fsp--;

                     
                            current = this_LongArrayType_25; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 27 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3418:5: this_ULongArrayType_26= ruleULongArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getULongArrayTypeParserRuleCall_26()); 
                        
                    pushFollow(FOLLOW_ruleULongArrayType_in_ruleType6336);
                    this_ULongArrayType_26=ruleULongArrayType();

                    state._fsp--;

                     
                            current = this_ULongArrayType_26; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 28 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3428:5: this_DevIntType_27= ruleDevIntType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDevIntTypeParserRuleCall_27()); 
                        
                    pushFollow(FOLLOW_ruleDevIntType_in_ruleType6363);
                    this_DevIntType_27=ruleDevIntType();

                    state._fsp--;

                     
                            current = this_DevIntType_27; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 29 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3438:5: this_EncodedType_28= ruleEncodedType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getEncodedTypeParserRuleCall_28()); 
                        
                    pushFollow(FOLLOW_ruleEncodedType_in_ruleType6390);
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3454:1: entryRuleVoidType returns [EObject current=null] : iv_ruleVoidType= ruleVoidType EOF ;
    public final EObject entryRuleVoidType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoidType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3455:2: (iv_ruleVoidType= ruleVoidType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3456:2: iv_ruleVoidType= ruleVoidType EOF
            {
             newCompositeNode(grammarAccess.getVoidTypeRule()); 
            pushFollow(FOLLOW_ruleVoidType_in_entryRuleVoidType6425);
            iv_ruleVoidType=ruleVoidType();

            state._fsp--;

             current =iv_ruleVoidType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVoidType6435); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3463:1: ruleVoidType returns [EObject current=null] : ( () otherlv_1= 'void' ) ;
    public final EObject ruleVoidType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3466:28: ( ( () otherlv_1= 'void' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3467:1: ( () otherlv_1= 'void' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3467:1: ( () otherlv_1= 'void' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3467:2: () otherlv_1= 'void'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3467:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3468:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVoidTypeAccess().getVoidTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleVoidType6481); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3485:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3486:2: (iv_ruleBooleanType= ruleBooleanType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3487:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
             newCompositeNode(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanType_in_entryRuleBooleanType6517);
            iv_ruleBooleanType=ruleBooleanType();

            state._fsp--;

             current =iv_ruleBooleanType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanType6527); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3494:1: ruleBooleanType returns [EObject current=null] : ( () otherlv_1= 'boolean' ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3497:28: ( ( () otherlv_1= 'boolean' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3498:1: ( () otherlv_1= 'boolean' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3498:1: ( () otherlv_1= 'boolean' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3498:2: () otherlv_1= 'boolean'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3498:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3499:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleBooleanType6573); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3516:1: entryRuleShortType returns [EObject current=null] : iv_ruleShortType= ruleShortType EOF ;
    public final EObject entryRuleShortType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3517:2: (iv_ruleShortType= ruleShortType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3518:2: iv_ruleShortType= ruleShortType EOF
            {
             newCompositeNode(grammarAccess.getShortTypeRule()); 
            pushFollow(FOLLOW_ruleShortType_in_entryRuleShortType6609);
            iv_ruleShortType=ruleShortType();

            state._fsp--;

             current =iv_ruleShortType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortType6619); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3525:1: ruleShortType returns [EObject current=null] : ( () otherlv_1= 'short' ) ;
    public final EObject ruleShortType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3528:28: ( ( () otherlv_1= 'short' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3529:1: ( () otherlv_1= 'short' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3529:1: ( () otherlv_1= 'short' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3529:2: () otherlv_1= 'short'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3529:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3530:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getShortTypeAccess().getShortTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleShortType6665); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3547:1: entryRuleUShortType returns [EObject current=null] : iv_ruleUShortType= ruleUShortType EOF ;
    public final EObject entryRuleUShortType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUShortType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3548:2: (iv_ruleUShortType= ruleUShortType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3549:2: iv_ruleUShortType= ruleUShortType EOF
            {
             newCompositeNode(grammarAccess.getUShortTypeRule()); 
            pushFollow(FOLLOW_ruleUShortType_in_entryRuleUShortType6701);
            iv_ruleUShortType=ruleUShortType();

            state._fsp--;

             current =iv_ruleUShortType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUShortType6711); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3556:1: ruleUShortType returns [EObject current=null] : ( () otherlv_1= 'ushort' ) ;
    public final EObject ruleUShortType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3559:28: ( ( () otherlv_1= 'ushort' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3560:1: ( () otherlv_1= 'ushort' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3560:1: ( () otherlv_1= 'ushort' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3560:2: () otherlv_1= 'ushort'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3560:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3561:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUShortTypeAccess().getUShortTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleUShortType6757); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3578:1: entryRuleIntType returns [EObject current=null] : iv_ruleIntType= ruleIntType EOF ;
    public final EObject entryRuleIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3579:2: (iv_ruleIntType= ruleIntType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3580:2: iv_ruleIntType= ruleIntType EOF
            {
             newCompositeNode(grammarAccess.getIntTypeRule()); 
            pushFollow(FOLLOW_ruleIntType_in_entryRuleIntType6793);
            iv_ruleIntType=ruleIntType();

            state._fsp--;

             current =iv_ruleIntType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntType6803); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3587:1: ruleIntType returns [EObject current=null] : ( () otherlv_1= 'int' ) ;
    public final EObject ruleIntType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3590:28: ( ( () otherlv_1= 'int' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3591:1: ( () otherlv_1= 'int' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3591:1: ( () otherlv_1= 'int' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3591:2: () otherlv_1= 'int'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3591:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3592:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntTypeAccess().getIntTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleIntType6849); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3609:1: entryRuleUIntType returns [EObject current=null] : iv_ruleUIntType= ruleUIntType EOF ;
    public final EObject entryRuleUIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIntType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3610:2: (iv_ruleUIntType= ruleUIntType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3611:2: iv_ruleUIntType= ruleUIntType EOF
            {
             newCompositeNode(grammarAccess.getUIntTypeRule()); 
            pushFollow(FOLLOW_ruleUIntType_in_entryRuleUIntType6885);
            iv_ruleUIntType=ruleUIntType();

            state._fsp--;

             current =iv_ruleUIntType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIntType6895); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3618:1: ruleUIntType returns [EObject current=null] : ( () otherlv_1= 'uint' ) ;
    public final EObject ruleUIntType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3621:28: ( ( () otherlv_1= 'uint' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3622:1: ( () otherlv_1= 'uint' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3622:1: ( () otherlv_1= 'uint' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3622:2: () otherlv_1= 'uint'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3622:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3623:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUIntTypeAccess().getUIntTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleUIntType6941); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3640:1: entryRuleFloatType returns [EObject current=null] : iv_ruleFloatType= ruleFloatType EOF ;
    public final EObject entryRuleFloatType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3641:2: (iv_ruleFloatType= ruleFloatType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3642:2: iv_ruleFloatType= ruleFloatType EOF
            {
             newCompositeNode(grammarAccess.getFloatTypeRule()); 
            pushFollow(FOLLOW_ruleFloatType_in_entryRuleFloatType6977);
            iv_ruleFloatType=ruleFloatType();

            state._fsp--;

             current =iv_ruleFloatType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatType6987); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3649:1: ruleFloatType returns [EObject current=null] : ( () otherlv_1= 'float' ) ;
    public final EObject ruleFloatType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3652:28: ( ( () otherlv_1= 'float' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3653:1: ( () otherlv_1= 'float' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3653:1: ( () otherlv_1= 'float' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3653:2: () otherlv_1= 'float'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3653:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3654:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFloatTypeAccess().getFloatTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleFloatType7033); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3671:1: entryRuleDoubleType returns [EObject current=null] : iv_ruleDoubleType= ruleDoubleType EOF ;
    public final EObject entryRuleDoubleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3672:2: (iv_ruleDoubleType= ruleDoubleType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3673:2: iv_ruleDoubleType= ruleDoubleType EOF
            {
             newCompositeNode(grammarAccess.getDoubleTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleType_in_entryRuleDoubleType7069);
            iv_ruleDoubleType=ruleDoubleType();

            state._fsp--;

             current =iv_ruleDoubleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleType7079); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3680:1: ruleDoubleType returns [EObject current=null] : ( () otherlv_1= 'double' ) ;
    public final EObject ruleDoubleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3683:28: ( ( () otherlv_1= 'double' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3684:1: ( () otherlv_1= 'double' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3684:1: ( () otherlv_1= 'double' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3684:2: () otherlv_1= 'double'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3684:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3685:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDoubleTypeAccess().getDoubleTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleDoubleType7125); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3702:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3703:2: (iv_ruleStringType= ruleStringType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3704:2: iv_ruleStringType= ruleStringType EOF
            {
             newCompositeNode(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType7161);
            iv_ruleStringType=ruleStringType();

            state._fsp--;

             current =iv_ruleStringType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType7171); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3711:1: ruleStringType returns [EObject current=null] : ( () otherlv_1= 'string' ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3714:28: ( ( () otherlv_1= 'string' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3715:1: ( () otherlv_1= 'string' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3715:1: ( () otherlv_1= 'string' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3715:2: () otherlv_1= 'string'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3715:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3716:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleStringType7217); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3733:1: entryRuleCharArrayType returns [EObject current=null] : iv_ruleCharArrayType= ruleCharArrayType EOF ;
    public final EObject entryRuleCharArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3734:2: (iv_ruleCharArrayType= ruleCharArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3735:2: iv_ruleCharArrayType= ruleCharArrayType EOF
            {
             newCompositeNode(grammarAccess.getCharArrayTypeRule()); 
            pushFollow(FOLLOW_ruleCharArrayType_in_entryRuleCharArrayType7253);
            iv_ruleCharArrayType=ruleCharArrayType();

            state._fsp--;

             current =iv_ruleCharArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharArrayType7263); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3742:1: ruleCharArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarCharArray' ) ;
    public final EObject ruleCharArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3745:28: ( ( () otherlv_1= 'DevVarCharArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3746:1: ( () otherlv_1= 'DevVarCharArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3746:1: ( () otherlv_1= 'DevVarCharArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3746:2: () otherlv_1= 'DevVarCharArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3746:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3747:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCharArrayTypeAccess().getCharArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleCharArrayType7309); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3764:1: entryRuleShortArrayType returns [EObject current=null] : iv_ruleShortArrayType= ruleShortArrayType EOF ;
    public final EObject entryRuleShortArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3765:2: (iv_ruleShortArrayType= ruleShortArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3766:2: iv_ruleShortArrayType= ruleShortArrayType EOF
            {
             newCompositeNode(grammarAccess.getShortArrayTypeRule()); 
            pushFollow(FOLLOW_ruleShortArrayType_in_entryRuleShortArrayType7345);
            iv_ruleShortArrayType=ruleShortArrayType();

            state._fsp--;

             current =iv_ruleShortArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortArrayType7355); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3773:1: ruleShortArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarShortArray' ) ;
    public final EObject ruleShortArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3776:28: ( ( () otherlv_1= 'DevVarShortArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3777:1: ( () otherlv_1= 'DevVarShortArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3777:1: ( () otherlv_1= 'DevVarShortArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3777:2: () otherlv_1= 'DevVarShortArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3777:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3778:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getShortArrayTypeAccess().getShortArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleShortArrayType7401); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3795:1: entryRuleUShortArrayType returns [EObject current=null] : iv_ruleUShortArrayType= ruleUShortArrayType EOF ;
    public final EObject entryRuleUShortArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUShortArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3796:2: (iv_ruleUShortArrayType= ruleUShortArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3797:2: iv_ruleUShortArrayType= ruleUShortArrayType EOF
            {
             newCompositeNode(grammarAccess.getUShortArrayTypeRule()); 
            pushFollow(FOLLOW_ruleUShortArrayType_in_entryRuleUShortArrayType7437);
            iv_ruleUShortArrayType=ruleUShortArrayType();

            state._fsp--;

             current =iv_ruleUShortArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUShortArrayType7447); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3804:1: ruleUShortArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarUShortArray' ) ;
    public final EObject ruleUShortArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3807:28: ( ( () otherlv_1= 'DevVarUShortArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3808:1: ( () otherlv_1= 'DevVarUShortArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3808:1: ( () otherlv_1= 'DevVarUShortArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3808:2: () otherlv_1= 'DevVarUShortArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3808:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3809:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUShortArrayTypeAccess().getUShortArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleUShortArrayType7493); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3826:1: entryRuleIntArrayType returns [EObject current=null] : iv_ruleIntArrayType= ruleIntArrayType EOF ;
    public final EObject entryRuleIntArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3827:2: (iv_ruleIntArrayType= ruleIntArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3828:2: iv_ruleIntArrayType= ruleIntArrayType EOF
            {
             newCompositeNode(grammarAccess.getIntArrayTypeRule()); 
            pushFollow(FOLLOW_ruleIntArrayType_in_entryRuleIntArrayType7529);
            iv_ruleIntArrayType=ruleIntArrayType();

            state._fsp--;

             current =iv_ruleIntArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntArrayType7539); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3835:1: ruleIntArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarLongArray' ) ;
    public final EObject ruleIntArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3838:28: ( ( () otherlv_1= 'DevVarLongArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3839:1: ( () otherlv_1= 'DevVarLongArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3839:1: ( () otherlv_1= 'DevVarLongArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3839:2: () otherlv_1= 'DevVarLongArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3839:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3840:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntArrayTypeAccess().getIntArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleIntArrayType7585); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3857:1: entryRuleUIntArrayType returns [EObject current=null] : iv_ruleUIntArrayType= ruleUIntArrayType EOF ;
    public final EObject entryRuleUIntArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIntArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3858:2: (iv_ruleUIntArrayType= ruleUIntArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3859:2: iv_ruleUIntArrayType= ruleUIntArrayType EOF
            {
             newCompositeNode(grammarAccess.getUIntArrayTypeRule()); 
            pushFollow(FOLLOW_ruleUIntArrayType_in_entryRuleUIntArrayType7621);
            iv_ruleUIntArrayType=ruleUIntArrayType();

            state._fsp--;

             current =iv_ruleUIntArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIntArrayType7631); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3866:1: ruleUIntArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarULongArray' ) ;
    public final EObject ruleUIntArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3869:28: ( ( () otherlv_1= 'DevVarULongArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3870:1: ( () otherlv_1= 'DevVarULongArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3870:1: ( () otherlv_1= 'DevVarULongArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3870:2: () otherlv_1= 'DevVarULongArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3870:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3871:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUIntArrayTypeAccess().getUIntArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleUIntArrayType7677); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3888:1: entryRuleFloatArrayType returns [EObject current=null] : iv_ruleFloatArrayType= ruleFloatArrayType EOF ;
    public final EObject entryRuleFloatArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3889:2: (iv_ruleFloatArrayType= ruleFloatArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3890:2: iv_ruleFloatArrayType= ruleFloatArrayType EOF
            {
             newCompositeNode(grammarAccess.getFloatArrayTypeRule()); 
            pushFollow(FOLLOW_ruleFloatArrayType_in_entryRuleFloatArrayType7713);
            iv_ruleFloatArrayType=ruleFloatArrayType();

            state._fsp--;

             current =iv_ruleFloatArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatArrayType7723); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3897:1: ruleFloatArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarFloatArray' ) ;
    public final EObject ruleFloatArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3900:28: ( ( () otherlv_1= 'DevVarFloatArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3901:1: ( () otherlv_1= 'DevVarFloatArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3901:1: ( () otherlv_1= 'DevVarFloatArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3901:2: () otherlv_1= 'DevVarFloatArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3901:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3902:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFloatArrayTypeAccess().getFloatArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleFloatArrayType7769); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3919:1: entryRuleDoubleArrayType returns [EObject current=null] : iv_ruleDoubleArrayType= ruleDoubleArrayType EOF ;
    public final EObject entryRuleDoubleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3920:2: (iv_ruleDoubleArrayType= ruleDoubleArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3921:2: iv_ruleDoubleArrayType= ruleDoubleArrayType EOF
            {
             newCompositeNode(grammarAccess.getDoubleArrayTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleArrayType_in_entryRuleDoubleArrayType7805);
            iv_ruleDoubleArrayType=ruleDoubleArrayType();

            state._fsp--;

             current =iv_ruleDoubleArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleArrayType7815); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3928:1: ruleDoubleArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarDoubleArray' ) ;
    public final EObject ruleDoubleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3931:28: ( ( () otherlv_1= 'DevVarDoubleArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3932:1: ( () otherlv_1= 'DevVarDoubleArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3932:1: ( () otherlv_1= 'DevVarDoubleArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3932:2: () otherlv_1= 'DevVarDoubleArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3932:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3933:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDoubleArrayTypeAccess().getDoubleArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleDoubleArrayType7861); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3950:1: entryRuleStringArrayType returns [EObject current=null] : iv_ruleStringArrayType= ruleStringArrayType EOF ;
    public final EObject entryRuleStringArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3951:2: (iv_ruleStringArrayType= ruleStringArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3952:2: iv_ruleStringArrayType= ruleStringArrayType EOF
            {
             newCompositeNode(grammarAccess.getStringArrayTypeRule()); 
            pushFollow(FOLLOW_ruleStringArrayType_in_entryRuleStringArrayType7897);
            iv_ruleStringArrayType=ruleStringArrayType();

            state._fsp--;

             current =iv_ruleStringArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringArrayType7907); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3959:1: ruleStringArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarStringArray' ) ;
    public final EObject ruleStringArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3962:28: ( ( () otherlv_1= 'DevVarStringArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3963:1: ( () otherlv_1= 'DevVarStringArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3963:1: ( () otherlv_1= 'DevVarStringArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3963:2: () otherlv_1= 'DevVarStringArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3963:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3964:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringArrayTypeAccess().getStringArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleStringArrayType7953); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3981:1: entryRuleLongStringArrayType returns [EObject current=null] : iv_ruleLongStringArrayType= ruleLongStringArrayType EOF ;
    public final EObject entryRuleLongStringArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongStringArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3982:2: (iv_ruleLongStringArrayType= ruleLongStringArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3983:2: iv_ruleLongStringArrayType= ruleLongStringArrayType EOF
            {
             newCompositeNode(grammarAccess.getLongStringArrayTypeRule()); 
            pushFollow(FOLLOW_ruleLongStringArrayType_in_entryRuleLongStringArrayType7989);
            iv_ruleLongStringArrayType=ruleLongStringArrayType();

            state._fsp--;

             current =iv_ruleLongStringArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongStringArrayType7999); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3990:1: ruleLongStringArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarLongStringArray' ) ;
    public final EObject ruleLongStringArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3993:28: ( ( () otherlv_1= 'DevVarLongStringArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3994:1: ( () otherlv_1= 'DevVarLongStringArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3994:1: ( () otherlv_1= 'DevVarLongStringArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3994:2: () otherlv_1= 'DevVarLongStringArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3994:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3995:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLongStringArrayTypeAccess().getLongStringArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleLongStringArrayType8045); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4012:1: entryRuleDoubleStringArrayType returns [EObject current=null] : iv_ruleDoubleStringArrayType= ruleDoubleStringArrayType EOF ;
    public final EObject entryRuleDoubleStringArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleStringArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4013:2: (iv_ruleDoubleStringArrayType= ruleDoubleStringArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4014:2: iv_ruleDoubleStringArrayType= ruleDoubleStringArrayType EOF
            {
             newCompositeNode(grammarAccess.getDoubleStringArrayTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleStringArrayType_in_entryRuleDoubleStringArrayType8081);
            iv_ruleDoubleStringArrayType=ruleDoubleStringArrayType();

            state._fsp--;

             current =iv_ruleDoubleStringArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleStringArrayType8091); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4021:1: ruleDoubleStringArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarDoubleStringArray' ) ;
    public final EObject ruleDoubleStringArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4024:28: ( ( () otherlv_1= 'DevVarDoubleStringArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4025:1: ( () otherlv_1= 'DevVarDoubleStringArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4025:1: ( () otherlv_1= 'DevVarDoubleStringArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4025:2: () otherlv_1= 'DevVarDoubleStringArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4025:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4026:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDoubleStringArrayTypeAccess().getDoubleStringArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleDoubleStringArrayType8137); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4043:1: entryRuleStateType returns [EObject current=null] : iv_ruleStateType= ruleStateType EOF ;
    public final EObject entryRuleStateType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4044:2: (iv_ruleStateType= ruleStateType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4045:2: iv_ruleStateType= ruleStateType EOF
            {
             newCompositeNode(grammarAccess.getStateTypeRule()); 
            pushFollow(FOLLOW_ruleStateType_in_entryRuleStateType8173);
            iv_ruleStateType=ruleStateType();

            state._fsp--;

             current =iv_ruleStateType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateType8183); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4052:1: ruleStateType returns [EObject current=null] : ( () otherlv_1= 'DevState' ) ;
    public final EObject ruleStateType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4055:28: ( ( () otherlv_1= 'DevState' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4056:1: ( () otherlv_1= 'DevState' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4056:1: ( () otherlv_1= 'DevState' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4056:2: () otherlv_1= 'DevState'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4056:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4057:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateTypeAccess().getStateTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleStateType8229); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4074:1: entryRuleConstStringType returns [EObject current=null] : iv_ruleConstStringType= ruleConstStringType EOF ;
    public final EObject entryRuleConstStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstStringType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4075:2: (iv_ruleConstStringType= ruleConstStringType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4076:2: iv_ruleConstStringType= ruleConstStringType EOF
            {
             newCompositeNode(grammarAccess.getConstStringTypeRule()); 
            pushFollow(FOLLOW_ruleConstStringType_in_entryRuleConstStringType8265);
            iv_ruleConstStringType=ruleConstStringType();

            state._fsp--;

             current =iv_ruleConstStringType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstStringType8275); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4083:1: ruleConstStringType returns [EObject current=null] : ( () otherlv_1= 'ConstDevString' ) ;
    public final EObject ruleConstStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4086:28: ( ( () otherlv_1= 'ConstDevString' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4087:1: ( () otherlv_1= 'ConstDevString' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4087:1: ( () otherlv_1= 'ConstDevString' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4087:2: () otherlv_1= 'ConstDevString'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4087:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4088:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConstStringTypeAccess().getConstStringTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleConstStringType8321); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4105:1: entryRuleBooleanArrayType returns [EObject current=null] : iv_ruleBooleanArrayType= ruleBooleanArrayType EOF ;
    public final EObject entryRuleBooleanArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4106:2: (iv_ruleBooleanArrayType= ruleBooleanArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4107:2: iv_ruleBooleanArrayType= ruleBooleanArrayType EOF
            {
             newCompositeNode(grammarAccess.getBooleanArrayTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanArrayType_in_entryRuleBooleanArrayType8357);
            iv_ruleBooleanArrayType=ruleBooleanArrayType();

            state._fsp--;

             current =iv_ruleBooleanArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanArrayType8367); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4114:1: ruleBooleanArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarBooleanArray' ) ;
    public final EObject ruleBooleanArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4117:28: ( ( () otherlv_1= 'DevVarBooleanArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4118:1: ( () otherlv_1= 'DevVarBooleanArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4118:1: ( () otherlv_1= 'DevVarBooleanArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4118:2: () otherlv_1= 'DevVarBooleanArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4118:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4119:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanArrayTypeAccess().getBooleanArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleBooleanArrayType8413); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4136:1: entryRuleUCharType returns [EObject current=null] : iv_ruleUCharType= ruleUCharType EOF ;
    public final EObject entryRuleUCharType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUCharType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4137:2: (iv_ruleUCharType= ruleUCharType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4138:2: iv_ruleUCharType= ruleUCharType EOF
            {
             newCompositeNode(grammarAccess.getUCharTypeRule()); 
            pushFollow(FOLLOW_ruleUCharType_in_entryRuleUCharType8449);
            iv_ruleUCharType=ruleUCharType();

            state._fsp--;

             current =iv_ruleUCharType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUCharType8459); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4145:1: ruleUCharType returns [EObject current=null] : ( () otherlv_1= 'DevUChar' ) ;
    public final EObject ruleUCharType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4148:28: ( ( () otherlv_1= 'DevUChar' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4149:1: ( () otherlv_1= 'DevUChar' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4149:1: ( () otherlv_1= 'DevUChar' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4149:2: () otherlv_1= 'DevUChar'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4149:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4150:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUCharTypeAccess().getUCharTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleUCharType8505); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4167:1: entryRuleLongType returns [EObject current=null] : iv_ruleLongType= ruleLongType EOF ;
    public final EObject entryRuleLongType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4168:2: (iv_ruleLongType= ruleLongType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4169:2: iv_ruleLongType= ruleLongType EOF
            {
             newCompositeNode(grammarAccess.getLongTypeRule()); 
            pushFollow(FOLLOW_ruleLongType_in_entryRuleLongType8541);
            iv_ruleLongType=ruleLongType();

            state._fsp--;

             current =iv_ruleLongType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongType8551); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4176:1: ruleLongType returns [EObject current=null] : ( () otherlv_1= 'DevLong64' ) ;
    public final EObject ruleLongType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4179:28: ( ( () otherlv_1= 'DevLong64' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4180:1: ( () otherlv_1= 'DevLong64' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4180:1: ( () otherlv_1= 'DevLong64' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4180:2: () otherlv_1= 'DevLong64'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4180:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4181:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLongTypeAccess().getLongTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleLongType8597); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4198:1: entryRuleULongType returns [EObject current=null] : iv_ruleULongType= ruleULongType EOF ;
    public final EObject entryRuleULongType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleULongType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4199:2: (iv_ruleULongType= ruleULongType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4200:2: iv_ruleULongType= ruleULongType EOF
            {
             newCompositeNode(grammarAccess.getULongTypeRule()); 
            pushFollow(FOLLOW_ruleULongType_in_entryRuleULongType8633);
            iv_ruleULongType=ruleULongType();

            state._fsp--;

             current =iv_ruleULongType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleULongType8643); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4207:1: ruleULongType returns [EObject current=null] : ( () otherlv_1= 'DevULong64' ) ;
    public final EObject ruleULongType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4210:28: ( ( () otherlv_1= 'DevULong64' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4211:1: ( () otherlv_1= 'DevULong64' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4211:1: ( () otherlv_1= 'DevULong64' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4211:2: () otherlv_1= 'DevULong64'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4211:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4212:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getULongTypeAccess().getULongTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleULongType8689); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4229:1: entryRuleLongArrayType returns [EObject current=null] : iv_ruleLongArrayType= ruleLongArrayType EOF ;
    public final EObject entryRuleLongArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4230:2: (iv_ruleLongArrayType= ruleLongArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4231:2: iv_ruleLongArrayType= ruleLongArrayType EOF
            {
             newCompositeNode(grammarAccess.getLongArrayTypeRule()); 
            pushFollow(FOLLOW_ruleLongArrayType_in_entryRuleLongArrayType8725);
            iv_ruleLongArrayType=ruleLongArrayType();

            state._fsp--;

             current =iv_ruleLongArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongArrayType8735); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4238:1: ruleLongArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarLong64Array' ) ;
    public final EObject ruleLongArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4241:28: ( ( () otherlv_1= 'DevVarLong64Array' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4242:1: ( () otherlv_1= 'DevVarLong64Array' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4242:1: ( () otherlv_1= 'DevVarLong64Array' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4242:2: () otherlv_1= 'DevVarLong64Array'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4242:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4243:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLongArrayTypeAccess().getLongArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleLongArrayType8781); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4260:1: entryRuleULongArrayType returns [EObject current=null] : iv_ruleULongArrayType= ruleULongArrayType EOF ;
    public final EObject entryRuleULongArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleULongArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4261:2: (iv_ruleULongArrayType= ruleULongArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4262:2: iv_ruleULongArrayType= ruleULongArrayType EOF
            {
             newCompositeNode(grammarAccess.getULongArrayTypeRule()); 
            pushFollow(FOLLOW_ruleULongArrayType_in_entryRuleULongArrayType8817);
            iv_ruleULongArrayType=ruleULongArrayType();

            state._fsp--;

             current =iv_ruleULongArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleULongArrayType8827); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4269:1: ruleULongArrayType returns [EObject current=null] : ( () otherlv_1= 'DevVarULong64Array' ) ;
    public final EObject ruleULongArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4272:28: ( ( () otherlv_1= 'DevVarULong64Array' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4273:1: ( () otherlv_1= 'DevVarULong64Array' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4273:1: ( () otherlv_1= 'DevVarULong64Array' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4273:2: () otherlv_1= 'DevVarULong64Array'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4273:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4274:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getULongArrayTypeAccess().getULongArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleULongArrayType8873); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4291:1: entryRuleDevIntType returns [EObject current=null] : iv_ruleDevIntType= ruleDevIntType EOF ;
    public final EObject entryRuleDevIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevIntType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4292:2: (iv_ruleDevIntType= ruleDevIntType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4293:2: iv_ruleDevIntType= ruleDevIntType EOF
            {
             newCompositeNode(grammarAccess.getDevIntTypeRule()); 
            pushFollow(FOLLOW_ruleDevIntType_in_entryRuleDevIntType8909);
            iv_ruleDevIntType=ruleDevIntType();

            state._fsp--;

             current =iv_ruleDevIntType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDevIntType8919); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4300:1: ruleDevIntType returns [EObject current=null] : ( () otherlv_1= 'DevInt' ) ;
    public final EObject ruleDevIntType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4303:28: ( ( () otherlv_1= 'DevInt' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4304:1: ( () otherlv_1= 'DevInt' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4304:1: ( () otherlv_1= 'DevInt' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4304:2: () otherlv_1= 'DevInt'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4304:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4305:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDevIntTypeAccess().getDevIntTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleDevIntType8965); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4322:1: entryRuleEncodedType returns [EObject current=null] : iv_ruleEncodedType= ruleEncodedType EOF ;
    public final EObject entryRuleEncodedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEncodedType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4323:2: (iv_ruleEncodedType= ruleEncodedType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4324:2: iv_ruleEncodedType= ruleEncodedType EOF
            {
             newCompositeNode(grammarAccess.getEncodedTypeRule()); 
            pushFollow(FOLLOW_ruleEncodedType_in_entryRuleEncodedType9001);
            iv_ruleEncodedType=ruleEncodedType();

            state._fsp--;

             current =iv_ruleEncodedType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEncodedType9011); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4331:1: ruleEncodedType returns [EObject current=null] : ( () otherlv_1= 'DevEncoded' ) ;
    public final EObject ruleEncodedType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4334:28: ( ( () otherlv_1= 'DevEncoded' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4335:1: ( () otherlv_1= 'DevEncoded' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4335:1: ( () otherlv_1= 'DevEncoded' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4335:2: () otherlv_1= 'DevEncoded'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4335:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4336:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEncodedTypeAccess().getEncodedTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleEncodedType9057); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4353:1: entryRuleShortVectorType returns [EObject current=null] : iv_ruleShortVectorType= ruleShortVectorType EOF ;
    public final EObject entryRuleShortVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4354:2: (iv_ruleShortVectorType= ruleShortVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4355:2: iv_ruleShortVectorType= ruleShortVectorType EOF
            {
             newCompositeNode(grammarAccess.getShortVectorTypeRule()); 
            pushFollow(FOLLOW_ruleShortVectorType_in_entryRuleShortVectorType9093);
            iv_ruleShortVectorType=ruleShortVectorType();

            state._fsp--;

             current =iv_ruleShortVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortVectorType9103); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4362:1: ruleShortVectorType returns [EObject current=null] : ( () otherlv_1= 'vector<short>' ) ;
    public final EObject ruleShortVectorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4365:28: ( ( () otherlv_1= 'vector<short>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4366:1: ( () otherlv_1= 'vector<short>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4366:1: ( () otherlv_1= 'vector<short>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4366:2: () otherlv_1= 'vector<short>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4366:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4367:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getShortVectorTypeAccess().getShortVectorTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleShortVectorType9149); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4384:1: entryRuleIntVectorType returns [EObject current=null] : iv_ruleIntVectorType= ruleIntVectorType EOF ;
    public final EObject entryRuleIntVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4385:2: (iv_ruleIntVectorType= ruleIntVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4386:2: iv_ruleIntVectorType= ruleIntVectorType EOF
            {
             newCompositeNode(grammarAccess.getIntVectorTypeRule()); 
            pushFollow(FOLLOW_ruleIntVectorType_in_entryRuleIntVectorType9185);
            iv_ruleIntVectorType=ruleIntVectorType();

            state._fsp--;

             current =iv_ruleIntVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntVectorType9195); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4393:1: ruleIntVectorType returns [EObject current=null] : ( () otherlv_1= 'vector<int>' ) ;
    public final EObject ruleIntVectorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4396:28: ( ( () otherlv_1= 'vector<int>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4397:1: ( () otherlv_1= 'vector<int>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4397:1: ( () otherlv_1= 'vector<int>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4397:2: () otherlv_1= 'vector<int>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4397:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4398:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntVectorTypeAccess().getIntVectorTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleIntVectorType9241); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4415:1: entryRuleFloatVectorType returns [EObject current=null] : iv_ruleFloatVectorType= ruleFloatVectorType EOF ;
    public final EObject entryRuleFloatVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4416:2: (iv_ruleFloatVectorType= ruleFloatVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4417:2: iv_ruleFloatVectorType= ruleFloatVectorType EOF
            {
             newCompositeNode(grammarAccess.getFloatVectorTypeRule()); 
            pushFollow(FOLLOW_ruleFloatVectorType_in_entryRuleFloatVectorType9277);
            iv_ruleFloatVectorType=ruleFloatVectorType();

            state._fsp--;

             current =iv_ruleFloatVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatVectorType9287); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4424:1: ruleFloatVectorType returns [EObject current=null] : ( () otherlv_1= 'vector<float>' ) ;
    public final EObject ruleFloatVectorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4427:28: ( ( () otherlv_1= 'vector<float>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4428:1: ( () otherlv_1= 'vector<float>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4428:1: ( () otherlv_1= 'vector<float>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4428:2: () otherlv_1= 'vector<float>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4428:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4429:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFloatVectorTypeAccess().getFloatVectorTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,78,FOLLOW_78_in_ruleFloatVectorType9333); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4446:1: entryRuleDoubleVectorType returns [EObject current=null] : iv_ruleDoubleVectorType= ruleDoubleVectorType EOF ;
    public final EObject entryRuleDoubleVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4447:2: (iv_ruleDoubleVectorType= ruleDoubleVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4448:2: iv_ruleDoubleVectorType= ruleDoubleVectorType EOF
            {
             newCompositeNode(grammarAccess.getDoubleVectorTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleVectorType_in_entryRuleDoubleVectorType9369);
            iv_ruleDoubleVectorType=ruleDoubleVectorType();

            state._fsp--;

             current =iv_ruleDoubleVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleVectorType9379); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4455:1: ruleDoubleVectorType returns [EObject current=null] : ( () otherlv_1= 'vector<double>' ) ;
    public final EObject ruleDoubleVectorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4458:28: ( ( () otherlv_1= 'vector<double>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4459:1: ( () otherlv_1= 'vector<double>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4459:1: ( () otherlv_1= 'vector<double>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4459:2: () otherlv_1= 'vector<double>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4459:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4460:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDoubleVectorTypeAccess().getDoubleVectorTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,79,FOLLOW_79_in_ruleDoubleVectorType9425); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4477:1: entryRuleStringVectorType returns [EObject current=null] : iv_ruleStringVectorType= ruleStringVectorType EOF ;
    public final EObject entryRuleStringVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4478:2: (iv_ruleStringVectorType= ruleStringVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4479:2: iv_ruleStringVectorType= ruleStringVectorType EOF
            {
             newCompositeNode(grammarAccess.getStringVectorTypeRule()); 
            pushFollow(FOLLOW_ruleStringVectorType_in_entryRuleStringVectorType9461);
            iv_ruleStringVectorType=ruleStringVectorType();

            state._fsp--;

             current =iv_ruleStringVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringVectorType9471); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4486:1: ruleStringVectorType returns [EObject current=null] : ( () otherlv_1= 'vector<string>' ) ;
    public final EObject ruleStringVectorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4489:28: ( ( () otherlv_1= 'vector<string>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4490:1: ( () otherlv_1= 'vector<string>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4490:1: ( () otherlv_1= 'vector<string>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4490:2: () otherlv_1= 'vector<string>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4490:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4491:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringVectorTypeAccess().getStringVectorTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,80,FOLLOW_80_in_ruleStringVectorType9517); 

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
    public static final BitSet FOLLOW_ruleImport_in_rulePogoSystem131 = new BitSet(new long[]{0x0000000000081802L});
    public static final BitSet FOLLOW_rulePogoDeviceClass_in_rulePogoSystem153 = new BitSet(new long[]{0x0000000000081002L});
    public static final BitSet FOLLOW_rulePogoMultiClasses_in_rulePogoSystem175 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePogoMultiClasses_in_entryRulePogoMultiClasses317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePogoMultiClasses327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePogoMultiClasses364 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePogoMultiClasses381 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePogoMultiClasses398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePogoMultiClasses415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePogoMultiClasses437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePogoMultiClasses459 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePogoMultiClasses476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOneClassSimpleDef_in_rulePogoMultiClasses497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePogoMultiClasses514 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePreferences_in_rulePogoMultiClasses540 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePogoMultiClasses552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneClassSimpleDef_in_entryRuleOneClassSimpleDef588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneClassSimpleDef598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOneClassSimpleDef640 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOneClassSimpleDef662 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleOneClassSimpleDef688 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOneClassSimpleDef700 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInheritance_in_ruleOneClassSimpleDef721 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleOneClassSimpleDef733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOneClassSimpleDef750 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOneClassSimpleDef767 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleAdditionalFile_in_ruleOneClassSimpleDef788 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rulePogoDeviceClass_in_entryRulePogoDeviceClass825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePogoDeviceClass835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePogoDeviceClass872 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePogoDeviceClass889 = new BitSet(new long[]{0x0000000000302000L});
    public static final BitSet FOLLOW_20_in_rulePogoDeviceClass912 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_21_in_rulePogoDeviceClass939 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePogoDeviceClass959 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePogoDeviceClass973 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePogoDeviceClass990 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePogoDeviceClass1007 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClassDescription_in_rulePogoDeviceClass1028 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePogoDeviceClass1040 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePogoDeviceClass1061 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_rulePogoDeviceClass1074 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePogoDeviceClass1095 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_rulePogoDeviceClass1108 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_ruleCommand_in_rulePogoDeviceClass1129 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_26_in_rulePogoDeviceClass1142 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_ruleAttribute_in_rulePogoDeviceClass1163 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_27_in_rulePogoDeviceClass1176 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_ruleAttribute_in_rulePogoDeviceClass1197 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_28_in_rulePogoDeviceClass1210 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleState_in_rulePogoDeviceClass1231 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rulePreferences_in_rulePogoDeviceClass1253 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePogoDeviceClass1265 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleAdditionalFile_in_rulePogoDeviceClass1286 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_rulePogoDeviceClass1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLanguage_in_entryRuleLanguage1336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLanguage1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleLanguage1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleLanguage1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleLanguage1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisplayLevel_in_entryRuleDisplayLevel1464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisplayLevel1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDisplayLevel1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDisplayLevel1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrType_in_entryRuleAttrType1573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrType1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleAttrType1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleAttrType1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleAttrType1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRW_Type_in_entryRuleRW_Type1701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRW_Type1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleRW_Type1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleRW_Type1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleRW_Type1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleRW_Type1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean1848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleBoolean1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleBoolean1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDescription_in_entryRuleClassDescription1956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassDescription1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassDescription2008 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassDescription2030 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassDescription2052 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleClassDescription2069 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInheritance_in_ruleClassDescription2090 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_ruleLanguage_in_ruleClassDescription2111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassDescription2128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClassIdentification_in_ruleClassDescription2154 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleComments_in_ruleClassDescription2175 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleClassDescription2196 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleClassDescription2217 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleClassDescription2238 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleClassDescription2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritance_in_entryRuleInheritance2295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInheritance2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInheritance2347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInheritance2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassIdentification_in_entryRuleClassIdentification2410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassIdentification2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2462 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2506 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2528 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2550 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2572 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComments_in_entryRuleComments2679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComments2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleComments2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreferences_in_entryRulePreferences2770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreferences2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePreferences2822 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePreferences2844 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePreferences2866 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_rulePreferences2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState2928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState2980 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState3002 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_ruleState3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty3064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty3116 = new BitSet(new long[]{0x00FF000000000000L,0x000000000001F000L});
    public static final BitSet FOLLOW_rulePropType_in_ruleProperty3142 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_ruleProperty3163 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleProperty3184 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProperty3201 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleProperty3218 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProperty3235 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rulePropType_in_entryRulePropType3277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropType3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rulePropType3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVectorType_in_rulePropType3361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType3396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_ruleSimpleType3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortType_in_ruleSimpleType3480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortType_in_ruleSimpleType3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_ruleSimpleType3534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntType_in_ruleSimpleType3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_ruleSimpleType3588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_ruleSimpleType3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_ruleSimpleType3642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVectorType_in_entryRuleVectorType3677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVectorType3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortVectorType_in_ruleVectorType3734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntVectorType_in_ruleVectorType3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatVectorType_in_ruleVectorType3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleVectorType_in_ruleVectorType3815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVectorType_in_ruleVectorType3842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_entryRuleInheritanceStatus3877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInheritanceStatus3887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleInheritanceStatus3933 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleInheritanceStatus3954 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleInheritanceStatus3975 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleInheritanceStatus3996 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInheritanceStatus4013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand4054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand4064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand4106 = new BitSet(new long[]{0xFFFF800000000000L,0x0000000000000FFFL});
    public static final BitSet FOLLOW_ruleArgument_in_ruleCommand4132 = new BitSet(new long[]{0xFFFF800000000000L,0x0000000000000FFFL});
    public static final BitSet FOLLOW_ruleArgument_in_ruleCommand4153 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommand4170 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_ruleCommand4196 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommand4213 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_ruleDisplayLevel_in_ruleCommand4239 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommand4256 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleCommand4273 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommand4290 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument4332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleArgument4388 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument4405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute4446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute4456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute4498 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_ruleAttrType_in_ruleAttribute4524 = new BitSet(new long[]{0xFFFF800000000000L,0x0000000000000FFFL});
    public static final BitSet FOLLOW_ruleType_in_ruleAttribute4545 = new BitSet(new long[]{0x000001E000000000L});
    public static final BitSet FOLLOW_ruleRW_Type_in_ruleAttribute4566 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_ruleDisplayLevel_in_ruleAttribute4587 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute4604 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute4626 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute4648 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute4670 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleAttribute4696 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleAttribute4717 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleFireEvents_in_ruleAttribute4738 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleFireEvents_in_ruleAttribute4759 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleFireEvents_in_ruleAttribute4780 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_ruleAttribute4801 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttrProperties_in_ruleAttribute4822 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleAttribute4843 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleAttribute4864 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleAttribute4876 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute4893 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_46_in_ruleAttribute4911 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute4928 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleFireEvents_in_entryRuleFireEvents4970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFireEvents4980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleFireEvents5026 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleFireEvents5047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrProperties_in_entryRuleAttrProperties5083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrProperties5093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5135 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5179 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5201 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5223 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5289 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5311 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5333 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5355 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5377 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5399 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties5421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionalFile_in_entryRuleAdditionalFile5462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionalFile5472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAdditionalFile5514 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAdditionalFile5536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType5577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType5587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidType_in_ruleType5634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_ruleType5661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortType_in_ruleType5688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortType_in_ruleType5715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_ruleType5742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntType_in_ruleType5769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_ruleType5796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_ruleType5823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_ruleType5850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharArrayType_in_ruleType5877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortArrayType_in_ruleType5904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortArrayType_in_ruleType5931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntArrayType_in_ruleType5958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntArrayType_in_ruleType5985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatArrayType_in_ruleType6012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleArrayType_in_ruleType6039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringArrayType_in_ruleType6066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongStringArrayType_in_ruleType6093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleStringArrayType_in_ruleType6120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleType6147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstStringType_in_ruleType6174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanArrayType_in_ruleType6201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_ruleType6228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongType_in_ruleType6255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUCharType_in_ruleType6282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongArrayType_in_ruleType6309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongArrayType_in_ruleType6336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDevIntType_in_ruleType6363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncodedType_in_ruleType6390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidType_in_entryRuleVoidType6425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVoidType6435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleVoidType6481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_entryRuleBooleanType6517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanType6527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleBooleanType6573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortType_in_entryRuleShortType6609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortType6619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleShortType6665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortType_in_entryRuleUShortType6701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUShortType6711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleUShortType6757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_entryRuleIntType6793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntType6803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleIntType6849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntType_in_entryRuleUIntType6885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIntType6895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleUIntType6941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_entryRuleFloatType6977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatType6987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleFloatType7033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_entryRuleDoubleType7069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleType7079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleDoubleType7125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType7161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType7171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleStringType7217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharArrayType_in_entryRuleCharArrayType7253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharArrayType7263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleCharArrayType7309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortArrayType_in_entryRuleShortArrayType7345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortArrayType7355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleShortArrayType7401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortArrayType_in_entryRuleUShortArrayType7437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUShortArrayType7447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleUShortArrayType7493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntArrayType_in_entryRuleIntArrayType7529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntArrayType7539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleIntArrayType7585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntArrayType_in_entryRuleUIntArrayType7621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIntArrayType7631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleUIntArrayType7677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatArrayType_in_entryRuleFloatArrayType7713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatArrayType7723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleFloatArrayType7769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleArrayType_in_entryRuleDoubleArrayType7805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleArrayType7815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleDoubleArrayType7861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringArrayType_in_entryRuleStringArrayType7897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringArrayType7907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleStringArrayType7953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongStringArrayType_in_entryRuleLongStringArrayType7989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongStringArrayType7999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleLongStringArrayType8045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleStringArrayType_in_entryRuleDoubleStringArrayType8081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleStringArrayType8091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleDoubleStringArrayType8137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_entryRuleStateType8173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateType8183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleStateType8229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstStringType_in_entryRuleConstStringType8265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstStringType8275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleConstStringType8321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanArrayType_in_entryRuleBooleanArrayType8357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanArrayType8367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleBooleanArrayType8413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUCharType_in_entryRuleUCharType8449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUCharType8459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleUCharType8505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_entryRuleLongType8541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongType8551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleLongType8597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongType_in_entryRuleULongType8633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleULongType8643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleULongType8689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongArrayType_in_entryRuleLongArrayType8725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongArrayType8735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleLongArrayType8781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongArrayType_in_entryRuleULongArrayType8817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleULongArrayType8827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleULongArrayType8873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDevIntType_in_entryRuleDevIntType8909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDevIntType8919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleDevIntType8965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncodedType_in_entryRuleEncodedType9001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEncodedType9011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleEncodedType9057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortVectorType_in_entryRuleShortVectorType9093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortVectorType9103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleShortVectorType9149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntVectorType_in_entryRuleIntVectorType9185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntVectorType9195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleIntVectorType9241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatVectorType_in_entryRuleFloatVectorType9277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatVectorType9287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleFloatVectorType9333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleVectorType_in_entryRuleDoubleVectorType9369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleVectorType9379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleDoubleVectorType9425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVectorType_in_entryRuleStringVectorType9461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringVectorType9471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleStringVectorType9517 = new BitSet(new long[]{0x0000000000000002L});

}