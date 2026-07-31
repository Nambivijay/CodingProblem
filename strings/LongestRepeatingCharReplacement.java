/**
 * Problem: Longest Repeating Character Replacement
 * Longest substring with at most k character replacements.
 * Time: O(n), Space: O(1)
 */
public class LongestRepeatingCharReplacement {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxCount = 0, maxLen = 0, left = 0;
        for (int right = 0; right < s.length(); right++) {
            maxCount = Math.max(maxCount, ++count[s.charAt(right) - 'A']);
            while (right - left + 1 - maxCount > k) count[s.charAt(left++) - 'A']--;
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        LongestRepeatingCharReplacement sol = new LongestRepeatingCharReplacement();
        System.out.println(sol.characterReplacement("AABABBA", 1)); // 4
        System.out.println(sol.characterReplacement("ABAB", 2)); // 4
    }
}