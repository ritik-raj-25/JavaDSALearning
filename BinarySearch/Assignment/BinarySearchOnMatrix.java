package BinarySearch.Assignment;

public class BinarySearchOnMatrix {
    public static boolean binarySearch(int[][] matrix, int target){
        int m = matrix.length;
        int n = matrix[0].length;
        int lo=0, hi=n*m-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(matrix[mid/n][mid%n]==target) return true;
            else if(matrix[mid/n][mid%n]>target) hi=mid-1;
            else lo=mid+1;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 50;
        System.out.println(binarySearch(matrix,target));
    }
}