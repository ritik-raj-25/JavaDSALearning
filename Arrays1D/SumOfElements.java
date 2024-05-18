package Arrays1D;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array size:");
        int n = scan.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.print("Enter array elements:");
        for(int i = 0; i<n; ++i){
            arr[i] = scan.nextInt();
            sum += arr[i];
        }
        System.out.print("Sum = "+sum);
        scan.close();
    }
}
