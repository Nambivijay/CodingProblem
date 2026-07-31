/**
 * Problem: Max Area of Island
 * Find the maximum area of an island in a 2D grid.
 * Time: O(m*n), Space: O(m*n) recursion stack
 */
public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++)
                if (grid[i][j] == 1) maxArea = Math.max(maxArea, dfs(grid, i, j));
        return maxArea;
    }
    private int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) return 0;
        grid[i][j] = 0;
        return 1 + dfs(grid, i+1, j) + dfs(grid, i-1, j) + dfs(grid, i, j+1) + dfs(grid, i, j-1);
    }
    public static void main(String[] args) {
        MaxAreaOfIsland sol = new MaxAreaOfIsland();
        int[][] grid = {{0,0,1,0,0},{0,0,0,0,0},{0,1,1,0,0},{0,1,1,0,0}};
        System.out.println(sol.maxAreaOfIsland(grid)); // 5 (including the cluster)
    }
}