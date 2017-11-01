package org.bobo.mode.adapter;

/**
 * @author tian.xubo
 * @created 2017 - 11 - 01 13:57
 */
public class OldSysFunction implements OldSysInf {

    @Override
    public void webServiceInf(String request) throws Exception {
        System.out.println("I am webservices inf function");
    }
}
