// Time and Space complexity
// Time Complexity --> O(n^2)
// Space Complexity --> O(n)
// Auxilary Space --> O(1)

// In bubble sort relative order of elements are maintained, So it is a stable sort


package BasicSortingAlgorithms;

public class BubbleSort {

    public static void print(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; ++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 2, 3};
        int n = arr.length;
        print(arr);
        // //Bubble Sort
        // for(int i=0; i<n-1; ++i){
        //     for(int j=0; j<n-1; ++j){
        //         if(arr[j] > arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        // print(arr);

        // //Optimised Bubble Sort
        // for(int i=0; i<n-1; ++i){
        //     for(int j=0; j<n-1-i; ++j){
        //         if(arr[j] > arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        // print(arr);

        //More Optimised Bubble Sort
        for(int i=0; i<n-1; ++i){
            boolean flag = true; //true means sorted
            for(int j=0; j<n-1-i; ++j){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false; //flase means unsorted
                }
            }
            if(flag == true) break;
        }
        print(arr);
    }
}