package Arrays1D;

import java.util.Arrays;

public class BuildInMethodsArrays {
    public static void main(String[] args) {
        int[] arr = {10, 26, 15, 9, 18};
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //for each loop
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        //Sorting 
        Arrays.sort(arr);
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
