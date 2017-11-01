package org.bobo.mode.decorator;

/**
 * @author tian.xubo
 * @created 2017 - 11 - 01 16:39
 */
public class InDecorator extends AbstractDecorator {
    public InDecorator(MappingConditionInf mappingConditionInf) {
        super(mappingConditionInf);
    }

    @Override
    public boolean mappingValidator(String left, String right) throws Exception {
        if(left != null && left.length()>0){
            if(left.startsWith("[") && left.endsWith("]")){
                left = left.substring(1,left.length()-1);
                String[] atomArr = left.split(",");
                for (int i = 0; i <atomArr.length ; i++) {
                    if(super.mappingValidator(atomArr[i],right)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
