package org.bobo.mode.command;

/**
 * @author tian.xubo
 * @created 2017 - 11 - 01 22:20
 */
public class UpdateStateCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Update State execute!");
    }
}
