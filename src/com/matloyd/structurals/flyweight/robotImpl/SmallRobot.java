package com.matloyd.structurals.flyweight.robotImpl;

import com.matloyd.structurals.flyweight.Robot;

public class SmallRobot implements Robot {
    @Override
    public void print() {
        System.out.println(" This is a Small Robot");
    }
}
