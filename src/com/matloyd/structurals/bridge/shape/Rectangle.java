package com.matloyd.structurals.bridge.shape;

import com.matloyd.structurals.bridge.color.Color;

public class Rectangle extends Shape {
    public Rectangle(Color c) {
        super(c);
    }

    //Implementer-specific method
    @Override
    public void drawShape(int border) {
        System.out.print(" This Rectangle is colored with: ");
        color.fillWithColor(border);
    }

    //Abstraction-specific method
    @Override
    public void modifyBorder(int border, int increment) {
        System.out.println("\n Now we are changing the border length " + increment + " times");
        border = border * increment;
        drawShape(border);
    }
}
