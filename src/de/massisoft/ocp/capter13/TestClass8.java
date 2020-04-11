package de.massisoft.ocp.capter13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TestClass8 {
    public static void main(final String[] args) {
        String[] data = { "a", "a", "b", "c" };
        var l1 = getArrayList(data);
        System.out.println(l1);

        System.out.println(switchIt(l1, 0, 2));
        var l2 = new ArrayList<Integer>(List.of(1, 2, 3, 4));
        System.out.println(switchIt(l2, 1, 2));

    }

    static ArrayList<String> getArrayList(final String[] arr) {
        var set = new HashSet<String>(List.of(arr));
        return new ArrayList<String>(set);
    }

    static <T> ArrayList<T> switchIt(ArrayList<T> al, int a, int b) {
        T valueOfA = al.get(a);
        T valueOfB = al.get(b);
        al.set(a, valueOfB);
        al.set(b, valueOfA);

        return al;
    }
}