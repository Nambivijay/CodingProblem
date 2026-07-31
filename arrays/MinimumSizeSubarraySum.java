/**
 * Problem: Minimum Size Subarray Sum
 * Find minimal length subarray with sum >= target.
 * Time: O(n), Space: O(1)
 */
public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, sum = 0, minLen = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left++];
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
    public static void main(String[] args) {
        MinimumSizeSubarraySum sol = new MinimumSizeSubarraySum();
        System.out.println(sol.minSubArrayLen(7, new int[]{2,3,1,2,4,3})); // 2
    }
}