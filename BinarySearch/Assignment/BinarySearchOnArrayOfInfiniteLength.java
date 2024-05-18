package BinarySearch.Assignment;

public class BinarySearchOnArrayOfInfiniteLength {
    public static int binarySearch(int[] arr, int target, int lo, int hi){
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) hi=mid-1;
            else lo=mid+1;
        }
        return -1;
    }
    public static int findIndx(int[] arr, int target){
        int lo=0,hi=1;
        while(target>arr[hi]){
            lo=hi;
            hi=2*hi;
        }
        return binarySearch(arr,target,lo,hi);
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,7,9,12,14,15,17,23,45,78};
        int target = 5;
        System.out.println(findIndx(arr,target));
    }
}