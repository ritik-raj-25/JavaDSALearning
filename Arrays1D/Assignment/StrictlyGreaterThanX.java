package Arrays1D.Assignment;

import java.util.Scanner;

public class StrictlyGreaterThanX {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements:");
        for(int i=0; i<n; ++i){
            arr[i] = scan.nextInt();
        }
        System.out.print("Enter x:");
        int x = scan.nextInt();
        //Solution
        int cnt = 0; 
        for(int i=0; i<n; ++i){
            if(arr[i] > x){
                ++cnt;
            }
        }
        System.out.println("Number of elements strictly greater than "+x+" is "+cnt);
        scan.close();
    }
}