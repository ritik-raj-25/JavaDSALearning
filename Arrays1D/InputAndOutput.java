package Arrays1D;

import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array size:");
        int n = scan.nextInt();  //size of the array
        int[] arr = new int[n];  //Array Declaration
        //Input --> loop
        for(int i = 0; i<n; ++i){
            arr[i] = scan.nextInt();
        }
        //Output --> loop
        for(int i = 0; i<n; ++i){
            System.out.print(arr[i] + " ");
        }
        scan.close();
    }
}
