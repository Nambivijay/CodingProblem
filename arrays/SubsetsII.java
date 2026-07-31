import java.util.*;
/**
 * Problem: Subsets II
 * Return all possible subsets without duplicate subsets.
 * Time: O(n * 2^n), Space: O(n)
 */
public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }
    private void backtrack(int[] nums, int start, List<Integer> path, List<List<Integer>> result) {
        result.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;
            path.add(nums[i]);
            backtrack(nums, i + 1, path, result);
            path.remove(path.size() - 1);
        }
    }
    public static void main(String[] args) {
        SubsetsII sol = new SubsetsII();
        System.out.println(sol.subsetsWithDup(new int[]{1,2,2}));
    }
}