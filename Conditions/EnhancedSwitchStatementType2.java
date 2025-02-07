package Conditions;

import java.util.Scanner;

public class EnhancedSwitchStatementType2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter day:");
        int day = scan.nextInt();
        scan.close();
        String dayType = switch(day) {
            case 1,2,3,4,5:
                yield "Weekday"; // The yield keyword is used to return values. No break required with the yield statement.
            case 6, 7:
                yield "Weekend";
            default:
                throw new IllegalArgumentException("Invalid day: "+day);
        };
        System.out.println("Day type: "+dayType);
    }
}
