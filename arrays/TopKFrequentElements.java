import java.util.*;
/**
 * Problem: Top K Frequent Elements
 * Return the k most frequent elements using bucket sort.
 * Time: O(n), Space: O(n)
 */
public class TopKFrequentElements {
    @SuppressWarnings("unchecked")
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) freq.merge(n, 1, Integer::sum);
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int i = 0; i < buckets.length; i++) buckets[i] = new ArrayList<>();
        for (var entry : freq.entrySet()) buckets[entry.getValue()].add(entry.getKey());
        int[] result = new int[k];
        int idx = 0;
        for (int i = buckets.length - 1; i >= 0 && idx < k; i--)
            for (int num : buckets[i]) { result[idx++] = num; if (idx == k) break; }
        return result;
    }
    public static void main(String[] args) {
        TopKFrequentElements sol = new TopKFrequentElements();
        System.out.println(Arrays.toString(sol.topKFrequent(new int[]{1,1,1,2,2,3}, 2))); // [1,2]
    }
}