package de.massisoft.ocp.capter10;

public class ArrayTest {

    public static void main(String[] args) {
        boolean[] bArr = new boolean[3];

        for (boolean b: bArr
             ) {
            System.out.println(b);
        }

        System.out.println("==================================");
        int[] first = new int[3];
        int[] second = {};
        int[] third = null;

        System.out.println("length first: " + first.length
                + " - length second: " + second.length
                /*+ " - length third: " + third.length*/ );

        System.out.println("==================================");
        System.out.println("==================================");
    }
}
