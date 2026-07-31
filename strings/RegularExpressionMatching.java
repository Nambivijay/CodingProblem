/**
 * Problem: Regular Expression Matching
 * Match string with pattern containing . and *.
 * Time: O(m*n), Space: O(n)
 */
public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int j = 2; j <= n; j++) if (p.charAt(j-1) == '*') dp[j] = dp[j-2];
        for (int i = 1; i <= m; i++) {
            boolean prev = dp[0]; dp[0] = false;
            for (int j = 1; j <= n; j++) {
                boolean temp = dp[j];
                if (p.charAt(j-1) == '*') {
                    dp[j] = dp[j-2] || (dp[j] && (p.charAt(j-2) == '.' || s.charAt(i-1) == p.charAt(j-2)));
                } else {
                    dp[j] = prev && (p.charAt(j-1) == '.' || s.charAt(i-1) == p.charAt(j-1));
                }
                prev = temp;
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        RegularExpressionMatching sol = new RegularExpressionMatching();
        System.out.println(sol.isMatch("aa", "a*")); // true
        System.out.println(sol.isMatch("ab", ".*")); // true
    }
}