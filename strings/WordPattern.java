import java.util.*;
/**
 * Problem: Word Pattern
 * Check if pattern and string follow the same pattern.
 * Time: O(n), Space: O(n)
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;
        Map<Character, String> pToW = new HashMap<>();
        Map<String, Character> wToP = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (pToW.containsKey(c) && !pToW.get(c).equals(words[i])) return false;
            if (wToP.containsKey(words[i]) && wToP.get(words[i]) != c) return false;
            pToW.put(c, words[i]); wToP.put(words[i], c);
        }
        return true;
    }
    public static void main(String[] args) {
        WordPattern sol = new WordPattern();
        System.out.println(sol.wordPattern("abba", "dog cat cat dog")); // true
        System.out.println(sol.wordPattern("abba", "dog cat cat fish")); // false
    }
}