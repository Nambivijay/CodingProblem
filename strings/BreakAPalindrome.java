/**
 * Problem: Break a Palindrome
 * Replace one character to make it not a palindrome and lexicographically smallest.
 * Time: O(n), Space: O(n)
 */
public class BreakAPalindrome {
    public String breakPalindrome(String palindrome) {
        if (palindrome.length() <= 1) return "";
        char[] arr = palindrome.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != 'a') { arr[i] = 'a'; return new String(arr); }
        }
        arr[arr.length - 1] = 'b';
        return new String(arr);
    }
    public static void main(String[] args) {
        BreakAPalindrome sol = new BreakAPalindrome();
        System.out.println(sol.breakPalindrome("abccba")); // aaccba
        System.out.println(sol.breakPalindrome("a")); // ""
        System.out.println(sol.breakPalindrome("aa")); // ab
    }
}