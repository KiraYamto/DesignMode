package org.bobo.mode.adapter;

/**
 * @author tian.xubo
 * @created 2017 - 11 - 01 13:58
 */
public class Test {
    public static void main(String[] args) {
        OldSysInf oldSysInf = new OldSysFunction();
        try {
            oldSysInf.webServiceInf("11");
        } catch (Exception e) {
            e.printStackTrace();
        }
        SysObjectAdapter sysObjectAdapter = new SysObjectAdapter(oldSysInf);
        try {
            sysObjectAdapter.socketInf(null);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
