package PatternPrinting.Triangles;

import java.util.Scanner;

public class FloydsTriangle {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        int a = 1;
        for(int i = 1; i <= n; ++i){
            for(int j = 1; j <= i; ++j){
                System.out.print(a+" ");
                ++a;
            }
            System.out.println();
        }
        scan.close();
    }
}
