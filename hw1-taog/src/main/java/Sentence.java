

/* First created by JCasGen Wed Sep 11 14:31:46 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** 
 * Updated by JCasGen Wed Sep 11 15:13:36 EDT 2013
 * XML source: /Users/Cambi/Documents/Program/EclipseWorkspace/hw1-taog/src/main/resources/hw1-taog-typesystem.xml
 * @generated */
public class Sentence extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Sentence.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Sentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Sentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Sentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Sentence(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: tokenList

  /** getter for tokenList - gets 
   * @generated */
  public FSArray getTokenList() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_tokenList == null)
      jcasType.jcas.throwFeatMissing("tokenList", "Sentence");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokenList)));}
    
  /** setter for tokenList - sets  
   * @generated */
  public void setTokenList(FSArray v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_tokenList == null)
      jcasType.jcas.throwFeatMissing("tokenList", "Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokenList, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for tokenList - gets an indexed value - 
   * @generated */
  public Token getTokenList(int i) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_tokenList == null)
      jcasType.jcas.throwFeatMissing("tokenList", "Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokenList), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokenList), i)));}

  /** indexed setter for tokenList - sets an indexed value - 
   * @generated */
  public void setTokenList(int i, Token v) { 
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_tokenList == null)
      jcasType.jcas.throwFeatMissing("tokenList", "Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokenList), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokenList), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: nGramList

  /** getter for nGramList - gets 
   * @generated */
  public FSArray getNGramList() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_nGramList == null)
      jcasType.jcas.throwFeatMissing("nGramList", "Sentence");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_nGramList)));}
    
  /** setter for nGramList - sets  
   * @generated */
  public void setNGramList(FSArray v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_nGramList == null)
      jcasType.jcas.throwFeatMissing("nGramList", "Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_nGramList, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for nGramList - gets an indexed value - 
   * @generated */
  public NGram getNGramList(int i) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_nGramList == null)
      jcasType.jcas.throwFeatMissing("nGramList", "Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_nGramList), i);
    return (NGram)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_nGramList), i)));}

  /** indexed setter for nGramList - sets an indexed value - 
   * @generated */
  public void setNGramList(int i, NGram v) { 
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_nGramList == null)
      jcasType.jcas.throwFeatMissing("nGramList", "Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_nGramList), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_nGramList), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    