package com.matloyd.structurals.flyweight.robotImpl;

import com.matloyd.structurals.flyweight.Robot;

public class LargeRobot implements Robot {
    @Override
    public void print() {
        System.out.println(" I am a Large Robot");
    }
}
