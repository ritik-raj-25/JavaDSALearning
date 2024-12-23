package DynamicProgramming;

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        StringBuilder lcs = new StringBuilder();
        int[][] dp = new int[m+1][n+1];
        for(int i=1; i<=m; ++i) {
            for(int j=1; j<=n; ++j) {
                if(text1.charAt(i-1) == text2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        int i = m;
        int j = n;
        while(i>0 && j>0) {
            if(text1.charAt(i-1) == text2.charAt(j-1)) {
                lcs.append(text1.charAt(i-1));
                --i;
                --j;
            }
            else if(dp[i][j-1] >= dp[i-1][j]) {
                --j;
            }
            else {
                --i;
            }
        }
        System.out.println("LCS: "+lcs.reverse());
        return dp[m][n];
    }
}

public class PrintLongestCommonSubsequence {
	public static void main(String[] args) {
		String text1 = "abcde";
		String text2 = "ace";
		Solution sol = new Solution();
		int lcsLength = sol.longestCommonSubsequence(text1, text2);
		System.out.println("LCS Length: "+lcsLength);
	}
}
