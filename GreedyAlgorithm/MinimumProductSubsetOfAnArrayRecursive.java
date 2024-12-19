package GreedyAlgorithm;

//Recursive Approach
public class MinimumProductSubsetOfAnArrayRecursive {
    private static int minimumProduct(int[] nums, int i, boolean isIncluded, int currProduct) {
        if(i == nums.length) {
            return isIncluded ? currProduct : Integer.MAX_VALUE;
        }
        int pick = minimumProduct(nums, i+1, true, currProduct*nums[i]);
        int skip = minimumProduct(nums, i+1, isIncluded, currProduct);
        return Math.min(pick, skip);
    }
    public static void main(String[] args) {
        int[] nums = {4,-3,-2};
        System.out.println(minimumProduct(nums, 0, false, 1));
    }
}