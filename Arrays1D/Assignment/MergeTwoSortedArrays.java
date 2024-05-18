package Arrays1D.Assignment;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {11, 33, 42, 71};
        int[] b = {26, 54, 69, 81};
        int n = a.length;
        int m = b.length;
        int[] c = new int[m+n];
        int i = 0, j = 0, k = 0;
        while(i<n && j<m){  // Merging
            if(a[i] <= b[j]){
                c[k++] = a[i++];
            }
            else{
                c[k++] = b[j++];
            }
        }
        while(i < n){  // for remaining elements of a (if any)
            c[k++] = a[i++];
        } 
        while(j < m){  // for remaining elements of b (if any)
            c[k++] = b[j++];
        }
        for (int ele : c) {
            System.out.print(ele + " ");
        }
    }
}
