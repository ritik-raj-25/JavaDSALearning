//Write a program to reverse the array without using any extra array

package Arrays1D;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int n = arr.length;
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        //Method - 1
        for (int i = 0; i < n/2; i++) {
            swap(arr, i, n-i-1);
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        //Method - 2 (Two Pointers )
        int i = 0;
        int j = n - 1;
        while(i < j){
            swap(arr, i, j);
            ++i;
            --j;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
