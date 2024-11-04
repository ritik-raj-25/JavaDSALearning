package DynamicProgramming.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class NoOfWaysToConstructSumDiceMemoization {
	public static int countWays(int n, int[] dp) { //TC: O(n)
		if(n == 0) return 1;
		if(dp[n] != -1) return dp[n];
		int cnt = 0;
		for(int i=1; i<=6&&n-i>=0; ++i) {
			cnt += countWays(n-i, dp);
		}
		return dp[n] = cnt;
	}
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scan.nextInt();
		int[] dp = new int[n+1];
		Arrays.fill(dp, -1);
		System.out.println(countWays(n,dp));
		scan.close();
	}
}
