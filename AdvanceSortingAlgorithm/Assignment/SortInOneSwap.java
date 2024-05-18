package AdvanceSortingAlgorithm.Assignment;

public class SortInOneSwap {
    public static void main(String[] args) {
        int[] arr = {1,5,3};
        int n = arr.length;
        int lo = 0;
        for(int i=0; i<n-1; ++i){
            if(arr[i] > arr[i+1]) {
                lo = i;
                break;
            }
        }
        int hi = n-1;
        for(int i=1; i<n; ++i){
            if(arr[i] < arr[i-1]) {
                hi = i;
            }
        }
        int temp = arr[lo];
        arr[lo] = arr[hi];
        arr[hi] = temp;
        for(int i=0; i<n; ++i){
            System.out.print(arr[i]+" ");
        }
    }
}