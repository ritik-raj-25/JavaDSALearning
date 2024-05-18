package Arrays1D.Assignment;

import java.util.Scanner;

public class DuplicateElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i<n; ++i){
            arr[i] = scan.nextInt();
        }
        for(int i = 0; i<n; ++i){
            int k = 0;
            while (k < i) {
                if(arr[k] == arr[i]){
                    break;
                }
                ++k;
            }
            for(int j = i+1; k==i && j<n; ++j){
                if(arr[i] == arr[j]){
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
        scan.close();
    }
}