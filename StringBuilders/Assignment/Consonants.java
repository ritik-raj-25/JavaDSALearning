package StringBuilders.Assignment;

import java.util.Scanner;

public class Consonants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string:");
        StringBuilder sb = new StringBuilder(scan.nextLine());
        int cnt = 0;
        for(int i=0; i<sb.length(); ++i){
            if(!isVowel(sb.charAt(i))){
                ++cnt;
            }
        }
        System.out.println("Number of consonants:"+cnt);
        scan.close();
    }
    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }
}
