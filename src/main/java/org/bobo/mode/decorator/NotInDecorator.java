package org.bobo.mode.decorator;

/**
 * @author tian.xubo
 * @created 2017 - 11 - 01 16:48
 */
public class NotInDecorator extends AbstractDecorator {
    public NotInDecorator(MappingConditionInf mappingConditionInf) {
        super(mappingConditionInf);
    }

    @Override
    public boolean mappingValidator(String left, String right) throws Exception {
        if(left != null && left.length()>0){

        }
        return super.mappingValidator(left, right);
    }
}
