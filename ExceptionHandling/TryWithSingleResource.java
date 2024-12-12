package ExceptionHandling;

import java.util.Scanner;

public class TryWithSingleResource {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try(scan){ //At the end of the try block, scan(resource) will be closed automatically
            System.out.print("Enter n: ");
            int n = scan.nextInt();
            System.out.println("Square of "+n+" is: "+n*n);
        }
    }
}
