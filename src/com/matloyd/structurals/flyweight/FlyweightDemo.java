package com.matloyd.structurals.flyweight;

import com.matloyd.structurals.flyweight.factory.RobotFactory;

import static com.matloyd.structurals.flyweight.Robot.Type.*;

public class FlyweightDemo {
    public static void main(String[] args) throws Exception {
        RobotFactory myfactory = new RobotFactory();

        Robot shape = myfactory.GetRobotFromFactory(SMALL);
        shape.print();

        /*Here we are trying to get the objects additional 2 times. Note that from
        now onward we do not need to create additional small robots as we have
        already created this category*/
        for (int i = 0; i < 2; i++) {
            shape = myfactory.GetRobotFromFactory(SMALL);
            shape.print();
        }
        int NumOfDistinctRobots = myfactory.TotalObjectsCreated();
        System.out.println("\nDistinct Robot objects created till now= " + NumOfDistinctRobots);

        /* Here we are trying to get the objects 5 times.Note that the second time
        onward we do not need to create additional large robots as we have already
        created this category in the first attempt(at i = 0) */
        for (int i = 0; i < 5; i++) {
            shape = myfactory.GetRobotFromFactory(LARGE);
            shape.print();
        }
        NumOfDistinctRobots = myfactory.TotalObjectsCreated();
        System.out.println("\n Finally no of Distinct Robot objects created: " + NumOfDistinctRobots);
    }
}
