import java.util.*;
/**
 * Problem: Find All Anagrams in a String
 * Find all start indices of p's anagrams in s.
 * Time: O(n), Space: O(1)
 */
public class FindAllAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;
        int[] count = new int[26];
        for (char c : p.toCharArray()) count[c - 'a']++;
        int left = 0, right = 0, toMatch = p.length();
        while (right < s.length()) {
            if (count[s.charAt(right) - 'a']-- > 0) toMatch--;
            right++;
            if (toMatch == 0) result.add(left);
            if (right - left == p.length()) {
                if (count[s.charAt(left) - 'a']++ >= 0) toMatch++;
                left++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        FindAllAnagrams sol = new FindAllAnagrams();
        System.out.println(sol.findAnagrams("cbaebabacd", "abc")); // [0,6]
    }
}