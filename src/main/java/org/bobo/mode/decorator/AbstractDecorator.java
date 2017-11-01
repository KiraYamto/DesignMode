package org.bobo.mode.decorator;

/**
 * @author tian.xubo
 * @created 2017 - 11 - 01 15:53
 */
public abstract class AbstractDecorator implements MappingConditionInf {
    private MappingConditionInf mappingConditionInf;

    public AbstractDecorator(MappingConditionInf mappingConditionInf) {
        this.mappingConditionInf = mappingConditionInf;
    }

    @Override
    public boolean mappingValidator(String left, String right) throws Exception {
        return this.mappingConditionInf.mappingValidator(left,right);
    }
}
