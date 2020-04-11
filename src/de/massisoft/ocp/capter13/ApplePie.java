package de.massisoft.ocp.capter13;

public class ApplePie extends Pie {
    @Override
    public void makePie() {
        super.makePie();
        System.out.println("making apple pie");
    }

    public static int getCalories() {
        return 150;
    }
}