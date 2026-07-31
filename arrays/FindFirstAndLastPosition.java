import java.util.Arrays;
/**
 * Problem: Find First and Last Position of Element in Sorted Array
 * Time: O(log n), Space: O(1)
 */
public class FindFirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{findBound(nums, target, true), findBound(nums, target, false)};
    }
    private int findBound(int[] nums, int target, boolean isFirst) {
        int left = 0, right = nums.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) { result = mid; if (isFirst) right = mid - 1; else left = mid + 1; }
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return result;
    }
    public static void main(String[] args) {
        FindFirstAndLastPosition sol = new FindFirstAndLastPosition();
        System.out.println(Arrays.toString(sol.searchRange(new int[]{5,7,7,8,8,10}, 8))); // [3,4]
    }
}