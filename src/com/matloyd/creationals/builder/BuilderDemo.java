package com.matloyd.creationals.builder;


public class BuilderDemo {

    public static void main(String[] args) {
        SampleBuilder builder = new SampleBuilder();

        Sample sample = builder.prop1(10).prop2(15).prop3(-19).prop4(3).build();

        System.out.println(sample);

    }
}
