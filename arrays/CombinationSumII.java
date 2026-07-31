import java.util.*;
/**
 * Problem: Combination Sum II
 * Find unique combinations that sum to target (each number used once).
 * Time: O(2^n), Space: O(n)
 */
public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }
    private void backtrack(int[] candidates, int remain, int start, List<Integer> path, List<List<Integer>> result) {
        if (remain == 0) { result.add(new ArrayList<>(path)); return; }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > remain) break;
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            path.add(candidates[i]);
            backtrack(candidates, remain - candidates[i], i + 1, path, result);
            path.remove(path.size() - 1);
        }
    }
    public static void main(String[] args) {
        CombinationSumII sol = new CombinationSumII();
        System.out.println(sol.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8));
    }
}