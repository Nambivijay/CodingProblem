import java.util.*;
/**
 * Problem: Insert Interval
 * Insert a new interval into a sorted list of non-overlapping intervals.
 * Time: O(n), Space: O(n)
 */
public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0;
        while (i < intervals.length && intervals[i][1] < newInterval[0])
            result.add(intervals[i++]);
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval);
        while (i < intervals.length) result.add(intervals[i++]);
        return result.toArray(new int[0][]);
    }
    public static void main(String[] args) {
        InsertInterval sol = new InsertInterval();
        int[][] result = sol.insert(new int[][]{{1,3},{6,9}}, new int[]{2,5});
        for (int[] r : result) System.out.println(Arrays.toString(r));
    }
}