/**
 * Problem: Unique Paths II
 * Count paths with obstacles (1 = obstacle, 0 = empty).
 * Time: O(m*n), Space: O(n)
 */
public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid[0].length;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int[] row : obstacleGrid) {
            for (int j = 0; j < n; j++) {
                if (row[j] == 1) dp[j] = 0;
                else if (j > 0) dp[j] += dp[j - 1];
            }
        }
        return dp[n - 1];
    }
    public static void main(String[] args) {
        UniquePathsII sol = new UniquePathsII();
        System.out.println(sol.uniquePathsWithObstacles(new int[][]{{0,0,0},{0,1,0},{0,0,0}})); // 2
    }
}