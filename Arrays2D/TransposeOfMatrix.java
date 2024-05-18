package Arrays2D;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}, {5, 6}};
        int m = a.length;
        int n = a[0].length;
        // column-wise printing
        for(int i=0; i<n; ++i){ //column
            for(int j=0; j<m; ++j){ //row
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
        System.out.println();

        // Transpose of a matrix stored in  a new matrix
        int[][] transpose = new int[n][m];
        for(int i=0; i<n; ++i){ 
            for(int j=0; j<m; ++j){ 
                transpose[i][j] = a[j][i];
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
