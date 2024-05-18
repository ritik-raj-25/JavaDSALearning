package Arrays2D.Assignment;

public class RotateAntiClockwise {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,10},{4,5,6,11},{7,8,9,12},{13,14,15,16}};
        int m = matrix.length;
        //transpose the matrix w.r.t. secondary diagonal
        for(int i=0; i<m; ++i){
            for(int j=0; j<m-1-i; ++j){
                matrix[i][j] = matrix[i][j] + matrix[m-1-j][m-1-i];
                matrix[m-1-j][m-1-i] = matrix[i][j] - matrix[m-1-j][m-1-i];
                matrix[i][j] = matrix[i][j] - matrix[m-1-j][m-1-i];
            }
        }
        //reverse each row of the matrix
        for(int i=0; i<m; ++i){
            for(int j=0; j<m/2; ++j){
                matrix[i][j] = matrix[i][j] + matrix[i][m-1-j];
                matrix[i][m-1-j] = matrix[i][j] - matrix[i][m-1-j];
                matrix[i][j] = matrix[i][j] - matrix[i][m-1-j];
            }
        }
        //print the rotated matrix
        for(int i=0; i<m; ++i){
            for(int j=0; j<m; ++j){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}