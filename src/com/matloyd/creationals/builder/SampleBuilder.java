package com.matloyd.creationals.builder;


public class SampleBuilder {
    private int prop1;
    private int prop2;
    private int prop3;
    private int prop4;

    public SampleBuilder prop1(int prop1) {
        this.prop1 = prop1;
        return this;
    }

    public SampleBuilder prop2(int prop2) {
        this.prop2 = prop2;
        return this;
    }

    public SampleBuilder prop3(int prop3) {
        this.prop3 = prop3;
        return this;
    }

    public SampleBuilder prop4(int prop4) {
        this.prop4 = prop4;
        return this;
    }

    public Sample build() {
        Sample sample = new Sample();
        sample.setProp1(this.prop1);
        sample.setProp2(this.prop2);
        sample.setProp3(this.prop3);
        sample.setProp4(this.prop4);
        return sample;
    }

}
