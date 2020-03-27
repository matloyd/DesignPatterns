package com.matloyd.creationals.abstractFactory.factory;

import com.matloyd.creationals.abstractFactory.Converter;
import com.matloyd.creationals.abstractFactory.image.Bmp2JpgConverter;
import com.matloyd.creationals.abstractFactory.image.Bmp2PngConverter;

import java.io.File;


public class ImageConverterFactory implements MediaFactory {

    @Override
    public Converter createConverter(File file, Converter.CodecType codecType) {

        String fileName = file.getName().toLowerCase();

        Converter converter = null;

        if (fileName.endsWith(".bmp")) {
            switch (codecType) {
                case JPG:
                    converter = new Bmp2JpgConverter(file);
                    break;
                case PNG:
                    converter = new Bmp2PngConverter(file);
                    break;
                default:
                    throw new IllegalStateException("Converter for : " + codecType.name() + " not Implemented yet!");
            }
        }

        return converter;
    }
}
