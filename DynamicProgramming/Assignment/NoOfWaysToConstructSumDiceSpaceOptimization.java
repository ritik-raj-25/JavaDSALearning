package DynamicProgramming.Assignment;

import java.util.Scanner;

public class NoOfWaysToConstructSumDiceSpaceOptimization {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scan.nextInt();
		int[] dp = new int[7];
		dp[0] = 1;
		for(int i=1; i<=n; ++i) {
			int cnt = 0;
			for(int j=1; j<=6&&i-j>=0; ++j) {
				cnt += dp[(i-j)%7];
			}
			dp[i%7] = cnt;
		}
		System.out.println(dp[n%7]);
		scan.close();
	}
}
