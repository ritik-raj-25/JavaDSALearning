package Conditions;

import java.util.Scanner;

public class GradeOfStudents {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the marks:");
        int marks = scan.nextInt();
        if(marks>=81){
            System.out.println("Very Good");
        }
        else if(marks>=61) {
            System.out.println("Good");
        }
        else if(marks>=41){
            System.out.println("Average");
        }
        else{
            System.out.println("Fail");
        }
    }
}
