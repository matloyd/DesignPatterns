package com.matloyd.creationals.abstractFactory;


import java.io.File;


public abstract class Converter {

    private byte[] input;

    public Converter(byte[] input) {
        this.input = input;
    }

    public Converter(File input) {

    }

    public abstract byte[] convert();

    public enum CodecType {
        JPG, BMP, PNG,
        MP3, WAV, ACC,
        MP4, AVI, MKV
    }
}
