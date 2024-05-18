package Arrays1D;

import java.util.Scanner;

public class SecondLargestValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        //Solution 
        int mx = Integer.MIN_VALUE;
        int mxi = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i] > mx){
                mx = arr[i];
                mxi = i;
            }
        }
        int smx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(i != mxi){ //Ignore the index where largest element of the array exist.
                smx = Math.max(smx, arr[i]);
            }
        }
        System.out.println("Second Largest Value is "+smx);
        scan.close();
    }
}
