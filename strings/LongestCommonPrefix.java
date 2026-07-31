/**
 * Problem: Longest Common Prefix
 * Write a function to find the longest common prefix string
 * amongst an array of strings. If there is no common prefix, return "".
 * 
 * Example:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * 
 * Time Complexity: O(S) where S is the sum of all characters in all strings
 * Space Complexity: O(1)
 */

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefix solution = new LongestCommonPrefix();

        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Input: [\"flower\",\"flow\",\"flight\"]");
        System.out.println("Output: \"" + solution.longestCommonPrefix(strs1) + "\"");

        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("\nInput: [\"dog\",\"racecar\",\"car\"]");
        System.out.println("Output: \"" + solution.longestCommonPrefix(strs2) + "\"");

        String[] strs3 = {"interstellar", "internet", "internal"};
        System.out.println("\nInput: [\"interstellar\",\"internet\",\"internal\"]");
        System.out.println("Output: \"" + solution.longestCommonPrefix(strs3) + "\"");
    }
}
