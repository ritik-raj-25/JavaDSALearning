package Arrays1D;

import java.util.Arrays;

public class CopyOfArray {
    public static void main(String[] args) {
        int[] arr = {23, 15, 34, 56, 13, 6, 9};
        System.out.print("Array arr: ");
        for (int ele : arr) {
            System.out.print(ele +" ");
        }
        System.out.println();
        int[] brr = arr;//Shallow Copy --> brr is a reference to arr
        System.out.print("Array brr: ");
        for (int ele : brr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        brr[0] = 1000; //Updating 1st element of brr
        System.out.print("Array arr: ");
        for (int ele : arr) {
            System.out.print(ele +" ");
        }
        System.out.println();
        int[] crr = Arrays.copyOf(arr, arr.length);  //Deep Copy(Actual copy) Using inbuilt function
        System.out.print("Array crr: ");
        for (int ele : crr) {
            System.out.print(ele +" ");
        }
        System.out.println();
        crr[0] = 2000;  //Updating 1st element of crr
        System.out.print("Array arr: ");
        for (int ele : arr) {
            System.out.print(ele +" ");
        }
        System.out.println();
        int[] drr = new int[arr.length];
        for(int i = 0; i < arr.length; ++i){  //Deep Copy of arr
            drr[i] = arr[i];
        }
        System.out.print("Array drr: ");
        for (int ele : drr) {
            System.out.print(ele +" ");
        }
        System.out.println();
        drr[0] = 3000; //Updating 1st element of drr
        System.out.print("Array arr: ");
        for (int ele : arr) {
            System.out.print(ele +" ");
        }
        System.out.println();
    }
}
