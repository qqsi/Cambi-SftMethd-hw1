
/* First created by JCasGen Wed Sep 11 14:31:46 EDT 2013 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** The entire test element

 * Updated by JCasGen Wed Sep 11 15:13:36 EDT 2013
 * @generated */
public class TestElement_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (TestElement_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = TestElement_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new TestElement(addr, TestElement_Type.this);
  			   TestElement_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new TestElement(addr, TestElement_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TestElement.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("TestElement");
 
  /** @generated */
  final Feature casFeat_question;
  /** @generated */
  final int     casFeatCode_question;
  /** @generated */ 
  public int getQuestion(int addr) {
        if (featOkTst && casFeat_question == null)
      jcas.throwFeatMissing("question", "TestElement");
    return ll_cas.ll_getRefValue(addr, casFeatCode_question);
  }
  /** @generated */    
  public void setQuestion(int addr, int v) {
        if (featOkTst && casFeat_question == null)
      jcas.throwFeatMissing("question", "TestElement");
    ll_cas.ll_setRefValue(addr, casFeatCode_question, v);}
    
  
 
  /** @generated */
  final Feature casFeat_answerList;
  /** @generated */
  final int     casFeatCode_answerList;
  /** @generated */ 
  public int getAnswerList(int addr) {
        if (featOkTst && casFeat_answerList == null)
      jcas.throwFeatMissing("answerList", "TestElement");
    return ll_cas.ll_getRefValue(addr, casFeatCode_answerList);
  }
  /** @generated */    
  public void setAnswerList(int addr, int v) {
        if (featOkTst && casFeat_answerList == null)
      jcas.throwFeatMissing("answerList", "TestElement");
    ll_cas.ll_setRefValue(addr, casFeatCode_answerList, v);}
    
   /** @generated */
  public int getAnswerList(int addr, int i) {
        if (featOkTst && casFeat_answerList == null)
      jcas.throwFeatMissing("answerList", "TestElement");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerList), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_answerList), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerList), i);
  }
   
  /** @generated */ 
  public void setAnswerList(int addr, int i, int v) {
        if (featOkTst && casFeat_answerList == null)
      jcas.throwFeatMissing("answerList", "TestElement");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerList), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_answerList), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerList), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_precision;
  /** @generated */
  final int     casFeatCode_precision;
  /** @generated */ 
  public int getPrecision(int addr) {
        if (featOkTst && casFeat_precision == null)
      jcas.throwFeatMissing("precision", "TestElement");
    return ll_cas.ll_getIntValue(addr, casFeatCode_precision);
  }
  /** @generated */    
  public void setPrecision(int addr, int v) {
        if (featOkTst && casFeat_precision == null)
      jcas.throwFeatMissing("precision", "TestElement");
    ll_cas.ll_setIntValue(addr, casFeatCode_precision, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public TestElement_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_question = jcas.getRequiredFeatureDE(casType, "question", "Question", featOkTst);
    casFeatCode_question  = (null == casFeat_question) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_question).getCode();

 
    casFeat_answerList = jcas.getRequiredFeatureDE(casType, "answerList", "uima.cas.FSArray", featOkTst);
    casFeatCode_answerList  = (null == casFeat_answerList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answerList).getCode();

 
    casFeat_precision = jcas.getRequiredFeatureDE(casType, "precision", "uima.cas.Integer", featOkTst);
    casFeatCode_precision  = (null == casFeat_precision) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_precision).getCode();

  }
}



    