/**
 * Problem: Maximum Product Subarray
 * Find contiguous subarray with largest product.
 * Time: O(n), Space: O(1)
 */
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int maxProd = nums[0], minProd = nums[0], result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) { int temp = maxProd; maxProd = minProd; minProd = temp; }
            maxProd = Math.max(nums[i], maxProd * nums[i]);
            minProd = Math.min(nums[i], minProd * nums[i]);
            result = Math.max(result, maxProd);
        }
        return result;
    }
    public static void main(String[] args) {
        MaximumProductSubarray sol = new MaximumProductSubarray();
        System.out.println(sol.maxProduct(new int[]{2,3,-2,4})); // 6
        System.out.println(sol.maxProduct(new int[]{-2,0,-1})); // 0
    }
}