package Recursion.Assignment;

public class SearchElement {
    public static int binarySearch(int[] arr, int s, int e, int x){
        if(s>e) return -1;
        int mid = s+(e-s)/2;
        if(arr[mid] == x) return mid;
        else if(arr[mid] > x) return binarySearch(arr, s, mid-1, x);
        else return binarySearch(arr, mid+1, e, x);
    }
    public static void main(String[] args) {
        int[] arr = {10,23,-34,7,11,45};
        int x = 110;
        System.out.println(binarySearch(arr,0,arr.length-1,x));
    }
}
