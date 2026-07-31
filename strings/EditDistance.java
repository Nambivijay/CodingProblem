/**
 * Problem: Edit Distance
 * Minimum operations (insert, delete, replace) to convert word1 to word2.
 * Time: O(m*n), Space: O(n)
 */
public class EditDistance {
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int[] dp = new int[n + 1];
        for (int j = 0; j <= n; j++) dp[j] = j;
        for (int i = 1; i <= m; i++) {
            int prev = dp[0]; dp[0] = i;
            for (int j = 1; j <= n; j++) {
                int temp = dp[j];
                if (word1.charAt(i-1) == word2.charAt(j-1)) dp[j] = prev;
                else dp[j] = 1 + Math.min(prev, Math.min(dp[j], dp[j-1]));
                prev = temp;
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        EditDistance sol = new EditDistance();
        System.out.println(sol.minDistance("horse", "ros")); // 3
        System.out.println(sol.minDistance("intention", "execution")); // 5
    }
}