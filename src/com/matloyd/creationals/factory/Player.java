package com.matloyd.creationals.factory;


public interface Player {

    void play(String mediaPath);

    enum Type{
        MP3, OGG
    }
}
