// Time and Space complexity
// Time Complexity (Worst case) --> O(n^2)
// Time Complexity (Average case) --> Θ(n^2)
// Time Complexity (Best case) --> Ω(n)
// Space Complexity --> O(n)
// Auxilary Space --> O(1)

// In insertion sort relative order of elements are maintained, So it is a stable sort

package BasicSortingAlgorithms;

public class InsertionSort {
    
    public static void print(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; ++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {3,5,1,4,2};
        int n = arr.length;
        print(arr);
        // Insertion Sort
        for(int i=1; i<n; ++i){
            for(int j=i-1; j>=0; --j){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                else break;
            }
        }
        print(arr);
    }
}
