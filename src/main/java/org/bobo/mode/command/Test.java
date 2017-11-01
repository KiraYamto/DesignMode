package org.bobo.mode.command;

/**
 * @author tian.xubo
 * @created 2017 - 11 - 01 22:42
 */
public class Test {

    public static void main(String[] args) {
        Command rollback = new RollbackCommand();
        Command updateState = new UpdateStateCommand();
        OrderMonitorPage page  = new OrderMonitorPage();
        page.setCommandMap("rollback",rollback);
        page.setCommandMap("updateState",updateState);
        page.executeCommand("rollback");
        page.executeCommand("updateState");
    }
}
