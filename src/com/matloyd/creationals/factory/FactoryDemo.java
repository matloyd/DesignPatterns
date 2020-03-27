package com.matloyd.creationals.factory;


public class FactoryDemo {

    public static void main(String[] args) {
        Player player1 = PlayerFactory.createNewPlayer(Player.Type.MP3);
        player1.play("path of file");

        Player player2 = PlayerFactory.createNewPlayer(Player.Type.OGG);
        player2.play("path of file");
    }
}
