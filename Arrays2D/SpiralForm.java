package Arrays2D;

public class SpiralForm {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}, {26, 27, 28, 29, 30}};
        int m = matrix.length;
        int n = matrix[0].length;
        int minr = 0;
        int maxr = m-1;
        int minc = 0;
        int maxc = n-1;
        while(minr<=maxr && minc<=maxc){
            for(int i=minc; i<=maxc; ++i) {  //left to right
                System.out.print(matrix[minr][i]+" ");
            }
            ++minr;
            for(int i=minr; i<=maxr; ++i){  //top to bottom
                System.out.print(matrix[i][maxc]+" ");
            }
            --maxc;
            if(minr <= maxr){  
                for(int i=maxc; i>=minc; --i){ //right to left
                    System.out.print(matrix[maxr][i]+" ");
                }
                --maxr;
            }
            if(minc <= maxc){
                for(int i=maxr; i>=minr; --i){  //bottom to top
                    System.out.print(matrix[i][minc]+" ");
                }
                ++minc;
            }
        }
    }
}
