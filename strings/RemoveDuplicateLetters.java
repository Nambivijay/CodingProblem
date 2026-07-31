/**
 * Problem: Remove Duplicate Letters
 * Remove duplicates so result is smallest lexicographic order.
 * Time: O(n), Space: O(1)
 */
public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        int[] lastIdx = new int[26];
        boolean[] inStack = new boolean[26];
        for (int i = 0; i < s.length(); i++) lastIdx[s.charAt(i) - 'a'] = i;
        StringBuilder stack = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            if (inStack[c]) continue;
            while (stack.length() > 0 && stack.charAt(stack.length()-1) > s.charAt(i)
                && lastIdx[stack.charAt(stack.length()-1) - 'a'] > i) {
                inStack[stack.charAt(stack.length()-1) - 'a'] = false;
                stack.deleteCharAt(stack.length() - 1);
            }
            stack.append(s.charAt(i));
            inStack[c] = true;
        }
        return stack.toString();
    }
    public static void main(String[] args) {
        RemoveDuplicateLetters sol = new RemoveDuplicateLetters();
        System.out.println(sol.removeDuplicateLetters("bcabc")); // abc
        System.out.println(sol.removeDuplicateLetters("cbacdcbc")); // acdb
    }
}