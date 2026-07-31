import java.util.*;
/**
 * Problem: Encode and Decode Strings
 * Design an algorithm to encode a list of strings to a single string and decode back.
 * Time: O(n), Space: O(n)
 */
public class EncodeDecodeStrings {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) sb.append(s.length()).append('#').append(s);
        return sb.toString();
    }
    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int j = s.indexOf('#', i);
            int len = Integer.parseInt(s.substring(i, j));
            result.add(s.substring(j + 1, j + 1 + len));
            i = j + 1 + len;
        }
        return result;
    }
    public static void main(String[] args) {
        EncodeDecodeStrings sol = new EncodeDecodeStrings();
        List<String> input = Arrays.asList("Hello", "World", "");
        String encoded = sol.encode(input);
        System.out.println("Encoded: " + encoded);
        System.out.println("Decoded: " + sol.decode(encoded));
    }
}