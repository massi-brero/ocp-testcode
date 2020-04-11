package chapter12;

class Testclass {

    public static void main(final String[] args) {
        final Vehicle car = new Car();
        final Vehicle truck = new Truck();
        final Vehicle toyCar = new ToyCar();

        car.start();
        car.drive();
        System.out.println("power " + car.getFeature("power"));
        System.out.println("color " + car.getFeature("color"));
        VehicleHelper.register(car);
        System.out.println("*************************************");
        truck.start();
        truck.drive();
        System.out.println("power " + truck.getFeature("power"));
        System.out.println("color " + truck.getFeature("color"));
        VehicleHelper.register(truck);
        System.out.println("*************************************");
        toyCar.start();
        toyCar.drive();
        System.out.println("power " + toyCar.getFeature("power"));
        System.out.println("color " + toyCar.getFeature("color"));
        VehicleHelper.register(toyCar);

    }
}