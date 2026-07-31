/**
 * Problem: Group Anagrams
 * Given an array of strings strs, group the anagrams together.
 * You can return the answer in any order.
 * 
 * Example:
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * 
 * Time Complexity: O(n * k log k) where n is the number of strings and k is the max length
 * Space Complexity: O(n * k)
 */

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }

    // Optimized approach using character count as key
    public List<List<String>> groupAnagramsOptimized(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] count = new int[26];
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        GroupAnagrams solution = new GroupAnagrams();

        String[] strs1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("Input: [\"eat\",\"tea\",\"tan\",\"ate\",\"nat\",\"bat\"]");
        System.out.println("Output: " + solution.groupAnagrams(strs1));

        String[] strs2 = {""};
        System.out.println("\nInput: [\"\"]");
        System.out.println("Output: " + solution.groupAnagrams(strs2));

        String[] strs3 = {"a"};
        System.out.println("\nInput: [\"a\"]");
        System.out.println("Output: " + solution.groupAnagrams(strs3));

        System.out.println("\n--- Optimized Approach ---");
        System.out.println("Input: [\"eat\",\"tea\",\"tan\",\"ate\",\"nat\",\"bat\"]");
        System.out.println("Output: " + solution.groupAnagramsOptimized(strs1));
    }
}
