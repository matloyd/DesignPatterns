package com.matloyd.creationals.builder;


public class Sample {
    private int prop1;
    private int prop2;
    private int prop3;
    private int prop4;

    public Sample() {
    }

    public int getProp1() {
        return prop1;
    }

    public void setProp1(int prop1) {
        this.prop1 = prop1;
    }

    public int getProp2() {
        return prop2;
    }

    public void setProp2(int prop2) {
        this.prop2 = prop2;
    }

    public int getProp3() {
        return prop3;
    }

    public void setProp3(int prop3) {
        this.prop3 = prop3;
    }

    public int getProp4() {
        return prop4;
    }

    public void setProp4(int prop4) {
        this.prop4 = prop4;
    }

    @Override
    public String toString() {
        return "Sample{" +
                "prop1=" + prop1 +
                ", prop2=" + prop2 +
                ", prop3=" + prop3 +
                ", prop4=" + prop4 +
                '}';
    }
}
