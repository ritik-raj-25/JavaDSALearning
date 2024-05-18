package Arrays2D.Assignment;

public class MaximumElement {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,4,6},{2,4,5,7},{3,5,6,8},{4,6,7,9}};
        int m = matrix.length;
        int n = matrix[0].length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<m; ++i){
            for(int j=0; j<n; ++j){
                if(max < matrix[i][j]) max = matrix[i][j];
            }
        }
        System.out.println(max);
    }
}