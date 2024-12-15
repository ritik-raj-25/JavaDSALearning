package Backtracking;

import java.util.Scanner;

public class RatInMazeOne {
    private static void printPath(int sr, int sc, int er, int ec, String path) {
        if(sc>ec || sr>er) return;
        if(sc==ec && sr==er) {
            System.out.println(path);
            return;
        }
        //move right
        printPath(sr, sc+1, er, ec, path+"R");
        //move down
        printPath(sr+1, sc, er, ec, path+"D");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter m:");
        int m = scan.nextInt();
        System.out.print("Enter n:");
        int n = scan.nextInt();
        System.out.println("Possible Paths: "); // D-->Down, R-->Right
        printPath(1, 1, m, n, "");
        scan.close();
    }
}
