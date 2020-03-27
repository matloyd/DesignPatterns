package com.matloyd.structurals.bridge;

import com.matloyd.structurals.bridge.color.Color;
import com.matloyd.structurals.bridge.color.GreenColor;
import com.matloyd.structurals.bridge.color.RedColor;
import com.matloyd.structurals.bridge.shape.Rectangle;
import com.matloyd.structurals.bridge.shape.Shape;
import com.matloyd.structurals.bridge.shape.Triangle;

public class BridgeDemo {
    public static void main(String[] args) {

        //Coloring Green to Triangle
        Color green = new GreenColor();
        Shape triangleShape = new Triangle(green);
        triangleShape.drawShape(20);
        triangleShape.modifyBorder(20, 3);

        System.out.println("\n");

        //Coloring Red to Rectangle
        Color red = new RedColor();
        Shape rectangleShape = new Rectangle(red);
        rectangleShape.drawShape(50);
        rectangleShape.modifyBorder(50, 2);
    }
}
