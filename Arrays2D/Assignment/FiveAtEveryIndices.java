package Arrays2D.Assignment;

public class FiveAtEveryIndices {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int m = a.length;
        for(int i=0; i<m; ++i){
            for(int j=0; j<m; ++j){
                a[i][j] = 10;
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        } 
    }
}
