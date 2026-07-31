/**
 * Problem: Rotate Image
 * Rotate n x n matrix by 90 degrees clockwise in-place.
 * Time: O(n^2), Space: O(1)
 */
public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // Transpose
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j]; matrix[i][j] = matrix[j][i]; matrix[j][i] = temp;
            }
        // Reverse each row
        for (int i = 0; i < n; i++)
            for (int l = 0, r = n - 1; l < r; l++, r--) {
                int temp = matrix[i][l]; matrix[i][l] = matrix[i][r]; matrix[i][r] = temp;
            }
    }
    public static void main(String[] args) {
        RotateImage sol = new RotateImage();
        int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
        sol.rotate(m);
        for (int[] row : m) System.out.println(java.util.Arrays.toString(row));
    }
}