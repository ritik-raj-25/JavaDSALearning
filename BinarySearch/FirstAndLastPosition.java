package BinarySearch;

public class FirstAndLastPosition{
    public static void main(String[] args) {
        int[] arr={10,10,20,20,20,20,20,30,30,30,40};
        int n = arr.length;
        int x = 50;

        // Find lower bound (first position = lower bound(if x exists))
        int lb = n;
        int lo=0, hi=n-1;
        while(lo <= hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]>=x){
                lb = mid;
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }

        // Find upper bound (last position = upper bound - 1(if x exists))
        int ub = n; 
        lo=0; hi=n-1;
        while(lo <= hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]>x){
                ub = mid;
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        if(lb == ub){ // x did not exist in the given array
            lb = -1;
            ub = -1;
        }
        else{
            ub = ub-1; //last position
        }
        System.out.println(lb+" "+ub);
    }
}