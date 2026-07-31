import java.util.*;
/**
 * Problem: Simplify Path
 * Simplify an absolute Unix-style file path.
 * Time: O(n), Space: O(n)
 */
public class SimplifyPath {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        for (String part : path.split("/")) {
            if (part.equals("..")) { if (!stack.isEmpty()) stack.pop(); }
            else if (!part.isEmpty() && !part.equals(".")) stack.push(part);
        }
        StringBuilder sb = new StringBuilder();
        for (String dir : stack) sb.insert(0, "/" + dir);
        return sb.length() == 0 ? "/" : sb.toString();
    }
    public static void main(String[] args) {
        SimplifyPath sol = new SimplifyPath();
        System.out.println(sol.simplifyPath("/home/")); // /home
        System.out.println(sol.simplifyPath("/../")); // /
        System.out.println(sol.simplifyPath("/home//foo/")); // /home/foo
    }
}