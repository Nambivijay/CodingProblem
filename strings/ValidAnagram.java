/**
 * Problem: Valid Anagram
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An anagram is a word formed by rearranging the letters of a different word,
 * using all the original letters exactly once.
 * 
 * Example:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1) - fixed array of 26 characters
 */

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] charCount = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ValidAnagram solution = new ValidAnagram();

        System.out.println("Input: s = \"anagram\", t = \"nagaram\"");
        System.out.println("Output: " + solution.isAnagram("anagram", "nagaram"));

        System.out.println("\nInput: s = \"rat\", t = \"car\"");
        System.out.println("Output: " + solution.isAnagram("rat", "car"));

        System.out.println("\nInput: s = \"listen\", t = \"silent\"");
        System.out.println("Output: " + solution.isAnagram("listen", "silent"));
    }
}
