import java.util.*;
/**
 * Problem: Pascal's Triangle
 * Generate first numRows of Pascal's triangle.
 * Time: O(n^2), Space: O(n^2)
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) row.add(1);
                else row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
            }
            triangle.add(row);
        }
        return triangle;
    }
    public static void main(String[] args) {
        PascalsTriangle sol = new PascalsTriangle();
        System.out.println(sol.generate(5));
    }
}