/**
 * Problem: Maximal Square
 * Find the largest square of 1s and return its area.
 * Time: O(m*n), Space: O(n)
 */
public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length, n = matrix[0].length, maxSide = 0;
        int[] dp = new int[n + 1];
        int prev = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 1; j <= n; j++) {
                int temp = dp[j];
                if (matrix[i][j - 1] == '1') {
                    dp[j] = Math.min(Math.min(dp[j], dp[j - 1]), prev) + 1;
                    maxSide = Math.max(maxSide, dp[j]);
                } else dp[j] = 0;
                prev = temp;
            }
        }
        return maxSide * maxSide;
    }
    public static void main(String[] args) {
        MaximalSquare sol = new MaximalSquare();
        char[][] matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(sol.maximalSquare(matrix)); // 4
    }
}