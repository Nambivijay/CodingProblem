/**
 * Problem: Length of Last Word
 * Return the length of the last word in the string.
 * Time: O(n), Space: O(1)
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') i--;
        while (i >= 0 && s.charAt(i) != ' ') { length++; i--; }
        return length;
    }
    public static void main(String[] args) {
        LengthOfLastWord sol = new LengthOfLastWord();
        System.out.println(sol.lengthOfLastWord("Hello World")); // 5
        System.out.println(sol.lengthOfLastWord("   fly me   to   the moon  ")); // 4
    }
}