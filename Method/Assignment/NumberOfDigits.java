package Method.Assignment;

import java.util.Scanner;

class Count {
    int digitCount(int num){
        int cnt = 0;
        while(num != 0){
            num /= 10;
            ++cnt;
        }
        return cnt;
    }
}

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = scan.nextInt();
        Count count = new Count();
        int cnt = count.digitCount(num);
        System.out.println("Square of number of digits of "+num+" is "+(cnt*cnt));
        scan.close();
    }
}
