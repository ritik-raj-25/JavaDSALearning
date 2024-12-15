package Backtracking;

import java.util.Scanner;

public class RatInMazeTwo {
    private static void printPath(int sr, int sc, int er, int ec, String path, boolean[][] isVisited) {
        if(sc>ec || sr>er) return;
        if(sc<0 || sr<0) return;
        if(isVisited[sr][sc]) return;
        if(sc==ec && sr==er) {
            System.out.println(path);
            return;
        }
        isVisited[sr][sc] = true; //marks visited path 

        //move right
        printPath(sr, sc+1, er, ec, path+"R", isVisited);
        //move down
        printPath(sr+1, sc, er, ec, path+"D", isVisited);
        //move Up
        printPath(sr-1, sc, er, ec, path+"U", isVisited);
        //move Left
        printPath(sr, sc-1, er, ec, path+"L", isVisited);

        isVisited[sr][sc] = false; //backtracking
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter m:");
        int m = scan.nextInt();
        System.out.print("Enter n:");
        int n = scan.nextInt();
        boolean[][] isVisited = new boolean[m][n];
        System.out.println("Possible Paths: "); // D-->Down, R-->Right, L-->Left, U-->UP
        printPath(0, 0, m-1, n-1, "", isVisited);
        scan.close();
    }
}
