package de.massisoft.ocp.capter13;

import java.util.ArrayList;

public class CollectionTestList {
    public static void main(String[] args) {
        var l1 = new ArrayList<String>();
        var l2 = new ArrayList<String>();
        l1.add("a");
        l1.add("b");
        l2.add("b");
        l2.add("c");
        l2.add("d");
        l1.addAll(l2);
        System.out.println(l1);
    }
}