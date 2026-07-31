import java.util.*;
/**
 * Problem: Combination Sum
 * Find all unique combinations that sum to target (can reuse elements).
 * Time: O(n^(t/min)), Space: O(t/min)
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }
    private void backtrack(int[] candidates, int remain, int start, List<Integer> path, List<List<Integer>> result) {
        if (remain == 0) { result.add(new ArrayList<>(path)); return; }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > remain) continue;
            path.add(candidates[i]);
            backtrack(candidates, remain - candidates[i], i, path, result);
            path.remove(path.size() - 1);
        }
    }
    public static void main(String[] args) {
        CombinationSum sol = new CombinationSum();
        System.out.println(sol.combinationSum(new int[]{2,3,6,7}, 7)); // [[2,2,3],[7]]
    }
}