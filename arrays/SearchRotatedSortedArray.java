/**
 * Problem: Search in Rotated Sorted Array
 * Search target in a rotated sorted array.
 * Time: O(log n), Space: O(1)
 */
public class SearchRotatedSortedArray {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) right = mid - 1;
                else left = mid + 1;
            } else {
                if (target > nums[mid] && target <= nums[right]) left = mid + 1;
                else right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        SearchRotatedSortedArray sol = new SearchRotatedSortedArray();
        System.out.println(sol.search(new int[]{4,5,6,7,0,1,2}, 0)); // 4
        System.out.println(sol.search(new int[]{4,5,6,7,0,1,2}, 3)); // -1
    }
}