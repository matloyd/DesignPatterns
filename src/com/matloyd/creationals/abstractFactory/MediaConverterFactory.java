package com.matloyd.creationals.abstractFactory;

import com.matloyd.creationals.abstractFactory.factory.ImageConverterFactory;
import com.matloyd.creationals.abstractFactory.factory.MediaFactory;
import com.matloyd.creationals.abstractFactory.factory.MusicConverterFactory;
import com.matloyd.creationals.abstractFactory.factory.VideoConverterFactory;


public interface MediaConverterFactory {

    enum MediaType {
        IMAGE, VIDEO, AUDIO
    }

    static MediaFactory createFactory(MediaType mediaType) {

        switch (mediaType) {
            case AUDIO:
                return new MusicConverterFactory();
            case IMAGE:
                return new ImageConverterFactory();
            case VIDEO:
                return new VideoConverterFactory();
            default:
                throw new IllegalStateException("Not Implemented media type :" + mediaType.name());
        }
    }
}
