/**
 * Problem: Verifying an Alien Dictionary
 * Check if words are sorted lexicographically in an alien language.
 * Time: O(n*m), Space: O(1)
 */
public class VerifyingAlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {
        int[] rank = new int[26];
        for (int i = 0; i < order.length(); i++) rank[order.charAt(i) - 'a'] = i;
        for (int i = 0; i < words.length - 1; i++) {
            if (!inOrder(words[i], words[i + 1], rank)) return false;
        }
        return true;
    }
    private boolean inOrder(String w1, String w2, int[] rank) {
        for (int i = 0; i < Math.min(w1.length(), w2.length()); i++) {
            if (rank[w1.charAt(i) - 'a'] < rank[w2.charAt(i) - 'a']) return true;
            if (rank[w1.charAt(i) - 'a'] > rank[w2.charAt(i) - 'a']) return false;
        }
        return w1.length() <= w2.length();
    }
    public static void main(String[] args) {
        VerifyingAlienDictionary sol = new VerifyingAlienDictionary();
        System.out.println(sol.isAlienSorted(new String[]{"hello","leetcode"}, "hlabcdefgijkmnopqrstuvwxyz")); // true
    }
}