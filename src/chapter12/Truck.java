package chapter12;

class Truck extends Vehicle {

    @Override
    public void drive() {
        System.out.println("...driving a truck.");
    }

    Truck() {
        features.put("color", "red");
    }

    @Override
    void getMakeAndModel() {
        System.out.println("...getting and making a truck model.");
    }

    @Override
    public void start() {
        System.out.println("...starting a truck.");
    }

}