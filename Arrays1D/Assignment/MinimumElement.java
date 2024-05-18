package Arrays1D.Assignment;

import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i<n; ++i){
            arr[i] = scan.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<n; ++i){
            min = Math.min(min, arr[i]);
        }
        System.out.println("Smallest Element : "+min);
        scan.close();
    }
}
