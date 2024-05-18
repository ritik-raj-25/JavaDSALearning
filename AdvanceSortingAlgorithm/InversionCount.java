package AdvanceSortingAlgorithm;

public class InversionCount {

    static int cnt = 0;
    public static void inversionCount(int[] a, int[] b){
        int i=0, j=0;
        while(i<a.length && j<b.length){
            if(a[i] <= b[j]) ++i;
            else {
                cnt += a.length-i;
                ++j;
            }
        }
    }
    public static void merge(int[] a, int[] b, int[] merged){
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i] <= b[j]) merged[k++] = a[i++];
            else merged[k++] = b[j++];
        }
        while(j < b.length) merged[k++] = b[j++];
        while(i < a.length) merged[k++] = a[i++];
    }
    public static void mergeSort(int[] arr){
        int n = arr.length;
        if(n == 1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        for(int i=0; i<n/2; ++i){
            a[i] = arr[i];
        }
        for(int i=0; i<n-n/2; ++i){
            b[i] = arr[n/2+i];
        }
        mergeSort(a);
        mergeSort(b);
        inversionCount(a,b);
        merge(a,b,arr);
    }
    public static void print(int[] arr){
        for(int i=0; i<arr.length; ++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {8,2,5,3,1,4};
        print(arr);
        mergeSort(arr);
        print(arr);
        System.out.println(cnt);
    }
}