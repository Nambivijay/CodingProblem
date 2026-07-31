/**
 * Problem: Find Peak Element
 * Find element that is strictly greater than its neighbors.
 * Time: O(log n), Space: O(1)
 */
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) right = mid;
            else left = mid + 1;
        }
        return left;
    }
    public static void main(String[] args) {
        FindPeakElement sol = new FindPeakElement();
        System.out.println(sol.findPeakElement(new int[]{1,2,3,1})); // 2
        System.out.println(sol.findPeakElement(new int[]{1,2,1,3,5,6,4})); // 5
    }
}