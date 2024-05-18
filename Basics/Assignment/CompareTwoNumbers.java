package Basics.Assignment;

public class CompareTwoNumbers {
    public static void main(String[] args) {
        int x = 5, y = 6;
        boolean resEqual = x == y;
        boolean resNotEqual = x != y;
        boolean resFirstGreater = x > y;
        boolean resFirstLess = x < y;
        System.out.println("Are numbers equal?"+resEqual);
        System.out.println("Are numbers not equal?"+resNotEqual);
        System.out.println("Is the first number greater?"+resFirstGreater);
        System.out.println("Is the first number less?"+resFirstLess);
    }
}
