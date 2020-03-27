package com.matloyd.creationals.abstractFactory;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;


public class AbstractFactoryDemo {

    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();

        Document doc = documentBuilder.parse(new ByteArrayInputStream(
                "<person><firstName>Mohsen</firstName><lastName>Rahimloo</lastName></person>".getBytes()));

        doc.normalizeDocument();
        System.out.println(doc);

    }
}
