package de.massisoft.ocp.capter13;

import java.io.IOException;

public abstract class Transformer {
    public abstract String transform(String data) throws IOException;
}