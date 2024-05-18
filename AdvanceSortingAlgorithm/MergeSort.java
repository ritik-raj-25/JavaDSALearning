// Time Complexity --> O(n*logn)
// Space Complexity --> O(n)
// Auxilary Space --> O(n)
// Time Complexity (Average case) --> Θ(n*logn)
// Time Complexity (Best case) --> Ω(n*logn)

// In Merge Sort relative order of duplicate elements are maintained, So it is a stable sort

package AdvanceSortingAlgorithm;

public class MergeSort {
    public static void print(int[] arr){
        for(int i=0; i<arr.length; ++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void merge(int[] a, int[] b, int[] merged){
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) merged[k++] = a[i++];
            else merged[k++] = b[j++];
        }
        while(i<a.length) merged[k++] = a[i++];
        while(j<b.length) merged[k++] = b[j++];
    }
    public static void mergeSort(int[] arr){
        int n = arr.length;
        if(n==1) return; //base case
        //divide
        int[] a = new int[n/2]; 
        int[] b = new int[n-n/2];
        for(int i=0; i<n/2; ++i){
            a[i] = arr[i];
        }
        for(int i=0; i<n-n/2; ++i){
            b[i] = arr[n/2+i];
        }
        //sort
        mergeSort(a);
        mergeSort(b);
        //merge
        merge(a,b,arr);
    }
    public static void main(String[] args) {
        int[] arr = {80,30,50,20,60,10,70,40,23};
        print(arr);
        mergeSort(arr);
        print(arr);
    }
}
