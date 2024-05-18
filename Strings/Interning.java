//In java, strings are immutable.

package Strings;

public class Interning {
    public static void main(String[] args) {
        String a = "Ritik";  // Suppose a memory :-- [a --> "Ritik" ]
        a = "Hrithik";       // [a -x-> "Ritik"  a --> "Hrithik"]  ('x' represents cross)
        String b = "Ritik";  // [a -x-> "Ritik" <-- b, a --> "Hrithik"], interning
        // String interning is used to save memory (for interning string must be immutable).

        String c = new String("Ritik"); // [a -x-> "Ritik" <-- b, a --> "Hrithik"  c --> "Ritik"]
        System.out.println(a+" "+b+" "+c);
    }
}
