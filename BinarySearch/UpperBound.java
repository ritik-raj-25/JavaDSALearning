package BinarySearch;

public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {10,20,30,30,40,50,60,70};
        int n = arr.length;
        int x = 30;
        // Upper Bound --> Solution
        int ub=n;
        int lo=0, hi=n-1;
        while(lo <= hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid] > x){
                ub = mid; //ub=Math.min(ub,mid);
                hi = mid-1; 
            }
            else{
                lo=mid+1;
            }
        }
        System.out.println(ub);
    }
}
