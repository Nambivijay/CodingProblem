import java.util.*;
/**
 * Problem: Subsets
 * Return all possible subsets (the power set).
 * Time: O(n * 2^n), Space: O(n)
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }
    private void backtrack(int[] nums, int start, List<Integer> path, List<List<Integer>> result) {
        result.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            backtrack(nums, i + 1, path, result);
            path.remove(path.size() - 1);
        }
    }
    public static void main(String[] args) {
        Subsets sol = new Subsets();
        System.out.println(sol.subsets(new int[]{1,2,3}));
    }
}