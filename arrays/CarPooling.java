/**
 * Problem: Car Pooling
 * Determine if a vehicle can pick up and drop off all passengers.
 * Time: O(n + max_trip), Space: O(max_trip)
 */
public class CarPooling {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] diff = new int[1001];
        for (int[] trip : trips) {
            diff[trip[1]] += trip[0];
            diff[trip[2]] -= trip[0];
        }
        int current = 0;
        for (int d : diff) {
            current += d;
            if (current > capacity) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        CarPooling sol = new CarPooling();
        System.out.println(sol.carPooling(new int[][]{{2,1,5},{3,3,7}}, 4)); // false
        System.out.println(sol.carPooling(new int[][]{{2,1,5},{3,3,7}}, 5)); // true
    }
}