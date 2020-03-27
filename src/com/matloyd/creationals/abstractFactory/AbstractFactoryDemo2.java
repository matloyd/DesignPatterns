package com.matloyd.creationals.abstractFactory;

import com.matloyd.creationals.abstractFactory.factory.MediaFactory;

import java.io.File;


public class AbstractFactoryDemo2 {

    public static void main(String[] args) throws Exception {
        MediaFactory factory = MediaConverterFactory.createFactory(MediaConverterFactory.MediaType.IMAGE);
        Converter converter = factory.createConverter(new File("d:\\pic.bmp"), Converter.CodecType.JPG);
        converter.convert();

        System.out.println(factory.getClass());
        System.out.println(converter.getClass());

    }
}
