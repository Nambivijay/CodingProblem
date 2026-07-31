import java.util.*;
/**
 * Problem: Remove All Adjacent Duplicates in String II
 * Remove k adjacent duplicates repeatedly.
 * Time: O(n), Space: O(n)
 */
public class RemoveAdjacentDuplicatesII {
    public String removeDuplicates(String s, int k) {
        Deque<int[]> stack = new ArrayDeque<>(); // [char, count]
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek()[0] == c) {
                stack.peek()[1]++;
                if (stack.peek()[1] == k) stack.pop();
            } else stack.push(new int[]{c, 1});
        }
        StringBuilder sb = new StringBuilder();
        for (int[] entry : stack)
            for (int i = 0; i < entry[1]; i++) sb.insert(0, (char) entry[0]);
        return sb.toString();
    }
    public static void main(String[] args) {
        RemoveAdjacentDuplicatesII sol = new RemoveAdjacentDuplicatesII();
        System.out.println(sol.removeDuplicates("deeedbbcccbdaa", 3)); // aa
    }
}