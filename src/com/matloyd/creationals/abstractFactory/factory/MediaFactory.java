package com.matloyd.creationals.abstractFactory.factory;

import com.matloyd.creationals.abstractFactory.Converter;

import java.io.File;


public interface MediaFactory {

    Converter createConverter(File file, Converter.CodecType codecType);
}
