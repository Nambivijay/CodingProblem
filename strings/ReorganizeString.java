import java.util.*;
/**
 * Problem: Reorganize String
 * Rearrange so no two adjacent characters are the same.
 * Time: O(n log n), Space: O(n)
 */
public class ReorganizeString {
    public String reorganizeString(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) count[c - 'a']++;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (int i = 0; i < 26; i++) if (count[i] > 0) pq.offer(new int[]{i, count[i]});
        StringBuilder sb = new StringBuilder();
        while (pq.size() >= 2) {
            int[] first = pq.poll(), second = pq.poll();
            sb.append((char)('a' + first[0]));
            sb.append((char)('a' + second[0]));
            if (--first[1] > 0) pq.offer(first);
            if (--second[1] > 0) pq.offer(second);
        }
        if (!pq.isEmpty()) {
            int[] last = pq.poll();
            if (last[1] > 1) return "";
            sb.append((char)('a' + last[0]));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        ReorganizeString sol = new ReorganizeString();
        System.out.println(sol.reorganizeString("aab")); // aba
        System.out.println(sol.reorganizeString("aaab")); // ""
    }
}