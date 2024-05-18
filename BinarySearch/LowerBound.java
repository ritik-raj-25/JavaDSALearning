// Lower Bound --> Smallest indx such that arr[indx] >= target

package BinarySearch;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {10,20,30,30,40,50,60,70};
        int n = arr.length;
        int x = 5;
        // Lower Bound --> Solution
        int lb=n;
        int lo=0, hi=n-1;
        while(lo <= hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid] >= x){
                lb = mid; //lb=Math.min(lb,mid);
                hi = mid-1; 
            }
            else{
                lo=mid+1;
            }
        }
        System.out.println(lb);
    }
}