package com.matloyd.creationals.abstractFactory.factory;

import com.matloyd.creationals.abstractFactory.Converter;

import java.io.File;


public class VideoConverterFactory implements MediaFactory {

    @Override
    public Converter createConverter(File file, Converter.CodecType codecType) {

        String fileName = file.getName().toLowerCase();

        throw new IllegalStateException("Converter for : " + codecType.name() + " not Implemented yet!");

    }
}
