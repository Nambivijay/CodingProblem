import java.util.*;
/**
 * Problem: Longest Valid Parentheses
 * Find the length of the longest valid parentheses substring.
 * Time: O(n), Space: O(n)
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(-1);
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') stack.push(i);
            else {
                stack.pop();
                if (stack.isEmpty()) stack.push(i);
                else maxLen = Math.max(maxLen, i - stack.peek());
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        LongestValidParentheses sol = new LongestValidParentheses();
        System.out.println(sol.longestValidParentheses("(()")); // 2
        System.out.println(sol.longestValidParentheses(")()())")); // 4
    }
}