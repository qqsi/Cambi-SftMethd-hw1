

/* First created by JCasGen Wed Sep 11 14:31:46 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 11 15:13:36 EDT 2013
 * XML source: /Users/Cambi/Documents/Program/EclipseWorkspace/hw1-taog/src/main/resources/hw1-taog-typesystem.xml
 * @generated */
public class NGram extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGram.class);
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
  protected NGram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NGram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NGram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NGram(JCas jcas, int begin, int end) {
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
  //* Feature: n

  /** getter for n - gets 
   * @generated */
  public int getN() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_n == null)
      jcasType.jcas.throwFeatMissing("n", "NGram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((NGram_Type)jcasType).casFeatCode_n);}
    
  /** setter for n - sets  
   * @generated */
  public void setN(int v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_n == null)
      jcasType.jcas.throwFeatMissing("n", "NGram");
    jcasType.ll_cas.ll_setIntValue(addr, ((NGram_Type)jcasType).casFeatCode_n, v);}    
   
    
  //*--------------*
  //* Feature: tokenList

  /** getter for tokenList - gets 
   * @generated */
  public FSArray getTokenList() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_tokenList == null)
      jcasType.jcas.throwFeatMissing("tokenList", "NGram");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokenList)));}
    
  /** setter for tokenList - sets  
   * @generated */
  public void setTokenList(FSArray v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_tokenList == null)
      jcasType.jcas.throwFeatMissing("tokenList", "NGram");
    jcasType.ll_cas.ll_setRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokenList, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for tokenList - gets an indexed value - 
   * @generated */
  public Token getTokenList(int i) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_tokenList == null)
      jcasType.jcas.throwFeatMissing("tokenList", "NGram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokenList), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokenList), i)));}

  /** indexed setter for tokenList - sets an indexed value - 
   * @generated */
  public void setTokenList(int i, Token v) { 
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_tokenList == null)
      jcasType.jcas.throwFeatMissing("tokenList", "NGram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokenList), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokenList), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    