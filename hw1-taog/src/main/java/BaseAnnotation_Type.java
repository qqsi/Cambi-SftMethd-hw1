
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

/** BaseAnnotation who provides confidence score and record the name of the component that produced the annotation.
 * Updated by JCasGen Wed Sep 11 15:13:36 EDT 2013
 * @generated */
public class BaseAnnotation_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (BaseAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = BaseAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new BaseAnnotation(addr, BaseAnnotation_Type.this);
  			   BaseAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new BaseAnnotation(addr, BaseAnnotation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = BaseAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("BaseAnnotation");
 
  /** @generated */
  final Feature casFeat_confidence;
  /** @generated */
  final int     casFeatCode_confidence;
  /** @generated */ 
  public float getConfidence(int addr) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "BaseAnnotation");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_confidence);
  }
  /** @generated */    
  public void setConfidence(int addr, float v) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "BaseAnnotation");
    ll_cas.ll_setFloatValue(addr, casFeatCode_confidence, v);}
    
  
 
  /** @generated */
  final Feature casFeat_nameProduced;
  /** @generated */
  final int     casFeatCode_nameProduced;
  /** @generated */ 
  public String getNameProduced(int addr) {
        if (featOkTst && casFeat_nameProduced == null)
      jcas.throwFeatMissing("nameProduced", "BaseAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_nameProduced);
  }
  /** @generated */    
  public void setNameProduced(int addr, String v) {
        if (featOkTst && casFeat_nameProduced == null)
      jcas.throwFeatMissing("nameProduced", "BaseAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_nameProduced, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public BaseAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_confidence = jcas.getRequiredFeatureDE(casType, "confidence", "uima.cas.Float", featOkTst);
    casFeatCode_confidence  = (null == casFeat_confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidence).getCode();

 
    casFeat_nameProduced = jcas.getRequiredFeatureDE(casType, "nameProduced", "uima.cas.String", featOkTst);
    casFeatCode_nameProduced  = (null == casFeat_nameProduced) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_nameProduced).getCode();

  }
}



    