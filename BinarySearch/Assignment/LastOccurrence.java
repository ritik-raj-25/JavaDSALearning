package BinarySearch.Assignment;

public class LastOccurrence {
    public static int lastOccurrence(int[] arr, int x){
        int n=arr.length;
        int lo=0, hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==x){
                if(mid<n-1 && arr[mid+1]==x){
                    lo=mid+1;
                }
                else return mid;
            }
            else if(arr[mid]<x) lo=mid+1; 
            else hi=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,4,4,5,5};
        int x = -1;
        System.out.println(lastOccurrence(arr,x));
    }
}
