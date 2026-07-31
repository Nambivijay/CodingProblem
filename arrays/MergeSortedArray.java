/**
 * Problem: Merge Sorted Array
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 * and two integers m and n, representing the number of elements in nums1 and nums2.
 * Merge nums2 into nums1 as one sorted array.
 * 
 * Example:
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * 
 * Time Complexity: O(m + n)
 * Space Complexity: O(1)
 */

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }

    public static void main(String[] args) {
        MergeSortedArray solution = new MergeSortedArray();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        solution.merge(nums1, 3, nums2, 3);
        System.out.println("Input: nums1 = [1,2,3,0,0,0], nums2 = [2,5,6]");
        System.out.println("Merged: " + Arrays.toString(nums1));

        int[] nums3 = {1};
        int[] nums4 = {};
        solution.merge(nums3, 1, nums4, 0);
        System.out.println("\nInput: nums1 = [1], nums2 = []");
        System.out.println("Merged: " + Arrays.toString(nums3));

        int[] nums5 = {0};
        int[] nums6 = {1};
        solution.merge(nums5, 0, nums6, 1);
        System.out.println("\nInput: nums1 = [0], nums2 = [1]");
        System.out.println("Merged: " + Arrays.toString(nums5));
    }
}
