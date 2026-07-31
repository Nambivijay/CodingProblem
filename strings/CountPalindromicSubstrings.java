/**
 * Problem: Palindromic Substrings
 * Count the number of palindromic substrings.
 * Time: O(n^2), Space: O(1)
 */
public class CountPalindromicSubstrings {
    public int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += expand(s, i, i);
            count += expand(s, i, i + 1);
        }
        return count;
    }
    private int expand(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++; left--; right++;
        }
        return count;
    }
    public static void main(String[] args) {
        CountPalindromicSubstrings sol = new CountPalindromicSubstrings();
        System.out.println(sol.countSubstrings("abc")); // 3
        System.out.println(sol.countSubstrings("aaa")); // 6
    }
}