/**
 * Problem: Remove All Adjacent Duplicates In String
 * Repeatedly remove adjacent duplicates until no more exist.
 * Time: O(n), Space: O(n)
 */
public class RemoveAdjacentDuplicates {
    public String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (stack.length() > 0 && stack.charAt(stack.length() - 1) == c)
                stack.deleteCharAt(stack.length() - 1);
            else stack.append(c);
        }
        return stack.toString();
    }
    public static void main(String[] args) {
        RemoveAdjacentDuplicates sol = new RemoveAdjacentDuplicates();
        System.out.println(sol.removeDuplicates("abbaca")); // ca
    }
}