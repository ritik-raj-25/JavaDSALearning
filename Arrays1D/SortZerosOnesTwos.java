package Arrays1D;

public class SortZerosOnesTwos {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2, 1, 2, 0, 0};
        int n = arr.length;
        // //Method - 1 (Two pass solution)
        // int noOfZeros = 0;
        // int noOfOnes = 0;
        // for (int i = 0; i < n; i++) {  // Count zeros and ones
        //     if(arr[i] == 0) ++noOfZeros;
        //     if(arr[i] == 1) ++noOfOnes;
        // }
        // for (int i = 0; i < n; i++) {  // Updating the array with 0, 1, and 2.
        //     if(i < noOfZeros) arr[i] = 0;
        //     else if(i < noOfOnes+noOfZeros) arr[i] = 1;
        //     else arr[i] = 2;
        // }
        // for (int ele : arr) {
        //     System.out.print(ele + " ");
        // }

        // Method - 2 --> Dutch Flag Algorithm (One pass Solution) 
        int lo = 0;
        int mid = 0;
        int hi = n-1;
        while(mid <= hi){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[lo];
                arr[lo] = temp;
                ++mid;
                ++lo; 
            }
            else if(arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                --hi;
            }
            else{
                mid++;
            }
        }
        for(int i = 0; i<n; ++i){
            System.out.print(arr[i] + " ");
        }
    }
}
