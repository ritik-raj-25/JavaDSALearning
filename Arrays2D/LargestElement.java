package Arrays2D;

public class LargestElement {
    public static void main(String[] args){
        int[][] matrix = {{23, 45, -65}, {46, 101, 31}, {12, -27, 48}, {29, 10, 99}}; 
        int m = matrix.length; // rows
        int n = matrix[0].length; // columns
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i<m; i++) {
            for (int j = 0; j<n; j++) {
                mx = Math.max(mx,matrix[i][j]);
            }
        }
        System.out.println("Largest Element of the matrix is "+mx);
    }
}
