package com.matloyd.creationals.abstractFactory.image;

import com.matloyd.creationals.abstractFactory.Converter;

import java.io.File;


public class Bmp2JpgConverter extends Converter {
    public Bmp2JpgConverter(byte[] input) {
        super(input);
    }

    public Bmp2JpgConverter(File input) {
        super(input);
    }

    @Override
    public byte[] convert() {
        return new byte[0];
    }
}
