package Arrays1D.Assignment;

import java.util.Scanner;

public class IsArraySorted {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i<n; ++i){
            arr[i] = scan.nextInt();
        }
        boolean flag = true; // true means sorted
        for (int i = 0; i < n-1; i++) {
            if(arr[i+1] < arr[i]){
                flag = false; // false means Unsorted
                break;
            }
        }
        if(flag == false){
            System.out.println("Is Array Sorted?"+" No.");
        }
        else{
            System.out.println("Is Array Sorted?"+" Yes.");
        }
        scan.close();
    }
}
