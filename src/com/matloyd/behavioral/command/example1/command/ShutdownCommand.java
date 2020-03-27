package com.matloyd.behavioral.command.example1.command;

import com.matloyd.behavioral.command.example1.receiver.ServerAgent;


public class ShutdownCommand extends Command {
    public ShutdownCommand(ServerAgent receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.connect();
        receiver.shutdown();
        receiver.disconnect();
    }
}
