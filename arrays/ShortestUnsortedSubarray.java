/**
 * Problem: Shortest Unsorted Continuous Subarray
 * Find the shortest subarray that needs sorting to sort the whole array.
 * Time: O(n), Space: O(1)
 */
public class ShortestUnsortedSubarray {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) if (nums[i] < nums[i - 1]) min = Math.min(min, nums[i]);
        for (int i = n - 2; i >= 0; i--) if (nums[i] > nums[i + 1]) max = Math.max(max, nums[i]);
        int left = 0, right = n - 1;
        for (; left < n; left++) if (nums[left] > min) break;
        for (; right >= 0; right--) if (nums[right] < max) break;
        return right - left < 0 ? 0 : right - left + 1;
    }
    public static void main(String[] args) {
        ShortestUnsortedSubarray sol = new ShortestUnsortedSubarray();
        System.out.println(sol.findUnsortedSubarray(new int[]{2,6,4,8,10,9,15})); // 5
    }
}