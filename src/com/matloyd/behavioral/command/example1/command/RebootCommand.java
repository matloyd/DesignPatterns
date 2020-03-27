package com.matloyd.behavioral.command.example1.command;

import com.matloyd.behavioral.command.example1.receiver.ServerAgent;


public class RebootCommand extends Command {
    protected RebootCommand(ServerAgent receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.connect();
        receiver.reboot();
        receiver.disconnect();
    }
}
