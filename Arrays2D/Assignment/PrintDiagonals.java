package Arrays2D.Assignment;

public class PrintDiagonals {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int m = matrix.length;
        for(int i=0; i<m; ++i){
            for(int j=0; j<m; ++j){
                if(i==j || i+j==m-1){
                    System.out.print(matrix[i][j]+" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //Printing primary and secondary diagonal separately
        for(int i=0; i<m; ++i){  //printing primary diagonal
            System.out.print(matrix[i][i]+" ");
        }
        System.out.println();
        int i = 0;
        int j = m-1;
        while(i<m){ //printing secondary diagonal
            System.out.print(matrix[i][j]+" ");
            ++i;
            --j;
        }
    }
}
