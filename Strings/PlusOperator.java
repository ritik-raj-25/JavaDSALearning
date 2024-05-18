package Strings;

public class PlusOperator {
    public static void main(String[] args) {
        String s = "abc";
        String t = "def";
        s = s+t; //s += t; (It is also valid)
        System.out.println(s);
        System.out.println("Test"+10+20);  // Associativity and precedence
        System.out.println(10+20+"Test");  // Associativity and precedence
    }
}