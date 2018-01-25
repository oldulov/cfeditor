package edu.kit.scc.cfeditor.cfengine.parser.antlr.internal; 

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
import edu.kit.scc.cfeditor.cfengine.services.CfengineEditorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCfengineEditorParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ANY_OTHER", "RULE_SL_COMMENT", "RULE_WS", "'.'", "'!'", "'('", "')'", "'bundle'", "','", "'{'", "'}'", "':'", "'::'", "';'", "'=>'", "'@'", "'body'", "'$('", "'${'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=6;
    public static final int RULE_WS=8;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=7;

        public InternalCfengineEditorParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g"; }



     	private CfengineEditorGrammarAccess grammarAccess;
     	
        public InternalCfengineEditorParser(TokenStream input, IAstFactory factory, CfengineEditorGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "CfModel";	
       	}
       	
       	@Override
       	protected CfengineEditorGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleCfModel
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:77:1: entryRuleCfModel returns [EObject current=null] : iv_ruleCfModel= ruleCfModel EOF ;
    public final EObject entryRuleCfModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCfModel = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:78:2: (iv_ruleCfModel= ruleCfModel EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:79:2: iv_ruleCfModel= ruleCfModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCfModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleCfModel_in_entryRuleCfModel75);
            iv_ruleCfModel=ruleCfModel();
            _fsp--;

             current =iv_ruleCfModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCfModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCfModel


    // $ANTLR start ruleCfModel
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:86:1: ruleCfModel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleCfModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:91:6: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:92:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:92:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:93:1: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:93:1: (lv_elements_0_0= ruleAbstractElement )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:94:3: lv_elements_0_0= ruleAbstractElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCfModelAccess().getElementsAbstractElementParserRuleCall_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleCfModel130);
            	    lv_elements_0_0=ruleAbstractElement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCfModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"elements",
            	    	        		lv_elements_0_0, 
            	    	        		"AbstractElement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end ruleCfModel


    // $ANTLR start entryRuleCLASS_ID
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:124:1: entryRuleCLASS_ID returns [String current=null] : iv_ruleCLASS_ID= ruleCLASS_ID EOF ;
    public final String entryRuleCLASS_ID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCLASS_ID = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:125:2: (iv_ruleCLASS_ID= ruleCLASS_ID EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:126:2: iv_ruleCLASS_ID= ruleCLASS_ID EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCLASS_IDRule(), currentNode); 
            pushFollow(FOLLOW_ruleCLASS_ID_in_entryRuleCLASS_ID167);
            iv_ruleCLASS_ID=ruleCLASS_ID();
            _fsp--;

             current =iv_ruleCLASS_ID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCLASS_ID178); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCLASS_ID


    // $ANTLR start ruleCLASS_ID
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:133:1: ruleCLASS_ID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID (kw= '.' this_CLASS_ID_2= ruleCLASS_ID )? ) | (kw= '!' this_CLASS_ID_4= ruleCLASS_ID ) | (kw= '(' this_CLASS_ID_6= ruleCLASS_ID kw= ')' (kw= '.' this_CLASS_ID_9= ruleCLASS_ID )? ) ) ;
    public final AntlrDatatypeRuleToken ruleCLASS_ID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_CLASS_ID_2 = null;

        AntlrDatatypeRuleToken this_CLASS_ID_4 = null;

        AntlrDatatypeRuleToken this_CLASS_ID_6 = null;

        AntlrDatatypeRuleToken this_CLASS_ID_9 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:138:6: ( ( (this_ID_0= RULE_ID (kw= '.' this_CLASS_ID_2= ruleCLASS_ID )? ) | (kw= '!' this_CLASS_ID_4= ruleCLASS_ID ) | (kw= '(' this_CLASS_ID_6= ruleCLASS_ID kw= ')' (kw= '.' this_CLASS_ID_9= ruleCLASS_ID )? ) ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:139:1: ( (this_ID_0= RULE_ID (kw= '.' this_CLASS_ID_2= ruleCLASS_ID )? ) | (kw= '!' this_CLASS_ID_4= ruleCLASS_ID ) | (kw= '(' this_CLASS_ID_6= ruleCLASS_ID kw= ')' (kw= '.' this_CLASS_ID_9= ruleCLASS_ID )? ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:139:1: ( (this_ID_0= RULE_ID (kw= '.' this_CLASS_ID_2= ruleCLASS_ID )? ) | (kw= '!' this_CLASS_ID_4= ruleCLASS_ID ) | (kw= '(' this_CLASS_ID_6= ruleCLASS_ID kw= ')' (kw= '.' this_CLASS_ID_9= ruleCLASS_ID )? ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 10:
                {
                alt4=2;
                }
                break;
            case 11:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("139:1: ( (this_ID_0= RULE_ID (kw= '.' this_CLASS_ID_2= ruleCLASS_ID )? ) | (kw= '!' this_CLASS_ID_4= ruleCLASS_ID ) | (kw= '(' this_CLASS_ID_6= ruleCLASS_ID kw= ')' (kw= '.' this_CLASS_ID_9= ruleCLASS_ID )? ) )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:139:2: (this_ID_0= RULE_ID (kw= '.' this_CLASS_ID_2= ruleCLASS_ID )? )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:139:2: (this_ID_0= RULE_ID (kw= '.' this_CLASS_ID_2= ruleCLASS_ID )? )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:139:7: this_ID_0= RULE_ID (kw= '.' this_CLASS_ID_2= ruleCLASS_ID )?
                    {
                    this_ID_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCLASS_ID219); 

                    		current.merge(this_ID_0);
                        
                     
                        createLeafNode(grammarAccess.getCLASS_IDAccess().getIDTerminalRuleCall_0_0(), null); 
                        
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:146:1: (kw= '.' this_CLASS_ID_2= ruleCLASS_ID )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==9) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:147:2: kw= '.' this_CLASS_ID_2= ruleCLASS_ID
                            {
                            kw=(Token)input.LT(1);
                            match(input,9,FOLLOW_9_in_ruleCLASS_ID238); 

                                    current.merge(kw);
                                    createLeafNode(grammarAccess.getCLASS_IDAccess().getFullStopKeyword_0_1_0(), null); 
                                
                             
                                    currentNode=createCompositeNode(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_0_1_1(), currentNode); 
                                
                            pushFollow(FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID260);
                            this_CLASS_ID_2=ruleCLASS_ID();
                            _fsp--;


                            		current.merge(this_CLASS_ID_2);
                                
                             
                                    currentNode = currentNode.getParent();
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:164:6: (kw= '!' this_CLASS_ID_4= ruleCLASS_ID )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:164:6: (kw= '!' this_CLASS_ID_4= ruleCLASS_ID )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:165:2: kw= '!' this_CLASS_ID_4= ruleCLASS_ID
                    {
                    kw=(Token)input.LT(1);
                    match(input,10,FOLLOW_10_in_ruleCLASS_ID288); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getCLASS_IDAccess().getExclamationMarkKeyword_1_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_1_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID310);
                    this_CLASS_ID_4=ruleCLASS_ID();
                    _fsp--;


                    		current.merge(this_CLASS_ID_4);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }


                    }
                    break;
                case 3 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:182:6: (kw= '(' this_CLASS_ID_6= ruleCLASS_ID kw= ')' (kw= '.' this_CLASS_ID_9= ruleCLASS_ID )? )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:182:6: (kw= '(' this_CLASS_ID_6= ruleCLASS_ID kw= ')' (kw= '.' this_CLASS_ID_9= ruleCLASS_ID )? )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:183:2: kw= '(' this_CLASS_ID_6= ruleCLASS_ID kw= ')' (kw= '.' this_CLASS_ID_9= ruleCLASS_ID )?
                    {
                    kw=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleCLASS_ID336); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getCLASS_IDAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_2_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID358);
                    this_CLASS_ID_6=ruleCLASS_ID();
                    _fsp--;


                    		current.merge(this_CLASS_ID_6);
                        
                     
                            currentNode = currentNode.getParent();
                        
                    kw=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleCLASS_ID376); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getCLASS_IDAccess().getRightParenthesisKeyword_2_2(), null); 
                        
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:205:1: (kw= '.' this_CLASS_ID_9= ruleCLASS_ID )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==9) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:206:2: kw= '.' this_CLASS_ID_9= ruleCLASS_ID
                            {
                            kw=(Token)input.LT(1);
                            match(input,9,FOLLOW_9_in_ruleCLASS_ID390); 

                                    current.merge(kw);
                                    createLeafNode(grammarAccess.getCLASS_IDAccess().getFullStopKeyword_2_3_0(), null); 
                                
                             
                                    currentNode=createCompositeNode(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_2_3_1(), currentNode); 
                                
                            pushFollow(FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID412);
                            this_CLASS_ID_9=ruleCLASS_ID();
                            _fsp--;


                            		current.merge(this_CLASS_ID_9);
                                
                             
                                    currentNode = currentNode.getParent();
                                

                            }
                            break;

                    }


                    }


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
    // $ANTLR end ruleCLASS_ID


    // $ANTLR start entryRuleAbstractElement
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:230:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:231:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:232:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbstractElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement460);
            iv_ruleAbstractElement=ruleAbstractElement();
            _fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement470); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAbstractElement


    // $ANTLR start ruleAbstractElement
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:239:1: ruleAbstractElement returns [EObject current=null] : (this_Bundle_0= ruleBundle | this_Body_1= ruleBody ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Bundle_0 = null;

        EObject this_Body_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:244:6: ( (this_Bundle_0= ruleBundle | this_Body_1= ruleBody ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:245:1: (this_Bundle_0= ruleBundle | this_Body_1= ruleBody )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:245:1: (this_Bundle_0= ruleBundle | this_Body_1= ruleBody )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("245:1: (this_Bundle_0= ruleBundle | this_Body_1= ruleBody )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:246:5: this_Bundle_0= ruleBundle
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractElementAccess().getBundleParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBundle_in_ruleAbstractElement517);
                    this_Bundle_0=ruleBundle();
                    _fsp--;

                     
                            current = this_Bundle_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:256:5: this_Body_1= ruleBody
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractElementAccess().getBodyParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBody_in_ruleAbstractElement544);
                    this_Body_1=ruleBody();
                    _fsp--;

                     
                            current = this_Body_1; 
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
    // $ANTLR end ruleAbstractElement


    // $ANTLR start entryRuleBundle
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:272:1: entryRuleBundle returns [EObject current=null] : iv_ruleBundle= ruleBundle EOF ;
    public final EObject entryRuleBundle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundle = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:273:2: (iv_ruleBundle= ruleBundle EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:274:2: iv_ruleBundle= ruleBundle EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBundleRule(), currentNode); 
            pushFollow(FOLLOW_ruleBundle_in_entryRuleBundle579);
            iv_ruleBundle=ruleBundle();
            _fsp--;

             current =iv_ruleBundle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundle589); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBundle


    // $ANTLR start ruleBundle
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:281:1: ruleBundle returns [EObject current=null] : ( 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )? '{' ( (lv_promiseType_9_0= ruleBundlePromiseType ) )* '}' ) ;
    public final EObject ruleBundle() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_variables_4_0=null;
        Token lv_variables_6_0=null;
        EObject lv_component_1_0 = null;

        EObject lv_promiseType_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:286:6: ( ( 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )? '{' ( (lv_promiseType_9_0= ruleBundlePromiseType ) )* '}' ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:287:1: ( 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )? '{' ( (lv_promiseType_9_0= ruleBundlePromiseType ) )* '}' )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:287:1: ( 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )? '{' ( (lv_promiseType_9_0= ruleBundlePromiseType ) )* '}' )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:287:3: 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )? '{' ( (lv_promiseType_9_0= ruleBundlePromiseType ) )* '}'
            {
            match(input,13,FOLLOW_13_in_ruleBundle624); 

                    createLeafNode(grammarAccess.getBundleAccess().getBundleKeyword_0(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:291:1: ( (lv_component_1_0= ruleBundleComponent ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:292:1: (lv_component_1_0= ruleBundleComponent )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:292:1: (lv_component_1_0= ruleBundleComponent )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:293:3: lv_component_1_0= ruleBundleComponent
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBundleAccess().getComponentBundleComponentParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBundleComponent_in_ruleBundle645);
            lv_component_1_0=ruleBundleComponent();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBundleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"component",
            	        		lv_component_1_0, 
            	        		"BundleComponent", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:315:2: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:316:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:316:1: (lv_name_2_0= RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:317:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundle662); 

            			createLeafNode(grammarAccess.getBundleAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBundleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:339:2: ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:339:4: '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')'
                    {
                    match(input,11,FOLLOW_11_in_ruleBundle678); 

                            createLeafNode(grammarAccess.getBundleAccess().getLeftParenthesisKeyword_3_0(), null); 
                        
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:343:1: ( (lv_variables_4_0= RULE_ID ) )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:344:1: (lv_variables_4_0= RULE_ID )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:344:1: (lv_variables_4_0= RULE_ID )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:345:3: lv_variables_4_0= RULE_ID
                    {
                    lv_variables_4_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundle695); 

                    			createLeafNode(grammarAccess.getBundleAccess().getVariablesIDTerminalRuleCall_3_1_0(), "variables"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBundleRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"variables",
                    	        		lv_variables_4_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:367:2: ( ',' ( (lv_variables_6_0= RULE_ID ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:367:4: ',' ( (lv_variables_6_0= RULE_ID ) )
                    	    {
                    	    match(input,14,FOLLOW_14_in_ruleBundle711); 

                    	            createLeafNode(grammarAccess.getBundleAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:371:1: ( (lv_variables_6_0= RULE_ID ) )
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:372:1: (lv_variables_6_0= RULE_ID )
                    	    {
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:372:1: (lv_variables_6_0= RULE_ID )
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:373:3: lv_variables_6_0= RULE_ID
                    	    {
                    	    lv_variables_6_0=(Token)input.LT(1);
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundle728); 

                    	    			createLeafNode(grammarAccess.getBundleAccess().getVariablesIDTerminalRuleCall_3_2_1_0(), "variables"); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getBundleRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"variables",
                    	    	        		lv_variables_6_0, 
                    	    	        		"ID", 
                    	    	        		lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match(input,12,FOLLOW_12_in_ruleBundle745); 

                            createLeafNode(grammarAccess.getBundleAccess().getRightParenthesisKeyword_3_3(), null); 
                        

                    }
                    break;

            }

            match(input,15,FOLLOW_15_in_ruleBundle757); 

                    createLeafNode(grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:403:1: ( (lv_promiseType_9_0= ruleBundlePromiseType ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:404:1: (lv_promiseType_9_0= ruleBundlePromiseType )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:404:1: (lv_promiseType_9_0= ruleBundlePromiseType )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:405:3: lv_promiseType_9_0= ruleBundlePromiseType
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBundleAccess().getPromiseTypeBundlePromiseTypeParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBundlePromiseType_in_ruleBundle778);
            	    lv_promiseType_9_0=ruleBundlePromiseType();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBundleRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"promiseType",
            	    	        		lv_promiseType_9_0, 
            	    	        		"BundlePromiseType", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleBundle789); 

                    createLeafNode(grammarAccess.getBundleAccess().getRightCurlyBracketKeyword_6(), null); 
                

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
    // $ANTLR end ruleBundle


    // $ANTLR start entryRuleBundlePromiseType
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:439:1: entryRuleBundlePromiseType returns [EObject current=null] : iv_ruleBundlePromiseType= ruleBundlePromiseType EOF ;
    public final EObject entryRuleBundlePromiseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundlePromiseType = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:440:2: (iv_ruleBundlePromiseType= ruleBundlePromiseType EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:441:2: iv_ruleBundlePromiseType= ruleBundlePromiseType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBundlePromiseTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleBundlePromiseType_in_entryRuleBundlePromiseType825);
            iv_ruleBundlePromiseType=ruleBundlePromiseType();
            _fsp--;

             current =iv_ruleBundlePromiseType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundlePromiseType835); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBundlePromiseType


    // $ANTLR start ruleBundlePromiseType
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:448:1: ruleBundlePromiseType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_promises_2_0= ruleBundlePromise ) )* ( (lv_classes_3_0= ruleBundleClass ) )* ) ;
    public final EObject ruleBundlePromiseType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_promises_2_0 = null;

        EObject lv_classes_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:453:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_promises_2_0= ruleBundlePromise ) )* ( (lv_classes_3_0= ruleBundleClass ) )* ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:454:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_promises_2_0= ruleBundlePromise ) )* ( (lv_classes_3_0= ruleBundleClass ) )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:454:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_promises_2_0= ruleBundlePromise ) )* ( (lv_classes_3_0= ruleBundleClass ) )* )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:454:2: ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_promises_2_0= ruleBundlePromise ) )* ( (lv_classes_3_0= ruleBundleClass ) )*
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:454:2: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:455:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:455:1: (lv_name_0_0= RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:456:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundlePromiseType877); 

            			createLeafNode(grammarAccess.getBundlePromiseTypeAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBundlePromiseTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,17,FOLLOW_17_in_ruleBundlePromiseType892); 

                    createLeafNode(grammarAccess.getBundlePromiseTypeAccess().getColonKeyword_1(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:482:1: ( (lv_promises_2_0= ruleBundlePromise ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:483:1: (lv_promises_2_0= ruleBundlePromise )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:483:1: (lv_promises_2_0= ruleBundlePromise )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:484:3: lv_promises_2_0= ruleBundlePromise
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBundlePromiseTypeAccess().getPromisesBundlePromiseParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBundlePromise_in_ruleBundlePromiseType913);
            	    lv_promises_2_0=ruleBundlePromise();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBundlePromiseTypeRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"promises",
            	    	        		lv_promises_2_0, 
            	    	        		"BundlePromise", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:506:3: ( (lv_classes_3_0= ruleBundleClass ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==9||LA10_2==18) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>=10 && LA10_0<=11)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:507:1: (lv_classes_3_0= ruleBundleClass )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:507:1: (lv_classes_3_0= ruleBundleClass )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:508:3: lv_classes_3_0= ruleBundleClass
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBundlePromiseTypeAccess().getClassesBundleClassParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBundleClass_in_ruleBundlePromiseType935);
            	    lv_classes_3_0=ruleBundleClass();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBundlePromiseTypeRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"classes",
            	    	        		lv_classes_3_0, 
            	    	        		"BundleClass", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end ruleBundlePromiseType


    // $ANTLR start entryRuleBundleClass
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:538:1: entryRuleBundleClass returns [EObject current=null] : iv_ruleBundleClass= ruleBundleClass EOF ;
    public final EObject entryRuleBundleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundleClass = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:539:2: (iv_ruleBundleClass= ruleBundleClass EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:540:2: iv_ruleBundleClass= ruleBundleClass EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBundleClassRule(), currentNode); 
            pushFollow(FOLLOW_ruleBundleClass_in_entryRuleBundleClass972);
            iv_ruleBundleClass=ruleBundleClass();
            _fsp--;

             current =iv_ruleBundleClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundleClass982); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBundleClass


    // $ANTLR start ruleBundleClass
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:547:1: ruleBundleClass returns [EObject current=null] : ( ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promises_2_0= ruleBundlePromise ) )+ ) ;
    public final EObject ruleBundleClass() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_promises_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:552:6: ( ( ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promises_2_0= ruleBundlePromise ) )+ ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:553:1: ( ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promises_2_0= ruleBundlePromise ) )+ )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:553:1: ( ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promises_2_0= ruleBundlePromise ) )+ )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:553:2: ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promises_2_0= ruleBundlePromise ) )+
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:553:2: ( (lv_name_0_0= ruleCLASS_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:554:1: (lv_name_0_0= ruleCLASS_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:554:1: (lv_name_0_0= ruleCLASS_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:555:3: lv_name_0_0= ruleCLASS_ID
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBundleClassAccess().getNameCLASS_IDParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCLASS_ID_in_ruleBundleClass1028);
            lv_name_0_0=ruleCLASS_ID();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBundleClassRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"CLASS_ID", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,18,FOLLOW_18_in_ruleBundleClass1038); 

                    createLeafNode(grammarAccess.getBundleClassAccess().getColonColonKeyword_1(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:581:1: ( (lv_promises_2_0= ruleBundlePromise ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:582:1: (lv_promises_2_0= ruleBundlePromise )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:582:1: (lv_promises_2_0= ruleBundlePromise )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:583:3: lv_promises_2_0= ruleBundlePromise
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBundleClassAccess().getPromisesBundlePromiseParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBundlePromise_in_ruleBundleClass1059);
            	    lv_promises_2_0=ruleBundlePromise();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBundleClassRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"promises",
            	    	        		lv_promises_2_0, 
            	    	        		"BundlePromise", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
    // $ANTLR end ruleBundleClass


    // $ANTLR start entryRuleBundlePromise
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:613:1: entryRuleBundlePromise returns [EObject current=null] : iv_ruleBundlePromise= ruleBundlePromise EOF ;
    public final EObject entryRuleBundlePromise() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundlePromise = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:614:2: (iv_ruleBundlePromise= ruleBundlePromise EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:615:2: iv_ruleBundlePromise= ruleBundlePromise EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBundlePromiseRule(), currentNode); 
            pushFollow(FOLLOW_ruleBundlePromise_in_entryRuleBundlePromise1096);
            iv_ruleBundlePromise=ruleBundlePromise();
            _fsp--;

             current =iv_ruleBundlePromise; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundlePromise1106); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBundlePromise


    // $ANTLR start ruleBundlePromise
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:622:1: ruleBundlePromise returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) ( ( (lv_values_1_0= rulePromiseValue ) ) ( ',' ( (lv_values_3_0= rulePromiseValue ) ) )* )? ';' ) ;
    public final EObject ruleBundlePromise() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:627:6: ( ( ( (lv_name_0_0= RULE_STRING ) ) ( ( (lv_values_1_0= rulePromiseValue ) ) ( ',' ( (lv_values_3_0= rulePromiseValue ) ) )* )? ';' ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:628:1: ( ( (lv_name_0_0= RULE_STRING ) ) ( ( (lv_values_1_0= rulePromiseValue ) ) ( ',' ( (lv_values_3_0= rulePromiseValue ) ) )* )? ';' )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:628:1: ( ( (lv_name_0_0= RULE_STRING ) ) ( ( (lv_values_1_0= rulePromiseValue ) ) ( ',' ( (lv_values_3_0= rulePromiseValue ) ) )* )? ';' )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:628:2: ( (lv_name_0_0= RULE_STRING ) ) ( ( (lv_values_1_0= rulePromiseValue ) ) ( ',' ( (lv_values_3_0= rulePromiseValue ) ) )* )? ';'
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:628:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:629:1: (lv_name_0_0= RULE_STRING )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:629:1: (lv_name_0_0= RULE_STRING )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:630:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBundlePromise1148); 

            			createLeafNode(grammarAccess.getBundlePromiseAccess().getNameSTRINGTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBundlePromiseRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:652:2: ( ( (lv_values_1_0= rulePromiseValue ) ) ( ',' ( (lv_values_3_0= rulePromiseValue ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:652:3: ( (lv_values_1_0= rulePromiseValue ) ) ( ',' ( (lv_values_3_0= rulePromiseValue ) ) )*
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:652:3: ( (lv_values_1_0= rulePromiseValue ) )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:653:1: (lv_values_1_0= rulePromiseValue )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:653:1: (lv_values_1_0= rulePromiseValue )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:654:3: lv_values_1_0= rulePromiseValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBundlePromiseAccess().getValuesPromiseValueParserRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePromiseValue_in_ruleBundlePromise1175);
                    lv_values_1_0=rulePromiseValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBundlePromiseRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"values",
                    	        		lv_values_1_0, 
                    	        		"PromiseValue", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:676:2: ( ',' ( (lv_values_3_0= rulePromiseValue ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:676:4: ',' ( (lv_values_3_0= rulePromiseValue ) )
                    	    {
                    	    match(input,14,FOLLOW_14_in_ruleBundlePromise1186); 

                    	            createLeafNode(grammarAccess.getBundlePromiseAccess().getCommaKeyword_1_1_0(), null); 
                    	        
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:680:1: ( (lv_values_3_0= rulePromiseValue ) )
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:681:1: (lv_values_3_0= rulePromiseValue )
                    	    {
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:681:1: (lv_values_3_0= rulePromiseValue )
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:682:3: lv_values_3_0= rulePromiseValue
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getBundlePromiseAccess().getValuesPromiseValueParserRuleCall_1_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePromiseValue_in_ruleBundlePromise1207);
                    	    lv_values_3_0=rulePromiseValue();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getBundlePromiseRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"values",
                    	    	        		lv_values_3_0, 
                    	    	        		"PromiseValue", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_ruleBundlePromise1221); 

                    createLeafNode(grammarAccess.getBundlePromiseAccess().getSemicolonKeyword_2(), null); 
                

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
    // $ANTLR end ruleBundlePromise


    // $ANTLR start entryRulePromiseValue
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:716:1: entryRulePromiseValue returns [EObject current=null] : iv_rulePromiseValue= rulePromiseValue EOF ;
    public final EObject entryRulePromiseValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePromiseValue = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:717:2: (iv_rulePromiseValue= rulePromiseValue EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:718:2: iv_rulePromiseValue= rulePromiseValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPromiseValueRule(), currentNode); 
            pushFollow(FOLLOW_rulePromiseValue_in_entryRulePromiseValue1257);
            iv_rulePromiseValue=rulePromiseValue();
            _fsp--;

             current =iv_rulePromiseValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePromiseValue1267); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePromiseValue


    // $ANTLR start rulePromiseValue
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:725:1: rulePromiseValue returns [EObject current=null] : ( ( (lv_keyword_0_0= RULE_ID ) ) '=>' ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) | ( (lv_values_4_0= RULE_ID ) ) ) | ( '{' ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )* '}' ) | ( '{' '@' '(' RULE_ID ')' '}' ) ) ) ;
    public final EObject rulePromiseValue() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        Token lv_values_2_0=null;
        Token lv_values_4_0=null;
        Token lv_values_6_0=null;
        Token lv_values_9_0=null;
        EObject lv_functions_3_0 = null;

        EObject lv_functions_7_0 = null;

        EObject lv_functions_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:730:6: ( ( ( (lv_keyword_0_0= RULE_ID ) ) '=>' ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) | ( (lv_values_4_0= RULE_ID ) ) ) | ( '{' ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )* '}' ) | ( '{' '@' '(' RULE_ID ')' '}' ) ) ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:731:1: ( ( (lv_keyword_0_0= RULE_ID ) ) '=>' ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) | ( (lv_values_4_0= RULE_ID ) ) ) | ( '{' ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )* '}' ) | ( '{' '@' '(' RULE_ID ')' '}' ) ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:731:1: ( ( (lv_keyword_0_0= RULE_ID ) ) '=>' ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) | ( (lv_values_4_0= RULE_ID ) ) ) | ( '{' ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )* '}' ) | ( '{' '@' '(' RULE_ID ')' '}' ) ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:731:2: ( (lv_keyword_0_0= RULE_ID ) ) '=>' ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) | ( (lv_values_4_0= RULE_ID ) ) ) | ( '{' ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )* '}' ) | ( '{' '@' '(' RULE_ID ')' '}' ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:731:2: ( (lv_keyword_0_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:732:1: (lv_keyword_0_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:732:1: (lv_keyword_0_0= RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:733:3: lv_keyword_0_0= RULE_ID
            {
            lv_keyword_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePromiseValue1309); 

            			createLeafNode(grammarAccess.getPromiseValueAccess().getKeywordIDTerminalRuleCall_0_0(), "keyword"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPromiseValueRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"keyword",
            	        		lv_keyword_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,20,FOLLOW_20_in_rulePromiseValue1324); 

                    createLeafNode(grammarAccess.getPromiseValueAccess().getEqualsSignGreaterThanSignKeyword_1(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:759:1: ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) | ( (lv_values_4_0= RULE_ID ) ) ) | ( '{' ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )* '}' ) | ( '{' '@' '(' RULE_ID ')' '}' ) )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_STRING)) ) {
                alt18=1;
            }
            else if ( (LA18_0==15) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==21) ) {
                    alt18=3;
                }
                else if ( ((LA18_2>=RULE_ID && LA18_2<=RULE_STRING)) ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("759:1: ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) | ( (lv_values_4_0= RULE_ID ) ) ) | ( '{' ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )* '}' ) | ( '{' '@' '(' RULE_ID ')' '}' ) )", 18, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("759:1: ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) | ( (lv_values_4_0= RULE_ID ) ) ) | ( '{' ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )* '}' ) | ( '{' '@' '(' RULE_ID ')' '}' ) )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:759:2: ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) | ( (lv_values_4_0= RULE_ID ) ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:759:2: ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) | ( (lv_values_4_0= RULE_ID ) ) )
                    int alt14=3;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_STRING) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==RULE_ID) ) {
                        int LA14_2 = input.LA(2);

                        if ( (LA14_2==11) ) {
                            alt14=2;
                        }
                        else if ( (LA14_2==EOF||LA14_2==14||LA14_2==19) ) {
                            alt14=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("759:2: ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) | ( (lv_values_4_0= RULE_ID ) ) )", 14, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("759:2: ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) | ( (lv_values_4_0= RULE_ID ) ) )", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:759:3: ( (lv_values_2_0= RULE_STRING ) )
                            {
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:759:3: ( (lv_values_2_0= RULE_STRING ) )
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:760:1: (lv_values_2_0= RULE_STRING )
                            {
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:760:1: (lv_values_2_0= RULE_STRING )
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:761:3: lv_values_2_0= RULE_STRING
                            {
                            lv_values_2_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePromiseValue1343); 

                            			createLeafNode(grammarAccess.getPromiseValueAccess().getValuesSTRINGTerminalRuleCall_2_0_0_0(), "values"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getPromiseValueRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"values",
                            	        		lv_values_2_0, 
                            	        		"STRING", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:784:6: ( (lv_functions_3_0= ruleSimpleFunction ) )
                            {
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:784:6: ( (lv_functions_3_0= ruleSimpleFunction ) )
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:785:1: (lv_functions_3_0= ruleSimpleFunction )
                            {
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:785:1: (lv_functions_3_0= ruleSimpleFunction )
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:786:3: lv_functions_3_0= ruleSimpleFunction
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getPromiseValueAccess().getFunctionsSimpleFunctionParserRuleCall_2_0_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleSimpleFunction_in_rulePromiseValue1375);
                            lv_functions_3_0=ruleSimpleFunction();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getPromiseValueRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"functions",
                            	        		lv_functions_3_0, 
                            	        		"SimpleFunction", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:809:6: ( (lv_values_4_0= RULE_ID ) )
                            {
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:809:6: ( (lv_values_4_0= RULE_ID ) )
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:810:1: (lv_values_4_0= RULE_ID )
                            {
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:810:1: (lv_values_4_0= RULE_ID )
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:811:3: lv_values_4_0= RULE_ID
                            {
                            lv_values_4_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePromiseValue1398); 

                            			createLeafNode(grammarAccess.getPromiseValueAccess().getValuesIDTerminalRuleCall_2_0_2_0(), "values"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getPromiseValueRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"values",
                            	        		lv_values_4_0, 
                            	        		"ID", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:834:6: ( '{' ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )* '}' )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:834:6: ( '{' ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )* '}' )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:834:8: '{' ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )* '}'
                    {
                    match(input,15,FOLLOW_15_in_rulePromiseValue1421); 

                            createLeafNode(grammarAccess.getPromiseValueAccess().getLeftCurlyBracketKeyword_2_1_0(), null); 
                        
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:838:1: ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_STRING) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==RULE_ID) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("838:1: ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) )", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:838:2: ( (lv_values_6_0= RULE_STRING ) )
                            {
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:838:2: ( (lv_values_6_0= RULE_STRING ) )
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:839:1: (lv_values_6_0= RULE_STRING )
                            {
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:839:1: (lv_values_6_0= RULE_STRING )
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:840:3: lv_values_6_0= RULE_STRING
                            {
                            lv_values_6_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePromiseValue1439); 

                            			createLeafNode(grammarAccess.getPromiseValueAccess().getValuesSTRINGTerminalRuleCall_2_1_1_0_0(), "values"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getPromiseValueRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"values",
                            	        		lv_values_6_0, 
                            	        		"STRING", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:863:6: ( (lv_functions_7_0= ruleSimpleFunction ) )
                            {
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:863:6: ( (lv_functions_7_0= ruleSimpleFunction ) )
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:864:1: (lv_functions_7_0= ruleSimpleFunction )
                            {
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:864:1: (lv_functions_7_0= ruleSimpleFunction )
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:865:3: lv_functions_7_0= ruleSimpleFunction
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getPromiseValueAccess().getFunctionsSimpleFunctionParserRuleCall_2_1_1_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleSimpleFunction_in_rulePromiseValue1471);
                            lv_functions_7_0=ruleSimpleFunction();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getPromiseValueRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"functions",
                            	        		lv_functions_7_0, 
                            	        		"SimpleFunction", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:887:3: ( ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:887:5: ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) )
                    	    {
                    	    match(input,14,FOLLOW_14_in_rulePromiseValue1483); 

                    	            createLeafNode(grammarAccess.getPromiseValueAccess().getCommaKeyword_2_1_2_0(), null); 
                    	        
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:891:1: ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) )
                    	    int alt16=2;
                    	    int LA16_0 = input.LA(1);

                    	    if ( (LA16_0==RULE_STRING) ) {
                    	        alt16=1;
                    	    }
                    	    else if ( (LA16_0==RULE_ID) ) {
                    	        alt16=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("891:1: ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) )", 16, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt16) {
                    	        case 1 :
                    	            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:891:2: ( (lv_values_9_0= RULE_STRING ) )
                    	            {
                    	            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:891:2: ( (lv_values_9_0= RULE_STRING ) )
                    	            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:892:1: (lv_values_9_0= RULE_STRING )
                    	            {
                    	            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:892:1: (lv_values_9_0= RULE_STRING )
                    	            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:893:3: lv_values_9_0= RULE_STRING
                    	            {
                    	            lv_values_9_0=(Token)input.LT(1);
                    	            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePromiseValue1501); 

                    	            			createLeafNode(grammarAccess.getPromiseValueAccess().getValuesSTRINGTerminalRuleCall_2_1_2_1_0_0(), "values"); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getPromiseValueRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode, current);
                    	            	        }
                    	            	        try {
                    	            	       		add(
                    	            	       			current, 
                    	            	       			"values",
                    	            	        		lv_values_9_0, 
                    	            	        		"STRING", 
                    	            	        		lastConsumedNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:916:6: ( (lv_functions_10_0= ruleSimpleFunction ) )
                    	            {
                    	            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:916:6: ( (lv_functions_10_0= ruleSimpleFunction ) )
                    	            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:917:1: (lv_functions_10_0= ruleSimpleFunction )
                    	            {
                    	            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:917:1: (lv_functions_10_0= ruleSimpleFunction )
                    	            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:918:3: lv_functions_10_0= ruleSimpleFunction
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getPromiseValueAccess().getFunctionsSimpleFunctionParserRuleCall_2_1_2_1_1_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleSimpleFunction_in_rulePromiseValue1533);
                    	            lv_functions_10_0=ruleSimpleFunction();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getPromiseValueRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        try {
                    	            	       		add(
                    	            	       			current, 
                    	            	       			"functions",
                    	            	        		lv_functions_10_0, 
                    	            	        		"SimpleFunction", 
                    	            	        		currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    match(input,16,FOLLOW_16_in_rulePromiseValue1546); 

                            createLeafNode(grammarAccess.getPromiseValueAccess().getRightCurlyBracketKeyword_2_1_3(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:945:6: ( '{' '@' '(' RULE_ID ')' '}' )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:945:6: ( '{' '@' '(' RULE_ID ')' '}' )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:945:8: '{' '@' '(' RULE_ID ')' '}'
                    {
                    match(input,15,FOLLOW_15_in_rulePromiseValue1564); 

                            createLeafNode(grammarAccess.getPromiseValueAccess().getLeftCurlyBracketKeyword_2_2_0(), null); 
                        
                    match(input,21,FOLLOW_21_in_rulePromiseValue1574); 

                            createLeafNode(grammarAccess.getPromiseValueAccess().getCommercialAtKeyword_2_2_1(), null); 
                        
                    match(input,11,FOLLOW_11_in_rulePromiseValue1584); 

                            createLeafNode(grammarAccess.getPromiseValueAccess().getLeftParenthesisKeyword_2_2_2(), null); 
                        
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePromiseValue1593); 
                     
                        createLeafNode(grammarAccess.getPromiseValueAccess().getIDTerminalRuleCall_2_2_3(), null); 
                        
                    match(input,12,FOLLOW_12_in_rulePromiseValue1602); 

                            createLeafNode(grammarAccess.getPromiseValueAccess().getRightParenthesisKeyword_2_2_4(), null); 
                        
                    match(input,16,FOLLOW_16_in_rulePromiseValue1612); 

                            createLeafNode(grammarAccess.getPromiseValueAccess().getRightCurlyBracketKeyword_2_2_5(), null); 
                        

                    }


                    }
                    break;

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
    // $ANTLR end rulePromiseValue


    // $ANTLR start entryRuleBody
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:977:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:978:2: (iv_ruleBody= ruleBody EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:979:2: iv_ruleBody= ruleBody EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBodyRule(), currentNode); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody1650);
            iv_ruleBody=ruleBody();
            _fsp--;

             current =iv_ruleBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody1660); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBody


    // $ANTLR start ruleBody
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:986:1: ruleBody returns [EObject current=null] : ( 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )? '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* '}' ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_variables_4_0=null;
        Token lv_variables_6_0=null;
        EObject lv_component_1_0 = null;

        EObject lv_promiseType_9_0 = null;

        EObject lv_classes_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:991:6: ( ( 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )? '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* '}' ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:992:1: ( 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )? '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* '}' )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:992:1: ( 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )? '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* '}' )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:992:3: 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )? '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* '}'
            {
            match(input,22,FOLLOW_22_in_ruleBody1695); 

                    createLeafNode(grammarAccess.getBodyAccess().getBodyKeyword_0(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:996:1: ( (lv_component_1_0= ruleBodyComponent ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:997:1: (lv_component_1_0= ruleBodyComponent )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:997:1: (lv_component_1_0= ruleBodyComponent )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:998:3: lv_component_1_0= ruleBodyComponent
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBodyAccess().getComponentBodyComponentParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBodyComponent_in_ruleBody1716);
            lv_component_1_0=ruleBodyComponent();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBodyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"component",
            	        		lv_component_1_0, 
            	        		"BodyComponent", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1020:2: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1021:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1021:1: (lv_name_2_0= RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1022:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBody1733); 

            			createLeafNode(grammarAccess.getBodyAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBodyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1044:2: ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==11) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1044:4: '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')'
                    {
                    match(input,11,FOLLOW_11_in_ruleBody1749); 

                            createLeafNode(grammarAccess.getBodyAccess().getLeftParenthesisKeyword_3_0(), null); 
                        
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1048:1: ( (lv_variables_4_0= RULE_ID ) )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1049:1: (lv_variables_4_0= RULE_ID )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1049:1: (lv_variables_4_0= RULE_ID )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1050:3: lv_variables_4_0= RULE_ID
                    {
                    lv_variables_4_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBody1766); 

                    			createLeafNode(grammarAccess.getBodyAccess().getVariablesIDTerminalRuleCall_3_1_0(), "variables"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBodyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"variables",
                    	        		lv_variables_4_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1072:2: ( ',' ( (lv_variables_6_0= RULE_ID ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1072:4: ',' ( (lv_variables_6_0= RULE_ID ) )
                    	    {
                    	    match(input,14,FOLLOW_14_in_ruleBody1782); 

                    	            createLeafNode(grammarAccess.getBodyAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1076:1: ( (lv_variables_6_0= RULE_ID ) )
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1077:1: (lv_variables_6_0= RULE_ID )
                    	    {
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1077:1: (lv_variables_6_0= RULE_ID )
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1078:3: lv_variables_6_0= RULE_ID
                    	    {
                    	    lv_variables_6_0=(Token)input.LT(1);
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBody1799); 

                    	    			createLeafNode(grammarAccess.getBodyAccess().getVariablesIDTerminalRuleCall_3_2_1_0(), "variables"); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getBodyRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"variables",
                    	    	        		lv_variables_6_0, 
                    	    	        		"ID", 
                    	    	        		lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    match(input,12,FOLLOW_12_in_ruleBody1816); 

                            createLeafNode(grammarAccess.getBodyAccess().getRightParenthesisKeyword_3_3(), null); 
                        

                    }
                    break;

            }

            match(input,15,FOLLOW_15_in_ruleBody1828); 

                    createLeafNode(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1108:1: ( (lv_promiseType_9_0= ruleBodyFunction ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1==20) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1109:1: (lv_promiseType_9_0= ruleBodyFunction )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1109:1: (lv_promiseType_9_0= ruleBodyFunction )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1110:3: lv_promiseType_9_0= ruleBodyFunction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBodyAccess().getPromiseTypeBodyFunctionParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBodyFunction_in_ruleBody1849);
            	    lv_promiseType_9_0=ruleBodyFunction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBodyRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"promiseType",
            	    	        		lv_promiseType_9_0, 
            	    	        		"BodyFunction", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1132:3: ( (lv_classes_10_0= ruleBodyClass ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||(LA22_0>=10 && LA22_0<=11)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1133:1: (lv_classes_10_0= ruleBodyClass )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1133:1: (lv_classes_10_0= ruleBodyClass )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1134:3: lv_classes_10_0= ruleBodyClass
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBodyAccess().getClassesBodyClassParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBodyClass_in_ruleBody1871);
            	    lv_classes_10_0=ruleBodyClass();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBodyRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"classes",
            	    	        		lv_classes_10_0, 
            	    	        		"BodyClass", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleBody1882); 

                    createLeafNode(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_7(), null); 
                

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
    // $ANTLR end ruleBody


    // $ANTLR start entryRuleBodyClass
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1168:1: entryRuleBodyClass returns [EObject current=null] : iv_ruleBodyClass= ruleBodyClass EOF ;
    public final EObject entryRuleBodyClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyClass = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1169:2: (iv_ruleBodyClass= ruleBodyClass EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1170:2: iv_ruleBodyClass= ruleBodyClass EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBodyClassRule(), currentNode); 
            pushFollow(FOLLOW_ruleBodyClass_in_entryRuleBodyClass1918);
            iv_ruleBodyClass=ruleBodyClass();
            _fsp--;

             current =iv_ruleBodyClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyClass1928); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBodyClass


    // $ANTLR start ruleBodyClass
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1177:1: ruleBodyClass returns [EObject current=null] : ( ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )* ) ;
    public final EObject ruleBodyClass() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_promiseType_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1182:6: ( ( ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )* ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1183:1: ( ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1183:1: ( ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )* )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1183:2: ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )*
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1183:2: ( (lv_name_0_0= ruleCLASS_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1184:1: (lv_name_0_0= ruleCLASS_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1184:1: (lv_name_0_0= ruleCLASS_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1185:3: lv_name_0_0= ruleCLASS_ID
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBodyClassAccess().getNameCLASS_IDParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCLASS_ID_in_ruleBodyClass1974);
            lv_name_0_0=ruleCLASS_ID();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBodyClassRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"CLASS_ID", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,18,FOLLOW_18_in_ruleBodyClass1984); 

                    createLeafNode(grammarAccess.getBodyClassAccess().getColonColonKeyword_1(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1211:1: ( (lv_promiseType_2_0= ruleBodyFunction ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    int LA23_2 = input.LA(2);

                    if ( (LA23_2==20) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1212:1: (lv_promiseType_2_0= ruleBodyFunction )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1212:1: (lv_promiseType_2_0= ruleBodyFunction )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1213:3: lv_promiseType_2_0= ruleBodyFunction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBodyClassAccess().getPromiseTypeBodyFunctionParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBodyFunction_in_ruleBodyClass2005);
            	    lv_promiseType_2_0=ruleBodyFunction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBodyClassRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"promiseType",
            	    	        		lv_promiseType_2_0, 
            	    	        		"BodyFunction", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

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
    // $ANTLR end ruleBodyClass


    // $ANTLR start entryRuleBodyFunction
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1243:1: entryRuleBodyFunction returns [EObject current=null] : iv_ruleBodyFunction= ruleBodyFunction EOF ;
    public final EObject entryRuleBodyFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyFunction = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1244:2: (iv_ruleBodyFunction= ruleBodyFunction EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1245:2: iv_ruleBodyFunction= ruleBodyFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBodyFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleBodyFunction_in_entryRuleBodyFunction2042);
            iv_ruleBodyFunction=ruleBodyFunction();
            _fsp--;

             current =iv_ruleBodyFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyFunction2052); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBodyFunction


    // $ANTLR start ruleBodyFunction
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1252:1: ruleBodyFunction returns [EObject current=null] : ( ( (lv_name_0_0= ruleBodyPromiseType ) ) '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' '(' RULE_ID ')' '}' ) ) ';' ) ;
    public final EObject ruleBodyFunction() throws RecognitionException {
        EObject current = null;

        Token lv_values_2_0=null;
        Token lv_List_3_0=null;
        Token lv_values_4_0=null;
        Token lv_values_6_0=null;
        EObject lv_name_0_0 = null;

        EObject lv_function_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1257:6: ( ( ( (lv_name_0_0= ruleBodyPromiseType ) ) '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' '(' RULE_ID ')' '}' ) ) ';' ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1258:1: ( ( (lv_name_0_0= ruleBodyPromiseType ) ) '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' '(' RULE_ID ')' '}' ) ) ';' )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1258:1: ( ( (lv_name_0_0= ruleBodyPromiseType ) ) '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' '(' RULE_ID ')' '}' ) ) ';' )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1258:2: ( (lv_name_0_0= ruleBodyPromiseType ) ) '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' '(' RULE_ID ')' '}' ) ) ';'
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1258:2: ( (lv_name_0_0= ruleBodyPromiseType ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1259:1: (lv_name_0_0= ruleBodyPromiseType )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1259:1: (lv_name_0_0= ruleBodyPromiseType )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1260:3: lv_name_0_0= ruleBodyPromiseType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBodyFunctionAccess().getNameBodyPromiseTypeParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBodyPromiseType_in_ruleBodyFunction2098);
            lv_name_0_0=ruleBodyPromiseType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBodyFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"BodyPromiseType", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,20,FOLLOW_20_in_ruleBodyFunction2108); 

                    createLeafNode(grammarAccess.getBodyFunctionAccess().getEqualsSignGreaterThanSignKeyword_1(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1286:1: ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' '(' RULE_ID ')' '}' ) )
            int alt25=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt25=1;
                }
                break;
            case 15:
                {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==21) ) {
                    alt25=4;
                }
                else if ( (LA25_2==RULE_STRING) ) {
                    alt25=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1286:1: ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' '(' RULE_ID ')' '}' ) )", 25, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1286:1: ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' '(' RULE_ID ')' '}' ) )", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1286:2: ( (lv_values_2_0= RULE_STRING ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1286:2: ( (lv_values_2_0= RULE_STRING ) )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1287:1: (lv_values_2_0= RULE_STRING )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1287:1: (lv_values_2_0= RULE_STRING )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1288:3: lv_values_2_0= RULE_STRING
                    {
                    lv_values_2_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBodyFunction2126); 

                    			createLeafNode(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_0_0(), "values"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBodyFunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"values",
                    	        		lv_values_2_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1311:6: ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1311:6: ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1311:7: ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}'
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1311:7: ( (lv_List_3_0= '{' ) )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1312:1: (lv_List_3_0= '{' )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1312:1: (lv_List_3_0= '{' )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1313:3: lv_List_3_0= '{'
                    {
                    lv_List_3_0=(Token)input.LT(1);
                    match(input,15,FOLLOW_15_in_ruleBodyFunction2156); 

                            createLeafNode(grammarAccess.getBodyFunctionAccess().getListLeftCurlyBracketKeyword_2_1_0_0(), "List"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBodyFunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "List", true, "{", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1332:2: ( (lv_values_4_0= RULE_STRING ) )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1333:1: (lv_values_4_0= RULE_STRING )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1333:1: (lv_values_4_0= RULE_STRING )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1334:3: lv_values_4_0= RULE_STRING
                    {
                    lv_values_4_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBodyFunction2186); 

                    			createLeafNode(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_1_1_0(), "values"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBodyFunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"values",
                    	        		lv_values_4_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1356:2: ( ',' ( (lv_values_6_0= RULE_STRING ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==14) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1356:4: ',' ( (lv_values_6_0= RULE_STRING ) )
                    	    {
                    	    match(input,14,FOLLOW_14_in_ruleBodyFunction2202); 

                    	            createLeafNode(grammarAccess.getBodyFunctionAccess().getCommaKeyword_2_1_2_0(), null); 
                    	        
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1360:1: ( (lv_values_6_0= RULE_STRING ) )
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1361:1: (lv_values_6_0= RULE_STRING )
                    	    {
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1361:1: (lv_values_6_0= RULE_STRING )
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1362:3: lv_values_6_0= RULE_STRING
                    	    {
                    	    lv_values_6_0=(Token)input.LT(1);
                    	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBodyFunction2219); 

                    	    			createLeafNode(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_1_2_1_0(), "values"); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getBodyFunctionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"values",
                    	    	        		lv_values_6_0, 
                    	    	        		"STRING", 
                    	    	        		lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    match(input,16,FOLLOW_16_in_ruleBodyFunction2236); 

                            createLeafNode(grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_1_3(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1389:6: ( (lv_function_8_0= ruleSpecialFunction ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1389:6: ( (lv_function_8_0= ruleSpecialFunction ) )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1390:1: (lv_function_8_0= ruleSpecialFunction )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1390:1: (lv_function_8_0= ruleSpecialFunction )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1391:3: lv_function_8_0= ruleSpecialFunction
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBodyFunctionAccess().getFunctionSpecialFunctionParserRuleCall_2_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSpecialFunction_in_ruleBodyFunction2264);
                    lv_function_8_0=ruleSpecialFunction();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBodyFunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"function",
                    	        		lv_function_8_0, 
                    	        		"SpecialFunction", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1414:6: ( '{' '@' '(' RULE_ID ')' '}' )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1414:6: ( '{' '@' '(' RULE_ID ')' '}' )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1414:8: '{' '@' '(' RULE_ID ')' '}'
                    {
                    match(input,15,FOLLOW_15_in_ruleBodyFunction2281); 

                            createLeafNode(grammarAccess.getBodyFunctionAccess().getLeftCurlyBracketKeyword_2_3_0(), null); 
                        
                    match(input,21,FOLLOW_21_in_ruleBodyFunction2291); 

                            createLeafNode(grammarAccess.getBodyFunctionAccess().getCommercialAtKeyword_2_3_1(), null); 
                        
                    match(input,11,FOLLOW_11_in_ruleBodyFunction2301); 

                            createLeafNode(grammarAccess.getBodyFunctionAccess().getLeftParenthesisKeyword_2_3_2(), null); 
                        
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBodyFunction2310); 
                     
                        createLeafNode(grammarAccess.getBodyFunctionAccess().getIDTerminalRuleCall_2_3_3(), null); 
                        
                    match(input,12,FOLLOW_12_in_ruleBodyFunction2319); 

                            createLeafNode(grammarAccess.getBodyFunctionAccess().getRightParenthesisKeyword_2_3_4(), null); 
                        
                    match(input,16,FOLLOW_16_in_ruleBodyFunction2329); 

                            createLeafNode(grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_3_5(), null); 
                        

                    }


                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_ruleBodyFunction2341); 

                    createLeafNode(grammarAccess.getBodyFunctionAccess().getSemicolonKeyword_3(), null); 
                

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
    // $ANTLR end ruleBodyFunction


    // $ANTLR start entryRuleSimpleFunction
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1450:1: entryRuleSimpleFunction returns [EObject current=null] : iv_ruleSimpleFunction= ruleSimpleFunction EOF ;
    public final EObject entryRuleSimpleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleFunction = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1451:2: (iv_ruleSimpleFunction= ruleSimpleFunction EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1452:2: iv_ruleSimpleFunction= ruleSimpleFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSimpleFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSimpleFunction_in_entryRuleSimpleFunction2377);
            iv_ruleSimpleFunction=ruleSimpleFunction();
            _fsp--;

             current =iv_ruleSimpleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleFunction2387); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSimpleFunction


    // $ANTLR start ruleSimpleFunction
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1459:1: ruleSimpleFunction returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) '(' ( (lv_values_2_0= RULE_STRING ) ) ( ',' ( (lv_values_4_0= RULE_STRING ) ) )* ')' ) ;
    public final EObject ruleSimpleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token lv_values_2_0=null;
        Token lv_values_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1464:6: ( ( ( (lv_id_0_0= RULE_ID ) ) '(' ( (lv_values_2_0= RULE_STRING ) ) ( ',' ( (lv_values_4_0= RULE_STRING ) ) )* ')' ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1465:1: ( ( (lv_id_0_0= RULE_ID ) ) '(' ( (lv_values_2_0= RULE_STRING ) ) ( ',' ( (lv_values_4_0= RULE_STRING ) ) )* ')' )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1465:1: ( ( (lv_id_0_0= RULE_ID ) ) '(' ( (lv_values_2_0= RULE_STRING ) ) ( ',' ( (lv_values_4_0= RULE_STRING ) ) )* ')' )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1465:2: ( (lv_id_0_0= RULE_ID ) ) '(' ( (lv_values_2_0= RULE_STRING ) ) ( ',' ( (lv_values_4_0= RULE_STRING ) ) )* ')'
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1465:2: ( (lv_id_0_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1466:1: (lv_id_0_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1466:1: (lv_id_0_0= RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1467:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleFunction2429); 

            			createLeafNode(grammarAccess.getSimpleFunctionAccess().getIdIDTerminalRuleCall_0_0(), "id"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSimpleFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"id",
            	        		lv_id_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,11,FOLLOW_11_in_ruleSimpleFunction2444); 

                    createLeafNode(grammarAccess.getSimpleFunctionAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1493:1: ( (lv_values_2_0= RULE_STRING ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1494:1: (lv_values_2_0= RULE_STRING )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1494:1: (lv_values_2_0= RULE_STRING )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1495:3: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleFunction2461); 

            			createLeafNode(grammarAccess.getSimpleFunctionAccess().getValuesSTRINGTerminalRuleCall_2_0(), "values"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSimpleFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"values",
            	        		lv_values_2_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1517:2: ( ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==14) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1517:4: ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    match(input,14,FOLLOW_14_in_ruleSimpleFunction2477); 

            	            createLeafNode(grammarAccess.getSimpleFunctionAccess().getCommaKeyword_3_0(), null); 
            	        
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1521:1: ( (lv_values_4_0= RULE_STRING ) )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1522:1: (lv_values_4_0= RULE_STRING )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1522:1: (lv_values_4_0= RULE_STRING )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1523:3: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)input.LT(1);
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleFunction2494); 

            	    			createLeafNode(grammarAccess.getSimpleFunctionAccess().getValuesSTRINGTerminalRuleCall_3_1_0(), "values"); 
            	    		

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSimpleFunctionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"values",
            	    	        		lv_values_4_0, 
            	    	        		"STRING", 
            	    	        		lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            match(input,12,FOLLOW_12_in_ruleSimpleFunction2511); 

                    createLeafNode(grammarAccess.getSimpleFunctionAccess().getRightParenthesisKeyword_4(), null); 
                

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
    // $ANTLR end ruleSimpleFunction


    // $ANTLR start entryRuleSpecialFunction
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1557:1: entryRuleSpecialFunction returns [EObject current=null] : iv_ruleSpecialFunction= ruleSpecialFunction EOF ;
    public final EObject entryRuleSpecialFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialFunction = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1558:2: (iv_ruleSpecialFunction= ruleSpecialFunction EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1559:2: iv_ruleSpecialFunction= ruleSpecialFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSpecialFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSpecialFunction_in_entryRuleSpecialFunction2547);
            iv_ruleSpecialFunction=ruleSpecialFunction();
            _fsp--;

             current =iv_ruleSpecialFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialFunction2557); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSpecialFunction


    // $ANTLR start ruleSpecialFunction
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1566:1: ruleSpecialFunction returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) '(' ( RULE_ANY_OTHER | RULE_ID | RULE_STRING | ',' | ( '$(' RULE_ID ')' ) | ( '${' RULE_ID '}' ) | ( (lv_func_12_0= ruleSpecialFunction ) ) )* ')' ) ;
    public final EObject ruleSpecialFunction() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        EObject lv_func_12_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1571:6: ( ( ( (lv_id_0_0= RULE_ID ) ) '(' ( RULE_ANY_OTHER | RULE_ID | RULE_STRING | ',' | ( '$(' RULE_ID ')' ) | ( '${' RULE_ID '}' ) | ( (lv_func_12_0= ruleSpecialFunction ) ) )* ')' ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1572:1: ( ( (lv_id_0_0= RULE_ID ) ) '(' ( RULE_ANY_OTHER | RULE_ID | RULE_STRING | ',' | ( '$(' RULE_ID ')' ) | ( '${' RULE_ID '}' ) | ( (lv_func_12_0= ruleSpecialFunction ) ) )* ')' )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1572:1: ( ( (lv_id_0_0= RULE_ID ) ) '(' ( RULE_ANY_OTHER | RULE_ID | RULE_STRING | ',' | ( '$(' RULE_ID ')' ) | ( '${' RULE_ID '}' ) | ( (lv_func_12_0= ruleSpecialFunction ) ) )* ')' )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1572:2: ( (lv_id_0_0= RULE_ID ) ) '(' ( RULE_ANY_OTHER | RULE_ID | RULE_STRING | ',' | ( '$(' RULE_ID ')' ) | ( '${' RULE_ID '}' ) | ( (lv_func_12_0= ruleSpecialFunction ) ) )* ')'
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1572:2: ( (lv_id_0_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1573:1: (lv_id_0_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1573:1: (lv_id_0_0= RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1574:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialFunction2599); 

            			createLeafNode(grammarAccess.getSpecialFunctionAccess().getIdIDTerminalRuleCall_0_0(), "id"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSpecialFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"id",
            	        		lv_id_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,11,FOLLOW_11_in_ruleSpecialFunction2614); 

                    createLeafNode(grammarAccess.getSpecialFunctionAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1600:1: ( RULE_ANY_OTHER | RULE_ID | RULE_STRING | ',' | ( '$(' RULE_ID ')' ) | ( '${' RULE_ID '}' ) | ( (lv_func_12_0= ruleSpecialFunction ) ) )*
            loop27:
            do {
                int alt27=8;
                switch ( input.LA(1) ) {
                case RULE_ANY_OTHER:
                    {
                    alt27=1;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA27_3 = input.LA(2);

                    if ( (LA27_3==11) ) {
                        alt27=7;
                    }
                    else if ( ((LA27_3>=RULE_ID && LA27_3<=RULE_ANY_OTHER)||LA27_3==12||LA27_3==14||(LA27_3>=23 && LA27_3<=24)) ) {
                        alt27=2;
                    }


                    }
                    break;
                case RULE_STRING:
                    {
                    alt27=3;
                    }
                    break;
                case 14:
                    {
                    alt27=4;
                    }
                    break;
                case 23:
                    {
                    alt27=5;
                    }
                    break;
                case 24:
                    {
                    alt27=6;
                    }
                    break;

                }

                switch (alt27) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1600:2: RULE_ANY_OTHER
            	    {
            	    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleSpecialFunction2624); 
            	     
            	        createLeafNode(grammarAccess.getSpecialFunctionAccess().getANY_OTHERTerminalRuleCall_2_0(), null); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1605:6: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialFunction2638); 
            	     
            	        createLeafNode(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_1(), null); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1610:6: RULE_STRING
            	    {
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSpecialFunction2652); 
            	     
            	        createLeafNode(grammarAccess.getSpecialFunctionAccess().getSTRINGTerminalRuleCall_2_2(), null); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1615:7: ','
            	    {
            	    match(input,14,FOLLOW_14_in_ruleSpecialFunction2667); 

            	            createLeafNode(grammarAccess.getSpecialFunctionAccess().getCommaKeyword_2_3(), null); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1620:6: ( '$(' RULE_ID ')' )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1620:6: ( '$(' RULE_ID ')' )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1620:8: '$(' RULE_ID ')'
            	    {
            	    match(input,23,FOLLOW_23_in_ruleSpecialFunction2684); 

            	            createLeafNode(grammarAccess.getSpecialFunctionAccess().getDollarSignLeftParenthesisKeyword_2_4_0(), null); 
            	        
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialFunction2693); 
            	     
            	        createLeafNode(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_4_1(), null); 
            	        
            	    match(input,12,FOLLOW_12_in_ruleSpecialFunction2702); 

            	            createLeafNode(grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_2_4_2(), null); 
            	        

            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1633:6: ( '${' RULE_ID '}' )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1633:6: ( '${' RULE_ID '}' )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1633:8: '${' RULE_ID '}'
            	    {
            	    match(input,24,FOLLOW_24_in_ruleSpecialFunction2720); 

            	            createLeafNode(grammarAccess.getSpecialFunctionAccess().getDollarSignLeftCurlyBracketKeyword_2_5_0(), null); 
            	        
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialFunction2729); 
            	     
            	        createLeafNode(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_5_1(), null); 
            	        
            	    match(input,16,FOLLOW_16_in_ruleSpecialFunction2738); 

            	            createLeafNode(grammarAccess.getSpecialFunctionAccess().getRightCurlyBracketKeyword_2_5_2(), null); 
            	        

            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1646:6: ( (lv_func_12_0= ruleSpecialFunction ) )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1646:6: ( (lv_func_12_0= ruleSpecialFunction ) )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1647:1: (lv_func_12_0= ruleSpecialFunction )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1647:1: (lv_func_12_0= ruleSpecialFunction )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1648:3: lv_func_12_0= ruleSpecialFunction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSpecialFunctionAccess().getFuncSpecialFunctionParserRuleCall_2_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSpecialFunction_in_ruleSpecialFunction2766);
            	    lv_func_12_0=ruleSpecialFunction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSpecialFunctionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"func",
            	    	        		lv_func_12_0, 
            	    	        		"SpecialFunction", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            match(input,12,FOLLOW_12_in_ruleSpecialFunction2778); 

                    createLeafNode(grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_3(), null); 
                

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
    // $ANTLR end ruleSpecialFunction


    // $ANTLR start entryRuleBodyPromiseType
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1682:1: entryRuleBodyPromiseType returns [EObject current=null] : iv_ruleBodyPromiseType= ruleBodyPromiseType EOF ;
    public final EObject entryRuleBodyPromiseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyPromiseType = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1683:2: (iv_ruleBodyPromiseType= ruleBodyPromiseType EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1684:2: iv_ruleBodyPromiseType= ruleBodyPromiseType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBodyPromiseTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleBodyPromiseType_in_entryRuleBodyPromiseType2814);
            iv_ruleBodyPromiseType=ruleBodyPromiseType();
            _fsp--;

             current =iv_ruleBodyPromiseType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyPromiseType2824); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBodyPromiseType


    // $ANTLR start ruleBodyPromiseType
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1691:1: ruleBodyPromiseType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBodyPromiseType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1696:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1697:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1697:1: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1698:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1698:1: (lv_name_0_0= RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1699:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBodyPromiseType2865); 

            			createLeafNode(grammarAccess.getBodyPromiseTypeAccess().getNameIDTerminalRuleCall_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBodyPromiseTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
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
    // $ANTLR end ruleBodyPromiseType


    // $ANTLR start entryRuleBundleComponent
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1729:1: entryRuleBundleComponent returns [EObject current=null] : iv_ruleBundleComponent= ruleBundleComponent EOF ;
    public final EObject entryRuleBundleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundleComponent = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1730:2: (iv_ruleBundleComponent= ruleBundleComponent EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1731:2: iv_ruleBundleComponent= ruleBundleComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBundleComponentRule(), currentNode); 
            pushFollow(FOLLOW_ruleBundleComponent_in_entryRuleBundleComponent2905);
            iv_ruleBundleComponent=ruleBundleComponent();
            _fsp--;

             current =iv_ruleBundleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundleComponent2915); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBundleComponent


    // $ANTLR start ruleBundleComponent
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1738:1: ruleBundleComponent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBundleComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1743:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1744:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1744:1: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1745:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1745:1: (lv_name_0_0= RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1746:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundleComponent2956); 

            			createLeafNode(grammarAccess.getBundleComponentAccess().getNameIDTerminalRuleCall_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBundleComponentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
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
    // $ANTLR end ruleBundleComponent


    // $ANTLR start entryRuleBodyComponent
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1776:1: entryRuleBodyComponent returns [EObject current=null] : iv_ruleBodyComponent= ruleBodyComponent EOF ;
    public final EObject entryRuleBodyComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyComponent = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1777:2: (iv_ruleBodyComponent= ruleBodyComponent EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1778:2: iv_ruleBodyComponent= ruleBodyComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBodyComponentRule(), currentNode); 
            pushFollow(FOLLOW_ruleBodyComponent_in_entryRuleBodyComponent2996);
            iv_ruleBodyComponent=ruleBodyComponent();
            _fsp--;

             current =iv_ruleBodyComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyComponent3006); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBodyComponent


    // $ANTLR start ruleBodyComponent
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1785:1: ruleBodyComponent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBodyComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1790:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1791:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1791:1: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1792:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1792:1: (lv_name_0_0= RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1793:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBodyComponent3047); 

            			createLeafNode(grammarAccess.getBodyComponentAccess().getNameIDTerminalRuleCall_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBodyComponentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
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
    // $ANTLR end ruleBodyComponent


 

    public static final BitSet FOLLOW_ruleCfModel_in_entryRuleCfModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCfModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleCfModel130 = new BitSet(new long[]{0x0000000000402002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_entryRuleCLASS_ID167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCLASS_ID178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCLASS_ID219 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_9_in_ruleCLASS_ID238 = new BitSet(new long[]{0x0000000000000C10L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleCLASS_ID288 = new BitSet(new long[]{0x0000000000000C10L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleCLASS_ID336 = new BitSet(new long[]{0x0000000000000C10L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID358 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCLASS_ID376 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_9_in_ruleCLASS_ID390 = new BitSet(new long[]{0x0000000000000C10L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_ruleAbstractElement517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_ruleAbstractElement544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_entryRuleBundle579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundle589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleBundle624 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBundleComponent_in_ruleBundle645 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundle662 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_11_in_ruleBundle678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundle695 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_14_in_ruleBundle711 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundle728 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_12_in_ruleBundle745 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBundle757 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleBundlePromiseType_in_ruleBundle778 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleBundle789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundlePromiseType_in_entryRuleBundlePromiseType825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundlePromiseType835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundlePromiseType877 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBundlePromiseType892 = new BitSet(new long[]{0x0000000000000C32L});
    public static final BitSet FOLLOW_ruleBundlePromise_in_ruleBundlePromiseType913 = new BitSet(new long[]{0x0000000000000C32L});
    public static final BitSet FOLLOW_ruleBundleClass_in_ruleBundlePromiseType935 = new BitSet(new long[]{0x0000000000000C12L});
    public static final BitSet FOLLOW_ruleBundleClass_in_entryRuleBundleClass972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundleClass982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_ruleBundleClass1028 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBundleClass1038 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleBundlePromise_in_ruleBundleClass1059 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleBundlePromise_in_entryRuleBundlePromise1096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundlePromise1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBundlePromise1148 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rulePromiseValue_in_ruleBundlePromise1175 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_14_in_ruleBundlePromise1186 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePromiseValue_in_ruleBundlePromise1207 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_19_in_ruleBundlePromise1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePromiseValue_in_entryRulePromiseValue1257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePromiseValue1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePromiseValue1309 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePromiseValue1324 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePromiseValue1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_rulePromiseValue1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePromiseValue1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePromiseValue1421 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePromiseValue1439 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_rulePromiseValue1471 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_14_in_rulePromiseValue1483 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePromiseValue1501 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_rulePromiseValue1533 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_16_in_rulePromiseValue1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePromiseValue1564 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePromiseValue1574 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rulePromiseValue1584 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePromiseValue1593 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePromiseValue1602 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePromiseValue1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody1650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleBody1695 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_ruleBody1716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBody1733 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_11_in_ruleBody1749 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBody1766 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_14_in_ruleBody1782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBody1799 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_12_in_ruleBody1816 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBody1828 = new BitSet(new long[]{0x0000000000010C10L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_ruleBody1849 = new BitSet(new long[]{0x0000000000010C10L});
    public static final BitSet FOLLOW_ruleBodyClass_in_ruleBody1871 = new BitSet(new long[]{0x0000000000010C10L});
    public static final BitSet FOLLOW_16_in_ruleBody1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyClass_in_entryRuleBodyClass1918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyClass1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_ruleBodyClass1974 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBodyClass1984 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_ruleBodyClass2005 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_entryRuleBodyFunction2042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyFunction2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyPromiseType_in_ruleBodyFunction2098 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBodyFunction2108 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBodyFunction2126 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15_in_ruleBodyFunction2156 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBodyFunction2186 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_14_in_ruleBodyFunction2202 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBodyFunction2219 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_16_in_ruleBodyFunction2236 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_ruleBodyFunction2264 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15_in_ruleBodyFunction2281 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBodyFunction2291 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleBodyFunction2301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBodyFunction2310 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBodyFunction2319 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBodyFunction2329 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBodyFunction2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_entryRuleSimpleFunction2377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleFunction2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleFunction2429 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSimpleFunction2444 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleFunction2461 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_14_in_ruleSimpleFunction2477 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleFunction2494 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_12_in_ruleSimpleFunction2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_entryRuleSpecialFunction2547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialFunction2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialFunction2599 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSpecialFunction2614 = new BitSet(new long[]{0x0000000001805070L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleSpecialFunction2624 = new BitSet(new long[]{0x0000000001805070L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialFunction2638 = new BitSet(new long[]{0x0000000001805070L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSpecialFunction2652 = new BitSet(new long[]{0x0000000001805070L});
    public static final BitSet FOLLOW_14_in_ruleSpecialFunction2667 = new BitSet(new long[]{0x0000000001805070L});
    public static final BitSet FOLLOW_23_in_ruleSpecialFunction2684 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialFunction2693 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSpecialFunction2702 = new BitSet(new long[]{0x0000000001805070L});
    public static final BitSet FOLLOW_24_in_ruleSpecialFunction2720 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialFunction2729 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSpecialFunction2738 = new BitSet(new long[]{0x0000000001805070L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_ruleSpecialFunction2766 = new BitSet(new long[]{0x0000000001805070L});
    public static final BitSet FOLLOW_12_in_ruleSpecialFunction2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyPromiseType_in_entryRuleBodyPromiseType2814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyPromiseType2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBodyPromiseType2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundleComponent_in_entryRuleBundleComponent2905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundleComponent2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundleComponent2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_entryRuleBodyComponent2996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyComponent3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBodyComponent3047 = new BitSet(new long[]{0x0000000000000002L});

}