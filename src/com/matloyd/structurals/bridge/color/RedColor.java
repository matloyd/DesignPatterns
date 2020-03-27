package com.matloyd.structurals.bridge.color;

public class RedColor implements Color {
    @Override
    public void fillWithColor(int border) {
        System.out.print("Red color with " + border + " inch border");
    }
}
