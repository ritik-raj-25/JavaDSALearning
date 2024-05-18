package Arrays2D;

public class RotateTheMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = matrix.length;
        // Transform into Transpose
        for(int i=0; i<m; ++i){
            for(int j=0; j<i; ++j){
                matrix[i][j] = matrix[i][j]+matrix[j][i];
                matrix[j][i] = matrix[i][j]-matrix[j][i];
                matrix[i][j] = matrix[i][j]-matrix[j][i];
            }
        }
        // Reverse each row
        for(int i=0; i<m; ++i){
            for(int j=0; j<m/2; ++j){
                matrix[i][j] = matrix[i][j]+matrix[i][m-1-j];
                matrix[i][m-1-j] = matrix[i][j]-matrix[i][m-1-j];
                matrix[i][j] = matrix[i][j]-matrix[i][m-1-j];
            }
        }
        for(int[] ele : matrix){
            for(int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
