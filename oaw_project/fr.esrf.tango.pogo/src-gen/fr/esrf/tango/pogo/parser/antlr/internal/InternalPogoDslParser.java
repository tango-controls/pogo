package fr.esrf.tango.pogo.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import fr.esrf.tango.pogo.services.PogoDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalPogoDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'multiclasses'", "'{'", "'classes:'", "'}'", "'inheritances:'", "'parentClasses:'", "'deviceclass'", "'abstract'", "'extends'", "'description:'", "'classProperties:'", "'deviceProperties:'", "'commands:'", "'attributes:'", "'states:'", "'Cpp'", "'Java'", "'Python'", "'OPERATOR'", "'EXPERT'", "'Scalar'", "'Spectrum'", "'Image'", "'READ'", "'WRITE'", "'READ_WRITE'", "'READ_WITH_WRITE'", "'true'", "'false'", "'defaultPropValue:'", "'excludedStates:'", "'readExcludedStates:'", "'writeExcludedStates:'", "'void'", "'boolean'", "'short'", "'ushort'", "'int'", "'uint'", "'float'", "'double'", "'string'", "'DevVarCharArray'", "'DevVarShortArray'", "'DevVarUShortArray'", "'DevVarLongArray'", "'DevVarULongArray'", "'DevVarFloatArray'", "'DevVarDoubleArray'", "'DevVarStringArray'", "'DevVarLongStringArray'", "'DevVarDoubleStringArray'", "'DevState'", "'ConstDevString'", "'DevVarBooleanArray'", "'DevUChar'", "'DevLong64'", "'DevULong64'", "'DevVarLong64Array'", "'DevVarULong64Array'", "'DevInt'", "'DevEncoded'", "'vector<short>'", "'vector<int>'", "'vector<float>'", "'vector<double>'", "'vector<string>'"
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
    public String getGrammarFileName() { return "../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g"; }


     
     	private PogoDslGrammarAccess grammarAccess;
     	
        public InternalPogoDslParser(TokenStream input, IAstFactory factory, PogoDslGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "PogoSystem";	
       	} 



    // $ANTLR start entryRulePogoSystem
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:72:1: entryRulePogoSystem returns [EObject current=null] : iv_rulePogoSystem= rulePogoSystem EOF ;
    public final EObject entryRulePogoSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePogoSystem = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:72:52: (iv_rulePogoSystem= rulePogoSystem EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:73:2: iv_rulePogoSystem= rulePogoSystem EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPogoSystemRule(), currentNode); 
            pushFollow(FOLLOW_rulePogoSystem_in_entryRulePogoSystem73);
            iv_rulePogoSystem=rulePogoSystem();
            _fsp--;

             current =iv_rulePogoSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePogoSystem83); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePogoSystem


    // $ANTLR start rulePogoSystem
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:80:1: rulePogoSystem returns [EObject current=null] : ( (lv_imports_0= ruleImport )* (lv_classes_1= rulePogoDeviceClass )* (lv_multiClasses_2= rulePogoMultiClasses )* ) ;
    public final EObject rulePogoSystem() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0 = null;

        EObject lv_classes_1 = null;

        EObject lv_multiClasses_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:85:6: ( ( (lv_imports_0= ruleImport )* (lv_classes_1= rulePogoDeviceClass )* (lv_multiClasses_2= rulePogoMultiClasses )* ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:86:1: ( (lv_imports_0= ruleImport )* (lv_classes_1= rulePogoDeviceClass )* (lv_multiClasses_2= rulePogoMultiClasses )* )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:86:1: ( (lv_imports_0= ruleImport )* (lv_classes_1= rulePogoDeviceClass )* (lv_multiClasses_2= rulePogoMultiClasses )* )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:86:2: (lv_imports_0= ruleImport )* (lv_classes_1= rulePogoDeviceClass )* (lv_multiClasses_2= rulePogoMultiClasses )*
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:86:2: (lv_imports_0= ruleImport )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:89:6: lv_imports_0= ruleImport
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPogoSystemAccess().getImportsImportParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_rulePogoSystem142);
            	    lv_imports_0=ruleImport();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPogoSystemRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "imports", lv_imports_0, "Import", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:107:3: (lv_classes_1= rulePogoDeviceClass )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:110:6: lv_classes_1= rulePogoDeviceClass
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPogoSystemAccess().getClassesPogoDeviceClassParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePogoDeviceClass_in_rulePogoSystem181);
            	    lv_classes_1=rulePogoDeviceClass();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPogoSystemRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "classes", lv_classes_1, "PogoDeviceClass", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:128:3: (lv_multiClasses_2= rulePogoMultiClasses )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:131:6: lv_multiClasses_2= rulePogoMultiClasses
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPogoSystemAccess().getMultiClassesPogoMultiClassesParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePogoMultiClasses_in_rulePogoSystem220);
            	    lv_multiClasses_2=rulePogoMultiClasses();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPogoSystemRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "multiClasses", lv_multiClasses_2, "PogoMultiClasses", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePogoSystem


    // $ANTLR start entryRuleImport
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:156:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:156:48: (iv_ruleImport= ruleImport EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:157:2: iv_ruleImport= ruleImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportRule(), currentNode); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport258);
            iv_ruleImport=ruleImport();
            _fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport268); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleImport


    // $ANTLR start ruleImport
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:164:1: ruleImport returns [EObject current=null] : ( 'import' (lv_importURI_1= RULE_STRING ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:169:6: ( ( 'import' (lv_importURI_1= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:170:1: ( 'import' (lv_importURI_1= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:170:1: ( 'import' (lv_importURI_1= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:170:2: 'import' (lv_importURI_1= RULE_STRING )
            {
            match(input,11,FOLLOW_11_in_ruleImport302); 

                    createLeafNode(grammarAccess.getImportAccess().getImportKeyword_0(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:174:1: (lv_importURI_1= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:176:6: lv_importURI_1= RULE_STRING
            {
            lv_importURI_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport324); 

            		createLeafNode(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), "importURI"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImportRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "importURI", lv_importURI_1, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleImport


    // $ANTLR start entryRulePogoMultiClasses
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:201:1: entryRulePogoMultiClasses returns [EObject current=null] : iv_rulePogoMultiClasses= rulePogoMultiClasses EOF ;
    public final EObject entryRulePogoMultiClasses() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePogoMultiClasses = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:201:58: (iv_rulePogoMultiClasses= rulePogoMultiClasses EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:202:2: iv_rulePogoMultiClasses= rulePogoMultiClasses EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPogoMultiClassesRule(), currentNode); 
            pushFollow(FOLLOW_rulePogoMultiClasses_in_entryRulePogoMultiClasses365);
            iv_rulePogoMultiClasses=rulePogoMultiClasses();
            _fsp--;

             current =iv_rulePogoMultiClasses; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePogoMultiClasses375); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePogoMultiClasses


    // $ANTLR start rulePogoMultiClasses
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:209:1: rulePogoMultiClasses returns [EObject current=null] : ( 'multiclasses' (lv_name_1= RULE_ID ) '{' (lv_sourcePath_3= RULE_STRING ) (lv_description_4= RULE_STRING ) (lv_title_5= RULE_STRING ) 'classes:' (lv_classes_7= ruleOneClassSimpleDef ) (lv_filestogenerate_8= RULE_STRING ) (lv_preferences_9= rulePreferences ) '}' ) ;
    public final EObject rulePogoMultiClasses() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        Token lv_sourcePath_3=null;
        Token lv_description_4=null;
        Token lv_title_5=null;
        Token lv_filestogenerate_8=null;
        EObject lv_classes_7 = null;

        EObject lv_preferences_9 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:214:6: ( ( 'multiclasses' (lv_name_1= RULE_ID ) '{' (lv_sourcePath_3= RULE_STRING ) (lv_description_4= RULE_STRING ) (lv_title_5= RULE_STRING ) 'classes:' (lv_classes_7= ruleOneClassSimpleDef ) (lv_filestogenerate_8= RULE_STRING ) (lv_preferences_9= rulePreferences ) '}' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:215:1: ( 'multiclasses' (lv_name_1= RULE_ID ) '{' (lv_sourcePath_3= RULE_STRING ) (lv_description_4= RULE_STRING ) (lv_title_5= RULE_STRING ) 'classes:' (lv_classes_7= ruleOneClassSimpleDef ) (lv_filestogenerate_8= RULE_STRING ) (lv_preferences_9= rulePreferences ) '}' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:215:1: ( 'multiclasses' (lv_name_1= RULE_ID ) '{' (lv_sourcePath_3= RULE_STRING ) (lv_description_4= RULE_STRING ) (lv_title_5= RULE_STRING ) 'classes:' (lv_classes_7= ruleOneClassSimpleDef ) (lv_filestogenerate_8= RULE_STRING ) (lv_preferences_9= rulePreferences ) '}' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:215:2: 'multiclasses' (lv_name_1= RULE_ID ) '{' (lv_sourcePath_3= RULE_STRING ) (lv_description_4= RULE_STRING ) (lv_title_5= RULE_STRING ) 'classes:' (lv_classes_7= ruleOneClassSimpleDef ) (lv_filestogenerate_8= RULE_STRING ) (lv_preferences_9= rulePreferences ) '}'
            {
            match(input,12,FOLLOW_12_in_rulePogoMultiClasses409); 

                    createLeafNode(grammarAccess.getPogoMultiClassesAccess().getMulticlassesKeyword_0(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:219:1: (lv_name_1= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:221:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePogoMultiClasses431); 

            		createLeafNode(grammarAccess.getPogoMultiClassesAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPogoMultiClassesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,13,FOLLOW_13_in_rulePogoMultiClasses448); 

                    createLeafNode(grammarAccess.getPogoMultiClassesAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:243:1: (lv_sourcePath_3= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:245:6: lv_sourcePath_3= RULE_STRING
            {
            lv_sourcePath_3=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePogoMultiClasses470); 

            		createLeafNode(grammarAccess.getPogoMultiClassesAccess().getSourcePathSTRINGTerminalRuleCall_3_0(), "sourcePath"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPogoMultiClassesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "sourcePath", lv_sourcePath_3, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:263:2: (lv_description_4= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:265:6: lv_description_4= RULE_STRING
            {
            lv_description_4=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePogoMultiClasses500); 

            		createLeafNode(grammarAccess.getPogoMultiClassesAccess().getDescriptionSTRINGTerminalRuleCall_4_0(), "description"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPogoMultiClassesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "description", lv_description_4, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:283:2: (lv_title_5= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:285:6: lv_title_5= RULE_STRING
            {
            lv_title_5=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePogoMultiClasses530); 

            		createLeafNode(grammarAccess.getPogoMultiClassesAccess().getTitleSTRINGTerminalRuleCall_5_0(), "title"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPogoMultiClassesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "title", lv_title_5, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,14,FOLLOW_14_in_rulePogoMultiClasses547); 

                    createLeafNode(grammarAccess.getPogoMultiClassesAccess().getClassesKeyword_6(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:307:1: (lv_classes_7= ruleOneClassSimpleDef )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:310:6: lv_classes_7= ruleOneClassSimpleDef
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPogoMultiClassesAccess().getClassesOneClassSimpleDefParserRuleCall_7_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleOneClassSimpleDef_in_rulePogoMultiClasses581);
            lv_classes_7=ruleOneClassSimpleDef();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPogoMultiClassesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "classes", lv_classes_7, "OneClassSimpleDef", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:328:2: (lv_filestogenerate_8= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:330:6: lv_filestogenerate_8= RULE_STRING
            {
            lv_filestogenerate_8=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePogoMultiClasses607); 

            		createLeafNode(grammarAccess.getPogoMultiClassesAccess().getFilestogenerateSTRINGTerminalRuleCall_8_0(), "filestogenerate"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPogoMultiClassesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "filestogenerate", lv_filestogenerate_8, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:348:2: (lv_preferences_9= rulePreferences )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:351:6: lv_preferences_9= rulePreferences
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPogoMultiClassesAccess().getPreferencesPreferencesParserRuleCall_9_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePreferences_in_rulePogoMultiClasses649);
            lv_preferences_9=rulePreferences();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPogoMultiClassesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "preferences", lv_preferences_9, "Preferences", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,15,FOLLOW_15_in_rulePogoMultiClasses662); 

                    createLeafNode(grammarAccess.getPogoMultiClassesAccess().getRightCurlyBracketKeyword_10(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePogoMultiClasses


    // $ANTLR start entryRuleOneClassSimpleDef
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:380:1: entryRuleOneClassSimpleDef returns [EObject current=null] : iv_ruleOneClassSimpleDef= ruleOneClassSimpleDef EOF ;
    public final EObject entryRuleOneClassSimpleDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneClassSimpleDef = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:380:59: (iv_ruleOneClassSimpleDef= ruleOneClassSimpleDef EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:381:2: iv_ruleOneClassSimpleDef= ruleOneClassSimpleDef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOneClassSimpleDefRule(), currentNode); 
            pushFollow(FOLLOW_ruleOneClassSimpleDef_in_entryRuleOneClassSimpleDef695);
            iv_ruleOneClassSimpleDef=ruleOneClassSimpleDef();
            _fsp--;

             current =iv_ruleOneClassSimpleDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneClassSimpleDef705); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOneClassSimpleDef


    // $ANTLR start ruleOneClassSimpleDef
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:388:1: ruleOneClassSimpleDef returns [EObject current=null] : ( (lv_classname_0= RULE_STRING ) (lv_sourcePath_1= RULE_STRING ) (lv_pogo6_2= ruleBoolean ) 'inheritances:' (lv_inheritances_4= ruleInheritance ) 'parentClasses:' (lv_parentClasses_6= RULE_STRING ) ) ;
    public final EObject ruleOneClassSimpleDef() throws RecognitionException {
        EObject current = null;

        Token lv_classname_0=null;
        Token lv_sourcePath_1=null;
        Token lv_parentClasses_6=null;
        AntlrDatatypeRuleToken lv_pogo6_2 = null;

        EObject lv_inheritances_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:393:6: ( ( (lv_classname_0= RULE_STRING ) (lv_sourcePath_1= RULE_STRING ) (lv_pogo6_2= ruleBoolean ) 'inheritances:' (lv_inheritances_4= ruleInheritance ) 'parentClasses:' (lv_parentClasses_6= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:394:1: ( (lv_classname_0= RULE_STRING ) (lv_sourcePath_1= RULE_STRING ) (lv_pogo6_2= ruleBoolean ) 'inheritances:' (lv_inheritances_4= ruleInheritance ) 'parentClasses:' (lv_parentClasses_6= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:394:1: ( (lv_classname_0= RULE_STRING ) (lv_sourcePath_1= RULE_STRING ) (lv_pogo6_2= ruleBoolean ) 'inheritances:' (lv_inheritances_4= ruleInheritance ) 'parentClasses:' (lv_parentClasses_6= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:394:2: (lv_classname_0= RULE_STRING ) (lv_sourcePath_1= RULE_STRING ) (lv_pogo6_2= ruleBoolean ) 'inheritances:' (lv_inheritances_4= ruleInheritance ) 'parentClasses:' (lv_parentClasses_6= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:394:2: (lv_classname_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:396:6: lv_classname_0= RULE_STRING
            {
            lv_classname_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOneClassSimpleDef752); 

            		createLeafNode(grammarAccess.getOneClassSimpleDefAccess().getClassnameSTRINGTerminalRuleCall_0_0(), "classname"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getOneClassSimpleDefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "classname", lv_classname_0, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:414:2: (lv_sourcePath_1= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:416:6: lv_sourcePath_1= RULE_STRING
            {
            lv_sourcePath_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOneClassSimpleDef782); 

            		createLeafNode(grammarAccess.getOneClassSimpleDefAccess().getSourcePathSTRINGTerminalRuleCall_1_0(), "sourcePath"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getOneClassSimpleDefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "sourcePath", lv_sourcePath_1, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:434:2: (lv_pogo6_2= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:437:6: lv_pogo6_2= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getOneClassSimpleDefAccess().getPogo6BooleanParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleOneClassSimpleDef824);
            lv_pogo6_2=ruleBoolean();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getOneClassSimpleDefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "pogo6", lv_pogo6_2, "Boolean", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,16,FOLLOW_16_in_ruleOneClassSimpleDef837); 

                    createLeafNode(grammarAccess.getOneClassSimpleDefAccess().getInheritancesKeyword_3(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:459:1: (lv_inheritances_4= ruleInheritance )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:462:6: lv_inheritances_4= ruleInheritance
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getOneClassSimpleDefAccess().getInheritancesInheritanceParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInheritance_in_ruleOneClassSimpleDef871);
            lv_inheritances_4=ruleInheritance();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getOneClassSimpleDefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "inheritances", lv_inheritances_4, "Inheritance", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,17,FOLLOW_17_in_ruleOneClassSimpleDef884); 

                    createLeafNode(grammarAccess.getOneClassSimpleDefAccess().getParentClassesKeyword_5(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:484:1: (lv_parentClasses_6= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:486:6: lv_parentClasses_6= RULE_STRING
            {
            lv_parentClasses_6=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOneClassSimpleDef906); 

            		createLeafNode(grammarAccess.getOneClassSimpleDefAccess().getParentClassesSTRINGTerminalRuleCall_6_0(), "parentClasses"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getOneClassSimpleDefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		add(current, "parentClasses", lv_parentClasses_6, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleOneClassSimpleDef


    // $ANTLR start entryRulePogoDeviceClass
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:511:1: entryRulePogoDeviceClass returns [EObject current=null] : iv_rulePogoDeviceClass= rulePogoDeviceClass EOF ;
    public final EObject entryRulePogoDeviceClass() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePogoDeviceClass = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:511:57: (iv_rulePogoDeviceClass= rulePogoDeviceClass EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:512:2: iv_rulePogoDeviceClass= rulePogoDeviceClass EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPogoDeviceClassRule(), currentNode); 
            pushFollow(FOLLOW_rulePogoDeviceClass_in_entryRulePogoDeviceClass947);
            iv_rulePogoDeviceClass=rulePogoDeviceClass();
            _fsp--;

             current =iv_rulePogoDeviceClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePogoDeviceClass957); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePogoDeviceClass


    // $ANTLR start rulePogoDeviceClass
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:519:1: rulePogoDeviceClass returns [EObject current=null] : ( 'deviceclass' (lv_name_1= RULE_ID ) (lv_isAbstract_2= 'abstract' )? ( 'extends' ( RULE_ID ) )? '{' (lv_institute_6= RULE_ID ) 'description:' (lv_description_8= ruleClassDescription ) 'classProperties:' (lv_classProperties_10= ruleProperty )* 'deviceProperties:' (lv_deviceProperties_12= ruleProperty )* 'commands:' (lv_commands_14= ruleCommand )* 'attributes:' (lv_attributes_16= ruleAttribute )* 'states:' (lv_states_18= ruleState )* (lv_preferences_19= rulePreferences ) '}' ) ;
    public final EObject rulePogoDeviceClass() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        Token lv_isAbstract_2=null;
        Token lv_institute_6=null;
        EObject lv_description_8 = null;

        EObject lv_classProperties_10 = null;

        EObject lv_deviceProperties_12 = null;

        EObject lv_commands_14 = null;

        EObject lv_attributes_16 = null;

        EObject lv_states_18 = null;

        EObject lv_preferences_19 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:524:6: ( ( 'deviceclass' (lv_name_1= RULE_ID ) (lv_isAbstract_2= 'abstract' )? ( 'extends' ( RULE_ID ) )? '{' (lv_institute_6= RULE_ID ) 'description:' (lv_description_8= ruleClassDescription ) 'classProperties:' (lv_classProperties_10= ruleProperty )* 'deviceProperties:' (lv_deviceProperties_12= ruleProperty )* 'commands:' (lv_commands_14= ruleCommand )* 'attributes:' (lv_attributes_16= ruleAttribute )* 'states:' (lv_states_18= ruleState )* (lv_preferences_19= rulePreferences ) '}' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:525:1: ( 'deviceclass' (lv_name_1= RULE_ID ) (lv_isAbstract_2= 'abstract' )? ( 'extends' ( RULE_ID ) )? '{' (lv_institute_6= RULE_ID ) 'description:' (lv_description_8= ruleClassDescription ) 'classProperties:' (lv_classProperties_10= ruleProperty )* 'deviceProperties:' (lv_deviceProperties_12= ruleProperty )* 'commands:' (lv_commands_14= ruleCommand )* 'attributes:' (lv_attributes_16= ruleAttribute )* 'states:' (lv_states_18= ruleState )* (lv_preferences_19= rulePreferences ) '}' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:525:1: ( 'deviceclass' (lv_name_1= RULE_ID ) (lv_isAbstract_2= 'abstract' )? ( 'extends' ( RULE_ID ) )? '{' (lv_institute_6= RULE_ID ) 'description:' (lv_description_8= ruleClassDescription ) 'classProperties:' (lv_classProperties_10= ruleProperty )* 'deviceProperties:' (lv_deviceProperties_12= ruleProperty )* 'commands:' (lv_commands_14= ruleCommand )* 'attributes:' (lv_attributes_16= ruleAttribute )* 'states:' (lv_states_18= ruleState )* (lv_preferences_19= rulePreferences ) '}' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:525:2: 'deviceclass' (lv_name_1= RULE_ID ) (lv_isAbstract_2= 'abstract' )? ( 'extends' ( RULE_ID ) )? '{' (lv_institute_6= RULE_ID ) 'description:' (lv_description_8= ruleClassDescription ) 'classProperties:' (lv_classProperties_10= ruleProperty )* 'deviceProperties:' (lv_deviceProperties_12= ruleProperty )* 'commands:' (lv_commands_14= ruleCommand )* 'attributes:' (lv_attributes_16= ruleAttribute )* 'states:' (lv_states_18= ruleState )* (lv_preferences_19= rulePreferences ) '}'
            {
            match(input,18,FOLLOW_18_in_rulePogoDeviceClass991); 

                    createLeafNode(grammarAccess.getPogoDeviceClassAccess().getDeviceclassKeyword_0(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:529:1: (lv_name_1= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:531:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePogoDeviceClass1013); 

            		createLeafNode(grammarAccess.getPogoDeviceClassAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPogoDeviceClassRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:549:2: (lv_isAbstract_2= 'abstract' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:551:6: lv_isAbstract_2= 'abstract'
                    {
                    lv_isAbstract_2=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_rulePogoDeviceClass1042); 

                            createLeafNode(grammarAccess.getPogoDeviceClassAccess().getIsAbstractAbstractKeyword_2_0(), "isAbstract"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPogoDeviceClassRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "isAbstract", true, "abstract", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:570:3: ( 'extends' ( RULE_ID ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:570:4: 'extends' ( RULE_ID )
                    {
                    match(input,20,FOLLOW_20_in_rulePogoDeviceClass1066); 

                            createLeafNode(grammarAccess.getPogoDeviceClassAccess().getExtendsKeyword_3_0(), null); 
                        
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:574:1: ( RULE_ID )
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:577:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getPogoDeviceClassRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePogoDeviceClass1088); 

                    		createLeafNode(grammarAccess.getPogoDeviceClassAccess().getBaseClassPogoDeviceClassCrossReference_3_1_0(), "baseClass"); 
                    	

                    }


                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_rulePogoDeviceClass1102); 

                    createLeafNode(grammarAccess.getPogoDeviceClassAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:594:1: (lv_institute_6= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:596:6: lv_institute_6= RULE_ID
            {
            lv_institute_6=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePogoDeviceClass1124); 

            		createLeafNode(grammarAccess.getPogoDeviceClassAccess().getInstituteIDTerminalRuleCall_5_0(), "institute"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPogoDeviceClassRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "institute", lv_institute_6, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,21,FOLLOW_21_in_rulePogoDeviceClass1141); 

                    createLeafNode(grammarAccess.getPogoDeviceClassAccess().getDescriptionKeyword_6(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:618:1: (lv_description_8= ruleClassDescription )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:621:6: lv_description_8= ruleClassDescription
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPogoDeviceClassAccess().getDescriptionClassDescriptionParserRuleCall_7_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleClassDescription_in_rulePogoDeviceClass1175);
            lv_description_8=ruleClassDescription();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPogoDeviceClassRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "description", lv_description_8, "ClassDescription", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,22,FOLLOW_22_in_rulePogoDeviceClass1188); 

                    createLeafNode(grammarAccess.getPogoDeviceClassAccess().getClassPropertiesKeyword_8(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:643:1: (lv_classProperties_10= ruleProperty )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:646:6: lv_classProperties_10= ruleProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPogoDeviceClassAccess().getClassPropertiesPropertyParserRuleCall_9_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_rulePogoDeviceClass1222);
            	    lv_classProperties_10=ruleProperty();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPogoDeviceClassRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "classProperties", lv_classProperties_10, "Property", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match(input,23,FOLLOW_23_in_rulePogoDeviceClass1236); 

                    createLeafNode(grammarAccess.getPogoDeviceClassAccess().getDevicePropertiesKeyword_10(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:668:1: (lv_deviceProperties_12= ruleProperty )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:671:6: lv_deviceProperties_12= ruleProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPogoDeviceClassAccess().getDevicePropertiesPropertyParserRuleCall_11_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_rulePogoDeviceClass1270);
            	    lv_deviceProperties_12=ruleProperty();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPogoDeviceClassRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "deviceProperties", lv_deviceProperties_12, "Property", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(input,24,FOLLOW_24_in_rulePogoDeviceClass1284); 

                    createLeafNode(grammarAccess.getPogoDeviceClassAccess().getCommandsKeyword_12(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:693:1: (lv_commands_14= ruleCommand )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:696:6: lv_commands_14= ruleCommand
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPogoDeviceClassAccess().getCommandsCommandParserRuleCall_13_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommand_in_rulePogoDeviceClass1318);
            	    lv_commands_14=ruleCommand();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPogoDeviceClassRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "commands", lv_commands_14, "Command", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,25,FOLLOW_25_in_rulePogoDeviceClass1332); 

                    createLeafNode(grammarAccess.getPogoDeviceClassAccess().getAttributesKeyword_14(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:718:1: (lv_attributes_16= ruleAttribute )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:721:6: lv_attributes_16= ruleAttribute
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPogoDeviceClassAccess().getAttributesAttributeParserRuleCall_15_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_rulePogoDeviceClass1366);
            	    lv_attributes_16=ruleAttribute();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPogoDeviceClassRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "attributes", lv_attributes_16, "Attribute", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match(input,26,FOLLOW_26_in_rulePogoDeviceClass1380); 

                    createLeafNode(grammarAccess.getPogoDeviceClassAccess().getStatesKeyword_16(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:743:1: (lv_states_18= ruleState )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:746:6: lv_states_18= ruleState
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPogoDeviceClassAccess().getStatesStateParserRuleCall_17_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_rulePogoDeviceClass1414);
            	    lv_states_18=ruleState();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPogoDeviceClassRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "states", lv_states_18, "State", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:764:3: (lv_preferences_19= rulePreferences )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:767:6: lv_preferences_19= rulePreferences
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPogoDeviceClassAccess().getPreferencesPreferencesParserRuleCall_18_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePreferences_in_rulePogoDeviceClass1453);
            lv_preferences_19=rulePreferences();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPogoDeviceClassRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "preferences", lv_preferences_19, "Preferences", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,15,FOLLOW_15_in_rulePogoDeviceClass1466); 

                    createLeafNode(grammarAccess.getPogoDeviceClassAccess().getRightCurlyBracketKeyword_19(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePogoDeviceClass


    // $ANTLR start entryRuleLanguage
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:796:1: entryRuleLanguage returns [String current=null] : iv_ruleLanguage= ruleLanguage EOF ;
    public final String entryRuleLanguage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLanguage = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:796:49: (iv_ruleLanguage= ruleLanguage EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:797:2: iv_ruleLanguage= ruleLanguage EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLanguageRule(), currentNode); 
            pushFollow(FOLLOW_ruleLanguage_in_entryRuleLanguage1500);
            iv_ruleLanguage=ruleLanguage();
            _fsp--;

             current =iv_ruleLanguage.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLanguage1511); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLanguage


    // $ANTLR start ruleLanguage
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:804:1: ruleLanguage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Cpp' | kw= 'Java' | kw= 'Python' ) ;
    public final AntlrDatatypeRuleToken ruleLanguage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:810:6: ( (kw= 'Cpp' | kw= 'Java' | kw= 'Python' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:811:1: (kw= 'Cpp' | kw= 'Java' | kw= 'Python' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:811:1: (kw= 'Cpp' | kw= 'Java' | kw= 'Python' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt11=1;
                }
                break;
            case 28:
                {
                alt11=2;
                }
                break;
            case 29:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("811:1: (kw= 'Cpp' | kw= 'Java' | kw= 'Python' )", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:812:2: kw= 'Cpp'
                    {
                    kw=(Token)input.LT(1);
                    match(input,27,FOLLOW_27_in_ruleLanguage1549); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getLanguageAccess().getCppKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:819:2: kw= 'Java'
                    {
                    kw=(Token)input.LT(1);
                    match(input,28,FOLLOW_28_in_ruleLanguage1568); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getLanguageAccess().getJavaKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:826:2: kw= 'Python'
                    {
                    kw=(Token)input.LT(1);
                    match(input,29,FOLLOW_29_in_ruleLanguage1587); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getLanguageAccess().getPythonKeyword_2(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLanguage


    // $ANTLR start entryRuleDisplayLevel
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:839:1: entryRuleDisplayLevel returns [String current=null] : iv_ruleDisplayLevel= ruleDisplayLevel EOF ;
    public final String entryRuleDisplayLevel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDisplayLevel = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:839:53: (iv_ruleDisplayLevel= ruleDisplayLevel EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:840:2: iv_ruleDisplayLevel= ruleDisplayLevel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDisplayLevelRule(), currentNode); 
            pushFollow(FOLLOW_ruleDisplayLevel_in_entryRuleDisplayLevel1626);
            iv_ruleDisplayLevel=ruleDisplayLevel();
            _fsp--;

             current =iv_ruleDisplayLevel.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisplayLevel1637); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDisplayLevel


    // $ANTLR start ruleDisplayLevel
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:847:1: ruleDisplayLevel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'OPERATOR' | kw= 'EXPERT' ) ;
    public final AntlrDatatypeRuleToken ruleDisplayLevel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:853:6: ( (kw= 'OPERATOR' | kw= 'EXPERT' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:854:1: (kw= 'OPERATOR' | kw= 'EXPERT' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:854:1: (kw= 'OPERATOR' | kw= 'EXPERT' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            else if ( (LA12_0==31) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("854:1: (kw= 'OPERATOR' | kw= 'EXPERT' )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:855:2: kw= 'OPERATOR'
                    {
                    kw=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleDisplayLevel1675); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDisplayLevelAccess().getOPERATORKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:862:2: kw= 'EXPERT'
                    {
                    kw=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_ruleDisplayLevel1694); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDisplayLevelAccess().getEXPERTKeyword_1(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDisplayLevel


    // $ANTLR start entryRuleAttrType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:875:1: entryRuleAttrType returns [String current=null] : iv_ruleAttrType= ruleAttrType EOF ;
    public final String entryRuleAttrType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttrType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:875:49: (iv_ruleAttrType= ruleAttrType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:876:2: iv_ruleAttrType= ruleAttrType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttrTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttrType_in_entryRuleAttrType1733);
            iv_ruleAttrType=ruleAttrType();
            _fsp--;

             current =iv_ruleAttrType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrType1744); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAttrType


    // $ANTLR start ruleAttrType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:883:1: ruleAttrType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Scalar' | kw= 'Spectrum' | kw= 'Image' ) ;
    public final AntlrDatatypeRuleToken ruleAttrType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:889:6: ( (kw= 'Scalar' | kw= 'Spectrum' | kw= 'Image' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:890:1: (kw= 'Scalar' | kw= 'Spectrum' | kw= 'Image' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:890:1: (kw= 'Scalar' | kw= 'Spectrum' | kw= 'Image' )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt13=1;
                }
                break;
            case 33:
                {
                alt13=2;
                }
                break;
            case 34:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("890:1: (kw= 'Scalar' | kw= 'Spectrum' | kw= 'Image' )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:891:2: kw= 'Scalar'
                    {
                    kw=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_ruleAttrType1782); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAttrTypeAccess().getScalarKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:898:2: kw= 'Spectrum'
                    {
                    kw=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_ruleAttrType1801); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAttrTypeAccess().getSpectrumKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:905:2: kw= 'Image'
                    {
                    kw=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_ruleAttrType1820); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAttrTypeAccess().getImageKeyword_2(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAttrType


    // $ANTLR start entryRuleRW_Type
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:918:1: entryRuleRW_Type returns [String current=null] : iv_ruleRW_Type= ruleRW_Type EOF ;
    public final String entryRuleRW_Type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRW_Type = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:918:48: (iv_ruleRW_Type= ruleRW_Type EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:919:2: iv_ruleRW_Type= ruleRW_Type EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRW_TypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleRW_Type_in_entryRuleRW_Type1859);
            iv_ruleRW_Type=ruleRW_Type();
            _fsp--;

             current =iv_ruleRW_Type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRW_Type1870); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRW_Type


    // $ANTLR start ruleRW_Type
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:926:1: ruleRW_Type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'READ' | kw= 'WRITE' | kw= 'READ_WRITE' | kw= 'READ_WITH_WRITE' ) ;
    public final AntlrDatatypeRuleToken ruleRW_Type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:932:6: ( (kw= 'READ' | kw= 'WRITE' | kw= 'READ_WRITE' | kw= 'READ_WITH_WRITE' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:933:1: (kw= 'READ' | kw= 'WRITE' | kw= 'READ_WRITE' | kw= 'READ_WITH_WRITE' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:933:1: (kw= 'READ' | kw= 'WRITE' | kw= 'READ_WRITE' | kw= 'READ_WITH_WRITE' )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt14=1;
                }
                break;
            case 36:
                {
                alt14=2;
                }
                break;
            case 37:
                {
                alt14=3;
                }
                break;
            case 38:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("933:1: (kw= 'READ' | kw= 'WRITE' | kw= 'READ_WRITE' | kw= 'READ_WITH_WRITE' )", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:934:2: kw= 'READ'
                    {
                    kw=(Token)input.LT(1);
                    match(input,35,FOLLOW_35_in_ruleRW_Type1908); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getRW_TypeAccess().getREADKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:941:2: kw= 'WRITE'
                    {
                    kw=(Token)input.LT(1);
                    match(input,36,FOLLOW_36_in_ruleRW_Type1927); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getRW_TypeAccess().getWRITEKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:948:2: kw= 'READ_WRITE'
                    {
                    kw=(Token)input.LT(1);
                    match(input,37,FOLLOW_37_in_ruleRW_Type1946); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getRW_TypeAccess().getREAD_WRITEKeyword_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:955:2: kw= 'READ_WITH_WRITE'
                    {
                    kw=(Token)input.LT(1);
                    match(input,38,FOLLOW_38_in_ruleRW_Type1965); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getRW_TypeAccess().getREAD_WITH_WRITEKeyword_3(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRW_Type


    // $ANTLR start entryRuleBoolean
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:968:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:968:48: (iv_ruleBoolean= ruleBoolean EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:969:2: iv_ruleBoolean= ruleBoolean EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanRule(), currentNode); 
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean2004);
            iv_ruleBoolean=ruleBoolean();
            _fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean2015); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBoolean


    // $ANTLR start ruleBoolean
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:976:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:982:6: ( (kw= 'true' | kw= 'false' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:983:1: (kw= 'true' | kw= 'false' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:983:1: (kw= 'true' | kw= 'false' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            else if ( (LA15_0==40) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("983:1: (kw= 'true' | kw= 'false' )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:984:2: kw= 'true'
                    {
                    kw=(Token)input.LT(1);
                    match(input,39,FOLLOW_39_in_ruleBoolean2053); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getBooleanAccess().getTrueKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:991:2: kw= 'false'
                    {
                    kw=(Token)input.LT(1);
                    match(input,40,FOLLOW_40_in_ruleBoolean2072); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getBooleanAccess().getFalseKeyword_1(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBoolean


    // $ANTLR start entryRuleClassDescription
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1004:1: entryRuleClassDescription returns [EObject current=null] : iv_ruleClassDescription= ruleClassDescription EOF ;
    public final EObject entryRuleClassDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDescription = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1004:58: (iv_ruleClassDescription= ruleClassDescription EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1005:2: iv_ruleClassDescription= ruleClassDescription EOF
            {
             currentNode = createCompositeNode(grammarAccess.getClassDescriptionRule(), currentNode); 
            pushFollow(FOLLOW_ruleClassDescription_in_entryRuleClassDescription2110);
            iv_ruleClassDescription=ruleClassDescription();
            _fsp--;

             current =iv_ruleClassDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassDescription2120); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleClassDescription


    // $ANTLR start ruleClassDescription
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1012:1: ruleClassDescription returns [EObject current=null] : ( (lv_description_0= RULE_STRING ) (lv_title_1= RULE_STRING ) (lv_sourcePath_2= RULE_STRING ) 'inheritances:' (lv_inheritances_4= ruleInheritance ) (lv_language_5= ruleLanguage ) (lv_filestogenerate_6= RULE_STRING ) (lv_identification_7= ruleClassIdentification ) (lv_comments_8= ruleComments ) (lv_hasAbstractCommand_9= ruleBoolean ) (lv_hasAbstractAttribute_10= ruleBoolean ) (lv_hasDynamicAttribute_11= ruleBoolean ) ) ;
    public final EObject ruleClassDescription() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_title_1=null;
        Token lv_sourcePath_2=null;
        Token lv_filestogenerate_6=null;
        EObject lv_inheritances_4 = null;

        AntlrDatatypeRuleToken lv_language_5 = null;

        EObject lv_identification_7 = null;

        EObject lv_comments_8 = null;

        AntlrDatatypeRuleToken lv_hasAbstractCommand_9 = null;

        AntlrDatatypeRuleToken lv_hasAbstractAttribute_10 = null;

        AntlrDatatypeRuleToken lv_hasDynamicAttribute_11 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1017:6: ( ( (lv_description_0= RULE_STRING ) (lv_title_1= RULE_STRING ) (lv_sourcePath_2= RULE_STRING ) 'inheritances:' (lv_inheritances_4= ruleInheritance ) (lv_language_5= ruleLanguage ) (lv_filestogenerate_6= RULE_STRING ) (lv_identification_7= ruleClassIdentification ) (lv_comments_8= ruleComments ) (lv_hasAbstractCommand_9= ruleBoolean ) (lv_hasAbstractAttribute_10= ruleBoolean ) (lv_hasDynamicAttribute_11= ruleBoolean ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1018:1: ( (lv_description_0= RULE_STRING ) (lv_title_1= RULE_STRING ) (lv_sourcePath_2= RULE_STRING ) 'inheritances:' (lv_inheritances_4= ruleInheritance ) (lv_language_5= ruleLanguage ) (lv_filestogenerate_6= RULE_STRING ) (lv_identification_7= ruleClassIdentification ) (lv_comments_8= ruleComments ) (lv_hasAbstractCommand_9= ruleBoolean ) (lv_hasAbstractAttribute_10= ruleBoolean ) (lv_hasDynamicAttribute_11= ruleBoolean ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1018:1: ( (lv_description_0= RULE_STRING ) (lv_title_1= RULE_STRING ) (lv_sourcePath_2= RULE_STRING ) 'inheritances:' (lv_inheritances_4= ruleInheritance ) (lv_language_5= ruleLanguage ) (lv_filestogenerate_6= RULE_STRING ) (lv_identification_7= ruleClassIdentification ) (lv_comments_8= ruleComments ) (lv_hasAbstractCommand_9= ruleBoolean ) (lv_hasAbstractAttribute_10= ruleBoolean ) (lv_hasDynamicAttribute_11= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1018:2: (lv_description_0= RULE_STRING ) (lv_title_1= RULE_STRING ) (lv_sourcePath_2= RULE_STRING ) 'inheritances:' (lv_inheritances_4= ruleInheritance ) (lv_language_5= ruleLanguage ) (lv_filestogenerate_6= RULE_STRING ) (lv_identification_7= ruleClassIdentification ) (lv_comments_8= ruleComments ) (lv_hasAbstractCommand_9= ruleBoolean ) (lv_hasAbstractAttribute_10= ruleBoolean ) (lv_hasDynamicAttribute_11= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1018:2: (lv_description_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1020:6: lv_description_0= RULE_STRING
            {
            lv_description_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassDescription2167); 

            		createLeafNode(grammarAccess.getClassDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getClassDescriptionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "description", lv_description_0, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1038:2: (lv_title_1= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1040:6: lv_title_1= RULE_STRING
            {
            lv_title_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassDescription2197); 

            		createLeafNode(grammarAccess.getClassDescriptionAccess().getTitleSTRINGTerminalRuleCall_1_0(), "title"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getClassDescriptionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "title", lv_title_1, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1058:2: (lv_sourcePath_2= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1060:6: lv_sourcePath_2= RULE_STRING
            {
            lv_sourcePath_2=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassDescription2227); 

            		createLeafNode(grammarAccess.getClassDescriptionAccess().getSourcePathSTRINGTerminalRuleCall_2_0(), "sourcePath"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getClassDescriptionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "sourcePath", lv_sourcePath_2, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,16,FOLLOW_16_in_ruleClassDescription2244); 

                    createLeafNode(grammarAccess.getClassDescriptionAccess().getInheritancesKeyword_3(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1082:1: (lv_inheritances_4= ruleInheritance )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1085:6: lv_inheritances_4= ruleInheritance
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getClassDescriptionAccess().getInheritancesInheritanceParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInheritance_in_ruleClassDescription2278);
            lv_inheritances_4=ruleInheritance();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getClassDescriptionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "inheritances", lv_inheritances_4, "Inheritance", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1103:2: (lv_language_5= ruleLanguage )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1106:6: lv_language_5= ruleLanguage
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getClassDescriptionAccess().getLanguageLanguageParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLanguage_in_ruleClassDescription2316);
            lv_language_5=ruleLanguage();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getClassDescriptionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "language", lv_language_5, "Language", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1124:2: (lv_filestogenerate_6= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1126:6: lv_filestogenerate_6= RULE_STRING
            {
            lv_filestogenerate_6=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassDescription2342); 

            		createLeafNode(grammarAccess.getClassDescriptionAccess().getFilestogenerateSTRINGTerminalRuleCall_6_0(), "filestogenerate"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getClassDescriptionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "filestogenerate", lv_filestogenerate_6, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1144:2: (lv_identification_7= ruleClassIdentification )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1147:6: lv_identification_7= ruleClassIdentification
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getClassDescriptionAccess().getIdentificationClassIdentificationParserRuleCall_7_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleClassIdentification_in_ruleClassDescription2384);
            lv_identification_7=ruleClassIdentification();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getClassDescriptionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "identification", lv_identification_7, "ClassIdentification", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1165:2: (lv_comments_8= ruleComments )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1168:6: lv_comments_8= ruleComments
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getClassDescriptionAccess().getCommentsCommentsParserRuleCall_8_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleComments_in_ruleClassDescription2422);
            lv_comments_8=ruleComments();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getClassDescriptionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "comments", lv_comments_8, "Comments", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1186:2: (lv_hasAbstractCommand_9= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1189:6: lv_hasAbstractCommand_9= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getClassDescriptionAccess().getHasAbstractCommandBooleanParserRuleCall_9_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleClassDescription2460);
            lv_hasAbstractCommand_9=ruleBoolean();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getClassDescriptionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "hasAbstractCommand", lv_hasAbstractCommand_9, "Boolean", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1207:2: (lv_hasAbstractAttribute_10= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1210:6: lv_hasAbstractAttribute_10= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getClassDescriptionAccess().getHasAbstractAttributeBooleanParserRuleCall_10_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleClassDescription2498);
            lv_hasAbstractAttribute_10=ruleBoolean();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getClassDescriptionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "hasAbstractAttribute", lv_hasAbstractAttribute_10, "Boolean", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1228:2: (lv_hasDynamicAttribute_11= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1231:6: lv_hasDynamicAttribute_11= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getClassDescriptionAccess().getHasDynamicAttributeBooleanParserRuleCall_11_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleClassDescription2536);
            lv_hasDynamicAttribute_11=ruleBoolean();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getClassDescriptionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "hasDynamicAttribute", lv_hasDynamicAttribute_11, "Boolean", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleClassDescription


    // $ANTLR start entryRuleInheritance
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1256:1: entryRuleInheritance returns [EObject current=null] : iv_ruleInheritance= ruleInheritance EOF ;
    public final EObject entryRuleInheritance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritance = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1256:53: (iv_ruleInheritance= ruleInheritance EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1257:2: iv_ruleInheritance= ruleInheritance EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInheritanceRule(), currentNode); 
            pushFollow(FOLLOW_ruleInheritance_in_entryRuleInheritance2573);
            iv_ruleInheritance=ruleInheritance();
            _fsp--;

             current =iv_ruleInheritance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInheritance2583); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInheritance


    // $ANTLR start ruleInheritance
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1264:1: ruleInheritance returns [EObject current=null] : ( (lv_classname_0= RULE_STRING ) (lv_sourcePath_1= RULE_STRING ) ) ;
    public final EObject ruleInheritance() throws RecognitionException {
        EObject current = null;

        Token lv_classname_0=null;
        Token lv_sourcePath_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1269:6: ( ( (lv_classname_0= RULE_STRING ) (lv_sourcePath_1= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1270:1: ( (lv_classname_0= RULE_STRING ) (lv_sourcePath_1= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1270:1: ( (lv_classname_0= RULE_STRING ) (lv_sourcePath_1= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1270:2: (lv_classname_0= RULE_STRING ) (lv_sourcePath_1= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1270:2: (lv_classname_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1272:6: lv_classname_0= RULE_STRING
            {
            lv_classname_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInheritance2630); 

            		createLeafNode(grammarAccess.getInheritanceAccess().getClassnameSTRINGTerminalRuleCall_0_0(), "classname"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInheritanceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "classname", lv_classname_0, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1290:2: (lv_sourcePath_1= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1292:6: lv_sourcePath_1= RULE_STRING
            {
            lv_sourcePath_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInheritance2660); 

            		createLeafNode(grammarAccess.getInheritanceAccess().getSourcePathSTRINGTerminalRuleCall_1_0(), "sourcePath"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInheritanceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "sourcePath", lv_sourcePath_1, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInheritance


    // $ANTLR start entryRuleClassIdentification
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1317:1: entryRuleClassIdentification returns [EObject current=null] : iv_ruleClassIdentification= ruleClassIdentification EOF ;
    public final EObject entryRuleClassIdentification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassIdentification = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1317:61: (iv_ruleClassIdentification= ruleClassIdentification EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1318:2: iv_ruleClassIdentification= ruleClassIdentification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getClassIdentificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleClassIdentification_in_entryRuleClassIdentification2701);
            iv_ruleClassIdentification=ruleClassIdentification();
            _fsp--;

             current =iv_ruleClassIdentification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassIdentification2711); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleClassIdentification


    // $ANTLR start ruleClassIdentification
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1325:1: ruleClassIdentification returns [EObject current=null] : ( (lv_contact_0= RULE_STRING ) (lv_author_1= RULE_STRING ) (lv_emailDomain_2= RULE_STRING ) (lv_classFamily_3= RULE_STRING ) (lv_siteSpecific_4= RULE_STRING ) (lv_platform_5= RULE_STRING ) (lv_bus_6= RULE_STRING ) (lv_manufacturer_7= RULE_STRING ) (lv_reference_8= RULE_STRING ) ) ;
    public final EObject ruleClassIdentification() throws RecognitionException {
        EObject current = null;

        Token lv_contact_0=null;
        Token lv_author_1=null;
        Token lv_emailDomain_2=null;
        Token lv_classFamily_3=null;
        Token lv_siteSpecific_4=null;
        Token lv_platform_5=null;
        Token lv_bus_6=null;
        Token lv_manufacturer_7=null;
        Token lv_reference_8=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1330:6: ( ( (lv_contact_0= RULE_STRING ) (lv_author_1= RULE_STRING ) (lv_emailDomain_2= RULE_STRING ) (lv_classFamily_3= RULE_STRING ) (lv_siteSpecific_4= RULE_STRING ) (lv_platform_5= RULE_STRING ) (lv_bus_6= RULE_STRING ) (lv_manufacturer_7= RULE_STRING ) (lv_reference_8= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1331:1: ( (lv_contact_0= RULE_STRING ) (lv_author_1= RULE_STRING ) (lv_emailDomain_2= RULE_STRING ) (lv_classFamily_3= RULE_STRING ) (lv_siteSpecific_4= RULE_STRING ) (lv_platform_5= RULE_STRING ) (lv_bus_6= RULE_STRING ) (lv_manufacturer_7= RULE_STRING ) (lv_reference_8= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1331:1: ( (lv_contact_0= RULE_STRING ) (lv_author_1= RULE_STRING ) (lv_emailDomain_2= RULE_STRING ) (lv_classFamily_3= RULE_STRING ) (lv_siteSpecific_4= RULE_STRING ) (lv_platform_5= RULE_STRING ) (lv_bus_6= RULE_STRING ) (lv_manufacturer_7= RULE_STRING ) (lv_reference_8= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1331:2: (lv_contact_0= RULE_STRING ) (lv_author_1= RULE_STRING ) (lv_emailDomain_2= RULE_STRING ) (lv_classFamily_3= RULE_STRING ) (lv_siteSpecific_4= RULE_STRING ) (lv_platform_5= RULE_STRING ) (lv_bus_6= RULE_STRING ) (lv_manufacturer_7= RULE_STRING ) (lv_reference_8= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1331:2: (lv_contact_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1333:6: lv_contact_0= RULE_STRING
            {
            lv_contact_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2758); 

            		createLeafNode(grammarAccess.getClassIdentificationAccess().getContactSTRINGTerminalRuleCall_0_0(), "contact"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getClassIdentificationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "contact", lv_contact_0, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1351:2: (lv_author_1= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1353:6: lv_author_1= RULE_STRING
            {
            lv_author_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2788); 

            		createLeafNode(grammarAccess.getClassIdentificationAccess().getAuthorSTRINGTerminalRuleCall_1_0(), "author"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getClassIdentificationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "author", lv_author_1, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1371:2: (lv_emailDomain_2= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1373:6: lv_emailDomain_2= RULE_STRING
            {
            lv_emailDomain_2=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2818); 

            		createLeafNode(grammarAccess.getClassIdentificationAccess().getEmailDomainSTRINGTerminalRuleCall_2_0(), "emailDomain"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getClassIdentificationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "emailDomain", lv_emailDomain_2, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1391:2: (lv_classFamily_3= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1393:6: lv_classFamily_3= RULE_STRING
            {
            lv_classFamily_3=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2848); 

            		createLeafNode(grammarAccess.getClassIdentificationAccess().getClassFamilySTRINGTerminalRuleCall_3_0(), "classFamily"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getClassIdentificationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "classFamily", lv_classFamily_3, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1411:2: (lv_siteSpecific_4= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1413:6: lv_siteSpecific_4= RULE_STRING
            {
            lv_siteSpecific_4=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2878); 

            		createLeafNode(grammarAccess.getClassIdentificationAccess().getSiteSpecificSTRINGTerminalRuleCall_4_0(), "siteSpecific"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getClassIdentificationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "siteSpecific", lv_siteSpecific_4, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1431:2: (lv_platform_5= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1433:6: lv_platform_5= RULE_STRING
            {
            lv_platform_5=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2908); 

            		createLeafNode(grammarAccess.getClassIdentificationAccess().getPlatformSTRINGTerminalRuleCall_5_0(), "platform"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getClassIdentificationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "platform", lv_platform_5, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1451:2: (lv_bus_6= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1453:6: lv_bus_6= RULE_STRING
            {
            lv_bus_6=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2938); 

            		createLeafNode(grammarAccess.getClassIdentificationAccess().getBusSTRINGTerminalRuleCall_6_0(), "bus"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getClassIdentificationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "bus", lv_bus_6, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1471:2: (lv_manufacturer_7= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1473:6: lv_manufacturer_7= RULE_STRING
            {
            lv_manufacturer_7=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2968); 

            		createLeafNode(grammarAccess.getClassIdentificationAccess().getManufacturerSTRINGTerminalRuleCall_7_0(), "manufacturer"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getClassIdentificationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "manufacturer", lv_manufacturer_7, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1491:2: (lv_reference_8= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1493:6: lv_reference_8= RULE_STRING
            {
            lv_reference_8=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2998); 

            		createLeafNode(grammarAccess.getClassIdentificationAccess().getReferenceSTRINGTerminalRuleCall_8_0(), "reference"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getClassIdentificationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "reference", lv_reference_8, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleClassIdentification


    // $ANTLR start entryRuleComments
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1518:1: entryRuleComments returns [EObject current=null] : iv_ruleComments= ruleComments EOF ;
    public final EObject entryRuleComments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComments = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1518:50: (iv_ruleComments= ruleComments EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1519:2: iv_ruleComments= ruleComments EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCommentsRule(), currentNode); 
            pushFollow(FOLLOW_ruleComments_in_entryRuleComments3039);
            iv_ruleComments=ruleComments();
            _fsp--;

             current =iv_ruleComments; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComments3049); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleComments


    // $ANTLR start ruleComments
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1526:1: ruleComments returns [EObject current=null] : ( (lv_htmlInheritance_0= RULE_STRING ) (lv_commandsTable_1= RULE_STRING ) ) ;
    public final EObject ruleComments() throws RecognitionException {
        EObject current = null;

        Token lv_htmlInheritance_0=null;
        Token lv_commandsTable_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1531:6: ( ( (lv_htmlInheritance_0= RULE_STRING ) (lv_commandsTable_1= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1532:1: ( (lv_htmlInheritance_0= RULE_STRING ) (lv_commandsTable_1= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1532:1: ( (lv_htmlInheritance_0= RULE_STRING ) (lv_commandsTable_1= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1532:2: (lv_htmlInheritance_0= RULE_STRING ) (lv_commandsTable_1= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1532:2: (lv_htmlInheritance_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1534:6: lv_htmlInheritance_0= RULE_STRING
            {
            lv_htmlInheritance_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleComments3096); 

            		createLeafNode(grammarAccess.getCommentsAccess().getHtmlInheritanceSTRINGTerminalRuleCall_0_0(), "htmlInheritance"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCommentsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "htmlInheritance", lv_htmlInheritance_0, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1552:2: (lv_commandsTable_1= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1554:6: lv_commandsTable_1= RULE_STRING
            {
            lv_commandsTable_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleComments3126); 

            		createLeafNode(grammarAccess.getCommentsAccess().getCommandsTableSTRINGTerminalRuleCall_1_0(), "commandsTable"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCommentsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "commandsTable", lv_commandsTable_1, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleComments


    // $ANTLR start entryRulePreferences
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1579:1: entryRulePreferences returns [EObject current=null] : iv_rulePreferences= rulePreferences EOF ;
    public final EObject entryRulePreferences() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreferences = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1579:53: (iv_rulePreferences= rulePreferences EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1580:2: iv_rulePreferences= rulePreferences EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPreferencesRule(), currentNode); 
            pushFollow(FOLLOW_rulePreferences_in_entryRulePreferences3167);
            iv_rulePreferences=rulePreferences();
            _fsp--;

             current =iv_rulePreferences; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePreferences3177); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePreferences


    // $ANTLR start rulePreferences
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1587:1: rulePreferences returns [EObject current=null] : ( (lv_docHome_0= RULE_STRING ) (lv_makefileHome_1= RULE_STRING ) (lv_installHome_2= RULE_STRING ) (lv_htmlVersion_3= ruleBoolean ) ) ;
    public final EObject rulePreferences() throws RecognitionException {
        EObject current = null;

        Token lv_docHome_0=null;
        Token lv_makefileHome_1=null;
        Token lv_installHome_2=null;
        AntlrDatatypeRuleToken lv_htmlVersion_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1592:6: ( ( (lv_docHome_0= RULE_STRING ) (lv_makefileHome_1= RULE_STRING ) (lv_installHome_2= RULE_STRING ) (lv_htmlVersion_3= ruleBoolean ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1593:1: ( (lv_docHome_0= RULE_STRING ) (lv_makefileHome_1= RULE_STRING ) (lv_installHome_2= RULE_STRING ) (lv_htmlVersion_3= ruleBoolean ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1593:1: ( (lv_docHome_0= RULE_STRING ) (lv_makefileHome_1= RULE_STRING ) (lv_installHome_2= RULE_STRING ) (lv_htmlVersion_3= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1593:2: (lv_docHome_0= RULE_STRING ) (lv_makefileHome_1= RULE_STRING ) (lv_installHome_2= RULE_STRING ) (lv_htmlVersion_3= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1593:2: (lv_docHome_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1595:6: lv_docHome_0= RULE_STRING
            {
            lv_docHome_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePreferences3224); 

            		createLeafNode(grammarAccess.getPreferencesAccess().getDocHomeSTRINGTerminalRuleCall_0_0(), "docHome"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPreferencesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "docHome", lv_docHome_0, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1613:2: (lv_makefileHome_1= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1615:6: lv_makefileHome_1= RULE_STRING
            {
            lv_makefileHome_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePreferences3254); 

            		createLeafNode(grammarAccess.getPreferencesAccess().getMakefileHomeSTRINGTerminalRuleCall_1_0(), "makefileHome"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPreferencesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "makefileHome", lv_makefileHome_1, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1633:2: (lv_installHome_2= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1635:6: lv_installHome_2= RULE_STRING
            {
            lv_installHome_2=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePreferences3284); 

            		createLeafNode(grammarAccess.getPreferencesAccess().getInstallHomeSTRINGTerminalRuleCall_2_0(), "installHome"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPreferencesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "installHome", lv_installHome_2, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1653:2: (lv_htmlVersion_3= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1656:6: lv_htmlVersion_3= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPreferencesAccess().getHtmlVersionBooleanParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_rulePreferences3326);
            lv_htmlVersion_3=ruleBoolean();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPreferencesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "htmlVersion", lv_htmlVersion_3, "Boolean", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePreferences


    // $ANTLR start entryRuleState
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1681:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1681:47: (iv_ruleState= ruleState EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1682:2: iv_ruleState= ruleState EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStateRule(), currentNode); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState3363);
            iv_ruleState=ruleState();
            _fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState3373); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleState


    // $ANTLR start ruleState
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1689:1: ruleState returns [EObject current=null] : ( (lv_name_0= RULE_ID ) (lv_description_1= RULE_STRING ) (lv_status_2= ruleInheritanceStatus ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_description_1=null;
        EObject lv_status_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1694:6: ( ( (lv_name_0= RULE_ID ) (lv_description_1= RULE_STRING ) (lv_status_2= ruleInheritanceStatus ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1695:1: ( (lv_name_0= RULE_ID ) (lv_description_1= RULE_STRING ) (lv_status_2= ruleInheritanceStatus ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1695:1: ( (lv_name_0= RULE_ID ) (lv_description_1= RULE_STRING ) (lv_status_2= ruleInheritanceStatus ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1695:2: (lv_name_0= RULE_ID ) (lv_description_1= RULE_STRING ) (lv_status_2= ruleInheritanceStatus )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1695:2: (lv_name_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1697:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState3420); 

            		createLeafNode(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1715:2: (lv_description_1= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1717:6: lv_description_1= RULE_STRING
            {
            lv_description_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState3450); 

            		createLeafNode(grammarAccess.getStateAccess().getDescriptionSTRINGTerminalRuleCall_1_0(), "description"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "description", lv_description_1, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1735:2: (lv_status_2= ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1738:6: lv_status_2= ruleInheritanceStatus
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStatusInheritanceStatusParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInheritanceStatus_in_ruleState3492);
            lv_status_2=ruleInheritanceStatus();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "status", lv_status_2, "InheritanceStatus", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleState


    // $ANTLR start entryRuleProperty
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1763:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1763:50: (iv_ruleProperty= ruleProperty EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1764:2: iv_ruleProperty= ruleProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty3529);
            iv_ruleProperty=ruleProperty();
            _fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty3539); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleProperty


    // $ANTLR start ruleProperty
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1771:1: ruleProperty returns [EObject current=null] : ( (lv_name_0= RULE_ID ) (lv_type_1= rulePropType ) (lv_status_2= ruleInheritanceStatus ) (lv_description_3= RULE_STRING ) 'defaultPropValue:' (lv_DefaultPropValue_5= RULE_STRING )* ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_description_3=null;
        Token lv_DefaultPropValue_5=null;
        EObject lv_type_1 = null;

        EObject lv_status_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1776:6: ( ( (lv_name_0= RULE_ID ) (lv_type_1= rulePropType ) (lv_status_2= ruleInheritanceStatus ) (lv_description_3= RULE_STRING ) 'defaultPropValue:' (lv_DefaultPropValue_5= RULE_STRING )* ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1777:1: ( (lv_name_0= RULE_ID ) (lv_type_1= rulePropType ) (lv_status_2= ruleInheritanceStatus ) (lv_description_3= RULE_STRING ) 'defaultPropValue:' (lv_DefaultPropValue_5= RULE_STRING )* )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1777:1: ( (lv_name_0= RULE_ID ) (lv_type_1= rulePropType ) (lv_status_2= ruleInheritanceStatus ) (lv_description_3= RULE_STRING ) 'defaultPropValue:' (lv_DefaultPropValue_5= RULE_STRING )* )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1777:2: (lv_name_0= RULE_ID ) (lv_type_1= rulePropType ) (lv_status_2= ruleInheritanceStatus ) (lv_description_3= RULE_STRING ) 'defaultPropValue:' (lv_DefaultPropValue_5= RULE_STRING )*
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1777:2: (lv_name_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1779:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty3586); 

            		createLeafNode(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1797:2: (lv_type_1= rulePropType )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1800:6: lv_type_1= rulePropType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getTypePropTypeParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePropType_in_ruleProperty3628);
            lv_type_1=rulePropType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_1, "PropType", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1818:2: (lv_status_2= ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1821:6: lv_status_2= ruleInheritanceStatus
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getStatusInheritanceStatusParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInheritanceStatus_in_ruleProperty3666);
            lv_status_2=ruleInheritanceStatus();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "status", lv_status_2, "InheritanceStatus", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1839:2: (lv_description_3= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1841:6: lv_description_3= RULE_STRING
            {
            lv_description_3=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProperty3692); 

            		createLeafNode(grammarAccess.getPropertyAccess().getDescriptionSTRINGTerminalRuleCall_3_0(), "description"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "description", lv_description_3, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,41,FOLLOW_41_in_ruleProperty3709); 

                    createLeafNode(grammarAccess.getPropertyAccess().getDefaultPropValueKeyword_4(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1863:1: (lv_DefaultPropValue_5= RULE_STRING )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_STRING) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1865:6: lv_DefaultPropValue_5= RULE_STRING
            	    {
            	    lv_DefaultPropValue_5=(Token)input.LT(1);
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProperty3731); 

            	    		createLeafNode(grammarAccess.getPropertyAccess().getDefaultPropValueSTRINGTerminalRuleCall_5_0(), "DefaultPropValue"); 
            	    	

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "DefaultPropValue", lv_DefaultPropValue_5, "STRING", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProperty


    // $ANTLR start entryRulePropType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1890:1: entryRulePropType returns [EObject current=null] : iv_rulePropType= rulePropType EOF ;
    public final EObject entryRulePropType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1890:50: (iv_rulePropType= rulePropType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1891:2: iv_rulePropType= rulePropType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropTypeRule(), currentNode); 
            pushFollow(FOLLOW_rulePropType_in_entryRulePropType3773);
            iv_rulePropType=rulePropType();
            _fsp--;

             current =iv_rulePropType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropType3783); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePropType


    // $ANTLR start rulePropType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1898:1: rulePropType returns [EObject current=null] : (this_SimpleType_0= ruleSimpleType | this_VectorType_1= ruleVectorType ) ;
    public final EObject rulePropType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleType_0 = null;

        EObject this_VectorType_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1903:6: ( (this_SimpleType_0= ruleSimpleType | this_VectorType_1= ruleVectorType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1904:1: (this_SimpleType_0= ruleSimpleType | this_VectorType_1= ruleVectorType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1904:1: (this_SimpleType_0= ruleSimpleType | this_VectorType_1= ruleVectorType )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=46 && LA17_0<=53)) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=74 && LA17_0<=78)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1904:1: (this_SimpleType_0= ruleSimpleType | this_VectorType_1= ruleVectorType )", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1905:5: this_SimpleType_0= ruleSimpleType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropTypeAccess().getSimpleTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSimpleType_in_rulePropType3830);
                    this_SimpleType_0=ruleSimpleType();
                    _fsp--;

                     
                            current = this_SimpleType_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1915:5: this_VectorType_1= ruleVectorType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropTypeAccess().getVectorTypeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVectorType_in_rulePropType3857);
                    this_VectorType_1=ruleVectorType();
                    _fsp--;

                     
                            current = this_VectorType_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePropType


    // $ANTLR start entryRuleSimpleType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1930:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1930:52: (iv_ruleSimpleType= ruleSimpleType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1931:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSimpleTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType3889);
            iv_ruleSimpleType=ruleSimpleType();
            _fsp--;

             current =iv_ruleSimpleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType3899); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSimpleType


    // $ANTLR start ruleSimpleType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1938:1: ruleSimpleType returns [EObject current=null] : (this_BooleanType_0= ruleBooleanType | this_ShortType_1= ruleShortType | this_UShortType_2= ruleUShortType | this_IntType_3= ruleIntType | this_UIntType_4= ruleUIntType | this_FloatType_5= ruleFloatType | this_DoubleType_6= ruleDoubleType | this_StringType_7= ruleStringType ) ;
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


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1943:6: ( (this_BooleanType_0= ruleBooleanType | this_ShortType_1= ruleShortType | this_UShortType_2= ruleUShortType | this_IntType_3= ruleIntType | this_UIntType_4= ruleUIntType | this_FloatType_5= ruleFloatType | this_DoubleType_6= ruleDoubleType | this_StringType_7= ruleStringType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1944:1: (this_BooleanType_0= ruleBooleanType | this_ShortType_1= ruleShortType | this_UShortType_2= ruleUShortType | this_IntType_3= ruleIntType | this_UIntType_4= ruleUIntType | this_FloatType_5= ruleFloatType | this_DoubleType_6= ruleDoubleType | this_StringType_7= ruleStringType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1944:1: (this_BooleanType_0= ruleBooleanType | this_ShortType_1= ruleShortType | this_UShortType_2= ruleUShortType | this_IntType_3= ruleIntType | this_UIntType_4= ruleUIntType | this_FloatType_5= ruleFloatType | this_DoubleType_6= ruleDoubleType | this_StringType_7= ruleStringType )
            int alt18=8;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt18=1;
                }
                break;
            case 47:
                {
                alt18=2;
                }
                break;
            case 48:
                {
                alt18=3;
                }
                break;
            case 49:
                {
                alt18=4;
                }
                break;
            case 50:
                {
                alt18=5;
                }
                break;
            case 51:
                {
                alt18=6;
                }
                break;
            case 52:
                {
                alt18=7;
                }
                break;
            case 53:
                {
                alt18=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1944:1: (this_BooleanType_0= ruleBooleanType | this_ShortType_1= ruleShortType | this_UShortType_2= ruleUShortType | this_IntType_3= ruleIntType | this_UIntType_4= ruleUIntType | this_FloatType_5= ruleFloatType | this_DoubleType_6= ruleDoubleType | this_StringType_7= ruleStringType )", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1945:5: this_BooleanType_0= ruleBooleanType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSimpleTypeAccess().getBooleanTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBooleanType_in_ruleSimpleType3946);
                    this_BooleanType_0=ruleBooleanType();
                    _fsp--;

                     
                            current = this_BooleanType_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1955:5: this_ShortType_1= ruleShortType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSimpleTypeAccess().getShortTypeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleShortType_in_ruleSimpleType3973);
                    this_ShortType_1=ruleShortType();
                    _fsp--;

                     
                            current = this_ShortType_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1965:5: this_UShortType_2= ruleUShortType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSimpleTypeAccess().getUShortTypeParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUShortType_in_ruleSimpleType4000);
                    this_UShortType_2=ruleUShortType();
                    _fsp--;

                     
                            current = this_UShortType_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1975:5: this_IntType_3= ruleIntType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSimpleTypeAccess().getIntTypeParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntType_in_ruleSimpleType4027);
                    this_IntType_3=ruleIntType();
                    _fsp--;

                     
                            current = this_IntType_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1985:5: this_UIntType_4= ruleUIntType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSimpleTypeAccess().getUIntTypeParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUIntType_in_ruleSimpleType4054);
                    this_UIntType_4=ruleUIntType();
                    _fsp--;

                     
                            current = this_UIntType_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1995:5: this_FloatType_5= ruleFloatType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSimpleTypeAccess().getFloatTypeParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFloatType_in_ruleSimpleType4081);
                    this_FloatType_5=ruleFloatType();
                    _fsp--;

                     
                            current = this_FloatType_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2005:5: this_DoubleType_6= ruleDoubleType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSimpleTypeAccess().getDoubleTypeParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDoubleType_in_ruleSimpleType4108);
                    this_DoubleType_6=ruleDoubleType();
                    _fsp--;

                     
                            current = this_DoubleType_6; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 8 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2015:5: this_StringType_7= ruleStringType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSimpleTypeAccess().getStringTypeParserRuleCall_7(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringType_in_ruleSimpleType4135);
                    this_StringType_7=ruleStringType();
                    _fsp--;

                     
                            current = this_StringType_7; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSimpleType


    // $ANTLR start entryRuleVectorType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2030:1: entryRuleVectorType returns [EObject current=null] : iv_ruleVectorType= ruleVectorType EOF ;
    public final EObject entryRuleVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2030:52: (iv_ruleVectorType= ruleVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2031:2: iv_ruleVectorType= ruleVectorType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVectorTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleVectorType_in_entryRuleVectorType4167);
            iv_ruleVectorType=ruleVectorType();
            _fsp--;

             current =iv_ruleVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVectorType4177); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVectorType


    // $ANTLR start ruleVectorType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2038:1: ruleVectorType returns [EObject current=null] : (this_ShortVectorType_0= ruleShortVectorType | this_IntVectorType_1= ruleIntVectorType | this_FloatVectorType_2= ruleFloatVectorType | this_DoubleVectorType_3= ruleDoubleVectorType | this_StringVectorType_4= ruleStringVectorType ) ;
    public final EObject ruleVectorType() throws RecognitionException {
        EObject current = null;

        EObject this_ShortVectorType_0 = null;

        EObject this_IntVectorType_1 = null;

        EObject this_FloatVectorType_2 = null;

        EObject this_DoubleVectorType_3 = null;

        EObject this_StringVectorType_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2043:6: ( (this_ShortVectorType_0= ruleShortVectorType | this_IntVectorType_1= ruleIntVectorType | this_FloatVectorType_2= ruleFloatVectorType | this_DoubleVectorType_3= ruleDoubleVectorType | this_StringVectorType_4= ruleStringVectorType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2044:1: (this_ShortVectorType_0= ruleShortVectorType | this_IntVectorType_1= ruleIntVectorType | this_FloatVectorType_2= ruleFloatVectorType | this_DoubleVectorType_3= ruleDoubleVectorType | this_StringVectorType_4= ruleStringVectorType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2044:1: (this_ShortVectorType_0= ruleShortVectorType | this_IntVectorType_1= ruleIntVectorType | this_FloatVectorType_2= ruleFloatVectorType | this_DoubleVectorType_3= ruleDoubleVectorType | this_StringVectorType_4= ruleStringVectorType )
            int alt19=5;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt19=1;
                }
                break;
            case 75:
                {
                alt19=2;
                }
                break;
            case 76:
                {
                alt19=3;
                }
                break;
            case 77:
                {
                alt19=4;
                }
                break;
            case 78:
                {
                alt19=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2044:1: (this_ShortVectorType_0= ruleShortVectorType | this_IntVectorType_1= ruleIntVectorType | this_FloatVectorType_2= ruleFloatVectorType | this_DoubleVectorType_3= ruleDoubleVectorType | this_StringVectorType_4= ruleStringVectorType )", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2045:5: this_ShortVectorType_0= ruleShortVectorType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getVectorTypeAccess().getShortVectorTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleShortVectorType_in_ruleVectorType4224);
                    this_ShortVectorType_0=ruleShortVectorType();
                    _fsp--;

                     
                            current = this_ShortVectorType_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2055:5: this_IntVectorType_1= ruleIntVectorType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getVectorTypeAccess().getIntVectorTypeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntVectorType_in_ruleVectorType4251);
                    this_IntVectorType_1=ruleIntVectorType();
                    _fsp--;

                     
                            current = this_IntVectorType_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2065:5: this_FloatVectorType_2= ruleFloatVectorType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getVectorTypeAccess().getFloatVectorTypeParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFloatVectorType_in_ruleVectorType4278);
                    this_FloatVectorType_2=ruleFloatVectorType();
                    _fsp--;

                     
                            current = this_FloatVectorType_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2075:5: this_DoubleVectorType_3= ruleDoubleVectorType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getVectorTypeAccess().getDoubleVectorTypeParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDoubleVectorType_in_ruleVectorType4305);
                    this_DoubleVectorType_3=ruleDoubleVectorType();
                    _fsp--;

                     
                            current = this_DoubleVectorType_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2085:5: this_StringVectorType_4= ruleStringVectorType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getVectorTypeAccess().getStringVectorTypeParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringVectorType_in_ruleVectorType4332);
                    this_StringVectorType_4=ruleStringVectorType();
                    _fsp--;

                     
                            current = this_StringVectorType_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVectorType


    // $ANTLR start entryRuleInheritanceStatus
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2100:1: entryRuleInheritanceStatus returns [EObject current=null] : iv_ruleInheritanceStatus= ruleInheritanceStatus EOF ;
    public final EObject entryRuleInheritanceStatus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritanceStatus = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2100:59: (iv_ruleInheritanceStatus= ruleInheritanceStatus EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2101:2: iv_ruleInheritanceStatus= ruleInheritanceStatus EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInheritanceStatusRule(), currentNode); 
            pushFollow(FOLLOW_ruleInheritanceStatus_in_entryRuleInheritanceStatus4364);
            iv_ruleInheritanceStatus=ruleInheritanceStatus();
            _fsp--;

             current =iv_ruleInheritanceStatus; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInheritanceStatus4374); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInheritanceStatus


    // $ANTLR start ruleInheritanceStatus
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2108:1: ruleInheritanceStatus returns [EObject current=null] : ( (lv_abstract_0= ruleBoolean ) (lv_inherited_1= ruleBoolean ) (lv_concrete_2= ruleBoolean ) (lv_concreteHere_3= ruleBoolean ) (lv_hasChanged_4= RULE_STRING ) ) ;
    public final EObject ruleInheritanceStatus() throws RecognitionException {
        EObject current = null;

        Token lv_hasChanged_4=null;
        AntlrDatatypeRuleToken lv_abstract_0 = null;

        AntlrDatatypeRuleToken lv_inherited_1 = null;

        AntlrDatatypeRuleToken lv_concrete_2 = null;

        AntlrDatatypeRuleToken lv_concreteHere_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2113:6: ( ( (lv_abstract_0= ruleBoolean ) (lv_inherited_1= ruleBoolean ) (lv_concrete_2= ruleBoolean ) (lv_concreteHere_3= ruleBoolean ) (lv_hasChanged_4= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2114:1: ( (lv_abstract_0= ruleBoolean ) (lv_inherited_1= ruleBoolean ) (lv_concrete_2= ruleBoolean ) (lv_concreteHere_3= ruleBoolean ) (lv_hasChanged_4= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2114:1: ( (lv_abstract_0= ruleBoolean ) (lv_inherited_1= ruleBoolean ) (lv_concrete_2= ruleBoolean ) (lv_concreteHere_3= ruleBoolean ) (lv_hasChanged_4= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2114:2: (lv_abstract_0= ruleBoolean ) (lv_inherited_1= ruleBoolean ) (lv_concrete_2= ruleBoolean ) (lv_concreteHere_3= ruleBoolean ) (lv_hasChanged_4= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2114:2: (lv_abstract_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2117:6: lv_abstract_0= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInheritanceStatusAccess().getAbstractBooleanParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleInheritanceStatus4433);
            lv_abstract_0=ruleBoolean();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInheritanceStatusRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "abstract", lv_abstract_0, "Boolean", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2135:2: (lv_inherited_1= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2138:6: lv_inherited_1= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInheritanceStatusAccess().getInheritedBooleanParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleInheritanceStatus4471);
            lv_inherited_1=ruleBoolean();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInheritanceStatusRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "inherited", lv_inherited_1, "Boolean", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2156:2: (lv_concrete_2= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2159:6: lv_concrete_2= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInheritanceStatusAccess().getConcreteBooleanParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleInheritanceStatus4509);
            lv_concrete_2=ruleBoolean();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInheritanceStatusRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "concrete", lv_concrete_2, "Boolean", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2177:2: (lv_concreteHere_3= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2180:6: lv_concreteHere_3= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInheritanceStatusAccess().getConcreteHereBooleanParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleInheritanceStatus4547);
            lv_concreteHere_3=ruleBoolean();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInheritanceStatusRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "concreteHere", lv_concreteHere_3, "Boolean", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2198:2: (lv_hasChanged_4= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2200:6: lv_hasChanged_4= RULE_STRING
            {
            lv_hasChanged_4=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInheritanceStatus4573); 

            		createLeafNode(grammarAccess.getInheritanceStatusAccess().getHasChangedSTRINGTerminalRuleCall_4_0(), "hasChanged"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInheritanceStatusRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "hasChanged", lv_hasChanged_4, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInheritanceStatus


    // $ANTLR start entryRuleCommand
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2225:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2225:49: (iv_ruleCommand= ruleCommand EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2226:2: iv_ruleCommand= ruleCommand EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCommandRule(), currentNode); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand4614);
            iv_ruleCommand=ruleCommand();
            _fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand4624); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCommand


    // $ANTLR start ruleCommand
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2233:1: ruleCommand returns [EObject current=null] : ( (lv_name_0= RULE_ID ) (lv_argin_1= ruleArgument ) (lv_argout_2= ruleArgument ) (lv_description_3= RULE_STRING ) (lv_status_4= ruleInheritanceStatus ) (lv_execMethod_5= RULE_STRING ) (lv_displayLevel_6= ruleDisplayLevel ) (lv_polledPeriod_7= RULE_STRING ) 'excludedStates:' (lv_excludedStates_9= RULE_STRING )* ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_description_3=null;
        Token lv_execMethod_5=null;
        Token lv_polledPeriod_7=null;
        Token lv_excludedStates_9=null;
        EObject lv_argin_1 = null;

        EObject lv_argout_2 = null;

        EObject lv_status_4 = null;

        AntlrDatatypeRuleToken lv_displayLevel_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2238:6: ( ( (lv_name_0= RULE_ID ) (lv_argin_1= ruleArgument ) (lv_argout_2= ruleArgument ) (lv_description_3= RULE_STRING ) (lv_status_4= ruleInheritanceStatus ) (lv_execMethod_5= RULE_STRING ) (lv_displayLevel_6= ruleDisplayLevel ) (lv_polledPeriod_7= RULE_STRING ) 'excludedStates:' (lv_excludedStates_9= RULE_STRING )* ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2239:1: ( (lv_name_0= RULE_ID ) (lv_argin_1= ruleArgument ) (lv_argout_2= ruleArgument ) (lv_description_3= RULE_STRING ) (lv_status_4= ruleInheritanceStatus ) (lv_execMethod_5= RULE_STRING ) (lv_displayLevel_6= ruleDisplayLevel ) (lv_polledPeriod_7= RULE_STRING ) 'excludedStates:' (lv_excludedStates_9= RULE_STRING )* )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2239:1: ( (lv_name_0= RULE_ID ) (lv_argin_1= ruleArgument ) (lv_argout_2= ruleArgument ) (lv_description_3= RULE_STRING ) (lv_status_4= ruleInheritanceStatus ) (lv_execMethod_5= RULE_STRING ) (lv_displayLevel_6= ruleDisplayLevel ) (lv_polledPeriod_7= RULE_STRING ) 'excludedStates:' (lv_excludedStates_9= RULE_STRING )* )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2239:2: (lv_name_0= RULE_ID ) (lv_argin_1= ruleArgument ) (lv_argout_2= ruleArgument ) (lv_description_3= RULE_STRING ) (lv_status_4= ruleInheritanceStatus ) (lv_execMethod_5= RULE_STRING ) (lv_displayLevel_6= ruleDisplayLevel ) (lv_polledPeriod_7= RULE_STRING ) 'excludedStates:' (lv_excludedStates_9= RULE_STRING )*
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2239:2: (lv_name_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2241:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand4671); 

            		createLeafNode(grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2259:2: (lv_argin_1= ruleArgument )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2262:6: lv_argin_1= ruleArgument
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getArginArgumentParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleArgument_in_ruleCommand4713);
            lv_argin_1=ruleArgument();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "argin", lv_argin_1, "Argument", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2280:2: (lv_argout_2= ruleArgument )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2283:6: lv_argout_2= ruleArgument
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getArgoutArgumentParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleArgument_in_ruleCommand4751);
            lv_argout_2=ruleArgument();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "argout", lv_argout_2, "Argument", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2301:2: (lv_description_3= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2303:6: lv_description_3= RULE_STRING
            {
            lv_description_3=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommand4777); 

            		createLeafNode(grammarAccess.getCommandAccess().getDescriptionSTRINGTerminalRuleCall_3_0(), "description"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "description", lv_description_3, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2321:2: (lv_status_4= ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2324:6: lv_status_4= ruleInheritanceStatus
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getStatusInheritanceStatusParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInheritanceStatus_in_ruleCommand4819);
            lv_status_4=ruleInheritanceStatus();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "status", lv_status_4, "InheritanceStatus", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2342:2: (lv_execMethod_5= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2344:6: lv_execMethod_5= RULE_STRING
            {
            lv_execMethod_5=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommand4845); 

            		createLeafNode(grammarAccess.getCommandAccess().getExecMethodSTRINGTerminalRuleCall_5_0(), "execMethod"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "execMethod", lv_execMethod_5, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2362:2: (lv_displayLevel_6= ruleDisplayLevel )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2365:6: lv_displayLevel_6= ruleDisplayLevel
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getDisplayLevelDisplayLevelParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDisplayLevel_in_ruleCommand4887);
            lv_displayLevel_6=ruleDisplayLevel();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "displayLevel", lv_displayLevel_6, "DisplayLevel", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2383:2: (lv_polledPeriod_7= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2385:6: lv_polledPeriod_7= RULE_STRING
            {
            lv_polledPeriod_7=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommand4913); 

            		createLeafNode(grammarAccess.getCommandAccess().getPolledPeriodSTRINGTerminalRuleCall_7_0(), "polledPeriod"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "polledPeriod", lv_polledPeriod_7, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,42,FOLLOW_42_in_ruleCommand4930); 

                    createLeafNode(grammarAccess.getCommandAccess().getExcludedStatesKeyword_8(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2407:1: (lv_excludedStates_9= RULE_STRING )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_STRING) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2409:6: lv_excludedStates_9= RULE_STRING
            	    {
            	    lv_excludedStates_9=(Token)input.LT(1);
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommand4952); 

            	    		createLeafNode(grammarAccess.getCommandAccess().getExcludedStatesSTRINGTerminalRuleCall_9_0(), "excludedStates"); 
            	    	

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "excludedStates", lv_excludedStates_9, "STRING", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCommand


    // $ANTLR start entryRuleArgument
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2434:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2434:50: (iv_ruleArgument= ruleArgument EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2435:2: iv_ruleArgument= ruleArgument EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArgumentRule(), currentNode); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument4994);
            iv_ruleArgument=ruleArgument();
            _fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument5004); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleArgument


    // $ANTLR start ruleArgument
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2442:1: ruleArgument returns [EObject current=null] : ( (lv_type_0= ruleType ) (lv_description_1= RULE_STRING ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_description_1=null;
        EObject lv_type_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2447:6: ( ( (lv_type_0= ruleType ) (lv_description_1= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2448:1: ( (lv_type_0= ruleType ) (lv_description_1= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2448:1: ( (lv_type_0= ruleType ) (lv_description_1= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2448:2: (lv_type_0= ruleType ) (lv_description_1= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2448:2: (lv_type_0= ruleType )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2451:6: lv_type_0= ruleType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getTypeTypeParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleArgument5063);
            lv_type_0=ruleType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_0, "Type", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2469:2: (lv_description_1= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2471:6: lv_description_1= RULE_STRING
            {
            lv_description_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument5089); 

            		createLeafNode(grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_1_0(), "description"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "description", lv_description_1, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleArgument


    // $ANTLR start entryRuleAttribute
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2496:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2496:51: (iv_ruleAttribute= ruleAttribute EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2497:2: iv_ruleAttribute= ruleAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute5130);
            iv_ruleAttribute=ruleAttribute();
            _fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute5140); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAttribute


    // $ANTLR start ruleAttribute
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2504:1: ruleAttribute returns [EObject current=null] : ( (lv_name_0= RULE_ID ) (lv_attType_1= ruleAttrType ) (lv_dataType_2= ruleType ) (lv_rwType_3= ruleRW_Type ) (lv_displayLevel_4= ruleDisplayLevel ) (lv_polledPeriod_5= RULE_STRING ) (lv_maxX_6= RULE_STRING ) (lv_maxY_7= RULE_STRING ) (lv_memorized_8= ruleBoolean ) (lv_memorizedAtInit_9= ruleBoolean ) (lv_changeEvent_10= ruleFireEvents ) (lv_archiveEvent_11= ruleFireEvents ) (lv_status_12= ruleInheritanceStatus ) (lv_properties_13= ruleAttrProperties ) (lv_allocReadMember_14= ruleBoolean ) (lv_isDynamic_15= ruleBoolean ) 'readExcludedStates:' (lv_readExcludedStates_17= RULE_STRING )* 'writeExcludedStates:' (lv_writeExcludedStates_19= RULE_STRING )* ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_polledPeriod_5=null;
        Token lv_maxX_6=null;
        Token lv_maxY_7=null;
        Token lv_readExcludedStates_17=null;
        Token lv_writeExcludedStates_19=null;
        AntlrDatatypeRuleToken lv_attType_1 = null;

        EObject lv_dataType_2 = null;

        AntlrDatatypeRuleToken lv_rwType_3 = null;

        AntlrDatatypeRuleToken lv_displayLevel_4 = null;

        AntlrDatatypeRuleToken lv_memorized_8 = null;

        AntlrDatatypeRuleToken lv_memorizedAtInit_9 = null;

        EObject lv_changeEvent_10 = null;

        EObject lv_archiveEvent_11 = null;

        EObject lv_status_12 = null;

        EObject lv_properties_13 = null;

        AntlrDatatypeRuleToken lv_allocReadMember_14 = null;

        AntlrDatatypeRuleToken lv_isDynamic_15 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2509:6: ( ( (lv_name_0= RULE_ID ) (lv_attType_1= ruleAttrType ) (lv_dataType_2= ruleType ) (lv_rwType_3= ruleRW_Type ) (lv_displayLevel_4= ruleDisplayLevel ) (lv_polledPeriod_5= RULE_STRING ) (lv_maxX_6= RULE_STRING ) (lv_maxY_7= RULE_STRING ) (lv_memorized_8= ruleBoolean ) (lv_memorizedAtInit_9= ruleBoolean ) (lv_changeEvent_10= ruleFireEvents ) (lv_archiveEvent_11= ruleFireEvents ) (lv_status_12= ruleInheritanceStatus ) (lv_properties_13= ruleAttrProperties ) (lv_allocReadMember_14= ruleBoolean ) (lv_isDynamic_15= ruleBoolean ) 'readExcludedStates:' (lv_readExcludedStates_17= RULE_STRING )* 'writeExcludedStates:' (lv_writeExcludedStates_19= RULE_STRING )* ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2510:1: ( (lv_name_0= RULE_ID ) (lv_attType_1= ruleAttrType ) (lv_dataType_2= ruleType ) (lv_rwType_3= ruleRW_Type ) (lv_displayLevel_4= ruleDisplayLevel ) (lv_polledPeriod_5= RULE_STRING ) (lv_maxX_6= RULE_STRING ) (lv_maxY_7= RULE_STRING ) (lv_memorized_8= ruleBoolean ) (lv_memorizedAtInit_9= ruleBoolean ) (lv_changeEvent_10= ruleFireEvents ) (lv_archiveEvent_11= ruleFireEvents ) (lv_status_12= ruleInheritanceStatus ) (lv_properties_13= ruleAttrProperties ) (lv_allocReadMember_14= ruleBoolean ) (lv_isDynamic_15= ruleBoolean ) 'readExcludedStates:' (lv_readExcludedStates_17= RULE_STRING )* 'writeExcludedStates:' (lv_writeExcludedStates_19= RULE_STRING )* )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2510:1: ( (lv_name_0= RULE_ID ) (lv_attType_1= ruleAttrType ) (lv_dataType_2= ruleType ) (lv_rwType_3= ruleRW_Type ) (lv_displayLevel_4= ruleDisplayLevel ) (lv_polledPeriod_5= RULE_STRING ) (lv_maxX_6= RULE_STRING ) (lv_maxY_7= RULE_STRING ) (lv_memorized_8= ruleBoolean ) (lv_memorizedAtInit_9= ruleBoolean ) (lv_changeEvent_10= ruleFireEvents ) (lv_archiveEvent_11= ruleFireEvents ) (lv_status_12= ruleInheritanceStatus ) (lv_properties_13= ruleAttrProperties ) (lv_allocReadMember_14= ruleBoolean ) (lv_isDynamic_15= ruleBoolean ) 'readExcludedStates:' (lv_readExcludedStates_17= RULE_STRING )* 'writeExcludedStates:' (lv_writeExcludedStates_19= RULE_STRING )* )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2510:2: (lv_name_0= RULE_ID ) (lv_attType_1= ruleAttrType ) (lv_dataType_2= ruleType ) (lv_rwType_3= ruleRW_Type ) (lv_displayLevel_4= ruleDisplayLevel ) (lv_polledPeriod_5= RULE_STRING ) (lv_maxX_6= RULE_STRING ) (lv_maxY_7= RULE_STRING ) (lv_memorized_8= ruleBoolean ) (lv_memorizedAtInit_9= ruleBoolean ) (lv_changeEvent_10= ruleFireEvents ) (lv_archiveEvent_11= ruleFireEvents ) (lv_status_12= ruleInheritanceStatus ) (lv_properties_13= ruleAttrProperties ) (lv_allocReadMember_14= ruleBoolean ) (lv_isDynamic_15= ruleBoolean ) 'readExcludedStates:' (lv_readExcludedStates_17= RULE_STRING )* 'writeExcludedStates:' (lv_writeExcludedStates_19= RULE_STRING )*
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2510:2: (lv_name_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2512:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute5187); 

            		createLeafNode(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2530:2: (lv_attType_1= ruleAttrType )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2533:6: lv_attType_1= ruleAttrType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getAttTypeAttrTypeParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAttrType_in_ruleAttribute5229);
            lv_attType_1=ruleAttrType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "attType", lv_attType_1, "AttrType", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2551:2: (lv_dataType_2= ruleType )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2554:6: lv_dataType_2= ruleType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getDataTypeTypeParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleAttribute5267);
            lv_dataType_2=ruleType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "dataType", lv_dataType_2, "Type", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2572:2: (lv_rwType_3= ruleRW_Type )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2575:6: lv_rwType_3= ruleRW_Type
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getRwTypeRW_TypeParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleRW_Type_in_ruleAttribute5305);
            lv_rwType_3=ruleRW_Type();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "rwType", lv_rwType_3, "RW_Type", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2593:2: (lv_displayLevel_4= ruleDisplayLevel )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2596:6: lv_displayLevel_4= ruleDisplayLevel
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getDisplayLevelDisplayLevelParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDisplayLevel_in_ruleAttribute5343);
            lv_displayLevel_4=ruleDisplayLevel();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "displayLevel", lv_displayLevel_4, "DisplayLevel", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2614:2: (lv_polledPeriod_5= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2616:6: lv_polledPeriod_5= RULE_STRING
            {
            lv_polledPeriod_5=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute5369); 

            		createLeafNode(grammarAccess.getAttributeAccess().getPolledPeriodSTRINGTerminalRuleCall_5_0(), "polledPeriod"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "polledPeriod", lv_polledPeriod_5, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2634:2: (lv_maxX_6= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2636:6: lv_maxX_6= RULE_STRING
            {
            lv_maxX_6=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute5399); 

            		createLeafNode(grammarAccess.getAttributeAccess().getMaxXSTRINGTerminalRuleCall_6_0(), "maxX"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "maxX", lv_maxX_6, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2654:2: (lv_maxY_7= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2656:6: lv_maxY_7= RULE_STRING
            {
            lv_maxY_7=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute5429); 

            		createLeafNode(grammarAccess.getAttributeAccess().getMaxYSTRINGTerminalRuleCall_7_0(), "maxY"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "maxY", lv_maxY_7, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2674:2: (lv_memorized_8= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2677:6: lv_memorized_8= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getMemorizedBooleanParserRuleCall_8_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleAttribute5471);
            lv_memorized_8=ruleBoolean();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "memorized", lv_memorized_8, "Boolean", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2695:2: (lv_memorizedAtInit_9= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2698:6: lv_memorizedAtInit_9= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getMemorizedAtInitBooleanParserRuleCall_9_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleAttribute5509);
            lv_memorizedAtInit_9=ruleBoolean();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "memorizedAtInit", lv_memorizedAtInit_9, "Boolean", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2716:2: (lv_changeEvent_10= ruleFireEvents )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2719:6: lv_changeEvent_10= ruleFireEvents
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getChangeEventFireEventsParserRuleCall_10_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFireEvents_in_ruleAttribute5547);
            lv_changeEvent_10=ruleFireEvents();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "changeEvent", lv_changeEvent_10, "FireEvents", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2737:2: (lv_archiveEvent_11= ruleFireEvents )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2740:6: lv_archiveEvent_11= ruleFireEvents
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getArchiveEventFireEventsParserRuleCall_11_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFireEvents_in_ruleAttribute5585);
            lv_archiveEvent_11=ruleFireEvents();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "archiveEvent", lv_archiveEvent_11, "FireEvents", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2758:2: (lv_status_12= ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2761:6: lv_status_12= ruleInheritanceStatus
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getStatusInheritanceStatusParserRuleCall_12_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInheritanceStatus_in_ruleAttribute5623);
            lv_status_12=ruleInheritanceStatus();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "status", lv_status_12, "InheritanceStatus", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2779:2: (lv_properties_13= ruleAttrProperties )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2782:6: lv_properties_13= ruleAttrProperties
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getPropertiesAttrPropertiesParserRuleCall_13_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAttrProperties_in_ruleAttribute5661);
            lv_properties_13=ruleAttrProperties();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "properties", lv_properties_13, "AttrProperties", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2800:2: (lv_allocReadMember_14= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2803:6: lv_allocReadMember_14= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getAllocReadMemberBooleanParserRuleCall_14_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleAttribute5699);
            lv_allocReadMember_14=ruleBoolean();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "allocReadMember", lv_allocReadMember_14, "Boolean", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2821:2: (lv_isDynamic_15= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2824:6: lv_isDynamic_15= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getIsDynamicBooleanParserRuleCall_15_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleAttribute5737);
            lv_isDynamic_15=ruleBoolean();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "isDynamic", lv_isDynamic_15, "Boolean", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,43,FOLLOW_43_in_ruleAttribute5750); 

                    createLeafNode(grammarAccess.getAttributeAccess().getReadExcludedStatesKeyword_16(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2846:1: (lv_readExcludedStates_17= RULE_STRING )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STRING) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2848:6: lv_readExcludedStates_17= RULE_STRING
            	    {
            	    lv_readExcludedStates_17=(Token)input.LT(1);
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute5772); 

            	    		createLeafNode(grammarAccess.getAttributeAccess().getReadExcludedStatesSTRINGTerminalRuleCall_17_0(), "readExcludedStates"); 
            	    	

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "readExcludedStates", lv_readExcludedStates_17, "STRING", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            match(input,44,FOLLOW_44_in_ruleAttribute5790); 

                    createLeafNode(grammarAccess.getAttributeAccess().getWriteExcludedStatesKeyword_18(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2870:1: (lv_writeExcludedStates_19= RULE_STRING )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_STRING) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2872:6: lv_writeExcludedStates_19= RULE_STRING
            	    {
            	    lv_writeExcludedStates_19=(Token)input.LT(1);
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute5812); 

            	    		createLeafNode(grammarAccess.getAttributeAccess().getWriteExcludedStatesSTRINGTerminalRuleCall_19_0(), "writeExcludedStates"); 
            	    	

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "writeExcludedStates", lv_writeExcludedStates_19, "STRING", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAttribute


    // $ANTLR start entryRuleFireEvents
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2897:1: entryRuleFireEvents returns [EObject current=null] : iv_ruleFireEvents= ruleFireEvents EOF ;
    public final EObject entryRuleFireEvents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFireEvents = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2897:52: (iv_ruleFireEvents= ruleFireEvents EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2898:2: iv_ruleFireEvents= ruleFireEvents EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFireEventsRule(), currentNode); 
            pushFollow(FOLLOW_ruleFireEvents_in_entryRuleFireEvents5854);
            iv_ruleFireEvents=ruleFireEvents();
            _fsp--;

             current =iv_ruleFireEvents; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFireEvents5864); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFireEvents


    // $ANTLR start ruleFireEvents
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2905:1: ruleFireEvents returns [EObject current=null] : ( (lv_fire_0= ruleBoolean ) (lv_libCheckCriteria_1= ruleBoolean ) ) ;
    public final EObject ruleFireEvents() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_fire_0 = null;

        AntlrDatatypeRuleToken lv_libCheckCriteria_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2910:6: ( ( (lv_fire_0= ruleBoolean ) (lv_libCheckCriteria_1= ruleBoolean ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2911:1: ( (lv_fire_0= ruleBoolean ) (lv_libCheckCriteria_1= ruleBoolean ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2911:1: ( (lv_fire_0= ruleBoolean ) (lv_libCheckCriteria_1= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2911:2: (lv_fire_0= ruleBoolean ) (lv_libCheckCriteria_1= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2911:2: (lv_fire_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2914:6: lv_fire_0= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFireEventsAccess().getFireBooleanParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleFireEvents5923);
            lv_fire_0=ruleBoolean();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFireEventsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "fire", lv_fire_0, "Boolean", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2932:2: (lv_libCheckCriteria_1= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2935:6: lv_libCheckCriteria_1= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFireEventsAccess().getLibCheckCriteriaBooleanParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleFireEvents5961);
            lv_libCheckCriteria_1=ruleBoolean();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFireEventsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "libCheckCriteria", lv_libCheckCriteria_1, "Boolean", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFireEvents


    // $ANTLR start entryRuleAttrProperties
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2960:1: entryRuleAttrProperties returns [EObject current=null] : iv_ruleAttrProperties= ruleAttrProperties EOF ;
    public final EObject entryRuleAttrProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrProperties = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2960:56: (iv_ruleAttrProperties= ruleAttrProperties EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2961:2: iv_ruleAttrProperties= ruleAttrProperties EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttrPropertiesRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttrProperties_in_entryRuleAttrProperties5998);
            iv_ruleAttrProperties=ruleAttrProperties();
            _fsp--;

             current =iv_ruleAttrProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrProperties6008); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAttrProperties


    // $ANTLR start ruleAttrProperties
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2968:1: ruleAttrProperties returns [EObject current=null] : ( (lv_description_0= RULE_STRING ) (lv_label_1= RULE_STRING ) (lv_unit_2= RULE_STRING ) (lv_standardUnit_3= RULE_STRING ) (lv_displayUnit_4= RULE_STRING ) (lv_format_5= RULE_STRING ) (lv_maxValue_6= RULE_STRING ) (lv_minValue_7= RULE_STRING ) (lv_maxAlarm_8= RULE_STRING ) (lv_minAlarm_9= RULE_STRING ) (lv_maxWarning_10= RULE_STRING ) (lv_minWarning_11= RULE_STRING ) (lv_deltaTime_12= RULE_STRING ) (lv_deltaValue_13= RULE_STRING ) ) ;
    public final EObject ruleAttrProperties() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_label_1=null;
        Token lv_unit_2=null;
        Token lv_standardUnit_3=null;
        Token lv_displayUnit_4=null;
        Token lv_format_5=null;
        Token lv_maxValue_6=null;
        Token lv_minValue_7=null;
        Token lv_maxAlarm_8=null;
        Token lv_minAlarm_9=null;
        Token lv_maxWarning_10=null;
        Token lv_minWarning_11=null;
        Token lv_deltaTime_12=null;
        Token lv_deltaValue_13=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2973:6: ( ( (lv_description_0= RULE_STRING ) (lv_label_1= RULE_STRING ) (lv_unit_2= RULE_STRING ) (lv_standardUnit_3= RULE_STRING ) (lv_displayUnit_4= RULE_STRING ) (lv_format_5= RULE_STRING ) (lv_maxValue_6= RULE_STRING ) (lv_minValue_7= RULE_STRING ) (lv_maxAlarm_8= RULE_STRING ) (lv_minAlarm_9= RULE_STRING ) (lv_maxWarning_10= RULE_STRING ) (lv_minWarning_11= RULE_STRING ) (lv_deltaTime_12= RULE_STRING ) (lv_deltaValue_13= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2974:1: ( (lv_description_0= RULE_STRING ) (lv_label_1= RULE_STRING ) (lv_unit_2= RULE_STRING ) (lv_standardUnit_3= RULE_STRING ) (lv_displayUnit_4= RULE_STRING ) (lv_format_5= RULE_STRING ) (lv_maxValue_6= RULE_STRING ) (lv_minValue_7= RULE_STRING ) (lv_maxAlarm_8= RULE_STRING ) (lv_minAlarm_9= RULE_STRING ) (lv_maxWarning_10= RULE_STRING ) (lv_minWarning_11= RULE_STRING ) (lv_deltaTime_12= RULE_STRING ) (lv_deltaValue_13= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2974:1: ( (lv_description_0= RULE_STRING ) (lv_label_1= RULE_STRING ) (lv_unit_2= RULE_STRING ) (lv_standardUnit_3= RULE_STRING ) (lv_displayUnit_4= RULE_STRING ) (lv_format_5= RULE_STRING ) (lv_maxValue_6= RULE_STRING ) (lv_minValue_7= RULE_STRING ) (lv_maxAlarm_8= RULE_STRING ) (lv_minAlarm_9= RULE_STRING ) (lv_maxWarning_10= RULE_STRING ) (lv_minWarning_11= RULE_STRING ) (lv_deltaTime_12= RULE_STRING ) (lv_deltaValue_13= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2974:2: (lv_description_0= RULE_STRING ) (lv_label_1= RULE_STRING ) (lv_unit_2= RULE_STRING ) (lv_standardUnit_3= RULE_STRING ) (lv_displayUnit_4= RULE_STRING ) (lv_format_5= RULE_STRING ) (lv_maxValue_6= RULE_STRING ) (lv_minValue_7= RULE_STRING ) (lv_maxAlarm_8= RULE_STRING ) (lv_minAlarm_9= RULE_STRING ) (lv_maxWarning_10= RULE_STRING ) (lv_minWarning_11= RULE_STRING ) (lv_deltaTime_12= RULE_STRING ) (lv_deltaValue_13= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2974:2: (lv_description_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2976:6: lv_description_0= RULE_STRING
            {
            lv_description_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6055); 

            		createLeafNode(grammarAccess.getAttrPropertiesAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttrPropertiesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "description", lv_description_0, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2994:2: (lv_label_1= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2996:6: lv_label_1= RULE_STRING
            {
            lv_label_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6085); 

            		createLeafNode(grammarAccess.getAttrPropertiesAccess().getLabelSTRINGTerminalRuleCall_1_0(), "label"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttrPropertiesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "label", lv_label_1, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3014:2: (lv_unit_2= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3016:6: lv_unit_2= RULE_STRING
            {
            lv_unit_2=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6115); 

            		createLeafNode(grammarAccess.getAttrPropertiesAccess().getUnitSTRINGTerminalRuleCall_2_0(), "unit"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttrPropertiesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "unit", lv_unit_2, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3034:2: (lv_standardUnit_3= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3036:6: lv_standardUnit_3= RULE_STRING
            {
            lv_standardUnit_3=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6145); 

            		createLeafNode(grammarAccess.getAttrPropertiesAccess().getStandardUnitSTRINGTerminalRuleCall_3_0(), "standardUnit"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttrPropertiesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "standardUnit", lv_standardUnit_3, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3054:2: (lv_displayUnit_4= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3056:6: lv_displayUnit_4= RULE_STRING
            {
            lv_displayUnit_4=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6175); 

            		createLeafNode(grammarAccess.getAttrPropertiesAccess().getDisplayUnitSTRINGTerminalRuleCall_4_0(), "displayUnit"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttrPropertiesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "displayUnit", lv_displayUnit_4, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3074:2: (lv_format_5= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3076:6: lv_format_5= RULE_STRING
            {
            lv_format_5=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6205); 

            		createLeafNode(grammarAccess.getAttrPropertiesAccess().getFormatSTRINGTerminalRuleCall_5_0(), "format"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttrPropertiesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "format", lv_format_5, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3094:2: (lv_maxValue_6= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3096:6: lv_maxValue_6= RULE_STRING
            {
            lv_maxValue_6=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6235); 

            		createLeafNode(grammarAccess.getAttrPropertiesAccess().getMaxValueSTRINGTerminalRuleCall_6_0(), "maxValue"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttrPropertiesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "maxValue", lv_maxValue_6, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3114:2: (lv_minValue_7= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3116:6: lv_minValue_7= RULE_STRING
            {
            lv_minValue_7=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6265); 

            		createLeafNode(grammarAccess.getAttrPropertiesAccess().getMinValueSTRINGTerminalRuleCall_7_0(), "minValue"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttrPropertiesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "minValue", lv_minValue_7, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3134:2: (lv_maxAlarm_8= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3136:6: lv_maxAlarm_8= RULE_STRING
            {
            lv_maxAlarm_8=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6295); 

            		createLeafNode(grammarAccess.getAttrPropertiesAccess().getMaxAlarmSTRINGTerminalRuleCall_8_0(), "maxAlarm"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttrPropertiesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "maxAlarm", lv_maxAlarm_8, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3154:2: (lv_minAlarm_9= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3156:6: lv_minAlarm_9= RULE_STRING
            {
            lv_minAlarm_9=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6325); 

            		createLeafNode(grammarAccess.getAttrPropertiesAccess().getMinAlarmSTRINGTerminalRuleCall_9_0(), "minAlarm"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttrPropertiesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "minAlarm", lv_minAlarm_9, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3174:2: (lv_maxWarning_10= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3176:6: lv_maxWarning_10= RULE_STRING
            {
            lv_maxWarning_10=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6355); 

            		createLeafNode(grammarAccess.getAttrPropertiesAccess().getMaxWarningSTRINGTerminalRuleCall_10_0(), "maxWarning"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttrPropertiesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "maxWarning", lv_maxWarning_10, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3194:2: (lv_minWarning_11= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3196:6: lv_minWarning_11= RULE_STRING
            {
            lv_minWarning_11=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6385); 

            		createLeafNode(grammarAccess.getAttrPropertiesAccess().getMinWarningSTRINGTerminalRuleCall_11_0(), "minWarning"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttrPropertiesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "minWarning", lv_minWarning_11, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3214:2: (lv_deltaTime_12= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3216:6: lv_deltaTime_12= RULE_STRING
            {
            lv_deltaTime_12=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6415); 

            		createLeafNode(grammarAccess.getAttrPropertiesAccess().getDeltaTimeSTRINGTerminalRuleCall_12_0(), "deltaTime"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttrPropertiesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "deltaTime", lv_deltaTime_12, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3234:2: (lv_deltaValue_13= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3236:6: lv_deltaValue_13= RULE_STRING
            {
            lv_deltaValue_13=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6445); 

            		createLeafNode(grammarAccess.getAttrPropertiesAccess().getDeltaValueSTRINGTerminalRuleCall_13_0(), "deltaValue"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttrPropertiesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "deltaValue", lv_deltaValue_13, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAttrProperties


    // $ANTLR start entryRuleType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3261:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3261:46: (iv_ruleType= ruleType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3262:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType6486);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType6496); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3269:1: ruleType returns [EObject current=null] : (this_VoidType_0= ruleVoidType | this_BooleanType_1= ruleBooleanType | this_ShortType_2= ruleShortType | this_UShortType_3= ruleUShortType | this_IntType_4= ruleIntType | this_UIntType_5= ruleUIntType | this_FloatType_6= ruleFloatType | this_DoubleType_7= ruleDoubleType | this_StringType_8= ruleStringType | this_CharArrayType_9= ruleCharArrayType | this_ShortArrayType_10= ruleShortArrayType | this_UShortArrayType_11= ruleUShortArrayType | this_IntArrayType_12= ruleIntArrayType | this_UIntArrayType_13= ruleUIntArrayType | this_FloatArrayType_14= ruleFloatArrayType | this_DoubleArrayType_15= ruleDoubleArrayType | this_StringArrayType_16= ruleStringArrayType | this_LongStringArrayType_17= ruleLongStringArrayType | this_DoubleStringArrayType_18= ruleDoubleStringArrayType | this_StateType_19= ruleStateType | this_ConstStringType_20= ruleConstStringType | this_BooleanArrayType_21= ruleBooleanArrayType | this_LongType_22= ruleLongType | this_ULongType_23= ruleULongType | this_UCharType_24= ruleUCharType | this_LongArrayType_25= ruleLongArrayType | this_ULongArrayType_26= ruleULongArrayType | this_DevIntType_27= ruleDevIntType | this_EncodedType_28= ruleEncodedType ) ;
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


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3274:6: ( (this_VoidType_0= ruleVoidType | this_BooleanType_1= ruleBooleanType | this_ShortType_2= ruleShortType | this_UShortType_3= ruleUShortType | this_IntType_4= ruleIntType | this_UIntType_5= ruleUIntType | this_FloatType_6= ruleFloatType | this_DoubleType_7= ruleDoubleType | this_StringType_8= ruleStringType | this_CharArrayType_9= ruleCharArrayType | this_ShortArrayType_10= ruleShortArrayType | this_UShortArrayType_11= ruleUShortArrayType | this_IntArrayType_12= ruleIntArrayType | this_UIntArrayType_13= ruleUIntArrayType | this_FloatArrayType_14= ruleFloatArrayType | this_DoubleArrayType_15= ruleDoubleArrayType | this_StringArrayType_16= ruleStringArrayType | this_LongStringArrayType_17= ruleLongStringArrayType | this_DoubleStringArrayType_18= ruleDoubleStringArrayType | this_StateType_19= ruleStateType | this_ConstStringType_20= ruleConstStringType | this_BooleanArrayType_21= ruleBooleanArrayType | this_LongType_22= ruleLongType | this_ULongType_23= ruleULongType | this_UCharType_24= ruleUCharType | this_LongArrayType_25= ruleLongArrayType | this_ULongArrayType_26= ruleULongArrayType | this_DevIntType_27= ruleDevIntType | this_EncodedType_28= ruleEncodedType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3275:1: (this_VoidType_0= ruleVoidType | this_BooleanType_1= ruleBooleanType | this_ShortType_2= ruleShortType | this_UShortType_3= ruleUShortType | this_IntType_4= ruleIntType | this_UIntType_5= ruleUIntType | this_FloatType_6= ruleFloatType | this_DoubleType_7= ruleDoubleType | this_StringType_8= ruleStringType | this_CharArrayType_9= ruleCharArrayType | this_ShortArrayType_10= ruleShortArrayType | this_UShortArrayType_11= ruleUShortArrayType | this_IntArrayType_12= ruleIntArrayType | this_UIntArrayType_13= ruleUIntArrayType | this_FloatArrayType_14= ruleFloatArrayType | this_DoubleArrayType_15= ruleDoubleArrayType | this_StringArrayType_16= ruleStringArrayType | this_LongStringArrayType_17= ruleLongStringArrayType | this_DoubleStringArrayType_18= ruleDoubleStringArrayType | this_StateType_19= ruleStateType | this_ConstStringType_20= ruleConstStringType | this_BooleanArrayType_21= ruleBooleanArrayType | this_LongType_22= ruleLongType | this_ULongType_23= ruleULongType | this_UCharType_24= ruleUCharType | this_LongArrayType_25= ruleLongArrayType | this_ULongArrayType_26= ruleULongArrayType | this_DevIntType_27= ruleDevIntType | this_EncodedType_28= ruleEncodedType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3275:1: (this_VoidType_0= ruleVoidType | this_BooleanType_1= ruleBooleanType | this_ShortType_2= ruleShortType | this_UShortType_3= ruleUShortType | this_IntType_4= ruleIntType | this_UIntType_5= ruleUIntType | this_FloatType_6= ruleFloatType | this_DoubleType_7= ruleDoubleType | this_StringType_8= ruleStringType | this_CharArrayType_9= ruleCharArrayType | this_ShortArrayType_10= ruleShortArrayType | this_UShortArrayType_11= ruleUShortArrayType | this_IntArrayType_12= ruleIntArrayType | this_UIntArrayType_13= ruleUIntArrayType | this_FloatArrayType_14= ruleFloatArrayType | this_DoubleArrayType_15= ruleDoubleArrayType | this_StringArrayType_16= ruleStringArrayType | this_LongStringArrayType_17= ruleLongStringArrayType | this_DoubleStringArrayType_18= ruleDoubleStringArrayType | this_StateType_19= ruleStateType | this_ConstStringType_20= ruleConstStringType | this_BooleanArrayType_21= ruleBooleanArrayType | this_LongType_22= ruleLongType | this_ULongType_23= ruleULongType | this_UCharType_24= ruleUCharType | this_LongArrayType_25= ruleLongArrayType | this_ULongArrayType_26= ruleULongArrayType | this_DevIntType_27= ruleDevIntType | this_EncodedType_28= ruleEncodedType )
            int alt23=29;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt23=1;
                }
                break;
            case 46:
                {
                alt23=2;
                }
                break;
            case 47:
                {
                alt23=3;
                }
                break;
            case 48:
                {
                alt23=4;
                }
                break;
            case 49:
                {
                alt23=5;
                }
                break;
            case 50:
                {
                alt23=6;
                }
                break;
            case 51:
                {
                alt23=7;
                }
                break;
            case 52:
                {
                alt23=8;
                }
                break;
            case 53:
                {
                alt23=9;
                }
                break;
            case 54:
                {
                alt23=10;
                }
                break;
            case 55:
                {
                alt23=11;
                }
                break;
            case 56:
                {
                alt23=12;
                }
                break;
            case 57:
                {
                alt23=13;
                }
                break;
            case 58:
                {
                alt23=14;
                }
                break;
            case 59:
                {
                alt23=15;
                }
                break;
            case 60:
                {
                alt23=16;
                }
                break;
            case 61:
                {
                alt23=17;
                }
                break;
            case 62:
                {
                alt23=18;
                }
                break;
            case 63:
                {
                alt23=19;
                }
                break;
            case 64:
                {
                alt23=20;
                }
                break;
            case 65:
                {
                alt23=21;
                }
                break;
            case 66:
                {
                alt23=22;
                }
                break;
            case 68:
                {
                alt23=23;
                }
                break;
            case 69:
                {
                alt23=24;
                }
                break;
            case 67:
                {
                alt23=25;
                }
                break;
            case 70:
                {
                alt23=26;
                }
                break;
            case 71:
                {
                alt23=27;
                }
                break;
            case 72:
                {
                alt23=28;
                }
                break;
            case 73:
                {
                alt23=29;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3275:1: (this_VoidType_0= ruleVoidType | this_BooleanType_1= ruleBooleanType | this_ShortType_2= ruleShortType | this_UShortType_3= ruleUShortType | this_IntType_4= ruleIntType | this_UIntType_5= ruleUIntType | this_FloatType_6= ruleFloatType | this_DoubleType_7= ruleDoubleType | this_StringType_8= ruleStringType | this_CharArrayType_9= ruleCharArrayType | this_ShortArrayType_10= ruleShortArrayType | this_UShortArrayType_11= ruleUShortArrayType | this_IntArrayType_12= ruleIntArrayType | this_UIntArrayType_13= ruleUIntArrayType | this_FloatArrayType_14= ruleFloatArrayType | this_DoubleArrayType_15= ruleDoubleArrayType | this_StringArrayType_16= ruleStringArrayType | this_LongStringArrayType_17= ruleLongStringArrayType | this_DoubleStringArrayType_18= ruleDoubleStringArrayType | this_StateType_19= ruleStateType | this_ConstStringType_20= ruleConstStringType | this_BooleanArrayType_21= ruleBooleanArrayType | this_LongType_22= ruleLongType | this_ULongType_23= ruleULongType | this_UCharType_24= ruleUCharType | this_LongArrayType_25= ruleLongArrayType | this_ULongArrayType_26= ruleULongArrayType | this_DevIntType_27= ruleDevIntType | this_EncodedType_28= ruleEncodedType )", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3276:5: this_VoidType_0= ruleVoidType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getVoidTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVoidType_in_ruleType6543);
                    this_VoidType_0=ruleVoidType();
                    _fsp--;

                     
                            current = this_VoidType_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3286:5: this_BooleanType_1= ruleBooleanType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getBooleanTypeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBooleanType_in_ruleType6570);
                    this_BooleanType_1=ruleBooleanType();
                    _fsp--;

                     
                            current = this_BooleanType_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3296:5: this_ShortType_2= ruleShortType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getShortTypeParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleShortType_in_ruleType6597);
                    this_ShortType_2=ruleShortType();
                    _fsp--;

                     
                            current = this_ShortType_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3306:5: this_UShortType_3= ruleUShortType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getUShortTypeParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUShortType_in_ruleType6624);
                    this_UShortType_3=ruleUShortType();
                    _fsp--;

                     
                            current = this_UShortType_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3316:5: this_IntType_4= ruleIntType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getIntTypeParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntType_in_ruleType6651);
                    this_IntType_4=ruleIntType();
                    _fsp--;

                     
                            current = this_IntType_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3326:5: this_UIntType_5= ruleUIntType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getUIntTypeParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUIntType_in_ruleType6678);
                    this_UIntType_5=ruleUIntType();
                    _fsp--;

                     
                            current = this_UIntType_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3336:5: this_FloatType_6= ruleFloatType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getFloatTypeParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFloatType_in_ruleType6705);
                    this_FloatType_6=ruleFloatType();
                    _fsp--;

                     
                            current = this_FloatType_6; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 8 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3346:5: this_DoubleType_7= ruleDoubleType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getDoubleTypeParserRuleCall_7(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDoubleType_in_ruleType6732);
                    this_DoubleType_7=ruleDoubleType();
                    _fsp--;

                     
                            current = this_DoubleType_7; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 9 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3356:5: this_StringType_8= ruleStringType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getStringTypeParserRuleCall_8(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringType_in_ruleType6759);
                    this_StringType_8=ruleStringType();
                    _fsp--;

                     
                            current = this_StringType_8; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 10 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3366:5: this_CharArrayType_9= ruleCharArrayType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getCharArrayTypeParserRuleCall_9(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCharArrayType_in_ruleType6786);
                    this_CharArrayType_9=ruleCharArrayType();
                    _fsp--;

                     
                            current = this_CharArrayType_9; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 11 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3376:5: this_ShortArrayType_10= ruleShortArrayType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getShortArrayTypeParserRuleCall_10(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleShortArrayType_in_ruleType6813);
                    this_ShortArrayType_10=ruleShortArrayType();
                    _fsp--;

                     
                            current = this_ShortArrayType_10; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 12 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3386:5: this_UShortArrayType_11= ruleUShortArrayType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getUShortArrayTypeParserRuleCall_11(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUShortArrayType_in_ruleType6840);
                    this_UShortArrayType_11=ruleUShortArrayType();
                    _fsp--;

                     
                            current = this_UShortArrayType_11; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 13 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3396:5: this_IntArrayType_12= ruleIntArrayType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getIntArrayTypeParserRuleCall_12(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntArrayType_in_ruleType6867);
                    this_IntArrayType_12=ruleIntArrayType();
                    _fsp--;

                     
                            current = this_IntArrayType_12; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 14 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3406:5: this_UIntArrayType_13= ruleUIntArrayType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getUIntArrayTypeParserRuleCall_13(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUIntArrayType_in_ruleType6894);
                    this_UIntArrayType_13=ruleUIntArrayType();
                    _fsp--;

                     
                            current = this_UIntArrayType_13; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 15 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3416:5: this_FloatArrayType_14= ruleFloatArrayType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getFloatArrayTypeParserRuleCall_14(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFloatArrayType_in_ruleType6921);
                    this_FloatArrayType_14=ruleFloatArrayType();
                    _fsp--;

                     
                            current = this_FloatArrayType_14; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 16 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3426:5: this_DoubleArrayType_15= ruleDoubleArrayType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getDoubleArrayTypeParserRuleCall_15(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDoubleArrayType_in_ruleType6948);
                    this_DoubleArrayType_15=ruleDoubleArrayType();
                    _fsp--;

                     
                            current = this_DoubleArrayType_15; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 17 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3436:5: this_StringArrayType_16= ruleStringArrayType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getStringArrayTypeParserRuleCall_16(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringArrayType_in_ruleType6975);
                    this_StringArrayType_16=ruleStringArrayType();
                    _fsp--;

                     
                            current = this_StringArrayType_16; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 18 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3446:5: this_LongStringArrayType_17= ruleLongStringArrayType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getLongStringArrayTypeParserRuleCall_17(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLongStringArrayType_in_ruleType7002);
                    this_LongStringArrayType_17=ruleLongStringArrayType();
                    _fsp--;

                     
                            current = this_LongStringArrayType_17; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 19 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3456:5: this_DoubleStringArrayType_18= ruleDoubleStringArrayType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getDoubleStringArrayTypeParserRuleCall_18(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDoubleStringArrayType_in_ruleType7029);
                    this_DoubleStringArrayType_18=ruleDoubleStringArrayType();
                    _fsp--;

                     
                            current = this_DoubleStringArrayType_18; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 20 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3466:5: this_StateType_19= ruleStateType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getStateTypeParserRuleCall_19(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStateType_in_ruleType7056);
                    this_StateType_19=ruleStateType();
                    _fsp--;

                     
                            current = this_StateType_19; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 21 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3476:5: this_ConstStringType_20= ruleConstStringType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getConstStringTypeParserRuleCall_20(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleConstStringType_in_ruleType7083);
                    this_ConstStringType_20=ruleConstStringType();
                    _fsp--;

                     
                            current = this_ConstStringType_20; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 22 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3486:5: this_BooleanArrayType_21= ruleBooleanArrayType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getBooleanArrayTypeParserRuleCall_21(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBooleanArrayType_in_ruleType7110);
                    this_BooleanArrayType_21=ruleBooleanArrayType();
                    _fsp--;

                     
                            current = this_BooleanArrayType_21; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 23 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3496:5: this_LongType_22= ruleLongType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getLongTypeParserRuleCall_22(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLongType_in_ruleType7137);
                    this_LongType_22=ruleLongType();
                    _fsp--;

                     
                            current = this_LongType_22; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 24 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3506:5: this_ULongType_23= ruleULongType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getULongTypeParserRuleCall_23(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleULongType_in_ruleType7164);
                    this_ULongType_23=ruleULongType();
                    _fsp--;

                     
                            current = this_ULongType_23; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 25 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3516:5: this_UCharType_24= ruleUCharType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getUCharTypeParserRuleCall_24(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUCharType_in_ruleType7191);
                    this_UCharType_24=ruleUCharType();
                    _fsp--;

                     
                            current = this_UCharType_24; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 26 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3526:5: this_LongArrayType_25= ruleLongArrayType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getLongArrayTypeParserRuleCall_25(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLongArrayType_in_ruleType7218);
                    this_LongArrayType_25=ruleLongArrayType();
                    _fsp--;

                     
                            current = this_LongArrayType_25; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 27 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3536:5: this_ULongArrayType_26= ruleULongArrayType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getULongArrayTypeParserRuleCall_26(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleULongArrayType_in_ruleType7245);
                    this_ULongArrayType_26=ruleULongArrayType();
                    _fsp--;

                     
                            current = this_ULongArrayType_26; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 28 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3546:5: this_DevIntType_27= ruleDevIntType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getDevIntTypeParserRuleCall_27(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDevIntType_in_ruleType7272);
                    this_DevIntType_27=ruleDevIntType();
                    _fsp--;

                     
                            current = this_DevIntType_27; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 29 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3556:5: this_EncodedType_28= ruleEncodedType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getEncodedTypeParserRuleCall_28(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEncodedType_in_ruleType7299);
                    this_EncodedType_28=ruleEncodedType();
                    _fsp--;

                     
                            current = this_EncodedType_28; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRuleVoidType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3571:1: entryRuleVoidType returns [EObject current=null] : iv_ruleVoidType= ruleVoidType EOF ;
    public final EObject entryRuleVoidType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoidType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3571:50: (iv_ruleVoidType= ruleVoidType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3572:2: iv_ruleVoidType= ruleVoidType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVoidTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleVoidType_in_entryRuleVoidType7331);
            iv_ruleVoidType=ruleVoidType();
            _fsp--;

             current =iv_ruleVoidType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVoidType7341); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVoidType


    // $ANTLR start ruleVoidType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3579:1: ruleVoidType returns [EObject current=null] : ( () 'void' ) ;
    public final EObject ruleVoidType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3584:6: ( ( () 'void' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3585:1: ( () 'void' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3585:1: ( () 'void' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3585:2: () 'void'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3585:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3586:5: 
            {
             
                    temp=factory.create(grammarAccess.getVoidTypeAccess().getVoidTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getVoidTypeAccess().getVoidTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,45,FOLLOW_45_in_ruleVoidType7384); 

                    createLeafNode(grammarAccess.getVoidTypeAccess().getVoidKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVoidType


    // $ANTLR start entryRuleBooleanType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3607:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3607:53: (iv_ruleBooleanType= ruleBooleanType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3608:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleBooleanType_in_entryRuleBooleanType7417);
            iv_ruleBooleanType=ruleBooleanType();
            _fsp--;

             current =iv_ruleBooleanType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanType7427); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBooleanType


    // $ANTLR start ruleBooleanType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3615:1: ruleBooleanType returns [EObject current=null] : ( () 'boolean' ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3620:6: ( ( () 'boolean' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3621:1: ( () 'boolean' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3621:1: ( () 'boolean' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3621:2: () 'boolean'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3621:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3622:5: 
            {
             
                    temp=factory.create(grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,46,FOLLOW_46_in_ruleBooleanType7470); 

                    createLeafNode(grammarAccess.getBooleanTypeAccess().getBooleanKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBooleanType


    // $ANTLR start entryRuleShortType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3643:1: entryRuleShortType returns [EObject current=null] : iv_ruleShortType= ruleShortType EOF ;
    public final EObject entryRuleShortType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3643:51: (iv_ruleShortType= ruleShortType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3644:2: iv_ruleShortType= ruleShortType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getShortTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleShortType_in_entryRuleShortType7503);
            iv_ruleShortType=ruleShortType();
            _fsp--;

             current =iv_ruleShortType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortType7513); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleShortType


    // $ANTLR start ruleShortType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3651:1: ruleShortType returns [EObject current=null] : ( () 'short' ) ;
    public final EObject ruleShortType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3656:6: ( ( () 'short' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3657:1: ( () 'short' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3657:1: ( () 'short' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3657:2: () 'short'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3657:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3658:5: 
            {
             
                    temp=factory.create(grammarAccess.getShortTypeAccess().getShortTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getShortTypeAccess().getShortTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,47,FOLLOW_47_in_ruleShortType7556); 

                    createLeafNode(grammarAccess.getShortTypeAccess().getShortKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleShortType


    // $ANTLR start entryRuleUShortType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3679:1: entryRuleUShortType returns [EObject current=null] : iv_ruleUShortType= ruleUShortType EOF ;
    public final EObject entryRuleUShortType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUShortType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3679:52: (iv_ruleUShortType= ruleUShortType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3680:2: iv_ruleUShortType= ruleUShortType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUShortTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleUShortType_in_entryRuleUShortType7589);
            iv_ruleUShortType=ruleUShortType();
            _fsp--;

             current =iv_ruleUShortType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUShortType7599); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUShortType


    // $ANTLR start ruleUShortType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3687:1: ruleUShortType returns [EObject current=null] : ( () 'ushort' ) ;
    public final EObject ruleUShortType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3692:6: ( ( () 'ushort' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3693:1: ( () 'ushort' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3693:1: ( () 'ushort' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3693:2: () 'ushort'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3693:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3694:5: 
            {
             
                    temp=factory.create(grammarAccess.getUShortTypeAccess().getUShortTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getUShortTypeAccess().getUShortTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,48,FOLLOW_48_in_ruleUShortType7642); 

                    createLeafNode(grammarAccess.getUShortTypeAccess().getUshortKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUShortType


    // $ANTLR start entryRuleIntType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3715:1: entryRuleIntType returns [EObject current=null] : iv_ruleIntType= ruleIntType EOF ;
    public final EObject entryRuleIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3715:49: (iv_ruleIntType= ruleIntType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3716:2: iv_ruleIntType= ruleIntType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntType_in_entryRuleIntType7675);
            iv_ruleIntType=ruleIntType();
            _fsp--;

             current =iv_ruleIntType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntType7685); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIntType


    // $ANTLR start ruleIntType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3723:1: ruleIntType returns [EObject current=null] : ( () 'int' ) ;
    public final EObject ruleIntType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3728:6: ( ( () 'int' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3729:1: ( () 'int' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3729:1: ( () 'int' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3729:2: () 'int'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3729:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3730:5: 
            {
             
                    temp=factory.create(grammarAccess.getIntTypeAccess().getIntTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getIntTypeAccess().getIntTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,49,FOLLOW_49_in_ruleIntType7728); 

                    createLeafNode(grammarAccess.getIntTypeAccess().getIntKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIntType


    // $ANTLR start entryRuleUIntType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3751:1: entryRuleUIntType returns [EObject current=null] : iv_ruleUIntType= ruleUIntType EOF ;
    public final EObject entryRuleUIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIntType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3751:50: (iv_ruleUIntType= ruleUIntType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3752:2: iv_ruleUIntType= ruleUIntType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUIntTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleUIntType_in_entryRuleUIntType7761);
            iv_ruleUIntType=ruleUIntType();
            _fsp--;

             current =iv_ruleUIntType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIntType7771); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUIntType


    // $ANTLR start ruleUIntType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3759:1: ruleUIntType returns [EObject current=null] : ( () 'uint' ) ;
    public final EObject ruleUIntType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3764:6: ( ( () 'uint' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3765:1: ( () 'uint' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3765:1: ( () 'uint' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3765:2: () 'uint'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3765:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3766:5: 
            {
             
                    temp=factory.create(grammarAccess.getUIntTypeAccess().getUIntTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getUIntTypeAccess().getUIntTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,50,FOLLOW_50_in_ruleUIntType7814); 

                    createLeafNode(grammarAccess.getUIntTypeAccess().getUintKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUIntType


    // $ANTLR start entryRuleFloatType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3787:1: entryRuleFloatType returns [EObject current=null] : iv_ruleFloatType= ruleFloatType EOF ;
    public final EObject entryRuleFloatType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3787:51: (iv_ruleFloatType= ruleFloatType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3788:2: iv_ruleFloatType= ruleFloatType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFloatTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleFloatType_in_entryRuleFloatType7847);
            iv_ruleFloatType=ruleFloatType();
            _fsp--;

             current =iv_ruleFloatType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatType7857); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFloatType


    // $ANTLR start ruleFloatType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3795:1: ruleFloatType returns [EObject current=null] : ( () 'float' ) ;
    public final EObject ruleFloatType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3800:6: ( ( () 'float' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3801:1: ( () 'float' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3801:1: ( () 'float' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3801:2: () 'float'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3801:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3802:5: 
            {
             
                    temp=factory.create(grammarAccess.getFloatTypeAccess().getFloatTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getFloatTypeAccess().getFloatTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,51,FOLLOW_51_in_ruleFloatType7900); 

                    createLeafNode(grammarAccess.getFloatTypeAccess().getFloatKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFloatType


    // $ANTLR start entryRuleDoubleType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3823:1: entryRuleDoubleType returns [EObject current=null] : iv_ruleDoubleType= ruleDoubleType EOF ;
    public final EObject entryRuleDoubleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3823:52: (iv_ruleDoubleType= ruleDoubleType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3824:2: iv_ruleDoubleType= ruleDoubleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDoubleTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleDoubleType_in_entryRuleDoubleType7933);
            iv_ruleDoubleType=ruleDoubleType();
            _fsp--;

             current =iv_ruleDoubleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleType7943); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDoubleType


    // $ANTLR start ruleDoubleType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3831:1: ruleDoubleType returns [EObject current=null] : ( () 'double' ) ;
    public final EObject ruleDoubleType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3836:6: ( ( () 'double' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3837:1: ( () 'double' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3837:1: ( () 'double' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3837:2: () 'double'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3837:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3838:5: 
            {
             
                    temp=factory.create(grammarAccess.getDoubleTypeAccess().getDoubleTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getDoubleTypeAccess().getDoubleTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,52,FOLLOW_52_in_ruleDoubleType7986); 

                    createLeafNode(grammarAccess.getDoubleTypeAccess().getDoubleKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDoubleType


    // $ANTLR start entryRuleStringType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3859:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3859:52: (iv_ruleStringType= ruleStringType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3860:2: iv_ruleStringType= ruleStringType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType8019);
            iv_ruleStringType=ruleStringType();
            _fsp--;

             current =iv_ruleStringType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType8029); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStringType


    // $ANTLR start ruleStringType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3867:1: ruleStringType returns [EObject current=null] : ( () 'string' ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3872:6: ( ( () 'string' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3873:1: ( () 'string' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3873:1: ( () 'string' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3873:2: () 'string'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3873:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3874:5: 
            {
             
                    temp=factory.create(grammarAccess.getStringTypeAccess().getStringTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getStringTypeAccess().getStringTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,53,FOLLOW_53_in_ruleStringType8072); 

                    createLeafNode(grammarAccess.getStringTypeAccess().getStringKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStringType


    // $ANTLR start entryRuleCharArrayType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3895:1: entryRuleCharArrayType returns [EObject current=null] : iv_ruleCharArrayType= ruleCharArrayType EOF ;
    public final EObject entryRuleCharArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3895:55: (iv_ruleCharArrayType= ruleCharArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3896:2: iv_ruleCharArrayType= ruleCharArrayType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCharArrayTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleCharArrayType_in_entryRuleCharArrayType8105);
            iv_ruleCharArrayType=ruleCharArrayType();
            _fsp--;

             current =iv_ruleCharArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharArrayType8115); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCharArrayType


    // $ANTLR start ruleCharArrayType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3903:1: ruleCharArrayType returns [EObject current=null] : ( () 'DevVarCharArray' ) ;
    public final EObject ruleCharArrayType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3908:6: ( ( () 'DevVarCharArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3909:1: ( () 'DevVarCharArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3909:1: ( () 'DevVarCharArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3909:2: () 'DevVarCharArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3909:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3910:5: 
            {
             
                    temp=factory.create(grammarAccess.getCharArrayTypeAccess().getCharArrayTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getCharArrayTypeAccess().getCharArrayTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,54,FOLLOW_54_in_ruleCharArrayType8158); 

                    createLeafNode(grammarAccess.getCharArrayTypeAccess().getDevVarCharArrayKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCharArrayType


    // $ANTLR start entryRuleShortArrayType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3931:1: entryRuleShortArrayType returns [EObject current=null] : iv_ruleShortArrayType= ruleShortArrayType EOF ;
    public final EObject entryRuleShortArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3931:56: (iv_ruleShortArrayType= ruleShortArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3932:2: iv_ruleShortArrayType= ruleShortArrayType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getShortArrayTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleShortArrayType_in_entryRuleShortArrayType8191);
            iv_ruleShortArrayType=ruleShortArrayType();
            _fsp--;

             current =iv_ruleShortArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortArrayType8201); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleShortArrayType


    // $ANTLR start ruleShortArrayType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3939:1: ruleShortArrayType returns [EObject current=null] : ( () 'DevVarShortArray' ) ;
    public final EObject ruleShortArrayType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3944:6: ( ( () 'DevVarShortArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3945:1: ( () 'DevVarShortArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3945:1: ( () 'DevVarShortArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3945:2: () 'DevVarShortArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3945:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3946:5: 
            {
             
                    temp=factory.create(grammarAccess.getShortArrayTypeAccess().getShortArrayTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getShortArrayTypeAccess().getShortArrayTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,55,FOLLOW_55_in_ruleShortArrayType8244); 

                    createLeafNode(grammarAccess.getShortArrayTypeAccess().getDevVarShortArrayKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleShortArrayType


    // $ANTLR start entryRuleUShortArrayType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3967:1: entryRuleUShortArrayType returns [EObject current=null] : iv_ruleUShortArrayType= ruleUShortArrayType EOF ;
    public final EObject entryRuleUShortArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUShortArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3967:57: (iv_ruleUShortArrayType= ruleUShortArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3968:2: iv_ruleUShortArrayType= ruleUShortArrayType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUShortArrayTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleUShortArrayType_in_entryRuleUShortArrayType8277);
            iv_ruleUShortArrayType=ruleUShortArrayType();
            _fsp--;

             current =iv_ruleUShortArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUShortArrayType8287); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUShortArrayType


    // $ANTLR start ruleUShortArrayType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3975:1: ruleUShortArrayType returns [EObject current=null] : ( () 'DevVarUShortArray' ) ;
    public final EObject ruleUShortArrayType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3980:6: ( ( () 'DevVarUShortArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3981:1: ( () 'DevVarUShortArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3981:1: ( () 'DevVarUShortArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3981:2: () 'DevVarUShortArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3981:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3982:5: 
            {
             
                    temp=factory.create(grammarAccess.getUShortArrayTypeAccess().getUShortArrayTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getUShortArrayTypeAccess().getUShortArrayTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,56,FOLLOW_56_in_ruleUShortArrayType8330); 

                    createLeafNode(grammarAccess.getUShortArrayTypeAccess().getDevVarUShortArrayKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUShortArrayType


    // $ANTLR start entryRuleIntArrayType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4003:1: entryRuleIntArrayType returns [EObject current=null] : iv_ruleIntArrayType= ruleIntArrayType EOF ;
    public final EObject entryRuleIntArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4003:54: (iv_ruleIntArrayType= ruleIntArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4004:2: iv_ruleIntArrayType= ruleIntArrayType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntArrayTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntArrayType_in_entryRuleIntArrayType8363);
            iv_ruleIntArrayType=ruleIntArrayType();
            _fsp--;

             current =iv_ruleIntArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntArrayType8373); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIntArrayType


    // $ANTLR start ruleIntArrayType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4011:1: ruleIntArrayType returns [EObject current=null] : ( () 'DevVarLongArray' ) ;
    public final EObject ruleIntArrayType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4016:6: ( ( () 'DevVarLongArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4017:1: ( () 'DevVarLongArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4017:1: ( () 'DevVarLongArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4017:2: () 'DevVarLongArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4017:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4018:5: 
            {
             
                    temp=factory.create(grammarAccess.getIntArrayTypeAccess().getIntArrayTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getIntArrayTypeAccess().getIntArrayTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,57,FOLLOW_57_in_ruleIntArrayType8416); 

                    createLeafNode(grammarAccess.getIntArrayTypeAccess().getDevVarLongArrayKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIntArrayType


    // $ANTLR start entryRuleUIntArrayType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4039:1: entryRuleUIntArrayType returns [EObject current=null] : iv_ruleUIntArrayType= ruleUIntArrayType EOF ;
    public final EObject entryRuleUIntArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIntArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4039:55: (iv_ruleUIntArrayType= ruleUIntArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4040:2: iv_ruleUIntArrayType= ruleUIntArrayType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUIntArrayTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleUIntArrayType_in_entryRuleUIntArrayType8449);
            iv_ruleUIntArrayType=ruleUIntArrayType();
            _fsp--;

             current =iv_ruleUIntArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIntArrayType8459); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUIntArrayType


    // $ANTLR start ruleUIntArrayType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4047:1: ruleUIntArrayType returns [EObject current=null] : ( () 'DevVarULongArray' ) ;
    public final EObject ruleUIntArrayType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4052:6: ( ( () 'DevVarULongArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4053:1: ( () 'DevVarULongArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4053:1: ( () 'DevVarULongArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4053:2: () 'DevVarULongArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4053:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4054:5: 
            {
             
                    temp=factory.create(grammarAccess.getUIntArrayTypeAccess().getUIntArrayTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getUIntArrayTypeAccess().getUIntArrayTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,58,FOLLOW_58_in_ruleUIntArrayType8502); 

                    createLeafNode(grammarAccess.getUIntArrayTypeAccess().getDevVarULongArrayKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUIntArrayType


    // $ANTLR start entryRuleFloatArrayType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4075:1: entryRuleFloatArrayType returns [EObject current=null] : iv_ruleFloatArrayType= ruleFloatArrayType EOF ;
    public final EObject entryRuleFloatArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4075:56: (iv_ruleFloatArrayType= ruleFloatArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4076:2: iv_ruleFloatArrayType= ruleFloatArrayType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFloatArrayTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleFloatArrayType_in_entryRuleFloatArrayType8535);
            iv_ruleFloatArrayType=ruleFloatArrayType();
            _fsp--;

             current =iv_ruleFloatArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatArrayType8545); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFloatArrayType


    // $ANTLR start ruleFloatArrayType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4083:1: ruleFloatArrayType returns [EObject current=null] : ( () 'DevVarFloatArray' ) ;
    public final EObject ruleFloatArrayType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4088:6: ( ( () 'DevVarFloatArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4089:1: ( () 'DevVarFloatArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4089:1: ( () 'DevVarFloatArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4089:2: () 'DevVarFloatArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4089:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4090:5: 
            {
             
                    temp=factory.create(grammarAccess.getFloatArrayTypeAccess().getFloatArrayTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getFloatArrayTypeAccess().getFloatArrayTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,59,FOLLOW_59_in_ruleFloatArrayType8588); 

                    createLeafNode(grammarAccess.getFloatArrayTypeAccess().getDevVarFloatArrayKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFloatArrayType


    // $ANTLR start entryRuleDoubleArrayType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4111:1: entryRuleDoubleArrayType returns [EObject current=null] : iv_ruleDoubleArrayType= ruleDoubleArrayType EOF ;
    public final EObject entryRuleDoubleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4111:57: (iv_ruleDoubleArrayType= ruleDoubleArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4112:2: iv_ruleDoubleArrayType= ruleDoubleArrayType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDoubleArrayTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleDoubleArrayType_in_entryRuleDoubleArrayType8621);
            iv_ruleDoubleArrayType=ruleDoubleArrayType();
            _fsp--;

             current =iv_ruleDoubleArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleArrayType8631); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDoubleArrayType


    // $ANTLR start ruleDoubleArrayType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4119:1: ruleDoubleArrayType returns [EObject current=null] : ( () 'DevVarDoubleArray' ) ;
    public final EObject ruleDoubleArrayType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4124:6: ( ( () 'DevVarDoubleArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4125:1: ( () 'DevVarDoubleArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4125:1: ( () 'DevVarDoubleArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4125:2: () 'DevVarDoubleArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4125:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4126:5: 
            {
             
                    temp=factory.create(grammarAccess.getDoubleArrayTypeAccess().getDoubleArrayTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getDoubleArrayTypeAccess().getDoubleArrayTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,60,FOLLOW_60_in_ruleDoubleArrayType8674); 

                    createLeafNode(grammarAccess.getDoubleArrayTypeAccess().getDevVarDoubleArrayKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDoubleArrayType


    // $ANTLR start entryRuleStringArrayType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4147:1: entryRuleStringArrayType returns [EObject current=null] : iv_ruleStringArrayType= ruleStringArrayType EOF ;
    public final EObject entryRuleStringArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4147:57: (iv_ruleStringArrayType= ruleStringArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4148:2: iv_ruleStringArrayType= ruleStringArrayType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringArrayTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringArrayType_in_entryRuleStringArrayType8707);
            iv_ruleStringArrayType=ruleStringArrayType();
            _fsp--;

             current =iv_ruleStringArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringArrayType8717); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStringArrayType


    // $ANTLR start ruleStringArrayType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4155:1: ruleStringArrayType returns [EObject current=null] : ( () 'DevVarStringArray' ) ;
    public final EObject ruleStringArrayType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4160:6: ( ( () 'DevVarStringArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4161:1: ( () 'DevVarStringArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4161:1: ( () 'DevVarStringArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4161:2: () 'DevVarStringArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4161:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4162:5: 
            {
             
                    temp=factory.create(grammarAccess.getStringArrayTypeAccess().getStringArrayTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getStringArrayTypeAccess().getStringArrayTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,61,FOLLOW_61_in_ruleStringArrayType8760); 

                    createLeafNode(grammarAccess.getStringArrayTypeAccess().getDevVarStringArrayKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStringArrayType


    // $ANTLR start entryRuleLongStringArrayType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4183:1: entryRuleLongStringArrayType returns [EObject current=null] : iv_ruleLongStringArrayType= ruleLongStringArrayType EOF ;
    public final EObject entryRuleLongStringArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongStringArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4183:61: (iv_ruleLongStringArrayType= ruleLongStringArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4184:2: iv_ruleLongStringArrayType= ruleLongStringArrayType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLongStringArrayTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleLongStringArrayType_in_entryRuleLongStringArrayType8793);
            iv_ruleLongStringArrayType=ruleLongStringArrayType();
            _fsp--;

             current =iv_ruleLongStringArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongStringArrayType8803); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLongStringArrayType


    // $ANTLR start ruleLongStringArrayType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4191:1: ruleLongStringArrayType returns [EObject current=null] : ( () 'DevVarLongStringArray' ) ;
    public final EObject ruleLongStringArrayType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4196:6: ( ( () 'DevVarLongStringArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4197:1: ( () 'DevVarLongStringArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4197:1: ( () 'DevVarLongStringArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4197:2: () 'DevVarLongStringArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4197:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4198:5: 
            {
             
                    temp=factory.create(grammarAccess.getLongStringArrayTypeAccess().getLongStringArrayTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getLongStringArrayTypeAccess().getLongStringArrayTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,62,FOLLOW_62_in_ruleLongStringArrayType8846); 

                    createLeafNode(grammarAccess.getLongStringArrayTypeAccess().getDevVarLongStringArrayKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLongStringArrayType


    // $ANTLR start entryRuleDoubleStringArrayType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4219:1: entryRuleDoubleStringArrayType returns [EObject current=null] : iv_ruleDoubleStringArrayType= ruleDoubleStringArrayType EOF ;
    public final EObject entryRuleDoubleStringArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleStringArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4219:63: (iv_ruleDoubleStringArrayType= ruleDoubleStringArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4220:2: iv_ruleDoubleStringArrayType= ruleDoubleStringArrayType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDoubleStringArrayTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleDoubleStringArrayType_in_entryRuleDoubleStringArrayType8879);
            iv_ruleDoubleStringArrayType=ruleDoubleStringArrayType();
            _fsp--;

             current =iv_ruleDoubleStringArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleStringArrayType8889); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDoubleStringArrayType


    // $ANTLR start ruleDoubleStringArrayType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4227:1: ruleDoubleStringArrayType returns [EObject current=null] : ( () 'DevVarDoubleStringArray' ) ;
    public final EObject ruleDoubleStringArrayType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4232:6: ( ( () 'DevVarDoubleStringArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4233:1: ( () 'DevVarDoubleStringArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4233:1: ( () 'DevVarDoubleStringArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4233:2: () 'DevVarDoubleStringArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4233:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4234:5: 
            {
             
                    temp=factory.create(grammarAccess.getDoubleStringArrayTypeAccess().getDoubleStringArrayTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getDoubleStringArrayTypeAccess().getDoubleStringArrayTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,63,FOLLOW_63_in_ruleDoubleStringArrayType8932); 

                    createLeafNode(grammarAccess.getDoubleStringArrayTypeAccess().getDevVarDoubleStringArrayKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDoubleStringArrayType


    // $ANTLR start entryRuleStateType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4255:1: entryRuleStateType returns [EObject current=null] : iv_ruleStateType= ruleStateType EOF ;
    public final EObject entryRuleStateType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4255:51: (iv_ruleStateType= ruleStateType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4256:2: iv_ruleStateType= ruleStateType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStateTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleStateType_in_entryRuleStateType8965);
            iv_ruleStateType=ruleStateType();
            _fsp--;

             current =iv_ruleStateType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateType8975); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStateType


    // $ANTLR start ruleStateType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4263:1: ruleStateType returns [EObject current=null] : ( () 'DevState' ) ;
    public final EObject ruleStateType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4268:6: ( ( () 'DevState' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4269:1: ( () 'DevState' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4269:1: ( () 'DevState' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4269:2: () 'DevState'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4269:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4270:5: 
            {
             
                    temp=factory.create(grammarAccess.getStateTypeAccess().getStateTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getStateTypeAccess().getStateTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,64,FOLLOW_64_in_ruleStateType9018); 

                    createLeafNode(grammarAccess.getStateTypeAccess().getDevStateKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStateType


    // $ANTLR start entryRuleConstStringType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4291:1: entryRuleConstStringType returns [EObject current=null] : iv_ruleConstStringType= ruleConstStringType EOF ;
    public final EObject entryRuleConstStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstStringType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4291:57: (iv_ruleConstStringType= ruleConstStringType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4292:2: iv_ruleConstStringType= ruleConstStringType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstStringTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstStringType_in_entryRuleConstStringType9051);
            iv_ruleConstStringType=ruleConstStringType();
            _fsp--;

             current =iv_ruleConstStringType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstStringType9061); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConstStringType


    // $ANTLR start ruleConstStringType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4299:1: ruleConstStringType returns [EObject current=null] : ( () 'ConstDevString' ) ;
    public final EObject ruleConstStringType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4304:6: ( ( () 'ConstDevString' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4305:1: ( () 'ConstDevString' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4305:1: ( () 'ConstDevString' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4305:2: () 'ConstDevString'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4305:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4306:5: 
            {
             
                    temp=factory.create(grammarAccess.getConstStringTypeAccess().getConstStringTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getConstStringTypeAccess().getConstStringTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,65,FOLLOW_65_in_ruleConstStringType9104); 

                    createLeafNode(grammarAccess.getConstStringTypeAccess().getConstDevStringKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleConstStringType


    // $ANTLR start entryRuleBooleanArrayType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4327:1: entryRuleBooleanArrayType returns [EObject current=null] : iv_ruleBooleanArrayType= ruleBooleanArrayType EOF ;
    public final EObject entryRuleBooleanArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4327:58: (iv_ruleBooleanArrayType= ruleBooleanArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4328:2: iv_ruleBooleanArrayType= ruleBooleanArrayType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanArrayTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleBooleanArrayType_in_entryRuleBooleanArrayType9137);
            iv_ruleBooleanArrayType=ruleBooleanArrayType();
            _fsp--;

             current =iv_ruleBooleanArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanArrayType9147); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBooleanArrayType


    // $ANTLR start ruleBooleanArrayType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4335:1: ruleBooleanArrayType returns [EObject current=null] : ( () 'DevVarBooleanArray' ) ;
    public final EObject ruleBooleanArrayType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4340:6: ( ( () 'DevVarBooleanArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4341:1: ( () 'DevVarBooleanArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4341:1: ( () 'DevVarBooleanArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4341:2: () 'DevVarBooleanArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4341:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4342:5: 
            {
             
                    temp=factory.create(grammarAccess.getBooleanArrayTypeAccess().getBooleanArrayTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getBooleanArrayTypeAccess().getBooleanArrayTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,66,FOLLOW_66_in_ruleBooleanArrayType9190); 

                    createLeafNode(grammarAccess.getBooleanArrayTypeAccess().getDevVarBooleanArrayKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBooleanArrayType


    // $ANTLR start entryRuleUCharType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4363:1: entryRuleUCharType returns [EObject current=null] : iv_ruleUCharType= ruleUCharType EOF ;
    public final EObject entryRuleUCharType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUCharType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4363:51: (iv_ruleUCharType= ruleUCharType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4364:2: iv_ruleUCharType= ruleUCharType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUCharTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleUCharType_in_entryRuleUCharType9223);
            iv_ruleUCharType=ruleUCharType();
            _fsp--;

             current =iv_ruleUCharType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUCharType9233); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUCharType


    // $ANTLR start ruleUCharType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4371:1: ruleUCharType returns [EObject current=null] : ( () 'DevUChar' ) ;
    public final EObject ruleUCharType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4376:6: ( ( () 'DevUChar' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4377:1: ( () 'DevUChar' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4377:1: ( () 'DevUChar' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4377:2: () 'DevUChar'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4377:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4378:5: 
            {
             
                    temp=factory.create(grammarAccess.getUCharTypeAccess().getUCharTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getUCharTypeAccess().getUCharTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,67,FOLLOW_67_in_ruleUCharType9276); 

                    createLeafNode(grammarAccess.getUCharTypeAccess().getDevUCharKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUCharType


    // $ANTLR start entryRuleLongType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4399:1: entryRuleLongType returns [EObject current=null] : iv_ruleLongType= ruleLongType EOF ;
    public final EObject entryRuleLongType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4399:50: (iv_ruleLongType= ruleLongType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4400:2: iv_ruleLongType= ruleLongType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLongTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleLongType_in_entryRuleLongType9309);
            iv_ruleLongType=ruleLongType();
            _fsp--;

             current =iv_ruleLongType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongType9319); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLongType


    // $ANTLR start ruleLongType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4407:1: ruleLongType returns [EObject current=null] : ( () 'DevLong64' ) ;
    public final EObject ruleLongType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4412:6: ( ( () 'DevLong64' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4413:1: ( () 'DevLong64' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4413:1: ( () 'DevLong64' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4413:2: () 'DevLong64'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4413:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4414:5: 
            {
             
                    temp=factory.create(grammarAccess.getLongTypeAccess().getLongTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getLongTypeAccess().getLongTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,68,FOLLOW_68_in_ruleLongType9362); 

                    createLeafNode(grammarAccess.getLongTypeAccess().getDevLong64Keyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLongType


    // $ANTLR start entryRuleULongType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4435:1: entryRuleULongType returns [EObject current=null] : iv_ruleULongType= ruleULongType EOF ;
    public final EObject entryRuleULongType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleULongType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4435:51: (iv_ruleULongType= ruleULongType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4436:2: iv_ruleULongType= ruleULongType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getULongTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleULongType_in_entryRuleULongType9395);
            iv_ruleULongType=ruleULongType();
            _fsp--;

             current =iv_ruleULongType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleULongType9405); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleULongType


    // $ANTLR start ruleULongType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4443:1: ruleULongType returns [EObject current=null] : ( () 'DevULong64' ) ;
    public final EObject ruleULongType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4448:6: ( ( () 'DevULong64' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4449:1: ( () 'DevULong64' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4449:1: ( () 'DevULong64' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4449:2: () 'DevULong64'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4449:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4450:5: 
            {
             
                    temp=factory.create(grammarAccess.getULongTypeAccess().getULongTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getULongTypeAccess().getULongTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,69,FOLLOW_69_in_ruleULongType9448); 

                    createLeafNode(grammarAccess.getULongTypeAccess().getDevULong64Keyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleULongType


    // $ANTLR start entryRuleLongArrayType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4471:1: entryRuleLongArrayType returns [EObject current=null] : iv_ruleLongArrayType= ruleLongArrayType EOF ;
    public final EObject entryRuleLongArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4471:55: (iv_ruleLongArrayType= ruleLongArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4472:2: iv_ruleLongArrayType= ruleLongArrayType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLongArrayTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleLongArrayType_in_entryRuleLongArrayType9481);
            iv_ruleLongArrayType=ruleLongArrayType();
            _fsp--;

             current =iv_ruleLongArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongArrayType9491); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLongArrayType


    // $ANTLR start ruleLongArrayType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4479:1: ruleLongArrayType returns [EObject current=null] : ( () 'DevVarLong64Array' ) ;
    public final EObject ruleLongArrayType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4484:6: ( ( () 'DevVarLong64Array' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4485:1: ( () 'DevVarLong64Array' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4485:1: ( () 'DevVarLong64Array' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4485:2: () 'DevVarLong64Array'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4485:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4486:5: 
            {
             
                    temp=factory.create(grammarAccess.getLongArrayTypeAccess().getLongArrayTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getLongArrayTypeAccess().getLongArrayTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,70,FOLLOW_70_in_ruleLongArrayType9534); 

                    createLeafNode(grammarAccess.getLongArrayTypeAccess().getDevVarLong64ArrayKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLongArrayType


    // $ANTLR start entryRuleULongArrayType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4507:1: entryRuleULongArrayType returns [EObject current=null] : iv_ruleULongArrayType= ruleULongArrayType EOF ;
    public final EObject entryRuleULongArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleULongArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4507:56: (iv_ruleULongArrayType= ruleULongArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4508:2: iv_ruleULongArrayType= ruleULongArrayType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getULongArrayTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleULongArrayType_in_entryRuleULongArrayType9567);
            iv_ruleULongArrayType=ruleULongArrayType();
            _fsp--;

             current =iv_ruleULongArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleULongArrayType9577); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleULongArrayType


    // $ANTLR start ruleULongArrayType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4515:1: ruleULongArrayType returns [EObject current=null] : ( () 'DevVarULong64Array' ) ;
    public final EObject ruleULongArrayType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4520:6: ( ( () 'DevVarULong64Array' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4521:1: ( () 'DevVarULong64Array' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4521:1: ( () 'DevVarULong64Array' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4521:2: () 'DevVarULong64Array'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4521:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4522:5: 
            {
             
                    temp=factory.create(grammarAccess.getULongArrayTypeAccess().getULongArrayTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getULongArrayTypeAccess().getULongArrayTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,71,FOLLOW_71_in_ruleULongArrayType9620); 

                    createLeafNode(grammarAccess.getULongArrayTypeAccess().getDevVarULong64ArrayKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleULongArrayType


    // $ANTLR start entryRuleDevIntType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4543:1: entryRuleDevIntType returns [EObject current=null] : iv_ruleDevIntType= ruleDevIntType EOF ;
    public final EObject entryRuleDevIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevIntType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4543:52: (iv_ruleDevIntType= ruleDevIntType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4544:2: iv_ruleDevIntType= ruleDevIntType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDevIntTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleDevIntType_in_entryRuleDevIntType9653);
            iv_ruleDevIntType=ruleDevIntType();
            _fsp--;

             current =iv_ruleDevIntType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDevIntType9663); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDevIntType


    // $ANTLR start ruleDevIntType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4551:1: ruleDevIntType returns [EObject current=null] : ( () 'DevInt' ) ;
    public final EObject ruleDevIntType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4556:6: ( ( () 'DevInt' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4557:1: ( () 'DevInt' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4557:1: ( () 'DevInt' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4557:2: () 'DevInt'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4557:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4558:5: 
            {
             
                    temp=factory.create(grammarAccess.getDevIntTypeAccess().getDevIntTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getDevIntTypeAccess().getDevIntTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,72,FOLLOW_72_in_ruleDevIntType9706); 

                    createLeafNode(grammarAccess.getDevIntTypeAccess().getDevIntKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDevIntType


    // $ANTLR start entryRuleEncodedType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4579:1: entryRuleEncodedType returns [EObject current=null] : iv_ruleEncodedType= ruleEncodedType EOF ;
    public final EObject entryRuleEncodedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEncodedType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4579:53: (iv_ruleEncodedType= ruleEncodedType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4580:2: iv_ruleEncodedType= ruleEncodedType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEncodedTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleEncodedType_in_entryRuleEncodedType9739);
            iv_ruleEncodedType=ruleEncodedType();
            _fsp--;

             current =iv_ruleEncodedType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEncodedType9749); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEncodedType


    // $ANTLR start ruleEncodedType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4587:1: ruleEncodedType returns [EObject current=null] : ( () 'DevEncoded' ) ;
    public final EObject ruleEncodedType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4592:6: ( ( () 'DevEncoded' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4593:1: ( () 'DevEncoded' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4593:1: ( () 'DevEncoded' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4593:2: () 'DevEncoded'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4593:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4594:5: 
            {
             
                    temp=factory.create(grammarAccess.getEncodedTypeAccess().getEncodedTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getEncodedTypeAccess().getEncodedTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,73,FOLLOW_73_in_ruleEncodedType9792); 

                    createLeafNode(grammarAccess.getEncodedTypeAccess().getDevEncodedKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEncodedType


    // $ANTLR start entryRuleShortVectorType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4615:1: entryRuleShortVectorType returns [EObject current=null] : iv_ruleShortVectorType= ruleShortVectorType EOF ;
    public final EObject entryRuleShortVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4615:57: (iv_ruleShortVectorType= ruleShortVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4616:2: iv_ruleShortVectorType= ruleShortVectorType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getShortVectorTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleShortVectorType_in_entryRuleShortVectorType9825);
            iv_ruleShortVectorType=ruleShortVectorType();
            _fsp--;

             current =iv_ruleShortVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortVectorType9835); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleShortVectorType


    // $ANTLR start ruleShortVectorType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4623:1: ruleShortVectorType returns [EObject current=null] : ( () 'vector<short>' ) ;
    public final EObject ruleShortVectorType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4628:6: ( ( () 'vector<short>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4629:1: ( () 'vector<short>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4629:1: ( () 'vector<short>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4629:2: () 'vector<short>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4629:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4630:5: 
            {
             
                    temp=factory.create(grammarAccess.getShortVectorTypeAccess().getShortVectorTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getShortVectorTypeAccess().getShortVectorTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,74,FOLLOW_74_in_ruleShortVectorType9878); 

                    createLeafNode(grammarAccess.getShortVectorTypeAccess().getVectorShortKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleShortVectorType


    // $ANTLR start entryRuleIntVectorType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4651:1: entryRuleIntVectorType returns [EObject current=null] : iv_ruleIntVectorType= ruleIntVectorType EOF ;
    public final EObject entryRuleIntVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4651:55: (iv_ruleIntVectorType= ruleIntVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4652:2: iv_ruleIntVectorType= ruleIntVectorType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntVectorTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntVectorType_in_entryRuleIntVectorType9911);
            iv_ruleIntVectorType=ruleIntVectorType();
            _fsp--;

             current =iv_ruleIntVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntVectorType9921); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIntVectorType


    // $ANTLR start ruleIntVectorType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4659:1: ruleIntVectorType returns [EObject current=null] : ( () 'vector<int>' ) ;
    public final EObject ruleIntVectorType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4664:6: ( ( () 'vector<int>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4665:1: ( () 'vector<int>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4665:1: ( () 'vector<int>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4665:2: () 'vector<int>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4665:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4666:5: 
            {
             
                    temp=factory.create(grammarAccess.getIntVectorTypeAccess().getIntVectorTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getIntVectorTypeAccess().getIntVectorTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,75,FOLLOW_75_in_ruleIntVectorType9964); 

                    createLeafNode(grammarAccess.getIntVectorTypeAccess().getVectorIntKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIntVectorType


    // $ANTLR start entryRuleFloatVectorType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4687:1: entryRuleFloatVectorType returns [EObject current=null] : iv_ruleFloatVectorType= ruleFloatVectorType EOF ;
    public final EObject entryRuleFloatVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4687:57: (iv_ruleFloatVectorType= ruleFloatVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4688:2: iv_ruleFloatVectorType= ruleFloatVectorType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFloatVectorTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleFloatVectorType_in_entryRuleFloatVectorType9997);
            iv_ruleFloatVectorType=ruleFloatVectorType();
            _fsp--;

             current =iv_ruleFloatVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatVectorType10007); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFloatVectorType


    // $ANTLR start ruleFloatVectorType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4695:1: ruleFloatVectorType returns [EObject current=null] : ( () 'vector<float>' ) ;
    public final EObject ruleFloatVectorType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4700:6: ( ( () 'vector<float>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4701:1: ( () 'vector<float>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4701:1: ( () 'vector<float>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4701:2: () 'vector<float>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4701:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4702:5: 
            {
             
                    temp=factory.create(grammarAccess.getFloatVectorTypeAccess().getFloatVectorTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getFloatVectorTypeAccess().getFloatVectorTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,76,FOLLOW_76_in_ruleFloatVectorType10050); 

                    createLeafNode(grammarAccess.getFloatVectorTypeAccess().getVectorFloatKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFloatVectorType


    // $ANTLR start entryRuleDoubleVectorType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4723:1: entryRuleDoubleVectorType returns [EObject current=null] : iv_ruleDoubleVectorType= ruleDoubleVectorType EOF ;
    public final EObject entryRuleDoubleVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4723:58: (iv_ruleDoubleVectorType= ruleDoubleVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4724:2: iv_ruleDoubleVectorType= ruleDoubleVectorType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDoubleVectorTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleDoubleVectorType_in_entryRuleDoubleVectorType10083);
            iv_ruleDoubleVectorType=ruleDoubleVectorType();
            _fsp--;

             current =iv_ruleDoubleVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleVectorType10093); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDoubleVectorType


    // $ANTLR start ruleDoubleVectorType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4731:1: ruleDoubleVectorType returns [EObject current=null] : ( () 'vector<double>' ) ;
    public final EObject ruleDoubleVectorType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4736:6: ( ( () 'vector<double>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4737:1: ( () 'vector<double>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4737:1: ( () 'vector<double>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4737:2: () 'vector<double>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4737:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4738:5: 
            {
             
                    temp=factory.create(grammarAccess.getDoubleVectorTypeAccess().getDoubleVectorTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getDoubleVectorTypeAccess().getDoubleVectorTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,77,FOLLOW_77_in_ruleDoubleVectorType10136); 

                    createLeafNode(grammarAccess.getDoubleVectorTypeAccess().getVectorDoubleKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDoubleVectorType


    // $ANTLR start entryRuleStringVectorType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4759:1: entryRuleStringVectorType returns [EObject current=null] : iv_ruleStringVectorType= ruleStringVectorType EOF ;
    public final EObject entryRuleStringVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4759:58: (iv_ruleStringVectorType= ruleStringVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4760:2: iv_ruleStringVectorType= ruleStringVectorType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringVectorTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringVectorType_in_entryRuleStringVectorType10169);
            iv_ruleStringVectorType=ruleStringVectorType();
            _fsp--;

             current =iv_ruleStringVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringVectorType10179); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStringVectorType


    // $ANTLR start ruleStringVectorType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4767:1: ruleStringVectorType returns [EObject current=null] : ( () 'vector<string>' ) ;
    public final EObject ruleStringVectorType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4772:6: ( ( () 'vector<string>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4773:1: ( () 'vector<string>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4773:1: ( () 'vector<string>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4773:2: () 'vector<string>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4773:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4774:5: 
            {
             
                    temp=factory.create(grammarAccess.getStringVectorTypeAccess().getStringVectorTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getStringVectorTypeAccess().getStringVectorTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,78,FOLLOW_78_in_ruleStringVectorType10222); 

                    createLeafNode(grammarAccess.getStringVectorTypeAccess().getVectorStringKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStringVectorType


 

    public static final BitSet FOLLOW_rulePogoSystem_in_entryRulePogoSystem73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePogoSystem83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rulePogoSystem142 = new BitSet(new long[]{0x0000000000041802L});
    public static final BitSet FOLLOW_rulePogoDeviceClass_in_rulePogoSystem181 = new BitSet(new long[]{0x0000000000041002L});
    public static final BitSet FOLLOW_rulePogoMultiClasses_in_rulePogoSystem220 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePogoMultiClasses_in_entryRulePogoMultiClasses365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePogoMultiClasses375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePogoMultiClasses409 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePogoMultiClasses431 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePogoMultiClasses448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePogoMultiClasses470 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePogoMultiClasses500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePogoMultiClasses530 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePogoMultiClasses547 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOneClassSimpleDef_in_rulePogoMultiClasses581 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePogoMultiClasses607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePreferences_in_rulePogoMultiClasses649 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePogoMultiClasses662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneClassSimpleDef_in_entryRuleOneClassSimpleDef695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneClassSimpleDef705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOneClassSimpleDef752 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOneClassSimpleDef782 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleOneClassSimpleDef824 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOneClassSimpleDef837 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInheritance_in_ruleOneClassSimpleDef871 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleOneClassSimpleDef884 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOneClassSimpleDef906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePogoDeviceClass_in_entryRulePogoDeviceClass947 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePogoDeviceClass957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePogoDeviceClass991 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePogoDeviceClass1013 = new BitSet(new long[]{0x0000000000182000L});
    public static final BitSet FOLLOW_19_in_rulePogoDeviceClass1042 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_20_in_rulePogoDeviceClass1066 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePogoDeviceClass1088 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePogoDeviceClass1102 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePogoDeviceClass1124 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePogoDeviceClass1141 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClassDescription_in_rulePogoDeviceClass1175 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePogoDeviceClass1188 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePogoDeviceClass1222 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_23_in_rulePogoDeviceClass1236 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePogoDeviceClass1270 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_rulePogoDeviceClass1284 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_ruleCommand_in_rulePogoDeviceClass1318 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_rulePogoDeviceClass1332 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_ruleAttribute_in_rulePogoDeviceClass1366 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_26_in_rulePogoDeviceClass1380 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleState_in_rulePogoDeviceClass1414 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rulePreferences_in_rulePogoDeviceClass1453 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePogoDeviceClass1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLanguage_in_entryRuleLanguage1500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLanguage1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleLanguage1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleLanguage1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleLanguage1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisplayLevel_in_entryRuleDisplayLevel1626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisplayLevel1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleDisplayLevel1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDisplayLevel1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrType_in_entryRuleAttrType1733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrType1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleAttrType1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleAttrType1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleAttrType1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRW_Type_in_entryRuleRW_Type1859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRW_Type1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleRW_Type1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleRW_Type1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleRW_Type1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleRW_Type1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean2004 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleBoolean2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleBoolean2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDescription_in_entryRuleClassDescription2110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassDescription2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassDescription2167 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassDescription2197 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassDescription2227 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleClassDescription2244 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInheritance_in_ruleClassDescription2278 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_ruleLanguage_in_ruleClassDescription2316 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassDescription2342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClassIdentification_in_ruleClassDescription2384 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleComments_in_ruleClassDescription2422 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleClassDescription2460 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleClassDescription2498 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleClassDescription2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritance_in_entryRuleInheritance2573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInheritance2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInheritance2630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInheritance2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassIdentification_in_entryRuleClassIdentification2701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassIdentification2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2758 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2818 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2878 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2908 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2938 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2968 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComments_in_entryRuleComments3039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComments3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleComments3096 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleComments3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreferences_in_entryRulePreferences3167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreferences3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePreferences3224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePreferences3254 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePreferences3284 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_rulePreferences3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState3363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState3420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState3450 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_ruleState3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty3529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty3539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty3586 = new BitSet(new long[]{0x003FC00000000000L,0x0000000000007C00L});
    public static final BitSet FOLLOW_rulePropType_in_ruleProperty3628 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_ruleProperty3666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProperty3692 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleProperty3709 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProperty3731 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rulePropType_in_entryRulePropType3773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropType3783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rulePropType3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVectorType_in_rulePropType3857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType3889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType3899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_ruleSimpleType3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortType_in_ruleSimpleType3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortType_in_ruleSimpleType4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_ruleSimpleType4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntType_in_ruleSimpleType4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_ruleSimpleType4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_ruleSimpleType4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_ruleSimpleType4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVectorType_in_entryRuleVectorType4167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVectorType4177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortVectorType_in_ruleVectorType4224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntVectorType_in_ruleVectorType4251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatVectorType_in_ruleVectorType4278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleVectorType_in_ruleVectorType4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVectorType_in_ruleVectorType4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_entryRuleInheritanceStatus4364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInheritanceStatus4374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleInheritanceStatus4433 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleInheritanceStatus4471 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleInheritanceStatus4509 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleInheritanceStatus4547 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInheritanceStatus4573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand4614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand4624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand4671 = new BitSet(new long[]{0xFFFFE00000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleArgument_in_ruleCommand4713 = new BitSet(new long[]{0xFFFFE00000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleArgument_in_ruleCommand4751 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommand4777 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_ruleCommand4819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommand4845 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_ruleDisplayLevel_in_ruleCommand4887 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommand4913 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleCommand4930 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommand4952 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument4994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument5004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleArgument5063 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument5089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute5130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute5140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute5187 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_ruleAttrType_in_ruleAttribute5229 = new BitSet(new long[]{0xFFFFE00000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleType_in_ruleAttribute5267 = new BitSet(new long[]{0x0000007800000000L});
    public static final BitSet FOLLOW_ruleRW_Type_in_ruleAttribute5305 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_ruleDisplayLevel_in_ruleAttribute5343 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute5369 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute5399 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute5429 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleAttribute5471 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleAttribute5509 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_ruleFireEvents_in_ruleAttribute5547 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_ruleFireEvents_in_ruleAttribute5585 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_ruleAttribute5623 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttrProperties_in_ruleAttribute5661 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleAttribute5699 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleAttribute5737 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleAttribute5750 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute5772 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_44_in_ruleAttribute5790 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute5812 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleFireEvents_in_entryRuleFireEvents5854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFireEvents5864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleFireEvents5923 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleFireEvents5961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrProperties_in_entryRuleAttrProperties5998 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrProperties6008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6055 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6085 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6145 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6175 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6205 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6265 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6295 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6355 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6385 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType6486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType6496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidType_in_ruleType6543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_ruleType6570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortType_in_ruleType6597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortType_in_ruleType6624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_ruleType6651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntType_in_ruleType6678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_ruleType6705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_ruleType6732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_ruleType6759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharArrayType_in_ruleType6786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortArrayType_in_ruleType6813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortArrayType_in_ruleType6840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntArrayType_in_ruleType6867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntArrayType_in_ruleType6894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatArrayType_in_ruleType6921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleArrayType_in_ruleType6948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringArrayType_in_ruleType6975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongStringArrayType_in_ruleType7002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleStringArrayType_in_ruleType7029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleType7056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstStringType_in_ruleType7083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanArrayType_in_ruleType7110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_ruleType7137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongType_in_ruleType7164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUCharType_in_ruleType7191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongArrayType_in_ruleType7218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongArrayType_in_ruleType7245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDevIntType_in_ruleType7272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncodedType_in_ruleType7299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidType_in_entryRuleVoidType7331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVoidType7341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleVoidType7384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_entryRuleBooleanType7417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanType7427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleBooleanType7470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortType_in_entryRuleShortType7503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortType7513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleShortType7556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortType_in_entryRuleUShortType7589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUShortType7599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleUShortType7642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_entryRuleIntType7675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntType7685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleIntType7728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntType_in_entryRuleUIntType7761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIntType7771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleUIntType7814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_entryRuleFloatType7847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatType7857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleFloatType7900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_entryRuleDoubleType7933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleType7943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleDoubleType7986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType8019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType8029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleStringType8072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharArrayType_in_entryRuleCharArrayType8105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharArrayType8115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleCharArrayType8158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortArrayType_in_entryRuleShortArrayType8191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortArrayType8201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleShortArrayType8244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortArrayType_in_entryRuleUShortArrayType8277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUShortArrayType8287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleUShortArrayType8330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntArrayType_in_entryRuleIntArrayType8363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntArrayType8373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleIntArrayType8416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntArrayType_in_entryRuleUIntArrayType8449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIntArrayType8459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleUIntArrayType8502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatArrayType_in_entryRuleFloatArrayType8535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatArrayType8545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleFloatArrayType8588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleArrayType_in_entryRuleDoubleArrayType8621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleArrayType8631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleDoubleArrayType8674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringArrayType_in_entryRuleStringArrayType8707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringArrayType8717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleStringArrayType8760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongStringArrayType_in_entryRuleLongStringArrayType8793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongStringArrayType8803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleLongStringArrayType8846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleStringArrayType_in_entryRuleDoubleStringArrayType8879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleStringArrayType8889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleDoubleStringArrayType8932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_entryRuleStateType8965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateType8975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleStateType9018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstStringType_in_entryRuleConstStringType9051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstStringType9061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleConstStringType9104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanArrayType_in_entryRuleBooleanArrayType9137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanArrayType9147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleBooleanArrayType9190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUCharType_in_entryRuleUCharType9223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUCharType9233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleUCharType9276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_entryRuleLongType9309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongType9319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleLongType9362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongType_in_entryRuleULongType9395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleULongType9405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleULongType9448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongArrayType_in_entryRuleLongArrayType9481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongArrayType9491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleLongArrayType9534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongArrayType_in_entryRuleULongArrayType9567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleULongArrayType9577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleULongArrayType9620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDevIntType_in_entryRuleDevIntType9653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDevIntType9663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleDevIntType9706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncodedType_in_entryRuleEncodedType9739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEncodedType9749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleEncodedType9792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortVectorType_in_entryRuleShortVectorType9825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortVectorType9835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleShortVectorType9878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntVectorType_in_entryRuleIntVectorType9911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntVectorType9921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleIntVectorType9964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatVectorType_in_entryRuleFloatVectorType9997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatVectorType10007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleFloatVectorType10050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleVectorType_in_entryRuleDoubleVectorType10083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleVectorType10093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleDoubleVectorType10136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVectorType_in_entryRuleStringVectorType10169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringVectorType10179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleStringVectorType10222 = new BitSet(new long[]{0x0000000000000002L});

}