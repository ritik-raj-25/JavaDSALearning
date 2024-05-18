package BinarySearch.Assignment;

public class RepeatedNumber {
    public static int repeatedNumber(int[] arr){
        int n = arr.length;
        int lo=0, hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==mid){
                if(arr[mid-1]==arr[mid]) return arr[mid];
                else hi=mid-1;
            }
            else lo=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6};
        System.out.println(repeatedNumber(arr));
    }
}
