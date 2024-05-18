package Recursion;

import java.util.Scanner;

public class BinaryStringWithoutConsecutiveOnes {
    public static void generateBinaryString(int n,String ans){
        if(ans.length()==n){
            System.out.println(ans);
            return;
        }
        generateBinaryString(n, ans+"0");
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='1') generateBinaryString(n, ans+"1");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        generateBinaryString(n,"");
        scan.close();
    }
}
