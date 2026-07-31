/**
 * Problem: Product of Array Except Self
 * Given an integer array nums, return an array answer such that answer[i]
 * is equal to the product of all the elements of nums except nums[i].
 * You must solve it without using division and in O(n) time.
 * 
 * Example:
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1) (excluding output array)
 */

import java.util.Arrays;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Calculate prefix products
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Calculate suffix products and multiply with prefix
        int suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        ProductExceptSelf solution = new ProductExceptSelf();

        int[] nums1 = {1, 2, 3, 4};
        System.out.println("Input: [1,2,3,4]");
        System.out.println("Output: " + Arrays.toString(solution.productExceptSelf(nums1)));

        int[] nums2 = {-1, 1, 0, -3, 3};
        System.out.println("\nInput: [-1,1,0,-3,3]");
        System.out.println("Output: " + Arrays.toString(solution.productExceptSelf(nums2)));

        int[] nums3 = {2, 3, 4, 5};
        System.out.println("\nInput: [2,3,4,5]");
        System.out.println("Output: " + Arrays.toString(solution.productExceptSelf(nums3)));
    }
}
