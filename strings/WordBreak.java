import java.util.*;
/**
 * Problem: Word Break
 * Determine if string can be segmented into dictionary words.
 * Time: O(n^2), Space: O(n)
 */
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++)
            for (int j = 0; j < i; j++)
                if (dp[j] && dict.contains(s.substring(j, i))) { dp[i] = true; break; }
        return dp[s.length()];
    }
    public static void main(String[] args) {
        WordBreak sol = new WordBreak();
        System.out.println(sol.wordBreak("leetcode", Arrays.asList("leet","code"))); // true
        System.out.println(sol.wordBreak("applepenapple", Arrays.asList("apple","pen"))); // true
    }
}