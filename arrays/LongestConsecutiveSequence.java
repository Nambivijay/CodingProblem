import java.util.HashSet;
import java.util.Set;
/**
 * Problem: Longest Consecutive Sequence
 * Find length of longest consecutive elements sequence in O(n).
 * Time: O(n), Space: O(n)
 */
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        int longest = 0;
        for (int n : set) {
            if (!set.contains(n - 1)) {
                int length = 1;
                while (set.contains(n + length)) length++;
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        LongestConsecutiveSequence sol = new LongestConsecutiveSequence();
        System.out.println(sol.longestConsecutive(new int[]{100,4,200,1,3,2})); // 4
    }
}