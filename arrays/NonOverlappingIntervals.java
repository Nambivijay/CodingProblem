import java.util.Arrays;
/**
 * Problem: Non-overlapping Intervals
 * Minimum number of intervals to remove to make non-overlapping.
 * Time: O(n log n), Space: O(1)
 */
public class NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int count = 0, prevEnd = Integer.MIN_VALUE;
        for (int[] interval : intervals) {
            if (interval[0] >= prevEnd) prevEnd = interval[1];
            else count++;
        }
        return count;
    }
    public static void main(String[] args) {
        NonOverlappingIntervals sol = new NonOverlappingIntervals();
        System.out.println(sol.eraseOverlapIntervals(new int[][]{{1,2},{2,3},{3,4},{1,3}})); // 1
    }
}