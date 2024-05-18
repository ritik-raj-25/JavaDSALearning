package Arrays1D;

public class BasicSyntax {
    public static void main(String[] args){
        //Declaring Array and Memory Allocations
        // --> int[] arr;  --> Declaration
        // --> arr = new int[5]; --> Memory allocation
        int[] arr = new int[5];
        // Initializing individual elements
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50; 
        //Output of array elements
        System.out.print(arr[0] + " ");
        System.out.print(arr[1] + " ");
        System.out.print(arr[2] + " ");
        System.out.print(arr[3] + " ");
        System.out.print(arr[4] + " ");
    }
}