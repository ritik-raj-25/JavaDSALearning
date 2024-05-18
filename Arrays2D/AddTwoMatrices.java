package Arrays2D;

public class AddTwoMatrices {
    public static void main(String[] args) {
        int[][] a = {{1, 9, 2}, {3, 7, 4}, {8, 5, 6}};
        int[][] b = {{9, 3, 7}, {8, 6, 5}, {2, 4, 1}};
        int m = a.length;
        int n = a[0].length;
        int p = b.length;
        int q = b[0].length;
        if(m==p && n==q) {
            int[][] res = new int[m][n];
            for(int i=0; i<m; i++) {
                for(int j=0; j<n; j++) {
                    res[i][j] = a[i][j] + b[i][j];
                }
            }
            for(int[] ele : res){
                for(int x : ele){
                    System.out.print(x+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Addition not possible!");
        }
    }
}
