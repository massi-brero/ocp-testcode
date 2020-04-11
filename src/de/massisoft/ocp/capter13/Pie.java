package de.massisoft.ocp.capter13;

abstract class Pie {
    public void makePie() {
        System.out.println("making pie");
    }

    public static int getCalories() {
        return 100;
    }
}