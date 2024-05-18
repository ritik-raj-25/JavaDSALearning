package Arrays2D.Assignment;

import java.util.Scanner;

public class GenerateSpiralMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        int[][] matrix = new int[n][n];
        int minr = 0;
        int minc = 0;
        int maxr = n-1;
        int maxc = n-1;
        int a=1;
        while(minr<=maxr && minc<=maxc){
            for(int i=minc; i<=maxc; ++i){ //left to right
                matrix[minr][i] = a++;
            }
            ++minr;
            for(int i=minr; i<=maxc; ++i){ //top to down
                matrix[i][maxc] = a++;
            }
            --maxc;
            if(minr <= maxr){
                for(int i=maxc; i>=minc; --i){ //right to left
                    matrix[maxr][i] = a++;
                }
                --maxr;
            }
            if(minc <= maxc){
                for(int i=maxr; i>=minr; --i){ //down to top
                    matrix[i][minc] = a++;
                }
                ++minc;
            }
        }
        for(int i=0; i<n; ++i){
            for(int j=0; j<n; ++j){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
