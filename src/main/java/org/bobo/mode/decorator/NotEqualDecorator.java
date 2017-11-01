package org.bobo.mode.decorator;

/**
 * @author tian.xubo
 * @created 2017 - 11 - 01 15:56
 */
public class NotEqualDecorator extends AbstractDecorator{

    public NotEqualDecorator(MappingConditionInf mappingConditionInf) {
        super(mappingConditionInf);
    }

    @Override
    public boolean mappingValidator(String left, String right) throws Exception {
        if(left != null && left.length()>0 && left.startsWith("!")){
            left = left.substring(1);
            return  !super.mappingValidator(left,right);
        }
        return false;
    }
}
