import java.util.Arrays;
/**
 * Problem: Two Sum II - Input Array Is Sorted
 * Find two numbers that add up to target (1-indexed).
 * Time: O(n), Space: O(1)
 */
public class TwoSumIISorted {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) return new int[]{left + 1, right + 1};
            else if (sum < target) left++;
            else right--;
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        TwoSumIISorted sol = new TwoSumIISorted();
        System.out.println(Arrays.toString(sol.twoSum(new int[]{2,7,11,15}, 9))); // [1,2]
    }
}