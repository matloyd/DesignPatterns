package com.matloyd.creationals.abstractFactory.image;

import com.matloyd.creationals.abstractFactory.Converter;

import java.io.File;


public class Bmp2PngConverter extends Converter {
    public Bmp2PngConverter(byte[] input) {
        super(input);
    }

    public Bmp2PngConverter(File input) {
        super(input);
    }

    @Override
    public byte[] convert() {
        return new byte[0];
    }
}
