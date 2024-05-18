package Arrays2D.Assignment;

public class MiddleRowMiddleColumn {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,2},{4,5,6},{7,8,9}};
        displayMiddleRowMiddlecolumn(matrix);
    }
    public static void displayMiddleRowMiddlecolumn(int[][] matrix) {
        int m = matrix.length;
        for(int i=0; i<m; ++i){
            for(int j=0; j<m; ++j){
                if(i==m/2 || j==m/2){
                    System.out.print(matrix[i][j]+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //Printing middle row and column separately
        for(int i=0; i<m; ++i){  //printing middle row
            System.out.print(matrix[m/2][i]+" ");
        }
        System.out.println();
        for(int i=0; i<m; ++i){ //printing middle column
            System.out.print(matrix[i][m/2]+" ");
        }
    }
}
