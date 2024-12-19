package GreedyAlgorithm;

import java.util.Scanner;

public class MinimumProductSubsetOfAnArrayGreedy {
    private static int minimumProduct(int[] nums) {
        int n = nums.length;
        int negMax = Integer.MIN_VALUE;
        int positiveMin = Integer.MAX_VALUE;
        int negCnt = 0;
        int ans = 1;
        for(int i=0; i<n; ++i) {
            if(nums[i] != 0) ans *= nums[i];
            if(nums[i] < 0) {
                negMax = Math.max(negMax, nums[i]);
                ++negCnt;
            }
            else positiveMin = Math.min(positiveMin, nums[i]);
        }
        if(negCnt == 0) ans = positiveMin;
        else if(negCnt%2 == 0) {
            ans /= negMax;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scan.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter elements: ");
        for(int i=0; i<n; ++i) {
            nums[i] = scan.nextInt();
        }
        System.out.println(minimumProduct(nums));
        scan.close();
    }
}
