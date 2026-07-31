import java.util.*;
/**
 * Problem: Longest Substring with At Most K Distinct Characters
 * Time: O(n), Space: O(k)
 */
public class LongestSubstringKDistinct {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            map.merge(s.charAt(right), 1, Integer::sum);
            while (map.size() > k) {
                char c = s.charAt(left);
                map.merge(c, -1, Integer::sum);
                if (map.get(c) == 0) map.remove(c);
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        LongestSubstringKDistinct sol = new LongestSubstringKDistinct();
        System.out.println(sol.lengthOfLongestSubstringKDistinct("eceba", 2)); // 3
        System.out.println(sol.lengthOfLongestSubstringKDistinct("aa", 1)); // 2
    }
}