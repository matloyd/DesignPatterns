package com.matloyd.behavioral.command.example1.receiver;


public interface ServerAgent {
    void connect();
    void disconnect();
    void shutdown();
    void reboot();
}
