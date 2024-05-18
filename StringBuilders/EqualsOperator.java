// == Vs equals()

package StringBuilders;

public class EqualsOperator {
    public static void main(String[] args) {
        String a = "abcxyz";
        String b = "abcxyz"; // interning
        String x = "abc";
        String y = "xyz";
        String c = x + y;
        System.out.println("Output of ==:");
        System.out.println(a == b);
        System.out.println(a == c);  // == compares location 
        System.out.println("Output of equals():");
        System.out.println(a.equals(b)); // equals() compares strings character by character.
        System.out.println(a.equals(c));
    }
}
