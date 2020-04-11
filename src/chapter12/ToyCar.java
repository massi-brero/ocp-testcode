package chapter12;

class ToyCar extends Car {

    @Override
    public void drive() {
        System.out.println("...driving the toy car");
    }

    ToyCar() {
        features.put("color", "pink");
    }

    @Override
    public void start() {
        System.out.println("...starting the toycar");
    }

}