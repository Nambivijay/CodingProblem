import java.util.*;
/**
 * Problem: Text Justification
 * Fully justify text to given maxWidth.
 * Time: O(n), Space: O(n)
 */
public class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < words.length) {
            int j = i, lineLen = 0;
            while (j < words.length && lineLen + words[j].length() + (j - i) <= maxWidth)
                lineLen += words[j++].length();
            int spaces = maxWidth - lineLen;
            int gaps = j - i - 1;
            StringBuilder line = new StringBuilder(words[i]);
            if (gaps == 0 || j == words.length) {
                for (int k = i + 1; k < j; k++) line.append(' ').append(words[k]);
                while (line.length() < maxWidth) line.append(' ');
            } else {
                int sp = spaces / gaps, extra = spaces % gaps;
                for (int k = i + 1; k < j; k++) {
                    int pad = sp + (k - i <= extra ? 1 : 0);
                    for (int p = 0; p < pad; p++) line.append(' ');
                    line.append(words[k]);
                }
            }
            result.add(line.toString());
            i = j;
        }
        return result;
    }
    public static void main(String[] args) {
        TextJustification sol = new TextJustification();
        List<String> res = sol.fullJustify(new String[]{"This","is","an","example","of","text","justification."}, 16);
        for (String line : res) System.out.println("|" + line + "|");
    }
}