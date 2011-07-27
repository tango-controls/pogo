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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'multiclasses'", "'{'", "'classes:'", "'}'", "'inheritances:'", "'parentClasses:'", "'additionalFiles:'", "'deviceclass'", "'abstract'", "'extends'", "'description:'", "'classProperties:'", "'deviceProperties:'", "'commands:'", "'attributes:'", "'dynamicAttributes:'", "'states:'", "'Cpp'", "'Java'", "'Python'", "'OPERATOR'", "'EXPERT'", "'Scalar'", "'Spectrum'", "'Image'", "'READ'", "'WRITE'", "'READ_WRITE'", "'READ_WITH_WRITE'", "'true'", "'false'", "'defaultPropValue:'", "'excludedStates:'", "'readExcludedStates:'", "'writeExcludedStates:'", "'void'", "'boolean'", "'short'", "'ushort'", "'int'", "'uint'", "'float'", "'double'", "'string'", "'DevVarCharArray'", "'DevVarShortArray'", "'DevVarUShortArray'", "'DevVarLongArray'", "'DevVarULongArray'", "'DevVarFloatArray'", "'DevVarDoubleArray'", "'DevVarStringArray'", "'DevVarLongStringArray'", "'DevVarDoubleStringArray'", "'DevState'", "'ConstDevString'", "'DevVarBooleanArray'", "'DevUChar'", "'DevLong64'", "'DevULong64'", "'DevVarLong64Array'", "'DevVarULong64Array'", "'DevInt'", "'DevEncoded'", "'vector<short>'", "'vector<int>'", "'vector<float>'", "'vector<double>'", "'vector<string>'"
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

                if ( (LA2_0==19) ) {
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:388:1: ruleOneClassSimpleDef returns [EObject current=null] : ( (lv_classname_0= RULE_STRING ) (lv_sourcePath_1= RULE_STRING ) (lv_pogo6_2= ruleBoolean ) 'inheritances:' (lv_inheritances_4= ruleInheritance ) 'parentClasses:' (lv_parentClasses_6= RULE_STRING ) 'additionalFiles:' (lv_additionalFiles_8= ruleAdditionalFile )* ) ;
    public final EObject ruleOneClassSimpleDef() throws RecognitionException {
        EObject current = null;

        Token lv_classname_0=null;
        Token lv_sourcePath_1=null;
        Token lv_parentClasses_6=null;
        AntlrDatatypeRuleToken lv_pogo6_2 = null;

        EObject lv_inheritances_4 = null;

        EObject lv_additionalFiles_8 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:393:6: ( ( (lv_classname_0= RULE_STRING ) (lv_sourcePath_1= RULE_STRING ) (lv_pogo6_2= ruleBoolean ) 'inheritances:' (lv_inheritances_4= ruleInheritance ) 'parentClasses:' (lv_parentClasses_6= RULE_STRING ) 'additionalFiles:' (lv_additionalFiles_8= ruleAdditionalFile )* ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:394:1: ( (lv_classname_0= RULE_STRING ) (lv_sourcePath_1= RULE_STRING ) (lv_pogo6_2= ruleBoolean ) 'inheritances:' (lv_inheritances_4= ruleInheritance ) 'parentClasses:' (lv_parentClasses_6= RULE_STRING ) 'additionalFiles:' (lv_additionalFiles_8= ruleAdditionalFile )* )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:394:1: ( (lv_classname_0= RULE_STRING ) (lv_sourcePath_1= RULE_STRING ) (lv_pogo6_2= ruleBoolean ) 'inheritances:' (lv_inheritances_4= ruleInheritance ) 'parentClasses:' (lv_parentClasses_6= RULE_STRING ) 'additionalFiles:' (lv_additionalFiles_8= ruleAdditionalFile )* )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:394:2: (lv_classname_0= RULE_STRING ) (lv_sourcePath_1= RULE_STRING ) (lv_pogo6_2= ruleBoolean ) 'inheritances:' (lv_inheritances_4= ruleInheritance ) 'parentClasses:' (lv_parentClasses_6= RULE_STRING ) 'additionalFiles:' (lv_additionalFiles_8= ruleAdditionalFile )*
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

            match(input,18,FOLLOW_18_in_ruleOneClassSimpleDef923); 

                    createLeafNode(grammarAccess.getOneClassSimpleDefAccess().getAdditionalFilesKeyword_7(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:508:1: (lv_additionalFiles_8= ruleAdditionalFile )*
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
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:511:6: lv_additionalFiles_8= ruleAdditionalFile
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getOneClassSimpleDefAccess().getAdditionalFilesAdditionalFileParserRuleCall_8_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAdditionalFile_in_ruleOneClassSimpleDef957);
            	    lv_additionalFiles_8=ruleAdditionalFile();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getOneClassSimpleDefRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "additionalFiles", lv_additionalFiles_8, "AdditionalFile", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end ruleOneClassSimpleDef


    // $ANTLR start entryRulePogoDeviceClass
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:536:1: entryRulePogoDeviceClass returns [EObject current=null] : iv_rulePogoDeviceClass= rulePogoDeviceClass EOF ;
    public final EObject entryRulePogoDeviceClass() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePogoDeviceClass = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:536:57: (iv_rulePogoDeviceClass= rulePogoDeviceClass EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:537:2: iv_rulePogoDeviceClass= rulePogoDeviceClass EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPogoDeviceClassRule(), currentNode); 
            pushFollow(FOLLOW_rulePogoDeviceClass_in_entryRulePogoDeviceClass995);
            iv_rulePogoDeviceClass=rulePogoDeviceClass();
            _fsp--;

             current =iv_rulePogoDeviceClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePogoDeviceClass1005); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:544:1: rulePogoDeviceClass returns [EObject current=null] : ( 'deviceclass' (lv_name_1= RULE_ID ) (lv_isAbstract_2= 'abstract' )? ( 'extends' ( RULE_ID ) )? '{' (lv_institute_6= RULE_ID ) 'description:' (lv_description_8= ruleClassDescription ) 'classProperties:' (lv_classProperties_10= ruleProperty )* 'deviceProperties:' (lv_deviceProperties_12= ruleProperty )* 'commands:' (lv_commands_14= ruleCommand )* 'attributes:' (lv_attributes_16= ruleAttribute )* 'dynamicAttributes:' (lv_dynamicAttributes_18= ruleAttribute )* 'states:' (lv_states_20= ruleState )* (lv_preferences_21= rulePreferences ) 'additionalFiles:' (lv_additionalFiles_23= ruleAdditionalFile )* '}' ) ;
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

        EObject lv_dynamicAttributes_18 = null;

        EObject lv_states_20 = null;

        EObject lv_preferences_21 = null;

        EObject lv_additionalFiles_23 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:549:6: ( ( 'deviceclass' (lv_name_1= RULE_ID ) (lv_isAbstract_2= 'abstract' )? ( 'extends' ( RULE_ID ) )? '{' (lv_institute_6= RULE_ID ) 'description:' (lv_description_8= ruleClassDescription ) 'classProperties:' (lv_classProperties_10= ruleProperty )* 'deviceProperties:' (lv_deviceProperties_12= ruleProperty )* 'commands:' (lv_commands_14= ruleCommand )* 'attributes:' (lv_attributes_16= ruleAttribute )* 'dynamicAttributes:' (lv_dynamicAttributes_18= ruleAttribute )* 'states:' (lv_states_20= ruleState )* (lv_preferences_21= rulePreferences ) 'additionalFiles:' (lv_additionalFiles_23= ruleAdditionalFile )* '}' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:550:1: ( 'deviceclass' (lv_name_1= RULE_ID ) (lv_isAbstract_2= 'abstract' )? ( 'extends' ( RULE_ID ) )? '{' (lv_institute_6= RULE_ID ) 'description:' (lv_description_8= ruleClassDescription ) 'classProperties:' (lv_classProperties_10= ruleProperty )* 'deviceProperties:' (lv_deviceProperties_12= ruleProperty )* 'commands:' (lv_commands_14= ruleCommand )* 'attributes:' (lv_attributes_16= ruleAttribute )* 'dynamicAttributes:' (lv_dynamicAttributes_18= ruleAttribute )* 'states:' (lv_states_20= ruleState )* (lv_preferences_21= rulePreferences ) 'additionalFiles:' (lv_additionalFiles_23= ruleAdditionalFile )* '}' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:550:1: ( 'deviceclass' (lv_name_1= RULE_ID ) (lv_isAbstract_2= 'abstract' )? ( 'extends' ( RULE_ID ) )? '{' (lv_institute_6= RULE_ID ) 'description:' (lv_description_8= ruleClassDescription ) 'classProperties:' (lv_classProperties_10= ruleProperty )* 'deviceProperties:' (lv_deviceProperties_12= ruleProperty )* 'commands:' (lv_commands_14= ruleCommand )* 'attributes:' (lv_attributes_16= ruleAttribute )* 'dynamicAttributes:' (lv_dynamicAttributes_18= ruleAttribute )* 'states:' (lv_states_20= ruleState )* (lv_preferences_21= rulePreferences ) 'additionalFiles:' (lv_additionalFiles_23= ruleAdditionalFile )* '}' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:550:2: 'deviceclass' (lv_name_1= RULE_ID ) (lv_isAbstract_2= 'abstract' )? ( 'extends' ( RULE_ID ) )? '{' (lv_institute_6= RULE_ID ) 'description:' (lv_description_8= ruleClassDescription ) 'classProperties:' (lv_classProperties_10= ruleProperty )* 'deviceProperties:' (lv_deviceProperties_12= ruleProperty )* 'commands:' (lv_commands_14= ruleCommand )* 'attributes:' (lv_attributes_16= ruleAttribute )* 'dynamicAttributes:' (lv_dynamicAttributes_18= ruleAttribute )* 'states:' (lv_states_20= ruleState )* (lv_preferences_21= rulePreferences ) 'additionalFiles:' (lv_additionalFiles_23= ruleAdditionalFile )* '}'
            {
            match(input,19,FOLLOW_19_in_rulePogoDeviceClass1039); 

                    createLeafNode(grammarAccess.getPogoDeviceClassAccess().getDeviceclassKeyword_0(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:554:1: (lv_name_1= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:556:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePogoDeviceClass1061); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:574:2: (lv_isAbstract_2= 'abstract' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:576:6: lv_isAbstract_2= 'abstract'
                    {
                    lv_isAbstract_2=(Token)input.LT(1);
                    match(input,20,FOLLOW_20_in_rulePogoDeviceClass1090); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:595:3: ( 'extends' ( RULE_ID ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:595:4: 'extends' ( RULE_ID )
                    {
                    match(input,21,FOLLOW_21_in_rulePogoDeviceClass1114); 

                            createLeafNode(grammarAccess.getPogoDeviceClassAccess().getExtendsKeyword_3_0(), null); 
                        
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:599:1: ( RULE_ID )
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:602:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getPogoDeviceClassRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePogoDeviceClass1136); 

                    		createLeafNode(grammarAccess.getPogoDeviceClassAccess().getBaseClassPogoDeviceClassCrossReference_3_1_0(), "baseClass"); 
                    	

                    }


                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_rulePogoDeviceClass1150); 

                    createLeafNode(grammarAccess.getPogoDeviceClassAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:619:1: (lv_institute_6= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:621:6: lv_institute_6= RULE_ID
            {
            lv_institute_6=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePogoDeviceClass1172); 

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

            match(input,22,FOLLOW_22_in_rulePogoDeviceClass1189); 

                    createLeafNode(grammarAccess.getPogoDeviceClassAccess().getDescriptionKeyword_6(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:643:1: (lv_description_8= ruleClassDescription )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:646:6: lv_description_8= ruleClassDescription
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPogoDeviceClassAccess().getDescriptionClassDescriptionParserRuleCall_7_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleClassDescription_in_rulePogoDeviceClass1223);
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

            match(input,23,FOLLOW_23_in_rulePogoDeviceClass1236); 

                    createLeafNode(grammarAccess.getPogoDeviceClassAccess().getClassPropertiesKeyword_8(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:668:1: (lv_classProperties_10= ruleProperty )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:671:6: lv_classProperties_10= ruleProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPogoDeviceClassAccess().getClassPropertiesPropertyParserRuleCall_9_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_rulePogoDeviceClass1270);
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
            	    break loop7;
                }
            } while (true);

            match(input,24,FOLLOW_24_in_rulePogoDeviceClass1284); 

                    createLeafNode(grammarAccess.getPogoDeviceClassAccess().getDevicePropertiesKeyword_10(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:693:1: (lv_deviceProperties_12= ruleProperty )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:696:6: lv_deviceProperties_12= ruleProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPogoDeviceClassAccess().getDevicePropertiesPropertyParserRuleCall_11_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_rulePogoDeviceClass1318);
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
            	    break loop8;
                }
            } while (true);

            match(input,25,FOLLOW_25_in_rulePogoDeviceClass1332); 

                    createLeafNode(grammarAccess.getPogoDeviceClassAccess().getCommandsKeyword_12(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:718:1: (lv_commands_14= ruleCommand )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:721:6: lv_commands_14= ruleCommand
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPogoDeviceClassAccess().getCommandsCommandParserRuleCall_13_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommand_in_rulePogoDeviceClass1366);
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
            	    break loop9;
                }
            } while (true);

            match(input,26,FOLLOW_26_in_rulePogoDeviceClass1380); 

                    createLeafNode(grammarAccess.getPogoDeviceClassAccess().getAttributesKeyword_14(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:743:1: (lv_attributes_16= ruleAttribute )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:746:6: lv_attributes_16= ruleAttribute
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPogoDeviceClassAccess().getAttributesAttributeParserRuleCall_15_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_rulePogoDeviceClass1414);
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
            	    break loop10;
                }
            } while (true);

            match(input,27,FOLLOW_27_in_rulePogoDeviceClass1428); 

                    createLeafNode(grammarAccess.getPogoDeviceClassAccess().getDynamicAttributesKeyword_16(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:768:1: (lv_dynamicAttributes_18= ruleAttribute )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:771:6: lv_dynamicAttributes_18= ruleAttribute
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPogoDeviceClassAccess().getDynamicAttributesAttributeParserRuleCall_17_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_rulePogoDeviceClass1462);
            	    lv_dynamicAttributes_18=ruleAttribute();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPogoDeviceClassRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "dynamicAttributes", lv_dynamicAttributes_18, "Attribute", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match(input,28,FOLLOW_28_in_rulePogoDeviceClass1476); 

                    createLeafNode(grammarAccess.getPogoDeviceClassAccess().getStatesKeyword_18(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:793:1: (lv_states_20= ruleState )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:796:6: lv_states_20= ruleState
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPogoDeviceClassAccess().getStatesStateParserRuleCall_19_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_rulePogoDeviceClass1510);
            	    lv_states_20=ruleState();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPogoDeviceClassRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "states", lv_states_20, "State", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:814:3: (lv_preferences_21= rulePreferences )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:817:6: lv_preferences_21= rulePreferences
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPogoDeviceClassAccess().getPreferencesPreferencesParserRuleCall_20_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePreferences_in_rulePogoDeviceClass1549);
            lv_preferences_21=rulePreferences();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPogoDeviceClassRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "preferences", lv_preferences_21, "Preferences", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,18,FOLLOW_18_in_rulePogoDeviceClass1562); 

                    createLeafNode(grammarAccess.getPogoDeviceClassAccess().getAdditionalFilesKeyword_21(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:839:1: (lv_additionalFiles_23= ruleAdditionalFile )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:842:6: lv_additionalFiles_23= ruleAdditionalFile
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPogoDeviceClassAccess().getAdditionalFilesAdditionalFileParserRuleCall_22_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAdditionalFile_in_rulePogoDeviceClass1596);
            	    lv_additionalFiles_23=ruleAdditionalFile();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPogoDeviceClassRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "additionalFiles", lv_additionalFiles_23, "AdditionalFile", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match(input,15,FOLLOW_15_in_rulePogoDeviceClass1610); 

                    createLeafNode(grammarAccess.getPogoDeviceClassAccess().getRightCurlyBracketKeyword_23(), null); 
                

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:871:1: entryRuleLanguage returns [String current=null] : iv_ruleLanguage= ruleLanguage EOF ;
    public final String entryRuleLanguage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLanguage = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:871:49: (iv_ruleLanguage= ruleLanguage EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:872:2: iv_ruleLanguage= ruleLanguage EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLanguageRule(), currentNode); 
            pushFollow(FOLLOW_ruleLanguage_in_entryRuleLanguage1644);
            iv_ruleLanguage=ruleLanguage();
            _fsp--;

             current =iv_ruleLanguage.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLanguage1655); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:879:1: ruleLanguage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Cpp' | kw= 'Java' | kw= 'Python' ) ;
    public final AntlrDatatypeRuleToken ruleLanguage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:885:6: ( (kw= 'Cpp' | kw= 'Java' | kw= 'Python' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:886:1: (kw= 'Cpp' | kw= 'Java' | kw= 'Python' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:886:1: (kw= 'Cpp' | kw= 'Java' | kw= 'Python' )
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
                    new NoViableAltException("886:1: (kw= 'Cpp' | kw= 'Java' | kw= 'Python' )", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:887:2: kw= 'Cpp'
                    {
                    kw=(Token)input.LT(1);
                    match(input,29,FOLLOW_29_in_ruleLanguage1693); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getLanguageAccess().getCppKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:894:2: kw= 'Java'
                    {
                    kw=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleLanguage1712); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getLanguageAccess().getJavaKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:901:2: kw= 'Python'
                    {
                    kw=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_ruleLanguage1731); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:914:1: entryRuleDisplayLevel returns [String current=null] : iv_ruleDisplayLevel= ruleDisplayLevel EOF ;
    public final String entryRuleDisplayLevel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDisplayLevel = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:914:53: (iv_ruleDisplayLevel= ruleDisplayLevel EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:915:2: iv_ruleDisplayLevel= ruleDisplayLevel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDisplayLevelRule(), currentNode); 
            pushFollow(FOLLOW_ruleDisplayLevel_in_entryRuleDisplayLevel1770);
            iv_ruleDisplayLevel=ruleDisplayLevel();
            _fsp--;

             current =iv_ruleDisplayLevel.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisplayLevel1781); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:922:1: ruleDisplayLevel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'OPERATOR' | kw= 'EXPERT' ) ;
    public final AntlrDatatypeRuleToken ruleDisplayLevel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:928:6: ( (kw= 'OPERATOR' | kw= 'EXPERT' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:929:1: (kw= 'OPERATOR' | kw= 'EXPERT' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:929:1: (kw= 'OPERATOR' | kw= 'EXPERT' )
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
                    new NoViableAltException("929:1: (kw= 'OPERATOR' | kw= 'EXPERT' )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:930:2: kw= 'OPERATOR'
                    {
                    kw=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_ruleDisplayLevel1819); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDisplayLevelAccess().getOPERATORKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:937:2: kw= 'EXPERT'
                    {
                    kw=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_ruleDisplayLevel1838); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:950:1: entryRuleAttrType returns [String current=null] : iv_ruleAttrType= ruleAttrType EOF ;
    public final String entryRuleAttrType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttrType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:950:49: (iv_ruleAttrType= ruleAttrType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:951:2: iv_ruleAttrType= ruleAttrType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttrTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttrType_in_entryRuleAttrType1877);
            iv_ruleAttrType=ruleAttrType();
            _fsp--;

             current =iv_ruleAttrType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrType1888); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:958:1: ruleAttrType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Scalar' | kw= 'Spectrum' | kw= 'Image' ) ;
    public final AntlrDatatypeRuleToken ruleAttrType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:964:6: ( (kw= 'Scalar' | kw= 'Spectrum' | kw= 'Image' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:965:1: (kw= 'Scalar' | kw= 'Spectrum' | kw= 'Image' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:965:1: (kw= 'Scalar' | kw= 'Spectrum' | kw= 'Image' )
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
                    new NoViableAltException("965:1: (kw= 'Scalar' | kw= 'Spectrum' | kw= 'Image' )", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:966:2: kw= 'Scalar'
                    {
                    kw=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_ruleAttrType1926); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAttrTypeAccess().getScalarKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:973:2: kw= 'Spectrum'
                    {
                    kw=(Token)input.LT(1);
                    match(input,35,FOLLOW_35_in_ruleAttrType1945); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAttrTypeAccess().getSpectrumKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:980:2: kw= 'Image'
                    {
                    kw=(Token)input.LT(1);
                    match(input,36,FOLLOW_36_in_ruleAttrType1964); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:993:1: entryRuleRW_Type returns [String current=null] : iv_ruleRW_Type= ruleRW_Type EOF ;
    public final String entryRuleRW_Type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRW_Type = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:993:48: (iv_ruleRW_Type= ruleRW_Type EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:994:2: iv_ruleRW_Type= ruleRW_Type EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRW_TypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleRW_Type_in_entryRuleRW_Type2003);
            iv_ruleRW_Type=ruleRW_Type();
            _fsp--;

             current =iv_ruleRW_Type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRW_Type2014); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1001:1: ruleRW_Type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'READ' | kw= 'WRITE' | kw= 'READ_WRITE' | kw= 'READ_WITH_WRITE' ) ;
    public final AntlrDatatypeRuleToken ruleRW_Type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1007:6: ( (kw= 'READ' | kw= 'WRITE' | kw= 'READ_WRITE' | kw= 'READ_WITH_WRITE' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1008:1: (kw= 'READ' | kw= 'WRITE' | kw= 'READ_WRITE' | kw= 'READ_WITH_WRITE' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1008:1: (kw= 'READ' | kw= 'WRITE' | kw= 'READ_WRITE' | kw= 'READ_WITH_WRITE' )
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
                    new NoViableAltException("1008:1: (kw= 'READ' | kw= 'WRITE' | kw= 'READ_WRITE' | kw= 'READ_WITH_WRITE' )", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1009:2: kw= 'READ'
                    {
                    kw=(Token)input.LT(1);
                    match(input,37,FOLLOW_37_in_ruleRW_Type2052); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getRW_TypeAccess().getREADKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1016:2: kw= 'WRITE'
                    {
                    kw=(Token)input.LT(1);
                    match(input,38,FOLLOW_38_in_ruleRW_Type2071); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getRW_TypeAccess().getWRITEKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1023:2: kw= 'READ_WRITE'
                    {
                    kw=(Token)input.LT(1);
                    match(input,39,FOLLOW_39_in_ruleRW_Type2090); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getRW_TypeAccess().getREAD_WRITEKeyword_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1030:2: kw= 'READ_WITH_WRITE'
                    {
                    kw=(Token)input.LT(1);
                    match(input,40,FOLLOW_40_in_ruleRW_Type2109); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1043:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1043:48: (iv_ruleBoolean= ruleBoolean EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1044:2: iv_ruleBoolean= ruleBoolean EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanRule(), currentNode); 
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean2148);
            iv_ruleBoolean=ruleBoolean();
            _fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean2159); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1051:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1057:6: ( (kw= 'true' | kw= 'false' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1058:1: (kw= 'true' | kw= 'false' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1058:1: (kw= 'true' | kw= 'false' )
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
                    new NoViableAltException("1058:1: (kw= 'true' | kw= 'false' )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1059:2: kw= 'true'
                    {
                    kw=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_ruleBoolean2197); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getBooleanAccess().getTrueKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1066:2: kw= 'false'
                    {
                    kw=(Token)input.LT(1);
                    match(input,42,FOLLOW_42_in_ruleBoolean2216); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1079:1: entryRuleClassDescription returns [EObject current=null] : iv_ruleClassDescription= ruleClassDescription EOF ;
    public final EObject entryRuleClassDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDescription = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1079:58: (iv_ruleClassDescription= ruleClassDescription EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1080:2: iv_ruleClassDescription= ruleClassDescription EOF
            {
             currentNode = createCompositeNode(grammarAccess.getClassDescriptionRule(), currentNode); 
            pushFollow(FOLLOW_ruleClassDescription_in_entryRuleClassDescription2254);
            iv_ruleClassDescription=ruleClassDescription();
            _fsp--;

             current =iv_ruleClassDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassDescription2264); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1087:1: ruleClassDescription returns [EObject current=null] : ( (lv_description_0= RULE_STRING ) (lv_title_1= RULE_STRING ) (lv_sourcePath_2= RULE_STRING ) 'inheritances:' (lv_inheritances_4= ruleInheritance ) (lv_language_5= ruleLanguage ) (lv_filestogenerate_6= RULE_STRING ) (lv_identification_7= ruleClassIdentification ) (lv_comments_8= ruleComments ) (lv_hasMandatoryProperty_9= ruleBoolean ) (lv_hasAbstractCommand_10= ruleBoolean ) (lv_hasAbstractAttribute_11= ruleBoolean ) (lv_descriptionHtmlExists_12= ruleBoolean ) ) ;
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

        AntlrDatatypeRuleToken lv_hasMandatoryProperty_9 = null;

        AntlrDatatypeRuleToken lv_hasAbstractCommand_10 = null;

        AntlrDatatypeRuleToken lv_hasAbstractAttribute_11 = null;

        AntlrDatatypeRuleToken lv_descriptionHtmlExists_12 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1092:6: ( ( (lv_description_0= RULE_STRING ) (lv_title_1= RULE_STRING ) (lv_sourcePath_2= RULE_STRING ) 'inheritances:' (lv_inheritances_4= ruleInheritance ) (lv_language_5= ruleLanguage ) (lv_filestogenerate_6= RULE_STRING ) (lv_identification_7= ruleClassIdentification ) (lv_comments_8= ruleComments ) (lv_hasMandatoryProperty_9= ruleBoolean ) (lv_hasAbstractCommand_10= ruleBoolean ) (lv_hasAbstractAttribute_11= ruleBoolean ) (lv_descriptionHtmlExists_12= ruleBoolean ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1093:1: ( (lv_description_0= RULE_STRING ) (lv_title_1= RULE_STRING ) (lv_sourcePath_2= RULE_STRING ) 'inheritances:' (lv_inheritances_4= ruleInheritance ) (lv_language_5= ruleLanguage ) (lv_filestogenerate_6= RULE_STRING ) (lv_identification_7= ruleClassIdentification ) (lv_comments_8= ruleComments ) (lv_hasMandatoryProperty_9= ruleBoolean ) (lv_hasAbstractCommand_10= ruleBoolean ) (lv_hasAbstractAttribute_11= ruleBoolean ) (lv_descriptionHtmlExists_12= ruleBoolean ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1093:1: ( (lv_description_0= RULE_STRING ) (lv_title_1= RULE_STRING ) (lv_sourcePath_2= RULE_STRING ) 'inheritances:' (lv_inheritances_4= ruleInheritance ) (lv_language_5= ruleLanguage ) (lv_filestogenerate_6= RULE_STRING ) (lv_identification_7= ruleClassIdentification ) (lv_comments_8= ruleComments ) (lv_hasMandatoryProperty_9= ruleBoolean ) (lv_hasAbstractCommand_10= ruleBoolean ) (lv_hasAbstractAttribute_11= ruleBoolean ) (lv_descriptionHtmlExists_12= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1093:2: (lv_description_0= RULE_STRING ) (lv_title_1= RULE_STRING ) (lv_sourcePath_2= RULE_STRING ) 'inheritances:' (lv_inheritances_4= ruleInheritance ) (lv_language_5= ruleLanguage ) (lv_filestogenerate_6= RULE_STRING ) (lv_identification_7= ruleClassIdentification ) (lv_comments_8= ruleComments ) (lv_hasMandatoryProperty_9= ruleBoolean ) (lv_hasAbstractCommand_10= ruleBoolean ) (lv_hasAbstractAttribute_11= ruleBoolean ) (lv_descriptionHtmlExists_12= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1093:2: (lv_description_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1095:6: lv_description_0= RULE_STRING
            {
            lv_description_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassDescription2311); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1113:2: (lv_title_1= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1115:6: lv_title_1= RULE_STRING
            {
            lv_title_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassDescription2341); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1133:2: (lv_sourcePath_2= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1135:6: lv_sourcePath_2= RULE_STRING
            {
            lv_sourcePath_2=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassDescription2371); 

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

            match(input,16,FOLLOW_16_in_ruleClassDescription2388); 

                    createLeafNode(grammarAccess.getClassDescriptionAccess().getInheritancesKeyword_3(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1157:1: (lv_inheritances_4= ruleInheritance )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1160:6: lv_inheritances_4= ruleInheritance
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getClassDescriptionAccess().getInheritancesInheritanceParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInheritance_in_ruleClassDescription2422);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1178:2: (lv_language_5= ruleLanguage )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1181:6: lv_language_5= ruleLanguage
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getClassDescriptionAccess().getLanguageLanguageParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLanguage_in_ruleClassDescription2460);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1199:2: (lv_filestogenerate_6= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1201:6: lv_filestogenerate_6= RULE_STRING
            {
            lv_filestogenerate_6=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassDescription2486); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1219:2: (lv_identification_7= ruleClassIdentification )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1222:6: lv_identification_7= ruleClassIdentification
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getClassDescriptionAccess().getIdentificationClassIdentificationParserRuleCall_7_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleClassIdentification_in_ruleClassDescription2528);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1240:2: (lv_comments_8= ruleComments )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1243:6: lv_comments_8= ruleComments
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getClassDescriptionAccess().getCommentsCommentsParserRuleCall_8_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleComments_in_ruleClassDescription2566);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1261:2: (lv_hasMandatoryProperty_9= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1264:6: lv_hasMandatoryProperty_9= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getClassDescriptionAccess().getHasMandatoryPropertyBooleanParserRuleCall_9_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleClassDescription2604);
            lv_hasMandatoryProperty_9=ruleBoolean();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getClassDescriptionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "hasMandatoryProperty", lv_hasMandatoryProperty_9, "Boolean", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1282:2: (lv_hasAbstractCommand_10= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1285:6: lv_hasAbstractCommand_10= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getClassDescriptionAccess().getHasAbstractCommandBooleanParserRuleCall_10_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleClassDescription2642);
            lv_hasAbstractCommand_10=ruleBoolean();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getClassDescriptionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "hasAbstractCommand", lv_hasAbstractCommand_10, "Boolean", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1303:2: (lv_hasAbstractAttribute_11= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1306:6: lv_hasAbstractAttribute_11= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getClassDescriptionAccess().getHasAbstractAttributeBooleanParserRuleCall_11_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleClassDescription2680);
            lv_hasAbstractAttribute_11=ruleBoolean();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getClassDescriptionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "hasAbstractAttribute", lv_hasAbstractAttribute_11, "Boolean", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1324:2: (lv_descriptionHtmlExists_12= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1327:6: lv_descriptionHtmlExists_12= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getClassDescriptionAccess().getDescriptionHtmlExistsBooleanParserRuleCall_12_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleClassDescription2718);
            lv_descriptionHtmlExists_12=ruleBoolean();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getClassDescriptionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "descriptionHtmlExists", lv_descriptionHtmlExists_12, "Boolean", currentNode);
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1352:1: entryRuleInheritance returns [EObject current=null] : iv_ruleInheritance= ruleInheritance EOF ;
    public final EObject entryRuleInheritance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritance = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1352:53: (iv_ruleInheritance= ruleInheritance EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1353:2: iv_ruleInheritance= ruleInheritance EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInheritanceRule(), currentNode); 
            pushFollow(FOLLOW_ruleInheritance_in_entryRuleInheritance2755);
            iv_ruleInheritance=ruleInheritance();
            _fsp--;

             current =iv_ruleInheritance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInheritance2765); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1360:1: ruleInheritance returns [EObject current=null] : ( (lv_classname_0= RULE_STRING ) (lv_sourcePath_1= RULE_STRING ) ) ;
    public final EObject ruleInheritance() throws RecognitionException {
        EObject current = null;

        Token lv_classname_0=null;
        Token lv_sourcePath_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1365:6: ( ( (lv_classname_0= RULE_STRING ) (lv_sourcePath_1= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1366:1: ( (lv_classname_0= RULE_STRING ) (lv_sourcePath_1= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1366:1: ( (lv_classname_0= RULE_STRING ) (lv_sourcePath_1= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1366:2: (lv_classname_0= RULE_STRING ) (lv_sourcePath_1= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1366:2: (lv_classname_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1368:6: lv_classname_0= RULE_STRING
            {
            lv_classname_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInheritance2812); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1386:2: (lv_sourcePath_1= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1388:6: lv_sourcePath_1= RULE_STRING
            {
            lv_sourcePath_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInheritance2842); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1413:1: entryRuleClassIdentification returns [EObject current=null] : iv_ruleClassIdentification= ruleClassIdentification EOF ;
    public final EObject entryRuleClassIdentification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassIdentification = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1413:61: (iv_ruleClassIdentification= ruleClassIdentification EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1414:2: iv_ruleClassIdentification= ruleClassIdentification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getClassIdentificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleClassIdentification_in_entryRuleClassIdentification2883);
            iv_ruleClassIdentification=ruleClassIdentification();
            _fsp--;

             current =iv_ruleClassIdentification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassIdentification2893); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1421:1: ruleClassIdentification returns [EObject current=null] : ( (lv_contact_0= RULE_STRING ) (lv_author_1= RULE_STRING ) (lv_emailDomain_2= RULE_STRING ) (lv_classFamily_3= RULE_STRING ) (lv_siteSpecific_4= RULE_STRING ) (lv_platform_5= RULE_STRING ) (lv_bus_6= RULE_STRING ) (lv_manufacturer_7= RULE_STRING ) (lv_reference_8= RULE_STRING ) ) ;
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
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1426:6: ( ( (lv_contact_0= RULE_STRING ) (lv_author_1= RULE_STRING ) (lv_emailDomain_2= RULE_STRING ) (lv_classFamily_3= RULE_STRING ) (lv_siteSpecific_4= RULE_STRING ) (lv_platform_5= RULE_STRING ) (lv_bus_6= RULE_STRING ) (lv_manufacturer_7= RULE_STRING ) (lv_reference_8= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1427:1: ( (lv_contact_0= RULE_STRING ) (lv_author_1= RULE_STRING ) (lv_emailDomain_2= RULE_STRING ) (lv_classFamily_3= RULE_STRING ) (lv_siteSpecific_4= RULE_STRING ) (lv_platform_5= RULE_STRING ) (lv_bus_6= RULE_STRING ) (lv_manufacturer_7= RULE_STRING ) (lv_reference_8= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1427:1: ( (lv_contact_0= RULE_STRING ) (lv_author_1= RULE_STRING ) (lv_emailDomain_2= RULE_STRING ) (lv_classFamily_3= RULE_STRING ) (lv_siteSpecific_4= RULE_STRING ) (lv_platform_5= RULE_STRING ) (lv_bus_6= RULE_STRING ) (lv_manufacturer_7= RULE_STRING ) (lv_reference_8= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1427:2: (lv_contact_0= RULE_STRING ) (lv_author_1= RULE_STRING ) (lv_emailDomain_2= RULE_STRING ) (lv_classFamily_3= RULE_STRING ) (lv_siteSpecific_4= RULE_STRING ) (lv_platform_5= RULE_STRING ) (lv_bus_6= RULE_STRING ) (lv_manufacturer_7= RULE_STRING ) (lv_reference_8= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1427:2: (lv_contact_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1429:6: lv_contact_0= RULE_STRING
            {
            lv_contact_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2940); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1447:2: (lv_author_1= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1449:6: lv_author_1= RULE_STRING
            {
            lv_author_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification2970); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1467:2: (lv_emailDomain_2= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1469:6: lv_emailDomain_2= RULE_STRING
            {
            lv_emailDomain_2=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification3000); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1487:2: (lv_classFamily_3= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1489:6: lv_classFamily_3= RULE_STRING
            {
            lv_classFamily_3=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification3030); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1507:2: (lv_siteSpecific_4= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1509:6: lv_siteSpecific_4= RULE_STRING
            {
            lv_siteSpecific_4=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification3060); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1527:2: (lv_platform_5= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1529:6: lv_platform_5= RULE_STRING
            {
            lv_platform_5=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification3090); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1547:2: (lv_bus_6= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1549:6: lv_bus_6= RULE_STRING
            {
            lv_bus_6=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification3120); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1567:2: (lv_manufacturer_7= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1569:6: lv_manufacturer_7= RULE_STRING
            {
            lv_manufacturer_7=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification3150); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1587:2: (lv_reference_8= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1589:6: lv_reference_8= RULE_STRING
            {
            lv_reference_8=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassIdentification3180); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1614:1: entryRuleComments returns [EObject current=null] : iv_ruleComments= ruleComments EOF ;
    public final EObject entryRuleComments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComments = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1614:50: (iv_ruleComments= ruleComments EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1615:2: iv_ruleComments= ruleComments EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCommentsRule(), currentNode); 
            pushFollow(FOLLOW_ruleComments_in_entryRuleComments3221);
            iv_ruleComments=ruleComments();
            _fsp--;

             current =iv_ruleComments; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComments3231); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1622:1: ruleComments returns [EObject current=null] : (lv_commandsTable_0= RULE_STRING ) ;
    public final EObject ruleComments() throws RecognitionException {
        EObject current = null;

        Token lv_commandsTable_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1627:6: ( (lv_commandsTable_0= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1628:1: (lv_commandsTable_0= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1628:1: (lv_commandsTable_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1630:6: lv_commandsTable_0= RULE_STRING
            {
            lv_commandsTable_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleComments3277); 

            		createLeafNode(grammarAccess.getCommentsAccess().getCommandsTableSTRINGTerminalRuleCall_0(), "commandsTable"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCommentsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "commandsTable", lv_commandsTable_0, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1655:1: entryRulePreferences returns [EObject current=null] : iv_rulePreferences= rulePreferences EOF ;
    public final EObject entryRulePreferences() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreferences = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1655:53: (iv_rulePreferences= rulePreferences EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1656:2: iv_rulePreferences= rulePreferences EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPreferencesRule(), currentNode); 
            pushFollow(FOLLOW_rulePreferences_in_entryRulePreferences3317);
            iv_rulePreferences=rulePreferences();
            _fsp--;

             current =iv_rulePreferences; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePreferences3327); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1663:1: rulePreferences returns [EObject current=null] : ( (lv_docHome_0= RULE_STRING ) (lv_makefileHome_1= RULE_STRING ) (lv_installHome_2= RULE_STRING ) (lv_htmlVersion_3= ruleBoolean ) ) ;
    public final EObject rulePreferences() throws RecognitionException {
        EObject current = null;

        Token lv_docHome_0=null;
        Token lv_makefileHome_1=null;
        Token lv_installHome_2=null;
        AntlrDatatypeRuleToken lv_htmlVersion_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1668:6: ( ( (lv_docHome_0= RULE_STRING ) (lv_makefileHome_1= RULE_STRING ) (lv_installHome_2= RULE_STRING ) (lv_htmlVersion_3= ruleBoolean ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1669:1: ( (lv_docHome_0= RULE_STRING ) (lv_makefileHome_1= RULE_STRING ) (lv_installHome_2= RULE_STRING ) (lv_htmlVersion_3= ruleBoolean ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1669:1: ( (lv_docHome_0= RULE_STRING ) (lv_makefileHome_1= RULE_STRING ) (lv_installHome_2= RULE_STRING ) (lv_htmlVersion_3= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1669:2: (lv_docHome_0= RULE_STRING ) (lv_makefileHome_1= RULE_STRING ) (lv_installHome_2= RULE_STRING ) (lv_htmlVersion_3= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1669:2: (lv_docHome_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1671:6: lv_docHome_0= RULE_STRING
            {
            lv_docHome_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePreferences3374); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1689:2: (lv_makefileHome_1= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1691:6: lv_makefileHome_1= RULE_STRING
            {
            lv_makefileHome_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePreferences3404); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1709:2: (lv_installHome_2= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1711:6: lv_installHome_2= RULE_STRING
            {
            lv_installHome_2=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePreferences3434); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1729:2: (lv_htmlVersion_3= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1732:6: lv_htmlVersion_3= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPreferencesAccess().getHtmlVersionBooleanParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_rulePreferences3476);
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1757:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1757:47: (iv_ruleState= ruleState EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1758:2: iv_ruleState= ruleState EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStateRule(), currentNode); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState3513);
            iv_ruleState=ruleState();
            _fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState3523); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1765:1: ruleState returns [EObject current=null] : ( (lv_name_0= RULE_ID ) (lv_description_1= RULE_STRING ) (lv_status_2= ruleInheritanceStatus ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_description_1=null;
        EObject lv_status_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1770:6: ( ( (lv_name_0= RULE_ID ) (lv_description_1= RULE_STRING ) (lv_status_2= ruleInheritanceStatus ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1771:1: ( (lv_name_0= RULE_ID ) (lv_description_1= RULE_STRING ) (lv_status_2= ruleInheritanceStatus ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1771:1: ( (lv_name_0= RULE_ID ) (lv_description_1= RULE_STRING ) (lv_status_2= ruleInheritanceStatus ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1771:2: (lv_name_0= RULE_ID ) (lv_description_1= RULE_STRING ) (lv_status_2= ruleInheritanceStatus )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1771:2: (lv_name_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1773:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState3570); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1791:2: (lv_description_1= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1793:6: lv_description_1= RULE_STRING
            {
            lv_description_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState3600); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1811:2: (lv_status_2= ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1814:6: lv_status_2= ruleInheritanceStatus
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStatusInheritanceStatusParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInheritanceStatus_in_ruleState3642);
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1839:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1839:50: (iv_ruleProperty= ruleProperty EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1840:2: iv_ruleProperty= ruleProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty3679);
            iv_ruleProperty=ruleProperty();
            _fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty3689); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1847:1: ruleProperty returns [EObject current=null] : ( (lv_name_0= RULE_ID ) (lv_type_1= rulePropType ) (lv_status_2= ruleInheritanceStatus ) (lv_mandatory_3= ruleBoolean ) (lv_description_4= RULE_STRING ) 'defaultPropValue:' (lv_DefaultPropValue_6= RULE_STRING )* ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_description_4=null;
        Token lv_DefaultPropValue_6=null;
        EObject lv_type_1 = null;

        EObject lv_status_2 = null;

        AntlrDatatypeRuleToken lv_mandatory_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1852:6: ( ( (lv_name_0= RULE_ID ) (lv_type_1= rulePropType ) (lv_status_2= ruleInheritanceStatus ) (lv_mandatory_3= ruleBoolean ) (lv_description_4= RULE_STRING ) 'defaultPropValue:' (lv_DefaultPropValue_6= RULE_STRING )* ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1853:1: ( (lv_name_0= RULE_ID ) (lv_type_1= rulePropType ) (lv_status_2= ruleInheritanceStatus ) (lv_mandatory_3= ruleBoolean ) (lv_description_4= RULE_STRING ) 'defaultPropValue:' (lv_DefaultPropValue_6= RULE_STRING )* )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1853:1: ( (lv_name_0= RULE_ID ) (lv_type_1= rulePropType ) (lv_status_2= ruleInheritanceStatus ) (lv_mandatory_3= ruleBoolean ) (lv_description_4= RULE_STRING ) 'defaultPropValue:' (lv_DefaultPropValue_6= RULE_STRING )* )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1853:2: (lv_name_0= RULE_ID ) (lv_type_1= rulePropType ) (lv_status_2= ruleInheritanceStatus ) (lv_mandatory_3= ruleBoolean ) (lv_description_4= RULE_STRING ) 'defaultPropValue:' (lv_DefaultPropValue_6= RULE_STRING )*
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1853:2: (lv_name_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1855:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty3736); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1873:2: (lv_type_1= rulePropType )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1876:6: lv_type_1= rulePropType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getTypePropTypeParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePropType_in_ruleProperty3778);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1894:2: (lv_status_2= ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1897:6: lv_status_2= ruleInheritanceStatus
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getStatusInheritanceStatusParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInheritanceStatus_in_ruleProperty3816);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1915:2: (lv_mandatory_3= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1918:6: lv_mandatory_3= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getMandatoryBooleanParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleProperty3854);
            lv_mandatory_3=ruleBoolean();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "mandatory", lv_mandatory_3, "Boolean", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1936:2: (lv_description_4= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1938:6: lv_description_4= RULE_STRING
            {
            lv_description_4=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProperty3880); 

            		createLeafNode(grammarAccess.getPropertyAccess().getDescriptionSTRINGTerminalRuleCall_4_0(), "description"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "description", lv_description_4, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,43,FOLLOW_43_in_ruleProperty3897); 

                    createLeafNode(grammarAccess.getPropertyAccess().getDefaultPropValueKeyword_5(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1960:1: (lv_DefaultPropValue_6= RULE_STRING )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_STRING) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1962:6: lv_DefaultPropValue_6= RULE_STRING
            	    {
            	    lv_DefaultPropValue_6=(Token)input.LT(1);
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProperty3919); 

            	    		createLeafNode(grammarAccess.getPropertyAccess().getDefaultPropValueSTRINGTerminalRuleCall_6_0(), "DefaultPropValue"); 
            	    	

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "DefaultPropValue", lv_DefaultPropValue_6, "STRING", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1987:1: entryRulePropType returns [EObject current=null] : iv_rulePropType= rulePropType EOF ;
    public final EObject entryRulePropType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1987:50: (iv_rulePropType= rulePropType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1988:2: iv_rulePropType= rulePropType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropTypeRule(), currentNode); 
            pushFollow(FOLLOW_rulePropType_in_entryRulePropType3961);
            iv_rulePropType=rulePropType();
            _fsp--;

             current =iv_rulePropType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropType3971); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:1995:1: rulePropType returns [EObject current=null] : (this_SimpleType_0= ruleSimpleType | this_VectorType_1= ruleVectorType ) ;
    public final EObject rulePropType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleType_0 = null;

        EObject this_VectorType_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2000:6: ( (this_SimpleType_0= ruleSimpleType | this_VectorType_1= ruleVectorType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2001:1: (this_SimpleType_0= ruleSimpleType | this_VectorType_1= ruleVectorType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2001:1: (this_SimpleType_0= ruleSimpleType | this_VectorType_1= ruleVectorType )
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
                    new NoViableAltException("2001:1: (this_SimpleType_0= ruleSimpleType | this_VectorType_1= ruleVectorType )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2002:5: this_SimpleType_0= ruleSimpleType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropTypeAccess().getSimpleTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSimpleType_in_rulePropType4018);
                    this_SimpleType_0=ruleSimpleType();
                    _fsp--;

                     
                            current = this_SimpleType_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2012:5: this_VectorType_1= ruleVectorType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropTypeAccess().getVectorTypeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVectorType_in_rulePropType4045);
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2027:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2027:52: (iv_ruleSimpleType= ruleSimpleType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2028:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSimpleTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType4077);
            iv_ruleSimpleType=ruleSimpleType();
            _fsp--;

             current =iv_ruleSimpleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType4087); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2035:1: ruleSimpleType returns [EObject current=null] : (this_BooleanType_0= ruleBooleanType | this_ShortType_1= ruleShortType | this_UShortType_2= ruleUShortType | this_IntType_3= ruleIntType | this_UIntType_4= ruleUIntType | this_FloatType_5= ruleFloatType | this_DoubleType_6= ruleDoubleType | this_StringType_7= ruleStringType ) ;
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
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2040:6: ( (this_BooleanType_0= ruleBooleanType | this_ShortType_1= ruleShortType | this_UShortType_2= ruleUShortType | this_IntType_3= ruleIntType | this_UIntType_4= ruleUIntType | this_FloatType_5= ruleFloatType | this_DoubleType_6= ruleDoubleType | this_StringType_7= ruleStringType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2041:1: (this_BooleanType_0= ruleBooleanType | this_ShortType_1= ruleShortType | this_UShortType_2= ruleUShortType | this_IntType_3= ruleIntType | this_UIntType_4= ruleUIntType | this_FloatType_5= ruleFloatType | this_DoubleType_6= ruleDoubleType | this_StringType_7= ruleStringType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2041:1: (this_BooleanType_0= ruleBooleanType | this_ShortType_1= ruleShortType | this_UShortType_2= ruleUShortType | this_IntType_3= ruleIntType | this_UIntType_4= ruleUIntType | this_FloatType_5= ruleFloatType | this_DoubleType_6= ruleDoubleType | this_StringType_7= ruleStringType )
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
                    new NoViableAltException("2041:1: (this_BooleanType_0= ruleBooleanType | this_ShortType_1= ruleShortType | this_UShortType_2= ruleUShortType | this_IntType_3= ruleIntType | this_UIntType_4= ruleUIntType | this_FloatType_5= ruleFloatType | this_DoubleType_6= ruleDoubleType | this_StringType_7= ruleStringType )", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2042:5: this_BooleanType_0= ruleBooleanType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSimpleTypeAccess().getBooleanTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBooleanType_in_ruleSimpleType4134);
                    this_BooleanType_0=ruleBooleanType();
                    _fsp--;

                     
                            current = this_BooleanType_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2052:5: this_ShortType_1= ruleShortType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSimpleTypeAccess().getShortTypeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleShortType_in_ruleSimpleType4161);
                    this_ShortType_1=ruleShortType();
                    _fsp--;

                     
                            current = this_ShortType_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2062:5: this_UShortType_2= ruleUShortType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSimpleTypeAccess().getUShortTypeParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUShortType_in_ruleSimpleType4188);
                    this_UShortType_2=ruleUShortType();
                    _fsp--;

                     
                            current = this_UShortType_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2072:5: this_IntType_3= ruleIntType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSimpleTypeAccess().getIntTypeParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntType_in_ruleSimpleType4215);
                    this_IntType_3=ruleIntType();
                    _fsp--;

                     
                            current = this_IntType_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2082:5: this_UIntType_4= ruleUIntType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSimpleTypeAccess().getUIntTypeParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUIntType_in_ruleSimpleType4242);
                    this_UIntType_4=ruleUIntType();
                    _fsp--;

                     
                            current = this_UIntType_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2092:5: this_FloatType_5= ruleFloatType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSimpleTypeAccess().getFloatTypeParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFloatType_in_ruleSimpleType4269);
                    this_FloatType_5=ruleFloatType();
                    _fsp--;

                     
                            current = this_FloatType_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2102:5: this_DoubleType_6= ruleDoubleType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSimpleTypeAccess().getDoubleTypeParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDoubleType_in_ruleSimpleType4296);
                    this_DoubleType_6=ruleDoubleType();
                    _fsp--;

                     
                            current = this_DoubleType_6; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 8 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2112:5: this_StringType_7= ruleStringType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSimpleTypeAccess().getStringTypeParserRuleCall_7(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringType_in_ruleSimpleType4323);
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2127:1: entryRuleVectorType returns [EObject current=null] : iv_ruleVectorType= ruleVectorType EOF ;
    public final EObject entryRuleVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2127:52: (iv_ruleVectorType= ruleVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2128:2: iv_ruleVectorType= ruleVectorType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVectorTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleVectorType_in_entryRuleVectorType4355);
            iv_ruleVectorType=ruleVectorType();
            _fsp--;

             current =iv_ruleVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVectorType4365); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2135:1: ruleVectorType returns [EObject current=null] : (this_ShortVectorType_0= ruleShortVectorType | this_IntVectorType_1= ruleIntVectorType | this_FloatVectorType_2= ruleFloatVectorType | this_DoubleVectorType_3= ruleDoubleVectorType | this_StringVectorType_4= ruleStringVectorType ) ;
    public final EObject ruleVectorType() throws RecognitionException {
        EObject current = null;

        EObject this_ShortVectorType_0 = null;

        EObject this_IntVectorType_1 = null;

        EObject this_FloatVectorType_2 = null;

        EObject this_DoubleVectorType_3 = null;

        EObject this_StringVectorType_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2140:6: ( (this_ShortVectorType_0= ruleShortVectorType | this_IntVectorType_1= ruleIntVectorType | this_FloatVectorType_2= ruleFloatVectorType | this_DoubleVectorType_3= ruleDoubleVectorType | this_StringVectorType_4= ruleStringVectorType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2141:1: (this_ShortVectorType_0= ruleShortVectorType | this_IntVectorType_1= ruleIntVectorType | this_FloatVectorType_2= ruleFloatVectorType | this_DoubleVectorType_3= ruleDoubleVectorType | this_StringVectorType_4= ruleStringVectorType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2141:1: (this_ShortVectorType_0= ruleShortVectorType | this_IntVectorType_1= ruleIntVectorType | this_FloatVectorType_2= ruleFloatVectorType | this_DoubleVectorType_3= ruleDoubleVectorType | this_StringVectorType_4= ruleStringVectorType )
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
                    new NoViableAltException("2141:1: (this_ShortVectorType_0= ruleShortVectorType | this_IntVectorType_1= ruleIntVectorType | this_FloatVectorType_2= ruleFloatVectorType | this_DoubleVectorType_3= ruleDoubleVectorType | this_StringVectorType_4= ruleStringVectorType )", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2142:5: this_ShortVectorType_0= ruleShortVectorType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getVectorTypeAccess().getShortVectorTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleShortVectorType_in_ruleVectorType4412);
                    this_ShortVectorType_0=ruleShortVectorType();
                    _fsp--;

                     
                            current = this_ShortVectorType_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2152:5: this_IntVectorType_1= ruleIntVectorType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getVectorTypeAccess().getIntVectorTypeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntVectorType_in_ruleVectorType4439);
                    this_IntVectorType_1=ruleIntVectorType();
                    _fsp--;

                     
                            current = this_IntVectorType_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2162:5: this_FloatVectorType_2= ruleFloatVectorType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getVectorTypeAccess().getFloatVectorTypeParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFloatVectorType_in_ruleVectorType4466);
                    this_FloatVectorType_2=ruleFloatVectorType();
                    _fsp--;

                     
                            current = this_FloatVectorType_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2172:5: this_DoubleVectorType_3= ruleDoubleVectorType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getVectorTypeAccess().getDoubleVectorTypeParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDoubleVectorType_in_ruleVectorType4493);
                    this_DoubleVectorType_3=ruleDoubleVectorType();
                    _fsp--;

                     
                            current = this_DoubleVectorType_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2182:5: this_StringVectorType_4= ruleStringVectorType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getVectorTypeAccess().getStringVectorTypeParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringVectorType_in_ruleVectorType4520);
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2197:1: entryRuleInheritanceStatus returns [EObject current=null] : iv_ruleInheritanceStatus= ruleInheritanceStatus EOF ;
    public final EObject entryRuleInheritanceStatus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritanceStatus = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2197:59: (iv_ruleInheritanceStatus= ruleInheritanceStatus EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2198:2: iv_ruleInheritanceStatus= ruleInheritanceStatus EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInheritanceStatusRule(), currentNode); 
            pushFollow(FOLLOW_ruleInheritanceStatus_in_entryRuleInheritanceStatus4552);
            iv_ruleInheritanceStatus=ruleInheritanceStatus();
            _fsp--;

             current =iv_ruleInheritanceStatus; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInheritanceStatus4562); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2205:1: ruleInheritanceStatus returns [EObject current=null] : ( (lv_abstract_0= ruleBoolean ) (lv_inherited_1= ruleBoolean ) (lv_concrete_2= ruleBoolean ) (lv_concreteHere_3= ruleBoolean ) (lv_hasChanged_4= RULE_STRING ) ) ;
    public final EObject ruleInheritanceStatus() throws RecognitionException {
        EObject current = null;

        Token lv_hasChanged_4=null;
        AntlrDatatypeRuleToken lv_abstract_0 = null;

        AntlrDatatypeRuleToken lv_inherited_1 = null;

        AntlrDatatypeRuleToken lv_concrete_2 = null;

        AntlrDatatypeRuleToken lv_concreteHere_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2210:6: ( ( (lv_abstract_0= ruleBoolean ) (lv_inherited_1= ruleBoolean ) (lv_concrete_2= ruleBoolean ) (lv_concreteHere_3= ruleBoolean ) (lv_hasChanged_4= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2211:1: ( (lv_abstract_0= ruleBoolean ) (lv_inherited_1= ruleBoolean ) (lv_concrete_2= ruleBoolean ) (lv_concreteHere_3= ruleBoolean ) (lv_hasChanged_4= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2211:1: ( (lv_abstract_0= ruleBoolean ) (lv_inherited_1= ruleBoolean ) (lv_concrete_2= ruleBoolean ) (lv_concreteHere_3= ruleBoolean ) (lv_hasChanged_4= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2211:2: (lv_abstract_0= ruleBoolean ) (lv_inherited_1= ruleBoolean ) (lv_concrete_2= ruleBoolean ) (lv_concreteHere_3= ruleBoolean ) (lv_hasChanged_4= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2211:2: (lv_abstract_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2214:6: lv_abstract_0= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInheritanceStatusAccess().getAbstractBooleanParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleInheritanceStatus4621);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2232:2: (lv_inherited_1= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2235:6: lv_inherited_1= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInheritanceStatusAccess().getInheritedBooleanParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleInheritanceStatus4659);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2253:2: (lv_concrete_2= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2256:6: lv_concrete_2= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInheritanceStatusAccess().getConcreteBooleanParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleInheritanceStatus4697);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2274:2: (lv_concreteHere_3= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2277:6: lv_concreteHere_3= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInheritanceStatusAccess().getConcreteHereBooleanParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleInheritanceStatus4735);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2295:2: (lv_hasChanged_4= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2297:6: lv_hasChanged_4= RULE_STRING
            {
            lv_hasChanged_4=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInheritanceStatus4761); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2322:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2322:49: (iv_ruleCommand= ruleCommand EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2323:2: iv_ruleCommand= ruleCommand EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCommandRule(), currentNode); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand4802);
            iv_ruleCommand=ruleCommand();
            _fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand4812); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2330:1: ruleCommand returns [EObject current=null] : ( (lv_name_0= RULE_ID ) (lv_argin_1= ruleArgument ) (lv_argout_2= ruleArgument ) (lv_description_3= RULE_STRING ) (lv_status_4= ruleInheritanceStatus ) (lv_execMethod_5= RULE_STRING ) (lv_displayLevel_6= ruleDisplayLevel ) (lv_polledPeriod_7= RULE_STRING ) 'excludedStates:' (lv_excludedStates_9= RULE_STRING )* ) ;
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
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2335:6: ( ( (lv_name_0= RULE_ID ) (lv_argin_1= ruleArgument ) (lv_argout_2= ruleArgument ) (lv_description_3= RULE_STRING ) (lv_status_4= ruleInheritanceStatus ) (lv_execMethod_5= RULE_STRING ) (lv_displayLevel_6= ruleDisplayLevel ) (lv_polledPeriod_7= RULE_STRING ) 'excludedStates:' (lv_excludedStates_9= RULE_STRING )* ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2336:1: ( (lv_name_0= RULE_ID ) (lv_argin_1= ruleArgument ) (lv_argout_2= ruleArgument ) (lv_description_3= RULE_STRING ) (lv_status_4= ruleInheritanceStatus ) (lv_execMethod_5= RULE_STRING ) (lv_displayLevel_6= ruleDisplayLevel ) (lv_polledPeriod_7= RULE_STRING ) 'excludedStates:' (lv_excludedStates_9= RULE_STRING )* )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2336:1: ( (lv_name_0= RULE_ID ) (lv_argin_1= ruleArgument ) (lv_argout_2= ruleArgument ) (lv_description_3= RULE_STRING ) (lv_status_4= ruleInheritanceStatus ) (lv_execMethod_5= RULE_STRING ) (lv_displayLevel_6= ruleDisplayLevel ) (lv_polledPeriod_7= RULE_STRING ) 'excludedStates:' (lv_excludedStates_9= RULE_STRING )* )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2336:2: (lv_name_0= RULE_ID ) (lv_argin_1= ruleArgument ) (lv_argout_2= ruleArgument ) (lv_description_3= RULE_STRING ) (lv_status_4= ruleInheritanceStatus ) (lv_execMethod_5= RULE_STRING ) (lv_displayLevel_6= ruleDisplayLevel ) (lv_polledPeriod_7= RULE_STRING ) 'excludedStates:' (lv_excludedStates_9= RULE_STRING )*
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2336:2: (lv_name_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2338:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand4859); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2356:2: (lv_argin_1= ruleArgument )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2359:6: lv_argin_1= ruleArgument
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getArginArgumentParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleArgument_in_ruleCommand4901);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2377:2: (lv_argout_2= ruleArgument )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2380:6: lv_argout_2= ruleArgument
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getArgoutArgumentParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleArgument_in_ruleCommand4939);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2398:2: (lv_description_3= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2400:6: lv_description_3= RULE_STRING
            {
            lv_description_3=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommand4965); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2418:2: (lv_status_4= ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2421:6: lv_status_4= ruleInheritanceStatus
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getStatusInheritanceStatusParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInheritanceStatus_in_ruleCommand5007);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2439:2: (lv_execMethod_5= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2441:6: lv_execMethod_5= RULE_STRING
            {
            lv_execMethod_5=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommand5033); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2459:2: (lv_displayLevel_6= ruleDisplayLevel )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2462:6: lv_displayLevel_6= ruleDisplayLevel
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getDisplayLevelDisplayLevelParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDisplayLevel_in_ruleCommand5075);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2480:2: (lv_polledPeriod_7= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2482:6: lv_polledPeriod_7= RULE_STRING
            {
            lv_polledPeriod_7=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommand5101); 

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

            match(input,44,FOLLOW_44_in_ruleCommand5118); 

                    createLeafNode(grammarAccess.getCommandAccess().getExcludedStatesKeyword_8(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2504:1: (lv_excludedStates_9= RULE_STRING )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_STRING) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2506:6: lv_excludedStates_9= RULE_STRING
            	    {
            	    lv_excludedStates_9=(Token)input.LT(1);
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommand5140); 

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
            	    break loop23;
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2531:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2531:50: (iv_ruleArgument= ruleArgument EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2532:2: iv_ruleArgument= ruleArgument EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArgumentRule(), currentNode); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument5182);
            iv_ruleArgument=ruleArgument();
            _fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument5192); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2539:1: ruleArgument returns [EObject current=null] : ( (lv_type_0= ruleType ) (lv_description_1= RULE_STRING ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_description_1=null;
        EObject lv_type_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2544:6: ( ( (lv_type_0= ruleType ) (lv_description_1= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2545:1: ( (lv_type_0= ruleType ) (lv_description_1= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2545:1: ( (lv_type_0= ruleType ) (lv_description_1= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2545:2: (lv_type_0= ruleType ) (lv_description_1= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2545:2: (lv_type_0= ruleType )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2548:6: lv_type_0= ruleType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getTypeTypeParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleArgument5251);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2566:2: (lv_description_1= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2568:6: lv_description_1= RULE_STRING
            {
            lv_description_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument5277); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2593:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2593:51: (iv_ruleAttribute= ruleAttribute EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2594:2: iv_ruleAttribute= ruleAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute5318);
            iv_ruleAttribute=ruleAttribute();
            _fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute5328); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2601:1: ruleAttribute returns [EObject current=null] : ( (lv_name_0= RULE_ID ) (lv_attType_1= ruleAttrType ) (lv_dataType_2= ruleType ) (lv_rwType_3= ruleRW_Type ) (lv_displayLevel_4= ruleDisplayLevel ) (lv_polledPeriod_5= RULE_STRING ) (lv_maxX_6= RULE_STRING ) (lv_maxY_7= RULE_STRING ) (lv_associatedAttr_8= RULE_STRING ) (lv_memorized_9= ruleBoolean ) (lv_memorizedAtInit_10= ruleBoolean ) (lv_changeEvent_11= ruleFireEvents ) (lv_archiveEvent_12= ruleFireEvents ) (lv_dataReadyEvent_13= ruleFireEvents ) (lv_status_14= ruleInheritanceStatus ) (lv_properties_15= ruleAttrProperties ) (lv_allocReadMember_16= ruleBoolean ) (lv_isDynamic_17= ruleBoolean ) 'readExcludedStates:' (lv_readExcludedStates_19= RULE_STRING )* 'writeExcludedStates:' (lv_writeExcludedStates_21= RULE_STRING )* ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_polledPeriod_5=null;
        Token lv_maxX_6=null;
        Token lv_maxY_7=null;
        Token lv_associatedAttr_8=null;
        Token lv_readExcludedStates_19=null;
        Token lv_writeExcludedStates_21=null;
        AntlrDatatypeRuleToken lv_attType_1 = null;

        EObject lv_dataType_2 = null;

        AntlrDatatypeRuleToken lv_rwType_3 = null;

        AntlrDatatypeRuleToken lv_displayLevel_4 = null;

        AntlrDatatypeRuleToken lv_memorized_9 = null;

        AntlrDatatypeRuleToken lv_memorizedAtInit_10 = null;

        EObject lv_changeEvent_11 = null;

        EObject lv_archiveEvent_12 = null;

        EObject lv_dataReadyEvent_13 = null;

        EObject lv_status_14 = null;

        EObject lv_properties_15 = null;

        AntlrDatatypeRuleToken lv_allocReadMember_16 = null;

        AntlrDatatypeRuleToken lv_isDynamic_17 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2606:6: ( ( (lv_name_0= RULE_ID ) (lv_attType_1= ruleAttrType ) (lv_dataType_2= ruleType ) (lv_rwType_3= ruleRW_Type ) (lv_displayLevel_4= ruleDisplayLevel ) (lv_polledPeriod_5= RULE_STRING ) (lv_maxX_6= RULE_STRING ) (lv_maxY_7= RULE_STRING ) (lv_associatedAttr_8= RULE_STRING ) (lv_memorized_9= ruleBoolean ) (lv_memorizedAtInit_10= ruleBoolean ) (lv_changeEvent_11= ruleFireEvents ) (lv_archiveEvent_12= ruleFireEvents ) (lv_dataReadyEvent_13= ruleFireEvents ) (lv_status_14= ruleInheritanceStatus ) (lv_properties_15= ruleAttrProperties ) (lv_allocReadMember_16= ruleBoolean ) (lv_isDynamic_17= ruleBoolean ) 'readExcludedStates:' (lv_readExcludedStates_19= RULE_STRING )* 'writeExcludedStates:' (lv_writeExcludedStates_21= RULE_STRING )* ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2607:1: ( (lv_name_0= RULE_ID ) (lv_attType_1= ruleAttrType ) (lv_dataType_2= ruleType ) (lv_rwType_3= ruleRW_Type ) (lv_displayLevel_4= ruleDisplayLevel ) (lv_polledPeriod_5= RULE_STRING ) (lv_maxX_6= RULE_STRING ) (lv_maxY_7= RULE_STRING ) (lv_associatedAttr_8= RULE_STRING ) (lv_memorized_9= ruleBoolean ) (lv_memorizedAtInit_10= ruleBoolean ) (lv_changeEvent_11= ruleFireEvents ) (lv_archiveEvent_12= ruleFireEvents ) (lv_dataReadyEvent_13= ruleFireEvents ) (lv_status_14= ruleInheritanceStatus ) (lv_properties_15= ruleAttrProperties ) (lv_allocReadMember_16= ruleBoolean ) (lv_isDynamic_17= ruleBoolean ) 'readExcludedStates:' (lv_readExcludedStates_19= RULE_STRING )* 'writeExcludedStates:' (lv_writeExcludedStates_21= RULE_STRING )* )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2607:1: ( (lv_name_0= RULE_ID ) (lv_attType_1= ruleAttrType ) (lv_dataType_2= ruleType ) (lv_rwType_3= ruleRW_Type ) (lv_displayLevel_4= ruleDisplayLevel ) (lv_polledPeriod_5= RULE_STRING ) (lv_maxX_6= RULE_STRING ) (lv_maxY_7= RULE_STRING ) (lv_associatedAttr_8= RULE_STRING ) (lv_memorized_9= ruleBoolean ) (lv_memorizedAtInit_10= ruleBoolean ) (lv_changeEvent_11= ruleFireEvents ) (lv_archiveEvent_12= ruleFireEvents ) (lv_dataReadyEvent_13= ruleFireEvents ) (lv_status_14= ruleInheritanceStatus ) (lv_properties_15= ruleAttrProperties ) (lv_allocReadMember_16= ruleBoolean ) (lv_isDynamic_17= ruleBoolean ) 'readExcludedStates:' (lv_readExcludedStates_19= RULE_STRING )* 'writeExcludedStates:' (lv_writeExcludedStates_21= RULE_STRING )* )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2607:2: (lv_name_0= RULE_ID ) (lv_attType_1= ruleAttrType ) (lv_dataType_2= ruleType ) (lv_rwType_3= ruleRW_Type ) (lv_displayLevel_4= ruleDisplayLevel ) (lv_polledPeriod_5= RULE_STRING ) (lv_maxX_6= RULE_STRING ) (lv_maxY_7= RULE_STRING ) (lv_associatedAttr_8= RULE_STRING ) (lv_memorized_9= ruleBoolean ) (lv_memorizedAtInit_10= ruleBoolean ) (lv_changeEvent_11= ruleFireEvents ) (lv_archiveEvent_12= ruleFireEvents ) (lv_dataReadyEvent_13= ruleFireEvents ) (lv_status_14= ruleInheritanceStatus ) (lv_properties_15= ruleAttrProperties ) (lv_allocReadMember_16= ruleBoolean ) (lv_isDynamic_17= ruleBoolean ) 'readExcludedStates:' (lv_readExcludedStates_19= RULE_STRING )* 'writeExcludedStates:' (lv_writeExcludedStates_21= RULE_STRING )*
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2607:2: (lv_name_0= RULE_ID )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2609:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute5375); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2627:2: (lv_attType_1= ruleAttrType )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2630:6: lv_attType_1= ruleAttrType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getAttTypeAttrTypeParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAttrType_in_ruleAttribute5417);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2648:2: (lv_dataType_2= ruleType )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2651:6: lv_dataType_2= ruleType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getDataTypeTypeParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleAttribute5455);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2669:2: (lv_rwType_3= ruleRW_Type )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2672:6: lv_rwType_3= ruleRW_Type
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getRwTypeRW_TypeParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleRW_Type_in_ruleAttribute5493);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2690:2: (lv_displayLevel_4= ruleDisplayLevel )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2693:6: lv_displayLevel_4= ruleDisplayLevel
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getDisplayLevelDisplayLevelParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDisplayLevel_in_ruleAttribute5531);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2711:2: (lv_polledPeriod_5= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2713:6: lv_polledPeriod_5= RULE_STRING
            {
            lv_polledPeriod_5=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute5557); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2731:2: (lv_maxX_6= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2733:6: lv_maxX_6= RULE_STRING
            {
            lv_maxX_6=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute5587); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2751:2: (lv_maxY_7= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2753:6: lv_maxY_7= RULE_STRING
            {
            lv_maxY_7=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute5617); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2771:2: (lv_associatedAttr_8= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2773:6: lv_associatedAttr_8= RULE_STRING
            {
            lv_associatedAttr_8=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute5647); 

            		createLeafNode(grammarAccess.getAttributeAccess().getAssociatedAttrSTRINGTerminalRuleCall_8_0(), "associatedAttr"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "associatedAttr", lv_associatedAttr_8, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2791:2: (lv_memorized_9= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2794:6: lv_memorized_9= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getMemorizedBooleanParserRuleCall_9_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleAttribute5689);
            lv_memorized_9=ruleBoolean();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "memorized", lv_memorized_9, "Boolean", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2812:2: (lv_memorizedAtInit_10= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2815:6: lv_memorizedAtInit_10= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getMemorizedAtInitBooleanParserRuleCall_10_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleAttribute5727);
            lv_memorizedAtInit_10=ruleBoolean();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "memorizedAtInit", lv_memorizedAtInit_10, "Boolean", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2833:2: (lv_changeEvent_11= ruleFireEvents )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2836:6: lv_changeEvent_11= ruleFireEvents
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getChangeEventFireEventsParserRuleCall_11_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFireEvents_in_ruleAttribute5765);
            lv_changeEvent_11=ruleFireEvents();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "changeEvent", lv_changeEvent_11, "FireEvents", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2854:2: (lv_archiveEvent_12= ruleFireEvents )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2857:6: lv_archiveEvent_12= ruleFireEvents
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getArchiveEventFireEventsParserRuleCall_12_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFireEvents_in_ruleAttribute5803);
            lv_archiveEvent_12=ruleFireEvents();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "archiveEvent", lv_archiveEvent_12, "FireEvents", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2875:2: (lv_dataReadyEvent_13= ruleFireEvents )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2878:6: lv_dataReadyEvent_13= ruleFireEvents
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getDataReadyEventFireEventsParserRuleCall_13_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFireEvents_in_ruleAttribute5841);
            lv_dataReadyEvent_13=ruleFireEvents();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "dataReadyEvent", lv_dataReadyEvent_13, "FireEvents", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2896:2: (lv_status_14= ruleInheritanceStatus )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2899:6: lv_status_14= ruleInheritanceStatus
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getStatusInheritanceStatusParserRuleCall_14_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInheritanceStatus_in_ruleAttribute5879);
            lv_status_14=ruleInheritanceStatus();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "status", lv_status_14, "InheritanceStatus", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2917:2: (lv_properties_15= ruleAttrProperties )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2920:6: lv_properties_15= ruleAttrProperties
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getPropertiesAttrPropertiesParserRuleCall_15_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAttrProperties_in_ruleAttribute5917);
            lv_properties_15=ruleAttrProperties();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "properties", lv_properties_15, "AttrProperties", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2938:2: (lv_allocReadMember_16= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2941:6: lv_allocReadMember_16= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getAllocReadMemberBooleanParserRuleCall_16_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleAttribute5955);
            lv_allocReadMember_16=ruleBoolean();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "allocReadMember", lv_allocReadMember_16, "Boolean", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2959:2: (lv_isDynamic_17= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2962:6: lv_isDynamic_17= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getIsDynamicBooleanParserRuleCall_17_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleAttribute5993);
            lv_isDynamic_17=ruleBoolean();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "isDynamic", lv_isDynamic_17, "Boolean", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,45,FOLLOW_45_in_ruleAttribute6006); 

                    createLeafNode(grammarAccess.getAttributeAccess().getReadExcludedStatesKeyword_18(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2984:1: (lv_readExcludedStates_19= RULE_STRING )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_STRING) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:2986:6: lv_readExcludedStates_19= RULE_STRING
            	    {
            	    lv_readExcludedStates_19=(Token)input.LT(1);
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute6028); 

            	    		createLeafNode(grammarAccess.getAttributeAccess().getReadExcludedStatesSTRINGTerminalRuleCall_19_0(), "readExcludedStates"); 
            	    	

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "readExcludedStates", lv_readExcludedStates_19, "STRING", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            match(input,46,FOLLOW_46_in_ruleAttribute6046); 

                    createLeafNode(grammarAccess.getAttributeAccess().getWriteExcludedStatesKeyword_20(), null); 
                
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3008:1: (lv_writeExcludedStates_21= RULE_STRING )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_STRING) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3010:6: lv_writeExcludedStates_21= RULE_STRING
            	    {
            	    lv_writeExcludedStates_21=(Token)input.LT(1);
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute6068); 

            	    		createLeafNode(grammarAccess.getAttributeAccess().getWriteExcludedStatesSTRINGTerminalRuleCall_21_0(), "writeExcludedStates"); 
            	    	

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "writeExcludedStates", lv_writeExcludedStates_21, "STRING", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3035:1: entryRuleFireEvents returns [EObject current=null] : iv_ruleFireEvents= ruleFireEvents EOF ;
    public final EObject entryRuleFireEvents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFireEvents = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3035:52: (iv_ruleFireEvents= ruleFireEvents EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3036:2: iv_ruleFireEvents= ruleFireEvents EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFireEventsRule(), currentNode); 
            pushFollow(FOLLOW_ruleFireEvents_in_entryRuleFireEvents6110);
            iv_ruleFireEvents=ruleFireEvents();
            _fsp--;

             current =iv_ruleFireEvents; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFireEvents6120); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3043:1: ruleFireEvents returns [EObject current=null] : ( (lv_fire_0= ruleBoolean ) (lv_libCheckCriteria_1= ruleBoolean ) ) ;
    public final EObject ruleFireEvents() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_fire_0 = null;

        AntlrDatatypeRuleToken lv_libCheckCriteria_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3048:6: ( ( (lv_fire_0= ruleBoolean ) (lv_libCheckCriteria_1= ruleBoolean ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3049:1: ( (lv_fire_0= ruleBoolean ) (lv_libCheckCriteria_1= ruleBoolean ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3049:1: ( (lv_fire_0= ruleBoolean ) (lv_libCheckCriteria_1= ruleBoolean ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3049:2: (lv_fire_0= ruleBoolean ) (lv_libCheckCriteria_1= ruleBoolean )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3049:2: (lv_fire_0= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3052:6: lv_fire_0= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFireEventsAccess().getFireBooleanParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleFireEvents6179);
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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3070:2: (lv_libCheckCriteria_1= ruleBoolean )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3073:6: lv_libCheckCriteria_1= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFireEventsAccess().getLibCheckCriteriaBooleanParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleFireEvents6217);
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3098:1: entryRuleAttrProperties returns [EObject current=null] : iv_ruleAttrProperties= ruleAttrProperties EOF ;
    public final EObject entryRuleAttrProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrProperties = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3098:56: (iv_ruleAttrProperties= ruleAttrProperties EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3099:2: iv_ruleAttrProperties= ruleAttrProperties EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttrPropertiesRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttrProperties_in_entryRuleAttrProperties6254);
            iv_ruleAttrProperties=ruleAttrProperties();
            _fsp--;

             current =iv_ruleAttrProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrProperties6264); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3106:1: ruleAttrProperties returns [EObject current=null] : ( (lv_description_0= RULE_STRING ) (lv_label_1= RULE_STRING ) (lv_unit_2= RULE_STRING ) (lv_standardUnit_3= RULE_STRING ) (lv_displayUnit_4= RULE_STRING ) (lv_format_5= RULE_STRING ) (lv_maxValue_6= RULE_STRING ) (lv_minValue_7= RULE_STRING ) (lv_maxAlarm_8= RULE_STRING ) (lv_minAlarm_9= RULE_STRING ) (lv_maxWarning_10= RULE_STRING ) (lv_minWarning_11= RULE_STRING ) (lv_deltaTime_12= RULE_STRING ) (lv_deltaValue_13= RULE_STRING ) ) ;
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
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3111:6: ( ( (lv_description_0= RULE_STRING ) (lv_label_1= RULE_STRING ) (lv_unit_2= RULE_STRING ) (lv_standardUnit_3= RULE_STRING ) (lv_displayUnit_4= RULE_STRING ) (lv_format_5= RULE_STRING ) (lv_maxValue_6= RULE_STRING ) (lv_minValue_7= RULE_STRING ) (lv_maxAlarm_8= RULE_STRING ) (lv_minAlarm_9= RULE_STRING ) (lv_maxWarning_10= RULE_STRING ) (lv_minWarning_11= RULE_STRING ) (lv_deltaTime_12= RULE_STRING ) (lv_deltaValue_13= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3112:1: ( (lv_description_0= RULE_STRING ) (lv_label_1= RULE_STRING ) (lv_unit_2= RULE_STRING ) (lv_standardUnit_3= RULE_STRING ) (lv_displayUnit_4= RULE_STRING ) (lv_format_5= RULE_STRING ) (lv_maxValue_6= RULE_STRING ) (lv_minValue_7= RULE_STRING ) (lv_maxAlarm_8= RULE_STRING ) (lv_minAlarm_9= RULE_STRING ) (lv_maxWarning_10= RULE_STRING ) (lv_minWarning_11= RULE_STRING ) (lv_deltaTime_12= RULE_STRING ) (lv_deltaValue_13= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3112:1: ( (lv_description_0= RULE_STRING ) (lv_label_1= RULE_STRING ) (lv_unit_2= RULE_STRING ) (lv_standardUnit_3= RULE_STRING ) (lv_displayUnit_4= RULE_STRING ) (lv_format_5= RULE_STRING ) (lv_maxValue_6= RULE_STRING ) (lv_minValue_7= RULE_STRING ) (lv_maxAlarm_8= RULE_STRING ) (lv_minAlarm_9= RULE_STRING ) (lv_maxWarning_10= RULE_STRING ) (lv_minWarning_11= RULE_STRING ) (lv_deltaTime_12= RULE_STRING ) (lv_deltaValue_13= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3112:2: (lv_description_0= RULE_STRING ) (lv_label_1= RULE_STRING ) (lv_unit_2= RULE_STRING ) (lv_standardUnit_3= RULE_STRING ) (lv_displayUnit_4= RULE_STRING ) (lv_format_5= RULE_STRING ) (lv_maxValue_6= RULE_STRING ) (lv_minValue_7= RULE_STRING ) (lv_maxAlarm_8= RULE_STRING ) (lv_minAlarm_9= RULE_STRING ) (lv_maxWarning_10= RULE_STRING ) (lv_minWarning_11= RULE_STRING ) (lv_deltaTime_12= RULE_STRING ) (lv_deltaValue_13= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3112:2: (lv_description_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3114:6: lv_description_0= RULE_STRING
            {
            lv_description_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6311); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3132:2: (lv_label_1= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3134:6: lv_label_1= RULE_STRING
            {
            lv_label_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6341); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3152:2: (lv_unit_2= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3154:6: lv_unit_2= RULE_STRING
            {
            lv_unit_2=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6371); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3172:2: (lv_standardUnit_3= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3174:6: lv_standardUnit_3= RULE_STRING
            {
            lv_standardUnit_3=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6401); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3192:2: (lv_displayUnit_4= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3194:6: lv_displayUnit_4= RULE_STRING
            {
            lv_displayUnit_4=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6431); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3212:2: (lv_format_5= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3214:6: lv_format_5= RULE_STRING
            {
            lv_format_5=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6461); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3232:2: (lv_maxValue_6= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3234:6: lv_maxValue_6= RULE_STRING
            {
            lv_maxValue_6=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6491); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3252:2: (lv_minValue_7= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3254:6: lv_minValue_7= RULE_STRING
            {
            lv_minValue_7=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6521); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3272:2: (lv_maxAlarm_8= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3274:6: lv_maxAlarm_8= RULE_STRING
            {
            lv_maxAlarm_8=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6551); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3292:2: (lv_minAlarm_9= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3294:6: lv_minAlarm_9= RULE_STRING
            {
            lv_minAlarm_9=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6581); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3312:2: (lv_maxWarning_10= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3314:6: lv_maxWarning_10= RULE_STRING
            {
            lv_maxWarning_10=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6611); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3332:2: (lv_minWarning_11= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3334:6: lv_minWarning_11= RULE_STRING
            {
            lv_minWarning_11=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6641); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3352:2: (lv_deltaTime_12= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3354:6: lv_deltaTime_12= RULE_STRING
            {
            lv_deltaTime_12=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6671); 

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

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3372:2: (lv_deltaValue_13= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3374:6: lv_deltaValue_13= RULE_STRING
            {
            lv_deltaValue_13=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttrProperties6701); 

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


    // $ANTLR start entryRuleAdditionalFile
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3399:1: entryRuleAdditionalFile returns [EObject current=null] : iv_ruleAdditionalFile= ruleAdditionalFile EOF ;
    public final EObject entryRuleAdditionalFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionalFile = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3399:56: (iv_ruleAdditionalFile= ruleAdditionalFile EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3400:2: iv_ruleAdditionalFile= ruleAdditionalFile EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAdditionalFileRule(), currentNode); 
            pushFollow(FOLLOW_ruleAdditionalFile_in_entryRuleAdditionalFile6742);
            iv_ruleAdditionalFile=ruleAdditionalFile();
            _fsp--;

             current =iv_ruleAdditionalFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionalFile6752); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAdditionalFile


    // $ANTLR start ruleAdditionalFile
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3407:1: ruleAdditionalFile returns [EObject current=null] : ( (lv_name_0= RULE_STRING ) (lv_path_1= RULE_STRING ) ) ;
    public final EObject ruleAdditionalFile() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_path_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3412:6: ( ( (lv_name_0= RULE_STRING ) (lv_path_1= RULE_STRING ) ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3413:1: ( (lv_name_0= RULE_STRING ) (lv_path_1= RULE_STRING ) )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3413:1: ( (lv_name_0= RULE_STRING ) (lv_path_1= RULE_STRING ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3413:2: (lv_name_0= RULE_STRING ) (lv_path_1= RULE_STRING )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3413:2: (lv_name_0= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3415:6: lv_name_0= RULE_STRING
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAdditionalFile6799); 

            		createLeafNode(grammarAccess.getAdditionalFileAccess().getNameSTRINGTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAdditionalFileRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3433:2: (lv_path_1= RULE_STRING )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3435:6: lv_path_1= RULE_STRING
            {
            lv_path_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAdditionalFile6829); 

            		createLeafNode(grammarAccess.getAdditionalFileAccess().getPathSTRINGTerminalRuleCall_1_0(), "path"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAdditionalFileRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "path", lv_path_1, "STRING", lastConsumedNode);
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
    // $ANTLR end ruleAdditionalFile


    // $ANTLR start entryRuleType
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3460:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3460:46: (iv_ruleType= ruleType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3461:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType6870);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType6880); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3468:1: ruleType returns [EObject current=null] : (this_VoidType_0= ruleVoidType | this_BooleanType_1= ruleBooleanType | this_ShortType_2= ruleShortType | this_UShortType_3= ruleUShortType | this_IntType_4= ruleIntType | this_UIntType_5= ruleUIntType | this_FloatType_6= ruleFloatType | this_DoubleType_7= ruleDoubleType | this_StringType_8= ruleStringType | this_CharArrayType_9= ruleCharArrayType | this_ShortArrayType_10= ruleShortArrayType | this_UShortArrayType_11= ruleUShortArrayType | this_IntArrayType_12= ruleIntArrayType | this_UIntArrayType_13= ruleUIntArrayType | this_FloatArrayType_14= ruleFloatArrayType | this_DoubleArrayType_15= ruleDoubleArrayType | this_StringArrayType_16= ruleStringArrayType | this_LongStringArrayType_17= ruleLongStringArrayType | this_DoubleStringArrayType_18= ruleDoubleStringArrayType | this_StateType_19= ruleStateType | this_ConstStringType_20= ruleConstStringType | this_BooleanArrayType_21= ruleBooleanArrayType | this_LongType_22= ruleLongType | this_ULongType_23= ruleULongType | this_UCharType_24= ruleUCharType | this_LongArrayType_25= ruleLongArrayType | this_ULongArrayType_26= ruleULongArrayType | this_DevIntType_27= ruleDevIntType | this_EncodedType_28= ruleEncodedType ) ;
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
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3473:6: ( (this_VoidType_0= ruleVoidType | this_BooleanType_1= ruleBooleanType | this_ShortType_2= ruleShortType | this_UShortType_3= ruleUShortType | this_IntType_4= ruleIntType | this_UIntType_5= ruleUIntType | this_FloatType_6= ruleFloatType | this_DoubleType_7= ruleDoubleType | this_StringType_8= ruleStringType | this_CharArrayType_9= ruleCharArrayType | this_ShortArrayType_10= ruleShortArrayType | this_UShortArrayType_11= ruleUShortArrayType | this_IntArrayType_12= ruleIntArrayType | this_UIntArrayType_13= ruleUIntArrayType | this_FloatArrayType_14= ruleFloatArrayType | this_DoubleArrayType_15= ruleDoubleArrayType | this_StringArrayType_16= ruleStringArrayType | this_LongStringArrayType_17= ruleLongStringArrayType | this_DoubleStringArrayType_18= ruleDoubleStringArrayType | this_StateType_19= ruleStateType | this_ConstStringType_20= ruleConstStringType | this_BooleanArrayType_21= ruleBooleanArrayType | this_LongType_22= ruleLongType | this_ULongType_23= ruleULongType | this_UCharType_24= ruleUCharType | this_LongArrayType_25= ruleLongArrayType | this_ULongArrayType_26= ruleULongArrayType | this_DevIntType_27= ruleDevIntType | this_EncodedType_28= ruleEncodedType ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3474:1: (this_VoidType_0= ruleVoidType | this_BooleanType_1= ruleBooleanType | this_ShortType_2= ruleShortType | this_UShortType_3= ruleUShortType | this_IntType_4= ruleIntType | this_UIntType_5= ruleUIntType | this_FloatType_6= ruleFloatType | this_DoubleType_7= ruleDoubleType | this_StringType_8= ruleStringType | this_CharArrayType_9= ruleCharArrayType | this_ShortArrayType_10= ruleShortArrayType | this_UShortArrayType_11= ruleUShortArrayType | this_IntArrayType_12= ruleIntArrayType | this_UIntArrayType_13= ruleUIntArrayType | this_FloatArrayType_14= ruleFloatArrayType | this_DoubleArrayType_15= ruleDoubleArrayType | this_StringArrayType_16= ruleStringArrayType | this_LongStringArrayType_17= ruleLongStringArrayType | this_DoubleStringArrayType_18= ruleDoubleStringArrayType | this_StateType_19= ruleStateType | this_ConstStringType_20= ruleConstStringType | this_BooleanArrayType_21= ruleBooleanArrayType | this_LongType_22= ruleLongType | this_ULongType_23= ruleULongType | this_UCharType_24= ruleUCharType | this_LongArrayType_25= ruleLongArrayType | this_ULongArrayType_26= ruleULongArrayType | this_DevIntType_27= ruleDevIntType | this_EncodedType_28= ruleEncodedType )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3474:1: (this_VoidType_0= ruleVoidType | this_BooleanType_1= ruleBooleanType | this_ShortType_2= ruleShortType | this_UShortType_3= ruleUShortType | this_IntType_4= ruleIntType | this_UIntType_5= ruleUIntType | this_FloatType_6= ruleFloatType | this_DoubleType_7= ruleDoubleType | this_StringType_8= ruleStringType | this_CharArrayType_9= ruleCharArrayType | this_ShortArrayType_10= ruleShortArrayType | this_UShortArrayType_11= ruleUShortArrayType | this_IntArrayType_12= ruleIntArrayType | this_UIntArrayType_13= ruleUIntArrayType | this_FloatArrayType_14= ruleFloatArrayType | this_DoubleArrayType_15= ruleDoubleArrayType | this_StringArrayType_16= ruleStringArrayType | this_LongStringArrayType_17= ruleLongStringArrayType | this_DoubleStringArrayType_18= ruleDoubleStringArrayType | this_StateType_19= ruleStateType | this_ConstStringType_20= ruleConstStringType | this_BooleanArrayType_21= ruleBooleanArrayType | this_LongType_22= ruleLongType | this_ULongType_23= ruleULongType | this_UCharType_24= ruleUCharType | this_LongArrayType_25= ruleLongArrayType | this_ULongArrayType_26= ruleULongArrayType | this_DevIntType_27= ruleDevIntType | this_EncodedType_28= ruleEncodedType )
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
                    new NoViableAltException("3474:1: (this_VoidType_0= ruleVoidType | this_BooleanType_1= ruleBooleanType | this_ShortType_2= ruleShortType | this_UShortType_3= ruleUShortType | this_IntType_4= ruleIntType | this_UIntType_5= ruleUIntType | this_FloatType_6= ruleFloatType | this_DoubleType_7= ruleDoubleType | this_StringType_8= ruleStringType | this_CharArrayType_9= ruleCharArrayType | this_ShortArrayType_10= ruleShortArrayType | this_UShortArrayType_11= ruleUShortArrayType | this_IntArrayType_12= ruleIntArrayType | this_UIntArrayType_13= ruleUIntArrayType | this_FloatArrayType_14= ruleFloatArrayType | this_DoubleArrayType_15= ruleDoubleArrayType | this_StringArrayType_16= ruleStringArrayType | this_LongStringArrayType_17= ruleLongStringArrayType | this_DoubleStringArrayType_18= ruleDoubleStringArrayType | this_StateType_19= ruleStateType | this_ConstStringType_20= ruleConstStringType | this_BooleanArrayType_21= ruleBooleanArrayType | this_LongType_22= ruleLongType | this_ULongType_23= ruleULongType | this_UCharType_24= ruleUCharType | this_LongArrayType_25= ruleLongArrayType | this_ULongArrayType_26= ruleULongArrayType | this_DevIntType_27= ruleDevIntType | this_EncodedType_28= ruleEncodedType )", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3475:5: this_VoidType_0= ruleVoidType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getVoidTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVoidType_in_ruleType6927);
                    this_VoidType_0=ruleVoidType();
                    _fsp--;

                     
                            current = this_VoidType_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3485:5: this_BooleanType_1= ruleBooleanType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getBooleanTypeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBooleanType_in_ruleType6954);
                    this_BooleanType_1=ruleBooleanType();
                    _fsp--;

                     
                            current = this_BooleanType_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3495:5: this_ShortType_2= ruleShortType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getShortTypeParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleShortType_in_ruleType6981);
                    this_ShortType_2=ruleShortType();
                    _fsp--;

                     
                            current = this_ShortType_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3505:5: this_UShortType_3= ruleUShortType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getUShortTypeParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUShortType_in_ruleType7008);
                    this_UShortType_3=ruleUShortType();
                    _fsp--;

                     
                            current = this_UShortType_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3515:5: this_IntType_4= ruleIntType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getIntTypeParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntType_in_ruleType7035);
                    this_IntType_4=ruleIntType();
                    _fsp--;

                     
                            current = this_IntType_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3525:5: this_UIntType_5= ruleUIntType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getUIntTypeParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUIntType_in_ruleType7062);
                    this_UIntType_5=ruleUIntType();
                    _fsp--;

                     
                            current = this_UIntType_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3535:5: this_FloatType_6= ruleFloatType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getFloatTypeParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFloatType_in_ruleType7089);
                    this_FloatType_6=ruleFloatType();
                    _fsp--;

                     
                            current = this_FloatType_6; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 8 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3545:5: this_DoubleType_7= ruleDoubleType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getDoubleTypeParserRuleCall_7(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDoubleType_in_ruleType7116);
                    this_DoubleType_7=ruleDoubleType();
                    _fsp--;

                     
                            current = this_DoubleType_7; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 9 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3555:5: this_StringType_8= ruleStringType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getStringTypeParserRuleCall_8(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringType_in_ruleType7143);
                    this_StringType_8=ruleStringType();
                    _fsp--;

                     
                            current = this_StringType_8; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 10 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3565:5: this_CharArrayType_9= ruleCharArrayType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getCharArrayTypeParserRuleCall_9(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCharArrayType_in_ruleType7170);
                    this_CharArrayType_9=ruleCharArrayType();
                    _fsp--;

                     
                            current = this_CharArrayType_9; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 11 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3575:5: this_ShortArrayType_10= ruleShortArrayType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getShortArrayTypeParserRuleCall_10(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleShortArrayType_in_ruleType7197);
                    this_ShortArrayType_10=ruleShortArrayType();
                    _fsp--;

                     
                            current = this_ShortArrayType_10; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 12 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3585:5: this_UShortArrayType_11= ruleUShortArrayType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getUShortArrayTypeParserRuleCall_11(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUShortArrayType_in_ruleType7224);
                    this_UShortArrayType_11=ruleUShortArrayType();
                    _fsp--;

                     
                            current = this_UShortArrayType_11; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 13 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3595:5: this_IntArrayType_12= ruleIntArrayType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getIntArrayTypeParserRuleCall_12(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntArrayType_in_ruleType7251);
                    this_IntArrayType_12=ruleIntArrayType();
                    _fsp--;

                     
                            current = this_IntArrayType_12; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 14 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3605:5: this_UIntArrayType_13= ruleUIntArrayType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getUIntArrayTypeParserRuleCall_13(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUIntArrayType_in_ruleType7278);
                    this_UIntArrayType_13=ruleUIntArrayType();
                    _fsp--;

                     
                            current = this_UIntArrayType_13; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 15 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3615:5: this_FloatArrayType_14= ruleFloatArrayType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getFloatArrayTypeParserRuleCall_14(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFloatArrayType_in_ruleType7305);
                    this_FloatArrayType_14=ruleFloatArrayType();
                    _fsp--;

                     
                            current = this_FloatArrayType_14; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 16 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3625:5: this_DoubleArrayType_15= ruleDoubleArrayType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getDoubleArrayTypeParserRuleCall_15(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDoubleArrayType_in_ruleType7332);
                    this_DoubleArrayType_15=ruleDoubleArrayType();
                    _fsp--;

                     
                            current = this_DoubleArrayType_15; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 17 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3635:5: this_StringArrayType_16= ruleStringArrayType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getStringArrayTypeParserRuleCall_16(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringArrayType_in_ruleType7359);
                    this_StringArrayType_16=ruleStringArrayType();
                    _fsp--;

                     
                            current = this_StringArrayType_16; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 18 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3645:5: this_LongStringArrayType_17= ruleLongStringArrayType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getLongStringArrayTypeParserRuleCall_17(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLongStringArrayType_in_ruleType7386);
                    this_LongStringArrayType_17=ruleLongStringArrayType();
                    _fsp--;

                     
                            current = this_LongStringArrayType_17; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 19 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3655:5: this_DoubleStringArrayType_18= ruleDoubleStringArrayType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getDoubleStringArrayTypeParserRuleCall_18(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDoubleStringArrayType_in_ruleType7413);
                    this_DoubleStringArrayType_18=ruleDoubleStringArrayType();
                    _fsp--;

                     
                            current = this_DoubleStringArrayType_18; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 20 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3665:5: this_StateType_19= ruleStateType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getStateTypeParserRuleCall_19(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStateType_in_ruleType7440);
                    this_StateType_19=ruleStateType();
                    _fsp--;

                     
                            current = this_StateType_19; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 21 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3675:5: this_ConstStringType_20= ruleConstStringType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getConstStringTypeParserRuleCall_20(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleConstStringType_in_ruleType7467);
                    this_ConstStringType_20=ruleConstStringType();
                    _fsp--;

                     
                            current = this_ConstStringType_20; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 22 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3685:5: this_BooleanArrayType_21= ruleBooleanArrayType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getBooleanArrayTypeParserRuleCall_21(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBooleanArrayType_in_ruleType7494);
                    this_BooleanArrayType_21=ruleBooleanArrayType();
                    _fsp--;

                     
                            current = this_BooleanArrayType_21; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 23 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3695:5: this_LongType_22= ruleLongType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getLongTypeParserRuleCall_22(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLongType_in_ruleType7521);
                    this_LongType_22=ruleLongType();
                    _fsp--;

                     
                            current = this_LongType_22; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 24 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3705:5: this_ULongType_23= ruleULongType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getULongTypeParserRuleCall_23(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleULongType_in_ruleType7548);
                    this_ULongType_23=ruleULongType();
                    _fsp--;

                     
                            current = this_ULongType_23; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 25 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3715:5: this_UCharType_24= ruleUCharType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getUCharTypeParserRuleCall_24(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUCharType_in_ruleType7575);
                    this_UCharType_24=ruleUCharType();
                    _fsp--;

                     
                            current = this_UCharType_24; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 26 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3725:5: this_LongArrayType_25= ruleLongArrayType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getLongArrayTypeParserRuleCall_25(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLongArrayType_in_ruleType7602);
                    this_LongArrayType_25=ruleLongArrayType();
                    _fsp--;

                     
                            current = this_LongArrayType_25; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 27 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3735:5: this_ULongArrayType_26= ruleULongArrayType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getULongArrayTypeParserRuleCall_26(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleULongArrayType_in_ruleType7629);
                    this_ULongArrayType_26=ruleULongArrayType();
                    _fsp--;

                     
                            current = this_ULongArrayType_26; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 28 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3745:5: this_DevIntType_27= ruleDevIntType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getDevIntTypeParserRuleCall_27(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDevIntType_in_ruleType7656);
                    this_DevIntType_27=ruleDevIntType();
                    _fsp--;

                     
                            current = this_DevIntType_27; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 29 :
                    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3755:5: this_EncodedType_28= ruleEncodedType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getEncodedTypeParserRuleCall_28(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEncodedType_in_ruleType7683);
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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3770:1: entryRuleVoidType returns [EObject current=null] : iv_ruleVoidType= ruleVoidType EOF ;
    public final EObject entryRuleVoidType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoidType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3770:50: (iv_ruleVoidType= ruleVoidType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3771:2: iv_ruleVoidType= ruleVoidType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVoidTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleVoidType_in_entryRuleVoidType7715);
            iv_ruleVoidType=ruleVoidType();
            _fsp--;

             current =iv_ruleVoidType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVoidType7725); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3778:1: ruleVoidType returns [EObject current=null] : ( () 'void' ) ;
    public final EObject ruleVoidType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3783:6: ( ( () 'void' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3784:1: ( () 'void' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3784:1: ( () 'void' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3784:2: () 'void'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3784:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3785:5: 
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

            match(input,47,FOLLOW_47_in_ruleVoidType7768); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3806:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3806:53: (iv_ruleBooleanType= ruleBooleanType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3807:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleBooleanType_in_entryRuleBooleanType7801);
            iv_ruleBooleanType=ruleBooleanType();
            _fsp--;

             current =iv_ruleBooleanType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanType7811); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3814:1: ruleBooleanType returns [EObject current=null] : ( () 'boolean' ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3819:6: ( ( () 'boolean' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3820:1: ( () 'boolean' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3820:1: ( () 'boolean' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3820:2: () 'boolean'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3820:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3821:5: 
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

            match(input,48,FOLLOW_48_in_ruleBooleanType7854); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3842:1: entryRuleShortType returns [EObject current=null] : iv_ruleShortType= ruleShortType EOF ;
    public final EObject entryRuleShortType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3842:51: (iv_ruleShortType= ruleShortType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3843:2: iv_ruleShortType= ruleShortType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getShortTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleShortType_in_entryRuleShortType7887);
            iv_ruleShortType=ruleShortType();
            _fsp--;

             current =iv_ruleShortType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortType7897); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3850:1: ruleShortType returns [EObject current=null] : ( () 'short' ) ;
    public final EObject ruleShortType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3855:6: ( ( () 'short' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3856:1: ( () 'short' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3856:1: ( () 'short' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3856:2: () 'short'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3856:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3857:5: 
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

            match(input,49,FOLLOW_49_in_ruleShortType7940); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3878:1: entryRuleUShortType returns [EObject current=null] : iv_ruleUShortType= ruleUShortType EOF ;
    public final EObject entryRuleUShortType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUShortType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3878:52: (iv_ruleUShortType= ruleUShortType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3879:2: iv_ruleUShortType= ruleUShortType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUShortTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleUShortType_in_entryRuleUShortType7973);
            iv_ruleUShortType=ruleUShortType();
            _fsp--;

             current =iv_ruleUShortType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUShortType7983); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3886:1: ruleUShortType returns [EObject current=null] : ( () 'ushort' ) ;
    public final EObject ruleUShortType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3891:6: ( ( () 'ushort' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3892:1: ( () 'ushort' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3892:1: ( () 'ushort' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3892:2: () 'ushort'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3892:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3893:5: 
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

            match(input,50,FOLLOW_50_in_ruleUShortType8026); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3914:1: entryRuleIntType returns [EObject current=null] : iv_ruleIntType= ruleIntType EOF ;
    public final EObject entryRuleIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3914:49: (iv_ruleIntType= ruleIntType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3915:2: iv_ruleIntType= ruleIntType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntType_in_entryRuleIntType8059);
            iv_ruleIntType=ruleIntType();
            _fsp--;

             current =iv_ruleIntType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntType8069); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3922:1: ruleIntType returns [EObject current=null] : ( () 'int' ) ;
    public final EObject ruleIntType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3927:6: ( ( () 'int' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3928:1: ( () 'int' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3928:1: ( () 'int' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3928:2: () 'int'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3928:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3929:5: 
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

            match(input,51,FOLLOW_51_in_ruleIntType8112); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3950:1: entryRuleUIntType returns [EObject current=null] : iv_ruleUIntType= ruleUIntType EOF ;
    public final EObject entryRuleUIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIntType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3950:50: (iv_ruleUIntType= ruleUIntType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3951:2: iv_ruleUIntType= ruleUIntType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUIntTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleUIntType_in_entryRuleUIntType8145);
            iv_ruleUIntType=ruleUIntType();
            _fsp--;

             current =iv_ruleUIntType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIntType8155); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3958:1: ruleUIntType returns [EObject current=null] : ( () 'uint' ) ;
    public final EObject ruleUIntType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3963:6: ( ( () 'uint' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3964:1: ( () 'uint' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3964:1: ( () 'uint' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3964:2: () 'uint'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3964:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3965:5: 
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

            match(input,52,FOLLOW_52_in_ruleUIntType8198); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3986:1: entryRuleFloatType returns [EObject current=null] : iv_ruleFloatType= ruleFloatType EOF ;
    public final EObject entryRuleFloatType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3986:51: (iv_ruleFloatType= ruleFloatType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3987:2: iv_ruleFloatType= ruleFloatType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFloatTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleFloatType_in_entryRuleFloatType8231);
            iv_ruleFloatType=ruleFloatType();
            _fsp--;

             current =iv_ruleFloatType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatType8241); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3994:1: ruleFloatType returns [EObject current=null] : ( () 'float' ) ;
    public final EObject ruleFloatType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:3999:6: ( ( () 'float' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4000:1: ( () 'float' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4000:1: ( () 'float' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4000:2: () 'float'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4000:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4001:5: 
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

            match(input,53,FOLLOW_53_in_ruleFloatType8284); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4022:1: entryRuleDoubleType returns [EObject current=null] : iv_ruleDoubleType= ruleDoubleType EOF ;
    public final EObject entryRuleDoubleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4022:52: (iv_ruleDoubleType= ruleDoubleType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4023:2: iv_ruleDoubleType= ruleDoubleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDoubleTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleDoubleType_in_entryRuleDoubleType8317);
            iv_ruleDoubleType=ruleDoubleType();
            _fsp--;

             current =iv_ruleDoubleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleType8327); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4030:1: ruleDoubleType returns [EObject current=null] : ( () 'double' ) ;
    public final EObject ruleDoubleType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4035:6: ( ( () 'double' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4036:1: ( () 'double' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4036:1: ( () 'double' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4036:2: () 'double'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4036:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4037:5: 
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

            match(input,54,FOLLOW_54_in_ruleDoubleType8370); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4058:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4058:52: (iv_ruleStringType= ruleStringType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4059:2: iv_ruleStringType= ruleStringType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType8403);
            iv_ruleStringType=ruleStringType();
            _fsp--;

             current =iv_ruleStringType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType8413); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4066:1: ruleStringType returns [EObject current=null] : ( () 'string' ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4071:6: ( ( () 'string' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4072:1: ( () 'string' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4072:1: ( () 'string' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4072:2: () 'string'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4072:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4073:5: 
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

            match(input,55,FOLLOW_55_in_ruleStringType8456); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4094:1: entryRuleCharArrayType returns [EObject current=null] : iv_ruleCharArrayType= ruleCharArrayType EOF ;
    public final EObject entryRuleCharArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4094:55: (iv_ruleCharArrayType= ruleCharArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4095:2: iv_ruleCharArrayType= ruleCharArrayType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCharArrayTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleCharArrayType_in_entryRuleCharArrayType8489);
            iv_ruleCharArrayType=ruleCharArrayType();
            _fsp--;

             current =iv_ruleCharArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharArrayType8499); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4102:1: ruleCharArrayType returns [EObject current=null] : ( () 'DevVarCharArray' ) ;
    public final EObject ruleCharArrayType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4107:6: ( ( () 'DevVarCharArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4108:1: ( () 'DevVarCharArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4108:1: ( () 'DevVarCharArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4108:2: () 'DevVarCharArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4108:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4109:5: 
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

            match(input,56,FOLLOW_56_in_ruleCharArrayType8542); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4130:1: entryRuleShortArrayType returns [EObject current=null] : iv_ruleShortArrayType= ruleShortArrayType EOF ;
    public final EObject entryRuleShortArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4130:56: (iv_ruleShortArrayType= ruleShortArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4131:2: iv_ruleShortArrayType= ruleShortArrayType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getShortArrayTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleShortArrayType_in_entryRuleShortArrayType8575);
            iv_ruleShortArrayType=ruleShortArrayType();
            _fsp--;

             current =iv_ruleShortArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortArrayType8585); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4138:1: ruleShortArrayType returns [EObject current=null] : ( () 'DevVarShortArray' ) ;
    public final EObject ruleShortArrayType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4143:6: ( ( () 'DevVarShortArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4144:1: ( () 'DevVarShortArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4144:1: ( () 'DevVarShortArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4144:2: () 'DevVarShortArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4144:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4145:5: 
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

            match(input,57,FOLLOW_57_in_ruleShortArrayType8628); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4166:1: entryRuleUShortArrayType returns [EObject current=null] : iv_ruleUShortArrayType= ruleUShortArrayType EOF ;
    public final EObject entryRuleUShortArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUShortArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4166:57: (iv_ruleUShortArrayType= ruleUShortArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4167:2: iv_ruleUShortArrayType= ruleUShortArrayType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUShortArrayTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleUShortArrayType_in_entryRuleUShortArrayType8661);
            iv_ruleUShortArrayType=ruleUShortArrayType();
            _fsp--;

             current =iv_ruleUShortArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUShortArrayType8671); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4174:1: ruleUShortArrayType returns [EObject current=null] : ( () 'DevVarUShortArray' ) ;
    public final EObject ruleUShortArrayType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4179:6: ( ( () 'DevVarUShortArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4180:1: ( () 'DevVarUShortArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4180:1: ( () 'DevVarUShortArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4180:2: () 'DevVarUShortArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4180:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4181:5: 
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

            match(input,58,FOLLOW_58_in_ruleUShortArrayType8714); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4202:1: entryRuleIntArrayType returns [EObject current=null] : iv_ruleIntArrayType= ruleIntArrayType EOF ;
    public final EObject entryRuleIntArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4202:54: (iv_ruleIntArrayType= ruleIntArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4203:2: iv_ruleIntArrayType= ruleIntArrayType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntArrayTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntArrayType_in_entryRuleIntArrayType8747);
            iv_ruleIntArrayType=ruleIntArrayType();
            _fsp--;

             current =iv_ruleIntArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntArrayType8757); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4210:1: ruleIntArrayType returns [EObject current=null] : ( () 'DevVarLongArray' ) ;
    public final EObject ruleIntArrayType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4215:6: ( ( () 'DevVarLongArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4216:1: ( () 'DevVarLongArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4216:1: ( () 'DevVarLongArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4216:2: () 'DevVarLongArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4216:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4217:5: 
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

            match(input,59,FOLLOW_59_in_ruleIntArrayType8800); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4238:1: entryRuleUIntArrayType returns [EObject current=null] : iv_ruleUIntArrayType= ruleUIntArrayType EOF ;
    public final EObject entryRuleUIntArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIntArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4238:55: (iv_ruleUIntArrayType= ruleUIntArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4239:2: iv_ruleUIntArrayType= ruleUIntArrayType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUIntArrayTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleUIntArrayType_in_entryRuleUIntArrayType8833);
            iv_ruleUIntArrayType=ruleUIntArrayType();
            _fsp--;

             current =iv_ruleUIntArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIntArrayType8843); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4246:1: ruleUIntArrayType returns [EObject current=null] : ( () 'DevVarULongArray' ) ;
    public final EObject ruleUIntArrayType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4251:6: ( ( () 'DevVarULongArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4252:1: ( () 'DevVarULongArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4252:1: ( () 'DevVarULongArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4252:2: () 'DevVarULongArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4252:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4253:5: 
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

            match(input,60,FOLLOW_60_in_ruleUIntArrayType8886); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4274:1: entryRuleFloatArrayType returns [EObject current=null] : iv_ruleFloatArrayType= ruleFloatArrayType EOF ;
    public final EObject entryRuleFloatArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4274:56: (iv_ruleFloatArrayType= ruleFloatArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4275:2: iv_ruleFloatArrayType= ruleFloatArrayType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFloatArrayTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleFloatArrayType_in_entryRuleFloatArrayType8919);
            iv_ruleFloatArrayType=ruleFloatArrayType();
            _fsp--;

             current =iv_ruleFloatArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatArrayType8929); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4282:1: ruleFloatArrayType returns [EObject current=null] : ( () 'DevVarFloatArray' ) ;
    public final EObject ruleFloatArrayType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4287:6: ( ( () 'DevVarFloatArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4288:1: ( () 'DevVarFloatArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4288:1: ( () 'DevVarFloatArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4288:2: () 'DevVarFloatArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4288:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4289:5: 
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

            match(input,61,FOLLOW_61_in_ruleFloatArrayType8972); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4310:1: entryRuleDoubleArrayType returns [EObject current=null] : iv_ruleDoubleArrayType= ruleDoubleArrayType EOF ;
    public final EObject entryRuleDoubleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4310:57: (iv_ruleDoubleArrayType= ruleDoubleArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4311:2: iv_ruleDoubleArrayType= ruleDoubleArrayType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDoubleArrayTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleDoubleArrayType_in_entryRuleDoubleArrayType9005);
            iv_ruleDoubleArrayType=ruleDoubleArrayType();
            _fsp--;

             current =iv_ruleDoubleArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleArrayType9015); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4318:1: ruleDoubleArrayType returns [EObject current=null] : ( () 'DevVarDoubleArray' ) ;
    public final EObject ruleDoubleArrayType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4323:6: ( ( () 'DevVarDoubleArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4324:1: ( () 'DevVarDoubleArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4324:1: ( () 'DevVarDoubleArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4324:2: () 'DevVarDoubleArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4324:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4325:5: 
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

            match(input,62,FOLLOW_62_in_ruleDoubleArrayType9058); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4346:1: entryRuleStringArrayType returns [EObject current=null] : iv_ruleStringArrayType= ruleStringArrayType EOF ;
    public final EObject entryRuleStringArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4346:57: (iv_ruleStringArrayType= ruleStringArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4347:2: iv_ruleStringArrayType= ruleStringArrayType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringArrayTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringArrayType_in_entryRuleStringArrayType9091);
            iv_ruleStringArrayType=ruleStringArrayType();
            _fsp--;

             current =iv_ruleStringArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringArrayType9101); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4354:1: ruleStringArrayType returns [EObject current=null] : ( () 'DevVarStringArray' ) ;
    public final EObject ruleStringArrayType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4359:6: ( ( () 'DevVarStringArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4360:1: ( () 'DevVarStringArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4360:1: ( () 'DevVarStringArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4360:2: () 'DevVarStringArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4360:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4361:5: 
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

            match(input,63,FOLLOW_63_in_ruleStringArrayType9144); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4382:1: entryRuleLongStringArrayType returns [EObject current=null] : iv_ruleLongStringArrayType= ruleLongStringArrayType EOF ;
    public final EObject entryRuleLongStringArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongStringArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4382:61: (iv_ruleLongStringArrayType= ruleLongStringArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4383:2: iv_ruleLongStringArrayType= ruleLongStringArrayType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLongStringArrayTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleLongStringArrayType_in_entryRuleLongStringArrayType9177);
            iv_ruleLongStringArrayType=ruleLongStringArrayType();
            _fsp--;

             current =iv_ruleLongStringArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongStringArrayType9187); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4390:1: ruleLongStringArrayType returns [EObject current=null] : ( () 'DevVarLongStringArray' ) ;
    public final EObject ruleLongStringArrayType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4395:6: ( ( () 'DevVarLongStringArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4396:1: ( () 'DevVarLongStringArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4396:1: ( () 'DevVarLongStringArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4396:2: () 'DevVarLongStringArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4396:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4397:5: 
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

            match(input,64,FOLLOW_64_in_ruleLongStringArrayType9230); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4418:1: entryRuleDoubleStringArrayType returns [EObject current=null] : iv_ruleDoubleStringArrayType= ruleDoubleStringArrayType EOF ;
    public final EObject entryRuleDoubleStringArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleStringArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4418:63: (iv_ruleDoubleStringArrayType= ruleDoubleStringArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4419:2: iv_ruleDoubleStringArrayType= ruleDoubleStringArrayType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDoubleStringArrayTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleDoubleStringArrayType_in_entryRuleDoubleStringArrayType9263);
            iv_ruleDoubleStringArrayType=ruleDoubleStringArrayType();
            _fsp--;

             current =iv_ruleDoubleStringArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleStringArrayType9273); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4426:1: ruleDoubleStringArrayType returns [EObject current=null] : ( () 'DevVarDoubleStringArray' ) ;
    public final EObject ruleDoubleStringArrayType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4431:6: ( ( () 'DevVarDoubleStringArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4432:1: ( () 'DevVarDoubleStringArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4432:1: ( () 'DevVarDoubleStringArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4432:2: () 'DevVarDoubleStringArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4432:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4433:5: 
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

            match(input,65,FOLLOW_65_in_ruleDoubleStringArrayType9316); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4454:1: entryRuleStateType returns [EObject current=null] : iv_ruleStateType= ruleStateType EOF ;
    public final EObject entryRuleStateType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4454:51: (iv_ruleStateType= ruleStateType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4455:2: iv_ruleStateType= ruleStateType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStateTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleStateType_in_entryRuleStateType9349);
            iv_ruleStateType=ruleStateType();
            _fsp--;

             current =iv_ruleStateType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateType9359); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4462:1: ruleStateType returns [EObject current=null] : ( () 'DevState' ) ;
    public final EObject ruleStateType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4467:6: ( ( () 'DevState' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4468:1: ( () 'DevState' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4468:1: ( () 'DevState' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4468:2: () 'DevState'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4468:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4469:5: 
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

            match(input,66,FOLLOW_66_in_ruleStateType9402); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4490:1: entryRuleConstStringType returns [EObject current=null] : iv_ruleConstStringType= ruleConstStringType EOF ;
    public final EObject entryRuleConstStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstStringType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4490:57: (iv_ruleConstStringType= ruleConstStringType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4491:2: iv_ruleConstStringType= ruleConstStringType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstStringTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstStringType_in_entryRuleConstStringType9435);
            iv_ruleConstStringType=ruleConstStringType();
            _fsp--;

             current =iv_ruleConstStringType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstStringType9445); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4498:1: ruleConstStringType returns [EObject current=null] : ( () 'ConstDevString' ) ;
    public final EObject ruleConstStringType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4503:6: ( ( () 'ConstDevString' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4504:1: ( () 'ConstDevString' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4504:1: ( () 'ConstDevString' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4504:2: () 'ConstDevString'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4504:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4505:5: 
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

            match(input,67,FOLLOW_67_in_ruleConstStringType9488); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4526:1: entryRuleBooleanArrayType returns [EObject current=null] : iv_ruleBooleanArrayType= ruleBooleanArrayType EOF ;
    public final EObject entryRuleBooleanArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4526:58: (iv_ruleBooleanArrayType= ruleBooleanArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4527:2: iv_ruleBooleanArrayType= ruleBooleanArrayType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanArrayTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleBooleanArrayType_in_entryRuleBooleanArrayType9521);
            iv_ruleBooleanArrayType=ruleBooleanArrayType();
            _fsp--;

             current =iv_ruleBooleanArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanArrayType9531); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4534:1: ruleBooleanArrayType returns [EObject current=null] : ( () 'DevVarBooleanArray' ) ;
    public final EObject ruleBooleanArrayType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4539:6: ( ( () 'DevVarBooleanArray' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4540:1: ( () 'DevVarBooleanArray' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4540:1: ( () 'DevVarBooleanArray' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4540:2: () 'DevVarBooleanArray'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4540:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4541:5: 
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

            match(input,68,FOLLOW_68_in_ruleBooleanArrayType9574); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4562:1: entryRuleUCharType returns [EObject current=null] : iv_ruleUCharType= ruleUCharType EOF ;
    public final EObject entryRuleUCharType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUCharType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4562:51: (iv_ruleUCharType= ruleUCharType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4563:2: iv_ruleUCharType= ruleUCharType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUCharTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleUCharType_in_entryRuleUCharType9607);
            iv_ruleUCharType=ruleUCharType();
            _fsp--;

             current =iv_ruleUCharType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUCharType9617); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4570:1: ruleUCharType returns [EObject current=null] : ( () 'DevUChar' ) ;
    public final EObject ruleUCharType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4575:6: ( ( () 'DevUChar' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4576:1: ( () 'DevUChar' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4576:1: ( () 'DevUChar' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4576:2: () 'DevUChar'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4576:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4577:5: 
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

            match(input,69,FOLLOW_69_in_ruleUCharType9660); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4598:1: entryRuleLongType returns [EObject current=null] : iv_ruleLongType= ruleLongType EOF ;
    public final EObject entryRuleLongType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4598:50: (iv_ruleLongType= ruleLongType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4599:2: iv_ruleLongType= ruleLongType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLongTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleLongType_in_entryRuleLongType9693);
            iv_ruleLongType=ruleLongType();
            _fsp--;

             current =iv_ruleLongType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongType9703); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4606:1: ruleLongType returns [EObject current=null] : ( () 'DevLong64' ) ;
    public final EObject ruleLongType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4611:6: ( ( () 'DevLong64' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4612:1: ( () 'DevLong64' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4612:1: ( () 'DevLong64' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4612:2: () 'DevLong64'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4612:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4613:5: 
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

            match(input,70,FOLLOW_70_in_ruleLongType9746); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4634:1: entryRuleULongType returns [EObject current=null] : iv_ruleULongType= ruleULongType EOF ;
    public final EObject entryRuleULongType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleULongType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4634:51: (iv_ruleULongType= ruleULongType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4635:2: iv_ruleULongType= ruleULongType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getULongTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleULongType_in_entryRuleULongType9779);
            iv_ruleULongType=ruleULongType();
            _fsp--;

             current =iv_ruleULongType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleULongType9789); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4642:1: ruleULongType returns [EObject current=null] : ( () 'DevULong64' ) ;
    public final EObject ruleULongType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4647:6: ( ( () 'DevULong64' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4648:1: ( () 'DevULong64' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4648:1: ( () 'DevULong64' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4648:2: () 'DevULong64'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4648:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4649:5: 
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

            match(input,71,FOLLOW_71_in_ruleULongType9832); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4670:1: entryRuleLongArrayType returns [EObject current=null] : iv_ruleLongArrayType= ruleLongArrayType EOF ;
    public final EObject entryRuleLongArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4670:55: (iv_ruleLongArrayType= ruleLongArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4671:2: iv_ruleLongArrayType= ruleLongArrayType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLongArrayTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleLongArrayType_in_entryRuleLongArrayType9865);
            iv_ruleLongArrayType=ruleLongArrayType();
            _fsp--;

             current =iv_ruleLongArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongArrayType9875); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4678:1: ruleLongArrayType returns [EObject current=null] : ( () 'DevVarLong64Array' ) ;
    public final EObject ruleLongArrayType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4683:6: ( ( () 'DevVarLong64Array' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4684:1: ( () 'DevVarLong64Array' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4684:1: ( () 'DevVarLong64Array' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4684:2: () 'DevVarLong64Array'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4684:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4685:5: 
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

            match(input,72,FOLLOW_72_in_ruleLongArrayType9918); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4706:1: entryRuleULongArrayType returns [EObject current=null] : iv_ruleULongArrayType= ruleULongArrayType EOF ;
    public final EObject entryRuleULongArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleULongArrayType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4706:56: (iv_ruleULongArrayType= ruleULongArrayType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4707:2: iv_ruleULongArrayType= ruleULongArrayType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getULongArrayTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleULongArrayType_in_entryRuleULongArrayType9951);
            iv_ruleULongArrayType=ruleULongArrayType();
            _fsp--;

             current =iv_ruleULongArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleULongArrayType9961); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4714:1: ruleULongArrayType returns [EObject current=null] : ( () 'DevVarULong64Array' ) ;
    public final EObject ruleULongArrayType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4719:6: ( ( () 'DevVarULong64Array' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4720:1: ( () 'DevVarULong64Array' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4720:1: ( () 'DevVarULong64Array' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4720:2: () 'DevVarULong64Array'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4720:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4721:5: 
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

            match(input,73,FOLLOW_73_in_ruleULongArrayType10004); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4742:1: entryRuleDevIntType returns [EObject current=null] : iv_ruleDevIntType= ruleDevIntType EOF ;
    public final EObject entryRuleDevIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevIntType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4742:52: (iv_ruleDevIntType= ruleDevIntType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4743:2: iv_ruleDevIntType= ruleDevIntType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDevIntTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleDevIntType_in_entryRuleDevIntType10037);
            iv_ruleDevIntType=ruleDevIntType();
            _fsp--;

             current =iv_ruleDevIntType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDevIntType10047); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4750:1: ruleDevIntType returns [EObject current=null] : ( () 'DevInt' ) ;
    public final EObject ruleDevIntType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4755:6: ( ( () 'DevInt' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4756:1: ( () 'DevInt' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4756:1: ( () 'DevInt' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4756:2: () 'DevInt'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4756:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4757:5: 
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

            match(input,74,FOLLOW_74_in_ruleDevIntType10090); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4778:1: entryRuleEncodedType returns [EObject current=null] : iv_ruleEncodedType= ruleEncodedType EOF ;
    public final EObject entryRuleEncodedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEncodedType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4778:53: (iv_ruleEncodedType= ruleEncodedType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4779:2: iv_ruleEncodedType= ruleEncodedType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEncodedTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleEncodedType_in_entryRuleEncodedType10123);
            iv_ruleEncodedType=ruleEncodedType();
            _fsp--;

             current =iv_ruleEncodedType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEncodedType10133); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4786:1: ruleEncodedType returns [EObject current=null] : ( () 'DevEncoded' ) ;
    public final EObject ruleEncodedType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4791:6: ( ( () 'DevEncoded' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4792:1: ( () 'DevEncoded' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4792:1: ( () 'DevEncoded' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4792:2: () 'DevEncoded'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4792:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4793:5: 
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

            match(input,75,FOLLOW_75_in_ruleEncodedType10176); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4814:1: entryRuleShortVectorType returns [EObject current=null] : iv_ruleShortVectorType= ruleShortVectorType EOF ;
    public final EObject entryRuleShortVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4814:57: (iv_ruleShortVectorType= ruleShortVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4815:2: iv_ruleShortVectorType= ruleShortVectorType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getShortVectorTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleShortVectorType_in_entryRuleShortVectorType10209);
            iv_ruleShortVectorType=ruleShortVectorType();
            _fsp--;

             current =iv_ruleShortVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortVectorType10219); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4822:1: ruleShortVectorType returns [EObject current=null] : ( () 'vector<short>' ) ;
    public final EObject ruleShortVectorType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4827:6: ( ( () 'vector<short>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4828:1: ( () 'vector<short>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4828:1: ( () 'vector<short>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4828:2: () 'vector<short>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4828:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4829:5: 
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

            match(input,76,FOLLOW_76_in_ruleShortVectorType10262); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4850:1: entryRuleIntVectorType returns [EObject current=null] : iv_ruleIntVectorType= ruleIntVectorType EOF ;
    public final EObject entryRuleIntVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4850:55: (iv_ruleIntVectorType= ruleIntVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4851:2: iv_ruleIntVectorType= ruleIntVectorType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntVectorTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntVectorType_in_entryRuleIntVectorType10295);
            iv_ruleIntVectorType=ruleIntVectorType();
            _fsp--;

             current =iv_ruleIntVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntVectorType10305); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4858:1: ruleIntVectorType returns [EObject current=null] : ( () 'vector<int>' ) ;
    public final EObject ruleIntVectorType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4863:6: ( ( () 'vector<int>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4864:1: ( () 'vector<int>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4864:1: ( () 'vector<int>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4864:2: () 'vector<int>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4864:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4865:5: 
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

            match(input,77,FOLLOW_77_in_ruleIntVectorType10348); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4886:1: entryRuleFloatVectorType returns [EObject current=null] : iv_ruleFloatVectorType= ruleFloatVectorType EOF ;
    public final EObject entryRuleFloatVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4886:57: (iv_ruleFloatVectorType= ruleFloatVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4887:2: iv_ruleFloatVectorType= ruleFloatVectorType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFloatVectorTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleFloatVectorType_in_entryRuleFloatVectorType10381);
            iv_ruleFloatVectorType=ruleFloatVectorType();
            _fsp--;

             current =iv_ruleFloatVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatVectorType10391); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4894:1: ruleFloatVectorType returns [EObject current=null] : ( () 'vector<float>' ) ;
    public final EObject ruleFloatVectorType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4899:6: ( ( () 'vector<float>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4900:1: ( () 'vector<float>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4900:1: ( () 'vector<float>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4900:2: () 'vector<float>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4900:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4901:5: 
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

            match(input,78,FOLLOW_78_in_ruleFloatVectorType10434); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4922:1: entryRuleDoubleVectorType returns [EObject current=null] : iv_ruleDoubleVectorType= ruleDoubleVectorType EOF ;
    public final EObject entryRuleDoubleVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4922:58: (iv_ruleDoubleVectorType= ruleDoubleVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4923:2: iv_ruleDoubleVectorType= ruleDoubleVectorType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDoubleVectorTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleDoubleVectorType_in_entryRuleDoubleVectorType10467);
            iv_ruleDoubleVectorType=ruleDoubleVectorType();
            _fsp--;

             current =iv_ruleDoubleVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleVectorType10477); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4930:1: ruleDoubleVectorType returns [EObject current=null] : ( () 'vector<double>' ) ;
    public final EObject ruleDoubleVectorType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4935:6: ( ( () 'vector<double>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4936:1: ( () 'vector<double>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4936:1: ( () 'vector<double>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4936:2: () 'vector<double>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4936:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4937:5: 
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

            match(input,79,FOLLOW_79_in_ruleDoubleVectorType10520); 

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4958:1: entryRuleStringVectorType returns [EObject current=null] : iv_ruleStringVectorType= ruleStringVectorType EOF ;
    public final EObject entryRuleStringVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringVectorType = null;


        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4958:58: (iv_ruleStringVectorType= ruleStringVectorType EOF )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4959:2: iv_ruleStringVectorType= ruleStringVectorType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringVectorTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringVectorType_in_entryRuleStringVectorType10553);
            iv_ruleStringVectorType=ruleStringVectorType();
            _fsp--;

             current =iv_ruleStringVectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringVectorType10563); 

            }

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
    // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4966:1: ruleStringVectorType returns [EObject current=null] : ( () 'vector<string>' ) ;
    public final EObject ruleStringVectorType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4971:6: ( ( () 'vector<string>' ) )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4972:1: ( () 'vector<string>' )
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4972:1: ( () 'vector<string>' )
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4972:2: () 'vector<string>'
            {
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4972:2: ()
            // ../fr.esrf.tango.pogo/src-gen/fr/esrf/tango/pogo/parser/antlr/internal/InternalPogoDsl.g:4973:5: 
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

            match(input,80,FOLLOW_80_in_ruleStringVectorType10606); 

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
    public static final BitSet FOLLOW_ruleImport_in_rulePogoSystem142 = new BitSet(new long[]{0x0000000000081802L});
    public static final BitSet FOLLOW_rulePogoDeviceClass_in_rulePogoSystem181 = new BitSet(new long[]{0x0000000000081002L});
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
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOneClassSimpleDef782 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleOneClassSimpleDef824 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOneClassSimpleDef837 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInheritance_in_ruleOneClassSimpleDef871 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleOneClassSimpleDef884 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOneClassSimpleDef906 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOneClassSimpleDef923 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleAdditionalFile_in_ruleOneClassSimpleDef957 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rulePogoDeviceClass_in_entryRulePogoDeviceClass995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePogoDeviceClass1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePogoDeviceClass1039 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePogoDeviceClass1061 = new BitSet(new long[]{0x0000000000302000L});
    public static final BitSet FOLLOW_20_in_rulePogoDeviceClass1090 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_21_in_rulePogoDeviceClass1114 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePogoDeviceClass1136 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePogoDeviceClass1150 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePogoDeviceClass1172 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePogoDeviceClass1189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClassDescription_in_rulePogoDeviceClass1223 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePogoDeviceClass1236 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePogoDeviceClass1270 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_rulePogoDeviceClass1284 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePogoDeviceClass1318 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_rulePogoDeviceClass1332 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_ruleCommand_in_rulePogoDeviceClass1366 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_26_in_rulePogoDeviceClass1380 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_ruleAttribute_in_rulePogoDeviceClass1414 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_27_in_rulePogoDeviceClass1428 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_ruleAttribute_in_rulePogoDeviceClass1462 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_28_in_rulePogoDeviceClass1476 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleState_in_rulePogoDeviceClass1510 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rulePreferences_in_rulePogoDeviceClass1549 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePogoDeviceClass1562 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleAdditionalFile_in_rulePogoDeviceClass1596 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_rulePogoDeviceClass1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLanguage_in_entryRuleLanguage1644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLanguage1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleLanguage1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleLanguage1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleLanguage1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisplayLevel_in_entryRuleDisplayLevel1770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisplayLevel1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDisplayLevel1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDisplayLevel1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrType_in_entryRuleAttrType1877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrType1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleAttrType1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleAttrType1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleAttrType1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRW_Type_in_entryRuleRW_Type2003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRW_Type2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleRW_Type2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleRW_Type2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleRW_Type2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleRW_Type2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean2148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleBoolean2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleBoolean2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDescription_in_entryRuleClassDescription2254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassDescription2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassDescription2311 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassDescription2341 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassDescription2371 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleClassDescription2388 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInheritance_in_ruleClassDescription2422 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_ruleLanguage_in_ruleClassDescription2460 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassDescription2486 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClassIdentification_in_ruleClassDescription2528 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleComments_in_ruleClassDescription2566 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleClassDescription2604 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleClassDescription2642 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleClassDescription2680 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleClassDescription2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritance_in_entryRuleInheritance2755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInheritance2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInheritance2812 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInheritance2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassIdentification_in_entryRuleClassIdentification2883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassIdentification2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2940 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification2970 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification3000 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification3030 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification3060 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification3090 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification3120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification3150 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIdentification3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComments_in_entryRuleComments3221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComments3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleComments3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreferences_in_entryRulePreferences3317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreferences3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePreferences3374 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePreferences3404 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePreferences3434 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_rulePreferences3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState3513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState3570 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState3600 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_ruleState3642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty3679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty3736 = new BitSet(new long[]{0x00FF000000000000L,0x000000000001F000L});
    public static final BitSet FOLLOW_rulePropType_in_ruleProperty3778 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_ruleProperty3816 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleProperty3854 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProperty3880 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleProperty3897 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProperty3919 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rulePropType_in_entryRulePropType3961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropType3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rulePropType4018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVectorType_in_rulePropType4045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType4077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType4087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_ruleSimpleType4134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortType_in_ruleSimpleType4161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortType_in_ruleSimpleType4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_ruleSimpleType4215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntType_in_ruleSimpleType4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_ruleSimpleType4269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_ruleSimpleType4296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_ruleSimpleType4323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVectorType_in_entryRuleVectorType4355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVectorType4365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortVectorType_in_ruleVectorType4412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntVectorType_in_ruleVectorType4439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatVectorType_in_ruleVectorType4466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleVectorType_in_ruleVectorType4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVectorType_in_ruleVectorType4520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_entryRuleInheritanceStatus4552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInheritanceStatus4562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleInheritanceStatus4621 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleInheritanceStatus4659 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleInheritanceStatus4697 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleInheritanceStatus4735 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInheritanceStatus4761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand4802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand4812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand4859 = new BitSet(new long[]{0xFFFF800000000000L,0x0000000000000FFFL});
    public static final BitSet FOLLOW_ruleArgument_in_ruleCommand4901 = new BitSet(new long[]{0xFFFF800000000000L,0x0000000000000FFFL});
    public static final BitSet FOLLOW_ruleArgument_in_ruleCommand4939 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommand4965 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_ruleCommand5007 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommand5033 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_ruleDisplayLevel_in_ruleCommand5075 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommand5101 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleCommand5118 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommand5140 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument5182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument5192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleArgument5251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument5277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute5318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute5328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute5375 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_ruleAttrType_in_ruleAttribute5417 = new BitSet(new long[]{0xFFFF800000000000L,0x0000000000000FFFL});
    public static final BitSet FOLLOW_ruleType_in_ruleAttribute5455 = new BitSet(new long[]{0x000001E000000000L});
    public static final BitSet FOLLOW_ruleRW_Type_in_ruleAttribute5493 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_ruleDisplayLevel_in_ruleAttribute5531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute5557 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute5587 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute5617 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute5647 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleAttribute5689 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleAttribute5727 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleFireEvents_in_ruleAttribute5765 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleFireEvents_in_ruleAttribute5803 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleFireEvents_in_ruleAttribute5841 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleInheritanceStatus_in_ruleAttribute5879 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttrProperties_in_ruleAttribute5917 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleAttribute5955 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleAttribute5993 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleAttribute6006 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute6028 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_46_in_ruleAttribute6046 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute6068 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleFireEvents_in_entryRuleFireEvents6110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFireEvents6120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleFireEvents6179 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleFireEvents6217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrProperties_in_entryRuleAttrProperties6254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrProperties6264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6311 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6341 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6401 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6461 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6491 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6581 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6611 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6641 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6671 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttrProperties6701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionalFile_in_entryRuleAdditionalFile6742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionalFile6752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAdditionalFile6799 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAdditionalFile6829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType6870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType6880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidType_in_ruleType6927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_ruleType6954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortType_in_ruleType6981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortType_in_ruleType7008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_ruleType7035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntType_in_ruleType7062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_ruleType7089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_ruleType7116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_ruleType7143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharArrayType_in_ruleType7170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortArrayType_in_ruleType7197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortArrayType_in_ruleType7224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntArrayType_in_ruleType7251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntArrayType_in_ruleType7278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatArrayType_in_ruleType7305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleArrayType_in_ruleType7332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringArrayType_in_ruleType7359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongStringArrayType_in_ruleType7386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleStringArrayType_in_ruleType7413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleType7440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstStringType_in_ruleType7467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanArrayType_in_ruleType7494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_ruleType7521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongType_in_ruleType7548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUCharType_in_ruleType7575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongArrayType_in_ruleType7602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongArrayType_in_ruleType7629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDevIntType_in_ruleType7656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncodedType_in_ruleType7683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidType_in_entryRuleVoidType7715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVoidType7725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleVoidType7768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_entryRuleBooleanType7801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanType7811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleBooleanType7854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortType_in_entryRuleShortType7887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortType7897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleShortType7940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortType_in_entryRuleUShortType7973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUShortType7983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleUShortType8026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_entryRuleIntType8059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntType8069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleIntType8112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntType_in_entryRuleUIntType8145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIntType8155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleUIntType8198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_entryRuleFloatType8231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatType8241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleFloatType8284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_entryRuleDoubleType8317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleType8327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleDoubleType8370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType8403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType8413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleStringType8456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharArrayType_in_entryRuleCharArrayType8489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharArrayType8499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleCharArrayType8542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortArrayType_in_entryRuleShortArrayType8575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortArrayType8585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleShortArrayType8628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortArrayType_in_entryRuleUShortArrayType8661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUShortArrayType8671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleUShortArrayType8714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntArrayType_in_entryRuleIntArrayType8747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntArrayType8757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleIntArrayType8800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntArrayType_in_entryRuleUIntArrayType8833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIntArrayType8843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleUIntArrayType8886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatArrayType_in_entryRuleFloatArrayType8919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatArrayType8929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleFloatArrayType8972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleArrayType_in_entryRuleDoubleArrayType9005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleArrayType9015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleDoubleArrayType9058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringArrayType_in_entryRuleStringArrayType9091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringArrayType9101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleStringArrayType9144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongStringArrayType_in_entryRuleLongStringArrayType9177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongStringArrayType9187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleLongStringArrayType9230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleStringArrayType_in_entryRuleDoubleStringArrayType9263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleStringArrayType9273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleDoubleStringArrayType9316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_entryRuleStateType9349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateType9359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleStateType9402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstStringType_in_entryRuleConstStringType9435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstStringType9445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleConstStringType9488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanArrayType_in_entryRuleBooleanArrayType9521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanArrayType9531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleBooleanArrayType9574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUCharType_in_entryRuleUCharType9607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUCharType9617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleUCharType9660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_entryRuleLongType9693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongType9703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleLongType9746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongType_in_entryRuleULongType9779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleULongType9789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleULongType9832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongArrayType_in_entryRuleLongArrayType9865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongArrayType9875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleLongArrayType9918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongArrayType_in_entryRuleULongArrayType9951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleULongArrayType9961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleULongArrayType10004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDevIntType_in_entryRuleDevIntType10037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDevIntType10047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleDevIntType10090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncodedType_in_entryRuleEncodedType10123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEncodedType10133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleEncodedType10176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortVectorType_in_entryRuleShortVectorType10209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortVectorType10219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleShortVectorType10262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntVectorType_in_entryRuleIntVectorType10295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntVectorType10305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleIntVectorType10348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatVectorType_in_entryRuleFloatVectorType10381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatVectorType10391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleFloatVectorType10434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleVectorType_in_entryRuleDoubleVectorType10467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleVectorType10477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleDoubleVectorType10520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVectorType_in_entryRuleStringVectorType10553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringVectorType10563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleStringVectorType10606 = new BitSet(new long[]{0x0000000000000002L});

}