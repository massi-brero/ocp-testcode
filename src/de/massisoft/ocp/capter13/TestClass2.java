package de.massisoft.ocp.capter13;

public class TestClass2 {
    public static void main(String[] args) {
        TV tv = new TV();
        Radio radio = new Radio();

        reset(radio);
        reset(tv);
        System.out.println(radio.getFrequency());
        System.out.println(tv.getChannel());
    }

    private static void reset(Device device) {
        device.reset();
    }
}