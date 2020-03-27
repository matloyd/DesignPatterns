package com.matloyd.creationals.factory.impl;

import com.matloyd.creationals.factory.Player;


public class OggPlayer implements Player {
    @Override
    public void play(String mediaPath) {
        System.out.println("OGG file is playing ,...");
    }
}
