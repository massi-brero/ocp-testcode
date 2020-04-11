package de.massisoft.ocp.capter13;

import java.io.IOException;

public class TestClass7 {
    public static void main(String[] args) throws IOException {
        TransformerFactory factory = new TransformerFactory();
        var xmlTransformer = factory.getTransformer(TransformerType.XML);
        var networkTransformer = factory.getTransformer(TransformerType.NETWORK);
        System.out.println(xmlTransformer.transform("data"));
        System.out.println(networkTransformer.transform("data"));
    }
}