package com.matloyd.behavioral.chainOfResponsibility.handler.impl;

import com.matloyd.behavioral.chainOfResponsibility.Message;
import com.matloyd.behavioral.chainOfResponsibility.handler.MessageHandler;

public class SMSMessageHandler extends MessageHandler {
    public SMSMessageHandler(MessageHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Message message) {
        if(message.getDestinationMap().keySet().contains(Message.Destination.SMS)){
            System.out.printf("message sent to: %s via SMS", message.getDestinationMap().get(Message.Destination.SMS));
            System.out.println();
        }

        if(nextHandler != null){
            nextHandler.handle(message);
        }
    }
}
