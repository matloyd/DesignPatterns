package com.matloyd.behavioral.command.example1.receiver;


public class EuropeServer implements ServerAgent {
    @Override
    public void connect() {
        System.out.println("Europe server connect");

    }

    @Override
    public void disconnect() {
        System.out.println("Europe server disconnect");
    }

    @Override
    public void shutdown() {
        System.out.println("Europe server shutdown");
    }

    @Override
    public void reboot() {
        System.out.println("Europe server reboot");
    }
}
