package Arrays1D.Assignment;

import java.util.Scanner;

public class SmallestMissingPositiveElementInSortedArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i<n; ++i){
            arr[i] = scan.nextInt();
        }
        //solution
        boolean[] present = new boolean[n+2];
        for(int i = 0; i<n; ++i){
            if(arr[i]>0 && arr[i]<=n){
                present[arr[i]] = true;
            }
        }
        for (int i = 1; i <= n+1; i++) {
            if(present[i] == false){
                System.out.println("Smallest Missing Positive Element Is : "+i);
                break;
            }
        }
        scan.close();
    }
}
