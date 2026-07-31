/**
 * Problem: First Unique Character in a String
 * Given a string s, find the first non-repeating character in it
 * and return its index. If it does not exist, return -1.
 * 
 * Example:
 * Input: s = "leetcode"
 * Output: 0
 * Explanation: 'l' is the first character that does not repeat.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1) - fixed array of 26 characters
 */

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        int[] charCount = new int[26];

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Find the first character with count 1
        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacter solution = new FirstUniqueCharacter();

        String s1 = "leetcode";
        System.out.println("Input: \"" + s1 + "\"");
        System.out.println("First Unique Index: " + solution.firstUniqChar(s1));

        String s2 = "loveleetcode";
        System.out.println("\nInput: \"" + s2 + "\"");
        System.out.println("First Unique Index: " + solution.firstUniqChar(s2));

        String s3 = "aabb";
        System.out.println("\nInput: \"" + s3 + "\"");
        System.out.println("First Unique Index: " + solution.firstUniqChar(s3));

        String s4 = "algorithm";
        System.out.println("\nInput: \"" + s4 + "\"");
        System.out.println("First Unique Index: " + solution.firstUniqChar(s4));
    }
}
