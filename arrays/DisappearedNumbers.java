import java.util.*;
/**
 * Problem: Find All Numbers Disappeared in an Array
 * Find all numbers in [1,n] that do not appear in the array.
 * Time: O(n), Space: O(1) excluding output
 */
public class DisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;
            if (nums[idx] > 0) nums[idx] = -nums[idx];
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) result.add(i + 1);
        }
        return result;
    }
    public static void main(String[] args) {
        DisappearedNumbers sol = new DisappearedNumbers();
        System.out.println(sol.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1})); // [5,6]
    }
}