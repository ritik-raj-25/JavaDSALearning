package Basics;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int x = 5, y = 2;
        System.out.println(x+y);  //plus opeartor
        System.out.println(x-y);  //minus operator
        System.out.println(x*y);  //multiplication operator
        System.out.println(x/y);  //division operator [quotient(x/y)]
        System.out.println((float)x/y); //division opeartor
        System.out.println(x%y);   //modulus opearator [rem(x/y)]
    }
}

// 1. a % b = a, if a < b.
// 2. a % -b = a % b.
// 3. -a % b = -[a % b].

