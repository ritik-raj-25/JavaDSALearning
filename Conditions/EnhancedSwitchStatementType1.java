//Enhanced switch statements(java 12 and later): We can now use switch 
//              statement as an expression means it can now return a  
//              value directly instead of just executing blocks of code. 

package Conditions;

import java.util.Scanner;

public class EnhancedSwitchStatementType1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter day:");
        int day = scan.nextInt();
        scan.close();
        String dayType = switch(day) {
            case 1,2,3,4,5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> throw new IllegalArgumentException("Invalid day: "+day);
        };
        System.out.println("Day type: "+dayType);
    }
}
