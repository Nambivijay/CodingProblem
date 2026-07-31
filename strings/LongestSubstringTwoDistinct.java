import java.util.*;
/**
 * Problem: Longest Substring with At Most Two Distinct Characters
 * Time: O(n), Space: O(1)
 */
public class LongestSubstringTwoDistinct {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            map.put(s.charAt(right), right);
            while (map.size() > 2) {
                int minIdx = Collections.min(map.values());
                map.remove(s.charAt(minIdx));
                left = minIdx + 1;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        LongestSubstringTwoDistinct sol = new LongestSubstringTwoDistinct();
        System.out.println(sol.lengthOfLongestSubstringTwoDistinct("eceba")); // 3
        System.out.println(sol.lengthOfLongestSubstringTwoDistinct("ccaabbb")); // 5
    }
}