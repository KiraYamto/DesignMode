package org.bobo.mode.adapter;

/**
 * @author tian.xubo
 * @created 2017 - 11 - 01 14:14
 */
public class SysClassAdapter extends OldSysFunction implements NewSysInf  {

    @Override
    public void socketInf(String request) throws Exception {

    }

    @Override
    public void webServiceInf(String request) throws Exception {
        this.socketInf(request);
    }
}
