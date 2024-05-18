package Method.Assignment;

import java.util.Scanner;

class Maths {
    void squareTillN(int n){
        for(int i = 1; i <= n; ++i){
            System.out.println(i*i);
        }
    }
}

public class SquareOfAllNaturalNumbersTillN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        Maths maths = new Maths();
        maths.squareTillN(n);
        scan.close();
    }
}
