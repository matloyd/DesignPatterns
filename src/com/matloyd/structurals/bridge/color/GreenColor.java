package com.matloyd.structurals.bridge.color;

public class GreenColor implements Color {
    @Override
    public void fillWithColor(int border) {
        System.out.print("Green color with " + border + " inch border.");
    }
}
