package Method.Assignment;

import java.util.Scanner;

class OddNumber {
    boolean isOdd(int num){
        return num%2 == 1;
    }
}

public class OddNumbersBetweenGivenRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = scan.nextInt();
        System.out.print("Enter b:");
        int b = scan.nextInt();
        OddNumber o = new OddNumber();
        for(int i = a; i<=b; ++i){
            if(o.isOdd(i)){
                System.out.print(i+" ");
            }
        }
        scan.close();
    }
}
