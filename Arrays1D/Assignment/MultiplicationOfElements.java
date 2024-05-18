package Arrays1D.Assignment;

import java.util.Scanner;

public class MultiplicationOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        int mul = 1;
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i<n; ++i){
            arr[i] = scan.nextInt();
            mul *= arr[i];
        }
        System.out.println("Mul : "+mul);
        scan.close();
    }
}
