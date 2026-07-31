import java.util.*;
/**
 * Problem: Longest Word in Dictionary
 * Find longest word that can be built one character at a time.
 * Time: O(n * m), Space: O(n * m)
 */
public class LongestWordInDictionary {
    public String longestWord(String[] words) {
        Set<String> set = new HashSet<>(Arrays.asList(words));
        String result = "";
        for (String word : words) {
            if (word.length() > result.length() || (word.length() == result.length() && word.compareTo(result) < 0)) {
                boolean valid = true;
                for (int k = 1; k < word.length(); k++) {
                    if (!set.contains(word.substring(0, k))) { valid = false; break; }
                }
                if (valid) result = word;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        LongestWordInDictionary sol = new LongestWordInDictionary();
        System.out.println(sol.longestWord(new String[]{"w","wo","wor","worl","world"})); // world
    }
}