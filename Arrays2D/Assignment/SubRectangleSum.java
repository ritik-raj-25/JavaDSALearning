package Arrays2D.Assignment;

public class SubRectangleSum {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,-3,4},{0,0,-4,2},{1,-1,2,3},{-4,-5,-7,0}};
        int r1=1, c1=1;
        int r2=3, c2=3;
        int sum = 0;
        for(int i=Math.min(r1,r2); i<=Math.max(r1,r2); ++i){
            for(int j=Math.min(c1,c2); j<=Math.max(c1,c2); ++j){
                sum += matrix[i][j];
            }
        } 
        System.out.println(sum);
    }
}
