package org.bobo.mode.decorator;

/**
 * @author tian.xubo
 * @created 2017 - 11 - 01 16:01
 */
public class Test {

    public static void main(String[] args) {
        MappingConditionInf equalMapping = new EqualMapping();
        MappingConditionInf mappingConditionInf = new NotEqualDecorator(equalMapping);
        MappingConditionInf mappingConditionInf2 = new InDecorator(equalMapping);
        MappingConditionInf mappingConditionInf3 = new NotInDecorator(mappingConditionInf2);

        String left = "[test2,test3]";
        String right = "test";
        try {
            System.out.println(left+ " and "+ right +" mapping result is :"+mappingConditionInf3.mappingValidator(left,right));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
