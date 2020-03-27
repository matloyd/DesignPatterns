package com.matloyd.creationals.factory.impl;

import com.matloyd.creationals.factory.Player;


public class Mp3Player implements Player {
    @Override
    public void play(String mediaPath) {
        System.out.println("MP3 file is playing ,...");
    }
}
