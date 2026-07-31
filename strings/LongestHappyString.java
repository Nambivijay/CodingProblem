import java.util.*;
/**
 * Problem: Longest Happy String
 * Build longest string with a, b, c where no letter appears 3 times consecutively.
 * Time: O(a+b+c), Space: O(1)
 */
public class LongestHappyString {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder sb = new StringBuilder();
        int[][] counts = {{a, 'a'}, {b, 'b'}, {c, 'c'}};
        while (true) {
            Arrays.sort(counts, (x, y) -> y[0] - x[0]);
            boolean added = false;
            for (int[] entry : counts) {
                if (entry[0] == 0) continue;
                int len = sb.length();
                if (len >= 2 && sb.charAt(len-1) == entry[1] && sb.charAt(len-2) == entry[1]) continue;
                sb.append((char) entry[1]);
                entry[0]--;
                added = true;
                break;
            }
            if (!added) break;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        LongestHappyString sol = new LongestHappyString();
        System.out.println(sol.longestDiverseString(1, 1, 7)); // ccbccacc or similar
    }
}