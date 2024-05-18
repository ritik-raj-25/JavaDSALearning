// Q. Given an array with N distinct elements, convert the given array to a form
// where all elements are in the range from 0 to N-1. The order of elements
// is the same,i.e, 0 is placed in the place of the smallest element, 1 is 
// placed for second smallest element, ... N-1 is placed for the largest element.


package BasicSortingAlgorithms;

public class Question8 {
    public static void main(String[] args) {
        int[] a = {54,11,28,47,91,63};
        int n = a.length;
        // int[] ans = new int[n];
        // for(int i=0; i<n; ++i){
        //     int k = n-1;
        //     for(int j=0; j<n; ++j){
        //         if(a[j]>a[i]){
        //             --k;
        //         }
        //     }
        //     ans[i] = k;
        // }
        // for (int ele : ans) {
        //     System.out.print(ele+" ");
        // }

        // Question 8 solution with using extra space, provided each element of the given array is > 0.
        int x = 0;
        for(int i=0; i<n; ++i){
            int min = Integer.MAX_VALUE;
            int minIndx = -1;
            for(int j=0; j<n; ++j){
                if(min>a[j] && a[j]>0){
                    min = a[j];
                    minIndx = j;
                }
            }
            a[minIndx] = x;
            --x;
        }
        for (int i=0; i<n; ++i) {
            a[i] *=  -1;
            System.out.print(a[i]+" ");
        }
    }
}