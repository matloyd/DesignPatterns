package com.matloyd.behavioral.chainOfResponsibility.handler.impl;

import com.matloyd.behavioral.chainOfResponsibility.Message;
import com.matloyd.behavioral.chainOfResponsibility.handler.MessageHandler;

import static com.matloyd.behavioral.chainOfResponsibility.Message.Destination.EMAIL;

public class EmailMessageHandler extends MessageHandler {
    public EmailMessageHandler(MessageHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Message message) {
        if(message.getDestinationMap().keySet().contains(EMAIL)){
            System.out.printf("message sent to: %s via Email", message.getDestinationMap().get(EMAIL));
            System.out.println();
        }

        if(nextHandler != null){
            nextHandler.handle(message);
        }
    }
}
