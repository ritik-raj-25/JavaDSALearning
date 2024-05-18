package Arrays1D.Assignment;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i<n; ++i){
            arr[i] = scan.nextInt();
        }
        int mx = Integer.MIN_VALUE;
        int smx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] > mx){
                smx = mx;
                mx = arr[i];
            }
            else if(arr[i] != mx && arr[i] > smx){
                smx = arr[i];
            }
        }
        System.out.println("Second Largest : "+smx);
        scan.close();
    }

}
