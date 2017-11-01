package org.bobo.mode.decorator;

/**
 * @author tian.xubo
 * @created 2017 - 11 - 01 15:50
 */
public class EqualMapping implements MappingConditionInf {

    @Override
    public boolean mappingValidator(String left, String right) throws Exception {
        if(left != null && left.equals(right)){
            return true;
        }
        return false;
    }
}
