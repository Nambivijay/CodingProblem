/**
 * Problem: Set Matrix Zeroes
 * If an element is 0, set its entire row and column to 0.
 * Time: O(m*n), Space: O(1)
 */
public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        boolean firstRow = false, firstCol = false;
        int m = matrix.length, n = matrix[0].length;
        for (int i = 0; i < m; i++) if (matrix[i][0] == 0) firstCol = true;
        for (int j = 0; j < n; j++) if (matrix[0][j] == 0) firstRow = true;
        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                if (matrix[i][j] == 0) { matrix[i][0] = 0; matrix[0][j] = 0; }
        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                if (matrix[i][0] == 0 || matrix[0][j] == 0) matrix[i][j] = 0;
        if (firstRow) for (int j = 0; j < n; j++) matrix[0][j] = 0;
        if (firstCol) for (int i = 0; i < m; i++) matrix[i][0] = 0;
    }
    public static void main(String[] args) {
        SetMatrixZeroes sol = new SetMatrixZeroes();
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        sol.setZeroes(matrix);
        for (int[] row : matrix) System.out.println(java.util.Arrays.toString(row));
    }
}