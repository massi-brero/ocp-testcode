package de.massisoft.ocp.chapter15;

import java.util.ArrayList;
import java.util.List;

public class TestClass1 {

    public static void main(String[] args) {

        for (String data : args) {
            try {
                System.out.println(countVowels(data.toCharArray()));
                System.out.println(countVowels(null));

            } catch (NoXAllowedException e) {
                e.printStackTrace();
            }
        }

    }

    static int countVowels(char[] letters) throws NoXAllowedException {
        // if (letters == null) {
        // throw new IllegalArgumentException("No null data allowed.");
        // }

        var vowelslist = new ArrayList<Character>(List.of('a', 'e', 'i', 'o', 'u'));
        int count = 0;

        try {

            for (Character c : letters) {
                char testGreaterThanTen = letters[9];
                if (c.equals('x') || c.equals('X')) {
                    throw new NoXAllowedException();
                }

                if (vowelslist.contains(c)) {
                    count++;
                }
            }
        } catch (NullPointerException e) {
            count = -1;
        } catch (ArrayIndexOutOfBoundsException e) {
            count = 0;
        }
        return count;
    }
}