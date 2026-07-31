/**
 * Problem: Shortest Palindrome
 * Add characters in front to make the shortest palindrome.
 * Time: O(n), Space: O(n) - KMP-based approach
 */
public class ShortestPalindrome {
    public String shortestPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + rev;
        int[] kmp = new int[combined.length()];
        for (int i = 1; i < combined.length(); i++) {
            int j = kmp[i - 1];
            while (j > 0 && combined.charAt(i) != combined.charAt(j)) j = kmp[j - 1];
            if (combined.charAt(i) == combined.charAt(j)) j++;
            kmp[i] = j;
        }
        return rev.substring(0, s.length() - kmp[combined.length() - 1]) + s;
    }
    public static void main(String[] args) {
        ShortestPalindrome sol = new ShortestPalindrome();
        System.out.println(sol.shortestPalindrome("aacecaaa")); // aaacecaaa
        System.out.println(sol.shortestPalindrome("abcd")); // dcbabcd
    }
}