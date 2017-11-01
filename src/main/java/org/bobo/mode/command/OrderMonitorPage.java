package org.bobo.mode.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author tian.xubo
 * @created 2017 - 11 - 01 22:34
 */
public class OrderMonitorPage {
    Map<String,Command> commandMap = new HashMap<String, Command>();

    public void setCommandMap(String commandName,Command command){
        commandMap.put(commandName,command);
    }

    public void executeCommand(String commandName){
        Command command = commandMap.get(commandName);
        if(command != null ){
            command.execute();
        }
    }

}
