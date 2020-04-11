package chapter12;

class Car extends Vehicle {

    @Override
    public void drive() {
        System.out.println("...driving a car.");
    }

    Car() {
        features.put("power", "110");
        features.put("color", "blue");
    }

    @Override
    void getMakeAndModel() {
        System.out.println("...getting and making a car model.");
    }

    @Override
    public void start() {
        System.out.println("...starting a car.");
    }

}