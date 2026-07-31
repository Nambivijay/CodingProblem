/**
 * Problem: Reverse Words in a String
 * Reverse the order of words in a string.
 * Time: O(n), Space: O(n)
 */
public class ReverseWordsInString {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(' ');
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        ReverseWordsInString sol = new ReverseWordsInString();
        System.out.println(sol.reverseWords("the sky is blue")); // blue is sky the
        System.out.println(sol.reverseWords("  hello world  ")); // world hello
    }
}