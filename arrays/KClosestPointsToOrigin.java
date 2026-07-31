import java.util.*;
/**
 * Problem: K Closest Points to Origin
 * Return k closest points to origin (0,0).
 * Time: O(n log k), Space: O(k)
 */
public class KClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1]));
        for (int[] p : points) {
            maxHeap.offer(p);
            if (maxHeap.size() > k) maxHeap.poll();
        }
        return maxHeap.toArray(new int[0][]);
    }
    public static void main(String[] args) {
        KClosestPointsToOrigin sol = new KClosestPointsToOrigin();
        int[][] result = sol.kClosest(new int[][]{{1,3},{-2,2}}, 1);
        for (int[] p : result) System.out.println(Arrays.toString(p)); // [-2,2]
    }
}