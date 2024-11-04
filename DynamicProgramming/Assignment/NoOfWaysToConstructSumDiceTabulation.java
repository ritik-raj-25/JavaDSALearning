package DynamicProgramming.Assignment;

import java.util.Scanner;

public class NoOfWaysToConstructSumDiceTabulation {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scan.nextInt();
		int[] dp = new int[n+1];
		dp[0] = 1;
		for(int i=1; i<=n; ++i) {
			int cnt = 0;
			for(int j=1; j<=6&&i-j>=0; ++j) {
				cnt += dp[i-j];
			}
			dp[i] = cnt;
		}
		System.out.println(dp[n]);
		scan.close();
	}
}