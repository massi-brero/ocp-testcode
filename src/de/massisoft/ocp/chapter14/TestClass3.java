package de.massisoft.ocp.chapter14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestClass3 {

    public static void main(String[] args) {
        Image img1 = new Image("test1", 100, 50, 50);
        Image img2 = new Image("test2", 200, 350, 102);
        Image img3 = new Image("test3", 200, 150, 150);
        var l = new ArrayList<Image>(List.of(img1, img2, img3));

        String testname = "test2";
        var res1 = filterByName((Image img) -> img.name == testname, l);

        System.out.println("***************************");
        res1.forEach(i -> System.out.println(i.name));

        var res2 = filterThumbs(l);
        System.out.println("***************************");
        res2.forEach(i -> System.out.println(i.name));

    }

    static ArrayList<Image> filterByName(Predicate<Image> p, List<Image> l) {
        var result = new ArrayList<Image>();
        for (Image img : l) {
            if (p.test(img)) {
                result.add(img);
            }
        }

        return result;
    }

    static ArrayList<Image> filterThumbs(List<Image> l) {
        Predicate<Image> p1 = i -> i.width > 100;
        Predicate<Image> p2 = i -> i.height > 100;
        Predicate<Image> checkSize = p1.and(p2);
        var result = new ArrayList<Image>();
        for (Image img : l) {
            if (checkSize.test(img)) {
                result.add(img);
            }
        }

        return result;
    }
}
