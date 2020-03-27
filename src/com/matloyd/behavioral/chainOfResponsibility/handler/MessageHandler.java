package com.matloyd.behavioral.chainOfResponsibility.handler;

import com.matloyd.behavioral.chainOfResponsibility.Message;

public abstract class MessageHandler {

    protected final MessageHandler nextHandler;

    protected MessageHandler(MessageHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(Message message);
}
