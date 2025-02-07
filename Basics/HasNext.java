package Basics;

import java.util.Scanner;

public class HasNext {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan = new Scanner("Java is a programming language");
        while(scan.hasNextLine()) { //checks is more line exists
            System.out.println(scan.next());
        }

        System.out.println();
        scan = new Scanner("10 11 12 13 14");
        while(scan.hasNext()) { //checks is more input exists
            System.out.println(scan.nextInt());
        }

        System.out.println();
        scan = new Scanner("1 2 3 java");
        while(scan.hasNextInt()) { //checks is next input is int
            System.out.println(scan.nextInt());
        }
        scan.close();
    }
}
