import java.util.*;
/**
 * Problem: Pascal's Triangle II
 * Return the rowIndex-th row (0-indexed) using O(rowIndex) space.
 * Time: O(k^2), Space: O(k)
 */
public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = row.size() - 1; j > 0; j--)
                row.set(j, row.get(j) + row.get(j - 1));
            row.add(1);
        }
        return row;
    }
    public static void main(String[] args) {
        PascalsTriangleII sol = new PascalsTriangleII();
        System.out.println(sol.getRow(3)); // [1,3,3,1]
        System.out.println(sol.getRow(4)); // [1,4,6,4,1]
    }
}