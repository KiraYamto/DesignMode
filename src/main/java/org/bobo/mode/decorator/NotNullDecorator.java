package org.bobo.mode.decorator;

/**
 * @author tian.xubo
 * @created 2017 - 11 - 01 16:16
 */
public class NotNullDecorator extends AbstractDecorator {

    public NotNullDecorator(MappingConditionInf mappingConditionInf) {
        super(mappingConditionInf);
    }

    @Override
    public boolean mappingValidator(String left, String right) throws Exception {
        if(left != null && left.length()>0 && left.equals("!null")){
            if(right != null && !"".equals(right)){
                return true;
            }
        }
        return false;
    }

}
