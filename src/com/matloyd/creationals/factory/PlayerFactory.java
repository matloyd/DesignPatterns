package com.matloyd.creationals.factory;

import com.matloyd.creationals.factory.Player.Type;
import com.matloyd.creationals.factory.impl.Mp3Player;
import com.matloyd.creationals.factory.impl.OggPlayer;

import java.util.Objects;


public class PlayerFactory {

    public static Player createNewPlayer(Type playerType) {
        Objects.requireNonNull(playerType);

        Player player;
        switch (playerType) {
            case MP3:
                player = new Mp3Player();
                break;
            case OGG:
                player = new OggPlayer();
                break;
            default:
                throw new IllegalStateException("Player : " + playerType.name() + " not Implemented yet!");
        }
        return player;
    }
}
