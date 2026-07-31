/**
 * Problem: Find Minimum in Rotated Sorted Array
 * Find the minimum element in a rotated sorted array.
 * Time: O(log n), Space: O(1)
 */
public class FindMinRotatedSortedArray {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) left = mid + 1;
            else right = mid;
        }
        return nums[left];
    }
    public static void main(String[] args) {
        FindMinRotatedSortedArray sol = new FindMinRotatedSortedArray();
        System.out.println(sol.findMin(new int[]{3,4,5,1,2})); // 1
        System.out.println(sol.findMin(new int[]{4,5,6,7,0,1,2})); // 0
    }
}