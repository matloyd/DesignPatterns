package com.matloyd.structurals.bridge.shape;

import com.matloyd.structurals.bridge.color.Color;

//Shapes-The Abstraction
public abstract class Shape {
    //Composition
    protected Color color;

    protected Shape(Color c) {
        this.color = c;
    }

    public abstract void drawShape(int border);

    public abstract void modifyBorder(int border, int increment);
}
