/**
 * Problem: Ransom Note
 * Check if ransom note can be constructed from magazine letters.
 * Time: O(m+n), Space: O(1)
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for (char c : magazine.toCharArray()) count[c - 'a']++;
        for (char c : ransomNote.toCharArray()) {
            if (--count[c - 'a'] < 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        RansomNote sol = new RansomNote();
        System.out.println(sol.canConstruct("a", "b")); // false
        System.out.println(sol.canConstruct("aa", "aab")); // true
    }
}