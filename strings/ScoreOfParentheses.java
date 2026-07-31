import java.util.*;
/**
 * Problem: Score of Parentheses
 * () = 1, (A) = 2*A, AB = A+B
 * Time: O(n), Space: O(n)
 */
public class ScoreOfParentheses {
    public int scoreOfParentheses(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(0);
            else {
                int inner = stack.pop();
                int outer = stack.pop();
                stack.push(outer + Math.max(2 * inner, 1));
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        ScoreOfParentheses sol = new ScoreOfParentheses();
        System.out.println(sol.scoreOfParentheses("(())")); // 2
        System.out.println(sol.scoreOfParentheses("()()")); // 2
        System.out.println(sol.scoreOfParentheses("(()(()))")); // 6
    }
}