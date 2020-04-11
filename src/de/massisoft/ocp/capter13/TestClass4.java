package de.massisoft.ocp.capter13;

public class TestClass4 {
    public static void main(String[] args) {
        ApplePie ap = new ApplePie();
        PumpkinPie pp = new PumpkinPie();
        ap.makePie();
        pp.makePie();
        Nutritionist.printCalories(ap);
        Nutritionist.printCalories(pp);
    }
}