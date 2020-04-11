package de.massisoft.ocp.capter13;

public class TransformerFactory {
    public Transformer getTransformer(TransformerType type) {
        switch (type) {
            case XML:
                return new XmlTransformer();
            case NETWORK:
                return new NetworkTransformer();
        }
        return null;
    }
}