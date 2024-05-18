// Time Complexity (worst case) --> O(n)

package AdvanceSortingAlgorithm;

public class KthLargest {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr, int lo, int hi){
        int pivotIndx = lo+(hi-lo)/2;
        int pivotEle = arr[pivotIndx];
        int cntSmaller = 0;
        for(int i=lo; i<=hi; ++i){
            if(i!=pivotIndx && arr[i] <= pivotEle) ++cntSmaller;
        }
        int correctIndx = lo + cntSmaller;
        swap(arr, pivotIndx, correctIndx);
        int i=lo, j=hi;
        while(i<correctIndx && j>correctIndx){
            if(arr[i] <= arr[correctIndx]) ++i;
            else if(arr[j] > arr[correctIndx]) --j;
            else {
                swap(arr,i,j);
                ++i;
                --j;
            }
        }
        return correctIndx;
    }
    public static void quickSelect(int[] arr, int lo, int hi, int k){
        if(lo >= hi) return; //base case
        int indx = partition(arr,lo,hi);
        if(indx == arr.length-k) return;
        if(arr.length-k < indx)quickSelect(arr, lo, indx-1, k);
        else quickSelect(arr, indx+1, hi, k);
    }
    public static void print(int[] arr){
        for(int i=0; i<arr.length; ++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {4,9,7,1,2,3,6,5,8};
        int k = 3;
        print(arr);
        quickSelect(arr,0,arr.length-1,k);
        System.err.println(arr[arr.length-k]);
    }
}