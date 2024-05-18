package StringBuilders;

import java.util.Scanner;

public class UpdateAllEvenPostion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string:");
        String s = scan.nextLine();
        String temp = "";
        for(int i=0; i<s.length(); ++i) {
            if(i%2 == 0) {
                temp += 'a';
            }
            else {
                temp += s.charAt(i);
            }
        }
        s = temp;
        System.out.println("Updated String:"+temp);
        scan.close();
    }
}
