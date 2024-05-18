// Time Complexity (Average case) --> Θ(n*logn)
// Space Complexity (Average case) --> Θ(logn) --> (Recursive call stack space)
// Space Complexity (worst case) --> O(n)  --> (Recursive call stack space)
// Time Complexity (worst case) --> O(n*n)
// Time Complexity (Best case) --> Ω(n*logn)

// In Quick Sort relative order of duplicate elements are not maintained, So it is an unstable sort.

package AdvanceSortingAlgorithm;

public class QuickSort {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr, int lo, int hi){
        int pivotEle = arr[lo], pivotIndx = lo;
        int cntSmaller = 0;
        for(int i=lo+1; i<=hi; ++i){
            if(arr[i] <= pivotEle) ++cntSmaller;
        }
        int correctIndx = pivotIndx + cntSmaller;
        swap(arr,pivotIndx,correctIndx);
        int i=lo, j=hi;
        while(i<correctIndx && j>correctIndx){
            if(arr[i] <= arr[correctIndx]) ++i;
            else if(arr[j] > arr[correctIndx]) --j;
            else {
                swap(arr, i, j);
                ++i;
                --j;
            }
        }
        return correctIndx;
    }
    public static void quickSort(int[] arr, int lo, int hi){
        if(lo>=hi) return; //base case
        int indx = partition(arr,lo,hi);
        quickSort(arr, lo, indx-1);
        quickSort(arr, indx+1, hi);
    }
    public static void print(int[] arr){
        for(int i=0; i<arr.length; ++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,7,1,6,3,8,4,9};
        print(arr);
        quickSort(arr,0,arr.length-1);
        print(arr);
    }
}
