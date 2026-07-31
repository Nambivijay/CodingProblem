/**
 * Problem: Search Insert Position
 * Find index where target would be inserted in sorted array.
 * Time: O(log n), Space: O(1)
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return left;
    }
    public static void main(String[] args) {
        SearchInsertPosition sol = new SearchInsertPosition();
        System.out.println(sol.searchInsert(new int[]{1,3,5,6}, 5)); // 2
        System.out.println(sol.searchInsert(new int[]{1,3,5,6}, 2)); // 1
    }
}