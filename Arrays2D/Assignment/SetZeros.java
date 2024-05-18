package Arrays2D.Assignment;

public class SetZeros {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int m = matrix.length;
        int n = matrix[0].length;
        boolean zeroRow = false;
        boolean zeroCol = false;
        for(int i=0; i<n; ++i){
            if(matrix[0][i] == 0) {
                zeroRow = true;
                break;
            }
        }
        for(int i=0; i<m; ++i){
            if(matrix[i][0] == 0) {
                zeroCol = true;
                break;
            }
        }

        for(int i=1; i<m; ++i){
            for(int j=1; j<n; ++j){
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0; 
                }
            }
        }
        for(int i=1; i<m; ++i){
            if(matrix[i][0] == 0){
                for(int j=0; j<n; ++j) {
                    matrix[i][j] = 0;
                }
            }
        }
        for(int i=1; i<n; ++i){
            if(matrix[0][i] == 0){
                for(int j=0; j<m; ++j) {
                    matrix[j][i] = 0;
                }
            }
        }

        if(zeroRow = true){
            for(int i=0; i<n; ++i){
                matrix[0][i] = 0;
            }
        }
        if(zeroCol = true) {
            for(int i=0; i<m; ++i){
                matrix[i][0] = 0;
            }
        }

        //Printing the updated matrix
        for(int i=0; i<m; ++i){
            for(int j=0; j<n; ++j) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
