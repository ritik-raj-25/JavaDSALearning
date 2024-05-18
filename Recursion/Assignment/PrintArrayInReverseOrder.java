package Recursion.Assignment;

public class PrintArrayInReverseOrder {
    public static void printArray(int i, int[] arr){
        if(i<0){
            return;
        }
        System.out.print(arr[i]+" ");
        printArray(i-1, arr);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        printArray(arr.length-1,arr);
    }
}
