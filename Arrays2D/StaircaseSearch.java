package Arrays2D;

public class StaircaseSearch {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n-1;
        int key = 99;
        boolean flag = false; // false means element is not present 
        while(i<m && j>=0) {
            if(matrix[i][j]==key){
                flag = true; // true means element is present
                break;
            }
            else if(key > matrix[i][j]) ++i;
            else --j;
        }
        if(flag == true) System.out.println("Element is present in the given matrix.");
        else System.out.println("Elenent is not present in the given matrix.");
    }
}