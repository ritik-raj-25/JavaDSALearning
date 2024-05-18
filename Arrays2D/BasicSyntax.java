// 2D Array --> Array of arrays

package Arrays2D;

import java.util.Scanner;

public class BasicSyntax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Declaration of 2D Array
        int[][] arr = new int[3][4];  //data_type[][] array_name = new data_type[no_of_rows][no_of_columns]

        int m = arr.length; // no_of_rows
        int n = arr[0].length; // no_of_cloumns

        // Tacking input from user
        for(int i=0; i<m; ++i){  //rows
            for(int j=0; j<n; ++j){ //columns
                arr[i][j] = scan.nextInt();
            }
        }

        // Printing 2D Array
        for(int i=0; i<m; ++i){  //rows
            for(int j=0; j<n; ++j){ //columns
                System.out.print(arr[i][j]+" "); // Accessing 2D array elements --> array_name[row_no][column_no]
            }
            System.out.println();
        }

        // Initializing 2D Array
        int[][] grid = {{1, 2, 3}, {4, 5, 6}};

        // for each loop in 2d Array
        for(int[] ele : grid){
            for(int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        scan.close();
    }
} 