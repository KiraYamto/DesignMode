package org.bobo.mode.command;

/**
 * @author tian.xubo
 * @created 2017 - 11 - 01 22:19
 */
public class RollbackCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Rollback execute!");
    }

}
