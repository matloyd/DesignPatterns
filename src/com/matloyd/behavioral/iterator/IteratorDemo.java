package com.matloyd.behavioral.iterator;

import java.io.IOException;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) throws IOException {

        FileContentReader fileContentReader = new FileContentReader("sampleFile.txt");
        Iterator<String> iterator = fileContentReader.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
