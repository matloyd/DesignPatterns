package com.matloyd.creationals.singleton;


public class SingletonDemo {

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println(DBConnection2.getInstance());
        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();
        System.out.println(DBConnection2.getInstance());
        System.out.println(System.currentTimeMillis() - time);
    }
}
