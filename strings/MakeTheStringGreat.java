/**
 * Problem: Make The String Great
 * Remove adjacent chars that are same letter but different case.
 * Time: O(n), Space: O(n)
 */
public class MakeTheStringGreat {
    public String makeGood(String s) {
        StringBuilder stack = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (stack.length() > 0 && Math.abs(stack.charAt(stack.length()-1) - c) == 32)
                stack.deleteCharAt(stack.length() - 1);
            else stack.append(c);
        }
        return stack.toString();
    }
    public static void main(String[] args) {
        MakeTheStringGreat sol = new MakeTheStringGreat();
        System.out.println(sol.makeGood("leEeetcode")); // leetcode
        System.out.println(sol.makeGood("abBAcC")); // ""
    }
}