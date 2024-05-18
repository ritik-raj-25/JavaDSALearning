package Arrays1D;

import java.util.Scanner;

public class MaximumValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        //Maximum Element --> Solution
        // int mx = arr[0];
        // for (int i = 1; i < n; i++) {
        //     if(arr[i] > mx){
        //         mx = arr[i];    
        //     }
        // }
        //Method - 2
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx,arr[i]);
        }
        System.out.println("Maximum Value is "+mx);
        scan.close();
    }
}
