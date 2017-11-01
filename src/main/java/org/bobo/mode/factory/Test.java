package org.bobo.mode.factory;

import org.bobo.mode.factory.base.Behavior;

/**
 * @author tian.xubo
 * @created 2017 - 11 - 01 11:10
 */
public class Test {
    public static void main(String[] args) {
        String province = "shandong";
        try {
            Behavior behavior = HandleFactory.getHandle(province);
            System.out.println(behavior.getClass()+"    ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
