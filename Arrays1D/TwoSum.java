//Find the doublet in the array whose sum is equal to the given value x. (Two Sum)

package Arrays1D;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Size of the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for(int i = 0; i<n; ++i){
            arr[i] = scan.nextInt();
        }
        System.out.print("Enter x: ");
        int x = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int rem = x - arr[i];
            for(int j = i+1; j<n; ++j){
                if(arr[j] == rem){
                    System.out.println("Required Indices are "+i+" "+j);
                }
            }
        }
        scan.close();
    }
}
