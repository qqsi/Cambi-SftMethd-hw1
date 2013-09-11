

/* First created by JCasGen Wed Sep 11 14:31:46 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** The entire test element

 * Updated by JCasGen Wed Sep 11 15:13:36 EDT 2013
 * XML source: /Users/Cambi/Documents/Program/EclipseWorkspace/hw1-taog/src/main/resources/hw1-taog-typesystem.xml
 * @generated */
public class TestElement extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TestElement.class);
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
  protected TestElement() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TestElement(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TestElement(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public TestElement(JCas jcas, int begin, int end) {
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
  //* Feature: question

  /** getter for question - gets 
   * @generated */
  public Question getQuestion() {
    if (TestElement_Type.featOkTst && ((TestElement_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "TestElement");
    return (Question)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TestElement_Type)jcasType).casFeatCode_question)));}
    
  /** setter for question - sets  
   * @generated */
  public void setQuestion(Question v) {
    if (TestElement_Type.featOkTst && ((TestElement_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "TestElement");
    jcasType.ll_cas.ll_setRefValue(addr, ((TestElement_Type)jcasType).casFeatCode_question, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: answerList

  /** getter for answerList - gets 
   * @generated */
  public FSArray getAnswerList() {
    if (TestElement_Type.featOkTst && ((TestElement_Type)jcasType).casFeat_answerList == null)
      jcasType.jcas.throwFeatMissing("answerList", "TestElement");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TestElement_Type)jcasType).casFeatCode_answerList)));}
    
  /** setter for answerList - sets  
   * @generated */
  public void setAnswerList(FSArray v) {
    if (TestElement_Type.featOkTst && ((TestElement_Type)jcasType).casFeat_answerList == null)
      jcasType.jcas.throwFeatMissing("answerList", "TestElement");
    jcasType.ll_cas.ll_setRefValue(addr, ((TestElement_Type)jcasType).casFeatCode_answerList, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for answerList - gets an indexed value - 
   * @generated */
  public Answer getAnswerList(int i) {
    if (TestElement_Type.featOkTst && ((TestElement_Type)jcasType).casFeat_answerList == null)
      jcasType.jcas.throwFeatMissing("answerList", "TestElement");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TestElement_Type)jcasType).casFeatCode_answerList), i);
    return (Answer)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TestElement_Type)jcasType).casFeatCode_answerList), i)));}

  /** indexed setter for answerList - sets an indexed value - 
   * @generated */
  public void setAnswerList(int i, Answer v) { 
    if (TestElement_Type.featOkTst && ((TestElement_Type)jcasType).casFeat_answerList == null)
      jcasType.jcas.throwFeatMissing("answerList", "TestElement");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TestElement_Type)jcasType).casFeatCode_answerList), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TestElement_Type)jcasType).casFeatCode_answerList), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: precision

  /** getter for precision - gets 
   * @generated */
  public int getPrecision() {
    if (TestElement_Type.featOkTst && ((TestElement_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "TestElement");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TestElement_Type)jcasType).casFeatCode_precision);}
    
  /** setter for precision - sets  
   * @generated */
  public void setPrecision(int v) {
    if (TestElement_Type.featOkTst && ((TestElement_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "TestElement");
    jcasType.ll_cas.ll_setIntValue(addr, ((TestElement_Type)jcasType).casFeatCode_precision, v);}    
  }

    