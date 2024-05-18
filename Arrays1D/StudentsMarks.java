//Given an array of marks of students, if the marks of any student is less than 35 print its
//roll number. [roll number here refers to index of the array.]


package Arrays1D;

import java.util.Scanner;

public class StudentsMarks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of students:");
        int n = scan.nextInt();
        int[] marks = new int[n];
        for(int i = 0; i<n; ++i){
            marks[i] = scan.nextInt();
        }
        for(int i = 0; i<n; ++i){
            if(marks[i] < 35){
                System.out.print(i + " ");
            }
        }
        scan.close();
    }
}
