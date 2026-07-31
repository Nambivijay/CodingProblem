/**
 * Problem: Rotate String
 * Check if goal can be obtained by rotating s.
 * Time: O(n), Space: O(n)
 */
public class RotateString {
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }
    public static void main(String[] args) {
        RotateString sol = new RotateString();
        System.out.println(sol.rotateString("abcde", "cdeab")); // true
        System.out.println(sol.rotateString("abcde", "abced")); // false
    }
}