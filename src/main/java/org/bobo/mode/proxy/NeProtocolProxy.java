package org.bobo.mode.proxy;

/**
 * @author tian.xubo
 * @created 2017 - 11 - 01 21:42
 */
public class NeProtocolProxy implements NeProtocol {

    NeProtocol neProtocol;

    public NeProtocolProxy(NeProtocol neProtocol) {
        this.neProtocol = neProtocol;
    }

    @Override
    public void login() {
        this.neProtocol.login();
    }

    @Override
    public boolean send() {
        boolean result = false;
        result = this.neProtocol.send();
        int i = 0;
        while(i < 3 &&!result){
            result = this.neProtocol.send();
        }
        return result;
    }

    @Override
    public void recv() {

    }

    @Override
    public void logout() {

    }
}
