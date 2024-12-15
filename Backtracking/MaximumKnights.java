package Backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumKnights {
    private static int ans;
    private static boolean isSafe(char[][] board , int row, int col) {
        int n = board.length;
        int i;
        int j;
        //2right, 1up
        i = row-1;
        j = col+2;
        if(i>=0 && j<n && board[i][j]=='k') return false;
        //2left, 1up
        i = row-1;
        j = col-2;
        if(i>=0 && j>=0 && board[i][j]=='k') return false;
        //2right, 1down
        i = row+1;
        j = col+2;
        if(i<n && j<n && board[i][j]=='k') return false;
        //2left, 1down
        i = row+1;
        j = col-2;
        if(i<n && j>=0 && board[i][j]=='k') return false;
        //2up, 1right
        i = row-2;
        j = col+1;
        if(i>=0 && j<n && board[i][j]=='k') return false;
        //2up, 1left
        i = row-2;
        j = col-1;
        if(i>=0 && j>=0 && board[i][j]=='k') return false;
        //2down, 1right
        i = row+2;
        j = col+1;
        if(i<n && j<n && board[i][j]=='k') return false;
        //2down, 1left
        i = row+2;
        j = col-1;
        if(i<n && j>=0 && board[i][j]=='k') return false;
        return true;
    }
    private static void maxKnight(char[][] board, int row, int col, int cnt) {
        int n = board.length;
        if(row == n) {
            ans = Math.max(ans, cnt);
            return;
        }
        if(isSafe(board, row, col)) {
            board[row][col] = 'k';
            if(col != n-1) maxKnight(board, row, col+1, cnt+1);
            else maxKnight(board, row+1, 0, cnt+1);
            board[row][col] = 'x';//backtracking
        }
        if(col != n-1) maxKnight(board, row, col+1, cnt);
        else maxKnight(board, row+1, 0, cnt);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scan.nextInt();
        char[][] board = new char[n][n];
        for(char[] row : board) {
            Arrays.fill(row,'x');
        }
        maxKnight(board, 0 , 0, 0); //finds the maximum number of knights that can be placed on N*N matrix
        System.out.println("Maximum possible Knight on board:"+ans);
        scan.close();
    }
}
