package com.matloyd.behavioral.command.example1.command;

import com.matloyd.behavioral.command.example1.receiver.ServerAgent;


public abstract class Command {

    protected final ServerAgent receiver;

    protected Command(ServerAgent receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
