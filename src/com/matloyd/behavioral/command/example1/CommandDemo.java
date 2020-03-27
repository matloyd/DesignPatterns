package com.matloyd.behavioral.command.example1;

import com.matloyd.behavioral.command.example1.command.Command;
import com.matloyd.behavioral.command.example1.command.ShutdownCommand;
import com.matloyd.behavioral.command.example1.receiver.AsiaServer;
import com.matloyd.behavioral.command.example1.receiver.ServerAgent;

public class CommandDemo {

    public static void main(String[] args) {
        ServerAgent asiaServer = new AsiaServer();

        Command shutdownCommand = new ShutdownCommand(asiaServer);

        ServerCommandInvoker serverCommandInvoker = new ServerCommandInvoker(shutdownCommand);
        serverCommandInvoker.run();
    }
}
