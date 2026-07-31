import java.util.*;
/**
 * Problem: Minimum Remove to Make Valid Parentheses
 * Remove minimum parentheses to make the string valid.
 * Time: O(n), Space: O(n)
 */
public class MinimumRemoveValidParentheses {
    public String minRemoveToMakeValid(String s) {
        Set<Integer> toRemove = new HashSet<>();
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') stack.push(i);
            else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) toRemove.add(i);
                else stack.pop();
            }
        }
        while (!stack.isEmpty()) toRemove.add(stack.pop());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
            if (!toRemove.contains(i)) sb.append(s.charAt(i));
        return sb.toString();
    }
    public static void main(String[] args) {
        MinimumRemoveValidParentheses sol = new MinimumRemoveValidParentheses();
        System.out.println(sol.minRemoveToMakeValid("lee(t(c)o)de)")); // lee(t(c)o)de
        System.out.println(sol.minRemoveToMakeValid("))((")); // ""
    }
}