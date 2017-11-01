package org.bobo.mode.factory;

import org.bobo.mode.factory.base.Behavior;
import org.bobo.mode.factory.product.ShanDongHandle;
import org.bobo.mode.factory.product.ZheJiangHandle;

/**
 * @author tian.xubo
 * @created 2017 - 11 - 01 10:26
 */
public class HandleFactory {

    public static Behavior getHandle(String province) throws Exception{
        Behavior behavior = null;
        if("zhejiang".equalsIgnoreCase(province)){
            behavior = new ZheJiangHandle();
        }else if("shandong".equalsIgnoreCase(province)){
            behavior = new ShanDongHandle();
        }else {
            System.out.println("province handle does not implements! please check the province string");
        }
        return behavior;
    }
}
