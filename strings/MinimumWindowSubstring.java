import java.util.*;
/**
 * Problem: Minimum Window Substring
 * Find the minimum window in s containing all characters of t.
 * Time: O(m+n), Space: O(m+n)
 */
public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        Map<Character, Integer> need = new HashMap<>(), window = new HashMap<>();
        for (char c : t.toCharArray()) need.merge(c, 1, Integer::sum);
        int left = 0, valid = 0, start = 0, minLen = Integer.MAX_VALUE;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            window.merge(c, 1, Integer::sum);
            if (need.containsKey(c) && window.get(c).intValue() == need.get(c).intValue()) valid++;
            while (valid == need.size()) {
                if (right - left + 1 < minLen) { start = left; minLen = right - left + 1; }
                char d = s.charAt(left++);
                if (need.containsKey(d) && window.get(d).intValue() == need.get(d).intValue()) valid--;
                window.merge(d, -1, Integer::sum);
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
    public static void main(String[] args) {
        MinimumWindowSubstring sol = new MinimumWindowSubstring();
        System.out.println(sol.minWindow("ADOBECODEBANC", "ABC")); // BANC
    }
}