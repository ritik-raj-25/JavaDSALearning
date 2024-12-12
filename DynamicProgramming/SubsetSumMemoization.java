package DynamicProgramming;

import java.util.Arrays;

public class SubsetSumMemoization {
	// 0/1 knapsack
	public static boolean subsetSum(int[] arr, int i, int target, int[][] dp) {
		if(i == arr.length) {
			if(target == 0) return true;
			else return false;
		}
		if(dp[i][target] != -1) return (dp[i][target] == 1);
		boolean pick = false;
		if(target-arr[i] >= 0) pick = subsetSum(arr, i+1, target-arr[i], dp); //pick
		boolean skip = subsetSum(arr, i+1, target, dp); //skip
		boolean ans = pick || skip;
		if(ans) dp[i][target] = 1;
		else dp[i][target] = 0;
		return  ans;
	} 
	public static void main(String[] args) {
		int[] arr = {0, 8, 5, 2, 4};
		int target = 7; 
		int[][] dp = new int[arr.length][target+1];
		for(int i=0; i<arr.length; ++i) {
			Arrays.fill(dp[i], -1);
		}
		System.out.println(subsetSum(arr, 0, target, dp));
	}
}
