//WAP to store roll number and marks obtained by 4 students side by side in a matrix 

package Arrays2D;

import java.util.Scanner;

public class StoreMarksAndRollNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = 4;
        int n = 2;
        int[][] student = new int[m][n];
        for(int i=0; i<m; ++i){
            for(int j=0; j<n; ++j){
                student[i][j] = scan.nextInt();
            }
        }
        for(int i=0; i<m; ++i){
            for(int j=0; j<n; ++j){
                System.out.print(student[i][j]+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
