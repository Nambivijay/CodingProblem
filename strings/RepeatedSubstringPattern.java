/**
 * Problem: Repeated Substring Pattern
 * Check if string can be formed by repeating a substring.
 * Time: O(n), Space: O(n)
 */
public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        return doubled.substring(1, doubled.length() - 1).contains(s);
    }
    public static void main(String[] args) {
        RepeatedSubstringPattern sol = new RepeatedSubstringPattern();
        System.out.println(sol.repeatedSubstringPattern("abab")); // true
        System.out.println(sol.repeatedSubstringPattern("aba")); // false
        System.out.println(sol.repeatedSubstringPattern("abcabcabc")); // true
    }
}