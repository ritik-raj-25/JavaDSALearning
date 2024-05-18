package StringBuilders;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        // Sorting a string
        String s = new String("zgby");
        char[] str = s.toCharArray();
        Arrays.sort(str);
        System.out.println(str);

        // Sorting a string builder
        StringBuilder sb = new StringBuilder("care");
        char[] a = sb.toString().toCharArray();
        Arrays.sort(a);
        System.out.println(a);
    }
}
