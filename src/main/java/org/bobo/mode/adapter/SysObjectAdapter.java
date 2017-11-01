package org.bobo.mode.adapter;

/**
 * @author tian.xubo
 * @created 2017 - 11 - 01 14:05
 */
public class SysObjectAdapter implements NewSysInf  {

    private OldSysInf oldSysInf;

    public SysObjectAdapter(OldSysInf oldSysInf) {
        this.oldSysInf = oldSysInf;
    }

    @Override
    public void socketInf(String request) throws Exception {
        this.oldSysInf.webServiceInf(request);
    }
}
