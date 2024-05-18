// Time and Space complexity
// Time Complexity --> O(n^2)
// Space Complexity --> O(n)
// Auxilary Space --> O(1)

// In selection sort relative order of elements may not be maintained, So it is a unstable sort

package BasicSortingAlgorithms;

public class SelectionSort {
    
    public static void print(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; ++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int n = arr.length;
        print(arr);
        //Selection Sort
        for(int i=0; i<n-1; ++i) {
            int minIndx = i;
            for(int j=i+1; j<n; ++j){
                if(arr[j] < arr[minIndx]){
                    minIndx = j;
                }
            }
            //swap arr[i] and arr[minIndx]
            int temp = arr[i];
            arr[i] = arr[minIndx];
            arr[minIndx] = temp;
        }
        print(arr);
    }
}

// Bubble sort                     Selection sort
// 1. can be optimised             1. can not be optimised
// 2. stable sort                  2. unstable sort
// 3. Number of swaps are more:    3. Number of swaps are less:
//    n(n-1)/2[maximum swaps]         (n-1)[confirmed swaps]
// 4. If cost of swaping is someting to consider then selection sort is better,
//    otherwise bubble sort is better. 
// 5. Time Complexity:             4. Time Complexity:
//    Average case- Θ(n^2)            Average case- Θ(n^2)
//    Worse case- O(n^2)              Worse case- O(n^2)
//    Best case- Ω(n)                 Best case- Ω(n^2) 
