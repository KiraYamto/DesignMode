package org.bobo.mode.proxy;

/**
 * @author tian.xubo
 * @created 2017 - 11 - 01 21:41
 */
public class NeProtocolEpon implements NeProtocol {

    @Override
    public void login() {
        System.out.println("login");
    }

    @Override
    public boolean send() {

        return false;
    }

    @Override
    public void recv() {

    }

    @Override
    public void logout() {

    }
}
