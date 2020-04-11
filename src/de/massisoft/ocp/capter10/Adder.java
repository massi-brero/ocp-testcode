package de.massisoft.ocp.capter10;
import java.util.Arrays;

public class Adder {

    public static void main(String[] args) {
        System.out.println(add(1, 2, 4, 4));
        System.out.println(add(new Integer[]{1, 2, 4, 4}));
    }

    static int add(int... n) {
        return Arrays.stream(n).sum();
    }

    static String add(Integer[] n) {
        return Arrays.stream(n)
                .map(String::valueOf)
                .reduce("", String::concat);
    }
}
