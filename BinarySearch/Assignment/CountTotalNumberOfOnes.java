package BinarySearch.Assignment;

public class CountTotalNumberOfOnes {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,1,1,1,1,1};
        int n = arr.length;
        int lb=n;
        int lo=0, hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==1){
                lb=mid;
                hi=mid-1;
            }
            else lo=mid+1;
        }
        System.out.println(n-lb);
    }
}
