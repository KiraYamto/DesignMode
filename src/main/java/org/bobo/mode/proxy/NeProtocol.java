package org.bobo.mode.proxy;

/**
 * @author tian.xubo
 * @created 2017 - 11 - 01 21:40
 */
public interface NeProtocol {

    public void login();
    public boolean send();
    public void recv();
    public void logout();
}
