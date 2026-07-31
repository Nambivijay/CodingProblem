/**
 * Problem: Wildcard Matching
 * Match string with pattern containing ? and *.
 * Time: O(m*n), Space: O(n)
 */
public class WildcardMatching {
    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int j = 1; j <= n; j++) dp[j] = p.charAt(j-1) == '*' && dp[j-1];
        for (int i = 1; i <= m; i++) {
            boolean prev = dp[0]; dp[0] = false;
            for (int j = 1; j <= n; j++) {
                boolean temp = dp[j];
                if (p.charAt(j-1) == '*') dp[j] = dp[j] || dp[j-1];
                else dp[j] = prev && (p.charAt(j-1) == '?' || s.charAt(i-1) == p.charAt(j-1));
                prev = temp;
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        WildcardMatching sol = new WildcardMatching();
        System.out.println(sol.isMatch("adceb", "*a*b")); // true
        System.out.println(sol.isMatch("cb", "?a")); // false
    }
}