package DynamicProgramming.Assignment;
 
import java.util.Scanner;
 
public class NoOfWaysToConstructSumDiceRecursive {
	public static int countWays(int n) { //TC: O(6^n)
		if(n == 0) return 1;
		int cnt = 0;
		for(int i=1; i<=6&&n-i>=0; ++i) {
			cnt += countWays(n-i);
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scan.nextInt();
		System.out.println(countWays(n));
		scan.close();
	}
}
