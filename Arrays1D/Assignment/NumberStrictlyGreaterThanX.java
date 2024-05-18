package Arrays1D.Assignment;

import java.util.Scanner;

public class NumberStrictlyGreaterThanX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i<n; ++i){
            arr[i] = scan.nextInt();
        }
        System.out.print("Enter x : ");
        int x = scan.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] > x){
                ++cnt;
            }
        }
        System.out.println("Numbers Strictly Greater Than "+x+" is "+cnt);
        scan.close();
    }
}
