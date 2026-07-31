/**
 * Problem: Longest Palindromic Subsequence
 * Find the longest palindromic subsequence length.
 * Time: O(n^2), Space: O(n)
 */
public class LongestPalindromicSubsequence {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[] dp = new int[n];
        java.util.Arrays.fill(dp, 1);
        for (int i = n - 2; i >= 0; i--) {
            int prev = 0;
            for (int j = i + 1; j < n; j++) {
                int temp = dp[j];
                if (s.charAt(i) == s.charAt(j)) dp[j] = prev + 2;
                else dp[j] = Math.max(dp[j], dp[j - 1]);
                prev = temp;
            }
        }
        return dp[n - 1];
    }
    public static void main(String[] args) {
        LongestPalindromicSubsequence sol = new LongestPalindromicSubsequence();
        System.out.println(sol.longestPalindromeSubseq("bbbab")); // 4
        System.out.println(sol.longestPalindromeSubseq("cbbd")); // 2
    }
}