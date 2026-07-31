/**
 * Problem: Valid Palindrome II
 * Check if string can become a palindrome by removing at most one character.
 * Time: O(n), Space: O(1)
 */
public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return isPalin(s, left + 1, right) || isPalin(s, left, right - 1);
            left++; right--;
        }
        return true;
    }
    private boolean isPalin(String s, int l, int r) {
        while (l < r) if (s.charAt(l++) != s.charAt(r--)) return false;
        return true;
    }
    public static void main(String[] args) {
        ValidPalindromeII sol = new ValidPalindromeII();
        System.out.println(sol.validPalindrome("aba")); // true
        System.out.println(sol.validPalindrome("abca")); // true
        System.out.println(sol.validPalindrome("abc")); // false
    }
}