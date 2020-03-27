package com.matloyd.behavioral.chainOfResponsibility.service;

import com.matloyd.behavioral.chainOfResponsibility.Message;
import com.matloyd.behavioral.chainOfResponsibility.Message.Destination;
import com.matloyd.behavioral.chainOfResponsibility.handler.impl.EmailMessageHandler;
import com.matloyd.behavioral.chainOfResponsibility.handler.impl.FaxMessageHandler;
import com.matloyd.behavioral.chainOfResponsibility.handler.MessageHandler;
import com.matloyd.behavioral.chainOfResponsibility.handler.impl.SMSMessageHandler;

public class MessageService {

    public void sendMessage(Message message) {
        MessageHandler nextHandler = null;
        for (Destination dest : message.getDestinationMap().keySet()) {
            switch (dest) {
                case FAX:
                    nextHandler = new FaxMessageHandler(nextHandler);
                    break;
                case SMS:
                    nextHandler = new SMSMessageHandler(nextHandler);
                    break;
                case EMAIL:
                    nextHandler = new EmailMessageHandler(nextHandler);
                    break;
            }
        }
        if (nextHandler != null) {
            nextHandler.handle(message);
        }
    }
}
