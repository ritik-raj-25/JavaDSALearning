package Arrays2D.Assignment;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] b = {{4,5,8},{0,0,8},{1,2,0}};
        int m = a.length;
        int n = a[0].length;
        int p = b.length;
        int q = b[0].length;
        if(m==p && n==q){
            for(int i=0; i<m; ++i){
                for(int j=0; j<n; ++j){
                    a[i][j] += b[i][j];
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
