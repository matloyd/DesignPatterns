package com.matloyd.behavioral.command.example1;

import com.matloyd.behavioral.command.example1.command.Command;


public class ServerCommandInvoker {

    private final Command command;

    public ServerCommandInvoker(Command command) {
        this.command = command;
    }

    public void run(){
        command.execute();
    }
}
