package com.matloyd.behavioral.chainOfResponsibility.handler.impl;

import com.matloyd.behavioral.chainOfResponsibility.Message;
import com.matloyd.behavioral.chainOfResponsibility.handler.MessageHandler;

public class FaxMessageHandler extends MessageHandler {
    public FaxMessageHandler(MessageHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Message message) {
        if(message.getDestinationMap().keySet().contains(Message.Destination.FAX)){
            System.out.printf("message sent to: %s via Fax", message.getDestinationMap().get(Message.Destination.FAX));
            System.out.println();
        }

        if(nextHandler != null){
            nextHandler.handle(message);
        }
    }
}
