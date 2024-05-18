package Arrays2D;

public class MatrixMultiplilcation {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int m = a.length;
        int n = a[0].length;
        int p = b.length;
        int q = b[0].length;
        if(n==p){
            int[][] mul = new int[m][q];
            for(int i=0; i<m; ++i){
                for(int j=0; j<q; ++j){
                    int sum = 0;
                    for(int k=0; k<n; ++k){
                        sum += a[i][k]*b[k][j];
                    }
                    mul[i][j] = sum;
                }
            }
            for(int i=0; i<m; ++i){
                for(int j=0; j<q; ++j){
                    System.out.print(mul[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Matrix Multiplication is not possible for the given matrices.");
        }
    }
}
