package Strings;

import java.util.Scanner;

public class PrintAllSubstring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = scan.nextLine();
        int n = str.length();
        for(int i=0; i<n; ++i){
            for(int j=i+1; j<=n; ++j){
                System.out.print(str.substring(i,j)+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
