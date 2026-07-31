import java.util.*;
/**
 * Problem: Buddy Strings
 * Check if you can swap two letters in s to make it equal to goal.
 * Time: O(n), Space: O(1)
 */
public class BuddyStrings {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        if (s.equals(goal)) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) if (++count[c - 'a'] > 1) return true;
            return false;
        }
        List<Integer> diffs = new ArrayList<>();
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) != goal.charAt(i)) diffs.add(i);
        return diffs.size() == 2 && s.charAt(diffs.get(0)) == goal.charAt(diffs.get(1))
            && s.charAt(diffs.get(1)) == goal.charAt(diffs.get(0));
    }
    public static void main(String[] args) {
        BuddyStrings sol = new BuddyStrings();
        System.out.println(sol.buddyStrings("ab", "ba")); // true
        System.out.println(sol.buddyStrings("ab", "ab")); // false
        System.out.println(sol.buddyStrings("aa", "aa")); // true
    }
}