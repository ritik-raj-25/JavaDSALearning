package Arrays1D;

public class InitializeArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};  //Initializing array
        int n = arr.length; //length --> It is an operator to evaluate the size of an array.
        //Output
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
