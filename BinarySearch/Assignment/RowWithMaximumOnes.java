package BinarySearch.Assignment;

public class RowWithMaximumOnes {
    public static int countTotalNumberOfOnes(int[] arr){
        int n=arr.length;
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
        return n-lb;
    }
    public static void main(String[] args) {
        int[][] arr = {{0,0,1,1},{0,1,1,1},{0,0,0,0},{1,1,1,1},{0,0,0,1}};
        int m = arr.length; //rows
        int rowWithMaxOnes=-1;
        int numberOfOnesP = 0;
        int numberOfOnesC = 0;
        for(int i=0; i<m; ++i){
            numberOfOnesC = countTotalNumberOfOnes(arr[i]);
            if(numberOfOnesC > numberOfOnesP){
                numberOfOnesP = numberOfOnesC;
                rowWithMaxOnes=i;
            }
        }
        System.out.println(rowWithMaxOnes);
    }
}