package DynamicProgramming;

public class SubsetSumRecursion {
	// 0/1 knapsack
	public static boolean subsetSum(int[] arr, int i, int target) {
		if(i == arr.length) {
			if(target == 0) return true;
			else return false;
		}
		return subsetSum(arr, i+1, target-arr[i]) || subsetSum(arr, i+1, target); //pick || skip
	} 
	public static void main(String[] args) {
		int[] arr = {0, 8, 5, 2, 4};
		int target = 11;
		System.out.println(subsetSum(arr, 0, target));
	}
}
