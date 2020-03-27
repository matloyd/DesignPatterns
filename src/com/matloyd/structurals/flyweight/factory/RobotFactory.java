package com.matloyd.structurals.flyweight.factory;

import com.matloyd.structurals.flyweight.Robot;
import com.matloyd.structurals.flyweight.Robot.Type;
import com.matloyd.structurals.flyweight.robotImpl.LargeRobot;
import com.matloyd.structurals.flyweight.robotImpl.SmallRobot;

import java.util.HashMap;
import java.util.Map;

import static com.matloyd.structurals.flyweight.Robot.Type.*;

public class RobotFactory {
    Map<Type, Robot> robotMap = new HashMap<>();

    public int TotalObjectsCreated() {
        return robotMap.size();
    }

    public Robot GetRobotFromFactory(Type RobotCategory) {
        Robot robotCategory;
        if (robotMap.containsKey(RobotCategory)) {
            robotCategory = robotMap.get(RobotCategory);
        } else {
            switch (RobotCategory) {
                case SMALL:
                    System.out.println("We do not have Small Robot. So we are creating a Small Robot now.");
                    robotCategory = new SmallRobot();
                    robotMap.put(SMALL, robotCategory);
                    break;

                case LARGE:
                    System.out.println("We do not have Large Robot. So we are creating a Large Robot now.");
                    robotCategory = new LargeRobot();
                    robotMap.put(LARGE, robotCategory);
                    break;

                default:
                    throw new IllegalStateException(" Robot Factory can create only small and large robotMap");
            }
        }
        return robotCategory;
    }
}

