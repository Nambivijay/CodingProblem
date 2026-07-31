import java.util.*;
/**
 * Problem: Most Common Word
 * Find the most frequent word that isn't banned.
 * Time: O(n), Space: O(n)
 */
public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> count = new HashMap<>();
        String[] words = paragraph.toLowerCase().split("\\\\W+");
        for (String word : words)
            if (!ban.contains(word)) count.merge(word, 1, Integer::sum);
        return Collections.max(count.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
    public static void main(String[] args) {
        MostCommonWord sol = new MostCommonWord();
        System.out.println(sol.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"})); // ball
    }
}