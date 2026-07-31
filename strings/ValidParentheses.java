import java.util.*;
/**
 * Problem: Valid Parentheses
 * Determine if input string of brackets is valid.
 * Time: O(n), Space: O(n)
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        ValidParentheses sol = new ValidParentheses();
        System.out.println(sol.isValid("()[]{}")); // true
        System.out.println(sol.isValid("(]")); // false
    }
}