package org.bobo.mode.adapter;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @author tian.xubo
 * @created 2017 - 11 - 01 14:04
 */
public class NewSysFunction implements NewSysInf {
    @Override
    public void socketInf(String request) throws Exception {
        System.out.println("I am socket inf function");
    }
}
