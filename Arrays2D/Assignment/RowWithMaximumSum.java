package Arrays2D.Assignment;

public class RowWithMaximumSum {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{3,4,7,8},{1,4,12,3}};
        int m = matrix.length;
        int n = matrix[0].length;
        int maxRow=-1; 
        int max = Integer.MIN_VALUE;
        for(int i=0; i<m; ++i){
            int sum = 0;
            for(int j=0; j<n; ++j){
                sum += matrix[i][j];
            }
            if(sum > max){
                max = sum;
                maxRow = i;
            }
        }
        System.out.println(maxRow);
    }
}
