package de.massisoft.ocp.capter13;

public class PumpkinPie extends Pie {

    @Override
    public void makePie() {
        super.makePie();
        System.out.println("making pumpkin pie");
    }

    public static int getCalories() {
        return 80;
    }

}