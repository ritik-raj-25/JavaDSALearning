package Arrays2D.Assignment;

public class Waveform {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0; i<n; ++i){
            if(i%2==1){
                for(int j=0; j<m; ++j){
                    System.out.print(matrix[j][i]+" ");
                }
            }
            else{
                for(int j=m-1; j>=0; --j){
                    System.out.print(matrix[j][i]+" ");
                }
            }
        }
    }
}
