package Arrays1D;

public class NextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {12, 8, 60, 37, 2, 49, 16, 28, 21};
        int n = arr.length;
        int[] ans = new int[n];
        // Method - 1 (Brute Force)
        for (int i = 0; i < n; i++) {
            int nxtmx = Integer.MIN_VALUE;
            for(int j = i+1; j<n; ++j){
                nxtmx = Math.max(nxtmx, arr[j]);
            }
            ans[i] = nxtmx;
        }
        ans[n-1] = -1;
        for (int ele : ans) {
            System.out.print(ele + " ");
        }
        System.out.println();

        // Method - 2 (Optimised)
        ans[n-1] = -1;
        int nge = arr[n-1];
        for(int i = n-2; i>=0; --i){
            ans[i] = nge;
            nge = Math.max(nge, arr[i]);
        }
        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }
}