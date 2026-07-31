/**
 * Problem: Maximum Subarray (Kadane's Algorithm)
 * Given an integer array nums, find the subarray with the
 * largest sum, and return its sum.
 * 
 * Example:
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        MaximumSubarray solution = new MaximumSubarray();

        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Input: [-2,1,-3,4,-1,2,1,-5,4]");
        System.out.println("Maximum Subarray Sum: " + solution.maxSubArray(nums1));

        int[] nums2 = {1};
        System.out.println("\nInput: [1]");
        System.out.println("Maximum Subarray Sum: " + solution.maxSubArray(nums2));

        int[] nums3 = {5, 4, -1, 7, 8};
        System.out.println("\nInput: [5,4,-1,7,8]");
        System.out.println("Maximum Subarray Sum: " + solution.maxSubArray(nums3));
    }
}
