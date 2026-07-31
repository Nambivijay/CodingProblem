import java.util.HashSet;
import java.util.Set;
/**
 * Problem: Contains Duplicate
 * Given an integer array nums, return true if any value appears at least twice.
 * Time: O(n), Space: O(n)
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        ContainsDuplicate sol = new ContainsDuplicate();
        System.out.println(sol.containsDuplicate(new int[]{1,2,3,1})); // true
        System.out.println(sol.containsDuplicate(new int[]{1,2,3,4})); // false
    }
}