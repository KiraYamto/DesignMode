package org.bobo.mode.factory.base;

/**
 * @author tian.xubo
 * @created 2017 - 11 - 01 10:39
 */
public interface Behavior {

     public void getLastOrder(String accnbr)throws Exception;
     public void kickOffRunningOrder()throws Exception;
     public void createTaskOrder()throws Exception;

}
