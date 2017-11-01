package org.bobo.mode.proxy;

/**
 * @author tian.xubo
 * @created 2017 - 11 - 01 22:56
 */
public class Test {
    public static void main(String[] args) {
        NeProtocol neProtocol = new NeProtocolEpon();
        NeProtocol protocolProxy = new NeProtocolProxy(neProtocol);
        protocolProxy.login();
        protocolProxy.send();

    }
}
