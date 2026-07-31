/**
 * Problem: Maximum Nesting Depth of the Parentheses
 * Find the maximum nesting depth of parentheses in a VPS.
 * Time: O(n), Space: O(1)
 */
public class MaxNestingDepthParentheses {
    public int maxDepth(String s) {
        int depth = 0, maxDepth = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') maxDepth = Math.max(maxDepth, ++depth);
            else if (c == ')') depth--;
        }
        return maxDepth;
    }
    public static void main(String[] args) {
        MaxNestingDepthParentheses sol = new MaxNestingDepthParentheses();
        System.out.println(sol.maxDepth("(1+(2*3)+((8)/4))+1")); // 3
    }
}