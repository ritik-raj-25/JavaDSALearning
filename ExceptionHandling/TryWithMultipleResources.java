package ExceptionHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TryWithMultipleResources {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        FileWriter out = new FileWriter("file1.txt");
        try(scan; out){
            System.out.print("Enter a sentence: ");
            String str = scan.nextLine();
            out.write(str);
        }
    }
}
