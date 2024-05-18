package BasicSortingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {88, 25, 41, 23, 36, 63};
        int n = arr.length;
        System.out.print("Enter k(k<="+n+"):");
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
        scan.close();
    }
}