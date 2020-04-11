package chapter12;

interface VehicleHelper {
    static void register(Vehicle v) {
        System.out.println(v.getVIN());
    };
}