// Time Complexity --> O(logn)
// Space Complexity --> O(n)
// Auxilary Space --> O(1)

package BinarySearch;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int[] arr = {10,23,46,89,91,97,107,140,264};
        int n = arr.length;
        int target = 45;
        // Binary Search
        int lo = 0, hi = n-1;
        boolean flag = false;
        while(lo<=hi){
            int mid = (lo+hi)/2; //mid = lo + (hi-lo)/2;
            if(arr[mid]==target) {
                flag = true;
                break;
            }
            else if(arr[mid]>target) hi = mid-1;
            else lo = mid+1;
        }
        if(flag==true) System.out.println("Traget Present");
        else System.out.println("Target not found");
    }
}