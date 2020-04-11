package de.massisoft.ocp.capter13;

import java.io.IOException;

public class NetworkTransformer extends Transformer {
    public String transform(String data) throws IOException {
        return "data from network";
    }
}