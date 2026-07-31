import java.util.*;
/**
 * Problem: Permutations
 * Return all possible permutations of distinct integers.
 * Time: O(n!), Space: O(n)
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), new boolean[nums.length], result);
        return result;
    }
    private void backtrack(int[] nums, List<Integer> path, boolean[] used, List<List<Integer>> result) {
        if (path.size() == nums.length) { result.add(new ArrayList<>(path)); return; }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            path.add(nums[i]);
            backtrack(nums, path, used, result);
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
    public static void main(String[] args) {
        Permutations sol = new Permutations();
        System.out.println(sol.permute(new int[]{1,2,3}));
    }
}