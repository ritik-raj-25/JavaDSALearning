package Arrays1D;

public class SortZerosOnes {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0};
        int n = arr.length;
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        // Solution (Method - 1)
        int noOfZeros = 0;
        for (int i = 0; i < n; i++) { //Count number of zeros
            if(arr[i] == 0){
                ++noOfZeros;
            }
        }
        for(int i = 0; i<n; ++i){  // Updating the array arr with zeors and ones
            if(i < noOfZeros) arr[i] = 0;
            else arr[i] = 1;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        
        //Solution --> Two Pointers Approach(Method - 2)
        int i = 0;
        int j = n - 1;
        while(i < j){
            if(arr[i] == 0){
                ++i;
            }
            else if(arr[j] == 1){
                --j;
            }
            else if(arr[i] == 1 && arr[j] == 0){
                arr[i] = 0;
                arr[j] = 1;
            }
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
