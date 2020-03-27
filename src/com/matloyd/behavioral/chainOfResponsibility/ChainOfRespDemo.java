package com.matloyd.behavioral.chainOfResponsibility;

import com.matloyd.behavioral.chainOfResponsibility.service.MessageService;

public class ChainOfRespDemo {

    public static void main(String[] args) {
        Message message = Message.getBuilder()
                .setValue("Hello, This is message number 1")
                .addDestinationMap(Message.Destination.SMS, "09233233232")
                .addDestinationMap(Message.Destination.EMAIL, "mohsen@test.ir")
                .addDestinationMap(Message.Destination.FAX, "3233232")
                .createMessage();

        new MessageService().sendMessage(message);
    }
}
