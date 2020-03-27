package com.matloyd.structurals.facade;

public class FacadeDemo {
    public static void main(String[] args) {

        RobotFacade rf1 = new RobotFacade();
        rf1.ConstructRobot("Green", "Iron");

        RobotFacade rf2 = new RobotFacade();
        rf2.ConstructRobot("Blue", "Steel");
    }
}
