package com.matloyd.structurals.facade;

import com.matloyd.structurals.facade.api.RobotBody;
import com.matloyd.structurals.facade.api.RobotColor;
import com.matloyd.structurals.facade.api.RobotMetal;

public class RobotFacade {
    RobotColor rc;
    RobotMetal rm;
    RobotBody rb;

    public RobotFacade() {
        rc = new RobotColor();
        rm = new RobotMetal();
        rb = new RobotBody();
    }

    public void ConstructRobot(String color, String metal) {
        System.out.println("\nCreation of the Robot Start");
        rc.SetColor(color);
        rm.SetMetal(metal);
        rb.CreateBody();
        System.out.println(" \nRobot Creation End");
        System.out.println();
    }
}
