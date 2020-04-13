package de.massisoft.ocp.chapter14;

public class TestClass2 {
    public static void main(String[] args) {
        computeShape(() -> 0.0);
        operate((String n, double[] p) -> System.out.println("operate"));
    }

    static double computeShape(Shape sh) {
        return sh.computeArea();
    }

    static void operate(Operation o) {
        o.operate("huhu", new double[] { 0.0 });
    }
}