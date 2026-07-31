/**
 * Problem: Game of Life
 * Compute next state of Conway's Game of Life in-place.
 * Time: O(m*n), Space: O(1)
 */
public class GameOfLife {
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;
        int[] dx = {-1,-1,-1,0,0,1,1,1}, dy = {-1,0,1,-1,1,-1,0,1};
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int live = 0;
                for (int k = 0; k < 8; k++) {
                    int ni = i + dx[k], nj = j + dy[k];
                    if (ni >= 0 && ni < m && nj >= 0 && nj < n && (board[ni][nj] & 1) == 1) live++;
                }
                if ((board[i][j] & 1) == 1 && (live == 2 || live == 3)) board[i][j] |= 2;
                if ((board[i][j] & 1) == 0 && live == 3) board[i][j] |= 2;
            }
        }
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) board[i][j] >>= 1;
    }
    public static void main(String[] args) {
        GameOfLife sol = new GameOfLife();
        int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        sol.gameOfLife(board);
        for (int[] row : board) System.out.println(java.util.Arrays.toString(row));
    }
}