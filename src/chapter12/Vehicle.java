package chapter12;

import java.util.HashMap;
import java.util.UUID;

abstract class Vehicle implements Drivable {
    String vin = null;
    HashMap<String, String> features = new HashMap();
    final String NO_VALUE = "N.A.";

    Vehicle() {
        vin = UUID.randomUUID().toString();
        System.out.println(vin);
    }

    abstract void getMakeAndModel();

    public final String getVIN() {
        return vin;
    }

    public String getFeature(String feature) {
        return !features.containsKey(feature) ? NO_VALUE : features.get(feature);
    }

}