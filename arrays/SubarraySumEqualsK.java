import java.util.HashMap;
import java.util.Map;
/**
 * Problem: Subarray Sum Equals K
 * Find the total number of subarrays whose sum equals k.
 * Time: O(n), Space: O(n)
 */
public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1);
        int sum = 0, count = 0;
        for (int num : nums) {
            sum += num;
            count += prefixCount.getOrDefault(sum - k, 0);
            prefixCount.merge(sum, 1, Integer::sum);
        }
        return count;
    }
    public static void main(String[] args) {
        SubarraySumEqualsK sol = new SubarraySumEqualsK();
        System.out.println(sol.subarraySum(new int[]{1,1,1}, 2)); // 2
        System.out.println(sol.subarraySum(new int[]{1,2,3}, 3)); // 2
    }
}