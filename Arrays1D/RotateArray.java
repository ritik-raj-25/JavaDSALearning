// Rotate the given array 'a' by k steps, where k is non - negative.
// Note : k can be greater than n as well where n is the size of array 'a'.

package Arrays1D;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int n = arr.length;
        int k = 8;
        k = k % n;

        //Method - 1 (Using extra space)
        int j = 0;
        int[] res = new int[n]; //Extra space
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        //Solution --> Rotate Array
        for(int i = n-k; i<n; ++i){
            res[j++] = arr[i]; 
        }
        for (int i = 0; i < n-k; i++) {  
            res[j++] = arr[i]; 
        }
        for (int ele : res) {
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println();
        
        // Method - 2 (Without using extra space)
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        // Solution --> Rotate Array
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
    public static void reverse(int[] arr, int i, int j){
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            ++i;
            --j;
        }
    }
}
