package Arrays1D;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for(int i = 0; i<n; ++i){
            arr[i] = scan.nextInt();
        }
        System.out.print("Enter target element: ");
        int x = scan.nextInt();

        //Linear Search --> Solution
        boolean flag = false; //false means not found
        for (int i = 0; i < n; i++) {
            if(arr[i] == x){
                flag = true; //true means found
                break;
            }
        }
        if(flag == true) System.out.println("Element Found");
        else System.out.println("Element Not Found");
        scan.close();
    }
}
